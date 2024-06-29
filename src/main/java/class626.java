import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class626 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    private int field9048 = 0;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    private int field9051 = 0;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[B")
    private byte[] field9056 = new byte[32];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[J")
    private long[] field9052 = new long[8];

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "[J")
    private long[] field9058 = new long[8];

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[B")
    private byte[] field9047 = new byte[64];

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[J")
    private long[] field9053 = new long[8];

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "[J")
    private long[] field9062 = new long[8];

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[J")
    private long[] field9061 = new long[8];

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Lfj;")
    public static class572 field9055 = new class572("", 16);

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "Lfj;")
    public static class572 field9063 = new class572("", 14);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lkea;")
    public static class203 field9049;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field9060;

    static {
        new class474("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI[B)V", line = 10)
    public final void method3590(long arg0, int arg1, byte[] arg2) {
        field9059++;
        int var5 = arg1;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field9051 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field9056[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field9056[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field9047[this.field9048] = (byte) class283.method1834(this.field9047[this.field9048], var15 >>> var7);
            this.field9048++;
            this.field9051 += 8 - var7;
            if (this.field9051 == 512) {
                this.method3591((byte) -93);
                this.field9051 = this.field9048 = 0;
            }
            this.field9047[this.field9048] = (byte) class643.method3659(255, var15 << 8 - var7);
            arg0 -= 8L;
            this.field9051 += var7;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field9047[this.field9048] = (byte) class283.method1834(this.field9047[this.field9048], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field9051 = (int) ((long) this.field9051 + arg0);
            return;
        }
        long var13 = arg0 - (long) (8 - var7);
        this.field9051 += 8 - var7;
        this.field9048++;
        if (this.field9051 == 512) {
            this.method3591((byte) -93);
            this.field9051 = this.field9048 = 0;
        }
        this.field9047[this.field9048] = (byte) class643.method3659(255, var12 << 8 - var7);
        this.field9051 += (int) var13;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 97)
    private final void method3591(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field9061[var2] = class550.method3193(class438.method2731((long) this.field9047[var3 + 7], 255L), class550.method3193(class438.method2731((long) this.field9047[var3 + 6], 255L) << 8, class550.method3193(class438.method2731((long) this.field9047[var3 + 5] << 16, 0xFFL << 16), class550.method3193(class550.method3193(class550.method3193(class438.method2731((long) this.field9047[var3 + 2] << 40, 0xFFL << 40), class550.method3193((long) this.field9047[var3] << 56, class438.method2731(0xFFL << 48, (long) this.field9047[var3 + 1] << 48))), class438.method2731(0xFFL << 32, (long) this.field9047[var3 + 3] << 32)), class438.method2731((long) this.field9047[var3 + 4] << 24, 0xFFL << 24)))));
            var3 += 8;
            var2++;
        }
        field9046++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field9058[var4] = class550.method3193(this.field9061[var4], this.field9062[var4] = this.field9053[var4]);
        }
        if (arg0 != -93) {
            this.field9061 = null;
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field9052[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field9052[var7] = class550.method3193(this.field9052[var7], class561.field8007[var13][class643.method3659((int) (this.field9062[class643.method3659(7, var7 - var13)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field9062[var8] = this.field9052[var8];
            }
            this.field9062[0] = class550.method3193(this.field9062[0], class561.field8005[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field9052[var9] = this.field9062[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field9052[var9] = class550.method3193(this.field9052[var9], class561.field8007[var11][class643.method3659(255, (int) (this.field9058[class643.method3659(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field9058[var10] = this.field9052[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field9053[var6] = class550.method3193(this.field9053[var6], class550.method3193(this.field9058[var6], this.field9061[var6]));
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 203)
    public static final void method3592(String arg0, String arg1, int arg2) {
        class414.field6279 = -1;
        if (arg2 != 10173) {
            method3594((byte) -52);
        }
        field9045++;
        class253.field3576 = 1;
        class237.method1589(false, 8, arg0, arg1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 219)
    public final void method3593(boolean arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field9056[var2] = 0;
        }
        field9054++;
        this.field9047[0] = 0;
        this.field9051 = this.field9048 = 0;
        if (!arg0) {
            this.method3590(-37L, -31, null);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field9053[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 246)
    public static void method3594(byte arg0) {
        field9063 = null;
        if (arg0 <= 72) {
            field9060 = null;
        }
        field9049 = null;
        field9060 = null;
        field9055 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)Z", line = 260)
    public static final boolean method3595(int arg0, byte arg1, int arg2) {
        field9057++;
        if (arg1 != 72) {
            field9049 = null;
        }
        if (class455.method2813(256, arg0, arg2)) {
            return class297.method1989(arg2, (byte) 46, arg0) | (arg0 & 0x9000) != 0 | class582.method3376(arg0, (byte) -123, arg2) ? true : (class330.method2154(arg0, arg2, (byte) 29) | (arg0 & 0x2000) != 0 | class623.method3573(arg0, (byte) -48, arg2)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BBI)V", line = 318)
    public final void method3596(byte[] arg0, byte arg1, int arg2) {
        this.field9047[this.field9048] = (byte) class283.method1834(this.field9047[this.field9048], 0x80 >>> class643.method3659(this.field9051, 7));
        field9050++;
        this.field9048++;
        if (this.field9048 > 32) {
            while (true) {
                if (this.field9048 >= 64) {
                    this.method3591((byte) -93);
                    this.field9048 = 0;
                    break;
                }
                this.field9047[this.field9048++] = 0;
            }
        }
        while (this.field9048 < 32) {
            this.field9047[this.field9048++] = 0;
        }
        class210.method1330(this.field9056, 0, this.field9047, 32, 32);
        this.method3591((byte) -93);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var7 = this.field9053[var4];
            arg0[var5] = (byte) ((int) (var7 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var7 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var7 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var7 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var7 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var7 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var7 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var7);
            var5 += 8;
            var4++;
        }
        int var6 = 27 / ((9 - arg1) / 61);
    }
}

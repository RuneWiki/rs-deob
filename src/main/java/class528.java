import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class528 {

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    private int field7030 = 0;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "[J")
    private long[] field7029 = new long[8];

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "[J")
    private long[] field7032 = new long[8];

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    private int field7034 = 0;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "[B")
    private byte[] field7036 = new byte[32];

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "[B")
    private byte[] field7039 = new byte[64];

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "[J")
    private long[] field7031 = new long[8];

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[J")
    private long[] field7038 = new long[8];

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "[J")
    private long[] field7033 = new long[8];

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Lcu;")
    public static class206 field7037 = new class206(55, 6);

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Z")
    public static boolean field7043 = false;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 6)
    private final void method2947(int arg0) {
        field7042++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field7029[var2] = class260.method1592(class260.method1592(class260.method1592(class260.method1592(class396.method2277(0xFFL << 24, (long) this.field7039[var3 + 4] << 24), class260.method1592(class260.method1592(class396.method2277((long) this.field7039[var3 + 2] << 40, 0xFFL << 40), class260.method1592((long) this.field7039[var3] << 56, class396.method2277(0xFFL << 48, (long) this.field7039[var3 + 1] << 48))), class396.method2277((long) this.field7039[var3 + 3], 255L) << 32)), class396.method2277(255L, (long) this.field7039[var3 + 5]) << 16), class396.method2277(0xFFL << 8, (long) this.field7039[var3 + 6] << 8)), class396.method2277(255L, (long) this.field7039[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field7031[var4] = class260.method1592(this.field7029[var4], this.field7033[var4] = this.field7038[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field7032[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field7032[var7] = class260.method1592(this.field7032[var7], class234.field3291[var13][class571.method3139(255, (int) (this.field7033[class571.method3139(var7 - var13, 7)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field7033[var8] = this.field7032[var8];
            }
            this.field7033[0] = class260.method1592(this.field7033[0], class234.field3274[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field7032[var9] = this.field7033[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field7032[var9] = class260.method1592(this.field7032[var9], class234.field3291[var11][class571.method3139((int) (this.field7031[class571.method3139(7, var9 - var11)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field7031[var10] = this.field7032[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field7038[var6] = class260.method1592(this.field7038[var6], class260.method1592(this.field7031[var6], this.field7029[var6]));
        }
        if (arg0 != 255) {
            this.method2950(85, 79, null);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V", line = 118)
    public static void method2948(int arg0) {
        field7037 = null;
        if (arg0 != 8) {
            method2948(-115);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BJ[B)V", line = 130)
    public final void method2949(byte arg0, long arg1, byte[] arg2) {
        field7035++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field7030 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        if (arg0 > -19) {
            this.method2951(-97);
        }
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field7036[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field7036[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field7039[this.field7034] = (byte) class220.method1393(this.field7039[this.field7034], var15 >>> var7);
            this.field7030 += 8 - var7;
            this.field7034++;
            if (this.field7030 == 512) {
                this.method2947(255);
                this.field7030 = this.field7034 = 0;
            }
            this.field7039[this.field7034] = (byte) class571.method3139(255, var15 << 8 - var7);
            arg1 -= 8L;
            this.field7030 += var7;
            var5++;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field7039[this.field7034] = (byte) class220.method1393(this.field7039[this.field7034], var12 >>> var7);
        }
        if ((long) var7 + arg1 < 8L) {
            this.field7030 = (int) ((long) this.field7030 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field7034++;
        this.field7030 += 8 - var7;
        if (this.field7030 == 512) {
            this.method2947(255);
            this.field7030 = this.field7034 = 0;
        }
        this.field7039[this.field7034] = (byte) class571.method3139(255, var12 << 8 - var7);
        this.field7030 += (int) var13;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[B)V", line = 222)
    public final void method2950(int arg0, int arg1, byte[] arg2) {
        this.field7039[this.field7034] = (byte) class220.method1393(this.field7039[this.field7034], 0x80 >>> class571.method3139(7, this.field7030));
        field7040++;
        this.field7034++;
        if (this.field7034 > 32) {
            while (true) {
                if (this.field7034 >= 64) {
                    this.method2947(255);
                    this.field7034 = 0;
                    break;
                }
                this.field7039[this.field7034++] = 0;
            }
        }
        while (this.field7034 < 32) {
            this.field7039[this.field7034++] = 0;
        }
        class83.method686(this.field7036, 0, this.field7039, 32, 32);
        this.method2947(255);
        int var4 = 0;
        int var5 = -21 / ((-arg0 - 35) / 44);
        int var6 = arg1;
        while (var4 < 8) {
            long var7 = this.field7038[var4];
            arg2[var6] = (byte) ((int) (var7 >>> 56));
            arg2[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg2[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg2[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg2[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg2[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg2[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg2[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V", line = 286)
    public final void method2951(int arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field7036[var2] = 0;
        }
        field7041++;
        this.field7030 = this.field7034 = 0;
        this.field7039[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field7038[var3] = 0L;
        }
        int var4 = -55 % ((arg0 + 32) / 47);
    }
}

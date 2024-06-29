import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 extends class13 {

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "[J")
    private long[] field258 = new long[10];

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lva;")
    private static class121 field246 = class107.method797("No reply from loginserver)3", -10983);

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "[Ltc;")
    public static class113[] field254 = new class113[2048];

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[[[Lbb;")
    public static class9[][][] field249 = new class9[4][104][104];

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field248 = 256;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Lva;")
    public static class121 field263 = class107.method797("mapmarker", -10983);

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lva;")
    public static class121 field266 = field246;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Lva;")
    public static class121 field268 = class107.method797("::noclip", -10983);

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "J")
    private long field260;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lhe;")
    public static class47 field262;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lm;")
    public static class72 field255;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field269;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[[I")
    public static int[][] field245;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method111(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 4)
    public final void method42(boolean arg0) {
        this.field265 = 256;
        field256++;
        this.field252 = 1;
        this.field247 = 0;
        this.field260 = System.currentTimeMillis();
        if (arg0) {
            this.method43((byte) -8);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field258[var2] = this.field260;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V", line = 41)
    public static final void method109(byte arg0) {
        field259++;
        if (class129.field2974 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (var1 <= class11.field187) {
            return;
        }
        class129.field2974.method214(var1);
        int var3 = (int) (var1 - class11.field187);
        class11.field187 = var1;
        synchronized (field269 == null ? (field269 = method111("eb")) : field269) {
            class126.field2881 += class35.field836 * var3;
            int var5 = (class126.field2881 - class35.field836 * 2000) / 1000;
            if (var5 > 0) {
                if (class12.field228 != null) {
                    class12.field228.method245(var5);
                }
                class126.field2881 -= var5 * 1000;
            }
        }
        if (arg0 != -124) {
            field266 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)V", line = 96)
    public static void method110(byte arg0) {
        field268 = null;
        field246 = null;
        field255 = null;
        if (arg0 != 93) {
            method109((byte) -95);
        }
        field245 = null;
        field262 = null;
        field266 = null;
        field263 = null;
        field254 = null;
        field249 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 118)
    public final void method43(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field258[var2] = 0L;
        }
        if (arg0 < 39) {
            field248 = -107;
        }
        field251++;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 229)
    public class14() {
        this.method42(false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I", line = 146)
    public final int method41(int arg0, int arg1, int arg2) {
        int var4 = this.field265;
        this.field265 = 300;
        field244++;
        int var5 = this.field252;
        this.field252 = 1;
        this.field260 = System.currentTimeMillis();
        if (this.field258[this.field250] == 0L) {
            this.field265 = var4;
            this.field252 = var5;
        } else if (this.field258[this.field250] < this.field260) {
            this.field265 = (int) ((long) (arg2 * 2560) / (this.field260 - this.field258[this.field250]));
        }
        if (this.field265 < 25) {
            this.field265 = 25;
        }
        if (this.field265 > 256) {
            this.field265 = 256;
            this.field252 = (int) ((long) arg2 - (this.field260 - this.field258[this.field250]) / 10L);
        }
        if (this.field252 > arg2) {
            this.field252 = arg2;
        }
        this.field258[this.field250] = this.field260;
        this.field250 = (this.field250 + 1) % 10;
        if (this.field252 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field258[var6] != 0L) {
                    this.field258[var6] += this.field252;
                }
            }
        }
        if (arg1 != 9104) {
            method109((byte) 30);
        }
        int var7 = 0;
        if (arg0 > this.field252) {
            this.field252 = arg0;
        }
        class113.method833((long) this.field252, true);
        while (this.field247 < 256) {
            this.field247 += this.field265;
            var7++;
        }
        this.field247 &= 0xFF;
        return var7;
    }
}

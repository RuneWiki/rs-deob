import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class289 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lsq;")
    private class29 field4234 = new class29();

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lig;")
    private class15 field4239 = new class15();

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ldq;")
    private class90 field4241;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "F")
    public static float field4228;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "F")
    public static float field4235;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lct;")
    public static class104 field4233;

    static {
        new class409("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method1932(int arg0, boolean arg1) {
        field4232++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF65) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (!arg1) {
            method1936(108);
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(JI)Lsq;", line = 112)
    public final class29 method1933(long arg0, int arg1) {
        field4236++;
        class29 var4 = (class29) this.field4241.method609(arg0, 85);
        if (var4 != null) {
            this.field4239.method211(var4, -32256);
        }
        if (arg1 != 0) {
            method1936(41);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIII)V", line = 156)
    public static final void method1934(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4237++;
        if (class103.method695(arg2, -106)) {
            class139.method920(class444.field6470[arg2], -1, arg1, arg4, (byte) 102, arg0);
            int var5 = -43 / ((arg3 - 31) / 54);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 170)
    public final void method1935(byte arg0) {
        field4238++;
        this.field4239.method214(7031);
        this.field4241.method600(-126);
        int var2 = 83 / ((arg0 - 54) / 39);
        this.field4234 = new class29();
        this.field4240 = this.field4242;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 188)
    public static void method1936(int arg0) {
        if (arg0 == -175667672) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJLsq;)V", line = 202)
    public final void method1937(int arg0, long arg1, class29 arg2) {
        int var5 = -11 % ((arg0 - 61) / 60);
        field4231++;
        if (this.field4240 == 0) {
            class29 var6 = this.field4239.method213(0);
            var6.method1820(-25246);
            var6.method299((byte) -86);
            if (this.field4234 == var6) {
                class29 var7 = this.field4239.method213(0);
                var7.method1820(-25246);
                var7.method299((byte) -86);
            }
        } else {
            this.field4240--;
        }
        this.field4241.method606(1, arg2, arg1);
        this.field4239.method211(arg2, -32256);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I", line = 230)
    public static final int method1938(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        field4230++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 15) {
            field4235 = 1.5183729F;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V", line = 258)
    public class289(int arg0) {
        this.field4242 = arg0;
        this.field4240 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4241 = new class90(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class123 extends class45 {

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "La;")
    private static class1 field3059 = class113.method934(-11538, "Please use a different world)3");

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "La;")
    public static class1 field3062 = class113.method934(-11538, "@yel@*V");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "La;")
    public static class1 field3061 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "La;")
    public static class1 field3070 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "La;")
    public static class1 field3073 = class113.method934(-11538, "Benutzen");

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "La;")
    public static class1 field3067 = class113.method934(-11538, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "La;")
    public static class1 field3074 = field3070;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "La;")
    public static class1 field3065 = field3070;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "La;")
    public static class1 field3063 = field3070;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "La;")
    public static class1 field3058 = field3070;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "La;")
    private static class1 field3069 = class113.method934(-11538, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "La;")
    public static class1 field3075 = field3059;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "La;")
    public static class1 field3077 = field3069;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "La;")
    private static class1 field3079 = class113.method934(-11538, "Walk here");

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "La;")
    public static class1 field3060 = field3079;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "La;")
    public static class1 field3080 = field3070;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "La;")
    public static class1 field3082 = field3070;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lqd;")
    public static class100 field3071;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)[Le;", line = 6)
    public static final class25[] method997(int arg0) {
        field3081++;
        class25[] var1 = new class25[class76.field1903];
        for (int var2 = arg0; var2 < class76.field1903; var2++) {
            class25 var3 = var1[var2] = new class25();
            var3.field747 = class115.field2880;
            var3.field748 = class64.field1631;
            var3.field752 = class112.field2774[var2];
            var3.field751 = class80.field1988[var2];
            var3.field745 = class31.field838[var2];
            var3.field750 = class130.field3197[var2];
            var3.field746 = class8.field293;
            var3.field749 = class113.field2797[var2];
        }
        class42.method450(true);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 41)
    public static final void method998(int arg0) {
        class86.field2155.method268((byte) -104);
        field3064++;
        class74.field1844.method268((byte) -113);
        if (arg0 != -11965) {
            method1005(-25);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIJI)V", line = 57)
    public final void method999(int arg0, int arg1, long arg2, int arg3) {
        int var6 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
        if (class89.field2183 != var6) {
            class89.field2183 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method1005(var7);
                this.method307(var7 + 176, 7, var8 >> 7, arg2);
                this.method307(var7 + 176, 39, var8 & 0x7F, arg2);
            }
        }
        field3068++;
        if (arg3 != 0) {
            this.method1000(95, 122L, 123);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJI)V", line = 87)
    public final void method1000(int arg0, long arg1, int arg2) {
        field3078++;
        class89.field2183 = arg2;
        for (int var5 = 0; var5 < 16; var5++) {
            class70.field1756[var5] = 12800;
        }
        if (arg0 >= -80) {
            field3074 = null;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method1005(var6);
            this.method307(var6 + 176, 7, var7 >> 7, arg1);
            this.method307(var6 + 176, 39, var7 & 0x7F, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)[Ljd;", line = 125)
    public static final class58[] method1001(byte arg0) {
        field3066++;
        class58[] var1 = new class58[class76.field1903];
        if (arg0 != -62) {
            return null;
        }
        for (int var2 = 0; var2 < class76.field1903; var2++) {
            class58 var3 = var1[var2] = new class58();
            var3.field1482 = class115.field2880;
            var3.field1480 = class64.field1631;
            var3.field1481 = class112.field2774[var2];
            var3.field1477 = class80.field1988[var2];
            var3.field1479 = class31.field838[var2];
            var3.field1478 = class130.field3197[var2];
            byte[] var4 = class113.field2797[var2];
            int var5 = var3.field1479 * var3.field1478;
            var3.field1483 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field1483[var6] = class8.field293[class132.method1034(255, var4[var6])];
            }
        }
        class42.method450(true);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 188)
    public static void method1002(int arg0) {
        field3061 = null;
        field3069 = null;
        field3082 = null;
        field3070 = null;
        field3065 = null;
        field3071 = null;
        field3063 = null;
        field3062 = null;
        field3074 = null;
        field3077 = null;
        field3075 = null;
        field3060 = null;
        field3059 = null;
        if (arg0 != 39) {
            field3072 = 56;
        }
        field3073 = null;
        field3080 = null;
        field3058 = null;
        field3067 = null;
        field3079 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)V", line = 219)
    public final void method1003(byte arg0, long arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class79.field1940[var4];
            class79.field1940[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((var11 & 0x1 << var12) != 0) {
                    this.method307(var12 + 144, var4, 0, arg1);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method307(var5 + 176, 123, 0, arg1);
        }
        if (arg0 <= 101) {
            field3063 = null;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method307(var6 + 176, 120, 0, arg1);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method307(var7 + 176, 121, 0, arg1);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method307(var8 + 176, 0, 0, arg1);
        }
        field3076++;
        for (int var9 = 0; var9 < 16; var9++) {
            this.method307(var9 + 176, 32, 0, arg1);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method307(var10 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIJ)Z", line = 323)
    public final boolean method1004(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class79.field1940[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class79.field1940[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class79.field1940[arg1] = var7 | var6;
            } else {
                this.method307(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method307(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class70.field1756[var8] = 12800;
                int var9 = method1005(var8);
                this.method307(arg0, 7, var9 >> 7, arg3);
                this.method307(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class70.field1756[var10] = (arg2 << 7) + (class70.field1756[var10] & 0x7F);
                } else {
                    class70.field1756[var10] = (class70.field1756[var10] & 0x3F80) + arg2;
                }
                int var11 = method1005(var10);
                this.method307(arg0, 7, var11 >> 7, arg3);
                this.method307(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I", line = 404)
    private static final int method1005(int arg0) {
        int var1 = class70.field1756[arg0];
        int var2 = (class89.field2183 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIJ)V")
    public abstract void method307(int arg0, int arg1, int arg2, long arg3);
}

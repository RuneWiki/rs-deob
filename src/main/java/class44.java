import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class class44 extends class85 {

    @OriginalMember(owner = "ec", name = "S", descriptor = "I")
    private int field911 = 32768;

    @OriginalMember(owner = "ec", name = "Q", descriptor = "Llf;")
    public static class109 field909 = class35.method275("<img=1>", 2);

    @OriginalMember(owner = "ec", name = "V", descriptor = "Llf;")
    private static class109 field914 = class35.method275("Password: ", 2);

    @OriginalMember(owner = "ec", name = "T", descriptor = "Llf;")
    public static class109 field912 = field914;

    @OriginalMember(owner = "ec", name = "R", descriptor = "Llf;")
    public static class109 field910 = class35.method275(" <col=ffff00>", 2);

    @OriginalMember(owner = "ec", name = "Y", descriptor = "J")
    public static long field917 = 0L;

    @OriginalMember(owner = "ec", name = "W", descriptor = "Llf;")
    private static class109 field915 = class35.method275("button near the top of that page)3", 2);

    @OriginalMember(owner = "ec", name = "db", descriptor = "Llf;")
    public static class109 field922 = null;

    @OriginalMember(owner = "ec", name = "gb", descriptor = "Llf;")
    public static class109 field925 = field915;

    @OriginalMember(owner = "ec", name = "U", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "ec", name = "X", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "ec", name = "Z", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "ec", name = "ab", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "ec", name = "bb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "ec", name = "cb", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "ec", name = "eb", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "ec", name = "fb", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "ec", name = "hb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "ec", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqe;")
    public static final class153 method308(Throwable arg0, String arg1) {
        class153 var2;
        if (!(arg0 instanceof class153)) {
            var2 = new class153(arg0, arg1);
        } else {
            var2 = (class153) arg0;
            var2.field2915 = var2.field2915 + ' ' + arg1;
        }
        ++field924;
        return var2;
    }

    @OriginalMember(owner = "ec", name = "e", descriptor = "(I)V")
    public static void method309(int arg0) {
        field910 = null;
        field914 = null;
        if (arg0 != 0) {
            field925 = null;
        }
        field925 = null;
        field912 = null;
        field909 = null;
        field922 = null;
        field915 = null;
    }

    @OriginalMember(owner = "ec", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        class179.method1217(arg0 + -25487);
        ++field926;
        if (arg0 != 25614) {
            method311(-28, -99, (byte) -82, 98);
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IBI)I")
    public static final int method310(int arg0, byte arg1, int arg2) {
        ++field916;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | 1 & arg0;
            arg0 >>>= 1;
            --arg2;
        }
        if (arg1 >= -5) {
            method309(41);
        }
        return var3;
    }

    @OriginalMember(owner = "ec", name = "<init>", descriptor = "()V")
    public class44() {
        super(3, false);
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IIBI)V")
    public static final void method311(int arg0, int arg1, byte arg2, int arg3) {
        ++field923;
        if (arg0 >= 128 && ~arg1 <= -129 && arg0 <= 13056 && arg1 <= 13056) {
            int var4 = -arg3 + class19.method180(arg1, false, class72.field1405, arg0);
            int var5 = arg0 - class39.field836;
            int var6 = arg1 - class114.field2267;
            int var7 = class124.field2383[class72.field1397];
            int var8 = class124.field2387[class72.field1397];
            int var9 = var4 - class125.field2419;
            int var10 = -49 % ((65 - arg2) / 35);
            int var11 = class124.field2383[class143.field2748];
            int var12 = class124.field2387[class143.field2748];
            int var13 = var5 * var12 + var6 * var11 >> 16;
            int var14 = var6 * var12 + -(var5 * var11) >> 16;
            int var16 = var8 * var9 + -(var7 * var14) >> 16;
            int var17 = var7 * var9 + var8 * var14 >> 16;
            if (var17 < 50) {
                class183.field3440 = -1;
                class187.field3604 = -1;
            } else {
                class187.field3604 = 167 - -((var16 << 9) / var17);
                class183.field3440 = (var13 << 9) / var17 + 256;
            }
        } else {
            class183.field3440 = -1;
            class187.field3604 = -1;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field913;
        if (arg0 >= -120) {
            field925 = null;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field1726 = ~arg2.method598((byte) 127) == -2;
            }
        } else {
            this.field911 = arg2.method569(true) << 4;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field918;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int[] var4 = this.method540(arg1, -128, 1);
            int[] var5 = this.method540(arg1, 109, 2);
            for (int var6 = 0; class57.field1152 > var6; ++var6) {
                int var7 = (var4[var6] & 4088) >> 4;
                int var8 = var5[var6] * this.field911 >> 12;
                int var9 = class126.field2428[var7] * var8 >> 12;
                int var10 = class109.field2173[var7] * var8 >> 12;
                int var11 = class29.field624 & (var10 >> 12) + var6;
                int var12 = class150.field2892 & (var9 >> 12) + arg1;
                int[] var13 = this.method540(var12, -128, 0);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 >= -49) {
            method310(-5, (byte) 119, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "ec", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field921;
        if (arg1 != 2177) {
            return null;
        } else {
            int[][] var3 = super.field1719.method673((byte) -127, arg0);
            if (super.field1719.field1926) {
                int[] var4 = this.method540(arg0, 16, 1);
                int[] var5 = this.method540(arg0, -125, 2);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class57.field1152; ++var9) {
                    int var10 = var5[var9] * this.field911 >> 12;
                    int var11 = 255 & var4[var9] * 255 >> 12;
                    int var12 = class109.field2173[var11] * var10 >> 12;
                    int var13 = var9 - -(var12 >> 12) & class29.field624;
                    int var14 = class126.field2428[var11] * var10 >> 12;
                    int var15 = (var14 >> 12) + arg0 & class150.field2892;
                    int[][] var16 = this.method544(false, var15, 0);
                    var6[var9] = var16[0][var13];
                    var7[var9] = var16[1][var13];
                    var8[var9] = var16[2][var13];
                }
            }
            return var3;
        }
    }
}

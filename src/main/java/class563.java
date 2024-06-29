import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class563 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Z")
    public boolean field7919 = false;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Lnea;")
    public static class664 field7929 = new class664(103, 5);

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "F")
    public static float field7932 = 1.0F;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "Lnea;")
    public static class664 field7930 = new class664(33, 11);

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "Ljava/lang/Object;")
    public static volatile Object field7934 = null;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public int field7923;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public int field7924;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lla;")
    public static class416 field7931;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Lpu;")
    public static class522 field7922;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "Lpu;")
    public static class522 field7933;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Lpf;")
    public class539 field7925;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public static void method3213(int arg0) {
        field7933 = null;
        field7929 = null;
        if (arg0 != -21058) {
            field7934 = null;
        }
        field7930 = null;
        field7922 = null;
        field7931 = null;
        field7934 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)Z")
    public final boolean method3214(byte arg0) {
        field7916++;
        return arg0 >= -77 ? false : this.field7925.field7544.method2997((byte) -95, this.field7923);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLvg;)V")
    public static final void method3215(boolean arg0, class49 arg1) {
        if (class125.field1873 == arg1.field864) {
            class508.field7177[arg1.field965] = true;
        }
        field7928++;
        if (!arg0) {
            method3216(37, 14, 74);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)I")
    public static final int method3216(int arg0, int arg1, int arg2) {
        field7917++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        if (arg1 != 255) {
            method3213(-3);
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILmo;I)V")
    private final void method3217(int arg0, class695 arg1, int arg2) {
        field7926++;
        if (arg2 == 1) {
            this.field7923 = arg1.method3847((byte) 118);
        } else if (arg2 == 2) {
            this.field7924 = arg1.method3873(255);
        } else if (arg2 == 3) {
            this.field7919 = true;
        } else if (arg2 == 4) {
            this.field7923 = -1;
        }
        if (arg0 < 7) {
            this.field7924 = -89;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZLr;)Lf;")
    public final class702 method3218(int arg0, int arg1, boolean arg2, class166 arg3) {
        field7920++;
        long var5 = (long) (arg3.field2374 << 19 | (arg2 ? 262144 : 0) | this.field7923 | arg1 << 16);
        class702 var7 = (class702) this.field7925.field7549.method2287(arg0 + 18082, var5);
        if (var7 != null) {
            return var7;
        } else if (!this.field7925.field7544.method2997((byte) -95, this.field7923)) {
            return null;
        } else if (arg0 == -18081) {
            class113 var8 = class113.method875(this.field7925.field7544, this.field7923, 0);
            if (var8 != null) {
                var8.field1703 = var8.field1704 = var8.field1705 = var8.field1707 = 0;
                if (arg2) {
                    var8.method883();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method885();
                }
            }
            class702 var10 = arg3.method138(var8, true);
            if (var10 != null) {
                this.field7925.field7549.method2291(var10, var5, 1);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILmo;)V")
    public final void method3219(int arg0, class695 arg1) {
        int var3 = -26 % ((arg0 - 61) / 61);
        field7918++;
        while (true) {
            int var4 = arg1.method3826(false);
            if (var4 == 0) {
                return;
            }
            this.method3217(79, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3220(byte arg0, String arg1) {
        field7921++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class23.method281(arg1.charAt(var2), (byte) 119)) {
            var2++;
        }
        while (var2 < var3 && class23.method281(arg1.charAt(var3 - 1), (byte) -106)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0 < 48) {
            return null;
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class152.method1068(-22763, var7)) {
                char var8 = class385.method2300(var7, -1062099612);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}

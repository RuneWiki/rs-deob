import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class191 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lci;")
    private class287 field2837;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lal;")
    private class58 field2834;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lqj;")
    private class325 field2831;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lus;")
    public static class1 field2836 = new class1(100, -2);

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "J")
    public static long field2844 = -1L;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    public static int[] field2845 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    public static int[] field2846 = new int[2048];

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lrp;")
    private class276 field2833;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[Lkn;")
    private class481[] field2838;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[[B")
    public static byte[][] field2841;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1180(byte arg0, String arg1) {
        field2830++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class485.method2837(69, arg1.charAt(var2))) {
            var2++;
        }
        if (arg0 >= -81) {
            field2836 = null;
        }
        while (var3 > var2 && class485.method2837(102, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class211.method1373(false, var7)) {
                char var8 = class142.method890(var7, (byte) 65);
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

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILrg;Lrg;I)Lkn;")
    public final class481 method1181(int arg0, class420 arg1, class420 arg2, int arg3) {
        if (arg0 <= 16) {
            method1186((byte) -4);
        }
        field2842++;
        return this.method1184(arg2, false, arg3, arg1, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public static final void method1182(int arg0, int arg1, int arg2) {
        if (arg0 != -6513) {
            method1182(-102, 45, 89);
        }
        field2840++;
        if (class456.field6416 == class410.field5756) {
            if (!class279.method1768(false, -2, false, 1, 0, arg1, 0, arg2, 1)) {
                class279.method1768(false, -3, false, 1, 0, arg1, 0, arg2, 1);
            }
        } else if (!class279.method1768(false, -3, false, 1, 0, arg1, 0, arg2, 1)) {
            class279.method1768(false, -2, false, 1, 0, arg1, 0, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
    public final boolean method1183(int arg0) {
        int var2 = 29 % ((arg0 + 69) / 50);
        field2835++;
        if (this.field2833 != null) {
            return true;
        }
        if (this.field2831 == null) {
            if (this.field2834.method351(15740)) {
                return false;
            }
            this.field2831 = this.field2834.method350(true, 255, -1, 255, (byte) 0);
        }
        if (this.field2831.field3393) {
            return false;
        } else {
            this.field2833 = new class276(this.field2831.method289((byte) -128));
            this.field2838 = new class481[(this.field2833.field4064.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lrg;ZILrg;Z)Lkn;")
    private final class481 method1184(class420 arg0, boolean arg1, int arg2, class420 arg3, boolean arg4) {
        field2832++;
        if (this.field2833 == null) {
            throw new RuntimeException();
        }
        this.field2833.field4021 = arg2 * 8 + 5;
        if (this.field2833.field4021 >= this.field2833.field4064.length) {
            throw new RuntimeException();
        } else if (this.field2838[arg2] == null) {
            int var6 = this.field2833.method1688(20402);
            if (arg1) {
                this.method1184((class420) null, false, 21, (class420) null, false);
            }
            int var7 = this.field2833.method1688(20402);
            class481 var8 = new class481(arg2, arg0, arg3, this.field2834, this.field2837, var6, var7, arg4);
            this.field2838[arg2] = var8;
            return var8;
        } else {
            return this.field2838[arg2];
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method1185(int arg0) {
        field2839++;
        if (this.field2838 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2838.length; var2++) {
            if (this.field2838[var2] != null) {
                this.field2838[var2].method2815(false);
            }
        }
        if (arg0 != -26113) {
            this.method1185(-13);
        }
        for (int var3 = 0; var3 < this.field2838.length; var3++) {
            if (this.field2838[var3] != null) {
                this.field2838[var3].method2811(70);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lal;Lci;)V")
    public class191(class58 arg0, class287 arg1) {
        this.field2837 = arg1;
        this.field2834 = arg0;
        if (!this.field2834.method351(15740)) {
            this.field2831 = this.field2834.method350(true, 255, -1, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field2846 = null;
        field2836 = null;
        field2845 = null;
        if (arg0 != -41) {
            method1182(-125, 50, 57);
        }
        field2841 = null;
    }
}

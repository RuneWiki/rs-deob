import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class407 extends class240 {

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public int field5919 = -1;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public int field5923 = -1;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "Ljava/lang/String;")
    public static String field5907 = "Loading - please wait.";

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    public static int field5914 = 100;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "[[I")
    public static int[][] field5916 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "B")
    public static byte field5906;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public int field5908;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public int field5915;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "Ltm;")
    public static class220 field5911;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "Lclient;")
    public static client field5920;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "[I")
    public static int[] field5922;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2566(boolean arg0) {
        field5920 = null;
        field5916 = null;
        if (arg0) {
            field5922 = null;
            field5911 = null;
            field5907 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 20)
    public static final String method2567(String arg0, int arg1) {
        ++field5917;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var2 > ~var3 && class307.method1920(arg0.charAt(var2), -128)) {
                ++var2;
            }
            while (~var2 > ~var3 && class307.method1920(arg0.charAt(var3 + -1), arg1 + -115)) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var6 > ~var3; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class277.method1754(var7, (byte) 52)) {
                        char var8 = class288.method1838(var7, 110);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (arg1 != -13) {
                    method2566(true);
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZLen;)Z", line = 81)
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field5910;
        class71 var5 = arg3.method1015();
        if (!arg2) {
            field5909 = -51;
        }
        var5.method123(super.field3263, super.field3255, super.field3260);
        class393 var6 = class392.method2498(this.field5908, -128).method1635(65536, this.field5915, 0, -1, (class116) null, arg3, 0, (class182) null, 51);
        if (var6 != null && var6.method724(arg0, arg1, var5, true)) {
            return true;
        } else {
            if (~this.field5923 != 0) {
                class393 var7 = class392.method2498(this.field5923, -108).method1635(65536, this.field5913, 0, -1, (class116) null, arg3, 0, (class182) null, 71);
                if (var7 != null && var7.method724(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            if (~this.field5919 != 0) {
                class393 var8 = class392.method2498(this.field5919, -110).method1635(65536, this.field5918, 0, -1, (class116) null, arg3, 0, (class182) null, -108);
                if (var8 != null && var8.method724(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILen;)Lir;", line = 122)
    public final class19 method213(int arg0, class174 arg1) {
        ++field5921;
        class71 var3 = arg1.method1015();
        if (arg0 >= -5) {
            return null;
        } else {
            var3.method123(super.field3263, super.field3255, super.field3260);
            class19 var4 = class358.method2286(true, 3);
            if (~this.field5919 != 0) {
                class393 var5 = class392.method2498(this.field5919, -105).method1635(1024, this.field5918, 0, -1, (class116) null, arg1, 0, (class182) null, 81);
                if (var5 != null) {
                    var5.method775(var3, var4.field197[2], 0);
                }
            }
            if (~this.field5923 != 0) {
                class393 var6 = class392.method2498(this.field5923, -124).method1635(1024, this.field5913, 0, -1, (class116) null, arg1, 0, (class182) null, 58);
                if (var6 != null) {
                    var6.method775(var3, var4.field197[1], 0);
                }
            }
            class393 var7 = class392.method2498(this.field5908, -105).method1635(1024, this.field5915, 0, -1, (class116) null, arg1, 0, (class182) null, 19);
            if (var7 != null) {
                var7.method775(var3, var4.field197[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Len;I)V", line = 184)
    public final void method211(class174 arg0, int arg1) {
        if (arg1 != 0) {
            this.field5913 = 4;
        }
        ++field5912;
    }
}

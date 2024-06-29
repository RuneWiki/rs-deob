import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class159 extends class119 {

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lcc;")
    private static class209 field2903 = class95.method669(126, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lcc;")
    public static class209 field2898 = field2903;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lcc;")
    public class209 field2897;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lcc;")
    public class209 field2902;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lji;")
    public static class42 field2891;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lsj;")
    public static class49 field2892;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
    public static int[] field2900;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        ++field2899;
        int var1 = client.field2818.method289(8, 8);
        if (class250.field4502 > var1) {
            for (int var2 = var1; var2 < class250.field4502; ++var2) {
                class110.field2229[class74.field1396++] = class82.field1653[var2];
            }
        }
        if (class250.field4502 < var1) {
            throw new RuntimeException("gppov1");
        } else {
            class250.field4502 = 0;
            if (arg0 < 40) {
                field2892 = null;
            }
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class82.field1653[var3];
                class108 var5 = class103.field1993[var4];
                int var6 = client.field2818.method289(8, 1);
                if (~var6 == -1) {
                    class82.field1653[class250.field4502++] = var4;
                    var5.field1512 = class163.field2968;
                } else {
                    int var7 = client.field2818.method289(8, 2);
                    if (var7 == 0) {
                        class82.field1653[class250.field4502++] = var4;
                        var5.field1512 = class163.field2968;
                        class211.field3840[class244.field4423++] = var4;
                    } else if (var7 == 1) {
                        class82.field1653[class250.field4502++] = var4;
                        var5.field1512 = class163.field2968;
                        int var8 = client.field2818.method289(8, 3);
                        var5.method570(false, var8, false);
                        int var9 = client.field2818.method289(8, 1);
                        if (~var9 == -2) {
                            class211.field3840[class244.field4423++] = var4;
                        }
                    } else if (var7 == 2) {
                        class82.field1653[class250.field4502++] = var4;
                        var5.field1512 = class163.field2968;
                        int var10 = client.field2818.method289(8, 3);
                        var5.method570(true, var10, false);
                        int var11 = client.field2818.method289(8, 3);
                        var5.method570(true, var11, false);
                        int var12 = client.field2818.method289(8, 1);
                        if (~var12 == -2) {
                            class211.field3840[class244.field4423++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class110.field2229[class74.field1396++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILsj;II)[Lij;")
    public static final class194[] method1102(int arg0, class49 arg1, int arg2, int arg3) {
        ++field2893;
        if (arg2 != -1) {
            method1101((byte) 41);
        }
        return !class117.method833(arg3, arg1, arg2 + 897, arg0) ? null : class176.method1214((byte) 103);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        field2892 = null;
        field2900 = null;
        field2898 = null;
        if (arg0 <= 115) {
            method1101((byte) -83);
        }
        field2891 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lhd;")
    public final class11 method1104(int arg0) {
        ++field2901;
        if (arg0 > -104) {
            method1102(-66, (class49) null, 32, 49);
        }
        return class197.field3537[super.field2373];
    }
}

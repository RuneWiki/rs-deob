import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class510 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lbi;")
    public static class104 field7599 = new class104(94, -2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lc;")
    public static class205 field7602;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method3084(int arg0) {
        if (class19.field198 != null) {
            class92.field1348.method2618(-9974);
            class148.method905();
            class187.method1172(true);
            class7.method61((byte) 97);
            class329.method2205((byte) 45);
            class5.method49(-119);
            if (class302.field4737 != null) {
                class302.field4737.method1384((byte) 125);
            }
            class159.method969(-1947139796);
            class54.method410(20250);
            class20.method126(119);
            class94.method642(17795, false);
            class105.method710(-128);
            for (int var1 = 0; var1 < 2048; var1++) {
                class350 var5 = class264.field4276[var1];
                if (var5 != null) {
                    var5.field890 = null;
                    for (int var6 = 0; var6 < var5.field892.length; var6++) {
                        var5.field892[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class78.field1176; var2++) {
                class378 var3 = class14.field150[var2].field378;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field892.length; var4++) {
                        var3.field892[var4] = null;
                    }
                }
            }
            field7602 = null;
            class520.field7712 = null;
            class19.field198.method3039(12755);
            class19.field198 = null;
        }
        field7600++;
        if (arg0 != 5198) {
            method3087(-72);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZI)V")
    public static final void method3085(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 >= arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class103.field1521[var5][arg2] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class103.field1521[var6][arg2] = arg4;
            }
        }
        if (!arg3) {
            method3086(8, -106, 23);
        }
        field7601++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public static final void method3086(int arg0, int arg1, int arg2) {
        field7598++;
        if ((class194.field2875 > class194.field2877)) {
            class194.field2877 = (float) ((double) class194.field2877 / 30.0D + (double) class194.field2877);
            if (class194.field2875 < class194.field2877) {
                class194.field2877 = class194.field2875;
            }
            class100.method676(-60);
            class194.field2873 = (int) class194.field2877 >> 1;
            class194.field2872 = class482.method2971((byte) 6, class194.field2873);
        } else if (class194.field2875 < class194.field2877) {
            class194.field2877 = (float) ((double) class194.field2877 - (double) class194.field2877 / 30.0D);
            if (class194.field2877 < class194.field2875) {
                class194.field2877 = class194.field2875;
            }
            class100.method676(-91);
            class194.field2873 = (int) class194.field2877 >> 1;
            class194.field2872 = class482.method2971((byte) 107, class194.field2873);
        }
        if (arg1 != 15759) {
            field7602 = null;
        }
        if (class484.field7357 != -1 && class6.field71 != -1) {
            int var3 = class484.field7357 - class201.field3060;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class6.field71 - class297.field4679;
            class201.field3060 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class297.field4679 += var4;
            if (var3 == 0 && var4 == 0) {
                class484.field7357 = -1;
                class6.field71 = -1;
            }
            class100.method676(arg1 ^ 0x3DE7);
        }
        if (class52.field707 <= 0) {
            class136.field1877 = -1;
            class501.field7516 = -1;
        } else {
            class388.field5920--;
            if (class388.field5920 == 0) {
                class52.field707--;
                class388.field5920 = 100;
            }
        }
        if (!class7.field85 || class541.field7908 == null) {
            return;
        }
        for (class39 var5 = (class39) class541.field7908.method2123(79); var5 != null; var5 = (class39) class541.field7908.method2126((byte) 61)) {
            class210 var6 = class194.field2866.method662(var5.field390.field3759, true);
            if (var5.method232((byte) 113, arg0, arg2)) {
                if (var6.field3262 != null) {
                    if (var6.field3262[4] != null) {
                        class279.method1875((long) var5.field390.field3759, 0, true, false, var6.field3251, -1, var6.field3272, var6.field3262[4], -55, 1003, -1);
                    }
                    if (var6.field3262[3] != null) {
                        class279.method1875((long) var5.field390.field3759, 0, true, false, var6.field3251, -1, var6.field3272, var6.field3262[3], -103, 1010, -1);
                    }
                    if (var6.field3262[2] != null) {
                        class279.method1875((long) var5.field390.field3759, 0, true, false, var6.field3251, -1, var6.field3272, var6.field3262[2], -95, 1001, -1);
                    }
                    if (var6.field3262[1] != null) {
                        class279.method1875((long) var5.field390.field3759, 0, true, false, var6.field3251, -1, var6.field3272, var6.field3262[1], arg1 ^ 0xFFFFC20B, 1008, -1);
                    }
                    if (var6.field3262[0] != null) {
                        class279.method1875((long) var5.field390.field3759, 0, true, false, var6.field3251, -1, var6.field3272, var6.field3262[0], -83, 1009, -1);
                    }
                }
                if (!var5.field390.field3762) {
                    var5.field390.field3762 = true;
                    class420.method2676(class7.field89, var5.field390.field3759, var6.field3272);
                }
                if (var5.field390.field3762) {
                    class420.method2676(class528.field7764, var5.field390.field3759, var6.field3272);
                }
            } else if (var5.field390.field3762) {
                var5.field390.field3762 = false;
                class420.method2676(class321.field4982, var5.field390.field3759, var6.field3272);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method3087(int arg0) {
        field7599 = null;
        field7602 = null;
        if (arg0 != 0) {
            field7602 = null;
        }
    }
}

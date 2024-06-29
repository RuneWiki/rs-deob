import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class13 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Ld;")
    public static class242 field144 = new class242(32);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field143++;
        if (arg6 != 23084) {
            method74(35, 110, -64, 124, -80, 59, 122, 88);
        }
        if (arg1 == arg4) {
            class471.method2858(arg3, arg4, (byte) 92, arg5, arg0, arg2, arg7);
        } else if (arg5 - arg4 >= class232.field3492 && class36.field453 >= arg4 + arg5 && (arg2 - arg1) >= class487.field7124 && (arg1 + arg2) <= class232.field3493) {
            class221.method1532(arg3, arg0, true, arg1, arg5, arg4, arg7, arg2);
        } else {
            class267.method1853(arg7, arg1, arg0, (byte) -6, arg4, arg3, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method75(String arg0, int arg1, int arg2) {
        field142++;
        if (class66.field1042 != 3) {
            class317.field4836 = new class346();
            class317.field4836.field5144 = arg0;
            class317.field4836.field5143 = arg1;
            if (class62.field991 != class287.field4471) {
                class317.field4836.field5145 = class317.field4836.field5143 + 50000;
                class317.field4836.field5150 = class317.field4836.field5143 + 40000;
            }
            return true;
        }
        String var3 = "";
        if (arg2 >= -112) {
            return true;
        }
        if (class62.field991 != class287.field4471) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class229.field3461 != null) {
            var4 = "/p=" + class229.field3461;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class345.field5141 + "/a=" + class516.field7505 + var4 + "/j" + (class73.field1242 ? "1" : "0") + ",o" + (class416.field6114 ? "1" : "0") + ",a2";
        try {
            class281.field4379.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method76(int arg0) {
        if (arg0 != -32053) {
            method74(49, -71, 98, 114, 95, 92, 36, -96);
        }
        class320.field4851 = null;
        class532.field7770 = null;
        class203.field3138 = null;
        class437.field6513 = null;
        class56.field863 = null;
        class54.field833 = null;
        class441.field6573 = null;
        class470.field6906 = null;
        class360.field5315 = null;
        class58.field893 = null;
        class528.field7732 = null;
        class483.field7076 = null;
        class401.field5914 = null;
        class522.field7668 = null;
        field146++;
        class540.field7910 = null;
        class36.field444 = null;
        class12.field130 = null;
        class456.field6786 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method77(int arg0) {
        if (arg0 == 0) {
            field144 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public static final void method78(int arg0, int arg1) {
        class200 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class11 var4 = class274.field4306[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class443.field6603; var5++) {
                    for (int var6 = 0; var6 < class474.field6947; var6++) {
                        var2 = var4.method54(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class295.field4543;
                            int var8 = var5 << class295.field4543;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class11 var10 = class274.field4306[var9];
                                if (var10 != null) {
                                    int var11 = var4.method56(var6, var5) - var10.method56(var6, var5);
                                    int var12 = var4.method56(var6 + 1, var5) - var10.method56(var6 + 1, var5);
                                    int var13 = var4.method56(var6 + 1, var5 + 1) - var10.method56(var6 + 1, var5 + 1);
                                    int var14 = var4.method56(var6, var5 + 1) - var10.method56(var6, var5 + 1);
                                    var10.method61(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method79(int arg0, int arg1) {
        field145++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class411.field6068.method1265(class345.field5141, -87) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class77.field1294.method1265(class345.field5141, -124) + " (" + var2 + ")</col>";
        } else {
            if (arg0 != 0) {
                field144 = null;
            }
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}

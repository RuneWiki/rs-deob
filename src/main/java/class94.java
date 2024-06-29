import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class94 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1305;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1306;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static final void method667(boolean arg0) {
        if (class204.field2796 != 0) {
            class131.field1863 -= class204.field2796 * 5;
            if (class357.field4897 <= class131.field1863) {
                class131.field1863 = class357.field4897 - 1;
            }
            if (class131.field1863 < 0) {
                class131.field1863 = 0;
            }
            class204.field2796 = 0;
        }
        field1303++;
        if (class364.field5133 < 102) {
            class364.field5133 += 6;
        }
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class240.field3416; var1++) {
            int var2 = class17.field303[var1].method548((byte) 105);
            char var3 = class17.field303[var1].method547(0);
            if (var2 == 84) {
                class151.method1026((byte) -83);
            } else if (class203.field2790.method1872(82, 4463) && var2 == 66) {
                if (class175.field2393 != null) {
                    String var8 = "";
                    for (int var9 = class399.field5695.length - 1; var9 >= 0; var9--) {
                        if (class399.field5695[var9] != null && class399.field5695[var9].length() > 0) {
                            var8 = var8 + class399.field5695[var9] + '\n';
                        }
                    }
                    class175.field2393.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class203.field2790.method1872(82, 4463) && var2 == 67) {
                if (class175.field2393 != null) {
                    Transferable var4 = class175.field2393.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class46.method408((byte) 68, '\n', var5);
                                if (var6.length <= 1) {
                                    class175.field2395 = class175.field2395 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class175.field2395 = var6[var7];
                                        class151.method1026((byte) 89);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class91.field1278 > 0) {
                class175.field2395 = class175.field2395.substring(0, class91.field1278 - 1) + class175.field2395.substring(class91.field1278);
                class91.field1278--;
            } else if (var2 == 101 && class91.field1278 < class175.field2395.length()) {
                class175.field2395 = class175.field2395.substring(0, class91.field1278) + class175.field2395.substring(class91.field1278 + 1);
            } else if (var2 == 96 && class91.field1278 > 0) {
                class91.field1278--;
            } else if (var2 == 97 && class91.field1278 < class175.field2395.length()) {
                class91.field1278++;
            } else if (var2 == 102) {
                class91.field1278 = 0;
            } else if (var2 == 103) {
                class91.field1278 = class175.field2395.length();
            } else if (var2 == 104 && class387.field5552 < class399.field5695.length) {
                class387.field5552++;
                class144.method987((byte) 71);
                class91.field1278 = class175.field2395.length();
            } else if (var2 == 105 && class387.field5552 > 0) {
                class387.field5552--;
                class144.method987((byte) 48);
                class91.field1278 = class175.field2395.length();
            } else if (class165.method1109(-11891, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class175.field2395 = class175.field2395.substring(0, class91.field1278) + class17.field303[var1].method547(0) + class175.field2395.substring(class91.field1278);
                class91.field1278++;
            }
        }
        class240.field3416 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class304.field4201[var10]) {
                var10002 = class74.field1049[var10]++;
                if (class74.field1049[var10] > 102) {
                    class304.field4201[var10] = false;
                }
            } else {
                var10002 = class74.field1049[var10]--;
                if (class74.field1049[var10] < 0) {
                    class20.field370[var10] = (int) (Math.random() * (double) class47.field661);
                    class243.field3447[var10] = (int) (Math.random() * 350.0D);
                    class74.field1049[var10] = 0;
                    class304.field4201[var10] = true;
                }
            }
        }
        class386.method2450((byte) -115);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljk;I)V")
    public static final void method668(class380 arg0, int arg1) {
        if (arg1 >= -67) {
            field1302 = 1;
        }
        field1300++;
        if (class328.field4549 == null) {
            return;
        }
        class193 var2 = null;
        if (arg0.field5426 == 0) {
            var2 = (class193) class244.method1655(arg0.field5420, arg0.field5422, arg0.field5419);
        }
        if (arg0.field5426 == 1) {
            var2 = (class193) class326.method2094(arg0.field5420, arg0.field5422, arg0.field5419);
        }
        if (arg0.field5426 == 2) {
            var2 = (class193) class139.method952(arg0.field5420, arg0.field5422, arg0.field5419, field1306 == null ? (field1306 = method671("sc")) : field1306);
        }
        if (arg0.field5426 == 3) {
            var2 = (class193) class19.method259(arg0.field5420, arg0.field5422, arg0.field5419);
        }
        if (var2 == null) {
            arg0.field5427 = 0;
            arg0.field5423 = 0;
            arg0.field5417 = -1;
        } else {
            arg0.field5417 = var2.method689((byte) -83);
            arg0.field5427 = var2.method684(-13726);
            arg0.field5423 = var2.method672(17011);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIFIIZI)[[I")
    public static final int[][] method669(int arg0, int arg1, byte arg2, int arg3, float arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1301++;
        int[][] var9 = new int[arg6][arg3];
        class263 var10 = new class263();
        var10.field3671 = (int) (arg4 * 4096.0F);
        if (arg2 != 78) {
            method670(85, 118, 47);
        }
        var10.field3668 = arg0;
        var10.field3660 = arg1;
        var10.field3672 = arg7;
        var10.field3676 = arg8;
        var10.method33(55);
        class390.method2468(arg3, arg6, -124);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method1722(var11, 3, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method670(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1740 != null) {
            var3.field1740 = null;
        }
        if (var3.field1750 != null) {
            var3.field1750 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method671(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

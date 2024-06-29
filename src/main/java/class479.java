import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class479 {

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public int field6670 = 8;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public int field6672 = 16777215;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field6675 = -1;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "Z")
    public static boolean field6679 = false;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    public static int field6682 = 100;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public int field6668;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public int field6677;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "Z")
    public boolean field6676;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BI)Lsh;", line = 6)
    public static final class70 method2805(byte arg0, int arg1) {
        field6674++;
        if (arg0 != -57) {
            method2808(97);
        }
        class70[] var2 = class526.method3043(arg0 - 70);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class70 var4 = var2[var3];
            if (var4.field1292 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILcea;I)V", line = 33)
    private final void method2806(int arg0, class215 arg1, int arg2) {
        if (arg0 != -6617) {
            method2808(95);
        }
        field6666++;
        if (arg2 == 1) {
            this.field6670 = arg1.method1478(842397944);
        } else if (arg2 == 2) {
            this.field6676 = true;
        } else if (arg2 == 3) {
            this.field6668 = arg1.method1520(13638);
            this.field6671 = arg1.method1520(13638);
            this.field6677 = arg1.method1520(13638);
        } else if (arg2 == 4) {
            this.field6667 = arg1.method1535(255);
        } else if (arg2 == 5) {
            this.field6673 = arg1.method1478(842397944);
        } else if (arg2 == 6) {
            this.field6672 = arg1.method1499(-1);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 79)
    public static final void method2807(int arg0) {
        field6678++;
        class55 var1 = (class55) class336.field4743.method1269(4);
        int var2 = -45 % ((arg0 + 34) / 47);
        while (var1 != null) {
            if (var1.field1114 > 0) {
                var1.field1114--;
            }
            if (var1.field1114 != 0) {
                if (var1.field1115 > 0) {
                    var1.field1115--;
                }
                if (var1.field1115 == 0 && var1.field1126 >= 1 && var1.field1117 >= 1 && var1.field1126 <= class376.field5325 - 2 && var1.field1117 <= class175.field2711 - 2 && (var1.field1128 < 0 || class608.method3456(var1.field1116, false, var1.field1128))) {
                    class754.method4205(var1.field1126, 70, var1.field1125, -1, var1.field1128, var1.field1116, var1.field1117, var1.field1121, var1.field1120);
                    var1.field1115 = -1;
                    if (var1.field1128 == var1.field1123 && var1.field1123 == -1) {
                        var1.method2314((byte) 86);
                    } else if (var1.field1128 == var1.field1123 && var1.field1121 == var1.field1113 && var1.field1124 == var1.field1116) {
                        var1.method2314((byte) 75);
                    }
                }
            } else if (var1.field1123 < 0 || class608.method3456(var1.field1124, false, var1.field1123)) {
                class754.method4205(var1.field1126, 112, var1.field1125, -1, var1.field1123, var1.field1124, var1.field1117, var1.field1113, var1.field1120);
                var1.method2314((byte) 49);
            }
            var1 = (class55) class336.field4743.method1264((byte) 81);
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V", line = 145)
    public static final void method2808(int arg0) {
        if (class445.field6326 < 102) {
            class445.field6326 += 6;
        }
        field6681++;
        if (class343.field4811 != -1 && class554.method3190(-127) > class698.field9437) {
            for (int var1 = class343.field4811; var1 < class216.field3136.length; var1++) {
                if (class216.field3136[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class216.field3136[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class355.method2228("Pausing for " + var2 + " seconds...", 58);
                    class343.field4811 = var1 + 1;
                    class698.field9437 = (long) (var2 * 1000) + class554.method3190(-97);
                    return;
                }
                class257.field3711 = class216.field3136[var1];
                class241.method1673(false, 0);
            }
            class343.field4811 = -1;
        }
        if (class266.field3770 != 0) {
            class685.field9279 -= class266.field3770 * 5;
            if (class605.field8302 <= class685.field9279) {
                class685.field9279 = class605.field8302 - 1;
            }
            class266.field3770 = 0;
            if (class685.field9279 < 0) {
                class685.field9279 = 0;
            }
        }
        if (arg0 < 124) {
            return;
        }
        for (int var3 = 0; var3 < class634.field8719; var3++) {
            class366 var4 = class749.field10381[var3];
            int var5 = var4.method2331(false);
            char var6 = var4.method2329((byte) 46);
            int var7 = var4.method2327(-7616);
            if (var5 == 84) {
                class241.method1673(false, 0);
            }
            if (var5 == 80) {
                class241.method1673(true, 0);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class364.field5213 != null) {
                    String var8 = "";
                    for (int var9 = class23.field723.length - 1; var9 >= 0; var9--) {
                        if (class23.field723[var9] != null && class23.field723[var9].length() > 0) {
                            var8 = var8 + class23.field723[var9] + '\n';
                        }
                    }
                    class364.field5213.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class364.field5213 != null) {
                    Transferable var10 = class364.field5213.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class728.method4031('\n', true, var11);
                                class715.method3984(0, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class697.field9411 > 0) {
                class257.field3711 = class257.field3711.substring(0, class697.field9411 - 1) + class257.field3711.substring(class697.field9411);
                class697.field9411--;
            } else if (var5 == 101 && class697.field9411 < class257.field3711.length()) {
                class257.field3711 = class257.field3711.substring(0, class697.field9411) + class257.field3711.substring(class697.field9411 + 1);
            } else if (var5 == 96 && class697.field9411 > 0) {
                class697.field9411--;
            } else if (var5 == 97 && class697.field9411 < class257.field3711.length()) {
                class697.field9411++;
            } else if (var5 == 102) {
                class697.field9411 = 0;
            } else if (var5 == 103) {
                class697.field9411 = class257.field3711.length();
            } else if (var5 == 104 && class680.field9218 < class23.field723.length) {
                class680.field9218++;
                class487.method2869(-615751774);
                class697.field9411 = class257.field3711.length();
            } else if (var5 == 105 && class680.field9218 > 0) {
                class680.field9218--;
                class487.method2869(-615751774);
                class697.field9411 = class257.field3711.length();
            } else if (class9.method59(var6, (byte) 105) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class257.field3711 = class257.field3711.substring(0, class697.field9411) + class749.field10381[var3].method2329((byte) 23) + class257.field3711.substring(class697.field9411);
                class697.field9411++;
            }
        }
        class634.field8719 = 0;
        class74.field1337 = 0;
        class299.method1955(89);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lcea;B)V", line = 342)
    public final void method2809(class215 arg0, byte arg1) {
        field6680++;
        if (arg1 < 22) {
            return;
        }
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                return;
            }
            this.method2806(-6617, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lga;[Lab;)V", line = 368)
    public static final void method2810(class404 arg0, class669[] arg1) {
        if (class390.field5647) {
            int var2 = arg0.method935(arg1, 49);
            class44.field982.method329(var2, arg1);
        }
        if (class683.field9250 == class344.field4822) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class494) {
                var5 = ((class494) arg0).field6831;
                var6 = ((class494) arg0).field6838;
            } else {
                var5 = arg0.field5922 >> class130.field2185;
                var6 = arg0.field5933 >> class130.field2185;
            }
            class44.field982.method196(class465.field6517[0].method1853(arg0.field5922, arg0.field5933, (byte) -118), class79.method726(var5, var6), class424.method2597(var5, var6), class538.method3096(var5, var6));
        }
        class228 var7 = arg0.method41(1, class44.field982);
        if (var7 == null) {
            return;
        }
        if (arg0.field5936) {
            class317[] var8 = var7.field3313;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class317 var10 = var8[var9];
                if (var10.field4379) {
                    class546.method3152(-5590, var10.field4383 - var10.field4381, var10.field4384 + var10.field4381, var10.field4380 - var10.field4381, var10.field4382 + var10.field4381);
                }
            }
        }
        if (var7.field3308) {
            var7.field3309 = arg0;
            if (class719.field9783) {
                class440 var11 = class545.field7511;
                synchronized (class545.field7511) {
                    class545.field7511.method2653(var7, 18802);
                    return;
                }
            }
            class545.field7511.method2653(var7, 18802);
            return;
        }
        class520.method3028(var7, 18);
    }
}

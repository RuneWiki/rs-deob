import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class135 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lap;")
    public static class335 field1743 = new class335("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1745 = null;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ldq;")
    public static class493 field1744 = new class493(110, -2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1746;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lrp;", line = 3)
    public static final class302 method929(int arg0, int arg1) {
        field1740++;
        if (arg0 != 30) {
            method930(false);
        }
        if (arg1 == 0) {
            if ((double) class241.field3107 == 3.0D) {
                return class456.field6563;
            }
            if ((double) class241.field3107 == 4.0D) {
                return class36.field442;
            }
            if ((double) class241.field3107 == 6.0D) {
                return class498.field7224;
            }
            if ((double) class241.field3107 >= 8.0D) {
                return class49.field624;
            }
        } else if (arg1 == 1) {
            if ((double) class241.field3107 == 3.0D) {
                return class498.field7224;
            }
            if ((double) class241.field3107 == 4.0D) {
                return class49.field624;
            }
            if ((double) class241.field3107 == 6.0D) {
                return class379.field4999;
            }
            if ((double) class241.field3107 >= 8.0D) {
                return class440.field6308;
            }
        } else if (arg1 == 2) {
            if ((double) class241.field3107 == 3.0D) {
                return class379.field4999;
            }
            if ((double) class241.field3107 == 4.0D) {
                return class440.field6308;
            }
            if ((double) class241.field3107 == 6.0D) {
                return class463.field6680;
            }
            if ((double) class241.field3107 >= 8.0D) {
                return class63.field828;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 74)
    public static void method930(boolean arg0) {
        field1746 = null;
        field1745 = null;
        field1743 = null;
        if (arg0) {
            field1743 = null;
        }
        field1744 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V", line = 90)
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class425 var7 = new class425();
        var7.field6034 = arg1 >> class94.field1144;
        var7.field6039 = arg2 >> class94.field1144;
        var7.field6038 = arg3 >> class94.field1144;
        var7.field6040 = arg4 >> class94.field1144;
        var7.field6027 = arg0;
        var7.field6029 = arg1;
        var7.field6041 = arg2;
        var7.field6036 = arg3;
        var7.field6033 = arg4;
        var7.field6030 = arg5;
        var7.field6026 = arg6;
        class238.field3048[class283.field3606++] = var7;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILrd;Z)V", line = 107)
    public static final void method932(int arg0, class223 arg1, boolean arg2) {
        field1742++;
        if (class2.field24 >= 400) {
            return;
        }
        if (class23.field336 != arg1) {
            String var3;
            if (arg1.field2815 == 0) {
                boolean var4 = true;
                if (class23.field336.field2827 != -1 && arg1.field2827 != -1) {
                    int var5 = class23.field336.field2855 > arg1.field2855 ? class23.field336.field2855 : arg1.field2855;
                    int var6 = class23.field336.field2827 < arg1.field2827 ? class23.field336.field2827 : arg1.field2827;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class23.field336.field2855 - arg1.field2855;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class530.field7803 == class335.field4230 ? class66.field857.method1936(-26539, class11.field177) : class70.field917.method1936(-26539, class11.field177);
                if (arg1.field2855 < arg1.field2809) {
                    var3 = arg1.method1355(true, -22) + (var4 ? class243.method1482(arg1.field2855, -1, class23.field336.field2855) : "<col=ffffff>") + " (" + var9 + arg1.field2855 + "+" + (arg1.field2809 - arg1.field2855) + ")";
                } else {
                    var3 = arg1.method1355(true, 123) + (var4 ? class243.method1482(arg1.field2855, -1, class23.field336.field2855) : "<col=ffffff>") + " (" + var9 + arg1.field2855 + ")";
                }
            } else {
                var3 = arg1.method1355(true, 119) + " (" + class423.field5987.method1936(-26539, class11.field177) + arg1.field2815 + ")";
            }
            if (class211.field2717) {
                if (!arg2 && (class92.field1125 & 0x8) != 0) {
                    class414.field5896++;
                    class8.method45(22461, (long) arg1.field4890, -1, 0, 0, class468.field6768, class446.field6389 + " -> <col=ffffff>" + var3, 5, false, class516.field7480, true);
                }
            } else if (arg2) {
                class8.method45(22461, 0L, 0, 0, 0, -1, "", -1, true, "<col=cccccc>" + var3, false);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class339.field4257[var10] != null) {
                        short var12 = 0;
                        if (class530.field7803 == class123.field1653 && class339.field4257[var10].equalsIgnoreCase(class466.field6740.method1936(-26539, class11.field177))) {
                            if (class23.field336.field2855 < arg1.field2855) {
                                var12 = 2000;
                            }
                            if (class23.field336.field2835 != 0 && arg1.field2835 != 0) {
                                if (class23.field336.field2835 == arg1.field2835) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class155.field1971[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class522.field7561[var10] + var12);
                        int var14 = class123.field1654[var10] == -1 ? class421.field5976 : class123.field1654[var10];
                        class8.method45(22461, (long) arg1.field4890, -1, 0, 0, var14, "<col=ffffff>" + var3, var13, false, class339.field4257[var10], true);
                        class128.field1701++;
                    }
                }
            }
            if (arg0 >= -28) {
                method930(false);
            }
            if (!arg2) {
                for (class520 var11 = (class520) class201.field2616.method153(0); var11 != null; var11 = (class520) class201.field2616.method161(-89)) {
                    if (var11.field7508 == 15) {
                        var11.field7506 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class211.field2717 && (class92.field1125 & 0x10) != 0) {
            class133.field1732++;
            class8.method45(22461, 0L, -1, 0, 0, class468.field6768, class446.field6389 + " -> <col=ffffff>" + class261.field3304.method1936(-26539, class11.field177), 30, false, class516.field7480, true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I", line = 254)
    public static final int method933(int arg0, int arg1) {
        field1741++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        if (arg1 != 13634) {
            method929(108, 64);
        }
        return arg0 + var2;
    }
}

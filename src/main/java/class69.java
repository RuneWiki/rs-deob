import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class69 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lui;")
    public static class375 field953 = new class375("K", "T", "K", "K");

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lvr;")
    public static class306 field965 = new class306();

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "B")
    public byte field956;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lns;")
    public static class438 field957;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Ljava/lang/String;")
    public String field952;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/lang/String;")
    public String field961;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Ljava/lang/String;")
    public String field962;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/lang/String;")
    public String field964;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
    public static void method473(boolean arg0) {
        if (arg0) {
            field953 = null;
        }
        field953 = null;
        field957 = null;
        field965 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lkq;")
    public static final class523 method474(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class523 var4 = var3.field6268;
            var3.field6268 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Ljh;")
    public static final class377 method475(int arg0) {
        field958++;
        class377 var1 = (class377) class163.field2386.method1581((byte) 53);
        if (var1 != null) {
            var1.method2785((byte) -120);
            var1.method560((byte) 87);
            return var1;
        }
        if (arg0 != 0) {
            field963 = 29;
        }
        class377 var2;
        do {
            var2 = (class377) class21.field321.method1581((byte) 53);
            if (var2 == null) {
                return null;
            }
            if (var2.method2343((byte) 81) > class264.method1698(true)) {
                return null;
            }
            var2.method2785((byte) -120);
            var2.method560((byte) -100);
        } while ((Long.MIN_VALUE & var2.field1173) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)V")
    public static final void method476(int arg0, int arg1, int arg2, boolean arg3) {
        field954++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class138.field2021 = arg0;
        class462.field6769 = arg2;
        int var4 = 110 % ((arg1 + 69) / 47);
        class40.field620 = arg3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIBI)V")
    public static final void method477(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class173.field2489 = arg2;
        class467.field6804 = arg0;
        class362.field5619 = arg5;
        class83.field1117 = arg1;
        field960++;
        class314.field4800 = arg3;
        if (class314.field4800 >= 100) {
            int var6 = class467.field6804 * 128 + 64;
            int var7 = class173.field2489 * 128 + 64;
            int var8 = class500.method2985(var6, 5293, class195.field2770, var7) - class83.field1117;
            int var9 = var6 - class34.field539;
            int var10 = var8 - class154.field2246;
            int var11 = var7 - class301.field4447;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class353.field5478 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class30.field461 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class353.field5478 < 1024) {
                class353.field5478 = 1024;
            }
            class522.field7715 = 0;
            if (class353.field5478 > 3072) {
                class353.field5478 = 3072;
            }
        }
        class432.field6409 = 2;
        if (arg4 <= 125) {
            method478(null, true, -44);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lbp;ZI)V")
    public static final void method478(class322 arg0, boolean arg1, int arg2) {
        field955++;
        if (class12.field201 >= 400) {
            return;
        }
        if (class339.field5365 != arg0) {
            String var3;
            if (arg0.field4970 == 0) {
                boolean var4 = true;
                if (class339.field5365.field4950 != -1 && arg0.field4950 != -1) {
                    int var5 = class339.field5365.field4930 <= arg0.field4930 ? arg0.field4930 : class339.field5365.field4930;
                    int var6 = arg0.field4950 > class339.field5365.field4950 ? class339.field5365.field4950 : arg0.field4950;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class339.field5365.field4930 - arg0.field4930;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class393.field5983 == class259.field3610 ? class410.field6172.method2335((byte) -100, class288.field4292) : class371.field5698.method2335((byte) -100, class288.field4292);
                if (arg0.field4933 > arg0.field4930) {
                    var3 = arg0.method2087(116, true) + (var4 ? class483.method2883(class339.field5365.field4930, arg0.field4930, 29424) : "<col=ffffff>") + " (" + var9 + arg0.field4930 + "+" + (arg0.field4933 - arg0.field4930) + ")";
                } else {
                    var3 = arg0.method2087(112, true) + (var4 ? class483.method2883(class339.field5365.field4930, arg0.field4930, 29424) : "<col=ffffff>") + " (" + var9 + arg0.field4930 + ")";
                }
            } else {
                var3 = arg0.method2087(125, true) + " (" + class193.field2744.method2335((byte) -100, class288.field4292) + arg0.field4970 + ")";
            }
            if (class500.field7455) {
                if (!arg1 && (class303.field4468 & 0x8) != 0) {
                    class59.field788++;
                    class294.method1898(-1, 0, (long) arg0.field5254, false, class261.field3635, true, class266.field3714, class509.field7572 + " -> <col=ffffff>" + var3, 0, -1, 44);
                }
            } else if (arg1) {
                class294.method1898(-1, 0, 0L, true, -1, false, "<col=cccccc>" + var3, "", 0, 0, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class331.field5123[var10] != null) {
                        short var11 = 0;
                        if (class393.field5983 == class23.field352 && class331.field5123[var10].equalsIgnoreCase(class313.field4775.method2335((byte) -100, class288.field4292))) {
                            if (class339.field5365.field4930 < arg0.field4930) {
                                var11 = 2000;
                            }
                            if (class339.field5365.field4953 != 0 && arg0.field4953 != 0) {
                                if (class339.field5365.field4953 == arg0.field4953) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class74.field991[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class1.field7[var10] + var11);
                        int var13 = class397.field6039[var10] == -1 ? class286.field4260 : class397.field6039[var10];
                        class294.method1898(arg2 + 378, 0, (long) arg0.field5254, false, var13, true, class331.field5123[var10], "<col=ffffff>" + var3, 0, -1, var12);
                        class267.field3718++;
                    }
                }
            }
            if (arg2 == -379 && !arg1) {
                for (class32 var14 = (class32) class96.field1395.method1970(64); var14 != null; var14 = (class32) class96.field1395.method1960(24)) {
                    if (var14.field485 == 48) {
                        var14.field494 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class500.field7455 && (class303.field4468 & 0x10) != 0) {
            class294.method1898(-1, 0, 0L, false, class261.field3635, true, class266.field3714, class509.field7572 + " -> <col=ffffff>" + class4.field47.method2335((byte) -100, class288.field4292), 0, -1, 15);
            class29.field452++;
        }
    }
}

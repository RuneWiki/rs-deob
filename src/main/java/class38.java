import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field611 = "";

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Z")
    public static boolean field616 = false;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[[[I")
    public static int[][][] field612;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method295(byte arg0) {
        field612 = null;
        field611 = null;
        int var1 = 22 % ((-arg0 - 82) / 39);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLai;)V")
    public static final void method296(boolean arg0, class129 arg1) {
        field610++;
        if (class10.field97 >= 400) {
            return;
        }
        if (arg0) {
            method300((class413) null);
        }
        class373 var2 = arg1.field1714;
        if (var2.field5576 != null) {
            var2 = var2.method2469(true);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field5572) {
            return;
        }
        String var3 = var2.field5596;
        if (var2.field5591 != 0) {
            String var4 = class126.field1679 == 1 ? class97.field1330 : class433.field6391;
            var3 = var3 + class16.method109((byte) 51, var2.field5591, class100.field1350.field2780) + " (" + var4 + var2.field5591 + ")";
        }
        if (class394.field5921 == 1) {
            class34.field553++;
            class169.method1048(class274.field4033, (long) arg1.field249, class238.field3341, -1, 0, class66.field939 + " -> <col=ffff00>" + var3, 0, 23);
        } else if (class95.field1307) {
            class85 var5 = class86.field1206 == -1 ? null : class391.method2555(class86.field1206, true);
            if ((class168.field2212 & 0x2) != 0) {
                if (var5 == null || var2.method2464(class86.field1206, var5.field1181, 74) != var5.field1181) {
                    class169.method1048(class369.field5488, (long) arg1.field249, class191.field2667, -1, 0, class333.field4927 + " -> <col=ffff00>" + var3, 0, 13);
                    class423.field6299++;
                }
                return;
            }
        } else {
            String[] var6 = var2.field5626;
            if (class122.field1635) {
                var6 = class94.method578(var6, (byte) 122);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class126.field1679 != 0 || !var6[var7].equalsIgnoreCase(class143.field1893))) {
                        byte var8 = 0;
                        int var9 = class358.field5245;
                        if (var7 == 0) {
                            var8 = 43;
                        }
                        if (var7 == 1) {
                            var8 = 8;
                        }
                        if (var7 == 2) {
                            var8 = 41;
                        }
                        if (var7 == 3) {
                            var8 = 14;
                        }
                        if (var7 == 4) {
                            var8 = 1;
                        }
                        if (var2.field5564 == var7) {
                            var9 = var2.field5605;
                        }
                        if (var2.field5568 == var7) {
                            var9 = var2.field5620;
                        }
                        class169.method1048(var9, (long) arg1.field249, var6[var7], -1, 0, "<col=ffff00>" + var3, 0, var8);
                        class169.field2216++;
                    }
                }
            }
            if (class126.field1679 == 0 && var6 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var6[var10] != null && var6[var10].equalsIgnoreCase(class143.field1893)) {
                        short var11 = 0;
                        if (class100.field1350.field2780 < var2.field5591) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 43;
                        }
                        if (var10 == 1) {
                            var12 = 8;
                        }
                        if (var10 == 2) {
                            var12 = 41;
                        }
                        if (var10 == 3) {
                            var12 = 14;
                        }
                        if (var10 == 4) {
                            var12 = 1;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class322.field4595++;
                        class169.method1048(var2.field5603, (long) arg1.field249, var6[var10], -1, 0, "<col=ffff00>" + var3, 0, var12);
                    }
                }
            }
            class342.field5021++;
            class169.method1048(class196.field2803, (long) arg1.field249, class166.field2173, -1, 0, "<col=ffff00>" + var3, 0, 1008);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILfg;)V")
    public static final void method297(int arg0, class18 arg1) {
        if (arg0 != 1) {
            return;
        }
        field617++;
        if (arg1 instanceof class129) {
            class129 var2 = (class129) arg1;
            if (var2.field1714 != null) {
                method296(false, var2);
                return;
            }
        } else if ((arg1 instanceof class194)) {
            class73.method452((class194) arg1, 2223);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILqj;)V")
    public static final void method298(int arg0, class238 arg1) {
        field614++;
        if (arg0 >= -43) {
            field611 = null;
        }
        class104.field1397 = arg1;
        class273.field4021 = class104.field1397.method1476(15, (byte) -72);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[BI)I")
    public static final int method299(int arg0, int arg1, byte[] arg2, int arg3) {
        field619++;
        if (arg0 != -5) {
            return -40;
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = class292.field4226[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lnd;)V")
    public static final void method300(class413 arg0) {
        if (class134.field1789 >= 255) {
            return;
        }
        class74.field997[class134.field1789] = arg0;
        class333.field4915[class134.field1789] = false;
        class134.field1789++;
        int var1 = arg0.field6171;
        if (arg0.field6179) {
            var1 = 0;
        }
        int var2 = arg0.field6171;
        if (arg0.field6168) {
            var2 = class137.field1817 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field5990 + 64 - arg0.field5991 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field5991 + arg0.field5990 - 64 >> 7;
            if (var6 >= class413.field6175) {
                var6 = class413.field6175 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field6180[var4++];
                int var9 = (var8 >>> 8) + (arg0.field5994 + 64 - arg0.field5991 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class308.field4403) {
                    var10 = class308.field4403 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = field612[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        field612[var3][var11][var7] = var12 | class134.field1789;
                    } else if ((var12 & 0xFF00) == 0) {
                        field612[var3][var11][var7] = var12 | class134.field1789 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        field612[var3][var11][var7] = var12 | class134.field1789 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        field612[var3][var11][var7] = var12 | class134.field1789 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method301(int arg0) {
        if (class179.field2355 > arg0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class248.field3458.length; var2++) {
                if (class248.field3458[var2].startsWith("--> ")) {
                    var1++;
                    if (class179.field2355 == var1) {
                        class155.field2030 = class248.field3458[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class155.field2030 = "";
        }
        field615++;
    }
}

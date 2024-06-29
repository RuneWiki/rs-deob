import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class183 {

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public int field2919 = 16777215;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public int field2922 = 8;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2921 = "yellow:";

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public boolean field2907;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
    public static final int method1269(int arg0, byte arg1) {
        if (arg1 <= 5) {
            field2921 = null;
        }
        field2908++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB)V")
    public static final void method1270(boolean arg0, byte arg1) {
        if (arg0) {
            if (class164.field2602 != -1) {
                class14.method74(class164.field2602, true);
            }
            for (class86 var2 = (class86) class92.field1139.method710((byte) -95); var2 != null; var2 = (class86) class92.field1139.method709(false)) {
                class289.method1943(var2, false, true);
            }
            class164.field2602 = -1;
            class92.field1139 = new class110(8);
            class189.method1320(arg1 ^ 0xFFFFF6C1);
            class164.field2602 = class258.field4182;
            class138.method961(-68, false);
            class275.method1844((byte) 56);
            class218.method1542(false, class164.field2602);
        }
        field2909++;
        class136.field2157 = -1;
        class122.method791(class81.field1007, (byte) -13);
        class286.field4571 = new class259();
        class286.field4571.field3818 = 3000;
        class286.field4571.field3820 = 3000;
        if (arg1 != 48) {
            field2906 = -78;
        }
        if (class297.field4695 == 0) {
            class76.method425((byte) -128, class147.field2302);
            class2.method13(false, 10);
            return;
        }
        if (class283.field4513 == 2) {
            class74.field932 = class41.field507 << 7;
            class36.field465 = class191.field3085 << 7;
        } else {
            class101.method615(-5580);
        }
        class285.method1913(21339);
        class2.method13(false, 28);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILpd;)V")
    public final void method1271(byte arg0, int arg1, class96 arg2) {
        if (arg0 > -66) {
            this.method1271((byte) 0, 104, (class96) null);
        }
        while (true) {
            int var4 = arg2.method584(255);
            if (var4 == 0) {
                field2920++;
                return;
            }
            this.method1277(arg2, var4, -97, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method1272(byte arg0) {
        if (arg0 <= 69) {
            field2921 = null;
        }
        for (int var1 = 0; var1 < class126.field2027; var1++) {
            int var2 = class178.field2832[var1];
            class200 var3 = class265.field4273[var2];
            int var4 = class96.field1283.method584(255);
            if ((var4 & 0x80) != 0) {
                var4 += class96.field1283.method584(255) << 8;
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field3166.method1317(0)) {
                    class171.method1169((byte) -116, var3);
                }
                var3.method1396((byte) 82, class130.method888(0, class96.field1283.method586((byte) -81)));
                var3.method1634(-1, var3.field3166.field3034);
                var3.field3740 = var3.field3166.field3032;
                var3.field3769 = var3.field3166.field3008;
                if (var3.field3166.method1317(0)) {
                    class261.method1773(0, var3.field3836[0], (class259) null, (class228) null, var3, var3.field3829[0], (byte) 87, class244.field4011);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class96.field1283.method586((byte) -81);
                if (var5 == 65535) {
                    var5 = -1;
                }
                boolean var6 = true;
                int var7 = class96.field1283.method597(-1197332568);
                if (var5 != -1 && var3.field3757 != -1 && class208.method1458((byte) 111, class79.method440(var5, (byte) 14).field1318).field2646 < class208.method1458((byte) 94, class79.method440(var3.field3757, (byte) 14).field1318).field2646) {
                    var6 = false;
                }
                if (var6) {
                    var3.field3832 = 1;
                    var3.field3779 = (var7 & 0xFFFF) + class73.field924;
                    var3.field3761 = 0;
                    var3.field3783 = var7 >> 16;
                    var3.field3772 = 0;
                    var3.field3757 = var5;
                    if (var3.field3779 > class73.field924) {
                        var3.field3772 = -1;
                    }
                    if (var3.field3757 != -1 && class73.field924 == var3.field3779) {
                        int var8 = class79.method440(var3.field3757, (byte) 14).field1318;
                        if (var8 != -1) {
                            class165 var9 = class208.method1458((byte) 97, var8);
                            if (var9 != null && var9.field2624 != null) {
                                class221.method1562(0, var3.field3820, var3.field3818, var9, (byte) 47, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class96.field1283.method584(255);
                int var11 = class96.field1283.method585(255);
                var3.method1645(var11, true, var10, class73.field924);
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class96.field1283.method563(255);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class96.field1283.method562((byte) -18);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class96.field1283.method585(255);
                    var15[var16] = class96.field1283.method586((byte) -81);
                }
                class171.method1167(-126, var3, var14, var15, var13);
            }
            if ((var4 & 0x2) != 0) {
                var3.field3812 = class96.field1283.method549(255);
                if (var3.field3812 == 65535) {
                    var3.field3812 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class96.field1283.method585(255);
                int var19 = class96.field1283.method563(255);
                var3.method1645(var19, true, var18, class73.field924);
                var3.field3807 = class73.field924 + 300;
                var3.field3741 = class96.field1283.method583(-1);
            }
            if ((var4 & 0x200) != 0) {
                var3.field3803 = class96.field1283.method549(255);
                var3.field3806 = class96.field1283.method549(255);
            }
            if ((var4 & 0x8) != 0) {
                var3.field3822 = class96.field1283.method588(false);
                var3.field3773 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var20 = class96.field1283.method562((byte) -18);
                int var21 = class96.field1283.method584(255);
                if (var20 == 65535) {
                    var20 = -1;
                }
                class167.method1153(var21, var3, (byte) 120, var20);
            }
        }
        field2912++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILid;IBIII)V")
    public static final void method1273(int arg0, class230 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 123) {
            field2918++;
            class122.method795(arg1.field3818, arg4, 64, arg2, arg5, arg0, arg6, arg1.field3820);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method1274(int arg0) {
        if (arg0 == 442148776) {
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1275(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field2914++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class280.field4448 = arg2;
        class226.field3636 = arg0;
        class167.field2684 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1276(int arg0, int arg1) {
        if (arg0 == 255) {
            field2910++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF51) >> 8) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpd;III)V")
    private final void method1277(class96 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field2922 = arg0.method549(255);
        } else if (arg1 == 2) {
            this.field2907 = true;
        } else if (arg1 == 3) {
            this.field2915 = arg0.method564(-116);
            this.field2905 = arg0.method564(-116);
            this.field2916 = arg0.method564(-99);
        } else if (arg1 == 4) {
            this.field2917 = arg0.method584(255);
        } else if (arg1 == 5) {
            this.field2923 = arg0.method549(255);
        } else if (arg1 == 6) {
            this.field2919 = arg0.method598(-1235752501);
        }
        int var5 = 20 % ((arg2 - 22) / 35);
        field2911++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
    public static final void method1278(byte arg0, int arg1) {
        field2904++;
        class294.field4663.method1695(arg1, 0);
        if (arg0 <= 47) {
            method1276(76, -29);
        }
    }
}

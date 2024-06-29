import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class class401 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "[[I")
    public static int[][] field5859 = new int[128][128];

    @OriginalMember(owner = "client!us", name = "f", descriptor = "Lct;")
    private static class285 field5861;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Lsh;")
    public static class472 field5862;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5863;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "[[Lnd;")
    public static class484[][] field5864;

    static {
        new class332("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field5861 = new class285(57, 3);
        field5862 = new class472(10, -1);
        field5863 = new String[100];
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2402(int arg0) {
        field5856++;
        try {
            if (class428.field6110 == 1) {
                int var1 = class245.field3510.method1157((byte) -40);
                if (var1 > 0 && class245.field3510.method1134(-112)) {
                    int var2 = var1 - class479.field6747;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class245.field3510.method1144(true, var2);
                    return;
                }
                class245.field3510.method1158((byte) -125);
                class245.field3510.method1166(false);
                class451.field6403 = null;
                if (class415.field5986 == null) {
                    class428.field6110 = 0;
                } else {
                    class428.field6110 = 2;
                }
                class236.field3436 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class245.field3510.method1158((byte) -102);
            class428.field6110 = 0;
            class415.field5986 = null;
            class451.field6403 = null;
            class236.field3436 = null;
        }
        int var4 = 62 % ((arg0 + 65) / 56);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 49)
    public static final void method2403(short[] arg0, int arg1, String[] arg2) {
        class480.method2822(arg1, arg2, arg0, arg2.length - 1, arg1 + -68);
        field5858++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILse;I)V", line = 58)
    public static final void method2404(int arg0, int arg1, class146 arg2, int arg3) {
        field5857++;
        if (arg2 == null || class451.field6377.field5951 == arg2) {
            return;
        }
        int var4 = arg2.field2061;
        int var5 = arg2.field2058;
        int var6 = arg2.field2056;
        int var7 = (int) arg2.field2066;
        if (arg1 != 0) {
            method2402(-126);
        }
        long var8 = arg2.field2066;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 8) {
            class349 var10 = class18.field241[var7];
            if (var10 != null) {
                class392.field5774++;
                class358.field5444 = arg0;
                class302.field4501 = arg3;
                class432.field6142 = 0;
                class27.field357 = 2;
                class378.method2320(class370.field5573, (byte) 119);
                class230.field3390.method2592(var7, (byte) -110);
                class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
                class433.method2534(var10.field4674[0], (byte) 37, var10.method1705((byte) 65), var10.method1705((byte) 65), var10.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 46) {
            class178 var11 = class331.method2032(var5, var4, -1);
            if (var11 != null) {
                class188.method1295(118, var11);
            }
        }
        if (var6 == 13 && class232.field3403 == null) {
            class330.method2024(-29060, var5, var4);
            class232.field3403 = class331.method2032(var5, var4, -1);
            class205.method1396(72, class232.field3403);
        }
        if (var6 == 58) {
            class257 var12 = class40.field565[var7];
            if (var12 != null) {
                class363.field5506++;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class27.field357 = 2;
                class302.field4501 = arg3;
                class378.method2320(class467.field6567, (byte) 119);
                class230.field3390.method2592(var7, (byte) -95);
                class230.field3390.method2619((byte) -125, class296.field4445.method1100(false, 82) ? 1 : 0);
                class433.method2534(var12.field4674[0], (byte) -123, var12.method1705((byte) 65), var12.method1705((byte) 65), var12.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 15) {
            class257 var13 = class40.field565[var7];
            if (var13 != null) {
                class302.field4501 = arg3;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class237.field3455++;
                class27.field357 = 2;
                class378.method2320(class282.field4274, (byte) 119);
                class230.field3390.method2593(-118, var7);
                class230.field3390.method2619((byte) 54, class296.field4445.method1100(false, 82) ? 1 : 0);
                class433.method2534(var13.field4674[0], (byte) 118, var13.method1705((byte) 65), var13.method1705((byte) 65), var13.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 11) {
            class302.field4501 = arg3;
            class358.field5444 = arg0;
            class432.field6142 = 0;
            class230.field3380++;
            class27.field357 = 2;
            class378.method2320(class29.field404, (byte) 119);
            class230.field3390.method2592(class68.field922 + var4, (byte) -97);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class230.field3390.method2593(-75, class468.field6588 + var5);
            class230.field3390.method2593(-100, var7);
            class419.method2484((byte) -81, var5, var4);
        }
        if (var6 == 17) {
            class432.field6142 = 0;
            class302.field4501 = arg3;
            class38.field513++;
            class358.field5444 = arg0;
            class27.field357 = 2;
            class378.method2320(class155.field2160, (byte) 119);
            class230.field3390.method2593(-56, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class230.field3390.method2593(-12, class468.field6588 + var5);
            class230.field3390.method2593(arg1 - 68, class68.field922 + var4);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 30) {
            class178 var14 = class331.method2032(var5, var4, -1);
            if (var14 != null) {
                class110.method809((byte) -111);
                class176 var15 = client.method2777(var14);
                class237.method1542(var15.field2504, var4, var15.method1207((byte) -111), arg1 ^ 0x56, var14.field2594, var14.field2634, var5);
                class184.field2803 = class140.method969(var14, 11481);
                class357.field5428 = var14.field2565 + "<col=ffffff>";
                if (class184.field2803 == null) {
                    class184.field2803 = "Null";
                }
            }
            return;
        }
        if (var6 == 25) {
            class349 var16 = class18.field241[var7];
            if (var16 != null) {
                class432.field6142 = 0;
                class302.field4501 = arg3;
                class358.field5444 = arg0;
                class395.field5812++;
                class27.field357 = 2;
                class378.method2320(class341.field5104, (byte) 119);
                class230.field3390.method2608(class296.field4445.method1100(false, 82) ? 1 : 0, false);
                class230.field3390.method2593(arg1 - 110, var7);
                class433.method2534(var16.field4674[0], (byte) -118, var16.method1705((byte) 65), var16.method1705((byte) 65), var16.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 3) {
            class349 var17 = class18.field241[var7];
            if (var17 != null) {
                class409.field5926++;
                class27.field357 = 2;
                class358.field5444 = arg0;
                class302.field4501 = arg3;
                class432.field6142 = 0;
                class378.method2320(class321.field4797, (byte) 119);
                class230.field3390.method2580(0, var7);
                class230.field3390.method2615(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) -91);
                class433.method2534(var17.field4674[0], (byte) -123, var17.method1705((byte) 65), var17.method1705((byte) 65), var17.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 21) {
            class257 var18 = class40.field565[var7];
            if (var18 != null) {
                class302.field4501 = arg3;
                class27.field357 = 2;
                class493.field6944++;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class378.method2320(class9.field151, (byte) 119);
                class230.field3390.method2615(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) -82);
                class230.field3390.method2624((byte) -3, var7);
                class433.method2534(var18.field4674[0], (byte) 111, var18.method1705((byte) 65), var18.method1705((byte) 65), var18.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 1012) {
            class358.field5444 = arg0;
            class27.field357 = 2;
            class432.field6142 = 0;
            class302.field4501 = arg3;
            class349 var19 = class18.field241[var7];
            if (var19 != null) {
                class273 var20 = var19.field5309;
                if (var20.field4107 != null) {
                    var20 = var20.method1781(class315.field4736, true);
                }
                if (var20 != null) {
                    class378.method2320(class35.field440, (byte) 119);
                    class415.field5981++;
                    class230.field3390.method2592(var20.field4152, (byte) -122);
                }
            }
        }
        if (var6 == 18) {
            class257 var21 = class40.field565[var7];
            if (var21 != null) {
                class156.field2171++;
                class302.field4501 = arg3;
                class27.field357 = 2;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class378.method2320(class416.field5999, (byte) 119);
                class230.field3390.method2592(var7, (byte) -108);
                class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
                class433.method2534(var21.field4674[0], (byte) 37, var21.method1705((byte) 65), var21.method1705((byte) 65), var21.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 60) {
            class358.field5444 = arg0;
            class432.field6142 = 0;
            class302.field4501 = arg3;
            class27.field357 = 2;
            class8.field130++;
            class378.method2320(class363.field5507, (byte) 119);
            class230.field3390.method2580(0, class468.field6588 + var5);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class230.field3390.method2593(arg1 ^ 0xFFFFFF90, var7);
            class230.field3390.method2624((byte) -3, class68.field922 + var4);
            class419.method2484((byte) -112, var5, var4);
        }
        if (var6 == 9) {
            class432.field6142 = 0;
            class318.field4770++;
            class358.field5444 = arg0;
            class302.field4501 = arg3;
            class27.field357 = 2;
            class378.method2320(class150.field2108, (byte) 119);
            class230.field3390.method2593(-74, class468.field6588 + var5);
            class230.field3390.method2580(0, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class230.field3390.method2619((byte) 122, class296.field4445.method1100(false, 82) ? 1 : 0);
            class230.field3390.method2624((byte) -3, class68.field922 + var4);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 44) {
            class257 var22 = class40.field565[var7];
            if (var22 != null) {
                class302.field4501 = arg3;
                class27.field357 = 2;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class315.field4745++;
                class378.method2320(class250.field3600, (byte) 119);
                class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
                class230.field3390.method2592(var7, (byte) -113);
                class433.method2534(var22.field4674[0], (byte) 15, var22.method1705((byte) 65), var22.method1705((byte) 65), var22.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 49) {
            class257 var23 = class40.field565[var7];
            if (var23 != null) {
                class12.field176++;
                class27.field357 = 2;
                class432.field6142 = 0;
                class302.field4501 = arg3;
                class358.field5444 = arg0;
                class378.method2320(class304.field4527, (byte) 119);
                class230.field3390.method2608(class296.field4445.method1100(false, 82) ? 1 : 0, false);
                class230.field3390.method2624((byte) -3, var7);
                class433.method2534(var23.field4674[0], (byte) 121, var23.method1705((byte) 65), var23.method1705((byte) 65), var23.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 12) {
            class302.field4501 = arg3;
            class365.field5517++;
            class27.field357 = 2;
            class358.field5444 = arg0;
            class432.field6142 = 0;
            class378.method2320(class13.field194, (byte) 119);
            class230.field3390.method2608(class296.field4445.method1100(false, 82) ? 1 : 0, false);
            class230.field3390.method2593(-55, class468.field6588 + var5);
            class230.field3390.method2592(class68.field922 + var4, (byte) -122);
            class230.field3390.method2593(-37, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 51) {
            if (class465.field6556 > 0 && class296.field4445.method1100(false, 82) && class296.field4445.method1100(false, 81)) {
                class422.method2491(class68.field922 + var4, class472.field6622.field4545, class468.field6588 + var5, 0);
            } else {
                class346.method2133(var7, var5, var4, false);
                if (var7 == 1) {
                    class230.field3390.method2619((byte) -14, -1);
                    class230.field3390.method2619((byte) -128, -1);
                    class230.field3390.method2592((int) class384.field5682, (byte) -96);
                    class230.field3390.method2619((byte) 35, 57);
                    class230.field3390.method2619((byte) 62, class347.field5291);
                    class230.field3390.method2619((byte) -120, class358.field5437);
                    class230.field3390.method2619((byte) 34, 89);
                    class230.field3390.method2592(class472.field6622.field4543, (byte) -101);
                    class230.field3390.method2592(class472.field6622.field4538, (byte) -117);
                    class230.field3390.method2619((byte) -121, 63);
                } else {
                    class27.field357 = 1;
                    class302.field4501 = arg3;
                    class432.field6142 = 0;
                    class358.field5444 = arg0;
                }
                class433.method2534(var5, (byte) 43, 1, 1, var4, 0, -4, 0, true);
            }
        }
        if (var6 == 20) {
            class82.field1146++;
            class358.field5444 = arg0;
            class432.field6142 = 0;
            class302.field4501 = arg3;
            class27.field357 = 2;
            class378.method2320(class424.field6073, (byte) 119);
            class230.field3390.method2624((byte) -3, class468.field6588 + var5);
            class230.field3390.method2619((byte) 85, class296.field4445.method1100(false, 82) ? 1 : 0);
            class230.field3390.method2580(0, class68.field922 + var4);
            class230.field3390.method2593(-18, var7);
            class419.method2484((byte) -116, var5, var4);
        }
        if (var6 == 50 || var6 == 1006) {
            class485.method2834(18776, var7, arg2.field2064, var4, var5);
        }
        if (var6 == 23) {
            class349 var24 = class18.field241[var7];
            if (var24 != null) {
                class302.field4501 = arg3;
                class358.field5444 = arg0;
                class89.field1248++;
                class27.field357 = 2;
                class432.field6142 = 0;
                class378.method2320(class424.field6062, (byte) 119);
                class230.field3390.method2593(-71, var7);
                class230.field3390.method2619((byte) -119, class296.field4445.method1100(false, 82) ? 1 : 0);
                class433.method2534(var24.field4674[0], (byte) 101, var24.method1705((byte) 65), var24.method1705((byte) 65), var24.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 22) {
            class302.field4501 = arg3;
            class432.field6142 = 0;
            class27.field357 = 2;
            class402.field5870++;
            class358.field5444 = arg0;
            class378.method2320(class6.field106, (byte) 119);
            class230.field3390.method2592(class467.field6570, (byte) -107);
            class230.field3390.method2593(-125, var4 + class68.field922);
            class230.field3390.method2580(0, class335.field5024);
            class230.field3390.method2593(arg1 - 50, var7);
            class230.field3390.method2594(53, class65.field898);
            class230.field3390.method2592(class468.field6588 + var5, (byte) -120);
            class230.field3390.method2619((byte) -121, class296.field4445.method1100(false, 82) ? 1 : 0);
            class419.method2484((byte) 76, var5, var4);
        }
        if (var6 == 5) {
            class257 var25 = class40.field565[var7];
            if (var25 != null) {
                class302.field4501 = arg3;
                class27.field357 = 2;
                class491.field6902++;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class378.method2320(class200.field3033, (byte) 119);
                class230.field3390.method2619((byte) -122, class296.field4445.method1100(false, 82) ? 1 : 0);
                class230.field3390.method2580(0, class467.field6570);
                class230.field3390.method2594(57, class65.field898);
                class230.field3390.method2592(var7, (byte) -101);
                class230.field3390.method2580(arg1, class335.field5024);
                class433.method2534(var25.field4674[0], (byte) -128, var25.method1705((byte) 65), var25.method1705((byte) 65), var25.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 1009) {
            class293.field4421++;
            class302.field4501 = arg3;
            class432.field6142 = 0;
            class358.field5444 = arg0;
            class27.field357 = 2;
            class378.method2320(class58.field801, (byte) 119);
            class230.field3390.method2592(var7, (byte) -116);
        }
        if (var6 == 10) {
            class257 var26 = class40.field565[var7];
            if (var26 != null) {
                class302.field4501 = arg3;
                class358.field5444 = arg0;
                class432.field6142 = 0;
                class27.field357 = 2;
                class403.field5875++;
                class378.method2320(class163.field2257, (byte) 119);
                class230.field3390.method2615(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) -70);
                class230.field3390.method2624((byte) -3, var7);
                class433.method2534(var26.field4674[0], (byte) 32, var26.method1705((byte) 65), var26.method1705((byte) 65), var26.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 1003 || var6 == 1011 || var6 == 1007 || var6 == 1010 || var6 == 1001) {
            class47.method347(var6, (byte) -120, var7, var4);
        }
        if (var6 == 2) {
            class432.field6142 = 0;
            class358.field5444 = arg0;
            class27.field357 = 2;
            class10.field154++;
            class302.field4501 = arg3;
            class378.method2320(class327.field4919, (byte) 119);
            class230.field3390.method2624((byte) -3, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class230.field3390.method2580(0, class468.field6588 + var5);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class230.field3390.method2624((byte) -3, class68.field922 + var4);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 59) {
            class358.field5444 = arg0;
            class302.field4501 = arg3;
            class27.field357 = 2;
            class432.field6142 = 0;
            class119.field1649++;
            class378.method2320(class295.field4439, (byte) 119);
            class230.field3390.method2624((byte) -3, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class230.field3390.method2592(class68.field922 + var4, (byte) -125);
            class230.field3390.method2592(class467.field6570, (byte) -96);
            class230.field3390.method2580(0, class468.field6588 + var5);
            class230.field3390.method2619((byte) -119, class296.field4445.method1100(false, 82) ? 1 : 0);
            class230.field3390.method2593(-82, class335.field5024);
            class230.field3390.method2594(arg1 ^ 0x34, class65.field898);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 1008) {
            class432.field6142 = 0;
            class358.field5444 = arg0;
            class302.field4501 = arg3;
            class27.field357 = 2;
            class138.field1987++;
            class378.method2320(client.field6667, (byte) 119);
            class230.field3390.method2592(var7, (byte) -97);
        }
        if (var6 == 57) {
            class349 var27 = class18.field241[var7];
            if (var27 != null) {
                class432.field6142 = 0;
                class302.field4501 = arg3;
                class27.field357 = 2;
                class43.field573++;
                class358.field5444 = arg0;
                class378.method2320(class6.field103, (byte) 119);
                class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
                class230.field3390.method2580(0, class467.field6570);
                class230.field3390.method2610(class65.field898, (byte) 19);
                class230.field3390.method2593(-103, class335.field5024);
                class230.field3390.method2624((byte) -3, var7);
                class433.method2534(var27.field4674[0], (byte) -118, var27.method1705((byte) 65), var27.method1705((byte) 65), var27.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 45) {
            class257 var28 = class40.field565[var7];
            if (var28 != null) {
                class432.field6142 = 0;
                class227.field3318++;
                class358.field5444 = arg0;
                class27.field357 = 2;
                class302.field4501 = arg3;
                class378.method2320(field5861, (byte) 119);
                class230.field3390.method2593(-126, var7);
                class230.field3390.method2608(class296.field4445.method1100(false, 82) ? 1 : 0, false);
                class433.method2534(var28.field4674[0], (byte) -113, var28.method1705((byte) 65), var28.method1705((byte) 65), var28.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 1002) {
            class302.field4501 = arg3;
            class432.field6142 = 0;
            class165.field2288++;
            class27.field357 = 2;
            class358.field5444 = arg0;
            class378.method2320(class99.field1412, (byte) 119);
            class230.field3390.method2580(arg1, var4 + class68.field922);
            class230.field3390.method2624((byte) -3, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class230.field3390.method2592(var5 + class468.field6588, (byte) -109);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class406.method2432(var4, var8, (byte) 19, var5);
        }
        if (var6 == 47) {
            class302.field4501 = arg3;
            class68.field928++;
            class358.field5444 = arg0;
            class432.field6142 = 0;
            class27.field357 = 2;
            class378.method2320(class174.field2464, (byte) 119);
            class230.field3390.method2592(var4 + class68.field922, (byte) -127);
            class230.field3390.method2592(class468.field6588 + var5, (byte) -125);
            class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
            class230.field3390.method2592(var7, (byte) -111);
            class419.method2484((byte) -79, var5, var4);
        }
        if (var6 == 48) {
            class358.field5444 = arg0;
            class27.field357 = 2;
            class432.field6142 = 0;
            class228.field3349++;
            class302.field4501 = arg3;
            class378.method2320(class111.field1566, (byte) 119);
            class230.field3390.method2615(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) -99);
            class230.field3390.method2580(0, var5 + class468.field6588);
            class230.field3390.method2580(0, var7);
            class230.field3390.method2580(0, var4 + class68.field922);
            class419.method2484((byte) 66, var5, var4);
        }
        if (var6 == 6) {
            class349 var29 = class18.field241[var7];
            if (var29 != null) {
                class302.field4501 = arg3;
                class340.field5090++;
                class27.field357 = 2;
                class432.field6142 = 0;
                class358.field5444 = arg0;
                class378.method2320(class469.field6609, (byte) 119);
                class230.field3390.method2607(class296.field4445.method1100(false, 82) ? 1 : 0, (byte) 110);
                class230.field3390.method2593(arg1 ^ 0xFFFFFFBE, var7);
                class433.method2534(var29.field4674[0], (byte) 62, var29.method1705((byte) 65), var29.method1705((byte) 65), var29.field4675[0], 0, -2, 0, true);
            }
        }
        if (var6 == 19) {
            if (class465.field6556 > 0 && class296.field4445.method1100(false, 82) && class296.field4445.method1100(false, 81)) {
                class422.method2491(class68.field922 + var4, class472.field6622.field4545, class468.field6588 + var5, 0);
            } else {
                class358.field5444 = arg0;
                class38.field525++;
                class27.field357 = 1;
                class302.field4501 = arg3;
                class432.field6142 = 0;
                class378.method2320(class12.field159, (byte) 119);
                class230.field3390.method2593(-14, class468.field6588 + var5);
                class230.field3390.method2592(class68.field922 + var4, (byte) -108);
            }
        }
        if (var6 == 4) {
            class358.field5444 = arg0;
            class27.field357 = 1;
            class432.field6142 = 0;
            class466.field6561++;
            class302.field4501 = arg3;
            class378.method2320(class109.field1549, (byte) 119);
            class230.field3390.method2580(0, class467.field6570);
            class230.field3390.method2580(0, class68.field922 + var4);
            class230.field3390.method2624((byte) -3, class468.field6588 + var5);
            class230.field3390.method2593(-89, class335.field5024);
            class230.field3390.method2627(class65.field898, true);
            class433.method2534(var5, (byte) 112, 1, 1, var4, 0, -4, 0, true);
        }
        if (class432.field6152) {
            class110.method809((byte) -121);
        }
        if (class315.field4735 != null && class19.field253 == 0) {
            class205.method1396(99, class315.field4735);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 769)
    public static void method2405(int arg0) {
        field5863 = null;
        if (arg0 < -124) {
            field5861 = null;
            field5864 = null;
            field5859 = null;
            field5862 = null;
        }
    }
}

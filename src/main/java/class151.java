import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class151 extends class171 {

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lha;")
    public static class46 field2692 = class271.method1828(":clan:", -46);

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[S")
    public static short[] field2695 = new short[256];

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Lha;")
    private static class46 field2686 = class271.method1828(" has logged out)3", -46);

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[Lwe;")
    public static class75[] field2696 = new class75[2048];

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lha;")
    public static class46 field2694 = field2686;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Laj;")
    public static class109 field2690;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lpi;")
    public static class181 field2688;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[I")
    public static int[] field2691;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static final void method1110(int arg0) {
        field2687++;
        if (arg0 != -12782) {
            field2691 = null;
        }
        if (class33.field616 == 0 || class33.field616 == 5) {
            return;
        }
        try {
            if ((++class17.field255) > 2000) {
                if (class71.field1214 != null) {
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                }
                if (class167.field2943 >= 1) {
                    class33.field616 = 0;
                    class40.field698 = -5;
                    return;
                }
                class33.field616 = 1;
                class17.field255 = 0;
                class167.field2943++;
                if (class227.field3973 == class129.field2363) {
                    class227.field3973 = class82.field1578;
                } else {
                    class227.field3973 = class129.field2363;
                }
            }
            if (class33.field616 == 1) {
                class105.field1880 = class8.field130.method48(class227.field3973, class269.field4672, 0);
                class33.field616 = 2;
            }
            if (class33.field616 == 2) {
                if (class105.field1880.field2925 == 2) {
                    throw new IOException();
                }
                if (class105.field1880.field2925 != 1) {
                    return;
                }
                class71.field1214 = new class109((Socket) class105.field1880.field2921, class8.field130);
                class105.field1880 = null;
                long var1 = class208.field3738 = class85.field1624.method349((byte) 59);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class58.field967.field1380 = 0;
                class58.field967.method570(14, 15619);
                class58.field967.method570(var3, arg0 ^ 0xFFFFF311);
                class71.field1214.method860(0, class58.field967.field1368, 2, arg0 + 12896);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 88);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 116);
                }
                int var4 = class71.field1214.method859(-110);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 102);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 91);
                }
                if (var4 != 0) {
                    class33.field616 = 0;
                    class40.field698 = var4;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    return;
                }
                class33.field616 = 3;
            }
            if (class33.field616 == 3) {
                if (class71.field1214.method850((byte) 121) < 8) {
                    return;
                }
                class71.field1214.method854(class147.field2651.field1368, 8, 0, 0);
                int[] var5 = new int[4];
                class147.field2651.field1380 = 0;
                class180.field3210 = class147.field2651.method550(true);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class180.field3210;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class58.field967.field1380 = 0;
                var5[2] = (int) (class180.field3210 >> 32);
                class58.field967.method570(10, 15619);
                class58.field967.method581(true, var5[0]);
                class58.field967.method581(true, var5[1]);
                class58.field967.method581(true, var5[2]);
                class58.field967.method581(true, var5[3]);
                class58.field967.method578((byte) 31, class85.field1624.method349((byte) 59));
                class58.field967.method584(class85.field1623, 19347);
                class58.field967.method564((byte) -125, class56.field940, class70.field1211);
                class130.field2375.field1380 = 0;
                if (class135.field2448 == 40) {
                    class130.field2375.method570(18, arg0 ^ 0xFFFFF311);
                } else {
                    class130.field2375.method570(16, 15619);
                }
                class130.field2375.method546((byte) 104, class58.field967.field1380 + client.method1813((byte) 87, class237.field4197) + 154);
                class130.field2375.method581(true, 518);
                class130.field2375.method570(class270.field4718, 15619);
                class130.field2375.method570(class26.field518 ? 1 : 0, 15619);
                class130.field2375.method570(0, arg0 + 28401);
                class130.field2375.method570(class221.method1533(24454), 15619);
                class130.field2375.method546((byte) 117, class50.field876);
                class130.field2375.method546((byte) 105, class163.field2895);
                class175.method1255(class130.field2375, -23066);
                class130.field2375.method584(class237.field4197, 19347);
                class130.field2375.method581(true, class51.field889);
                class130.field2375.method581(true, class209.method1476(0));
                class178.field3198 = true;
                class130.field2375.method546((byte) 126, class265.field4607);
                class130.field2375.method581(true, class56.field947.method1319(26));
                class130.field2375.method581(true, class221.field3890.method1319(arg0 + 12871));
                class130.field2375.method581(true, class163.field2886.method1319(80));
                class130.field2375.method581(true, class70.field1208.method1319(23));
                class130.field2375.method581(true, class181.field3250.method1319(arg0 ^ 0xFFFFCE41));
                class130.field2375.method581(true, class232.field4018.method1319(43));
                class130.field2375.method581(true, class130.field2390.method1319(arg0 + 12860));
                class130.field2375.method581(true, class242.field4308.method1319(59));
                class130.field2375.method581(true, class261.field4549.method1319(125));
                class130.field2375.method581(true, class209.field3744.method1319(54));
                class130.field2375.method581(true, class107.field1982.method1319(arg0 ^ 0xFFFFCE60));
                class130.field2375.method581(true, class112.field2125.method1319(arg0 + 12880));
                class130.field2375.method581(true, class108.field2022.method1319(64));
                class130.field2375.method581(true, class92.field1721.method1319(61));
                class130.field2375.method581(true, class148.field2661.method1319(71));
                class130.field2375.method581(true, class81.field1534.method1319(122));
                class130.field2375.method581(true, class272.field4750.method1319(117));
                class130.field2375.method581(true, class243.field4310.method1319(39));
                class130.field2375.method581(true, class77.field1431.method1319(119));
                class130.field2375.method581(true, class230.field4002.method1319(42));
                class130.field2375.method581(true, class186.field3318.method1319(arg0 ^ 0xFFFFCE71));
                class130.field2375.method581(true, class122.field2266.method1319(arg0 ^ 0xFFFFCE74));
                class130.field2375.method581(true, class271.field4731.method1319(33));
                class130.field2375.method581(true, class26.field516.method1319(arg0 ^ 0xFFFFCE78));
                class130.field2375.method581(true, class24.field390.method1319(25));
                class130.field2375.method581(true, class201.field3581.method1319(arg0 + 12898));
                class130.field2375.method581(true, class155.field2743.method1319(72));
                class130.field2375.method555(class58.field967.field1380, arg0 + 778456374, class58.field967.field1368, 0);
                class71.field1214.method860(0, class130.field2375.field1368, class130.field2375.field1380, arg0 ^ 0xFFFFCE7C);
                class58.field967.method284(124, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class147.field2651.method284(arg0 ^ 0xFFFFCE6E, var5);
                class33.field616 = 4;
            }
            if (class33.field616 == 4) {
                if (class71.field1214.method850((byte) 121) < 1) {
                    return;
                }
                int var7 = class71.field1214.method859(-114);
                if (var7 == 21) {
                    class33.field616 = 7;
                } else if (var7 == 29) {
                    class33.field616 = 10;
                } else if (var7 == 1) {
                    class40.field698 = var7;
                    class33.field616 = 5;
                    return;
                } else if (var7 == 2) {
                    class33.field616 = 8;
                } else if (var7 == 15) {
                    class33.field616 = 0;
                    class40.field698 = var7;
                    return;
                } else if (var7 == 23 && class167.field2943 < 1) {
                    class17.field255 = 0;
                    class33.field616 = 1;
                    class167.field2943++;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    return;
                } else {
                    class40.field698 = var7;
                    class33.field616 = 0;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    return;
                }
            }
            if (class33.field616 == 6) {
                class58.field967.field1380 = 0;
                class58.field967.method285((byte) -90, 17);
                class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, arg0 ^ 0xFFFFCE72);
                class33.field616 = 4;
            } else if (class33.field616 == 7) {
                if (class71.field1214.method850((byte) 121) >= 1) {
                    class38.field667 = class71.field1214.method859(-104) * 60 + 180;
                    class33.field616 = 0;
                    class40.field698 = 21;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                }
            } else if (class33.field616 != 10) {
                if (class33.field616 == 8) {
                    if (class71.field1214.method850((byte) 121) < 12) {
                        return;
                    }
                    class71.field1214.method854(class147.field2651.field1368, 12, 0, 0);
                    class147.field2651.field1380 = 0;
                    class245.field4355 = class147.field2651.method558(arg0 + 12783);
                    class38.field675 = class147.field2651.method558(1);
                    class248.field4383 = class147.field2651.method558(1);
                    class78.field1497 = class147.field2651.method558(1);
                    class229.field3999 = class147.field2651.method558(1) == 1;
                    class114.field2158 = class147.field2651.method545((byte) -85);
                    class46.field786 = class147.field2651.method558(arg0 + 12783) == 1;
                    class124.field2290 = class147.field2651.method558(1) == 1;
                    class206.method1460(class124.field2290, (byte) 77);
                    class168.method1198(class124.field2290, (byte) -118);
                    if (!class26.field518) {
                        if (class248.field4383 == 1 || class46.field786) {
                            try {
                                class102.field1858.method321(0, class8.field130.field143);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class113.field2147.method321(arg0 + 12782, class8.field130.field143);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class109.field2039 = class147.field2651.method286((byte) -116);
                    class219.field3861 = class147.field2651.method545((byte) -77);
                    class33.field616 = 9;
                }
                if (class33.field616 == 9 && class71.field1214.method850((byte) 121) >= class219.field3861) {
                    class147.field2651.field1380 = 0;
                    class71.field1214.method854(class147.field2651.field1368, class219.field3861, 0, arg0 + 12782);
                    class40.field698 = 2;
                    class33.field616 = 0;
                    class42.method278(arg0 ^ 0xFFFFCE12);
                    class38.field669 = -1;
                    class255.method1718(false, -3);
                    class109.field2039 = -1;
                }
            } else if (class71.field1214.method850((byte) 121) >= 1) {
                class105.field1879 = class71.field1214.method859(-103);
                class33.field616 = 0;
                class40.field698 = 29;
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
        } catch (IOException var10) {
            if (class71.field1214 != null) {
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
            if (class167.field2943 >= 1) {
                class40.field698 = -4;
                class33.field616 = 0;
            } else {
                class33.field616 = 1;
                class167.field2943++;
                if (class227.field3973 == class129.field2363) {
                    class227.field3973 = class82.field1578;
                } else {
                    class227.field3973 = class129.field2363;
                }
                class17.field255 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method67(int arg0);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static final void method1111(byte arg0) {
        class129.field2361.method83(25216);
        int var1 = -14 % ((40 - arg0) / 53);
        field2689++;
        class152.field2698.method83(25216);
        class142.field2589.method83(25216);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lha;B)V")
    public static final void method1112(class46 arg0, byte arg1) {
        field2693++;
        class237.field4197 = arg0;
        if (class8.field130.field143 == null) {
            return;
        }
        try {
            class46 var2 = class162.field2880.method317(class8.field130.field143, -10);
            class46 var3 = class73.field1308.method317(class8.field130.field143, 120);
            class46 var4 = class109.method855(0, new class46[] { var2, class135.field2446, arg0, class173.field3083, var3 });
            class46 var5;
            if (arg0.method314(101) == 0) {
                var5 = class109.method855(0, new class46[] { var4, class274.field4785 });
            } else {
                var5 = class109.method855(0, new class46[] { var4, class196.field3499, class124.method968(false, class223.method1537(-26619) + 94608000000L), class265.field4609, class257.method1722((byte) -68, 94608000L) });
            }
            class109.method855(0, new class46[] { class243.field4315, var5, class3.field34 }).method309(class8.field130.field143, -4);
        } catch (Throwable var6) {
        }
        if (arg1 < 81) {
            field2690 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Z")
    public abstract boolean method68(int arg0);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2690 = null;
        field2695 = null;
        field2696 = null;
        field2688 = null;
        field2692 = null;
        field2694 = null;
        field2686 = null;
        field2691 = null;
        int var1 = -58 / ((17 - arg0) / 60);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[I[II)V")
    public static final void method1114(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 + (var9 & 0x1) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1114(var6 - 1, 0, arg2, arg3, arg4);
            method1114(arg0, 0, arg2, arg3, var6 + 1);
        }
        if (arg1 != 0) {
            method1113(-21);
        }
        field2697++;
    }
}

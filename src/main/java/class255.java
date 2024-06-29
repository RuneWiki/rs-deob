import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class255 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Lba;")
    public static class259[] field4478 = new class259[500];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lqc;")
    public static class245 field4476 = new class245(32);

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[Z")
    public static boolean[] field4485 = new boolean[100];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    public static int[] field4486 = new int[5];

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lha;")
    public static class63 field4484;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public static int[] field4480;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4479++;
        if (arg4 > -15) {
            field4476 = null;
        }
        int var6 = class54.method368(arg0, class222.field3788, (byte) 114, class241.field4186);
        int var7 = class54.method368(arg1, class222.field3788, (byte) 114, class241.field4186);
        int var8 = class54.method368(arg3, class215.field3706, (byte) 114, class165.field2972);
        int var9 = class54.method368(arg2, class215.field3706, (byte) 114, class165.field2972);
        for (int var10 = var6; var10 <= var7; var10++) {
            class194.method1266(var8, (byte) -17, arg5, class15.field183[var10], var9);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public static final void method1709(int arg0, byte arg1) {
        if (class102.field2000 == null) {
            class102.field2000 = new byte[4][104][104];
        }
        if (arg0 <= 90) {
            field4483 = -104;
        }
        field4477++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class102.field2000[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4484 = null;
        field4478 = null;
        if (arg0 == 1) {
            field4476 = null;
            field4480 = null;
            field4486 = null;
            field4485 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)[Lni;")
    public static final class168[] method1711(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field4481++;
        class168[] var1 = new class168[class249.field4397];
        for (int var2 = 0; var2 < class249.field4397; var2++) {
            byte[] var3 = class44.field777[var2];
            int var4 = class2.field25[var2] * class199.field3443[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class136.field2517[class115.method767(var3[var6], 255)];
            }
            var1[var2] = new class168(class11.field125, class54.field950, class36.field541[var2], class231.field4029[var2], class2.field25[var2], class199.field3443[var2], var5);
        }
        class211.method1365((byte) -93);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILha;ZI)V")
    public static final void method1712(int arg0, class63 arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method1711(true);
        }
        field4482++;
        if (arg1.field1105 == 1) {
            class75.method536(0, arg1.field1115, (byte) -56, class85.field1679, (short) 23, arg1.field1199, 0L);
            class15.field198++;
        }
        if (arg1.field1105 == 2 && !class247.field4308) {
            class66 var4 = class259.method1769(0, arg1);
            if (var4 != null) {
                class75.method536(-1, arg1.field1115, (byte) -125, class212.method1372(2, new class66[] { class234.field4091, arg1.field1221 }), (short) 32, var4, 0L);
                class78.field1539++;
            }
        }
        if (arg1.field1105 == 3) {
            class28.field402++;
            class75.method536(0, arg1.field1115, (byte) -59, class85.field1679, (short) 10, class63.field1247, 0L);
        }
        if (arg1.field1105 == 4) {
            class57.field973++;
            class75.method536(0, arg1.field1115, (byte) -76, class85.field1679, (short) 36, arg1.field1199, 0L);
        }
        if (arg1.field1105 == 5) {
            class75.method536(0, arg1.field1115, (byte) -86, class85.field1679, (short) 28, arg1.field1199, 0L);
            class10.field118++;
        }
        if (arg1.field1105 == 6 && class264.field4629 == null) {
            class231.field4026++;
            class75.method536(-1, arg1.field1115, (byte) -78, class85.field1679, (short) 57, arg1.field1199, 0L);
        }
        if (arg1.field1219 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field1222; var6++) {
                for (int var7 = 0; var7 < arg1.field1096; var7++) {
                    int var8 = (arg1.field1208 + 32) * var7;
                    int var9 = (arg1.field1169 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field1149[var5];
                        var9 += arg1.field1090[var5];
                    }
                    if (var8 <= arg0 && arg3 >= var9 && var8 + 32 > arg0 && arg3 < var9 + 32) {
                        class220.field3768 = var5;
                        class214.field3672 = arg1;
                        if (arg1.field1118[var5] > 0) {
                            class157 var10 = class40.method242(-25672, arg1.field1118[var5] - 1);
                            if (class188.field3259 == 1 && class77.method544(client.method592(arg1), -207106658)) {
                                if (class85.field1676 != arg1.field1115 || class45.field800 != var5) {
                                    class75.method536(var5, arg1.field1115, (byte) -64, class212.method1372(2, new class66[] { class103.field2004, class171.field3029, var10.field2813 }), (short) 39, class127.field2373, (long) var10.field2801);
                                    class31.field474++;
                                }
                            } else if (!class247.field4308 || !class77.method544(client.method592(arg1), -207106658)) {
                                class111.field2146++;
                                class66[] var11 = var10.field2791;
                                if (class29.field432) {
                                    var11 = class119.method811((byte) -114, var11);
                                }
                                if (class77.method544(client.method592(arg1), -207106658)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 7;
                                            } else {
                                                var13 = 22;
                                            }
                                            class225.field3854++;
                                            class75.method536(var5, arg1.field1115, (byte) -106, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), var13, var11[var12], (long) var10.field2801);
                                        } else if (var12 == 4) {
                                            class196.field3388++;
                                            class75.method536(var5, arg1.field1115, (byte) -111, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), (short) 22, class201.field3458, (long) var10.field2801);
                                        }
                                    }
                                }
                                if (class80.method557(client.method592(arg1), 1424444319)) {
                                    class144.field2631++;
                                    class75.method536(var5, arg1.field1115, (byte) -69, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), (short) 16, class127.field2373, (long) var10.field2801);
                                }
                                if (class77.method544(client.method592(arg1), -207106658) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class54.field933++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 14;
                                            }
                                            if (var14 == 1) {
                                                var15 = 17;
                                            }
                                            if (var14 == 2) {
                                                var15 = 13;
                                            }
                                            class75.method536(var5, arg1.field1115, (byte) -66, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), var15, var11[var14], (long) var10.field2801);
                                        }
                                    }
                                }
                                class66[] var16 = arg1.field1140;
                                if (class29.field432) {
                                    var16 = class119.method811((byte) -73, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class226.field3894++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 41;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 43;
                                            }
                                            if (var17 == 3) {
                                                var18 = 38;
                                            }
                                            if (var17 == 4) {
                                                var18 = 58;
                                            }
                                            class75.method536(var5, arg1.field1115, (byte) -60, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), var18, var16[var17], (long) var10.field2801);
                                        }
                                    }
                                }
                                class75.method536(var5, arg1.field1115, (byte) -99, class212.method1372(2, new class66[] { class150.field2695, var10.field2813 }), (short) 1001, class202.field3466, (long) var10.field2801);
                            } else if ((class9.field103 & 0x10) == 16) {
                                class75.method536(var5, arg1.field1115, (byte) -77, class212.method1372(2, new class66[] { class195.field3366, class171.field3029, var10.field2813 }), (short) 31, class162.field2895, (long) var10.field2801);
                                class201.field3460++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field1186) {
            return;
        }
        if (!class247.field4308) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class66 var23 = class136.method935(-3574, var19, arg1);
                if (var23 != null) {
                    class33.field491++;
                    class75.method536(arg1.field1190, arg1.field1115, (byte) -121, arg1.field1213, (short) 1007, var23, (long) (var19 + 1));
                }
            }
            class66 var20 = class259.method1769(0, arg1);
            if (var20 != null) {
                class78.field1539++;
                class75.method536(arg1.field1190, arg1.field1115, (byte) -105, arg1.field1213, (short) 32, var20, 0L);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class66 var22 = class136.method935(-3574, var21, arg1);
                if (var22 != null) {
                    class75.method536(arg1.field1190, arg1.field1115, (byte) -120, arg1.field1213, (short) 51, var22, (long) (var21 + 1));
                    class33.field491++;
                }
            }
            if (!class75.method539(client.method592(arg1), 1)) {
                return;
            }
            class75.method536(arg1.field1190, arg1.field1115, (byte) -102, class85.field1679, (short) 57, class81.field1578, 0L);
            class231.field4026++;
        } else if (class170.method1161(client.method592(arg1), (byte) -114) && (class9.field103 & 0x20) == 32) {
            class75.method536(arg1.field1190, arg1.field1115, (byte) -92, class212.method1372(2, new class66[] { class195.field3366, class77.field1519, arg1.field1213 }), (short) 6, class162.field2895, 0L);
            class120.field2276++;
            return;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class57 {

    @OriginalMember(owner = "client!j", name = "Ac", descriptor = "Lod;")
    private static class101 field1378 = class46.method335(118, "Invalid username or password)3");

    @OriginalMember(owner = "client!j", name = "Cc", descriptor = "Lod;")
    public static class101 field1380 = field1378;

    @OriginalMember(owner = "client!j", name = "Gc", descriptor = "Lod;")
    private static class101 field1384 = class46.method335(-72, "Loading title screen )2 ");

    @OriginalMember(owner = "client!j", name = "zc", descriptor = "Lod;")
    public static class101 field1377 = field1384;

    @OriginalMember(owner = "client!j", name = "Ec", descriptor = "I")
    public static int field1382 = -1;

    @OriginalMember(owner = "client!j", name = "vc", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!j", name = "xc", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!j", name = "yc", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!j", name = "Bc", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!j", name = "Dc", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!j", name = "Fc", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!j", name = "Hc", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!j", name = "Ic", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!j", name = "Jc", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!j", name = "wc", descriptor = "Lqd;")
    public class115 field1374;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)Lqb;")
    public final class113 method88(byte arg0) {
        ++field1385;
        if (this.field1374 == null) {
            return null;
        } else {
            if (arg0 != -93) {
                method427(39);
            }
            class95 var2 = super.field1300 != -1 && super.field1303 == 0 ? class8.method39(super.field1300, (byte) -90) : null;
            class95 var3 = ~super.field1278 == 0 || super.field1289 == super.field1278 && var2 != null ? null : class8.method39(super.field1278, (byte) -82);
            class113 var4 = this.field1374.method874(var2, var3, false, super.field1301, super.field1318);
            if (var4 == null) {
                return null;
            } else {
                var4.method828();
                super.field1316 = var4.field1157;
                if (super.field1311 != -1 && super.field1329 != -1) {
                    class113 var5 = class52.method376(false, super.field1311).method199((byte) 121, super.field1329);
                    if (var5 != null) {
                        var5.method840(0, -super.field1332, 0);
                        class113[] var6 = new class113[] { var4, var5 };
                        var4 = new class113(var6, 2);
                    }
                }
                if (this.field1374.field2540 == 1) {
                    var4.field2440 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(I)V")
    public static final void method427(int arg0) {
        ++field1373;
        if (~class67.field1516 < -1) {
            for (int var1 = 0; ~var1 > -257; ++var1) {
                if (~class67.field1516 >= -769) {
                    if (~class67.field1516 >= -257) {
                        class15.field310[var1] = class30.method235(class102.field2250[var1], class56.field1268[var1], -class67.field1516 + 256, true);
                    } else {
                        class15.field310[var1] = class102.field2250[var1];
                    }
                } else {
                    class15.field310[var1] = class30.method235(class56.field1268[var1], class102.field2250[var1], -class67.field1516 + 1024, true);
                }
            }
        } else if (class118.field2613 <= 0) {
            for (int var2 = 0; ~var2 > -257; ++var2) {
                class15.field310[var2] = class56.field1268[var2];
            }
        } else {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                if (class118.field2613 > 768) {
                    class15.field310[var3] = class30.method235(class56.field1268[var3], class93.field2006[var3], -class118.field2613 + 1024, true);
                } else if (~class118.field2613 >= -257) {
                    class15.field310[var3] = class30.method235(class93.field2006[var3], class56.field1268[var3], 256 - class118.field2613, true);
                } else {
                    class15.field310[var3] = class93.field2006[var3];
                }
            }
        }
        short var4 = 256;
        class38.method278(0, 9, 128, var4 + 7);
        class119.field2618.method934(0, 0);
        int var5 = 0;
        class38.method288();
        int var6 = 6885;
        for (int var7 = 1; var4 + -1 > var7; ++var7) {
            int var20 = (-var7 + var4) * class131.field2977[var7] / var4;
            int var21 = var20 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var23 = class98.field2131[var5++];
                if (var23 != 0) {
                    int var25 = class106.field2294.field1990[var6];
                    int var26 = -var23 + 256;
                    int var27 = class15.field310[var23];
                    class106.field2294.field1990[var6++] = class41.method307(class41.method307(16711935, var27) * var23 - -(class41.method307(var25, 16711935) * var26), -16711936) - -class41.method307(16711680, class41.method307(65280, var25) * var26 + var23 * class41.method307(var27, 65280)) >> 8;
                } else {
                    ++var6;
                }
            }
            var6 += 765 - (-var21 - -128);
        }
        class38.method278(637, 9, 765, var4 - -7);
        int var8 = 7546;
        class156.field3580.method934(382, arg0);
        class38.method288();
        int var9 = 0;
        for (int var10 = 1; var10 < var4 - 1; ++var10) {
            int var11 = (-var10 + var4) * class131.field2977[var10] / var4;
            int var12 = var8 + var11;
            int var13 = -var11 + 103;
            for (int var14 = 0; ~var13 < ~var14; ++var14) {
                int var15 = class98.field2131[var9++];
                if (~var15 == -1) {
                    ++var12;
                } else {
                    int var17 = -var15 + 256;
                    int var18 = class106.field2294.field1990[var12];
                    int var19 = class15.field310[var15];
                    class106.field2294.field1990[var12++] = class41.method307(class41.method307(var18, 16711935) * var17 + class41.method307(var19, 16711935) * var15, -16711936) + class41.method307(16711680, class41.method307(var18, 65280) * var17 + var15 * class41.method307(65280, var19)) >> 8;
                }
            }
            var8 = -var11 + -var13 + 765 + var12;
            var9 += -var13 + 128;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILnf;I[B)V")
    public static final void method428(int arg0, class96 arg1, int arg2, byte[] arg3) {
        class83 var4 = new class83();
        var4.field1818 = 0;
        ++field1381;
        var4.field2723 = (long) arg2;
        var4.field1810 = arg3;
        var4.field1813 = arg1;
        class78 var5 = class41.field983;
        synchronized (class41.field983) {
            class41.field983.method529(var4, 19002);
        }
        if (arg0 != 20844) {
            field1382 = -8;
        }
        class25.method203((byte) -110);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLtf;Lve;I)V")
    public static final void method429(boolean arg0, class138 arg1, class151 arg2, int arg3) {
        if (arg0) {
            class30 var4 = new class30();
            var4.field785 = arg1.method1055(126);
            var4.field780 = arg1.method1062(1809568712);
            var4.field781 = new class74[var4.field785];
            var4.field782 = new int[var4.field785];
            var4.field789 = new int[var4.field785];
            var4.field791 = new class74[var4.field785];
            ++field1375;
            var4.field777 = new byte[var4.field785][][];
            var4.field786 = new int[var4.field785];
            for (int var5 = 0; ~var5 > ~var4.field785; ++var5) {
                try {
                    int var6 = arg1.method1055(123);
                    if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                        if (~var6 == -4 || ~var6 == -5) {
                            String var10 = new String(arg1.method1058((byte) 70).method712((byte) -63));
                            String var11 = new String(arg1.method1058((byte) -105).method712((byte) -128));
                            int var12 = arg1.method1055(127);
                            String[] var13 = new String[var12];
                            for (int var14 = 0; var12 > var14; ++var14) {
                                var13[var14] = new String(arg1.method1058((byte) -91).method712((byte) -66));
                            }
                            byte[][] var15 = new byte[var12][];
                            if (var6 == 3) {
                                for (int var16 = 0; var16 < var12; ++var16) {
                                    int var17 = arg1.method1062(1809568712);
                                    var15[var16] = new byte[var17];
                                    arg1.method1076(var17, 16711680, 0, var15[var16]);
                                }
                            }
                            Class[] var18 = new Class[var12];
                            var4.field786[var5] = var6;
                            for (int var19 = 0; ~var19 > ~var12; ++var19) {
                                var18[var19] = class156.method1212(var13[var19], (byte) -43);
                            }
                            var4.field781[var5] = arg2.method1168(var11, class156.method1212(var10, (byte) -106), var18, 79);
                            var4.field777[var5] = var15;
                        }
                    } else {
                        int var7 = 0;
                        String var8 = new String(arg1.method1058((byte) -101).method712((byte) -73));
                        String var9 = new String(arg1.method1058((byte) 51).method712((byte) -85));
                        if (~var6 == -2) {
                            var7 = arg1.method1062(1809568712);
                        }
                        var4.field786[var5] = var6;
                        var4.field782[var5] = var7;
                        var4.field791[var5] = arg2.method1169(class156.method1212(var8, (byte) -62), (byte) -89, var9);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field789[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field789[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field789[var5] = -3;
                } catch (Exception var23) {
                    var4.field789[var5] = -4;
                } catch (Throwable var24) {
                    var4.field789[var5] = -5;
                }
            }
            class35.field884.method529(var4, 19002);
        }
    }

    @OriginalMember(owner = "client!j", name = "j", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        ++field1387;
        if (this.field1374 == null) {
            return false;
        } else {
            if (arg0 != -21094) {
                method428(81, (class96) null, 63, (byte[]) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "n", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1380 = null;
        field1377 = null;
        field1384 = null;
        field1378 = null;
        if (arg0 != 0) {
            field1384 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILod;)V")
    public static final void method431(int arg0, class101 arg1) {
        ++field1386;
        if (~class142.field3277 <= -3) {
            if (arg1.method710(class40.field949, 6587)) {
                System.gc();
            }
            if (arg1.method710(class115.field2526, 6587)) {
                class141.method1125(75);
            }
            if (arg1.method710(class97.field2111, arg0 ^ -16718149)) {
                class158.field3639 = true;
            }
            if (arg1.method710(class56.field1264, 6587)) {
                class158.field3639 = false;
            }
            if (arg1.method710(class87.field1915, 6587)) {
                for (int var2 = 0; var2 < 4; ++var2) {
                    for (int var3 = 1; var3 < 103; ++var3) {
                        for (int var4 = 1; var4 < 103; ++var4) {
                            class57.field1331[var2].field1118[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method710(class140.field3219, 6587) && ~class141.field3243 == -3) {
                throw new RuntimeException();
            }
            if (arg1.method713(class31.field805, -22411)) {
                class135.field3096 = arg1.method707((byte) 101, 12).method726(false).method716(7987);
                class111.method818(0, (class101) null, 28960, class15.method101(-78, new class101[] { class67.field1519, class82.method592(false, class135.field3096) }));
            }
            if (arg1.method710(class157.field3611, 6587)) {
                class79.field1659 = true;
            }
        }
        ++class137.field3134;
        if (arg0 != -16711936) {
            method429(true, (class138) null, (class151) null, 13);
        }
        class17.field364.method419(141, (byte) 0);
        class17.field364.method1101(arg1.method737(0) + -1, (byte) -32);
        class17.field364.method1070(arg1.method707((byte) 101, 2), true);
    }
}

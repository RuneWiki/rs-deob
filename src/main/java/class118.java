import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class118 {

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lff;")
    private class9 field1483 = new class9();

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lrp;")
    private class369 field1491 = new class369();

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Lpt;")
    private class451 field1488;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Lvj;")
    public static class373 field1484 = new class373(106, -2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[Z")
    public static boolean[] field1486;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        if (arg0 != 9) {
            field1486 = null;
        }
        class539.field7888.method3687(1402);
        field1478++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLff;J)V")
    public final void method691(byte arg0, class9 arg1, long arg2) {
        if (this.field1490 == 0) {
            class9 var5 = this.field1491.method2072(false);
            var5.method3187(true);
            var5.method48(-1);
            if (this.field1483 == var5) {
                class9 var6 = this.field1491.method2072(false);
                var6.method3187(true);
                var6.method48(-1);
            }
        } else {
            this.field1490--;
        }
        field1487++;
        this.field1488.method2640(1, arg2, arg1);
        this.field1491.method2070(arg1, 111);
        if (arg0 < 72) {
            this.field1483 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        field1479++;
        class611.method3514();
        for (int var1 = 0; var1 < 4; var1++) {
            class309.field3939[var1].method3164(116);
        }
        int var2 = -85 / ((-arg0 - 59) / 48);
        class463.method2698((byte) -24);
        class116.method686(-2);
        System.gc();
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)V")
    public static void method693(byte arg0) {
        if (arg0 != -42) {
            method690((byte) 66);
        }
        field1484 = null;
        field1486 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lkj;II)V")
    public static final void method694(class484 arg0, int arg1, int arg2) {
        field1485++;
        boolean var3 = arg0.method2813(1, 123) == 1;
        if (var3) {
            class42.field334[class306.field3893++] = arg2;
        }
        int var4 = arg0.method2813(2, -27);
        class545 var5 = class459.field6329[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7985 = false;
            } else if (class82.field1003 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class253 var6 = class57.field529[arg2] = new class253();
                var6.field3265 = (var5.field6483[0] + class632.field9113 >> 6 << 14) + (var5.field8660 << 28) + (var5.field6491[0] + class119.field1504 >> 6);
                if (var5.field7984 == -1) {
                    var6.field3269 = var5.field6412.method962(-118);
                } else {
                    var6.field3269 = var5.field7984;
                }
                var6.field3268 = var5.field7986;
                var6.field3270 = var5.field6479;
                if (var5.field7992 > 0) {
                    class444.method2600(var5, (byte) -101);
                }
                class459.field6329[arg2] = null;
                if (arg0.method2813(1, arg1 ^ 0x21C3) != 0) {
                    class632.method3631(arg1 ^ 0x21C0, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2813(3, -2);
            int var8 = var5.field6483[0];
            int var9 = var5.field6491[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field7978 = var9;
                var5.field7985 = true;
                var5.field7987 = var8;
            } else {
                var5.method3196(var9, (byte) 84, class518.field7298[arg2], var8);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2813(4, arg1 ^ 0xFFFFDE1E);
            int var11 = var5.field6483[0];
            int var12 = var5.field6491[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field7978 = var12;
                var5.field7987 = var11;
                var5.field7985 = true;
            } else {
                var5.method3196(var12, (byte) 122, class518.field7298[arg2], var11);
            }
        } else {
            int var13 = arg0.method2813(1, -47);
            if (var13 == 0) {
                int var14 = arg0.method2813(12, -17);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6483[0] + var16;
                int var19 = var5.field6491[0] + var17;
                if (var3) {
                    var5.field7987 = var18;
                    var5.field7978 = var19;
                    var5.field7985 = true;
                } else {
                    var5.method3196(var19, (byte) 93, class518.field7298[arg2], var18);
                }
                var5.field8660 = (byte) (var5.field8660 + var15 & 0x3);
                if (class82.field1003 == arg2) {
                    class442.field6099 = var5.field8660;
                }
            } else {
                int var20 = arg0.method2813(30, 123);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field6483[0] + var22 + class632.field9113 & 0x3FFF) - class632.field9113;
                int var25 = (var5.field6491[0] + var23 + class119.field1504 & 0x3FFF) - class119.field1504;
                if (var3) {
                    var5.field7978 = var25;
                    var5.field7987 = var24;
                    var5.field7985 = true;
                } else {
                    var5.method3196(var25, (byte) 88, class518.field7298[arg2], var24);
                }
                var5.field8660 = (byte) (var5.field8660 + var21 & 0x3);
                if (arg1 != -8596) {
                    field1484 = null;
                }
                if (class82.field1003 == arg2) {
                    class442.field6099 = var5.field8660;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public final void method695(int arg0) {
        field1481++;
        this.field1491.method2067(-3);
        this.field1488.method2642(true);
        int var2 = 58 / ((-arg0 - 41) / 37);
        this.field1483 = new class9();
        this.field1490 = this.field1489;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IJ)Lff;")
    public final class9 method696(int arg0, long arg1) {
        field1482++;
        if (arg0 != 3) {
            return null;
        }
        class9 var4 = (class9) this.field1488.method2645(arg1, (byte) -127);
        if (var4 != null) {
            this.field1491.method2070(var4, arg0 - 104);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
    public static final void method697(byte arg0) {
        class87.method508(124, class289.field3757);
        field1480++;
        class395.field5221++;
        if (class390.field5151 && class521.field7315) {
            int var1 = class368.field4859.method167(64);
            int var2 = class368.field4859.method169(111);
            int var3 = var2 - class197.field2382;
            int var4 = var1 - class98.field1220;
            if (class229.field2842 > var4) {
                var4 = class229.field2842;
            }
            if (class289.field3757.field7094 + var4 > class229.field2842 + class40.field312.field7094) {
                var4 = class229.field2842 + class40.field312.field7094 - class289.field3757.field7094;
            }
            if (var3 < class491.field6853) {
                var3 = class491.field6853;
            }
            if (class289.field3757.field7059 + var3 > class491.field6853 - -class40.field312.field7059) {
                var3 = class40.field312.field7059 + class491.field6853 - class289.field3757.field7059;
            }
            int var5 = var4 + class40.field312.field7190 - class229.field2842;
            int var6 = var3 + class40.field312.field7104 - class491.field6853;
            int var7 = -99 % ((arg0 - 46) / 42);
            if (class368.field4859.method1859((byte) 41)) {
                if (class289.field3757.field7174 < class395.field5221) {
                    int var9 = var4 - class592.field8608;
                    int var10 = var3 - class242.field3113;
                    if (var9 > class289.field3757.field7164 || -class289.field3757.field7164 > var9 || var10 > class289.field3757.field7164 || var10 < (-class289.field3757.field7164)) {
                        class372.field4895 = true;
                    }
                }
                if (class289.field3757.field7187 != null && class372.field4895) {
                    class503 var11 = new class503();
                    var11.field6981 = var6;
                    var11.field6975 = class289.field3757.field7187;
                    var11.field6976 = var5;
                    var11.field6973 = class289.field3757;
                    class630.method3608(var11);
                }
            } else {
                if (class372.field4895) {
                    class281.method1595(25098);
                    if (class289.field3757.field7087 != null) {
                        class503 var8 = new class503();
                        var8.field6973 = class289.field3757;
                        var8.field6975 = class289.field3757.field7087;
                        var8.field6976 = var5;
                        var8.field6983 = class195.field2369;
                        var8.field6981 = var6;
                        class630.method3608(var8);
                    }
                    if (class195.field2369 != null && client.method1408(class289.field3757) != null) {
                        class125.method718(class195.field2369, class289.field3757, 127);
                    }
                } else if ((class157.field1913 == 1 || class210.method1209(110)) && class199.field2397 > 2) {
                    class351.method1952(false, class242.field3113 + class197.field2382, class98.field1220 + class592.field8608);
                } else if (class260.method1461((byte) -17)) {
                    class351.method1952(false, class242.field3113 + class197.field2382, class98.field1220 + class592.field8608);
                }
                class289.field3757 = null;
            }
        } else if (class395.field5221 > 1) {
            class289.field3757 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field1489 = arg0;
        this.field1490 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1488 = new class451(var2);
    }
}

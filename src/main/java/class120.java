import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class120 extends class43 {

    @OriginalMember(owner = "client!vr", name = "U", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "client!vr", name = "ib", descriptor = "Z")
    public boolean field1548 = false;

    @OriginalMember(owner = "client!vr", name = "gb", descriptor = "I")
    private int field1546 = 0;

    @OriginalMember(owner = "client!vr", name = "Y", descriptor = "I")
    private int field1538 = -1;

    @OriginalMember(owner = "client!vr", name = "rb", descriptor = "I")
    private int field1557 = 0;

    @OriginalMember(owner = "client!vr", name = "lb", descriptor = "I")
    private int field1551 = 0;

    @OriginalMember(owner = "client!vr", name = "tb", descriptor = "I")
    private int field1559 = 0;

    @OriginalMember(owner = "client!vr", name = "ob", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!vr", name = "X", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!vr", name = "S", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!vr", name = "db", descriptor = "Lwt;")
    private class282 field1543;

    @OriginalMember(owner = "client!vr", name = "R", descriptor = "I")
    public static int field1531 = -1;

    @OriginalMember(owner = "client!vr", name = "W", descriptor = "Ljk;")
    public static class585 field1536 = new class585(72, 1);

    @OriginalMember(owner = "client!vr", name = "vb", descriptor = "Z")
    public static boolean field1561 = false;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!vr", name = "Q", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!vr", name = "T", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!vr", name = "V", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vr", name = "Z", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!vr", name = "ab", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!vr", name = "bb", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vr", name = "cb", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!vr", name = "eb", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!vr", name = "fb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!vr", name = "hb", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vr", name = "jb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!vr", name = "kb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!vr", name = "mb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vr", name = "nb", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!vr", name = "qb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!vr", name = "sb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!vr", name = "pb", descriptor = "Lau;")
    private class684 field1555;

    @OriginalMember(owner = "client!vr", name = "ub", descriptor = "[S")
    public static short[] field1560;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILr;)Lda;", line = 5)
    private final class55 method833(int arg0, int arg1, int arg2, class165 arg3) {
        ++field1533;
        if (arg0 != -12) {
            this.method837(-87);
        }
        class596 var5 = class276.field3774.method136(arg2, false);
        class37 var6 = class399.field5631[super.field532];
        class37 var7 = ~super.field535 <= -4 ? null : class399.field5631[super.field535 + 1];
        return this.field1548 ? var5.method3453(-1, super.field530, -1, true, super.field531, var6, class195.field2367, arg1, arg3, false, 0, var7, super.field527) : var5.method3453(this.field1551, super.field530, this.field1538, true, super.field531, var6, class195.field2367, arg1, arg3, false, this.field1554, var7, super.field527);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lr;Z)V", line = 25)
    public final void method162(class165 arg0, boolean arg1) {
        if (arg1) {
            field1561 = true;
        }
        ++field1550;
        class55 var3 = this.method833(-12, 0, this.field1532, arg0);
        if (var3 != null) {
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            this.method836(var4, -5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(B)I", line = 50)
    public final int method172(byte arg0) {
        ++field1541;
        return arg0 != -117 ? 100 : this.field1557;
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)I", line = 62)
    public final int method173(int arg0) {
        if (arg0 != 32249) {
            this.field1543 = null;
        }
        ++field1530;
        return this.field1546;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lr;B)Llt;", line = 73)
    public final class626 method170(class165 arg0, byte arg1) {
        if (arg1 != -2) {
            method838(14, true);
        }
        ++field1527;
        class55 var3 = this.method833(-12, 2048 | (~this.field1559 != -1 ? 5 : 0), this.field1532, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field1559 != -1) {
                var3.method74(this.field1559 * 2048);
            }
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            this.method836(var4, -5, arg0, var3);
            if (!class547.field7943) {
                var3.method67(var4, (class605) null, 0);
            } else {
                var3.method122(var4, (class605) null, class676.field9693, 0);
            }
            if (this.field1555 != null) {
                class436 var5 = this.field1555.method3869();
                if (!class547.field7943) {
                    arg0.method228(var5);
                } else {
                    arg0.method223(var5, class676.field9693);
                }
            }
            this.field1534 = var3.method112();
            this.field1546 = var3.method65();
            this.field1557 = var3.method72();
            return null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 117)
    public static void method834(int arg0) {
        field1560 = null;
        field1536 = null;
        if (arg0 != 2) {
            field1531 = 53;
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)Z", line = 129)
    public final boolean method167(byte arg0) {
        ++field1535;
        if (arg0 != 118) {
            this.field1557 = -99;
        }
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lr;III)Z", line = 146)
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field1556;
        if (arg3 > -20) {
            this.finalize();
        }
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)I", line = 162)
    public static final int method835(int arg0, int arg1, int arg2, byte arg3) {
        ++field1553;
        if (arg3 <= 34) {
            field1536 = null;
        }
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg2 / arg1;
        int var7 = arg1 + -1 & arg2;
        int var8 = class88.method698(var4, (byte) 78, var6);
        int var9 = class88.method698(var4 - -1, (byte) 35, var6);
        int var10 = class88.method698(var4, (byte) 66, var6 + 1);
        int var11 = class88.method698(var4 + 1, (byte) 53, var6 + 1);
        int var12 = class54.method570(var5, var9, var8, arg1, (byte) 39);
        int var13 = class54.method570(var5, var11, var10, arg1, (byte) 39);
        return class54.method570(var7, var13, var12, arg1, (byte) 39);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 233)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1537 = arg2 - -arg1;
        this.field1532 = arg0;
        this.field1559 = arg12;
        class596 var14 = class276.field3774.method136(this.field1532, false);
        int var15 = var14.field8614;
        if (var15 == -1) {
            this.field1548 = true;
        } else {
            this.field1543 = class195.field2367.method3273(var15, 0);
            this.field1548 = false;
        }
        if (this.field1537 == arg2) {
            class563.method3294((byte) -112, this.field1543, this, this.field1551);
        }
    }

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)V", line = 196)
    public final void method163(int arg0) {
        ++field1558;
        int var2 = 17 % ((arg0 - 35) / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lq;ILr;Lda;)V", line = 207)
    private final void method836(class394 arg0, int arg1, class165 arg2, class55 arg3) {
        ++field1547;
        arg3.method104(arg0);
        class271[] var5 = arg3.method95();
        class604[] var6 = arg3.method85();
        if (arg1 != -5) {
            field1536 = null;
        }
        if ((this.field1555 == null || this.field1555.field9772) && (var5 != null || var6 != null)) {
            this.field1555 = class684.method3879(class543.field7882, true);
        }
        if (this.field1555 != null) {
            this.field1555.method3873(arg2, (long) class543.field7882, var5, var6, false);
            this.field1555.method3878(super.field532, super.field769, super.field770, super.field768, super.field765);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 259)
    public final void method837(int arg0) {
        if (this.field1555 != null) {
            this.field1555.method3877();
        }
        ++field1540;
        if (arg0 != -1) {
            this.method841(3, 116);
        }
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)Z", line = 272)
    public final boolean method165(byte arg0) {
        if (arg0 >= -21) {
            return true;
        } else {
            ++field1545;
            return this.field1534;
        }
    }

    @OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V", line = 283)
    protected final void finalize() {
        if (this.field1555 != null) {
            this.field1555.method3877();
        }
        ++field1542;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)Z", line = 294)
    public static final boolean method838(int arg0, boolean arg1) {
        if (arg1) {
            method835(-91, 116, -104, (byte) -23);
        }
        ++field1552;
        return ~arg0 == -4 || arg0 == 5 || ~arg0 == -7;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILkj;)V", line = 317)
    public static final void method839(int arg0, int arg1, int arg2, class524 arg3) {
        class433 var4 = class222.method1354(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6221 = arg3;
            int var5 = class340.field4500 == class155.field1899 ? 1 : 0;
            if (arg3.method175(0)) {
                if (arg3.method165((byte) -48)) {
                    class516.field7547[var5][class596.field8613[var5]++] = arg3;
                    return;
                }
                class549.field7969[var5][class196.field2370[var5]++] = arg3;
                return;
            }
            class67.field1036[var5][class571.field8344[var5]++] = arg3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z", line = 339)
    public final boolean method175(int arg0) {
        if (arg0 != 0) {
            this.field1537 = -80;
        }
        ++field1528;
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V", line = 350)
    public static final void method840(int arg0) {
        class415.method2493(false, (byte) -120);
        ++field1529;
        class54.field870 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class50.field830.length; ++var2) {
            if (class498.field6965[var2] != -1 && class50.field830[var2] == null) {
                class50.field830[var2] = class89.field1249.method3800(0, class498.field6965[var2], (byte) -92);
                if (class50.field830[var2] == null) {
                    var1 = false;
                    ++class54.field870;
                }
            }
            if (class445.field6318[var2] != -1 && class653.field9257[var2] == null) {
                class653.field9257[var2] = class89.field1249.method3787(class322.field4249[var2], -99, 0, class445.field6318[var2]);
                if (class653.field9257[var2] == null) {
                    ++class54.field870;
                    var1 = false;
                }
            }
            if (class176.field2177[var2] != -1 && class346.field4549[var2] == null) {
                class346.field4549[var2] = class89.field1249.method3800(0, class176.field2177[var2], (byte) -92);
                if (class346.field4549[var2] == null) {
                    var1 = false;
                    ++class54.field870;
                }
            }
            if (class478.field6703[var2] != -1 && class354.field4734[var2] == null) {
                class354.field4734[var2] = class89.field1249.method3800(0, class478.field6703[var2], (byte) -92);
                if (class354.field4734[var2] == null) {
                    ++class54.field870;
                    var1 = false;
                }
            }
            if (class5.field38 != null && class423.field6026[var2] == null && class5.field38[var2] != -1) {
                class423.field6026[var2] = class89.field1249.method3787(class322.field4249[var2], -96, 0, class5.field38[var2]);
                if (class423.field6026[var2] == null) {
                    ++class54.field870;
                    var1 = false;
                }
            }
        }
        if (class479.field6715 == null) {
            if (class578.field8439 != null && class634.field9107.method3807(0, class578.field8439.field1480 + "_staticelements")) {
                if (!class634.field9107.method3810(30416, class578.field8439.field1480 + "_staticelements")) {
                    ++class54.field870;
                    var1 = false;
                } else {
                    class479.field6715 = class457.method2715((byte) 101, class578.field8439.field1480 + "_staticelements", class646.field9195, class634.field9107);
                }
            } else {
                class479.field6715 = new class79(0);
            }
        }
        if (!var1) {
            class118.field1523 = 1;
        } else {
            class4.field23 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class50.field830.length < ~var4; ++var4) {
                byte[] var21 = class653.field9257[var4];
                if (var21 != null) {
                    int var22 = (class312.field4119[var4] >> 8) * 64 + -class36.field689;
                    int var23 = (255 & class312.field4119[var4]) * 64 - class88.field1239;
                    if (class53.field865 != 0) {
                        var23 = 10;
                        var22 = 10;
                    }
                    var3 &= class217.method1323(class205.field2465, arg0 + -62, var23, var21, var22, class473.field6604);
                }
                byte[] var24 = class354.field4734[var4];
                if (var24 != null) {
                    int var25 = (class312.field4119[var4] >> 8) * 64 - class36.field689;
                    int var26 = (class312.field4119[var4] & 255) * 64 + -class88.field1239;
                    if (class53.field865 != 0) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class217.method1323(class205.field2465, -80, var26, var24, var25, class473.field6604);
                }
            }
            if (!var3) {
                class118.field1523 = 2;
            } else {
                if (class118.field1523 != 0) {
                    class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6050.method2561(class370.field4980, arg0) + "<br>(100%)");
                }
                class317.method1849(-1);
                class354.method2000(arg0);
                boolean var5 = false;
                if (class68.field1045.method224() && class221.field2851.field4159) {
                    for (int var6 = 0; ~class50.field830.length < ~var6; ++var6) {
                        if (class354.field4734[var6] != null || class346.field4549[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class221.field2851.field4170) {
                    var7 = class521.field7649[class578.field8437];
                } else {
                    var7 = class193.field2355[class578.field8437];
                }
                if (class68.field1045.method318()) {
                    ++var7;
                }
                class403.method2430(class68.field1045, class386.field5142, 9, 4, class473.field6604, class205.field2465, var7, var5, ~class68.field1045.method232() < -1);
                if (class62.field1008) {
                    class612.method3507(class242.field3330);
                } else {
                    class612.method3507((class419) null);
                }
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class349.field4642[var8].method2138((byte) -84);
                }
                class666.method3768(2080614116);
                class422.method2548(false, false);
                class441.method2622((byte) 51);
                class588.field8514 = false;
                class418.field5919 = null;
                class317.method1849(-1);
                System.gc();
                class415.method2493(true, (byte) -121);
                class618.method3537((byte) 46);
                class127.field1622 = class221.field2851.method1844(class375.field5039, true);
                class156.field1903 = class221.field2851.field4159;
                class470.field6571 = ~class590.field8558 <= -97;
                class270.field3688 = class221.field2851.method1841(class375.field5039, 3);
                class580.field8460 = !class221.field2851.field4135;
                class301.field4045 = !class221.field2851.method1747(0, class375.field5039) ? class656.field9319 : -1;
                class96.field1306 = class12.method141(class375.field5039, (byte) 29) || class221.field2851.field4161;
                class405.field5730 = class221.field2851.field4142;
                class75.field1116 = new class302(4, class473.field6604, class205.field2465, false);
                if (class53.field865 == 0) {
                    class421.method2545((byte) -3, class50.field830, class75.field1116);
                } else {
                    class90.method705(class50.field830, (byte) 116, class75.field1116);
                }
                class674.method3836(class473.field6604 >> 4, class205.field2465 >> 4, (byte) 120);
                class197.method1209(699907780);
                if (var5) {
                    class410.method2473(true);
                    class312.field4118 = new class302(1, class473.field6604, class205.field2465, true);
                    if (class53.field865 != 0) {
                        class90.method705(class346.field4549, (byte) 94, class312.field4118);
                        class415.method2493(true, (byte) 60);
                    } else {
                        class421.method2545((byte) -3, class346.field4549, class312.field4118);
                        class415.method2493(true, (byte) -108);
                    }
                    class312.field4118.method2445((byte) -82, class75.field1116.field5728[0], 0);
                    class312.field4118.method2443((int[][][]) null, (byte) 63, class68.field1045, (class370[]) null);
                    class410.method2473(false);
                }
                class75.field1116.method2443(!var5 ? null : class312.field4118.field5728, (byte) 63, class68.field1045, class349.field4642);
                if (class53.field865 == 0) {
                    class415.method2493(true, (byte) 86);
                    class543.method3179(class75.field1116, class653.field9257, arg0 ^ 119);
                    if (class423.field6026 != null) {
                        class599.method3463((byte) -48);
                    }
                } else {
                    class415.method2493(true, (byte) -111);
                    class555.method3248(class653.field9257, -105182120, class75.field1116);
                }
                class354.method2000(arg0);
                if (class590.field8558 < 96) {
                    class180.method1120(arg0 ^ 128);
                }
                class415.method2493(true, (byte) -128);
                class75.field1116.method2447((class37) null, class68.field1045, !var5 ? null : class340.field4500[0], (byte) -66);
                class75.field1116.method1797(-121, class68.field1045, false);
                class415.method2493(true, (byte) -122);
                if (var5) {
                    class410.method2473(true);
                    class415.method2493(true, (byte) 56);
                    if (class53.field865 != 0) {
                        class555.method3248(class354.field4734, -105182120, class312.field4118);
                    } else {
                        class543.method3179(class312.field4118, class354.field4734, 108);
                    }
                    class354.method2000(0);
                    class415.method2493(true, (byte) 69);
                    class312.field4118.method2447(class399.field5631[0], class68.field1045, (class37) null, (byte) 119);
                    class312.field4118.method1797(-115, class68.field1045, true);
                    class415.method2493(true, (byte) 113);
                    class410.method2473(false);
                }
                class573.method3350((byte) -54);
                int var9 = class75.field1116.field4054;
                if (class617.field8853 < var9) {
                    var9 = class617.field8853;
                }
                if (~(class617.field8853 + -1) < ~var9) {
                    var9 = class617.field8853 + -1;
                }
                if (class221.field2851.method1747(0, class375.field5039)) {
                    class4.method21(0);
                } else {
                    class4.method21(var9);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var19 = 0; var19 < class473.field6604; ++var19) {
                        for (int var20 = 0; ~var20 > ~class205.field2465; ++var20) {
                            class506.method2936(var19, var20, var10, (byte) -102);
                        }
                    }
                }
                class699.method3917(arg0 + 106);
                class317.method1849(-1);
                class621.method3553((byte) -121);
                class354.method2000(0);
                class704.method3947((byte) 116);
                if (class646.field9189 != null && class489.field6835 != null && ~class114.field1485 == -12) {
                    ++class4.field16;
                    class543 var11 = class299.method1780(class84.field1196, class498.field6968, 106);
                    var11.field7872.method2233((byte) 92, 1057001181);
                    class511.method3028(7482, var11);
                }
                if (~class53.field865 == -1) {
                    int var12 = (-(class473.field6604 >> 4) + class532.field7778) / 8;
                    int var13 = ((class473.field6604 >> 4) + class532.field7778) / 8;
                    int var14 = (-(class205.field2465 >> 4) + class389.field5225) / 8;
                    int var15 = ((class205.field2465 >> 4) + class389.field5225) / 8;
                    for (int var16 = var12 + -1; var13 - -1 >= var16; ++var16) {
                        for (int var17 = var14 - 1; ~var17 >= ~(var15 + 1); ++var17) {
                            if (~var16 > ~var12 || var16 > var13 || ~var17 > ~var14 || ~var17 < ~var15) {
                                class89.field1249.method3799("m" + var16 + "_" + var17, (byte) 97);
                                class89.field1249.method3799("l" + var16 + "_" + var17, (byte) 110);
                            }
                        }
                    }
                }
                if (~class114.field1485 == -5) {
                    class245.method1487(3, -21316);
                } else if (~class114.field1485 == -9) {
                    class245.method1487(7, -21316);
                } else {
                    class245.method1487(10, -21316);
                    if (class489.field6835 != null) {
                        class543 var18 = class299.method1780(class84.field1196, class298.field4008, arg0 + 74);
                        class511.method3028(7482, var18);
                    }
                }
                class378.method2198(-1);
                class317.method1849(-1);
                class467.method2736(arg0 ^ -117);
                if (class649.field9205) {
                    class79.method660((byte) -112, "Took: " + (class301.method1787((byte) -119) + -class161.field1985) + "ms");
                    class649.field9205 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZLr;ILub;I)V", line = 836)
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        ++field1549;
        if (arg4 >= 113) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V", line = 848)
    public final void method841(int arg0, int arg1) {
        ++field1544;
        if (!this.field1548) {
            this.field1554 += arg1;
            if (arg0 != 0) {
                this.method169(-48, -65, true, (class165) null, -38, (class20) null, -120);
            }
            while (this.field1543.field3840[this.field1551] < this.field1554) {
                this.field1554 -= this.field1543.field3840[this.field1551];
                ++this.field1551;
                if (~this.field1551 <= ~this.field1543.field3827.length) {
                    this.field1548 = true;
                    break;
                }
            }
            if (!this.field1548) {
                class563.method3294((byte) 38, this.field1543, this, this.field1551);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(BLr;)Lsr;", line = 891)
    public final class229 method161(byte arg0, class165 arg1) {
        ++field1539;
        if (arg0 < 100) {
            this.field1548 = true;
        }
        return null;
    }
}

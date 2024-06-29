import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class154 extends class478 {

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
    private int field1698 = 4096;

    @OriginalMember(owner = "client!gfa", name = "G", descriptor = "I")
    private int field1701 = 2000;

    @OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
    private int field1705 = 16;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
    private int field1699 = 0;

    @OriginalMember(owner = "client!gfa", name = "O", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!gfa", name = "J", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!gfa", name = "L", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!gfa", name = "M", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!gfa", name = "N", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!gfa", name = "P", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1702;
        if (arg1 != -11323) {
            this.method34((byte) -24);
        }
        int[] var3 = super.field6886.method789(arg0, (byte) 127);
        if (super.field6886.field1592) {
            int var4 = this.field1698 >> 1;
            int[][] var5 = super.field6886.method791(1);
            Random var6 = new Random((long) this.field1697);
            for (int var7 = 0; var7 < this.field1701; ++var7) {
                int var8 = ~this.field1698 < -1 ? this.field1699 - -class304.method1756(var6, this.field1698, -1304107232) - var4 : this.field1699;
                int var9 = (var8 & 4087) >> 4;
                int var10 = class304.method1756(var6, class436.field6154, -1304107232);
                int var11 = class304.method1756(var6, class407.field5435, -1304107232);
                int var12 = (class609.field8517[var9] * this.field1705 >> 12) + var10;
                int var13 = (class215.field2608[var9] * this.field1705 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class304.method1756(var6, 4096, -1304107232) >> 2) + 1024;
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 + 1024;
                        int var30 = class204.field2414 & var28;
                        int var31 = class156.field1746 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(III)Z")
    public static final boolean method835(int arg0, int arg1, int arg2) {
        ++field1710;
        if (arg2 != 55) {
            field1709 = -62;
        }
        if (!class210.method1252(arg0, 0, arg1)) {
            return false;
        } else {
            return (36864 & arg0) != 0 | class329.method1850(arg1, true, arg0) | class595.method3345(true, arg1, arg0) ? true : (~(8192 & arg0) != -1 | class575.method3253(arg0, arg1, (byte) 118) | class404.method2268(-95, arg1, arg0)) & (arg1 & 55) == 0;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method836(boolean arg0, String arg1) {
        if (!arg0) {
            System.exit(1);
            ++field1707;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field1698 = arg1.method643((byte) -77);
                        }
                    } else {
                        this.field1699 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field1705 = arg1.method620((byte) 117);
                }
            } else {
                this.field1701 = arg1.method643((byte) -77);
            }
        } else {
            this.field1697 = arg1.method620((byte) 101);
        }
        if (arg0 != 255) {
            method835(-12, -19, -23);
        }
        ++field1696;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V")
    public static final void method837(int arg0, int arg1) {
        ++field1704;
        class76 var2 = class3.method28(6, (byte) 42, arg1);
        var2.method406(arg0 ^ 975509925);
        if (arg0 != -7163) {
            method835(-118, -1, 76);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(III)V")
    public static final void method838(int arg0, int arg1, int arg2) {
        if (arg2 == 3228) {
            ++field1706;
            if (!(class482.field6941 > class482.field6942)) {
                if (class482.field6942 > class482.field6941) {
                    class482.field6942 = (float) ((double) class482.field6942 - (double) class482.field6942 / 30.0D);
                    if (class482.field6941 > class482.field6942) {
                        class482.field6942 = class482.field6941;
                    }
                    class158.method858(arg2 + -3116);
                    class482.field6933 = (int) class482.field6942 >> 1;
                    class482.field6937 = class93.method472(class482.field6933, -25675);
                }
            } else {
                class482.field6942 = (float) ((double) class482.field6942 / 30.0D + (double) class482.field6942);
                if (class482.field6941 < class482.field6942) {
                    class482.field6942 = class482.field6941;
                }
                class158.method858(104);
                class482.field6933 = (int) class482.field6942 >> 1;
                class482.field6937 = class93.method472(class482.field6933, arg2 ^ -26839);
            }
            if (class634.field8930 != -1 && ~class453.field6485 != 0) {
                int var3 = -class81.field838 + class634.field8930;
                if (var3 < 2 || ~var3 < -3) {
                    var3 /= 8;
                }
                int var4 = -class36.field373 + class453.field6485;
                class81.field838 -= -var3;
                if (~var4 > -3 || var4 > 2) {
                    var4 /= 8;
                }
                class36.field373 += var4;
                if (~var3 == -1 && ~var4 == -1) {
                    class634.field8930 = -1;
                    class453.field6485 = -1;
                }
                class158.method858(120);
            }
            if (~class269.field3346 < -1) {
                --class348.field4660;
                if (~class348.field4660 == -1) {
                    --class269.field3346;
                    class348.field4660 = 100;
                }
            } else {
                class254.field3190 = -1;
                class599.field8437 = -1;
            }
            if (class345.field4646 && class258.field3240 != null) {
                for (class375 var5 = (class375) class258.field3240.method3434((byte) 2); var5 != null; var5 = (class375) class258.field3240.method3430(true)) {
                    class655 var6 = class482.field6927.method705(var5.field5104.field9562, arg2 + -3352);
                    if (var5.method2176(arg0, arg2 + -3227, arg1)) {
                        if (var6.field9201 != null) {
                            if (var6.field9201[4] != null) {
                                class53.method279(-1, 0, var6.field9219, (long) var5.field5104.field9562, arg2 ^ 3308, true, 1002, var6.field9201[4], false, -1, var6.field9193);
                            }
                            if (var6.field9201[3] != null) {
                                class53.method279(-1, 0, var6.field9219, (long) var5.field5104.field9562, arg2 + -3108, true, 1010, var6.field9201[3], false, -1, var6.field9193);
                            }
                            if (var6.field9201[2] != null) {
                                class53.method279(-1, 0, var6.field9219, (long) var5.field5104.field9562, arg2 + -3127, true, 1012, var6.field9201[2], false, -1, var6.field9193);
                            }
                            if (var6.field9201[1] != null) {
                                class53.method279(-1, 0, var6.field9219, (long) var5.field5104.field9562, 126, true, 1001, var6.field9201[1], false, -1, var6.field9193);
                            }
                            if (var6.field9201[0] != null) {
                                class53.method279(-1, 0, var6.field9219, (long) var5.field5104.field9562, 119, true, 1008, var6.field9201[0], false, -1, var6.field9193);
                            }
                        }
                        if (!var5.field5104.field9570) {
                            var5.field5104.field9570 = true;
                            class281.method1649(class547.field7808, var5.field5104.field9562, var6.field9193);
                        }
                        if (var5.field5104.field9570) {
                            class281.method1649(class6.field74, var5.field5104.field9562, var6.field9193);
                        }
                    } else if (var5.field5104.field9570) {
                        var5.field5104.field9570 = false;
                        class281.method1649(class90.field909, var5.field5104.field9562, var6.field9193);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
    public static final void method839(int arg0) {
        class198.field2349 = null;
        class470.field6746 = null;
        class282.field3535 = null;
        class356.field4786 = null;
        class631.field8881 = null;
        class678.field9535 = null;
        class309.field3824 = null;
        class485.field6988 = null;
        class232.field2863 = null;
        if (arg0 == 24822) {
            class130.field1465 = null;
            class50.field505 = null;
            class614.field8648 = null;
            class421.field5602 = null;
            class698.field9799 = null;
            class50.field508 = null;
            ++field1708;
            class166.field1870 = null;
            class286.field3578 = null;
            class526.field7420 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        class625.method3518(0);
        if (arg0 == 23) {
            ++field1700;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }
}

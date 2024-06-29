import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class214 extends class215 {

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field3434 = -1;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "Lwa;")
    public static class243 field3432;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field3437;
        if (arg1 != 255) {
            method1501(true);
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 115);
        if (super.field3445.field4163) {
            class72.method405(var3, 0, class244.field4015, this.field3436);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method1501(boolean arg0) {
        if (arg0) {
            field3432 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class214() {
        this(4096);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V")
    public class214(int arg0) {
        super(0, true);
        this.field3436 = 4096;
        this.field3436 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (~arg1 == -1) {
            this.field3436 = (arg2.method584(255) << 12) / 255;
        }
        ++field3438;
        if (arg0 != 1521146348) {
            this.method45(-90, -36, (class96) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public static final void method1502(int arg0) {
        ++field3433;
        if (class238.field3928 != null) {
            if (~class113.field1622 > -11) {
                if (!class245.field4021.method958(class238.field3928.field2323, (byte) -123)) {
                    class113.field1622 = class17.field204.method952(class238.field3928.field2323, (byte) -124) / 10;
                    return;
                }
                class42.method230(-7817);
                class113.field1622 = 10;
            }
            if (class113.field1622 == 10) {
                class42.field524 = class238.field3928.field2330 >> 6 << 6;
                class7.field88 = (class238.field3928.field2319 >> 6 << 6) + -class42.field524 + 64;
                class105.field1413 = class238.field3928.field2316 >> 6 << 6;
                class44.field562 = (class238.field3928.field2334 >> 6 << 6) + 64 + -class105.field1413;
                int[] var1 = class238.field3928.method1020((class286.field4571.field3820 >> 7) + class181.field2883, (byte) 63, class244.field4011, (class286.field4571.field3818 >> 7) + class167.field2683);
                int var2 = -1;
                int var3 = -1;
                if (var1 != null) {
                    var2 = var1[1] + -class105.field1413;
                    var3 = class7.field88 + -1 + class42.field524 + -var1[2];
                }
                if (~var2 <= -1 && class44.field562 > var2 && ~var3 <= -1 && ~var3 > ~class7.field88) {
                    int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
                    class224.field3606 = var4;
                    int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                    class220.field3524 = var5;
                } else if (class247.field4067 != -1 && ~class164.field2610 != 0) {
                    int[] var6 = class238.field3928.method1022(class164.field2610, class247.field4067, 0);
                    class164.field2610 = -1;
                    class247.field4067 = -1;
                    if (var6 != null) {
                        class224.field3606 = class7.field88 + -1 - (var6[2] + -class42.field524);
                        class220.field3524 = var6[1] + -class105.field1413;
                    }
                } else {
                    int[] var7 = class238.field3928.method1022(16383 & class238.field3928.field2321, class238.field3928.field2321 >> 14 & 16383, arg0 ^ 266236743);
                    class220.field3524 = var7[1] + -class105.field1413;
                    class224.field3606 = class7.field88 - -class42.field524 + -1 - var7[2];
                }
                if (class238.field3928.field2320 == 37) {
                    class250.field4084 = 3.0F;
                    class281.field4457 = 3.0F;
                } else if (~class238.field3928.field2320 == -51) {
                    class250.field4084 = 4.0F;
                    class281.field4457 = 4.0F;
                } else if (~class238.field3928.field2320 != -76) {
                    if (class238.field3928.field2320 == 100) {
                        class250.field4084 = 8.0F;
                        class281.field4457 = 8.0F;
                    } else if (class238.field3928.field2320 != 200) {
                        class250.field4084 = 8.0F;
                        class281.field4457 = 8.0F;
                    } else {
                        class250.field4084 = 16.0F;
                        class281.field4457 = 16.0F;
                    }
                } else {
                    class250.field4084 = 6.0F;
                    class281.field4457 = 6.0F;
                }
                class92.method511((byte) 102);
                int var8 = class7.field88 >> 6;
                class177.field2807 = new int[class42.field534 + 1];
                int var9 = class44.field562 >> 6;
                class55.field702 = new int[var9][var8][];
                class4.field65 = new byte[var9][var8][];
                class210.field3349 = new byte[var9][var8][];
                class269.field4312 = new byte[var9][var8][];
                int var10 = class101.field1344 >> 2 << 10;
                class198.field3139 = new byte[var9][var8][];
                class166.field2679 = new byte[var9][var8][];
                class155.field2424 = new int[var9][var8][];
                class41.field516 = new int[var9][var8][];
                int var11 = class271.field4338 >> 1;
                class265.method1788(var10, var11, (byte) 37);
                class113.field1622 = 20;
            } else if (class113.field1622 == 20) {
                class16.method81((byte) -114, new class96(class245.field4021.method945(class238.field3928.field2323, 0, "underlay")));
                class113.field1622 = 30;
                class66.method377(true, 0);
                class228.method1622((byte) -85);
            } else if (class113.field1622 == 30) {
                class162.method1130(new class96(class245.field4021.method945(class238.field3928.field2323, 0, "overlay")), true);
                class113.field1622 = 40;
                class228.method1622((byte) -75);
            } else if (class113.field1622 == 40) {
                class165.method1139(new class96(class245.field4021.method945(class238.field3928.field2323, 0, "overlay2")), (byte) 39);
                class113.field1622 = 50;
                class228.method1622((byte) -81);
            } else {
                if (arg0 != 266236743) {
                    field3432 = null;
                }
                if (~class113.field1622 == -51) {
                    class294.method1975(new class96(class245.field4021.method945(class238.field3928.field2323, 0, "loc")), arg0 ^ -266236748);
                    class113.field1622 = 60;
                    class66.method377(true, 0);
                    class228.method1622((byte) -107);
                } else if (~class113.field1622 == -61) {
                    if (class245.field4021.method944(0, class238.field3928.field2323 + "_labels")) {
                        if (!class245.field4021.method958(class238.field3928.field2323 + "_labels", (byte) -120)) {
                            return;
                        }
                        class209.field3336 = class288.method1940(class245.field4021, 0, class238.field3928.field2323 + "_labels");
                    } else {
                        class209.field3336 = new class40(0);
                    }
                    class113.field1622 = 70;
                    class228.method1622((byte) -93);
                } else if (~class113.field1622 == -71) {
                    class124.field1934 = new class38(11, true, class221.field3551);
                    class113.field1622 = 73;
                    class66.method377(true, 0);
                    class228.method1622((byte) -117);
                } else if (~class113.field1622 == -74) {
                    class24.field343 = new class38(12, true, class221.field3551);
                    class113.field1622 = 76;
                    class66.method377(true, 0);
                    class228.method1622((byte) -60);
                } else if (~class113.field1622 == -77) {
                    class247.field4072 = new class38(14, true, class221.field3551);
                    class113.field1622 = 79;
                    class66.method377(true, arg0 + -266236743);
                    class228.method1622((byte) -107);
                } else if (class113.field1622 == 79) {
                    class296.field4688 = new class38(17, true, class221.field3551);
                    class113.field1622 = 82;
                    class66.method377(true, arg0 + -266236743);
                    class228.method1622((byte) -106);
                } else if (~class113.field1622 == -83) {
                    class51.field672 = new class38(19, true, class221.field3551);
                    class113.field1622 = 85;
                    class66.method377(true, 0);
                    class228.method1622((byte) -123);
                } else if (class113.field1622 == 85) {
                    class209.field3332 = new class38(22, true, class221.field3551);
                    class113.field1622 = 88;
                    class66.method377(true, 0);
                    class228.method1622((byte) -109);
                } else if (~class113.field1622 == -89) {
                    class92.field1159 = new class38(26, true, class221.field3551);
                    class113.field1622 = 91;
                    class66.method377(true, arg0 + -266236743);
                    class228.method1622((byte) -110);
                } else {
                    class134.field2121 = new class38(30, true, class221.field3551);
                    class113.field1622 = 100;
                    class66.method377(true, 0);
                    class228.method1622((byte) -85);
                    System.gc();
                }
            }
        }
    }
}

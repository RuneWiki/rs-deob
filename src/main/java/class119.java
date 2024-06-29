import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class119 extends class107 {

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field2075 = 1;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    private int field2081 = 2;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    private int field2085 = 0;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    private int field2084 = 5;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "[S")
    private short[] field2088 = new short[512];

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    private int field2082 = 2048;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[B")
    private byte[] field2076 = new byte[512];

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    private int field2091 = 5;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Lpj;")
    public static class237 field2077 = class33.method353(")2", 92);

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "[Z")
    public static boolean[] field2083 = new boolean[112];

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "[[I")
    public static int[][] field2092 = new int[104][104];

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
    public static int[] field2089 = new int[500];

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2086;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = 2048 - -(class185.field3233[arg1] * this.field2091);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class106.field1862 < ~var7; ++var7) {
                class47.field1020 = Integer.MAX_VALUE;
                class61.field1225 = Integer.MAX_VALUE;
                class12.field208 = Integer.MAX_VALUE;
                class90.field1648 = Integer.MAX_VALUE;
                int var8 = class182.field3199[var7] * this.field2084 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field2076[(this.field2091 <= var11 ? -this.field2091 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field2076[255 & var13 + (~this.field2084 >= ~var14 ? -this.field2084 + var14 : var14)]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2088[var15];
                        int var17 = var4 - this.field2088[var27] - (var11 << 12);
                        int var18 = this.field2075;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class90.field1648) {
                            class47.field1020 = class61.field1225;
                            class61.field1225 = class12.field208;
                            class12.field208 = class90.field1648;
                            class90.field1648 = var19;
                        } else if (class12.field208 <= var19) {
                            if (~class61.field1225 < ~var19) {
                                class47.field1020 = class61.field1225;
                                class61.field1225 = var19;
                            } else if (class47.field1020 > var19) {
                                class47.field1020 = var19;
                            }
                        } else {
                            class47.field1020 = class61.field1225;
                            class61.field1225 = class12.field208;
                            class12.field208 = var19;
                        }
                    }
                }
                int var12 = this.field2081;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class12.field208 - class90.field1648;
                                }
                            } else {
                                var3[var7] = class47.field1020;
                            }
                        } else {
                            var3[var7] = class61.field1225;
                        }
                    } else {
                        var3[var7] = class12.field208;
                    }
                } else {
                    var3[var7] = class90.field1648;
                }
            }
        }
        if (arg0 != -17) {
            this.field2081 = -26;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 == -32513) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field2091 = arg0.method316((byte) 111);
                                    }
                                } else {
                                    this.field2084 = arg0.method316((byte) -124);
                                }
                            } else {
                                this.field2075 = arg0.method316((byte) -19);
                            }
                        } else {
                            this.field2081 = arg0.method316((byte) -81);
                        }
                    } else {
                        this.field2082 = arg0.method339(arg2 + -16744703);
                    }
                } else {
                    this.field2085 = arg0.method316((byte) -36);
                }
            } else {
                this.field2084 = this.field2091 = arg0.method316((byte) -105);
            }
            ++field2090;
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2092 = null;
        field2083 = null;
        field2089 = null;
        if (arg0 >= -57) {
            field2092 = null;
        }
        field2077 = null;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field2076 = class130.method915(arg0 ^ 28, this.field2085);
        this.method862(arg0 ^ arg0);
        ++field2078;
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
    private final void method862(int arg0) {
        ++field2079;
        Random var2 = new Random((long) this.field2085);
        this.field2088 = new short[512];
        if (this.field2082 > arg0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2088[var3] = (short) class211.method1413(this.field2082, -1, var2);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZZII)V")
    public static final void method863(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        ++class152.field2698;
        ++field2080;
        if (!arg3) {
            class177.method1227((byte) 31, true);
            class147.method999(true, (byte) -88);
            class177.method1227((byte) 31, false);
        }
        class147.method999(false, (byte) -88);
        if (!arg3) {
            class212.method1419(-13313);
        }
        class53.method470((byte) -62);
        if (~class163.field2899 == -2) {
            int var6 = class257.field4417 - -class232.field4024 & 2047;
            int var7 = class12.field210;
            if (class162.field2890 / 256 > var7) {
                var7 = class162.field2890 / 256;
            }
            if (class185.field3241[4] && var7 < class139.field2400[4] + 128) {
                var7 = class139.field2400[4] + 128;
            }
            class144.method992((byte) -17, arg0, var7, var6, class31.field616, -50 + class23.method216(-15, class229.field3911.field3700, class229.field3911.field3710, class274.field4798), 600 - -(var7 * 3), class164.field2921);
        }
        int var8 = class20.field380;
        int var9 = class167.field2957;
        int var10 = class214.field3654;
        int var11 = class112.field1957;
        int var12 = class189.field3289;
        for (int var13 = 0; ~var13 > -6; ++var13) {
            if (class185.field3241[var13]) {
                int var19 = (int) (Math.random() * (double) (class24.field434[var13] * 2 - -1) - (double) class24.field434[var13] + Math.sin((double) class275.field4819[var13] / 100.0D * (double) class269.field4594[var13]) * (double) class139.field2400[var13]);
                if (~var13 == -1) {
                    class20.field380 += var19;
                }
                if (var13 == 2) {
                    class167.field2957 += var19;
                }
                if (var13 == 1) {
                    class112.field1957 += var19;
                }
                if (var13 == 3) {
                    class189.field3289 = class189.field3289 + var19 & 2047;
                }
                if (~var13 == -5) {
                    class214.field3654 += var19;
                    if (~class214.field3654 > -129) {
                        class214.field3654 = 128;
                    }
                    if (~class214.field3654 < -384) {
                        class214.field3654 = 383;
                    }
                }
            }
        }
        class258.method1739(-124);
        class192.method1309(arg4, arg5, arg1 + arg4, arg0 + arg5);
        class150.method1012();
        if (!class247.field4306 && ~class169.field2968 <= ~arg4 && ~class169.field2968 > ~(arg1 + arg4) && ~arg5 >= ~class126.field2201 && arg0 + arg5 > class126.field2201) {
            class82.field1550 = 0;
            class58.field1197 = true;
            int var14 = class240.field4226;
            int var15 = class207.field3538;
            class152.field2701 = (-arg4 + class169.field2968) * (-var15 + var14) / arg1 + var15;
            int var16 = class25.field460;
            int var17 = class222.field3814;
            class44.field966 = (-arg5 + class126.field2201) * (-var16 + var17) / arg0 + var16;
        } else {
            class58.field1197 = false;
            class82.field1550 = 0;
        }
        class96.method718((byte) -52);
        byte var18 = class186.method1273(true) != 2 ? 1 : (byte) class152.field2698;
        class192.method1301(arg4, arg5, arg1, arg0, 0);
        class32.method315(class20.field380, class112.field1957, class167.field2957, class214.field3654, class189.field3289, class186.field3257, class185.field3243, class61.field1223, class37.field837, class33.field720, class174.field3056, class274.field4798 + 1, var18, class229.field3911.field3710 >> 7, class229.field3911.field3700 >> 7);
        class96.method718((byte) -52);
        class123.method881();
        class59.method510(arg0, arg5, arg4, -98, 256, 256, arg1);
        class239.method1660(arg4, 256, arg5, arg1, 256, arg0, arg2);
        ((class7) class150.field2674).method76(12, class59.field1204);
        class158.method1124(arg0, arg4, arg5, arg1, true);
        class189.field3289 = var12;
        class112.field1957 = var11;
        class214.field3654 = var10;
        class20.field380 = var8;
        class167.field2957 = var9;
        if (class121.field2145 && class202.field3475.method383(19553) == 0) {
            class121.field2145 = false;
        }
        if (class121.field2145) {
            class192.method1301(arg4, arg5, arg1, arg0, 0);
            class118.method856(class45.field983, false, -12010);
        }
        if (!arg3 && !class121.field2145 && !class247.field4306 && arg4 <= class169.field2968 && ~(arg1 + arg4) < ~class169.field2968 && class126.field2201 >= arg5 && arg0 + arg5 > class126.field2201) {
            class32.method318(class126.field2201, arg0, arg1, arg4, arg5, class169.field2968, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)J")
    public static final long method864(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 != null && var3.field763 != null ? var3.field763.field2000 : 0L;
    }
}

import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class319 extends class220 {

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    private int field4552 = 0;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "I")
    private int field4555 = 1;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[B")
    private byte[] field4553 = new byte[512];

    @OriginalMember(owner = "client!fn", name = "Y", descriptor = "I")
    private int field4560 = 5;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "[S")
    private short[] field4551 = new short[512];

    @OriginalMember(owner = "client!fn", name = "ab", descriptor = "I")
    private int field4562 = 2;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "I")
    private int field4556 = 2048;

    @OriginalMember(owner = "client!fn", name = "cb", descriptor = "I")
    private int field4564 = 5;

    @OriginalMember(owner = "client!fn", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field4566 = " more options";

    @OriginalMember(owner = "client!fn", name = "gb", descriptor = "Lwe;")
    public static class24 field4568 = new class24(64);

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!fn", name = "bb", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!fn", name = "db", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!fn", name = "fb", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!fn", name = "hb", descriptor = "Los;")
    public static class378 field4569;

    @OriginalMember(owner = "client!fn", name = "Z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4561;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method1979(int arg0, String arg1) {
        ++field4554;
        if (class248.field3458 == null) {
            class316.method1970(500);
        }
        String[] var2 = class369.method2436((byte) 100, arg1, '\n');
        if (arg0 > -40) {
            field4561 = null;
        }
        for (int var3 = 0; var2.length > var3; ++var3) {
            for (int var4 = class452.field6588; ~var4 < -1; --var4) {
                class248.field3458[var4] = class248.field3458[var4 + -1];
            }
            class248.field3458[0] = var2[var3];
            if (~class452.field6588 > ~(class248.field3458.length + -1)) {
                if (class208.field2988 > 0) {
                    ++class208.field2988;
                }
                ++class452.field6588;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V", line = 50)
    public static final void method1980(int arg0) {
        ++field4557;
        class52.field762.method204((byte) 56);
        class220.field3136.method204((byte) 56);
        if (arg0 != -15845) {
            field4566 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V", line = 63)
    public static void method1981(int arg0) {
        field4569 = null;
        if (arg0 >= -106) {
            method1980(45);
        }
        field4561 = null;
        field4568 = null;
        field4566 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 188)
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lhb;Lqj;Lqj;Lqj;I)Z", line = 79)
    public static final boolean method1982(class345 arg0, class238 arg1, class238 arg2, class238 arg3, int arg4) {
        class413.field6182 = arg0;
        ++field4563;
        if (arg4 >= -19) {
            return false;
        } else {
            class40.field640 = arg3;
            class71.field969 = arg2;
            class247.field3445 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLil;)V", line = 96)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field4560 = arg2.method1697(arg1 ^ -90);
                                }
                            } else {
                                this.field4564 = arg2.method1697(104);
                            }
                        } else {
                            this.field4555 = arg2.method1697(64);
                        }
                    } else {
                        this.field4562 = arg2.method1697(99);
                    }
                } else {
                    this.field4556 = arg2.method1685(8104);
                }
            } else {
                this.field4552 = arg2.method1697(arg1 ^ 104);
            }
        } else {
            this.field4564 = this.field4560 = arg2.method1697(-48);
        }
        if (arg1 != -49) {
            field4569 = null;
        }
        ++field4567;
    }

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "(B)V", line = 202)
    private final void method1983(byte arg0) {
        ++field4559;
        Random var2 = new Random((long) this.field4552);
        if (arg0 <= -102) {
            this.field4551 = new short[512];
            if (~this.field4556 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field4551[var3] = (short) class205.method1296(2044605728, var2, this.field4556);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 232)
    public final void method440(int arg0) {
        ++field4565;
        this.field4553 = class7.method58(false, this.field4552);
        this.method1983((byte) -115);
        if (arg0 != 0) {
            this.field4564 = 121;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)Lbr;", line = 249)
    public static final class349 method1984(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        return var3 == null ? null : var3.field120;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)[I", line = 257)
    public final int[] method43(int arg0, int arg1) {
        ++field4558;
        int[] var3 = super.field3125.method2005(arg1, (byte) -122);
        if (arg0 != -11543) {
            this.method2(-11, (byte) -78, (class265) null);
        }
        if (super.field3125.field4676) {
            int var4 = class58.field831[arg1] * this.field4560 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class344.field5043 < ~var7; ++var7) {
                class133.field1784 = Integer.MAX_VALUE;
                class175.field2297 = Integer.MAX_VALUE;
                class323.field4641 = Integer.MAX_VALUE;
                class171.field2254 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class160.field2096[var7] * this.field4564);
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field4553[255 & (~this.field4560 < ~var11 ? var11 : -this.field4560 + var11)] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field4553[255 & (this.field4564 <= var14 ? -this.field4564 + var14 : var14) + var13]);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field4551[var15] - (var14 << 12);
                        int var17 = -(var11 << 12) - (this.field4551[var27] - var4);
                        int var18 = this.field4555;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class171.field2254 < ~var19) {
                            class133.field1784 = class175.field2297;
                            class175.field2297 = class323.field4641;
                            class323.field4641 = class171.field2254;
                            class171.field2254 = var19;
                        } else if (class323.field4641 > var19) {
                            class133.field1784 = class175.field2297;
                            class175.field2297 = class323.field4641;
                            class323.field4641 = var19;
                        } else if (class175.field2297 <= var19) {
                            if (~var19 > ~class133.field1784) {
                                class133.field1784 = var19;
                            }
                        } else {
                            class133.field1784 = class175.field2297;
                            class175.field2297 = var19;
                        }
                    }
                }
                int var12 = this.field4562;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class323.field4641 - class171.field2254;
                                }
                            } else {
                                var3[var7] = class133.field1784;
                            }
                        } else {
                            var3[var7] = class175.field2297;
                        }
                    } else {
                        var3[var7] = class323.field4641;
                    }
                } else {
                    var3[var7] = class171.field2254;
                }
            }
        }
        return var3;
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class60 extends class148 {

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "[B")
    private byte[] field890 = new byte[512];

    @OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
    private int field897 = 5;

    @OriginalMember(owner = "client!tt", name = "S", descriptor = "I")
    private int field898 = 0;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    private int field896 = 5;

    @OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
    private int field903 = 1;

    @OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
    private int field901 = 2;

    @OriginalMember(owner = "client!tt", name = "U", descriptor = "[S")
    private short[] field900 = new short[512];

    @OriginalMember(owner = "client!tt", name = "Y", descriptor = "I")
    private int field904 = 2048;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "Lso;")
    public static class327 field891 = new class327(11, 2);

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!tt", name = "T", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!tt", name = "W", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.field890 = class297.method1882(-103, this.field898);
        ++field893;
        if (arg0 != -1285532468) {
            this.field890 = null;
        }
        this.method358((byte) 73);
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
    public static void method357(int arg0) {
        int var1 = -71 / ((-2 - arg0) / 47);
        field891 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field896 = arg1.method1428(32122);
                                }
                            } else {
                                this.field897 = arg1.method1428(32122);
                            }
                        } else {
                            this.field903 = arg1.method1428(32122);
                        }
                    } else {
                        this.field901 = arg1.method1428(32122);
                    }
                } else {
                    this.field904 = arg1.method1450((byte) 87);
                }
            } else {
                this.field898 = arg1.method1428(32122);
            }
        } else {
            this.field897 = this.field896 = arg1.method1428(32122);
        }
        int var5 = -62 % ((arg2 - -88) / 33);
        ++field892;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
    private final void method358(byte arg0) {
        ++field895;
        Random var2 = new Random((long) this.field898);
        this.field900 = new short[512];
        if (arg0 > 44) {
            if (this.field904 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field900[var3] = (short) class317.method1984(87, var2, this.field904);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field899;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 >= -65) {
            return null;
        } else {
            if (super.field2193.field1312) {
                int var4 = class456.field6752[arg1] * this.field896 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~var7 > ~class320.field4579; ++var7) {
                    class75.field1116 = Integer.MAX_VALUE;
                    class260.field3825 = Integer.MAX_VALUE;
                    class514.field7514 = Integer.MAX_VALUE;
                    class43.field676 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class517.field7539[var7] * this.field897);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = this.field890[255 & (var11 >= this.field896 ? -this.field896 + var11 : var11)] & 255;
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = 2 * (255 & this.field890[(~var14 <= ~this.field897 ? -this.field897 + var14 : var14) + var13 & 255]);
                            int var27 = var15 + 1;
                            int var16 = -this.field900[var15] + -(var14 << 12) + var8;
                            int var17 = -(var11 << 12) + -this.field900[var27] + var4;
                            int var18 = this.field903;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (~var18 != -6) {
                                            if (var18 == 2) {
                                                var19 = (var16 >= 0 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 > -1 ? -var16 : var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = var25 <= var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (class43.field676 <= var19) {
                                if (~class514.field7514 < ~var19) {
                                    class75.field1116 = class260.field3825;
                                    class260.field3825 = class514.field7514;
                                    class514.field7514 = var19;
                                } else if (var19 < class260.field3825) {
                                    class75.field1116 = class260.field3825;
                                    class260.field3825 = var19;
                                } else if (~var19 > ~class75.field1116) {
                                    class75.field1116 = var19;
                                }
                            } else {
                                class75.field1116 = class260.field3825;
                                class260.field3825 = class514.field7514;
                                class514.field7514 = class43.field676;
                                class43.field676 = var19;
                            }
                        }
                    }
                    int var12 = this.field901;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class43.field676 + class514.field7514;
                                    }
                                } else {
                                    var3[var7] = class75.field1116;
                                }
                            } else {
                                var3[var7] = class260.field3825;
                            }
                        } else {
                            var3[var7] = class514.field7514;
                        }
                    } else {
                        var3[var7] = class43.field676;
                    }
                }
            }
            return var3;
        }
    }
}

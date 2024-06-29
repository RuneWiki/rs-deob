import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class306 extends class371 {

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    private int field4455 = 1;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "[B")
    private byte[] field4459 = new byte[512];

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    private int field4457 = 2;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "[S")
    private short[] field4456 = new short[512];

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    private int field4458 = 5;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
    private int field4463 = 2048;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    private int field4461 = 5;

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
    private int field4465 = 0;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "[I")
    public static int[] field4462 = new int[50];

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "Lnj;")
    public static class487 field4464 = new class487("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!gq", name = "X", descriptor = "[I")
    public static int[] field4466;

    @OriginalMember(owner = "client!gq", name = "Y", descriptor = "Z")
    public static boolean field4467;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    public static int field4460;

    static {
        new class487("Select", "Auswählen", "Sélectionner", "Selecionar");
        field4466 = new int[5];
        field4467 = false;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V", line = 3)
    public static void method1881(byte arg0) {
        if (arg0 >= 46) {
            field4462 = null;
            field4464 = null;
            field4466 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 17)
    public final void method212(int arg0) {
        this.field4459 = class138.method843(this.field4465, (byte) 126);
        ++field4451;
        if (arg0 != -19103) {
            this.field4463 = 39;
        }
        this.method1882(-49);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 87)
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V", line = 37)
    private final void method1882(int arg0) {
        ++field4454;
        int var2 = 11 % ((42 - arg0) / 54);
        Random var3 = new Random((long) this.field4465);
        this.field4456 = new short[512];
        if (~this.field4463 < -1) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field4456[var4] = (short) class296.method1832(false, this.field4463, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBLps;)V", line = 90)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -57 % ((arg1 - -15) / 39);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field4461 = arg2.method2561((byte) -50);
                                }
                            } else {
                                this.field4458 = arg2.method2561((byte) 123);
                            }
                        } else {
                            this.field4455 = arg2.method2561((byte) 108);
                        }
                    } else {
                        this.field4457 = arg2.method2561((byte) 126);
                    }
                } else {
                    this.field4463 = arg2.method2620(25);
                }
            } else {
                this.field4465 = arg2.method2561((byte) 121);
            }
        } else {
            this.field4458 = this.field4461 = arg2.method2561((byte) -29);
        }
        ++field4460;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(BI)[I", line = 175)
    public final int[] method79(byte arg0, int arg1) {
        ++field4452;
        int[] var3 = super.field5378.method1451(57, arg1);
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1] * this.field4461 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class41.field455; ++var7) {
                class642.field9320 = Integer.MAX_VALUE;
                class593.field8762 = Integer.MAX_VALUE;
                class182.field2789 = Integer.MAX_VALUE;
                class358.field5196 = Integer.MAX_VALUE;
                int var8 = class287.field4215[var7] * this.field4458 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field4459[(var11 >= this.field4461 ? -this.field4461 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field4459[var13 + (this.field4458 <= var14 ? -this.field4458 + var14 : var14) & 255] & 255) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field4456[var15]);
                        int var17 = -(var11 << 12) - (this.field4456[var27] - var4);
                        int var18 = this.field4455;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class358.field5196 <= var19) {
                            if (var19 < class182.field2789) {
                                class642.field9320 = class593.field8762;
                                class593.field8762 = class182.field2789;
                                class182.field2789 = var19;
                            } else if (class593.field8762 > var19) {
                                class642.field9320 = class593.field8762;
                                class593.field8762 = var19;
                            } else if (~class642.field9320 < ~var19) {
                                class642.field9320 = var19;
                            }
                        } else {
                            class642.field9320 = class593.field8762;
                            class593.field8762 = class182.field2789;
                            class182.field2789 = class358.field5196;
                            class358.field5196 = var19;
                        }
                    }
                }
                int var12 = this.field4457;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class358.field5196 + class182.field2789;
                                }
                            } else {
                                var3[var7] = class642.field9320;
                            }
                        } else {
                            var3[var7] = class593.field8762;
                        }
                    } else {
                        var3[var7] = class182.field2789;
                    }
                } else {
                    var3[var7] = class358.field5196;
                }
            }
        }
        if (arg0 > -80) {
            this.method79((byte) 116, 35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V", line = 392)
    public static final void method1883(byte arg0) {
        if (class379.field5558.method1002()) {
            class379.field5558.method1000(class110.field1401);
            class574.method3368(true);
            class379.field5558.method968(class110.field1401);
            class379.field5558.method964(class110.field1401);
        } else {
            class447.method2712(10, class239.field3499);
        }
        ++field4453;
        if (arg0 >= -70) {
            field4467 = true;
        }
        class539.method3164(-108);
    }
}

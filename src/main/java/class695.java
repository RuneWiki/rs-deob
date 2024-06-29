import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class695 extends class56 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    private int field9471 = 5;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[S")
    private short[] field9469 = new short[512];

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    private int field9474 = 0;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    private int field9472 = 2;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[B")
    private byte[] field9473 = new byte[512];

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private int field9476 = 2048;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    private int field9478 = 5;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    private int field9475 = 1;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field9480 = -1;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)[Lnga;", line = 6)
    public static final class540[] method3873(byte arg0) {
        ++field9482;
        if (arg0 != -67) {
            field9480 = 8;
        }
        if (class174.field2115 == null) {
            class540[] var1 = class458.method2772(4095, class521.field7389);
            class540[] var2 = new class540[var1.length];
            int var3 = 0;
            int var4 = class118.field1503.field10639.method1290(0);
            label73: for (int var5 = 0; var1.length > var5; ++var5) {
                class540 var9 = var1[var5];
                if ((~var9.field7596 >= -1 || var9.field7596 >= 24) && var9.field7593 >= 800 && ~var9.field7597 <= -601 && (~var4 != -3 || ~var9.field7593 >= -801 && ~var9.field7597 >= -601) && (~var4 != -2 || ~var9.field7593 >= -1025 && var9.field7597 <= 768)) {
                    for (int var10 = 0; ~var3 < ~var10; ++var10) {
                        class540 var11 = var2[var10];
                        if (~var9.field7593 == ~var11.field7593 && var9.field7597 == var11.field7597) {
                            if (var11.field7596 < var9.field7596) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class174.field2115 = new class540[var3];
            class211.method1335(var2, 0, class174.field2115, 0, var3);
            int[] var6 = new int[class174.field2115.length];
            for (int var7 = 0; class174.field2115.length > var7; ++var7) {
                class540 var8 = class174.field2115[var7];
                var6[var7] = var8.field7597 * var8.field7593;
            }
            class497.method2938(var6, arg0 + 67, class174.field2115);
        }
        return class174.field2115;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 93)
    public final void method493(byte arg0) {
        ++field9470;
        this.field9473 = class33.method306(11276, this.field9474);
        int var2 = -7 / ((37 - arg0) / 62);
        this.method3875((byte) 74);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[F)[F", line = 104)
    public static final float[] method3874(int arg0, int arg1, float[] arg2) {
        ++field9477;
        float[] var3 = new float[arg1];
        class211.method1329(arg2, 0, var3, arg0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 235)
    public class695() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILes;)V", line = 128)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field9468;
        if (arg0 <= -44) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field9471 = arg2.method2396((byte) 109);
                                    }
                                } else {
                                    this.field9478 = arg2.method2396((byte) -104);
                                }
                            } else {
                                this.field9475 = arg2.method2396((byte) 89);
                            }
                        } else {
                            this.field9472 = arg2.method2396((byte) 30);
                        }
                    } else {
                        this.field9476 = arg2.method2390((byte) -101);
                    }
                } else {
                    this.field9474 = arg2.method2396((byte) -101);
                }
            } else {
                this.field9478 = this.field9471 = arg2.method2396((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 210)
    private final void method3875(byte arg0) {
        ++field9479;
        int var2 = -35 / ((-21 - arg0) / 50);
        Random var3 = new Random((long) this.field9474);
        this.field9469 = new short[512];
        if (this.field9476 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field9469[var4] = (short) class93.method822(var3, -1, this.field9476);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 243)
    public final int[] method145(int arg0, int arg1) {
        ++field9481;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = 2048 - -(class349.field4354[arg1] * this.field9471);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class642.field8759; ++var7) {
                class276.field3238 = Integer.MAX_VALUE;
                class264.field3132 = Integer.MAX_VALUE;
                class623.field8554 = Integer.MAX_VALUE;
                class783.field10812 = Integer.MAX_VALUE;
                int var8 = class648.field8837[var7] * this.field9478 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field9473[(~this.field9471 >= ~var11 ? var11 - this.field9471 : var11) & 255];
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field9473[(var14 < this.field9478 ? var14 : -this.field9478 + var14) + var13 & 255]);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field9469[var15] - (var14 << 12);
                        int var17 = var4 - this.field9469[var27] - (var11 << 12);
                        int var18 = this.field9475;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class783.field10812 <= var19) {
                            if (~class623.field8554 >= ~var19) {
                                if (~class264.field3132 >= ~var19) {
                                    if (~var19 > ~class276.field3238) {
                                        class276.field3238 = var19;
                                    }
                                } else {
                                    class276.field3238 = class264.field3132;
                                    class264.field3132 = var19;
                                }
                            } else {
                                class276.field3238 = class264.field3132;
                                class264.field3132 = class623.field8554;
                                class623.field8554 = var19;
                            }
                        } else {
                            class276.field3238 = class264.field3132;
                            class264.field3132 = class623.field8554;
                            class623.field8554 = class783.field10812;
                            class783.field10812 = var19;
                        }
                    }
                }
                int var12 = this.field9472;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class783.field10812 + class623.field8554;
                                }
                            } else {
                                var3[var7] = class276.field3238;
                            }
                        } else {
                            var3[var7] = class264.field3132;
                        }
                    } else {
                        var3[var7] = class623.field8554;
                    }
                } else {
                    var3[var7] = class783.field10812;
                }
            }
        }
        if (arg0 != 0) {
            method3874(-128, 65, (float[]) null);
        }
        return var3;
    }
}

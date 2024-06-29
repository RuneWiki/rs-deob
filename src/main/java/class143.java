import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class143 extends class98 {

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    private int field1752 = 2048;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    private int field1757 = 2;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    private int field1758 = 0;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    private int field1760 = 1;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "[S")
    private short[] field1764 = new short[512];

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[B")
    private byte[] field1765 = new byte[512];

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    private int field1766 = 5;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field1763 = 5;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1754 = "";

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field1756 = -1;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "[[[B")
    public static byte[][][] field1767;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field1761;
        if (arg2 != 0) {
            method874(-91);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1766 = arg1.method1574(arg2 ^ -61);
                                }
                            } else {
                                this.field1763 = arg1.method1574(-98);
                            }
                        } else {
                            this.field1760 = arg1.method1574(arg2 + -69);
                        }
                    } else {
                        this.field1757 = arg1.method1574(-34);
                    }
                } else {
                    this.field1752 = arg1.method1617((byte) 48);
                }
            } else {
                this.field1758 = arg1.method1574(-114);
            }
        } else {
            this.field1763 = this.field1766 = arg1.method1574(-35);
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    private final void method873(int arg0) {
        ++field1751;
        Random var2 = new Random((long) this.field1758);
        this.field1764 = new short[512];
        if (~this.field1752 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1764[var3] = (short) class211.method1428(var2, this.field1752, -100);
            }
        }
        if (arg0 != 17915) {
            method874(-15);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        ++field1762;
        if (arg0 == 1) {
            this.field1765 = class164.method1123(this.field1758, -94);
            this.method873(17915);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static final void method874(int arg0) {
        ++field1755;
        class237 var1 = class334.field4723;
        synchronized (class334.field4723) {
            if (arg0 != -26868) {
                field1756 = -34;
            }
            class334.field4723.method1618(0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
    public static void method875(int arg0) {
        if (arg0 != 5) {
            method875(-87);
        }
        field1767 = null;
        field1754 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field1759;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            this.field1760 = -96;
        }
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1] * this.field1766 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class268.field3811; ++var7) {
                class35.field402 = Integer.MAX_VALUE;
                class362.field5173 = Integer.MAX_VALUE;
                class26.field324 = Integer.MAX_VALUE;
                class261.field3737 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class189.field2722[var7] * this.field1763);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field1765[255 & (~var11 <= ~this.field1766 ? var11 - this.field1766 : var11)] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = (this.field1765[255 & var13 - -(this.field1763 > var14 ? var14 : -this.field1763 + var14)] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field1764[var15] - ((var14 << 12) - var8);
                        int var17 = -this.field1764[var27] + var4 + -(var11 << 12);
                        int var18 = this.field1760;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var26 < var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class261.field3737) {
                            class35.field402 = class362.field5173;
                            class362.field5173 = class26.field324;
                            class26.field324 = class261.field3737;
                            class261.field3737 = var19;
                        } else if (class26.field324 > var19) {
                            class35.field402 = class362.field5173;
                            class362.field5173 = class26.field324;
                            class26.field324 = var19;
                        } else if (~var19 > ~class362.field5173) {
                            class35.field402 = class362.field5173;
                            class362.field5173 = var19;
                        } else if (class35.field402 > var19) {
                            class35.field402 = var19;
                        }
                    }
                }
                int var12 = this.field1757;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class261.field3737 + class26.field324;
                                }
                            } else {
                                var3[var7] = class35.field402;
                            }
                        } else {
                            var3[var7] = class362.field5173;
                        }
                    } else {
                        var3[var7] = class26.field324;
                    }
                } else {
                    var3[var7] = class261.field3737;
                }
            }
        }
        return var3;
    }
}

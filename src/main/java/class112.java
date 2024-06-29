import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class112 extends class747 {

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field1497 = 5;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private int field1496 = 2;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field1501 = 0;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field1506 = 1;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field1500 = 2048;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field1505 = 5;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "[S")
    private short[] field1507 = new short[512];

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[B")
    private byte[] field1495 = new byte[512];

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
    public static int[] field1504 = new int[1000];

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 271)
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 11)
    private final void method723(int arg0) {
        ++field1498;
        if (arg0 == -1) {
            Random var2 = new Random((long) this.field1501);
            this.field1507 = new short[512];
            if (this.field1500 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field1507[var3] = (short) class434.method2677(this.field1500, var2, (byte) -126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 38)
    public final void method184(int arg0) {
        this.field1495 = class417.method2593(-20709, this.field1501);
        if (arg0 != -2) {
            method724((byte) 49);
        }
        ++field1499;
        this.method723(-1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I", line = 62)
    public final int[] method182(int arg0, int arg1) {
        ++field1503;
        if (arg1 >= -89) {
            return null;
        } else {
            int[] var3 = super.field10279.method3479(true, arg0);
            if (super.field10279.field8263) {
                int var4 = class515.field7103[arg0] * this.field1497 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class73.field1095 > var7; ++var7) {
                    class226.field3033 = Integer.MAX_VALUE;
                    class553.field7718 = Integer.MAX_VALUE;
                    class724.field10049 = Integer.MAX_VALUE;
                    class714.field9962 = Integer.MAX_VALUE;
                    int var8 = class639.field8571[var7] * this.field1505 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = this.field1495[(~this.field1497 < ~var11 ? var11 : -this.field1497 + var11) & 255] & 255;
                        for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                            int var15 = (this.field1495[(var14 >= this.field1505 ? -this.field1505 + var14 : var14) + var13 & 255] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = var8 - this.field1507[var15] - (var14 << 12);
                            int var17 = -this.field1507[var27] - (var11 << 12) + var4;
                            int var18 = this.field1506;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 >= 0 ? var16 : -var16;
                                    int var26 = var17 < 0 ? -var17 : var17;
                                    var19 = var26 >= var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class714.field9962 >= ~var19) {
                                if (class724.field10049 <= var19) {
                                    if (class553.field7718 <= var19) {
                                        if (var19 < class226.field3033) {
                                            class226.field3033 = var19;
                                        }
                                    } else {
                                        class226.field3033 = class553.field7718;
                                        class553.field7718 = var19;
                                    }
                                } else {
                                    class226.field3033 = class553.field7718;
                                    class553.field7718 = class724.field10049;
                                    class724.field10049 = var19;
                                }
                            } else {
                                class226.field3033 = class553.field7718;
                                class553.field7718 = class724.field10049;
                                class724.field10049 = class714.field9962;
                                class714.field9962 = var19;
                            }
                        }
                    }
                    int var12 = this.field1496;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class714.field9962 + class724.field10049;
                                    }
                                } else {
                                    var3[var7] = class226.field3033;
                                }
                            } else {
                                var3[var7] = class553.field7718;
                            }
                        } else {
                            var3[var7] = class724.field10049;
                        }
                    } else {
                        var3[var7] = class714.field9962;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldc;II)V", line = 274)
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field1502;
        if (arg1 == 11608) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 == -7) {
                                        this.field1497 = arg0.method505((byte) -119);
                                    }
                                } else {
                                    this.field1505 = arg0.method505((byte) -119);
                                }
                            } else {
                                this.field1506 = arg0.method505((byte) -119);
                            }
                        } else {
                            this.field1496 = arg0.method505((byte) -119);
                        }
                    } else {
                        this.field1500 = arg0.method482(-772591672);
                    }
                } else {
                    this.field1501 = arg0.method505((byte) -119);
                }
            } else {
                this.field1505 = this.field1497 = arg0.method505((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 366)
    public static void method724(byte arg0) {
        field1504 = null;
        if (arg0 != -107) {
            field1504 = null;
        }
    }
}

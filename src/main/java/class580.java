import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class580 extends class56 {

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    private int field8181 = 5;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    private int field8180 = 2048;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    private int field8183 = 1;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "[B")
    private byte[] field8190 = new byte[512];

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    private int field8182 = 5;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
    private int field8193 = 0;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
    private int field8189 = 2;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "[S")
    private short[] field8196 = new short[512];

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "[I")
    public static int[] field8184 = new int[1];

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "[I")
    public static int[] field8194 = new int[3];

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "Lfp;")
    public static class323 field8187;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
    private final void method3302(int arg0) {
        ++field8186;
        Random var2 = new Random((long) this.field8193);
        this.field8196 = new short[512];
        if (~this.field8180 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field8196[var3] = (short) class111.method790(this.field8180, var2, (byte) -119);
            }
        }
        if (arg0 != -24617) {
            field8184 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(III)I")
    public static final int method3303(int arg0, int arg1, int arg2) {
        ++field8195;
        if (arg0 != -2070226657) {
            return -10;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg1 + -var3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        ++field8192;
        if (arg0 == 7) {
            this.field8190 = class271.method1771((byte) 69, this.field8193);
            this.method3302(arg0 ^ -24624);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method3304(boolean arg0) {
        if (!arg0) {
            method3303(-25, 57, 69);
        }
        field8194 = null;
        field8184 = null;
        field8187 = null;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class580() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field8191;
        if (arg0 == 3731) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field8182 = arg1.method3750((byte) 35);
                                    }
                                } else {
                                    this.field8181 = arg1.method3750((byte) 35);
                                }
                            } else {
                                this.field8183 = arg1.method3750((byte) 35);
                            }
                        } else {
                            this.field8189 = arg1.method3750((byte) 35);
                        }
                    } else {
                        this.field8180 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field8193 = arg1.method3750((byte) 35);
                }
            } else {
                this.field8181 = this.field8182 = arg1.method3750((byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field8188;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                int var4 = class720.field10000[arg0] * this.field8182 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class328.field4576 > var7; ++var7) {
                    class415.field5854 = Integer.MAX_VALUE;
                    class120.field1446 = Integer.MAX_VALUE;
                    class578.field8166 = Integer.MAX_VALUE;
                    class267.field3813 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class132.field1945[var7] * this.field8181);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = 255 & this.field8190[255 & (var11 < this.field8182 ? var11 : var11 - this.field8182)];
                        for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                            int var15 = 2 * (this.field8190[255 & var13 + (~var14 > ~this.field8181 ? var14 : -this.field8181 + var14)] & 255);
                            int var10001 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var8 + var10001 + -this.field8196[var15];
                            int var17 = -(var11 << 12) + -this.field8196[var27] + var4;
                            int var18 = this.field8183;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var17 <= -1 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 >= 0 ? var17 : -var17;
                                    int var26 = ~var16 <= -1 ? var16 : -var16;
                                    var19 = var25 < var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class267.field3813 > var19) {
                                class415.field5854 = class120.field1446;
                                class120.field1446 = class578.field8166;
                                class578.field8166 = class267.field3813;
                                class267.field3813 = var19;
                            } else if (class578.field8166 <= var19) {
                                if (var19 < class120.field1446) {
                                    class415.field5854 = class120.field1446;
                                    class120.field1446 = var19;
                                } else if (~class415.field5854 < ~var19) {
                                    class415.field5854 = var19;
                                }
                            } else {
                                class415.field5854 = class120.field1446;
                                class120.field1446 = class578.field8166;
                                class578.field8166 = var19;
                            }
                        }
                    }
                    int var12 = this.field8189;
                    if (var12 != 0) {
                        if (~var12 != -2) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class267.field3813 + class578.field8166;
                                    }
                                } else {
                                    var3[var7] = class415.field5854;
                                }
                            } else {
                                var3[var7] = class120.field1446;
                            }
                        } else {
                            var3[var7] = class578.field8166;
                        }
                    } else {
                        var3[var7] = class267.field3813;
                    }
                }
            }
            return var3;
        }
    }
}

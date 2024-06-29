import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class299 extends class175 {

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "[B")
    private byte[] field4219 = new byte[512];

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    private int field4224 = 5;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    private int field4226 = 1;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "[S")
    private short[] field4228 = new short[512];

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    private int field4221 = 2048;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    private int field4222 = 5;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    private int field4223 = 0;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    private int field4229 = 2;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "Lmw;")
    public static class517 field4217 = new class517(4, -1);

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "D")
    public static double field4225;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILdt;Z)V", line = 3)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field4227;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field4222 = arg1.method1731((byte) 64);
                                }
                            } else {
                                this.field4224 = arg1.method1731((byte) 64);
                            }
                        } else {
                            this.field4226 = arg1.method1731((byte) 64);
                        }
                    } else {
                        this.field4229 = arg1.method1731((byte) 64);
                    }
                } else {
                    this.field4221 = arg1.method1728((byte) 68);
                }
            } else {
                this.field4223 = arg1.method1731((byte) 64);
            }
        } else {
            this.field4224 = this.field4222 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            method1943((class172) null, (class172) null, (int[]) null, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V", line = 84)
    private final void method1941(byte arg0) {
        ++field4218;
        Random var2 = new Random((long) this.field4223);
        if (arg0 != 13) {
            this.method1941((byte) 74);
        }
        this.field4228 = new short[512];
        if (~this.field4221 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4228[var3] = (short) class594.method3335(this.field4221, false, var2);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 111)
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 119)
    public final void method46(int arg0) {
        if (arg0 != -8) {
            this.method47(false, 103);
        }
        this.field4219 = class703.method3907(this.field4223, (byte) 76);
        ++field4230;
        this.method1941((byte) 13);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)V", line = 138)
    public static void method1942(byte arg0) {
        if (arg0 != 124) {
            field4225 = -0.9843655365759476D;
        }
        field4217 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[I", line = 155)
    public final int[] method47(boolean arg0, int arg1) {
        ++field4215;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int var4 = 2048 - -(class456.field6536[arg1] * this.field4222);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class598.field8136; ++var7) {
                class751.field10144 = Integer.MAX_VALUE;
                class583.field7926 = Integer.MAX_VALUE;
                class18.field186 = Integer.MAX_VALUE;
                class711.field9710 = Integer.MAX_VALUE;
                int var8 = class693.field9221[var7] * this.field4224 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field4219[255 & (~this.field4222 < ~var11 ? var11 : var11 - this.field4222)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field4219[255 & var13 + (~var14 > ~this.field4224 ? var14 : -this.field4224 + var14)] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field4228[var15] + -(var14 << 12) + var8;
                        int var17 = -(var11 << 12) + var4 + -this.field4228[var27];
                        int var18 = this.field4226;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class711.field9710) {
                            if (var19 >= class18.field186) {
                                if (class583.field7926 <= var19) {
                                    if (class751.field10144 > var19) {
                                        class751.field10144 = var19;
                                    }
                                } else {
                                    class751.field10144 = class583.field7926;
                                    class583.field7926 = var19;
                                }
                            } else {
                                class751.field10144 = class583.field7926;
                                class583.field7926 = class18.field186;
                                class18.field186 = var19;
                            }
                        } else {
                            class751.field10144 = class583.field7926;
                            class583.field7926 = class18.field186;
                            class18.field186 = class711.field9710;
                            class711.field9710 = var19;
                        }
                    }
                }
                int var12 = this.field4229;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class711.field9710 + class18.field186;
                                }
                            } else {
                                var3[var7] = class751.field10144;
                            }
                        } else {
                            var3[var7] = class583.field7926;
                        }
                    } else {
                        var3[var7] = class18.field186;
                    }
                } else {
                    var3[var7] = class711.field9710;
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Luq;Luq;[IB)V", line = 383)
    public static final void method1943(class172 arg0, class172 arg1, int[] arg2, byte arg3) {
        if (arg3 <= 0) {
            class574.field7828 = arg1;
            class220.field2857 = arg0;
            if (arg2 != null) {
                class436.field6312 = arg2;
            }
            ++field4216;
        }
    }
}

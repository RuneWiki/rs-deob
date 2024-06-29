import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class205 extends class124 {

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    private int field3629 = 2;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    private int field3630 = 1;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    private int field3636 = 5;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    private int field3634 = 2048;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "[S")
    private short[] field3638 = new short[512];

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    private int field3641 = 5;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    private int field3632 = 0;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "[B")
    private byte[] field3639 = new byte[512];

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field3635 = 0;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "[[[S")
    public static short[][][] field3633;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 < 68) {
            field3642 = 72;
        }
        ++field3644;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1] * this.field3641 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; class64.field1132 > var7; ++var7) {
                class226.field4069 = Integer.MAX_VALUE;
                class217.field3816 = Integer.MAX_VALUE;
                class213.field3773 = Integer.MAX_VALUE;
                class194.field3492 = Integer.MAX_VALUE;
                int var8 = class257.field4559[var7] * this.field3636 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field3639[255 & (this.field3641 > var11 ? var11 : -this.field3641 + var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field3639[255 & (~this.field3636 >= ~var14 ? var14 - this.field3636 : var14) + var13]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3638[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field3638[var27] + var4;
                        int var18 = this.field3630;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 < ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class194.field3492) {
                            if (~class213.field3773 >= ~var19) {
                                if (~var19 <= ~class217.field3816) {
                                    if (~var19 > ~class226.field4069) {
                                        class226.field4069 = var19;
                                    }
                                } else {
                                    class226.field4069 = class217.field3816;
                                    class217.field3816 = var19;
                                }
                            } else {
                                class226.field4069 = class217.field3816;
                                class217.field3816 = class213.field3773;
                                class213.field3773 = var19;
                            }
                        } else {
                            class226.field4069 = class217.field3816;
                            class217.field3816 = class213.field3773;
                            class213.field3773 = class194.field3492;
                            class194.field3492 = var19;
                        }
                    }
                }
                int var12 = this.field3629;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class194.field3492 + class213.field3773;
                                }
                            } else {
                                var3[var7] = class226.field4069;
                            }
                        } else {
                            var3[var7] = class217.field3816;
                        }
                    } else {
                        var3[var7] = class213.field3773;
                    }
                } else {
                    var3[var7] = class194.field3492;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field3637;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3641 = arg1.method1580(-99);
                                }
                            } else {
                                this.field3636 = arg1.method1580(-73);
                            }
                        } else {
                            this.field3630 = arg1.method1580(-28);
                        }
                    } else {
                        this.field3629 = arg1.method1580(-14);
                    }
                } else {
                    this.field3634 = arg1.method1593(true);
                }
            } else {
                this.field3632 = arg1.method1580(-19);
            }
        } else {
            this.field3636 = this.field3641 = arg1.method1580(-118);
        }
        if (!arg2) {
            this.method451(-65);
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V")
    private final void method1416(int arg0) {
        ++field3645;
        Random var2 = new Random((long) this.field3632);
        this.field3638 = new short[512];
        if (~this.field3634 < arg0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3638[var3] = (short) class172.method1156(var2, Integer.MIN_VALUE, this.field3634);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        this.field3639 = class35.method247(this.field3632, arg0 + 17);
        this.method1416(arg0);
        ++field3643;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1417(boolean arg0) {
        if (arg0) {
            field3633 = null;
        }
    }
}

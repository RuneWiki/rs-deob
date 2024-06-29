import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class83 extends class82 {

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "[S")
    private short[] field1005 = new short[512];

    @OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
    private int field1007 = 5;

    @OriginalMember(owner = "client!eda", name = "Q", descriptor = "I")
    private int field1009 = 2;

    @OriginalMember(owner = "client!eda", name = "R", descriptor = "I")
    private int field1010 = 2048;

    @OriginalMember(owner = "client!eda", name = "T", descriptor = "[B")
    private byte[] field1012 = new byte[512];

    @OriginalMember(owner = "client!eda", name = "Z", descriptor = "I")
    private int field1018 = 5;

    @OriginalMember(owner = "client!eda", name = "V", descriptor = "I")
    private int field1014 = 0;

    @OriginalMember(owner = "client!eda", name = "X", descriptor = "I")
    private int field1016 = 1;

    @OriginalMember(owner = "client!eda", name = "S", descriptor = "Lcea;")
    public static class180 field1011 = new class180("K", "T", "K", "K");

    @OriginalMember(owner = "client!eda", name = "ab", descriptor = "Lcea;")
    public static class180 field1019 = new class180("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!eda", name = "U", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!eda", name = "W", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!eda", name = "Y", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "(I)V")
    public static void method493(int arg0) {
        if (arg0 < 65) {
            field1011 = null;
        }
        field1011 = null;
        field1019 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    private final void method494(byte arg0) {
        if (arg0 >= -96) {
            field1008 = 86;
        }
        ++field1015;
        Random var2 = new Random((long) this.field1014);
        this.field1005 = new short[512];
        if (this.field1010 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field1005[var3] = (short) class242.method1375(this.field1010, false, var2);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 != -2) {
            this.method198(122, -122, (class374) null);
        }
        this.field1012 = class553.method3237(this.field1014, (byte) -56);
        ++field1013;
        this.method494((byte) -102);
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field1004;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = 2048 - -(class85.field1036[arg0] * this.field1007);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class629.field9033 > var7; ++var7) {
                class387.field5107 = Integer.MAX_VALUE;
                class313.field3998 = Integer.MAX_VALUE;
                class491.field6863 = Integer.MAX_VALUE;
                class289.field3760 = Integer.MAX_VALUE;
                int var8 = class366.field4817[var7] * this.field1018 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field1012[255 & (~this.field1007 < ~var11 ? var11 : -this.field1007 + var11)] & 255;
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field1012[(var14 < this.field1018 ? var14 : -this.field1018 + var14) + var13 & 255]);
                        int var27 = var15 + 1;
                        int var16 = -this.field1005[var15] - ((var14 << 12) - var8);
                        int var17 = -this.field1005[var27] - (var11 << 12) + var4;
                        int var18 = this.field1016;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class289.field3760) {
                            if (var19 < class491.field6863) {
                                class387.field5107 = class313.field3998;
                                class313.field3998 = class491.field6863;
                                class491.field6863 = var19;
                            } else if (~class313.field3998 < ~var19) {
                                class387.field5107 = class313.field3998;
                                class313.field3998 = var19;
                            } else if (~class387.field5107 < ~var19) {
                                class387.field5107 = var19;
                            }
                        } else {
                            class387.field5107 = class313.field3998;
                            class313.field3998 = class491.field6863;
                            class491.field6863 = class289.field3760;
                            class289.field3760 = var19;
                        }
                    }
                }
                int var12 = this.field1009;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class491.field6863 - class289.field3760;
                                }
                            } else {
                                var3[var7] = class387.field5107;
                            }
                        } else {
                            var3[var7] = class313.field3998;
                        }
                    } else {
                        var3[var7] = class491.field6863;
                    }
                } else {
                    var3[var7] = class289.field3760;
                }
            }
        }
        return arg1 != 12218 ? null : var3;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
    public class83() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = 94 % ((arg1 - -69) / 42);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1007 = arg2.method2129(-82);
                                }
                            } else {
                                this.field1018 = arg2.method2129(-90);
                            }
                        } else {
                            this.field1016 = arg2.method2129(-73);
                        }
                    } else {
                        this.field1009 = arg2.method2129(-117);
                    }
                } else {
                    this.field1010 = arg2.method2136(false);
                }
            } else {
                this.field1014 = arg2.method2129(-94);
            }
        } else {
            this.field1018 = this.field1007 = arg2.method2129(-63);
        }
        ++field1006;
    }
}

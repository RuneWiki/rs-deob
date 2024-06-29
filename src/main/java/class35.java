import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class35 extends class23 {

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field601 = 4;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "Z")
    private boolean field610 = true;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    private int field607 = 1638;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field595 = 4;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "[B")
    private byte[] field613 = new byte[512];

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    private int field596 = 4;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Z")
    public static boolean field615 = false;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Li;")
    private static class88 field604 = class208.method1425(105, "Use");

    @OriginalMember(owner = "client!da", name = "db", descriptor = "Li;")
    public static class88 field608 = field604;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "J")
    public static long field602 = 0L;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "Li;")
    private static class88 field611 = class208.method1425(105, "wave2:");

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "Li;")
    public static class88 field618 = field611;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Li;")
    public static class88 field612 = field611;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "Lwi;")
    public static class248 field619 = new class248();

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "[Lrc;")
    public static class188[] field597;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "[S")
    private short[] field603;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "[S")
    private short[] field609;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 == -3) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field596 = arg0.method347(arg1 + 26122);
                                    }
                                } else {
                                    this.field601 = arg0.method347(26119);
                                }
                            } else {
                                this.field600 = arg0.method347(26119);
                            }
                        } else {
                            this.field601 = this.field596 = arg0.method347(26119);
                        }
                    } else {
                        this.field607 = arg0.method334((byte) -73);
                        if (~this.field607 > -1) {
                            this.field609 = new short[this.field595];
                            for (int var5 = 0; this.field595 > var5; ++var5) {
                                this.field609[var5] = (short) arg0.method334((byte) -73);
                            }
                        }
                    }
                } else {
                    this.field595 = arg0.method347(26119);
                }
            } else {
                this.field610 = ~arg0.method347(arg1 + 26122) == -2;
            }
            ++field605;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)I")
    private final int method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field606;
        int var8 = arg0 - 4096;
        int var9 = arg2 >> 12;
        int var10 = arg2 & 4095;
        int var11 = var10 - 4096;
        int var12 = class92.field1721[var10];
        int var13 = var9 - arg1;
        int var14 = var9 & 255;
        if (~var13 <= ~arg5) {
            var13 = 0;
        }
        int var15 = var13 & 255;
        int var16 = 3 & this.field613[arg3 + var14];
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 != -3 ? -arg0 + -var10 : -arg0 + var10;
        } else {
            var17 = ~var16 != -1 ? -var10 + arg0 : arg0 + var10;
        }
        int var18 = 3 & this.field613[arg3 + var15];
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? var11 - -arg0 : -var11 + arg0;
        } else {
            var19 = var18 == 2 ? var11 - arg0 : -arg0 + -var11;
        }
        int var20 = this.field613[var14 - -arg4] & 3;
        int var21 = ((var19 - var17) * var12 >> 12) + var17;
        int var22;
        if (~var20 >= -2) {
            var22 = var20 != 0 ? -var10 + var8 : var8 + var10;
        } else {
            var22 = ~var20 != -3 ? -var10 - var8 : var10 - var8;
        }
        int var23 = 3 & this.field613[arg4 + var15];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? -var8 + var11 : -var11 - var8;
        } else {
            var24 = var23 != 0 ? -var11 + var8 : var8 + var11;
        }
        int var25 = ((-var22 + var24) * var12 >> 12) + var22;
        return ((var25 - var21) * arg6 >> 12) + var21;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILnc;JZ)V")
    public static final void method232(int arg0, int arg1, int arg2, int arg3, class145 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class166 var8 = new class166();
            var8.field3196 = arg4;
            var8.field3199 = arg1 * 128 + 64;
            var8.field3192 = arg2 * 128 + 64;
            var8.field3195 = arg3;
            var8.field3204 = arg5;
            if (class29.field489[arg0][arg1][arg2] == null) {
                class29.field489[arg0][arg1][arg2] = new class52(arg0, arg1, arg2);
            }
            class29.field489[arg0][arg1][arg2].field949 = var8;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IB)V")
    public static final void method233(int arg0, byte arg1) {
        ++field617;
        if (arg0 != -1) {
            if (class167.field3213[arg0]) {
                class85.field1545.method957(arg0, (byte) -23);
                if (class78.field1418[arg0] != null) {
                    int var2 = 34 % ((arg1 - 1) / 49);
                    boolean var3 = true;
                    for (int var4 = 0; ~var4 > ~class78.field1418[arg0].length; ++var4) {
                        if (class78.field1418[arg0][var4] != null) {
                            if (class78.field1418[arg0][var4].field3392 == 2) {
                                var3 = false;
                            } else {
                                class78.field1418[arg0][var4] = null;
                            }
                        }
                    }
                    if (var3) {
                        class78.field1418[arg0] = null;
                    }
                    class167.field3213[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ[I)V")
    private final void method234(int arg0, boolean arg1, int[] arg2) {
        ++field598;
        int var4 = class111.field2023[arg0] * this.field596;
        if (!arg1) {
            method235((byte) -77);
        }
        if (~this.field595 == -2) {
            int var5 = this.field603[0] << 12;
            int var6 = var4 * var5 >> 12;
            int var7 = this.field601 * var5 >> 12;
            short var8 = this.field609[0];
            int var9 = this.field596 * var5 >> 12;
            int var10 = var6 >> 12;
            int var11 = var6 & 4095;
            int var12 = class92.field1721[var11];
            int var13 = var10 + 1;
            if (~var9 >= ~var13) {
                var13 = 0;
            }
            int var14 = 255 & this.field613[255 & var10];
            int var15 = this.field613[255 & var13] & 255;
            if (!this.field610) {
                for (int var16 = 0; var16 < class70.field1276; ++var16) {
                    int var17 = class22.field351[var16] * this.field601;
                    int var18 = this.method231(var11, -1, var5 * var17 >> 12, var14, var15, var7, var12);
                    arg2[var16] = var8 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class70.field1276 > var19; ++var19) {
                    int var20 = class22.field351[var19] * this.field601;
                    int var21 = this.method231(var11, -1, var5 * var20 >> 12, var14, var15, var7, var12);
                    int var22 = var8 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field609[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field603[0] << 12;
                int var25 = this.field596 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = var26 >> 12;
                int var28 = 255 & this.field613[var27 & 255];
                int var29 = this.field601 * var24 >> 12;
                int var30 = var27 - -1;
                if (var30 >= var25) {
                    var30 = 0;
                }
                int var31 = var26 & 4095;
                int var32 = this.field613[var30 & 255] & 255;
                int var33 = class92.field1721[var31];
                for (int var34 = 0; ~var34 > ~class70.field1276; ++var34) {
                    int var54 = class22.field351[var34] * this.field601;
                    int var55 = this.method231(var31, -1, var24 * var54 >> 12, var28, var32, var29, var33);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field595; ++var35) {
                short var36 = this.field609[var35];
                if (~var36 < -9 || ~var36 > 7) {
                    int var37 = this.field603[var35] << 12;
                    int var38 = this.field601 * var37 >> 12;
                    int var39 = this.field596 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    int var43 = 255 & this.field613[var41 & 255];
                    int var44 = var40 & 4095;
                    if (var39 <= var42) {
                        var42 = 0;
                    }
                    int var45 = this.field613[255 & var42] & 255;
                    int var46 = class92.field1721[var44];
                    if (this.field610 && ~(this.field595 + -1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class70.field1276; ++var47) {
                            int var48 = class22.field351[var47] * this.field601;
                            int var49 = this.method231(var44, -1, var37 * var48 >> 12, var43, var45, var38, var46);
                            int var50 = arg2[var47] - -(var36 * var49 >> 12);
                            arg2[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; var51 < class70.field1276; ++var51) {
                            int var52 = class22.field351[var51] * this.field601;
                            int var53 = this.method231(var44, -1, var37 * var52 >> 12, var43, var45, var38, var46);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        ++field620;
        if (arg0 != -69) {
            field602 = 108L;
        }
        this.field613 = class159.method1074(this.field600, arg0 + 443);
        this.method237((byte) -97);
        for (int var2 = this.field595 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field609[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field595;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field599;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 < 19) {
            method232(104, -92, 58, 104, (class145) null, 104L, false);
        }
        if (super.field379.field3100) {
            this.method234(arg0, true, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)Lcf;")
    public static final class29 method235(byte arg0) {
        ++field616;
        if (arg0 != 117) {
            return null;
        } else {
            try {
                return (class29) Class.forName("ji").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static void method236(byte arg0) {
        field597 = null;
        field612 = null;
        int var1 = 58 / ((arg0 - -2) / 40);
        field619 = null;
        field618 = null;
        field608 = null;
        field611 = null;
        field604 = null;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    private final void method237(byte arg0) {
        if (this.field607 <= 0) {
            if (this.field609 != null && ~this.field609.length == ~this.field595) {
                this.field603 = new short[this.field595];
                for (int var2 = 0; ~this.field595 < ~var2; ++var2) {
                    this.field603[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field609 = new short[this.field595];
            this.field603 = new short[this.field595];
            for (int var3 = 0; ~var3 > ~this.field595; ++var3) {
                this.field609[var3] = (short) ((int) (Math.pow((double) ((float) this.field607 / 4096.0F), (double) var3) * 4096.0D));
                this.field603[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= -84) {
            ++field614;
        }
    }
}

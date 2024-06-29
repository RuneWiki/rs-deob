import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class365 extends class188 {

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "Z")
    private boolean field5317 = false;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "Z")
    private boolean field5319;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "[Lfn;")
    private class149[] field5322;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field5314 = -1;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field5313 = 0;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!afa", name = "t", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!afa", name = "u", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "Lub;")
    public static class22 field5320;

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lai;)V", line = 3)
    public class365(class626 arg0) {
        super(arg0);
        if (arg0.field8668) {
            this.field5319 = arg0.field8711 < 3;
            int var2 = !this.field5319 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field5322 = new class149[3];
            this.field5322[0] = super.field2510.method869((byte) 106, false, 64, var4);
            this.field5322[1] = super.field2510.method869((byte) 94, false, 64, var5);
            this.field5322[2] = super.field2510.method869((byte) 102, false, 64, var3);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V", line = 113)
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (this.field5317) {
            super.field2510.method3470((byte) 123, 1);
            super.field2510.method3520(true, this.field5322[arg0 + -1]);
            super.field2510.method3470((byte) -123, 0);
        }
        ++field5315;
        if (!arg2) {
            field5313 = 53;
        }
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V", line = 133)
    public static void method2288(int arg0) {
        int var1 = -44 / ((-73 - arg0) / 53);
        field5320 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Leja;", line = 143)
    public static final class764 method2289(int arg0, int arg1) {
        if (arg1 != -4847) {
            field5320 = null;
        }
        ++field5316;
        return ~arg0 <= -1 && ~arg0 > -101 ? class384.field5621[arg0] : null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V", line = 158)
    public final void method962(int arg0, boolean arg1) {
        super.field2510.method3513(class521.field7150, class364.field5299, 70);
        if (arg0 != 22789) {
            field5313 = -120;
        }
        ++field5324;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IBLbm;)V", line = 169)
    public final void method959(int arg0, byte arg1, class123 arg2) {
        ++field5321;
        super.field2510.method3520(true, arg2);
        super.field2510.method3503((byte) -99, arg0);
        int var4 = 109 / ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZI)V", line = 182)
    public final void method961(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.method959(66, (byte) -12, (class123) null);
        }
        if (this.field5322 != null && arg0) {
            super.field2510.method3470((byte) -18, 1);
            super.field2510.method870(58, class335.field4869);
            class754 var3 = super.field2510.method3506((byte) -111);
            var3.method972(1024);
            super.field2510.method3471(40, class592.field7968);
            if (this.field5319) {
                super.field2510.method3513(class521.field7150, class187.field2499, -63);
                super.field2510.method907(true, false, (byte) -67, 0, class122.field1782);
                super.field2510.method3509(0, class461.field6387, arg1 + -122);
            } else {
                super.field2510.method3513(class364.field5299, class521.field7150, -58);
                super.field2510.method3514((byte) 97, class386.field5627, 0);
                super.field2510.method3470((byte) 123, 2);
                super.field2510.method3513(class521.field7150, class187.field2499, -64);
                super.field2510.method3514((byte) 103, class386.field5627, 0);
                super.field2510.method907(true, false, (byte) -67, 1, class386.field5627);
                super.field2510.method3509(0, class461.field6387, arg1 + -113);
                super.field2510.method3520(true, super.field2510.field8683);
            }
            super.field2510.method3470((byte) 123, 0);
            this.field5317 = true;
        } else {
            super.field2510.method3509(0, class461.field6387, arg1 ^ -99);
        }
        ++field5318;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)Z", line = 225)
    public final boolean method956(int arg0) {
        if (arg0 <= 53) {
            this.method958(82, 12, false);
        }
        ++field5323;
        return true;
    }

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "(B)V", line = 244)
    public final void method955(byte arg0) {
        ++field5325;
        if (!this.field5317) {
            super.field2510.method3509(0, class122.field1782, -84);
        } else {
            super.field2510.method3470((byte) 126, 1);
            super.field2510.method3520(true, (class123) null);
            super.field2510.method870(114, class381.field5564);
            super.field2510.method3504((byte) -57);
            if (this.field5319) {
                super.field2510.method3513(class364.field5299, class364.field5299, 74);
                super.field2510.method3514((byte) 112, class122.field1782, 0);
                super.field2510.method3509(0, class122.field1782, -121);
            } else {
                super.field2510.method3513(class364.field5299, class364.field5299, -26);
                super.field2510.method3514((byte) 127, class122.field1782, 0);
                super.field2510.method3470((byte) 124, 2);
                super.field2510.method3513(class364.field5299, class364.field5299, -20);
                super.field2510.method3514((byte) 96, class122.field1782, 0);
                super.field2510.method3514((byte) -90, class386.field5627, 1);
                super.field2510.method3509(0, class122.field1782, -123);
                super.field2510.method3520(true, (class123) null);
            }
            super.field2510.method3470((byte) -67, 0);
            this.field5317 = false;
        }
        if (arg0 < 54) {
            this.field5317 = false;
        }
        super.field2510.method3513(class364.field5299, class364.field5299, 83);
    }
}

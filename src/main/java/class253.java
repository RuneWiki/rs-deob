import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class class253 extends class230 {

    @OriginalMember(owner = "client!aaa", name = "X", descriptor = "S")
    public short field3758;

    @OriginalMember(owner = "client!aaa", name = "T", descriptor = "S")
    public short field3754;

    @OriginalMember(owner = "client!aaa", name = "K", descriptor = "S")
    public short field3745;

    @OriginalMember(owner = "client!aaa", name = "Y", descriptor = "B")
    public byte field3759;

    @OriginalMember(owner = "client!aaa", name = "U", descriptor = "S")
    public short field3755;

    @OriginalMember(owner = "client!aaa", name = "O", descriptor = "Z")
    public boolean field3749;

    @OriginalMember(owner = "client!aaa", name = "J", descriptor = "[Z")
    public static boolean[] field3744 = new boolean[200];

    @OriginalMember(owner = "client!aaa", name = "R", descriptor = "I")
    public static int field3752 = 52;

    @OriginalMember(owner = "client!aaa", name = "P", descriptor = "[I")
    public static int[] field3750 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!aaa", name = "Z", descriptor = "Lul;")
    public static class486 field3760 = new class486("", 15);

    @OriginalMember(owner = "client!aaa", name = "I", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!aaa", name = "N", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!aaa", name = "Q", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!aaa", name = "S", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!aaa", name = "V", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!aaa", name = "W", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 7)
    public static final String method1692(byte arg0, String arg1) {
        ++field3751;
        if (class528.field7246.startsWith("win")) {
            return arg1 + ".dll";
        } else if (!class528.field7246.startsWith("linux")) {
            if (class528.field7246.startsWith("mac")) {
                return "lib" + arg1 + ".dylib";
            } else {
                if (arg0 != -120) {
                    field3750 = null;
                }
                return null;
            }
        } else {
            return "lib" + arg1 + ".so";
        }
    }

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "(I)V", line = 40)
    public static void method1693(int arg0) {
        if (arg0 != -29873) {
            method1696((byte) 22);
        }
        field3750 = null;
        field3744 = null;
        field3760 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "(I)Z", line = 53)
    public final boolean method1534(int arg0) {
        ++field3747;
        int var2 = this.field3745;
        if (arg0 != 382) {
            return false;
        } else {
            while (this.field3754 >= var2) {
                for (int var3 = this.field3758; var3 <= this.field3755; ++var3) {
                    int var4 = var2 - class591.field8336 + class270.field3904;
                    if (~var4 <= -1 && var4 < class592.field8338.length) {
                        int var5 = -class112.field1363 + class270.field3904 + var3;
                        if (~var5 <= -1 && var5 < class592.field8338.length && class592.field8338[var4][var5]) {
                            return true;
                        }
                    }
                }
                ++var2;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(Z)V", line = 98)
    public void method79(boolean arg0) {
        ++field3757;
        if (arg0) {
            this.method79(false);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)I", line = 111)
    public static final int method1694(int arg0, int arg1) {
        ++field3746;
        return arg0 != -1 ? -108 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(CI)B", line = 125)
    public static final byte method1695(char arg0, int arg1) {
        if (arg1 != -8231) {
            return -93;
        } else {
            ++field3753;
            byte var2;
            if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
                if (~arg0 != -8365) {
                    if (~arg0 != -8219) {
                        if (arg0 == 402) {
                            var2 = -125;
                        } else if (arg0 == 8222) {
                            var2 = -124;
                        } else if (~arg0 != -8231) {
                            if (arg0 == 8224) {
                                var2 = -122;
                            } else if (~arg0 == -8226) {
                                var2 = -121;
                            } else if (arg0 != 710) {
                                if (~arg0 == -8241) {
                                    var2 = -119;
                                } else if (~arg0 == -353) {
                                    var2 = -118;
                                } else if (arg0 != 8249) {
                                    if (arg0 != 338) {
                                        if (~arg0 == -382) {
                                            var2 = -114;
                                        } else if (arg0 != 8216) {
                                            if (~arg0 != -8218) {
                                                if (~arg0 != -8221) {
                                                    if (~arg0 == -8222) {
                                                        var2 = -108;
                                                    } else if (arg0 != 8226) {
                                                        if (~arg0 == -8212) {
                                                            var2 = -106;
                                                        } else if (~arg0 == -8213) {
                                                            var2 = -105;
                                                        } else if (arg0 == 732) {
                                                            var2 = -104;
                                                        } else if (~arg0 == -8483) {
                                                            var2 = -103;
                                                        } else if (arg0 == 353) {
                                                            var2 = -102;
                                                        } else if (arg0 == 8250) {
                                                            var2 = -101;
                                                        } else if (~arg0 == -340) {
                                                            var2 = -100;
                                                        } else if (arg0 == 382) {
                                                            var2 = -98;
                                                        } else if (arg0 == 376) {
                                                            var2 = -97;
                                                        } else {
                                                            var2 = 63;
                                                        }
                                                    } else {
                                                        var2 = -107;
                                                    }
                                                } else {
                                                    var2 = -109;
                                                }
                                            } else {
                                                var2 = -110;
                                            }
                                        } else {
                                            var2 = -111;
                                        }
                                    } else {
                                        var2 = -116;
                                    }
                                } else {
                                    var2 = -117;
                                }
                            } else {
                                var2 = -120;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -126;
                    }
                } else {
                    var2 = -128;
                }
            } else {
                var2 = (byte) arg0;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z[Lsca;)I", line = 255)
    public final int method1526(boolean arg0, class251[] arg1) {
        ++field3743;
        if (arg0) {
            field3760 = null;
        }
        int var3 = 0;
        label118: for (int var4 = this.field3745; var4 <= this.field3754; ++var4) {
            label116: for (int var5 = this.field3758; ~var5 >= ~this.field3755; ++var5) {
                long var6 = class182.field2291[super.field3467][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label116;
                        }
                        class555 var11 = class205.field2880[var10 + -1];
                        for (int var12 = 0; ~var12 > ~var3; ++var12) {
                            if (arg1[var12] == var11.field7687) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field7687;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field3759 != -1) {
            int var14 = -class591.field8336 + this.field3745;
            int var15 = -class112.field1363 + this.field3758;
            short var16;
            int var17;
            int var18;
            short var19;
            if (~this.field3759 != -2) {
                if (var15 > -var14) {
                    var16 = this.field3745;
                    var17 = this.field3745 + -1;
                    var18 = this.field3758 + -1;
                    var19 = this.field3758;
                } else {
                    var16 = this.field3745;
                    var18 = this.field3758 + 1;
                    var19 = this.field3758;
                    var17 = this.field3745 - -1;
                }
            } else if (var14 >= var15) {
                var16 = this.field3745;
                var19 = this.field3758;
                var17 = this.field3745 + -1;
                var18 = this.field3758 - -1;
            } else {
                var16 = this.field3745;
                var17 = this.field3745 - -1;
                var19 = this.field3758;
                var18 = this.field3758 + -1;
            }
            label82: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class182.field2291[super.field3467][var16][var18];
                while (~var21 != -1L) {
                    class555 var27 = class205.field2880[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field7687) {
                        continue label82;
                    }
                }
                long var23 = class182.field2291[super.field3467][var17][var19];
                while (~var23 != -1L) {
                    class555 var26 = class205.field2880[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field7687) {
                        continue label82;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "(B)V", line = 422)
    public static final void method1696(byte arg0) {
        if (arg0 == -80) {
            class340.field4924 = null;
            ++field3756;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lha;B)Z", line = 434)
    public final boolean method1525(class473 arg0, byte arg1) {
        ++field3748;
        return arg1 != -127 ? false : class407.method2492(13416, this.method72(arg0, -5047), this.field3755, super.field3469, this.field3758, this.field3745, this.field3754);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 445)
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field3758 = (short) arg7;
        super.field3469 = (byte) arg1;
        this.field3754 = (short) arg6;
        this.field3745 = (short) arg5;
        super.field3467 = (byte) arg0;
        this.field3759 = arg10;
        this.field3755 = (short) arg8;
        super.field3464 = arg3;
        super.field3470 = arg2;
        this.field3749 = arg9;
        super.field3460 = arg4;
    }
}

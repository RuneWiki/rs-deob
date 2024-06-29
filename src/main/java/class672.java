import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class672 extends class305 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
    private boolean field9371 = true;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
    public boolean field9377 = false;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lbia;")
    public static class500 field9370;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field9379;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
    public final void method3842(int arg0, boolean arg1) {
        if (arg0 != 63) {
            this.method3847(119);
        }
        ++field9373;
        this.field9371 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method3843(boolean arg0) {
        field9370 = null;
        if (arg0) {
            field9370 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILhb;)V")
    public class672(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z")
    public final boolean method3844(int arg0) {
        if (arg0 != 2) {
            field9370 = null;
        }
        ++field9374;
        return super.field4323.method4104(45).method3292(0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
    public static final String method3845(boolean arg0, int arg1, byte[] arg2, int arg3) {
        ++field9366;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (!arg0) {
            method3843(false);
        }
        int var6 = arg3;
        int var7 = arg3 - -arg1;
        while (var6 < var7) {
            int var8 = 255 & arg2[var6++];
            int var9;
            if (~var8 > -129) {
                if (~var8 == -1) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (~var8 > -193) {
                var9 = 65533;
            } else if (~var8 <= -225) {
                if (~var8 <= -241) {
                    if (var8 < 248) {
                        if (~(var6 + 2) > ~var7 && (arg2[var6] & 192) == 128 && (192 & arg2[var6 + 1]) == 128 && (192 & arg2[var6 + 2]) == 128) {
                            int var10 = (63 & arg2[var6++]) << 12 | var8 << 18 & 1835008 | (63 & arg2[var6++]) << 6 | 63 & arg2[var6++];
                            if (var10 >= 65536 && var10 <= 1114111) {
                                var9 = 65533;
                            } else {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (~(var6 + 1) > ~var7 && ~(192 & arg2[var6]) == -129 && (arg2[var6 + 1] & 192) == 128) {
                    var9 = 61440 & var8 << 12 | arg2[var6++] << 6 & 4032 | arg2[var6++] & 63;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var7 > var6 && ~(arg2[var6] & 192) == -129) {
                var9 = arg2[var6++] & 63 | var8 << 6 & 1984;
                if (var9 < 128) {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static final void method3846() {
        for (int var0 = 0; var0 < class625.field8752; ++var0) {
            if (!class313.field4428[var0]) {
                class14 var1 = class234.field3410[var0];
                class609 var2 = var1.field199;
                int var3 = var1.field184;
                int var4 = var2.method3537(6490) - class631.field8819;
                int var5 = (var4 * 2 >> class459.field6769) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3533(false) - var4 >> class459.field6769;
                int var9 = var2.method3531(20597) - var4 >> class459.field6769;
                int var10 = var2.method3531(20597) + var4 >> class459.field6769;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class565.field8040) {
                    var10 = class565.field8040 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field189[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class34.field356) {
                        var16 = class34.field356 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class119 var19 = class755.method4208(var3, var17, var11, field9379 != null ? field9379 : (field9379 = method3849("oda")));
                        if (var19 != null && var19.field1630 != 0) {
                            if (var19.field1630 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field189[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field189[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field189[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field189[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class313.field4428[var0] = true;
                class582.field8287[var3].method966(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lhb;)V")
    public class672(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Z")
    public final boolean method3847(int arg0) {
        ++field9368;
        if (arg0 != 16232) {
            this.method306(-85, 110);
        }
        return this.field9371;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
    public final int method3848(int arg0) {
        ++field9369;
        if (arg0 != 17503) {
            this.field9371 = true;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field9378;
        if (arg0 != 68) {
            this.field9371 = true;
        }
        this.field9377 = true;
        return !super.field4323.method4104(110).method3292(0) ? 0 : 2;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        this.field9377 = false;
        super.field4320 = arg1;
        ++field9376;
        if (arg0 != -27751) {
            field9370 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return -103;
        } else {
            ++field9375;
            if (!super.field4323.method4104(108).method3292(0)) {
                return 3;
            } else {
                return arg1 == 3 && !class283.method1812((byte) -110, "jagdx") ? 3 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field9367;
        if (!super.field4323.method4104(95).method3292(0)) {
            super.field4320 = 0;
        }
        if (super.field4320 < 0 || ~super.field4320 < -6) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 > -40) {
            this.method3842(91, true);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3849(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

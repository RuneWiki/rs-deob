import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class148 extends class96 {

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V")
    public static final void method1022(int arg0, int arg1) {
        if (arg1 < 0 || ~arg1 < -3) {
            arg1 = 0;
        }
        ++field1962;
        if (arg0 == -15306) {
            class358.field4604 = arg1;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field1964;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field1331.method397((byte) -110, arg0);
            if (super.field1331.field863) {
                for (int var4 = 0; ~class269.field3403 < ~var4; ++var4) {
                    this.method1025(arg0, (byte) 113, var4);
                    int[] var5 = this.method657(0, class40.field586, -1);
                    var3[var4] = var5[class448.field6237];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == arg1) {
            super.field1329 = ~arg2.method617(arg1 ^ -3) == -2;
        }
        ++field1965;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field1966;
        if (arg0 != 3) {
            return null;
        } else {
            int[][] var3 = super.field1333.method694(arg1, arg0);
            if (super.field1333.field1423) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class269.field3403; ++var7) {
                    this.method1025(arg1, (byte) 115, var7);
                    int[][] var8 = this.method659(0, arg0 ^ -122, class40.field586);
                    var4[var7] = var8[0][class448.field6237];
                    var5[var7] = var8[1][class448.field6237];
                    var6[var7] = var8[2][class448.field6237];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static final void method1023(boolean arg0) {
        ++field1969;
        class522.field7742 = new class7();
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([JZ[I)V")
    public static final void method1024(long[] arg0, boolean arg1, int[] arg2) {
        ++field1963;
        if (arg1) {
            method1022(9, 30);
        }
        class345.method2023(arg0, arg2, 0, arg0.length + -1, 98);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V")
    private final void method1025(int arg0, byte arg1, int arg2) {
        ++field1968;
        int var4 = class510.field7476[arg2];
        if (arg1 >= 112) {
            int var5 = class74.field933[arg0];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class448.field6237 = arg2;
                class40.field586 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class448.field6237 = arg0;
                class40.field586 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class448.field6237 = -arg0 + class269.field3403;
                class40.field586 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class40.field586 = -arg0 + class477.field6965;
                class448.field6237 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class448.field6237 = -arg2 + class269.field3403;
                class40.field586 = class477.field6965 - arg0;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class448.field6237 = -arg0 + class269.field3403;
                class40.field586 = class477.field6965 - arg2;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class40.field586 = -arg2 + class477.field6965;
                class448.field6237 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class448.field6237 = -arg2 + class269.field3403;
                class40.field586 = arg0;
            }
            class448.field6237 &= class292.field3781;
            class40.field586 &= class380.field4948;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1967;
        int var6 = -arg4 + arg3;
        int var7 = -arg0 + arg2;
        if (var7 != 0) {
            if (~var6 == -1) {
                class370.method2158(arg4, -114, arg1, arg2, arg0);
            } else {
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                if (arg5 == 9114) {
                    boolean var8 = ~var6 < ~var7;
                    if (var8) {
                        int var9 = arg0;
                        arg0 = arg4;
                        int var10 = arg2;
                        arg4 = var9;
                        arg2 = arg3;
                        arg3 = var10;
                    }
                    if (~arg2 > ~arg0) {
                        int var11 = arg0;
                        arg0 = arg2;
                        int var12 = arg4;
                        arg2 = var11;
                        arg4 = arg3;
                        arg3 = var12;
                    }
                    int var13 = arg4;
                    int var14 = arg2 - arg0;
                    int var15 = -arg4 + arg3;
                    int var16 = -(var14 >> 1);
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    int var17 = ~arg4 > ~arg3 ? 1 : -1;
                    if (!var8) {
                        for (int var18 = arg0; ~var18 >= ~arg2; ++var18) {
                            var16 += var15;
                            class333.field4265[var13][var18] = arg1;
                            if (~var16 < -1) {
                                var16 -= var14;
                                var13 += var17;
                            }
                        }
                    } else {
                        for (int var19 = arg0; arg2 >= var19; ++var19) {
                            class333.field4265[var19][var13] = arg1;
                            var16 += var15;
                            if (var16 > 0) {
                                var13 += var17;
                                var16 -= var14;
                            }
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class372.method2167(arg4, arg0, arg3, 5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BB)C")
    public static final char method1027(byte arg0, byte arg1) {
        ++field1970;
        int var2 = 36 % ((-31 - arg1) / 60);
        int var3 = 255 & arg0;
        if (var3 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var3, 16) + " provided");
        } else {
            if (var3 >= 128 && var3 < 160) {
                char var4 = class168.field2194[var3 + -128];
                if (var4 == 0) {
                    var4 = '?';
                }
                var3 = var4;
            }
            return (char) var3;
        }
    }
}

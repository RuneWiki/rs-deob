import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class225 extends class182 {

    @OriginalMember(owner = "client!e", name = "S", descriptor = "Z")
    private boolean field3791 = true;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    private int field3796 = 4096;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[Llb;")
    public static class311[] field3790 = new class311[4];

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)I")
    public static final int method1591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3794;
        int var5 = arg1 - class128.field2130[arg2 * 1024 / arg3] >> 1;
        return ((-var5 + 65536) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3791 = ~arg1.method1802((byte) 115) == -2;
            }
        } else {
            this.field3796 = arg1.method1821((byte) 51);
        }
        if (arg0) {
            this.field3796 = -23;
        }
        ++field3787;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[Lhg;)V")
    public static final void method1592(int arg0, int arg1, class207[] arg2) {
        ++field3789;
        if (arg1 == 1) {
            for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
                class207 var4 = arg2[var3];
                if (var4 != null) {
                    if (~var4.field3376 == -1) {
                        if (var4.field3462 != null) {
                            method1592(arg0, 1, var4.field3462);
                        }
                        class278 var5 = (class278) class306.field4952.method987(-104, (long) var4.field3405);
                        if (var5 != null) {
                            class179.method1305((byte) 69, var5.field4622, arg0);
                        }
                    }
                    if (arg0 == 0 && var4.field3438 != null) {
                        class303 var6 = new class303();
                        var6.field4935 = var4.field3438;
                        var6.field4931 = var4;
                        class269.method1893(-3725, var6);
                    }
                    if (arg0 == 1 && var4.field3427 != null) {
                        if (var4.field3369 >= 0) {
                            class207 var7 = class222.method1574(108, var4.field3405);
                            if (var7 == null || var7.field3462 == null || var7.field3462.length <= var4.field3369 || var7.field3462[var4.field3369] != var4) {
                                continue;
                            }
                        }
                        class303 var8 = new class303();
                        var8.field4931 = var4;
                        var8.field4935 = var4.field3427;
                        class269.method1893(-3725, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int[][] var3 = super.field2905.method50(arg1, (byte) 125);
        int var4 = -31 % ((-64 - arg0) / 49);
        ++field3788;
        if (super.field2905.field158) {
            int[] var5 = this.method1323(0, -17707, arg1 - 1 & class107.field1749);
            int[] var6 = this.method1323(0, -17707, arg1);
            int[] var7 = this.method1323(0, -17707, arg1 + 1 & class107.field1749);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class4.field116; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field3796;
                int var13 = (var6[class103.field1644 & var11 + 1] + -var6[class103.field1644 & var11 + -1]) * this.field3796;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 >> 12;
                int var17 = var16 * var16 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 + 4096 + var15) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                }
                if (this.field3791) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)Lal;")
    public static final class217 method1593(byte arg0, int arg1) {
        ++field3792;
        class217 var2 = (class217) class176.field2839.method99((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 > -45) {
                field3790 = null;
            }
            byte[] var3 = class217.field3667.method1149(33, (byte) 103, arg1);
            class217 var4 = new class217();
            if (var3 != null) {
                var4.method1554(new class249(var3), (byte) -120, arg1);
            }
            class176.field2839.method100((long) arg1, var4, 92);
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZILjava/lang/String;)I")
    public static final int method1594(int arg0, boolean arg1, int arg2, String arg3) {
        ++field3795;
        if (~arg2 <= -3 && ~arg2 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = arg0; var7 > var8; ++var8) {
                char var9 = arg3.charAt(var8);
                if (~var8 == -1) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg1) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class225() {
        super(1, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1595(String[] arg0, int arg1, int arg2, int arg3) {
        ++field3793;
        if (arg1 == 0) {
            return "";
        } else if (~arg1 == -2) {
            String var4 = arg0[arg2];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg1 - -arg2;
            if (arg3 != 4) {
                field3790 = null;
            }
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; ++var7) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; ~var9 > ~var5; ++var9) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "(I)V")
    public static void method1596(int arg0) {
        if (arg0 >= -31) {
            method1593((byte) -85, 88);
        }
        field3790 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public abstract class class539 extends class214 {

    @OriginalMember(owner = "client!nga", name = "B", descriptor = "Z")
    public boolean field7456;

    @OriginalMember(owner = "client!nga", name = "M", descriptor = "S")
    public short field7467;

    @OriginalMember(owner = "client!nga", name = "G", descriptor = "B")
    public byte field7461;

    @OriginalMember(owner = "client!nga", name = "L", descriptor = "S")
    public short field7466;

    @OriginalMember(owner = "client!nga", name = "y", descriptor = "S")
    public short field7453;

    @OriginalMember(owner = "client!nga", name = "A", descriptor = "S")
    public short field7455;

    @OriginalMember(owner = "client!nga", name = "D", descriptor = "I")
    public static int field7458 = 0;

    @OriginalMember(owner = "client!nga", name = "I", descriptor = "F")
    public static float field7463;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!nga", name = "C", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!nga", name = "E", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!nga", name = "F", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!nga", name = "H", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!nga", name = "J", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!nga", name = "K", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "(I)Z", line = 4)
    public final boolean method1383(int arg0) {
        ++field7464;
        int var2 = -82 / ((-48 - arg0) / 41);
        for (int var3 = this.field7466; ~this.field7455 <= ~var3; ++var3) {
            for (int var4 = this.field7467; ~var4 >= ~this.field7453; ++var4) {
                int var5 = var3 - class130.field1787 - -class278.field4025;
                if (~var5 <= -1 && ~class408.field5778.length < ~var5) {
                    int var6 = var4 - class468.field6610 + class278.field4025;
                    if (var6 >= 0 && ~var6 > ~class408.field5778.length && class408.field5778[var5][var6]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;", line = 46)
    public static final String method3121(String[] arg0, boolean arg1, int arg2, int arg3) {
        ++field7454;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var5 > var7; ++var7) {
                String var11 = arg0[var7];
                if (var11 != null) {
                    var6 += var11.length();
                } else {
                    var6 += 4;
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg1) {
                field7458 = -12;
            }
            for (int var9 = arg2; var9 < var5; ++var9) {
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

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "(I)V", line = 108)
    public static final void method3122(int arg0) {
        class322.field4576 = 200;
        class269.field3927 = (int) ((double) class102.field1467 * 34.46D);
        ++field7460;
        if (arg0 > -67) {
            field7463 = 0.17774972F;
        }
        class269.field3927 <<= 2;
        if (class375.field5490.method455()) {
            class269.field3927 += 512;
        }
        class24.method143(false, (byte) -63);
    }

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "(I)V", line = 127)
    public void method771(int arg0) {
        ++field7465;
        if (arg0 != 32082) {
            this.method1389((class66) null, false);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[Luaa;)I", line = 140)
    public final int method1388(byte arg0, class127[] arg1) {
        ++field7457;
        int var3 = 0;
        label118: for (int var4 = this.field7466; var4 <= this.field7455; ++var4) {
            label116: for (int var5 = this.field7467; ~var5 >= ~this.field7453; ++var5) {
                long var6 = class160.field2148[super.field2813][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (~var8 < -49L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class447 var11 = class82.field1135[var10 - 1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg1[var12] == var11.field6422) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field6422;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg0 >= -78) {
            this.method1389((class66) null, false);
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg1[var13] = null;
        }
        if (this.field7461 != 0) {
            int var14 = -class130.field1787 + this.field7466;
            int var15 = -class468.field6610 + this.field7467;
            short var16;
            short var17;
            int var18;
            int var19;
            if (~this.field7461 != -2) {
                if (var15 > -var14) {
                    var16 = this.field7467;
                    var17 = this.field7466;
                    var18 = this.field7466 + -1;
                    var19 = this.field7467 + -1;
                } else {
                    var17 = this.field7466;
                    var16 = this.field7467;
                    var18 = this.field7466 + 1;
                    var19 = this.field7467 - -1;
                }
            } else if (~var15 >= ~var14) {
                var16 = this.field7467;
                var19 = this.field7467 + 1;
                var17 = this.field7466;
                var18 = this.field7466 - 1;
            } else {
                var16 = this.field7467;
                var19 = this.field7467 + -1;
                var17 = this.field7466;
                var18 = this.field7466 + 1;
            }
            label82: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class160.field2148[super.field2813][var17][var19];
                while (~var21 != -1L) {
                    class447 var27 = class82.field1135[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field6422) {
                        continue label82;
                    }
                }
                long var23 = class160.field2148[super.field2813][var18][var16];
                while (var23 != 0L) {
                    class447 var26 = class82.field1135[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field6422) {
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

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lsu;ILjs;Lha;)V", line = 311)
    public static final void method3123(class223 arg0, int arg1, class349 arg2, class66 arg3) {
        ++field7459;
        class140 var4 = arg2.method2232((byte) 81, arg3);
        if (var4 != null) {
            int var5 = var4.method350();
            if (~var5 > ~var4.method351()) {
                var5 = var4.method351();
            }
            byte var6 = 10;
            int var7 = arg0.field2888;
            int var8 = arg0.field2886;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg2.field5056 != null) {
                var9 = class687.field9196.method3621((class140[]) null, (int[]) null, class571.field7777, arg2.field5056, (byte) 78);
                for (int var12 = 0; ~var9 < ~var12; ++var12) {
                    String var13 = class571.field7777[var12];
                    if (var12 < var9 + -1) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class698.field9253.method2995(var13);
                    if (~var10 > ~var14) {
                        var10 = var14;
                    }
                }
                var11 = class698.field9253.method2996() * var9 + class698.field9253.method2994() / 2;
            }
            int var15 = var5 / arg1 + arg0.field2888;
            int var16 = arg0.field2886;
            if (var7 < class752.field10174 + var5) {
                var7 = class752.field10174;
                var15 = class752.field10174 - -var6 + var5 / 2 + var10 / 2 + 5;
            } else if (-var5 + class752.field10171 < var7) {
                var15 = class752.field10171 - var6 + -(var5 / 2) + -(var10 / 2) + -5;
                var7 = -var5 + class752.field10171;
            }
            if (~var8 > ~(class752.field10186 + var5)) {
                var16 = var5 / 2 + var6 + class752.field10186;
                var8 = class752.field10186;
            } else if (~(-var5 + class752.field10173) > ~var8) {
                var16 = -var6 + class752.field10173 + -(var5 / 2) + -var11;
                var8 = -var5 + class752.field10173;
            }
            int var17 = (int) (Math.atan2((double) (-arg0.field2888 + var7), (double) (-arg0.field2886 + var8)) / 3.141592653589793D * 32767.0D) & 65535;
            var4.method973((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg2.field5056 != null) {
                var19 = var16;
                var18 = -(var10 / 2) + -5 + var15;
                var21 = 3 + var9 * class698.field9253.method2996() + var16;
                var20 = var10 + 10 + var18;
                if (arg2.field5058 != 0) {
                    arg3.method529(var21 - var16, var16, var20 - var18, var18, arg2.field5058, 1);
                }
                if (~arg2.field5101 != -1) {
                    arg3.method553(var20 - var18, var18, var16, arg2.field5101, 124, -var16 + var21);
                }
                for (int var22 = 0; ~var9 < ~var22; ++var22) {
                    String var23 = class571.field7777[var22];
                    if (~(var9 + -1) < ~var22) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class698.field9253.method3000(arg3, var23, var15, var16, arg2.field5073, true);
                    var16 += class698.field9253.method2996();
                }
            }
            if (~arg2.field5077 != 0 || arg2.field5056 != null) {
                class265 var24 = new class265(arg0);
                int var25 = var5 >> 1;
                var24.field3896 = var19;
                var24.field3890 = var21;
                var24.field3898 = -var25 + var8;
                var24.field3892 = var18;
                var24.field3888 = var8 + var25;
                var24.field3897 = var7 + var25;
                var24.field3893 = -var25 + var7;
                var24.field3901 = var20;
                class735.field9966.method689(var24, -35);
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lha;Z)Z", line = 462)
    public final boolean method1389(class66 arg0, boolean arg1) {
        ++field7462;
        return !arg1 ? false : class785.method4306(8833, this.field7453, this.field7455, super.field2809, this.field7467, this.method119(arg0, (byte) -116), this.field7466);
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 478)
    public class539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field7456 = arg9;
        this.field7467 = (short) arg7;
        super.field2802 = arg2;
        this.field7461 = arg10;
        super.field2810 = arg4;
        super.field2815 = arg3;
        super.field2813 = (byte) arg0;
        this.field7466 = (short) arg5;
        super.field2809 = (byte) arg1;
        this.field7453 = (short) arg8;
        this.field7455 = (short) arg6;
    }
}

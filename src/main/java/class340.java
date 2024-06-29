import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class340 extends class34 {

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field4929 = -1;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[I")
    private int[] field4927;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBILat;)V")
    public static final void method2063(int arg0, byte arg1, int arg2, class444 arg3) {
        ++field4923;
        class273.field3691 = arg2;
        class496.field7268 = arg3;
        class191.field2801 = arg0;
        if (arg1 != -127) {
            method2066(-120, 80, -75, -77, 17, -5, -52, 57);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            method2065(-127L, false);
        }
        ++field4921;
        if (arg2 == 0) {
            this.field4929 = arg0.method1844(-125);
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public static final void method2064(int arg0) {
        ++field4926;
        class453 var1 = null;
        try {
            class464 var2 = class346.field4985.method1199(arg0 + -14341, "3", false);
            while (~var2.field6699 == -1) {
                class334.method2047(1L, 0);
            }
            if (~var2.field6699 == -3) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class453) var2.field6695;
            byte[] var3 = new byte[(int) var1.method2660((byte) -51)];
            if (~var3.length != -1) {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2657(var4, var3.length - var4, 124, var3);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class319 var6 = new class319(var3);
                int var7 = var6.method1869(-84);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field4360 = var7 + 1;
                if (!var6.method1841(-2843)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field4360 = 1;
                int var8 = var6.method1869(-92);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class154.field2375 = var6.method1888(-122);
                class84.field1291 = var6.method1888(arg0 + -123);
            } else {
                class154.field2375 = "";
                class84.field1291 = "";
            }
        } catch (Exception var10) {
            class84.field1291 = "";
            class154.field2375 = "";
        }
        try {
            if (var1 != null) {
                var1.method2659(-1);
            }
        } catch (Exception var9) {
        }
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
    public final int method251(int arg0) {
        if (arg0 > -21) {
            method2063(-73, (byte) 36, 15, (class444) null);
        }
        ++field4933;
        return this.field4929;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method2065(long arg0, boolean arg1) {
        ++field4922;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                if (arg1) {
                    method2063(-103, (byte) 45, 1, (class444) null);
                }
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class197.field2895[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = var6.length() + -1;
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class340() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V")
    public final void method248(int arg0, byte arg1, int arg2) {
        super.method248(arg0, (byte) 99, arg2);
        ++field4925;
        if (arg1 >= 44) {
            if (this.field4929 >= 0 && class224.field3171 != null) {
                int var4 = class224.field3171.method914(false, this.field4929).field3386 ? 64 : 128;
                this.field4927 = class224.field3171.method915(var4, this.field4929, 1.0F, (byte) 43, false, var4);
                this.field4928 = var4;
                this.field4930 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field4932;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            this.method69((class319) null, 106, -90);
        }
        if (super.field536.field726) {
            int var4 = (class494.field7150 == this.field4928 ? arg1 : this.field4928 * arg1 / class494.field7150) * this.field4930;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class383.field5502 != ~this.field4930) {
                for (int var8 = 0; class383.field5502 > var8; ++var8) {
                    int var9 = this.field4930 * var8 / class383.field5502;
                    int var10 = this.field4927[var4 - -var9];
                    var7[var8] = class375.method2245(var10, 255) << 4;
                    var6[var8] = class375.method2245(65280, var10) >> 4;
                    var5[var8] = class375.method2245(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class383.field5502 > var11; ++var11) {
                    int var12 = this.field4927[var4++];
                    var7[var11] = class375.method2245(var12 << 4, 4080);
                    var6[var11] = class375.method2245(var12, 65280) >> 4;
                    var5[var11] = class375.method2245(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        super.method249(-100);
        ++field4931;
        int var2 = -118 % ((-34 - arg0) / 52);
        this.field4927 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4924;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = -arg3 + arg4;
        int var12 = -arg3 + arg1;
        int var13 = arg4 * arg4;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        if (arg7 != 11714) {
            method2063(102, (byte) -124, 20, (class444) null);
        }
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 - 1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg1 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class42.field626[arg5];
        class188.method1259(-arg4 + arg6, (byte) 27, -var11 + arg6, arg0, var39);
        class188.method1259(-var11 + arg6, (byte) 27, arg6 + var11, arg2, var39);
        class188.method1259(arg6 + var11, (byte) 27, arg4 + arg6, arg0, var39);
        while (~var9 < -1) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    ++var10;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (~var23 > -1) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg6 + var8;
            int var44 = -var8 + arg6;
            if (!var40) {
                class188.method1259(var44, (byte) 27, var43, arg0, class42.field626[var41]);
                class188.method1259(var44, (byte) 27, var43, arg0, class42.field626[var42]);
            } else {
                int var45 = arg6 - -var10;
                int var46 = arg6 - var10;
                class188.method1259(var44, (byte) 27, var46, arg0, class42.field626[var41]);
                class188.method1259(var46, (byte) 27, var45, arg2, class42.field626[var41]);
                class188.method1259(var45, (byte) 27, var43, arg0, class42.field626[var41]);
                class188.method1259(var44, (byte) 27, var46, arg0, class42.field626[var42]);
                class188.method1259(var46, (byte) 27, var45, arg2, class42.field626[var42]);
                class188.method1259(var45, (byte) 27, var43, arg0, class42.field626[var42]);
            }
        }
    }
}

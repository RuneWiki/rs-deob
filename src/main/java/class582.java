import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class582 extends class518 {

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    private int field8400 = 409;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
    private int field8405 = 1024;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
    private int field8411 = 0;

    @OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
    private int field8404 = 1024;

    @OriginalMember(owner = "client!kga", name = "S", descriptor = "I")
    private int field8412 = 819;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    private int field8413 = 1024;

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "I")
    private int field8402 = 2048;

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "I")
    private int field8415 = 0;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
    private int field8414 = 1024;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field8416 = new String[] { method4317(method4316("z[s\u0012l9")), method4317(method4316("\u007fI~P")), method4317(method4316("j\u0012<\u0012R")), method4317(method4316("z[s\u0012e9")), method4317(method4316("z[s\u0012h9")), method4317(method4316("z[s\u0012k9")), method4317(method4316("z[s\u0012m9")), method4317(method4316("z[s\u0012j9")) };

    @OriginalMember(owner = "client!kga", name = "M", descriptor = "Lbo;")
    public static class801 field8406 = null;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!kga", name = "Q", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!kga", name = "N", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III[BIII)V")
    public static final void method4313(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field8401;
            if (~arg0 < -1 && !class357.method2858(arg0, false)) {
                throw new IllegalArgumentException("");
            } else if (~arg6 < -1 && !class357.method2858(arg6, false)) {
                throw new IllegalArgumentException("");
            } else {
                int var7 = class507.method3875(arg4, 119);
                int var8 = 0;
                int var9 = arg6 > arg0 ? arg0 : arg6;
                int var10 = arg0 >> 1;
                int var11 = arg6 >> 1;
                if (arg2 != 5121) {
                    method4314((byte) 88);
                }
                byte[] var12 = arg3;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg5, var8, arg1, arg0, arg6, 0, arg4, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg0 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; ~var7 < ~var16; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var11 > var20; ++var20) {
                            for (int var21 = 0; var10 > var21; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg0 = var10;
                    var12 = var15;
                    arg6 = var11;
                    ++var8;
                    var9 >>= 1;
                    var11 >>= 1;
                    var10 >>= 1;
                }
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field8416[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8416[2] : field8416[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 != -3) {
                this.method4315(-127, 61, 53, (int[][]) null, (Random) null, -111, -104);
            }
            ++field8409;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (~arg0 != -7) {
                                        if (arg0 != 7) {
                                            if (~arg0 == -9) {
                                                this.field8414 = arg1.method5116((byte) -119);
                                            }
                                        } else {
                                            this.field8405 = arg1.method5116((byte) -116);
                                        }
                                    } else {
                                        this.field8411 = arg1.method5128(0);
                                    }
                                } else {
                                    this.field8413 = arg1.method5116((byte) -110);
                                }
                            } else {
                                this.field8412 = arg1.method5116((byte) -122);
                            }
                        } else {
                            this.field8400 = arg1.method5116((byte) -115);
                        }
                    } else {
                        this.field8402 = arg1.method5116((byte) -106);
                    }
                } else {
                    this.field8404 = arg1.method5116((byte) -108);
                }
            } else {
                this.field8415 = arg1.method5128(0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8416[0] + arg0 + ',' + (arg1 != null ? field8416[2] : field8416[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(B)V")
    public static void method4314(byte arg0) {
        try {
            if (arg0 < 17) {
                method4314((byte) -118);
            }
            field8406 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8416[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field8410;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -6 / ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int[][] var5 = super.field7564.method4459((byte) -99);
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                boolean var11 = true;
                boolean var12 = true;
                int var13 = 0;
                int var14 = 0;
                int var15 = class110.field1436 * this.field8404 >> 12;
                int var16 = class110.field1436 * this.field8402 >> 12;
                int var17 = class606.field8689 * this.field8400 >> 12;
                int var18 = class606.field8689 * this.field8412 >> 12;
                if (~var18 >= -2) {
                    return var5[arg0];
                } else {
                    this.field8408 = class110.field1436 / 8 * this.field8413 >> 12;
                    int var19 = 1 - -(class110.field1436 / var15);
                    int[][] var20 = new int[var19][3];
                    int[][] var21 = new int[var19][3];
                    Random var22 = new Random((long) this.field8415);
                    while (true) {
                        while (true) {
                            int var23 = class70.method723(var22, -var15 + var16, (byte) 58) + var15;
                            int var24 = var17 + class70.method723(var22, -var17 + var18, (byte) 58);
                            int var25 = var9 - -var23;
                            if (~var25 < ~class110.field1436) {
                                var23 = -var9 + class110.field1436;
                                var25 = class110.field1436;
                            }
                            int var10000;
                            int var26;
                            if (var12) {
                                var26 = 0;
                            } else {
                                int var27 = var10;
                                int[] var28 = var21[var10];
                                int var29 = 0;
                                int var30 = var6 + var25;
                                if (var30 < 0) {
                                    var30 += class110.field1436;
                                }
                                if (~var30 < ~class110.field1436) {
                                    var30 -= class110.field1436;
                                }
                                var26 = var28[2];
                                while (true) {
                                    int[] var31 = var21[var27];
                                    if (var31[0] <= var30 && ~var31[1] <= ~var30) {
                                        if (var10 != var27) {
                                            int var32 = var6 + var9;
                                            if (var32 < 0) {
                                                var32 += class110.field1436;
                                            }
                                            if (~class110.field1436 > ~var32) {
                                                var32 -= class110.field1436;
                                            }
                                            for (int var33 = 1; ~var33 >= ~var29; ++var33) {
                                                int[] var34 = var21[(var10 + var33) % var13];
                                                var26 = Math.max(var26, var34[2]);
                                            }
                                            for (int var35 = 0; var35 <= var29; ++var35) {
                                                int[] var36 = var21[(var10 + var35) % var13];
                                                int var37 = var36[2];
                                                if (~var26 != ~var37) {
                                                    int var38 = var36[0];
                                                    int var39 = var36[1];
                                                    int var40;
                                                    int var41;
                                                    if (var30 <= var32) {
                                                        if (var38 == 0) {
                                                            var40 = 0;
                                                            var41 = Math.min(var30, var39);
                                                        } else {
                                                            var40 = Math.max(var32, var38);
                                                            var41 = class110.field1436;
                                                        }
                                                    } else {
                                                        var40 = Math.max(var32, var38);
                                                        var41 = Math.min(var30, var39);
                                                    }
                                                    this.method4315(-var37 + var26, -128, var37, var5, var22, var41 - var40, var8 + var40);
                                                }
                                            }
                                        }
                                        var10 = var27;
                                        break;
                                    }
                                    var10000 = ~var13;
                                    ++var27;
                                    if (var10000 >= ~var27) {
                                        var27 = 0;
                                    }
                                    ++var29;
                                }
                            }
                            if (~(var24 + var26) >= ~class606.field8689) {
                                var11 = false;
                            } else {
                                var24 = -var26 + class606.field8689;
                            }
                            if (class110.field1436 == var25) {
                                this.method4315(var24, -125, var26, var5, var22, var23, var7 + var9);
                                if (var11) {
                                    return var3;
                                }
                                var11 = true;
                                int[] var42 = var20[var14++];
                                var42[1] = var25;
                                var42[2] = var26 - -var24;
                                var42[0] = var9;
                                int[][] var43 = var21;
                                var21 = var20;
                                var20 = var43;
                                var13 = var14;
                                var14 = 0;
                                var8 = var7;
                                var7 = class70.method723(var22, class110.field1436, (byte) 58);
                                var9 = 0;
                                var6 = -var8 + var7;
                                int var44 = var6;
                                if (~var6 > -1) {
                                    var44 = class110.field1436 + var6;
                                }
                                if (class110.field1436 < var44) {
                                    var44 -= class110.field1436;
                                }
                                var10 = 0;
                                while (true) {
                                    int[] var45 = var21[var10];
                                    if (var44 >= var45[0] && var44 <= var45[1]) {
                                        var12 = false;
                                        break;
                                    }
                                    var10000 = ~var13;
                                    ++var10;
                                    if (var10000 >= ~var10) {
                                        var10 = 0;
                                    }
                                }
                            } else {
                                int[] var46 = var20[var14++];
                                var46[2] = var24 + var26;
                                var46[0] = var9;
                                var46[1] = var25;
                                this.method4315(var24, -124, var26, var5, var22, var23, var7 + var9);
                                var9 = var25;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        } catch (RuntimeException var48) {
            throw class665.method4799(var48, field8416[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V")
    public class582() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
    private final void method4315(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        try {
            ++field8407;
            int var8 = ~this.field8414 < -1 ? -class70.method723(arg4, this.field8414, (byte) 58) + 4096 : 4096;
            int var9 = this.field8408 * this.field8405 >> 12;
            int var10 = this.field8408 + -(var9 <= 0 ? 0 : class70.method723(arg4, var9, (byte) 58));
            if (~arg6 <= ~class110.field1436) {
                arg6 -= class110.field1436;
            }
            if (arg1 < -122) {
                if (~var10 >= -1) {
                    if (~(arg6 - -arg5) >= ~class110.field1436) {
                        for (int var11 = 0; var11 < arg0; ++var11) {
                            class569.method4243(arg3[arg2 - -var11], arg6, arg5, var8);
                        }
                    } else {
                        int var12 = -arg6 + class110.field1436;
                        for (int var13 = 0; ~arg0 < ~var13; ++var13) {
                            int[] var14 = arg3[arg2 + var13];
                            class569.method4243(var14, arg6, var12, var8);
                            class569.method4243(var14, 0, -var12 + arg5, var8);
                        }
                    }
                } else if (arg0 > 0 && ~arg5 < -1) {
                    int var15 = arg5 / 2;
                    int var16 = arg0 / 2;
                    int var17 = ~var10 < ~var15 ? var15 : var10;
                    int var18 = var10 <= var16 ? var10 : var16;
                    int var19 = arg6 + var17;
                    int var20 = -(var17 * 2) + arg5;
                    for (int var21 = 0; var21 < arg0; ++var21) {
                        int[] var22 = arg3[arg2 + var21];
                        if (var21 < var18) {
                            int var23 = var8 * var21 / var18;
                            if (this.field8411 == 0) {
                                for (int var24 = 0; var17 > var24; ++var24) {
                                    int var25 = var8 * var24 / var17;
                                    var22[class434.method3377(class247.field3543, arg6 + var24)] = var22[class434.method3377(class247.field3543, arg5 + arg6 - var24 - 1)] = var23 * var25 >> 12;
                                }
                            } else {
                                for (int var26 = 0; var17 > var26; ++var26) {
                                    int var27 = var8 * var26 / var17;
                                    var22[class434.method3377(arg6 + var26, class247.field3543)] = var22[class434.method3377(arg6 - 1 + arg5 + -var26, class247.field3543)] = var27 >= var23 ? var23 : var27;
                                }
                            }
                            if (var19 + var20 <= class110.field1436) {
                                class569.method4243(var22, var19, var20, var23);
                            } else {
                                int var28 = -var19 + class110.field1436;
                                class569.method4243(var22, var19, var28, var23);
                                class569.method4243(var22, 0, -var28 + var20, var23);
                            }
                        } else {
                            int var29 = -var21 + -1 + arg0;
                            if (var29 < var18) {
                                int var30 = var8 * var29 / var18;
                                if (~this.field8411 != -1) {
                                    for (int var31 = 0; var31 < var17; ++var31) {
                                        int var32 = var8 * var31 / var17;
                                        var22[class434.method3377(arg6 - -var31, class247.field3543)] = var22[class434.method3377(-var31 + arg5 + -1 + arg6, class247.field3543)] = var30 <= var32 ? var30 : var32;
                                    }
                                } else {
                                    for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                        int var34 = var8 * var33 / var17;
                                        var22[class434.method3377(arg6 + var33, class247.field3543)] = var22[class434.method3377(class247.field3543, -var33 + -1 + arg5 + arg6)] = var30 * var34 >> 12;
                                    }
                                }
                                if (~class110.field1436 <= ~(var19 - -var20)) {
                                    class569.method4243(var22, var19, var20, var30);
                                } else {
                                    int var35 = -var19 + class110.field1436;
                                    class569.method4243(var22, var19, var35, var30);
                                    class569.method4243(var22, 0, -var35 + var20, var30);
                                }
                            } else {
                                for (int var36 = 0; ~var17 < ~var36; ++var36) {
                                    var22[class434.method3377(class247.field3543, arg6 + var36)] = var22[class434.method3377(class247.field3543, -var36 + -1 + arg5 + arg6)] = var8 * var36 / var17;
                                }
                                if (~class110.field1436 > ~(var19 + var20)) {
                                    int var37 = -var19 + class110.field1436;
                                    class569.method4243(var22, var19, var37, var8);
                                    class569.method4243(var22, 0, var20 - var37, var8);
                                } else {
                                    class569.method4243(var22, var19, var20, var8);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var39) {
            throw class665.method4799(var39, field8416[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8416[2] : field8416[1]) + ',' + (arg4 != null ? field8416[2] : field8416[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            ++field8403;
            if (arg0 <= 38) {
                this.method12(-68);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8416[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4316(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4317(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

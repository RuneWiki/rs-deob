import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class334 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[B")
    private byte[] field5195;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
    private int[] field5192;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    private int[] field5197;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[C")
    public static char[] field5194 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field5199 = 255;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "S")
    public static short field5200 = 256;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5190 = "Connecting to update server";

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5201 = "Discard";

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[I")
    public static int[] field5191;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII[BI[B)I", line = 4)
    public final int method2324(byte arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field5196++;
        int var7 = arg2 + arg4;
        int var8 = 0;
        if (arg0 >= -26) {
            return -19;
        }
        int var9 = arg1 << 3;
        while (var7 > arg4) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field5192[var10];
            byte var12 = this.field5195[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = (var12 + var13 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg3[var15] = (byte) (var8 = class276.method1810(var14, var11 >>> var17));
            if (var15 < var16) {
                var15++;
                var13 = var17 - 8;
                arg3[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var13 -= 8;
                    var15++;
                    arg3[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var13 -= 8;
                        var15++;
                        arg3[var15] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var15) {
                            var15++;
                            var13 -= 8;
                            arg3[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            var9 += var12;
            arg4++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 86)
    public static void method2325(int arg0) {
        field5194 = null;
        field5201 = null;
        field5190 = null;
        field5191 = null;
        if (arg0 != 25440) {
            method2325(24);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILg;BI)Lg;", line = 105)
    public static final class295 method2326(int arg0, int arg1, int arg2, int arg3, class295 arg4, byte arg5, int arg6) {
        long var7 = (long) arg0;
        field5198++;
        class295 var9 = (class295) class78.field1162.method1294(var7, 118);
        if (var9 == null) {
            class114 var10 = class114.method782(class54.field762, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method769(64, 768, -50, -10, -50);
            class78.field1162.method1292(var7, -89, var9);
        }
        if (arg5 > -17) {
            field5200 = -115;
        }
        int var11 = arg4.method957();
        int var12 = arg4.method980();
        int var13 = arg4.method966();
        int var14 = arg4.method967();
        class295 var15 = var9.method981(true, true, true);
        if (arg1 != 0) {
            var15.method960(arg1);
        }
        if (class333.field5166) {
            class340 var18 = (class340) var15;
            if (class39.method286(class77.field1154, (byte) 82, arg3 + var11, arg6 - -var13) != arg2 || class39.method286(class77.field1154, (byte) 82, arg3 + var12, arg6 + var14) != arg2) {
                for (int var19 = 0; var19 < var18.field5279; var19++) {
                    var18.field5293[var19] += class39.method286(class77.field1154, (byte) 82, var18.field5298[var19] + arg3, var18.field5283[var19] + arg6) - arg2;
                }
                var18.field5270.field773 = false;
                var18.field5265.field4984 = false;
            }
        } else {
            class141 var16 = (class141) var15;
            if (arg2 != class39.method286(class77.field1154, (byte) 82, arg3 + var11, arg6 + var13) || class39.method286(class77.field1154, (byte) 82, arg3 + var12, arg6 + var14) != arg2) {
                for (int var17 = 0; var17 < var16.field2185; var17++) {
                    var16.field2179[var17] += class39.method286(class77.field1154, (byte) 82, var16.field2196[var17] + arg3, var16.field2187[var17] + arg6) - arg2;
                }
                var16.field2198 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([B[BIIIB)I", line = 195)
    public final int method2327(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5193++;
        if (arg3 == 0) {
            return 0;
        }
        if (arg5 != 108) {
            this.method2327((byte[]) null, (byte[]) null, -6, -91, 123, (byte) -59);
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg2;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field5197[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var12;
            if ((var12 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var13;
            if ((var13 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var14;
            if ((var14 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var15;
            if ((var15 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var15);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var16;
            if ((var16 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var17;
            if ((var17 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field5197[var7];
            }
            int var18;
            if ((var18 = this.field5197[var7]) < 0) {
                arg0[arg4++] = (byte) (~var18);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V", line = 344)
    public class334(byte[] arg0) {
        int var2 = arg0.length;
        this.field5195 = arg0;
        this.field5192 = new int[var2];
        this.field5197 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5192[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class276.method1810(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field5197[var14] == 0) {
                            this.field5197[var14] = var4;
                        }
                        var14 = this.field5197[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field5197.length) {
                        int[] var18 = new int[this.field5197.length * 2];
                        for (int var19 = 0; var19 < this.field5197.length; var19++) {
                            var18[var19] = this.field5197[var19];
                        }
                        this.field5197 = var18;
                    }
                }
                this.field5197[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

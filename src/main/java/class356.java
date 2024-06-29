import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class356 extends class424 {

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "[S")
    private short[] field4781 = new short[257];

    @OriginalMember(owner = "client!bo", name = "db", descriptor = "I")
    private int field4789 = 0;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field4776 = 0;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field4780 = -1;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "F")
    public static float field4785 = 1024.0F;

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
    public static int field4784 = 0;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!bo", name = "bb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!bo", name = "cb", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!bo", name = "eb", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!bo", name = "fb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "Lij;")
    public static class316 field4772;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "[I")
    private int[] field4777;

    @OriginalMember(owner = "client!bo", name = "ab", descriptor = "[I")
    private int[] field4786;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "[Z")
    public static boolean[] field4782;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "[[I")
    private int[][] field4778;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 4)
    public class356() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V", line = 11)
    public static void method2133(byte arg0) {
        int var1 = -17 % ((-84 - arg0) / 34);
        field4782 = null;
        field4772 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lrg;BI)V", line = 23)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field4791;
        if (arg1 != -48) {
            this.field4786 = null;
        }
        if (arg2 == 0) {
            this.field4789 = arg0.method2306((byte) 61);
            this.field4778 = new int[arg0.method2306((byte) 37)][2];
            for (int var4 = 0; ~var4 > ~this.field4778.length; ++var4) {
                this.field4778[var4][0] = arg0.method2297(13352);
                this.field4778[var4][1] = arg0.method2297(13352);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 50)
    public final void method113(int arg0) {
        ++field4773;
        if (this.field4778 == null) {
            this.field4778 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field4778.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field4789 == -3) {
                this.method2134(false);
            }
            if (arg0 != 3) {
                this.method43(10, (byte) 29);
            }
            class361.method2227(4096);
            this.method2136((byte) 65);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V", line = 72)
    private final void method2134(boolean arg0) {
        ++field4788;
        int[] var2 = this.field4778[0];
        if (arg0) {
            this.field4789 = -74;
        }
        int[] var3 = this.field4778[1];
        int[] var4 = this.field4778[this.field4778.length + -2];
        int[] var5 = this.field4778[this.field4778.length + -1];
        this.field4777 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field4786 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IB)[I", line = 103)
    public final int[] method43(int arg0, byte arg1) {
        ++field4774;
        int[] var3 = super.field5892.method783(arg0, (byte) -52);
        if (arg1 != -10) {
            this.method19((class366) null, (byte) -10, 50);
        }
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -117, arg0);
            for (int var5 = 0; class303.field4135 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4781[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;BILok;ILvg;IILci;Lde;II)V", line = 146)
    public static final void method2135(String arg0, byte arg1, int arg2, class61 arg3, int arg4, class108 arg5, int arg6, int arg7, class389 arg8, class165 arg9, int arg10, int arg11) {
        ++field4787;
        int var12;
        if (~class26.field337 == -5) {
            var12 = (int) class332.field4483 & 16383;
        } else {
            var12 = (int) class332.field4483 - -class19.field249 & 16383;
        }
        if (arg1 < -114) {
            int var13 = Math.max(arg5.field1568 / 2, arg5.field1577 / 2) - -10;
            int var14 = arg6 * arg6 - -(arg10 * arg10);
            if (var14 <= var13 * var13) {
                int var15 = class136.field2021[var12];
                int var16 = class136.field2020[var12];
                if (class26.field337 != 4) {
                    var15 = var15 * 256 / (class129.field1950 + 256);
                    var16 = var16 * 256 / (class129.field1950 - -256);
                }
                int var17 = arg6 * var16 + arg10 * var15 >> 15;
                int var18 = arg10 * var16 + -(arg6 * var15) >> 15;
                int var19 = arg8.method2421(arg0, (class77[]) null, (byte) 113, 100);
                int var20 = arg8.method2424(0, (class77[]) null, arg0, 100, (byte) -113);
                int var21 = var17 - var19 / 2;
                if (~var21 <= ~(-arg5.field1568) && var21 <= arg5.field1568 && ~var18 <= ~(-arg5.field1577) && ~arg5.field1577 <= ~var18) {
                    arg3.method490(0, 0, arg0, arg7, 0, 50, 1, (int[]) null, arg5.field1568 / 2 + arg11 + var21, (byte) -107, arg9, (class77[]) null, arg5.field1577 / 2 + arg2 + -var18 - arg4 + -var20, arg2, arg11, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V", line = 199)
    private final void method2136(byte arg0) {
        int var2 = this.field4789;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field4778.length + -1 && ~this.field4778[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field4778[var5 + -1];
                    int[] var7 = this.field4778[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class62.field843[(var8 & 8167) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4781[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field4778.length + -1) < ~var14 && ~this.field4778[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field4778[var14 + -1];
                    int[] var16 = this.field4778[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field4781[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4778.length + -1 && this.field4778[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field4778[var22 + -1];
                int[] var24 = this.field4778[var22];
                int var25 = this.method2139((byte) 85, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2139((byte) 85, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 + -var25;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + var35 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4781[var20] = (short) var38;
            }
        }
        ++field4783;
        if (arg0 != 65) {
            this.field4777 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 380)
    public static final String method2137(byte arg0, int arg1) {
        ++field4775;
        if (arg0 < 9) {
            method2135((String) null, (byte) 18, 101, (class61) null, -18, (class108) null, 39, -126, (class389) null, (class165) null, -61, -6);
        }
        return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + (255 & arg1 >> 8) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB[I[Ljava/lang/Object;)V", line = 395)
    public static final void method2138(int arg0, int arg1, byte arg2, int[] arg3, Object[] arg4) {
        if (arg2 != -108) {
            field4782 = null;
        }
        if (~arg0 > ~arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; ++var9) {
                if (~(var7 - -(1 & var9)) < ~arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method2138(arg0, var6 - 1, (byte) -108, arg3, arg4);
            method2138(var6 - -1, arg1, (byte) -108, arg3, arg4);
        }
        ++field4779;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(BI)[I", line = 450)
    private final int[] method2139(byte arg0, int arg1) {
        if (arg0 != 85) {
            field4780 = -89;
        }
        ++field4790;
        if (arg1 < 0) {
            return this.field4777;
        } else {
            return ~arg1 <= ~this.field4778.length ? this.field4786 : this.field4778[arg1];
        }
    }
}

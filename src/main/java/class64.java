import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class64 extends class424 {

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    private int field875 = 1;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    private int field880 = 1;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
    public static int[] field877 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "Lle;")
    public static class65 field883 = new class65(64);

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V", line = 3)
    public static void method511(boolean arg0) {
        field883 = null;
        field877 = null;
        if (!arg0) {
            field884 = 70;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[[I", line = 23)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field878;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int var4 = this.field875 + 1 + this.field875;
            int var5 = 65536 / var4;
            int var6 = this.field880 + 1 + this.field880;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field875 + arg0; arg0 - -this.field875 >= var9; ++var9) {
                int[][] var19 = this.method2624(arg1, 0, var9 & class174.field2484);
                int[][] var20 = new int[3][class303.field4135];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field880; ~this.field880 <= ~var27; ++var27) {
                    int var37 = var27 & class65.field898;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class303.field4135) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field880 + var31 & class65.field898;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = this.field880 + var31 & class65.field898;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var35;
                }
                var8[var9 - -this.field875 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class303.field4135 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 157)
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lrg;BI)V", line = 161)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field5893 = ~arg0.method2306((byte) 46) == -2;
                }
            } else {
                this.field875 = arg0.method2306((byte) 40);
            }
        } else {
            this.field880 = arg0.method2306((byte) 116);
        }
        if (arg1 != -48) {
            method513((Frame) null, 33, (class76) null);
        }
        ++field876;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)[I", line = 204)
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            return null;
        } else {
            ++field879;
            int[] var3 = super.field5892.method783(arg0, (byte) -82);
            if (super.field5892.field1427) {
                int var4 = this.field875 + this.field875 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field880 + this.field880 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field875 + arg0; ~var9 >= ~(this.field875 + arg0); ++var9) {
                    int[] var13 = this.method2621(0, arg1 + -114, class174.field2484 & var9);
                    int[] var14 = new int[class303.field4135];
                    int var15 = 0;
                    for (int var16 = -this.field880; this.field880 >= var16; ++var16) {
                        var15 += var13[var16 & class65.field898];
                    }
                    int var17 = 0;
                    while (~var17 > ~class303.field4135) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field880 + var17 & class65.field898];
                        ++var17;
                        var15 = var13[class65.field898 & this.field880 + var17] + var18;
                    }
                    var8[var9 - -this.field875 - arg0] = var14;
                }
                for (int var10 = 0; class303.field4135 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 291)
    public static final String method512(byte arg0, Throwable arg1) throws IOException {
        ++field881;
        if (arg0 != 73) {
            return null;
        } else {
            String var3;
            if (arg1 instanceof class345) {
                class345 var2 = (class345) arg1;
                arg1 = var2.field4666;
                var3 = var2.field4662 + " | ";
            } else {
                var3 = "";
            }
            StringWriter var4 = new StringWriter();
            PrintWriter var5 = new PrintWriter(var4);
            arg1.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 - -1);
                String var12;
                if (~var10 == 0) {
                    var12 = var9;
                } else {
                    var12 = var9.substring(0, var10);
                }
                String var13 = var12.trim();
                String var14 = var13.substring(1 + var13.lastIndexOf(32));
                String var15 = var14.substring(var14.lastIndexOf(9) + 1);
                String var16 = var3 + var15;
                if (var10 != -1 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (~var17 <= -1) {
                        var16 = var16 + var9.substring(var17 - -5, var11);
                    }
                }
                var3 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Frame;ILne;)V", line = 365)
    public static final void method513(Frame arg0, int arg1, class76 arg2) {
        ++field882;
        while (true) {
            class285 var3 = arg2.method594(arg1 + 19907, arg0);
            while (var3.field3875 == 0) {
                class328.method1999(0, 10L);
            }
            if (~var3.field3875 == -2) {
                arg0.setVisible(false);
                if (arg1 != -2) {
                    return;
                }
                arg0.dispose();
                return;
            }
            class328.method1999(0, 100L);
        }
    }
}

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class56 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field857 = -2;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field865 = 500;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field864 = "Checking for updates - ";

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field860;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[[[B")
    public static byte[][][] field867;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 6)
    public static void method419(int arg0) {
        if (arg0 < 64) {
            field863 = -106;
        }
        field864 = null;
        field867 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([[FLjb;III[[IIIBIZI[[FBI[[F)V", line = 19)
    public static final void method420(float[][] arg0, class226 arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6, int arg7, byte arg8, int arg9, boolean arg10, int arg11, float[][] arg12, byte arg13, int arg14, float[][] arg15) {
        field861++;
        int var16 = (arg2 << 8) + 255;
        int var17 = (arg7 << 8) + 255;
        int var18 = (arg9 << 8) + 255;
        int[] var19 = class146.field2357[arg13];
        int[] var20 = null;
        int var21 = (arg11 << 8) + 255;
        int[] var22 = new int[var19.length >> 1];
        for (int var23 = arg6; var23 < var22.length; var23++) {
            var22[var23] = class196.method1340(arg8, arg0, false, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, var19[var23 + var23], var19[var23 + var23 + 1], (int[][]) null);
        }
        if (arg10) {
            if (arg13 == 1) {
                var20 = new int[6];
                int var25 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 64, 128, (int[][]) null);
                int var26 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 64, (int[][]) null);
                var20[2] = var22[2];
                var20[5] = var22[2];
                var20[1] = var25;
                var20[3] = var25;
                var20[0] = var26;
                var20[4] = var22[0];
            } else if (arg13 == 2) {
                var20 = new int[6];
                int var42 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 ^ 0xFFFFA9B1, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 128, (int[][]) null);
                int var43 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 64, 0, (int[][]) null);
                var20[2] = var42;
                var20[0] = var22[0];
                var20[1] = var43;
                var20[4] = var22[1];
                var20[5] = var22[0];
                var20[3] = var42;
            } else if (arg13 == 3) {
                var20 = new int[6];
                int var40 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 ^ 0xFFFFA9B1, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 128, (int[][]) null);
                int var41 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 64, 0, (int[][]) null);
                var20[3] = var40;
                var20[0] = var22[2];
                var20[1] = var22[1];
                var20[4] = var41;
                var20[2] = var40;
                var20[5] = var22[2];
            } else if (arg13 == 4) {
                var20 = new int[3];
                int var39 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 128, (int[][]) null);
                var20[1] = var39;
                var20[0] = var22[3];
                var20[2] = var22[0];
            } else if (arg13 == 5) {
                var20 = new int[3];
                int var38 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 - 22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 128, (int[][]) null);
                var20[0] = var22[2];
                var20[2] = var22[3];
                var20[1] = var38;
            } else if (arg13 == 6) {
                var20 = new int[6];
                int var36 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 - 22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 0, (int[][]) null);
                int var37 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 128, (int[][]) null);
                var20[0] = var22[3];
                var20[4] = var22[0];
                var20[1] = var36;
                var20[3] = var37;
                var20[5] = var22[3];
                var20[2] = var37;
            } else if (arg13 == 7) {
                var20 = new int[6];
                int var27 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 128, (int[][]) null);
                int var28 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 0, (int[][]) null);
                var20[2] = var27;
                var20[3] = var27;
                var20[0] = var22[1];
                var20[1] = var28;
                var20[5] = var22[1];
                var20[4] = var22[2];
            } else if (arg13 == 8) {
                var20 = new int[3];
                int var35 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 - 22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 0, (int[][]) null);
                var20[2] = var22[4];
                var20[0] = var22[3];
                var20[1] = var35;
            } else if (arg13 == 9) {
                var20 = new int[15];
                int var32 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 64, (int[][]) null);
                int var33 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, arg6 ^ 0xFFFFA9B1, arg12, var17, arg5, 0.0F, arg14, var16, var18, 96, 32, (int[][]) null);
                int var34 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 64, 0, (int[][]) null);
                var20[3] = var33;
                var20[9] = var33;
                var20[0] = var33;
                var20[7] = var22[3];
                var20[6] = var33;
                var20[2] = var22[4];
                var20[14] = var34;
                var20[12] = var33;
                var20[5] = var22[3];
                var20[10] = var22[2];
                var20[4] = var22[4];
                var20[8] = var22[2];
                var20[1] = var32;
                var20[11] = var22[1];
                var20[13] = var22[1];
            } else if (arg13 == 10) {
                var20 = new int[9];
                int var29 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 128, (int[][]) null);
                var20[0] = var22[2];
                var20[4] = var29;
                var20[2] = var22[3];
                var20[8] = var22[0];
                var20[3] = var22[3];
                var20[1] = var29;
                var20[5] = var22[4];
                var20[7] = var29;
                var20[6] = var22[4];
            } else if (arg13 == 11) {
                int var30 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 0, 64, (int[][]) null);
                var20 = new int[12];
                int var31 = class196.method1340(arg8, arg0, true, arg1, arg15, var21, arg3, -22095, arg12, var17, arg5, 0.0F, arg14, var16, var18, 128, 64, (int[][]) null);
                var20[5] = var30;
                var20[8] = var30;
                var20[0] = var22[3];
                var20[11] = var31;
                var20[3] = var22[3];
                var20[1] = var30;
                var20[7] = var31;
                var20[10] = var22[1];
                var20[2] = var22[0];
                var20[4] = var22[2];
                var20[6] = var22[2];
                var20[9] = var22[2];
            }
        }
        arg1.method1531(arg4, arg3, arg14, var22, var20, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Z", line = 296)
    public static final boolean method421(int arg0, byte arg1) {
        field866++;
        if (arg1 == 74) {
            class92.field1356 = arg0 + 1 & 0xFFFF;
            class253.field4016 = true;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lkl;Z)V", line = 312)
    public static final void method422(class39 arg0, boolean arg1) {
        field859++;
        class250 var2 = (class250) class109.field1586.method29(class265.method1872(arg0.field597, 63), 103);
        if (var2 == null) {
            class358.method2492(-96, arg0.field4757[0], arg0.field4762[0], (class233) null, class120.field1779, 0, arg0, (class126) null);
        } else {
            var2.method1776((byte) 124);
        }
        if (arg1) {
            field856 = -5;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILfh;[B)V", line = 336)
    public final void method423(int arg0, class313 arg1, byte[] arg2) {
        field858++;
        if (arg1.field5124[arg1.field5137] != 31 || arg1.field5124[arg1.field5137 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field860 == null) {
            this.field860 = new Inflater(true);
        }
        try {
            this.field860.setInput(arg1.field5124, arg1.field5137 + 10, -10 - (arg1.field5137 + 8 - arg1.field5124.length));
            this.field860.inflate(arg2);
            if (arg0 != 23522) {
                field863 = -29;
            }
        } catch (Exception var5) {
            this.field860.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field860.reset();
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 365)
    public class56() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 380)
    public static final void method424(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class217.field3348; var3++) {
            for (int var4 = 0; var4 < class263.field4155; var4++) {
                for (int var5 = 0; var5 < class163.field2590; var5++) {
                    class50 var6 = class264.field4230[var3][var4][var5];
                    if (var6 != null) {
                        class257 var7 = var6.field732;
                        if (var7 != null && var7.field4070.method175()) {
                            class350.method2453(var7.field4070, var3, var4, var5, 1, 1);
                            if (var7.field4059 != null && var7.field4059.method175()) {
                                class350.method2453(var7.field4059, var3, var4, var5, 1, 1);
                                var7.field4070.method185(var7.field4059, 0, 0, 0, false);
                                var7.field4059 = var7.field4059.method156(arg0, arg1, arg2);
                            }
                            var7.field4070 = var7.field4070.method156(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field735; var8++) {
                            class258 var9 = var6.field752[var8];
                            if (var9 != null && var9.field4071.method175()) {
                                class350.method2453(var9.field4071, var3, var4, var5, var9.field4084 + 1 - var9.field4082, var9.field4077 - var9.field4081 + 1);
                                var9.field4071 = var9.field4071.method156(arg0, arg1, arg2);
                            }
                        }
                        class86 var10 = var6.field733;
                        if (var10 != null && var10.field1235.method175()) {
                            class304.method2130(var10.field1235, var3, var4, var5);
                            var10.field1235 = var10.field1235.method156(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(III)V", line = 455)
    private class56(int arg0, int arg1, int arg2) {
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class609 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[[I")
    private int[][] field8354;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field8350;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    private int field8355;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[[I")
    public static int[][] field8356 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lhg;")
    public static class691[] field8360 = new class691[14];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Z")
    public static boolean[] field8353;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[S)[S")
    public final short[] method3460(int arg0, short[] arg1) {
        field8362++;
        int var3 = 14 % ((arg0 - 48) / 33);
        if (this.field8354 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field8350 / (long) this.field8355) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                short var11 = arg1[var8];
                int[] var12 = this.field8354[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11 >> 2;
                }
                int var14 = this.field8350 + var7;
                int var15 = var14 / this.field8355;
                var7 = var14 - this.field8355 * var15;
                var6 += var15;
            }
            arg1 = new short[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 8192 >> 14;
                if (var10 < -32768) {
                    arg1[var9] = -32768;
                } else if (var10 > 32767) {
                    arg1[var9] = 32767;
                } else {
                    arg1[var9] = (short) var10;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ldfa;")
    public static final class167 method3461(int arg0) {
        if (arg0 == -17096) {
            field8359++;
            return class489.field6765;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
    public final int method3462(int arg0, byte arg1) {
        if (arg1 != -85) {
            return 59;
        }
        field8351++;
        if (this.field8354 != null) {
            arg0 = (int) ((long) this.field8350 * (long) arg0 / (long) this.field8355);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method3463(int arg0) {
        field8357++;
        class112 var1 = class755.field10551;
        synchronized (class755.field10551) {
            class755.field10551.method996(-86);
            if (arg0 != 0) {
                method3468(25);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)[B")
    public final byte[] method3464(byte[] arg0, int arg1) {
        if (arg1 != 1) {
            method3468(71);
        }
        field8358++;
        if (this.field8354 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field8350 / (long) this.field8355) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field8354[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8350 + var6;
                int var14 = var13 / this.field8355;
                var6 = var13 - this.field8355 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IZ)Ljava/lang/String;")
    public static final String method3465(int[] arg0, boolean arg1) {
        field8352++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class315.field4365;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class467 var5 = class72.field1327.method1354(-12637, arg0[var4]);
            if (var5.field6542 != -1) {
                class496 var6 = (class496) class699.field9442.method992((long) var5.field6542, -74);
                if (var6 == null) {
                    class267 var7 = class267.method1780(class569.field7819, var5.field6542, 0);
                    if (var7 != null) {
                        var6 = class272.field3822.method356(var7, true);
                        class699.field9442.method991(var6, (long) var5.field6542, (byte) -127);
                    }
                }
                if (var6 != null) {
                    class236.field3436[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (!arg1) {
            field8353 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lks;)V")
    public static final void method3466(class440 arg0) {
        class545.field7511 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method3467(int arg0, int arg1) {
        int var3 = 26 % ((arg0 + 29) / 32);
        field8361++;
        if (this.field8354 != null) {
            arg1 = (int) ((long) this.field8350 * (long) arg1 / (long) this.field8355) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(II)V")
    public class609(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class465.method2737(-21806, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field8354 = new int[var4][14];
            this.field8350 = var5;
            this.field8355 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field8354[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method3468(int arg0) {
        int var1 = 101 % ((arg0 + 20) / 49);
        field8360 = null;
        field8356 = null;
        field8353 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class101 implements Runnable {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Z")
    public boolean field1841 = true;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1839 = new Object();

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[I")
    public int[] field1848 = new int[500];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    public int[] field1846 = new int[500];

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field1845 = 0;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1840 = 20;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1849 = 1;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZIII)V", line = 6)
    public static final void method761(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            method766(-37, -28, 1);
        }
        class103.field1901 = arg0;
        class49.field1023 = arg3;
        class281.field4604 = arg5;
        class269.field4378 = arg4;
        field1835++;
        class260.field4254 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "run", descriptor = "()V", line = 22)
    public final void run() {
        field1834++;
        while (this.field1841) {
            Object var1 = this.field1839;
            synchronized (this.field1839) {
                if (this.field1845 < 500) {
                    this.field1846[this.field1845] = class73.field1339;
                    this.field1848[this.field1845] = class26.field662;
                    this.field1845++;
                }
            }
            class122.method881(-90, 50L);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([[FLwl;ZI[[IIBBII[[F[[FIBII)V", line = 47)
    public static final void method762(float[][] arg0, class102 arg1, boolean arg2, int arg3, int[][] arg4, int arg5, byte arg6, byte arg7, int arg8, int arg9, float[][] arg10, float[][] arg11, int arg12, byte arg13, int arg14, int arg15) {
        field1843++;
        int var16 = (arg15 << 8) + 255;
        if (arg7 < 72) {
            return;
        }
        int var17 = (arg14 << 8) + 255;
        int var18 = (arg9 << 8) + 255;
        int[] var19 = class356.field5674[arg13];
        int[] var20 = null;
        int var21 = (arg8 << 8) + 255;
        int[] var22 = new int[var19.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class205.method1397((int[][]) null, arg11, false, 0.0F, var16, var19[var23 + var23 + 1], arg10, arg5, (byte) 83, var18, arg4, var17, arg6, arg3, var19[var23 + var23], arg1, var21, arg0);
        }
        if (arg2) {
            if (arg13 == 1) {
                int var42 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 61, var18, arg4, var17, arg6, arg3, 64, arg1, var21, arg0);
                var20 = new int[6];
                int var43 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 64, arg10, arg5, (byte) 53, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                var20[3] = var42;
                var20[1] = var42;
                var20[2] = var22[2];
                var20[5] = var22[2];
                var20[0] = var43;
                var20[4] = var22[0];
            } else if (arg13 == 2) {
                var20 = new int[6];
                int var40 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 72, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                int var41 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 82, var18, arg4, var17, arg6, arg3, 64, arg1, var21, arg0);
                var20[3] = var40;
                var20[2] = var40;
                var20[1] = var41;
                var20[0] = var22[0];
                var20[4] = var22[1];
                var20[5] = var22[0];
            } else if (arg13 == 3) {
                var20 = new int[6];
                int var25 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 50, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                int var26 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 124, var18, arg4, var17, arg6, arg3, 64, arg1, var21, arg0);
                var20[1] = var22[1];
                var20[4] = var26;
                var20[3] = var25;
                var20[0] = var22[2];
                var20[2] = var25;
                var20[5] = var22[2];
            } else if (arg13 == 4) {
                var20 = new int[3];
                int var39 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 97, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                var20[1] = var39;
                var20[0] = var22[3];
                var20[2] = var22[0];
            } else if (arg13 == 5) {
                var20 = new int[3];
                int var38 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 16, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                var20[1] = var38;
                var20[0] = var22[2];
                var20[2] = var22[3];
            } else if (arg13 == 6) {
                int var36 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 109, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                int var37 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 54, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                var20 = new int[] { var22[3], var36, var37, var37, var22[0], var22[3] };
            } else if (arg13 == 7) {
                var20 = new int[6];
                int var27 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 115, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                int var28 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 10, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                var20[0] = var22[1];
                var20[3] = var27;
                var20[2] = var27;
                var20[4] = var22[2];
                var20[1] = var28;
                var20[5] = var22[1];
            } else if (arg13 == 8) {
                var20 = new int[3];
                int var29 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 53, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                var20[1] = var29;
                var20[2] = var22[4];
                var20[0] = var22[3];
            } else if (arg13 == 9) {
                var20 = new int[15];
                int var30 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 64, arg10, arg5, (byte) 114, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                int var31 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 32, arg10, arg5, (byte) 115, var18, arg4, var17, arg6, arg3, 96, arg1, var21, arg0);
                int var32 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 0, arg10, arg5, (byte) 102, var18, arg4, var17, arg6, arg3, 64, arg1, var21, arg0);
                var20[6] = var31;
                var20[12] = var31;
                var20[0] = var31;
                var20[1] = var30;
                var20[14] = var32;
                var20[13] = var22[1];
                var20[3] = var31;
                var20[2] = var22[4];
                var20[8] = var22[2];
                var20[5] = var22[3];
                var20[11] = var22[1];
                var20[4] = var22[4];
                var20[9] = var31;
                var20[7] = var22[3];
                var20[10] = var22[2];
            } else if (arg13 == 10) {
                var20 = new int[9];
                int var35 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 128, arg10, arg5, (byte) 115, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                var20[0] = var22[2];
                var20[1] = var35;
                var20[7] = var35;
                var20[2] = var22[3];
                var20[8] = var22[0];
                var20[3] = var22[3];
                var20[4] = var35;
                var20[6] = var22[4];
                var20[5] = var22[4];
            } else if (arg13 == 11) {
                var20 = new int[12];
                int var33 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 64, arg10, arg5, (byte) 17, var18, arg4, var17, arg6, arg3, 0, arg1, var21, arg0);
                int var34 = class205.method1397((int[][]) null, arg11, true, 0.0F, var16, 64, arg10, arg5, (byte) 14, var18, arg4, var17, arg6, arg3, 128, arg1, var21, arg0);
                var20[11] = var34;
                var20[5] = var33;
                var20[0] = var22[3];
                var20[7] = var34;
                var20[3] = var22[3];
                var20[2] = var22[0];
                var20[9] = var22[2];
                var20[8] = var33;
                var20[6] = var22[2];
                var20[1] = var33;
                var20[4] = var22[2];
                var20[10] = var22[1];
            }
        }
        arg1.method771(arg12, arg5, arg3, var22, var20, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)I", line = 330)
    public static final int method763(int arg0, int arg1, byte arg2) {
        if (arg2 < 17) {
            field1849 = 76;
        }
        int var3 = class112.method839(789221, arg1 - 1, arg0 + -1) + class112.method839(789221, arg1 - 1, arg0 - -1) - (-class112.method839(789221, arg1 + 1, arg0 + -1) - class112.method839(789221, arg1 + 1, arg0 + 1));
        field1847++;
        int var4 = class112.method839(789221, arg1, arg0 - 1) + class112.method839(789221, arg1, arg0 + 1) + (class112.method839(789221, arg1 - 1, arg0) - -class112.method839(789221, arg1 + 1, arg0));
        int var5 = class112.method839(789221, arg1, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V", line = 347)
    public static final void method764(byte arg0, int arg1, int arg2) {
        field1837++;
        if (class26.field672 != arg2) {
            class21.field539 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class21.field539[var3] = (var3 << 12) / arg2;
            }
            class26.field672 = arg2;
            class53.field1056 = arg2 - 1;
            class347.field5536 = arg2 * 32;
        }
        if (arg0 >= -100) {
            field1849 = -60;
        }
        if (class334.field5323 == arg1) {
            return;
        }
        if (class26.field672 == arg1) {
            class248.field4066 = class21.field539;
        } else {
            class248.field4066 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class248.field4066[var4] = (var4 << 12) / arg1;
            }
        }
        class334.field5323 = arg1;
        class194.field3266 = arg1 - 1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 398)
    public static final int method765(String arg0, int arg1, int arg2, String arg3) {
        if (arg2 != 3) {
            field1849 = -103;
        }
        int var4 = arg3.length();
        int var5 = 0;
        int var6 = arg0.length();
        field1838++;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var5 - var8 || var6 > (var7 - var9)) {
            if (var4 <= var5 - var8) {
                return -1;
            }
            if (var6 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class190.method1316(var22, arg2 ^ 0x49B3);
            var9 = class190.method1316(var24, arg2 + 18861);
            char var26 = class86.method659(true, var22, arg1);
            char var27 = class86.method659(true, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class181.method1275(arg1, arg2 + 1759, var28) - class181.method1275(arg1, 1762, var29);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg1 == 2) {
                var13 = var4 - var11 - 1;
                var12 = var6 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class181.method1275(arg1, 1762, var16) - class181.method1275(arg1, arg2 ^ 0x6E1, var17);
                }
            }
        }
        int var18 = var4 - var6;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg3.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class181.method1275(arg1, 1762, var20) - class181.method1275(arg1, 1762, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I", line = 520)
    public static final int method766(int arg0, int arg1, int arg2) {
        class353 var3 = (class353) class216.field3591.method2344(arg2, (long) arg0);
        field1842++;
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field5642.length) {
            return var3.field5642[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)V", line = 537)
    public static final void method767(int arg0, byte arg1) {
        field1836++;
        class341.field5402.method896(arg0, (byte) -39);
        if (arg1 >= 121) {
            class44.field906.method896(arg0, (byte) -72);
        }
    }
}

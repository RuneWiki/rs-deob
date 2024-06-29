import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class121 extends class308 {

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "[I")
    private int[] field1803;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "[I")
    private int[] field1818;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Lie;")
    private class3 field1812;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Lie;")
    private class3 field1798;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "Lie;")
    private class3 field1811;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "[Lie;")
    private class3[] field1810;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1802 = "wishes to trade with you.";

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Z")
    public static boolean field1814 = true;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "[[S")
    public static short[][] field1805 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "[[Ljb;")
    public static class226[][] field1808;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "[[Z")
    public static boolean[][] field1815;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(DZLnm;IILeh;B)Lle;", line = 9)
    public final class137 method781(double arg0, boolean arg1, class221 arg2, int arg3, int arg4, class164 arg5, byte arg6) {
        field1813++;
        class151.method1099(0, arg0);
        class259.field4101 = arg5;
        class116.field1698 = arg2;
        class46.method353(arg4, -1, arg3);
        class137 var9 = new class137(arg3, arg4);
        for (int var10 = 0; var10 < this.field1810.length; var10++) {
            this.field1810[var10].method23(-121, arg3, arg4);
        }
        int var11 = 0;
        int var12 = 105 / ((51 - arg6) / 37);
        for (int var13 = 0; var13 < arg4; var13++) {
            if (arg1) {
                var11 = var13;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1798.field34) {
                int[] var18 = this.field1798.method25((byte) 79, var13);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field1798.method22(-21194, var13);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var23 = class18.field220[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var24 = class18.field220[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class18.field220[var22];
                var9.field2172[var11++] = (var25 << 8) + ((var24 << 16) + var23);
                if (arg1) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var26 = 0; var26 < this.field1810.length; var26++) {
            this.field1810[var26].method18((byte) -123);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZB)C", line = 123)
    public static final char method782(boolean arg0, byte arg1) {
        field1816++;
        if (arg0) {
            field1804 = -91;
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class262.field4130[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZIILnm;Leh;)[F", line = 158)
    public final float[] method783(byte arg0, boolean arg1, int arg2, int arg3, class221 arg4, class164 arg5) {
        class259.field4101 = arg5;
        field1817++;
        float[] var7 = new float[arg2 * 4 * arg3];
        class116.field1698 = arg4;
        class46.method353(arg3, arg0 ^ 0xFFFFFFC2, arg2);
        for (int var8 = 0; var8 < this.field1810.length; var8++) {
            this.field1810[var8].method23(-104, arg2, arg3);
        }
        if (arg0 != 61) {
            return (float[]) null;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field1798.field34) {
                int[] var15 = this.field1798.method25((byte) 77, var10);
                var13 = var15;
                var14 = var15;
                var12 = var15;
            } else {
                int[][] var11 = this.field1798.method22(arg0 ^ 0xFFFFAD0B, var10);
                var12 = var11[2];
                var13 = var11[0];
                var14 = var11[1];
            }
            int[] var16;
            if (this.field1811.field34) {
                var16 = this.field1811.method25((byte) 86, var10);
            } else {
                var16 = this.field1811.method22(-21194, var10)[0];
            }
            int[] var17;
            if (this.field1812.field34) {
                var17 = this.field1812.method25((byte) 104, var10);
            } else {
                var17 = this.field1812.method22(-21194, var10)[0];
            }
            for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = var19;
                if (arg1) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field1810.length; var21++) {
            this.field1810[var21].method18((byte) -119);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIILs;I)V", line = 273)
    public static final void method784(int arg0, int arg1, int arg2, class126 arg3, int arg4) {
        if (arg0 != -4543) {
            field1815 = (boolean[][]) ((boolean[][]) null);
        }
        field1797++;
        for (class250 var5 = (class250) class250.field3988.method1081(arg0 + 4464); var5 != null; var5 = (class250) class250.field3988.method1083((byte) 113)) {
            if (var5.field3978 == arg1 && arg4 * 128 == var5.field3987 && (arg2 * 128) == var5.field3989 && var5.field3986.field1924 == arg3.field1924) {
                if (var5.field3983 != null) {
                    class28.field434.method1412(var5.field3983);
                    var5.field3983 = null;
                }
                if (var5.field3985 != null) {
                    class28.field434.method1412(var5.field3985);
                    var5.field3985 = null;
                }
                var5.method1131(8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 310)
    public static final void method785(int arg0, Component arg1) {
        if (arg0 != -282) {
            return;
        }
        field1801++;
        Method var2 = class274.field4520;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class300.field4960);
        arg1.addFocusListener(class300.field4960);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)Lgl;", line = 335)
    public static final class286 method786(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class286 var4 = var3.field728;
            var3.field728 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZDILeh;Lnm;I)Lf;", line = 361)
    public final class362 method787(int arg0, boolean arg1, double arg2, int arg3, class164 arg4, class221 arg5, int arg6) {
        field1806++;
        class151.method1099(arg6 ^ arg6, arg2);
        class116.field1698 = arg5;
        class259.field4101 = arg4;
        class46.method353(arg0, -1, arg3);
        class362 var9 = new class362(arg3, arg0);
        for (int var10 = 0; var10 < this.field1810.length; var10++) {
            this.field1810[var10].method23(-124, arg3, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1798.field34) {
                int[] var13 = this.field1798.method25((byte) 124, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1798.method22(-21194, var12);
                var15 = var17[2];
                var14 = var17[0];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field1811.field34) {
                var18 = this.field1811.method25((byte) 77, var12);
            } else {
                var18 = this.field1811.method22(-21194, var12)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var16[var19] >> 4;
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class18.field220[var21];
                int var24 = class18.field220[var22];
                if (var20 < 0) {
                    var20 = 0;
                }
                int var25 = class18.field220[var20];
                int var26;
                if (var24 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field2172[var11++] = (var24 << 16) + ((var26 << 24) - (-(var23 << 8) - var25));
                if (arg1) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1810.length; var27++) {
            this.field1810[var27].method18((byte) -122);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILnm;Leh;)Z", line = 495)
    public final boolean method788(int arg0, class221 arg1, class164 arg2) {
        field1809++;
        if (class11.field118 > 0) {
            for (int var4 = 0; var4 < this.field1803.length; var4++) {
                if (!arg1.method1498(class11.field118, -108, this.field1803[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1803.length; var5++) {
                if (!arg1.method1519(false, this.field1803[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field1818.length; var6++) {
            if (!arg2.method769((byte) 72, this.field1818[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V", line = 547)
    public static void method789(int arg0) {
        field1805 = (short[][]) null;
        field1808 = (class226[][]) null;
        if (arg0 > 99) {
            field1802 = null;
            field1815 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIBIIIII)V", line = 561)
    public static final void method790(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1799++;
        if (arg4 <= 114) {
            return;
        }
        if (arg2 == arg8 && arg0 == arg9 && arg5 == arg7 && arg1 == arg6) {
            class206.method1402(arg9, arg3, arg5, arg2, arg1, 0);
            return;
        }
        int var10 = arg2;
        int var11 = arg9;
        int var12 = arg2 * 3;
        int var13 = arg0 * 3;
        int var14 = arg7 * 3;
        int var15 = arg9 * 3;
        int var16 = arg8 * 3;
        int var17 = arg6 * 3;
        int var18 = arg5 + var16 - var14 - arg2;
        int var19 = arg1 + var13 - arg9 - var17;
        int var20 = var12 + var14 - var16 - var16;
        int var21 = var17 + var15 - var13 - var13;
        int var22 = var16 - var12;
        int var23 = var13 - var15;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg2 + (var27 + var29 + var31 >> 12);
            int var34 = (var28 + var30 + var32 >> 12) + arg9;
            class206.method1402(var11, arg3, var33, var10, var34, 0);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Leh;IDIILnm;Z)[I", line = 649)
    public final int[] method791(class164 arg0, int arg1, double arg2, int arg3, int arg4, class221 arg5, boolean arg6) {
        field1796++;
        class151.method1099(arg4 ^ arg4, arg2);
        class116.field1698 = arg5;
        class259.field4101 = arg0;
        class46.method353(arg3, -1, arg1);
        for (int var9 = 0; var9 < this.field1810.length; var9++) {
            this.field1810[var9].method23(120, arg1, arg3);
        }
        int[] var10 = new int[arg1 * arg3 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1798.field34) {
                int[] var17 = this.field1798.method25((byte) 62, var12);
                var15 = var17;
                var14 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field1798.method22(-21194, var12);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field1811.field34) {
                var18 = this.field1811.method25((byte) 93, var12);
            } else {
                var18 = this.field1811.method22(-21194, var12)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var15[var19] >> 4;
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class18.field220[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var24 = class18.field220[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class18.field220[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var10[var11++] = (var23 << 16) + (var26 << 24) - (-(var25 << 8) + -var24);
                if (arg6) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1810.length; var27++) {
            this.field1810[var27].method18((byte) -119);
        }
        return var10;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIDLeh;Lnm;IZI)[I", line = 783)
    public final int[] method792(boolean arg0, int arg1, double arg2, class164 arg3, class221 arg4, int arg5, boolean arg6, int arg7) {
        class151.method1099(0, arg2);
        class259.field4101 = arg3;
        int[] var10 = new int[arg1 * arg7];
        class116.field1698 = arg4;
        field1800++;
        class46.method353(arg7, -1, arg1);
        for (int var11 = 0; var11 < this.field1810.length; var11++) {
            this.field1810[var11].method23(-108, arg1, arg7);
        }
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = 1;
            var13 = arg1;
            var12 = 0;
        }
        int var15 = 0;
        for (int var16 = arg5; var16 < arg7; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1798.field34) {
                int[] var17 = this.field1798.method25((byte) 81, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field1798.method22(-21194, var16);
                var19 = var21[0];
                var20 = var21[1];
                var18 = var21[2];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var20[var22] >> 4;
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class18.field220[var23];
                int var26 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class18.field220[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class18.field220[var26];
                var10[var15++] = (var25 << 16) + (var27 << 8) + var28;
                if (arg6) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1810.length; var29++) {
            this.field1810[var29].method18((byte) -118);
        }
        return var10;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 911)
    public class121() {
        this.field1803 = new int[0];
        this.field1818 = new int[0];
        this.field1812 = new class285(0);
        this.field1812.field22 = 1;
        this.field1798 = new class285();
        this.field1798.field22 = 1;
        this.field1811 = new class285();
        this.field1810 = new class3[] { this.field1798, this.field1811, this.field1812 };
        this.field1811.field22 = 1;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lfh;)V", line = 926)
    public class121(class313 arg0) {
        int var2 = arg0.method2224(-123);
        this.field1810 = new class3[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class3 var7 = class187.method1291(arg0, 0);
            if (var7.method17((byte) -21) >= 0) {
                var4++;
            }
            if (var7.method15(127) >= 0) {
                var3++;
            }
            int var8 = var7.field35.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method2224(-124);
            }
            this.field1810[var6] = var7;
        }
        this.field1818 = new int[var3];
        this.field1803 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class3 var13 = this.field1810[var12];
            int var14 = var13.field35.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field35[var15] = this.field1810[var5[var12][var15]];
            }
            int var16 = var13.method17((byte) 120);
            int var17 = var13.method15(116);
            if (var16 > 0) {
                this.field1803[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1818[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1798 = this.field1810[arg0.method2224(-125)];
        this.field1811 = this.field1810[arg0.method2224(-126)];
        this.field1812 = this.field1810[arg0.method2224(-128)];
    }
}

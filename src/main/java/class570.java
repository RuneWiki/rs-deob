import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class570 extends class66 {

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Leq;")
    private class357 field7949;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Lgv;")
    private class45 field7943;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "[I")
    public static int[] field7948 = new int[14];

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public static int field7953 = 0;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Lkha;")
    public static class687 field7946;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([IIILid;)Lwv;")
    public static final class760 method3204(int[] arg0, int arg1, int arg2, class415 arg3) {
        field7945++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 57 % ((arg1 + 1) / 61);
        float[][] var8 = null;
        if (arg3.field5895 != null) {
            int var9 = arg3.field5893;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            for (int var16 = 0; var16 < var9; var16++) {
                var10[var16] = Integer.MAX_VALUE;
                var11[var16] = -2147483647;
                var12[var16] = Integer.MAX_VALUE;
                var13[var16] = -2147483647;
                var14[var16] = Integer.MAX_VALUE;
                var15[var16] = -2147483647;
            }
            var5 = new int[var9];
            var6 = new int[var9];
            for (int var17 = 0; var17 < arg2; var17++) {
                int var24 = arg0[var17];
                if (arg3.field5895[var24] != -1) {
                    int var25 = arg3.field5895[var24] & 0xFF;
                    for (int var26 = 0; var26 < 3; var26++) {
                        short var27;
                        if (var26 == 0) {
                            var27 = arg3.field5865[var24];
                        } else if (var26 == 1) {
                            var27 = arg3.field5902[var24];
                        } else {
                            var27 = arg3.field5890[var24];
                        }
                        int var28 = arg3.field5892[var27];
                        int var29 = arg3.field5857[var27];
                        int var30 = arg3.field5889[var27];
                        if (var10[var25] > var28) {
                            var10[var25] = var28;
                        }
                        if (var11[var25] < var28) {
                            var11[var25] = var28;
                        }
                        if (var29 < var12[var25]) {
                            var12[var25] = var29;
                        }
                        if (var29 > var13[var25]) {
                            var13[var25] = var29;
                        }
                        if (var30 < var14[var25]) {
                            var14[var25] = var30;
                        }
                        if (var30 > var15[var25]) {
                            var15[var25] = var30;
                        }
                    }
                }
            }
            var4 = new int[var9];
            var8 = new float[var9][];
            for (int var18 = 0; var18 < var9; var18++) {
                byte var19 = arg3.field5869[var18];
                if (var19 > 0) {
                    var4[var18] = (var10[var18] + var11[var18]) / 2;
                    var5[var18] = (var12[var18] + var13[var18]) / 2;
                    var6[var18] = (var14[var18] + var15[var18]) / 2;
                    float var21;
                    float var22;
                    float var23;
                    if (var19 == 1) {
                        int var20 = arg3.field5897[var18];
                        if (var20 == 0) {
                            var21 = 1.0F;
                            var22 = 1.0F;
                        } else if (var20 > 0) {
                            var22 = (float) var20 / 1024.0F;
                            var21 = 1.0F;
                        } else {
                            var21 = (float) (-var20) / 1024.0F;
                            var22 = 1.0F;
                        }
                        var23 = 64.0F / (float) arg3.field5861[var18];
                    } else if (var19 == 2) {
                        var21 = 64.0F / (float) arg3.field5897[var18];
                        var22 = 64.0F / (float) arg3.field5899[var18];
                        var23 = 64.0F / (float) arg3.field5861[var18];
                    } else {
                        var23 = (float) arg3.field5861[var18] / 1024.0F;
                        var21 = (float) arg3.field5897[var18] / 1024.0F;
                        var22 = (float) arg3.field5899[var18] / 1024.0F;
                    }
                    var8[var18] = class294.method1761(-9670, var23, var21, arg3.field5859[var18], arg3.field5867[var18], var22, arg3.field5864[var18], class272.method1629(arg3.field5898[var18], 255));
                }
            }
        }
        return new class760(var4, var5, var6, var8);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Leq;I)V")
    public class570(class357 arg0, int arg1) {
        this.field7949 = arg0;
        this.field7943 = new class45(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
    public static void method3205(int arg0) {
        field7948 = null;
        field7946 = null;
        if (arg0 != -1) {
            field7944 = 24;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Lgv;")
    public final class45 method501(int arg0) {
        if (arg0 > -79) {
            this.field7943 = null;
        }
        field7952++;
        return this.field7943;
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)I")
    public final int method3206(int arg0) {
        field7947++;
        return arg0 <= 65 ? 77 : this.field7943.field670;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLgaa;ILha;I)V")
    public static final void method3207(byte arg0, class460 arg1, int arg2, class454 arg3, int arg4) {
        field7954++;
        if (arg0 <= 65) {
            field7948 = null;
        }
        class81 var5 = arg1.method2702(arg3, 57);
        if (var5 == null) {
            return;
        }
        arg3.method131(arg4, arg2, arg1.field6566 + arg4, arg1.field6514 + arg2);
        if (class67.field886 == 2 || class67.field886 == 5 || class701.field9883 == null) {
            arg3.method83(-16777216, var5, arg4, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class276.field3497 == 4) {
            var6 = class418.field5941;
            var7 = 4096;
            var8 = class324.field4135;
            var9 = (int) (-class748.field10471) & 0x3FFF;
        } else {
            var6 = class339.field4374.field5784;
            var7 = 4096 - (class3.field16 * 16);
            var8 = class339.field4374.field5790;
            var9 = (int) (-class748.field10471) + class10.field112 & 0x3FFF;
        }
        int var10 = var8 / 128 + 48 - ((class613.field8591 - 104) * 2);
        int var11 = (class1.field3 * 4) + 48 - (var6 / 128) - ((class1.field3 + -104) * 2);
        class701.field9883.method3936((float) arg1.field6566 / 2.0F + (float) arg4, (float) arg1.field6514 / 2.0F + (float) arg2, (float) var10, (float) var11, var7, var9 << 2, var5, arg4, arg2);
        for (class394 var12 = (class394) class200.field2561.method3111(127); var12 != null; var12 = (class394) class200.field2561.method3116(-74)) {
            int var58 = var12.field5494;
            int var59 = ((class512.field7223.field9054[var58] & 0xFFFC054) >> 14) - class63.field851;
            int var60 = (class512.field7223.field9054[var58] & 0x3FFF) - class753.field10509;
            int var61 = var59 * 4 + 2 - (var8 / 128);
            int var62 = var60 * 4 + 2 - (var6 / 128);
            class685.method3807(var5, var61, var62, (byte) -40, arg4, arg3, arg2, class512.field7223.field9056[var58], arg1);
        }
        for (int var13 = 0; var13 < class457.field6397; var13++) {
            int var55 = class612.field8457[var13] * 4 + 2 - (var8 / 128);
            int var56 = class547.field7707[var13] * 4 + (2 - var6 / 128);
            class290 var57 = class358.field5112.method890(class461.field6643[var13], false);
            if (var57.field3685 != null) {
                var57 = var57.method1739((byte) -120, class461.field6637);
                if (var57 == null || var57.field3773 == -1) {
                    continue;
                }
            }
            class685.method3807(var5, var55, var56, (byte) -40, arg4, arg3, arg2, var57.field3773, arg1);
        }
        for (class585 var14 = (class585) class497.field7028.method3245(false); var14 != null; var14 = (class585) class497.field7028.method3252(12938)) {
            int var50 = (int) (var14.field8746 >> 28 & 0x3L);
            if (class102.field1258 == var50) {
                int var51 = (int) (var14.field8746 & 0x3FFFL) - class63.field851;
                int var52 = (int) (var14.field8746 >> 14 & 0x3FFFL) - class753.field10509;
                int var53 = var51 * 4 + 2 - (var8 / 128);
                int var54 = var52 * 4 + 2 - (var6 / 128);
                class469.method2763(arg4, var53, arg2, arg1, var54, (byte) 88, var5, class48.field706[0]);
            }
        }
        for (int var15 = 0; var15 < class443.field6200; var15++) {
            class247 var45 = (class247) class563.field7875.method3248((long) class61.field832[var15], 0);
            if (var45 != null) {
                class124 var46 = var45.field3158;
                if (var46.method810(-1) && class339.field4374.field5779 == var46.field5779) {
                    class155 var47 = var46.field1486;
                    if (var47 != null && var47.field1929 != null) {
                        var47 = var47.method968((byte) -76, class461.field6637);
                    }
                    if (var47 != null && var47.field1964 && var47.field1925) {
                        int var48 = var46.field5790 / 128 - (var8 / 128);
                        int var49 = var46.field5784 / 128 - (var6 / 128);
                        if (var47.field1935 == -1) {
                            class469.method2763(arg4, var48, arg2, arg1, var49, (byte) 71, var5, class48.field706[1]);
                        } else {
                            class685.method3807(var5, var48, var49, (byte) -40, arg4, arg3, arg2, var47.field1935, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class627.field8745;
        int[] var17 = class274.field3465;
        for (int var18 = 0; var18 < var16; var18++) {
            class546 var37 = class447.field6287[var17[var18]];
            if (var37 != null && var37.method3102(-1) && !var37.field7654 && class339.field4374 != var37 && class339.field4374.field5779 == var37.field5779) {
                int var38 = var37.field5790 / 128 - (var8 / 128);
                int var39 = var37.field5784 / 128 - (var6 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class727.field10184; var41++) {
                    if (var37.field7690.equals(class4.field34[var41]) && class323.field4122[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class492.field6976; var43++) {
                    if (var37.field7690.equals(class760.field10595[var43].field1500)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class339.field4374.field7695 != 0 && var37.field7695 != 0 && class339.field4374.field7695 == var37.field7695) {
                    var44 = true;
                }
                if (var37.field7677) {
                    class469.method2763(arg4, var38, arg2, arg1, var39, (byte) 62, var5, class48.field706[6]);
                } else if (var40) {
                    class469.method2763(arg4, var38, arg2, arg1, var39, (byte) 88, var5, class48.field706[3]);
                } else if (var42) {
                    class469.method2763(arg4, var38, arg2, arg1, var39, (byte) 96, var5, class48.field706[5]);
                } else if (var44) {
                    class469.method2763(arg4, var38, arg2, arg1, var39, (byte) 107, var5, class48.field706[4]);
                } else {
                    class469.method2763(arg4, var38, arg2, arg1, var39, (byte) 44, var5, class48.field706[2]);
                }
            }
        }
        class126[] var19 = class498.field7043;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class126 var23 = var19[var20];
            if (var23 != null && var23.field1507 != 0 && class266.field3368 % 20 < 10) {
                if (var23.field1507 == 1) {
                    class247 var24 = (class247) class563.field7875.method3248((long) var23.field1515, 0);
                    if (var24 != null) {
                        class124 var25 = var24.field3158;
                        int var26 = var25.field5790 / 128 - var8 / 128;
                        int var27 = var25.field5784 / 128 - (var6 / 128);
                        class714.method3965(360000L, false, var23.field1512, var5, var27, var26, arg1, arg4, arg2);
                    }
                }
                if (var23.field1507 == 2) {
                    int var28 = var23.field1516 / 128 - var8 / 128;
                    int var29 = var23.field1517 / 128 - (var6 / 128);
                    long var30 = (long) (var23.field1514 << 7);
                    long var32 = var30 * var30;
                    class714.method3965(var32, false, var23.field1512, var5, var29, var28, arg1, arg4, arg2);
                }
                if (var23.field1507 == 10 && var23.field1515 >= 0 && class447.field6287.length > var23.field1515) {
                    class546 var34 = class447.field6287[var23.field1515];
                    if (var34 != null) {
                        int var35 = var34.field5790 / 128 - (var8 / 128);
                        int var36 = var34.field5784 / 128 - (var6 / 128);
                        class714.method3965(360000L, false, var23.field1512, var5, var36, var35, arg1, arg4, arg2);
                    }
                }
            }
        }
        if (class276.field3497 == 4) {
            return;
        }
        if (class333.field4292 != 0) {
            int var21 = class333.field4292 * 4 + 2 - (var8 / 128 + -((class339.field4374.method253((byte) -27) + -1) * 2));
            int var22 = class721.field10159 * 4 + (class339.field4374.method253((byte) -27) * 2 - 2) + 2 - (var6 / 128);
            class469.method2763(arg4, var21, arg2, arg1, var22, (byte) 91, var5, class560.field7826[class571.field7966 ? 1 : 0]);
        }
        if (!class339.field4374.field7654) {
            arg3.method2668(arg2 + (arg1.field6514 / 2) - 1, false, 3, 3, arg4 + (arg1.field6566 / 2) - 1, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(FLgv;BLgv;)Z")
    public final boolean method3208(float arg0, class45 arg1, byte arg2, class45 arg3) {
        field7951++;
        boolean var5 = true;
        class504 var6 = this.field7949.field5005;
        this.field7949.method76(class241.field3101);
        this.field7949.method59();
        this.field7949.method2193(8448);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7943.field670, this.field7943.field670);
        this.field7949.method2148(-32, false);
        this.field7949.method2188(false, false);
        this.field7949.method2139(2929, false);
        this.field7949.method2125(0, false);
        this.field7949.method2140(0, -2);
        this.field7949.method2135(1, -5027);
        this.field7949.method2163(0.0F, -13857, 0.0F, arg0, 0.0F);
        this.field7949.method2165((byte) 74, 34165, 34165);
        this.field7949.method2120(-1, arg3);
        this.field7949.method2135(0, -5027);
        this.field7949.method2153(80, 1);
        this.field7949.method2120(-1, arg1);
        int var7 = 64 / ((arg2 + 81) / 36);
        this.field7949.method2158(-29780, var6);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method2914(var9, 0, 0, this.field7943);
            var6.method2901(0, (byte) 79);
            if (!var6.method2906(-1)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var9 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method2904(0, (byte) 104);
        this.field7949.method2142(-108, var6);
        this.field7949.method2135(1, -5027);
        this.field7949.method2120(-1, null);
        this.field7949.method2165((byte) 74, 8448, 8448);
        this.field7949.method2135(0, -5027);
        this.field7949.method2120(-1, null);
        OpenGL.glPopAttrib();
        this.field7949.method131(class241.field3101[0], class241.field3101[1], class241.field3101[2], class241.field3101[3]);
        if (var5 && !this.field7949.field5098) {
            this.field7943.method2437(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;B)V")
    public static final void method3209(Color arg0, int arg1, String arg2, Color arg3, Color arg4, byte arg5) {
        try {
            Graphics var6 = class68.field939.getGraphics();
            if (class581.field8074 == null) {
                class581.field8074 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class218.field2774 == null) {
                    class218.field2774 = class68.field939.createImage(class599.field8320, class84.field1083);
                }
                Graphics var7 = class218.field2774.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class599.field8320, class84.field1083);
                int var8 = class599.field8320 / 2 - 152;
                int var9 = class84.field1083 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class581.field8074);
                var7.setColor(arg3);
                var7.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var8, var9 - -22);
                if (class108.field1330 != null) {
                    var7.setFont(class581.field8074);
                    var7.setColor(arg3);
                    var7.drawString(class108.field1330, class599.field8320 / 2 - (class108.field1330.length() * 6 / 2), class84.field1083 / 2 + -26);
                }
                var6.drawImage(class218.field2774, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class599.field8320, class84.field1083);
                int var10 = class599.field8320 / 2 - 152;
                int var11 = class84.field1083 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class581.field8074);
                var6.setColor(arg3);
                if (class108.field1330 != null) {
                    var6.setFont(class581.field8074);
                    var6.setColor(arg3);
                    var6.drawString(class108.field1330, class599.field8320 / 2 - (class108.field1330.length() * 6 / 2), class84.field1083 / 2 + -26);
                }
                var6.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class68.field939.repaint();
        }
        if (arg5 <= 29) {
            field7946 = null;
        }
        field7950++;
    }
}

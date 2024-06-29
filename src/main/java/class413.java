import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class413 {

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "[F")
    private float[] field5979 = new float[16];

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "Lgt;")
    private class424 field5978 = new class424(786336);

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    private int field5984 = class608.method3498(1600, (byte) -49);

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    private int field5991 = 0;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "[I")
    private int[] field5996 = new int[64];

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "[I")
    private int[] field5992 = new int[8191];

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "[[Lvh;")
    private class332[][] field5994 = new class332[1600][64];

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "[[Lvh;")
    private class332[][] field5993 = new class332[64][768];

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "[I")
    private int[] field5997 = new int[1600];

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field5982 = 1401;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Lsb;")
    public static class266 field5976 = new class266(7, 2);

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "Lsb;")
    public static class266 field5989 = new class266(48, -1);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "Lrca;")
    private class423 field5985;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "Lrca;")
    private class423 field5986;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "Lrca;")
    private class423 field5987;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "Lel;")
    private class510 field5988;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field5977;

    @OriginalMember(owner = "client!lv", name = "A", descriptor = "[I")
    public static int[] field5995;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLus;I)V")
    private final void method2515(boolean arg0, class1 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5979, 0);
        field5971++;
        float var4 = this.field5979[0];
        float var5 = this.field5979[4];
        float var6 = this.field5979[8];
        float var7 = this.field5979[1];
        float var8 = this.field5979[5];
        float var9 = this.field5979[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        if (arg0) {
            method2518(null, 88);
        }
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field5978.field1393 = 0;
        if (arg1.field267) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field5997[var19] > 64 ? 64 : this.field5997[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class332 var34 = this.field5994[var19][var21];
                        int var35 = var34.field4835;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field4831 >> 12);
                        float var41 = (float) (var34.field4833 >> 12);
                        float var42 = (float) (var34.field4837 >> 12);
                        int var43 = var34.field4838 >> 12;
                        this.field5978.method2583(0.0F, -76);
                        this.field5978.method2583(0.0F, -81);
                        this.field5978.method2583((float) (-var43) * var10 + var40, -122);
                        this.field5978.method2583((float) (-var43) * var11 + var41, -126);
                        this.field5978.method2583((float) (-var43) * var12 + var42, -121);
                        this.field5978.method693((byte) 106, var36);
                        this.field5978.method693((byte) 106, var37);
                        this.field5978.method693((byte) 106, var38);
                        this.field5978.method693((byte) 106, var39);
                        this.field5978.method2583(1.0F, -79);
                        this.field5978.method2583(0.0F, -96);
                        this.field5978.method2583((float) var43 * var13 + var40, -122);
                        this.field5978.method2583((float) var43 * var14 + var41, -91);
                        this.field5978.method2583((float) var43 * var15 + var42, -112);
                        this.field5978.method693((byte) 106, var36);
                        this.field5978.method693((byte) 106, var37);
                        this.field5978.method693((byte) 106, var38);
                        this.field5978.method693((byte) 106, var39);
                        this.field5978.method2583(1.0F, -83);
                        this.field5978.method2583(1.0F, -125);
                        this.field5978.method2583((float) var43 * var10 + var40, -83);
                        this.field5978.method2583((float) var43 * var11 + var41, -90);
                        this.field5978.method2583((float) var43 * var12 + var42, -126);
                        this.field5978.method693((byte) 106, var36);
                        this.field5978.method693((byte) 106, var37);
                        this.field5978.method693((byte) 106, var38);
                        this.field5978.method693((byte) 106, var39);
                        this.field5978.method2583(0.0F, -87);
                        this.field5978.method2583(1.0F, -75);
                        this.field5978.method2583((float) var43 * var16 + var40, -79);
                        this.field5978.method2583((float) var43 * var17 + var41, -90);
                        this.field5978.method2583((float) var43 * var18 + var42, -70);
                        this.field5978.method693((byte) 106, var36);
                        this.field5978.method693((byte) 106, var37);
                        this.field5978.method693((byte) 106, var38);
                        this.field5978.method693((byte) 106, var39);
                    }
                    if (this.field5997[var19] > 64) {
                        int var22 = this.field5997[var19] - 64 - 1;
                        for (int var23 = this.field5996[var22] - 1; var23 >= 0; var23--) {
                            class332 var24 = this.field5993[var22][var23];
                            int var25 = var24.field4835;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field4831 >> 12);
                            float var31 = (float) (var24.field4833 >> 12);
                            float var32 = (float) (var24.field4837 >> 12);
                            int var33 = var24.field4838 >> 12;
                            this.field5978.method2583(0.0F, -80);
                            this.field5978.method2583(0.0F, -95);
                            this.field5978.method2583((float) (-var33) * var10 + var30, -90);
                            this.field5978.method2583((float) (-var33) * var11 + var31, -81);
                            this.field5978.method2583((float) (-var33) * var12 + var32, -80);
                            this.field5978.method693((byte) 106, var26);
                            this.field5978.method693((byte) 106, var27);
                            this.field5978.method693((byte) 106, var28);
                            this.field5978.method693((byte) 106, var29);
                            this.field5978.method2583(1.0F, -102);
                            this.field5978.method2583(0.0F, -105);
                            this.field5978.method2583((float) var33 * var13 + var30, -124);
                            this.field5978.method2583((float) var33 * var14 + var31, -111);
                            this.field5978.method2583((float) var33 * var15 + var32, -119);
                            this.field5978.method693((byte) 106, var26);
                            this.field5978.method693((byte) 106, var27);
                            this.field5978.method693((byte) 106, var28);
                            this.field5978.method693((byte) 106, var29);
                            this.field5978.method2583(1.0F, -124);
                            this.field5978.method2583(1.0F, -77);
                            this.field5978.method2583((float) var33 * var10 + var30, -81);
                            this.field5978.method2583((float) var33 * var11 + var31, -116);
                            this.field5978.method2583((float) var33 * var12 + var32, -85);
                            this.field5978.method693((byte) 106, var26);
                            this.field5978.method693((byte) 106, var27);
                            this.field5978.method693((byte) 106, var28);
                            this.field5978.method693((byte) 106, var29);
                            this.field5978.method2583(0.0F, -117);
                            this.field5978.method2583(1.0F, -91);
                            this.field5978.method2583((float) var33 * var16 + var30, -89);
                            this.field5978.method2583((float) var33 * var17 + var31, -92);
                            this.field5978.method2583((float) var33 * var18 + var32, -118);
                            this.field5978.method693((byte) 106, var26);
                            this.field5978.method693((byte) 106, var27);
                            this.field5978.method693((byte) 106, var28);
                            this.field5978.method693((byte) 106, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field5997[var44] <= 64 ? this.field5997[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class332 var59 = this.field5994[var44][var46];
                        int var60 = var59.field4835;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field4831 >> 12);
                        float var66 = (float) (var59.field4833 >> 12);
                        float var67 = (float) (var59.field4837 >> 12);
                        int var68 = var59.field4838 >> 12;
                        this.field5978.method2584(0, 0.0F);
                        this.field5978.method2584(0, 0.0F);
                        this.field5978.method2584(0, (float) (-var68) * var10 + var65);
                        this.field5978.method2584(0, (float) (-var68) * var11 + var66);
                        this.field5978.method2584(0, (float) (-var68) * var12 + var67);
                        this.field5978.method693((byte) 106, var61);
                        this.field5978.method693((byte) 106, var62);
                        this.field5978.method693((byte) 106, var63);
                        this.field5978.method693((byte) 106, var64);
                        this.field5978.method2584(0, 1.0F);
                        this.field5978.method2584(0, 0.0F);
                        this.field5978.method2584(0, (float) var68 * var13 + var65);
                        this.field5978.method2584(0, (float) var68 * var14 + var66);
                        this.field5978.method2584(0, (float) var68 * var15 + var67);
                        this.field5978.method693((byte) 106, var61);
                        this.field5978.method693((byte) 106, var62);
                        this.field5978.method693((byte) 106, var63);
                        this.field5978.method693((byte) 106, var64);
                        this.field5978.method2584(0, 1.0F);
                        this.field5978.method2584(0, 1.0F);
                        this.field5978.method2584(0, (float) var68 * var10 + var65);
                        this.field5978.method2584(0, (float) var68 * var11 + var66);
                        this.field5978.method2584(0, (float) var68 * var12 + var67);
                        this.field5978.method693((byte) 106, var61);
                        this.field5978.method693((byte) 106, var62);
                        this.field5978.method693((byte) 106, var63);
                        this.field5978.method693((byte) 106, var64);
                        this.field5978.method2584(0, 0.0F);
                        this.field5978.method2584(0, 1.0F);
                        this.field5978.method2584(0, (float) var68 * var16 + var65);
                        this.field5978.method2584(0, (float) var68 * var17 + var66);
                        this.field5978.method2584(0, (float) var68 * var18 + var67);
                        this.field5978.method693((byte) 106, var61);
                        this.field5978.method693((byte) 106, var62);
                        this.field5978.method693((byte) 106, var63);
                        this.field5978.method693((byte) 106, var64);
                    }
                    if (this.field5997[var44] > 64) {
                        int var47 = this.field5997[var44] - 65;
                        for (int var48 = this.field5996[var47] - 1; var48 >= 0; var48--) {
                            class332 var49 = this.field5993[var47][var48];
                            int var50 = var49.field4835;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field4831 >> 12);
                            float var56 = (float) (var49.field4833 >> 12);
                            float var57 = (float) (var49.field4837 >> 12);
                            int var58 = var49.field4838 >> 12;
                            this.field5978.method2584(0, 0.0F);
                            this.field5978.method2584(0, 0.0F);
                            this.field5978.method2584(0, (float) (-var58) * var10 + var55);
                            this.field5978.method2584(0, (float) (-var58) * var11 + var56);
                            this.field5978.method2584(0, (float) (-var58) * var12 + var57);
                            this.field5978.method693((byte) 106, var51);
                            this.field5978.method693((byte) 106, var52);
                            this.field5978.method693((byte) 106, var53);
                            this.field5978.method693((byte) 106, var54);
                            this.field5978.method2584(0, 1.0F);
                            this.field5978.method2584(0, 0.0F);
                            this.field5978.method2584(0, (float) var58 * var13 + var55);
                            this.field5978.method2584(0, (float) var58 * var14 + var56);
                            this.field5978.method2584(0, (float) var58 * var15 + var57);
                            this.field5978.method693((byte) 106, var51);
                            this.field5978.method693((byte) 106, var52);
                            this.field5978.method693((byte) 106, var53);
                            this.field5978.method693((byte) 106, var54);
                            this.field5978.method2584(0, 1.0F);
                            this.field5978.method2584(0, 1.0F);
                            this.field5978.method2584(0, (float) var58 * var10 + var55);
                            this.field5978.method2584(0, (float) var58 * var11 + var56);
                            this.field5978.method2584(0, (float) var58 * var12 + var57);
                            this.field5978.method693((byte) 106, var51);
                            this.field5978.method693((byte) 106, var52);
                            this.field5978.method693((byte) 106, var53);
                            this.field5978.method693((byte) 106, var54);
                            this.field5978.method2584(0, 0.0F);
                            this.field5978.method2584(0, 1.0F);
                            this.field5978.method2584(0, (float) var58 * var16 + var55);
                            this.field5978.method2584(0, (float) var58 * var17 + var56);
                            this.field5978.method2584(0, (float) var58 * var18 + var57);
                            this.field5978.method693((byte) 106, var51);
                            this.field5978.method693((byte) 106, var52);
                            this.field5978.method693((byte) 106, var53);
                            this.field5978.method693((byte) 106, var54);
                        }
                    }
                }
            }
        }
        if (this.field5978.field1393 != 0) {
            this.field5988.method2000(this.field5978.field1397, this.field5978.field1393, 24, (byte) -66);
            arg1.method184(this.field5987, this.field5985, this.field5986, null, (byte) 110);
            arg1.method91(7, (byte) -119, 0, this.field5978.field1393 / 24);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lus;II)V")
    private final void method2516(class1 arg0, int arg1, int arg2) {
        class361.field5371 = arg0.field296;
        field5983++;
        arg0.method78(0, (float) arg2);
        arg0.method3(12787);
        OpenGL.glDisable(16384);
        if (arg1 != 23858) {
            this.field5993 = null;
        }
        OpenGL.glDisable(16385);
        arg0.method45(false, -114);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method2517(int arg0) {
        field5976 = null;
        field5977 = null;
        if (arg0 == 20) {
            field5989 = null;
            field5995 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2518(String arg0, int arg1) {
        field5981++;
        if (arg0.equals("")) {
            return;
        }
        if (arg1 != 1) {
            field5990 = 117;
        }
        class596.field8562++;
        class275 var2 = class185.method1355(0, class130.field2349, class395.field5772);
        var2.field4103.method693((byte) 106, class511.method3019(arg0, arg1 ^ 0xFFFFFF85));
        var2.field4103.method750(123, arg0);
        class140.method1141(var2, 19321);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lus;I)V")
    public final void method2519(class1 arg0, int arg1) {
        field5972++;
        this.field5988 = arg0.method49(null, 24, 196584, true, 11645);
        this.field5987 = new class423(this.field5988, 5126, 2, 0);
        if (arg1 <= 78) {
            method2517(-112);
        }
        this.field5985 = new class423(this.field5988, 5126, 3, 8);
        this.field5986 = new class423(this.field5988, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLus;)V")
    private final void method2520(byte arg0, class1 arg1) {
        arg1.method45(true, arg0 - 71);
        field5969++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class361.field5371 != arg1.field296) {
            arg1.method143(class361.field5371);
        }
        if (arg0 != -29) {
            this.method2519(null, 23);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILho;Lho;BZ)I")
    public static final int method2521(int arg0, class135 arg1, class135 arg2, byte arg3, boolean arg4) {
        field5973++;
        if (arg0 == 1) {
            int var5 = arg1.field5999;
            int var6 = arg2.field5999;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class703.method3932(arg2.method1114(-22049).field1712, class140.field2466, arg1.method1114(-22049).field1712, 10565);
        } else if (arg0 == 3) {
            if (arg1.field2396.equals("-")) {
                if (arg2.field2396.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2396.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class703.method3932(arg2.field2396, class140.field2466, arg1.field2396, 10565);
            }
        } else if (arg0 == 4) {
            if (arg1.method2526(-19441)) {
                return arg2.method2526(-19441) ? 0 : 1;
            } else if (arg2.method2526(arg3 ^ 0x4BFF)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg1.method2530(-41)) {
                return arg2.method2530(-94) ? 0 : 1;
            } else if (arg2.method2530(-23)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 6) {
            if (arg3 != -16) {
                field5995 = null;
            }
            if (arg0 == 7) {
                if (arg1.method2531(false)) {
                    return arg2.method2531(false) ? 0 : 1;
                } else if (arg2.method2531(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg1.field2401;
                int var8 = arg2.field2401;
                if (arg4) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field2395 - arg2.field2395;
            }
        } else if (arg1.method2527(111)) {
            return arg2.method2527(96) ? 0 : 1;
        } else if (arg2.method2527(93)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLus;)V")
    private final void method2522(boolean arg0, class1 arg1) {
        field5970++;
        class361.field5371 = arg1.field296;
        arg1.method8(-114);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method45(false, -103);
        if (arg0) {
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lus;Lfi;BI)V")
    public final void method2523(class1 arg0, class518 arg1, byte arg2, int arg3) {
        field5980++;
        if (arg0.field244 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method2516(arg0, 23858, arg3);
        } else {
            this.method2522(true, arg0);
        }
        float var5 = arg0.field244.field6078;
        float var6 = arg0.field244.field6081;
        float var7 = arg0.field244.field6075;
        if (arg2 < 6) {
            this.method2523(null, null, (byte) 19, 50);
        }
        float var8 = arg0.field244.field6077;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class347 var12 = arg1.field7307.field3152;
            for (class347 var13 = var12.field5168; var13 != var12; var13 = var13.field5168) {
                class332 var14 = (class332) var13;
                int var15 = (int) ((float) (var14.field4837 >> 12) * var7 + (float) (var14.field4833 >> 12) * var6 + (float) (var14.field4831 >> 12) * var5 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field5992[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = 1 - (this.field5984 - class608.method3498(var16, (byte) 101));
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class347 var19 = var12.field5168;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field5991 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5997[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5996[var24] = 0;
                }
                while (var12 != var19) {
                    class332 var25 = (class332) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field4830;
                        var20 = var25.field4840;
                    }
                    if (var18 > 0 && (var25.field4840 != var20 || var25.field4830 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5992[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5997[var26] < 64) {
                            this.field5994[var26][this.field5997[var26]++] = var25;
                        } else {
                            label102: {
                                if (this.field5997[var26] == 64) {
                                    if (this.field5991 == 64) {
                                        break label102;
                                    }
                                    this.field5997[var26] += this.field5991++ + 1;
                                }
                                class332[] var28 = this.field5993[this.field5997[var26] - 1 - 64];
                                int var10002 = this.field5997[var26] - 65;
                                int var10004 = this.field5996[this.field5997[var26] - 65];
                                this.field5996[var10002] = this.field5996[this.field5997[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field5168;
                }
                if (var20 >= 0) {
                    arg0.method161(-46, var20);
                } else {
                    arg0.method161(85, -1);
                }
                if (var21 && class361.field5371 != arg0.field296) {
                    arg0.method143(class361.field5371);
                } else if (arg0.field296 != 1.0F) {
                    arg0.method143(1.0F);
                }
                this.method2515(false, arg0, var16);
            }
        } catch (Exception var27) {
        }
        this.method2520((byte) -29, arg0);
    }
}

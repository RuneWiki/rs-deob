import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class73 extends class179 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lk;")
    public static class17 field1146 = new class17(0, 0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Lfd;")
    public static class190 field1167 = new class190(0, 0);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Ltl;")
    public static class59 field1173 = class85.method639("Loaded world list data", 9588);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "Ltl;")
    public static class59 field1169 = class85.method639("Fps:", 9588);

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Ltl;")
    public static class59 field1174 = class85.method639("www", 9588);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Ltl;")
    public static class59 field1175 = class85.method639("Fallen lassen", 9588);

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1148;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1168;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "[I")
    public static int[] field1170;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BZ)V", line = 5)
    public static final void method584(byte arg0, boolean arg1) {
        if (arg0 > -32) {
            method592(100);
        }
        field1172++;
        class97.field1562 = arg1;
        if (!class97.field1562) {
            int var25 = (class146.field2387 - class18.field236.field2787) / 16;
            class101.field1636 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var27 = 0; var27 < 4; var27++) {
                    class101.field1636[var26][var27] = class18.field236.method1209((byte) 56);
                }
            }
            int var28 = class18.field236.method1214(-18254);
            boolean var29 = false;
            int var30 = class18.field236.method1246(-8);
            int var31 = class18.field236.method1214(-18254);
            int var32 = class18.field236.method1226(23760);
            int var33 = class18.field236.method1234(-128);
            class264.field4567 = new int[var25];
            class230.field3784 = new byte[var25][];
            class11.field137 = new int[var25];
            if (((var33 / 8) == 48 || (var33 / 8) == 49) && (var32 / 8) == 48) {
                var29 = true;
            }
            class288.field4953 = new byte[var25][];
            class78.field1240 = (byte[][]) null;
            class260.field4348 = new int[var25];
            if ((var33 / 8) == 48 && (var32 / 8) == 148) {
                var29 = true;
            }
            class38.field576 = new int[var25];
            class190.field3185 = new byte[var25][];
            class123.field2035 = new byte[var25][];
            class155.field2539 = null;
            class161.field2618 = new int[var25];
            int var34 = 0;
            for (int var35 = (var33 - 6) / 8; var35 <= (var33 + 6) / 8; var35++) {
                for (int var36 = (var32 - 6) / 8; var36 <= (var32 + 6) / 8; var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var29 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class260.field4348[var34] = var37;
                        class11.field137[var34] = -1;
                        class161.field2618[var34] = -1;
                        class38.field576[var34] = -1;
                        class264.field4567[var34] = -1;
                    } else {
                        class260.field4348[var34] = var37;
                        class11.field137[var34] = class269.field4664.method2064(120, class233.method1630(new class59[] { class245.field4100, class81.method619((byte) -99, var35), class113.field1822, class81.method619((byte) -96, var36) }, -2883));
                        class161.field2618[var34] = class269.field4664.method2064(123, class233.method1630(new class59[] { class231.field3802, class81.method619((byte) -105, var35), class113.field1822, class81.method619((byte) -92, var36) }, -2883));
                        class38.field576[var34] = class269.field4664.method2064(124, class233.method1630(new class59[] { class65.field997, class81.method619((byte) -109, var35), class113.field1822, class81.method619((byte) -119, var36) }, -2883));
                        class264.field4567[var34] = class269.field4664.method2064(124, class233.method1630(new class59[] { class13.field170, class81.method619((byte) -97, var35), class113.field1822, class81.method619((byte) -72, var36) }, -2883));
                    }
                    var34++;
                }
            }
            class303.method2107(false, var31, var28, (byte) 40, var32, var30, var33);
            return;
        }
        int var2 = class18.field236.method1223((byte) -116);
        class18.field236.method1765(-1);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                for (int var5 = 0; var5 < 13; var5++) {
                    int var6 = class18.field236.method1762((byte) 72, 1);
                    if (var6 == 1) {
                        class119.field1970[var3][var4][var5] = class18.field236.method1762((byte) -120, 26);
                    } else {
                        class119.field1970[var3][var4][var5] = -1;
                    }
                }
            }
        }
        class18.field236.method1766(-121);
        int var7 = (class146.field2387 - class18.field236.field2787) / 16;
        class101.field1636 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var9 = 0; var9 < 4; var9++) {
                class101.field1636[var8][var9] = class18.field236.method1209((byte) 56);
            }
        }
        int var10 = class18.field236.method1214(-18254);
        int var11 = class18.field236.method1254(-26);
        int var12 = class18.field236.method1226(23760);
        int var13 = class18.field236.method1254(118);
        class230.field3784 = new byte[var7][];
        class123.field2035 = new byte[var7][];
        class264.field4567 = new int[var7];
        class11.field137 = new int[var7];
        class288.field4953 = new byte[var7][];
        class38.field576 = new int[var7];
        class190.field3185 = new byte[var7][];
        class260.field4348 = new int[var7];
        class161.field2618 = new int[var7];
        int var14 = 0;
        class78.field1240 = (byte[][]) null;
        class155.field2539 = null;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = class119.field1970[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = (var18 & 0x3FFF) >> 3;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (class260.field4348[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            class260.field4348[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            class11.field137[var14] = class269.field4664.method2064(127, class233.method1630(new class59[] { class245.field4100, class81.method619((byte) -123, var23), class113.field1822, class81.method619((byte) -108, var24) }, -2883));
                            class161.field2618[var14] = class269.field4664.method2064(124, class233.method1630(new class59[] { class231.field3802, class81.method619((byte) -69, var23), class113.field1822, class81.method619((byte) -102, var24) }, -2883));
                            class38.field576[var14] = class269.field4664.method2064(120, class233.method1630(new class59[] { class65.field997, class81.method619((byte) -124, var23), class113.field1822, class81.method619((byte) -93, var24) }, -2883));
                            class264.field4567[var14] = class269.field4664.method2064(125, class233.method1630(new class59[] { class13.field170, class81.method619((byte) -74, var23), class113.field1822, class81.method619((byte) -93, var24) }, -2883));
                            var14++;
                        }
                    }
                }
            }
        }
        class303.method2107(false, var12, var11, (byte) 40, var13, var2, var10);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BB)[B", line = 250)
    public static final byte[] method585(byte[] arg0, byte arg1) {
        field1152++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 > -76) {
            return (byte[]) null;
        } else {
            class63.method520(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 269)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1168 == arg0) {
            this.field1168 = null;
        }
        field1160++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V", line = 279)
    private final synchronized void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1147++;
        if (this.field1168 != null) {
            this.field1168.setPixels(arg4, arg3, arg0, arg2, this.field1148, this.field2939, this.field2934 * arg3 + arg4, this.field2934);
            this.field1168.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!q", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 294)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1168 = arg0;
        arg0.setDimensions(this.field2934, this.field2930);
        field1151++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1148);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)I", line = 312)
    public static final int method587(byte arg0, int arg1) {
        if (arg0 == -121) {
            field1150++;
            return arg1 & 0x3FF;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[[ILkj;ZI[ZIZB[II[[F[[IZ[[FIZIII[[F)V", line = 325)
    public static final void method588(int arg0, int arg1, int[][] arg2, class32 arg3, boolean arg4, int arg5, boolean[] arg6, int arg7, boolean arg8, byte arg9, int[] arg10, int arg11, float[][] arg12, int[][] arg13, boolean arg14, float[][] arg15, int arg16, boolean arg17, int arg18, int arg19, int arg20, float[][] arg21) {
        int var22 = (arg8 ? 255 : 0) + (arg19 << 8);
        field1159++;
        int var23 = (arg4 ? 255 : 0) + (arg16 << 8);
        int var24 = (arg14 ? 255 : 0) + (arg11 << 8);
        int[] var25 = new int[arg10.length / 2];
        int var26 = (arg0 << 8) + (arg17 ? 255 : 0);
        if (arg7 != -369069976) {
            method590((byte) -47);
        }
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg10[var27 + var27 + 1];
            int var29 = arg10[var27 + var27];
            int[][] var30 = arg2 == null || arg6 == null || !arg6[var27] ? arg13 : arg2;
            var25[var27] = class314.method2162(var22, arg2, arg20, var30, var24, false, arg12, var23, (float) arg5, var29, arg1, arg9, var28, arg3, var26, (byte) 109, arg15, arg21);
        }
        arg3.method215(arg18, arg1, arg20, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!q", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 360)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1154++;
        return true;
    }

    @OriginalMember(owner = "client!q", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 368)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1164++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZII)I", line = 375)
    public static final int method589(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method592(-85);
        }
        field1162++;
        if (class97.field1558 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class308.field5219[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = (128 - var6) * class97.field1558[var7][var4][var5] + (class97.field1558[var7][var4 + 1][var5] * var6) >> 7;
        int var9 = (128 - var6) * class97.field1558[var7][var4][var5 + 1] + class97.field1558[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = arg3 & 0x7F;
        return (128 - var10) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V", line = 411)
    public static void method590(byte arg0) {
        field1174 = null;
        field1173 = null;
        field1167 = null;
        field1169 = null;
        field1146 = null;
        field1170 = null;
        int var1 = 112 % ((-arg0 - 83) / 40);
        field1175 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([Ltl;III)Ltl;", line = 431)
    public static final class59 method591(class59[] arg0, int arg1, int arg2, int arg3) {
        field1149++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class274.field4720;
            }
            var4 += arg0[arg1 + var5].field863;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class59 var9 = arg0[arg1 + var8];
            class63.method520(var9.field889, 0, var6, var7, var9.field863);
            var7 += var9.field863;
        }
        int var10 = 10 % ((arg3 + 84) / 42);
        class59 var11 = new class59();
        var11.field863 = var4;
        var11.field889 = var6;
        return var11;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Graphics;IIIZI)V", line = 485)
    public final void method356(Graphics arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1166++;
        this.method586(arg2, 2, arg5, arg1, arg3);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg1, arg2, arg5);
        if (!arg4) {
            field1167 = (class190) null;
        }
        arg0.drawImage(this.field2931, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 503)
    public final void method355(int arg0, Component arg1, int arg2, int arg3) {
        this.field2930 = arg0;
        field1161++;
        if (arg3 < 76) {
            this.field1148 = (ColorModel) null;
        }
        this.field2934 = arg2;
        this.field2939 = new int[arg0 * arg2 + 1];
        this.field1148 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2931 = arg1.createImage(this);
        this.method593(-97);
        arg1.prepareImage(this.field2931, this);
        this.method593(-119);
        arg1.prepareImage(this.field2931, this);
        this.method593(-109);
        arg1.prepareImage(this.field2931, this);
        this.method1320(16089);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)Lag;", line = 529)
    public static final class186 method592(int arg0) {
        if (arg0 != -32732) {
            field1169 = (class59) null;
        }
        field1157++;
        class186 var1 = (class186) class207.field3380.method7(-72);
        if (var1 != null) {
            var1.method2000(125);
            var1.method997(-13);
            return var1;
        }
        class186 var2;
        do {
            var2 = (class186) class97.field1547.method7(arg0 + 32644);
            if (var2 == null) {
                return null;
            }
            if (var2.method1375(-117) > class205.method1451(-101)) {
                return null;
            }
            var2.method2000(48);
            var2.method997(123);
        } while ((var2.field2264 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 569)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1156++;
        return this.field1168 == arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 586)
    public final void method357(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method593(-100);
        if (arg2 != 1) {
            method585((byte[]) null, (byte) 15);
        }
        arg3.drawImage(this.field2931, arg0, arg1, this);
        field1155++;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 599)
    private final synchronized void method593(int arg0) {
        field1165++;
        if (this.field1168 == null) {
            return;
        }
        this.field1168.setPixels(0, 0, this.field2934, this.field2930, this.field1148, this.field2939, 0, this.field2934);
        this.field1168.imageComplete(2);
        if (arg0 > -55) {
            this.removeConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!q", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 615)
    public final void startProduction(ImageConsumer arg0) {
        field1163++;
        this.addConsumer(arg0);
    }
}

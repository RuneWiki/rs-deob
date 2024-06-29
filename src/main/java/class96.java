import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class96 extends class56 implements ImageProducer {

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Ldj;")
    public static class191 field1214 = new class191(16);

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field1230 = 2;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "Z")
    public static boolean field1223 = false;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "Llm;")
    public static class291 field1224 = new class291(64);

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Ldj;")
    public static class191 field1233 = new class191(16);

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Ltj;")
    public static class108 field1225;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1226;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1216;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1213;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1227;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method567(int arg0) {
        field1225 = null;
        field1224 = null;
        field1214 = null;
        field1233 = null;
        if (arg0 < 101) {
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method365(Canvas arg0, boolean arg1) {
        ++field1229;
        this.field1226 = arg0;
        super.field756 = this.field1226.getSize().width;
        if (!arg1) {
            super.field755 = this.field1226.getSize().height;
            super.field757 = new int[super.field756 * super.field755];
            this.field1213 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field1216 = this.field1226.createImage(this);
            this.method569(10);
            this.field1226.prepareImage(this.field1216, this.field1226);
            this.method569(10);
            this.field1226.prepareImage(this.field1216, this.field1226);
            this.method569(10);
            this.field1226.prepareImage(this.field1216, this.field1226);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method568(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (~arg4 > ~arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg4; ~var9 > ~arg0; ++var9) {
                if (var7 == null || arg3[var9] != null && ~(var9 & 1) < ~arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method568(var6 + -1, arg1, 0, arg3, arg4);
            method568(arg0, arg1, 0, arg3, var6 + 1);
        }
        ++field1212;
        if (arg2 != 0) {
            field1233 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method367(boolean arg0, Graphics arg1, int arg2, int arg3) {
        ++field1232;
        if (arg0) {
            this.method569(10);
            arg1.drawImage(this.field1216, arg3, arg2, this.field1226);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    private final synchronized void method569(int arg0) {
        ++field1218;
        if (this.field1227 != null) {
            if (arg0 != 10) {
                method571(63, 20);
            }
            this.field1227.setPixels(0, 0, super.field756, super.field755, this.field1213, super.field757, 0, super.field756);
            this.field1227.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I[ILpn;[IB)V")
    public static final void method570(int[] arg0, int[] arg1, class446 arg2, int[] arg3, byte arg4) {
        ++field1217;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field4541.length; ++var9) {
                if (~(1 & var7) != -1) {
                    if (var6 != -1) {
                        class183 var10 = class110.method671(-21965, var6);
                        int var11 = var10.field2592;
                        class142 var12 = arg2.field4541[var9];
                        if (var12 != null) {
                            if (~var12.field2147 == ~var6) {
                                if (var11 != 0) {
                                    if (~var11 != -2) {
                                        if (var11 == 2) {
                                            var12.field2152 = 0;
                                        }
                                    } else {
                                        var12.field2152 = 0;
                                        var12.field2150 = var8;
                                        var12.field2148 = 0;
                                        var12.field2155 = 0;
                                        var12.field2149 = 1;
                                        class47.method311(arg2.field4463, arg2.field4466, 0, true, false, var10);
                                    }
                                } else {
                                    var12 = arg2.field4541[var9] = null;
                                }
                            } else if (var10.field2583 >= class110.method671(-21965, var12.field2147).field2583) {
                                var12 = arg2.field4541[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class142 var13 = arg2.field4541[var9] = new class142();
                            var13.field2149 = 1;
                            var13.field2152 = 0;
                            var13.field2150 = var8;
                            var13.field2148 = 0;
                            var13.field2147 = var6;
                            var13.field2155 = 0;
                            class47.method311(arg2.field4463, arg2.field4466, 0, true, false, var10);
                        }
                    } else {
                        arg2.field4541[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        if (arg4 != -76) {
            method568(70, (short[]) null, -81, (String[]) null, -93);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    public static final void method571(int arg0, int arg1) {
        ++field1215;
        class276 var2 = class264.method1816((byte) -111, arg1, arg0);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!ei", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1227 == arg0) {
            this.field1227 = null;
        }
        ++field1231;
    }

    @OriginalMember(owner = "client!ei", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1227 = arg0;
        ++field1211;
        arg0.setDimensions(super.field756, super.field755);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1213);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method572(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field1227 = null;
        }
        ++field1222;
        if (this.field1227 != null) {
            this.field1227.setPixels(arg0, arg2, arg1, arg3, this.field1213, super.field757, super.field756 * arg2 - -arg0, super.field756);
            this.field1227.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1210;
    }

    @OriginalMember(owner = "client!ei", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1221;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public static final void method573(byte arg0) {
        ++field1219;
        class431.method2693(false, arg0 ^ -58);
        if (class374.field5339 >= 0 && class374.field5339 != 0) {
            class358.method2335((byte) -128, class374.field5339);
            class374.field5339 = -1;
        }
        if (arg0 != 57) {
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method572(arg1, arg0, arg4, arg3, false);
        ++field1220;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg4, arg0, arg3);
        arg5.drawImage(this.field1216, 0, 0, this.field1226);
        if (arg2 != 23608) {
            field1214 = null;
        }
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ei", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1228;
        return this.field1227 == arg0;
    }
}

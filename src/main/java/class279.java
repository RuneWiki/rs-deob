import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class279 {

    @OriginalMember(owner = "client!wja", name = "i", descriptor = "Ltia;")
    private class278 field4560;

    @OriginalMember(owner = "client!wja", name = "h", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4567 = new String[] { method2400(method2399("##{\u0001e|")), method2400(method2399("##{\u0001c|")), method2400(method2399("##{\u0001B='{CM.,2")), method2400(method2399("/g4\u0001Y")), method2400(method2399("##{\u0001a|")), method2400(method2399(":<vC")), method2400(method2399("##{\u0001f|")), method2400(method2399("##{\u0001b|")), method2400(method2399("##{\u0001\u0018='s[\u001a|")) };

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "[F")
    public static float[] field4566 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!wja", name = "f", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wja", name = "e", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(IIII)V", line = 3)
    public static final void method2392(int arg0, int arg1, int arg2, int arg3) {
        try {
            field4564++;
            int var7 = arg0 * class623.field8996.field6395.method4796(true) >> 8;
            if (var7 != 0 && arg1 != -1) {
                if (!class127.field1835 && class588.field8526 != -1 && class453.method3515(-1) && !class781.method5609(-6509)) {
                    class391.field6242 = class644.method4662(false);
                    class114 var4 = class409.method3285(arg3 - 3319, class391.field6242);
                    class535.method3990(var4, true, (byte) -112);
                }
                class347.method2901(false, class748.field11040, (byte) 113, arg1, 0, var7);
                class182.method1716(127, -1, 255);
                class127.field1835 = true;
            }
            if (arg3 != 255) {
                method2397(12);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4567[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V", line = 32)
    public static final void method2393(int arg0) {
        class103.field1521 = arg0;
        for (int var1 = 0; var1 < class150.field2096; var1++) {
            for (int var2 = 0; var2 < class117.field1705; var2++) {
                if (class85.field1280[arg0][var1][var2] == null) {
                    class85.field1280[arg0][var1][var2] = new class290(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V", line = 54)
    public static final void method2394(int arg0) {
        try {
            if (arg0 != -10660) {
                field4566 = null;
            }
            class344.field5594 = (int) ((double) class126.field1823 * 34.46D);
            class196.field3120 = 200;
            field4565++;
            class344.field5594 <<= 0x2;
            if (class662.field9437.method160()) {
                class344.field5594 += 512;
            }
            class381.method3120(21690, false);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4567[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method2395(int arg0, int arg1, int arg2, int arg3) {
        try {
            field4558++;
            int var4 = arg3 / arg0;
            int var5 = arg0 - 1 & arg3;
            int var6 = arg2 / arg0;
            int var7 = arg0 - 1 & arg2;
            int var8 = class431.method3409(-1, var6, var4);
            int var9 = class431.method3409(-1, var6, var4 + 1);
            int var10 = class431.method3409(-1, var6 + 1, var4);
            int var11 = class431.method3409(-1, var6 + 1, var4 - -1);
            if (arg1 <= 27) {
                method2392(72, -82, -72, 67);
            }
            int var12 = class672.method4865(var9, var8, var5, 1, arg0);
            int var13 = class672.method4865(var11, var10, var5, 1, arg0);
            return class672.method4865(var13, var12, var7, 1, arg0);
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4567[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(II)V", line = 110)
    public static final void method2396(int arg0, int arg1) {
        class192 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class293 var4 = class493.field7420[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class117.field1705; var5++) {
                    for (int var6 = 0; var6 < class150.field2096; var6++) {
                        var2 = var4.method712(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class165.field2688;
                            int var8 = var5 << class165.field2688;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class293 var10 = class493.field7420[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2495(var5, 1, var6) - var10.method2495(var5, 1, var6);
                                    int var12 = var4.method2495(var5, 1, var6 + 1) - var10.method2495(var5, 1, var6 + 1);
                                    int var13 = var4.method2495(var5 + 1, 1, var6 + 1) - var10.method2495(var5 + 1, 1, var6 + 1);
                                    int var14 = var4.method2495(var5 + 1, 1, var6) - var10.method2495(var5 + 1, 1, var6);
                                    var10.method714(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wja", name = "finalize", descriptor = "()V", line = 176)
    protected final void finalize() throws Throwable {
        try {
            field4562++;
            this.field4560.method2388(this.field4561, 113);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4567[2] + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)V", line = 189)
    public static void method2397(int arg0) {
        try {
            if (arg0 != 0) {
                field4566 = null;
            }
            field4566 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4567[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Z[B)Lhk;", line = 199)
    public static final class107 method2398(boolean arg0, byte[] arg1) {
        try {
            field4559++;
            if (!arg0) {
                return null;
            } else if (arg1 == null) {
                throw new RuntimeException("");
            } else {
                while (true) {
                    try {
                        Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                        MediaTracker var3 = new MediaTracker(class392.field6245);
                        var3.addImage(var2, 0);
                        var3.waitForAll();
                        int var4 = var2.getWidth(class392.field6245);
                        int var5 = var2.getHeight(class392.field6245);
                        if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                            int[] var6 = new int[var4 * var5];
                            PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                            var7.grabPixels();
                            return class662.field9437.method665(var4, var4, 117, 0, var6, var5);
                        }
                        throw new RuntimeException("");
                    } catch (InterruptedException var9) {
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4567[4] + arg0 + ',' + (arg1 == null ? field4567[5] : field4567[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Ltia;II)V", line = 243)
    public class279(class278 arg0, int arg1, int arg2) {
        try {
            this.field4560 = arg0;
            this.field4561 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4567[8] + (arg0 == null ? field4567[5] : field4567[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2399(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2400(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

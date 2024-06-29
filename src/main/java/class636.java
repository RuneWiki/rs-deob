import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class636 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "[J")
    public static long[] field8841 = new long[32];

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Luaa;")
    public static class119 field8840;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method3582(byte arg0) {
        field8841 = null;
        int var1 = 95 / ((-arg0 - 39) / 52);
        field8840 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([BI)Lufa;")
    public static final class680 method3583(byte[] arg0, int arg1) {
        if (arg1 != 1) {
            field8841 = null;
        }
        field8842++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class58.field623);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class58.field623);
                int var5 = var2.getHeight(class58.field623);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class21.field142.method351(arg1 ^ 0xFFFFE0E7, 0, var4, var5, var6, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILha;Lkia;)V")
    public static final void method3584(int arg0, int arg1, class60 arg2, class620 arg3) {
        field8843++;
        if (class579.field8118 != null && arg1 <= arg3.field8690) {
            for (int var4 = 0; var4 < class579.field8118.length; var4++) {
                if (class579.field8118[var4] != -1000000 && (class579.field8118[var4] >= arg3.field8689[0] || class579.field8118[var4] >= arg3.field8689[1] || arg3.field8689[2] <= class579.field8118[var4] || class579.field8118[var4] >= arg3.field8689[3]) && (class294.field3947[var4] >= arg3.field8692[0] || class294.field3947[var4] >= arg3.field8692[1] || class294.field3947[var4] >= arg3.field8692[2] || class294.field3947[var4] >= arg3.field8692[3]) && (class365.field4820[var4] <= arg3.field8692[0] || class365.field4820[var4] <= arg3.field8692[1] || class365.field4820[var4] <= arg3.field8692[2] || arg3.field8692[3] >= class365.field4820[var4]) && (class692.field9672[var4] >= arg3.field8694[0] || arg3.field8694[1] <= class692.field9672[var4] || arg3.field8694[2] <= class692.field9672[var4] || arg3.field8694[3] <= class692.field9672[var4]) && (arg3.field8694[0] >= class307.field4168[var4] || arg3.field8694[1] >= class307.field4168[var4] || class307.field4168[var4] <= arg3.field8694[2] || class307.field4168[var4] <= arg3.field8694[3])) {
                    return;
                }
            }
        }
        if (arg3.field8696 == 1) {
            int var5 = arg3.field8688 + class118.field1562 - class610.field8512;
            if (var5 >= 0 && var5 <= (class118.field1562 + class118.field1562)) {
                int var6 = class118.field1562 + arg3.field8691 - class39.field407;
                if (var6 < 0) {
                    var6 = 0;
                } else if ((class118.field1562 + class118.field1562) < var6) {
                    return;
                }
                int var7 = arg3.field8699 + class118.field1562 - class39.field407;
                if (var7 > class118.field1562 + class118.field1562) {
                    var7 = class118.field1562 + class118.field1562;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class423.field5940[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class211.field2526 - arg3.field8692[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class137.field1746 > var9) && class684.method3871(0, arg0 + 5538, arg3) && class684.method3871(1, 5541, arg3) && class684.method3871(2, 5541, arg3) && class684.method3871(3, 5541, arg3)) {
                        class462.field6395[class501.field6815++] = arg3;
                    }
                }
            }
            return;
        }
        if (arg0 != 3) {
            method3582((byte) -55);
        }
        if (arg3.field8696 == 2) {
            int var10 = arg3.field8691 + class118.field1562 - class39.field407;
            if (var10 >= 0 && class118.field1562 + class118.field1562 >= var10) {
                int var11 = class118.field1562 + arg3.field8688 - class610.field8512;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > class118.field1562 + class118.field1562) {
                    return;
                }
                int var12 = class118.field1562 + arg3.field8697 - class610.field8512;
                if (var12 > (class118.field1562 + class118.field1562)) {
                    var12 = class118.field1562 + class118.field1562;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class423.field5940[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class671.field9323 - arg3.field8694[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class137.field1746 > var14) && class684.method3871(0, 5541, arg3) && class684.method3871(1, 5541, arg3) && class684.method3871(2, 5541, arg3) && class684.method3871(3, 5541, arg3)) {
                        class462.field6395[class501.field6815++] = arg3;
                    }
                }
            }
        } else if (arg3.field8696 == 16 || arg3.field8696 == 8) {
            int var23 = class118.field1562 + arg3.field8688 - class610.field8512;
            if (var23 >= 0 && (class118.field1562 + class118.field1562) >= var23) {
                int var24 = arg3.field8691 + class118.field1562 - class39.field407;
                if (var24 >= 0 && var24 <= (class118.field1562 + class118.field1562) && class423.field5940[var23][var24]) {
                    float var25 = (float) (class211.field2526 - arg3.field8692[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class671.field9323 - arg3.field8694[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class137.field1746 > var25) || !((float) class137.field1746 > var26) && class684.method3871(0, arg0 ^ 0x15A6, arg3) && class684.method3871(1, 5541, arg3) && class684.method3871(2, 5541, arg3) && class684.method3871(3, 5541, arg3)) {
                        class462.field6395[class501.field6815++] = arg3;
                    }
                }
            }
        } else if (arg3.field8696 == 4) {
            float var15 = (float) (arg3.field8689[0] - class495.field6743);
            if (!(var15 <= (float) class389.field5483)) {
                int var16 = class118.field1562 + arg3.field8691 - class39.field407;
                if (var16 < 0) {
                    var16 = 0;
                } else if (class118.field1562 + class118.field1562 < var16) {
                    return;
                }
                int var17 = arg3.field8699 + class118.field1562 - class39.field407;
                if (var17 > class118.field1562 + class118.field1562) {
                    var17 = class118.field1562 + class118.field1562;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = class118.field1562 + arg3.field8688 - class610.field8512;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > (class118.field1562 + class118.field1562)) {
                    return;
                }
                int var19 = class118.field1562 + arg3.field8697 - class610.field8512;
                if (var19 > class118.field1562 + class118.field1562) {
                    var19 = class118.field1562 + class118.field1562;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label294: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class423.field5940[var21][var22]) {
                            var20 = true;
                            break label294;
                        }
                    }
                }
                if (var20 && class684.method3871(0, 5541, arg3) && class684.method3871(1, arg0 + 5538, arg3) && class684.method3871(2, arg0 ^ 0x15A6, arg3) && class684.method3871(3, 5541, arg3)) {
                    class462.field6395[class501.field6815++] = arg3;
                }
            }
        }
    }
}

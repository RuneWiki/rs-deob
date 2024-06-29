import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class196 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Laf;")
    public static class68 field3126 = new class68(64);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lea;")
    public static class37 field3129;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
    public static int[] field3130;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[[[B")
    public static byte[][][] field3131;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field3129 = null;
        field3130 = null;
        field3131 = null;
        field3126 = null;
        if (arg0 != -15313) {
            field3129 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class153.field2479.field275; var9++) {
            if (class153.field2479.method128(var9, (byte) 2)) {
                int var10 = class153.field2479.field276[var9] - class161.field2568;
                int var11 = (var10 - arg3) * (arg0 - arg1) / (arg8 - arg3) + arg1;
                int var12 = class223.field3692 + class210.field3428 - class153.field2479.field264[var9] - 1;
                class147 var13 = null;
                int var14 = (arg5 - arg2) * (var12 - arg6) / (arg7 - arg6) + arg2;
                int var15 = 16777215;
                int var16 = class153.field2479.method124((byte) -88, var9);
                if (var16 == 0) {
                    if ((double) class221.field3668 == 3.0D) {
                        var13 = class121.field1974;
                    }
                    if ((double) class221.field3668 == 4.0D) {
                        var13 = class79.field1262;
                    }
                    if ((double) class221.field3668 == 6.0D) {
                        var13 = class205.field3294;
                    }
                    if ((double) class221.field3668 >= 8.0D) {
                        var13 = class189.field3061;
                    }
                }
                if (var16 == 1) {
                    if ((double) class221.field3668 == 3.0D) {
                        var13 = class205.field3294;
                    }
                    if ((double) class221.field3668 == 4.0D) {
                        var13 = class189.field3061;
                    }
                    if ((double) class221.field3668 == 6.0D) {
                        var13 = class176.field2772;
                    }
                    if ((double) class221.field3668 >= 8.0D) {
                        var13 = class155.field2509;
                    }
                }
                if (var16 == 2) {
                    if ((double) class221.field3668 == 3.0D) {
                        var13 = class176.field2772;
                    }
                    var15 = 16755200;
                    if ((double) class221.field3668 == 4.0D) {
                        var13 = class155.field2509;
                    }
                    if ((double) class221.field3668 == 6.0D) {
                        var13 = class247.field3938;
                    }
                    if ((double) class221.field3668 >= 8.0D) {
                        var13 = class44.field804;
                    }
                }
                if (class153.field2479.field278[var9] != -1) {
                    var15 = class153.field2479.field278[var9];
                }
                if (var13 != null) {
                    int var17 = class158.field2555.method1806(class153.field2479.field266[var9], (int[]) null, class198.field3156);
                    int var18 = var14 - var13.method1005() * (var17 - 1) / 2;
                    int var19 = var18 + var13.method1010() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        String var21 = class198.field3156[var20];
                        if (var20 < (var17 - 1)) {
                            var21 = var21.substring(0, var21.length() - 4);
                        }
                        var13.method1007(var21, var11, var19, var15, true);
                        var19 += var13.method1005();
                    }
                }
            }
        }
        field3125++;
        if (arg4 < 85) {
            field3131 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILqh;II)[Ld;")
    public static final class238[] method1333(int arg0, class201 arg1, int arg2, int arg3) {
        if (arg3 <= 34) {
            field3130 = null;
        }
        field3128++;
        return class239.method1657(arg2, -115, arg0, arg1) ? class115.method849(15179) : null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method1334(int arg0) {
        field3127++;
        int var1 = class236.field3842;
        int var2 = class198.field3163;
        int var3 = class255.field4048 - class84.field1326 - var1;
        int var4 = class258.field4099 - class279.field4423 - var2;
        if (arg0 <= ~var1 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class77.field1234 != null) {
                var5 = class77.field1234;
            } else if (class110.field1811 == null) {
                var5 = class105.field1684.field2620;
            } else {
                var5 = class110.field1811;
            }
            int var6 = 0;
            int var7 = 0;
            if (class110.field1811 == var5) {
                Insets var8 = class110.field1811.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class258.field4099);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class255.field4048, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class255.field4048 - var3, var7, var3, class258.field4099);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class258.field4099 + var7 - var4, class255.field4048, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}

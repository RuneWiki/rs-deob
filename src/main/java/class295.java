import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class295 extends class168 {

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "Z")
    public static boolean field3882 = false;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "[I")
    public static int[] field3885 = new int[3];

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!gga", name = "A", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!gga", name = "B", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!gga", name = "C", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "Lct;")
    public class148 field3900;

    @OriginalMember(owner = "client!gga", name = "E", descriptor = "Lbr;")
    public class397 field3896;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "Lgs;")
    public class45 field3880;

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "Lfca;")
    public class86 field3898;

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "[S")
    public static short[] field3891;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lha;I)V")
    public static final void method1770(class60 arg0, int arg1) {
        field3892++;
        if (class26.field474 == class380.field4847.field5796) {
            return;
        }
        if (arg1 > -71) {
            method1775(true);
        }
        if (class197.field2689 != null && class637.method3573(class380.field4847.field5796, 4, arg0)) {
            class26.field474 = class380.field4847.field5796;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V")
    public final void method1771(int arg0) {
        this.field3900 = null;
        if (arg0 == 28465) {
            this.field3898 = null;
            field3893++;
            this.field3896 = null;
            this.field3880 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)Liea;")
    public static final class481 method1772(byte[] arg0, byte arg1) {
        field3883++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        if (arg1 < 112) {
            method1772(null, (byte) -33);
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class654.field9104);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class654.field9104);
                int var5 = var2.getHeight(class654.field9104);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class386.field4930.method435(var4, 0, var5, 113, var6, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BZIII)V")
    public static final void method1773(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3901++;
        if (!arg1 && class21.field384 == arg2 && class409.field5196 == arg4 && class472.field6329 == class440.field5865 || class748.field10451.field10412.method1806((byte) -46) == 1) {
            return;
        }
        class440.field5865 = class472.field6329;
        class21.field384 = arg2;
        class409.field5196 = arg4;
        if (class748.field10451.field10412.method1806((byte) -54) == 1) {
            class440.field5865 = 0;
        }
        class571.method3275(27461, arg3);
        if (arg0 != -107) {
            method1770(null, -33);
        }
        class163.method1139(class372.field4774, class386.field4930, 110, true, class697.field9708, class454.field6015.method2547(-104, class243.field3143));
        int var5 = class332.field4232;
        int var6 = class447.field5936;
        class332.field4232 = (class21.field384 - (class409.field5183 >> 4)) * 8;
        class447.field5936 = (class409.field5196 - (class543.field7597 >> 4)) * 8;
        class678.field9471 = class73.method653(class21.field384 * 8, class409.field5196 * 8);
        class583.field8162 = null;
        int var7 = class332.field4232 - var5;
        int var8 = class447.field5936 - var6;
        if (arg3 == 11) {
            for (int var9 = 0; var9 < class54.field752; var9++) {
                class592 var10 = class638.field8801[var9];
                if (var10 != null) {
                    class733 var11 = var10.field8280;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field264[var12] -= var7;
                        var11.field260[var12] -= var8;
                    }
                    var11.field5801 -= var7 * 512;
                    var11.field5797 -= var8 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class646.field8947 = 0;
            int var14 = (class409.field5183 - 1) * 512;
            int var15 = class543.field7597 * 512 - 512;
            for (int var16 = 0; var16 < class54.field752; var16++) {
                class592 var30 = class638.field8801[var16];
                if (var30 != null) {
                    class733 var31 = var30.field8280;
                    var31.field5801 -= var7 * 512;
                    var31.field5797 -= var8 * 512;
                    if (var31.field5801 >= 0 && var31.field5801 <= var14 && var31.field5797 >= 0 && var31.field5797 <= var15) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field264[var33] -= var7;
                            var31.field260[var33] -= var8;
                            if (var31.field264[var33] < 0 || class409.field5183 <= var31.field264[var33] || var31.field260[var33] < 0 || var31.field260[var33] >= class543.field7597) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class751.field10483[class646.field8947++] = var31.field189;
                        } else {
                            var31.method4090(null, 0);
                            var13 = true;
                            var30.method1175(-2);
                        }
                    } else {
                        var31.method4090(null, 0);
                        var30.method1175(-2);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class54.field752 = class207.field2745.method1159((byte) -106);
                class207.field2745.method1152(class638.field8801, 32260);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class724 var28 = class5.field49[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field264[var29] -= var7;
                    var28.field260[var29] -= var8;
                }
                var28.field5797 -= var8 * 512;
                var28.field5801 -= var7 * 512;
            }
        }
        class323[] var18 = class98.field1369;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class323 var27 = var18[var19];
            if (var27 != null) {
                var27.field4159 -= var7 * 512;
                var27.field4164 -= var8 * 512;
            }
        }
        for (class729 var20 = (class729) class757.field10565.method3672(-1); var20 != null; var20 = (class729) class757.field10565.method3662(-1)) {
            var20.field10139 -= var8;
            var20.field10154 -= var7;
            if (class547.field7642 != 4 && (var20.field10154 < 0 || var20.field10139 < 0 || class409.field5183 <= var20.field10154 || var20.field10139 >= class543.field7597)) {
                var20.method1175(arg0 ^ 0x6B);
            }
        }
        for (class729 var21 = (class729) class719.field10016.method3672(-1); var21 != null; var21 = (class729) class719.field10016.method3662(-1)) {
            var21.field10139 -= var8;
            var21.field10154 -= var7;
            if (class547.field7642 != 4 && (var21.field10154 < 0 || var21.field10139 < 0 || class409.field5183 <= var21.field10154 || class543.field7597 <= var21.field10139)) {
                var21.method1175(arg0 ^ 0x6B);
            }
        }
        if (class547.field7642 != 4) {
            for (class133 var22 = (class133) class342.field4322.method1156(0); var22 != null; var22 = (class133) class342.field4322.method1158(arg0 + 22813)) {
                int var23 = (int) (var22.field2333 & 0x3FFFL);
                int var24 = var23 - class332.field4232;
                int var25 = (int) (var22.field2333 >> 14 & 0x3FFFL);
                int var26 = var25 - class447.field5936;
                if (var24 < 0 || var26 < 0 || class409.field5183 <= var24 || var26 >= class543.field7597) {
                    var22.method1175(-2);
                }
            }
        }
        if (class755.field10539 != 0) {
            class366.field4727 -= var8;
            class755.field10539 -= var7;
        }
        class540.method3095((byte) -30);
        if (arg3 != 11) {
            class579.field8109 -= var8;
            class318.field4121 -= var8 * 512;
            class458.field6082 -= var8;
            class450.field5953 -= var7 * 512;
            class685.field9555 -= var7;
            class230.field3029 -= var7;
            if (Math.abs(var7) > class409.field5183 || Math.abs(var8) > class543.field7597) {
                class421.method2347((byte) -47);
            }
        } else if (class650.field9023 == 4) {
            class347.field4454 -= var8 * 512;
            class289.field3789 -= var7 * 512;
            class116.field1724 -= var8 * 512;
            class758.field10586 -= var7 * 512;
        } else {
            class650.field9023 = 1;
            class35.field560 = -1;
            class746.field10437 = -1;
        }
        class730.method4071(arg0 ^ 0xFFFFFF95);
        class126.method947((byte) 42);
        class368.field4759.method3668(0);
        class207.field2744.method3668(0);
        class273.field3427.method165(-120);
        class432.method2472(4588);
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V")
    public static final void method1774(int arg0) {
        if (arg0 == 0) {
            if (class283.field3573 == 2) {
                class433.field5776[0].method4172(class160.field2211[0]);
                class433.field5776[1].method4172(class160.field2211[1]);
            } else if (class283.field3573 == 3) {
                class433.field5776[0].method4172(class160.field2211[0]);
                class433.field5776[1].method4172(class160.field2211[1]);
                class433.field5776[2].method4172(class160.field2211[2]);
            } else {
                class433.field5776[0].method4172(class160.field2211[0]);
                class433.field5776[1].method4172(class160.field2211[1]);
                class433.field5776[2].method4172(class160.field2211[2]);
                class433.field5776[3].method4172(class160.field2211[3]);
            }
        } else if (arg0 == 1) {
            if (class283.field3573 == 2) {
                class433.field5776[0].method4172(class160.field2211[2]);
            } else if (class283.field3573 == 3) {
                class433.field5776[0].method4172(class160.field2211[3]);
                class433.field5776[1].method4172(class160.field2211[4]);
            } else {
                class433.field5776[0].method4172(class160.field2211[4]);
                class433.field5776[1].method4172(class160.field2211[5]);
                class433.field5776[2].method4172(class160.field2211[6]);
            }
        } else if (arg0 == 2) {
            if (class283.field3573 == 2) {
                class433.field5776[0].method4172(class160.field2211[3]);
                return;
            }
            if (class283.field3573 == 3) {
                class433.field5776[0].method4172(class160.field2211[5]);
                return;
            }
            class433.field5776[0].method4172(class160.field2211[7]);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)V")
    public static void method1775(boolean arg0) {
        if (!arg0) {
            field3891 = null;
        }
        field3891 = null;
        field3885 = null;
    }
}

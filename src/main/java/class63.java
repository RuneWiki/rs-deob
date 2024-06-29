import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 {

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    private int field716 = 1;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    private int field724 = 0;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    private int field735 = 0;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    private int field738 = 1;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "Lgca;")
    private class227 field728 = new class227();

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "Z")
    private boolean field746 = false;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "Z")
    private boolean field743 = true;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "Z")
    private boolean field744 = true;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "Z")
    private boolean field741 = true;

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "[Lcw;")
    private class164[] field740 = new class164[2];

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "Z")
    private boolean field742 = true;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
    private int field745 = -1;

    @OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
    private int field749 = 0;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Llj;")
    private class565 field726;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "Lvca;")
    private class254 field720;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "Lvca;")
    private class254 field722;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "Lvca;")
    private class254 field729;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "J")
    public static long field725 = 0L;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "F")
    public static float field730;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!pv", name = "N", descriptor = "Lcw;")
    private class164 field748;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "Lvfa;")
    private class624 field747;

    @OriginalMember(owner = "client!pv", name = "P", descriptor = "Lvfa;")
    private class624 field750;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pv", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field751;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "Z")
    private boolean field734;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[Lui;")
    public static class209[] field713;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
    public static void method517(boolean arg0) {
        if (!arg0) {
            field713 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z[B)Lf;")
    public static final class702 method518(boolean arg0, byte[] arg1) {
        field717++;
        if (arg0) {
            return null;
        } else if (arg1 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                    MediaTracker var3 = new MediaTracker(class647.field8937);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class647.field8937);
                    int var5 = var2.getHeight(class647.field8937);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class334.field4506.method175(var6, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static final void method519(int arg0) {
        field737++;
        try {
            Method var1 = (field751 == null ? (field751 = method532("java.lang.Runtime")) : field751).getMethod("availableProcessors");
            if (arg0 < 40) {
                field719 = 69;
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class463.field6380 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public final void method520(byte arg0) {
        this.field748 = null;
        field733++;
        this.field722 = this.field729 = this.field720 = null;
        this.field740 = null;
        this.field747 = null;
        this.field750 = null;
        if (!this.field728.method1435((byte) -98)) {
            for (class401 var2 = this.field728.method1436(28964); var2 != this.field728.field3151; var2 = var2.field5625) {
                ((class474) var2).method1883(34842);
            }
        }
        if (arg0 >= -71) {
            method526(false);
        }
        this.field738 = this.field716 = 1;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Luca;I)V")
    public final void method521(class474 arg0, int arg1) {
        arg0.field6518 = false;
        field714++;
        arg0.method1883(arg1 ^ 0x881A);
        arg0.method2340(106);
        this.method524(true);
        if (arg1 != 0) {
            method519(-76);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILuca;)Z")
    public final boolean method522(int arg0, class474 arg1) {
        if (arg0 != 0) {
            method518(true, null);
        }
        field718++;
        if (this.field722 != null) {
            if (arg1.method1888(true) || arg1.method1885(arg0 ^ 0x7E)) {
                this.field728.method1441(arg1, arg0);
                this.method524(true);
                if (this.method529(-14392)) {
                    if (this.field738 != -1 && this.field716 != -1) {
                        arg1.method1886(this.field716, this.field738, 106);
                    }
                    arg1.field6518 = true;
                    return true;
                }
            }
            this.method521(arg1, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)Z")
    public final boolean method523(byte arg0) {
        field739++;
        if (arg0 != -56) {
            this.field720 = null;
        }
        return this.field722 != null;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
    private final void method524(boolean arg0) {
        field712++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class474 var5 = (class474) this.field728.method1436(28964); var5 != null; var5 = (class474) this.field728.method1443((byte) 6)) {
            int var9 = var5.method1884((byte) -125);
            var4 += var5.method2675((byte) 121);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method2668(32512);
        }
        if (!arg0) {
            method531(107, 10, 1.4994236F, (byte) -36, 125, null, 0.25825208F, 90, -10, 106, -97);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field745 != var6) {
            this.field742 = true;
            this.field745 = var6;
        }
        int var7 = this.field749 <= 2 ? this.field749 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field746) {
            this.field746 = var2;
            this.field741 = true;
        }
        this.field749 = var4;
        if (var7 != var8) {
            this.field744 = this.field742 = true;
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)V")
    public final void method525(byte arg0) {
        field710++;
        if (!this.field734) {
            return;
        }
        if (this.field729 != null) {
            this.field726.method3163(this.field729, (byte) -59);
            int var2 = 16384;
            this.field726.method3192(false, this.field720);
            this.field729.method1559(0, 121);
            this.field720.method1557(false, 0);
            if (this.field746) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field738, this.field716, 0, 0, this.field738, this.field716, var2, 9728);
            this.field726.method3234(false, this.field729);
            this.field726.method3161(114, this.field720);
        }
        if (arg0 != 99) {
            return;
        }
        this.field726.method3160(34168);
        this.field726.method3237(16015, 0);
        this.field726.method3205(5123, 1);
        this.field726.method193();
        int var3 = 0;
        int var4 = 1;
        class474 var6;
        for (class474 var5 = (class474) this.field728.method1436(28964); var5 != null; var5 = var6) {
            var6 = (class474) this.field728.method1443((byte) 6);
            int var7 = var5.method2675((byte) -17);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1881(this.field748, 1, var8, this.field740[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field726.method3166(this.field720, (byte) -126);
                    this.field726.method3178(0, 34962, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field716);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field724, this.field735);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field724, this.field735 + this.field716);
                    OpenGL.glTexCoord2f((float) this.field738, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field738 + this.field724, this.field735 + this.field716);
                    OpenGL.glTexCoord2f((float) this.field738, (float) this.field716);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field738 + this.field724, this.field735);
                    OpenGL.glEnd();
                } else {
                    this.field720.method1557(false, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field716);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field716);
                    OpenGL.glTexCoord2f((float) this.field738, (float) this.field716);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field738, this.field716);
                    OpenGL.glTexCoord2f((float) this.field738, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field738, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method1882(var8, -114);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field734 = false;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)V")
    public static final void method526(boolean arg0) {
        field736++;
        class389.field5502.method2605(-30067);
        class322.field4389.method3502((byte) 127);
        class85.field1251.method3318((byte) -87);
        class475.field6543.method2689(0);
        class347.field4640.method2585(0);
        class599.field8366.method3952((byte) -121);
        class192.field2727.method3087((byte) 71);
        class430.field5994.method2000(9368);
        class333.field4490.method2040((byte) -76);
        class59.field667.method2905((byte) -125);
        class198.field2828.method2483(!arg0);
        class643.field8871.method355(-125);
        class123.field1685.method3704(-59);
        class202.field2859.method75(false);
        class71.field952.method1982((byte) 23);
        class433.field6033.method3777(-27409);
        class444.field6147.method3382(-2047);
        class683.field9761.method65(-125);
        class542.field7338.method3356(33);
        class173.field2514.method1251(-2);
        class61.method503(-1);
        class519.method2959(120);
        class597.method3373(0);
        class534.method3030(114);
        if (class603.field8404 != class164.field2358) {
            for (int var1 = 0; var1 < class550.field7434.length; var1++) {
                class550.field7434[var1] = null;
            }
            class624.field8660 = 0;
        }
        class494.method2789(125);
        class228.method1448(81);
        class588.method3339(5890);
        class618.method3444((byte) -62);
        class251.method1542((byte) 30);
        class97.field1371.method3749(7648);
        class334.field4506.method135();
        class324.method1946(126);
        class137.method962(15124);
        class419.field5912.method3628((byte) -14);
        class330.field4459.method3628((byte) -14);
        class565.field7749.method3628((byte) -14);
        class402.field5641.method3628((byte) -14);
        class23.field279.method3628((byte) -14);
        class609.field8458.method3628((byte) -14);
        class481.field6621.method3628((byte) -14);
        class125.field1812.method3628((byte) -14);
        if (arg0) {
            method530(16, 31);
        }
        class508.field6961.method3628((byte) -14);
        class412.field5848.method3628((byte) -14);
        class378.field5060.method3628((byte) -14);
        class700.field9930.method3628((byte) -14);
        class221.field3091.method3628((byte) -14);
        class55.field627.method3628((byte) -14);
        class76.field992.method3628((byte) -14);
        class442.field6134.method3628((byte) -14);
        class523.field7097.method3628((byte) -14);
        class341.field4579.method3628((byte) -14);
        class630.field8745.method3628((byte) -14);
        class697.field9899.method3628((byte) -14);
        class314.field4343.method3628((byte) -14);
        class84.field1250.method3628((byte) -14);
        class13.field137.method3628((byte) -14);
        class114.field1580.method3628((byte) -14);
        class69.field932.method3628((byte) -14);
        class589.field8274.method3628((byte) -14);
        class507.field6953.method3628((byte) -14);
        class360.field4757.method3628((byte) -14);
        class609.field8459.method3628((byte) -14);
        class426.field5969.method3628((byte) -14);
        class227.field3162.method3628((byte) -14);
        class605.field8413.method3628((byte) -14);
        class4.field33.method3749(7648);
        class178.field2582.method3749(7648);
        class330.field4458.method3749(7648);
        class260.field3537.method3749(7648);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLjava/lang/Object;I)[B")
    public static final byte[] method527(int arg0, boolean arg1, Object arg2, int arg3) {
        field711++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class233.method1473(arg3, (byte) 22, var4, arg0);
        } else if (arg2 instanceof class59) {
            class59 var5 = (class59) arg2;
            return var5.method493(arg0, 119, arg3);
        } else {
            if (!arg1) {
                method519(-13);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIB)Z")
    public final boolean method528(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field727++;
        if (this.field722 == null || this.field728.method1435((byte) -98)) {
            return false;
        }
        if (this.field738 != arg1 || this.field716 != arg0) {
            this.field738 = arg1;
            this.field716 = arg0;
            for (class401 var6 = this.field728.method1436(28964); var6 != this.field728.field3151; var6 = var6.field5625) {
                ((class474) var6).method1886(this.field716, this.field738, 107);
            }
            this.field742 = true;
            this.field744 = true;
            this.field741 = true;
        }
        if (!this.method529(-14392)) {
            if (arg4 <= 60) {
                this.field716 = -94;
            }
            return false;
        }
        this.field734 = true;
        this.field724 = arg3;
        this.field735 = arg2;
        this.field726.method3200((byte) -47, this.field722);
        this.field722.method1557(false, 0);
        this.field726.method3178(-this.field724, 34962, this.field716 + this.field735 - this.field726.field7789);
        return true;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Z")
    private final boolean method529(int arg0) {
        field723++;
        if (this.field741) {
            if (this.field747 != null) {
                this.field747.method3469(true);
                this.field747 = null;
            }
            if (this.field748 != null) {
                this.field748.method949((byte) -67);
                this.field748 = null;
            }
            if (this.field729 != null) {
                this.field747 = new class624(this.field726, 6402, this.field738, this.field716, this.field726.field7811);
            }
            if (this.field746) {
                this.field748 = new class164(this.field726, 34037, 6402, this.field738, this.field716);
            } else if (this.field747 == null) {
                this.field747 = new class624(this.field726, 6402, this.field738, this.field716);
            }
            this.field743 = true;
            this.field744 = true;
            this.field741 = false;
        }
        if (this.field742) {
            if (this.field750 != null) {
                this.field750.method3469(true);
                this.field750 = null;
            }
            if (this.field740[0] != null) {
                this.field740[0].method949((byte) -67);
                this.field740[0] = null;
            }
            if (this.field740[1] != null) {
                this.field740[1].method949((byte) -67);
                this.field740[1] = null;
            }
            if (this.field729 != null) {
                this.field750 = new class624(this.field726, this.field745, this.field738, this.field716, this.field726.field7811);
            }
            this.field740[0] = new class164(this.field726, 34037, this.field745, this.field738, this.field716);
            this.field740[1] = this.field749 <= 1 ? null : new class164(this.field726, 34037, this.field745, this.field738, this.field716);
            this.field743 = true;
            this.field742 = false;
            this.field744 = true;
        }
        if (arg0 != -14392) {
            return true;
        }
        if (this.field744) {
            if (this.field729 == null) {
                this.field726.method3200((byte) -47, this.field720);
                this.field720.method1565(arg0 ^ 0x3838, 0);
                this.field720.method1565(arg0 + 14482, 1);
                this.field720.method1565(-86, 8);
                this.field720.method1567(this.field740[0], (byte) 40, 0);
                if (this.field749 > 1) {
                    this.field720.method1567(this.field740[1], (byte) 40, 1);
                }
                if (this.field746) {
                    this.field720.method1567(this.field748, (byte) 40, 8);
                } else {
                    this.field720.method1562(true, 8, this.field747);
                }
                this.field726.method3166(this.field720, (byte) -126);
            } else {
                this.field726.method3200((byte) -47, this.field720);
                this.field720.method1565(arg0 + 14372, 0);
                this.field720.method1565(108, 1);
                this.field720.method1565(arg0 ^ 0xFFFFC7B3, 8);
                this.field720.method1567(this.field740[0], (byte) 40, 0);
                if (this.field749 > 1) {
                    this.field720.method1567(this.field740[1], (byte) 40, 1);
                }
                if (this.field746) {
                    this.field720.method1567(this.field748, (byte) 40, 8);
                }
                this.field726.method3166(this.field720, (byte) -126);
                this.field726.method3200((byte) -47, this.field729);
                this.field729.method1565(90, 0);
                this.field729.method1565(arg0 + 14336, 8);
                this.field729.method1562(true, 0, this.field750);
                this.field729.method1562(true, 8, this.field747);
                this.field726.method3166(this.field729, (byte) -126);
            }
            this.field744 = false;
            this.field743 = true;
        }
        if (this.field743) {
            this.field726.method3200((byte) -47, this.field722);
            this.field743 = !this.field722.method1563(-6236);
            this.field726.method3166(this.field722, (byte) -126);
        }
        return !this.field743;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)Lgo;")
    public static final class581 method530(int arg0, int arg1) {
        field721++;
        int var2 = 32 / ((-arg0 - 35) / 44);
        class581[] var3 = class20.method212(-1960882586);
        for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4].field8184 == arg1) {
                return var3[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIFBI[FFIIII)V")
    public static final void method531(int arg0, int arg1, float arg2, byte arg3, int arg4, float[] arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -55 / ((arg3 - 59) / 55);
        int var12 = arg8 - arg7;
        int var13 = arg4 - arg0;
        int var14 = arg1 - arg10;
        field731++;
        float var15 = arg5[2] * (float) var12 + arg5[1] * (float) var13 + arg5[0] * (float) var14;
        float var16 = arg5[5] * (float) var12 + arg5[4] * (float) var13 + arg5[3] * (float) var14;
        float var17 = arg5[8] * (float) var12 + arg5[6] * (float) var14 + arg5[7] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var18 = arg6 * var18;
        }
        float var19 = var16 + arg2 + 0.5F;
        if (arg9 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg9 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class507.field6955 = var19;
        class431.field6018 = var18;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Llj;)V")
    public class63(class565 arg0) {
        this.field726 = arg0;
        if (this.field726.field7949 && this.field726.field7973) {
            this.field722 = this.field720 = new class254(this.field726);
            if (this.field726.field7811 > 1 && this.field726.field7959 && this.field726.field7905) {
                this.field722 = this.field729 = new class254(this.field726);
                return;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method532(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

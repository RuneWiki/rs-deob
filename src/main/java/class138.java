import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class138 {

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "Ltca;")
    public static class184 field1861 = new class184(4);

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Ltq;")
    public static class654 field1864 = new class654("", 12);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    private int field1856;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "Ltd;")
    public static class478 field1863;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "[I")
    public static int[] field1865;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 3)
    public final void method955(int arg0) {
        this.field1854 &= arg0;
        field1859++;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V", line = 11)
    public static void method956(int arg0) {
        if (arg0 < 5) {
            field1864 = null;
        }
        field1863 = null;
        field1865 = null;
        field1861 = null;
        field1864 = null;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 26)
    public static final void method957(byte arg0) {
        class340.field4758 = -1;
        class159.field2142 = 1;
        field1858++;
        long var1 = 0L;
        if (class157.field2106 == null) {
            class623.method3439(35, 103);
            return;
        }
        class254 var3 = new class254(class56.method354(class76.method608(70, class157.field2106), -24686));
        long var4 = var3.method1723(21795);
        class128.field1768 = var3.method1723(arg0 ^ 0xFFFFAA87);
        class772.method4247("", 0, class404.method2444(-128, var4), true);
        if (arg0 != -92) {
            field1865 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)I", line = 58)
    public final int method958(byte arg0) {
        int var2 = 94 / ((46 - arg0) / 41);
        field1860++;
        return this.field1854 & 0x3FFF;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIII)Z", line = 70)
    public final boolean method959(int arg0, int arg1, int arg2, int arg3) {
        field1857++;
        int var5 = this.field1856;
        if (this.field1854 == arg0 && this.field1856 == 0) {
            return false;
        }
        boolean var8;
        if (this.field1856 == arg2) {
            if (this.field1854 < arg0 && (this.field1854 + arg1) >= arg0 || this.field1854 > arg0 && arg0 >= this.field1854 - arg1) {
                this.field1854 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field1856 > 0 && arg0 > this.field1854) {
            int var6 = this.field1856 * this.field1856 / (arg1 * 2);
            int var7 = this.field1854 + var6;
            if (var7 < arg0 && this.field1854 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field1856 < 0 && arg0 < this.field1854) {
            int var9 = this.field1856 * this.field1856 / (arg1 * 2);
            int var10 = this.field1854 - var9;
            if (arg0 < var10 && this.field1854 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 <= this.field1854) {
                this.field1856 -= arg1;
                if (arg3 != 0 && -arg3 > this.field1856) {
                    this.field1856 = -arg3;
                }
            } else {
                this.field1856 += arg1;
                if (arg3 != 0 && arg3 < this.field1856) {
                    this.field1856 = arg3;
                }
            }
            if (this.field1856 != var5) {
                int var11 = this.field1856 * this.field1856 / (arg1 * 2);
                if (this.field1854 < arg0) {
                    if ((this.field1854 + var11) > arg0) {
                        this.field1856 = var5;
                    }
                } else if (this.field1854 > arg0 && this.field1854 - var11 < arg0) {
                    this.field1856 = var5;
                }
            }
        } else if (this.field1856 <= 0) {
            this.field1856 += arg1;
            if (this.field1856 > 0) {
                this.field1856 = 0;
            }
        } else {
            this.field1856 -= arg1;
            if (this.field1856 < 0) {
                this.field1856 = 0;
            }
        }
        this.field1854 += this.field1856 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B[B)Lhh;", line = 205)
    public static final class140 method960(byte arg0, byte[] arg1) {
        if (arg0 != 78) {
            method957((byte) 56);
        }
        field1862++;
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class723.field9821);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class723.field9821);
                int var5 = var2.getHeight(class723.field9821);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class375.field5490.method446(var6, 102, var4, var5, var4, 0);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)V", line = 246)
    public final void method961(byte arg0, int arg1) {
        this.field1854 = arg1;
        this.field1856 = 0;
        field1855++;
        int var3 = 35 / ((-arg0 - 68) / 56);
    }
}

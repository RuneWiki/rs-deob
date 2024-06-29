import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class620 extends class281 implements class75 {

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    private int field8355 = -1;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    private int field8365 = -1;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public int field8362;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "Ldia;")
    private class246 field8349;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    private int field8357;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public int field8359;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
    private int field8364;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    private int field8353;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "Ljw;")
    public static class581 field8354 = new class581(17, -1);

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V", line = 8)
    public static void method3403(byte arg0) {
        field8354 = null;
        if (arg0 != -71) {
            field8354 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLfg;)V", line = 19)
    public static final void method3404(int arg0, boolean arg1, class139 arg2) {
        if (arg2.field2020) {
            if (arg2.field2028 < 0 || class142.method1089(-128, arg2.field2028, arg2.field2026)) {
                if (arg1) {
                    class320.method2035(arg2.field2029, arg2.field2033, null, arg2.field2018, arg2.field2034, 1);
                } else {
                    class727.method4048(arg2.field2033, arg2.field2026, arg2.field2019, arg2.field2028, -1, arg2.field2034, -1, arg2.field2029, arg2.field2018);
                }
                arg2.method792((byte) -95);
            }
        } else if (arg2.field2023 && arg2.field2034 >= 1 && arg2.field2033 >= 1 && arg2.field2034 <= class597.field8132 - 2 && arg2.field2033 <= (class628.field8800 - 2) && (arg2.field2021 < 0 || class142.method1089(75, arg2.field2021, arg2.field2035))) {
            if (arg1) {
                class320.method2035(arg2.field2029, arg2.field2033, arg2.field2025, arg2.field2018, arg2.field2034, 1);
            } else {
                class727.method4048(arg2.field2033, arg2.field2035, arg2.field2024, arg2.field2021, arg0 ^ 0x5AA3, arg2.field2034, -1, arg2.field2029, arg2.field2018);
            }
            arg2.field2023 = false;
            if (!arg1 && arg2.field2028 == arg2.field2021 && arg2.field2028 == -1) {
                arg2.method792((byte) -93);
            } else if (!arg1 && arg2.field2028 == arg2.field2021 && arg2.field2024 == arg2.field2019 && arg2.field2035 == arg2.field2026) {
                arg2.method792((byte) -94);
            }
        }
        field8358++;
        if (arg0 != -23204) {
            field8363 = 36;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)V", line = 71)
    public final void method3405(int arg0, byte arg1, int arg2) {
        field8348++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field8364);
        this.field8365 = arg2;
        if (arg1 != 114) {
            this.field8362 = 36;
        }
        this.field8355 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 89)
    public final void method3406(boolean arg0) {
        if (this.field8364 > 0) {
            this.field8349.method1601(this.field8353, this.field8364, (byte) -111);
            this.field8364 = 0;
        }
        if (!arg0) {
            field8351 = 120;
        }
        field8352++;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ldia;III)V", line = 181)
    public class620(class246 arg0, int arg1, int arg2, int arg3) {
        this.field8362 = arg2;
        this.field8349 = arg0;
        this.field8357 = arg1;
        this.field8359 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class339.field4917, 0);
        this.field8364 = class339.field4917[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8364);
        OpenGL.glRenderbufferStorageEXT(36161, this.field8357, this.field8362, this.field8359);
        this.field8353 = this.field8362 * this.field8359 * this.field8349.method1645(this.field8357, 6);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ldia;IIII)V", line = 196)
    public class620(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8362 = arg2;
        this.field8359 = arg3;
        this.field8349 = arg0;
        this.field8357 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class339.field4917, 0);
        this.field8364 = class339.field4917[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8364);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field8357, this.field8362, this.field8359);
        this.field8353 = this.field8359 * this.field8362 * this.field8349.method1645(this.field8357, 6);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[B)Lvr;", line = 118)
    public static final class147 method3407(int arg0, byte[] arg1) {
        field8350++;
        if (arg0 != 0) {
            field8363 = -53;
        }
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class627.field8774);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class627.field8774);
                int var5 = var2.getHeight(class627.field8774);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class379.field5542.method499(var4, var6, true, 0, var5, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 158)
    public final void method58(int arg0) {
        field8360++;
        OpenGL.glFramebufferRenderbufferEXT(this.field8355, this.field8365, 36161, 0);
        this.field8365 = -1;
        this.field8355 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V", line = 168)
    protected final void finalize() throws Throwable {
        this.method3406(true);
        field8356++;
        super.finalize();
    }
}

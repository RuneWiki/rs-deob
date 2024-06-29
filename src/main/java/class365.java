import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class365 extends class369 {

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Z")
    private boolean field5226 = false;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Ljv;")
    private class80 field5227;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "[I")
    public static int[] field5221 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field5224 = -1;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "F")
    public static float field5229;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (arg0 <= -75) {
            if (this.field5226) {
                this.field5227.method740('\u0001', 28666);
                super.field5255.method190(-15039, 1);
                super.field5255.method256((byte) -92, (class36) null);
                super.field5255.method190(-15039, 0);
            } else {
                super.field5255.method274(false, 0, 770, 5890);
            }
            ++field5222;
            super.field5255.method175(8448, (byte) 116, 8448);
            this.field5226 = false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
    public static final void method2323(int arg0, byte arg1) {
        class606.field8321 = -1;
        ++field5225;
        if (arg1 != 3) {
            method2323(-109, (byte) 7);
        }
        class614.field8388 = arg0;
        class606.field8321 = -1;
        class7.method27(false);
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
    public static void method2324(int arg0) {
        if (arg0 != 0) {
            method2325(-6);
        }
        field5221 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lud;BI)V")
    public final void method373(class36 arg0, byte arg1, int arg2) {
        ++field5228;
        super.field5255.method256((byte) -86, arg0);
        super.field5255.method237(0, arg2);
        if (arg1 >= -89) {
            method2325(12);
        }
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
    public static final void method2325(int arg0) {
        int var1 = 27 / ((arg0 - -12) / 57);
        ++field5220;
        if (class675.field9193 != null) {
            try {
                String var2 = class675.field9193.getParameter("cookiehost");
                int var3 = (int) (class554.method3190(-74) / 86400000L) - 11745;
                String var4 = "usrdob=" + var3 + "; version=1; path=/; domain=" + var2;
                class43.method540(class675.field9193, -15092, "document.cookie=\"" + var4 + "\"");
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lqo;)V")
    public class365(class22 arg0) {
        super(arg0);
        if (arg0.field685) {
            this.field5227 = new class80(arg0, 2);
            this.field5227.method741((byte) 123, 0);
            super.field5255.method190(-15039, 1);
            super.field5255.method175(34165, (byte) -35, 7681);
            super.field5255.method239(34168, 770, (byte) -87, 2);
            super.field5255.method274(false, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5255.method190(-15039, 0);
            this.field5227.method737(-1);
            this.field5227.method741((byte) 126, 1);
            super.field5255.method190(-15039, 1);
            super.field5255.method175(8448, (byte) -73, 8448);
            super.field5255.method239(34166, 770, (byte) -87, 2);
            super.field5255.method274(false, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5255.method190(-15039, 0);
            this.field5227.method737(-1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V")
    public final void method366(boolean arg0, byte arg1) {
        ++field5223;
        int var3 = 94 / ((arg1 - -60) / 38);
        super.field5255.method175(8448, (byte) -28, 7681);
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        if (arg0 > -5) {
            field5229 = -0.3934622F;
        }
        ++field5219;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIZ)V")
    public static final void method2326(boolean arg0, int arg1, boolean arg2) {
        int var3 = 111 % ((arg1 - -62) / 38);
        ++field5217;
        if (arg0) {
            --class327.field4546;
            if (~class327.field4546 == -1) {
                class456.field6424 = null;
            }
        }
        if (arg2) {
            --class449.field6345;
            if (class449.field6345 == 0) {
                class646.field8885 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
    public final void method369(boolean arg0, boolean arg1) {
        if (arg1) {
            method2324(85);
        }
        ++field5218;
        class429 var3 = super.field5255.method194(444720536);
        if (this.field5227 != null && var3 != null && arg0) {
            this.field5227.method740('\u0000', 28666);
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -77, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5255.field589.method2917(true), 0);
            OpenGL.glMatrixMode(5888);
            super.field5255.method190(-15039, 0);
            this.field5226 = true;
        } else {
            super.field5255.method274(false, 0, 770, 34168);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB)V")
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field5230;
        if (arg2 > -42) {
            this.field5226 = false;
        }
    }
}

import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class class400 implements class545 {

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "Z")
    private boolean field5230 = false;

    @OriginalMember(owner = "client!fha", name = "r", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!fha", name = "s", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "I")
    public int field5235;

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "Lpc;")
    public class700 field5229;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "Z")
    private boolean field5231;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
    public static int field5224 = -1;

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "[I")
    public static int[] field5225 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "Ltja;")
    public static class288 field5226 = new class288(8);

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!fha", name = "t", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!fha", name = "v", descriptor = "I")
    public static int field5240;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fha", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field5241;

    @OriginalMember(owner = "client!fha", name = "u", descriptor = "[[[S")
    public static short[][][] field5239;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2350(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)I", line = 13)
    public final int method2340(boolean arg0) {
        if (arg0) {
            return -61;
        } else {
            field5233++;
            return this.field5223;
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V", line = 32)
    private final void method2341(int arg0) {
        this.field5229.method3936(false, this);
        field5238++;
        if (arg0 < 20) {
            this.method2346(-9);
        }
        if (this.field5230) {
            OpenGL.glTexParameteri(this.field5235, 10241, this.field5231 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5235, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5235, 10241, this.field5231 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5235, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLjava/awt/Component;Z)Lsw;", line = 55)
    public static final class787 method2342(byte arg0, Component arg1, boolean arg2) {
        field5219++;
        try {
            Constructor var3 = Class.forName("oca").getDeclaredConstructor(field5241 == null ? (field5241 = method2350("java.awt.Component")) : field5241, Boolean.TYPE);
            int var4 = -117 / ((arg0 - 75) / 51);
            return (class787) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var5) {
            return new class6(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V", line = 75)
    public static void method2343(byte arg0) {
        field5226 = null;
        field5239 = null;
        field5225 = null;
        if (arg0 < 102) {
            method2342((byte) 45, null, true);
        }
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)Z", line = 88)
    public final boolean method2344(int arg0) {
        if (arg0 != 1) {
            return false;
        }
        field5227++;
        if (!this.field5229.field9841) {
            return false;
        }
        int var2 = this.method2349(4);
        this.field5229.method3936(false, this);
        OpenGL.glGenerateMipmapEXT(this.field5235);
        this.field5231 = true;
        this.method2341(60);
        this.method2348(var2, 43);
        return true;
    }

    @OriginalMember(owner = "client!fha", name = "finalize", descriptor = "()V", line = 112)
    protected final void finalize() throws Throwable {
        this.method2346(10833);
        field5221++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IZ)V", line = 122)
    public final void method2345(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.method2346(-55);
        }
        if (arg1 != this.field5231) {
            int var3 = this.method2349(4);
            this.field5231 = true;
            this.method2341(125);
            this.method2348(var3, 120);
        }
        field5232++;
    }

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "(I)V", line = 141)
    public final void method2346(int arg0) {
        if (arg0 != 10833) {
            this.field5237 = 127;
        }
        field5234++;
        if (this.field5223 > 0) {
            this.field5229.method3941(this.field5223, this.method2349(4), true);
            this.field5223 = 0;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZI)V", line = 157)
    public final void method2347(boolean arg0, int arg1) {
        int var3 = 26 / ((-arg1 - 10) / 45);
        if (this.field5230 != arg0) {
            this.field5230 = arg0;
            this.method2341(81);
        }
        field5228++;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)V", line = 183)
    private final void method2348(int arg0, int arg1) {
        this.field5229.field9742 -= arg0;
        if (arg1 > 23) {
            field5240++;
            this.field5229.field9742 += this.method2349(4);
        }
    }

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "(I)I", line = 196)
    private final int method2349(int arg0) {
        field5220++;
        if (arg0 != 4) {
            this.method2347(false, 54);
        }
        int var2 = this.field5229.method3900((byte) 80, this.field5236) * this.field5237;
        return this.field5231 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lpc;IIIZ)V", line = 211)
    public class400(class700 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5236 = arg2;
        this.field5237 = arg3;
        this.field5235 = arg1;
        this.field5229 = arg0;
        this.field5231 = arg4;
        OpenGL.glGenTextures(1, class773.field10629, 0);
        this.field5223 = class773.field10629[0];
        this.method2348(0, 33);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
    public abstract void method1219(int arg0);
}

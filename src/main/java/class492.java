import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class492 implements class143 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Z")
    private boolean field7268 = false;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Lvj;")
    public class303 field7283;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field7280;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Z")
    private boolean field7275;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    private int field7284;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field7272;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field7277;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Liv;")
    public static class64 field7270 = new class64(62, -2);

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
    public static boolean field7276 = false;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field7279 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field7282 = -1;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 3)
    public static void method2923(int arg0) {
        if (arg0 != 19102) {
            method2923(124);
        }
        field7270 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I", line = 20)
    private final int method2924(byte arg0) {
        field7269++;
        if (arg0 == 15) {
            int var2 = this.field7283.method1963(503683664, this.field7280) * this.field7284;
            return this.field7275 ? var2 * 4 / 3 : var2;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)I", line = 33)
    public final int method2925(int arg0) {
        field7286++;
        if (arg0 != 9987) {
            this.method2926(51, false);
        }
        return this.field7277;
    }

    @OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        this.method2931(122);
        field7285++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V", line = 58)
    private final void method2926(int arg0, boolean arg1) {
        this.field7283.field4508 -= arg0;
        field7281++;
        this.field7283.field4508 += this.method2924((byte) 15);
        if (arg1) {
            this.method2927((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)Z", line = 70)
    public final boolean method2927(byte arg0) {
        field7274++;
        if (!this.field7283.field4532) {
            return arg0 >= -14;
        }
        int var2 = this.method2924((byte) 15);
        this.field7283.method1990(this, 11864);
        OpenGL.glGenerateMipmapEXT(this.field7272);
        this.field7275 = true;
        this.method2928(89);
        this.method2926(var2, false);
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 95)
    private final void method2928(int arg0) {
        this.field7283.method1990(this, 11864);
        field7273++;
        if (arg0 <= 23) {
            method2932(-13, 57, 71, null);
        }
        if (this.field7268) {
            OpenGL.glTexParameteri(this.field7272, 10241, this.field7275 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7272, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7272, 10241, this.field7275 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7272, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V", line = 119)
    public final void method2929(byte arg0, boolean arg1) {
        field7267++;
        if (this.field7268 != arg1) {
            this.field7268 = arg1;
            this.method2928(25);
        }
        if (arg0 >= -36) {
            this.field7277 = 81;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V", line = 136)
    public final void method2930(int arg0, boolean arg1) {
        if (arg0 >= -74) {
            this.method2930(-117, true);
        }
        if (arg1 != this.field7275) {
            int var3 = this.method2924((byte) 15);
            this.field7275 = true;
            this.method2928(61);
            this.method2926(var3, false);
        }
        field7278++;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 156)
    public final void method2931(int arg0) {
        if (arg0 < 110) {
            this.field7268 = true;
        }
        field7271++;
        if (this.field7277 > 0) {
            this.field7283.method1910(this.field7277, true, this.method2924((byte) 15));
            this.field7277 = 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lvj;IIIZ)V", line = 222)
    public class492(class303 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7283 = arg0;
        this.field7280 = arg2;
        this.field7275 = arg4;
        this.field7284 = arg3;
        this.field7272 = arg1;
        OpenGL.glGenTextures(1, class118.field1942, 0);
        this.field7277 = class118.field1942[0];
        this.method2926(0, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 192)
    public static final void method2932(int arg0, int arg1, int arg2, Class arg3) {
        class429 var4 = class380.field5761[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class166 var5 = var4.field6364; var5 != null; var5 = var5.field2572) {
            class417 var6 = var5.field2576;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6231 == arg1 && var6.field6238 == arg2) {
                class214.method1431(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public abstract void method1055(byte arg0);
}

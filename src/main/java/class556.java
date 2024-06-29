import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class556 extends class83 {

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Lud;")
    private class123 field7938;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Leaa;")
    private class43 field7936;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field7939 = 0;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "Z")
    public static boolean field7946 = true;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        this.field7936.method222('\u0001', (byte) -106);
        ++field7948;
        super.field855.method2431((byte) -32, 1);
        super.field855.method2396((byte) 36, (class325) null);
        if (arg0 != 18610) {
            this.field7938 = null;
        }
        super.field855.method2431((byte) -87, 0);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIII)V")
    public static final void method3151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class141.field1556; ++var5) {
            Rectangle var6 = class275.field3446[var5];
            if (~(var6.x + var6.width) < ~arg2 && var6.x < arg0 + arg2 && ~arg1 > ~(var6.y + var6.height) && var6.y < arg1 + arg4) {
                class313.field3894[var5] = true;
            }
        }
        ++field7944;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([BB)[B")
    public static final byte[] method3152(byte[] arg0, byte arg1) {
        ++field7945;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        int var4 = 10 / ((15 - arg1) / 34);
        class567.method3213(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        if (arg1 <= -123) {
            ++field7943;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        ++field7935;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 26) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg1) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field855.method2431((byte) -103, 1);
        boolean var7 = (128 & arg1) != 0;
        if (!var7) {
            class107.field1158[3] = 0.0F;
            class107.field1158[0] = 0.0F;
            class107.field1158[1] = 0.0F;
            class107.field1158[2] = var6;
        } else {
            class107.field1158[1] = 0.0F;
            class107.field1158[3] = 0.0F;
            class107.field1158[2] = 0.0F;
            class107.field1158[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class107.field1158, 0);
        class107.field1158[3] = (float) super.field855.field5817 * var4 % 1.0F;
        class107.field1158[0] = 0.0F;
        class107.field1158[1] = var6;
        class107.field1158[2] = 0.0F;
        int var8 = 124 / ((-60 - arg2) / 33);
        OpenGL.glTexGenfv(8193, 9474, class107.field1158, 0);
        if (this.field7938.field1373) {
            class107.field1158[3] = (float) super.field855.field5817 * var5 % 1.0F;
            class107.field1158[2] = 0.0F;
            class107.field1158[0] = 0.0F;
            class107.field1158[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class107.field1158, 0);
        } else {
            int var9 = (int) ((float) super.field855.field5817 * var5 * 16.0F);
            super.field855.method2396((byte) 36, this.field7938.field1375[var9 % 16]);
        }
        super.field855.method2431((byte) -73, 0);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        if (arg0 != -48) {
            this.field7936 = null;
        }
        ++field7947;
        this.field7936.method222('\u0000', (byte) -64);
        if (this.field7938.field1373) {
            super.field855.method2431((byte) -34, 1);
            super.field855.method2396((byte) 36, this.field7938.field1377);
            super.field855.method2431((byte) -60, 0);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Lbu;")
    public static final class142 method3153(int arg0, int arg1) {
        ++field7937;
        class142 var2 = (class142) class79.field806.method1927((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class637.field8971.method3854((byte) 92, arg0, 0);
            if (var3 != null && var3.length > 1) {
                class142 var4;
                try {
                    var4 = class371.method2160(-126, var3);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                }
                class79.field806.method1928(arg1 + -30301, var4, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILav;)V")
    public final void method441(int arg0, int arg1, class325 arg2) {
        super.field855.method2396((byte) 36, arg2);
        if (arg0 == -29092) {
            ++field7942;
            super.field855.method2421(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        if (arg0 >= -100) {
            return false;
        } else {
            ++field7941;
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V")
    public static final void method3154(int arg0, boolean arg1) {
        ++field7940;
        if (!arg1) {
            field7939 = -1;
        }
        class76 var2 = class3.method28(8, (byte) 42, arg0);
        var2.method406(-975503968);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lvj;Lud;)V")
    public class556(class422 arg0, class123 arg1) {
        super(arg0);
        this.field7938 = arg1;
        this.field7936 = new class43(arg0, 2);
        this.field7936.method219(24427, 0);
        super.field855.method2431((byte) -59, 1);
        if (this.field7938.field1373) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field855.method2431((byte) -48, 0);
        this.field7936.method223(1);
        this.field7936.method219(24427, 1);
        super.field855.method2431((byte) -112, 1);
        if (this.field7938.field1373) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field855.method2431((byte) -97, 0);
        this.field7936.method223(1);
    }
}

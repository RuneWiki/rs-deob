import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class181 extends class125 {

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lqf;")
    private class482 field2362;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lpb;")
    private class468 field2359;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "F")
    public static float field2358;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        if (arg1 == 0) {
            this.field2359.method2856('\u0000', 1);
            ++field2354;
            if (this.field2362.field7116) {
                super.field1617.method2250((byte) 108, 1);
                super.field1617.method2236(this.field2362.field7114, 94);
                super.field1617.method2250((byte) 66, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        if (arg1 < 92) {
            field2358 = -0.15412301F;
        }
        ++field2357;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        super.field1617.method2236(arg1, 114);
        if (arg0 != 67) {
            this.method666(22);
        }
        ++field2363;
        super.field1617.method2260(arg0 + 16573, arg2);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method1055(String arg0, byte arg1, String arg2) {
        class48.field505 = 1;
        ++field2353;
        if (arg1 != -112) {
            method1055((String) null, (byte) 37, (String) null);
        }
        class47.field493 = -1;
        class481.method2942(arg1 + 109, arg0, arg2);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        ++field2361;
        int var2 = 4 % ((11 - arg0) / 63);
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        ++field2360;
        if (arg0 >= -35) {
            this.method665(false, 113);
        }
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg2 >> 3) + 1) * 5.0E-4F;
        float var6 = (arg2 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field1617.method2250((byte) 72, 1);
        boolean var7 = ~(128 & arg2) != -1;
        if (!var7) {
            class409.field5863[3] = 0.0F;
            class409.field5863[1] = 0.0F;
            class409.field5863[0] = 0.0F;
            class409.field5863[2] = var6;
        } else {
            class409.field5863[3] = 0.0F;
            class409.field5863[2] = 0.0F;
            class409.field5863[0] = var6;
            class409.field5863[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class409.field5863, 0);
        class409.field5863[3] = (float) super.field1617.field5310 * var4 % 1.0F;
        class409.field5863[2] = 0.0F;
        class409.field5863[0] = 0.0F;
        class409.field5863[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class409.field5863, 0);
        if (!this.field2362.field7116) {
            int var8 = (int) ((float) super.field1617.field5310 * var5 * 16.0F);
            super.field1617.method2236(this.field2362.field7113[var8 % 16], 115);
        } else {
            class409.field5863[2] = 0.0F;
            class409.field5863[1] = 0.0F;
            class409.field5863[0] = 0.0F;
            class409.field5863[3] = (float) super.field1617.field5310 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class409.field5863, 0);
        }
        super.field1617.method2250((byte) 127, 0);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        this.field2359.method2856('\u0001', arg0 + 18113);
        ++field2355;
        if (arg0 != -18112) {
            field2358 = 0.1570316F;
        }
        super.field1617.method2250((byte) 94, 1);
        super.field1617.method2236((class252) null, 105);
        super.field1617.method2250((byte) 90, 0);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lur;Lqf;)V")
    public class181(class377 arg0, class482 arg1) {
        super(arg0);
        this.field2362 = arg1;
        this.field2359 = new class468(arg0, 2);
        this.field2359.method2854(-43, 0);
        super.field1617.method2250((byte) 110, 1);
        if (this.field2362.field7116) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field1617.method2250((byte) 100, 0);
        this.field2359.method2855(22228);
        this.field2359.method2854(-85, 1);
        super.field1617.method2250((byte) 107, 1);
        if (this.field2362.field7116) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field1617.method2250((byte) 127, 0);
        this.field2359.method2855(22228);
    }
}

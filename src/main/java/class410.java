import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class410 extends class86 {

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Lhl;")
    private class373 field6231;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lmi;")
    private class348 field6224;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Lni;")
    public static class367 field6221 = new class367(23, 8);

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field6230 = -1;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lhq;")
    private class110 field6228;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
    public static int[] field6233;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[[S")
    public static short[][] field6229;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    private final void method2527(int arg0) {
        this.field6228 = new class110(super.field1248, 2);
        ++field6225;
        this.field6228.method694(4864, 0);
        super.field1248.method2040((byte) 56, 1);
        super.field1248.method2030(7681, 260, (byte) 71);
        super.field1248.method2059(34168, 768, 0, -31277);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field1248.method2040((byte) -124, 0);
        if (arg0 != -20948) {
            method2528(-114);
        }
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6231.field5673) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6228.method691(arg0 + 20843);
        this.field6228.method694(4864, 1);
        super.field1248.method2040((byte) 40, 1);
        super.field1248.method2030(8448, 8448, (byte) 71);
        super.field1248.method2059(5890, 768, 0, -31277);
        OpenGL.glDisable(3168);
        super.field1248.method2040((byte) -128, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6231.field5673) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6228.method691(-42);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 >= -2) {
            this.field6224 = null;
        }
        ++field6219;
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        ++field6232;
        if (super.field1248.field5016 > arg0) {
            float var3 = -0.5F / (float) super.field1248.field5016;
            super.field1248.method2040((byte) 59, 1);
            class439.field6623[3] = super.field1248.field4987 * var3 + 0.25F;
            class439.field6623[0] = 0.0F;
            class439.field6623[1] = 0.0F;
            class439.field6623[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class439.field6623, 0);
            OpenGL.glPopMatrix();
            super.field1248.method2081(0.5F, (float) super.field1248.field5016, true);
            super.field1248.method2075(this.field6224, 0);
            super.field1248.method2040((byte) -124, 0);
        }
        this.field6228.method693((byte) 101, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLlr;I)V")
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        ++field6227;
        if (!arg0) {
            field6221 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public static void method2528(int arg0) {
        field6233 = null;
        int var1 = 75 / ((arg0 - 50) / 42);
        field6221 = null;
        field6229 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2529(int arg0, String arg1) {
        ++field6216;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 256) {
            field6233 = null;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = (var3 << 5) + -var3 - -class286.method1838(arg0 ^ 257, arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public static final void method2530(int arg0) {
        if (class369.field5635 == null || class165.field2241 == null) {
            class165.field2241 = new int[256];
            class369.field5635 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class369.field5635[var1] = (int) (4096.0D * Math.sin(var2));
                class165.field2241[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        ++field6218;
        if (arg0 != 1) {
            method2529(-38, (String) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILuu;)V")
    public static final void method2531(int arg0, class191 arg1) {
        if (arg0 == -5426) {
            class290.field4253 = arg1.method1265("titlebg", 126);
            ++field6223;
            class94.field1372 = arg1.method1265("logo", 114);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        if (arg0 == 27670) {
            this.field6228.method693((byte) 100, '\u0001');
            ++field6217;
            if (super.field1248.field5016 > 0) {
                super.field1248.method2040((byte) -115, 1);
                super.field1248.method2075((class538) null, 0);
                super.field1248.method2081(1.0F, 0.0F, true);
                super.field1248.method2040((byte) 27, 0);
            }
            super.field1248.method2030(8448, 8448, (byte) 71);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lnq;Lhl;)V")
    public class410(class325 arg0, class373 arg1) {
        super(arg0);
        this.field6231 = arg1;
        this.method2527(-20948);
        this.field6224 = new class348(super.field1248, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6224.method2247(10497, false);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZB)V")
    public final void method235(boolean arg0, byte arg1) {
        ++field6222;
        super.field1248.method2030(260, 8448, (byte) 71);
        if (arg1 != 112) {
            this.method241(-8, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)V")
    public final void method239(int arg0, byte arg1, int arg2) {
        if ((arg2 & 1) == 1) {
            if (this.field6231.field5673) {
                super.field1248.method2075(this.field6231.field5680, 0);
                class439.field6623[3] = (float) (super.field1248.field4899 % 4000) / 4000.0F;
                class439.field6623[2] = 0.0F;
                class439.field6623[0] = 0.0F;
                class439.field6623[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class439.field6623, 0);
            } else {
                int var4 = super.field1248.field4899 % 4000 * 16 / 4000;
                super.field1248.method2075(this.field6231.field5678[var4], 0);
            }
        } else if (this.field6231.field5673) {
            super.field1248.method2075(this.field6231.field5680, 0);
            class439.field6623[3] = 0.0F;
            class439.field6623[1] = 0.0F;
            class439.field6623[0] = 0.0F;
            class439.field6623[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class439.field6623, 0);
        } else {
            super.field1248.method2075(this.field6231.field5678[0], 0);
        }
        int var5 = 82 / ((arg1 - -50) / 53);
        ++field6226;
    }
}

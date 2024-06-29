import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class299 extends class741 {

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "Z")
    private boolean field4342 = false;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "Lsga;")
    private class608 field4344;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4343;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4346;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4341;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4338;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "Lbw;")
    private class28 field4337;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Z")
    private boolean field4348;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "[F")
    private static float[] field4345 = new float[16];

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "[F")
    private static float[] field4347 = new float[4];

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4340;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Z")
    private boolean field4339;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V")
    public final void method1950(byte arg0) {
        if (arg0 < 104) {
            this.field4337 = null;
        }
        IDirect3DDevice var2 = this.field4344.field8555;
        int var3 = this.field10209.method1457(1);
        class517 var4 = this.field10209.method1399(0);
        IDirect3DVertexShader var5;
        if (this.field4339) {
            var5 = var3 == Integer.MAX_VALUE ? this.field4346 : this.field4338;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field4343 : this.field4341;
        }
        if (this.field4340 != var5) {
            this.field4340 = var5;
            this.field4344.method3518(0, var5);
            this.method1951((byte) -101);
            this.method431(-1);
            this.method426((byte) -123);
            this.method427(0);
            this.method428(true);
            this.method424(-48);
        }
        var4.method3076(0.0F, 0.0F, -1.0F, true, field4347, (float) var3);
        var2.method4173(12, field4347);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        if (arg0 <= 96) {
            this.method431(-38);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        if (this.field4340 != null) {
            IDirect3DDevice var2 = this.field4344.field8555;
            class517 var3 = this.field4344.method1423(1);
            var2.method4173(0, var3.method3087(field4345, -64));
        }
        if (!arg0) {
            this.field4341 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)V")
    private final void method1951(byte arg0) {
        if (this.field4340 != null && this.field4339) {
            class517 var2 = this.field10209.method1390((byte) 110);
            IDirect3DDevice var3 = this.field4344.field8555;
            var3.method4179(13, this.field10209.field3359 * this.field10209.field3305, this.field10209.field3359 * this.field10209.field3323, this.field10209.field3375 * this.field10209.field3359, 1.0F);
            var3.method4179(14, this.field10209.field3358 * this.field10209.field3305, this.field10209.field3358 * this.field10209.field3323, this.field10209.field3375 * this.field10209.field3358, 1.0F);
            var3.method4179(16, this.field10209.field3309 * this.field10209.field3305, this.field10209.field3323 * this.field10209.field3309, this.field10209.field3375 * this.field10209.field3309, 1.0F);
            var2.method3073(this.field10209.field3314[0], (byte) 122, field4347, this.field10209.field3314[2], this.field10209.field3314[1]);
            var3.SetVertexShaderConstantF(15, field4347, 1);
            var2.method3073(this.field10209.field3382[0], (byte) 122, field4347, this.field10209.field3382[2], this.field10209.field3382[1]);
            var3.SetVertexShaderConstantF(17, field4347, 1);
        }
        int var4 = 106 / ((arg0 + 60) / 33);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        if (arg0 < 15) {
            this.field4340 = null;
        }
        this.field4339 = arg1;
        this.field10209.method1473(1, (byte) 21);
        this.field10209.method1492(this.field4337, 2);
        this.field10209.method1494(class495.field6817, 775, class92.field1073);
        this.field10209.method1409(class41.field423, 0, -122);
        this.field10209.method1469(false, 2, false, class157.field2039, true);
        this.field10209.method1455(0, -3, class224.field3416);
        this.field10209.method1473(0, (byte) 59);
        this.method1950((byte) 108);
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lsga;Lae;)V")
    public class299(class608 arg0, class283 arg1) {
        super(arg0);
        this.field4344 = arg0;
        if (arg1 == null || (this.field4344.field8561.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4348 = false;
        } else {
            this.field4343 = this.field4344.field8555.method4180(arg1.method1861(true, "dx", "uw_ground_unlit"));
            this.field4346 = this.field4344.field8555.method4180(arg1.method1861(true, "dx", "uw_ground_lit"));
            this.field4341 = this.field4344.field8555.method4180(arg1.method1861(true, "dx", "uw_model_unlit"));
            this.field4338 = this.field4344.field8555.method4180(arg1.method1861(true, "dx", "uw_model_lit"));
            if (this.field4338 != null & this.field4343 != null & this.field4346 != null & this.field4341 != null) {
                this.field4337 = this.field10209.method1447((byte) -60, 1, 2, false, new int[] { 0, -1 });
                this.field4337.method129(false, true, false);
                this.field4348 = true;
            } else {
                this.field4348 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        this.field10209.method1473(1, (byte) 45);
        this.field10209.method1492(null, 2);
        this.field10209.method1494(class785.field10763, 775, class785.field10763);
        this.field10209.method1409(class157.field2039, 0, -121);
        this.field10209.method1409(class41.field423, 2, -112);
        this.field10209.method1455(0, -3, class157.field2039);
        this.field10209.method1473(0, (byte) 25);
        int var2 = 102 / ((10 - arg0) / 44);
        if (this.field4342) {
            this.field10209.method1409(class157.field2039, 0, -110);
            this.field10209.method1455(0, -3, class157.field2039);
            this.field4342 = false;
        }
        if (this.field4340 != null) {
            this.field4344.method3518(0, null);
            this.field4340 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (arg0 >= -3) {
            this.method433(-79, -118, null);
        }
        if (this.field4340 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4344.field8555;
        int var3 = this.field10209.method177();
        int var4 = this.field10209.method241();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method4179(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method4179(11, 1.0F / (float) this.field10209.method1454(0), (float) this.field10209.method1387(-69) / 255.0F, this.field10209.field3291, 1.0F / (this.field10209.field3291 - this.field10209.field3296));
        this.field10209.method1468((byte) 67, this.field10209.method1439(3));
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        int var4 = -116 / ((-arg2 - 18) / 51);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (arg0 >= -91) {
            this.field4341 = null;
        }
        if (this.field4340 != null) {
            IDirect3DDevice var2 = this.field4344.field8555;
            class517 var3 = this.field10209.method1500(15720);
            var2.SetVertexShaderConstantF(8, var3.method3074(4, field4345), 2);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 != -1) {
            field4345 = null;
        }
        if (this.field4340 != null) {
            IDirect3DDevice var2 = this.field4344.field8555;
            var2.method4173(4, this.field10209.method1453((byte) 61, field4345));
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (this.field4340 != null) {
            IDirect3DDevice var2 = this.field4344.field8555;
            class517 var3 = this.field4344.method1423(1);
            var2.method4173(0, var3.method3087(field4345, -57));
        }
        if (arg0 != 0) {
            this.field4343 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg2 != null) {
            if (this.field4342) {
                this.field10209.method1409(class157.field2039, 0, -111);
                this.field10209.method1455(0, -3, class157.field2039);
                this.field4342 = false;
            }
            this.field10209.method1492(arg2, arg0 + 3);
            this.field10209.method1509(4, arg1);
        } else if (!this.field4342) {
            this.field10209.method1492(this.field10209.field3346, 2);
            this.field10209.method1509(arg0 ^ 0xFFFFFFFB, 1);
            this.field10209.method1409(class224.field3416, 0, -119);
            this.field10209.method1455(0, -3, class224.field3416);
            this.field4342 = true;
        }
        if (arg0 != -1) {
            this.field4342 = true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        if (arg0 > -37) {
            this.field4342 = false;
        }
        return this.field4348;
    }
}

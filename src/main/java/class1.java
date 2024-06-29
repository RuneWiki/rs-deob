import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class369 {

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "Leda;")
    private class561 field5;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "Ltt;")
    private class341 field1;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field6;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "Z")
    private boolean field7;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "[F")
    private static float[] field3 = new float[16];

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "Z")
    private boolean field4;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (arg0 != 8220) {
            this.method9((byte) 81, -75, null);
        }
        if (this.field4) {
            IDirect3DDevice var2 = this.field5.field8021;
            class537 var3 = this.field5.method2032(arg0 ^ 0x202F);
            var2.method2528(0, var3.method3020((byte) -59, field3));
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 != 17789 || !this.field4) {
            return;
        }
        IDirect3DDevice var2 = this.field5.field8021;
        class537 var3 = this.field5.method2030(29443);
        class537 var4 = this.field5.method2032(122);
        var2.method2528(0, var4.method3020((byte) -59, field3));
        var2.method2528(4, var3.method3021((byte) -78, field3));
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = -72 % ((54 - arg0) / 47);
        if (!this.field4) {
            return;
        }
        IDirect3DDevice var3 = this.field5.field8021;
        var3.SetVertexShader(null);
        var3.SetPixelShader(null);
        this.field5047.method2015(1, -2);
        this.field5047.method1997(126, null);
        this.field5047.method2015(0, -2);
        this.field5047.method1997(127, null);
        this.field4 = false;
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "(B)V")
    public final void method4(byte arg0) {
        if (this.field4) {
            IDirect3DDevice var2 = this.field5.field8021;
            class537 var3 = this.field5047.method2020(15);
            var2.SetVertexShaderConstantF(12, var3.method3024(true, field3), 2);
        }
        if (arg0 < 75) {
            this.method7(-124, -82, 127);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)V")
    public final void method5(int arg0, boolean arg1) {
        if (arg0 != 382) {
            this.method11(7);
        }
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V")
    public final void method6(byte arg0) {
        if (arg0 == 76 && this.field4) {
            IDirect3DDevice var2 = this.field5.field8021;
            var2.method2528(8, this.field5047.method2049((byte) -50, field3));
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 != 8250) {
            this.method2(-1);
        }
        if (!this.field4) {
            return;
        }
        IDirect3DDevice var4 = this.field5.field8021;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
        var4.method2520(14, (float) (this.field5047.field4585 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method2520(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2525(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2525(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        int var2 = 42 % ((arg0 - 37) / 36);
        return this.field7;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BILlc;)V")
    public final void method9(byte arg0, int arg1, class686 arg2) {
        if (arg0 != -94) {
            this.method3((byte) -47);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)V")
    public final void method10(boolean arg0, int arg1) {
        if (arg1 != -14330) {
            this.method1(115);
        }
        class219 var3 = this.field5047.method2031(arg1 + 14203);
        if (!this.field7 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field5.field8021;
        var4.SetVertexShader(this.field2);
        var4.SetPixelShader(this.field6);
        this.field5047.method2015(1, -2);
        this.field5047.method1997(arg1 + 14457, var3);
        this.field5047.method2015(0, -2);
        this.field5047.method1997(arg1 + 14457, this.field1.field4313);
        this.field4 = true;
        this.method2(17789);
        this.method4((byte) 122);
        this.method6((byte) 76);
        this.method11(63);
        var4.method2525(1, -this.field5047.field4563[0], -this.field5047.field4563[1], -this.field5047.field4563[2], 0.0F);
        var4.method2525(2, this.field5047.field4589, this.field5047.field4526, this.field5047.field4572, 1.0F);
        var4.method2525(3, Math.abs(this.field5047.field4563[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Leda;Ltf;Ltt;)V")
    public class1(class561 arg0, class701 arg1, class341 arg2) {
        super(arg0);
        this.field5 = arg0;
        this.field1 = arg2;
        if (arg1 != null && this.field5047.field4613 && this.field5047.field4520 && (this.field5.field8017.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2 = this.field5.field8021.method2519(arg1.method3862("environment_mapped_water_v", "dx", (byte) 93));
            this.field6 = this.field5.field8021.method2527(arg1.method3862("environment_mapped_water_f", "dx", (byte) 90));
            this.field7 = this.field2 != null && this.field6 != null && this.field1.method1975(true);
        } else {
            this.field7 = false;
            this.field2 = null;
            this.field6 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 < 52 || !this.field4) {
            return;
        }
        IDirect3DDevice var2 = this.field5.field8021;
        if (this.field5047.field4536 > 0) {
            float var3 = this.field5047.field4549;
            float var4 = this.field5047.field4550;
            var2.method2520(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method2520(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method2525(0, (float) (this.field5047.field4565 >> 16 & 0xFF) / 255.0F, (float) (this.field5047.field4565 >> 8 & 0xFF) / 255.0F, (float) (this.field5047.field4565 & 0xFF) / 255.0F, 0.0F);
    }
}

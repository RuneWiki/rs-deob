import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class53 extends class74 {

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Lgaa;")
    private class302 field785;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "Lbd;")
    private class190 field787;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field788;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "[F")
    private static float[] field786 = new float[16];

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)V")
    public final void method338(byte arg0) {
        if (arg0 > -35) {
            this.field787 = null;
        }
        if (this.field788 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field785.field3716;
        class691 var3 = this.field1011.method2546(true);
        var3.method3886(-26631, field786);
        field786[7] *= 0.25F;
        field786[0] *= 0.25F;
        field786[2] *= 0.25F;
        field786[4] *= 0.25F;
        field786[3] *= 0.25F;
        field786[1] *= 0.25F;
        field786[5] *= 0.25F;
        field786[6] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field786, 2);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        this.field1011.method2550(class542.field7243, arg0, class88.field1235);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        IDirect3DDevice var4 = this.field785.field3716;
        if (arg2 != 65) {
            this.field788 = null;
        }
        if (this.field787.field2372) {
            float var6 = (float) (this.field1011.field6279 % 4000) / 4000.0F;
            this.field1011.method2596(this.field787.field2369, 0);
            var4.method2322(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field1011.field6279 % 4000 * 16 / 4000;
            this.field1011.method2596(this.field787.field2370[var5], arg2 ^ 0x41);
            var4.method2322(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        if (arg1 <= 47) {
            this.field788 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        if (this.field788 != null) {
            IDirect3DDevice var2 = this.field785.field3716;
            class691 var3 = this.field785.method2579(3);
            var2.method2314(0, var3.method3904(-5928, field786));
        }
        if (arg0) {
            this.field787 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lgaa;Lpl;Lbd;)V")
    public class53(class302 arg0, class612 arg1, class190 arg2) {
        super(arg0);
        this.field785 = arg0;
        this.field787 = arg2;
        if (arg1 != null && this.field787.method1156((byte) -80) && (this.field785.field3710.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field788 = this.field785.field3716.method2320(arg1.method3345(115, "dx", "transparent_water"));
        } else {
            this.field788 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        this.field785.field3716.SetVertexShader(null);
        this.field1011.method2602(0, 1, class5.field119);
        if (arg0 == -19092) {
            this.field1011.method2602(1, 1, class563.field7825);
            this.field1011.method2602(2, 1, class700.field9903);
            this.field1011.method2529(true, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
    public final void method344(byte arg0) {
        if (arg0 <= -114 && this.field788 != null) {
            IDirect3DDevice var2 = this.field785.field3716;
            class691 var3 = this.field785.method2579(3);
            var2.method2314(0, var3.method3904(-5928, field786));
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public final void method345(int arg0) {
        int var2 = 18 / ((54 - arg0) / 37);
        if (this.field788 != null) {
            IDirect3DDevice var3 = this.field785.field3716;
            var3.method2314(4, this.field1011.method2558(66, field786));
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.field788 = null;
        }
        return this.field788 != null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        int var3 = -9 % ((52 - arg0) / 36);
        this.field785.field3716.SetVertexShader(this.field788);
        this.field1011.method2602(0, 1, class5.field119);
        this.field1011.method2602(1, 1, class700.field9903);
        this.field1011.method1676(true, class563.field7825, 2, false, (byte) 44);
        this.field1011.method2529(false, (byte) -99);
        this.method344((byte) -123);
        this.method338((byte) -116);
        this.method345(96);
        this.method348(26185);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method348(int arg0) {
        if (this.field788 != null) {
            IDirect3DDevice var2 = this.field785.field3716;
            if (this.field1011.field6324 <= 0) {
                var2.method2322(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field1011.field6294;
                float var4 = this.field1011.field6243;
                float var5 = var4 - 512.0F;
                var2.method2322(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field1011.method2597((byte) 48, this.field1011.field6303);
        }
        if (arg0 != 26185) {
            this.field787 = null;
        }
    }
}

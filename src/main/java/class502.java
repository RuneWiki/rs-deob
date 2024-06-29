import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class502 extends class695 {

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lmba;")
    private class70 field6621;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lbl;")
    private class350 field6619;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6618;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[F")
    private static float[] field6620 = new float[16];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method490(byte arg0) {
        if (arg0 == 48 && this.field6618 != null) {
            IDirect3DDevice var2 = this.field6621.field958;
            class131 var3 = this.field6621.method3074((byte) -97);
            var2.method3714(0, var3.method944(field6620, arg0 + 71));
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public final void method500(byte arg0) {
        if (this.field6618 != null) {
            IDirect3DDevice var2 = this.field6621.field958;
            if (this.field9493.field7765 > 0) {
                float var3 = this.field9493.field7755;
                float var4 = this.field9493.field7710;
                float var5 = var4 - 512.0F;
                var2.method3711(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method3711(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field9493.method3142(this.field9493.field7756, 48);
        }
        if (arg0 != 76) {
            this.method488(null, false, 104);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field6621.field958;
        if (arg2 < 69) {
            return;
        }
        if (this.field6619.field4482) {
            float var5 = (float) (this.field9493.field7708 % 4000) / 4000.0F;
            this.field9493.method3091(true, this.field6619.field4478);
            var4.method3711(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field9493.field7708 % 4000 * 16 / 4000;
            this.field9493.method3091(true, this.field6619.field4483[var6]);
            var4.method3711(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (arg0 < -39 && this.field6618 != null) {
            IDirect3DDevice var2 = this.field6621.field958;
            var2.method3714(4, this.field9493.method3121(field6620, 13));
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (arg0 > -39) {
            field6620 = null;
        }
        if (this.field6618 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6621.field958;
        class131 var3 = this.field9493.method3128(0);
        var3.method952((byte) -70, field6620);
        field6620[3] *= 0.25F;
        field6620[2] *= 0.25F;
        field6620[7] *= 0.25F;
        field6620[1] *= 0.25F;
        field6620[4] *= 0.25F;
        field6620[6] *= 0.25F;
        field6620[5] *= 0.25F;
        field6620[0] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field6620, 2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
    public final void method498(boolean arg0, byte arg1) {
        this.field6621.field958.SetVertexShader(this.field6618);
        this.field9493.method3115(0, 0, class61.field833);
        if (arg1 >= -82) {
            this.field6621 = null;
        }
        this.field9493.method3115(1, 0, class425.field5511);
        this.field9493.method206(true, class697.field9582, false, 2, 23798);
        this.field9493.method3099(false, -21716);
        this.method497(1);
        this.method496(-88);
        this.method492(-71);
        this.method500((byte) 76);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lnm;ZI)V")
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field6618 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Z")
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            this.field6619 = null;
        }
        return this.field6618 != null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method497(int arg0) {
        if (this.field6618 != null) {
            IDirect3DDevice var2 = this.field6621.field958;
            class131 var3 = this.field6621.method3074((byte) -97);
            var2.method3714(0, var3.method944(field6620, arg0 + 43));
        }
        if (arg0 != 1) {
            this.method490((byte) -41);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lmba;Lpe;Lbl;)V")
    public class502(class70 arg0, class615 arg1, class350 arg2) {
        super(arg0);
        this.field6621 = arg0;
        this.field6619 = arg2;
        if (this.field6619.method2010(-17) && (this.field6621.field944.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6618 = this.field6621.field958.method3708(arg1.method3355(0, "transparent_water", "dx"));
        } else {
            this.field6618 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    public final void method495(int arg0, boolean arg1) {
        if (arg0 == 1) {
            this.field9493.method3105(class600.field8091, true, class456.field5976);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (arg0 < 38) {
            this.field6618 = null;
        }
        this.field6621.field958.SetVertexShader(null);
        this.field9493.method3115(0, 0, class61.field833);
        this.field9493.method3115(1, 0, class697.field9582);
        this.field9493.method3115(2, 0, class425.field5511);
        this.field9493.method3099(true, -21716);
    }
}

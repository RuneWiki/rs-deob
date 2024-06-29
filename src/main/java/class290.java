import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class290 extends class516 {

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lwda;")
    private class547 field4022;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Ljq;")
    private class438 field4024;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4023;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[F")
    private static float[] field4025 = new float[16];

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lwda;Lkda;Ljq;)V")
    public class290(class547 arg0, class328 arg1, class438 arg2) {
        super(arg0);
        this.field4022 = arg0;
        this.field4024 = arg2;
        if (this.field4024.method2555(true) && (this.field4022.field8178.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4023 = this.field4022.field8175.method2426(arg1.method1990("transparent_water", 0, "dx"));
        } else {
            this.field4023 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        if (arg0 > -60) {
            this.method202(null, 2, -96);
        }
        return this.field4023 != null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lpb;II)V")
    public final void method202(class563 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method197(true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        this.field4022.field8175.SetVertexShader(null);
        this.field7353.method2598(class453.field6405, 0, (byte) 59);
        this.field7353.method2598(class325.field4478, 1, (byte) 59);
        this.field7353.method2598(class314.field4331, 2, (byte) 59);
        if (!arg0) {
            this.field7353.method2574((byte) 121, true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public final void method1197(int arg0) {
        if (this.field4023 != null) {
            IDirect3DDevice var2 = this.field4022.field8175;
            var2.method2429(4, this.field7353.method2684(109, field4025));
        }
        if (arg0 != 22908) {
            this.field4024 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
    public final void method1198(boolean arg0) {
        if (arg0 && this.field4023 != null) {
            IDirect3DDevice var2 = this.field4022.field8175;
            class57 var3 = this.field4022.method2579(-81);
            var2.method2429(0, var3.method375(field4025, arg0));
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
    public final void method199(byte arg0, boolean arg1) {
        this.field4022.field8175.SetVertexShader(this.field4023);
        this.field7353.method2598(class453.field6405, 0, (byte) 59);
        this.field7353.method2598(class314.field4331, 1, (byte) 59);
        this.field7353.method2612(false, 2, (byte) 64, true, class325.field4478);
        int var3 = 54 / ((63 - arg0) / 38);
        this.field7353.method2574((byte) 112, false);
        this.method1194(393216);
        this.method1196(-3385);
        this.method1197(22908);
        this.method1200((byte) -108);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = 7 / ((-arg0 - 41) / 57);
        IDirect3DDevice var5 = this.field4022.field8175;
        if (this.field4024.field5849) {
            float var7 = (float) (this.field7353.field6100 % 4000) / 4000.0F;
            this.field7353.method2632(this.field4024.field5850, 0);
            var5.method2422(11, var7, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field7353.field6100 % 4000 * 16 / 4000;
            this.field7353.method2632(this.field4024.field5852[var6], 0);
            var5.method2422(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method1194(int arg0) {
        if (arg0 != 393216) {
            this.method1194(-90);
        }
        if (this.field4023 != null) {
            IDirect3DDevice var2 = this.field4022.field8175;
            class57 var3 = this.field4022.method2579(arg0 ^ 0xFFF9FF82);
            var2.method2429(0, var3.method375(field4025, true));
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public final void method1196(int arg0) {
        if (this.field4023 != null) {
            IDirect3DDevice var2 = this.field4022.field8175;
            class57 var3 = this.field7353.method2600(0);
            var3.method378(arg0 + 3392, field4025);
            field4025[1] *= 0.25F;
            field4025[7] *= 0.25F;
            field4025[0] *= 0.25F;
            field4025[6] *= 0.25F;
            field4025[2] *= 0.25F;
            field4025[4] *= 0.25F;
            field4025[3] *= 0.25F;
            field4025[5] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field4025, 2);
        }
        if (arg0 != -3385) {
            this.field4023 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public final void method1200(byte arg0) {
        int var2 = -26 % ((arg0 + 31) / 61);
        if (this.field4023 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field4022.field8175;
        if (this.field7353.field6153 <= 0) {
            var3.method2422(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var4 = this.field7353.field6113;
            float var5 = this.field7353.field6097;
            float var6 = var5 - 512.0F;
            var3.method2422(10, var6, 1.0F / (var5 - var6), var5, 1.0F / (var4 - var5));
        }
        this.field7353.method2688(this.field7353.field6147, 28366);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
    public final void method195(boolean arg0, boolean arg1) {
        this.field7353.method2643(class533.field7939, -10304, class471.field6648);
        if (!arg1) {
            this.field4023 = null;
        }
    }
}

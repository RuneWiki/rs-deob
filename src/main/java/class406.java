import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class406 extends class573 {

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lmh;")
    private class632 field5650;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lwda;")
    private class639 field5649;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5648;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[F")
    private static float[] field5647 = new float[16];

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lmh;Lwu;Lwda;)V")
    public class406(class632 arg0, class376 arg1, class639 arg2) {
        super(arg0);
        this.field5650 = arg0;
        this.field5649 = arg2;
        if (arg1 != null && this.field5649.method3498((byte) -42) && (this.field5650.field8435.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5648 = this.field5650.field8422.method2760(arg1.method2204("transparent_water", "dx", (byte) 95));
        } else {
            this.field5648 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public final void method1142(int arg0) {
        if (arg0 == 4095 && this.field5648 != null) {
            IDirect3DDevice var2 = this.field5650.field8422;
            var2.method2758(4, this.field7517.method821(true, field5647));
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public final void method1138(int arg0) {
        if (arg0 != 3) {
            this.method1140(false);
        }
        if (this.field5648 != null) {
            IDirect3DDevice var2 = this.field5650.field8422;
            class615 var3 = this.field5650.method913((byte) 112);
            var2.method2758(0, var3.method3367(95, field5647));
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final void method1140(boolean arg0) {
        if (this.field5648 != null) {
            IDirect3DDevice var2 = this.field5650.field8422;
            if (this.field7517.field1730 > 0) {
                float var3 = this.field7517.field1762;
                float var4 = this.field7517.field1743;
                float var5 = var4 - 512.0F;
                var2.method2763(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2763(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field7517.method870(this.field7517.field1786, false);
        }
        if (!arg0) {
            this.method610(false, -91);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
    public final void method610(boolean arg0, int arg1) {
        if (arg1 >= 109) {
            this.field7517.method849((byte) 46, class759.field10559, class314.field4479);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lwc;IB)V")
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg2 < 68) {
            field5647 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            this.method1142(124);
        }
        return this.field5648 != null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method602(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field5650.field8422;
        if (this.field5649.field8467) {
            float var5 = (float) (this.field7517.field1759 % 4000) / 4000.0F;
            this.field7517.method823(this.field5649.field8477, -8423);
            var4.method2763(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field7517.field1759 % 4000 * 16 / 4000;
            this.field7517.method823(this.field5649.field8468[var6], -8423);
            var4.method2763(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != -26427) {
            this.method603(false);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method1139(int arg0) {
        if (this.field5648 != null) {
            IDirect3DDevice var2 = this.field5650.field8422;
            class615 var3 = this.field7517.method873((byte) 114);
            var3.method3350(false, field5647);
            field5647[5] *= 0.25F;
            field5647[0] *= 0.25F;
            field5647[3] *= 0.25F;
            field5647[1] *= 0.25F;
            field5647[6] *= 0.25F;
            field5647[7] *= 0.25F;
            field5647[4] *= 0.25F;
            field5647[2] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field5647, 2);
        }
        if (arg0 != 4095) {
            this.method1140(false);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZ)V")
    public final void method611(boolean arg0, boolean arg1) {
        this.field7517.method840(0, -121, class454.field6199);
        this.field7517.method840(1, -88, class362.field5101);
        this.field7517.method911(-8980, 2, class92.field1112, true, false);
        this.field7517.method908((byte) -88, false);
        this.field5650.method3470((byte) 71, this.field5648);
        this.method1138(3);
        this.method1139(4095);
        this.method1142(4095);
        this.method1140(arg0);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        this.field5650.method3470((byte) 71, null);
        this.field7517.method840(0, -82, class454.field6199);
        this.field7517.method840(1, 80, class92.field1112);
        this.field7517.method840(2, -64, class362.field5101);
        this.field7517.method908((byte) 85, arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (arg0 > 115 && this.field5648 != null) {
            IDirect3DDevice var2 = this.field5650.field8422;
            class615 var3 = this.field5650.method913((byte) 66);
            var2.method2758(0, var3.method3367(-119, field5647));
        }
    }
}

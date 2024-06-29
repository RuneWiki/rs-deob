import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class464 extends class262 {

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lvt;")
    private class276 field6478;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lkaa;")
    private class44 field6481;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6479;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[F")
    private static float[] field6480 = new float[16];

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method377(int arg0, boolean arg1) {
        if (arg0 <= 37) {
            return;
        }
        this.field6481.field797.SetVertexShader(this.field6479);
        this.field3601.method2301(0, class519.field7612, 2);
        this.field3601.method2301(1, class308.field4083, 2);
        this.field3601.method512(false, 2, 9494, class366.field4928, true);
        this.field3601.method2328(-122, false);
        this.method597(16383);
        this.method596((byte) 73);
        this.method594(3);
        this.method593(-96);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZI)V", line = 22)
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        IDirect3DDevice var4 = this.field6481.field797;
        if (this.field6478.field3776) {
            float var6 = (float) (this.field3601.field5487 % 4000) / 4000.0F;
            this.field3601.method2316((byte) 105, this.field6478.field3777);
            var4.method2651(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field3601.field5487 % 4000 * 16 / 4000;
            this.field3601.method2316((byte) 119, this.field6478.field3770[var5]);
            var4.method2651(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 48)
    public final void method596(byte arg0) {
        if (this.field6479 != null) {
            IDirect3DDevice var2 = this.field6481.field797;
            class653 var3 = this.field3601.method2311((byte) -119);
            var3.method3680(field6480, -8);
            field6480[1] *= 0.25F;
            field6480[2] *= 0.25F;
            field6480[5] *= 0.25F;
            field6480[6] *= 0.25F;
            field6480[7] *= 0.25F;
            field6480[3] *= 0.25F;
            field6480[4] *= 0.25F;
            field6480[0] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field6480, 2);
        }
        if (arg0 <= 9) {
            this.field6481 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method375(int arg0) {
        if (arg0 == -18095) {
            return this.field6479 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 86)
    public final void method593(int arg0) {
        int var2 = -106 / ((arg0 + 41) / 52);
        if (this.field6479 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field6481.field797;
        if (this.field3601.field5449 > 0) {
            float var4 = this.field3601.field5468;
            float var5 = this.field3601.field5488;
            float var6 = var5 - 512.0F;
            var3.method2651(10, var6, 1.0F / (var5 - var6), var5, 1.0F / (var4 - var5));
        } else {
            var3.method2651(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field3601.method2331(true, this.field3601.field5471);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V", line = 114)
    public final void method595(byte arg0) {
        if (arg0 != 47) {
            this.field6479 = null;
        }
        if (this.field6479 != null) {
            IDirect3DDevice var2 = this.field6481.field797;
            class653 var3 = this.field6481.method2354((byte) -119);
            var2.method2654(0, var3.method3692(-13671, field6480));
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 135)
    public final void method374(int arg0) {
        this.field6481.field797.SetVertexShader(null);
        this.field3601.method2301(0, class519.field7612, 2);
        if (arg0 >= 42) {
            this.field3601.method2301(1, class366.field4928, 2);
            this.field3601.method2301(2, class308.field4083, 2);
            this.field3601.method2328(91, true);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V", line = 149)
    public final void method372(boolean arg0, int arg1) {
        this.field3601.method2303((byte) 18, class698.field9875, class442.field6300);
        if (arg1 != 0) {
            this.method372(false, 12);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lkaa;Ljn;Lvt;)V", line = 158)
    public class464(class44 arg0, class668 arg1, class276 arg2) {
        super(arg0);
        this.field6478 = arg2;
        this.field6481 = arg0;
        if (arg1 != null && this.field6478.method1670(false) && (this.field6481.field776.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6479 = this.field6481.field797.method2658(arg1.method3778(-63, "dx", "transparent_water"));
        } else {
            this.field6479 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILoa;B)V", line = 175)
    public final void method371(int arg0, class644 arg1, byte arg2) {
        if (arg2 < 80) {
            field6480 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V", line = 184)
    public final void method597(int arg0) {
        if (arg0 == 16383 && this.field6479 != null) {
            IDirect3DDevice var2 = this.field6481.field797;
            class653 var3 = this.field6481.method2354((byte) 60);
            var2.method2654(0, var3.method3692(-13671, field6480));
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V", line = 209)
    public final void method594(int arg0) {
        if (this.field6479 != null) {
            IDirect3DDevice var2 = this.field6481.field797;
            var2.method2654(4, this.field3601.method2366(field6480, true));
        }
        if (arg0 != 3) {
            this.field6481 = null;
        }
    }
}

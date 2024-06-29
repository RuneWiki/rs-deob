import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class652 extends class573 {

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
    private boolean field8642 = false;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lmh;")
    private class632 field8638;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8647;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8644;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8645;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8646;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "Z")
    private boolean field8649;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Ltr;")
    private class297 field8640;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[F")
    private static float[] field8639 = new float[4];

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[F")
    private static float[] field8648 = new float[16];

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8641;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
    private boolean field8643;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method602(int arg0, int arg1, int arg2) {
        if (arg0 != -26427) {
            this.field8646 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (this.field8641 != null) {
            IDirect3DDevice var2 = this.field8638.field8422;
            class615 var3 = this.field8638.method913((byte) 120);
            var2.method2758(0, var3.method3367(99, field8648));
        }
        if (arg0 < 115) {
            this.method607(null, -51, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    private final void method3553(int arg0) {
        if (this.field8641 != null && this.field8643) {
            class615 var2 = this.field7517.method852(63);
            IDirect3DDevice var3 = this.field8638.field8422;
            var3.method2763(13, this.field7517.field1757 * this.field7517.field1742, this.field7517.field1796 * this.field7517.field1742, this.field7517.field1774 * this.field7517.field1742, 1.0F);
            var3.method2763(14, this.field7517.field1816 * this.field7517.field1757, this.field7517.field1816 * this.field7517.field1796, this.field7517.field1816 * this.field7517.field1774, 1.0F);
            var3.method2763(16, this.field7517.field1821 * this.field7517.field1757, this.field7517.field1821 * this.field7517.field1796, this.field7517.field1821 * this.field7517.field1774, 1.0F);
            var2.method3360(field8639, this.field7517.field1754[2], this.field7517.field1754[0], this.field7517.field1754[1], -28422);
            var3.SetVertexShaderConstantF(15, field8639, 1);
            var2.method3360(field8639, this.field7517.field1767[2], this.field7517.field1767[0], this.field7517.field1767[1], -28422);
            var3.SetVertexShaderConstantF(17, field8639, 1);
        }
        if (arg0 < 95) {
            this.field8649 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method1139(int arg0) {
        if (arg0 == 4095 && this.field8641 != null) {
            IDirect3DDevice var2 = this.field8638.field8422;
            class615 var3 = this.field7517.method873((byte) 114);
            var2.SetVertexShaderConstantF(8, var3.method3350(false, field8648), 2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
    public final void method611(boolean arg0, boolean arg1) {
        this.field8643 = arg1;
        this.field7517.method934(1, (byte) -65);
        this.field7517.method823(this.field8640, -8423);
        this.field7517.method849((byte) 101, class99.field1265, class314.field4479);
        this.field7517.method840(0, -71, class362.field5101);
        this.field7517.method911(-8980, 2, class454.field6199, false, arg0);
        this.field7517.method845(class227.field3230, (byte) 119, 0);
        this.field7517.method934(0, (byte) -65);
        this.method3152((byte) 9);
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public final void method1142(int arg0) {
        if (this.field8641 != null) {
            IDirect3DDevice var2 = this.field8638.field8422;
            var2.method2758(4, this.field7517.method821(true, field8648));
        }
        if (arg0 != 4095) {
            this.method3152((byte) -84);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lwc;IB)V")
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg0 != null) {
            if (this.field8642) {
                this.field7517.method840(0, -113, class454.field6199);
                this.field7517.method845(class454.field6199, (byte) 85, 0);
                this.field8642 = false;
            }
            this.field7517.method823(arg0, -8423);
            this.field7517.method887((byte) 120, arg1);
        } else if (!this.field8642) {
            this.field7517.method823(this.field7517.field1809, -8423);
            this.field7517.method887((byte) 107, 1);
            this.field7517.method840(0, -102, class227.field3230);
            this.field7517.method845(class227.field3230, (byte) 99, 0);
            this.field8642 = true;
        }
        if (arg2 <= 68) {
            this.field8640 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
    public final void method610(boolean arg0, int arg1) {
        if (arg1 < 109) {
            this.method3553(31);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public final void method1138(int arg0) {
        if (arg0 != 3) {
            field8648 = null;
        }
        if (this.field8641 != null) {
            IDirect3DDevice var2 = this.field8638.field8422;
            class615 var3 = this.field8638.method913((byte) 93);
            var2.method2758(0, var3.method3367(arg0 ^ 0xFFFFFFE7, field8648));
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method1140(boolean arg0) {
        if (!arg0) {
            this.field8646 = null;
        }
        if (this.field8641 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8638.field8422;
        int var3 = this.field7517.method402();
        int var4 = this.field7517.method424();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2763(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2763(11, 1.0F / (float) this.field7517.method929(-104), (float) this.field7517.method872(-31039) / 255.0F, this.field7517.field1762, 1.0F / (this.field7517.field1762 - this.field7517.field1743));
        this.field7517.method870(this.field7517.method896(58), false);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            this.field8641 = null;
        }
        return this.field8649;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        this.field7517.method934(1, (byte) -65);
        this.field7517.method823(null, -8423);
        this.field7517.method849((byte) 94, class312.field4469, class312.field4469);
        this.field7517.method840(0, 107, class454.field6199);
        this.field7517.method840(2, 70, class362.field5101);
        this.field7517.method845(class454.field6199, (byte) 126, 0);
        if (!arg0) {
            this.method3152((byte) 123);
        }
        this.field7517.method934(0, (byte) -65);
        if (this.field8642) {
            this.field7517.method840(0, 46, class454.field6199);
            this.field7517.method845(class454.field6199, (byte) 120, 0);
            this.field8642 = false;
        }
        if (this.field8641 != null) {
            this.field8638.method3470((byte) 71, null);
            this.field8641 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lmh;Lwu;)V")
    public class652(class632 arg0, class376 arg1) {
        super(arg0);
        this.field8638 = arg0;
        if (arg1 == null || (this.field8638.field8435.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8649 = false;
        } else {
            this.field8647 = this.field8638.field8422.method2760(arg1.method2204("uw_ground_unlit", "dx", (byte) 92));
            this.field8644 = this.field8638.field8422.method2760(arg1.method2204("uw_ground_lit", "dx", (byte) 120));
            this.field8645 = this.field8638.field8422.method2760(arg1.method2204("uw_model_unlit", "dx", (byte) 105));
            this.field8646 = this.field8638.field8422.method2760(arg1.method2204("uw_model_lit", "dx", (byte) 100));
            if ((this.field8646 != null & this.field8647 != null & this.field8644 != null & this.field8645 != null)) {
                this.field8640 = this.field7517.method927(2, new int[] { 0, -1 }, (byte) -53, false, 1);
                this.field8640.method595(1645, false, false);
                this.field8649 = true;
            } else {
                this.field8649 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public final void method3152(byte arg0) {
        int var2 = -25 / ((-arg0 - 46) / 55);
        IDirect3DDevice var3 = this.field8638.field8422;
        int var4 = this.field7517.method947(-8);
        class615 var5 = this.field7517.method867(true);
        IDirect3DVertexShader var6;
        if (this.field8643) {
            var6 = var4 == Integer.MAX_VALUE ? this.field8644 : this.field8646;
        } else {
            var6 = var4 == Integer.MAX_VALUE ? this.field8647 : this.field8645;
        }
        if (this.field8641 != var6) {
            this.field8641 = var6;
            this.field8638.method3470((byte) 71, var6);
            this.method3553(104);
            this.method1142(4095);
            this.method1139(4095);
            this.method1138(3);
            this.method1141((byte) 117);
            this.method1140(true);
        }
        var5.method3365(field8639, -1.0F, true, 0.0F, 0.0F, (float) var4);
        var3.method2758(12, field8639);
    }
}

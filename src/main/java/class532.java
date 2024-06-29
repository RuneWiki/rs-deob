import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class532 extends class545 {

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Z")
    private boolean field7773 = false;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lad;")
    private class173 field7769;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7763;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7772;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7765;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7767;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "Lug;")
    private class60 field7768;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Z")
    private boolean field7774;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "[F")
    private static float[] field7770 = new float[4];

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[F")
    private static float[] field7766 = new float[16];

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7771;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Z")
    private boolean field7764;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        this.field7920.method208(8, 1);
        this.field7920.method264(null, arg0 ^ 0xFFFFFFFC);
        this.field7920.method386((byte) 113, class281.field3934, class281.field3934);
        this.field7920.method230(class234.field3509, 0, 45);
        this.field7920.method230(class231.field3462, arg0, 90);
        this.field7920.method242((byte) -127, class234.field3509, 0);
        this.field7920.method208(8, 0);
        if (this.field7773) {
            this.field7920.method230(class234.field3509, 0, arg0 ^ 0x73);
            this.field7920.method242((byte) -117, class234.field3509, 0);
            this.field7773 = false;
        }
        if (this.field7771 != null) {
            this.field7769.method1256((byte) -98, null);
            this.field7771 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public final void method1742(int arg0) {
        if (this.field7771 != null) {
            IDirect3DDevice var2 = this.field7769.field2418;
            class417 var3 = this.field7769.method244(1);
            var2.method4105(0, var3.method2530(-62, field7766));
        }
        if (arg0 != -971) {
            this.method459(96);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public final void method1741(int arg0) {
        if (this.field7771 != null) {
            IDirect3DDevice var2 = this.field7769.field2418;
            class417 var3 = this.field7920.method349((byte) 25);
            var2.SetVertexShaderConstantF(8, var3.method2534(field7766, (byte) 104), 2);
        }
        if (arg0 != 12) {
            this.field7767 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public final void method1739(int arg0) {
        if (this.field7771 != null) {
            IDirect3DDevice var2 = this.field7769.field2418;
            class417 var3 = this.field7769.method244(1);
            var2.method4105(0, var3.method2530(-88, field7766));
        }
        int var4 = -61 / ((85 - arg0) / 33);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public final void method453(int arg0) {
        if (this.field7771 != null) {
            IDirect3DDevice var2 = this.field7769.field2418;
            int var3 = this.field7920.method227();
            int var4 = this.field7920.method387();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method4097(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method4097(11, 1.0F / (float) this.field7920.method400(-226058728), (float) this.field7920.method220((byte) 45) / 255.0F, this.field7920.field546, 1.0F / (this.field7920.field546 - this.field7920.field563));
            this.field7920.method213(this.field7920.method410(122), arg0 + 3);
        }
        if (arg0 != 0) {
            this.method1740(false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    private final void method3231(byte arg0) {
        if (this.field7771 != null && this.field7764) {
            class417 var2 = this.field7920.method201(38);
            IDirect3DDevice var3 = this.field7769.field2418;
            var3.method4097(13, this.field7920.field551 * this.field7920.field541, this.field7920.field552 * this.field7920.field551, this.field7920.field551 * this.field7920.field549, 1.0F);
            var3.method4097(14, this.field7920.field599 * this.field7920.field541, this.field7920.field599 * this.field7920.field552, this.field7920.field599 * this.field7920.field549, 1.0F);
            var3.method4097(16, this.field7920.field594 * this.field7920.field541, this.field7920.field594 * this.field7920.field552, this.field7920.field594 * this.field7920.field549, 1.0F);
            var2.method2532(this.field7920.field609[0], field7770, this.field7920.field609[1], (byte) -87, this.field7920.field609[2]);
            var3.SetVertexShaderConstantF(15, field7770, 1);
            var2.method2532(this.field7920.field625[0], field7770, this.field7920.field625[1], (byte) -87, this.field7920.field625[2]);
            var3.SetVertexShaderConstantF(17, field7770, 1);
        }
        if (arg0 != -96) {
            this.method455(-37, 47, null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lad;Lla;)V")
    public class532(class173 arg0, class423 arg1) {
        super(arg0);
        this.field7769 = arg0;
        if (arg1 == null || (this.field7769.field2419.VertexShaderVersion & 0xFFFF) < 257) {
            this.field7774 = false;
        } else {
            this.field7763 = this.field7769.field2418.method4110(arg1.method2591("dx", (byte) 71, "uw_ground_unlit"));
            this.field7772 = this.field7769.field2418.method4110(arg1.method2591("dx", (byte) 71, "uw_ground_lit"));
            this.field7765 = this.field7769.field2418.method4110(arg1.method2591("dx", (byte) 71, "uw_model_unlit"));
            this.field7767 = this.field7769.field2418.method4110(arg1.method2591("dx", (byte) 71, "uw_model_lit"));
            if (this.field7767 != null & this.field7765 != null & this.field7763 != null & this.field7772 != null) {
                this.field7768 = this.field7920.method303(false, 1, 2, new int[] { 0, -1 }, -5);
                this.field7768.method560(false, 16609, false);
                this.field7774 = true;
            } else {
                this.field7774 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg2 != null) {
            if (this.field7773) {
                this.field7920.method230(class234.field3509, 0, 124);
                this.field7920.method242((byte) -115, class234.field3509, 0);
                this.field7773 = false;
            }
            this.field7920.method264(arg2, arg0 ^ 0xFFFFFFFC);
            this.field7920.method411(17024, arg1);
        } else if (!this.field7773) {
            this.field7920.method264(this.field7920.field547, -2);
            this.field7920.method411(17024, 1);
            this.field7920.method230(class401.field5746, 0, 63);
            this.field7920.method242((byte) -112, class401.field5746, 0);
            this.field7773 = true;
        }
        if (arg0 != 2) {
            this.method1740(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        if (arg0 < 63) {
            this.field7769 = null;
        }
        return this.field7774;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        this.field7764 = arg1;
        this.field7920.method208(8, 1);
        this.field7920.method264(this.field7768, -2);
        if (arg0 <= 101) {
            this.method3231((byte) 81);
        }
        this.field7920.method386((byte) -114, class567.field8198, class596.field8472);
        this.field7920.method230(class231.field3462, 0, 41);
        this.field7920.method282(false, true, (byte) -60, 2, class234.field3509);
        this.field7920.method242((byte) -123, class401.field5746, 0);
        this.field7920.method208(8, 0);
        this.method456(0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method1739(62);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method451(31, -80, 15);
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public final void method456(int arg0) {
        IDirect3DDevice var2 = this.field7769.field2418;
        int var3 = this.field7920.method237((byte) -50);
        class417 var4 = this.field7920.method323((byte) -26);
        IDirect3DVertexShader var5;
        if (this.field7764) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field7772 : this.field7767;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field7763 : this.field7765;
        }
        if (this.field7771 != var5) {
            this.field7771 = var5;
            this.field7769.method1256((byte) -116, var5);
            this.method3231((byte) -96);
            this.method1740(false);
            this.method1741(12);
            this.method1739(41);
            this.method1742(-971);
            this.method453(0);
        }
        var4.method2524(-1.0F, field7770, 0.0F, (float) var3, false, (float) arg0);
        var2.method4105(12, field7770);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method1740(boolean arg0) {
        if (this.field7771 != null) {
            IDirect3DDevice var2 = this.field7769.field2418;
            var2.method4105(4, this.field7920.method291((byte) -32, field7766));
        }
        if (arg0) {
            this.field7773 = true;
        }
    }
}

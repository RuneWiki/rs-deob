import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class167 extends class516 {

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "Lwda;")
    private class547 field2620;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
    private boolean field2621;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2623;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2618;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2626;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2622;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "[F")
    private static float[] field2617 = new float[4];

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "[F")
    private static float[] field2624 = new float[16];

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2619;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Z")
    private boolean field2625;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V", line = 5)
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = -98 % ((arg0 + 41) / 57);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 12)
    public final void method1194(int arg0) {
        if (this.field2619 != null) {
            IDirect3DDevice var2 = this.field2620.field8175;
            class57 var3 = this.field2620.method2579(-47);
            var2.method2429(0, var3.method375(field2624, true));
        }
        if (arg0 != 393216) {
            this.field2622 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 31)
    public final void method197(boolean arg0) {
        if (this.field2619 != null) {
            this.field2620.field8175.SetVertexShader(null);
            this.field2619 = null;
        }
        if (arg0) {
            this.method1195((byte) 66);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 50)
    public final void method1195(byte arg0) {
        IDirect3DDevice var2 = this.field2620.field8175;
        int var3 = this.field7353.method2672(9);
        class57 var4 = this.field7353.method2599(5);
        IDirect3DVertexShader var5;
        if (this.field2625) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2618 : this.field2622;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2623 : this.field2626;
        }
        if (this.field2619 != var5) {
            this.field2619 = var5;
            var2.SetVertexShader(var5);
            this.method1199((byte) -98);
            this.method1197(22908);
            this.method1196(-3385);
            this.method1194(393216);
            this.method1198(true);
            this.method1200((byte) -96);
        }
        var4.method379(field2617, -90, 0.0F, (float) var3, -1.0F, 0.0F);
        if (arg0 <= 117) {
            this.field2622 = null;
        }
        var2.method2429(12, field2617);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 90)
    public final void method1196(int arg0) {
        if (arg0 != -3385) {
            field2624 = null;
        }
        if (this.field2619 != null) {
            IDirect3DDevice var2 = this.field2620.field8175;
            class57 var3 = this.field7353.method2600(arg0 ^ 0xFFFFF2C7);
            var2.SetVertexShaderConstantF(8, var3.method378(7, field2624), 2);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 109)
    public final void method1197(int arg0) {
        if (this.field2619 != null) {
            IDirect3DDevice var2 = this.field2620.field8175;
            var2.method2429(4, this.field7353.method2684(-77, field2624));
        }
        if (arg0 != 22908) {
            this.field2626 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BZ)V", line = 129)
    public final void method199(byte arg0, boolean arg1) {
        int var3 = 1 % ((arg0 - 63) / 38);
        this.field2625 = arg1;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V", line = 137)
    public final void method1198(boolean arg0) {
        if (this.field2619 != null) {
            IDirect3DDevice var2 = this.field2620.field8175;
            class57 var3 = this.field2620.method2579(50);
            var2.method2429(0, var3.method375(field2624, true));
        }
        if (!arg0) {
            this.method201((byte) -24);
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V", line = 158)
    private final void method1199(byte arg0) {
        if (arg0 >= -85 || this.field2619 == null || !this.field2625) {
            return;
        }
        class57 var2 = this.field7353.method2599(5);
        IDirect3DDevice var3 = this.field2620.field8175;
        var3.method2422(13, this.field7353.field6190 * this.field7353.field6176, this.field7353.field6190 * this.field7353.field6165, this.field7353.field6190 * this.field7353.field6107, 1.0F);
        var3.method2422(14, this.field7353.field6176 * this.field7353.field6126, this.field7353.field6165 * this.field7353.field6126, this.field7353.field6126 * this.field7353.field6107, 1.0F);
        var3.method2422(16, this.field7353.field6176 * this.field7353.field6163, this.field7353.field6165 * this.field7353.field6163, this.field7353.field6163 * this.field7353.field6107, 1.0F);
        var2.method383(this.field7353.field6134[1], this.field7353.field6134[2], field2617, this.field7353.field6134[0], (byte) 112);
        var3.SetVertexShaderConstantF(15, field2617, 1);
        var2.method383(this.field7353.field6123[1], this.field7353.field6123[2], field2617, this.field7353.field6123[0], (byte) 94);
        var3.SetVertexShaderConstantF(15, field2617, 1);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V", line = 182)
    public final void method1200(byte arg0) {
        if (this.field2619 != null) {
            IDirect3DDevice var2 = this.field2620.field8175;
            int var3 = this.field7353.method435();
            int var4 = this.field7353.method524();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2422(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2422(11, 1.0F / (float) this.field7353.method2674((byte) 110), (float) this.field7353.method2577((byte) -85) / 255.0F, 0.0F, 0.0F);
        }
        int var7 = 69 / ((arg0 + 31) / 61);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lpb;II)V", line = 207)
    public final void method202(class563 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method197(true);
        }
        this.field7353.method2632(arg0, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZZ)V", line = 217)
    public final void method195(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field2625 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)Z", line = 227)
    public final boolean method201(byte arg0) {
        if (arg0 > -60) {
            field2617 = null;
        }
        return this.field2621;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lwda;Lkda;)V", line = 236)
    public class167(class547 arg0, class328 arg1) {
        super(arg0);
        this.field2620 = arg0;
        if ((this.field2620.field8178.VertexShaderVersion & 0xFFFF) < 257) {
            this.field2621 = false;
        } else {
            this.field2623 = this.field2620.field8175.method2426(arg1.method1990("uw_ground_unlit", 0, "dx"));
            this.field2618 = this.field2620.field8175.method2426(arg1.method1990("uw_ground_lit", 0, "dx"));
            this.field2626 = this.field2620.field8175.method2426(arg1.method1990("uw_model_unlit", 0, "dx"));
            this.field2622 = this.field2620.field8175.method2426(arg1.method1990("uw_model_lit", 0, "dx"));
            this.field2621 = this.field2618 != null & this.field2623 != null & this.field2626 != null & this.field2622 != null;
        }
    }
}

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class634 extends class429 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Llj;")
    private class8 field8948;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lnc;")
    private class227 field8951;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8950;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[F")
    private static float[] field8949 = new float[16];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method1098(int arg0) {
        if (arg0 == 0 && this.field8950 != null) {
            IDirect3DDevice var2 = this.field8948.field100;
            class742 var3 = this.field8948.method1018(arg0 + 74);
            var2.method4182(0, var3.method4082(-127, field8949));
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
    public final boolean method48(byte arg0) {
        if (arg0 == -128) {
            return this.field8950 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 != 37) {
            this.field8950 = null;
        }
        IDirect3DDevice var4 = this.field8948.field100;
        if (this.field8951.field3302) {
            float var5 = (float) (this.field5939.field1928 % 4000) / 4000.0F;
            this.field5939.method988(arg0 - 36, this.field8951.field3301);
            var4.method4174(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field5939.field1928 % 4000 * 16 / 4000;
            this.field5939.method988(1, this.field8951.field3298[var6]);
            var4.method4174(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final void method1099(int arg0) {
        if (arg0 != 37) {
            this.method48((byte) 99);
        }
        if (this.field8950 != null) {
            IDirect3DDevice var2 = this.field8948.field100;
            class742 var3 = this.field8948.method1018(115);
            var2.method4182(0, var3.method4082(-124, field8949));
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public final void method1101(int arg0) {
        if (arg0 != 1 || this.field8950 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8948.field100;
        if (this.field5939.field1942 > 0) {
            float var3 = this.field5939.field1866;
            float var4 = this.field5939.field1919;
            float var5 = var4 - 512.0F;
            var2.method4174(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method4174(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field5939.method1001(this.field5939.field1936, (byte) -62);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Len;ZI)V")
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method45(null, true, 62);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final void method1095(int arg0) {
        if (arg0 < 22) {
            this.field8948 = null;
        }
        if (this.field8950 != null) {
            IDirect3DDevice var2 = this.field8948.field100;
            var2.method4182(4, this.field5939.method1011(-22482, field8949));
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
    public final void method43(int arg0, boolean arg1) {
        if (arg0 == 0) {
            this.field5939.method974(class407.field5606, class228.field3319, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public final void method1097(int arg0) {
        if (arg0 >= -41) {
            this.field8951 = null;
        }
        if (this.field8950 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8948.field100;
        class742 var3 = this.field5939.method1003(-121);
        var3.method4081(109, field8949);
        field8949[2] *= 0.25F;
        field8949[7] *= 0.25F;
        field8949[6] *= 0.25F;
        field8949[5] *= 0.25F;
        field8949[3] *= 0.25F;
        field8949[0] *= 0.25F;
        field8949[4] *= 0.25F;
        field8949[1] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field8949, 2);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Llj;Lgga;Lnc;)V")
    public class634(class8 arg0, class513 arg1, class227 arg2) {
        super(arg0);
        this.field8948 = arg0;
        this.field8951 = arg2;
        if (arg1 != null && this.field8951.method1541(true) && (this.field8948.field104.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8950 = this.field8948.field100.method4175(arg1.method3017(0, "transparent_water", "dx"));
        } else {
            this.field8950 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        this.field8948.method67(null, 28);
        this.field5939.method1014(0, 86, class264.field3730);
        this.field5939.method1014(1, 100, class368.field5193);
        int var2 = -93 % ((-arg0 - 56) / 48);
        this.field5939.method1014(2, 55, class504.field6917);
        this.field5939.method976((byte) -103, true);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V")
    public final void method44(boolean arg0, boolean arg1) {
        this.field5939.method1014(0, 66, class264.field3730);
        this.field5939.method1014(1, 98, class504.field6917);
        this.field5939.method139(2, true, false, class368.field5193, 0);
        this.field5939.method976((byte) -114, arg1);
        this.field8948.method67(this.field8950, 28);
        this.method1099(37);
        this.method1097(-75);
        this.method1095(36);
        this.method1101(1);
    }
}

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class130 extends class429 {

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "Z")
    private boolean field2198 = false;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "Llj;")
    private class8 field2200;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2202;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2204;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2193;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2197;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "Llba;")
    private class225 field2203;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "Z")
    private boolean field2199;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "[F")
    private static float[] field2201 = new float[16];

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "[F")
    private static float[] field2194 = new float[4];

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2195;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Z")
    private boolean field2196;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZZ)V")
    public final void method44(boolean arg0, boolean arg1) {
        this.field2196 = arg0;
        this.field5939.method959(1, -18);
        this.field5939.method988(1, this.field2203);
        this.field5939.method974(class407.field5606, class552.field7657, (byte) -59);
        this.field5939.method1014(0, 124, class504.field6917);
        this.field5939.method139(2, arg1, true, class264.field3730, 0);
        this.field5939.method973(0, class317.field4535, (byte) 98);
        this.field5939.method959(0, 102);
        this.method1096(37);
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)V")
    public final void method1095(int arg0) {
        if (this.field2195 != null) {
            IDirect3DDevice var2 = this.field2200.field100;
            var2.method4182(4, this.field5939.method1011(-22482, field2201));
        }
        if (arg0 < 22) {
            this.method48((byte) 24);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)Z")
    public final boolean method48(byte arg0) {
        return arg0 == -128 ? this.field2199 : false;
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V")
    public final void method1096(int arg0) {
        IDirect3DDevice var2 = this.field2200.field100;
        int var3 = this.field5939.method982(-48);
        class742 var4 = this.field5939.method945(1);
        IDirect3DVertexShader var5;
        if (this.field2196) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2204 : this.field2197;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2202 : this.field2193;
        }
        if (arg0 != 37) {
            return;
        }
        if (this.field2195 != var5) {
            this.field2195 = var5;
            this.field2200.method67(var5, 28);
            this.method1100(1);
            this.method1095(34);
            this.method1097(arg0 ^ 0xFFFFFFBE);
            this.method1099(arg0);
            this.method1098(0);
            this.method1101(1);
        }
        var4.method4100((float) var3, (byte) 86, 0.0F, -1.0F, 0.0F, field2194);
        var2.method4182(12, field2194);
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
    public final void method1097(int arg0) {
        if (arg0 >= -41) {
            this.field2193 = null;
        }
        if (this.field2195 != null) {
            IDirect3DDevice var2 = this.field2200.field100;
            class742 var3 = this.field5939.method1003(-126);
            var2.SetVertexShaderConstantF(8, var3.method4081(106, field2201), 2);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        this.field5939.method959(1, 113);
        int var2 = 65 / ((arg0 + 56) / 48);
        this.field5939.method988(1, null);
        this.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
        this.field5939.method1014(0, 115, class264.field3730);
        this.field5939.method1014(2, 88, class504.field6917);
        this.field5939.method973(0, class264.field3730, (byte) 108);
        this.field5939.method959(0, -127);
        if (this.field2198) {
            this.field5939.method1014(0, 124, class264.field3730);
            this.field5939.method973(0, class264.field3730, (byte) 127);
            this.field2198 = false;
        }
        if (this.field2195 != null) {
            this.field2200.method67(null, 28);
            this.field2195 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public final void method1098(int arg0) {
        if (this.field2195 != null) {
            IDirect3DDevice var2 = this.field2200.field100;
            class742 var3 = this.field2200.method1018(98);
            var2.method4182(0, var3.method4082(-12, field2201));
        }
        if (arg0 != 0) {
            this.method45(null, true, 122);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
    public final void method1099(int arg0) {
        if (arg0 == 37 && this.field2195 != null) {
            IDirect3DDevice var2 = this.field2200.field100;
            class742 var3 = this.field2200.method1018(60);
            var2.method4182(0, var3.method4082(arg0 ^ 0x6D, field2201));
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Len;ZI)V")
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        if (arg0 != null) {
            if (this.field2198) {
                this.field5939.method1014(0, 69, class264.field3730);
                this.field5939.method973(0, class264.field3730, (byte) 116);
                this.field2198 = false;
            }
            this.field5939.method988(1, arg0);
            this.field5939.method949(arg2, (byte) 57);
        } else if (!this.field2198) {
            this.field5939.method988(1, this.field5939.field1900);
            this.field5939.method949(1, (byte) 57);
            this.field5939.method1014(0, 108, class317.field4535);
            this.field5939.method973(0, class317.field4535, (byte) 94);
            this.field2198 = true;
        }
        if (arg1) {
            this.method47((byte) 54);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
    public final void method43(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method1096(-104);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "(I)V")
    private final void method1100(int arg0) {
        if (this.field2195 != null && this.field2196) {
            class742 var2 = this.field5939.method967(-30860);
            IDirect3DDevice var3 = this.field2200.field100;
            var3.method4174(13, this.field5939.field1912 * this.field5939.field1867, this.field5939.field1883 * this.field5939.field1867, this.field5939.field1882 * this.field5939.field1867, 1.0F);
            var3.method4174(14, this.field5939.field1912 * this.field5939.field1877, this.field5939.field1883 * this.field5939.field1877, this.field5939.field1882 * this.field5939.field1877, 1.0F);
            var3.method4174(16, this.field5939.field1912 * this.field5939.field1907, this.field5939.field1907 * this.field5939.field1883, this.field5939.field1907 * this.field5939.field1882, 1.0F);
            var2.method4079(this.field5939.field1940[2], field2194, this.field5939.field1940[0], this.field5939.field1940[1], (byte) 26);
            var3.SetVertexShaderConstantF(15, field2194, 1);
            var2.method4079(this.field5939.field1886[2], field2194, this.field5939.field1886[0], this.field5939.field1886[1], (byte) 26);
            var3.SetVertexShaderConstantF(17, field2194, 1);
        }
        if (arg0 != 1) {
            this.method1098(-86);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V")
    public final void method1101(int arg0) {
        if (this.field2195 != null) {
            IDirect3DDevice var2 = this.field2200.field100;
            int var3 = this.field5939.method445();
            int var4 = this.field5939.method462();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method4174(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method4174(11, 1.0F / (float) this.field5939.method998(arg0 ^ 0x4), (float) this.field5939.method1016(true) / 255.0F, this.field5939.field1866, 1.0F / (this.field5939.field1866 - this.field5939.field1919));
            this.field5939.method1001(this.field5939.method1010((byte) -111), (byte) 103);
        }
        if (arg0 != 1) {
            this.field2197 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 != 37) {
            this.field2198 = false;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Llj;Lgga;)V")
    public class130(class8 arg0, class513 arg1) {
        super(arg0);
        this.field2200 = arg0;
        if (arg1 == null || (this.field2200.field104.VertexShaderVersion & 0xFFFF) < 257) {
            this.field2199 = false;
        } else {
            this.field2202 = this.field2200.field100.method4175(arg1.method3017(0, "uw_ground_unlit", "dx"));
            this.field2204 = this.field2200.field100.method4175(arg1.method3017(0, "uw_ground_lit", "dx"));
            this.field2193 = this.field2200.field100.method4175(arg1.method3017(0, "uw_model_unlit", "dx"));
            this.field2197 = this.field2200.field100.method4175(arg1.method3017(0, "uw_model_lit", "dx"));
            if (this.field2204 != null & this.field2202 != null & this.field2193 != null & this.field2197 != null) {
                this.field2203 = this.field5939.method944(1, 2, 21028, new int[] { 0, -1 }, false);
                this.field2203.method333(false, false, 7536);
                this.field2199 = true;
            } else {
                this.field2199 = false;
            }
        }
    }
}

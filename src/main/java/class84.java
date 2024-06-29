import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class84 extends class546 {

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "Lto;")
    private class8 field1036;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1033;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1042;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1041;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1037;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "Z")
    private boolean field1035;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "Lmca;")
    private class29 field1038;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "[F")
    private static float[] field1039 = new float[4];

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "[F")
    private static float[] field1040 = new float[16];

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1032;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "Z")
    private boolean field1034;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V", line = 5)
    public final void method783(int arg0) {
        this.field7937.method2244(1, arg0 ^ 0xFFFFFF70);
        this.field7937.method2271(null, 5180);
        this.field7937.method2275(class646.field9074, 83, class646.field9074);
        this.field7937.method2287((byte) -117, 0, class622.field8779);
        this.field7937.method2287((byte) -83, 2, class471.field6974);
        if (arg0 != 255) {
            this.field1034 = true;
        }
        this.field7937.method2304(class622.field8779, 0, arg0 - 380);
        this.field7937.method2244(0, -101);
        this.field7937.method2287((byte) -85, 0, class622.field8779);
        this.field7937.method2304(class622.field8779, 0, -112);
        if (this.field1032 != null) {
            this.field1036.field131.SetVertexShader(null);
            this.field1032 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V", line = 29)
    public final void method784(byte arg0) {
        if (this.field1032 != null) {
            IDirect3DDevice var2 = this.field1036.field131;
            class498 var3 = this.field7937.method2234(arg0 ^ 0xFFFFFF9F);
            var2.SetVertexShaderConstantF(8, var3.method3037(field1040, arg0 + 119), 2);
        }
        if (arg0 != -103) {
            this.method792(70);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)V", line = 47)
    public final void method785(int arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            this.method785(-118, 51, -48);
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V", line = 56)
    public final void method786(int arg0) {
        if (this.field1032 != null) {
            IDirect3DDevice var2 = this.field1036.field131;
            class498 var3 = this.field1036.method2303((byte) 118);
            var2.method2823(0, var3.method3042(field1040, 1));
        }
        if (arg0 < 27) {
            this.field1036 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Z", line = 76)
    public final boolean method787(byte arg0) {
        return arg0 == -109 ? this.field1035 : false;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V", line = 86)
    public final void method788(boolean arg0, int arg1) {
        this.field1034 = arg0;
        this.field7937.method2244(1, -120);
        this.field7937.method2271(this.field1038, 5180);
        this.field7937.method2275(class406.field6268, 83, class51.field681);
        this.field7937.method2287((byte) -78, 0, class471.field6974);
        this.field7937.method185(class622.field8779, 2, false, true, (byte) 106);
        this.field7937.method2304(class692.field9702, 0, arg1 ^ 0xFFFFFF85);
        this.field7937.method2244(arg1, arg1 ^ 0xFFFFFF9F);
        this.method791(-1);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 101)
    public final void method789(int arg0) {
        if (arg0 <= 121) {
            this.method790(-109);
        }
        if (this.field1032 != null) {
            IDirect3DDevice var2 = this.field1036.field131;
            class498 var3 = this.field1036.method2303((byte) 89);
            var2.method2823(0, var3.method3042(field1040, 1));
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V", line = 121)
    public final void method790(int arg0) {
        if (this.field1032 != null) {
            IDirect3DDevice var2 = this.field1036.field131;
            var2.method2823(4, this.field7937.method2257(field1040, 16711680));
        }
        if (arg0 != -32535) {
            this.method795(-62);
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V", line = 139)
    public final void method791(int arg0) {
        IDirect3DDevice var2 = this.field1036.field131;
        int var3 = this.field7937.method2272(2);
        class498 var4 = this.field7937.method2298(-106);
        IDirect3DVertexShader var5;
        if (this.field1034) {
            var5 = var3 == Integer.MAX_VALUE ? this.field1042 : this.field1037;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field1033 : this.field1041;
        }
        if (this.field1032 != var5) {
            this.field1032 = var5;
            var2.SetVertexShader(var5);
            this.method792(arg0 ^ 0xFFFFCBA7);
            this.method790(-32535);
            this.method784((byte) -103);
            this.method789(arg0 ^ 0xFFFFFF82);
            this.method786(102);
            this.method795(15759);
        }
        var4.method3025(0.0F, 0.0F, (float) var3, field1039, (byte) -48, (float) arg0);
        var2.method2823(12, field1039);
    }

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "(I)V", line = 174)
    private final void method792(int arg0) {
        if (this.field1032 != null && this.field1034) {
            class498 var2 = this.field7937.method2233(-1);
            IDirect3DDevice var3 = this.field1036.field131;
            var3.method2818(13, this.field7937.field5344 * this.field7937.field5326, this.field7937.field5383 * this.field7937.field5344, this.field7937.field5351 * this.field7937.field5344, 1.0F);
            var3.method2818(14, this.field7937.field5369 * this.field7937.field5326, this.field7937.field5383 * this.field7937.field5369, this.field7937.field5369 * this.field7937.field5351, 1.0F);
            var3.method2818(16, this.field7937.field5408 * this.field7937.field5326, this.field7937.field5408 * this.field7937.field5383, this.field7937.field5408 * this.field7937.field5351, 1.0F);
            var2.method3043(field1039, (byte) -125, this.field7937.field5423[1], this.field7937.field5423[0], this.field7937.field5423[2]);
            var3.SetVertexShaderConstantF(15, field1039, 1);
            var2.method3043(field1039, (byte) -123, this.field7937.field5399[1], this.field7937.field5399[0], this.field7937.field5399[2]);
            var3.SetVertexShaderConstantF(17, field1039, 1);
        }
        if (arg0 != 13400) {
            this.method790(35);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V", line = 198)
    public final void method793(int arg0, boolean arg1) {
        if (arg0 > -39) {
            this.method791(-79);
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lto;Lri;)V", line = 206)
    public class84(class8 arg0, class97 arg1) {
        super(arg0);
        this.field1036 = arg0;
        if (arg1 == null || (this.field1036.field135.VertexShaderVersion & 0xFFFF) < 257) {
            this.field1035 = false;
        } else {
            this.field1033 = this.field1036.field131.method2828(arg1.method923("dx", -25124, "uw_ground_unlit"));
            this.field1042 = this.field1036.field131.method2828(arg1.method923("dx", -25124, "uw_ground_lit"));
            this.field1041 = this.field1036.field131.method2828(arg1.method923("dx", -25124, "uw_model_unlit"));
            this.field1037 = this.field1036.field131.method2828(arg1.method923("dx", -25124, "uw_model_lit"));
            if ((this.field1037 != null & this.field1033 != null & this.field1042 != null & this.field1041 != null)) {
                this.field1038 = this.field7937.method2243(new int[] { 0, -1 }, 2, false, 1, (byte) -20);
                this.field1038.method364(false, false, (byte) 107);
                this.field1035 = true;
            } else {
                this.field1035 = false;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZLwq;)V", line = 241)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        if (arg2 == null) {
            this.field7937.method2271(this.field7937.field5418, 5180);
            this.field7937.method2280(2, 1);
            this.field7937.method2287((byte) -119, 0, class692.field9702);
            this.field7937.method2304(class692.field9702, 0, -126);
        } else {
            this.field7937.method2271(arg2, 5180);
            this.field7937.method2280(2, arg0);
        }
        if (arg1) {
            this.field1036 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 265)
    public final void method795(int arg0) {
        if (arg0 != 15759) {
            this.method783(-74);
        }
        if (this.field1032 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1036.field131;
        int var3 = this.field7937.method315();
        int var4 = this.field7937.method322();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2818(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2818(11, 1.0F / (float) this.field7937.method2281(false), (float) this.field7937.method2246(arg0 - 15759) / 255.0F, this.field7937.field5391, 1.0F / (this.field7937.field5391 - this.field7937.field5380));
        this.field7937.method2290(arg0 ^ 0x15F8, this.field7937.method2268(-257));
    }
}

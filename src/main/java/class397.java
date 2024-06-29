import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class397 extends class555 {

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lhb;")
    private class343 field5274;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Lln;")
    private class96 field5275;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5277;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "[F")
    private static float[] field5276 = new float[16];

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 == -20112) {
            return this.field5277 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (arg0 >= -94) {
            this.method129(51);
        }
        if (this.field5277 != null) {
            IDirect3DDevice var2 = this.field5274.field4612;
            class149 var3 = this.field5274.method3617((byte) -36);
            var2.method2451(0, var3.method858(-125, field5276));
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        this.field5274.field4612.SetVertexShader(null);
        this.field7580.method3624(class630.field8719, -115, 0);
        this.field7580.method3624(class502.field6912, -123, 1);
        this.field7580.method3624(class137.field1869, -121, 2);
        if (arg0 >= 45) {
            this.field7580.method3620((byte) 100, true);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field5274.field4612;
        if (this.field5275.field1153) {
            float var5 = (float) (this.field7580.field9245 % 4000) / 4000.0F;
            this.field7580.method3613((byte) 96, this.field5275.field1155);
            var4.method2462(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field7580.field9245 % 4000 * 16 / 4000;
            this.field7580.method3613((byte) 106, this.field5275.field1160[var6]);
            var4.method2462(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 < 81) {
            this.field5277 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg1 >= -93) {
            this.method121((byte) 121);
        }
    }

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (this.field5277 != null) {
            IDirect3DDevice var2 = this.field5274.field4612;
            class149 var3 = this.field7580.method3669(-15506);
            var3.method860(field5276, (byte) 102);
            field5276[5] *= 0.25F;
            field5276[6] *= 0.25F;
            field5276[4] *= 0.25F;
            field5276[0] *= 0.25F;
            field5276[3] *= 0.25F;
            field5276[2] *= 0.25F;
            field5276[1] *= 0.25F;
            field5276[7] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field5276, 2);
        }
        if (arg0 < 33) {
            field5276 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        this.field7580.method3672((byte) -111, class297.field3927, class305.field4076);
        if (arg1 != -13443) {
            this.method120((byte) 43);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        this.field5274.field4612.SetVertexShader(this.field5277);
        this.field7580.method3624(class630.field8719, -119, 0);
        this.field7580.method3624(class137.field1869, -110, 1);
        this.field7580.method2011(2, class502.field6912, 12080, arg0, false);
        this.field7580.method3620((byte) 103, false);
        this.method122(12844);
        this.method129(109);
        this.method118(false);
        this.method120((byte) -120);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        if (this.field5277 != null) {
            IDirect3DDevice var2 = this.field5274.field4612;
            var2.method2451(4, this.field7580.method3652((byte) -58, field5276));
        }
        if (arg0) {
            this.method119(-87);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public final void method120(byte arg0) {
        if (this.field5277 != null) {
            IDirect3DDevice var2 = this.field5274.field4612;
            if (this.field7580.field9260 > 0) {
                float var3 = this.field7580.field9195;
                float var4 = this.field7580.field9251;
                float var5 = var4 - 512.0F;
                var2.method2462(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2462(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field7580.method3678(-127, this.field7580.field9269);
        }
        if (arg0 > -118) {
            this.method121((byte) -98);
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lhb;Lga;Lln;)V")
    public class397(class343 arg0, class332 arg1, class96 arg2) {
        super(arg0);
        this.field5274 = arg0;
        this.field5275 = arg2;
        if (arg1 != null && this.field5275.method544((byte) -121) && (this.field5274.field4609.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5277 = this.field5274.field4612.method2460(arg1.method1947(5, "transparent_water", "dx"));
        } else {
            this.field5277 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (arg0 != 12844) {
            this.method122(-6);
        }
        if (this.field5277 != null) {
            IDirect3DDevice var2 = this.field5274.field4612;
            class149 var3 = this.field5274.method3617((byte) -36);
            var2.method2451(0, var3.method858(-100, field5276));
        }
    }
}

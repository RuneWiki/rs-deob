import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class405 extends class384 {

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Z")
    private boolean field5549 = false;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lhl;")
    private class527 field5539;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5543;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5544;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5548;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5550;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "Z")
    private boolean field5542;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "Loq;")
    private class358 field5541;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "[F")
    private static float[] field5540 = new float[16];

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "[F")
    private static float[] field5545 = new float[4];

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5546;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "Z")
    private boolean field5547;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
    public final void method528(byte arg0) {
        if (arg0 != 37) {
            this.field5543 = null;
        }
        if (this.field5546 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5539.field7501;
        int var3 = this.field5349.method435();
        int var4 = this.field5349.method320();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2900(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2900(11, 1.0F / (float) this.field5349.method2223(false), (float) this.field5349.method2293((byte) -113) / 255.0F, this.field5349.field5089, 1.0F / (this.field5349.field5089 - this.field5349.field5153));
        this.field5349.method2257(this.field5349.method2322(arg0 - 37), -552);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)V")
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method2387((byte) -6);
        }
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
    public final void method524(int arg0) {
        if (this.field5546 != null) {
            IDirect3DDevice var2 = this.field5539.field7501;
            var2.method2899(4, this.field5349.method2262(true, field5540));
        }
        if (arg0 != 2976) {
            this.method26(-123);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.field5349.method2217(1, 75);
        this.field5349.method2207((byte) -61, null);
        this.field5349.method2242(-111, class372.field4752, class372.field4752);
        this.field5349.method2264(0, class424.field6157, (byte) 60);
        this.field5349.method2264(2, class58.field582, (byte) 60);
        if (arg0 >= -18) {
            return;
        }
        this.field5349.method2268(0, 121, class424.field6157);
        this.field5349.method2217(0, 30);
        if (this.field5549) {
            this.field5349.method2264(0, class424.field6157, (byte) 60);
            this.field5349.method2268(0, 60, class424.field6157);
            this.field5549 = false;
        }
        if (this.field5546 != null) {
            this.field5539.method3083(null, 30941);
            this.field5546 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
    public final void method526(byte arg0) {
        if (arg0 >= -45) {
            this.field5546 = null;
        }
        if (this.field5546 != null) {
            IDirect3DDevice var2 = this.field5539.field7501;
            class427 var3 = this.field5349.method2258(123);
            var2.SetVertexShaderConstantF(8, var3.method2662(field5540, (byte) -117), 2);
        }
    }

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "(B)V")
    public final void method527(byte arg0) {
        if (this.field5546 != null) {
            IDirect3DDevice var2 = this.field5539.field7501;
            class427 var3 = this.field5539.method2203((byte) -118);
            var2.method2899(0, var3.method2657((byte) -64, field5540));
        }
        if (arg0 != 46) {
            this.method31((byte) -45);
        }
    }

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "(B)V")
    private final void method2494(byte arg0) {
        if (this.field5546 != null && this.field5547) {
            class427 var2 = this.field5349.method2236((byte) 124);
            IDirect3DDevice var3 = this.field5539.field7501;
            var3.method2900(13, this.field5349.field5116 * this.field5349.field5078, this.field5349.field5116 * this.field5349.field5067, this.field5349.field5116 * this.field5349.field5079, 1.0F);
            var3.method2900(14, this.field5349.field5093 * this.field5349.field5078, this.field5349.field5093 * this.field5349.field5067, this.field5349.field5093 * this.field5349.field5079, 1.0F);
            var3.method2900(16, this.field5349.field5094 * this.field5349.field5078, this.field5349.field5094 * this.field5349.field5067, this.field5349.field5094 * this.field5349.field5079, 1.0F);
            var2.method2653(this.field5349.field5076[1], (byte) -105, field5545, this.field5349.field5076[2], this.field5349.field5076[0]);
            var3.SetVertexShaderConstantF(15, field5545, 1);
            var2.method2653(this.field5349.field5108[1], (byte) -105, field5545, this.field5349.field5108[2], this.field5349.field5108[0]);
            var3.SetVertexShaderConstantF(17, field5545, 1);
        }
        int var4 = 55 % ((-arg0 - 6) / 38);
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public final void method525(int arg0) {
        if (this.field5546 != null) {
            IDirect3DDevice var2 = this.field5539.field7501;
            class427 var3 = this.field5539.method2203((byte) -118);
            var2.method2899(0, var3.method2657((byte) -64, field5540));
        }
        if (arg0 != -7112) {
            this.field5544 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZB)V")
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 <= 78) {
            this.method30(true, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lke;BI)V")
    public final void method27(class596 arg0, byte arg1, int arg2) {
        if (arg1 != 123) {
            return;
        }
        if (arg0 != null) {
            if (this.field5549) {
                this.field5349.method2264(0, class424.field6157, (byte) 60);
                this.field5349.method2268(0, 117, class424.field6157);
                this.field5549 = false;
            }
            this.field5349.method2207((byte) -61, arg0);
            this.field5349.method2255(arg2, 15818);
        } else if (!this.field5549) {
            this.field5349.method2207((byte) -61, this.field5349.field5149);
            this.field5349.method2255(1, 15818);
            this.field5349.method2264(0, class324.field4136, (byte) 60);
            this.field5349.method2268(0, 79, class324.field4136);
            this.field5549 = true;
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
    public final void method2387(byte arg0) {
        IDirect3DDevice var2 = this.field5539.field7501;
        if (arg0 < 75) {
            this.method26(1);
        }
        int var3 = this.field5349.method2243(false);
        class427 var4 = this.field5349.method2222(-8);
        IDirect3DVertexShader var5;
        if (this.field5547) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field5544 : this.field5550;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field5543 : this.field5548;
        }
        if (this.field5546 != var5) {
            this.field5546 = var5;
            this.field5539.method3083(var5, 30941);
            this.method2494((byte) 94);
            this.method524(2976);
            this.method526((byte) -88);
            this.method525(-7112);
            this.method527((byte) 46);
            this.method528((byte) 37);
        }
        var4.method2670(-1.0F, 0.0F, 0.0F, (float) var3, true, field5545);
        var2.method2899(12, field5545);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
    public final void method24(boolean arg0, int arg1) {
        this.field5547 = arg0;
        if (arg1 != -1) {
            this.method524(26);
        }
        this.field5349.method2217(1, 59);
        this.field5349.method2207((byte) -61, this.field5541);
        this.field5349.method2242(-125, class94.field989, class1.field4);
        this.field5349.method2264(0, class58.field582, (byte) 60);
        this.field5349.method2318((byte) 70, false, true, 2, class424.field6157);
        this.field5349.method2268(0, 43, class324.field4136);
        this.field5349.method2217(0, 65);
        this.method2387((byte) 104);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lhl;Loh;)V")
    public class405(class527 arg0, class404 arg1) {
        super(arg0);
        this.field5539 = arg0;
        if (arg1 == null || (this.field5539.field7516.VertexShaderVersion & 0xFFFF) < 257) {
            this.field5542 = false;
        } else {
            this.field5543 = this.field5539.field7501.method2909(arg1.method2471((byte) -61, "dx", "uw_ground_unlit"));
            this.field5544 = this.field5539.field7501.method2909(arg1.method2471((byte) -72, "dx", "uw_ground_lit"));
            this.field5548 = this.field5539.field7501.method2909(arg1.method2471((byte) -103, "dx", "uw_model_unlit"));
            this.field5550 = this.field5539.field7501.method2909(arg1.method2471((byte) -43, "dx", "uw_model_lit"));
            if ((this.field5548 != null & this.field5543 != null & this.field5544 != null & this.field5550 != null)) {
                this.field5541 = this.field5349.method2266(new int[] { 0, -1 }, 106, 1, 2, false);
                this.field5541.method604(false, false, (byte) -43);
                this.field5542 = true;
            } else {
                this.field5542 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)Z")
    public final boolean method26(int arg0) {
        if (arg0 != 13326) {
            this.method2494((byte) -81);
        }
        return this.field5542;
    }
}

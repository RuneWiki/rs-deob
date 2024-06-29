import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class102 extends class681 {

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lega;")
    private class662 field1425;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1430;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1431;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1433;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1434;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lcm;")
    private class679 field1424;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "Z")
    private boolean field1426;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "[F")
    private static float[] field1427 = new float[16];

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "[F")
    private static float[] field1428 = new float[4];

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1432;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "Z")
    private boolean field1429;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method739(boolean arg0, int arg1) {
        if (arg1 != 7) {
            field1428 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V", line = 13)
    public final void method740(int arg0) {
        this.field9721.method2201((byte) 119, 1);
        this.field9721.method2241(null, (byte) 44);
        this.field9721.method2199(class334.field4505, 9797, class334.field4505);
        this.field9721.method2264(9, class262.field3553, 0);
        this.field9721.method2264(9, class452.field6221, 2);
        this.field9721.method2223(0, class262.field3553, (byte) -28);
        this.field9721.method2201((byte) 119, 0);
        if (arg0 != -3) {
            this.method742(60, -73, (byte) -49);
        }
        this.field9721.method2264(9, class262.field3553, 0);
        this.field9721.method2223(0, class262.field3553, (byte) -100);
        if (this.field1432 != null) {
            this.field1425.field9273.SetVertexShader(null);
            this.field1432 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lega;Lsea;)V", line = 36)
    public class102(class662 arg0, class648 arg1) {
        super(arg0);
        this.field1425 = arg0;
        if (arg1 == null || (this.field1425.field9284.VertexShaderVersion & 0xFFFF) < 257) {
            this.field1426 = false;
        } else {
            this.field1430 = this.field1425.field9273.method2540(arg1.method3642(92, "uw_ground_unlit", "dx"));
            this.field1431 = this.field1425.field9273.method2540(arg1.method3642(92, "uw_ground_lit", "dx"));
            this.field1433 = this.field1425.field9273.method2540(arg1.method3642(127, "uw_model_unlit", "dx"));
            this.field1434 = this.field1425.field9273.method2540(arg1.method3642(93, "uw_model_lit", "dx"));
            if (this.field1433 != null & this.field1431 != null & this.field1430 != null & this.field1434 != null) {
                this.field1424 = this.field9721.method2206(false, new int[] { 0, -1 }, 1, 2, -12482);
                this.field1424.method2137(false, 70, false);
                this.field1426 = true;
            } else {
                this.field1426 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(ZI)V", line = 65)
    public final void method741(boolean arg0, int arg1) {
        this.field1429 = arg0;
        this.field9721.method2201((byte) 123, 1);
        this.field9721.method2241(this.field1424, (byte) 44);
        this.field9721.method2199(class127.field1821, 9797, class276.field3814);
        this.field9721.method2264(9, class452.field6221, 0);
        this.field9721.method1052(false, 2, true, class262.field3553, 102);
        this.field9721.method2223(0, class78.field1179, (byte) -106);
        this.field9721.method2201((byte) 126, 0);
        this.method743(556);
        if (arg1 != 3) {
            this.method751(false);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIB)V", line = 86)
    public final void method742(int arg0, int arg1, byte arg2) {
        int var4 = -7 / ((arg2 + 38) / 35);
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V", line = 96)
    public final void method743(int arg0) {
        IDirect3DDevice var2 = this.field1425.field9273;
        int var3 = this.field9721.method2218((byte) 104);
        class274 var4 = this.field9721.method2214(-91);
        if (arg0 != 556) {
            this.method745((byte) 49);
        }
        IDirect3DVertexShader var5;
        if (this.field1429) {
            var5 = var3 == Integer.MAX_VALUE ? this.field1431 : this.field1434;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field1430 : this.field1433;
        }
        if (this.field1432 != var5) {
            this.field1432 = var5;
            var2.SetVertexShader(var5);
            this.method746(-3);
            this.method749(78);
            this.method745((byte) 112);
            this.method750((byte) -8);
            this.method747(3914);
            this.method748(20060);
        }
        var4.method1699((byte) 115, field1428, -1.0F, 0.0F, (float) var3, 0.0F);
        var2.method2542(12, field1428);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILrga;I)V", line = 134)
    public final void method744(int arg0, class218 arg1, int arg2) {
        if (arg1 == null) {
            this.field9721.method2241(this.field9721.field5305, (byte) 44);
            this.field9721.method2246(1, 26770);
            this.field9721.method2264(9, class78.field1179, 0);
            this.field9721.method2223(0, class78.field1179, (byte) -95);
        } else {
            this.field9721.method2241(arg1, (byte) 44);
            this.field9721.method2246(arg0, 26770);
        }
        if (arg2 != -3) {
            this.field1429 = false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 156)
    public final void method745(byte arg0) {
        if (arg0 >= 103 && this.field1432 != null) {
            IDirect3DDevice var2 = this.field1425.field9273;
            class274 var3 = this.field9721.method2217(1);
            var2.SetVertexShaderConstantF(8, var3.method1696(true, field1427), 2);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V", line = 174)
    private final void method746(int arg0) {
        if (arg0 != -3 || this.field1432 == null || !this.field1429) {
            return;
        }
        class274 var2 = this.field9721.method2261(1024);
        IDirect3DDevice var3 = this.field1425.field9273;
        var3.method2543(13, this.field9721.field5332 * this.field9721.field5320, this.field9721.field5358 * this.field9721.field5320, this.field9721.field5324 * this.field9721.field5320, 1.0F);
        var3.method2543(14, this.field9721.field5353 * this.field9721.field5332, this.field9721.field5358 * this.field9721.field5353, this.field9721.field5353 * this.field9721.field5324, 1.0F);
        var3.method2543(16, this.field9721.field5385 * this.field9721.field5332, this.field9721.field5385 * this.field9721.field5358, this.field9721.field5385 * this.field9721.field5324, 1.0F);
        var2.method1702((byte) 110, this.field9721.field5349[1], field1428, this.field9721.field5349[2], this.field9721.field5349[0]);
        var3.SetVertexShaderConstantF(15, field1428, 1);
        var2.method1702((byte) 117, this.field9721.field5369[1], field1428, this.field9721.field5369[2], this.field9721.field5369[0]);
        var3.SetVertexShaderConstantF(17, field1428, 1);
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)V", line = 200)
    public final void method747(int arg0) {
        if (this.field1432 != null) {
            IDirect3DDevice var2 = this.field1425.field9273;
            class274 var3 = this.field1425.method2273(4);
            var2.method2542(0, var3.method1697(field1427, arg0 - 3997));
        }
        if (arg0 != 3914) {
            this.field1429 = false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 225)
    public final void method748(int arg0) {
        if (arg0 != 20060) {
            this.method749(-99);
        }
        if (this.field1432 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1425.field9273;
        int var3 = this.field9721.method142();
        int var4 = this.field9721.method133();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2543(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2543(11, 1.0F / (float) this.field9721.method2225(false), (float) this.field9721.method2237(arg0 - 19936) / 255.0F, this.field9721.field5336, 1.0F / (this.field9721.field5336 - this.field9721.field5377));
        this.field9721.method2233(false, this.field9721.method2239(1441));
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V", line = 254)
    public final void method749(int arg0) {
        if (this.field1432 != null) {
            IDirect3DDevice var2 = this.field1425.field9273;
            var2.method2542(4, this.field9721.method2240(field1427, 8));
        }
        if (arg0 < 77) {
            this.field1432 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 270)
    public final void method750(byte arg0) {
        if (arg0 == -8 && this.field1432 != null) {
            IDirect3DDevice var2 = this.field1425.field9273;
            class274 var3 = this.field1425.method2273(arg0 + 12);
            var2.method2542(0, var3.method1697(field1427, -102));
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z", line = 288)
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            field1428 = null;
        }
        return this.field1426;
    }
}

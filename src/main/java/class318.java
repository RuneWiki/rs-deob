import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class318 extends class384 {

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "Leb;")
    private class9 field4084;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "Lcu;")
    private class287 field4083;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4085;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "[F")
    private static float[] field4086 = new float[16];

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V", line = 4)
    public final void method1865(int arg0) {
        if (this.field4085 != null) {
            IDirect3DDevice var2 = this.field4083.field3643;
            class462 var3 = this.field4083.method3756((byte) 98);
            var2.method4014(0, var3.method2717(field4086, false));
        }
        if (arg0 != -23163) {
            field4086 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V", line = 22)
    public final void method1019(byte arg0) {
        this.field4083.method1714((byte) 87, null);
        if (arg0 != -60) {
            this.method1025(-41, (byte) -118, -93);
        }
        this.field5337.method3777(false, 0, class632.field8774);
        this.field5337.method3777(false, 1, class222.field2913);
        this.field5337.method3777(false, 2, class663.field9083);
        this.field5337.method3775(true, 0);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V", line = 36)
    public final void method1866(boolean arg0) {
        if (this.field4085 != null) {
            IDirect3DDevice var2 = this.field4083.field3643;
            class462 var3 = this.field4083.method3756((byte) 99);
            var2.method4014(0, var3.method2717(field4086, false));
        }
        if (!arg0) {
            this.field4085 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V", line = 56)
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (arg1 != 102) {
            this.field4085 = null;
        }
        IDirect3DDevice var4 = this.field4083.field3643;
        if (this.field4084.field99) {
            float var6 = (float) (this.field5337.field9610 % 4000) / 4000.0F;
            this.field5337.method3711(false, this.field4084.field100);
            var4.method4012(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field5337.field9610 % 4000 * 16 / 4000;
            this.field5337.method3711(false, this.field4084.field97[var5]);
            var4.method4012(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lbia;BI)V", line = 81)
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            this.method1025(111, (byte) 25, 107);
        }
    }

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "(B)V", line = 92)
    public final void method1023(byte arg0) {
        if (this.field4085 != null) {
            IDirect3DDevice var2 = this.field4083.field3643;
            class462 var3 = this.field5337.method3743(-32721);
            var3.method2732(field4086, (byte) 74);
            field4086[4] *= 0.25F;
            field4086[7] *= 0.25F;
            field4086[1] *= 0.25F;
            field4086[6] *= 0.25F;
            field4086[2] *= 0.25F;
            field4086[0] *= 0.25F;
            field4086[5] *= 0.25F;
            field4086[3] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field4086, 2);
        }
        if (arg0 != -52) {
            this.field4083 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V", line = 121)
    public final void method1867(int arg0) {
        if (this.field4085 != null) {
            IDirect3DDevice var2 = this.field4083.field3643;
            if (this.field5337.field9586 <= 0) {
                var2.method4012(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field5337.field9577;
                float var4 = this.field5337.field9637;
                float var5 = var4 - 512.0F;
                var2.method4012(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field5337.method3717(this.field5337.field9573, (byte) -119);
        }
        int var6 = 27 % ((arg0 + 45) / 32);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lcu;Lkha;Leb;)V", line = 148)
    public class318(class287 arg0, class687 arg1, class9 arg2) {
        super(arg0);
        this.field4084 = arg2;
        this.field4083 = arg0;
        if (arg1 != null && this.field4084.method42((byte) 118) && (this.field4083.field3641.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4085 = this.field4083.field3643.method4013(arg1.method3813("dx", "transparent_water", -79));
        } else {
            this.field4085 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(B)Z", line = 165)
    public final boolean method1021(byte arg0) {
        if (arg0 < 78) {
            return true;
        } else {
            return this.field4085 != null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)V", line = 176)
    public final void method1018(int arg0, boolean arg1) {
        this.field5337.method3708(arg0 ^ 0x62, class235.field3034, class353.field4729);
        if (arg0 != 4) {
            this.method1020(true, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZB)V", line = 186)
    public final void method1020(boolean arg0, byte arg1) {
        this.field5337.method3777(false, 0, class632.field8774);
        this.field5337.method3777(false, 1, class663.field9083);
        this.field5337.method1395(true, 2, false, -37, class222.field2913);
        this.field5337.method3775(false, 0);
        if (arg1 < 23) {
            this.field4084 = null;
        }
        this.field4083.method1714((byte) 87, this.field4085);
        this.method1866(true);
        this.method1023((byte) -52);
        this.method1868((byte) 109);
        this.method1867(-104);
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V", line = 205)
    public final void method1868(byte arg0) {
        if (this.field4085 != null) {
            IDirect3DDevice var2 = this.field4083.field3643;
            var2.method4014(4, this.field5337.method3747(field4086, true));
        }
        if (arg0 < 91) {
            this.field4085 = null;
        }
    }
}

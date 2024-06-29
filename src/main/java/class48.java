import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 extends class584 {

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lie;")
    private class6 field521;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lgb;")
    private class197 field522;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field523;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "[F")
    private static float[] field524 = new float[16];

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public final void method182(byte arg0) {
        int var2 = 44 % ((66 - arg0) / 54);
        if (this.field523 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field522.field2376;
        class667 var4 = this.field8309.method2691(-96);
        var4.method3743(field524, false);
        field524[2] *= 0.25F;
        field524[4] *= 0.25F;
        field524[0] *= 0.25F;
        field524[7] *= 0.25F;
        field524[5] *= 0.25F;
        field524[6] *= 0.25F;
        field524[3] *= 0.25F;
        field524[1] *= 0.25F;
        var3.SetVertexShaderConstantF(8, field524, 2);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZI)V")
    public final void method180(boolean arg0, int arg1) {
        this.field522.field2376.SetVertexShader(this.field523);
        this.field8309.method2757(class67.field708, (byte) -73, 0);
        this.field8309.method2757(class521.field7461, (byte) -73, 1);
        this.field8309.method1168(true, false, class561.field7981, 2, 113);
        this.field8309.method2710((byte) -115, false);
        this.method181(117);
        this.method182((byte) 121);
        this.method176(arg1 + 20198);
        this.method179((byte) 31);
        if (arg1 != -1) {
            this.method178((byte) 72);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (this.field523 != null) {
            IDirect3DDevice var2 = this.field522.field2376;
            class667 var3 = this.field522.method2737(0);
            var2.method2436(0, var3.method3745(field524, false));
        }
        if (arg0 < 59) {
            this.method182((byte) -78);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        if (arg0 > -6) {
            this.method176(-27);
        }
        return this.field523 != null;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lgb;Ljo;Lie;)V")
    public class48(class197 arg0, class303 arg1, class6 arg2) {
        super(arg0);
        this.field521 = arg2;
        this.field522 = arg0;
        if (this.field521.method28(false) && (this.field522.field2379.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field523 = this.field522.field2376.method2444(arg1.method1734("transparent_water", 11434, "dx"));
        } else {
            this.field523 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
    public final void method173(int arg0) {
        if (this.field523 != null) {
            IDirect3DDevice var2 = this.field522.field2376;
            class667 var3 = this.field522.method2737(0);
            var2.method2436(0, var3.method3745(field524, false));
        }
        if (arg0 != -1) {
            field524 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZ)V")
    public final void method177(boolean arg0, boolean arg1) {
        this.field8309.method2759(class250.field3212, (byte) -5, class471.field6575);
        if (!arg1) {
            field524 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            this.method177(false, true);
        }
        IDirect3DDevice var4 = this.field522.field2376;
        if (this.field521.field50) {
            float var6 = (float) (this.field8309.field6884 % 4000) / 4000.0F;
            this.field8309.method2696(-2, this.field521.field49);
            var4.method2439(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field8309.field6884 % 4000 * 16 / 4000;
            this.field8309.method2696(-2, this.field521.field53[var5]);
            var4.method2439(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    public final void method174(int arg0) {
        this.field522.field2376.SetVertexShader(null);
        this.field8309.method2757(class67.field708, (byte) -73, 0);
        this.field8309.method2757(class561.field7981, (byte) -73, 1);
        int var2 = -110 / ((86 - arg0) / 40);
        this.field8309.method2757(class521.field7461, (byte) -73, 2);
        this.field8309.method2710((byte) -26, true);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILld;B)V")
    public final void method185(int arg0, class155 arg1, byte arg2) {
        if (arg2 < 17) {
            this.method177(true, false);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public final void method176(int arg0) {
        if (this.field523 != null) {
            IDirect3DDevice var2 = this.field522.field2376;
            var2.method2436(4, this.field8309.method2713(field524, 19876));
        }
        if (arg0 != 20197) {
            this.field521 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public final void method179(byte arg0) {
        if (arg0 <= 26) {
            this.field522 = null;
        }
        if (this.field523 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field522.field2376;
        if (this.field8309.field6802 <= 0) {
            var2.method2439(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field8309.field6821;
            float var4 = this.field8309.field6875;
            float var5 = var4 - 512.0F;
            var2.method2439(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field8309.method2719(this.field8309.field6814, (byte) -112);
    }
}

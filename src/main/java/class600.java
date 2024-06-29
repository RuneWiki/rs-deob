import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class600 extends class165 {

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Lfa;")
    private class565 field8608;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lrj;")
    private class359 field8607;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILpaa;)V")
    public static final void method3534(int arg0, class712 arg1) {
        ++field8606;
        if (class757.field10507 == arg1.field9930) {
            if (class473.field6483.field9272 == null) {
                arg1.field9963 = 0;
                arg1.field9937 = 0;
            } else {
                arg1.field10050 = 150;
                arg1.field10102 = (int) (256.0D * Math.sin((double) class245.field3409 / 40.0D)) & 2047;
                arg1.field10038 = 5;
                arg1.field9937 = class471.field6467;
                arg1.field9963 = class617.method3621(class473.field6483.field9272, (byte) 82);
                arg1.field9943 = class473.field6483.field8309;
                arg1.field9947 = class473.field6483.field8399;
                arg1.field10040 = class473.field6483.field8390;
                arg1.field9970 = 0;
                class103 var2 = arg1.field9943 == -1 ? null : class274.field3684.method1881((byte) -80, arg1.field9943);
                if (var2 != null) {
                    class670.method3837(false, arg1.field9947, var2);
                }
            }
        } else if (arg0 == 2047) {
            ;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
    public final void method678(boolean arg0, int arg1) {
        ++field8605;
        if (arg1 != 0) {
            this.method679((byte) 8);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)V")
    public final void method675(int arg0, byte arg1, int arg2) {
        ++field8601;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((27 & arg0) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg0) != -1;
        super.field2260.method2196(1, (byte) 89);
        if (!var7) {
            class486.field6559[0] = 0.0F;
            class486.field6559[1] = 0.0F;
            class486.field6559[3] = 0.0F;
            class486.field6559[2] = var6;
        } else {
            class486.field6559[3] = 0.0F;
            class486.field6559[1] = 0.0F;
            class486.field6559[0] = var6;
            class486.field6559[2] = 0.0F;
        }
        if (arg1 <= 3) {
            this.method673(104, true);
        }
        OpenGL.glTexGenfv(8192, 9474, class486.field6559, 0);
        class486.field6559[1] = var6;
        class486.field6559[0] = 0.0F;
        class486.field6559[3] = (float) super.field2260.field4947 * var4 % 1.0F;
        class486.field6559[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class486.field6559, 0);
        if (!this.field8608.field8037) {
            int var8 = (int) ((float) super.field2260.field4947 * var5 * 16.0F);
            super.field2260.method2154(this.field8608.field8035[var8 % 16], -2);
        } else {
            class486.field6559[1] = 0.0F;
            class486.field6559[0] = 0.0F;
            class486.field6559[2] = 0.0F;
            class486.field6559[3] = (float) super.field2260.field4947 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class486.field6559, 0);
        }
        super.field2260.method2196(0, (byte) 89);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
    public final void method673(int arg0, boolean arg1) {
        this.field8607.method2021(-119, '\u0000');
        ++field8604;
        if (this.field8608.field8037) {
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154(this.field8608.field8038, -2);
            super.field2260.method2196(0, (byte) 89);
        }
        if (arg0 > -115) {
            this.field8607 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLhl;)V")
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        super.field2260.method2154(arg2, -2);
        ++field8603;
        super.field2260.method2208(arg0, 6406);
        if (!arg1) {
            this.method675(29, (byte) -1, -18);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lep;Lfa;)V")
    public class600(class371 arg0, class565 arg1) {
        super(arg0);
        this.field8608 = arg1;
        this.field8607 = new class359(arg0, 2);
        this.field8607.method2024(0, 116);
        super.field2260.method2196(1, (byte) 89);
        if (this.field8608.field8037) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2260.method2196(0, (byte) 89);
        this.field8607.method2022(0);
        this.field8607.method2024(1, 69);
        super.field2260.method2196(1, (byte) 89);
        if (this.field8608.field8037) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2260.method2196(0, (byte) 89);
        this.field8607.method2022(0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z")
    public final boolean method672(byte arg0) {
        ++field8609;
        if (arg0 <= 11) {
            this.method673(-89, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public final void method679(byte arg0) {
        if (arg0 >= -97) {
            method3534(124, (class712) null);
        }
        this.field8607.method2021(-98, '\u0001');
        ++field8602;
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2154((class396) null, -2);
        super.field2260.method2196(0, (byte) 89);
    }
}

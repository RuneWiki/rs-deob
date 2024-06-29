import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class384 extends class263 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lmt;")
    private class261 field5583;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lkq;")
    private class403 field5587;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field5590 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public static final void method2299(int arg0, byte arg1) {
        ++field5584;
        if (class75.field1353 != arg0) {
            class150.field2422 = class21.field272 = class325.field4882[arg0];
            class483.method2915(128);
            class368.field5403 = new int[class150.field2422][class21.field272];
            class218.field3348 = new int[class150.field2422][class21.field272];
            class420.field6038 = new int[4][class150.field2422 >> 3][class21.field272 >> 3];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class91.field1641[var2] = class336.method2082((byte) 73, class150.field2422, class21.field272);
            }
            class64.field1061 = new byte[4][class150.field2422][class21.field272];
            class61.method425(class150.field2422, class21.field272, 4, -99);
            class382.method2292(true, class150.field2422 >> 3, class21.field272 >> 3, class345.field5116);
            if (arg1 <= 50) {
                method2299(-123, (byte) -100);
            }
            class75.field1353 = arg0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lbl;Lmt;)V")
    public class384(class442 arg0, class261 arg1) {
        super(arg0);
        this.field5583 = arg1;
        this.field5587 = new class403(arg0, 2);
        this.field5587.method2390(0, -32245);
        super.field3984.method2582((byte) -86, 1);
        if (this.field5583.field3952) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3984.method2582((byte) 125, 0);
        this.field5587.method2391(-100);
        this.field5587.method2390(1, -32245);
        super.field3984.method2582((byte) 119, 1);
        if (this.field5583.field3952) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3984.method2582((byte) 117, 0);
        this.field5587.method2391(-109);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        ++field5586;
        if (arg0 > -112) {
            this.method670((byte) -108);
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        ++field5585;
        this.field5587.method2392((byte) 0, '\u0001');
        super.field3984.method2582((byte) -109, 1);
        if (arg0 != -94) {
            this.method671((class194) null, 0, true);
        }
        super.field3984.method2586((class194) null, false);
        super.field3984.method2582((byte) 116, 0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field5588;
        if (arg2 == 6908) {
            float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
            float var5 = (float) ((arg0 >> 3 & 3) + 1) * 5.0E-4F;
            float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
            super.field3984.method2582((byte) 32, 1);
            boolean var7 = ~(128 & arg0) != -1;
            if (var7) {
                class295.field4469[0] = var6;
                class295.field4469[2] = 0.0F;
                class295.field4469[1] = 0.0F;
                class295.field4469[3] = 0.0F;
            } else {
                class295.field4469[2] = var6;
                class295.field4469[0] = 0.0F;
                class295.field4469[3] = 0.0F;
                class295.field4469[1] = 0.0F;
            }
            OpenGL.glTexGenfv(8192, 9474, class295.field4469, 0);
            class295.field4469[1] = var6;
            class295.field4469[3] = (float) super.field3984.field6691 * var4 % 1.0F;
            class295.field4469[0] = 0.0F;
            class295.field4469[2] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class295.field4469, 0);
            if (!this.field5583.field3952) {
                int var8 = (int) ((float) super.field3984.field6691 * var5 * 16.0F);
                super.field3984.method2586(this.field5583.field3959[var8 % 16], false);
            } else {
                class295.field4469[3] = (float) super.field3984.field6691 * var5 % 1.0F;
                class295.field4469[2] = 0.0F;
                class295.field4469[1] = 0.0F;
                class295.field4469[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class295.field4469, 0);
            }
            super.field3984.method2582((byte) 119, 0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        int var3 = -81 % ((24 - arg1) / 34);
        ++field5589;
        this.field5587.method2392((byte) 0, '\u0000');
        if (this.field5583.field3952) {
            super.field3984.method2582((byte) -128, 1);
            super.field3984.method2586(this.field5583.field3958, false);
            super.field3984.method2582((byte) -128, 0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field5591;
        super.field3984.method2586(arg0, false);
        super.field3984.method2610(0, arg1);
        if (!arg2) {
            this.method671((class194) null, -21, true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        if (arg0 == -2560) {
            ++field5592;
        }
    }
}

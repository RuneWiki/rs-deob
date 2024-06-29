import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class118 extends class233 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lrj;")
    private class12 field1583;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lfd;")
    private class195 field1582;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[F")
    private static float[] field1584 = new float[4];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ldg;)V", line = 4)
    public final void method825(class223 arg0) {
        this.field3283.method2186(arg0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 9)
    public final void method826() {
        this.field1582.method1225('\u0001');
        this.field3283.method2037(1);
        this.field3283.method2186((class223) null);
        this.field3283.method2037(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 15)
    public final void method827(boolean arg0) {
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 19)
    public final void method828(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field3283.field4741;
        this.field3283.method2037(1);
        if (var5) {
            field1584[0] = var4;
            field1584[1] = 0.0F;
            field1584[2] = 0.0F;
            field1584[3] = 0.0F;
        } else {
            field1584[0] = 0.0F;
            field1584[1] = 0.0F;
            field1584[2] = var4;
            field1584[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field1584, 0);
        field1584[0] = 0.0F;
        field1584[1] = var4;
        field1584[2] = 0.0F;
        field1584[3] = (float) this.field3283.field4761 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field1584, 0);
        if (this.field1583.field144) {
            field1584[0] = 0.0F;
            field1584[1] = 0.0F;
            field1584[2] = 0.0F;
            field1584[3] = (float) this.field3283.field4761 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field1584, 0);
        } else {
            int var7 = (int) ((float) this.field3283.field4761 * var3 * 16.0F);
            this.field3283.method2186(this.field1583.field143[var7 % 16]);
        }
        this.field3283.method2037(0);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lih;Lrj;)V", line = 68)
    public class118(class330 arg0, class12 arg1) {
        super(arg0);
        this.field1583 = arg1;
        opengl var3 = arg0.field4741;
        this.field1582 = new class195(arg0, 2);
        this.field1582.method1223(0);
        this.field3283.method2037(1);
        if (this.field1583.field144) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field3283.method2037(0);
        this.field1582.method1224();
        this.field1582.method1223(1);
        this.field3283.method2037(1);
        if (this.field1583.field144) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field3283.method2037(0);
        this.field1582.method1224();
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V", line = 98)
    public final void method829(boolean arg0) {
        this.field1582.method1225('\u0000');
        if (this.field1583.field144) {
            this.field3283.method2037(1);
            this.field3283.method2186(this.field1583.field138);
            this.field3283.method2037(0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()Z", line = 112)
    public final boolean method830() {
        return true;
    }
}

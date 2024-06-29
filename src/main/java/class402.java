import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class402 extends class246 {

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Lrk;")
    private class339 field5753;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Llo;")
    private class365 field5755;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field5751 = -1;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Lde;")
    private static class10 field5747 = new class10(4, 1, 1, 1);

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field5756;

    static {
        new class157("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field5757 = -60;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ldk;ILza;Ldk;)V", line = 3)
    public static final void method2376(class421 arg0, int arg1, class295 arg2, class421 arg3) {
        ++field5750;
        class249.field3394 = class130.method938(class454.field6637, 0, arg3, (byte) 32);
        class347.field4988 = arg2.method529(class249.field3394, class396.method2347(arg0, class454.field6637, 0), true);
        class44.field638 = class130.method938(class521.field7644, 0, arg3, (byte) 32);
        class331.field4510 = arg2.method529(class44.field638, class396.method2347(arg0, class521.field7644, 0), true);
        class80.field1127 = class130.method938(class348.field4999, 0, arg3, (byte) 32);
        class108.field1751 = arg2.method529(class80.field1127, class396.method2347(arg0, class348.field4999, 0), true);
        if (arg1 < 68) {
            field5751 = -96;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 21)
    public final void method739(int arg0) {
        int var2 = 46 % ((-80 - arg0) / 32);
        this.field5755.method2183((byte) -41, '\u0001');
        ++field5749;
        super.field3361.method1990(false, 1);
        super.field3361.method1977((class128) null, true);
        super.field3361.method1990(false, 0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V", line = 34)
    public final void method743(boolean arg0, byte arg1) {
        ++field5754;
        if (arg1 <= 83) {
            field5757 = 33;
        }
        this.field5755.method2183((byte) -41, '\u0000');
        if (this.field5753.field4912) {
            super.field3361.method1990(false, 1);
            super.field3361.method1977(this.field5753.field4916, true);
            super.field3361.method1990(false, 0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfg;I)V", line = 53)
    public final void method742(int arg0, class128 arg1, int arg2) {
        if (arg0 == 4) {
            super.field3361.method1977(arg1, true);
            ++field5746;
            super.field3361.method1966(-1, arg2);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z", line = 66)
    public final boolean method738(byte arg0) {
        if (arg0 <= 99) {
            field5751 = -54;
        }
        ++field5748;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lpg;Lrk;)V", line = 78)
    public class402(class333 arg0, class339 arg1) {
        super(arg0);
        this.field5753 = arg1;
        this.field5755 = new class365(arg0, 2);
        this.field5755.method2185(-49, 0);
        super.field3361.method1990(false, 1);
        if (this.field5753.field4912) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3361.method1990(false, 0);
        this.field5755.method2186((byte) -104);
        this.field5755.method2185(-50, 1);
        super.field3361.method1990(false, 1);
        if (this.field5753.field4912) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3361.method1990(false, 0);
        this.field5755.method2186((byte) -106);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I", line = 112)
    public static final int method2377(byte arg0, int arg1) {
        ++field5752;
        if (arg0 != -33) {
            method2378(107);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V", line = 123)
    public final void method740(boolean arg0, int arg1) {
        ++field5745;
        if (arg1 != 26715) {
            this.method738((byte) 52);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 135)
    public static void method2378(int arg0) {
        if (arg0 == 3) {
            field5747 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)[Lde;", line = 145)
    public static final class10[] method2379(byte arg0) {
        if (arg0 != -20) {
            return null;
        } else {
            ++field5756;
            return new class10[] { class487.field7045, class320.field4401, class207.field2966, field5747, class246.field3360, class518.field7613, class343.field4965, class413.field5890, class7.field97, class201.field2921, class497.field7281, class325.field4439, class509.field7449, class13.field140 };
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BII)V", line = 156)
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field5744;
        if (arg0 == 53) {
            float var4 = (float) ((arg1 & 3) - -1) * -5.0E-4F;
            float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
            float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
            boolean var7 = ~(128 & arg1) != -1;
            super.field3361.method1990(false, 1);
            if (!var7) {
                class192.field2805[0] = 0.0F;
                class192.field2805[3] = 0.0F;
                class192.field2805[1] = 0.0F;
                class192.field2805[2] = var6;
            } else {
                class192.field2805[0] = var6;
                class192.field2805[1] = 0.0F;
                class192.field2805[2] = 0.0F;
                class192.field2805[3] = 0.0F;
            }
            OpenGL.glTexGenfv(8192, 9474, class192.field2805, 0);
            class192.field2805[2] = 0.0F;
            class192.field2805[0] = 0.0F;
            class192.field2805[3] = (float) super.field3361.field4724 * var4 % 1.0F;
            class192.field2805[1] = var6;
            OpenGL.glTexGenfv(8193, 9474, class192.field2805, 0);
            if (!this.field5753.field4912) {
                int var8 = (int) ((float) super.field3361.field4724 * var5 * 16.0F);
                super.field3361.method1977(this.field5753.field4914[var8 % 16], true);
            } else {
                class192.field2805[1] = 0.0F;
                class192.field2805[2] = 0.0F;
                class192.field2805[3] = (float) super.field3361.field4724 * var5 % 1.0F;
                class192.field2805[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class192.field2805, 0);
            }
            super.field3361.method1990(false, 0);
        }
    }
}

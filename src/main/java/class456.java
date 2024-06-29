import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class456 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lfu;")
    private class363 field5691 = new class363();

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Lah;")
    public static class357 field5697 = new class357(0, -1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Lfu;")
    private class363 field5699;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 4)
    public final void method2501(int arg0) {
        while (true) {
            class363 var2 = this.field5691.field4652;
            if (this.field5691 == var2) {
                if (arg0 != 9) {
                    return;
                }
                field5689++;
                this.field5699 = null;
                return;
            }
            var2.method2110(112);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)Lfu;", line = 27)
    public final class363 method2502(boolean arg0) {
        if (arg0) {
            this.method2505((byte) 75);
        }
        field5701++;
        class363 var2 = this.field5691.field4652;
        if (this.field5691 == var2) {
            this.field5699 = null;
            return null;
        } else {
            this.field5699 = var2.field4652;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 47)
    public static void method2503(int arg0) {
        if (arg0 != -1) {
            field5697 = null;
        }
        field5697 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLfu;)V", line = 60)
    public final void method2504(byte arg0, class363 arg1) {
        field5690++;
        if (arg1.field4647 != null) {
            arg1.method2110(89);
        }
        if (arg0 < -89) {
            arg1.field4652 = this.field5691;
            arg1.field4647 = this.field5691.field4647;
            arg1.field4647.field4652 = arg1;
            arg1.field4652.field4647 = arg1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)I", line = 79)
    public final int method2505(byte arg0) {
        field5698++;
        if (arg0 < 119) {
            this.field5691 = null;
        }
        int var2 = 0;
        class363 var3 = this.field5691.field4652;
        while (this.field5691 != var3) {
            var3 = var3.field4652;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 176)
    public class456() {
        this.field5691.field4652 = this.field5691;
        this.field5691.field4647 = this.field5691;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILfu;)V", line = 121)
    public final void method2506(int arg0, class363 arg1) {
        field5695++;
        if (arg1.field4647 != null) {
            arg1.method2110(arg0 + 115);
        }
        arg1.field4647 = this.field5691;
        if (arg0 != 0) {
            this.field5691 = null;
        }
        arg1.field4652 = this.field5691.field4652;
        arg1.field4647.field4652 = arg1;
        arg1.field4652.field4647 = arg1;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Lfu;", line = 141)
    public final class363 method2507(byte arg0) {
        if (arg0 != 80) {
            this.method2508(-33);
        }
        field5693++;
        class363 var2 = this.field5691.field4652;
        if (this.field5691 == var2) {
            return null;
        } else {
            var2.method2110(109);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)Lfu;", line = 159)
    public final class363 method2508(int arg0) {
        field5700++;
        if (arg0 != -6680) {
            this.method2502(true);
        }
        class363 var2 = this.field5691.field4647;
        if (this.field5691 == var2) {
            return null;
        } else {
            var2.method2110(99);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)Lfu;", line = 186)
    public final class363 method2509(byte arg0) {
        int var2 = -46 % ((-arg0 - 72) / 44);
        field5694++;
        class363 var3 = this.field5699;
        if (this.field5691 == var3) {
            this.field5699 = null;
            return null;
        } else {
            this.field5699 = var3.field4652;
            return var3;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V", line = 206)
    public static final void method2510(int arg0, int arg1) {
        field5696++;
        class243 var2 = class546.method2926(arg0, 9, true);
        if (arg1 != -18684) {
            field5697 = null;
        }
        var2.method1455(true);
    }
}

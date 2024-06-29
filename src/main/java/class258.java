import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class258 {

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lmga;")
    private class666 field3556 = new class666(256);

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Le;")
    private class498 field3558;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lno;")
    private class658 field3555;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Los;")
    public static class412 field3560 = new class412(0, 1);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 7)
    public final void method1580(boolean arg0) {
        this.field3556.method3740((byte) 60, 5);
        if (!arg0) {
            field3560 = null;
        }
        field3553++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1581(int arg0, int arg1) {
        field3559++;
        if (~class71.field1059 == arg0) {
            class568.field7553.method1717((byte) -77, arg1);
        } else {
            class254.field3517 = arg1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 33)
    public static void method1582(boolean arg0) {
        field3560 = null;
        if (arg0) {
            field3560 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 51)
    public final void method1583(byte arg0) {
        field3557++;
        if (arg0 == 69) {
            this.field3556.method3739(arg0 - 69);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lgaa;", line = 62)
    public final class275 method1584(int arg0, int arg1) {
        field3552++;
        Object var3 = this.field3556.method3750((long) arg0, false);
        if (arg1 <= 98) {
            this.field3556 = null;
        }
        if (var3 != null) {
            return (class275) var3;
        } else if (this.field3558.method2759(32700, arg0)) {
            class364 var4 = this.field3558.method2760(arg0, 21351);
            int var5 = var4.field4933 ? 64 : this.field3555.field9169;
            class275 var7;
            if (var4.field4939 && this.field3555.method96()) {
                float[] var6 = this.field3558.method2764(var5, arg0, var5, 0.7F, false, (byte) -124);
                var7 = new class275(this.field3555, 3553, 34842, var5, var5, var4.field4942 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4931) {
                    var8 = this.field3558.method2762(0.7F, var5, false, arg0, 7814, var5);
                } else {
                    var8 = this.field3558.method2761((byte) -75, var5, true, arg0, 0.7F, var5);
                }
                var7 = new class275(this.field3555, 3553, 6408, var5, var5, var4.field4942 != 0, var8, false);
            }
            var7.method1664(var4.field4936, var4.field4938, (byte) 18);
            this.field3556.method3745(1, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lno;Le;)V", line = 113)
    public class258(class658 arg0, class498 arg1) {
        this.field3558 = arg1;
        this.field3555 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 122)
    public static final void method1585(int arg0) {
        field3554++;
        int var1 = -112 % ((arg0 + 7) / 40);
        if (class344.field4718.method1553(class571.field7587, -2058) || class669.field9491 == class29.field476) {
            class296.method1818(class10.field197, 28938);
            if (class315.field4342 != class29.field476) {
                class518.method2887(121);
            }
        } else {
            class659.method3691(11, class571.field7588, 512, class466.field6278, false);
        }
    }
}

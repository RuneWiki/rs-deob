import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class169 extends class419 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2478 = -1;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljo;")
    public static class382 field2484 = new class382(260);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lya;IIILqj;IZ)V", line = 3)
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        int var8 = -46 % ((arg5 - 24) / 62);
        field2489++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 20)
    public static final void method1172(int arg0) {
        if (arg0 != 32) {
            field2484 = null;
        }
        field2491++;
        class261.field3901.method3056(true);
        class285.field4286.method3056(true);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 37)
    public static void method1173(byte arg0) {
        field2484 = null;
        if (arg0 <= 99) {
            field2485 = 27;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V", line = 49)
    public static final void method1174(byte arg0) {
        if (arg0 != -111) {
            method1174((byte) -21);
        }
        field2481++;
        int var1 = 0;
        if (class454.field6661.method510(15479, class113.field1723)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class454.field6661.field975) {
            var1 |= 0x40;
        }
        class400.method2422(var1, false);
        class119.field1824.method246(50, var1);
        class164.field2437.method1751(var1, arg0 ^ 0x11);
        class373.field5641.method775(arg0 ^ 0xFFFFC770, var1);
        class443.field6509.method2023(-113, var1);
        class92.method724(0, var1);
        class238.method1460((byte) -45, var1);
        class173.method1192(arg0 + 25322, var1);
        class60.method428(var1, -14731);
        class237.method1458(-105);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 88)
    public final void method239(int arg0) {
        field2492++;
        if (arg0 >= -38) {
            field2478 = -59;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Z", line = 104)
    public final boolean method230(int arg0) {
        field2486++;
        if (arg0 != -22611) {
            this.field2483 = -50;
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIII)V", line = 119)
    public class169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2482 = arg1;
        this.field2493 = arg5;
        this.field2488 = arg2;
        this.field2479 = arg3;
        this.field2490 = arg4;
        this.field2483 = arg6;
        this.field2487 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I")
    public abstract int method921(byte arg0);
}

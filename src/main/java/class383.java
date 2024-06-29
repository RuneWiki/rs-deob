import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class383 extends class108 {

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public int field5702;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    private int field5703;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private int field5694;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public int field5699;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private int field5700;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    private int field5701;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)Z", line = 4)
    public final boolean method2331(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.method2332(45, null, -128, 51);
        }
        field5698++;
        return this.field5703 == arg0 && arg3 >= this.field5701 && this.field5689 >= arg3 && this.field5700 <= arg1 && arg1 <= this.field5694;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[III)V", line = 26)
    public final void method2332(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = 0;
        arg1[arg3] = this.field5699 + arg0 - this.field5701;
        arg1[2] = arg2 + this.field5702 - this.field5700;
        field5696++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([IIZI)V", line = 40)
    public final void method2333(int[] arg0, int arg1, boolean arg2, int arg3) {
        arg0[0] = this.field5703;
        if (arg2) {
            this.method2332(6, null, -31, -88);
        }
        arg0[2] = arg3 - (this.field5702 - this.field5700);
        field5691++;
        arg0[1] = arg1 - (this.field5699 - this.field5701);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)Z", line = 53)
    public final boolean method2334(int arg0, int arg1, byte arg2) {
        field5692++;
        int var4 = -22 / (arg2 / 41);
        return arg0 >= this.field5699 && this.field5695 >= arg0 && arg1 >= this.field5702 && this.field5688 >= arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILao;Lao;)V", line = 72)
    public static final void method2335(int arg0, int arg1, int arg2, class367 arg3, class367 arg4) {
        class184 var5 = class551.method3098(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2672 = arg3;
            var5.field2666 = arg4;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)Z", line = 81)
    public final boolean method2336(int arg0, byte arg1, int arg2) {
        if (arg1 > -8) {
            this.method2332(27, null, 49, -96);
        }
        field5690++;
        return this.field5701 <= arg2 && arg2 <= this.field5689 && arg0 >= this.field5700 && arg0 <= this.field5694;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIII)V", line = 99)
    public class383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5702 = arg6;
        this.field5703 = arg0;
        this.field5694 = arg4;
        this.field5689 = arg3;
        this.field5699 = arg5;
        this.field5700 = arg2;
        this.field5701 = arg1;
        this.field5695 = arg7;
        this.field5688 = arg8;
    }
}

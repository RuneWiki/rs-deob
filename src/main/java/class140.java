import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class140 extends class256 {

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Lbj;")
    public static class162 field2331 = new class162(35, 11);

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "Ls;")
    public static class186 field2336 = new class186(1, 10);

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "[Lte;")
    public static class439[] field2337 = new class439[6];

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method146(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 4) {
            field2331 = null;
        }
        super.field3929 = arg2;
        super.field3926 = arg0;
        ++field2330;
        super.field3928 = arg3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)Lub;", line = 16)
    public static final class18 method1047(int arg0, int arg1, boolean arg2) {
        ++field2334;
        class18 var3 = (class18) class477.field7051.method1622((long) arg0 << 32 | (long) arg1, 47);
        if (arg2) {
            field2336 = null;
        }
        if (var3 == null) {
            var3 = new class18(arg0, arg1);
            class477.field7051.method1618(var3, var3.field3977, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V", line = 38)
    public static void method1048(int arg0) {
        field2336 = null;
        if (arg0 == 25431) {
            field2331 = null;
            field2337 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIF)V", line = 55)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IF)V", line = 58)
    public final void method145(int arg0, float arg1) {
        super.field3920 = arg1;
        if (arg0 == 2784) {
            ++field2332;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIII)V", line = 73)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2335;
        for (int var5 = 0; ~var5 > ~class108.field1986; ++var5) {
            Rectangle var6 = class31.field498[var5];
            if (var6.x + var6.width > arg3 && arg0 + arg3 > var6.x && var6.y + var6.height > arg1 && var6.y < arg1 + arg4) {
                class188.field3023[var5] = true;
            }
        }
        if (arg2 != 11) {
            field2336 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZZ)V", line = 101)
    public static final void method1050(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            ++class325.field4940;
            class506.method3037(1);
        }
        if (arg0 == 1135383648) {
            ++field2333;
            if (arg1) {
                ++class81.field1679;
                class76.method682(123);
            }
        }
    }
}

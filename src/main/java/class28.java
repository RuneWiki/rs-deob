import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class28 extends class418 {

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "Lso;")
    public static class238 field480;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[Z")
    public static boolean[] field476;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLir;)V", line = 9)
    public static final void method230(byte arg0, class185 arg1) {
        class251.field3689 = arg1;
        field478++;
        int var2 = 54 / ((36 - arg0) / 44);
        class251.field3689.method1225(35, (byte) 27);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 27)
    public static void method231(byte arg0) {
        field480 = null;
        field476 = null;
        if (arg0 > -113) {
            field476 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lir;B)V", line = 45)
    public static final void method232(class185 arg0, byte arg1) {
        class139.field1794 = arg0;
        int var2 = 89 / ((54 - arg1) / 39);
        field479++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIBIIII)V", line = 55)
    public static final void method233(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field477++;
        class248 var7 = class416.method2626(211655864, arg4, arg0);
        if (var7 != null && var7.field3509 != null) {
            class452 var8 = new class452();
            var8.field6571 = var7;
            var8.field6570 = var7.field3509;
            class293.method1989(var8);
        }
        class274.field4024 = arg4;
        class45.field682 = arg1;
        class388.field5685 = arg3;
        if (arg2 != 23) {
            field476 = null;
        }
        class295.field4448 = arg6;
        class144.field1847 = arg5;
        class112.field1450 = arg0;
        class263.field3862 = true;
        class92.method744(20491, var7);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z", line = 87)
    public static final boolean method234(int arg0, int arg1, int arg2) {
        int var3 = class301.field4539[arg0][arg1][arg2];
        if (-class13.field207 == var3) {
            return false;
        } else if (class13.field207 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class27.method229(var4 + 1, class266.field3950[arg0].method722(arg1, arg2), var5 + 1) && class27.method229(var4 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg2), var5 + 1) && class27.method229(var4 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class27.method229(var4 + 1, class266.field3950[arg0].method722(arg1, arg2 + 1), var5 + 128 - 1)) {
                class301.field4539[arg0][arg1][arg2] = class13.field207;
                return true;
            } else {
                class301.field4539[arg0][arg1][arg2] = -class13.field207;
                return false;
            }
        }
    }
}

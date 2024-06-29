import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class462 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljo;")
    private class382 field6723 = new class382(64);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lok;")
    private class74 field6724;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[Z")
    public static boolean[] field6727 = new boolean[100];

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6730 = "";

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[[S")
    public static short[][] field6732 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 8)
    public static void method2674(byte arg0) {
        field6732 = null;
        field6730 = null;
        if (arg0 != 23) {
            field6732 = null;
        }
        field6727 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method2675(boolean arg0, int arg1) {
        field6731++;
        if (arg0) {
            this.field6723 = null;
        }
        class382 var3 = this.field6723;
        synchronized (this.field6723) {
            this.field6723.method2294(arg1, true);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Lve;", line = 42)
    public final class184 method2676(int arg0, byte arg1) {
        field6728++;
        class382 var3 = this.field6723;
        class184 var5;
        synchronized (this.field6723) {
            if (arg1 != -14) {
                return null;
            }
            var5 = (class184) this.field6723.method2288((long) arg0, 0);
        }
        if (var5 != null) {
            return var5;
        }
        class74 var6 = this.field6724;
        byte[] var7;
        synchronized (this.field6724) {
            var7 = this.field6724.method541(arg0, 11, (byte) -122);
        }
        class184 var8 = new class184();
        if (var7 != null) {
            var8.method1252(new class468(var7), arg1 - 52);
        }
        class382 var9 = this.field6723;
        synchronized (this.field6723) {
            this.field6723.method2290((long) arg0, var8, 104);
            return var8;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBIIIII)V", line = 73)
    public static final void method2677(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6722++;
        if (!class250.method1495(true, arg3)) {
            return;
        }
        if (class376.field5673[arg3] == null) {
            client.method3046(class174.field2549[arg3], -1, arg6, arg0, arg5, arg7, arg1, arg8, arg9, arg2);
        } else {
            client.method3046(class376.field5673[arg3], -1, arg6, arg0, arg5, arg7, arg1, arg8, arg9, arg2);
        }
        if (arg4 < 118) {
            method2674((byte) 10);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V", line = 95)
    public static final void method2678(int arg0, int arg1, int arg2, int arg3) {
        field6725++;
        class112 var4 = class164.field2446[arg2][arg3];
        if (arg0 == -11339) {
            class390.method2337(var4 == null ? class418.field6268 : var4, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 114)
    public final void method2679(int arg0) {
        field6726++;
        if (arg0 == 29745) {
            class382 var2 = this.field6723;
            synchronized (this.field6723) {
                this.field6723.method2287(69);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 129)
    public class462(class262 arg0, int arg1, class74 arg2) {
        this.field6724 = arg2;
        if (this.field6724 != null) {
            this.field6724.method536(false, 11);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 149)
    public final void method2680(int arg0) {
        class382 var2 = this.field6723;
        synchronized (this.field6723) {
            this.field6723.method2293(false);
        }
        int var3 = -121 % ((arg0 - 47) / 58);
        field6729++;
    }
}

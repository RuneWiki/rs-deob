import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class411 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lvi;")
    private class560 field5762 = new class560(64);

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field5771 = 0;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lpq;")
    private class159 field5761;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5759 = new String[5];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    public static int[] field5769 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Luea;")
    public static class484 field5764 = new class484("stellardawn", 1);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V", line = 6)
    public final void method2407(int arg0, byte arg1) {
        class560 var3 = this.field5762;
        synchronized (this.field5762) {
            this.field5762.method3129(arg0, 14583);
        }
        field5767++;
        int var4 = -83 % ((-arg1 - 25) / 47);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method2408(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field5759 = null;
        }
        field5763++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 29)
    public static void method2409(int arg0) {
        field5759 = null;
        field5764 = null;
        if (arg0 == 0) {
            field5769 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIII)V", line = 41)
    public static final void method2410(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field5759 = null;
        }
        if (class72.field935.field6512 != 0 && arg3 != 0 && class485.field6555 < 50 && arg2 != -1) {
            class658.field9278[class485.field6555++] = new class578((byte) 1, arg2, arg3, arg4, arg1, 0);
        }
        field5772++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ldga;B)Lpu;", line = 61)
    public static final class422 method2411(class138 arg0, byte arg1) {
        field5765++;
        int var2 = arg0.method922((byte) -127);
        class380 var3 = class248.method1550(-106)[arg0.method957((byte) -115)];
        class97 var4 = class296.method1767(false)[arg0.method957((byte) -72)];
        int var5 = arg0.method924(2);
        int var6 = arg0.method924(2);
        if (arg1 != 59) {
            method2408(-86, 11, 39);
        }
        return new class422(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lss;", line = 93)
    public final class283 method2412(int arg0, int arg1) {
        field5760++;
        class560 var3 = this.field5762;
        class283 var4;
        synchronized (this.field5762) {
            var4 = (class283) this.field5762.method3134((long) arg1, -68);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field5761;
        byte[] var6;
        synchronized (this.field5761) {
            var6 = this.field5761.method1087(arg0, arg1, arg0 ^ 0x5);
        }
        class283 var7 = new class283();
        var7.field3821 = this;
        var7.field3827 = arg1;
        if (var6 != null) {
            var7.method1701((byte) -63, new class138(var6));
        }
        var7.method1703(29424);
        class560 var8 = this.field5762;
        synchronized (this.field5762) {
            this.field5762.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 123)
    public final void method2413(byte arg0) {
        int var2 = 37 / ((-arg0 - 75) / 42);
        class560 var3 = this.field5762;
        synchronized (this.field5762) {
            this.field5762.method3144(true);
        }
        field5768++;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 137)
    public final void method2414(byte arg0) {
        if (arg0 < 121) {
            return;
        }
        field5766++;
        class560 var2 = this.field5762;
        synchronized (this.field5762) {
            this.field5762.method3142(false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 165)
    public class411(class484 arg0, int arg1, class159 arg2) {
        this.field5761 = arg2;
        this.field5770 = this.field5761.method1076(4, 0);
    }
}

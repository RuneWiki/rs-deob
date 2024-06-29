import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class224 {

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lvi;")
    private class560 field2913 = new class560(64);

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Lvi;")
    public class560 field2920 = new class560(2);

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lpq;")
    public class159 field2908;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lpq;")
    private class159 field2911;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "[[Z")
    public static boolean[][] field2906 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field2907 = -1;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "[Z")
    public static boolean[] field2912 = new boolean[100];

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 14)
    public final void method1367(int arg0) {
        field2909++;
        class560 var2 = this.field2913;
        synchronized (this.field2913) {
            this.field2913.method3144(true);
        }
        class560 var3 = this.field2920;
        synchronized (this.field2920) {
            this.field2920.method3144(true);
            if (arg0 >= -105) {
                this.field2920 = null;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 32)
    public static void method1368(int arg0) {
        field2906 = null;
        if (arg0 != -3500) {
            field2907 = 55;
        }
        field2912 = null;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lefa;", line = 47)
    public static final class40 method1369(int arg0) {
        field2910++;
        if (class375.field5394.length > class217.field2805) {
            return class375.field5394[class217.field2805++];
        } else {
            if (arg0 != 10) {
                field2907 = -55;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 68)
    public final void method1370(byte arg0) {
        field2914++;
        class560 var2 = this.field2913;
        synchronized (this.field2913) {
            this.field2913.method3142(false);
            int var3 = 74 / ((arg0 + 68) / 44);
        }
        class560 var4 = this.field2920;
        synchronized (this.field2920) {
            this.field2920.method3142(false);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 83)
    public static final boolean method1371(String arg0, byte arg1) {
        int var2 = 48 % ((24 - arg1) / 44);
        field2918++;
        return class296.method1766(true, arg0, (byte) 82, 10);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Luea;ILpq;Lpq;)V", line = 148)
    public class224(class484 arg0, int arg1, class159 arg2, class159 arg3) {
        this.field2908 = arg3;
        this.field2911 = arg2;
        this.field2911.method1076(33, 0);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V", line = 98)
    public final void method1372(byte arg0, int arg1) {
        class560 var3 = this.field2913;
        synchronized (this.field2913) {
            int var4 = -40 % ((61 - arg0) / 55);
            this.field2913.method3129(arg1, 14583);
        }
        field2915++;
        class560 var5 = this.field2920;
        synchronized (this.field2920) {
            this.field2920.method3129(arg1, 14583);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Liaa;", line = 113)
    public final class681 method1373(int arg0, byte arg1) {
        field2916++;
        class560 var3 = this.field2913;
        class681 var4;
        synchronized (this.field2913) {
            var4 = (class681) this.field2913.method3134((long) arg0, -52);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field2911;
        byte[] var6;
        synchronized (this.field2911) {
            var6 = this.field2911.method1087(33, arg0, 1);
            if (arg1 != -112) {
                field2917 = -124;
            }
        }
        class681 var7 = new class681();
        var7.field9676 = this;
        if (var6 != null) {
            var7.method3757(new class138(var6), (byte) -45);
        }
        class560 var8 = this.field2913;
        synchronized (this.field2913) {
            this.field2913.method3130((long) arg0, true, var7);
            return var7;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class216 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljk;")
    private class449 field2762 = new class449(64);

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "Ljk;")
    public class449 field2775 = new class449(50);

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "Ljk;")
    public class449 field2777 = new class449(5);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lqn;")
    public class47 field2761;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lqn;")
    private class47 field2765;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lae;")
    public class165 field2766;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Z")
    public boolean field2767;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
    public final void method1324(int arg0, int arg1) {
        field2769++;
        class449 var3 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method2648(false, arg1);
        }
        class449 var4 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method2648(false, arg1);
        }
        class449 var5 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method2648(false, arg1);
            if (arg0 != -1) {
                this.method1330((byte) -6, 114);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static final void method1325(int arg0) {
        if (arg0 > -100) {
            return;
        }
        class515.method3074(-128);
        field2770++;
        class53.field708 = null;
        class303.field3890 = null;
        class371.field4797 = null;
        class377.field4960 = null;
        class299.field3853 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
    public final void method1326(boolean arg0, int arg1) {
        field2760++;
        if (arg0 != this.field2767) {
            int var3 = -61 % ((arg1 - 17) / 49);
            this.field2767 = arg0;
            this.method1329(-1);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Lfb;")
    public final class477 method1327(int arg0, byte arg1) {
        field2776++;
        class449 var3 = this.field2762;
        class477 var4;
        synchronized (this.field2762) {
            var4 = (class477) this.field2762.method2647(-112, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field2765;
        byte[] var6;
        synchronized (this.field2765) {
            if (arg1 >= -125) {
                this.method1326(true, 118);
            }
            var6 = this.field2765.method481(class443.method2618((byte) -6, arg0), class314.method1841(127, arg0), -114);
        }
        class477 var7 = new class477();
        var7.field6924 = this;
        var7.field6948 = arg0;
        if (var6 != null) {
            var7.method2900(new class463(var6), (byte) 4);
        }
        var7.method2901(1024);
        class449 var8 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method2635((long) arg0, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final void method1328(byte arg0) {
        field2764++;
        class449 var2 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method2642(0);
        }
        class449 var3 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method2642(0);
        }
        int var4 = -100 % ((arg0 + 92) / 34);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public final void method1329(int arg0) {
        class449 var2 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method2642(0);
        }
        field2771++;
        class449 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method2642(0);
        }
        class449 var4 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method2642(0);
        }
        if (arg0 != -1) {
            this.method1328((byte) 66);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
    public final void method1330(byte arg0, int arg1) {
        if (arg0 != -7) {
            return;
        }
        this.field2778 = arg1;
        field2774++;
        class449 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method2642(arg0 ^ 0xFFFFFFF9);
        }
        class449 var4 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method2642(0);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lob;I)Ljava/lang/String;")
    public static final String method1331(class520 arg0, int arg1) {
        field2772++;
        if (arg1 >= -17) {
            return null;
        } else if (arg0.field7506 == null || arg0.field7506.length() <= 0) {
            return arg0.field7513;
        } else {
            return arg0.field7513 + class340.field4271.method1936(-26539, class11.field177) + arg0.field7506;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public final void method1332(boolean arg0) {
        class449 var2 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method2640(88);
        }
        field2768++;
        class449 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method2640(89);
        }
        class449 var4 = this.field2777;
        synchronized (this.field2777) {
            if (!arg0) {
                method1331(null, 119);
            }
            this.field2777.method2640(79);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lae;IZLqn;Lqn;)V")
    public class216(class165 arg0, int arg1, boolean arg2, class47 arg3, class47 arg4) {
        this.field2761 = arg4;
        this.field2765 = arg3;
        this.field2766 = arg0;
        this.field2767 = arg2;
        if (this.field2765 != null) {
            int var6 = this.field2765.method472((byte) -82) - 1;
            this.field2765.method469(30322, var6);
        }
    }
}

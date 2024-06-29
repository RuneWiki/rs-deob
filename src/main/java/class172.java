import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class172 {

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lng;")
    private class226 field2537 = new class226(64);

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lng;")
    private class226 field2547 = new class226(100);

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lic;")
    private class491 field2541;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2536 = new String[8];

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[I")
    public static int[] field2542 = new int[1000];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field2546 = -1;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Llt;")
    public static class475 field2544 = new class475("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 4)
    public final void method1180(byte arg0) {
        class226 var2 = this.field2537;
        synchronized (this.field2537) {
            this.field2537.method1539(-72);
        }
        field2538++;
        if (arg0 == 36) {
            class226 var3 = this.field2547;
            synchronized (this.field2547) {
                this.field2547.method1539(-123);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1181(boolean arg0) {
        field2536 = null;
        field2542 = null;
        if (arg0) {
            method1181(true);
        }
        field2544 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lnm;", line = 41)
    public final class329 method1182(int arg0, int arg1) {
        if (arg1 != 8) {
            return null;
        }
        field2543++;
        class226 var3 = this.field2537;
        class329 var4;
        synchronized (this.field2537) {
            var4 = (class329) this.field2537.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2541.method2945(class426.method2553(arg0, (byte) -82), class3.method21(arg0, arg1 - 126), true);
        class329 var6 = new class329();
        var6.field4656 = arg0;
        var6.field4673 = this;
        if (var5 != null) {
            var6.method2020(new class209(var5), arg1 + 118);
        }
        var6.method2024(68);
        class226 var7 = this.field2537;
        synchronized (this.field2537) {
            this.field2537.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 73)
    public final void method1183(int arg0) {
        field2539++;
        class226 var2 = this.field2537;
        synchronized (this.field2537) {
            this.field2537.method1540(0);
        }
        class226 var3 = this.field2547;
        synchronized (this.field2547) {
            this.field2547.method1540(0);
        }
        int var4 = -110 / ((arg0 + 29) / 46);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Llo;", line = 92)
    public final class528 method1184(int arg0, int arg1) {
        field2545++;
        class226 var3 = this.field2547;
        class528 var4;
        synchronized (this.field2547) {
            var4 = (class528) this.field2547.method1536((long) arg1, 0);
            if (var4 == null) {
                var4 = new class528(arg1);
                this.field2547.method1542(var4, (byte) 112, (long) arg1);
            }
            int var5 = -40 % ((arg0 - 20) / 57);
        }
        synchronized (var4) {
            return var4.method3118(255) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V", line = 133)
    public final void method1185(int arg0, boolean arg1) {
        field2535++;
        class226 var3 = this.field2537;
        synchronized (this.field2537) {
            this.field2537.method1534(0, arg0);
            if (arg1) {
                this.field2537 = null;
            }
        }
        class226 var4 = this.field2547;
        synchronized (this.field2547) {
            this.field2547.method1534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lai;ILic;Lic;Lic;)V", line = 159)
    public class172(class423 arg0, int arg1, class491 arg2, class491 arg3, class491 arg4) {
        this.field2541 = arg2;
        if (this.field2541 != null) {
            int var6 = this.field2541.method2943((byte) -33) - 1;
            this.field2541.method2942(false, var6);
        }
        class231.method1585(arg4, 127, arg3);
    }
}

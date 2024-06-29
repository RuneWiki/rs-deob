import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class212 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lqk;")
    private class1 field3480 = new class1();

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    private int field3482;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Leh;")
    private class94 field3472;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ltl;")
    public static class59 field3468 = class85.method639("Stufe: ", 9588);

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ltl;")
    public static class59 field3467 = class85.method639("Benutzen", 9588);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Ltl;")
    public static class59 field3481 = class85.method639("m-Ochte mit Ihnen handeln)3", 9588);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lpc;")
    public static class118 field3475;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[[[Lcd;")
    public static class245[][][] field3465;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 6)
    public final void method1482(byte arg0) {
        if (arg0 != 30) {
            this.method1484(true);
        }
        for (class282 var2 = (class282) this.field3480.method7(-31); var2 != null; var2 = (class282) this.field3480.method1((byte) 106)) {
            if (var2.method1433((byte) 45)) {
                var2.method2000(arg0 ^ 0xFFFFFF90);
                var2.method997(arg0 ^ 0xFFFFFFD3);
                this.field3482++;
            }
        }
        field3469++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 30)
    public final Object method1483(byte arg0, long arg1) {
        field3478++;
        class282 var4 = (class282) this.field3472.method685(arg1, 128);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1435((byte) -97);
        if (arg0 != -74) {
            field3468 = (class59) null;
        }
        if (var5 == null) {
            var4.method2000(arg0 + 95);
            var4.method997(122);
            this.field3482++;
            return null;
        }
        if (var4.method1433((byte) 80)) {
            class199 var6 = new class199(var5);
            this.field3472.method694(var6, (byte) -90, var4.field4932);
            this.field3480.method6(var6, arg0 + 26);
            var6.field2264 = 0L;
            var4.method2000(124);
            var4.method997(10);
        } else {
            this.field3480.method6(var4, arg0 - 36);
            var4.field2264 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 86)
    public final void method1484(boolean arg0) {
        this.field3480.method9(true);
        if (arg0) {
            method1485(0);
        }
        this.field3472.method690(10);
        field3470++;
        this.field3482 = this.field3474;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 99)
    public static void method1485(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3467 = null;
        field3468 = null;
        field3465 = (class245[][][]) null;
        field3481 = null;
        field3475 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V", line = 113)
    public final void method1486(boolean arg0, int arg1) {
        if (class262.field4360 != null) {
            for (class282 var3 = (class282) this.field3480.method7(-86); var3 != null; var3 = (class282) this.field3480.method1((byte) 103)) {
                if (var3.method1433((byte) 96)) {
                    if (var3.method1435((byte) -97) == null) {
                        var3.method2000(-53);
                        var3.method997(-1);
                        this.field3482++;
                    }
                } else if ((long) arg1 < ++var3.field2264) {
                    class282 var4 = class262.field4360.method874(var3, -25990);
                    this.field3472.method694(var4, (byte) -90, var3.field4932);
                    class167.method1180(var4, (byte) -40, var3);
                    var3.method2000(-123);
                    var3.method997(116);
                }
            }
        }
        field3476++;
        if (arg0) {
            this.method1483((byte) 68, 105L);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIZLme;I)V", line = 189)
    public static final void method1487(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, class295 arg5, int arg6) {
        class7.field92 = arg6;
        if (!arg0) {
            return;
        }
        field3471 = 1;
        class219.field3566 = arg3;
        class228.field3687 = arg4;
        field3473++;
        class97.field1561 = arg2;
        class149.field2442 = arg5;
        class113.field1823 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 209)
    public final void method1488(long arg0, Object arg1, int arg2) {
        this.method1489(102, arg0);
        if (this.field3482 == 0) {
            class282 var5 = (class282) this.field3480.method3(0);
            var5.method2000(122);
            var5.method997(-97);
        } else {
            this.field3482--;
        }
        field3479++;
        if (arg2 == 25838) {
            class199 var6 = new class199(arg1);
            this.field3472.method694(var6, (byte) -90, arg0);
            this.field3480.method6(var6, -108);
            var6.field2264 = 0L;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IJ)V", line = 238)
    public final void method1489(int arg0, long arg1) {
        if (arg0 < 100) {
            method1485(-89);
        }
        field3477++;
        class282 var4 = (class282) this.field3472.method685(arg1, 128);
        if (var4 != null) {
            var4.method2000(-117);
            var4.method997(-60);
            this.field3482++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V", line = 267)
    public class212(int arg0) {
        this.field3482 = arg0;
        this.field3474 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3472 = new class94(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class209 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lbj;")
    private class88 field3334 = new class88();

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lvg;")
    private class22 field3346 = new class22();

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field3348;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field3345;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lsb;")
    private class110 field3347;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "[J")
    public static long[] field3341 = new long[32];

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3344 = "Members object";

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "J")
    public static long field3333;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lra;")
    public static class38 field3332;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Ljj;")
    public static class40 field3336;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[Lvd;")
    public static class19[] field3329;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[[B")
    public static byte[][] field3343;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3343 = null;
        field3336 = null;
        field3332 = null;
        field3329 = null;
        field3341 = null;
        field3344 = null;
        if (arg0 != 0) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public final void method1466(byte arg0) {
        field3331++;
        this.field3346.method121((byte) -70);
        if (arg0 <= 89) {
            field3341 = null;
        }
        this.field3347.method711(true);
        this.field3334 = new class88();
        this.field3348 = this.field3345;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLbj;J)V")
    public final void method1467(byte arg0, class88 arg1, long arg2) {
        if (arg0 != -119) {
            return;
        }
        if (this.field3348 == 0) {
            class88 var5 = this.field3346.method126((byte) 99);
            var5.method1673(14510);
            var5.method480(104);
            if (this.field3334 == var5) {
                class88 var6 = this.field3346.method126((byte) 107);
                var6.method1673(14510);
                var6.method480(arg0 + 232);
            }
        } else {
            this.field3348--;
        }
        this.field3347.method707(arg2, arg1, (byte) 120);
        field3338++;
        this.field3346.method125(arg1, -1);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static final void method1468(byte arg0) {
        if (class164.field2602 != -1) {
            class274.method1838(class164.field2602, true);
        }
        field3342++;
        if (arg0 > -29) {
            field3341 = null;
        }
        for (int var1 = 0; var1 < class221.field3561; var1++) {
            if (class21.field279[var1]) {
                class103.field1386[var1] = true;
            }
            class225.field3616[var1] = class21.field279[var1];
            class21.field279[var1] = false;
        }
        class195.field3116 = -1;
        class74.field929 = class73.field924;
        class211.field3400 = -1;
        class36.field461 = null;
        if (class164.field2602 != -1) {
            class221.field3561 = 0;
            client.method738((byte) 104);
        }
        class217.method1535();
        class32.field427 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IJ)Lbj;")
    public final class88 method1469(int arg0, long arg1) {
        field3335++;
        if (arg0 != 8288) {
            this.field3348 = 36;
        }
        class88 var4 = (class88) this.field3347.method708(arg1, arg0 ^ 0xFFFFDFF0);
        if (var4 != null) {
            this.field3346.method125(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
    public static final boolean method1470(int arg0, int arg1, int arg2) {
        if (arg0 != 31225) {
            method1473((class96) null, false);
        }
        field3330++;
        class228 var3 = class256.method1749(arg2, arg0 - 31225);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1623(arg0 ^ 0xFFFFEE55, arg1);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Lgl;")
    public final class237 method1471(int arg0) {
        field3337++;
        if (arg0 != -6) {
            field3341 = null;
        }
        return this.field3347.method710((byte) -119);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)Lgl;")
    public final class237 method1472(byte arg0) {
        if (arg0 < 90) {
            field3341 = null;
        }
        field3328++;
        return this.field3347.method709(false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lpd;Z)Lpj;")
    public static final class51 method1473(class96 arg0, boolean arg1) {
        if (arg1) {
            method1468((byte) -7);
        }
        field3340++;
        return new class51(arg0.method564(-69), arg0.method564(-68), arg0.method564(-82), arg0.method564(-69), arg0.method598(-1235752501), arg0.method584(255));
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
    public class209(int arg0) {
        this.field3348 = arg0;
        this.field3345 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3347 = new class110(var2);
    }
}

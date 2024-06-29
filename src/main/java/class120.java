import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lgd;")
    private class46 field2724 = new class46();

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lla;")
    private class77 field2741 = new class77();

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lsb;")
    private class127 field2732;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lsc;")
    public static class128 field2720 = class129.method1017(false, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lsc;")
    private static class128 field2725 = class129.method1017(false, "Connecting to update server");

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[Lsc;")
    public static class128[] field2738 = new class128[500];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lsc;")
    public static class128 field2719 = field2725;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lsc;")
    private static class128 field2734 = class129.method1017(false, "Invalid username or password)3");

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lsc;")
    public static class128 field2739 = field2734;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "J")
    public static long field2722;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lgf;")
    public static class48 field2729;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lae;")
    public static class6 field2728;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JB)V")
    public final void method911(long arg0, byte arg1) {
        class46 var4 = (class46) this.field2732.method969(arg0, -107);
        if (var4 != null) {
            var4.method172(arg1 ^ 0xFFFFF583);
            var4.method339(arg1 ^ 0x6E);
            this.field2730++;
        }
        if (arg1 != 29) {
            method912(-12);
        }
        field2740++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method912(int arg0) {
        class1.field7 = -1;
        class1.field11 = -1;
        class73.field1631 = -1;
        class135.field3180 = false;
        class50.field997 = 0;
        class7.field103 = 0;
        class150.field3449 = 0;
        class128.field2942 = 0;
        field2731++;
        class152.field3502.field1924 = 0;
        class102.field2333 = -1;
        class66.field1490 = 0;
        class158.field3626.field1924 = 0;
        class63.field1359 = 0;
        for (int var1 = 0; var1 < class106.field2421.length; var1++) {
            if (class106.field2421[var1] != null) {
                class106.field2421[var1].field951 = -1;
            }
        }
        for (int var2 = 0; var2 < class92.field2104.length; var2++) {
            if (class92.field2104[var2] != null) {
                class92.field2104[var2].field951 = -1;
            }
        }
        class33.method248(32);
        class23.method206(20, 30);
        int var3 = 5 / ((arg0 + 75) / 50);
        for (int var4 = 0; var4 < 100; var4++) {
            class153.field3517[var4] = true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JLgd;B)V")
    public final void method913(long arg0, class46 arg1, byte arg2) {
        int var5 = 118 / ((arg2 - 31) / 42);
        field2733++;
        if (this.field2730 == 0) {
            class46 var6 = this.field2741.method562((byte) -57);
            var6.method172(-2658);
            var6.method339(77);
            if (this.field2724 == var6) {
                class46 var7 = this.field2741.method562((byte) -104);
                var7.method172(-2658);
                var7.method339(82);
            }
        } else {
            this.field2730--;
        }
        this.field2732.method964(false, arg1, arg0);
        this.field2741.method567(arg1, 0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLsf;I)Li;")
    public static final class56 method914(boolean arg0, class131 arg1, int arg2) {
        field2723++;
        if (class119.method910(arg1, true, arg2)) {
            if (arg0) {
                field2734 = null;
            }
            return class60.method451((byte) 99);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method915(int arg0) {
        field2739 = null;
        field2719 = null;
        field2728 = null;
        field2738 = null;
        if (arg0 <= 119) {
            method916(null, false, null, 82);
        }
        field2725 = null;
        field2729 = null;
        field2720 = null;
        field2734 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lae;ZLfa;I)V")
    public static final void method916(class6 arg0, boolean arg1, class37 arg2, int arg3) {
        field2735++;
        byte[] var4 = null;
        class121 var5 = class131.field3026;
        synchronized (class131.field3026) {
            for (class102 var6 = (class102) class131.field3026.method920((byte) 114); var6 != null; var6 = (class102) class131.field3026.method932(-6)) {
                if ((long) arg3 == var6.field365 && var6.field2321 == arg2 && var6.field2323 == 0) {
                    var4 = var6.field2330;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method268(arg3, 0);
            arg0.method20(var7, arg2, arg1, (byte) 63, arg3);
        } else {
            arg0.method20(var4, arg2, true, (byte) 63, arg3);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)Lgd;")
    public final class46 method917(long arg0, int arg1) {
        field2727++;
        class46 var4 = (class46) this.field2732.method969(arg0, arg1 ^ 0x5F);
        if (var4 != null) {
            this.field2741.method567(var4, 0);
        }
        return arg1 == -1 ? var4 : null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvd;")
    public static final class150 method918(Throwable arg0, String arg1) {
        field2721++;
        class150 var2;
        if (arg0 instanceof class150) {
            var2 = (class150) arg0;
            var2.field3448 = var2.field3448 + ' ' + arg1;
        } else {
            var2 = new class150(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method919(byte arg0) {
        while (true) {
            class46 var2 = this.field2741.method562((byte) -118);
            if (var2 == null) {
                field2736++;
                this.field2730 = this.field2737;
                if (arg0 != -104) {
                    field2722 = 48L;
                    return;
                }
                return;
            }
            var2.method172(arg0 - 2554);
            var2.method339(90);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2737 = arg0;
        this.field2730 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2732 = new class127(var2);
    }
}

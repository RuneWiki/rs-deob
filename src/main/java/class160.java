import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class160 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Ltj;")
    private class10 field2601 = new class10();

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    private int field2608;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lmj;")
    private class144 field2604;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2605 = "glow2:";

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[Lub;")
    public static class169[] field2602 = new class169[14];

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2612 = "Loaded interfaces";

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
    public static boolean field2600 = false;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2617 = "";

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2618 = "K";

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2616 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Luc;")
    public static class115 field2598;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BJ)V")
    public final void method1154(byte arg0, long arg1) {
        field2611++;
        class291 var4 = (class291) this.field2604.method1063((byte) -122, arg1);
        if (var4 != null) {
            var4.method1074((byte) -118);
            var4.method827((byte) -98);
            this.field2608++;
        }
        if (arg0 != -61) {
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method1155(long arg0, boolean arg1) {
        field2603++;
        class291 var4 = (class291) this.field2604.method1063((byte) -49, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method953((byte) -69);
        if (var5 == null) {
            var4.method1074((byte) 20);
            var4.method827((byte) -98);
            this.field2608++;
            return null;
        }
        if (var4.method954((byte) -40)) {
            class224 var6 = new class224(var5);
            this.field2604.method1064(var6, var4.field2406, (byte) -128);
            this.field2601.method70(3, var6);
            var6.field1727 = 0L;
            var4.method1074((byte) -122);
            var4.method827((byte) -98);
        } else {
            this.field2601.method70(3, var4);
            var4.field1727 = 0L;
        }
        return arg1 ? var5 : null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method1156(int arg0) {
        field2599++;
        if (arg0 >= -47) {
            return;
        }
        for (class291 var2 = (class291) this.field2601.method62(0); var2 != null; var2 = (class291) this.field2601.method66((byte) 62)) {
            if (var2.method954((byte) -121)) {
                var2.method1074((byte) -121);
                var2.method827((byte) -98);
                this.field2608++;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method1157(int arg0) {
        field2607++;
        this.field2601.method58((byte) 34);
        this.field2604.method1060(58);
        this.field2608 = this.field2613;
        if (arg0 != 760) {
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field2605 = null;
        field2612 = null;
        field2602 = null;
        if (arg0 != 14) {
            field2612 = null;
        }
        field2618 = null;
        field2598 = null;
        field2617 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)I")
    public static final int method1159(byte arg0, int arg1, int arg2) {
        field2597++;
        class194 var3 = (class194) class139.field2322.method1063((byte) -30, (long) arg2);
        if (arg0 != 40) {
            method1158(-87);
        }
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field3173.length > arg1) {
            return var3.field3173[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
    public final int method1160(byte arg0) {
        field2610++;
        int var2 = 0;
        if (arg0 != -118) {
            this.method1157(-78);
        }
        for (class291 var3 = (class291) this.field2601.method62(0); var3 != null; var3 = (class291) this.field2601.method66((byte) 119)) {
            if (!var3.method954((byte) -22)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
    public final void method1161(Object arg0, byte arg1, long arg2) {
        field2614++;
        this.method1154((byte) -61, arg2);
        if (this.field2608 == 0) {
            class291 var5 = (class291) this.field2601.method67(10136);
            var5.method1074((byte) -120);
            var5.method827((byte) -98);
        } else {
            this.field2608--;
        }
        if (arg1 > -104) {
            this.method1157(-44);
        }
        class224 var6 = new class224(arg0);
        this.field2604.method1064(var6, arg2, (byte) -127);
        this.field2601.method70(3, var6);
        var6.field1727 = 0L;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method1162(byte arg0) {
        field2615++;
        class200.field3264 = 0;
        int var1 = 40 % ((29 - arg0) / 41);
        int var2 = (class48.field878.field2849 >> 7) + class256.field4082;
        int var3 = (class48.field878.field2887 >> 7) + class170.field2787;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class200.field3264 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class200.field3264 = 1;
        }
        if (class200.field3264 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class200.field3264 = 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        this.field2608 = arg0;
        int var2 = 1;
        this.field2613 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field2604 = new class144(var2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public final void method1163(int arg0, boolean arg1) {
        field2606++;
        if (arg1) {
            method1162((byte) 116);
        }
        if (class137.field2300 == null) {
            return;
        }
        for (class291 var3 = (class291) this.field2601.method62(0); var3 != null; var3 = (class291) this.field2601.method66((byte) -79)) {
            if (var3.method954((byte) -119)) {
                if (var3.method953((byte) -102) == null) {
                    var3.method1074((byte) 33);
                    var3.method827((byte) -98);
                    this.field2608++;
                }
            } else if ((long) arg0 < ++var3.field1727) {
                class291 var4 = class137.field2300.method692(var3, true);
                this.field2604.method1064(var4, var3.field2406, (byte) -124);
                class269.method1827(var3, -19, var4);
                var3.method1074((byte) -117);
                var3.method827((byte) -98);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lra;")
    private class119 field3209 = new class119();

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lwf;")
    private class159 field3213 = new class159();

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    private int field3216;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lgf;")
    private class48 field3217;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lv;")
    private static class146 field3200 = class159.method1226((byte) -37, "Cancel");

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lv;")
    public static class146 field3203 = class159.method1226((byte) -37, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lv;")
    public static class146 field3210 = field3200;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lv;")
    public static class146 field3201 = class159.method1226((byte) -37, "M");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lv;")
    public static class146 field3206 = null;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Lea;")
    public static final class30 method1044(int arg0, boolean arg1) {
        field3204++;
        class30 var2 = (class30) class37.field837.method1045((long) arg0, 123);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field3201 = null;
        }
        byte[] var3 = class98.field2380.method585(3, 79, arg0);
        class30 var4 = new class30();
        if (var3 != null) {
            var4.method203(-6, new class95(var3));
        }
        class37.field837.method1047(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lra;")
    public final class119 method1045(long arg0, int arg1) {
        field3205++;
        int var4 = -123 % ((arg1 - 79) / 33);
        class119 var5 = (class119) this.field3217.method332((byte) -79, arg0);
        if (var5 != null) {
            this.field3213.method1230(34, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field3210 = null;
        field3201 = null;
        field3200 = null;
        field3206 = null;
        field3203 = null;
        if (arg0 != 6) {
            method1046(42);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILra;J)V")
    public final void method1047(int arg0, class119 arg1, long arg2) {
        if (~this.field3216 == arg0) {
            class119 var5 = this.field3213.method1231(true);
            var5.method217(-1264);
            var5.method909((byte) -102);
            if (this.field3209 == var5) {
                class119 var6 = this.field3213.method1231(true);
                var6.method217(-1264);
                var6.method909((byte) -104);
            }
        } else {
            this.field3216--;
        }
        this.field3217.method336(arg2, arg1, -8899);
        this.field3213.method1230(34, arg1);
        field3199++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V")
    public final void method1048(long arg0, boolean arg1) {
        field3207++;
        class119 var4 = (class119) this.field3217.method332((byte) -79, arg0);
        if (!arg1) {
            field3200 = null;
        }
        if (var4 != null) {
            var4.method217(-1264);
            var4.method909((byte) -126);
            this.field3216++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lv;")
    public static final class146 method1049(int arg0, int arg1, int arg2) {
        int var3 = 111 % ((32 - arg1) / 61);
        int var4 = arg2 - arg0;
        field3214++;
        if (var4 < -9) {
            return class120.field2795;
        } else if (var4 < -6) {
            return class49.field1124;
        } else if (var4 < -3) {
            return class152.field3502;
        } else if (var4 < 0) {
            return class66.field1487;
        } else if (var4 > 9) {
            return class60.field1381;
        } else if (var4 > 6) {
            return class107.field2570;
        } else if (var4 > 3) {
            return class59.field1375;
        } else if (var4 > 0) {
            return class72.field1693;
        } else {
            return class6.field144;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public final void method1050(boolean arg0) {
        field3212++;
        while (true) {
            class119 var2 = this.field3213.method1231(arg0);
            if (var2 == null) {
                this.field3216 = this.field3215;
                if (arg0) {
                    return;
                } else {
                    method1044(93, false);
                    return;
                }
            }
            var2.method217(-1264);
            var2.method909((byte) -119);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
    public class140(int arg0) {
        int var2 = 1;
        this.field3216 = arg0;
        this.field3215 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field3217 = new class48(var2);
    }
}

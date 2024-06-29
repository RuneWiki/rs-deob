import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class188 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lle;")
    private class171 field3351 = new class171();

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lij;")
    private class242 field3363 = new class242();

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Lge;")
    private class235 field3361;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lha;")
    public static class46 field3354 = class271.method1828(": ", -46);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
    public static int[] field3355 = new int[128];

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lwf;")
    public static class16 field3356 = new class16(500);

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[Lie;")
    public static class44[] field3364 = new class44[50];

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lha;")
    public static class46 field3367 = class271.method1828("0", -46);

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lha;")
    public static class46 field3366 = class271.method1828("_labels", -46);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lhi;")
    public static class24 field3350;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method1363(int arg0) {
        this.field3363.method1665(1502);
        field3359++;
        int var2 = 51 % ((26 - arg0) / 34);
        this.field3361.method1599(25);
        this.field3351 = new class171();
        this.field3362 = this.field3360;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(JI)Lle;")
    public final class171 method1364(long arg0, int arg1) {
        field3358++;
        class171 var4 = (class171) this.field3361.method1601(arg1 ^ 0xFFFFAA2E, arg0);
        if (arg1 != -21987) {
            this.method1367((byte) -121);
        }
        if (var4 != null) {
            this.field3363.method1664(-107, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Lcj;")
    public final class69 method1365(int arg0) {
        field3353++;
        if (arg0 != -8846) {
            this.method1365(54);
        }
        return this.field3361.method1591(arg0 + 8963);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLle;J)V")
    public final void method1366(boolean arg0, class171 arg1, long arg2) {
        if (this.field3362 == 0) {
            class171 var5 = this.field3363.method1660(-78);
            var5.method501(0);
            var5.method1219(64);
            if (this.field3351 == var5) {
                class171 var6 = this.field3363.method1660(-84);
                var6.method501(0);
                var6.method1219(64);
            }
        } else {
            this.field3362--;
        }
        this.field3361.method1597(arg2, (byte) -126, arg1);
        field3352++;
        this.field3363.method1664(-121, arg1);
        if (!arg0) {
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Lcj;")
    public final class69 method1367(byte arg0) {
        int var2 = -6 % ((arg0 + 49) / 40);
        field3349++;
        return this.field3361.method1592(false);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static void method1368(byte arg0) {
        field3356 = null;
        field3364 = null;
        field3367 = null;
        field3354 = null;
        field3350 = null;
        field3366 = null;
        field3355 = null;
        if (arg0 >= -89) {
            field3355 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        this.field3362 = arg0;
        this.field3360 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3361 = new class235(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lhb;")
    private class44 field484 = new class44();

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lkc;")
    private class63 field494 = new class63();

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Li;")
    private class48 field493;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "La;")
    private static class1 field487 = class113.method934(-11538, "Drop");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "La;")
    public static class1 field488 = field487;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lfe;")
    public static class36 field489 = new class36(5000);

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field496 = 5063219;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "La;")
    public static class1 field502 = class113.method934(-11538, "@or1@");

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "La;")
    private static class1 field507 = class113.method934(-11538, "Classic");

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "La;")
    public static class1 field506 = class113.method934(-11538, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Z")
    public static boolean field505 = false;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "La;")
    public static class1 field500 = class113.method934(-11538, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "La;")
    private static class1 field503 = class113.method934(-11538, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "La;")
    public static class1 field498 = field503;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "La;")
    public static class1 field508 = field507;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static volatile int field497 = -1;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static volatile int field495 = 0;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lcb;")
    public static class15 field501 = new class15(200);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lbd;")
    public static class11 field504;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJLhb;)V", line = 14)
    public final void method263(int arg0, long arg1, class44 arg2) {
        if (this.field491 == 0) {
            class44 var5 = this.field494.method600(536857847);
            var5.method742(-1);
            var5.method470(arg0 ^ 0xFFFFE3D8);
            if (this.field484 == var5) {
                class44 var6 = this.field494.method600(536857847);
                var6.method742(-1);
                var6.method470(0);
            }
        } else {
            this.field491--;
        }
        field482++;
        this.field493.method500(arg2, (byte) -115, arg1);
        if (arg0 == -7208) {
            this.field494.method601(102, arg2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JB)Lhb;", line = 50)
    public final class44 method264(long arg0, byte arg1) {
        field486++;
        class44 var4 = (class44) this.field493.method501(arg0, 6120);
        if (arg1 < 39) {
            field508 = null;
        }
        if (var4 != null) {
            this.field494.method601(114, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JI)V", line = 75)
    public final void method265(long arg0, int arg1) {
        field481++;
        if (arg1 <= 94) {
            this.method264(30L, (byte) 20);
        }
        class44 var4 = (class44) this.field493.method501(arg0, 6120);
        if (var4 != null) {
            var4.method742(-1);
            var4.method470(0);
            this.field491++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 101)
    public static final void method266(boolean arg0) {
        class72.field1760.method268((byte) 108);
        if (!arg0) {
            method269(true, null, null, null);
        }
        field485++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 121)
    public static void method267(int arg0) {
        field488 = null;
        field508 = null;
        field487 = null;
        field507 = null;
        int var1 = -70 % ((32 - arg0) / 43);
        field503 = null;
        field506 = null;
        field489 = null;
        field500 = null;
        field501 = null;
        field504 = null;
        field502 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 143)
    public final void method268(byte arg0) {
        while (true) {
            class44 var2 = this.field494.method600(536857847);
            if (var2 == null) {
                field490++;
                this.field491 = this.field492;
                int var3 = 115 / ((-arg0 - 2) / 33);
                return;
            }
            var2.method742(-1);
            var2.method470(0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLbd;Lbd;Lbd;)V", line = 179)
    public static final void method269(boolean arg0, class11 arg1, class11 arg2, class11 arg3) {
        class119.field2969 = arg1;
        if (arg0) {
            field499 = -101;
        }
        class35.field940 = arg3;
        field483++;
        class47.field1243 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V", line = 210)
    public class15(int arg0) {
        this.field492 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field491 = arg0;
        this.field493 = new class48(var2);
    }
}

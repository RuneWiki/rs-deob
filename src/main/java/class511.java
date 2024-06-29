import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class511 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Z")
    public boolean field7419 = false;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Leda;")
    private class14 field7414 = new class14(64);

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Leda;")
    public class14 field7423 = new class14(500);

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Leda;")
    public class14 field7427 = new class14(30);

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Leda;")
    public class14 field7428 = new class14(50);

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
    public boolean field7415;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Lla;")
    private class422 field7421;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Lla;")
    public class422 field7417;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lql;")
    public static class104 field7409 = new class104(14, 0);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lql;")
    public static class104 field7420 = new class104(15, 4);

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lql;")
    public static class104 field7422 = new class104(16, -2);

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lql;")
    public static class104 field7424 = new class104(17, 0);

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Lql;")
    public static class104 field7425 = new class104(18, -2);

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Lql;")
    public static class104 field7426 = new class104(19, -2);

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lql;")
    public static class104 field7429 = new class104(20, 6);

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lql;")
    public static class104 field7431 = new class104(21, 9);

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Lql;")
    public static class104 field7432 = new class104(22, -2);

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Lql;")
    public static class104 field7433 = new class104(23, 4);

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Lql;")
    public static class104 field7434 = new class104(24, -1);

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "Lql;")
    public static class104 field7435 = new class104(26, 0);

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Lql;")
    public static class104 field7436 = new class104(27, 0);

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Lql;")
    public static class104 field7437 = new class104(28, -2);

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[Lql;")
    private static class104[] field7438 = new class104[32];

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method3066(int arg0, int arg1) {
        field7411++;
        this.field7430 = arg0;
        if (arg1 != 32) {
            return;
        }
        class14 var3 = this.field7423;
        synchronized (this.field7423) {
            this.field7423.method76(-126);
        }
        class14 var4 = this.field7427;
        synchronized (this.field7427) {
            this.field7427.method76(22);
        }
        class14 var5 = this.field7428;
        synchronized (this.field7428) {
            this.field7428.method76(7);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    public final void method3067(int arg0, byte arg1) {
        field7413++;
        if (arg1 < -59) {
            this.field7414 = new class14(arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public final void method3068(int arg0, boolean arg1) {
        field7406++;
        if (this.field7419 == arg1) {
            return;
        }
        this.field7419 = arg1;
        this.method3073(false);
        if (arg0 <= 3) {
            method3075(-64);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZIIZ)I")
    public static final int method3069(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field7407++;
        class33 var5 = class446.method2724(arg3, arg2 ^ 0x1A, arg1);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg2 != 19) {
            field7437 = null;
        }
        while (var5.field311.length > var7) {
            if (var5.field311[var7] >= 0 && class556.field7917.field1228 > var5.field311[var7]) {
                class688 var8 = class556.field7917.method741(117, var5.field311[var7]);
                int var9 = var8.method3837(arg0, class382.field5728.method1997((byte) 120, arg0).field3339, (byte) -126);
                if (arg4) {
                    var6 += var5.field310[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
    public final void method3070(boolean arg0, int arg1) {
        field7410++;
        if (this.field7415 == arg0) {
            return;
        }
        this.field7415 = arg0;
        if (arg1 < 112) {
            this.method3073(true);
        }
        this.method3073(false);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(ZI)V")
    public final void method3071(boolean arg0, int arg1) {
        class14 var3 = this.field7414;
        synchronized (this.field7414) {
            this.field7414.method68(-16878, arg1);
        }
        field7412++;
        class14 var4 = this.field7423;
        synchronized (this.field7423) {
            this.field7423.method68(-16878, arg1);
        }
        class14 var5 = this.field7427;
        synchronized (this.field7427) {
            if (arg0) {
                this.field7417 = null;
            }
            this.field7427.method68(-16878, arg1);
        }
        class14 var6 = this.field7428;
        synchronized (this.field7428) {
            this.field7428.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method3072(int arg0) {
        int var2 = -56 / ((29 - arg0) / 52);
        class14 var3 = this.field7414;
        synchronized (this.field7414) {
            this.field7414.method71((byte) 44);
        }
        field7405++;
        class14 var4 = this.field7423;
        synchronized (this.field7423) {
            this.field7423.method71((byte) 44);
        }
        class14 var5 = this.field7427;
        synchronized (this.field7427) {
            this.field7427.method71((byte) 44);
        }
        class14 var6 = this.field7428;
        synchronized (this.field7428) {
            this.field7428.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public final void method3073(boolean arg0) {
        field7418++;
        if (arg0) {
            return;
        }
        class14 var2 = this.field7414;
        synchronized (this.field7414) {
            this.field7414.method76(97);
        }
        class14 var3 = this.field7423;
        synchronized (this.field7423) {
            this.field7423.method76(-109);
        }
        class14 var4 = this.field7427;
        synchronized (this.field7427) {
            this.field7427.method76(-123);
        }
        class14 var5 = this.field7428;
        synchronized (this.field7428) {
            this.field7428.method76(98);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Ljl;")
    public final class595 method3074(int arg0, int arg1) {
        field7408++;
        class14 var3 = this.field7414;
        class595 var4;
        synchronized (this.field7414) {
            var4 = (class595) this.field7414.method80((byte) -60, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field7421;
        byte[] var6;
        synchronized (this.field7421) {
            var6 = this.field7421.method2624(arg0, class677.method3771(arg1, (byte) 126), class18.method111((byte) 53, arg1));
        }
        class595 var7 = new class595();
        var7.field8423 = this;
        var7.field8386 = arg1;
        if (var6 != null) {
            var7.method3420(new class301(var6), (byte) 96);
        }
        var7.method3412((byte) 75);
        if (var7.field8418) {
            var7.field8383 = false;
            var7.field8368 = 0;
        }
        if (!this.field7415 && var7.field8421) {
            var7.field8374 = null;
            var7.field8434 = null;
        }
        class14 var8 = this.field7414;
        synchronized (this.field7414) {
            this.field7414.method67((long) arg1, var7, arg0 ^ 0xFFFFE58C);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method3075(int arg0) {
        field7426 = null;
        field7435 = null;
        field7433 = null;
        field7438 = null;
        field7436 = null;
        field7424 = null;
        field7409 = null;
        field7425 = null;
        if (arg0 != -15292) {
            method3069(-83, false, -34, 10, true);
        }
        field7422 = null;
        field7437 = null;
        field7420 = null;
        field7431 = null;
        field7432 = null;
        field7434 = null;
        field7429 = null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lcr;IZLla;Lla;)V")
    public class511(class292 arg0, int arg1, boolean arg2, class422 arg3, class422 arg4) {
        this.field7415 = arg2;
        this.field7421 = arg3;
        this.field7417 = arg4;
        if (this.field7421 != null) {
            int var6 = this.field7421.method2628(-116) - 1;
            this.field7421.method2615(0, var6);
        }
    }

    static {
        class104[] var0 = class36.method205(40);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field7438[var0[var1].field1540] = var0[var1];
        }
    }
}

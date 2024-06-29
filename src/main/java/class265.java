import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class265 {

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Lka;")
    private class473 field3555 = new class473(16);

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Ldk;")
    private class421 field3564;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lmg;")
    public static class530 field3566 = new class530();

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lsn;")
    public static class205 field3567 = new class205(5, 16);

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Lrb;")
    public static class283 field3568 = new class283(53, 0);

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lrb;")
    public static class283 field3569 = new class283(14, 0);

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lmg;")
    public static class530 field3570 = new class530();

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
    public final void method1555(int arg0, byte arg1) {
        if (arg1 <= 90) {
            return;
        }
        field3558++;
        class473 var3 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZ)I")
    public static final int method1556(int arg0, int arg1, int arg2, boolean arg3) {
        field3559++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (!arg3) {
            return 50;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        field3568 = null;
        int var1 = 21 % ((arg0 - 50) / 48);
        field3566 = null;
        field3570 = null;
        field3567 = null;
        field3569 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1558(int arg0, int arg1, boolean arg2) {
        field3557++;
        if (!arg2) {
            field3572 = 101;
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
    public static final boolean method1559(int arg0, int arg1) {
        int var2 = -88 % ((-arg1 - 62) / 52);
        field3562++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method1560(int arg0) {
        class473 var2 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method2774((byte) 104);
            if (arg0 != -9816) {
                field3566 = null;
            }
        }
        field3565++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lkb;")
    public static final class139 method1561(int arg0, int arg1) {
        field3563++;
        class139[] var2 = class311.method1797(false);
        if (arg1 >= -21) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class139 var4 = var2[var3];
            if (var4.field2082 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILjq;II)Lmh;")
    public final class112 method1562(int arg0, int arg1, int arg2, class367 arg3, int arg4, int arg5) {
        field3561++;
        class216[] var7 = null;
        if (arg0 != 0) {
            return null;
        }
        class86 var8 = this.method1563(arg4, arg0 ^ 0x1D);
        if (var8.field1406 != null) {
            var7 = new class216[var8.field1406.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class331 var10 = arg3.method2194(-8039, var8.field1406[var9]);
                var7[var9] = new class216(var10.field4495, var10.field4508, var10.field4504, var10.field4507, var10.field4506, var10.field4503, var10.field4497, var10.field4493);
            }
        }
        return new class112(var8.field1407, var7, var8.field1404, arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Lnp;")
    private final class86 method1563(int arg0, int arg1) {
        field3554++;
        class473 var3 = this.field3555;
        class86 var4;
        synchronized (this.field3555) {
            var4 = (class86) this.field3555.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field3564;
        byte[] var6;
        synchronized (this.field3564) {
            var6 = this.field3564.method2512(arg1, (byte) -93, arg0);
        }
        class86 var7 = new class86();
        if (var6 != null) {
            var7.method726((byte) 3, new class319(var6));
        }
        class473 var8 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method2777(arg1 ^ 0xFFFFFBE2, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILdk;Ldk;Ldk;Ldk;)V")
    public static final void method1564(int arg0, class421 arg1, class421 arg2, class421 arg3, class421 arg4) {
        class41.field614 = arg2;
        class390.field5633 = arg1;
        class517.field7593 = arg4;
        if (arg0 > -65) {
            field3566 = null;
        }
        class10.field120 = arg3;
        field3560++;
        class505.field7387 = new class444[class41.field614.method2493((byte) -41)][];
        class210.field3004 = new boolean[class41.field614.method2493((byte) -41)];
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public final void method1565(int arg0) {
        field3556++;
        class473 var2 = this.field3555;
        synchronized (this.field3555) {
            this.field3555.method2764(-769);
            if (arg0 != -1) {
                method1556(24, -76, 3, false);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class265(class12 arg0, int arg1, class421 arg2) {
        this.field3564 = arg2;
        this.field3564.method2509(0, 29);
    }
}

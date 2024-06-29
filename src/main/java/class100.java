import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class100 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[Ltl;")
    private class403[] field1453;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[[I")
    public static int[][] field1451 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
    public static int[] field1460 = new int[50];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "J")
    private long field1458;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Ldf;")
    public static class252 field1462;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Ltl;")
    private class403 field1456;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)Ltl;")
    public final class403 method613(int arg0, long arg1) {
        field1455++;
        if (arg0 != 2327) {
            this.field1458 = -32L;
        }
        this.field1458 = arg1;
        class403 var4 = this.field1453[(int) (arg1 & (long) (this.field1463 - 1))];
        for (this.field1456 = var4.field5529; this.field1456 != var4; this.field1456 = this.field1456.field5529) {
            if (this.field1456.field5532 == arg1) {
                class403 var5 = this.field1456;
                this.field1456 = this.field1456.field5529;
                return var5;
            }
        }
        this.field1456 = null;
        return null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Ltl;")
    public final class403 method614(int arg0) {
        if (arg0 != 12) {
            return null;
        }
        field1464++;
        if (this.field1456 == null) {
            return null;
        }
        class403 var2 = this.field1453[(int) ((long) (this.field1463 - 1) & this.field1458)];
        while (this.field1456 != var2) {
            if (this.field1456.field5532 == this.field1458) {
                class403 var3 = this.field1456;
                this.field1456 = this.field1456.field5529;
                return var3;
            }
            this.field1456 = this.field1456.field5529;
        }
        this.field1456 = null;
        return null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        field1451 = null;
        if (!arg0) {
            method616(46, false);
        }
        field1462 = null;
        field1460 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I")
    public static final int method616(int arg0, boolean arg1) {
        if (!arg1) {
            field1451 = null;
        }
        field1452++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJLtl;)V")
    public final void method617(int arg0, long arg1, class403 arg2) {
        field1457++;
        if (arg2.field5534 != null) {
            arg2.method2441((byte) -115);
        }
        class403 var5 = this.field1453[(int) (arg1 & (long) (this.field1463 - 1))];
        arg2.field5534 = var5.field5534;
        arg2.field5529 = var5;
        arg2.field5534.field5529 = arg2;
        arg2.field5529.field5534 = arg2;
        if (arg0 != 5) {
            field1462 = null;
        }
        arg2.field5532 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
    public static final void method618(byte arg0, int arg1) {
        if (arg0 != -85) {
            field1451 = null;
        }
        field1459++;
        if (arg1 != -1 && class248.field3308[arg1]) {
            class47.field639.method708(0, arg1);
            class146.field2099[arg1] = null;
            class392.field5437[arg1] = null;
            class248.field3308[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        this.field1463 = arg0;
        this.field1453 = new class403[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class403 var3 = this.field1453[var2] = new class403();
            var3.field5529 = var3;
            var3.field5534 = var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lwm;I)V")
    public static final void method619(class364 arg0, int arg1) {
        if (class385.field5334) {
            class32.method196(122, arg0);
        } else {
            class448.method2639(4, arg0);
        }
        if (arg1 != 1) {
            field1460 = null;
        }
        field1454++;
    }
}

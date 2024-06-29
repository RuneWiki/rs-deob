import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class175 extends class72 implements class85 {

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Z")
    private boolean field2741 = false;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    private int field2748 = 50;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Lvl;")
    private class73 field2747;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Lvl;")
    private class73 field2742;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Lke;")
    private class106 field2746;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lke;")
    private class106 field2738;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lke;")
    public static class106 field2754 = new class106(16);

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field2758 = -2;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "Ljf;")
    public static class216 field2756 = new class216(16);

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field2761 = 0;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2762 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Lv;")
    public static class67 field2763 = new class67(5000);

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Lvl;")
    public static class73 field2757;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)Z")
    public final boolean method578(byte arg0, int arg1) {
        field2745++;
        if (arg0 > -104) {
            this.method581((byte) 45, 89);
        }
        return this.method135(1714, arg1).field162;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(BI)Z")
    public final boolean method581(byte arg0, int arg1) {
        int var3 = -95 % ((26 - arg0) / 42);
        field2753++;
        return this.field2741 || this.method135(1714, arg1).field156;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(II)V")
    public final void method1246(int arg0, int arg1) {
        field2755++;
        if (arg1 != 255) {
            field2759 = -59;
        }
        for (class267 var3 = (class267) this.field2746.method710(32029); var3 != null; var3 = (class267) this.field2746.method705(-9491)) {
            if (var3.field4341) {
                var3.method1861(arg0);
                var3.field4341 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public final void method1247(int arg0) {
        field2752++;
        if (arg0 != 65535) {
            field2760 = 123;
        }
        this.field2746.method708(false);
        if (this.field2738 != null) {
            this.field2738.method708(false);
        }
        class267.field4335 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Z")
    public final boolean method579(int arg0, int arg1) {
        field2750++;
        if (arg0 <= 126) {
            this.method1249(-30, false);
        }
        return !this.method135(1714, arg1).field147;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)I")
    public final int method577(byte arg0, int arg1) {
        if (arg0 <= 121) {
            field2763 = null;
        }
        field2749++;
        return this.method135(1714, arg1).field160 & 0xFFFF;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lvl;Lvl;Lvl;IZ)V")
    public class175(class73 arg0, class73 arg1, class73 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2748 = arg3;
        this.field2747 = arg0;
        this.field2742 = arg2;
        this.field2741 = arg4;
        this.field2746 = new class106(this.field2748);
        this.field2738 = null;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(BI)Lud;")
    private final class267 method1248(byte arg0, int arg1) {
        field2751++;
        class267 var3 = (class267) this.field2746.method707((long) arg1, (byte) 63);
        if (var3 != null) {
            return var3;
        }
        int var4 = 92 / ((41 - arg0) / 35);
        byte[] var5 = this.field2747.method501(-2, 0, arg1);
        if (var5 == null) {
            return null;
        } else {
            class267 var6 = new class267(new class170(var5));
            this.field2746.method712(false, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIF)[I")
    public final int[] method580(int arg0, int arg1, float arg2) {
        if (arg1 != 65535) {
            return null;
        }
        field2744++;
        class267 var4 = this.method1248((byte) 115, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field4341 = true;
            return var4.method1860(this, this.field2742, arg2, this.field2741 || this.method135(arg1 ^ 0xF94D, arg0).field156);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZF)Lff;")
    public final class48 method576(int arg0, int arg1, int arg2, boolean arg3, float arg4) {
        field2740++;
        int var6 = 0 / ((46 - arg1) / 37);
        class267 var7 = this.method1248((byte) 106, arg2);
        if (var7 != null && var7.method1863(this, this.field2742)) {
            return arg3 ? var7.field4342.method225(this, arg0, (double) arg4, false, arg0, -110, this.field2742) : var7.field4342.method227(7015, this, this.field2742, arg0, (double) arg4, arg0, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)Lqd;")
    public final class40 method477(int arg0, int arg1) {
        field2739++;
        class267 var3 = this.method1248((byte) 121, arg0);
        if (arg1 > -86) {
            this.method581((byte) 40, -59);
        }
        return var3 == null ? null : var3.field4342;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
    public final void method1249(int arg0, boolean arg1) {
        field2743++;
        this.field2741 = arg1;
        int var3 = 26 / ((arg0 + 56) / 41);
        this.method1247(65535);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        field2763 = null;
        field2754 = null;
        field2762 = null;
        field2757 = null;
        if (arg0 != -106) {
            method1250((byte) -61);
        }
        field2756 = null;
    }
}

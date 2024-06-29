import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class696 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lpa;")
    private class387 field9828 = new class387(64);

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field9837 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lcb;")
    private class544 field9833;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field9829;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field9826 = 0;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field9830 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "J")
    public static long field9827 = -1L;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field9832 = new int[4096];

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
    public static int[] field9839 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3921(byte arg0) {
        field9835++;
        class458.field6564 = true;
        if (arg0 != -21) {
            method3924((byte) -110, 77, 124, 102, -54);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Lg;", line = 16)
    public final class164 method3922(byte arg0, int arg1) {
        field9840++;
        class387 var3 = this.field9828;
        class164 var4;
        synchronized (this.field9828) {
            var4 = (class164) this.field9828.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -1) {
            this.field9833 = null;
        }
        class544 var5 = this.field9833;
        byte[] var6;
        synchronized (this.field9833) {
            var6 = this.field9833.method3150(arg1, 33, 4);
        }
        class164 var7 = new class164();
        var7.field2404 = this;
        var7.field2401 = arg1;
        if (var6 != null) {
            var7.method1279(0, new class120(var6));
        }
        var7.method1281(true);
        class387 var8 = this.field9828;
        synchronized (this.field9828) {
            this.field9828.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 51)
    public final void method3923(int arg0) {
        class387 var2 = this.field9828;
        synchronized (this.field9828) {
            this.field9828.method2369(-1);
        }
        field9836++;
        if (arg0 < 66) {
            field9826 = 67;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIII)V", line = 69)
    public static final void method3924(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field9838++;
        if (arg0 != 101) {
            method3927((byte) -72);
        }
        int var5 = class667.field9389;
        int var6 = class419.field5898;
        if (class607.field8578) {
            var5 += class17.method143(-128);
            var6 += class638.method3629(19728);
        }
        if (class575.field8137 == 1) {
            class112 var7 = class140.field1798[class235.field3406 / 100];
            var7.method785(var5 - 8, var6 - 8);
            class651.method3726(var6 - 8, 82, var6 + var7.method792() - 8, var5 + -8, var5 + var7.method781() - 8);
        }
        if (class575.field8137 == 2) {
            class112 var8 = class140.field1798[(class235.field3406 / 100) + 4];
            var8.method785(var5 - 8, var6 + -8);
            class651.method3726(var6 - 8, 47, var8.method792() + var6 - 8, var5 + -8, var8.method781() + var5 - 8);
        }
        class609.method3510(false);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 111)
    public final void method3925(int arg0) {
        field9831++;
        int var2 = -119 % ((arg0 + 4) / 41);
        class387 var3 = this.field9828;
        synchronized (this.field9828) {
            this.field9828.method2364(1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 158)
    public class696(class106 arg0, int arg1, class544 arg2) {
        this.field9833 = arg2;
        this.field9829 = this.field9833.method3147(4, -107);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 140)
    public final void method3926(int arg0, boolean arg1) {
        field9834++;
        class387 var3 = this.field9828;
        synchronized (this.field9828) {
            if (arg1) {
                this.method3922((byte) 18, 44);
            }
            this.field9828.method2366(arg0, 118);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 175)
    public static void method3927(byte arg0) {
        if (arg0 < 72) {
            method3921((byte) 71);
        }
        field9832 = null;
        field9839 = null;
    }
}

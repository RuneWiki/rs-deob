import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class103 implements class316 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lfk;")
    public static class144 field1871 = new class144(512);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lfk;")
    public static class144 field1875 = new class144(16);

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field1878 = -1;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Loh;")
    public static class258 field1877 = class153.method1046("blinken3:", 101);

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public static int[] field1879 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field1876 = 0;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
    public static boolean field1880 = false;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Z")
    public static boolean field1881 = false;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 5)
    public static void method778(int arg0) {
        field1877 = null;
        field1871 = null;
        field1879 = null;
        if (arg0 != 0) {
            field1880 = false;
        }
        field1875 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IJI)Loh;", line = 31)
    public final class258 method779(int arg0, int[] arg1, long arg2, int arg3) {
        if (arg0 != -29496) {
            field1882 = -50;
        }
        field1873++;
        if (arg3 == 0) {
            class210 var6 = class265.method1855(arg1[0], 104);
            return var6.method1383(arg0 + 29490, (int) arg2);
        } else if (arg3 == 1 || arg3 == 10) {
            class61 var7 = class186.method1256((byte) 115, (int) arg2);
            return var7.field1053;
        } else if (arg3 == 6 || arg3 == 7) {
            return class265.method1855(arg1[0], 92).method1383(-6, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 73)
    public static final void method780(byte arg0) {
        field1874++;
        if (arg0 != 91) {
            method781(-78, (class171) null, 122, false);
        }
        class233.field4036.method1157(4);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILs;IZ)V", line = 88)
    public static final void method781(int arg0, class171 arg1, int arg2, boolean arg3) {
        if (arg1.field3069 == 0) {
            arg1.field3020 = arg1.field2938;
        } else if (arg1.field3069 == 1) {
            arg1.field3020 = (arg0 - arg1.field3002) / 2 + arg1.field2938;
        } else if (arg1.field3069 == 2) {
            arg1.field3020 = arg0 - arg1.field3002 - arg1.field2938;
        } else if (arg1.field3069 == 3) {
            arg1.field3020 = arg1.field2938 * arg0 >> 14;
        } else if (arg1.field3069 == 4) {
            arg1.field3020 = (arg0 - arg1.field3002) / 2 + (arg1.field2938 * arg0 >> 14);
        } else {
            arg1.field3020 = arg0 - arg1.field3002 - (arg1.field2938 * arg0 >> 14);
        }
        if (arg3) {
            method781(124, (class171) null, 83, false);
        }
        if (arg1.field3013 == 0) {
            arg1.field2912 = arg1.field3007;
        } else if (arg1.field3013 == 1) {
            arg1.field2912 = (arg2 - arg1.field3054) / 2 + arg1.field3007;
        } else if (arg1.field3013 == 2) {
            arg1.field2912 = arg2 - arg1.field3007 - arg1.field3054;
        } else if (arg1.field3013 == 3) {
            arg1.field2912 = arg1.field3007 * arg2 >> 14;
        } else if (arg1.field3013 == 4) {
            arg1.field2912 = (arg1.field3007 * arg2 >> 14) + (arg2 - arg1.field3054) / 2;
        } else {
            arg1.field2912 = arg2 - (arg1.field3007 * arg2 >> 14) - arg1.field3054;
        }
        if (class166.field2823 && (client.method354(arg1) != 0 || arg1.field2936 == 0)) {
            if (arg1.field2912 < 0) {
                arg1.field2912 = 0;
            } else if ((arg1.field3054 + arg1.field2912) > arg2) {
                arg1.field2912 = arg2 - arg1.field3054;
            }
            if (arg1.field3020 < 0) {
                arg1.field3020 = 0;
            } else if (arg1.field3020 + arg1.field3002 > arg0) {
                arg1.field3020 = arg0 - arg1.field3002;
            }
        }
        field1872++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILqj;)V", line = 164)
    public static final void method782(int arg0, class231 arg1) {
        class124 var2 = (class124) class205.field3542.method986(arg1.field4007.method1769(16), arg0);
        field1870++;
        if (var2 == null) {
            class207.method1366(arg1.field959[0], class272.field4704, arg1.field975[0], 0, (class107) null, arg1, (class101) null, arg0 + 128);
        } else {
            var2.method902((byte) -124);
        }
    }
}

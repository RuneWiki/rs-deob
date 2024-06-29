import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class292 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lmh;")
    public static class128 field4985 = class22.method156(123, "(U2");

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lmh;")
    private static class128 field4989 = class22.method156(127, "Dec");

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lmh;")
    private static class128 field4992 = class22.method156(124, "Feb");

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lmh;")
    private static class128 field4988 = class22.method156(123, "Jul");

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lmh;")
    private static class128 field4995 = class22.method156(122, "Apr");

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lmh;")
    public static class128 field4991 = class22.method156(125, "unzap");

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lmh;")
    private static class128 field5000 = class22.method156(127, "Aug");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lmh;")
    private static class128 field4984 = class22.method156(126, "Nov");

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lmh;")
    private static class128 field4990 = class22.method156(123, "Oct");

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[Z")
    public static boolean[] field4999 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lmh;")
    public static class128 field5003 = class22.method156(125, "(U(Y");

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Lmh;")
    private static class128 field5004 = class22.method156(123, "Mar");

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field5001 = 0;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lmh;")
    public static class128 field5007 = class22.method156(127, "Mem:");

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lmh;")
    private static class128 field4986 = class22.method156(122, "Sep");

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lmh;")
    private static class128 field5002 = class22.method156(126, "May");

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lmh;")
    private static class128 field5006 = class22.method156(123, "Jan");

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lmh;")
    private static class128 field4994 = class22.method156(122, "Jun");

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[Lmh;")
    public static class128[] field4998 = new class128[] { field5006, field4992, field5004, field4995, field5002, field4994, field4988, field5000, field4986, field4990, field4984, field4989 };

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Ldj;")
    public static class314 field4996;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 64)
    public static void method2005(byte arg0) {
        field4986 = null;
        field4991 = null;
        field4995 = null;
        field5000 = null;
        field4988 = null;
        field4984 = null;
        field4996 = null;
        field5007 = null;
        field4989 = null;
        field4994 = null;
        field4999 = null;
        field4992 = null;
        field5004 = null;
        field4990 = null;
        field4998 = null;
        field5006 = null;
        field5003 = null;
        int var1 = 113 % ((arg0 - 23) / 60);
        field4985 = null;
        field5002 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Lle;", line = 113)
    public static final class234 method2006(byte arg0, int arg1) {
        field4987++;
        class234 var2 = (class234) class212.field3755.method1443((long) arg1, false);
        if (var2 != null) {
            return var2;
        } else if (arg0 > -12) {
            return (class234) null;
        } else {
            byte[] var3 = class263.field4563.method2155(arg1, 5, (byte) 70);
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1610(-1, new class194(var3));
            }
            class212.field3755.method1442(-1, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[B", line = 148)
    public static final synchronized byte[] method2007(int arg0, int arg1) {
        field4993++;
        if (arg0 == 100 && class248.field4274 > 0) {
            byte[] var2 = class192.field3332[--class248.field4274];
            class192.field3332[class248.field4274] = null;
            return var2;
        }
        if (arg1 != 0) {
            method2005((byte) -34);
        }
        if (arg0 == 5000 && class266.field4623 > 0) {
            byte[] var3 = class1.field33[--class266.field4623];
            class1.field33[class266.field4623] = null;
            return var3;
        } else if (arg0 == 30000 && class310.field5259 > 0) {
            byte[] var4 = class303.field5143[--class310.field5259];
            class303.field5143[class310.field5259] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Lmh;", line = 183)
    public static final class128 method2008(int arg0, int arg1, int arg2) {
        field4997++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return client.field4151;
        } else if (var3 < -6) {
            return class53.field1029;
        } else if (var3 < -3) {
            return class17.field494;
        } else if (var3 >= 0) {
            if (arg0 != -18955) {
                field4998 = (class128[]) null;
            }
            if (var3 > 9) {
                return class90.field1534;
            } else if (var3 > 6) {
                return class223.field3917;
            } else if (var3 <= 3) {
                return var3 <= 0 ? class221.field3886 : class115.field1930;
            } else {
                return class51.field998;
            }
        } else {
            return class97.field1678;
        }
    }
}

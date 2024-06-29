import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[B")
    public static byte[] field1667 = new byte[520];

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[[I")
    public static int[][] field1666 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Le;I)V", line = 18)
    public static final void method746(class159 arg0, int arg1) {
        class224 var2 = (class224) class94.field1538.method1827(arg0.field2495.method209(arg1 - 126), 0);
        if (arg1 != 8) {
            method747((class82) null, -44);
        }
        if (var2 != null) {
            if (var2.field3537 != null) {
                class301.field5195.method1313(var2.field3537);
                var2.field3537 = null;
            }
            var2.method1006(arg1 ^ 0xFFFFFC08);
        }
        field1663++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwa;I)V", line = 40)
    public static final void method747(class82 arg0, int arg1) {
        if (class299.field5144 != null) {
            try {
                class299.field5144.method336(-117, 0L);
                class299.field5144.method335(arg0.field1280, arg0.field1301, -903171152, 24);
            } catch (Exception var3) {
            }
        }
        field1660++;
        if (arg1 >= 45) {
            arg0.field1301 += 24;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 67)
    public static void method748(int arg0) {
        field1666 = (int[][]) null;
        field1667 = null;
        if (arg0 != -17413) {
            field1661 = 77;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)V", line = 81)
    public static final void method749(boolean arg0, int arg1) {
        field1664++;
        class120 var2 = class293.method2059(4, 4, arg1);
        var2.method823(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lpb;", line = 92)
    public static final class78 method750(int arg0, int arg1) {
        if (arg0 != 4) {
            method748(95);
        }
        field1659++;
        class78 var2 = (class78) class127.field1967.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field1918.method1889(class264.method1856(arg1, -51), (byte) -122, class316.method2194(arg1, (byte) 110));
        class78 var4 = new class78();
        var4.field1226 = arg1;
        if (var3 != null) {
            var4.method559(6219, new class82(var3));
        }
        var4.method556(arg0 - 2120);
        if (!class42.field693 && var4.field1184) {
            var4.field1192 = null;
        }
        if (var4.field1191) {
            var4.field1239 = 0;
            var4.field1179 = false;
        }
        class127.field1967.method1978((byte) -114, var4, (long) arg1);
        return var4;
    }
}

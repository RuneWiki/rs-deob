import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class class72 extends class95 {

    @OriginalMember(owner = "hc", name = "cb", descriptor = "[J")
    public static long[] field1392 = new long[500];

    @OriginalMember(owner = "hc", name = "gb", descriptor = "[I")
    public static int[] field1396 = new int[50];

    @OriginalMember(owner = "hc", name = "mb", descriptor = "Llf;")
    public static class109 field1402 = class35.method275("<)4col>", 2);

    @OriginalMember(owner = "hc", name = "fb", descriptor = "Ltf;")
    public static class181 field1395 = new class181();

    @OriginalMember(owner = "hc", name = "nb", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "hc", name = "ab", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "hc", name = "bb", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "hc", name = "db", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "hc", name = "eb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "hc", name = "hb", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "hc", name = "ib", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "hc", name = "jb", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "hc", name = "kb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "hc", name = "lb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "hc", name = "ob", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "hc", name = "pb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "hc", name = "c", descriptor = "(Z)V")
    public static void method455(boolean arg0) {
        field1396 = null;
        field1402 = null;
        if (arg0) {
            method455(false);
        }
        field1395 = null;
        field1392 = null;
    }

    @OriginalMember(owner = "hc", name = "b", descriptor = "(I)Lue;")
    public final class189 method177(int arg0) {
        int var2 = 38 / ((arg0 - 61) / 46);
        field1393++;
        return class128.method926(this.field1399, -4).method524(-115, null, 0, this.field1391);
    }

    @OriginalMember(owner = "hc", name = "c", descriptor = "(I)V")
    public static final void method456(int arg0) {
        field1390++;
        for (int var1 = -1; var1 < class157.field2956; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class125.field2405[var1];
            }
            class184 var3 = class202.field3975[var2];
            if (var3 != null) {
                class40.method292((byte) 58, var3, 1);
            }
        }
        if (arg0 != 1) {
            field1392 = null;
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(II)Lac;")
    public static final class4 method457(int arg0, int arg1) {
        field1398++;
        class4 var2 = (class4) class105.field2065.method1086((long) arg1, -100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field3049.method147(0, arg1, 8);
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method18(false, new class86(var3));
        }
        class105.field2065.method1082((long) arg1, -117, var4);
        return arg0 == 1 ? var4 : null;
    }
}

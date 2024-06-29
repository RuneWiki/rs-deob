import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class64 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Llc;")
    private static class143 field1206 = class66.method374("Take", -1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Llc;")
    public static class143 field1204 = field1206;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Llc;")
    public static class143 field1208 = class66.method374("www)2wtqa", -1);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lng;")
    public static class139 field1205 = new class139(50);

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Llc;")
    private static class143 field1213 = class66.method374("Face here", -1);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Llc;")
    public static class143 field1210 = field1213;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method363(boolean arg0) {
        field1210 = null;
        field1205 = null;
        if (arg0) {
            field1204 = null;
            field1206 = null;
            field1208 = null;
            field1213 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)Llc;")
    public static final class143 method364(byte arg0, long arg1) {
        field1212++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            if (arg0 != 97) {
                method366(true, 98);
            }
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class104.field1823[(int) (var8 - (arg1 * 37L))];
            }
            class143 var7 = new class143();
            var7.field2503 = var6;
            var7.field2548 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method365(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field1211++;
        if (arg1 != 0) {
            field1205 = null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method366(boolean arg0, int arg1) {
        field1207++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class122.field2147[arg1];
        if (arg0) {
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1002;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Llc;")
    public static final class143 method367(int arg0, int arg1) {
        field1209++;
        class143 var2 = class274.method1806(arg0, true);
        for (int var3 = var2.method913((byte) 45) - 3; var3 > 0; var3 -= 3) {
            var2 = class25.method179(0, new class143[] { var2.method896(var3, 0, false), class18.field315, var2.method863(var3, -161) });
        }
        if (arg1 != -4) {
            return null;
        } else if (var2.method913((byte) 45) > 9) {
            return class25.method179(0, new class143[] { class173.field3111, var2.method896(var2.method913((byte) 45) - 8, 0, false), class54.field1049, class245.field4407, var2, class192.field3522 });
        } else if (var2.method913((byte) 45) > 6) {
            return class25.method179(0, new class143[] { class269.field4817, var2.method896(var2.method913((byte) 45) - 4, 0, false), class244.field4377, class245.field4407, var2, class192.field3522 });
        } else {
            return class25.method179(0, new class143[] { class287.field5039, var2, class218.field3987 });
        }
    }
}

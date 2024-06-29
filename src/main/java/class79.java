import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lai;")
    public static class10 field1388 = class44.method278("", -8);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lai;")
    private static class10 field1396 = class44.method278(" more options", -37);

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lai;")
    public static class10 field1398 = field1396;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lai;")
    private static class10 field1392 = class44.method278("Walk here", -6);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lai;")
    public static class10 field1397 = field1392;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field1395;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method487(byte arg0) {
        field1388 = null;
        field1397 = null;
        field1392 = null;
        field1398 = null;
        field1396 = null;
        if (arg0 == 99) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method488(int arg0, int arg1) {
        field1393++;
        if (arg0 == 100 && class101.field1888 > 0) {
            byte[] var2 = class118.field2276[--class101.field1888];
            class118.field2276[class101.field1888] = null;
            return var2;
        }
        if (arg1 <= 47) {
            field1389 = -2;
        }
        if (arg0 == 5000 && class71.field1227 > 0) {
            byte[] var3 = class29.field431[--class71.field1227];
            class29.field431[class71.field1227] = null;
            return var3;
        } else if (arg0 == 30000 && class9.field109 > 0) {
            byte[] var4 = class47.field813[--class9.field109];
            class47.field813[class9.field109] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lc;II)Llf;")
    public static final class106 method489(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method140((byte) -97, arg1);
        field1390++;
        if (var3 == null) {
            return null;
        } else {
            if (arg2 >= -95) {
                field1388 = null;
            }
            return new class106(var3);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public static boolean field1258 = false;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public static boolean field1261 = false;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lv;")
    private static class122 field1271 = class55.method425(-103, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1264 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[[[Lfc;")
    public static class34[][][] field1260 = new class34[4][104][104];

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "J")
    public static volatile long field1275 = 0L;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lv;")
    public static class122 field1266 = field1271;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lv;")
    public static class122 field1276 = class55.method425(-108, "@yel@");

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static int[] field1262 = new int[50];

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1279 = 1;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lv;")
    public static class122 field1281 = class55.method425(-58, "title)3jpg");

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lk;")
    public class60 field1259;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lk;")
    public class60 field1270;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lk;")
    public class60 field1273;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lmb;")
    public static class74 field1278;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
    public static int[][] field1257;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method397(int arg0, byte arg1) {
        if (arg1 != -103) {
            field1266 = null;
        }
        field1274++;
        class72.method589(21951, false, arg0, null, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 18)
    public static void method398(int arg0) {
        field1276 = null;
        if (arg0 != 104) {
            return;
        }
        field1257 = null;
        field1281 = null;
        field1278 = null;
        field1260 = null;
        field1271 = null;
        field1266 = null;
        field1262 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 60)
    public static final void method399(int arg0) {
        field1277++;
        if (arg0 != 0) {
            return;
        }
        if (class74.field1938 > 0) {
            class36.method317(123);
        } else {
            class76.method641(40, true);
            class81.field2122 = class66.field1686;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Lrc;", line = 122)
    public static final class105 method400(int arg0) {
        field1263++;
        if (arg0 != 40) {
            method399(77);
        }
        class105 var1 = new class105(class45.field1169, class89.field2271, class60.field1542, class82.field2142, class118.field2838);
        class61.method469(arg0 ^ 0x69);
        return var1;
    }
}

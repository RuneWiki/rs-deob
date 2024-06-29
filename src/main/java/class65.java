import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class24 {

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lqf;")
    public static class117 field1342 = class72.method514(120, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AN<gt>");

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    public static int field1354 = 128;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lqf;")
    public static class117 field1355 = class72.method514(108, "T");

    @OriginalMember(owner = "client!jc", name = "qb", descriptor = "Lqf;")
    private static class117 field1362 = class72.method514(115, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
    public static int field1359 = -1;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lqf;")
    public static class117 field1347 = field1362;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Ljava/lang/Object;")
    public static Object field1346 = new Object();

    @OriginalMember(owner = "client!jc", name = "sb", descriptor = "Lqf;")
    private static class117 field1364 = class72.method514(104, "white:");

    @OriginalMember(owner = "client!jc", name = "ub", descriptor = "Lqf;")
    public static class117 field1366 = class72.method514(112, ")1p");

    @OriginalMember(owner = "client!jc", name = "tb", descriptor = "Lqf;")
    public static class117 field1365 = field1364;

    @OriginalMember(owner = "client!jc", name = "vb", descriptor = "Lqf;")
    public static class117 field1367 = field1364;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jc", name = "ob", descriptor = "Lqf;")
    public class117 field1360;

    @OriginalMember(owner = "client!jc", name = "rb", descriptor = "Ll;")
    public static class76 field1363;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "[I")
    public int[] field1341;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "[I")
    public int[] field1356;

    @OriginalMember(owner = "client!jc", name = "pb", descriptor = "[Lqf;")
    public class117[] field1361;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method461(byte[] arg0, int arg1) {
        field1349++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class109.method822(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lqf;ILqf;Ljb;)Lgd;")
    public static final class46 method462(class117 arg0, int arg1, class117 arg2, class64 arg3) {
        if (arg1 == 99) {
            int var4 = arg3.method447((byte) 82, arg2);
            int var5 = arg3.method449(true, var4, arg0);
            field1344++;
            return class141.method1092(arg3, var4, var5, (byte) -48);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(JZ)V")
    public static final void method463(long arg0, boolean arg1) {
        field1358++;
        if (arg0 == 0L) {
            return;
        }
        if (class75.field1651 >= 100 && class16.field237 != 1 || class75.field1651 >= 200) {
            class93.method739(0, 0, class104.field2520, class141.field3351);
            return;
        }
        class117 var3 = class116.method900(arg0, 126).method945(-124);
        for (int var4 = 0; var4 < class75.field1651; var4++) {
            if (class101.field2439[var4] == arg0) {
                class93.method739(0, 0, class73.method530((byte) -83, new class117[] { var3, class45.field902 }), class141.field3351);
                return;
            }
        }
        for (int var5 = 0; var5 < class128.field3029; var5++) {
            if (class134.field3195[var5] == arg0) {
                class93.method739(0, 0, class73.method530((byte) -83, new class117[] { class78.field1763, var3, class99.field2398 }), class141.field3351);
                return;
            }
        }
        if (arg1) {
            field1367 = null;
        }
        if (var3.method918(class141.field3395.field356, 113)) {
            return;
        }
        class67.field1401[class75.field1651] = var3;
        class101.field2439[class75.field1651] = arg0;
        class50.field1063[class75.field1651] = 0;
        class42.field829++;
        class31.field660[class75.field1651] = 0;
        class75.field1651++;
        class97.field2362 += 32;
        class139.field3310 = true;
        class99.field2373.method961(118, -1198);
        class99.field2373.method606(arg0, (byte) 120);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static final void method464(byte arg0) {
        field1350++;
        class110.field2598.method250((byte) -54);
        class153.field3792.method250((byte) -54);
        if (arg0 <= 94) {
            method462(null, 80, null, null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public static void method465(boolean arg0) {
        field1363 = null;
        field1347 = null;
        field1346 = null;
        field1364 = null;
        field1366 = null;
        field1367 = null;
        field1365 = null;
        field1355 = null;
        if (arg0) {
            field1355 = null;
        }
        field1362 = null;
        field1342 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
    public static final int method466(int arg0, int arg1, int arg2) {
        field1339++;
        if (arg2 > -46) {
            return 61;
        } else {
            long var3 = (long) ((arg0 << 16) + arg1);
            return class103.field2496 != null && class103.field2496.field1495 == var3 ? class146.field3575.field1691 * 99 / (class146.field3575.field1748.length - class103.field2496.field509) + 1 : 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Z")
    public static final boolean method467(int arg0, int arg1) {
        field1357++;
        if (arg0 != 17417) {
            field1363 = null;
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLjb;Lqf;Lqf;)[Lr;")
    public static final class118[] method468(boolean arg0, class64 arg1, class117 arg2, class117 arg3) {
        field1345++;
        int var4 = arg1.method447((byte) 61, arg2);
        int var5 = arg1.method449(arg0, var4, arg3);
        return class115.method893(var5, arg1, var4, 0);
    }
}

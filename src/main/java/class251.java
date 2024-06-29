import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class251 extends class125 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Loa;")
    private static class99 field4328 = class221.method1463(2844, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Loa;")
    public static class99 field4324 = field4328;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field4325 = -1;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Loa;")
    public static class99 field4329 = class221.method1463(2844, "blinken1:");

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field4338 = 0;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Loa;")
    public static class99 field4342 = class221.method1463(2844, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Loa;")
    public static class99 field4339 = class221.method1463(2844, "runes");

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Loa;")
    public static class99 field4332 = class221.method1463(2844, "0");

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "[Loa;")
    public static class99[] field4344 = new class99[1000];

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
    public int[] field4326;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
    public int[] field4334;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
    public int[] field4335;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "[Loh;")
    public class275[] field4327;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "[Loh;")
    public class275[] field4346;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[[[B")
    public byte[][][] field4333;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method1624(boolean arg0) {
        field4344 = null;
        field4328 = null;
        field4339 = null;
        field4324 = null;
        if (!arg0) {
            method1627(-13, -7, 90);
        }
        field4329 = null;
        field4342 = null;
        field4332 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    public static final boolean method1625(int arg0, int arg1) {
        if (arg0 != 0) {
            field4342 = null;
        }
        class145.field2571 = arg1 + 1 & 0xFFFF;
        field4341++;
        class202.field3524 = true;
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)Loa;")
    public static final class99 method1626(int arg0, int arg1, boolean arg2) {
        if (arg1 == -1001) {
            field4337++;
            return class259.method1685(arg2, 10, arg0, 8798);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lcg;")
    public static final class167 method1627(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class167 var4 = var3.field3762;
            var3.field3762 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZJ)V")
    public static final void method1628(boolean arg0, long arg1) {
        if (!arg0) {
            method1628(true, -85L);
        }
        field4340++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class82.field1450; var3++) {
            if (class71.field1203[var3] == arg1) {
                class82.field1450--;
                for (int var4 = var3; var4 < class82.field1450; var4++) {
                    class57.field955[var4] = class57.field955[var4 + 1];
                    class54.field891[var4] = class54.field891[var4 + 1];
                    class64.field1082[var4] = class64.field1082[var4 + 1];
                    class71.field1203[var4] = class71.field1203[var4 + 1];
                    class269.field4735[var4] = class269.field4735[var4 + 1];
                    class89.field1533[var4] = class89.field1533[var4 + 1];
                }
                class172.field3048++;
                class290.field5084 = class28.field514;
                class131.field2277.method966((byte) 49, 138);
                class131.field2277.method1699(arg1, 5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
    public static final void method1629(int arg0, int arg1) {
        class65.field1108 = -1;
        class217.field3775 = arg1;
        field4345++;
        class44.field775 = arg0;
        class132.method888(0);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)V")
    public static final void method1630(boolean arg0) {
        field4330++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class258.field4497 - 1); var2++) {
                if (class258.field4502[var2] < 1000 && class258.field4502[var2 + 1] > 1000) {
                    var1 = false;
                    class99 var3 = class122.field2147[var2];
                    class122.field2147[var2] = class122.field2147[var2 + 1];
                    class122.field2147[var2 + 1] = var3;
                    class99 var4 = class219.field3812[var2];
                    class219.field3812[var2] = class219.field3812[var2 + 1];
                    class219.field3812[var2 + 1] = var4;
                    int var5 = class258.field4495[var2];
                    class258.field4495[var2] = class258.field4495[var2 + 1];
                    class258.field4495[var2 + 1] = var5;
                    int var6 = class83.field1451[var2];
                    class83.field1451[var2] = class83.field1451[var2 + 1];
                    class83.field1451[var2 + 1] = var6;
                    short var7 = class258.field4502[var2];
                    class258.field4502[var2] = class258.field4502[var2 + 1];
                    class258.field4502[var2 + 1] = var7;
                    long var8 = class249.field4293[var2];
                    class249.field4293[var2] = class249.field4293[var2 + 1];
                    class249.field4293[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V")
    public static final void method1631(int arg0, int arg1) {
        if (arg1 == -1) {
            field4347++;
            class38.field657.method1809(arg0, (byte) -17);
        }
    }
}

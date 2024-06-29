import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class273 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field4767 = new int[200];

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[S")
    public static short[] field4774 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lha;")
    public static class46 field4769 = class271.method1828("<col=00ff00>", -46);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4768 = 0;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field4775 = 0;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lha;")
    public static class46 field4779 = class271.method1828(" zuerst von Ihrer Freunde)2Liste(Q", -46);

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[Lrk;")
    public static class179[] field4766;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[[B")
    public static byte[][] field4765;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lwe;B)Lqa;")
    public static final class68 method1842(class75 arg0, byte arg1) {
        if (arg1 != -67) {
            method1847(118, -58, 46);
        }
        field4780++;
        return new class68(arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method559(-1), arg0.method559(arg1 ^ 0x42), arg0.method558(1));
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
    public static final boolean method1843(int arg0, int arg1, int arg2) {
        int var3 = class109.field2037[arg0][arg1][arg2];
        if (-class61.field1027 == var3) {
            return false;
        } else if (class61.field1027 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class128.method993(var4 + 1, class119.field2228[arg0][arg1][arg2], var5 + 1) && class128.method993(var4 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg2], var5 + 1) && class128.method993(var4 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class128.method993(var4 + 1, class119.field2228[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class109.field2037[arg0][arg1][arg2] = class61.field1027;
                return true;
            } else {
                class109.field2037[arg0][arg1][arg2] = -class61.field1027;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILwe;)V")
    private final void method1844(int arg0, int arg1, class75 arg2) {
        if (arg1 < 48) {
            return;
        }
        field4776++;
        if (arg0 == 1) {
            this.field4778 = arg2.method545((byte) 98);
            this.field4770 = arg2.method558(1);
            this.field4771 = arg2.method558(1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLwe;)V")
    public final void method1845(byte arg0, class75 arg1) {
        field4773++;
        int var3 = 15 % ((-arg0 - 22) / 52);
        while (true) {
            int var4 = arg1.method558(1);
            if (var4 == 0) {
                return;
            }
            this.method1844(var4, 114, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method1846(int arg0) {
        class207.field3713.method84(-32377);
        if (arg0 >= -30) {
            method1846(-8);
        }
        field4777++;
        class240.field4266.method84(-32377);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)Lpd;")
    public static final class168 method1847(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class168 var4 = var3.field3606;
            var3.field3606 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method1848(int arg0, int arg1) {
        int var2 = 18 % ((arg0 - 46) / 46);
        field4772++;
        class80 var3 = (class80) class126.field2308.method1601(-105, (long) arg1);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field1522.length; var4++) {
                var3.field1522[var4] = -1;
                var3.field1526[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method1849(boolean arg0) {
        field4766 = null;
        field4769 = null;
        field4779 = null;
        field4774 = null;
        field4767 = null;
        field4765 = null;
        if (arg0) {
            method1846(23);
        }
    }
}

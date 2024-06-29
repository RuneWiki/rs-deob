import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 extends class34 {

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "[I")
    public static int[] field48 = new int[2];

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "Lpk;")
    public static class237 field39;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "[Lji;")
    public static class256[] field41;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "[[[Ljc;")
    public static class201[][][] field40;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)Ln;")
    public static final class283 method40(int arg0) {
        if (arg0 != 0) {
            method44((class237) null, (byte) -11, (class237) null);
        }
        field38++;
        return class90.field1362;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public static void method41(int arg0) {
        field40 = null;
        field48 = null;
        if (arg0 == -13258) {
            field41 = null;
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II)Lul;")
    public static final class188 method42(int arg0, int arg1) {
        field42++;
        class188 var2 = (class188) class244.field3783.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        int var3 = -38 % ((arg0 + 77) / 33);
        byte[] var4 = class169.field2495.method1605(-128, class37.method290((byte) -69, arg1), class85.method656(arg1, (byte) 125));
        class188 var5 = new class188();
        var5.field2742 = arg1;
        if (var4 != null) {
            var5.method1240((byte) -103, new class54(var4));
        }
        var5.method1251(5);
        if (!class4.field55 && var5.field2763) {
            var5.field2737 = null;
        }
        if (var5.field2781) {
            var5.field2785 = 0;
            var5.field2730 = false;
        }
        class244.field3783.method941(var5, (long) arg1, -8447);
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            return null;
        } else {
            field37++;
            return class112.field1716;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lpk;BLpk;)V")
    public static final void method44(class237 arg0, byte arg1, class237 arg2) {
        class160.field2331 = arg0;
        class259.field3977 = arg2;
        if (arg1 > 69) {
            field45++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method45(long arg0, int arg1) {
        field43++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            StringBuffer var6 = new StringBuffer(var5);
            if (arg1 != -13798) {
                return null;
            }
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class24.field392[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}

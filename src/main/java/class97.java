import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class97 extends class77 {

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lr;")
    public class185 field1704;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Ldc;")
    public static class37 field1691 = class185.method1233((byte) 86, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!j", name = "K", descriptor = "Z")
    public static boolean field1696 = false;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "[I")
    public static int[] field1697 = new int[4096];

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field1698 = 0;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Ldc;")
    public static class37 field1702 = class185.method1233((byte) 86, "headicons_pk");

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public static final void method644(boolean arg0) {
        class5.field42 = null;
        class166.field3162 = null;
        class174.field3308 = null;
        class238.field4336 = null;
        class7.field77 = null;
        class217.field4040 = null;
        if (!arg0) {
            field1702 = null;
        }
        field1705++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILmf;I)Ldc;")
    public static final class37 method645(int arg0, class136 arg1, int arg2) {
        field1700++;
        if (!class135.method941(13417, class107.method699(arg1, 105), arg0) && arg1.field2626 == null) {
            return null;
        }
        if (arg2 != 1) {
            field1691 = null;
        }
        if (arg1.field2531 == null || arg0 >= arg1.field2531.length || arg1.field2531[arg0] == null || arg1.field2531[arg0].method332(91).method334(arg2 ^ 0xFFFFFFC2) == 0) {
            return class168.field3198 ? class80.method548(new class37[] { class101.field1746, class151.method1034((byte) -9, arg0) }, -30) : null;
        } else {
            return arg1.field2531[arg0];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method646(int arg0, Random arg1, int arg2) {
        field1699++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class59.method451(arg2, (byte) 120)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg0 != 12402) {
                return -94;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class91.method601(1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        field1702 = null;
        field1691 = null;
        if (arg0) {
            field1697 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILwa;II)Ljc;")
    public static final class100 method648(int arg0, class238 arg1, int arg2, int arg3) {
        field1694++;
        return class192.method1278(arg1, arg3, arg0, arg2) ? class19.method131((byte) -69) : null;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(Z)V")
    public static final void method649(boolean arg0) {
        class176.field3337.method760((byte) 24);
        if (!arg0) {
            class197.field3690 = null;
            class105.field1820 = 1;
            field1692++;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmf;I)Lmf;")
    public static final class136 method650(class136 arg0, int arg1) {
        field1703++;
        class136 var2 = class10.method67((byte) 79, arg0);
        int var3 = -68 / ((arg1 - 79) / 38);
        if (var2 == null) {
            var2 = arg0.field2631;
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
    public static final void method651(int arg0, boolean arg1) {
        if (arg0 != 1848041696) {
            method647(true);
        }
        class152.field2886 = new int[104];
        field1693++;
        class65.field1172 = 99;
        class67.field1208 = new int[104];
        class10.field138 = new int[104];
        class124.field2219 = new int[104];
        class86.field1519 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class145.field2774 = new byte[var2][104][104];
        class95.field1676 = new byte[var2][104][104];
        class193.field3608 = new byte[var2][104][104];
        class106.field1836 = new byte[var2][104][104];
        class119.field2135 = new int[var2][105][105];
        class190.field3521 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lr;)V")
    public class97(class185 arg0) {
        this.field1704 = arg0;
    }
}

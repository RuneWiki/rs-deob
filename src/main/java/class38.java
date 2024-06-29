import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class38 extends class89 {

    @OriginalMember(owner = "client!og", name = "W", descriptor = "Lha;")
    public static class46 field671 = class271.method1828(")2", -46);

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field668 = 127;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "[J")
    public static long[] field677 = new long[1000];

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Lha;")
    private static class46 field676 = class271.method1828("Loaded title screen", -46);

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Lha;")
    public static class46 field666 = field676;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class38() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        field674++;
        int var3 = -74 / ((arg1 - 51) / 44);
        return class259.field4523;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field676 = null;
        field677 = null;
        field671 = null;
        if (arg0 != -33) {
            field669 = 103;
        }
        field666 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmf;IBI)V")
    public static final void method256(class26 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field2575 == arg1 && arg1 != -1) {
            class170 var4 = class119.method951(0, arg1);
            int var5 = var4.field3035;
            if (var5 == 1) {
                arg0.field2528 = 0;
                arg0.field2579 = 0;
                arg0.field2570 = 0;
                arg0.field2533 = arg3;
                class146.method1084(arg0.field2546, var4, 73, arg0.field2585, false, arg0.field2579);
            }
            if (var5 == 2) {
                arg0.field2528 = 0;
            }
        } else if (arg1 == -1 || arg0.field2575 == -1 || class119.method951(0, arg1).field3044 >= class119.method951(0, arg0.field2575).field3044) {
            arg0.field2549 = arg0.field2547;
            arg0.field2579 = 0;
            arg0.field2570 = 0;
            arg0.field2575 = arg1;
            arg0.field2528 = 0;
            arg0.field2533 = arg3;
            if (arg0.field2575 != -1) {
                class146.method1084(arg0.field2546, class119.method951(0, arg0.field2575), 97, arg0.field2585, false, arg0.field2579);
            }
        }
        field678++;
        if (arg2 != 36) {
            method259(113, 46, -19, (class181) null, (class181) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -1) {
            return;
        }
        field672++;
        int var6 = class15.method77(arg4, class4.field70, class70.field1205, -96);
        int var7 = class15.method77(arg5, class4.field70, class70.field1205, -34);
        int var8 = class15.method77(arg1, class135.field2445, class73.field1309, -106);
        int var9 = class15.method77(arg2, class135.field2445, class73.field1309, -73);
        for (int var10 = var6; var10 <= var7; var10++) {
            class24.method170((byte) 33, var8, class6.field100[var10], var9, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZII)V")
    public static final void method258(int arg0, boolean arg1, int arg2, int arg3) {
        field673++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class265.field4606 = arg2;
        class124.field2287 = arg0;
        int var4 = 6 % ((-arg3 - 30) / 43);
        class60.field997 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILpi;Lpi;)Lwg;")
    public static final class22 method259(int arg0, int arg1, int arg2, class181 arg3, class181 arg4) {
        field670++;
        if (class146.method1083(arg4, arg2, arg0, (byte) 28)) {
            return arg1 < 102 ? null : class65.method453(-31, arg3.method1293(arg0, arg2, (byte) 66));
        } else {
            return null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class103 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lce;")
    private static class126 field1649 = class206.method1445(-7923, "Please wait)3)3)3");

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lce;")
    public static class126 field1646 = field1649;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Loh;")
    public static class169 field1645 = new class169(5000);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[Ljk;")
    public static class273[] field1643;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBI)I", line = 4)
    public static final int method700(int arg0, int arg1, byte arg2, int arg3) {
        field1648++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (arg2 != 89) {
            return -119;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 27)
    public static void method701(byte arg0) {
        field1643 = null;
        int var1 = 57 / ((arg0 - 28) / 39);
        field1646 = null;
        field1649 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 53)
    public static final void method702(int arg0, int arg1, int arg2) {
        class254.field4275[arg1] = arg0;
        class44 var3 = (class44) class265.field4471.method1631(false, (long) arg1);
        field1652++;
        if (var3 == null) {
            class44 var4 = new class44(4611686018427387905L);
            class265.field4471.method1636(11311, var4, (long) arg1);
        } else if (var3.field688 != 4611686018427387905L) {
            var3.field688 = class261.method1765(16299) + 500L | 0x4000000000000000L;
        }
        if (arg2 != -16598) {
            field1645 = (class169) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Lr;", line = 103)
    public static final class69 method703(int arg0, int arg1) {
        field1647++;
        class69 var2 = (class69) class76.field1223.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class254.field4282.method2173(arg1, arg0, (byte) -56);
        class69 var4 = new class69();
        if (var3 != null) {
            var4.method509(arg0, (byte) -53, new class134(var3));
        }
        class76.field1223.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)I", line = 124)
    public static final int method704(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        if (arg0 != 30924) {
            field1645 = (class169) null;
        }
        field1644++;
        return (arg2 >> 2 << 10) + (arg3 >> 5 << 7) + (arg1 >> 1);
    }
}

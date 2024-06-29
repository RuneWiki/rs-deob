import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class164 {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[J")
    public static long[] field2790 = new long[32];

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lhd;")
    public static class214 field2793 = new class214(4096);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "J")
    public long field2787;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Laf;")
    public class208 field2795;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lpe;")
    public static class245 field2797;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method1093(int arg0) {
        field2790 = null;
        field2793 = null;
        field2797 = null;
        if (arg0 != 1) {
            field2797 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public static final void method1094(int arg0, int arg1) {
        class253.field4417.method1796(20, arg0);
        field2794++;
        if (arg1 != 0) {
            method1096(99, (class121) null);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public static final void method1095() {
        for (int var0 = 0; var0 < class100.field1665; var0++) {
            class100 var1 = class4.field89[var0];
            class212.method1412(var1);
            class4.field89[var0] = null;
        }
        class100.field1665 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILqd;)V")
    public static final void method1096(int arg0, class121 arg1) {
        field2789++;
        int var2 = -1;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1975 == 0) {
            var3 = class230.method1528(arg1.field1983, arg1.field1981, arg1.field1986);
        }
        if (arg1.field1975 == 1) {
            var3 = class262.method1779(arg1.field1983, arg1.field1981, arg1.field1986);
        }
        if (arg0 != Integer.MAX_VALUE) {
            return;
        }
        if (arg1.field1975 == 2) {
            var3 = class189.method1312(arg1.field1983, arg1.field1981, arg1.field1986);
        }
        if (arg1.field1975 == 3) {
            var3 = class123.method800(arg1.field1983, arg1.field1981, arg1.field1986);
        }
        if (var3 != 0L) {
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
            var5 = ((int) var3 & 0x370F61) >> 20;
            var6 = (int) var3 >> 14 & 0x1F;
        }
        arg1.field1976 = var6;
        arg1.field1991 = var2;
        arg1.field1988 = var5;
    }
}

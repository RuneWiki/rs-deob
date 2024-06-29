import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class168 extends class262 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field2832;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Lhd;")
    public static class117 field2833 = new class117(64);

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lok;")
    public static class146 field2841 = class235.method1724(-12908, ")4j");

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "[I")
    public static int[] field2842 = new int[200];

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lok;")
    public static class146 field2843 = class235.method1724(-12908, "Jeter");

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Lmg;")
    public static class151 field2845 = new class151();

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Loh;")
    public static class15 field2844;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Loh;")
    public static class15 field2846;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lhe;")
    public static class90 field2840;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method1297(byte arg0, int arg1) {
        field2837++;
        if (arg1 == -1 || !class272.method1992(2306, arg1)) {
            return;
        }
        class264[] var2 = class92.field1459[arg1];
        int var3 = 0;
        if (arg0 <= 26) {
            method1298(127, 78);
        }
        while (var2.length > var3) {
            class264 var4 = var2[var3];
            if (var4.field4533 != null) {
                class124 var5 = new class124();
                var5.field2039 = var4;
                var5.field2031 = var4.field4533;
                class74.method546(2000000, -1413, var5);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V", line = 49)
    private class168(int arg0) {
        super(0, true);
        this.field2832 = 4096;
        this.field2832 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lwe;II)V", line = 67)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field2835++;
        if (arg2 == 0) {
            this.field2832 = (arg0.method368(arg1 - 1995) << 12) / 255;
        }
        if (arg1 != 2048) {
            field2833 = (class117) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V", line = 94)
    public static final void method1298(int arg0, int arg1) {
        if (arg0 > 119) {
            field2838++;
            class158 var2 = class206.method1564(arg1, 3, -109);
            var2.method1238(126);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)Lok;", line = 106)
    public static final class146 method1299(int arg0, int arg1) {
        field2836++;
        if (arg1 != -89781616) {
            field2842 = (int[]) null;
        }
        return class112.method758(-62, new class146[] { class82.method585(arg1 + 89796360, arg0 >> 24 & 0xFF), class230.field3828, class82.method585(arg1 ^ -89771256, arg0 >> 16 & 0xFF), class230.field3828, class82.method585(14744, arg0 >> 8 & 0xFF), class230.field3828, class82.method585(14744, arg0 & 0xFF) });
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 116)
    public class168() {
        this(4096);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 132)
    public static void method1300(boolean arg0) {
        field2842 = null;
        field2833 = null;
        field2840 = null;
        field2845 = null;
        field2843 = null;
        field2846 = null;
        if (arg0) {
            field2839 = -37;
        }
        field2841 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V", line = 156)
    public static final void method1301(byte arg0, int arg1, int arg2) {
        if (arg0 >= -11) {
            return;
        }
        field2834++;
        class75.field1221[arg1] = arg2;
        class239 var3 = (class239) class127.field2060.method810((byte) -113, (long) arg1);
        if (var3 == null) {
            class239 var4 = new class239(class67.method501(-118) + 500L);
            class127.field2060.method805(var4, (long) arg1, 123);
        } else {
            var3.field3981 = class67.method501(-94) + 500L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I", line = 191)
    public final int[] method38(int arg0, byte arg1) {
        field2830++;
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 124);
        if (this.field4350.field3333) {
            class244.method1767(var3, 0, class98.field1598, this.field2832);
        }
        return var3;
    }
}

import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class96 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Loc;")
    private class192 field1673 = new class192();

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lha;")
    private class194 field1688 = new class194();

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lfk;")
    private class144 field1691;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[B")
    public static byte[] field1674 = new byte[32896];

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Loh;")
    public static class258 field1681;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Loh;")
    public static class258 field1686;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Loh;")
    private static class258 field1682;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Loh;")
    public static class258 field1684;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Loh;")
    public static class258 field1690;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Loh;")
    public static class258 field1683;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JBLoc;)V", line = 4)
    public final void method698(long arg0, byte arg1, class192 arg2) {
        if (arg1 != 86) {
            method700(-20);
        }
        if (this.field1692 == 0) {
            class192 var5 = this.field1688.method1304(10);
            var5.method1054((byte) 98);
            var5.method1298(true);
            if (this.field1673 == var5) {
                class192 var6 = this.field1688.method1304(10);
                var6.method1054((byte) 121);
                var6.method1298(true);
            }
        } else {
            this.field1692--;
        }
        this.field1691.method984((byte) -101, arg2, arg0);
        this.field1688.method1305(arg2, 0);
        field1675++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIBI)V", line = 35)
    public static final void method699(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -38) {
            field1683 = (class258) null;
        }
        class286 var5 = class48.method389(arg1, 8, 10738);
        field1678++;
        var5.method2017(-42);
        var5.field4936 = arg0;
        var5.field4926 = arg2;
        var5.field4932 = arg4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 53)
    public static final void method700(int arg0) {
        field1672++;
        int var1 = -61 / ((arg0 + 36) / 61);
        for (class124 var2 = (class124) class140.field2387.method83(-113); var2 != null; var2 = (class124) class140.field2387.method87((byte) -80)) {
            if (var2.field2187) {
                var2.method902((byte) -127);
            }
        }
        for (class124 var3 = (class124) class281.field4821.method83(-79); var3 != null; var3 = (class124) class281.field4821.method87((byte) -80)) {
            if (var3.field2187) {
                var3.method902((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JI)Loc;", line = 87)
    public final class192 method701(long arg0, int arg1) {
        if (arg1 != 1) {
            this.field1688 = (class194) null;
        }
        field1670++;
        class192 var4 = (class192) this.field1691.method986(arg0, 0);
        if (var4 != null) {
            this.field1688.method1305(var4, arg1 ^ 0x1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;)Loh;", line = 114)
    public static final class258 method702(byte arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg1.getBytes();
        }
        int var4 = -21 / ((-arg0 - 61) / 42);
        field1669++;
        class258 var5 = new class258();
        var5.field4478 = 0;
        var5.field4490 = var2;
        for (int var6 = 0; var6 < var2.length; var6++) {
            if (var2[var6] != 0) {
                var2[var5.field4478++] = var2[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lkh;", line = 147)
    public final class154 method703(int arg0) {
        if (arg0 != 0) {
            field1681 = (class258) null;
        }
        field1680++;
        return this.field1691.method985(117);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 159)
    public final void method704(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field1688.method1310((byte) 115);
        field1679++;
        this.field1691.method981(32);
        this.field1673 = new class192();
        this.field1692 = this.field1689;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIBII)V", line = 181)
    public static final void method705(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1676++;
        if (class257.field4390) {
            int var8 = arg2 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class115.field2056 - class148.field2504) * var8 / 100 + class148.field2504;
            arg6 = arg6 * var9 >> 8;
        }
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = 0;
        int var12 = arg6;
        int var13 = 0;
        int var14 = -3 / ((-arg5 - 35) / 40);
        int var15 = 2048 - arg4 & 0x7FF;
        if (var15 != 0) {
            int var16 = class266.field4642[var15];
            var11 = -arg6 * var16 >> 16;
            int var17 = class266.field4636[var15];
            var12 = arg6 * var17 >> 16;
        }
        if (var10 != 0) {
            int var18 = class266.field4642[var10];
            var13 = var12 * var18 >> 16;
            int var19 = class266.field4636[var10];
            var12 = var12 * var19 >> 16;
        }
        class285.field4906 = arg3 - var13;
        class90.field1576 = arg0;
        class61.field1086 = arg7 - var12;
        class245.field4258 = arg1 - var11;
        class106.field1894 = arg4;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Lkh;", line = 251)
    public final class154 method706(int arg0) {
        field1671++;
        return arg0 < 26 ? (class154) null : this.field1691.method983(-1);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 272)
    public static void method707(int arg0) {
        field1684 = null;
        field1686 = null;
        field1681 = null;
        field1682 = null;
        field1683 = null;
        field1674 = null;
        if (arg0 != 1777514640) {
            method702((byte) -76, (String) null);
        }
        field1690 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1674[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field1681 = class153.method1046("Okay", 114);
        field1686 = class153.method1046("Hierhin gehen", 89);
        field1682 = class153.method1046(" is already on your friend list)3", 92);
        field1684 = null;
        field1690 = class153.method1046("Bitte entfernen Sie ", 126);
        field1683 = field1682;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V", line = 347)
    public class96(int arg0) {
        this.field1689 = arg0;
        this.field1692 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1691 = new class144(var2);
    }
}

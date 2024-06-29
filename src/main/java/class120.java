import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class120 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    private int field1680 = 0;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Llb;")
    private class224 field1679;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    public static int[] field1682 = new int[50];

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lii;")
    public static class227 field1685 = new class227(128);

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    public static int[] field1693 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Llb;")
    public static class224 field1695 = new class224(16);

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Llc;")
    public static class175 field1686;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lsi;")
    private class332 field1678;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
    public static int[] field1681;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
    public static int[] field1694;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lsi;", line = 10)
    public final class332 method811(byte arg0) {
        field1684++;
        if (this.field1680 > 0 && this.field1679.field3173[this.field1680 - 1] != this.field1678) {
            class332 var2 = this.field1678;
            this.field1678 = var2.field5073;
            return var2;
        }
        class332 var3;
        do {
            if (this.field1679.field3169 <= this.field1680) {
                if (arg0 != -99) {
                    field1694 = (int[]) null;
                }
                return null;
            }
            var3 = this.field1679.field3173[this.field1680++].field5073;
        } while (this.field1679.field3173[this.field1680 - 1] == var3);
        this.field1678 = var3.field5073;
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V", line = 43)
    public static void method812(boolean arg0) {
        field1681 = null;
        field1693 = null;
        field1682 = null;
        field1695 = null;
        if (!arg0) {
            field1685 = null;
            field1694 = null;
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lsi;", line = 66)
    public final class332 method813(byte arg0) {
        if (arg0 >= -23) {
            field1695 = (class224) null;
        }
        field1691++;
        this.field1680 = 0;
        return this.method811((byte) -99);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIZIB)V", line = 80)
    public static final void method814(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field1692++;
        class236.method1675(arg1, class184.field2649.length - 1, arg3, arg2, arg0, 0, 118);
        if (arg4 > -69) {
            method814(true, 53, true, -120, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Lve;", line = 92)
    public static final class282 method815(int arg0, int arg1) {
        field1687++;
        class282 var2 = (class282) class213.field2998.method1239((byte) -115, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class13.field176.method1199(28815, class235.method1663(true, arg1), class211.method1446((byte) -69, arg1));
        int var4 = 80 % ((arg0 + 44) / 60);
        class282 var5 = new class282();
        var5.field4432 = arg1;
        if (var3 != null) {
            var5.method2013(new class107(var3), (byte) -105);
        }
        var5.method2020((byte) -62);
        class213.field2998.method1243(var5, (long) arg1, -29282);
        return var5;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V", line = 118)
    public static final void method816(int arg0, boolean arg1) {
        class237.field3483.method1236(-495037017, arg0);
        if (!arg1) {
            class191.field2748.method1236(-495037017, arg0);
            field1688++;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Llb;)V", line = 131)
    public class120(class224 arg0) {
        this.field1679 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I", line = 140)
    public static final int method817(int arg0) {
        if (arg0 > -10) {
            method814(false, 75, false, 68, (byte) -9);
        }
        field1683++;
        return 6;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lok;", line = 153)
    public static final class159 method818(byte arg0, int arg1) {
        class159 var2 = (class159) class237.field3483.method1239((byte) -41, (long) arg1);
        field1689++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class177.field2579.method1199(28815, class188.method1302((byte) 80, arg1), class9.method39(arg1, 0));
        class159 var4 = new class159();
        var4.field2198 = arg1;
        if (var3 != null) {
            var4.method1058(new class107(var3), -26);
        }
        class237.field3483.method1243(var4, (long) arg1, -29282);
        return arg0 == 96 ? var4 : (class159) null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Z", line = 185)
    public static final boolean method819(int arg0, int arg1) {
        if (arg1 <= 79) {
            return true;
        } else {
            field1690++;
            return arg0 == 4 || arg0 == 8;
        }
    }
}

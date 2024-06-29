import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class156 {

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "Lof;")
    private class620 field1714 = new class620(64);

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public int field1722 = 0;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Loh;")
    private class404 field1720;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Lffa;")
    public static class185 field1717 = new class185();

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "F")
    public static float field1721;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILoh;)V", line = 5)
    public static final void method961(int arg0, class404 arg1) {
        field1711++;
        class676.field9579 = 0;
        class89.field933 = 0;
        if (arg0 != 1) {
            return;
        }
        class125.field1310 = new class454();
        class465.field6672 = new class554[1024];
        class44.field497 = new class257[class20.field180[class518.field7364] + 1];
        class323.field4127 = 0;
        class38.field431 = 0;
        class615.method3477(8, arg1);
        class520.method3051(arg1, -17905);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 25)
    public final void method962(int arg0) {
        class620 var2 = this.field1714;
        synchronized (this.field1714) {
            if (arg0 < 14) {
                method964(false);
            }
            this.field1714.method3549(0);
        }
        field1712++;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V", line = 38)
    public final void method963(byte arg0) {
        class620 var2 = this.field1714;
        synchronized (this.field1714) {
            this.field1714.method3541(-647);
        }
        if (arg0 <= 85) {
            method961(-29, null);
        }
        field1715++;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V", line = 53)
    public static void method964(boolean arg0) {
        field1717 = null;
        if (!arg0) {
            method964(false);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)Loaa;", line = 64)
    public final class287 method965(int arg0, byte arg1) {
        field1716++;
        class620 var3 = this.field1714;
        class287 var4;
        synchronized (this.field1714) {
            var4 = (class287) this.field1714.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field1720;
        byte[] var6;
        synchronized (this.field1720) {
            var6 = this.field1720.method2481(4, arg0, (byte) 119);
        }
        class287 var7 = new class287();
        var7.field3524 = arg0;
        int var8 = -116 % ((22 - arg1) / 57);
        var7.field3531 = this;
        if (var6 != null) {
            var7.method1712(-1, new class244(var6));
        }
        var7.method1709(-16121);
        class620 var9 = this.field1714;
        synchronized (this.field1714) {
            this.field1714.method3537(115, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(IB)V", line = 97)
    public final void method966(int arg0, byte arg1) {
        class620 var3 = this.field1714;
        synchronized (this.field1714) {
            this.field1714.method3539((byte) 119, arg0);
        }
        field1718++;
        if (arg1 > -78) {
            this.method966(-96, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 125)
    public class156(class301 arg0, int arg1, class404 arg2) {
        this.field1720 = arg2;
        this.field1719 = this.field1720.method2482(0, 4);
    }
}

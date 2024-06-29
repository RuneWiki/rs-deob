import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class120 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[Lbk;")
    private class59[] field1725;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1724 = null;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Z")
    public static boolean field1733 = false;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1735 = "cyan:";

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "J")
    private long field1730;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lbk;")
    private class59 field1728;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1726;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1726 = null;
        field1735 = null;
        if (arg0 < 3) {
            field1726 = null;
        }
        field1724 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)Lbk;")
    public final class59 method784(long arg0, int arg1) {
        field1734++;
        this.field1730 = arg0;
        class59 var4 = this.field1725[(int) ((long) (this.field1729 - 1) & arg0)];
        this.field1728 = var4.field866;
        if (arg1 != 0) {
            return null;
        }
        while (this.field1728 != var4) {
            if (this.field1728.field874 == arg0) {
                class59 var5 = this.field1728;
                this.field1728 = this.field1728.field866;
                return var5;
            }
            this.field1728 = this.field1728.field866;
        }
        this.field1728 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method785(int arg0) {
        class140.field2016 = 0;
        field1736++;
        class81.field1234 = 0;
        class258.method1825(false);
        class59.method379(arg0 + 112);
        class124.method802((byte) -115);
        for (int var1 = arg0; var1 < class81.field1234; var1++) {
            int var3 = class111.field1607[var1];
            if (class311.field4996 != class191.field3045[var3].field3931) {
                if (class191.field3045[var3].field1321.method852((byte) -31)) {
                    class125.method813(arg0 + 100, class191.field3045[var3]);
                }
                class191.field3045[var3].method586(true, (class134) null);
                class191.field3045[var3] = null;
            }
        }
        if (class262.field4252 != class175.field2763.field2676) {
            throw new RuntimeException("gnp1 pos:" + class175.field2763.field2676 + " psize:" + class262.field4252);
        }
        for (int var2 = 0; var2 < class80.field1211; var2++) {
            if (class191.field3045[class187.field2939[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class80.field1211);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JLbk;I)V")
    public final void method786(long arg0, class59 arg1, int arg2) {
        if (arg1.field868 != null) {
            arg1.method378((byte) -105);
        }
        field1727++;
        class59 var5 = this.field1725[(int) (arg0 & (long) (this.field1729 - 1))];
        arg1.field874 = arg0;
        arg1.field868 = var5.field868;
        if (arg2 <= 68) {
            field1733 = false;
        }
        arg1.field866 = var5;
        arg1.field868.field866 = arg1;
        arg1.field866.field868 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lbk;")
    public final class59 method787(byte arg0) {
        if (arg0 != -35) {
            this.method787((byte) 2);
        }
        field1732++;
        if (this.field1728 == null) {
            return null;
        }
        class59 var2 = this.field1725[(int) ((long) (this.field1729 - 1) & this.field1730)];
        while (this.field1728 != var2) {
            if (this.field1728.field874 == this.field1730) {
                class59 var3 = this.field1728;
                this.field1728 = this.field1728.field866;
                return var3;
            }
            this.field1728 = this.field1728.field866;
        }
        this.field1728 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field1729 = arg0;
        this.field1725 = new class59[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class59 var3 = this.field1725[var2] = new class59();
            var3.field866 = var3;
            var3.field868 = var3;
        }
    }
}

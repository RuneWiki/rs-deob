import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class290 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "J")
    private long field4149;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lmia;")
    public static class63 field4143 = new class63(37, -1);

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "[I")
    public static int[] field4148 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Z")
    public static boolean field4152;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1850(int arg0) {
        class729.field10214.method526(class281.field3978, class63.field916.field10209.method3083(17503) == 1 ? class287.field4080 + 256 << 2 : -1, 0);
        field4142++;
        int var1 = -110 % ((arg0 + 40) / 45);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lvk;", line = 19)
    public final class369 method1851(byte arg0, int arg1) {
        int var3 = 86 / ((arg0 + 93) / 33);
        field4146++;
        return class369.method2272(this.method1852(arg1, -23), 18991);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I", line = 36)
    private final int method1852(int arg0, int arg1) {
        int var3 = -1 / ((arg1 - 61) / 62);
        field4151++;
        return (int) (this.field4149 >> class369.field5314 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method1853(int arg0, byte arg1) {
        if (arg1 > -8) {
            field4148 = null;
        }
        class106 var2 = class141.field1858;
        synchronized (class141.field1858) {
            class141.field1858.method807(arg0, -1);
        }
        field4150++;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(BI)V", line = 60)
    public static final void method1854(byte arg0, int arg1) {
        class93.field1289.method807(arg1, -1);
        field4154++;
        int var2 = -69 % ((-arg0 - 67) / 46);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 72)
    public static void method1855(boolean arg0) {
        if (!arg0) {
            field4148 = null;
        }
        field4148 = null;
        field4143 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lvk;Z)V", line = 83)
    private final void method1856(class369 arg0, boolean arg1) {
        this.field4149 |= (arg0.field5304 << this.field4141++ * class369.field5314);
        field4145++;
        if (!arg1) {
            this.field4149 = -98L;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I", line = 94)
    public final int method1857(int arg0) {
        if (arg0 == 1) {
            field4147++;
            return this.field4141;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 107)
    public static final void method1858(byte arg0) {
        field4144++;
        if (class176.field2719 != null) {
            class176.field2719.method1981(0);
        }
        if (class578.field8220 != null) {
            class578.field8220.method1981(0);
        }
        if (arg0 < 2) {
            method1855(false);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lvk;)V", line = 125)
    public class290(class369 arg0) {
        this.field4141 = 1;
        this.field4149 = arg0.field5304;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "([Lvk;)V", line = 133)
    public class290(class369[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1856(arg0[var2], true);
        }
    }
}

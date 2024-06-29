import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class119 extends class46 {

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "Lbg;")
    public static class464 field1440 = new class464();

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "Z")
    public static volatile boolean field1443 = true;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "Lqm;")
    public static class143 field1441;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "Ld;")
    public static class149 field1442;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "Lfp;")
    public static class323 field1444;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg1 == -12939) {
            ++field1433;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)V")
    public static final void method823(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 16777215) {
            field1441 = null;
        }
        ++field1436;
        class144 var4 = class703.field9787[arg1][arg0];
        class218.method1340(var4 == null ? class218.field2849 : var4, false, arg3);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
    public static void method824(byte arg0) {
        field1442 = null;
        field1440 = null;
        field1441 = null;
        field1444 = null;
        if (arg0 < 109) {
            method823(-99, -106, 5, 38);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZII)V")
    public final void method301(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field1438;
            int var4 = this.field1432 * arg2 >> 12;
            int var5 = this.field1439 * arg2 >> 12;
            int var6 = this.field1445 * arg1 >> 12;
            int var7 = this.field1437 * arg1 >> 12;
            class253.method1678(var4, var5, var7, 3, super.field549, var6);
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIII)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1437 = arg3;
        this.field1432 = arg0;
        this.field1439 = arg2;
        this.field1445 = arg1;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        ++field1435;
        int var4 = -84 / ((-7 - arg1) / 42);
        int var5 = this.field1432 * arg0 >> 12;
        int var6 = this.field1439 * arg0 >> 12;
        int var7 = this.field1445 * arg2 >> 12;
        int var8 = this.field1437 * arg2 >> 12;
        class77.method612(super.field545, var8, var6, (byte) -93, var5, super.field548, super.field549, var7);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method825(boolean arg0, String arg1) {
        if (arg0) {
            ++field1434;
            System.exit(1);
        }
    }
}

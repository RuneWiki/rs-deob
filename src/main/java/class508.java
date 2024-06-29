import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class508 extends class154 {

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field6973 = -1;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
    public boolean field6975 = false;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6980 = null;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
    public static int[] field6979 = new int[3];

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field6977;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public int field6978;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field6981;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public int field6982;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field6984;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ltd;")
    public static class480 field6983;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field6979 = null;
        if (arg0 != 0) {
            field6979 = null;
        }
        field6983 = null;
        field6980 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lqn;")
    public static final class71 method2898(int arg0, byte arg1) {
        field6976++;
        if (arg1 != 93) {
            field6983 = null;
        }
        class71[] var2 = class415.method2452(arg1 - 86);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class71 var4 = var2[var3];
            if (var4.field1045 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
    public class508(int arg0) {
        this.field6973 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method2899(int arg0, int arg1) {
        class43 var2 = class770.field10617;
        synchronized (class770.field10617) {
            class770.field10617.method265(arg1, -107);
        }
        if (arg0 != 0) {
            field6979 = null;
        }
        field6974++;
    }
}

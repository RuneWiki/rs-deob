import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lwd;")
    public static class150 field1436 = class2.method9(true, "Side panel redrawn");

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lwd;")
    private static class150 field1440 = class2.method9(true, "Friends");

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lwd;")
    public static class150 field1442 = field1440;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lwd;")
    public static class150 field1446 = class2.method9(true, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field1437 = new int[50];

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lwd;")
    public static class150 field1445 = class2.method9(true, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lwd;")
    private static class150 field1443 = class2.method9(true, "The server is being updated)3");

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lwd;")
    public static class150 field1447 = field1443;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field1435 = new Object();

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lqd;")
    public static class114 field1439;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILqa;BI)V")
    public static final void method428(int arg0, class111 arg1, byte arg2, int arg3) {
        int var4 = 78 % ((31 - arg2) / 41);
        field1438++;
        if (arg1.field3005 == arg3 && arg3 != -1) {
            int var5 = class111.method785(arg3, 22969).field1295;
            if (var5 == 1) {
                arg1.field2990 = 0;
                arg1.field2960 = 0;
                arg1.field2985 = 0;
                arg1.field2979 = arg0;
            }
            if (var5 == 2) {
                arg1.field2990 = 0;
            }
        } else if (arg3 == -1 || arg1.field3005 == -1 || class111.method785(arg3, 22969).field1317 >= class111.method785(arg1.field3005, 22969).field1317) {
            arg1.field2990 = 0;
            arg1.field2995 = arg1.field3013;
            arg1.field2960 = 0;
            arg1.field2985 = 0;
            arg1.field2979 = arg0;
            arg1.field3005 = arg3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method429(byte arg0) {
        field1439 = null;
        field1446 = null;
        field1435 = null;
        field1437 = null;
        field1445 = null;
        field1436 = null;
        field1442 = null;
        field1447 = null;
        field1440 = null;
        if (arg0 != -48) {
            field1445 = null;
        }
        field1443 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
    public static final synchronized long method430(int arg0) {
        field1441++;
        long var1 = System.currentTimeMillis();
        if (class147.field3573 > var1) {
            class63.field1621 += class147.field3573 - var1;
        }
        if (arg0 != 0) {
            field1437 = null;
        }
        class147.field3573 = var1;
        return var1 + class63.field1621;
    }
}

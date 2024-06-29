import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class338 {

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lps;")
    public static class82 field5492;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "Z")
    public static boolean field5487;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public static void method2316(int arg0) {
        field5492 = null;
        if (arg0 != 12412) {
            method2316(4);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
    public static final void method2317(int arg0) {
        field5488++;
        int var1 = 60 / ((arg0 + 33) / 50);
        class575.field8200 = true;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2318(int arg0, int arg1) {
        field5491++;
        if (arg1 == 100 && class664.field9246 > 0) {
            byte[] var2 = class452.field6788[--class664.field9246];
            class452.field6788[class664.field9246] = null;
            return var2;
        } else if (arg1 == 5000 && class168.field2828 > 0) {
            byte[] var3 = class163.field2754[--class168.field2828];
            class163.field2754[class168.field2828] = null;
            return var3;
        } else if (arg0 == arg1 && class407.field6284 > 0) {
            byte[] var4 = class25.field416[--class407.field6284];
            class25.field416[class407.field6284] = null;
            return var4;
        } else {
            if (class136.field2300 != null) {
                for (int var5 = 0; var5 < class299.field4679.length; var5++) {
                    if (class299.field4679[var5] == arg1 && class389.field6020[var5] > 0) {
                        byte[] var6 = class136.field2300[var5][--class389.field6020[var5]];
                        class136.field2300[var5][class389.field6020[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z[B)V")
    public static final synchronized void method2319(boolean arg0, byte[] arg1) {
        field5489++;
        if (!arg0) {
            return;
        }
        if (arg1.length == 100 && class664.field9246 < 1000) {
            class452.field6788[class664.field9246++] = arg1;
        } else if (arg1.length == 5000 && class168.field2828 < 250) {
            class163.field2754[class168.field2828++] = arg1;
        } else if (arg1.length == 30000 && class407.field6284 < 50) {
            class25.field416[class407.field6284++] = arg1;
        } else if (class136.field2300 != null) {
            for (int var2 = 0; var2 < class299.field4679.length; var2++) {
                if (class299.field4679[var2] == arg1.length && class136.field2300[var2].length > class389.field6020[var2]) {
                    class136.field2300[var2][class389.field6020[var2]++] = arg1;
                    return;
                }
            }
        }
    }
}

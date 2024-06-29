import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class540 {

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7552 = null;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "Lag;")
    public static class214 field7551 = new class214(2, 2);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "[[[I")
    public static int[][][] field7549;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z[B)V", line = 8)
    public static final synchronized void method3217(boolean arg0, byte[] arg1) {
        field7548++;
        if (arg1.length == 100 && class323.field4152 < 1000) {
            class703.field9784[class323.field4152++] = arg1;
        } else if (arg1.length == 5000 && class643.field9119 < 250) {
            class283.field3754[class643.field9119++] = arg1;
        } else if (arg1.length == 30000 && class269.field3636 < 50) {
            class206.field2944[class269.field3636++] = arg1;
        } else {
            if (class647.field9176 != null) {
                for (int var2 = 0; var2 < class191.field2768.length; var2++) {
                    if (class191.field2768[var2] == arg1.length && class304.field3955[var2] < class647.field9176[var2].length) {
                        class647.field9176[var2][class304.field3955[var2]++] = arg1;
                        return;
                    }
                }
            }
            if (!arg0) {
                method3219(120, (byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 59)
    public static void method3218(int arg0) {
        if (arg0 == -51) {
            field7549 = null;
            field7552 = null;
            field7551 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)[B", line = 78)
    public static final synchronized byte[] method3219(int arg0, byte arg1) {
        field7550++;
        if (arg0 == 100 && class323.field4152 > 0) {
            byte[] var2 = class703.field9784[--class323.field4152];
            class703.field9784[class323.field4152] = null;
            return var2;
        } else if (arg0 == 5000 && class643.field9119 > 0) {
            byte[] var3 = class283.field3754[--class643.field9119];
            class283.field3754[class643.field9119] = null;
            return var3;
        } else {
            if (arg1 != -12) {
                method3219(-82, (byte) 84);
            }
            if (arg0 == 30000 && class269.field3636 > 0) {
                byte[] var4 = class206.field2944[--class269.field3636];
                class206.field2944[class269.field3636] = null;
                return var4;
            }
            if (class647.field9176 != null) {
                for (int var5 = 0; var5 < class191.field2768.length; var5++) {
                    if (class191.field2768[var5] == arg0 && class304.field3955[var5] > 0) {
                        byte[] var6 = class647.field9176[var5][--class304.field3955[var5]];
                        class647.field9176[var5][class304.field3955[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }
}

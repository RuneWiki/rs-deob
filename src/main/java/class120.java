import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class120 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lvm;")
    public static class426 field1531 = null;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method646(boolean arg0) {
        field1531 = null;
        if (!arg0) {
            method648(null, 67);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method647(byte arg0, int arg1) {
        field1530++;
        if (arg1 == 100 && class461.field5876 > 0) {
            byte[] var2 = class52.field783[--class461.field5876];
            class52.field783[class461.field5876] = null;
            return var2;
        } else if (arg1 == 5000 && class34.field469 > 0) {
            byte[] var3 = class179.field2311[--class34.field469];
            class179.field2311[class34.field469] = null;
            return var3;
        } else if (arg1 == 30000 && class77.field1064 > 0) {
            byte[] var4 = class646.field9085[--class77.field1064];
            class646.field9085[class77.field1064] = null;
            return var4;
        } else {
            if (arg0 != 90) {
                field1531 = null;
            }
            if (class22.field353 != null) {
                for (int var5 = 0; var5 < class205.field2613.length; var5++) {
                    if (class205.field2613[var5] == arg1 && class425.field5339[var5] > 0) {
                        byte[] var6 = class22.field353[var5][--class425.field5339[var5]];
                        class22.field353[var5][class425.field5339[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BI)V")
    public static final synchronized void method648(byte[] arg0, int arg1) {
        field1529++;
        if (arg0.length == 100 && class461.field5876 < 1000) {
            class52.field783[class461.field5876++] = arg0;
        } else if (arg0.length == 5000 && class34.field469 < 250) {
            class179.field2311[class34.field469++] = arg0;
        } else if (arg0.length == 30000 && class77.field1064 < 50) {
            class646.field9085[class77.field1064++] = arg0;
        } else {
            if (class22.field353 != null) {
                for (int var2 = 0; var2 < class205.field2613.length; var2++) {
                    if (class205.field2613[var2] == arg0.length && class425.field5339[var2] < class22.field353[var2].length) {
                        class22.field353[var2][class425.field5339[var2]++] = arg0;
                        return;
                    }
                }
            }
            if (arg1 != -13476) {
                method648(null, 3);
            }
        }
    }
}

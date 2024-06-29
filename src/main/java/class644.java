import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class644 {

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field9188 = 0;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)[B", line = 5)
    public static final synchronized byte[] method3634(int arg0, byte arg1) {
        field9187++;
        if (arg0 == 100 && class114.field1757 > 0) {
            byte[] var2 = class185.field3109[--class114.field1757];
            class185.field3109[class114.field1757] = null;
            return var2;
        } else if (arg0 == 5000 && class29.field277 > 0) {
            byte[] var3 = class541.field7731[--class29.field277];
            class541.field7731[class29.field277] = null;
            return var3;
        } else {
            if (arg1 > -10) {
                field9188 = 26;
            }
            if (arg0 == 30000 && class447.field6520 > 0) {
                byte[] var4 = class92.field1374[--class447.field6520];
                class92.field1374[class447.field6520] = null;
                return var4;
            }
            if (class355.field5380 != null) {
                for (int var5 = 0; var5 < class85.field1251.length; var5++) {
                    if (class85.field1251[var5] == arg0 && class219.field3584[var5] > 0) {
                        byte[] var6 = class355.field5380[var5][--class219.field3584[var5]];
                        class355.field5380[var5][class219.field3584[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIBII)V", line = 75)
    public static final void method3635(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class549.field7824 = arg1;
        field9189++;
        class112.field1741 = arg3;
        if (arg2 != 11) {
            field9188 = -86;
        }
        class247.field3963 = arg0;
        class370.field5620 = arg4;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z[B)V", line = 90)
    public static final synchronized void method3636(boolean arg0, byte[] arg1) {
        field9190++;
        if (arg1.length == 100 && class114.field1757 < 1000) {
            class185.field3109[class114.field1757++] = arg1;
        } else if (arg1.length == 5000 && class29.field277 < 250) {
            class541.field7731[class29.field277++] = arg1;
        } else if (arg1.length == 30000 && class447.field6520 < 50) {
            class92.field1374[class447.field6520++] = arg1;
        } else if (arg0 && class355.field5380 != null) {
            for (int var2 = 0; var2 < class85.field1251.length; var2++) {
                if (class85.field1251[var2] == arg1.length && class355.field5380[var2].length > class219.field3584[var2]) {
                    class355.field5380[var2][class219.field3584[var2]++] = arg1;
                    return;
                }
            }
        }
    }
}

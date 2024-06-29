import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class226 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[Lxa;")
    public static class468[] field3189;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z[B)V")
    public static final synchronized void method1418(boolean arg0, byte[] arg1) {
        field3190++;
        if (arg0) {
            method1420(70, true, 6, 1);
        }
        if (arg1.length == 100 && class659.field9350 < 1000) {
            class147.field2355[class659.field9350++] = arg1;
        } else if (arg1.length == 5000 && class141.field2267 < 250) {
            class688.field9661[class141.field2267++] = arg1;
        } else if (arg1.length == 30000 && class145.field2335 < 50) {
            class541.field7127[class145.field2335++] = arg1;
        } else if (class191.field2811 != null) {
            for (int var2 = 0; var2 < class546.field7271.length; var2++) {
                if (class546.field7271[var2] == arg1.length && class91.field1385[var2] < class191.field2811[var2].length) {
                    class191.field2811[var2][class91.field1385[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1419(int arg0, int arg1) {
        field3192++;
        if (arg1 == 100 && class659.field9350 > 0) {
            byte[] var2 = class147.field2355[--class659.field9350];
            class147.field2355[class659.field9350] = null;
            return var2;
        } else if (arg1 == 5000 && class141.field2267 > 0) {
            byte[] var3 = class688.field9661[--class141.field2267];
            class688.field9661[class141.field2267] = null;
            return var3;
        } else if (arg1 == 30000 && class145.field2335 > 0) {
            byte[] var4 = class541.field7127[--class145.field2335];
            class541.field7127[class145.field2335] = null;
            return var4;
        } else {
            int var5 = -123 / ((-arg0 - 10) / 61);
            if (class191.field2811 != null) {
                for (int var6 = 0; var6 < class546.field7271.length; var6++) {
                    if (class546.field7271[var6] == arg1 && class91.field1385[var6] > 0) {
                        byte[] var7 = class191.field2811[var6][--class91.field1385[var6]];
                        class191.field2811[var6][class91.field1385[var6]] = null;
                        return var7;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZII)I")
    public static final int method1420(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field3191++;
            int var4 = ((arg3 & 0xFF00) * arg2 & 0xFF0000 | (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg2;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        if (arg0 != 23323) {
            method1418(false, null);
        }
        field3189 = null;
    }
}

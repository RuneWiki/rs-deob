import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class533 {

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "[Liaa;")
    public static class116[] field7335 = new class116[300];

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field7336 = 0;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lbt;")
    public static class519 field7337 = new class519();

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[[[B")
    public static byte[][][] field7338;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method3156(byte arg0, int arg1) {
        field7339++;
        if (arg1 == 100 && class91.field1063 > 0) {
            byte[] var2 = class167.field2129[--class91.field1063];
            class167.field2129[class91.field1063] = null;
            return var2;
        } else if (arg1 == 5000 && class45.field472 > 0) {
            byte[] var3 = class499.field6847[--class45.field472];
            class499.field6847[class45.field472] = null;
            return var3;
        } else if (arg1 == 30000 && class222.field3042 > 0) {
            byte[] var4 = class128.field1670[--class222.field3042];
            class128.field1670[class222.field3042] = null;
            return var4;
        } else {
            if (arg0 != -22) {
                field7338 = null;
            }
            if (class292.field4287 != null) {
                for (int var5 = 0; var5 < class353.field5111.length; var5++) {
                    if (class353.field5111[var5] == arg1 && class704.field9798[var5] > 0) {
                        byte[] var6 = class292.field4287[var5][--class704.field9798[var5]];
                        class292.field4287[var5][class704.field9798[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method3157(byte arg0) {
        field7338 = null;
        field7335 = null;
        int var1 = 66 / ((arg0 - 22) / 35);
        field7337 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method3158(int arg0, byte[] arg1) {
        field7334++;
        if (arg1.length == 100 && class91.field1063 < 1000) {
            class167.field2129[class91.field1063++] = arg1;
        } else if (arg1.length == 5000 && class45.field472 < 250) {
            class499.field6847[class45.field472++] = arg1;
        } else if (arg1.length == 30000 && class222.field3042 < 50) {
            class128.field1670[class222.field3042++] = arg1;
        } else {
            if (arg0 >= -83) {
                method3159(null, (byte) -67);
            }
            if (class292.field4287 != null) {
                for (int var2 = 0; var2 < class353.field5111.length; var2++) {
                    if (class353.field5111[var2] == arg1.length && class292.field4287[var2].length > class704.field9798[var2]) {
                        class292.field4287[var2][class704.field9798[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lgga;B)V")
    public static final void method3159(class511 arg0, byte arg1) {
        field7340++;
        if (arg0.field6979.length - arg0.field6962 < 1) {
            return;
        }
        int var2 = arg0.method3013(102);
        if (var2 < 0 || var2 > 1 || (arg0.field6979.length - arg0.field6962) < 2) {
            return;
        }
        if (arg1 <= 67) {
            field7337 = null;
        }
        int var3 = arg0.method3002(-1);
        if (var3 * 6 > arg0.field6979.length - arg0.field6962) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3002(-1);
            int var6 = arg0.method3008(64);
            if (class170.field2162.length > var5 && class583.field8250[var5] && (class661.field9301.method18(64, var5).field5681 != '1' || var6 >= -1 && var6 <= 1)) {
                class170.field2162[var5] = var6;
            }
        }
    }
}

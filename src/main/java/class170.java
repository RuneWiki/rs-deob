import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class170 {

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field2439 = 0;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "[I")
    public static int[] field2438;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "[Lqda;")
    public static class112[] field2440;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[B)V", line = 4)
    public static final synchronized void method1297(int arg0, byte[] arg1) {
        field2441++;
        if (arg1.length == 100 && class633.field8936 < 1000) {
            class14.field263[class633.field8936++] = arg1;
        } else if (arg0 == -9605) {
            if (arg1.length == 5000 && class305.field4566 < 250) {
                class574.field8121[class305.field4566++] = arg1;
            } else if (arg1.length == 30000 && class513.field7331 < 50) {
                class45.field660[class513.field7331++] = arg1;
            } else if (class724.field10149 != null) {
                for (int var2 = 0; var2 < class4.field52.length; var2++) {
                    if (class4.field52[var2] == arg1.length && class180.field2728[var2] < class724.field10149[var2].length) {
                        class724.field10149[var2][class180.field2728[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 55)
    public static void method1298(int arg0) {
        if (arg0 != -3878) {
            method1299(-113, 94);
        }
        field2440 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)[B", line = 70)
    public static final synchronized byte[] method1299(int arg0, int arg1) {
        field2437++;
        if (~arg0 == arg1 && class633.field8936 > 0) {
            byte[] var2 = class14.field263[--class633.field8936];
            class14.field263[class633.field8936] = null;
            return var2;
        } else if (arg0 == 5000 && class305.field4566 > 0) {
            byte[] var3 = class574.field8121[--class305.field4566];
            class574.field8121[class305.field4566] = null;
            return var3;
        } else if (arg0 == 30000 && class513.field7331 > 0) {
            byte[] var4 = class45.field660[--class513.field7331];
            class45.field660[class513.field7331] = null;
            return var4;
        } else {
            if (class724.field10149 != null) {
                for (int var5 = 0; var5 < class4.field52.length; var5++) {
                    if (class4.field52[var5] == arg0 && class180.field2728[var5] > 0) {
                        byte[] var6 = class724.field10149[var5][--class180.field2728[var5]];
                        class724.field10149[var5][class180.field2728[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }
}

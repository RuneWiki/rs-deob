import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class387 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
    public static int[] field5633 = new int[2];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[[I")
    public static int[][] field5630 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field5634 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method2450(boolean arg0) {
        field5630 = null;
        field5633 = null;
        if (arg0) {
            method2450(true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method2451(int arg0, boolean arg1) {
        field5632++;
        if (arg0 == 100 && class538.field7321 > 0) {
            byte[] var2 = class182.field2407[--class538.field7321];
            class182.field2407[class538.field7321] = null;
            return var2;
        } else if (arg0 == 5000 && class450.field6275 > 0) {
            byte[] var3 = class674.field9467[--class450.field6275];
            class674.field9467[class450.field6275] = null;
            return var3;
        } else if (arg0 == 30000 && class357.field5237 > 0) {
            byte[] var4 = class245.field3310[--class357.field5237];
            class245.field3310[class357.field5237] = null;
            return var4;
        } else {
            if (class671.field9438 != null) {
                for (int var5 = 0; var5 < class670.field9423.length; var5++) {
                    if (class670.field9423[var5] == arg0 && class524.field7180[var5] > 0) {
                        byte[] var6 = class671.field9438[var5][--class524.field7180[var5]];
                        class671.field9438[var5][class524.field7180[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg1) {
                field5630 = null;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method2452(byte arg0) {
        field5635++;
        if (arg0 != 104) {
            field5634 = 31;
        }
        int var1 = 0;
        if (class712.field9959 != null) {
            var1 = class712.field9959.field1293.method1488(6);
        }
        if (var1 == 2) {
            int var2 = class482.field6666 > 800 ? 800 : class482.field6666;
            int var3 = class655.field9076 > 600 ? 600 : class655.field9076;
            class719.field10029 = (class482.field6666 - var2) / 2;
            class593.field8019 = var2;
            class140.field2048 = var3;
            class239.field3220 = 0;
        } else if (var1 == 1) {
            int var4 = class482.field6666 > 1024 ? 1024 : class482.field6666;
            class719.field10029 = (class482.field6666 - var4) / 2;
            class593.field8019 = var4;
            int var5 = class655.field9076 <= 768 ? class655.field9076 : 768;
            class140.field2048 = var5;
            class239.field3220 = 0;
        } else {
            class593.field8019 = class482.field6666;
            class140.field2048 = class655.field9076;
            class239.field3220 = 0;
            class719.field10029 = 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z[B)V")
    public static final synchronized void method2453(boolean arg0, byte[] arg1) {
        field5631++;
        if (arg1.length == 100 && class538.field7321 < 1000) {
            class182.field2407[class538.field7321++] = arg1;
        } else if (arg1.length == 5000 && class450.field6275 < 250) {
            class674.field9467[class450.field6275++] = arg1;
        } else if (arg1.length == 30000 && class357.field5237 < 50) {
            class245.field3310[class357.field5237++] = arg1;
        } else if (arg0 && class671.field9438 != null) {
            for (int var2 = 0; var2 < class670.field9423.length; var2++) {
                if (class670.field9423[var2] == arg1.length && class524.field7180[var2] < class671.field9438[var2].length) {
                    class671.field9438[var2][class524.field7180[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljp;Z)Lwf;")
    public static final class146 method2454(class376 arg0, boolean arg1) {
        field5636++;
        class146 var2 = new class146();
        if (arg1) {
            var2.field2075 = arg0.method2359(-1);
            var2.field2071 = class445.field6245.method609(var2.field2075, 17408);
            return var2;
        } else {
            return null;
        }
    }
}

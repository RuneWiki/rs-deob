import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class461 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[[I")
    public static int[][] field6513 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6514 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6515;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)V", line = 3)
    public static final void method2789(int arg0, long arg1) {
        field6516++;
        int var3 = class214.field3160;
        if (class24.field224 != var3) {
            int var4 = var3 - class24.field224;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class24.field224 += var5;
        }
        int var6 = class399.field5489;
        if (!class56.field668.field6852) {
            class278.field3902 += (float) arg1 * class92.field1389 / 40.0F * 8.0F;
            class539.field8023 += (float) arg1 * class308.field4258 / 40.0F * 8.0F;
        }
        if (class111.field1579 != var6) {
            int var7 = var6 - class111.field1579;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class111.field1579 += var8;
        }
        if (arg0 == 0) {
            class84.method634(1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 101)
    public static void method2790(boolean arg0) {
        field6515 = null;
        field6513 = null;
        if (!arg0) {
            method2789(-64, -64L);
        }
        field6514 = null;
    }
}

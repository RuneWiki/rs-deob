import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class219 extends class8 {

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3581 = "";

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3580 = "Cancel";

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "[I")
    public static int[] field3584 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3579 = "yellow:";

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Ld;")
    public static class238 field3578;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "[Lha;")
    public static class30[] field3585;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "[[[I")
    public static int[][][] field3586;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class219() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3582;
        if (arg0 != 3) {
            return null;
        } else {
            int[] var3 = super.field110.method1585(0, arg1);
            if (super.field110.field3734) {
                int[][] var4 = this.method60(arg1, 0, 105);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                for (int var8 = 0; ~var8 > ~class231.field3798; ++var8) {
                    var3[var8] = (var5[var8] - -var7[var8] - -var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field3579 = null;
        field3578 = null;
        field3584 = null;
        field3586 = null;
        field3585 = null;
        field3581 = null;
        if (arg0 >= 113) {
            field3580 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1494(int arg0, long arg1) {
        ++field3583;
        if (arg0 != 10) {
            field3578 = null;
        }
        class253.field4030.setTime(new Date(arg1));
        int var3 = class253.field4030.get(7);
        int var4 = class253.field4030.get(5);
        int var5 = class253.field4030.get(2);
        int var6 = class253.field4030.get(1);
        int var7 = class253.field4030.get(11);
        int var8 = class253.field4030.get(12);
        int var9 = class253.field4030.get(13);
        return class155.field2506[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class90.field1491[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}

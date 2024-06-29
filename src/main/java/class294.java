import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class294 extends class3 {

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    private int field4883 = 1024;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    private int field4894 = 3072;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field4889 = 2048;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
    public static int[] field4885 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lil;")
    public static class4 field4888 = new class4(32);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field4892 = 0;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[Z")
    public static boolean[] field4896 = new boolean[112];

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4895 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
    public static boolean field4893;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 <= 57) {
            field4885 = (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        field4886++;
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                var3[var5] = this.field4883 + (var4[var5] * this.field4889 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[[I", line = 41)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            this.method20((byte) 45);
        }
        field4891++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) -27);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                var8[var11] = (var5[var11] * this.field4889 >> 12) + this.field4883;
                var9[var11] = (var7[var11] * this.field4889 >> 12) + this.field4883;
                var10[var11] = (var6[var11] * this.field4889 >> 12) + this.field4883;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 89)
    public class294() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V", line = 101)
    public final void method20(byte arg0) {
        this.field4889 = this.field4894 - this.field4883;
        int var2 = 56 % ((-arg0 - 20) / 58);
        field4884++;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 115)
    public static void method2086(int arg0) {
        if (arg0 != 0) {
            method2086(8);
        }
        field4888 = null;
        field4895 = null;
        field4885 = null;
        field4896 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfh;IZ)V", line = 129)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field4887++;
        if (arg1 == 0) {
            this.field4883 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field4894 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field34 = arg0.method2224(-128) == 1;
        }
        if (arg2) {
            field4885 = (int[]) null;
        }
    }
}

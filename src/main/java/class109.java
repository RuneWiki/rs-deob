import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class109 extends class144 {

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1464 = "glow1:";

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1470 = "flash3:";

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field1468;
        if (arg1 != 255) {
            method681((String) null, -73);
        }
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 0, arg0);
            for (int var5 = 0; ~var5 > ~class104.field1411; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field1469;
        if (arg2 != 20630) {
            field1464 = null;
        }
        if (~arg0 == -1) {
            super.field2059 = ~arg1.method1407(122) == -2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        int[][] var3 = super.field2053.method1542(105, arg1);
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class104.field1411; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
            }
        }
        if (arg0 != 5) {
            this.method12(13, -14);
        }
        ++field1467;
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method681(String arg0, int arg1) {
        if (arg1 != -2795) {
            field1464 = null;
        }
        ++field1466;
        return 1 + arg0.length();
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    public static void method682(int arg0) {
        if (arg0 != -5227) {
            field1470 = null;
        }
        field1470 = null;
        field1464 = null;
    }
}

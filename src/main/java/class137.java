import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class137 extends class98 {

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Lmj;")
    public static final class394 method847(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2784;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB[IJ)Ljava/lang/String;")
    public static final String method848(int arg0, byte arg1, int[] arg2, long arg3) {
        ++field1707;
        if (class101.field1227 != null) {
            String var5 = class101.field1227.method171(arg2, arg0, arg3, -19);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 >= -57 ? null : Long.toString(arg3);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1708;
            int[] var3 = super.field1177.method820(arg1, true);
            if (super.field1177.field1610) {
                int[][] var4 = this.method546(arg1, (byte) 33, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class268.field3811; ++var8) {
                    var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }
}

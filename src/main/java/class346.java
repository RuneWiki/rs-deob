import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class346 extends class148 {

    @OriginalMember(owner = "client!is", name = "J", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 >= -65) {
            field4983 = -25;
        }
        ++field4982;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class320.field4579; ++var8) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class346() {
        super(1, true);
    }
}

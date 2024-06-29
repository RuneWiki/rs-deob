import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class635 extends class330 {

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "I")
    private int field8854 = 4096;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "I")
    private int field8853 = 0;

    @OriginalMember(owner = "client!nba", name = "K", descriptor = "Z")
    public static boolean field8860 = false;

    @OriginalMember(owner = "client!nba", name = "L", descriptor = "Z")
    public static boolean field8861 = false;

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "Ljn;")
    public static class134 field8858 = new class134(79, 8);

    @OriginalMember(owner = "client!nba", name = "N", descriptor = "I")
    public static int field8863 = -1;

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!nba", name = "M", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/io/File;II)[B")
    public static final byte[] method3642(File arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field8855;
            try {
                byte[] var3 = new byte[arg2];
                class603.method3486(arg2, 1, var3, arg0);
                return var3;
            } catch (IOException var4) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLgga;)Lrl;")
    public static final class713 method3643(byte arg0, class511 arg1) {
        ++field8857;
        class406 var2 = class41.method324(false, arg1);
        int var3 = arg1.method3008(64);
        int var4 = arg1.method3008(64);
        int var5 = arg1.method3002(-1);
        return arg0 >= -16 ? null : new class713(var2.field5719, var2.field5716, var2.field5717, var2.field5715, var2.field5723, var2.field5722, var2.field5724, var2.field5721, var2.field5720, var3, var4, var5);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "()V")
    public class635() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field8854 = arg0.method3002(-1);
            }
        } else {
            this.field8853 = arg0.method3002(-1);
        }
        ++field8862;
        int var5 = 31 % ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field8856;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            this.field8854 = -9;
        }
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) -111);
            for (int var5 = 0; var5 < class80.field901; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field8853 <= var6 && this.field8854 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static void method3644(int arg0) {
        field8858 = null;
        if (arg0 != -1) {
            method3643((byte) 116, (class511) null);
        }
    }
}

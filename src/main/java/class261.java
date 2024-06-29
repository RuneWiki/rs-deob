import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class261 extends class440 {

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "[Lqk;")
    public static class16[] field3968 = new class16[1024];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Lsn;")
    public static class583 field3970 = new class583("WTRC", 1);

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Lpu;")
    public static class522 field3971;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
    public static int[] field3973;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static void method1716(int arg0) {
        field3971 = null;
        field3973 = null;
        field3968 = null;
        field3970 = null;
        if (arg0 != 32623) {
            field3970 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1717(byte arg0) {
        ++field3974;
        if (!class623.field8731 && class305.field4531 != null) {
            int var1 = 84 % ((arg0 - 8) / 42);
            return class305.field4531.field4207;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)Z")
    public static final boolean method1718(int arg0, int arg1, int arg2) {
        ++field3972;
        if (~arg2 <= -1 && arg0 >= 0 && class672.field9500[1].length > arg2 && ~arg0 > ~class672.field9500[1][arg2].length) {
            return (class672.field9500[arg1][arg2][arg0] & 2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field3969;
        int var3 = 45 % ((-56 - arg0) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[][] var5 = this.method2606(arg1, 0, -1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; ~var9 > ~class549.field7715; ++var9) {
                var4[var9] = (var6[var9] + var8[var9] + var7[var9]) / 3;
            }
        }
        return var4;
    }
}

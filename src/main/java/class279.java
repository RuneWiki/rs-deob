import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class279 extends class149 {

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[F")
    public static float[] field3851 = new float[16];

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lpg;")
    public static class492 field3850 = new class492(92, 12);

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3853 = new String[100];

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lbq;")
    public static class483 field3852 = class306.method1971(16618);

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 6)
    public class279() {
        super(1, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method92(int arg0, int arg1) {
        ++field3849;
        int[] var3 = super.field2152.method2891(arg1, (byte) 121);
        if (arg0 != -10835) {
            return null;
        } else {
            if (super.field2152.field7051) {
                int[][] var4 = this.method984((byte) 112, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class316.field4838; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V", line = 53)
    public static void method1760(byte arg0) {
        field3852 = null;
        if (arg0 == -40) {
            field3850 = null;
            field3853 = null;
            field3851 = null;
        }
    }
}

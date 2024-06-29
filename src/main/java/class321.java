import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class321 extends class469 {

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field4835 = Boolean.FALSE;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Lbg;")
    public static class310 field4829 = new class310(8, -1);

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[[[Loh;")
    public static class268[][][] field4830;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)Z")
    public static final boolean method2010(int arg0, int arg1, int arg2) {
        ++field4834;
        if (arg0 < 57) {
            return false;
        } else {
            return class222.method1353(arg2, arg1, -18) | ~(arg2 & 2048) != -1 || class78.method567(arg2, (byte) -113, arg1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        ++field4831;
        if (arg0 != -1) {
            return null;
        } else {
            int[][] var3 = super.field5869.method2819(arg1, 1);
            if (super.field5869.field7156 && this.method2833(arg0 + 1971193893)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field7198 * super.field7198;
                for (int var8 = 0; var8 < class431.field6348; ++var8) {
                    int var9 = super.field7192[var8 % super.field7185 + var7];
                    var6[var8] = class330.method2050(var9 << 4, 4080);
                    var5[var8] = class330.method2050(4080, var9 >> 4);
                    var4[var8] = class330.method2050(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2011(byte arg0) {
        field4835 = null;
        field4829 = null;
        field4830 = null;
        if (arg0 != -67) {
            field4832 = -46;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class95 extends class38 {

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Z")
    public static boolean field1355 = false;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lvd;")
    public static class39 field1351;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lbg;")
    public static class466 field1354;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method745(int arg0) {
        field1354 = null;
        if (arg0 != 1) {
            method745(-122);
        }
        field1351 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method746(String arg0, int arg1) {
        if (arg1 != 10) {
            return false;
        } else {
            ++field1350;
            return class332.method2098(arg0, true, 10, 32);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 > -43) {
            return null;
        } else {
            ++field1349;
            int[] var3 = super.field397.method1376(arg1, (byte) 29);
            if (super.field397.field3005) {
                int[][] var4 = this.method195(true, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class729.field10216 > var8; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
                }
            }
            return var3;
        }
    }
}

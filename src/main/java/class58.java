import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class58 extends class140 {

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "Li;")
    private static class88 field1094 = class208.method1425(105, "Allocating memory");

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "Li;")
    public static class88 field1093 = field1094;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Li;")
    public static class88 field1096 = class208.method1425(105, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "Z")
    public static boolean field1097 = false;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1098 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "Li;")
    public static class88 field1100 = class208.method1425(105, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!fb", name = "mb", descriptor = "Li;")
    public static class88 field1103 = class208.method1425(105, "::rect_debug");

    @OriginalMember(owner = "client!fb", name = "kb", descriptor = "I")
    public static int field1101 = -1;

    @OriginalMember(owner = "client!fb", name = "nb", descriptor = "Li;")
    public static class88 field1104 = class208.method1425(105, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!fb", name = "lb", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!fb", name = "ob", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static final void method421(int arg0) {
        if (arg0 != 0) {
            method422(43);
        }
        ++field1099;
        class211.field4000.method671(91);
        class241.field4472.method134(50);
        class206.field3922.method671(45);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        if (arg1 != 13) {
            field1098 = null;
        }
        int[][] var3 = super.field364.method1541(true, arg0);
        ++field1095;
        if (super.field364.field4312 && this.method926(-1)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2590 * super.field2590;
            for (int var8 = 0; class70.field1276 > var8; ++var8) {
                int var9 = super.field2591[var8 % super.field2595 + var7];
                var6[var8] = class70.method470(255, var9) << 4;
                var4[var8] = class70.method470(4080, var9 >> 4);
                var5[var8] = class70.method470(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1104 = null;
        field1103 = null;
        field1094 = null;
        field1096 = null;
        field1098 = null;
        field1093 = null;
        if (arg0 == 4080) {
            field1100 = null;
        }
    }
}

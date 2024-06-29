import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class269 extends class601 {

    @OriginalMember(owner = "client!mca", name = "H", descriptor = "[I")
    public static int[] field3553 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!mca", name = "J", descriptor = "Z")
    public static boolean field3555 = false;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mca", name = "G", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mca", name = "I", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!mca", name = "K", descriptor = "[Lpu;")
    public static class772[] field3556;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field3551;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 > -76) {
            this.method1685(46, (byte) 31, 13);
        }
        if (super.field7643.field4364) {
            int var4 = class427.field5623[arg0];
            for (int var5 = 0; class418.field5518 > var5; ++var5) {
                var3[var5] = this.method1685(var4, (byte) -90, class64.field839[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "(I)V")
    public static void method1684(int arg0) {
        if (arg0 == 38) {
            field3553 = null;
            field3556 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IBI)I")
    private final int method1685(int arg0, byte arg1, int arg2) {
        ++field3554;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        int var6 = 89 / ((arg1 - 61) / 41);
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }
}

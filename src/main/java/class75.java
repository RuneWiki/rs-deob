import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class75 extends class466 {

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "Ldv;")
    public static class566 field1190 = new class566(31, 7);

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "[I")
    public static int[] field1194 = new int[256];

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "Lcba;")
    public static class471 field1195 = new class471(76, -2);

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "Ldk;")
    public static class435 field1196 = new class435(2);

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "F")
    public static float field1192;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "Lgn;")
    public static class600 field1197;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "[[Lmc;")
    public static class114[][] field1198;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
    public static final void method582(int arg0) {
        ++field1193;
        int var1 = (int) ((double) class32.field513 * 34.46D);
        int var2 = var1 << 0;
        if (class69.field1165.method1353()) {
            var2 += 128;
        }
        class69.field1165.method1290(arg0, var2);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field1191;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            method583(true);
        }
        if (super.field6557.field1163) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class312.field4207 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
    public static void method583(boolean arg0) {
        field1198 = null;
        if (arg0) {
            method582(-51);
        }
        field1194 = null;
        field1195 = null;
        field1190 = null;
        field1197 = null;
        field1196 = null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, true);
    }
}

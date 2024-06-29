import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class22 extends class243 {

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "[Laf;")
    public static class39[] field384 = new class39[50];

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "Lub;")
    public static class227 field391 = class257.method1749("Mem:", 17263);

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Z")
    public static boolean field385;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "[[I")
    public static int[][] field390;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public static final void method107() {
        for (int var0 = 0; var0 < class236.field4095; ++var0) {
            class230 var1 = class167.field2795[var0];
            class145.method913(var1);
            class167.field2795[var0] = null;
        }
        class236.field4095 = 0;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, true);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field392;
        int var3 = -3 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[][] var5 = this.method1616(-1, arg1, 0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            for (int var9 = 0; class212.field3586 > var9; ++var9) {
                var4[var9] = (var7[var9] - -var8[var9] + var6[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIII)V")
    public static final void method108(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field386;
        if (~arg3 < ~arg4) {
            class246.method1644(arg1, class59.field1094[arg2], arg3, arg4, 1);
        } else {
            class246.method1644(arg1, class59.field1094[arg2], arg4, arg3, 1);
        }
        int var5 = 17 / ((24 - arg0) / 54);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static void method109(byte arg0) {
        field391 = null;
        field384 = null;
        field390 = null;
        if (arg0 >= -115) {
            method109((byte) -28);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
    public static final void method110(boolean arg0, byte arg1) {
        ++field388;
        if (arg1 != 36) {
            method110(false, (byte) 57);
        }
        byte var2 = 4;
        byte[][] var3 = class38.field638;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            int var11 = (class177.field2976[var5] >> 8) * 64 + -class192.field3267;
            int var12 = (class177.field2976[var5] & 255) * 64 - class78.field1367;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class114.method725((byte) -93);
                class53.method307((byte) -53, (class241.field4189 + -6) * 8, var12, var11, arg0, (class148.field2581 + -6) * 8, var13, class78.field1370);
            }
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            int var7 = (class177.field2976[var6] >> 8) * 64 + -class192.field3267;
            int var8 = (255 & class177.field2976[var6]) * 64 - class78.field1367;
            byte[] var9 = var3[var6];
            if (var9 == null && ~class148.field2581 > -801) {
                class114.method725((byte) -73);
                for (int var10 = 0; ~var10 > ~var2; ++var10) {
                    class79.method460(var10, var8, 64, var7, -70, 64);
                }
            }
        }
    }
}

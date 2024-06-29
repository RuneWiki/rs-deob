import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class264 extends class96 {

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    private int field3342 = 3072;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    private int field3345 = 2048;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    private int field3352 = 1024;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "[Z")
    public static boolean[] field3343 = new boolean[100];

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field3350 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "[[Z")
    public static boolean[][] field3356;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "Laa;")
    public static class75 field3355;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field3346;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, arg0, -1);
            for (int var5 = 0; ~var5 > ~class269.field3403; ++var5) {
                var3[var5] = (var4[var5] * this.field3345 >> 12) + this.field3352;
            }
        }
        if (arg1 != 255) {
            method1648(61);
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLmv;)V")
    public static final void method1647(byte arg0, class518 arg1) {
        ++field3348;
        int var2 = 0 % ((arg0 - 35) / 60);
        class72 var3 = (class72) class157.field2072.method2085((long) arg1.field5159, -5423);
        if (var3 != null) {
            if (var3.field886 != null) {
                class18.field313.method1890(var3.field886);
                var3.field886 = null;
            }
            var3.method3021(-103);
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field3354;
        this.field3345 = this.field3342 - this.field3352;
        if (arg0 <= 15) {
            this.method36(-83, -25);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3351;
        if (arg1 != -1) {
            this.method31(-61, -88, (class88) null);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1329 = arg2.method617(2) == 1;
                }
            } else {
                this.field3342 = arg2.method568((byte) 110);
            }
        } else {
            this.field3352 = arg2.method568((byte) 110);
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
    public static void method1648(int arg0) {
        field3350 = null;
        field3356 = null;
        field3355 = null;
        if (arg0 != -319666452) {
            method1648(-70);
        }
        field3343 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field3349;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -117, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class269.field3403 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3345 >> 12) + this.field3352;
                var9[var11] = (var6[var11] * this.field3345 >> 12) + this.field3352;
                var10[var11] = (var7[var11] * this.field3345 >> 12) + this.field3352;
            }
        }
        return var3;
    }

    static {
        new class169(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3356 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
    }
}

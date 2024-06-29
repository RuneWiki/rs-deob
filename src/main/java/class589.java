import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class589 extends class56 {

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private int field8294 = 4096;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Z")
    public static boolean field8295 = false;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Lsi;")
    public static class559 field8300 = new class559();

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lqfa;")
    public static class98 field8301 = new class98(22, -2);

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lqfa;")
    public static class98 field8302 = new class98(54, 3);

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
    public static boolean field8305 = false;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field8303 = -60;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "J")
    public static long field8307 = 0L;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "D")
    public static double field8304;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Ltea;")
    public static class237 field8306;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "[[Z")
    public static boolean[][] field8299;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg2 == 0) {
            this.field8294 = arg1.method3757((byte) -65);
        }
        ++field8296;
        if (arg0 != 3731) {
            field8299 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method3333(int arg0) {
        field8300 = null;
        if (arg0 != 1) {
            method3334(94, (byte) 114);
        }
        field8306 = null;
        field8301 = null;
        field8299 = null;
        field8302 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field8298;
        if (!arg1) {
            field8303 = 74;
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, class636.field8759 & arg0 + -1);
            int[] var5 = this.method367(4463, 0, arg0);
            int[] var6 = this.method367(4463, 0, arg0 - -1 & class636.field8759);
            for (int var7 = 0; var7 < class328.field4576; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field8294;
                int var9 = (var5[class445.field6318 & var7 - -1] + -var5[var7 + -1 & class445.field6318]) * this.field8294;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
    public static final void method3334(int arg0, byte arg1) {
        ++field8297;
        class592 var2 = class682.method3825(-652872096, 10, arg0);
        if (arg1 == -91) {
            var2.method3350(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class589() {
        super(1, true);
    }
}

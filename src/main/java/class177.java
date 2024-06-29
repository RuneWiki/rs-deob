import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class177 extends class23 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field3341 = 4;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    private int field3345 = 4;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "[[I")
    public static int[][] field3340 = new int[104][104];

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Ldc;")
    public static class37 field3347 = class185.method1233((byte) 86, " <col=ffffff>");

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lbi;")
    public static class21 field3342;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "[[Lmf;")
    public static class136[][] field3344;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1000) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field3345 = arg0.method215(-1797813752);
                }
            } else {
                this.field3341 = arg0.method215(-1797813752);
            }
            ++field3348;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field3343;
        if (arg1 != 9) {
            method1186(-115);
        }
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        if (super.field398.field4303) {
            int var4 = class199.field3705 / this.field3341;
            int var5 = class235.field4276 / this.field3345;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method159(0, (byte) -120, class235.field4276 * var6 / var5);
            } else {
                var7 = this.method159(0, (byte) -72, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class199.field3705; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class199.field3705 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var9[var16];
                var12[var14] = var8[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field3340 = null;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -122);
        ++field3346;
        if (super.field405.field4114) {
            int var4 = class199.field3705 / this.field3341;
            int var5 = class235.field4276 / this.field3345;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method162(class235.field4276 * var6 / var5, 0, (byte) 18);
            } else {
                var7 = this.method162(0, 0, (byte) 18);
            }
            for (int var8 = 0; class199.field3705 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class199.field3705 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field3344 = null;
        field3347 = null;
        field3340 = null;
        field3342 = null;
        if (arg0 != 104) {
            method1186(102);
        }
    }
}

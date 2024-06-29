import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class626 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lpe;")
    private class615 field8748;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[[I")
    private int[][] field8746;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[Z")
    private boolean[] field8745;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field8750;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lra;")
    public static class361 field8752 = new class361(22, -1);

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[S")
    public static short[] field8756 = new short[256];

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    public static int[] field8755 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
    public final int[] method3476(int arg0, int arg1) {
        field8749++;
        if (arg0 < 0 || this.field8746.length <= arg0) {
            return this.field8750 == -1 ? new int[0] : new int[] { this.field8750 };
        } else if (this.field8745[arg0] && this.field8746[arg0].length > 1) {
            int var3 = this.field8750 == -1 ? 0 : 1;
            if (arg1 > -74) {
                method3478(-123);
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field8746[arg0].length];
            class443.method2517(this.field8746[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class562.method3002((byte) -14, var4, var5.length - var3);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field8746[arg0];
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
    public final boolean method3477(int arg0) {
        field8754++;
        if (arg0 != 0) {
            field8757 = -36;
        }
        return this.field8750 != -1;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method3478(int arg0) {
        if (arg0 != 3) {
            field8755 = null;
        }
        field8755 = null;
        field8756 = null;
        field8752 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static final void method3479(boolean arg0) {
        class668 var1 = class369.field4757;
        synchronized (class369.field4757) {
            if (!arg0) {
                return;
            }
            class369.field4757.method3656((byte) 0);
        }
        field8753++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZILe;Ljava/awt/Canvas;)Loa;")
    public static final class43 method3480(boolean arg0, int arg1, class702 arg2, Canvas arg3) {
        field8751++;
        return arg0 ? new class622(arg3, arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class626(class635 arg0, int arg1, class615 arg2) {
        this.field8748 = arg2;
        this.field8748.method3341(1, -19046);
        class418 var4 = new class418(this.field8748.method3346(-1, 0, 0));
        int var5 = var4.method2396(-13);
        if (var5 > 3) {
            this.field8746 = new int[0][];
            this.field8745 = new boolean[0];
            this.field8750 = -1;
        } else {
            int var6 = var4.method2396(84);
            class103[] var7 = class91.method687(1);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2396(-119);
                    if (var7[var9].field1377 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2396(77);
                int var12 = var4.method2396(-102);
                if (var5 > 2) {
                    this.field8750 = var4.method2383(65280);
                } else {
                    this.field8750 = -1;
                }
                this.field8745 = new boolean[var12 + 1];
                this.field8746 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2396(-103);
                    this.field8745[var15] = var4.method2396(-123) == 1;
                    int var16 = var4.method2393(-30727);
                    if (this.field8750 == -1) {
                        this.field8746[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field8746[var15][var17] = var4.method2393(-30727);
                        }
                    } else {
                        this.field8746[var15] = new int[var16 + 1];
                        this.field8746[var15][0] = this.field8750;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field8746[var15][var18 + 1] = var4.method2393(-30727);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field8746[var14] == null) {
                        if (this.field8750 == -1) {
                            this.field8746[var14] = new int[0];
                        } else {
                            this.field8746[var14] = new int[] { this.field8750 };
                        }
                    }
                }
            } else {
                this.field8746 = new int[0][];
                this.field8745 = new boolean[0];
                this.field8750 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)Lsi;")
    public final class688 method3481(int arg0, int arg1) {
        field8747++;
        byte[] var3 = this.field8748.method3346(-1, 1, arg1);
        class688 var4 = new class688();
        if (arg0 <= 54) {
            field8752 = null;
        }
        var4.method3752(0, new class418(var3));
        return var4;
    }
}

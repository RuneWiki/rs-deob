import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class486 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Luu;")
    private class237 field6798;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    private int field6802;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "[Z")
    private boolean[] field6800;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[[I")
    private int[][] field6801;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field6806 = -1;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([[II)V", line = 6)
    public static final void method2952(int[][] arg0, int arg1) {
        field6797++;
        if (arg1 != -30320) {
            method2956(-27, 127, -123);
        }
        class538.field7454 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Z", line = 20)
    public final boolean method2953(byte arg0) {
        if (arg0 != -64) {
            field6796 = 23;
        }
        field6795++;
        return this.field6802 != -1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)[I", line = 32)
    public final int[] method2954(byte arg0, int arg1) {
        field6804++;
        if (arg1 < 0 || arg1 >= this.field6801.length) {
            return this.field6802 == -1 ? new int[0] : new int[] { this.field6802 };
        } else if (this.field6800[arg1] && this.field6801[arg1].length > 1) {
            int var3 = this.field6802 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6801[arg1].length];
            class245.method1647(this.field6801[arg1], 0, var5, 0, var5.length);
            if (arg0 != -41) {
                this.field6798 = null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class434.method2677(var5.length - var3, var4, (byte) -114) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6801[arg1];
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)Llaa;", line = 85)
    public final class384 method2955(int arg0, byte arg1) {
        field6803++;
        if (arg1 != 38) {
            field6796 = -3;
        }
        byte[] var3 = this.field6798.method1572(1, 0, arg0);
        class384 var4 = new class384();
        var4.method2409((byte) 39, new class63(var3));
        return var4;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V", line = 103)
    public static final void method2956(int arg0, int arg1, int arg2) {
        field6805++;
        if (arg1 <= 43) {
            field6806 = 65;
        }
        class121 var3 = class601.field8136[arg2][arg0];
        if (var3 != null) {
            class96.field1324 = var3.field1584;
            class237.field3509 = var3.field1583;
            class223.field3013 = var3.field1595;
        }
        class516.method3087(-9);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 123)
    public class486(class553 arg0, int arg1, class237 arg2) {
        this.field6798 = arg2;
        this.field6798.method1597(1, 0);
        class63 var4 = new class63(this.field6798.method1572(0, 0, 0));
        int var5 = var4.method505((byte) -119);
        if (var5 > 3) {
            this.field6800 = new boolean[0];
            this.field6802 = -1;
            this.field6801 = new int[0][];
        } else {
            int var6 = var4.method505((byte) -119);
            class288[] var7 = class130.method822((byte) -128);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method505((byte) -119);
                    if (var7[var9].field4128 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method505((byte) -119);
                int var12 = var4.method505((byte) -119);
                if (var5 > 2) {
                    this.field6802 = var4.method496(-85);
                } else {
                    this.field6802 = -1;
                }
                this.field6800 = new boolean[var12 + 1];
                this.field6801 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method505((byte) -119);
                    this.field6800[var15] = var4.method505((byte) -119) == 1;
                    int var16 = var4.method482(-772591672);
                    if (this.field6802 == -1) {
                        this.field6801[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6801[var15][var18] = var4.method482(-772591672);
                        }
                    } else {
                        this.field6801[var15] = new int[var16 + 1];
                        this.field6801[var15][0] = this.field6802;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6801[var15][var17 + 1] = var4.method482(-772591672);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field6801[var14] == null) {
                        if (this.field6802 == -1) {
                            this.field6801[var14] = new int[0];
                        } else {
                            this.field6801[var14] = new int[] { this.field6802 };
                        }
                    }
                }
            } else {
                this.field6801 = new int[0][];
                this.field6802 = -1;
                this.field6800 = new boolean[0];
            }
        }
    }
}

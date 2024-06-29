import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class423 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lbt;")
    private class48 field5621;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field5619;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[[I")
    private int[][] field5620;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Z")
    private boolean[] field5622;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbt;IB)Lui;", line = 10)
    public static final class243 method2530(class48 arg0, int arg1, byte arg2) {
        field5624++;
        byte[] var3 = arg0.method453(arg1, 11040);
        int var4 = 83 / ((-arg2 - 61) / 57);
        return var3 == null ? null : new class243(var3);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lqea;", line = 26)
    public final class139 method2531(int arg0, int arg1) {
        field5625++;
        int var3 = -45 % ((-arg1 - 3) / 55);
        byte[] var4 = this.field5621.method437(1, (byte) -102, arg0);
        class139 var5 = new class139();
        var5.method1014(new class403(var4), (byte) 99);
        return var5;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I", line = 41)
    public final int[] method2532(int arg0, int arg1) {
        field5623++;
        if (arg0 < 0 || arg0 >= this.field5620.length) {
            return this.field5619 == -1 ? new int[0] : new int[] { this.field5619 };
        } else if (this.field5622[arg0] && this.field5620[arg0].length > 1) {
            int var3 = this.field5619 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field5620[arg0].length];
            class211.method1332(this.field5620[arg0], 0, var5, arg1, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class93.method822(var4, ~arg1, var5.length - var3) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field5620[arg0];
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z", line = 84)
    public final boolean method2533(boolean arg0) {
        field5618++;
        if (!arg0) {
            this.method2532(-115, 41);
        }
        return this.field5619 != -1;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 100)
    public class423(class441 arg0, int arg1, class48 arg2) {
        this.field5621 = arg2;
        this.field5621.method431(4, 1);
        class403 var4 = new class403(this.field5621.method437(0, (byte) -64, 0));
        int var5 = var4.method2396((byte) -107);
        if (var5 > 3) {
            this.field5622 = new boolean[0];
            this.field5620 = new int[0][];
            this.field5619 = -1;
        } else {
            int var6 = var4.method2396((byte) -97);
            class251[] var7 = class449.method2682((byte) 127);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2396((byte) 39);
                    if (var7[var9].field2940 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2396((byte) 85);
                int var12 = var4.method2396((byte) 123);
                if (var5 <= 2) {
                    this.field5619 = -1;
                } else {
                    this.field5619 = var4.method2365(true);
                }
                this.field5620 = new int[var12 + 1][];
                this.field5622 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2396((byte) -115);
                    this.field5622[var15] = var4.method2396((byte) -82) == 1;
                    int var16 = var4.method2390((byte) -123);
                    if (this.field5619 == -1) {
                        this.field5620[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field5620[var15][var17] = var4.method2390((byte) 12);
                        }
                    } else {
                        this.field5620[var15] = new int[var16 + 1];
                        this.field5620[var15][0] = this.field5619;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field5620[var15][var18 + 1] = var4.method2390((byte) -119);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field5620[var14] == null) {
                        if (this.field5619 == -1) {
                            this.field5620[var14] = new int[0];
                        } else {
                            this.field5620[var14] = new int[] { this.field5619 };
                        }
                    }
                }
            } else {
                this.field5619 = -1;
                this.field5622 = new boolean[0];
                this.field5620 = new int[0][];
            }
        }
    }
}

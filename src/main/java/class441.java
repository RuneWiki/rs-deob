import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class441 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lfp;")
    private class323 field6290;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    private int field6293;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[Z")
    private boolean[] field6288;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[[I")
    private int[][] field6286;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[[I")
    public static int[][] field6291 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lik;")
    public static class207 field6289 = new class207();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lk;", line = 3)
    public final class565 method2658(int arg0, int arg1) {
        field6292++;
        byte[] var3 = this.field6290.method2100(arg0, (byte) 112, arg1);
        class565 var4 = new class565();
        var4.method3259(-123, new class675(var3));
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 25)
    public static void method2659(int arg0) {
        if (arg0 >= 85) {
            field6291 = null;
            field6289 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z", line = 36)
    public final boolean method2660(int arg0) {
        if (arg0 != -22358) {
            this.method2658(-40, 115);
        }
        field6294++;
        return this.field6293 != -1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)[I", line = 54)
    public final int[] method2661(int arg0, byte arg1) {
        field6285++;
        if (arg0 < 0 || arg0 >= this.field6286.length) {
            return this.field6293 == -1 ? new int[0] : new int[] { this.field6293 };
        } else if (this.field6288[arg0] && this.field6286[arg0].length > 1) {
            int var3 = this.field6293 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6286[arg0].length];
            class255.method1688(this.field6286[arg0], 0, var5, 0, var5.length);
            int var6 = var3;
            if (arg1 != 79) {
                return null;
            }
            while (var6 < var5.length) {
                int var7 = class111.method790(var5.length - var3, var4, (byte) -119) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
                var6++;
            }
            return var5;
        } else {
            return this.field6286[arg0];
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 100)
    public class441(class326 arg0, int arg1, class323 arg2) {
        this.field6290 = arg2;
        this.field6290.method2084(1, 0);
        class675 var4 = new class675(this.field6290.method2100(0, (byte) 112, 0));
        int var5 = var4.method3750((byte) 35);
        if (var5 > 3) {
            this.field6293 = -1;
            this.field6288 = new boolean[0];
            this.field6286 = new int[0][];
        } else {
            int var6 = var4.method3750((byte) 35);
            class153[] var7 = class513.method3023((byte) 108);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3750((byte) 35);
                    if (var7[var9].field2158 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3750((byte) 35);
                int var12 = var4.method3750((byte) 35);
                if (var5 > 2) {
                    this.field6293 = var4.method3706((byte) 53);
                } else {
                    this.field6293 = -1;
                }
                this.field6288 = new boolean[var12 + 1];
                this.field6286 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3750((byte) 35);
                    this.field6288[var15] = var4.method3750((byte) 35) == 1;
                    int var16 = var4.method3757((byte) -65);
                    if (this.field6293 == -1) {
                        this.field6286[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6286[var15][var18] = var4.method3757((byte) -65);
                        }
                    } else {
                        this.field6286[var15] = new int[var16 + 1];
                        this.field6286[var15][0] = this.field6293;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6286[var15][var17 + 1] = var4.method3757((byte) -65);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field6286[var14] == null) {
                        if (this.field6293 == -1) {
                            this.field6286[var14] = new int[0];
                        } else {
                            this.field6286[var14] = new int[] { this.field6293 };
                        }
                    }
                }
            } else {
                this.field6286 = new int[0][];
                this.field6288 = new boolean[0];
                this.field6293 = -1;
            }
        }
    }
}

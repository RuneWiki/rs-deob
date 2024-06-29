import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class233 {

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lwu;")
    private class376 field3306;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[[I")
    private int[][] field3302;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[Z")
    private boolean[] field3300;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method1473(int arg0, byte arg1) {
        field3304++;
        if (arg0 < 0 || this.field3302.length <= arg0) {
            return this.field3301 == -1 ? new int[0] : new int[] { this.field3301 };
        } else if (this.field3300[arg0] && this.field3302[arg0].length > 1) {
            int var3 = this.field3301 == -1 ? 0 : 1;
            Random var4 = new Random();
            int var5 = -84 / ((31 - arg1) / 58);
            int[] var6 = new int[this.field3302[arg0].length];
            class335.method2016(this.field3302[arg0], 0, var6, 0, var6.length);
            for (int var7 = var3; var7 < var6.length; var7++) {
                int var8 = class309.method1906(var6.length - var3, -1, var4) + var3;
                int var9 = var6[var7];
                var6[var7] = var6[var8];
                var6[var8] = var9;
            }
            return var6;
        } else {
            return this.field3302[arg0];
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z", line = 47)
    public final boolean method1474(byte arg0) {
        if (arg0 <= 57) {
            this.method1475(102, -102);
        }
        field3303++;
        return this.field3301 != -1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Llo;", line = 58)
    public final class757 method1475(int arg0, int arg1) {
        field3299++;
        if (arg0 > -106) {
            this.method1475(-27, -110);
        }
        byte[] var3 = this.field3306.method2218((byte) 114, 1, arg1);
        class757 var4 = new class757();
        var4.method4222((byte) -29, new class677(var3));
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ICLjava/lang/String;)I", line = 82)
    public static final int method1476(int arg0, char arg1, String arg2) {
        field3305++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg0 <= 6) {
            return 51;
        }
        while (var5 < var4) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 112)
    public class233(class763 arg0, int arg1, class376 arg2) {
        this.field3306 = arg2;
        this.field3306.method2195(1, 0);
        class677 var4 = new class677(this.field3306.method2218((byte) 117, 0, 0));
        int var5 = var4.method3821((byte) 70);
        if (var5 > 3) {
            this.field3302 = new int[0][];
            this.field3300 = new boolean[0];
            this.field3301 = -1;
        } else {
            int var6 = var4.method3821((byte) 98);
            class419[] var7 = class383.method2261(false);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3821((byte) -48);
                    if (var7[var9].field5773 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3821((byte) -53);
                int var12 = var4.method3821((byte) 79);
                if (var5 <= 2) {
                    this.field3301 = -1;
                } else {
                    this.field3301 = var4.method3771((byte) -10);
                }
                this.field3302 = new int[var12 + 1][];
                this.field3300 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3821((byte) 123);
                    this.field3300[var15] = var4.method3821((byte) -30) == 1;
                    int var16 = var4.method3807(-1);
                    if (this.field3301 == -1) {
                        this.field3302[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field3302[var15][var18] = var4.method3807(-1);
                        }
                    } else {
                        this.field3302[var15] = new int[var16 + 1];
                        this.field3302[var15][0] = this.field3301;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field3302[var15][var17 + 1] = var4.method3807(-1);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field3302[var14] == null) {
                        if (this.field3301 == -1) {
                            this.field3302[var14] = new int[0];
                        } else {
                            this.field3302[var14] = new int[] { this.field3301 };
                        }
                    }
                }
            } else {
                this.field3300 = new boolean[0];
                this.field3301 = -1;
                this.field3302 = new int[0][];
            }
        }
    }
}

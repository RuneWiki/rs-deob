import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class174 {

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Loh;")
    private class404 field2055;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[[I")
    private int[][] field2049;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[Z")
    private boolean[] field2053;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    public static int[] field2052 = new int[13];

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[I")
    public static int[] field2056 = new int[8];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 10)
    public static void method1078(int arg0) {
        field2052 = null;
        int var1 = -69 / (arg0 / 59);
        field2056 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I", line = 21)
    public final int[] method1079(int arg0, byte arg1) {
        field2050++;
        if (arg0 < 0 || this.field2049.length <= arg0) {
            return this.field2057 == -1 ? new int[0] : new int[] { this.field2057 };
        } else if (this.field2053[arg0] && this.field2049[arg0].length > 1) {
            int var3 = this.field2057 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field2049[arg0].length];
            if (arg1 != -107) {
                method1078(125);
            }
            class143.method891(this.field2049[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class661.method3763(var5.length - var3, 30356, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field2049[arg0];
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z", line = 82)
    public final boolean method1080(byte arg0) {
        field2058++;
        if (arg0 <= 93) {
            return true;
        } else {
            return this.field2057 != -1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Llda;", line = 95)
    public final class484 method1081(int arg0, int arg1) {
        field2048++;
        byte[] var3 = this.field2055.method2481(arg0, arg1, (byte) 104);
        class484 var4 = new class484();
        var4.method2927(new class244(var3), arg0 ^ 0x7BFC);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 107)
    public class174(class301 arg0, int arg1, class404 arg2) {
        this.field2055 = arg2;
        this.field2055.method2482(0, 1);
        class244 var4 = new class244(this.field2055.method2481(0, 0, (byte) 106));
        int var5 = var4.method1423(-95);
        if (var5 > 3) {
            this.field2057 = -1;
            this.field2049 = new int[0][];
            this.field2053 = new boolean[0];
        } else {
            int var6 = var4.method1423(-89);
            class325[] var7 = class317.method1902(-49);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1423(-123);
                    if (var7[var9].field4147 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1423(-32);
                int var12 = var4.method1423(-50);
                if (var5 > 2) {
                    this.field2057 = var4.method1466((byte) 31);
                } else {
                    this.field2057 = -1;
                }
                this.field2053 = new boolean[var12 + 1];
                this.field2049 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1423(-84);
                    this.field2053[var15] = var4.method1423(-83) == 1;
                    int var16 = var4.method1476(30);
                    if (this.field2057 == -1) {
                        this.field2049[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field2049[var15][var17] = var4.method1476(61);
                        }
                    } else {
                        this.field2049[var15] = new int[var16 + 1];
                        this.field2049[var15][0] = this.field2057;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field2049[var15][var18 + 1] = var4.method1476(-75);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field2049[var14] == null) {
                        if (this.field2057 == -1) {
                            this.field2049[var14] = new int[0];
                        } else {
                            this.field2049[var14] = new int[] { this.field2057 };
                        }
                    }
                }
            } else {
                this.field2049 = new int[0][];
                this.field2057 = -1;
                this.field2053 = new boolean[0];
            }
        }
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class432 {

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "Lgga;")
    private class513 field6028;

    @OriginalMember(owner = "client!eja", name = "g", descriptor = "[Z")
    private boolean[] field6033;

    @OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
    private int field6034;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "[[I")
    private int[][] field6031;

    @OriginalMember(owner = "client!eja", name = "i", descriptor = "Lsi;")
    public static class769 field6035 = new class769(8);

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!eja", name = "f", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!eja", name = "j", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!eja", name = "k", descriptor = "Z")
    public static boolean field6037;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)Lsga;")
    public final class609 method2585(int arg0, int arg1) {
        field6032++;
        if (arg1 != -24471) {
            field6035 = null;
        }
        byte[] var3 = this.field6028.method3019(1, arg0, 64);
        class609 var4 = new class609();
        var4.method3525((byte) -28, new class431(var3));
        return var4;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Z)V")
    public static void method2586(boolean arg0) {
        if (!arg0) {
            field6035 = null;
        }
    }

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "(II)I")
    public static final int method2587(int arg0, int arg1) {
        field6036++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 != -21311) {
            method2586(true);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Luh;I)V")
    public static final void method2588(class162 arg0, int arg1) {
        if (arg1 >= -123) {
            field6037 = true;
        }
        arg0.field2501 = null;
        field6027++;
        int var2 = arg0.field2500.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2500[var3].field10404 = false;
        }
        class271[] var4 = class648.field9193;
        synchronized (class648.field9193) {
            if (var2 < class648.field9193.length && class697.field9797[var2] < 200) {
                class648.field9193[var2].method1734(arg0, 0);
                int var10002 = class697.field9797[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)[I")
    public final int[] method2589(byte arg0, int arg1) {
        field6030++;
        if (arg1 < 0 || arg1 >= this.field6031.length) {
            return this.field6034 == -1 ? new int[0] : new int[] { this.field6034 };
        } else if (this.field6033[arg1] && this.field6031[arg1].length > 1) {
            int var3 = this.field6034 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6031[arg1].length];
            class171.method1262(this.field6031[arg1], 0, var5, 0, var5.length);
            if (arg0 != -122) {
                return null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class728.method4047(124, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6031[arg1];
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Z")
    public final boolean method2590(byte arg0) {
        field6029++;
        if (arg0 != 72) {
            this.field6034 = -80;
        }
        return this.field6034 != -1;
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class432(class41 arg0, int arg1, class513 arg2) {
        this.field6028 = arg2;
        this.field6028.method3007(-1, 1);
        class431 var4 = new class431(this.field6028.method3019(0, 0, 76));
        int var5 = var4.method2557(14929);
        if (var5 > 3) {
            this.field6033 = new boolean[0];
            this.field6034 = -1;
            this.field6031 = new int[0][];
        } else {
            int var6 = var4.method2557(14929);
            class353[] var7 = class338.method2068(-65);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2557(14929);
                    if (var7[var9].field5016 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2557(14929);
                int var12 = var4.method2557(14929);
                if (var5 > 2) {
                    this.field6034 = var4.method2528((byte) 89);
                } else {
                    this.field6034 = -1;
                }
                this.field6031 = new int[var12 + 1][];
                this.field6033 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2557(14929);
                    this.field6033[var15] = var4.method2557(14929) == 1;
                    int var16 = var4.method2565((byte) -110);
                    if (this.field6034 == -1) {
                        this.field6031[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6031[var15][var18] = var4.method2565((byte) -90);
                        }
                    } else {
                        this.field6031[var15] = new int[var16 + 1];
                        this.field6031[var15][0] = this.field6034;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6031[var15][var17 + 1] = var4.method2565((byte) -95);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field6031[var14] == null) {
                        if (this.field6034 == -1) {
                            this.field6031[var14] = new int[0];
                        } else {
                            this.field6031[var14] = new int[] { this.field6034 };
                        }
                    }
                }
            } else {
                this.field6031 = new int[0][];
                this.field6033 = new boolean[0];
                this.field6034 = -1;
            }
        }
    }
}

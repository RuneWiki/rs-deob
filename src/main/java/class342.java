import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class342 extends class182 {

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    private int field5415 = 4096;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    private int field5420 = 4096;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    private int field5421 = 4096;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field5411 = 5063219;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field5416 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Lih;")
    public static class39 field5413 = new class39(5000);

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "[I")
    public static int[] field5422 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Loe;IB)V", line = 20)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field5421 = arg0.method989(122);
        } else if (arg1 == 1) {
            this.field5415 = arg0.method989(65);
        } else if (arg1 == 2) {
            this.field5420 = arg0.method989(114);
        }
        if (arg2 != 60) {
            method2413(-57);
        }
        field5417++;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V", line = 55)
    public static final void method2413(int arg0) {
        if (arg0 == 20213) {
            class51.field1038.method291((byte) 126, 28);
            class285.field4658++;
            field5418++;
            class51.field1038.method1027(0, -20374);
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V", line = 71)
    public static void method2414(int arg0) {
        field5422 = null;
        if (arg0 == 1) {
            field5413 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 82)
    public class342() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I", line = 99)
    public final int[][] method122(int arg0, int arg1) {
        field5419++;
        int[][] var3 = this.field3152.method1953(arg0, 110);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 108, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field5421 * var12 >> 12;
                    var9[var11] = this.field5415 * var13 >> 12;
                    var10[var11] = this.field5420 * var14 >> 12;
                } else {
                    var8[var11] = this.field5421;
                    var9[var11] = this.field5415;
                    var10[var11] = this.field5420;
                }
            }
        }
        if (arg1 != 4944) {
            method2415(-25, 111);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V", line = 161)
    public static final void method2415(int arg0, int arg1) {
        field5412++;
        if (arg0 == -1 || !class232.field3797[arg0]) {
            return;
        }
        class198.field3319.method1418(arg0, 31163);
        if (class178.field2938[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 >= -66) {
            field5411 = 111;
        }
        for (int var3 = 0; var3 < class178.field2938[arg0].length; var3++) {
            if (class178.field2938[arg0][var3] != null) {
                if (class178.field2938[arg0][var3].field3098 == 2) {
                    var2 = false;
                } else {
                    class178.field2938[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class178.field2938[arg0] = null;
        }
        class232.field3797[arg0] = false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILg;II)V", line = 207)
    public static final void method2416(int arg0, class181 arg1, int arg2, int arg3) {
        field5414++;
        if (class137.field2343 < 2 && class222.field3674 == 0 && !class52.field1046) {
            return;
        }
        String var4 = class103.method778(110);
        if (arg3 != -1) {
            method2413(-16);
        }
        if (arg1 == null) {
            int var6 = class332.field5297.method639(var4, arg2 + 4, arg0 + 15, 16777215, 0, class201.field3366, class76.field1371);
            class127.method906(15, arg0, arg2 + 4, var6 + class332.field5297.method636(var4), ~arg3);
            return;
        }
        class84 var5 = arg1.method1269(-1, class144.field2424);
        if (var5 == null) {
            var5 = class332.field5297;
        }
        var5.method627(var4, arg2, arg0, arg1.field3024, arg1.field2972, arg1.field3063, arg1.field3132, arg1.field3107, arg1.field3056, class201.field3366, class76.field1371, class220.field3647);
        class127.method906(class220.field3647[3], class220.field3647[1], class220.field3647[0], class220.field3647[2], 0);
    }
}

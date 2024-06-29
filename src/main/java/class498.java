import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class498 extends class568 {

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!maa", name = "t", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "[[I")
    public int[][] field7473;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "[Z")
    public boolean[] field7474;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "[I")
    public int[] field7469;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "[I")
    public int[] field7472;

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7479 = new String[] { method3766(method3765("G\u0007\u000e\u0006i\u0002")), method3766(method3765("D\u0013\u0003D")), method3766(method3765("QHA\u0006U")), method3766(method3765("G\u0007\u000e\u0006\u0014C\b\u0006\\\u0016\u0002")), method3766(method3765("G\u0007\u000e\u0006j\u0002")) };

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "[I")
    public static int[] field7471;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBIBLip;)V", line = 5)
    public static final void method3763(int arg0, byte arg1, int arg2, byte arg3, class738 arg4) {
        try {
            field7476++;
            int var5 = arg4.field1201[0];
            int var6 = arg4.field1200[0];
            if (var5 >= 0 && var5 < class126.field1823 && var6 >= 0 && var6 < class169.field2725 && arg2 >= 0 && class126.field1823 > arg2 && arg0 >= 0 && arg0 < class169.field2725) {
                int var7 = class590.method4332(0, 0, class196.field3121, -4, 0, true, arg0, class297.field4841[arg4.field9975], var5, class326.field5358, var6, 83, 0, arg2, arg4.method804(true));
                if (var7 >= 1 && var7 <= 3 && arg3 == -68) {
                    for (int var8 = 0; var8 < (var7 - 1); var8++) {
                        arg4.method5360(false, class196.field3121[var8], arg1, class326.field5358[var8]);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7479[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7479[1] : field7479[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 49)
    public static void method3764(int arg0) {
        try {
            if (arg0 != 3) {
                field7475 = 102;
            }
            field7471 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7479[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(I[B)V", line = 60)
    public class498(int arg0, byte[] arg1) {
        try {
            this.field7470 = arg0;
            class176 var3 = new class176(arg1);
            this.field7478 = var3.method1645((byte) -101);
            this.field7473 = new int[this.field7478][];
            this.field7474 = new boolean[this.field7478];
            this.field7469 = new int[this.field7478];
            this.field7472 = new int[this.field7478];
            for (int var4 = 0; var4 < this.field7478; var4++) {
                this.field7472[var4] = var3.method1645((byte) -128);
                if (this.field7472[var4] == 6) {
                    this.field7472[var4] = 2;
                }
            }
            for (int var5 = 0; var5 < this.field7478; var5++) {
                this.field7474[var5] = var3.method1645((byte) -109) == 1;
            }
            for (int var6 = 0; var6 < this.field7478; var6++) {
                this.field7469[var6] = var3.method1687((byte) -54);
            }
            for (int var7 = 0; var7 < this.field7478; var7++) {
                this.field7473[var7] = new int[var3.method1645((byte) -127)];
            }
            for (int var8 = 0; var8 < this.field7478; var8++) {
                for (int var9 = 0; var9 < this.field7473[var8].length; var9++) {
                    this.field7473[var8][var9] = var3.method1645((byte) -107);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7479[3] + arg0 + ',' + (arg1 == null ? field7479[1] : field7479[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3765(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3766(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class150 {

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "Lkha;")
    private class687 field1823;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "[[I")
    private int[][] field1818;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[Z")
    private boolean[] field1817;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "Lus;")
    public static class328 field1822 = new class328(11, 6);

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 3)
    public static void method937(int arg0) {
        field1822 = null;
        if (arg0 != 1) {
            field1824 = -85;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IB)[I", line = 23)
    public final int[] method938(int arg0, byte arg1) {
        field1821++;
        if (arg0 < 0 || arg0 >= this.field1818.length) {
            return this.field1820 == -1 ? new int[0] : new int[] { this.field1820 };
        } else if (this.field1817[arg0] && this.field1818[arg0].length > 1) {
            int var3 = this.field1820 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field1818[arg0].length];
            class617.method3391(this.field1818[arg0], 0, var5, 0, var5.length);
            if (arg1 < 66) {
                field1822 = null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class408.method2420((byte) 78, var4, var5.length - var3) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field1818[arg0];
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Z", line = 71)
    public final boolean method939(int arg0) {
        field1825++;
        if (arg0 != -21122) {
            field1824 = -106;
        }
        return this.field1820 != -1;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 83)
    public class150(class286 arg0, int arg1, class687 arg2) {
        this.field1823 = arg2;
        this.field1823.method3812(0, 1);
        class179 var4 = new class179(this.field1823.method3810(0, -23360, 0));
        int var5 = var4.method1094(255);
        if (var5 > 3) {
            this.field1820 = -1;
            this.field1818 = new int[0][];
            this.field1817 = new boolean[0];
        } else {
            int var6 = var4.method1094(255);
            class669[] var7 = class199.method1244(0);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1094(255);
                    if (var7[var9].field9156 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1094(255);
                int var12 = var4.method1094(255);
                if (var5 <= 2) {
                    this.field1820 = -1;
                } else {
                    this.field1820 = var4.method1137((byte) -78);
                }
                this.field1818 = new int[var12 + 1][];
                this.field1817 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1094(255);
                    this.field1817[var15] = var4.method1094(255) == 1;
                    int var16 = var4.method1107(false);
                    if (this.field1820 == -1) {
                        this.field1818[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field1818[var15][var18] = var4.method1107(false);
                        }
                    } else {
                        this.field1818[var15] = new int[var16 + 1];
                        this.field1818[var15][0] = this.field1820;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field1818[var15][var17 + 1] = var4.method1107(false);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field1818[var14] == null) {
                        if (this.field1820 == -1) {
                            this.field1818[var14] = new int[0];
                        } else {
                            this.field1818[var14] = new int[] { this.field1820 };
                        }
                    }
                }
            } else {
                this.field1820 = -1;
                this.field1818 = new int[0][];
                this.field1817 = new boolean[0];
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)Ljha;", line = 226)
    public final class101 method940(int arg0, int arg1) {
        field1819++;
        if (arg0 > -53) {
            this.field1823 = null;
        }
        byte[] var3 = this.field1823.method3810(1, -23360, arg1);
        class101 var4 = new class101();
        var4.method680(16843, new class179(var3));
        return var4;
    }
}

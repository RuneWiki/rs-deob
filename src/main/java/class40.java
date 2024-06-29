import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 extends class130 {

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Lca;")
    public class16 field904 = new class16();

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Lue;")
    public class135 field914 = new class135();

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Lv;")
    private class136 field905;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lmb;")
    public static class84 field911 = null;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lmb;")
    public static class84 field910 = class79.method672(true, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lsa;")
    public static class119 field912 = new class119(64);

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Lmb;")
    private static class84 field920 = class79.method672(true, "Add ignore");

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lmb;")
    public static class84 field916 = field920;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "[I")
    public static int[] field923 = new int[256];

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Lmb;")
    private static class84 field922 = class79.method672(true, "Members object");

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lmb;")
    public static class84 field921 = field922;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lj;")
    public static class62 field925;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "[I")
    public static int[] field918;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[[B")
    public static byte[][] field917;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method299(int arg0) {
        field922 = null;
        field925 = null;
        field918 = null;
        field920 = null;
        field910 = null;
        field912 = null;
        field911 = null;
        field921 = null;
        field916 = null;
        field923 = null;
        if (arg0 == -27883) {
            field917 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()Lu;")
    public final class130 method300() {
        field903++;
        class5 var1 = (class5) this.field904.method104((byte) 101);
        if (var1 == null) {
            return null;
        } else if (var1.field101 == null) {
            return this.method307();
        } else {
            return var1.field101;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public static final void method301(byte arg0) {
        class41.field929 = null;
        if (arg0 != 98) {
            field922 = null;
        }
        class65.field1604 = null;
        class90.field2265 = null;
        class118.field2832 = null;
        class44.field977 = null;
        class136.field3245 = null;
        class2.field51 = null;
        class66.field1634 = null;
        class106.field2569 = null;
        field913++;
        class52.field1163 = null;
        class136.field3263 = null;
        class95.field2353 = null;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public final void method302(int arg0) {
        field908++;
        for (class5 var2 = (class5) this.field904.method104((byte) 101); var2 != null; var2 = (class5) this.field904.method107(-2)) {
            if (!this.field905.method1107(var2, (byte) -126)) {
                int var3 = arg0;
                do {
                    if (var2.field82 >= var3) {
                        this.method303(33, var2, var3);
                        var2.field82 -= var3;
                        break;
                    }
                    this.method303(83, var2, var2.field82);
                    var3 -= var2.field82;
                } while (!this.field905.method1104((byte) 87, var2));
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILad;I)V")
    private final void method303(int arg0, class5 arg1, int arg2) {
        field907++;
        if ((this.field905.field3230[arg1.field74] & 0x4) != 0 && arg1.field81 < 0) {
            int var4 = this.field905.field3286[arg1.field74] / class1.field4;
            int var5 = (var4 + 1048575 - arg1.field97) / var4;
            arg1.field97 = arg2 * var4 + arg1.field97 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field905.field3246[arg1.field74] == 0) {
                    arg1.field101 = class61.method550(arg1.field92, arg1.field101.method555(), arg1.field101.method531(), arg1.field101.method548());
                } else {
                    arg1.field101 = class61.method550(arg1.field92, arg1.field101.method555(), 0, arg1.field101.method548());
                    this.field905.method1095(true, arg1.field87.field1755[arg1.field96] < 0, arg1);
                }
                if (arg1.field87.field1755[arg1.field96] < 0) {
                    arg1.field101.method556(-1);
                }
                arg2 = arg1.field97 / var4;
            }
        }
        if (arg0 < 7) {
            this.method304(null, -128, -105);
        }
        arg1.field101.method302(arg2);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V")
    public final void method304(int[] arg0, int arg1, int arg2) {
        field906++;
        this.field914.method304(arg0, arg1, arg2);
        int var4 = arg1 + arg2;
        for (class5 var5 = (class5) this.field904.method104((byte) 101); var5 != null; var5 = (class5) this.field904.method107(-2)) {
            if (!this.field905.method1107(var5, (byte) -125)) {
                int var6 = arg2;
                int var7 = arg1;
                do {
                    if (var6 <= var5.field82) {
                        this.method305(arg0, var7, var6, var4, var5, -74);
                        var5.field82 -= var6;
                        break;
                    }
                    this.method305(arg0, var7, var5.field82, var4, var5, -52);
                    var6 -= var5.field82;
                    var7 += var5.field82;
                } while (!this.field905.method1104((byte) 109, var5));
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIIILad;I)V")
    private final void method305(int[] arg0, int arg1, int arg2, int arg3, class5 arg4, int arg5) {
        if ((this.field905.field3230[arg4.field74] & 0x4) != 0 && arg4.field81 < 0) {
            int var7 = this.field905.field3286[arg4.field74] / class1.field4;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field97) / var7;
                if (arg2 < var8) {
                    arg4.field97 += arg2 * var7;
                    break;
                }
                arg4.field101.method304(arg0, arg1, var8);
                arg2 -= var8;
                int var9 = class1.field4 / 100;
                arg1 += var8;
                int var10 = 262144 / var7;
                class61 var11 = arg4.field101;
                arg4.field97 += var7 * var8 - 1048576;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field905.field3246[arg4.field74] == 0) {
                    arg4.field101 = class61.method550(arg4.field92, var11.method555(), var11.method531(), var11.method548());
                } else {
                    arg4.field101 = class61.method550(arg4.field92, var11.method555(), 0, var11.method548());
                    this.field905.method1095(true, arg4.field87.field1755[arg4.field96] < 0, arg4);
                    arg4.field101.method564(var9, var11.method531());
                }
                if (arg4.field87.field1755[arg4.field96] < 0) {
                    arg4.field101.method556(-1);
                }
                var11.method566(var9);
                var11.method304(arg0, arg1, arg3 - arg1);
                if (var11.method529()) {
                    this.field914.method1082(var11);
                }
            }
        }
        arg4.field101.method304(arg0, arg1, arg2);
        field909++;
        int var12 = -76 / ((31 - arg5) / 32);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public final int method306() {
        field915++;
        return 0;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()Lu;")
    public final class130 method307() {
        field902++;
        class5 var1;
        do {
            var1 = (class5) this.field904.method107(-2);
            if (var1 == null) {
                return null;
            }
        } while (var1.field101 == null);
        return var1.field101;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lv;)V")
    public class40(class136 arg0) {
        this.field905 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field923[var0] = var1;
        }
        field926 = 10;
    }
}

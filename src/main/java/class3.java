import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class183 {

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field14 = -1;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Ljf;")
    private static class229 field10 = class212.method1457((byte) 123, "Connected to update server");

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Ljf;")
    public static class229 field12 = field10;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Ljf;")
    public static class229 field26 = class212.method1457((byte) 109, "<br>");

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "[[I")
    public static int[][] field16 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "Ljf;")
    public static class229 field24 = class212.method1457((byte) 85, "blinken2:");

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lnf;")
    public static class67 field19;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "[[Lkc;")
    public static class37[][] field20;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 9)
    public static final void method9() {
        for (int var0 = 0; var0 < class303.field5153; var0++) {
            class104 var1 = class115.field2072[var0];
            class146.method1015(var1);
            class115.field2072[var0] = null;
        }
        class303.field5153 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)[I", line = 23)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            method18(111, (class198) null, (Frame) null);
        }
        int[] var3 = this.field3161.method664(arg0, arg1 + 1);
        field18++;
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, 93);
            for (int var5 = 0; var5 < class22.field393; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)Ljf;", line = 55)
    public static final class229 method11(int arg0, int arg1) {
        if (arg0 == 64) {
            field11++;
            return arg1 < 999999999 ? class84.method607(arg0 ^ 0x10, arg1) : class26.field475;
        } else {
            return (class229) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I", line = 71)
    public final int[][] method12(int arg0, int arg1) {
        field17++;
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var4 = this.method1250(arg1, 0, (byte) 112);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class22.field393; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        int var12 = 16 % ((arg0 - 18) / 61);
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lek;I)I", line = 116)
    public static final int method13(class185 arg0, int arg1) {
        field22++;
        int var2 = 0;
        if (arg1 < 22) {
            field24 = (class229) null;
        }
        if (arg0.method1289(class284.field4883, -69)) {
            var2++;
        }
        if (arg0.method1289(class202.field3535, -84)) {
            var2++;
        }
        if (arg0.method1289(class295.field5044, -110)) {
            var2++;
        }
        if (arg0.method1289(class68.field1305, -72)) {
            var2++;
        }
        if (arg0.method1289(class78.field1441, -98)) {
            var2++;
        }
        if (arg0.method1289(class215.field3693, -61)) {
            var2++;
        }
        if (arg0.method1289(class226.field3869, -60)) {
            var2++;
        }
        if (arg0.method1289(class115.field2082, -68)) {
            var2++;
        }
        if (arg0.method1289(class258.field4502, -110)) {
            var2++;
        }
        if (arg0.method1289(class16.field267, -82)) {
            var2++;
        }
        if (arg0.method1289(class246.field4371, -98)) {
            var2++;
        }
        if (arg0.method1289(class90.field1643, -92)) {
            var2++;
        }
        if (arg0.method1289(class288.field4931, -100)) {
            var2++;
        }
        if (arg0.method1289(class241.field4257, -123)) {
            var2++;
        }
        if (arg0.method1289(class105.field1819, -103)) {
            var2++;
        }
        if (arg0.method1289(class152.field2633, -96)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILkh;I)V", line = 191)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 < -43) {
            if (arg2 == 0) {
                this.field3166 = arg1.method93(false) == 1;
            }
            field13++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 205)
    public static void method15(int arg0) {
        field12 = null;
        field24 = null;
        field26 = null;
        field10 = null;
        field16 = (int[][]) null;
        field20 = (class37[][]) null;
        field19 = null;
        if (arg0 != 128) {
            field24 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 222)
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 226)
    public static final void method16(int arg0) {
        field21++;
        class223.field3801.method230(true);
        if (arg0 != 1) {
            field19 = (class67) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V", line = 242)
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field23++;
        int var6 = arg1 - arg3;
        int var7 = arg2 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class271.method1911(arg3, arg5, arg2, arg0 ^ 0xFFFFC939, arg4);
            }
        } else if (var7 == 0) {
            class328.method2206(arg4, arg3, arg5, arg1, arg0 + 14067);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class149.field2578) {
                var11 = (class149.field2578 * var8 >> 12) + var9;
                var10 = class149.field2578;
            } else if (class327.field5490 < arg3) {
                var10 = class327.field5490;
                var11 = var9 + (class327.field5490 * var8 >> 12);
            } else {
                var10 = arg3;
                var11 = arg5;
            }
            if (var11 < class56.field991) {
                var10 = (class56.field991 - var9 << 12) / var8;
                var11 = class56.field991;
            } else if (class142.field2458 < var11) {
                var10 = (class142.field2458 - var9 << 12) / var8;
                var11 = class142.field2458;
            }
            int var12;
            int var13;
            if (class149.field2578 > arg1) {
                var12 = class149.field2578;
                var13 = (class149.field2578 * var8 >> 12) + var9;
            } else if (arg1 <= class327.field5490) {
                var13 = arg2;
                var12 = arg1;
            } else {
                var12 = class327.field5490;
                var13 = (class327.field5490 * var8 >> 12) + var9;
            }
            if (class56.field991 > var13) {
                var13 = class56.field991;
                var12 = (class56.field991 - var9 << 12) / var8;
            } else if (class142.field2458 < var13) {
                var12 = (class142.field2458 - var9 << 12) / var8;
                var13 = class142.field2458;
            }
            if (arg0 != -14023) {
                field24 = (class229) null;
            }
            class22.method215(var12, (byte) 37, arg4, var11, var10, var13);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILkn;Ljava/awt/Frame;)V", line = 354)
    public static final void method18(int arg0, class198 arg1, Frame arg2) {
        while (true) {
            class231 var3 = arg1.method1369(104, arg2);
            while (var3.field4011 == 0) {
                class235.method1675((byte) -22, 10L);
            }
            if (var3.field4011 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                field25++;
                if (arg0 > -104) {
                    field16 = (int[][]) ((int[][]) null);
                }
                return;
            }
            class235.method1675((byte) -22, 100L);
        }
    }
}

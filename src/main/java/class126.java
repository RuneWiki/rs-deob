import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class126 extends class172 {

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/String;")
    public String field2105;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lfk;")
    public static class317 field2106 = new class317();

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2109 = "Drop";

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Z")
    public static boolean field2111 = false;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[I")
    public static int[] field2114 = new int[1024];

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "[I")
    public static int[] field2115 = new int[4];

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "F")
    public static float field2108;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)I", line = 5)
    public static final int method1088(int arg0, byte arg1, int arg2) {
        int var3 = arg2 >>> 31;
        field2104++;
        if (arg1 > -48) {
            field2113 = 125;
        }
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z", line = 18)
    public static final boolean method1089(int arg0) {
        field2107++;
        if (arg0 != 1101971809) {
            return true;
        }
        if (class23.field354) {
            try {
                return !(Boolean) class141.method1176(class340.field5234.field4975, true, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V", line = 38)
    public static final void method1090(byte arg0, int arg1) {
        class155.field2503 = arg1;
        field2103++;
        class332.field5098 = 100;
        class310.field4800 = -1;
        class300.field4664 = 3;
        int var2 = 111 / ((arg0 - 15) / 33);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)Lbg;", line = 53)
    public static final class93 method1091(byte arg0, int arg1) {
        field2110++;
        class93 var2 = (class93) class356.field5663.method654(44, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class327.field5025.method187(class199.method1502((byte) 127, arg1), class277.method2031(arg1, -10800), -1);
        class93 var4 = new class93();
        var4.field1415 = arg1;
        if (var3 != null) {
            var4.method834((byte) -126, new class25(var3));
        }
        var4.method828((byte) 102);
        class356.field5663.method652(-96, var4, (long) arg1);
        return arg0 <= 0 ? (class93) null : var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 81)
    public static void method1092(byte arg0) {
        field2109 = null;
        field2106 = null;
        field2115 = null;
        field2114 = null;
        if (arg0 != -97) {
            field2108 = -0.942343F;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIILf;II)V", line = 98)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        field2102++;
        int var9 = arg1 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg6.field3306;
            var10 = arg6.field3250;
        } else {
            var10 = arg6.field3306;
            var11 = arg6.field3250;
        }
        int var12;
        int var13;
        if (arg4 + var10 > 104) {
            var12 = arg4 + 1;
            var13 = arg4;
        } else {
            var12 = arg4 + (var10 + 1 >> 1);
            var13 = arg4 + (var10 >> 1);
        }
        int var14 = (arg4 << 7) + (var10 << 6);
        int var15 = (arg8 << 7) + (var11 << 6);
        if (arg3 != 1) {
            method1089(78);
        }
        int var16;
        int var17;
        if ((arg8 + var11) <= 104) {
            var16 = arg8 + (var11 + 1 >> 1);
            var17 = (var11 >> 1) + arg8;
        } else {
            var17 = arg8;
            var16 = arg8 + 1;
        }
        int[][] var18 = class277.field4290[arg0];
        int var19 = var18[var13][var16] + var18[var13][var17] + var18[var12][var17] + var18[var12][var16] >> 2;
        int var20 = 0;
        if (arg0 != 0) {
            int[][] var21 = class277.field4290[0];
            var20 = var19 - (var21[var13][var17] + var21[var12][var17] + var21[var13][var16] + var21[var12][var16] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg0 < 3) {
            var22 = class277.field4290[arg0 + 1];
        }
        class118 var23 = arg6.method1571(false, var15, var18, arg2, (class77) null, arg3 ^ 0xFFFFFF87, var14, var19, true, arg1, var22);
        class127.method1101(var23.field1809, var14 - arg7, var20, var15 - arg5);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 193)
    public class126() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 195)
    public class126(String arg0) {
        this.field2105 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class43 extends class51 {

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "Lph;")
    public static class229 field663 = class266.method1858("::qa_op_test", 0);

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "Lph;")
    public static class229 field662 = class266.method1858("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "[[Z")
    public static boolean[][] field669 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "[J")
    public static long[] field667 = new long[1000];

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "Lkh;")
    public class250 field670;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "[B")
    public byte[] field655;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "(I)V", line = 10)
    public static final void method321(int arg0) {
        field659++;
        if (arg0 != -25256) {
            return;
        }
        int var1 = class156.field2537;
        int var2 = class36.field595;
        int var3 = class304.field5078;
        int var4 = class108.field1845;
        int var5 = 6116423;
        if (class99.field1675) {
            class212.method1494(var2, var3, var4, var1, var5);
            class212.method1494(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class212.method1501(var2 + 1, var3 + 18, var4 - 2, var1 + -19, 0);
        } else {
            class210.method1465(var2, var3, var4, var1, var5);
            class210.method1465(var2 + 1, var3 - -1, var4 - 2, 16, 0);
            class210.method1463(var2 + 1, var3 + 18, var4 - 2, var1 + -19, 0);
        }
        class213.field3517.method260(class134.field2183, var2 + 3, var3 + 14, var5, -1);
        int var6 = class220.field3617;
        int var7 = class118.field1985;
        for (int var8 = 0; var8 < class314.field5337; var8++) {
            int var9 = (class314.field5337 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var2 < var7 && var7 < (var2 + var4) && (var9 - 13) < var6 && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class213.field3517.method260(class263.method1834(var8, (byte) -122), var2 + 3, var9, var10, 0);
        }
        class108.method829(class36.field595, class304.field5078, 0, class108.field1845, class156.field2537);
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(I)I", line = 72)
    public final int method322(int arg0) {
        int var2 = 27 / ((arg0) / 58);
        field664++;
        return this.field725 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)[B", line = 105)
    public final byte[] method323(int arg0) {
        field661++;
        if (this.field725) {
            throw new RuntimeException();
        }
        if (arg0 != 16777215) {
            field669 = (boolean[][]) ((boolean[][]) null);
        }
        return this.field655;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IZ)Lvc;", line = 123)
    public static final class189 method324(int arg0, boolean arg1) {
        field657++;
        class189 var2 = (class189) class174.field2847.method1027(-67, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class173.field2829.method523(-61, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class189 var4 = new class189();
        class164 var5 = new class164(var3);
        var5.field2670 = var5.field2668.length - 2;
        if (arg1) {
            field663 = (class229) null;
        }
        int var6 = var5.method1161(!arg1);
        int var7 = var5.field2668.length - var6 - 2 - 12;
        var5.field2670 = var7;
        int var8 = var5.method1191(31776);
        var4.field3064 = var5.method1161(true);
        var4.field3075 = var5.method1161(true);
        var4.field3076 = var5.method1161(true);
        var4.field3066 = var5.method1161(true);
        int var9 = var5.method1178(8);
        if (var9 > 0) {
            var4.field3070 = new class97[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1161(true);
                class97 var12 = new class97(class303.method2049(var11, 2539));
                var4.field3070[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1191(31776);
                    int var14 = var5.method1191(31776);
                    var12.method710(new class295(var14), (byte) 86, (long) var13);
                }
            }
        }
        var5.field2670 = 0;
        var4.field3065 = var5.method1202(arg1);
        var4.field3069 = new int[var8];
        var4.field3062 = new int[var8];
        var4.field3061 = new class229[var8];
        int var15 = 0;
        while (var5.field2670 < var7) {
            int var16 = var5.method1161(true);
            if (var16 == 3) {
                var4.field3061[var15] = var5.method1190(0);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3062[var15] = var5.method1178(8);
            } else {
                var4.field3062[var15] = var5.method1191(31776);
            }
            var4.field3069[var15++] = var16;
        }
        class174.field2847.method1026(var4, 120, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(I)V", line = 224)
    public static void method325(int arg0) {
        int var1 = 9 % ((arg0 + 17) / 36);
        field663 = null;
        field669 = (boolean[][]) null;
        field662 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ[JI[Ljava/lang/Object;)V", line = 258)
    public static final void method326(int arg0, boolean arg1, long[] arg2, int arg3, Object[] arg4) {
        field656++;
        if (arg1) {
            method325(100);
        }
        if (arg0 <= arg3) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var9;
        for (int var10 = arg3; var10 < arg0; var10++) {
            if (arg2[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg0] = arg4[var6];
        arg4[var6] = var9;
        method326(var6 - 1, false, arg2, arg3, arg4);
        method326(arg0, false, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILqa;III)V", line = 312)
    public static final void method327(int arg0, class83 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 1) {
            method324(-23, true);
        }
        field660++;
        for (class332 var5 = (class332) class75.field1266.method1580((byte) -39); var5 != null; var5 = (class332) class75.field1266.method1579((byte) 28)) {
            if (var5.field5653 == arg2 && arg4 * 128 == var5.field5663 && (arg3 * 128) == var5.field5641 && var5.field5642.field1421 == arg1.field1421) {
                if (var5.field5662 != null) {
                    class239.field3949.method2150(var5.field5662);
                    var5.field5662 = null;
                }
                if (var5.field5652 != null) {
                    class239.field3949.method2150(var5.field5652);
                    var5.field5652 = null;
                }
                var5.method598(arg0 + 70);
                return;
            }
        }
    }
}

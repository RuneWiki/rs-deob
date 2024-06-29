import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class122 extends class175 {

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lpe;")
    public static class100 field2140 = new class100(50);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Z")
    public static boolean field2149 = false;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "[S")
    public static short[] field2148 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V")
    private final void method884(int arg0, byte arg1) {
        this.field2139 = (arg0 & 255) << 4;
        this.field2146 = arg0 >> 4 & 4080;
        ++field2150;
        if (arg1 != 25) {
            this.field2143 = -29;
        }
        this.field2143 = (16711680 & arg0) >> 12;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Laa;IIIII)V")
    public static final void method885(class16 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class261.field4553 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class139.field2421) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class54.field978 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class65 var14 = class59.field1089[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class245.field4257[var11][var12 + 1][var13] + class245.field4257[var11][var12][var13] + class245.field4257[var11][var12][var13 + 1] + class245.field4257[var11][var12 + 1][var13 + 1]) / 4 - (class245.field4257[arg1][arg2 + 1][arg3] + class245.field4257[arg1][arg2][arg3] + class245.field4257[arg1][arg2][arg3 + 1] + class245.field4257[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class55 var16 = var14.field1233;
                                    if (var16 != null) {
                                        if (var16.field993.method127()) {
                                            arg0.method120(var16.field993, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field984 != null && var16.field984.method127()) {
                                            arg0.method120(var16.field984, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1244; ++var17) {
                                        class106 var18 = var14.field1236[var17];
                                        if (var18 != null && var18.field1901.method127() && (var18.field1913 == var12 || var7 == var12) && (var18.field1906 == var13 || var9 == var13)) {
                                            int var19 = var18.field1907 - var18.field1913 + 1;
                                            int var20 = var18.field1919 - var18.field1906 + 1;
                                            arg0.method120(var18.field1901, (var18.field1913 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1906 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lij;I)I")
    public static final int method886(class50 arg0, int arg1) {
        if (arg1 != 50) {
            method885((class16) null, 21, 49, -6, 78, -98);
        }
        ++field2153;
        return 1 + arg0.method396(arg1 ^ 51);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    private class122(int arg0) {
        super(0, false);
        this.method884(arg0, (byte) 25);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class122() {
        this(0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg0) {
            ++field2145;
            if (~arg1 == -1) {
                this.method884(arg2.method1447(121), (byte) 25);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lda;ILda;Lda;Lda;)V")
    public static final void method887(class22 arg0, int arg1, class22 arg2, class22 arg3, class22 arg4) {
        ++field2142;
        class82.field1484 = arg3;
        class3.field46 = arg2;
        class217.field3630 = arg0;
        int var5 = 11 / ((-19 - arg1) / 49);
        class94.field1749 = arg4;
        class137.field2380 = new class10[class217.field3630.method170(-1)][];
        class182.field2993 = new boolean[class217.field3630.method170(-1)];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        if (arg1 != -20740) {
            field2148 = null;
        }
        ++field2144;
        int[][] var3 = super.field2920.method117(arg0, (byte) -45);
        if (super.field2920.field356) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class211.field3514 < ~var7; ++var7) {
                var4[var7] = this.field2143;
                var5[var7] = this.field2146;
                var6[var7] = this.field2139;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static final void method888(byte arg0) {
        ++field2147;
        class221.field3722.method762((byte) 117);
        class42.field779.method762((byte) 117);
        class104.field1893.method762((byte) 117);
        if (arg0 == -125) {
            field2140.method762((byte) 117);
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2140 = null;
        field2148 = null;
        if (arg0 != 1) {
            field2149 = false;
        }
    }
}

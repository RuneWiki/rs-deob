import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class181 extends class122 {

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[I")
    public static int[] field2947 = new int[100];

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Lpl;")
    public static class186 field2945 = new class186(64);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V", line = 5)
    public static void method1319(int arg0) {
        field2947 = null;
        if (arg0 <= 94) {
            method1324(20);
        }
        field2945 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsd;B)V", line = 27)
    public static final void method1320(class26 arg0, byte arg1) {
        field2948++;
        while (true) {
            while (arg0.field478 < arg0.field472.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method226(255) == 1) {
                    var2 = true;
                    var4 = arg0.method226(255);
                    var3 = arg0.method226(255);
                }
                int var5 = arg0.method226(255);
                int var6 = arg0.method226(255);
                int var7 = class272.field4524 + class268.field4462 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class91.field1662;
                if (var8 >= 0 && (var7 - 63) >= 0 && class233.field3840 > var8 + 63 && var7 < class268.field4462) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && (var4 * 8 + 8) > var11 && var3 * 8 <= var12 && (var3 * 8 + 8) > var12) {
                                byte var13 = arg0.method234(2193);
                                if (var13 != 0) {
                                    if (class256.field4267[var9][var10] == null) {
                                        class256.field4267[var9][var10] = new byte[4096];
                                    }
                                    class256.field4267[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method234(2193);
                                    if (class235.field3847[var9][var10] == null) {
                                        class235.field3847[var9][var10] = new byte[4096];
                                    }
                                    class235.field3847[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method234(2193);
                        if (var16 != 0) {
                            arg0.field478++;
                        }
                    }
                }
            }
            if (arg1 < 90) {
                field2953 = 17;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V", line = 123)
    public static final void method1321(boolean arg0, int arg1) {
        field2950++;
        class177 var2 = class177.method1310(102, 10, arg1);
        var2.method1303((byte) 64);
        if (!arg0) {
            field2947 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Lsf;", line = 136)
    public static final class102 method1322(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null || var3.field222 == null ? null : var3.field222;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V", line = 145)
    public static final void method1323(int arg0, int arg1) {
        field2951++;
        class164 var2 = (class164) class48.field934.method1405((byte) 115, (long) arg1);
        if (var2 != null) {
            var2.method2095(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V", line = 164)
    public static final void method1324(int arg0) {
        class22.field387 = (byte[][]) null;
        class171.field2797 = null;
        class102.field1802 = null;
        class12.field208 = null;
        class210.field3356 = null;
        int var1 = -68 / ((arg0 + 22) / 36);
        class256.field4265 = null;
        field2946++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V", line = 179)
    public static final void method1325(int arg0, boolean arg1) {
        if (!arg1) {
            field2947 = (int[]) null;
        }
        field2952++;
        class298.field4984 = new int[arg0];
        class102.field1791 = new int[arg0];
        class19.field321 = new int[arg0];
        class54.field1053 = new int[arg0];
        class130.field2226 = new int[arg0];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method37(byte arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
    public abstract boolean method33(boolean arg0);
}

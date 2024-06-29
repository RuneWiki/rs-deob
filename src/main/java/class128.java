import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class128 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "B")
    private byte field2362;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lmb;")
    private static class132 field2367 = class166.method1092("Please contact customer support)3", 118);

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lmb;")
    public static class132 field2369 = field2367;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lmb;")
    public static class132 field2376 = class166.method1092("null", 125);

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lbg;")
    public static class19 field2370 = new class19();

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lmb;")
    private static class132 field2380 = class166.method1092("Created gameworld", 111);

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lmb;")
    public static class132 field2377 = field2380;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field2379 = 0;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lmb;")
    private static class132 field2381 = class166.method1092("Unexpected loginserver response)3", 115);

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lmb;")
    public static class132 field2383 = field2381;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lmb;")
    public static class132 field2378 = class166.method1092("::fpsoff", 117);

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
    public static int[] field2382 = new int[100];

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
    public final int method837(int arg0) {
        if (arg0 > -68) {
            return 57;
        } else {
            field2365++;
            return this.field2362 & 0x7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static final void method838(byte arg0) {
        if (arg0 != -4) {
            return;
        }
        for (int var1 = -1; var1 < class160.field2906; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class33.field527[var1];
            }
            class159 var3 = class68.field1120[var2];
            if (var3 != null) {
                class222.method1392(var3, 1, arg0 + 3);
            }
        }
        field2364++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)I")
    public final int method839(byte arg0) {
        if (arg0 == 17) {
            field2368++;
            return (this.field2362 & 0x8) == 8 ? 1 : 0;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lkd;)V")
    public class128(class112 arg0) {
        this.field2362 = arg0.method734(true);
        this.field2374 = arg0.method739(-125);
        this.field2363 = arg0.method759(116);
        this.field2372 = arg0.method759(85);
        this.field2375 = arg0.method759(102);
        this.field2371 = arg0.method759(37);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    public static void method840(byte arg0) {
        field2378 = null;
        field2381 = null;
        field2377 = null;
        field2380 = null;
        field2367 = null;
        field2369 = null;
        if (arg0 != -84) {
            method841(126, false);
        }
        field2382 = null;
        field2370 = null;
        field2383 = null;
        field2376 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public static final void method841(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class131.field2423; var2++) {
            class65 var3 = class11.field145[class226.field4098[var2]];
            long var4 = (long) class226.field4098[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method291(125) && arg1 == var3.field1072.field3437 && var3.field1072.method1181(122)) {
                int var6 = var3.field673 >> 7;
                int var7 = var3.field723 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field679 == 1 && (var3.field673 & 0x7F) == 64 && (var3.field723 & 0x7F) == 64) {
                        if (class117.field2237[var6][var7] == class209.field3800) {
                            continue;
                        }
                        class117.field2237[var6][var7] = class209.field3800;
                    }
                    if (!var3.field1072.field3414) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field719 = class195.method1239(var3.field679 * 64 + var3.field723 - 64, class139.field2615, false, var3.field673 + var3.field679 * 64 - 64);
                    class35.method249(class139.field2615, var3.field673, var3.field723, var3.field719, (var3.field679 - 1) * 64 + 60, var3, var3.field707, var4, var3.field674);
                }
            }
        }
        if (arg0 == 64) {
            field2366++;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILmf;JLmf;Lmf;)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, class136 arg4, long arg5, class136 arg6, class136 arg7) {
        class26 var9 = new class26();
        var9.field411 = arg4;
        var9.field416 = arg1 * 128 + 64;
        var9.field421 = arg2 * 128 + 64;
        var9.field429 = arg3;
        var9.field414 = arg5;
        var9.field412 = arg6;
        var9.field423 = arg7;
        int var10 = 0;
        class169 var11 = class101.field1900[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3096; var12++) {
                class78 var13 = var11.field3103[var12];
                if ((var13.field1355 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1363.method55();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field426 = -var10;
        if (class101.field1900[arg0][arg1][arg2] == null) {
            class101.field1900[arg0][arg1][arg2] = new class169(arg0, arg1, arg2);
        }
        class101.field1900[arg0][arg1][arg2].field3105 = var9;
    }
}

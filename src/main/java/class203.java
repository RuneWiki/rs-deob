import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class203 extends class322 {

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    private int field3379 = -32768;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lok;")
    public static class146 field3394 = class235.method1724(-12908, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    public static int[] field3380;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[[[Lse;")
    public static class11[][][] field3382;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIJILmk;)V", line = 5)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10) {
        field3383++;
        class208 var13 = class84.method589(false, this.field3381).method1818(this.field3386, 0, 125, (class287) null);
        if (var13 != null) {
            var13.method326(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3379 = var13.method325();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method1545(boolean arg0, int arg1) {
        field3384++;
        if (arg1 > -33) {
            field3394 = (class146) null;
        }
        byte[][] var2;
        byte var3;
        if (class271.field4640 && arg0) {
            var2 = class85.field1352;
            var3 = 1;
        } else {
            var2 = class43.field735;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3.method9(-96);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class52.field944[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = var7 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class177.field3002.length; var14++) {
                                if (class177.field3002[var14] == var13 && var2[var14] != null) {
                                    var8 = true;
                                    class301.method2130(var9, arg0, (var12 & 0x7) * 8, var6 * 8, 16, (var11 & 0x7) * 8, class251.field4202, var10, var4, var2[var14], var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class280.method2032(var4, -111, var6 * 8, 8, var5 * 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 123)
    public static void method1546(int arg0) {
        field3394 = null;
        field3380 = null;
        if (arg0 != 0) {
            field3392 = -96;
        }
        field3382 = (class11[][][]) null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V", line = 155)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3377++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLoh;ZLoh;)V", line = 163)
    public static final void method1547(boolean arg0, class15 arg1, boolean arg2, class15 arg3) {
        if (arg0) {
            class3.field24 = arg1;
            class112.field1783 = arg3;
            field3388++;
            class292.field4966 = arg2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I", line = 181)
    public static final int method1548(int arg0) {
        if (arg0 == 16) {
            field3390++;
            return 16;
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I", line = 192)
    public final int method325() {
        field3391++;
        return this.field3379;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V", line = 209)
    public static final void method1549(int arg0, byte arg1) {
        class266.field4562 = -1;
        class146.field2456 = 0;
        class195.field3242 = -1;
        class144.field2404 = arg0;
        class205.field3412 = false;
        class86.field1372 = null;
        int var2 = 73 % ((39 - arg1) / 41);
        class223.field3718 = 1;
        field3393++;
    }
}

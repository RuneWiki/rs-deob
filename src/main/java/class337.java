import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class337 extends class188 {

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public int field5373 = 0;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "[J")
    public static long[] field5382 = new long[100];

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Z")
    public static boolean field5384 = true;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field5389 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static volatile int field5378 = 0;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Z")
    public static boolean field5401 = true;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field5381;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public int field5399;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lnk;")
    public static class16 field5379;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lo;")
    public class231 field5393;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lia;")
    public class234 field5398;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lrc;")
    public class359 field5386;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lrc;")
    public class359 field5392;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Lwf;")
    public class67 field5397;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
    public boolean field5391;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    public int[] field5385;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 16)
    public static void method2327(int arg0) {
        field5379 = null;
        if (arg0 == 255) {
            field5382 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V", line = 34)
    public final void method2328(int arg0) {
        field5396++;
        int var2 = this.field5380;
        if (arg0 != 128) {
            method2327(-70);
        }
        if (this.field5398 != null) {
            class234 var3 = this.field5398.method1624(true);
            if (var3 == null) {
                this.field5400 = 0;
                this.field5385 = null;
                this.field5380 = -1;
                this.field5381 = 0;
                this.field5377 = 0;
                this.field5387 = 0;
            } else {
                this.field5380 = var3.field3536;
                this.field5400 = var3.field3580;
                this.field5381 = var3.field3528;
                this.field5387 = var3.field3592;
                this.field5377 = var3.field3542 * 128;
                this.field5385 = var3.field3579;
            }
        } else if (this.field5393 != null) {
            int var4 = class79.method516(this.field5393, (byte) 115);
            if (var2 != var4) {
                this.field5380 = var4;
                class140 var5 = this.field5393.field3503;
                if (var5.field2101 != null) {
                    var5 = var5.method961(arg0 ^ 0xFFFFFF0E);
                }
                if (var5 == null) {
                    this.field5400 = this.field5377 = 0;
                } else {
                    this.field5400 = var5.field2110;
                    this.field5377 = var5.field2158 * 128;
                }
            }
        } else if (this.field5397 != null) {
            this.field5380 = class55.method333(this.field5397, true);
            this.field5377 = this.field5397.field820 * 128;
            this.field5400 = this.field5397.field837;
        }
        if (this.field5380 != var2 && this.field5386 != null) {
            class20.field239.method2339(this.field5386);
            this.field5386 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JBZ)V", line = 131)
    public static final void method2329(long arg0, byte arg1, boolean arg2) {
        field5383++;
        if (arg0 == 0L) {
            return;
        }
        if (class274.field4339 >= 100) {
            class306.method2157(class32.field374, false, 0, "");
            return;
        }
        String var4 = class241.method1704(-62, arg0);
        for (int var5 = 0; var5 < class274.field4339; var5++) {
            if (field5382[var5] == arg0) {
                class306.method2157(var4 + class353.field5635, false, 0, "");
                return;
            }
        }
        for (int var6 = 0; var6 < class95.field1313; var6++) {
            if (class229.field3477[var6] == arg0) {
                class306.method2157(class184.field2771 + var4 + class108.field1479, false, 0, "");
                return;
            }
        }
        if (var4.equals(class11.field113.field848)) {
            class306.method2157(class77.field1004, false, 0, "");
            return;
        }
        class112.field1556++;
        field5382[class274.field4339] = arg0;
        class172.field2615[class274.field4339] = class93.method592((byte) -73, arg0);
        class25.field296[class274.field4339++] = arg2;
        class49.field566 = class181.field2734;
        class328.field5282.method304(40, 19830);
        class328.field5282.method1039(arg0, (byte) -100);
        if (arg1 <= 86) {
            field5384 = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[ZZZIILwb;I[I[[FI[[IB[[FI[[FIII[[IZZ)V", line = 201)
    public static final void method2330(boolean arg0, boolean[] arg1, boolean arg2, boolean arg3, int arg4, int arg5, class175 arg6, int arg7, int[] arg8, float[][] arg9, int arg10, int[][] arg11, byte arg12, float[][] arg13, int arg14, float[][] arg15, int arg16, int arg17, int arg18, int[][] arg19, boolean arg20, boolean arg21) {
        if (!arg0) {
            field5379 = (class16) null;
        }
        field5390++;
        int var22 = (arg2 ? 255 : 0) + (arg16 << 8);
        int var23 = (arg3 ? 255 : 0) + (arg17 << 8);
        int var24 = (arg21 ? 255 : 0) + (arg5 << 8);
        int var25 = (arg20 ? 255 : 0) + (arg7 << 8);
        int[] var26 = new int[arg8.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg8[var27 + var27];
            int var29 = arg8[var27 + var27 + 1];
            int[][] var30 = arg19 == null || arg1 == null || !arg1[var27] ? arg11 : arg19;
            var26[var27] = class247.method1755(arg13, arg12, var22, arg15, var28, var30, (byte) 84, var23, var24, arg9, (float) arg4, arg18, arg6, false, var29, arg19, var25, arg10);
        }
        arg6.method1221(arg14, arg18, arg10, var26, (int[]) null, false);
    }
}

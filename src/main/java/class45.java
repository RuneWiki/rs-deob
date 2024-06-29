import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class45 extends class210 {

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[Z")
    private boolean[] field1000;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "[[I")
    public int[][] field1002;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "[I")
    public int[] field1005;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Ljd;")
    public static class92 field994 = class202.method1325((byte) 90, "me");

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field1001 = 1;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field1004 = 0;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "J")
    public static long field997;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lrf;")
    public static class167[] field996;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    public static final void method280(int arg0, int arg1, int arg2, int arg3) {
        class43 var4 = class31.field698[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class138 var5 = var4.field953;
        if (var5 != null) {
            var5.field2760 = var5.field2760 * arg3 / 16;
            var5.field2771 = var5.field2771 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILnh;)[Lsc;")
    public static final class173[] method281(int arg0, int arg1, int arg2, class133 arg3) {
        field995++;
        int var4 = 38 % ((-arg1 - 16) / 50);
        return class157.method1016(arg3, arg2, -109, arg0) ? class66.method391((byte) 110) : null;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public static void method282(byte arg0) {
        if (arg0 <= -62) {
            field994 = null;
            field996 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
    public static final int method283(int arg0) {
        if (arg0 != 12053) {
            field1004 = 100;
        }
        field1007++;
        return 6;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)I")
    public static final int method284(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field999++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 != 21) {
            field996 = null;
        }
        if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
    public static final void method285(byte arg0) {
        int var1 = class4.field242.method1000(class68.field1365);
        for (int var2 = 0; var2 < class3.field182; var2++) {
            int var6 = class4.field242.method1000(class206.method1340(false, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class186.field3513 = class3.field182 * 15 + 22;
        class72.field1524 = true;
        int var3 = class3.field182 * 15 + 21;
        class211.field4084 = var1;
        field1008++;
        int var4 = class81.field1645;
        int var5 = class31.field705 - var1 / 2;
        if (var4 + var3 > 503) {
            var4 = 503 - var3;
        }
        if (var1 + var5 > 765) {
            var5 = 765 - var1;
        }
        if (arg0 != -5) {
            method285((byte) 80);
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class10.field362 = var5;
        class166.field3264 = var4;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
    public static final void method286(int arg0) {
        class143.field2854++;
        field1009++;
        class99.field2000.method405(arg0, 7);
        for (class105 var1 = (class105) class118.field2394.method215((byte) -121); var1 != null; var1 = (class105) class118.field2394.method209(false)) {
            if (var1.field2147 == 0) {
                class100.method693(false, var1, true);
            }
        }
        if (class93.field1897 != null) {
            class3.method21(26702, class93.field1897);
            class93.field1897 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V")
    public class45(int arg0, byte[] arg1) {
        this.field1003 = arg0;
        class70 var3 = new class70(arg1);
        this.field998 = var3.method443(255);
        this.field1000 = new boolean[this.field998];
        this.field1002 = new int[this.field998][];
        this.field1005 = new int[this.field998];
        for (int var4 = 0; var4 < this.field998; var4++) {
            this.field1005[var4] = var3.method443(255);
        }
        for (int var5 = 0; var5 < this.field998; var5++) {
            this.field1000[var5] = var3.method443(255) == 1;
        }
        for (int var6 = 0; var6 < this.field998; var6++) {
            this.field1002[var6] = new int[var3.method443(255)];
        }
        for (int var7 = 0; var7 < this.field998; var7++) {
            for (int var8 = 0; var8 < this.field1002[var7].length; var8++) {
                this.field1002[var7][var8] = var3.method443(255);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lh;IIIIIII)V")
    public static final void method287(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -61) {
            method284(-79, 16, 57, 8);
        }
        if (arg7 >= 0 && arg7 < 104 && arg6 >= 0 && arg6 < 104) {
            class59.field1239[arg4][arg7][arg6] = 0;
            while (true) {
                int var8 = arg0.method443(255);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class125.field2538[0][arg7][arg6] = -class144.method948(arg5 + arg7 + 932731, true, arg6 + arg1 + 556238) * 8;
                    } else {
                        class125.field2538[arg4][arg7][arg6] = class125.field2538[arg4 - 1][arg7][arg6] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method443(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class125.field2538[0][arg7][arg6] = -var9 * 8;
                    } else {
                        class125.field2538[arg4][arg7][arg6] = class125.field2538[arg4 - 1][arg7][arg6] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class139.field2789[arg4][arg7][arg6] = arg0.method431(-12469);
                    class70.field1485[arg4][arg7][arg6] = (byte) ((var8 - 2) / 4);
                    class189.field3598[arg4][arg7][arg6] = (byte) class196.method1301(3, arg3 + var8 - 2);
                } else if (var8 <= 81) {
                    class59.field1239[arg4][arg7][arg6] = (byte) (var8 - 49);
                } else {
                    class146.field2907[arg4][arg7][arg6] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method443(255);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method443(255);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method443(255);
                }
            }
        }
        field993++;
    }
}

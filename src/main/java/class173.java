import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class173 extends class96 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "[B")
    public byte[] field2717;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "[Lpe;")
    public static class101[] field2715;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I", line = 11)
    public static final int method1185(int arg0) {
        field2710++;
        if (arg0 >= -57) {
            return -107;
        } else if ((double) class324.field5568 == 3.0D) {
            return 37;
        } else if ((double) class324.field5568 == 4.0D) {
            return 50;
        } else if ((double) class324.field5568 == 6.0D) {
            return 75;
        } else if ((double) class324.field5568 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lqc;", line = 36)
    public static final class4 method1186(int arg0, byte arg1) {
        field2711++;
        class4 var2 = (class4) class95.field1548.method28((long) arg0, 1400);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class327.field5656.method1889(arg0, (byte) -122, 0);
        if (var3 == null) {
            return null;
        }
        class4 var4 = new class4();
        if (arg1 != -91) {
            field2715 = (class101[]) null;
        }
        class82 var5 = new class82(var3);
        var5.field1301 = var5.field1280.length - 2;
        int var6 = var5.method576(1);
        int var7 = var5.field1280.length - var6 - 12 - 2;
        var5.field1301 = var7;
        int var8 = var5.method587(-502942936);
        var4.field33 = var5.method576(arg1 ^ 0xFFFFFFA4);
        var4.field40 = var5.method576(1);
        var4.field30 = var5.method576(arg1 ^ 0xFFFFFFA4);
        var4.field35 = var5.method576(1);
        int var9 = var5.method642((byte) -70);
        if (var9 > 0) {
            var4.field38 = new class259[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method576(1);
                class259 var12 = new class259(class313.method2175((byte) 119, var11));
                var4.field38[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method587(-502942936);
                    int var14 = var5.method587(-502942936);
                    var12.method1826(1, new class188(var14), (long) var13);
                }
            }
        }
        var5.field1301 = 0;
        var4.field39 = var5.method589((byte) 78);
        var4.field36 = new int[var8];
        var4.field41 = new class26[var8];
        int var15 = 0;
        var4.field44 = new int[var8];
        while (var7 > var5.field1301) {
            int var16 = var5.method576(arg1 ^ 0xFFFFFFA4);
            if (var16 == 3) {
                var4.field41[var15] = var5.method615(true);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field44[var15] = var5.method642((byte) -67);
            } else {
                var4.field44[var15] = var5.method587(-502942936);
            }
            var4.field36[var15++] = var16;
        }
        class95.field1548.method33(var4, (long) arg0, (byte) -87);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 128)
    public static void method1187(int arg0) {
        if (arg0 != -11346) {
            field2716 = -69;
        }
        field2715 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lkm;Z)V", line = 140)
    public static final void method1188(class324 arg0, boolean arg1) {
        field2709++;
        if (arg1) {
            return;
        }
        for (class224 var2 = (class224) class285.field4793.method264(-71); var2 != null; var2 = (class224) class285.field4793.method263(4)) {
            if (var2.field3550 == arg0) {
                if (var2.field3537 != null) {
                    class301.field5195.method1313(var2.field3537);
                    var2.field3537 = null;
                }
                var2.method1006(-1024);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lve;I)V", line = 175)
    public static final void method1189(class266 arg0, int arg1) {
        if (arg1 != -1) {
            method1189((class266) null, -38);
        }
        class323.field5555 = arg0;
        field2713++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lna;Z)I", line = 186)
    public static final int method1190(class26 arg0, boolean arg1) {
        field2712++;
        if (class298.field5133 == null || arg0.method171(-65) == 0) {
            return -1;
        } else if (arg1) {
            return -117;
        } else {
            for (int var2 = 0; var2 < class298.field5133.field165; var2++) {
                if (class298.field5133.field166[var2].method191(class20.field270, !arg1, class103.field1649).method159((byte) -42, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V", line = 217)
    public class173(byte[] arg0) {
        this.field2717 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILth;Lth;IIIIJ)V", line = 227)
    public static final void method1191(int arg0, int arg1, int arg2, int arg3, class86 arg4, class86 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class164 var12 = new class164();
        var12.field2549 = arg10;
        var12.field2545 = arg1 * 128 + 64;
        var12.field2548 = arg2 * 128 + 64;
        var12.field2546 = arg3;
        var12.field2550 = arg4;
        var12.field2544 = arg5;
        var12.field2553 = arg6;
        var12.field2541 = arg7;
        var12.field2551 = arg8;
        var12.field2547 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class36.field585[var13][arg1][arg2] == null) {
                class36.field585[var13][arg1][arg2] = new class55(var13, arg1, arg2);
            }
        }
        class36.field585[arg0][arg1][arg2].field889 = var12;
    }
}

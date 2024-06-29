import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class200 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    private int[] field3125;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Z")
    public static boolean field3126 = false;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lrh;")
    public static class46 field3127 = new class46();

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Z")
    public static boolean field3132 = false;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[[[I")
    public static int[][][] field3128;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ldl;ZZIIII)V")
    public static final void method1377(class123 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class189.field2985 = 1;
        class63.field887 = arg0;
        class38.field518 = arg4;
        class281.field4456 = arg2;
        class244.field3901 = arg6;
        if (arg1) {
            field3130++;
            class182.field2887 = arg3;
            class249.field3996 = arg5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method1378(int arg0) {
        field3131++;
        if (class251.field4016 != null || class243.field3885 != null || arg0 != -6640) {
            return;
        }
        int var1 = class173.field2720;
        if (!class286.field4542) {
            if (var1 == 1 && class245.field3920 > 0) {
                short var12 = class2.field21[class245.field3920 - 1];
                if (var12 == 32 || var12 == 40 || var12 == 13 || var12 == 9 || var12 == 57 || var12 == 48 || var12 == 5 || var12 == 21 || var12 == 4 || var12 == 43 || var12 == 11 || var12 == 1007) {
                    int var13 = class100.field1553[class245.field3920 - 1];
                    int var14 = class222.field3591[class245.field3920 - 1];
                    class214 var15 = class206.method1403((byte) 7, var14);
                    class72 var16 = client.method1038(var15);
                    if (var16.method487(-1) || var16.method495((byte) 28)) {
                        class73.field1034 = 0;
                        class129.field1889 = false;
                        if (class251.field4016 != null) {
                            class55.method397(0, class251.field4016);
                        }
                        class251.field4016 = class206.method1403((byte) 7, var14);
                        class251.field4020 = var13;
                        class153.field2278 = class59.field836;
                        class62.field852 = class145.field2140;
                        class55.method397(0, class251.field4016);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class190.field3017 == 1 && class245.field3920 > 2 || class90.method606(4626, class245.field3920 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class245.field3920 > 0 || class52.field715 == 1) {
                class95.method632(arg0 + 6765);
            }
            if ((var1 != 1 || class245.field3920 <= 0) && class52.field715 != 2) {
                return;
            }
            class73.method497((byte) 38);
            return;
        }
        if (var1 != 1) {
            int var2 = class31.field416;
            int var3 = class141.field2074;
            if ((class57.field808 - 10) > var2 || var2 > (class57.field808 + class106.field1641 + 10) || (class240.field3852 - 10) > var3 || var3 > class240.field3852 + class25.field345 + 10) {
                class286.field4542 = false;
                class286.method1908(class106.field1641, arg0 ^ 0xFFFFE642, class240.field3852, class57.field808, class25.field345);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class240.field3852;
        int var5 = class106.field1641;
        int var6 = class57.field808;
        int var7 = class59.field836;
        int var8 = -1;
        int var9 = class145.field2140;
        for (int var10 = 0; var10 < class245.field3920; var10++) {
            int var11;
            if (class264.field4247) {
                var11 = (class245.field3920 - (var10 + 1)) * 15 + var4 + 35;
            } else {
                var11 = (class245.field3920 - var10 - 1) * 15 + var4 + 31;
            }
            if (var7 > var6 && (var5 + var6) > var7 && (var11 - 13) < var9 && var11 + 3 > var9) {
                var8 = var10;
            }
        }
        if (var8 != -1) {
            class65.method446(2, var8);
        }
        class286.field4542 = false;
        class286.method1908(class106.field1641, 93, class240.field3852, class57.field808, class25.field345);
        return;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method1379(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3133++;
        if (class74.method509(arg4, 0)) {
            class192.method1342(arg7, arg0, arg8, 122, arg3, -1, class104.field1608[arg4], arg2, arg5, arg6);
            if (arg1) {
                field3127 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class110.field1675[var9] = true;
            }
        } else {
            class110.field1675[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method1380(boolean arg0) {
        field3127 = null;
        field3128 = null;
        if (arg0) {
            field3132 = true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([I)V")
    public class200(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3125 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3125[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3125[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3125[var5 + var5] = arg0[var4];
            this.field3125[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)I")
    public final int method1381(byte arg0, int arg1) {
        field3129++;
        int var3 = -99 % ((arg0 - 43) / 37);
        int var4 = (this.field3125.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field3125[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3125[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
    public static final String method1382(long arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != -27449) {
            field3132 = true;
        }
        field3134++;
        if (class35.field448 != null) {
            String var5 = class35.field448.method1136(arg3, arg0, (byte) -111, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }
}

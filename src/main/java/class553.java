import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class553 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lsp;")
    public class690 field7236 = null;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lsp;")
    public class690 field7237 = null;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "[Lvga;")
    public class239[] field7242 = null;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "[Lvga;")
    public class239[] field7247 = null;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lsp;")
    public class690 field7244 = null;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
    public boolean field7243;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "[I")
    public static int[] field7248 = new int[25];

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lol;")
    public static class388 field7241 = new class388();

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public static final void method2962(int arg0, int arg1) {
        class195.field2541.method3659(-99, arg0);
        field7245++;
        if (arg1 != 19097) {
            method2962(-127, 21);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static final void method2963(int arg0) {
        field7238++;
        class225.field2930 = arg0;
        int var1 = (class233.field3130.field506 >> 9) + class100.field1326;
        int var2 = (class233.field3130.field503 >> 9) + class186.field2376;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class225.field2930 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class225.field2930 = 1;
        }
        if (class225.field2930 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class225.field2930 = 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Loa;I)V")
    public static final void method2964(class43 arg0, int arg1) {
        field7240++;
        int var2 = class399.field5100;
        if (arg1 != 256) {
            field7241 = null;
        }
        int var3 = class630.field8791;
        int var4 = class238.field3206;
        int var5 = class539.field7003 - 3;
        byte var6 = 20;
        if (class80.field1103 == null || class483.field6437 == null) {
            if (class90.field1186.method3362(class294.field3811, -110) && class90.field1186.method3362(class78.field1075, -116)) {
                class80.field1103 = arg0.method325(class506.method2732(class90.field1186, class294.field3811, 0), true);
                class506 var7 = class506.method2732(class90.field1186, class78.field1075, 0);
                class483.field6437 = arg0.method325(var7, true);
                var7.method2733();
                class413.field5316 = arg0.method325(var7, true);
            } else {
                arg0.method353(var2, var3, var4, var6, class358.field4638 | 255 - class641.field8910 << 24, 1);
            }
        }
        if (class80.field1103 != null && class483.field6437 != null) {
            int var8 = (var4 - class483.field6437.method608() * 2) / class80.field1103.method608();
            for (int var9 = 0; var9 < var8; var9++) {
                class80.field1103.method2751(class483.field6437.method608() + var2 + (class80.field1103.method608() * var9), var3);
            }
            class483.field6437.method2751(var2, var3);
            class413.field5316.method2751(var2 - (class413.field5316.method608() - var4), var3);
        }
        class456.field5983.method3243(class604.field8148.method3280((byte) 97, class144.field1890), var2 + 3, var3 - -14, class27.field398 | 0xFF000000, -1, -43);
        arg0.method353(var2, var3 + var6, var4, var5 - var6, -class641.field8910 + 255 << 24 | class358.field4638, 1);
        int var10 = class691.field9440.method2214(arg1 ^ 0xFFFFF471);
        int var11 = class691.field9440.method2208(30114);
        int var12 = 0;
        for (class57 var13 = (class57) class658.field9176.method2090(true); var13 != null; var13 = (class57) class658.field9176.method2088(-152)) {
            int var31 = (class291.field3758 - var12 - 1) * 16 + var6 + var3 + 13;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > var31 - 13 && (var31 + 4) > var11 && var13.field775) {
                arg0.method353(var2, var31 - 12, var4, 16, 255 - class442.field5719 << 24 | class414.field5322, 1);
            }
            var12++;
        }
        if ((class356.field4617 == null || class237.field3201 == null || class526.field6856 == null) && class90.field1186.method3362(class368.field4749, -103) && class90.field1186.method3362(class425.field5519, -123) && class90.field1186.method3362(class264.field3530, -128)) {
            class506 var14 = class506.method2732(class90.field1186, class425.field5519, 0);
            class237.field3201 = arg0.method325(var14, true);
            var14.method2733();
            class572.field7449 = arg0.method325(var14, true);
            class356.field4617 = arg0.method325(class506.method2732(class90.field1186, class368.field4749, 0), true);
            class506 var15 = class506.method2732(class90.field1186, class264.field3530, 0);
            class526.field6856 = arg0.method325(var15, true);
            var15.method2733();
            class87.field1156 = arg0.method325(var15, true);
        }
        if (class356.field4617 != null && class237.field3201 != null && class526.field6856 != null) {
            int var16 = (var4 - class526.field6856.method608() * 2) / class356.field4617.method608();
            for (int var17 = 0; var17 < var16; var17++) {
                class356.field4617.method2751(var2 + class526.field6856.method608() + class356.field4617.method608() * var17, var3 + (var5 - class356.field4617.method607()));
            }
            int var18 = (var5 - var6 - class526.field6856.method607()) / class237.field3201.method607();
            for (int var19 = 0; var19 < var18; var19++) {
                class237.field3201.method2751(var2, var3 - (-var6 - (class237.field3201.method607() * var19)));
                class572.field7449.method2751(var2 + var4 - class572.field7449.method608(), var6 + var3 + var19 * class237.field3201.method607());
            }
            class526.field6856.method2751(var2, (var3 + var5) - class526.field6856.method607());
            class87.field1156.method2751(var2 + var4 - class526.field6856.method608(), var3 + var5 - class526.field6856.method607());
        }
        int var20 = 0;
        for (class57 var21 = (class57) class658.field9176.method2090(true); var21 != null; var21 = (class57) class658.field9176.method2088(-152)) {
            int var22 = ((class291.field3758 - var20 - 1) * 16) + var3 + var6 + 13;
            int var23 = class27.field398 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var22 - 13 < var11 && var11 < var22 + 4 && var21.field775) {
                var23 = class255.field3461 | 0xFF000000;
            }
            int[] var24 = null;
            if (class302.method1770(1002, var21.field776)) {
                var24 = class232.field3109.method1292(0, (int) var21.field774).field9520;
            } else if (var21.field759 != -1) {
                var24 = class232.field3109.method1292(0, var21.field759).field9520;
            } else if (class478.method2652(123, var21.field776)) {
                class234 var27 = (class234) class505.field6640.method39((long) ((int) var21.field774), 31750);
                if (var27 != null) {
                    class532 var28 = var27.field3131;
                    class699 var29 = var28.field6914;
                    if (var29.field9714 != null) {
                        var29 = var29.method3823(class397.field5054, -32574);
                    }
                    if (var29 != null) {
                        var24 = var29.field9700;
                    }
                }
            } else if (class226.method1419(var21.field776, (byte) 120)) {
                Object var25 = null;
                class698 var26;
                if (var21.field776 == 1004) {
                    var26 = class348.field4436.method1900(-121, (int) var21.field774);
                } else {
                    var26 = class348.field4436.method1900(-114, (int) (var21.field774 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field9630 != null) {
                    var26 = var26.method3815(65535, class397.field5054);
                }
                if (var26 != null) {
                    var24 = var26.field9669;
                }
            }
            String var30 = class45.method419(false, var21);
            if (var24 != null) {
                var30 = var30 + class37.method301((byte) -69, var24);
            }
            class456.field5983.method3239(class256.field3469, var23, 0, var22, arg1 - 256, class386.field4958, var30, var2 + 3);
            if (var21.field766) {
                class422.field5455.method2751(var2 + class411.field5305.method2900(true, var30) + 5, var22 - 12);
            }
            var20++;
        }
        class619.method3379(class238.field3206, class630.field8791, class399.field5100, 0, class539.field7003);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
    public static final void method2965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class646.field9012 = arg4;
        class72.field991 = arg1;
        if (arg2 != 608) {
            field7241 = null;
        }
        class433.field5580 = arg0;
        field7246++;
        class626.field8757 = arg3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Component;Lufa;III)Ldc;")
    public static final class304 method2966(Component arg0, class140 arg1, int arg2, int arg3, int arg4) {
        field7239++;
        if (class66.field901 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class304 var5 = (class304) Class.forName("bj").getDeclaredConstructor().newInstance();
                var5.field4000 = arg2;
                var5.field3978 = new int[(class669.field9289 ? 2 : 1) * 256];
                var5.method1788(arg0);
                var5.field3997 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3997 > 16384) {
                    var5.field3997 = 16384;
                }
                var5.method1784(var5.field3997);
                if (class513.field6719 > 0 && class359.field4657 == null) {
                    class359.field4657 = new class262();
                    class359.field4657.field3514 = arg1;
                    arg1.method1057(class359.field4657, class513.field6719, (byte) 105);
                }
                if (class359.field4657 != null) {
                    if (class359.field4657.field3518[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class359.field4657.field3518[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class672 var6 = new class672(arg1, arg3);
                    var6.field4000 = arg2;
                    var6.field3978 = new int[(class669.field9289 ? 2 : 1) * 256];
                    var6.method1788(arg0);
                    var6.field3997 = 16384;
                    var6.method1784(var6.field3997);
                    if (class513.field6719 > 0 && class359.field4657 == null) {
                        class359.field4657 = new class262();
                        class359.field4657.field3514 = arg1;
                        arg1.method1057(class359.field4657, class513.field6719, (byte) 116);
                    }
                    if (arg4 != -21435) {
                        return null;
                    }
                    if (class359.field4657 != null) {
                        if (class359.field4657.field3518[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class359.field4657.field3518[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class304();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/lang/String;)Lue;")
    public static final class217 method2967(int arg0, int arg1, String arg2) {
        field7235++;
        class217 var3;
        try {
            if (arg1 <= 107) {
                return null;
            }
            var3 = (class217) Class.forName("qg").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class610();
        }
        var3.field2847 = arg2;
        var3.field2851 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static void method2968(int arg0) {
        field7241 = null;
        if (arg0 != 16) {
            field7248 = null;
        }
        field7248 = null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lji;)V")
    public class553(class622 arg0) {
        this.field7243 = arg0.field8685;
        class122.method907(arg0, (byte) -98);
        if (this.field7243) {
            byte[] var6 = class310.method1807((byte) -121, false, class603.field8116);
            this.field7236 = new class690(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class310.method1807((byte) -39, false, class405.field5159);
            this.field7244 = new class690(arg0, 6410, 128, 128, 16, var7, 6410);
            class509 var8 = arg0.field8568;
            if (var8.method2742(35632)) {
                byte[] var9 = class310.method1807((byte) -25, false, class440.field5681);
                this.field7237 = new class690(arg0, 6408, 128, 128, 16);
                class690 var10 = new class690(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2744(var10, this.field7237, true, 2.0F)) {
                    this.field7237.method3906(-26150);
                } else {
                    this.field7237.method3904((byte) -66);
                    this.field7237 = null;
                }
                var10.method3904((byte) -92);
            }
        } else {
            this.field7242 = new class239[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class111.method854(0, class603.field8116, 32768, var2 * 128 * 128 * 2);
                this.field7242[var2] = new class239(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field7247 = new class239[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class111.method854(0, class405.field5159, 32768, var3 * 128 * 256);
                this.field7247[var3] = new class239(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}

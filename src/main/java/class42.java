import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[Lv;")
    public static class146[] field944 = new class146[1000];

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lv;")
    public static class146 field958 = class159.method1226((byte) -37, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lv;")
    public static class146 field957 = class159.method1226((byte) -37, "Passwort: ");

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public static int[] field947 = new int[500];

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field964 = -1;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lv;")
    private static class146 field967 = class159.method1226((byte) -37, "Take");

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lv;")
    public static class146 field950 = field967;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "[Lv;")
    public static class146[] field968 = new class146[100];

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lua;")
    public static class140 field949 = new class140(30);

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lgf;")
    public static class48 field970 = new class48(4096);

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Lv;")
    private static class146 field971 = class159.method1226((byte) -37, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lv;")
    public static class146 field972 = field971;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "J")
    private long field945;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "J")
    private long field959;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
    public boolean field946;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
    private int[] field954;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "[I")
    private int[] field955;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lie;")
    public static class61[] field969;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public static final void method275(int arg0, int arg1, int arg2) {
        field942++;
        class118 var3 = class79.method613(arg0, arg2 ^ 0xFFFFFFDC);
        int var4 = var3.field2752;
        int var5 = var3.field2751;
        int var6 = var3.field2753;
        int var7 = class1.field2[var6 - var4];
        if (arg2 > arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class148.field3454[var5] = class127.method943(class90.method711(~var8, class148.field3454[var5]), class90.method711(var8, arg1 << var4));
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
    public static final void method276(boolean arg0, int arg1) {
        if (arg1 != -30528) {
            field944 = null;
        }
        field951++;
        class25.method160((byte) 43);
        class9.field177++;
        if (class9.field177 < 50 && !arg0) {
            return;
        }
        class9.field177 = 0;
        if (class29.field600 || class58.field1298 == null) {
            return;
        }
        class33.field705++;
        class82.field1990.method265((byte) -85, 25);
        try {
            class58.field1298.method1078(0, 1, class82.field1990.field2304, class82.field1990.field2320);
            class82.field1990.field2304 = 0;
        } catch (IOException var2) {
            class29.field600 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZI)V")
    public final void method277(boolean arg0, boolean arg1, int arg2) {
        field963++;
        if (arg2 == 1 && this.field946) {
            return;
        }
        int var4 = this.field954[class32.field670[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class30 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class25.field433) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class25.field433 - 1;
                }
            }
            var5 = class140.method1044(var4, true);
        } while (var5 == null || var5.field638 || var5.field625 != (this.field946 ? 7 : 0) + arg2);
        this.field954[class32.field670[arg2]] = var4 + 256;
        if (!arg0) {
            field958 = null;
        }
        this.method278(16419);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    private final void method278(int arg0) {
        field953++;
        long var2 = this.field959;
        this.field959 = 0L;
        int var4 = this.field954[9];
        int var5 = this.field954[5];
        this.field954[5] = var4;
        this.field954[9] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field959 <<= 0x4;
            if (this.field954[var6] >= 256) {
                this.field959 += this.field954[var6] - 256;
            }
        }
        if (this.field954[0] >= 256) {
            this.field959 += this.field954[0] - 256 >> 4;
        }
        if (this.field954[1] >= 256) {
            this.field959 += this.field954[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field959 <<= 0x3;
            this.field959 += this.field955[var7];
        }
        if (arg0 != 16419) {
            method275(-116, 75, 71);
        }
        this.field954[5] = var5;
        this.field954[9] = var4;
        this.field959 <<= 0x1;
        this.field959 += this.field946 ? 1 : 0;
        if (var2 != 0L && this.field959 != var2) {
            class34.field732.method1048(var2, true);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lne;I)V")
    public final void method279(class95 arg0, int arg1) {
        arg0.method791(false, this.field946 ? 1 : 0);
        field960++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field954[class32.field670[var3]];
            if (var5 == 0) {
                arg0.method791(false, -1);
            } else {
                arg0.method791(false, var5 - 256);
            }
        }
        for (int var4 = arg1; var4 < 5; var4++) {
            arg0.method791(false, this.field955[var4]);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLne;)V")
    public static final void method280(byte arg0, class95 arg1) {
        if (arg0 >= -122) {
            field969 = null;
        }
        if (class82.field1980 != null) {
            try {
                class82.field1980.method994(0L, 0);
                class82.field1980.method991(arg1.field2304, arg1.field2320, 24, (byte) -127);
            } catch (Exception var2) {
            }
        }
        field956++;
        arg1.field2304 += 24;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ldd;I)I")
    public static final int method281(class26 arg0, int arg1) {
        field961++;
        class9 var2 = (class9) class137.field3105.method332((byte) -79, ((long) arg0.field547 << 32) + (long) arg0.field461);
        if (arg1 == 1299495520) {
            return var2 == null ? arg0.field487 : var2.field170;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Lsd;")
    public final class129 method282(byte arg0) {
        field948++;
        if (this.field943 != -1) {
            return class105.method852(8975, this.field943).method605((byte) 83);
        }
        if (arg0 <= 62) {
            this.field954 = null;
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field954[var3];
            if (var12 >= 256 && var12 < 512 && !class140.method1044(var12 - 256, true).method204((byte) -93)) {
                var2 = true;
            }
            if (var12 >= 512 && !class73.method524((byte) 106, var12 - 512).method417(true, this.field946)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class129[] var4 = new class129[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field954[var6];
            if (var9 >= 256 && var9 < 512) {
                class129 var10 = class140.method1044(var9 - 256, true).method207(0);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class129 var11 = class73.method524((byte) 62, var9 - 512).method416(this.field946, 9939);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class129 var7 = new class129(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field955[var8] < class126.field2918[var8].length) {
                var7.method966(class89.field2111[var8], class126.field2918[var8][this.field955[var8]]);
            }
            if (this.field955[var8] < class17.field259[var8].length) {
                var7.method966(class98.field2375[var8], class17.field259[var8][this.field955[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLkc;Lkc;II)Lu;")
    public final class139 method283(boolean arg0, class72 arg1, class72 arg2, int arg3, int arg4) {
        field952++;
        if (this.field943 != -1) {
            return class105.method852(8975, this.field943).method611(arg4, arg3, arg1, arg2, -46);
        }
        long var6 = this.field959;
        int[] var8 = this.field954;
        if (arg2 != null && (arg2.field1670 >= 0 || arg2.field1664 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field954[var9];
            }
            if (arg2.field1670 >= 0) {
                var6 += arg2.field1670 - this.field954[5] << 8;
                var8[5] = arg2.field1670;
            }
            if (arg2.field1664 >= 0) {
                var6 += arg2.field1664 - this.field954[3] << 16;
                var8[3] = arg2.field1664;
            }
        }
        class139 var10 = (class139) class34.field732.method1045(var6, 116);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class140.method1044(var21 - 256, true).method206((byte) -37)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class73.method524((byte) 108, var21 - 512).method405(this.field946, 48)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field945 != -1L) {
                    var10 = (class139) class34.field732.method1045(this.field945, 118);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class129[] var13 = new class129[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class129 var19 = class140.method1044(var18 - 256, true).method209(32734);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class129 var20 = class73.method524((byte) 68, var18 - 512).method412(arg0, this.field946);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class129 var16 = new class129(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class126.field2918[var17].length > this.field955[var17]) {
                        var16.method966(class89.field2111[var17], class126.field2918[var17][this.field955[var17]]);
                    }
                    if (this.field955[var17] < class17.field259[var17].length) {
                        var16.method966(class98.field2375[var17], class17.field259[var17][this.field955[var17]]);
                    }
                }
                var10 = var16.method961(64, 850, -30, -50, -30);
                class34.field732.method1047(-1, var10, var6);
                this.field945 = var6;
            }
        }
        if (arg0) {
            this.method287(null, 82, null, false, true);
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class139 var22;
        if (arg2 != null && arg1 != null) {
            var22 = arg2.method511(arg4, arg1, var10, arg0, arg3);
        } else if (arg2 == null) {
            var22 = arg1.method519(arg4, -91, var10);
        } else {
            var22 = arg2.method519(arg3, -47, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZ)V")
    public final void method284(int arg0, int arg1, boolean arg2) {
        if (arg0 <= 4) {
            this.method279(null, -24);
        }
        int var4 = this.field955[arg1];
        field965++;
        if (arg2) {
            var4++;
            if (class126.field2918[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class126.field2918[arg1].length - 1;
            }
        }
        this.field955[arg1] = var4;
        this.method278(16419);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public final void method285(int arg0, boolean arg1) {
        field962++;
        if (this.field946 != arg1 && arg0 >= 21) {
            this.method287(this.field955, -1, null, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method286(boolean arg0) {
        field957 = null;
        field967 = null;
        if (!arg0) {
            return;
        }
        field972 = null;
        field970 = null;
        field958 = null;
        field944 = null;
        field947 = null;
        field950 = null;
        field968 = null;
        field949 = null;
        field971 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([II[IZZ)V")
    public final void method287(int[] arg0, int arg1, int[] arg2, boolean arg3, boolean arg4) {
        field941++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class25.field433; var7++) {
                    class30 var8 = class140.method1044(var7, true);
                    if (var8 != null && !var8.field638 && var6 + (arg4 ? 7 : 0) == var8.field625) {
                        arg2[class32.field670[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field954 = arg2;
        this.field955 = arg0;
        this.field943 = arg1;
        if (arg3) {
            this.method285(20, true);
        }
        this.field946 = arg4;
        this.method278(16419);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I")
    public final int method288(byte arg0) {
        field966++;
        if (arg0 <= 23) {
            return 67;
        } else if (this.field943 == -1) {
            return (this.field955[0] << 25) + (this.field954[11] << 5) + (this.field955[4] << 20) + (this.field954[0] << 15) + (this.field954[8] << 10) + this.field954[1];
        } else {
            return class105.method852(8975, this.field943).field1927 + 305419896;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class146 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
    public boolean field2544 = true;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lk;")
    public static class34 field2548;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
    public static final boolean method982(int arg0, int arg1) {
        if (arg0 <= 40) {
            field2550 = -83;
        }
        field2541++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIILqf;IZJ)Z")
    public static final boolean method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class13 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class23.field275 == class150.field2603;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class90.field1406 || var24 >= class32.field386) {
                    return false;
                }
                class177 var25 = class254.field4395[arg0][var15][var24];
                if (var25 != null && var25.field3115 >= 5) {
                    return false;
                }
            }
        }
        class169 var16 = new class169();
        var16.field2937 = arg11;
        var16.field2922 = arg0;
        var16.field2929 = arg5;
        var16.field2927 = arg6;
        var16.field2925 = arg7;
        var16.field2934 = arg8;
        var16.field2933 = arg9;
        var16.field2939 = arg1;
        var16.field2923 = arg2;
        var16.field2932 = arg1 + arg3 - 1;
        var16.field2936 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class254.field4395[var22][var17][var20] == null) {
                        class254.field4395[var22][var17][var20] = new class177(var22, var17, var20);
                    }
                }
                class177 var23 = class254.field4395[arg0][var17][var20];
                var23.field3090[var23.field3115] = var16;
                var23.field3092[var23.field3115] = var21;
                var23.field3091 |= var21;
                var23.field3115++;
                if (var13 && class204.field3554[var17][var20] != 0) {
                    var14 = class204.field3554[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class204.field3554[var18][var19] == 0) {
                        class204.field3554[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class252.field4369[class185.field3261++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method984(byte arg0) {
        int var1 = -112 / ((-arg0 - 32) / 44);
        field2548 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method985(int arg0) {
        for (class185 var1 = (class185) class165.field2811.method315(arg0 - 31594); var1 != null; var1 = (class185) class165.field2811.method312(arg0 ^ 0x3F4)) {
            if (var1.field3258) {
                var1.method1210(arg0 ^ 0xFFFFFF90);
            }
        }
        field2545++;
        class185 var2 = (class185) class185.field3252.method315(-31594);
        if (arg0 != 0) {
            method986(57, 81);
        }
        while (var2 != null) {
            if (var2.field3258) {
                var2.method1210(-60);
            }
            var2 = (class185) class185.field3252.method312(arg0 + 1012);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I")
    public static final int method986(int arg0, int arg1) {
        if (arg1 != 127) {
            method986(55, -93);
        }
        field2543++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2542 = arg0;
        this.field2549 = arg3;
        this.field2540 = arg4;
        this.field2546 = arg2;
        this.field2547 = arg5;
        this.field2538 = arg1;
        this.field2544 = arg6;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class229 extends class128 {

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Z")
    public static boolean field3332 = true;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Llb;")
    public static class224 field3337 = new class224(32);

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Ldh;")
    public static class179 field3339 = new class179(64);

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field3341 = 0;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3342 = " has logged in.";

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V", line = 5)
    public static void method1610(boolean arg0) {
        field3337 = null;
        field3339 = null;
        if (!arg0) {
            field3342 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)[I", line = 17)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 < 100) {
            return (int[]) null;
        }
        field3333++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class49.field600[arg1];
            for (int var5 = 0; var5 < class10.field141; var5++) {
                var3[var5] = this.method1614((byte) 48, class334.field5157[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V", line = 51)
    public static final void method1611(int arg0, int arg1, int arg2) {
        field3334++;
        if (arg2 != -26078) {
            method1615((byte) 108);
        }
        class96 var3 = class141.method935(arg1, 1, arg2 + 26194);
        var3.method581((byte) -98);
        var3.field1243 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V", line = 66)
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -24454) {
            method1615((byte) -45);
        }
        if (class109.field1494 <= arg4 - arg3 && arg3 + arg4 <= class56.field678 && class272.field4273 <= arg2 - arg3 && class248.field3759 >= arg2 + arg3) {
            class314.method2198(arg1, arg4, 2, arg3, arg2);
        } else {
            class312.method2188(-1, arg2, arg4, arg3, arg1);
        }
        field3335++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I", line = 86)
    public static int method1613(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 97)
    public class229() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(BII)I", line = 103)
    private final int method1614(byte arg0, int arg1, int arg2) {
        field3331++;
        int var4 = arg1 + (arg2 * 57);
        int var5 = var4 << 1 ^ var4;
        if (arg0 < 39) {
            this.method1614((byte) -126, -66, -121);
        }
        return 4096 - ((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 118)
    public static final void method1615(byte arg0) {
        field3338++;
        for (class118 var1 = (class118) class31.field385.method2331((byte) 19); var1 != null; var1 = (class118) class31.field385.method2332(-70)) {
            class3 var2 = var1.field1666;
            if (class138.field1940 != var2.field53 || class38.field463 > var2.field46) {
                var1.method2285(true);
            } else if (var2.field58 <= class38.field463) {
                if (var2.field55 > 0) {
                    class184 var3 = class223.field3159[var2.field55 - 1];
                    if (var3 != null && var3.field2392 >= 0 && var3.field2392 < 13312 && var3.field2357 >= 0 && var3.field2357 < 13312) {
                        var2.method13(var3.field2357, var3.field2392, class38.field463, arg0 ^ 0x47, class184.method1278(var2.field53, -13660, var3.field2357, var3.field2392) - var2.field52);
                    }
                }
                if (var2.field55 < 0) {
                    int var4 = -var2.field55 - 1;
                    class109 var5;
                    if (class117.field1655 == var4) {
                        var5 = class118.field1664;
                    } else {
                        var5 = class328.field5009[var4];
                    }
                    if (var5 != null && var5.field2392 >= 0 && var5.field2392 < 13312 && var5.field2357 >= 0 && var5.field2357 < 13312) {
                        var2.method13(var5.field2357, var5.field2392, class38.field463, 0, class184.method1278(var2.field53, arg0 - 13731, var5.field2357, var5.field2392) - var2.field52);
                    }
                }
                var2.method9((byte) 105, class322.field4939);
                class93.method554(class138.field1940, (int) var2.field66, (int) var2.field48, (int) var2.field54, 60, var2, var2.field72, -1L, false);
            }
        }
        if (arg0 != 71) {
            method1611(36, -25, 18);
        }
    }
}

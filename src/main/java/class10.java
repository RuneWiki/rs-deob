import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class202 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
    public static int[] field141 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Z")
    public static boolean field151 = true;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lqh;")
    public static class201 field149;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lqh;")
    public static class201 field150;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "[Z")
    public static boolean[] field147;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method74(String arg0, boolean arg1, char arg2) {
        field148++;
        if (arg1) {
            return 96;
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
    public static final int method75(int arg0, int arg1) {
        field145++;
        return arg1 == -28620 ? arg0 >>> 8 : 108;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class10() {
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field141 = null;
        field147 = null;
        field149 = null;
        if (arg0 > -87) {
            field142 = -47;
        }
        field150 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method77(byte arg0) {
        field140++;
        if (arg0 >= -93) {
            return;
        }
        class225.field3731 = 0;
        int var1 = (class167.field2655.field3389 >> 7) + class50.field884;
        int var2 = (class167.field2655.field3341 >> 7) + class214.field3501;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class225.field3731 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class225.field3731 = 1;
        }
        if (class225.field3731 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class225.field3731 = 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Lml;")
    public static final class289 method78(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2151; var4++) {
            class289 var5 = var3.field2153[var4];
            if ((var5.field4574 >> 29 & 0x3L) == 2L && var5.field4567 == arg1 && var5.field4575 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        this.field143 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZ)V")
    public static final void method79(byte arg0, boolean arg1) {
        byte[][] var2 = class27.field426;
        byte var3 = 4;
        field144++;
        if (arg0 <= 33) {
            method75(20, 12);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class254.method1730(-53);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class3.field43[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x33D78C5) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 14 & 0x3FF;
                            int var11 = (var8 & 0x6) >> 1;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class99.field1620.length; var14++) {
                                if (class99.field1620[var14] == var13 && var2[var14] != null) {
                                    class253.method1726(arg1, var6 * 8, (var10 & 0x7) * 8, class167.field2657, var9, var11, var5 * 8, 4, (var12 & 0x7) * 8, var2[var14], var4);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class4.method39(var5 * 8, false, 8, var6 * 8, 8, var4);
                    }
                }
            }
        }
    }
}

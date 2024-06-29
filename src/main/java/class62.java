import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class62 extends class263 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lws;")
    public class333 field766 = new class333();

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lcga;")
    public static class449 field769 = new class449(80, 8);

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Z")
    public static boolean field767;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[[I)V")
    public static final void method507(byte arg0, int[][] arg1) {
        field770++;
        if (arg0 == -98) {
            class30.field364 = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method508(boolean arg0) {
        if (arg0) {
            field769 = null;
        }
        field769 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILwv;)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, class32 arg4) {
        field768++;
        class403 var5 = arg4.method209(arg3 ^ 0x2);
        int var6 = arg4.field408 - arg4.field477.field5467 & 0x3FFF;
        if (~arg2 == arg3) {
            if (var6 != 0 || arg4.field436 > 25) {
                if (arg0 < 0 && var5.field5215 != -1) {
                    arg4.field465 = var5.field5215;
                } else if (arg0 <= 0 || var5.field5196 == -1) {
                    arg4.field465 = var5.field5212;
                } else {
                    arg4.field465 = var5.field5196;
                }
                arg4.field488 = false;
            } else if (!arg4.field488 || !var5.method2271(125, arg4.field465)) {
                arg4.field465 = var5.method2267(102);
                arg4.field488 = arg4.field465 != -1;
            }
        } else if (arg4.field491 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class2.field11[arg1] - arg4.field477.field5467 & 0x3FFF;
            if (arg2 == 2 && var5.field5205 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5189 != -1) {
                    arg4.field465 = var5.field5189;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5168 != -1) {
                    arg4.field465 = var5.field5168;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5202 == -1) {
                    arg4.field465 = var5.field5205;
                } else {
                    arg4.field465 = var5.field5202;
                }
            } else if (arg2 == 0 && var5.field5186 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5165 != -1) {
                    arg4.field465 = var5.field5165;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5209 != -1) {
                    arg4.field465 = var5.field5209;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5204 == -1) {
                    arg4.field465 = var5.field5186;
                } else {
                    arg4.field465 = var5.field5204;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field5211 != -1) {
                arg4.field465 = var5.field5211;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field5197 != -1) {
                arg4.field465 = var5.field5197;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field5178 == -1) {
                arg4.field465 = var5.field5212;
            } else {
                arg4.field465 = var5.field5178;
            }
            arg4.field488 = false;
        } else if (var6 == 0 && arg4.field436 <= 25) {
            if (arg2 == 2 && var5.field5205 != -1) {
                arg4.field465 = var5.field5205;
            } else if (arg2 == 0 && var5.field5186 != -1) {
                arg4.field465 = var5.field5186;
            } else {
                arg4.field465 = var5.field5212;
            }
            arg4.field488 = false;
        } else {
            arg4.field488 = false;
            if (arg2 == 2 && var5.field5205 != -1) {
                if (arg0 < 0 && var5.field5179 != -1) {
                    arg4.field465 = var5.field5179;
                } else if (arg0 <= 0 || var5.field5181 == -1) {
                    arg4.field465 = var5.field5205;
                } else {
                    arg4.field465 = var5.field5181;
                }
            } else if (arg2 == 0 && var5.field5186 != -1) {
                if (arg0 < 0 && var5.field5200 != -1) {
                    arg4.field465 = var5.field5200;
                } else if (arg0 <= 0 || var5.field5172 == -1) {
                    arg4.field465 = var5.field5186;
                } else {
                    arg4.field465 = var5.field5172;
                }
            } else if (arg0 < 0 && var5.field5190 != -1) {
                arg4.field465 = var5.field5190;
            } else if (arg0 <= 0 || var5.field5194 == -1) {
                arg4.field465 = var5.field5212;
            } else {
                arg4.field465 = var5.field5194;
            }
        }
    }
}

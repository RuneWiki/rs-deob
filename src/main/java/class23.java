import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class23 {

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "Z")
    private boolean field281;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "Z")
    private boolean field276;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field282 = new String[] { method279(method278("4\b\u0016uq{")), method279(method278("4\b\u0016ut{")), method279(method278("4\b\u0016u\n:\u0007\u001e/\b{")), method279(method278("4\b\u0016u~{")), method279(method278("4\b\u0016us{")), method279(method278("4\b\u0016uw{")), method279(method278("4\b\u0016up{")), method279(method278("4\b\u0016uu{")), method279(method278("4\b\u0016ur{")) };

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field272 = -1;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "Lda;")
    public static class216 field279;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field271;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)I")
    public final int method269(boolean arg0) {
        try {
            if (!arg0) {
                this.field268 = 33;
            }
            field270++;
            return this.field274;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field282[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        try {
            field280++;
            return arg0 <= 25 ? false : this.field276;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field282[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3) {
        class621 var4 = class608.field8715[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class656 var5 = var4.field8847;
        class656 var6 = var4.field8852;
        if (var5 != null) {
            var5.field9299 = (short) (var5.field9299 * arg3 / (0x10 << class179.field2328 - 7));
            var5.field9298 = (short) (var5.field9298 * arg3 / (0x10 << class179.field2328 - 7));
        }
        if (var6 != null) {
            var6.field9299 = (short) (var6.field9299 * arg3 / (0x10 << class179.field2328 - 7));
            var6.field9298 = (short) (var6.field9298 * arg3 / (0x10 << class179.field2328 - 7));
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field277++;
            int var8 = arg6 - arg0;
            int var9 = arg0 + arg3;
            for (int var10 = arg3; var10 < var9; var10++) {
                class576.method4282(-7, arg1, arg2, class529.field7682[var10], arg7);
            }
            for (int var11 = arg6; var11 > var8; var11--) {
                class576.method4282(arg5 + 13932, arg1, arg2, class529.field7682[var11], arg7);
            }
            int var12 = arg0 + arg1;
            if (arg5 == -13939) {
                int var13 = arg7 - arg0;
                for (int var14 = var9; var14 <= var8; var14++) {
                    int[] var15 = class529.field7682[var14];
                    class576.method4282(-7, arg1, arg2, var15, var12);
                    class576.method4282(-7, var12, arg4, var15, var13);
                    class576.method4282(arg5 + 13932, var13, arg2, var15, arg7);
                }
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field282[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static final void method273(byte arg0) {
        try {
            class727.field10423.method127(((float) class451.field6612.field9088.method2367(3) * 0.1F + 0.7F) * class783.field11304);
            field269++;
            class727.field10423.method235(class50.field718, class337.field4885, class203.field2991, (float) (class698.field9772 << 2), (float) (class359.field5223 << 2), (float) (class353.field5114 << 2));
            class727.field10423.method228(class667.field9414);
            int var1 = 124 / ((arg0 - 74) / 36);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field282[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)I")
    public final int method274(int arg0) {
        try {
            field267++;
            if (arg0 != -665543870) {
                this.method269(false);
            }
            return this.field268;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field282[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z")
    public static final boolean method275(int arg0, int arg1, int arg2) {
        try {
            field275++;
            if (arg1 >= 0 && arg2 >= 0 && class76.field1089[1].length > arg1 && class76.field1089[1][arg1].length > arg2) {
                return (class76.field1089[arg0][arg1][arg2] & 0x2) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field282[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Z")
    public final boolean method276(int arg0) {
        try {
            field278++;
            int var2 = 11 % ((arg0 - 21) / 54);
            return this.field281;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field282[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public static void method277(boolean arg0) {
        try {
            field271 = null;
            field279 = null;
            if (arg0) {
                field273 = 8;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field282[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(ZIIZ)V")
    public class23(boolean arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field274 = arg1;
            this.field281 = arg3;
            this.field268 = arg2;
            this.field276 = arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field282[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method278(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method279(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

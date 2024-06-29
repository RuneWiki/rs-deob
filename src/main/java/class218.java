import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class218 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field3175 = 70;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field3176 = -1;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    private int field3179 = -1;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field3185 = 0;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field3193 = -1;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    private int field3180 = -1;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    private int field3188 = -1;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field3177 = 0;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public int field3189 = -1;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    private int field3191 = -1;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Ljava/lang/String;")
    private String field3196 = "";

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public int field3194 = 16777215;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public int field3192 = 0;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lin;")
    public static class380 field3182 = new class380(29, -2);

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Low;")
    public static class665 field3198 = new class665();

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lfd;")
    public class467 field3190;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lha;I)V", line = 5)
    private final void method1498(class475 arg0, int arg1) {
        field3181++;
        class513 var3 = this.field3190.field6368;
        if (this.field3188 >= arg1 && this.field3190.field6373.method2882((long) this.field3188, (byte) -116) == null && var3.method3005(this.field3188, (byte) -69)) {
            class418 var4 = class418.method2464(var3, this.field3188);
            this.field3190.field6373.method2890(arg1 - 7307, (long) this.field3188, arg0.method487(var4, true));
        }
        if (this.field3179 >= 0 && this.field3190.field6373.method2882((long) this.field3179, (byte) -42) == null && var3.method3005(this.field3179, (byte) -69)) {
            class418 var5 = class418.method2464(var3, this.field3179);
            this.field3190.field6373.method2890(-7307, (long) this.field3179, arg0.method487(var5, true));
        }
        if (this.field3191 >= 0 && this.field3190.field6373.method2882((long) this.field3191, (byte) -109) == null && var3.method3005(this.field3191, (byte) -69)) {
            class418 var6 = class418.method2464(var3, this.field3191);
            this.field3190.field6373.method2890(-7307, (long) this.field3191, arg0.method487(var6, true));
        }
        if (this.field3180 >= 0 && this.field3190.field6373.method2882((long) this.field3180, (byte) -122) == null && var3.method3005(this.field3180, (byte) -69)) {
            class418 var7 = class418.method2464(var3, this.field3180);
            this.field3190.field6373.method2890(-7307, (long) this.field3180, arg0.method487(var7, true));
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILha;)Lmq;", line = 74)
    public final class85 method1499(int arg0, class475 arg1) {
        field3187++;
        if (this.field3180 < arg0) {
            return null;
        }
        class85 var3 = (class85) this.field3190.field6373.method2882((long) this.field3180, (byte) -61);
        if (var3 == null) {
            this.method1498(arg1, 0);
            var3 = (class85) this.field3190.field6373.method2882((long) this.field3180, (byte) -31);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(ILha;)Lmq;", line = 93)
    public final class85 method1500(int arg0, class475 arg1) {
        field3186++;
        if (this.field3188 < 0) {
            return null;
        }
        class85 var3 = (class85) this.field3190.field6373.method2882((long) this.field3188, (byte) -31);
        if (var3 == null) {
            this.method1498(arg1, 0);
            var3 = (class85) this.field3190.field6373.method2882((long) this.field3188, (byte) -46);
        }
        return arg0 == 29123 ? var3 : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lol;B)V", line = 116)
    public final void method1501(class431 arg0, byte arg1) {
        field3184++;
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                int var4 = -69 % ((2 - arg1) / 53);
                return;
            }
            this.method1503(var3, -9, arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lha;I)Lmq;", line = 140)
    public final class85 method1502(class475 arg0, int arg1) {
        field3195++;
        if (this.field3179 < 0) {
            return null;
        }
        class85 var3 = (class85) this.field3190.field6373.method2882((long) this.field3179, (byte) -118);
        if (var3 == null) {
            this.method1498(arg0, 0);
            var3 = (class85) this.field3190.field6373.method2882((long) this.field3179, (byte) -73);
        }
        return arg1 == 0 ? var3 : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILol;)V", line = 164)
    private final void method1503(int arg0, int arg1, class431 arg2) {
        if (arg0 == 1) {
            this.field3189 = arg2.method2565((byte) -91);
        } else if (arg0 == 2) {
            this.field3194 = arg2.method2515(31);
        } else if (arg0 == 3) {
            this.field3188 = arg2.method2565((byte) -128);
        } else if (arg0 == 4) {
            this.field3191 = arg2.method2565((byte) -97);
        } else if (arg0 == 5) {
            this.field3179 = arg2.method2565((byte) -113);
        } else if (arg0 == 6) {
            this.field3180 = arg2.method2565((byte) -96);
        } else if (arg0 == 7) {
            this.field3192 = arg2.method2528((byte) 89);
        } else if (arg0 == 8) {
            this.field3196 = arg2.method2537((byte) 27);
        } else if (arg0 == 9) {
            this.field3175 = arg2.method2565((byte) -105);
        } else if (arg0 == 10) {
            this.field3177 = arg2.method2528((byte) 89);
        } else if (arg0 == 11) {
            this.field3176 = 0;
        } else if (arg0 == 12) {
            this.field3193 = arg2.method2557(14929);
        } else if (arg0 == 13) {
            this.field3185 = arg2.method2528((byte) 89);
        } else if (arg0 == 14) {
            this.field3176 = arg2.method2565((byte) -85);
        }
        field3183++;
        if (arg1 != -9) {
            method1506((byte) -13);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 236)
    public final String method1504(byte arg0, int arg1) {
        if (arg0 > -86) {
            this.field3196 = null;
        }
        field3197++;
        String var3 = this.field3196;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class193.method1376(arg1, 16, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lha;I)Lmq;", line = 292)
    public final class85 method1505(class475 arg0, int arg1) {
        field3178++;
        if (this.field3191 < 0) {
            return null;
        }
        if (arg1 != -32609) {
            this.field3177 = 117;
        }
        class85 var3 = (class85) this.field3190.field6373.method2882((long) this.field3191, (byte) -81);
        if (var3 == null) {
            this.method1498(arg0, arg1 + 32609);
            var3 = (class85) this.field3190.field6373.method2882((long) this.field3191, (byte) -86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 314)
    public static void method1506(byte arg0) {
        field3182 = null;
        field3198 = null;
        if (arg0 != 109) {
            field3198 = null;
        }
    }
}

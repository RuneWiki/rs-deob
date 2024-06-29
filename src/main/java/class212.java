import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class212 extends class29 {

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Z")
    public static boolean field3012 = false;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Z")
    public static boolean field3020;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ltq;")
    public static class376 field3011;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Ltq;")
    public static class376 field3017;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "Z")
    public boolean field3018;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[[B")
    public static byte[][] field3019;

    static {
        new class362("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field3020 = false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([[IILae;ZI)V", line = 6)
    public static final void method1433(int[][] arg0, int arg1, class134 arg2, boolean arg3, int arg4) {
        if (arg1 != -1) {
            return;
        }
        for (int var5 = 0; var5 < arg4; var5++) {
            int[][] var6;
            if (arg0 == null) {
                var6 = null;
            } else {
                var6 = new int[class176.field2403 + 1][class383.field5395 + 1];
                for (int var7 = 0; var7 <= class383.field5395; var7++) {
                    for (int var8 = 0; var8 <= class176.field2403; var8++) {
                        var6[var8][var7] = class419.field5994[var5][var8][var7] - arg0[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg3) {
                if (class272.field3859) {
                    var9 |= 0x2;
                }
                if (class254.field3656) {
                    var10 |= 0x8;
                }
                if (class141.field1739 != 0) {
                    if (var5 == 0 || class268.field3812 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (class272.field3859) {
                var10 |= 0x7;
            }
            class327 var11 = arg2.method655(class176.field2403, class383.field5395, class419.field5994[var5], var6, 128, var9, var10);
            class148.method897(var5, var11);
        }
        field3016++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V", line = 84)
    public static final void method1434(int arg0, boolean arg1) {
        class59.field706++;
        class62.field718.method2143(71, arg0 ^ 0xFFFFFFFE);
        field3009++;
        for (class167 var2 = (class167) class22.field280.method1884(arg0 + arg0); var2 != null; var2 = (class167) class22.field280.method1890(-1)) {
            if (!var2.method2598((byte) 35)) {
                var2 = (class167) class22.field280.method1884(arg0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2338 == 0) {
                class286.method1869(var2, true, arg1, (byte) 111);
            }
        }
        if (class59.field709 != null) {
            class186.method1277(class59.field709, (byte) 83);
            class59.field709 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 121)
    public final void method51(int arg0) {
        if (arg0 != 6) {
            field3019 = null;
        }
        field3007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 134)
    public static void method1435(int arg0) {
        field3019 = null;
        int var1 = -114 % ((arg0 + 6) / 59);
        field3011 = null;
        field3017 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 152)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -28 / ((arg1 + 16) / 62);
        field3010++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z", line = 162)
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            field3012 = false;
        }
        field3014++;
        return false;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class660 extends class299 {

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9430 = new String[] { method4801(method4800("%\u007f\u0016np")), method4801(method4800("%\u007f\u0016kp")), method4801(method4800("%\u007f\u0016op")), method4801(method4800("%\u007f\u0016`p")), method4801(method4800("39\u0016\u0006%")), method4801(method4800("%\u007f\u0016lp")), method4801(method4800("&bTD")), method4801(method4800("%\u007f\u0016jp")), method4801(method4800("%\u007f\u0016ip")), method4801(method4800("%\u007f\u0016mp")) };

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field9421 = 0;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lhl;")
    public static class556 field9423 = new class556(14, 10);

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lgda;")
    public static class58 field9427;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Les;)V")
    public class660(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)I")
    public final int method4796(boolean arg0) {
        try {
            ++field9422;
            if (!arg0) {
                field9423 = null;
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9430[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method4797(String arg0, boolean arg1) {
        try {
            ++field9420;
            long var2 = 0L;
            int var4 = arg0.length();
            if (arg1) {
                method4797((String) null, false);
            }
            for (int var5 = 0; var5 < var4; ++var5) {
                var2 *= 37L;
                char var6 = arg0.charAt(var5);
                if (~var6 <= -66 && var6 <= 'Z') {
                    var2 += (long) (var6 + 1 - 65);
                } else if (~var6 <= -98 && var6 <= 'z') {
                    var2 += (long) (-96 - -var6);
                } else if (~var6 <= -49 && var6 <= '9') {
                    var2 += (long) (var6 + -21);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            while (~(var2 % 37L) == -1L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9430[5] + (arg0 != null ? field9430[4] : field9430[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method4798(byte arg0) {
        try {
            field9423 = null;
            int var1 = 0 % ((arg0 - -36) / 55);
            field9427 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9430[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field9424;
            return arg0 != 0 ? -10 : 127;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9430[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    public static final void method4799(int arg0, int arg1) {
        try {
            class69.field987 = new int[arg1];
            int var2 = 126 / ((arg0 - 28) / 34);
            class297.field4845 = new int[arg1];
            class390.field6231 = new int[arg1];
            ++field9426;
            class738.field10850 = new int[arg1];
            class783.field11429 = new int[arg1];
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9430[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                this.method4796(true);
            }
            ++field9425;
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9430[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(ILes;)V")
    public class660(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (~super.field4849 > -1 && super.field4849 > 127) {
                super.field4849 = this.method847(0);
            }
            if (arg0 != -20456) {
                field9423 = null;
            }
            ++field9428;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9430[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                field9421 = -53;
            }
            ++field9429;
            super.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9430[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4800(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4801(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

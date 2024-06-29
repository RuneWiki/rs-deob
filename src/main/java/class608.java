import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class608 {

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8722 = new String[] { method4493(method4492("\u0006^\u001at{")), method4493(method4492("\u0006^\u001ar{")), method4493(method4492("\u0004HXZ")), method4493(method4492("\u0011\u0013\u001a\u0018.")), method4493(method4492("\u0006^\u001aw{")), method4493(method4492("\u0006^\u001aB<9IF_=\r\u0015")), method4493(method4492("\u0006^\u001au{")) };

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lmv;")
    public static class125 field8713 = new class125(18, -1);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
    public static boolean field8721 = false;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ltb;")
    public static class392 field8719;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Ld;")
    public static class673 field8716;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[[[Lnaa;")
    public static class621[][][] field8715;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method4487(int arg0) {
        try {
            if (class482.field7094 != null) {
                class586.method4334(13421);
            } else if (class466.field6807 == -1) {
                class687.method4914(class304.field4234, (byte) 105, class337.field4888);
            } else {
                class787.method5666((byte) -99);
            }
            field8712++;
            if (arg0 >= -13) {
                field8715 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8722[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public static final void method4488(int arg0, int arg1, int arg2) {
        boolean var3 = field8715[0][arg1][arg2] != null && field8715[0][arg1][arg2].field8849 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (field8715[var4][arg1][arg2] == null) {
                class621 var5 = field8715[var4][arg1][arg2] = new class621(var4);
                if (var3) {
                    var5.field8846++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8717++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8722[5] + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static final int method4489(int arg0, int arg1) {
        try {
            field8714++;
            int var2 = -115 % ((arg1 + 76) / 38);
            return arg0 >>> 8;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8722[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method4490(byte arg0) {
        try {
            if (arg0 != 100) {
                field8715 = null;
            }
            field8716 = null;
            field8713 = null;
            field8719 = null;
            field8715 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8722[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lem;I)I")
    public static final int method4491(class339 arg0, int arg1) {
        try {
            field8711++;
            int var2 = arg0.field4924;
            class765 var3 = arg0.method1430(27750);
            int var4 = arg0.field2182.method837(123);
            if (~var4 == arg1 || arg0.field2204) {
                var2 = arg0.field4899;
            } else if (var3.field10902 == var4 || var3.field10905 == var4 || var3.field10920 == var4 || var3.field10932 == var4) {
                var2 = arg0.field4927;
            } else if (var3.field10923 == var4 || var3.field10922 == var4 || var3.field10879 == var4 || var3.field10892 == var4) {
                var2 = arg0.field4903;
            }
            return var2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8722[4] + (arg0 == null ? field8722[2] : field8722[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4492(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4493(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

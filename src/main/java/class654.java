import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class654 {

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9370 = new String[] { method4775(method4774("f\u000f1%R")), method4775(method4774("f\u000f1/R")), method4775(method4774("f\u000f1&R")), method4775(method4774("f\u000f1*R")), method4775(method4774("f\u000f1(R")), method4775(method4774("f\u000f1+R")), method4775(method4774("m\u0018s\u0000")), method4775(method4774("xC1B\u0007")), method4775(method4774("f\u000f1-R")) };

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Llt;")
    public static class706 field9368 = new class706(1, 16);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILwq;)Luea;", line = 4)
    public static final class334 method4767(int arg0, class176 arg1) {
        try {
            if (arg0 < 80) {
                method4772(-56);
            }
            field9366++;
            return new class334(arg1.method1657(123), arg1.method1657(80), arg1.method1657(112), arg1.method1657(103), arg1.method1657(105), arg1.method1657(101), arg1.method1657(126), arg1.method1657(108), arg1.method1685(false), arg1.method1645((byte) -97));
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9370[5] + arg0 + ',' + (arg1 == null ? field9370[6] : field9370[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V", line = 15)
    public static void method4768(byte arg0) {
        try {
            field9368 = null;
            if (arg0 != -44) {
                field9368 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9370[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lfi;", line = 28)
    public static final class583 method4769(int arg0, int arg1) {
        try {
            field9367++;
            if (arg0 >= 0 && arg0 < 100) {
                return arg1 <= 20 ? null : class527.field7763[arg0];
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9370[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)Ldja;", line = 45)
    public static final class324 method4770(byte arg0) {
        try {
            if (arg0 != 102) {
                field9368 = null;
            }
            field9364++;
            return class235.method2038(1, -62);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9370[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z", line = 57)
    public static final boolean method4771(int arg0, int arg1, int arg2) {
        try {
            if (arg1 >= -89) {
                method4772(-26);
            }
            field9365++;
            return (arg0 & 0x34) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9370[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 71)
    public static final void method4772(int arg0) {
        try {
            class359.field5801++;
            field9369++;
            class164 var1 = class193.method1785(false);
            class487 var2 = class618.method4519(50, class172.field2751, var1.field2659);
            if (arg0 >= -107) {
                method4772(-87);
            }
            var2.field7362.method1678(0, 65280);
            var1.method1546(var2, 1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9370[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)I", line = 94)
    public final int method4773(byte arg0, long arg1) {
        try {
            field9363++;
            long var4 = this.method3814(true);
            if (arg0 != 91) {
                this.method3812(-122, -46L);
            }
            if (var4 > 0L) {
                class524.method3918(arg0 ^ 0xFFFFFFA7, var4);
            }
            return this.method3812(0, arg1);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9370[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)J")
    public abstract long method3814(boolean arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public abstract void method3815(byte arg0);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)J")
    public abstract long method3813(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)I")
    public abstract int method3812(int arg0, long arg1);

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4774(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4775(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

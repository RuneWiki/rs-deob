import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class713 extends class299 {

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10310 = new String[] { method5174(method5173("vbB:d")), method5174(method5173("l>BP1")), method5174(method5173("c9\u0000x")), method5174(method5173("l>BU1")), method5174(method5173("l>BS1")), method5174(method5173("l>BW1")), method5174(method5173("l>BV1")), method5174(method5173("l>BQ1")), method5174(method5173("l>BR1")) };

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method846(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                ++field10307;
                super.field4849 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10310[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 17)
    public final void method848(int arg0) {
        try {
            if (~super.field4849 != -2 && ~super.field4849 != -1) {
                super.field4849 = this.method847(arg0 + 20456);
            }
            if (arg0 == -20456) {
                ++field10303;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10310[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I", line = 32)
    public final int method852(int arg0, int arg1) {
        try {
            ++field10306;
            return arg0 != 1 ? -50 : 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10310[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(ILes;)V", line = 44)
    public class713(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)I", line = 48)
    public final int method5170(boolean arg0) {
        try {
            ++field10308;
            return !arg0 ? 120 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10310[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lip;I)V", line = 60)
    public static final void method5171(class738 arg0, int arg1) {
        try {
            ++field10305;
            class195 var2 = (class195) class787.field11511.method737((byte) -39, (long) arg0.field1129);
            if (var2 != null) {
                if (var2.field3081 != null) {
                    class476.field7253.method2594(var2.field3081);
                    var2.field3081 = null;
                }
                var2.method4173(-1);
            }
            if (arg1 == -1) {
                ;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10310[1] + (arg0 != null ? field10310[0] : field10310[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I", line = 85)
    public final int method847(int arg0) {
        try {
            ++field10304;
            return arg0 != 0 ? 20 : 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10310[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)Z", line = 97)
    public static final boolean method5172(int arg0, boolean arg1, int arg2) {
        try {
            if (arg1) {
                method5171((class738) null, -70);
            }
            ++field10309;
            return ~(55 & arg0) != -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10310[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Les;)V", line = 109)
    public class713(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5173(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5174(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

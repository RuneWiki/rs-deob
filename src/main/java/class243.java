import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class243 {

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "Z")
    private boolean field3748;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "Z")
    private boolean field3749;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    private int field3750;

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3757 = new String[] { method2101(method2100(".OV\u0018Q#H^BSb")), method2101(method2100(".OV\u0018+b")), method2101(method2100(".OV\u0018)b")), method2101(method2100(".OV\u0018(b")), method2101(method2100(".OV\u0018/b")), method2101(method2100(".OV\u0018.b")) };

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
    public final int method2094(int arg0) {
        try {
            if (arg0 != 0) {
                this.method2094(-26);
            }
            field3755++;
            return this.field3750;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3757[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
    public static final void method2095(int arg0) {
        try {
            field3756++;
            if (arg0 == 13437) {
                class35.method351();
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3757[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(I)Z")
    public final boolean method2096(int arg0) {
        try {
            int var2 = 52 % ((-arg0 - 47) / 51);
            field3754++;
            return this.field3748;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3757[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ZIIZ)V")
    public class243(boolean arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field3748 = arg0;
            this.field3749 = arg3;
            this.field3752 = arg2;
            this.field3750 = arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3757[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)Z")
    public final boolean method2097(boolean arg0) {
        try {
            field3753++;
            if (!arg0) {
                this.field3748 = true;
            }
            return this.field3749;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3757[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
    public static final int method2098(int arg0, int arg1) {
        return class54.field691 == null ? 0 : class54.field691[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)I")
    public final int method2099(int arg0) {
        try {
            field3751++;
            if (arg0 != 255) {
                this.field3749 = true;
            }
            return this.field3752;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3757[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2100(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2101(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

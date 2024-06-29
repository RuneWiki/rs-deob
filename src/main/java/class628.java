import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class628 extends class357 implements class633 {

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    private int field9195;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9197 = new String[] { method4658(method4657("ja,\u0006\b)")), method4658(method4657("ja,\u0006\u0005)")), method4658(method4657("or!D")), method4658(method4657("z)c\u00060")), method4658(method4657("ja,\u0006\u0004)")), method4658(method4657("ja,\u0006\f)")), method4658(method4657("ja,\u0006qhi$\\s)")), method4658(method4657("ja,\u0006\n)")) };

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "Lhg;")
    public static class718 field9194;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB[BI)V", line = 3)
    public final void method452(int arg0, byte arg1, byte[] arg2, int arg3) {
        try {
            ++field9196;
            this.method2920(arg2, arg3);
            this.field9195 = arg0;
            int var5 = 88 % ((arg1 - -5) / 35);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9197[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9197[3] : field9197[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lffa;I[BI)V", line = 14)
    public class628(class197 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field9195 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9197[6] + (arg0 != null ? field9197[3] : field9197[2]) + ',' + arg1 + ',' + (arg2 != null ? field9197[3] : field9197[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V", line = 25)
    public static void method4656(byte arg0) {
        try {
            field9194 = null;
            if (arg0 > -82) {
                field9191 = -56;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9197[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I", line = 37)
    public final int method458(boolean arg0) {
        try {
            if (arg0) {
                field9194 = null;
            }
            ++field9193;
            return this.field9195;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9197[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I", line = 48)
    public final int method451(int arg0) {
        try {
            ++field9190;
            if (arg0 != 31188) {
                this.method451(-108);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9197[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)J", line = 66)
    public final long method457(int arg0) {
        try {
            ++field9192;
            if (arg0 != -2471) {
                this.method451(-82);
            }
            return super.field5478.getAddress();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9197[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4657(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4658(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

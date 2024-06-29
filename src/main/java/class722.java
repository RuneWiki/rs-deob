import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class722 {

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Liha;")
    private class29 field10609 = new class29(128);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lgda;")
    private class58 field10607;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10610 = new String[] { method5248(method5247("\u00022\u007fO")), method5248(method5247("\u0017i=\rV")), method5248(method5247("\u0004 =\u001fB\u0002.g\u001d\u0003")), method5248(method5247("\u0004 =g\u0003")), method5248(method5247("\u0004 =f\u0003")), method5248(method5247("\u0004 =b\u0003")), method5248(method5247("\u0004 =a\u0003")), method5248(method5247("\u0004 =`\u0003")) };

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field10604 = 0;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 8)
    public final void method5242(int arg0) {
        try {
            class29 var2 = this.field10609;
            synchronized (this.field10609) {
                this.field10609.method304(arg0);
            }
            field10608++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10610[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 22)
    public final void method5243(int arg0) {
        try {
            field10605++;
            class29 var2 = this.field10609;
            synchronized (this.field10609) {
                this.field10609.method298(5);
            }
            if (arg0 != -13254) {
                this.method5244(79, 108);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10610[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 38)
    public final void method5244(int arg0, int arg1) {
        try {
            field10602++;
            class29 var3 = this.field10609;
            synchronized (this.field10609) {
                this.field10609.method294(arg0, -630);
            }
            if (arg1 != -25588) {
                field10604 = -86;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10610[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)I", line = 54)
    public static final int method5245(byte arg0, int arg1) {
        try {
            if (arg0 != -24) {
                field10604 = -38;
            }
            field10606++;
            return arg1 & 0x7F;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10610[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)Lun;", line = 67)
    public final class447 method5246(byte arg0, int arg1) {
        try {
            field10603++;
            class29 var3 = this.field10609;
            class447 var4;
            synchronized (this.field10609) {
                var4 = (class447) this.field10609.method302(-112, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field10607;
            byte[] var6;
            synchronized (this.field10607) {
                var6 = this.field10607.method604((byte) -120, arg1, 1);
                if (arg0 < 99) {
                    this.field10609 = null;
                }
            }
            class447 var7 = new class447();
            if (var6 != null) {
                var7.method3491(new class176(var6), -1);
            }
            class29 var8 = this.field10609;
            synchronized (this.field10609) {
                this.field10609.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field10610[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 100)
    public class722(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field10607 = arg2;
            this.field10607.method580(68, 1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10610[2] + (arg0 == null ? field10610[0] : field10610[1]) + ',' + arg1 + ',' + (arg2 == null ? field10610[0] : field10610[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5247(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5248(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

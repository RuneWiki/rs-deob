import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class431 {

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "[S")
    public short[] field6337;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
    public int[] field6346;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "J")
    public long field6341;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[S")
    public short[] field6343;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6347 = new String[] { method3308(method3307("SJ$\t\u001b")), method3308(method3307("SJ$\u000f\u001b")), method3308(method3307("SJ$\u000e\u001b")), method3308(method3307("[Mf!")), method3308(method3307("SJ$qZ[Q~s\u001b")), method3308(method3307("N\u0016$cN")), method3308(method3307("SJ$\f\u001b")) };

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "Z")
    public static boolean field6338 = false;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ID)V")
    public static final void method3303(int arg0, double arg1) {
        try {
            int var3 = -27 % ((90 - arg0) / 35);
            if (class725.field10475 != arg1) {
                for (int var4 = 0; var4 < 256; var4++) {
                    int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
                    class669.field9722[var4] = var5 <= 255 ? var5 : 255;
                }
                class725.field10475 = arg1;
            }
            field6345++;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6347[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z")
    public static final boolean method3304(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == -13984) {
                field6339++;
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6347[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static final void method3305(int arg0) {
        try {
            field6340++;
            if (class728.field10555) {
                class541 var1 = class211.method1854(class173.field2406, class729.field10569, false);
                if (var1 != null && var1.field7937 != null) {
                    class86 var2 = new class86();
                    var2.field959 = var1;
                    var2.field957 = var1.field7937;
                    class782.method5663(var2);
                }
                class311.field4926 = arg0;
                class547.field8162 = -1;
                class728.field10555 = false;
                if (var1 != null) {
                    class115.method1013(true, var1);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6347[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public static final void method3306(int arg0, int arg1) {
        try {
            if (arg0 == 255) {
                field6344++;
                for (class206 var2 = class704.field10226.method971(347); var2 != null; var2 = class704.field10226.method973(true)) {
                    if ((var2.field3177 >> 48 & 0xFFFFL) == (long) arg1) {
                        var2.method1824(1);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6347[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(J[I[S[S)V")
    public class431(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field6337 = arg3;
            this.field6346 = arg1;
            this.field6341 = arg0;
            this.field6343 = arg2;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6347[4] + arg0 + ',' + (arg1 == null ? field6347[3] : field6347[5]) + ',' + (arg2 == null ? field6347[3] : field6347[5]) + ',' + (arg3 == null ? field6347[3] : field6347[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    protected class431() {
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3307(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3308(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

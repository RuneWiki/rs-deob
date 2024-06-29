import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class615 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lwq;")
    private class178 field8983 = new class178(256);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Ld;")
    private class160 field8985;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lkd;")
    private class296 field8986;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8987 = new String[] { method4554(method4553("\fZu$%")), method4554(method4553("\fZu&%")), method4554(method4553("\fZu%%")), method4554(method4553("\fZu[d\u000bR/Y%")), method4554(method4553("\u000bN7\u000b")), method4554(method4553("\u001e\u0015uIp")), method4554(method4553("\fZu#%")) };

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lwp;")
    public final class191 method4549(byte arg0, int arg1) {
        try {
            field8984++;
            Object var3 = this.field8983.method1558((byte) 96, (long) arg1);
            if (var3 != null) {
                return (class191) var3;
            } else if (this.field8985.method1363(arg1, (byte) 120)) {
                class439 var4 = this.field8985.method1366((byte) -103, arg1);
                int var5 = var4.field6481 ? 64 : this.field8986.field4602;
                if (arg0 != -35) {
                    return null;
                }
                class191 var7;
                if (var4.field6468 && this.field8986.method566()) {
                    float[] var8 = this.field8985.method1368(false, var5, arg1, 0.7F, var5, -8388);
                    var7 = this.field8986.method2491(var5, var8, var4.field6469 != 0, class215.field3276, arg0 ^ 0xFFFFFFAA, var5);
                } else {
                    int[] var6;
                    if (var4.field6478 != 2 && class672.method4943(var4.field6467, -2)) {
                        var6 = this.field8985.method1364(arg0 - 25621, true, arg1, var5, var5, 0.7F);
                    } else {
                        var6 = this.field8985.method1365((byte) -59, var5, false, 0.7F, arg1, var5);
                    }
                    var7 = this.field8986.method2447(var6, var5, var5, var4.field6469 != 0, 26236);
                }
                var7.method751(var4.field6463, 105, var4.field6470);
                this.field8983.method1556((long) arg1, var7, 1);
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8987[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method4550(int arg0) {
        try {
            if (arg0 != 2) {
                this.method4552(2);
            }
            this.field8983.method1557(5, (byte) -119);
            field8981++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8987[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)Lla;")
    public static final class476 method4551(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 != 1000000) {
                return null;
            }
            field8980++;
            class411 var4 = null;
            if (class122.field1441 != null) {
                var4 = new class411(arg2, class122.field1441, class680.field9862[arg2], 1000000);
            }
            class362.field5550[arg2] = class351.field5419.method2127(class456.field6646, arg2, var4, -804221168);
            class362.field5550[arg2].method3770(0);
            return new class476(class362.field5550[arg2], arg0, arg3);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8987[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lkd;Ld;)V")
    public class615(class296 arg0, class160 arg1) {
        try {
            this.field8985 = arg1;
            this.field8986 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8987[3] + (arg0 == null ? field8987[4] : field8987[5]) + ',' + (arg1 == null ? field8987[4] : field8987[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public final void method4552(int arg0) {
        try {
            field8982++;
            this.field8983.method1559(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8987[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4553(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4554(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

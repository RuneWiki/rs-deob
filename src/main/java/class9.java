import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lwq;")
    private class178 field90 = new class178(64);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lla;")
    private class476 field91;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lla;")
    private class476 field92;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field97 = new String[] { method66(method65("2\u001aKpy")), method66(method65("2\u001aKqy")), method66(method65(":\t\t_")), method66(method65("/RK\u001d,")), method66(method65("2\u001aK\u000f8:\u0015\u0011\ry")), method66(method65("2\u001aKry")) };

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field96 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 3)
    public static void method62(int arg0) {
        try {
            if (arg0 != 0) {
                field95 = -52;
            }
            field96 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field97[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JJ)J", line = 20)
    public static long method63(long arg0, long arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field97[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lwja;", line = 32)
    public final class281 method64(int arg0, int arg1) {
        try {
            field94++;
            class281 var3 = (class281) this.field90.method1558((byte) 96, (long) arg1);
            if (var3 != null) {
                return var3;
            }
            if (arg0 != 0) {
                field95 = 69;
            }
            byte[] var4;
            if (arg1 >= 32768) {
                var4 = this.field92.method3632(0, arg1 & 0x7FFF, 127);
            } else {
                var4 = this.field91.method3632(0, arg1, -124);
            }
            class281 var5 = new class281();
            if (var4 != null) {
                var5.method2307((byte) 85, new class163(var4));
            }
            if (arg1 >= 32768) {
                var5.method2301(-11128);
            }
            this.field90.method1556((long) arg1, var5, 1);
            return var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field97[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ILla;Lla;)V", line = 79)
    public class9(int arg0, class476 arg1, class476 arg2) {
        try {
            this.field91 = arg1;
            this.field92 = arg2;
            if (this.field91 != null) {
                this.field91.method3646(0, (byte) -55);
            }
            if (this.field92 != null) {
                this.field92.method3646(0, (byte) -94);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field97[4] + arg0 + ',' + (arg1 == null ? field97[2] : field97[3]) + ',' + (arg2 == null ? field97[2] : field97[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method65(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method66(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

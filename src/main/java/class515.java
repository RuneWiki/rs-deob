import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class515 {

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Loc;")
    public class215 field7437 = new class215();

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7451 = new String[] { method3914(method3913("\u0013Cs\u007f\u0001S")), method3914(method3913("\u0013Cs\u007fx\u0012N{%zS")), method3914(method3913("\u0013Cs\u007f\u0002S")), method3914(method3913("\u0015U~=")), method3914(method3913("\u0000\u000e<\u007f9")), method3914(method3913("\u0013Cs\u007f\u0005S")), method3914(method3913("\u0013Cs\u007f\u0000S")), method3914(method3913("\u0013Cs\u007f\u0007S")), method3914(method3913("\u0013Cs\u007f\u0006S")) };

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Z")
    public static boolean field7439 = false;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field7441 = 0;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "Lel;")
    public static class573 field7443 = new class573(104, 6);

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "[I")
    public static int[] field7450 = new int[8];

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "J")
    public static long field7444;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "Loc;")
    private class215 field7445;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Lel;")
    public static class573 field7449;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLoc;)V", line = 9)
    public final void method3907(byte arg0, class215 arg1) {
        try {
            if (arg1.field3273 != null) {
                arg1.method1879(0);
            }
            field7447++;
            arg1.field3273 = this.field7437.field3273;
            if (arg0 != -22) {
                this.field7437 = null;
            }
            arg1.field3274 = this.field7437;
            arg1.field3273.field3274 = arg1;
            arg1.field3274.field3273 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7451[2] + arg0 + ',' + (arg1 == null ? field7451[3] : field7451[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V", line = 35)
    public final void method3908(byte arg0) {
        try {
            while (true) {
                class215 var2 = this.field7437.field3274;
                if (this.field7437 == var2) {
                    field7446++;
                    this.field7445 = null;
                    if (arg0 != 5) {
                        this.method3910(-102);
                        return;
                    }
                    return;
                }
                var2.method1879(0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7451[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 57)
    public static void method3909(int arg0) {
        try {
            field7449 = null;
            field7443 = null;
            field7450 = null;
            if (arg0 != -23014) {
                field7438 = -56;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7451[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Loc;", line = 71)
    public final class215 method3910(int arg0) {
        try {
            field7448++;
            class215 var2 = this.field7437.field3274;
            if (this.field7437 == var2) {
                this.field7445 = null;
                return null;
            } else if (arg0 == 0) {
                this.field7445 = var2.field3274;
                return var2;
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7451[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V", line = 122)
    public class515() {
        try {
            this.field7437.field3273 = this.field7437;
            this.field7437.field3274 = this.field7437;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7451[1] + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I", line = 98)
    public final int method3911(byte arg0) {
        try {
            if (arg0 != 97) {
                this.method3910(61);
            }
            field7440++;
            int var2 = 0;
            for (class215 var3 = this.field7437.field3274; var3 != this.field7437; var3 = var3.field3274) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7451[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Loc;", line = 131)
    public final class215 method3912(byte arg0) {
        try {
            field7442++;
            if (arg0 != 9) {
                return null;
            }
            class215 var2 = this.field7445;
            if (this.field7437 == var2) {
                this.field7445 = null;
                return null;
            } else {
                this.field7445 = var2.field3274;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7451[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3913(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3914(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

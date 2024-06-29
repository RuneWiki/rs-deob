import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class492 {

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "Liha;")
    private class29 field7406 = new class29(64);

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "Liha;")
    public class29 field7413 = new class29(64);

    @OriginalMember(owner = "client!eka", name = "n", descriptor = "Lgda;")
    public class58 field7409;

    @OriginalMember(owner = "client!eka", name = "h", descriptor = "Lgda;")
    private class58 field7412;

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7417 = new String[] { method3732(method3731("\u000f2\u0010\\\u0015B")), method3732(method3731("\u000f2\u0010\\\u0012B")), method3732(method3731("\u000f2\u0010\\\u0011B")), method3732(method3731("\u000f2\u0010\\\u0016B")), method3732(method3731("\u000f2\u0010\\\u0013B")), method3732(method3731("\u000f2\u0010\\l\u00037\u0018\u0006nB")), method3732(method3731("\u0011w_\\-")), method3732(method3731("\u0004,\u001d\u001e")), method3732(method3731("\u000f2\u0010\\\u0017B")) };

    @OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
    public static int field7411 = 0;

    @OriginalMember(owner = "client!eka", name = "k", descriptor = "Lhd;")
    public static class776 field7405 = new class776();

    @OriginalMember(owner = "client!eka", name = "m", descriptor = "Z")
    public static boolean field7414 = false;

    @OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!eka", name = "i", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!eka", name = "j", descriptor = "Lnp;")
    public static class518 field7415;

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "Lbl;")
    public static class678 field7416;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IB)Lvg;", line = 3)
    public final class57 method3724(int arg0, byte arg1) {
        try {
            field7410++;
            class29 var3 = this.field7406;
            class57 var4;
            synchronized (this.field7406) {
                var4 = (class57) this.field7406.method302(-91, (long) arg0);
                if (arg1 > -52) {
                    this.method3729(92, false, 23);
                }
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field7412;
            byte[] var6;
            synchronized (this.field7412) {
                var6 = this.field7412.method604((byte) -120, arg0, 34);
            }
            class57 var7 = new class57();
            var7.field704 = this;
            if (var6 != null) {
                var7.method570(-3437, new class176(var6));
            }
            class29 var8 = this.field7406;
            synchronized (this.field7406) {
                this.field7406.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7417[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(Z)V", line = 42)
    public static final void method3725(boolean arg0) {
        if (arg0) {
            class85.field1280 = class393.field6261;
            class740.field10902 = class757.field11125;
        } else {
            class85.field1280 = class609.field8771;
            class740.field10902 = class493.field7420;
        }
        class612.field8806 = class85.field1280.length;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V", line = 56)
    public final void method3726(boolean arg0) {
        try {
            field7408++;
            class29 var2 = this.field7406;
            synchronized (this.field7406) {
                this.field7406.method298(5);
            }
            class29 var3 = this.field7413;
            synchronized (this.field7413) {
                if (arg0) {
                    this.method3726(false);
                }
                this.field7413.method298(5);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7417[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)V", line = 81)
    public final void method3727(int arg0, int arg1) {
        try {
            class29 var3 = this.field7406;
            synchronized (this.field7406) {
                this.field7406.method294(arg0, -630);
            }
            field7404++;
            class29 var4 = this.field7413;
            synchronized (this.field7413) {
                this.field7413.method294(arg0, -630);
                if (arg1 != 28886) {
                    this.method3724(-88, (byte) 54);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7417[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)V", line = 97)
    public final void method3728(int arg0) {
        try {
            class29 var2 = this.field7406;
            synchronized (this.field7406) {
                this.field7406.method304(arg0 ^ 0xFFFFEE14);
            }
            field7407++;
            class29 var3 = this.field7413;
            synchronized (this.field7413) {
                this.field7413.method304(arg0 ^ 0xFFFFEE14);
                if (arg0 != -4587) {
                    this.method3724(-52, (byte) 79);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7417[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZI)V", line = 114)
    public final void method3729(int arg0, boolean arg1, int arg2) {
        try {
            field7403++;
            this.field7406 = new class29(arg2);
            if (arg1) {
                this.method3726(false);
            }
            this.field7413 = new class29(arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7417[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V", line = 127)
    public static void method3730(int arg0) {
        try {
            field7416 = null;
            if (arg0 != -24763) {
                method3730(-79);
            }
            field7405 = null;
            field7415 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7417[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V", line = 159)
    public class492(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field7409 = arg3;
            this.field7412 = arg2;
            this.field7412.method580(101, 34);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7417[5] + (arg0 == null ? field7417[7] : field7417[6]) + ',' + arg1 + ',' + (arg2 == null ? field7417[7] : field7417[6]) + ',' + (arg3 == null ? field7417[7] : field7417[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3731(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3732(char[] arg0) {
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
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

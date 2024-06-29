import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class241 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Liha;")
    private class29 field3713 = new class29(64);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lgda;")
    private class58 field3710;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3716 = new String[] { method2079(method2078("XPWV\u0006")), method2079(method2078("M\u000b\u0015\u0014")), method2079(method2078("W\u0019WD\u0012M\u0017\rFS")), method2079(method2078("W\u0019W9S")), method2079(method2078("W\u0019W<S")), method2079(method2078("W\u0019W:S")), method2079(method2078("W\u0019W=S")), method2079(method2078("W\u0019W>S")), method2079(method2078("W\u0019W;S")) };

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lhl;")
    public static class556 field3714 = new class556(112, 6);

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public final void method2072(boolean arg0) {
        try {
            field3706++;
            class29 var2 = this.field3713;
            synchronized (this.field3713) {
                this.field3713.method298(5);
                if (!arg0) {
                    field3714 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3716[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method2073(int arg0) {
        try {
            if (arg0 <= 90) {
                method2073(-110);
            }
            field3714 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3716[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lsk;")
    public final class651 method2074(int arg0, int arg1) {
        try {
            field3709++;
            class29 var3 = this.field3713;
            class651 var4;
            synchronized (this.field3713) {
                var4 = (class651) this.field3713.method302(-127, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field3710;
            byte[] var6;
            synchronized (this.field3710) {
                var6 = this.field3710.method604((byte) -127, arg0, 16);
            }
            class651 var7 = new class651();
            if (var6 != null) {
                var7.method4744(new class176(var6), (byte) -124);
            }
            class29 var8 = this.field3713;
            synchronized (this.field3713) {
                this.field3713.method295(false, (long) arg0, var7);
            }
            if (arg1 != 11651) {
                this.method2072(true);
            }
            return var7;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3716[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)Z")
    public static final boolean method2075(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 114) {
                return false;
            } else {
                field3712++;
                return (arg1 & 0x84080) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3716[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public final void method2076(byte arg0) {
        try {
            class29 var2 = this.field3713;
            synchronized (this.field3713) {
                if (arg0 >= -68) {
                    return;
                }
                this.field3713.method304(1);
            }
            field3707++;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3716[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class241(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field3710 = arg2;
            if (this.field3710 == null) {
                this.field3711 = 0;
            } else {
                this.field3711 = this.field3710.method580(78, 16);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3716[2] + (arg0 == null ? field3716[1] : field3716[0]) + ',' + arg1 + ',' + (arg2 == null ? field3716[1] : field3716[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public final void method2077(int arg0, byte arg1) {
        try {
            class29 var3 = this.field3713;
            synchronized (this.field3713) {
                this.field3713.method294(arg0, -630);
            }
            field3715++;
            if (arg1 != -81) {
                this.method2077(5, (byte) 63);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3716[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2078(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2079(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

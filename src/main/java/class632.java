import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class632 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field8979 = 0;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field8980 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lui;")
    private class251 field8972 = new class251(64);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Llp;")
    private class589 field8983 = null;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Llga;")
    private class47 field8973;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Llga;")
    private class47 field8974;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8984 = new String[] { method4624(method4623("\u0000\u001d\"VB")), method4624(method4623("\u0000\u001d\"PB")), method4624(method4623("\u0000\u001d\"QB")), method4624(method4623("\u001e\u000b`~")), method4624(method4623("\u0000\u001d\".\u0003\u001e\u0017x,B")), method4624(method4623("\u000bP\"<\u0017")), method4624(method4623("\u0000\u001d\"WB")), method4624(method4623("\u0000\u001d\"SB")) };

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field8975 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lhj;")
    public static class671 field8978 = new class671(9, 0, 4, 1);

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lrj;")
    public static class252 field8982 = new class252();

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "F")
    public static float field8981;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method4618(boolean arg0) {
        try {
            if (arg0) {
                field8976++;
                class530.method4013((byte) 49);
                class212.field3119 = false;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8984[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lud;", line = 18)
    public final class714 method4619(int arg0, int arg1) {
        try {
            field8970++;
            class714 var3 = (class714) this.field8972.method2053(0, (long) arg0);
            if (var3 != null) {
                return var3;
            }
            byte[] var4;
            if (arg0 < 32768) {
                var4 = this.field8973.method512(arg0, 1, (byte) -86);
            } else {
                var4 = this.field8974.method512(arg0 & 0x7FFF, 1, (byte) -116);
            }
            if (arg1 != -380) {
                return null;
            }
            class714 var5 = new class714();
            var5.field10152 = this;
            if (var4 != null) {
                var5.method5178(-1, new class711(var4));
            }
            if (arg0 >= 32768) {
                var5.method5169(arg1 ^ 0xFFFFFECE);
            }
            this.field8972.method2051((long) arg0, var5, arg1 ^ 0xFFFFFED9);
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8984[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V", line = 56)
    public static final void method4620(int arg0, int arg1) {
        try {
            field8977++;
            if (arg1 > -121) {
                method4620(-16, 113);
            }
            if (class314.method2496(arg0, (byte) -31)) {
                class756.method5481(-1, -1, class9.field117[arg0]);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8984[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILlga;Llga;Llp;)V", line = 139)
    public class632(int arg0, class47 arg1, class47 arg2, class589 arg3) {
        try {
            this.field8973 = arg1;
            this.field8974 = arg2;
            this.field8983 = arg3;
            if (this.field8973 != null) {
                this.field8979 = this.field8973.method509(true, 1);
            }
            if (this.field8974 != null) {
                this.field8980 = this.field8974.method509(true, 1);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8984[4] + arg0 + ',' + (arg1 == null ? field8984[3] : field8984[5]) + ',' + (arg2 == null ? field8984[3] : field8984[5]) + ',' + (arg3 == null ? field8984[3] : field8984[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 87)
    public static void method4621(int arg0) {
        try {
            if (arg0 != -27483) {
                field8978 = null;
            }
            field8978 = null;
            field8982 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8984[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZJ[ILhj;)Ljava/lang/String;", line = 98)
    public final String method4622(boolean arg0, long arg1, int[] arg2, class671 arg3) {
        try {
            field8971++;
            if (this.field8983 != null) {
                String var6 = this.field8983.method2292(arg2, 0, arg1, arg3);
                if (var6 != null) {
                    return var6;
                }
            }
            if (!arg0) {
                this.method4622(true, 104L, null, null);
            }
            return Long.toString(arg1);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8984[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8984[3] : field8984[5]) + ',' + (arg3 == null ? field8984[3] : field8984[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4623(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4624(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

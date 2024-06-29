import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class288 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "B")
    public byte field4239;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "S")
    public short field4244;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "S")
    public short field4242;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
    public boolean field4235;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "S")
    public short field4241;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "B")
    public byte field4246;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lnj;")
    public static class487 field4237 = new class487("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lud;")
    public static class119 field4247 = new class119();

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[Lvq;")
    public static class433[] field4248 = new class433[14];

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4250 = new String[100];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lvc;")
    public static class359 field4249;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1789(byte arg0, int arg1) {
        class325 var2 = class203.field3028;
        synchronized (class203.field3028) {
            class203.field3028.method2028(arg1, true);
            if (arg0 > -30) {
                field4248 = null;
            }
        }
        field4240++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 26)
    public static final String method1790(boolean arg0, String arg1) {
        field4238++;
        StringBuffer var2 = new StringBuffer();
        if (arg0) {
            method1792(28, -12, -106);
        }
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var10 + 10 - (97 - var9);
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class15.method71((byte) var11, 50)) {
                    var2.append(class281.method1772(!arg0, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBII)Lmb;", line = 103)
    public final class288 method1791(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = -90 % ((arg2 - 1) / 48);
        field4245++;
        return new class288(arg4, arg3, arg1, arg0, this.field4241, this.field4242, this.field4244, this.field4246, this.field4239, this.field4235);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 115)
    public static final void method1792(int arg0, int arg1, int arg2) {
        field4236++;
        class621 var3 = class442.method2691(arg2, arg0, true);
        var3.method3592((byte) 110);
        var3.field9068 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 131)
    public static void method1793(int arg0) {
        field4247 = null;
        if (arg0 != -49) {
            method1793(5);
        }
        field4248 = null;
        field4237 = null;
        field4249 = null;
        field4250 = null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 149)
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field4239 = (byte) arg8;
        this.field4244 = (short) arg6;
        this.field4242 = (short) arg5;
        this.field4235 = arg9;
        this.field4243 = arg0;
        this.field4241 = (short) arg4;
        this.field4246 = (byte) arg7;
    }
}

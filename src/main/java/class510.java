import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class510 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Los;")
    public static class309 field7429 = new class309("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
    public static int[] field7436 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lbj;")
    public static class162 field7437 = new class162(61, -1);

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Ll;")
    public static class16 field7431;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lph;")
    public static class459 field7434;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field7439;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZII)Z")
    public static final boolean method3056(int arg0, boolean arg1, int arg2, int arg3) {
        field7432++;
        boolean var4 = true;
        class425 var5 = (class425) class211.method1435(arg0, arg3, arg2);
        if (var5 != null) {
            var4 &= class54.method504(arg1, var5);
        }
        class425 var6 = (class425) class479.method2859(arg0, arg3, arg2, field7439 == null ? (field7439 = method3060("rj")) : field7439);
        if (var6 != null) {
            var4 &= class54.method504(arg1, var6);
        }
        class425 var7 = (class425) class296.method1911(arg0, arg3, arg2);
        if (arg1) {
            return false;
        } else {
            if (var7 != null) {
                var4 &= class54.method504(false, var7);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method3057(int arg0) {
        field7436 = null;
        if (arg0 != 61) {
            field7434 = null;
        }
        field7437 = null;
        field7431 = null;
        field7429 = null;
        field7434 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
    public static final boolean method3058(int arg0, int arg1, int arg2) {
        field7430++;
        if (!class76.field1543) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class419.field6326[var3] == null || class419.field6326[var3][var4] == null) {
            return false;
        }
        class388 var5 = class419.field6326[var3][var4];
        int var6 = 66 % ((-arg2 - 37) / 55);
        if (arg1 == -1 && var5.field5784 == 0) {
            for (class328 var7 = (class328) class373.field5469.method1892(98); var7 != null; var7 = (class328) class373.field5469.method1893((byte) -2)) {
                if (var7.field4972 == 3 || var7.field4972 == 1001 || var7.field4972 == 30 || var7.field4972 == 45 || var7.field4972 == 19) {
                    for (class388 var8 = class271.method1716(27411, var7.field4979); var8 != null; var8 = class368.method2257(-84, var8)) {
                        if (var5.field5700 == var8.field5700) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class328 var9 = (class328) class373.field5469.method1892(90); var9 != null; var9 = (class328) class373.field5469.method1893((byte) -2)) {
                if (var9.field4976 == arg1 && var5.field5700 == var9.field4979 && (var9.field4972 == 3 || var9.field4972 == 1001 || var9.field4972 == 30 || var9.field4972 == 45 || var9.field4972 == 19)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILgh;I)V")
    public static final void method3059(int arg0, int arg1, class388 arg2, int arg3) {
        field7433++;
        class144 var4 = arg2.method2389(class262.field4006, true);
        if (var4 == null) {
            return;
        }
        class262.field4006.method371(arg0, arg3, arg2.field5745 + arg0, arg2.field5712 + arg3);
        if (arg1 <= 100) {
            field7434 = null;
        }
        if (class419.field6312 < 3) {
            class245.field3791.method155((float) arg2.field5745 / 2.0F + (float) arg0, (float) arg2.field5712 / 2.0F + (float) arg3, 4096, (int) (-class525.field7631) & 0x3FFF << 2, var4, arg0, arg3);
        } else {
            class262.field4006.method373(-16777216, var4, arg0, arg3);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3060(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

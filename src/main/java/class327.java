import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class327 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Lvk;")
    public static class305 field5129 = new class305(2);

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "Lss;")
    public static class213 field5132 = new class213("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Lqu;")
    public static class219 field5133 = new class219(18, 8);

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "Lbi;")
    public static class104 field5134 = new class104(28, -2);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2183(String arg0, byte arg1) {
        field5131++;
        if (arg0 == null) {
            return;
        }
        if (!(class162.field2352 < 100 || class198.field3050) || class162.field2352 >= 200) {
            class295.method1988(class126.field1721.method1583(126, class12.field131), 0);
            return;
        }
        String var2 = class114.method736((byte) -61, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class162.field2352; var3++) {
            String var7 = class114.method736((byte) -61, class401.field6038[var3]);
            if (var7 != null && var7.equals(var2)) {
                class295.method1988(arg0 + class272.field4340.method1583(83, class12.field131), 0);
                return;
            }
            if (class180.field2621[var3] != null) {
                String var8 = class114.method736((byte) -61, class180.field2621[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class295.method1988(arg0 + class272.field4340.method1583(99, class12.field131), 0);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class358.field5566; var4++) {
            String var5 = class114.method736((byte) -61, class329.field5176[var4]);
            if (var5 != null && var5.equals(var2)) {
                class295.method1988(class514.field7631.method1583(125, class12.field131) + arg0 + class212.field3633.method1583(85, class12.field131), 0);
                return;
            }
            if (class12.field132[var4] != null) {
                String var6 = class114.method736((byte) -61, class12.field132[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class295.method1988(class514.field7631.method1583(arg1 ^ 0xFFFFFFF4, class12.field131) + arg0 + class212.field3633.method1583(103, class12.field131), arg1 ^ 0xFFFFFF91);
                    return;
                }
            }
        }
        if (arg1 != -111) {
            field5133 = null;
        }
        if (class114.method736((byte) -61, class358.field5565.field5443).equals(var2)) {
            class295.method1988(class34.field352.method1583(arg1 + 194, class12.field131), 0);
        } else {
            class81.method578((byte) 66, class384.field5872);
            class289.field4554++;
            class170.field2488.method1479((byte) -87, class147.method896(arg0, (byte) -99));
            class170.field2488.method1458(arg0, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method2184(int arg0) {
        field5134 = null;
        field5133 = null;
        field5129 = null;
        field5132 = null;
        if (arg0 < 45) {
            field5134 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)Z")
    public static final boolean method2185(boolean arg0) {
        if (arg0) {
            field5130++;
            return class501.field7514 > 0;
        } else {
            return false;
        }
    }
}

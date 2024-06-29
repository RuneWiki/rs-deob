import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class392 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Leh;")
    public static class246 field5511 = new class246(76, 6);

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field5514 = 0;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[I")
    public static int[] field5515;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public int field5508;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public int field5513;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field5516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field5517;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static final void method2270(int arg0) {
        if (arg0 >= -49) {
            field5511 = null;
        }
        field5507++;
        try {
            Method var1 = (field5517 == null ? (field5517 = method2273("java.lang.Runtime")) : field5517).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class347.field5020 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method2271(int arg0) {
        field5511 = null;
        if (arg0 < 17) {
            field5511 = null;
        }
        field5515 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
    public static final boolean method2272(boolean arg0) {
        if (arg0) {
            return false;
        }
        field5512++;
        try {
            if (class15.field189 == 2) {
                if (class494.field6992 == null) {
                    class494.field6992 = class365.method2156(class234.field3410, class123.field1680, class464.field6495);
                    if (class494.field6992 == null) {
                        return false;
                    }
                }
                if (class486.field6783 == null) {
                    class486.field6783 = new class364(class206.field2986, class500.field7083);
                }
                if (class22.field267.method561(11704, class486.field6783, class494.field6992, 22050, class50.field610)) {
                    class22.field267.method553(-103);
                    class22.field267.method563(21431, class102.field1358);
                    class22.field267.method554(class346.field5017, 102, class494.field6992);
                    class486.field6783 = null;
                    class494.field6992 = null;
                    class15.field189 = 0;
                    class234.field3410 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class22.field267.method550((byte) -4);
            class234.field3410 = null;
            class15.field189 = 0;
            class486.field6783 = null;
            class494.field6992 = null;
        }
        return false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2273(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class530(null, "geschickt werden.", null, null);
        field5515 = new int[14];
    }
}

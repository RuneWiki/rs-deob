import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class357 extends class425 {

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field5161 = 0;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Lpm;")
    public static class349 field5162;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lub;")
    public static class15 field5163;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[I")
    public static int[] field5168;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Lmm;")
    public static class153 field5164;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ai", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field5169;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
    public static int[] field5166;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2331(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class349("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field5162 = new class349("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");
        field5163 = new class15(8);
        field5168 = new int[2];
        field5167 = -1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZII)Z", line = 8)
    public static final boolean method2329(int arg0, boolean arg1, int arg2, int arg3) {
        field5159++;
        boolean var4 = arg1;
        class143 var5 = (class143) class431.method2683(arg3, arg0, arg2);
        if (var5 != null) {
            var4 = arg1 & class187.method1340(true, var5);
        }
        class143 var6 = (class143) class233.method1613(arg3, arg0, arg2, field5169 == null ? (field5169 = method2331("mb")) : field5169);
        if (var6 != null) {
            var4 &= class187.method1340(arg1, var6);
        }
        class143 var7 = (class143) class353.method2309(arg3, arg0, arg2);
        if (var7 != null) {
            var4 &= class187.method1340(true, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 37)
    public static void method2330(int arg0) {
        field5163 = null;
        field5168 = null;
        field5164 = null;
        if (arg0 == -5854) {
            field5166 = null;
            field5162 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V", line = 50)
    public class357(int arg0, int arg1) {
        this.field5160 = arg1;
        this.field5158 = arg0;
    }
}

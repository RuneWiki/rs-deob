import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class317 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljt;")
    public static class489 field4741 = new class489(1);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
    public static int[] field4742 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lqp;")
    public static class586 field4744 = new class586(70, 8);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field4740;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field4745;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[S")
    public static short[][] field4743;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        if (arg0 == 4) {
            field4743 = null;
            field4742 = null;
            field4741 = null;
            field4744 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1994(int arg0, char arg1, String arg2) {
        field4739++;
        int var3 = class591.method3447(arg2, 0, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg0 != 8) {
            field4743 = null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZBLjava/awt/Component;)Lre;")
    public static final class582 method1995(boolean arg0, byte arg1, Component arg2) {
        if (arg1 != 56) {
            method1993(-84);
        }
        field4740++;
        try {
            Constructor var3 = Class.forName("oi").getDeclaredConstructor(field4745 == null ? (field4745 = method1996("java.awt.Component")) : field4745, Boolean.TYPE);
            return (class582) var3.newInstance(arg2, Boolean.valueOf(arg0));
        } catch (Throwable var4) {
            return new class108(arg2, arg0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1996(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

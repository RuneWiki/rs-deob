import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class312 extends class405 {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Ljp;")
    public class55 field4843;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lmt;")
    public static class517 field4840 = new class517(8);

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Ldp;")
    public static class347 field4847 = new class347("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lbr;")
    public static class146 field4844;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field4849;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(DB)V")
    public static final void method1964(double arg0, byte arg1) {
        field4841++;
        if (class483.field7132 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class36.field500[var3] = var4 <= 255 ? var4 : 255;
            }
            class483.field7132 = arg0;
        }
        if (arg1 <= 92) {
            field4847 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final void method1965(int arg0) {
        field4845++;
        if (arg0 > -66) {
            field4840 = null;
        }
        int[] var1 = new int[class164.field2437.field4234];
        int var2 = 0;
        for (int var3 = 0; var3 < class164.field2437.field4234; var3++) {
            class81 var5 = class164.field2437.method1749(var3, -20230);
            if (var5.field1130 >= 0 || var5.field1187 >= 0) {
                var1[var2++] = var3;
            }
        }
        class436.field6436 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class436.field6436[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method1966(int arg0) {
        field4847 = null;
        field4844 = null;
        if (arg0 != 0) {
            method1965(14);
        }
        field4840 = null;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public static final void method1967(int arg0) {
        field4846++;
        if (!class302.field4504) {
            return;
        }
        class310 var1 = class406.method2442((byte) -82, class327.field5118, class179.field2655);
        if (var1 != null && var1.field4803 != null) {
            class120 var2 = new class120();
            var2.field1833 = var1;
            var2.field1832 = var1.field4803;
            class64.method449(var2);
        }
        class98.field1510 = -1;
        class302.field4504 = false;
        class532.field7837 = -1;
        if (var1 != null) {
            class292.method1812(-14307, var1);
        }
        if (arg0 > -123) {
            field4840 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public static final void method1968(int arg0) {
        try {
            Method var1 = (field4849 == null ? (field4849 = method1969("java.lang.Runtime")) : field4849).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class117.field1763 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 255) {
                method1965(-3);
            }
        } catch (Exception var5) {
        }
        field4842++;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljp;)V")
    public class312(class55 arg0) {
        this.field4843 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

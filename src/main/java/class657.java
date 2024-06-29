import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class657 {

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field9273 = -2;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field9270 = 0;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Lsv;")
    public static class570 field9272 = new class570(43, -1);

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "[I")
    public static int[] field9275 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field9274;

    // $FF: synthetic field
    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9276;

    // $FF: synthetic method
    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lufa;I)V", line = 5)
    public static final void method3685(class160 arg0, int arg1) {
        field9269++;
        if (class514.field7096 == null) {
            return;
        }
        class226 var2 = null;
        if (arg0.field2484 == 0) {
            var2 = (class226) class133.method1109(arg0.field2489, arg0.field2479, arg0.field2488);
        }
        if (arg0.field2484 == 1) {
            var2 = (class226) class87.method770(arg0.field2489, arg0.field2479, arg0.field2488);
        }
        if (arg0.field2484 == 2) {
            var2 = (class226) class608.method3523(arg0.field2489, arg0.field2479, arg0.field2488, field9276 == null ? (field9276 = method3688("vu")) : field9276);
        }
        if (arg1 != -9488) {
            return;
        }
        if (arg0.field2484 == 3) {
            var2 = (class226) class180.method1311(arg0.field2489, arg0.field2479, arg0.field2488);
        }
        if (var2 == null) {
            arg0.field2478 = 0;
            arg0.field2486 = 0;
            arg0.field2487 = -1;
        } else {
            arg0.field2487 = var2.method1165((byte) 125);
            arg0.field2478 = var2.method1166(-100);
            arg0.field2486 = var2.method1174((byte) 93);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLha;)V", line = 52)
    public static final void method3686(boolean arg0, class475 arg1) {
        field9268++;
        if (arg0) {
            method3685(null, -93);
        }
        class208.field3039 = new class406[class40.field468.length];
        for (int var2 = 0; var2 < class40.field468.length; var2++) {
            int var3 = class40.field468[var2];
            class470 var4 = class478.method2833(104, class447.field6172, var3);
            class443 var5 = arg1.method491(var4, class418.method2474(class651.field9226, var3), true);
            class208.field3039[var2] = new class406(var5, var4);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V", line = 81)
    public static void method3687(int arg0) {
        if (arg0 == -3) {
            field9275 = null;
            field9272 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;", line = 98)
    public final String toString() {
        field9271++;
        throw new IllegalStateException();
    }
}

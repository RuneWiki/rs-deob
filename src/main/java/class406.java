import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class406 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljava/lang/String;")
    public String field6037;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field6041;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field6039 = 0;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Z")
    public static boolean field6040 = false;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lpf;")
    public static class425 field6033 = new class425(27, 2);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
    public static final int method2548(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field6036++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            int var5 = -41 % ((8 - arg1) / 39);
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method2549(String arg0, int arg1) throws ClassNotFoundException {
        int var2 = -91 % ((36 - arg1) / 53);
        field6034++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method2550(boolean arg0) {
        if (arg0) {
            field6040 = true;
        }
        field6033 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public static final void method2551(int arg0, int arg1) {
        field6038++;
        if (arg0 != 0) {
            method2550(true);
        }
        class32 var2 = class136.method854(4, (byte) 89, arg1);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I")
    public static int method2552(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6035++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class406(String arg0, int arg1) {
        this.field6037 = arg0;
        this.field6041 = arg1;
    }

    static {
        new class151("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        new class151("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}

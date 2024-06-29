import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class73 extends class171 {

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "[I")
    public static int[] field809 = new int[99];

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field812;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[I")
    public static int[] field814;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method416(String arg0, int arg1, int arg2) {
        field811++;
        class40 var3 = class162.method872(arg2, (byte) 92, 2);
        if (arg1 < 115) {
            method417(false);
        }
        var3.method190(0);
        var3.field408 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        field809 = null;
        field812 = null;
        if (!arg0) {
            method416((String) null, 111, -69);
        }
        field814 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field809[var1] = var0 / 4;
        }
        field812 = new String[100];
        field814 = new int[2500];
    }
}

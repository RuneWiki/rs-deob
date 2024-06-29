import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class280 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
    public static boolean field4196 = true;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Ldp;")
    public static class174 field4199;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[I")
    public static int[] field4193;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1986(byte arg0) {
        if (arg0 <= 33) {
            method1988((char) 65464, 91);
        }
        for (int var1 = 0; var1 < class156.field2376; var1++) {
            int var2 = class416.field6027[var1];
            class98 var3 = class447.field6512[var2];
            if (var3 != null) {
                class254.method1836(var3.field1545.field174, var3, (byte) -126);
            }
        }
        field4195++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIB)V", line = 36)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4197++;
        if (arg5 != -39) {
            field4193 = null;
        }
        if (arg3 == arg4) {
            class428.method2670(arg0, arg2, arg3, arg1, 25988);
        } else if (class185.field2727 <= (arg0 - arg3) && class278.field4184 >= (arg0 + arg3) && class308.field4507 <= (arg1 - arg4) && class383.field5497 >= (arg1 + arg4)) {
            class350.method2247(arg0, arg2, arg4, arg1, arg3, -28664);
        } else {
            class367.method2338(arg4, 127, arg0, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(CI)C", line = 60)
    public static final char method1988(char arg0, int arg1) {
        field4194++;
        if (arg1 > -41) {
            return 'c';
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 458)
    public static void method1989(int arg0) {
        field4199 = null;
        field4193 = null;
        if (arg0 != -27394) {
            method1990((byte) 65, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/awt/Canvas;)Lpc;", line = 479)
    public static final class34 method1990(byte arg0, Canvas arg1) {
        field4198++;
        try {
            if (arg0 != -86) {
                field4196 = false;
            }
            Class var2 = Class.forName("ic");
            class34 var3 = (class34) var2.getDeclaredConstructor().newInstance();
            var3.method246(arg1, (byte) -40);
            return var3;
        } catch (Throwable var5) {
            class418 var4 = new class418();
            var4.method246(arg1, (byte) -40);
            return var4;
        }
    }
}

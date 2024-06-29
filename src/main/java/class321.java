import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class321 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field4538 = 52;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method2068(boolean arg0) {
        if (arg0) {
            class694.field9690.method3735(2);
            field4537++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method2069(String arg0, byte arg1) throws ClassNotFoundException {
        field4540++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg1 != 121) {
            return null;
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

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([Lje;II)V")
    public static final void method2070(class421[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class421 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field5744;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field5744 < (var7 & 0x1) + var6) {
                class421 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2070(arg0, arg1, var4 - 1);
        method2070(arg0, var4 + 1, arg2);
    }
}

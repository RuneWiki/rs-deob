import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class181 {

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Z")
    public static boolean field2484 = false;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Lsj;")
    public static class266 field2480;

    // $FF: synthetic field
    @OriginalMember(owner = "client!js", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field2485;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljf;I)Ljava/lang/String;")
    public static final String method1176(class119 arg0, int arg1) {
        field2483++;
        if (arg1 != 0) {
            method1177(-59);
        }
        if (client.method1076(arg0).method27(-6936) == 0) {
            return null;
        } else if (arg0.field1579 == null || arg0.field1579.trim().length() == 0) {
            return class267.field3764 ? "Hidden-use" : null;
        } else {
            return arg0.field1579;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1177(int arg0) {
        if (arg0 != 0) {
            method1176((class119) null, 31);
        }
        field2480 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1178(int arg0, int arg1, int arg2, int arg3) {
        field2479++;
        boolean var4 = true;
        class265 var5 = (class265) class204.method1300(arg0, arg1, arg3);
        if (var5 != null) {
            var4 &= class166.method1094((byte) 121, var5);
        }
        class265 var6 = (class265) class310.method1944(arg0, arg1, arg3, field2485 == null ? (field2485 = method1179("sl")) : field2485);
        if (arg2 != 0) {
            method1177(66);
        }
        if (var6 != null) {
            var4 &= class166.method1094((byte) 92, var6);
        }
        class265 var7 = (class265) class122.method689(arg0, arg1, arg3);
        if (var7 != null) {
            var4 &= class166.method1094((byte) -92, var7);
        }
        return var4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1179(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

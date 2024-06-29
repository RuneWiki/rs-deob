import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class112 extends class179 {

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "S")
    public static short field1904 = 32767;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Loe;")
    public static class127 field1906 = new class127(98, 6);

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Z")
    public static boolean field1907 = false;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1905;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1908;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)I")
    public abstract int method801(int arg0);

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)I")
    public abstract int method802(int arg0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)J")
    public abstract long method803(byte arg0);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1906 = null;
        if (arg0 != 30980) {
            method806(-84, -12, 99, -108);
        }
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)I")
    public abstract int method805(int arg0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z")
    public static final boolean method806(int arg0, int arg1, int arg2, int arg3) {
        field1905++;
        class185 var4 = (class185) class307.method1842(arg0, arg2, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class134.method881((byte) 41, var4);
        }
        class185 var6 = (class185) class86.method607(arg0, arg2, arg3, field1908 == null ? (field1908 = method807("tf")) : field1908);
        if (var6 != null) {
            var5 &= class134.method881((byte) 41, var6);
        }
        class185 var7 = (class185) class368.method2232(arg0, arg2, arg3);
        if (var7 != null) {
            var5 &= class134.method881((byte) 41, var7);
        }
        return arg1 == 4 ? var5 : true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method807(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class138 extends class418 {

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "J")
    public long field1780;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Ljava/lang/String;")
    public String field1785;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ljava/lang/String;")
    public String field1778;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1787;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1788;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method972(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method968(int arg0, int arg1, byte arg2) {
        if (arg2 != 61) {
            return;
        }
        int var3 = class154.field1961 * arg0 >> 8;
        field1783++;
        if (arg1 == -1 && !class60.field919) {
            class24.method215((byte) -43);
        } else if (arg1 != -1 && (class400.field5855 != arg1 || !class368.method2424(false)) && var3 != 0 && !class60.field919) {
            class441.method2758(0, 2, arg1, class388.field5677, 124, false, var3);
        }
        class400.field5855 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V", line = 32)
    public static final void method969(boolean arg0) {
        class140.field1797.method1833(-20379, 95);
        if (arg0) {
            field1786++;
            class118.field1540++;
            class140.field1797.method2204(0, 8);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBI)Z", line = 47)
    public static final boolean method970(int arg0, int arg1, byte arg2, int arg3) {
        field1787++;
        boolean var4 = true;
        class56 var5 = (class56) class57.method421(arg1, arg3, arg0);
        if (arg2 < 55) {
            return true;
        }
        if (var5 != null) {
            var4 &= class352.method2319(23146, var5);
        }
        class56 var6 = (class56) class31.method243(arg1, arg3, arg0, field1788 == null ? (field1788 = method972("lk")) : field1788);
        if (var6 != null) {
            var4 &= class352.method2319(23146, var6);
        }
        class56 var7 = (class56) class104.method792(arg1, arg3, arg0);
        if (var7 != null) {
            var4 &= class352.method2319(23146, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BC)C", line = 76)
    public static final char method971(byte arg0, char arg1) {
        field1784++;
        if (arg0 >= -79) {
            return 'i';
        } else if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 477)
    public class138(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field1780 = arg4;
        this.field1782 = arg5;
        this.field1785 = arg1;
        this.field1777 = arg3;
        this.field1778 = arg0;
        this.field1779 = arg2;
        this.field1781 = arg6;
    }
}

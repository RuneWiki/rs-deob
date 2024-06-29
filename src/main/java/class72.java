import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class72 extends class120 {

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1017 = "Take";

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lef;")
    public static class214 field1015;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Lhc;")
    public static class229 field1028;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
    public static boolean field1013;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[I")
    public static int[] field1023;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Z")
    public final boolean method484(int arg0, int arg1) {
        field1021++;
        if (arg0 != -1) {
            this.field1024 = -68;
        }
        return (this.field1029 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
    public final int method485(int arg0) {
        if (arg0 >= -110) {
            this.method484(81, -43);
        }
        field1011++;
        return this.field1029 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1028 = null;
        field1015 = null;
        field1023 = null;
        field1017 = null;
        if (arg0 != 7897223) {
            method486(103);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Z")
    public final boolean method487(int arg0) {
        field1022++;
        if (arg0 != -1) {
            field1026 = -78;
        }
        return ((this.field1029 & 0x1EA2F99E) >> 28) != 0;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Z")
    public final boolean method488(int arg0) {
        if (arg0 == 18395) {
            field1027++;
            return (this.field1029 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
    public final boolean method489(byte arg0) {
        if (arg0 != -38) {
            this.method485(-97);
        }
        field1020++;
        return ((this.field1029 & 0x2F6EC8) >> 21) != 0;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)Z")
    public final boolean method490(int arg0) {
        field1030++;
        if (arg0 != 1) {
            field1028 = null;
        }
        return (this.field1029 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)Z")
    public final boolean method491(int arg0) {
        field1018++;
        if (arg0 <= 115) {
            field1010 = 57;
        }
        return ((this.field1029 & 0x6A5FF380) >> 30) != 0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I")
    public final int method492(byte arg0) {
        int var2 = -36 % (-arg0 / 54);
        field1019++;
        return class154.method1021(true, this.field1029);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        field1014++;
        if (arg0 > -126) {
            field1015 = null;
        }
        return (this.field1029 & 0x5EFD36) >> 22 != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILtg;IIIII)Z")
    public static final boolean method494(int arg0, class181 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class276 var7 = class271.method1834((byte) 74, arg1.field2860);
        field1031++;
        if (var7.field4399 == -1) {
            return true;
        }
        int var9;
        if (arg1.field2826) {
            int var8 = arg1.field2824 + arg4;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class15 var10 = var7.method1851(var9, (byte) -75);
        if (var10 == null) {
            return false;
        }
        int var11 = arg1.field2829;
        int var12 = arg1.field2813;
        int var13 = var10.field2136;
        if ((var9 & 0x1) == 1) {
            var11 = arg1.field2813;
            var12 = arg1.field2829;
        }
        int var14 = var10.field2143;
        if (var7.field4397) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field4405 == 0) {
            var10.method103(arg5 * 4 + 48, (104 - arg6 + -var12) * 4 + 48, var13, var14);
        } else {
            var10.method110(arg5 * 4 + 48, 48 - -((104 - arg6 + -var12) * 4), var13, var14, var7.field4405);
        }
        return arg2 <= 47 ? true : true;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
    public final boolean method495(byte arg0) {
        field1025++;
        if (arg0 != 28) {
            this.field1024 = -68;
        }
        return ((this.field1029 & 0x3B29679F) >> 29) != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;Z)I")
    public static final int method496(int arg0, String arg1, boolean arg2) {
        field1016++;
        if (!arg2) {
            field1013 = false;
        }
        return class131.method895(arg1, true, arg0, -9);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1029 = arg0;
        this.field1024 = arg1;
    }
}

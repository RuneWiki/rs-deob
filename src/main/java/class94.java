import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class94 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1188 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[C")
    public static char[] field1191 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1197 = "red:";

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "La;")
    public class245 field1199;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[I")
    public int[] field1195;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field1190;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)I")
    public static final int method524(boolean arg0, int arg1) {
        field1187++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xC8) >> 6;
        if (arg0) {
            method525(123);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        field1191 = null;
        if (arg0 == 3) {
            field1197 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lml;")
    public static final class148 method526(int arg0, int arg1) {
        if (arg1 >= -48) {
            return null;
        } else {
            field1192++;
            return (class148) class170.field2693.method708((long) arg0, 125);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)I")
    public static final int method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg5 & arg1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        field1194++;
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 7 - arg6 - (arg4 + -1);
        } else {
            return 1 + 7 - arg3 - arg2;
        }
    }
}

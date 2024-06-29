import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class147 {

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Lvp;")
    public static class123 field2178 = new class123();

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Z")
    public static boolean field2182 = true;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "Loa;")
    public static class489 field2181;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I[[[BIIIIIIIILqa;II)V")
    public static final void method967(int arg0, byte[][][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10, int arg11, int arg12) {
        field2180++;
        if (arg4 <= 60 || arg7 == 0 || arg9 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg7 = 8;
        }
        arg10.method1059(arg3, arg12, arg2, arg0, arg11, arg5, arg1[arg7 - 1][arg8], arg9, arg6);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public static final void method968(byte arg0) {
        field2179++;
        class320 var1 = (class320) class111.field1597.method816(97);
        if (arg0 != -106) {
            method968((byte) -37);
        }
        boolean var2 = class283.field4065 != null || class62.field940 > 0;
        if (var2) {
            class378.field5763 = 1;
        }
        if (class389.field5870 && class162.field2368.method1352(81, 100) && class450.field6706 > 2) {
            if (var2) {
                class196.field2864 = (class118) class312.field4467.field1879.field4735.field4735;
            } else {
                class37.method214((class118) class312.field4467.field1879.field4735.field4735, var1.method238(arg0 + 158), false, var1.method243((byte) -109));
            }
        } else if (var2) {
            class196.field2864 = (class118) class312.field4467.field1879.field4735;
        } else {
            class37.method214((class118) class312.field4467.field1879.field4735, var1.method238(125), false, var1.method243((byte) -109));
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static final void method969(int arg0) {
        field2176++;
        int var1 = class426.field6401.method2524(class170.field2529, -14120);
        int var2 = 112 % ((arg0 - 45) / 35);
        if (var1 == 0) {
            class1.field5 = null;
            class397.method2401(0, 65);
        } else if (var1 == 1) {
            class394.method2393((byte) 0, (byte) 58);
            class397.method2401(512, -111);
            if (class183.field2684 != null) {
                class208.method1397(1);
            }
        } else {
            class394.method2393((byte) (class465.field6883 - 4 & 0xFF), (byte) 117);
            class397.method2401(2, -101);
        }
        class352.field5393 = class79.field1192;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
    public static void method970(int arg0) {
        if (arg0 != 8) {
            method969(6);
        }
        field2181 = null;
        field2178 = null;
    }

    static {
        new class475("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}

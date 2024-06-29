import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class33 extends class136 {

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lpd;")
    public static class94 field898 = class28.method249(19, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lpd;")
    private static class94 field904 = class28.method249(89, "This computers address has been blocked");

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lpd;")
    public static class94 field909 = field904;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lpd;")
    public static class94 field899 = class28.method249(-59, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Lpd;")
    public static class94 field915 = class28.method249(-80, "Passwort: ");

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lpd;")
    public static class94 field916 = class28.method249(21, "Benutzername: ");

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Z")
    public static volatile boolean field912 = true;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Z")
    public static boolean field906 = false;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lpd;")
    public static class94 field903 = class28.method249(-89, "Regelversto-8 melden");

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field919 = 1;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "[I")
    public static int[] field920 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lvc;")
    public static class128 field917 = new class128(64);

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Lpd;")
    public static class94 field922 = class28.method249(49, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Lpd;")
    public static class94 field921 = class28.method249(-82, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "J")
    public static volatile long field923 = 0L;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lic;")
    public class50 field901;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lmb;")
    public class73 field905;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[B")
    public byte[] field918;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 4)
    public static void method268(int arg0) {
        field920 = null;
        field898 = null;
        field916 = null;
        field915 = null;
        field917 = null;
        field921 = null;
        if (arg0 > -70) {
            field904 = null;
        }
        field922 = null;
        field909 = null;
        field904 = null;
        field903 = null;
        field899 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I", line = 45)
    public static final int method269(byte arg0) {
        int var1 = -108 % ((-arg0 - 23) / 39);
        field908++;
        return 5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIIIIIII)V", line = 56)
    public static final void method270(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field911++;
        if (class98.method741((byte) -89, arg4)) {
            class23.method166(arg3, -1, arg8, -122, class108.field2673[arg4], arg2, arg1, arg7, 0, 0, arg5, arg6);
            int var9 = -6 % ((48 - arg0) / 56);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIIIII)I", line = 70)
    public static final int method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field900++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg1;
        } else {
            if (arg3 != 512) {
                method270((byte) -57, -92, -30, -39, -118, -104, -66, 84, 124);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 135)
    public static final void method272(int arg0) {
        field914++;
        class135.field3319.method496(55);
        class121.field3024 = class124.method985(class121.field3024);
        int var1 = -63 / ((-arg0 - 6) / 34);
    }
}

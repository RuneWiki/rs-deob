import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class125 extends class67 {

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "[I")
    public static int[] field2971 = new int[2000];

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lrd;")
    public static class114 field2967 = class84.method656("und Ihr Passwort ein)3", (byte) 127);

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
    public static int[] field2969 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "[I")
    public static int[] field2976 = new int[1000];

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lrd;")
    public static class114 field2974 = class84.method656("Das ist eine Mitglieder)2Welt(Q", (byte) 120);

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Z")
    public static boolean field2975 = false;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lrd;")
    public static class114 field2972 = class84.method656("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1", (byte) 126);

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Lrd;")
    public static class114 field2979 = class84.method656("Sprites geladen)3", (byte) 121);

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Ldd;")
    public static class26 field2964 = new class26(64);

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "Lrd;")
    public static class114 field2982 = class84.method656("Ignorieren", (byte) 125);

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lpb;")
    public static class100 field2965;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Ld;")
    public class22 field2980;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Lke;")
    public class73 field2966;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "[B")
    public byte[] field2978;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "[Lhe;")
    public static class54[] field2981;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V")
    public static void method971(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2982 = null;
        field2972 = null;
        field2965 = null;
        field2964 = null;
        field2979 = null;
        field2967 = null;
        field2976 = null;
        field2974 = null;
        field2981 = null;
        field2971 = null;
        field2969 = null;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)I")
    public static final int method972(int arg0) {
        field2970++;
        if (arg0 != 2) {
            field2979 = null;
        }
        return class126.field3010++;
    }
}

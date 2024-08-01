import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dg")
public class class38 {

    @OriginalMember(owner = "dg", name = "j", descriptor = "Lrc;")
    public static class160 field818 = new class160(5);

    @OriginalMember(owner = "dg", name = "o", descriptor = "Llf;")
    public static class109 field823 = class35.method275("<col=ff7000>", 2);

    @OriginalMember(owner = "dg", name = "q", descriptor = "Llf;")
    public static class109 field825 = class35.method275("Lade Eingabe)2Steuerungsprogramm)3)3)3", 2);

    @OriginalMember(owner = "dg", name = "m", descriptor = "Llf;")
    private static class109 field821 = class35.method275("Bad session id)3", 2);

    @OriginalMember(owner = "dg", name = "n", descriptor = "Llf;")
    public static class109 field822 = field821;

    @OriginalMember(owner = "dg", name = "l", descriptor = "Llf;")
    public static class109 field820 = class35.method275("(U0a )2 non)2existant gosub script)2num: ", 2);

    @OriginalMember(owner = "dg", name = "a", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "dg", name = "c", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "dg", name = "e", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "dg", name = "f", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "dg", name = "h", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "dg", name = "p", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "dg", name = "r", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "dg", name = "d", descriptor = "J")
    public long field812;

    @OriginalMember(owner = "dg", name = "b", descriptor = "Lka;")
    public class95 field810;

    @OriginalMember(owner = "dg", name = "g", descriptor = "Lka;")
    public class95 field815;

    @OriginalMember(owner = "dg", name = "i", descriptor = "Lka;")
    public class95 field817;

    @OriginalMember(owner = "dg", name = "k", descriptor = "[I")
    public static int[] field819;

    @OriginalMember(owner = "dg", name = "s", descriptor = "[Ldf;")
    public static class37[] field827;

    @OriginalMember(owner = "dg", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        field819 = null;
        if (arg0 != 5) {
            return;
        }
        field818 = null;
        field822 = null;
        field825 = null;
        field821 = null;
        field827 = null;
        field820 = null;
        field823 = null;
    }

    @OriginalMember(owner = "dg", name = "a", descriptor = "(Lbg;III)[Ldf;")
    public static final class37[] method287(class18 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -20348) {
            field827 = null;
        }
        field814++;
        return class203.method1333(-21957, arg0, arg2, arg1) ? class178.method1216((byte) -12) : null;
    }

    @OriginalMember(owner = "dg", name = "b", descriptor = "(I)Lkb;")
    public static final class96 method288(int arg0) {
        field809++;
        try {
            return arg0 == 5 ? (class96) Class.forName("class155").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }
}

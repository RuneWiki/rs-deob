import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class393 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "B")
    public byte field6000;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lfi;")
    public class393 field5989;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Ls;")
    public static class186 field6006;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
    public static int[] field6008;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field5988;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lan;")
    public static class20 field5991;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Leq;")
    public final class143 method2444(byte arg0) {
        field5995++;
        if (arg0 < 23) {
            this.field6003 = 88;
        }
        return class220.method1470(-23658, this.field5998);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)Lfi;")
    public final class393 method2445(int arg0, int arg1, int arg2, int arg3) {
        field5992++;
        int var5 = 114 % ((arg0 + 58) / 50);
        return new class393(this.field5998, arg1, arg3, arg2, this.field6000);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method2446(byte arg0) {
        if (arg0 == 76) {
            field5991 = null;
            field6008 = null;
            field6006 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIB)V")
    public class393(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6000 = arg4;
        this.field5996 = arg3;
        this.field6001 = arg2;
        this.field6004 = arg1;
        this.field5998 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfi;I)V")
    public class393(class393 arg0, int arg1) {
        this.field5989 = arg0;
        this.field6004 = this.field5989.field6004 + arg1;
        this.field6000 = this.field5989.field6000;
        this.field5996 = this.field5989.field5996 + arg1;
        this.field6001 = this.field5989.field6001 + arg1;
        this.field5998 = this.field5989.field5998;
    }

    static {
        new class309("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field6007 = -2;
        field6006 = new class186(30, 15);
        field6008 = new int[100];
    }
}

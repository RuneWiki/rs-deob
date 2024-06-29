import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class500 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lwt;")
    public static class194 field7647 = new class194(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Z")
    public static boolean field7650 = false;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lgn;")
    public static class475 field7651;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field7649;

    static {
        new class194("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field7651 = new class475(54, -1);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 7)
    public static final void method3010(byte arg0) {
        if (arg0 == -76) {
            field7648++;
            class312.method1866(0);
            class498.method2992(arg0 + 76);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILae;)V", line = 21)
    public static final void method3011(byte arg0, int arg1, class156 arg2) {
        if (arg0 != 98) {
            return;
        }
        if (class445.field6499 != null) {
            try {
                class445.field6499.method445(0L, -120);
                class445.field6499.method453(24, arg2.field2041, 31058, arg1);
            } catch (Exception var3) {
            }
        }
        field7646++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lhe;I)V", line = 42)
    public static final void method3012(class239 arg0, int arg1) {
        field7649++;
        class501.field7660 = arg0.method1444("p11_full", (byte) 120);
        class43.field648 = arg0.method1444("p12_full", (byte) 87);
        class216.field3042 = arg0.method1444("b12_full", (byte) 44);
        class397.field5844 = arg0.method1444("hitmarks", (byte) 77);
        class432.field6349 = arg0.method1444("hitbar_default", (byte) 56);
        class283.field4039 = arg0.method1444("timerbar_default", (byte) 61);
        class15.field227 = arg0.method1444("headicons_pk", (byte) 51);
        class221.field3115 = arg0.method1444("headicons_prayer", (byte) 72);
        class75.field1071 = arg0.method1444("hint_headicons", (byte) 72);
        class480.field6931 = arg0.method1444("hint_mapmarkers", (byte) 125);
        class272.field3847 = arg0.method1444("mapflag", (byte) 88);
        class267.field3770 = arg0.method1444("cross", (byte) 27);
        if (arg1 != -22569) {
            return;
        }
        class336.field4873 = arg0.method1444("mapdots", (byte) 60);
        class169.field2231 = arg0.method1444("scrollbar", (byte) 98);
        class141.field1848 = arg0.method1444("name_icons", (byte) 35);
        class12.field193 = arg0.method1444("floorshadows", (byte) 109);
        class386.field5721 = arg0.method1444("compass", (byte) 83);
        class478.field6879 = arg0.method1444("otherlevel", (byte) 67);
        class463.field6726 = arg0.method1444("hint_mapedge", (byte) 74);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I", line = 75)
    public static int method3013(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V", line = 88)
    public static void method3014(byte arg0) {
        if (arg0 != -90) {
            method3010((byte) 2);
        }
        field7647 = null;
        field7651 = null;
    }
}

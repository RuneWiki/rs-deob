import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class298 {

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Ldp;")
    public static class347 field4434 = new class347("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Luv;")
    public static class2 field4438 = new class2(66, -2);

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[B")
    public byte[] field4436;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[S")
    public short[] field4432;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "[S")
    public short[] field4433;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "[S")
    public short[] field4437;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1852(int arg0, int arg1, String arg2) {
        field4435++;
        class506 var3 = class14.method185(arg1 ^ 0xB23D8A63, arg0, arg1);
        var3.method2992(0);
        var3.field7444 = arg2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method1853(int arg0) {
        field4438 = null;
        field4434 = null;
        if (arg0 != 66) {
            method1853(-17);
        }
    }
}

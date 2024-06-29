import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class class278 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lpn;")
    public static class72 field3963 = new class72(16, 11);

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lgu;")
    public static class255 field3964 = class77.method389(9);

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Lec;")
    public static class40 field3967 = new class40("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Ler;")
    public static class242 field3968 = new class242();

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lgt;")
    public static class356 field3966;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lll;")
    public static class358 field3965;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1687(boolean arg0) {
        field3966 = null;
        if (arg0) {
            method1687(false);
        }
        field3965 = null;
        field3963 = null;
        field3964 = null;
        field3968 = null;
        field3967 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lbm;")
    public abstract class348 method1685(int arg0);

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public abstract void method1686(int arg0);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public abstract void method1688(byte arg0);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1689(byte arg0, int arg1);
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[F")
    public static float[] field156 = new float[4];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[Lfd;")
    public static class143[] field154 = new class143[4];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljq;")
    public static class447 field162 = null;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Luv;")
    public static class3 field157 = new class3(24, 3);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lvt;")
    public static class344 field163 = new class344("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lvt;")
    public static class344 field165 = new class344("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lde;")
    public class15 field158;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lac;")
    public static class284 field164;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lfu;")
    public class450 field161;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method71(int arg0) {
        field155++;
        if (class44.field630 >= 500) {
            return;
        }
        this.field158 = class625.field9045;
        if (arg0 < 85) {
            method73(105);
        }
        this.field161 = null;
        this.field160 = 0;
        class625.field9045 = this;
        class44.field630++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method72(int arg0) {
        field165 = null;
        field164 = null;
        field163 = null;
        if (arg0 != 11096) {
            field154 = null;
        }
        field156 = null;
        field154 = null;
        field162 = null;
        field157 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static final void method73(int arg0) {
        field159++;
        if (class279.field3639 != 3 && class628.field9175.field3702 != -1) {
            class489.method2749(class628.field9175.field3702, class628.field9175.field3700, 3);
        }
        int var1 = 19 / ((19 - arg0) / 60);
    }
}

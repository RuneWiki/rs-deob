import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class72 {

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field892;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
    public static int[] field886 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field891 = -1;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "[I")
    public static int[] field888 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lph;")
    public static class315 field884 = null;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Lcq;")
    public static class72 field894 = new class72("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lwo;")
    public static class285 field896;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 20)
    public static final void method430(byte arg0) {
        class153.field1780.method2216((byte) -86);
        field895++;
        if (arg0 > -74) {
            method435(55, 34);
        }
        class355.field4822.method2216((byte) -102);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method431(boolean arg0) {
        field883++;
        if (!arg0) {
            method432(96);
        }
        if (class451.field6295 == null) {
            return;
        }
        if (class451.field6295.field4244 == 1) {
            class451.field6295 = null;
            return;
        }
        if (class451.field6295.field4244 == 2) {
            class434.method2653(class204.field2458, 2, class131.field1496, -1);
            class451.field6295 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 94)
    public static void method432(int arg0) {
        field886 = null;
        field896 = null;
        field888 = null;
        field884 = null;
        if (arg0 != 2) {
            method432(-23);
        }
        field894 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V", line = 132)
    public static final void method433(int arg0, int arg1, int arg2) {
        field890++;
        class12 var3 = class390.method2422(341555040, arg0, arg2);
        var3.method66(-102);
        var3.field144 = arg1;
    }

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;", line = 154)
    public final String toString() {
        field885++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Ljava/lang/String;", line = 173)
    public final String method434(int arg0, int arg1) {
        field897++;
        return arg1 == -8192 ? this.field892[arg0] : null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 185)
    public class72(String arg0, String arg1, String arg2, String arg3) {
        this.field892 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V", line = 225)
    public static final void method435(int arg0, int arg1) {
        class264.field3401.method2286(arg1, (byte) 36);
        if (arg0 <= 120) {
            field886 = null;
        }
        field887++;
    }
}

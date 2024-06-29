import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class490 extends RuntimeException {

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7415;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/lang/String;")
    public String field7413;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lss;")
    public static class213 field7418 = new class213("K", "T", "K", "K");

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lss;")
    public static class213 field7419 = new class213("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[S")
    public static short[] field7420 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Lo;")
    public static class139 field7412;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static final void method3008(int arg0) {
        class307.field4813.method1297(class428.field6486, class141.field1911.field6120 ? class509.field7594 + 256 << 0 : -1, 256);
        field7414++;
        if (arg0 > -108) {
            field7419 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public static void method3009(byte arg0) {
        field7419 = null;
        field7412 = null;
        field7420 = null;
        field7418 = null;
        if (arg0 != 67) {
            field7420 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class490(Throwable arg0, String arg1) {
        this.field7415 = arg0;
        this.field7413 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public static final void method3010(int arg0) {
        class328 var1 = class473.field7252;
        synchronized (class473.field7252) {
            if (arg0 > -12) {
                field7419 = null;
            }
            class473.field7252.method2189(false);
        }
        field7416++;
    }
}

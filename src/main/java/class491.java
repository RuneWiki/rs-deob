import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class491 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field6838 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field6833;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public int field6836;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field6837;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field6839;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public int field6841;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field6842;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field6843;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[B")
    public byte[] field6834;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[B")
    public byte[] field6840;

    static {
        new class304("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBIIII)V", line = 19)
    public static final void method2832(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field6835++;
        if (arg3 != 45) {
            return;
        }
        if (arg4 >= class308.field4055 && arg7 <= class71.field1077 && class353.field4777 <= arg5 && class300.field3971 >= arg6) {
            class176.method1180(arg2, arg1, 200, arg4, arg7, arg0, arg6, arg5);
        } else {
            class96.method685(arg5, arg4, arg7, arg6, arg0, arg1, arg2, 5);
        }
    }
}

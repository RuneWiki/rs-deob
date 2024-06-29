import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class20 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ljava/lang/String;")
    public static String field218 = "Loading interfaces - ";

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lcc;")
    public static class216 field216 = new class216(20);

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Led;")
    public static class187 field223 = new class187();

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lmf;")
    public static class10 field224 = new class10();

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Llc;")
    public static class86 field220;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Llc;")
    public static class86 field225;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBII)V")
    public static final void method131(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field219++;
        class201 var5 = class94.method738(-78, arg0, 4);
        var5.method1477(0);
        var5.field3219 = arg3;
        var5.field3226 = arg4;
        if (arg2 > -67) {
            method131(-109, 103, (byte) -108, -81, -16);
        }
        var5.field3224 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method132(int arg0) {
        field223 = null;
        field216 = null;
        field218 = null;
        field224 = null;
        field225 = null;
        if (arg0 != -22660) {
            field220 = null;
        }
        field220 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILlc;)V")
    public static final void method133(int arg0, class86 arg1) {
        class50.field733 = arg1;
        field217++;
        if (arg0 == -2136) {
            class75.field1075 = class50.field733.method617((byte) 70, 16);
        }
    }
}

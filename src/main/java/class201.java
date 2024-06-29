import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class201 {

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Lqs;")
    private class496 field3197;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3192 = "";

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[Llh;")
    public static class260[] field3196 = new class260[2048];

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Llo;")
    public static class306 field3191 = new class306("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3198 = 0;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
    public static final int method1326(byte arg0) {
        if (arg0 == 19) {
            field3193++;
            return 2;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lfv;Lza;I)I")
    public static final int method1327(class471 arg0, class491 arg1, int arg2) {
        field3194++;
        if (arg0.field6975 != arg2) {
            return arg0.field6975;
        }
        if (arg0.field6986 != -1) {
            class320 var3 = arg1.field7179.method195(arg1.method831() ? arg0.field6986 : arg0.field6978, (byte) -105);
            if (!var3.field5023) {
                return var3.field5033;
            }
        }
        return arg0.field6972;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3190++;
        if (arg2 < 36) {
            return;
        }
        class266 var5 = class308.method1961(true, arg0, 8);
        var5.method1781((byte) 95);
        var5.field4454 = arg3;
        var5.field4453 = arg1;
        var5.field4457 = arg4;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
    public static void method1329(byte arg0) {
        if (arg0 > -14) {
            method1326((byte) 108);
        }
        field3191 = null;
        field3196 = null;
        field3192 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class201(class535 arg0, int arg1, class496 arg2) {
        new class231(64);
        this.field3197 = arg2;
        this.field3195 = this.field3197.method2940(15, -10511);
    }
}

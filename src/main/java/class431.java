import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class431 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field6457 = 1;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field6455 = 0;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Llo;")
    public static class306 field6458 = new class306(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Llo;")
    public static class306 field6461 = new class306("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field6462 = -1;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "C")
    public char field6460;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class194 var7 = new class194();
        var7.field3021 = arg1 >> class276.field4534;
        var7.field3019 = arg2 >> class276.field4534;
        var7.field3040 = arg3 >> class276.field4534;
        var7.field3031 = arg4 >> class276.field4534;
        var7.field3025 = arg0;
        var7.field3018 = arg1;
        var7.field3028 = arg2;
        var7.field3030 = arg3;
        var7.field3033 = arg4;
        var7.field3038 = arg5;
        var7.field3032 = arg6;
        class252.field4299[class244.field4189++] = var7;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 23)
    public static void method2623(int arg0) {
        field6458 = null;
        if (arg0 != 4) {
            method2626(-26, -33);
        }
        field6461 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILia;)V", line = 39)
    public final void method2624(int arg0, class23 arg1) {
        field6459++;
        while (true) {
            int var3 = arg1.method126((byte) -119);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field6461 = null;
                    return;
                }
            }
            this.method2625(var3, (byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLia;)V", line = 60)
    private final void method2625(int arg0, byte arg1, class23 arg2) {
        if (arg0 == 1) {
            this.field6460 = class260.method1745(arg2.method167(-2), 255);
        } else if (arg0 == 2) {
            this.field6457 = 0;
        }
        field6454++;
        int var4 = -62 / ((89 - arg1) / 37);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 83)
    public static final void method2626(int arg0, int arg1) {
        field6456++;
        class266 var2 = class308.method1961(true, arg1, 4);
        if (arg0 > 21) {
            var2.method1778(17991);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class128 {

    @OriginalMember(owner = "client!da", name = "H", descriptor = "[I")
    public int[] field566 = new int[1];

    @OriginalMember(owner = "client!da", name = "P", descriptor = "[I")
    public int[] field574 = new int[] { -1 };

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lid;")
    private static class60 field558 = class11.method72("Bad session id)3", (byte) 97);

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Lid;")
    private static class60 field557 = class11.method72("Prepared sound engine", (byte) -117);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Lid;")
    private static class60 field560 = class11.method72("The server is being updated)3", (byte) 115);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lid;")
    public static class60 field553 = field560;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lid;")
    private static class60 field554 = class11.method72("Choose Option", (byte) 121);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lid;")
    public static class60 field562 = class11.method72("", (byte) -78);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lid;")
    public static class60 field570 = class11.method72("Nehmen", (byte) 117);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lid;")
    public static class60 field572 = field557;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lid;")
    public static class60 field555 = class11.method72("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", (byte) -14);

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Lid;")
    private static class60 field563 = class11.method72("Please use a different world)3", (byte) 91);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "Lid;")
    public static class60 field561 = class11.method72(" x ", (byte) -66);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Lid;")
    public static class60 field571 = field563;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Lid;")
    public static class60 field559 = field554;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lid;")
    public static class60 field568 = field558;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lid;")
    public static class60 field573 = field563;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lbf;")
    public static class14 field567;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lic;IILpa;)V")
    public static final void method182(class59 arg0, int arg1, int arg2, class105 arg3) {
        field565++;
        byte[] var4 = null;
        class66 var5 = class47.field1243;
        synchronized (class47.field1243) {
            for (class98 var6 = (class98) class47.field1243.method496(10153); var6 != null; var6 = (class98) class47.field1243.method500(arg2)) {
                if ((long) arg1 == var6.field2929 && var6.field2407 == arg0 && var6.field2399 == 0) {
                    var4 = var6.field2397;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method417(arg1, 65280);
            if (arg2 == -1) {
                arg3.method858((byte) 98, true, arg1, var7, arg0);
            }
        } else {
            arg3.method858((byte) 126, true, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method183(boolean arg0) {
        field568 = null;
        field561 = null;
        field554 = null;
        field553 = null;
        field567 = null;
        field558 = null;
        if (!arg0) {
            method183(true);
        }
        field571 = null;
        field562 = null;
        field573 = null;
        field557 = null;
        field559 = null;
        field555 = null;
        field570 = null;
        field563 = null;
        field560 = null;
        field572 = null;
    }
}

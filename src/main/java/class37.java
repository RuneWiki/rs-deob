import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    public static int[] field851 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Loh;")
    public static class263 field853 = class253.method1681(-125, " x ");

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Loh;")
    public static class263 field856 = class253.method1681(-118, ":duelstake:");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lue;")
    public static class86 field855;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lue;Lue;Lue;ILue;)V")
    public static final void method233(class86 arg0, class86 arg1, class86 arg2, int arg3, class86 arg4) {
        class228.field4004 = arg2;
        if (arg3 != 0) {
            field851 = null;
        }
        field859++;
        class24.field683 = arg1;
        class24.field692 = arg0;
        class90.field1779 = arg4;
        class164.field2974 = new class21[class24.field683.method574((byte) -122)][];
        class244.field4311 = new boolean[class24.field683.method574((byte) -122)];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method234(int arg0) {
        field857++;
        class16 var1 = class13.field346;
        synchronized (class13.field346) {
            class276.field4837++;
            class11.field247 = class138.field2557;
            class136.field2492 = class169.field3111;
            class252.field4380 = class233.field4070;
            class268.field4733 = class36.field849;
            class57.field1173 = class108.field2047;
            class31.field777 = class173.field3150;
            class131.field2398 = class230.field4037;
            class36.field849 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method235(int arg0) {
        if (arg0 == 0) {
            field856 = null;
            field851 = null;
            field855 = null;
            field853 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)V")
    public static final void method236(byte arg0, int arg1, int arg2) {
        field854++;
        class154.field2792.method1516(-101, 46);
        class154.field2792.method1292(arg1, 10776);
        class220.field3918++;
        class154.field2792.method1280(arg2, (byte) 122);
        if (arg0 >= -40) {
            method235(-53);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lue;ZI)Lw;")
    public static final class141 method237(class86 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field855 = null;
        }
        field858++;
        return class180.method1205(arg2, 0, arg0) ? class55.method349(false) : null;
    }
}

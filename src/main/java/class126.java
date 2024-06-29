import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class126 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lgn;")
    public static class475 field1619 = new class475(51, -1);

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lwt;")
    public static class194 field1620 = new class194("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lgn;")
    public static class475 field1623 = new class475(69, 7);

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Ltq;")
    public static class426 field1624 = new class426(7, 7);

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "F")
    public static float field1621;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lqg;")
    public static class307 field1622;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 3)
    public static final void method706(int arg0) {
        field1618++;
        if (class192.field2715 < 0) {
            class192.field2715 = 0;
            class134.field1711 = -1;
            class261.field3728 = -1;
        }
        if (class192.field2715 > class249.field3588) {
            class261.field3728 = -1;
            class192.field2715 = class249.field3588;
            class134.field1711 = -1;
        }
        if (class364.field5477 < 0) {
            class134.field1711 = -1;
            class261.field3728 = -1;
            class364.field5477 = 0;
        }
        if (class249.field3597 < class364.field5477) {
            class261.field3728 = -1;
            class364.field5477 = class249.field3597;
            class134.field1711 = -1;
        }
        if (arg0 != 4832) {
            field1622 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 49)
    public static void method707(int arg0) {
        field1623 = null;
        field1624 = null;
        field1622 = null;
        if (arg0 != -1) {
            method707(60);
        }
        field1619 = null;
        field1620 = null;
    }
}

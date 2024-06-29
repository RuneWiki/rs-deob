import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class136 extends class405 {

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field2009 = 0;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field2012 = 1;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Laa;")
    public static class76 field2011 = new class76(59, 7);

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
    public static int[] field2013;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field2010;

    static {
        new class347("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        new class347(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field2013 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILgk;)V", line = 3)
    private final void method989(int arg0, int arg1, class468 arg2) {
        if (arg1 == 2) {
            this.field2009 = arg2.method2727((byte) 43);
        }
        field2008++;
        if (arg0 > -93) {
            this.field2009 = -110;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgk;I)V", line = 20)
    public final void method990(class468 arg0, int arg1) {
        if (arg1 != 59) {
            this.method989(-100, 72, null);
        }
        while (true) {
            int var3 = arg0.method2765(80);
            if (var3 == 0) {
                field2010++;
                return;
            }
            this.method989(-109, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V", line = 51)
    public static void method991(boolean arg0) {
        field2011 = null;
        field2013 = null;
        if (arg0) {
            method991(false);
        }
    }
}

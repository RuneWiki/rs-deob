import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class459 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Liu;")
    public static class390 field6682;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lgn;")
    public static class475 field6683;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lci;")
    public static class298 field6684;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[Log;")
    public static class441[] field6685;

    static {
        new class194("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field6682 = new class390(92, -1);
        field6683 = new class475(27, 1);
        field6684 = new class298("runescape", 0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Lak;", line = 6)
    public static final class222 method2671(int arg0, int arg1) {
        field6679++;
        class222[] var2 = class463.method2718((byte) -118);
        if (arg0 != -20439) {
            method2672((byte) -109);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3142 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2672(byte arg0) {
        class445.method2601();
        field6680++;
        if (arg0 != -91) {
            field6683 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class169.field2234[var1].method139(true);
        }
        class428.method2552(18583);
        class110.method656(false);
        System.gc();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 63)
    public static void method2673(byte arg0) {
        field6685 = null;
        field6682 = null;
        field6683 = null;
        if (arg0 > -72) {
            field6681 = 86;
        }
        field6684 = null;
    }
}

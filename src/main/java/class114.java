import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class114 extends class5 {

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1585 = 999999;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[B")
    public static byte[] field1587;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "J")
    public long field1579;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Luh;")
    public class114 field1580;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Luh;")
    public class114 field1582;

    static {
        new class446("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field1586 = 0;
        new class446("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field1587 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 4)
    public static void method704(byte arg0) {
        int var1 = -6 % ((7 - arg0) / 48);
        field1587 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 13)
    public final void method705(int arg0) {
        field1583++;
        if (this.field1582 == null) {
            return;
        }
        this.field1582.field1580 = this.field1580;
        this.field1580.field1582 = this.field1582;
        this.field1580 = null;
        if (arg0 == 6511) {
            this.field1582 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILcd;ILqa;Z)V", line = 33)
    public static final void method706(int arg0, int arg1, class209 arg2, int arg3, class165 arg4, boolean arg5) {
        if (arg5) {
            field1586 = 24;
        }
        field1581++;
        class53 var6 = class244.field3413.method976(arg5, arg2.field2939);
        if (var6.field745 == -1) {
            return;
        }
        int var7;
        if (arg2.field2908) {
            int var8 = arg2.field2947 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class341 var9 = var6.method392(var7, arg4, arg2.field2964, 1);
        if (var9 == null) {
            return;
        }
        int var10 = arg2.field2928;
        int var11 = arg2.field2925;
        if ((var7 & 0x1) == 1) {
            var10 = arg2.field2925;
            var11 = arg2.field2928;
        }
        int var12 = var9.method302();
        int var13 = var9.method306();
        if (var6.field742) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field751 == 0) {
            var9.method2206(arg1, arg0 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method291(arg1, arg0 - ((var11 - 1) * 4), var12, var13, 0, var6.field751 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Z", line = 90)
    public final boolean method707(boolean arg0) {
        if (arg0) {
            field1584++;
            return this.field1582 != null;
        } else {
            return true;
        }
    }
}

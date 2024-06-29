import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class324 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lan;")
    public class20 field4726 = new class20();

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public boolean field4731 = false;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[I")
    public static int[] field4725 = new int[25];

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Lkn;")
    public static class530 field4735 = new class530("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lrm;")
    public static class286 field4736 = class243.method1528((byte) 123);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Loi;")
    public static class53 field4734;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[Lo;")
    public static class24[] field4727;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1955(int arg0) {
        field4728++;
        if (arg0 != 25) {
            method1955(34);
        }
        class141.field1848 = true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)Lui;", line = 29)
    public static final class155 method1956(boolean arg0, int arg1) {
        field4733++;
        class155 var2 = (class155) class373.field5316.method1088((long) arg1, (byte) 79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class536.field7850.method426(0, (byte) 9, arg1);
        if (!arg0) {
            field4736 = null;
        }
        class155 var4 = new class155();
        if (var3 != null) {
            var4.method1000((byte) 122, new class403(var3));
        }
        var4.method998(978163264);
        class373.field5316.method1097(19627, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 65)
    public static void method1957(int arg0) {
        field4725 = null;
        field4736 = null;
        field4727 = null;
        field4735 = null;
        int var1 = -100 / ((-arg0 - 6) / 39);
        field4734 = null;
    }
}

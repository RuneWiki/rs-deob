import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class124 {

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field1701 = 1337;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
    public static int[] field1700 = new int[100];

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lo;")
    public static class332 field1708;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lgp;")
    public static class430 field1710;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1709;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "[I")
    public static int[] field1707;

    static {
        new class332("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field1708 = new class332("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
        field1710 = null;
        field1709 = null;
    }

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field1703++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 15)
    public static void method866(int arg0) {
        field1700 = null;
        field1708 = null;
        field1707 = null;
        field1710 = null;
        if (arg0 == -24634) {
            field1709 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Lst;", line = 30)
    public static final class97 method867(byte arg0) {
        if (arg0 <= 64) {
            field1701 = -62;
        }
        field1705++;
        class97 var1 = (class97) class271.field4074.method1589(125);
        if (var1 == null) {
            return new class97();
        } else {
            class122.field1689--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ltq;ZJ)V", line = 51)
    public static final void method868(class63 arg0, boolean arg1, long arg2) {
        if (arg1) {
            field1707 = null;
        }
        field1706++;
        class344.field5188 = class6.field109;
        class143.field2037 = 0;
        class6.field109 = 0;
        long var4 = class435.method2539(-10659);
        for (class59 var6 = (class59) class10.field153.method1594(16); var6 != null; var6 = (class59) class10.field153.method1596(!arg1)) {
            if (var6.method460(arg0, arg2)) {
                class143.field2037++;
            }
        }
        if (class295.field4438 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class10.field153.method1598(-79) + ", running: " + class143.field2037 + ". Particles: " + class6.field109 + ". Time taken: " + (class435.method2539(-10659) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILgo;Lgo;)V", line = 84)
    public static final void method869(int arg0, int arg1, int arg2, class287 arg3, class287 arg4) {
        class337 var5 = class15.method139(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5058 = arg3;
            var5.field5050 = arg4;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBLbg;)V", line = 99)
    public static final void method870(int arg0, int arg1, byte arg2, class257 arg3) {
        if (arg3.field4612 == arg0 && arg0 != -1) {
            class356 var4 = class170.field2423.method1586(arg0, (byte) 36);
            int var5 = var4.field5415;
            if (var5 == 1) {
                arg3.field4636 = 0;
                arg3.field4601 = arg1;
                arg3.field4600 = 0;
                arg3.field4603 = 1;
                arg3.field4642 = 0;
                class210.method1416(arg3.field4600, arg3.field4543, class472.field6622 == arg3, arg3.field4545, var4, arg2 + 15697, arg3.field4538);
            }
            if (var5 == 2) {
                arg3.field4642 = 0;
            }
        } else if (arg0 == -1 || arg3.field4612 == -1 || class170.field2423.method1586(arg0, (byte) 36).field5419 >= class170.field2423.method1586(arg3.field4612, (byte) 36).field5419) {
            arg3.field4636 = 0;
            arg3.field4600 = 0;
            arg3.field4601 = arg1;
            arg3.field4673 = arg3.field4678;
            arg3.field4642 = 0;
            arg3.field4612 = arg0;
            arg3.field4603 = 1;
            if (arg3.field4612 != -1) {
                class210.method1416(arg3.field4600, arg3.field4543, class472.field6622 == arg3, arg3.field4545, class170.field2423.method1586(arg3.field4612, (byte) 36), 15806, arg3.field4538);
            }
        }
        field1702++;
        if (arg2 != 109) {
            method868((class63) null, true, 88L);
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V", line = 152)
    public class124(int arg0) {
        this.field1704 = arg0;
    }
}

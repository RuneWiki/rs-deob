import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class391 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
    public static int[] field5795 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lwt;")
    public static class194 field5796 = new class194("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
    public static boolean field5797 = false;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I", line = 17)
    public static final int method2355(int arg0) {
        field5799++;
        class134 var1 = class481.field6937;
        boolean var2 = false;
        if (class293.field4174 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class134.method777(var3, 0, null, arg0 + 3, null, 0);
            var2 = true;
        }
        if (arg0 != 3) {
            method2356(false);
        }
        long var4 = class109.method653(false);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method827(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class109.method653(false) - var4);
        var1.method801(-6625, 100, 0, -16777216, 0, 100);
        if (var2) {
            var1.method835(arg0 ^ 0x2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 59)
    public static void method2356(boolean arg0) {
        field5796 = null;
        if (!arg0) {
            method2356(false);
        }
        field5795 = null;
    }
}

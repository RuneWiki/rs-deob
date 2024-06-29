import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class92 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public int[] field1286;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
    public int[] field1284;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
    public static boolean field1287;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "J")
    public static long field1288;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lkn;")
    public static class442 field1291;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILoo;IIIII)V")
    public static final void method653(int arg0, class374 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 39 / ((39 - arg5) / 49);
        class54.method441(arg1.field6266, arg0, arg2, 0, arg1.field6262, 15415, arg6, arg4, arg3);
        field1283++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method654(byte arg0) {
        field1291 = null;
        if (arg0 != -62) {
            method654((byte) -115);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
    public class92(int arg0) {
        this.field1285 = arg0;
        this.field1286 = new int[this.field1285];
        this.field1284 = new int[this.field1285];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Frame;BLko;)V")
    public static final void method655(Frame arg0, byte arg1, class294 arg2) {
        if (arg1 != 43) {
            method654((byte) 4);
        }
        while (true) {
            class283 var3 = arg2.method1917(arg0, -128);
            while (var3.field3998 == 0) {
                class349.method2219(10L, arg1 ^ 0xFFFFFFC3);
            }
            if (var3.field3998 == 1) {
                field1290++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class349.method2219(100L, -90);
        }
    }

    static {
        new class442("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field1287 = true;
        field1288 = -1L;
        field1291 = new class442("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");
    }
}

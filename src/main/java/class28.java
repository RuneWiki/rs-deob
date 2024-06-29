import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public int[] field455 = new int[16];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field449 = 0;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[B")
    public byte[] field468 = new byte[256];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    public int[] field469 = new int[256];

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    public int[] field473 = new int[6];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
    public byte[] field457 = new byte[4096];

    @OriginalMember(owner = "client!be", name = "B", descriptor = "[[I")
    public int[][] field475 = new int[6][258];

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[Z")
    public boolean[] field464 = new boolean[256];

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[[B")
    public byte[][] field467 = new byte[6][258];

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public int field480 = 0;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[Z")
    public boolean[] field463 = new boolean[16];

    @OriginalMember(owner = "client!be", name = "I", descriptor = "[I")
    public int[] field482 = new int[257];

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[[I")
    public int[][] field478 = new int[6][258];

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[B")
    public byte[] field466 = new byte[18002];

    @OriginalMember(owner = "client!be", name = "J", descriptor = "[B")
    public byte[] field483 = new byte[18002];

    @OriginalMember(owner = "client!be", name = "D", descriptor = "[[I")
    public int[][] field477 = new int[6][258];

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lwt;")
    public static class194 field452 = new class194("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Lci;")
    public static class298 field486 = new class298("stellardawn", 1);

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Ldc;")
    public static class5 field488 = new class5(4);

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field489 = Boolean.FALSE;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "B")
    public byte field472;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[B")
    public byte[] field456;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[B")
    public byte[] field458;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 22)
    public static void method232(int arg0) {
        field488 = null;
        field486 = null;
        field489 = null;
        int var1 = 10 % ((36 - arg0) / 52);
        field452 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lts;B)V", line = 50)
    public static final void method233(class356 arg0, byte arg1) {
        field451++;
        class356 var2 = class480.method2801(896298960, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class223.field3156;
            var4 = class207.field2874;
        } else {
            var3 = var2.field5168;
            var4 = var2.field5169;
        }
        class210.method1297((byte) -64, false, var3, arg0, var4);
        class139.method872(var4, arg0, (byte) 98, var3);
        if (arg1 > -113) {
            method234(27, -45, true);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 158)
    public static final String method234(int arg0, int arg1, boolean arg2) {
        if (arg1 < 29) {
            field461 = 4;
        }
        field448++;
        return arg2 && arg0 >= 0 ? class2.method15((byte) 105, arg0, arg2, 10) : Integer.toString(arg0);
    }
}

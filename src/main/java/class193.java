import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class193 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[[I")
    public int[][] field3448 = new int[6][258];

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[[B")
    public byte[][] field3466 = new byte[6][258];

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[B")
    public byte[] field3460 = new byte[18002];

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "[Z")
    public boolean[] field3469 = new boolean[256];

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[B")
    public byte[] field3476 = new byte[256];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field3452 = 0;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[[I")
    public int[][] field3472 = new int[6][258];

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[[I")
    public int[][] field3463 = new int[6][258];

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "[Z")
    public boolean[] field3478 = new boolean[16];

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "[I")
    public int[] field3479 = new int[16];

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "[B")
    public byte[] field3459 = new byte[4096];

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "[I")
    public int[] field3482 = new int[257];

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[I")
    public int[] field3485 = new int[6];

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[B")
    public byte[] field3484 = new byte[18002];

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "[I")
    public int[] field3489 = new int[256];

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field3481 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Le;")
    public static class191 field3461 = class54.method368("Versteckt", 2047);

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Le;")
    public static class191 field3488 = class54.method368("Lade)3)3)3", 2047);

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "B")
    public byte field3467;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Lng;")
    public static class121 field3487;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Leg;")
    public static class33 field3475;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[B")
    public byte[] field3453;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[B")
    public byte[] field3480;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Lc;")
    public static class60[] field3464;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
    public static final int method1374(int arg0, int arg1, int arg2) {
        field3470++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (~arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method1375(boolean arg0) {
        field3464 = null;
        field3461 = null;
        field3475 = null;
        field3487 = null;
        field3488 = null;
        if (arg0) {
            method1374(102, -65, 52);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBIIII)V")
    public static final void method1376(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3477++;
        if (arg1 < 114) {
            method1376(-62, (byte) -85, -2, 5, -90, 27);
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            class242.method1700(7, arg5, arg4, class232.field4151[var6], arg0);
        }
    }
}

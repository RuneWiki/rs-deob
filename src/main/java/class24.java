import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class24 extends class12 {

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[[I")
    public int[][] field601;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[Z")
    private boolean[] field596;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[I")
    public int[] field600;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lkh;")
    public static class117 field595 = class224.method1450((byte) -65, "settings");

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lkh;")
    public static class117 field599 = class224.method1450((byte) -103, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "[I")
    public static int[] field602 = new int[4096];

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lkh;")
    public static class117 field597 = class224.method1450((byte) 108, "; Max)2Age=");

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lkh;")
    public static class117 field598 = class224.method1450((byte) 126, "AUS");

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lkh;")
    public static class117 field607 = class224.method1450((byte) 105, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lkh;")
    public static class117 field606 = class224.method1450((byte) -67, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method208(int arg0) {
        field598 = null;
        field606 = null;
        field597 = null;
        field599 = null;
        field607 = null;
        field602 = null;
        field595 = null;
        if (arg0 >= -108) {
            method211((byte) -24);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lah;II)Lkh;")
    public static final class117 method209(class9 arg0, int arg1, int arg2) {
        field609++;
        if (arg2 != 1) {
            return null;
        } else if (!class196.method1299((byte) -22, class187.method1269(arg0, (byte) 16), arg1) && arg0.field165 == null) {
            return null;
        } else if (arg0.field231 == null || arg0.field231.length <= arg1 || arg0.field231[arg1] == null || arg0.field231[arg1].method798((byte) 113).method819((byte) -104) == 0) {
            return class103.field1882 ? class36.method316((byte) -34, new class117[] { class12.field397, class42.method358(arg1, (byte) 34) }) : null;
        } else {
            return arg0.field231[arg1];
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lai;II)Lnb;")
    public static final class144 method210(class10 arg0, int arg1, int arg2) {
        field605++;
        if (arg2 != -1) {
            method211((byte) 56);
        }
        return class71.method502(arg0, arg1, (byte) 26) ? class101.method681((byte) 3) : null;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)I")
    public static final int method211(byte arg0) {
        field604++;
        if (arg0 >= -37) {
            field597 = null;
        }
        return class128.field2371;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I[B)V")
    public class24(int arg0, byte[] arg1) {
        this.field608 = arg0;
        class145 var3 = new class145(arg1);
        this.field603 = var3.method998(61);
        this.field601 = new int[this.field603][];
        this.field596 = new boolean[this.field603];
        this.field600 = new int[this.field603];
        for (int var4 = 0; var4 < this.field603; var4++) {
            this.field600[var4] = var3.method998(102);
        }
        for (int var5 = 0; var5 < this.field603; var5++) {
            this.field596[var5] = var3.method998(88) == 1;
        }
        for (int var6 = 0; var6 < this.field603; var6++) {
            this.field601[var6] = new int[var3.method998(59)];
        }
        for (int var7 = 0; var7 < this.field603; var7++) {
            for (int var8 = 0; var8 < this.field601[var7].length; var8++) {
                this.field601[var7][var8] = var3.method998(99);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field84 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lem;")
    public static class10 field73 = null;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lmh;")
    public static class128 field83 = class22.method156(127, "p11_full");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lwk;")
    public static class165 field76;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ldj;")
    public static class314 field74;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Ldj;")
    public static class314 field78;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[[[I")
    public static int[][][] field80;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLbg;I)V", line = 26)
    private final void method23(byte arg0, class194 arg1, int arg2) {
        if (arg2 == 5) {
            this.field84 = arg1.method1308(-80);
        }
        field82++;
        if (arg0 <= 71) {
            method25(119, -54);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 48)
    public static void method24(int arg0) {
        field83 = null;
        field78 = null;
        field76 = null;
        if (arg0 <= 33) {
            field75 = 27;
        }
        field73 = null;
        field80 = (int[][][]) null;
        field74 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lmh;", line = 67)
    public static final class128 method25(int arg0, int arg1) {
        field77++;
        if (arg0 < 84) {
            field73 = (class10) null;
        }
        class128 var2 = new class128();
        var2.field2224 = new byte[arg1];
        var2.field2181 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbg;I)V", line = 89)
    public final void method26(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                field79++;
                if (arg1 >= -71) {
                    this.method26((class194) null, 89);
                }
                return;
            }
            this.method23((byte) 102, arg0, var3);
        }
    }
}

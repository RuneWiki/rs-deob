import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class306 {

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field352 = 1;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "[I")
    public static int[] field361 = new int[16];

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Lbg;")
    public static class324 field359 = new class324(87, -1);

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "J")
    public long field350;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lbp;")
    public static class262 field357;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[[S")
    public static short[][] field363;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
    public final int method231(byte arg0) {
        if (arg0 != 102) {
            field357 = null;
        }
        field358++;
        return this.field355;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field359 = null;
        field357 = null;
        field361 = null;
        field363 = null;
        int var1 = 34 / ((-arg0 - 57) / 53);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
    public final int method233(int arg0) {
        field360++;
        int var2 = 79 / ((-arg0 - 44) / 45);
        return this.field353;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZC)Z")
    public static final boolean method234(boolean arg0, char arg1) {
        field351++;
        if (arg0) {
            return false;
        } else if ((arg1 <= '\u0000' || arg1 >= '\u0080') && (arg1 < ' ' || arg1 > 'ÿ')) {
            if (arg1 != '\u0000') {
                char[] var2 = class346.field4804;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)J")
    public final long method235(byte arg0) {
        int var2 = 46 / ((73 - arg0) / 40);
        field354++;
        return this.field350;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I")
    public final int method236(byte arg0) {
        if (arg0 > -62) {
            return 20;
        } else {
            field356++;
            return this.field362;
        }
    }
}

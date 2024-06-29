import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class390 implements class409 {

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public int field5616;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "Leda;")
    public class14 field5625;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public int field5613;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "Lcga;")
    public class141 field5623;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public int field5614;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "[J")
    public static long[] field5619 = new long[32];

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field5621;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)V")
    public static final void method2389(byte arg0, int arg1) {
        class590.field8395 = arg1;
        field5618++;
        class683.field9697 = 0;
        if (arg0 < 48) {
            field5619 = null;
        }
        class445.field6358 = null;
        class342.field4704 = -1;
        class11.field98 = null;
        class179.field2476 = false;
        class249.field3628 = 1;
        class174.field2446 = -1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Lhr;")
    public class57 method478(int arg0) {
        if (arg0 <= 30) {
            this.field5625 = null;
        }
        field5615++;
        return null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V")
    public static void method2390(boolean arg0) {
        if (!arg0) {
            method2389((byte) -8, 18);
        }
        field5619 = null;
        field5621 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILsl;)Lhj;")
    public static final class46 method2391(int arg0, class479 arg1) {
        field5626++;
        return arg0 == 32 ? new class46(arg1.method2870(-11395), arg1.method2870(arg0 - 11427), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2865(arg0 ^ 0xDF), arg1.method2886(true)) : null;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Leda;Lcga;IIIIIII)V")
    public class390(class14 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5620 = arg2;
        this.field5624 = arg8;
        this.field5616 = arg7;
        this.field5625 = arg0;
        this.field5622 = arg3;
        this.field5617 = arg4;
        this.field5613 = arg5;
        this.field5623 = arg1;
        this.field5614 = arg6;
    }
}

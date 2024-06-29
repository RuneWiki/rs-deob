import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class201 extends class69 {

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public int field3597 = 0;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "[I")
    public int[] field3601 = new int[5];

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[Lue;")
    public class197[] field3600 = new class197[5];

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lha;")
    public static class46 field3580 = class271.method1828("Verbindung abgebrochen)3", -46);

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lha;")
    public static class46 field3579 = class271.method1828("hint_headicons", -46);

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "[Lrd;")
    public static class180[] field3605 = new class180[50];

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[Z")
    public static boolean[] field3584 = new boolean[5];

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Lpd;")
    public class168 field3606;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Lpi;")
    public static class181 field3581;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Lpi;")
    public static class181 field3583;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "Lu;")
    public class182 field3607;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "Lmk;")
    public class201 field3595;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lva;")
    public class255 field3589;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Lbc;")
    public class265 field3590;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lsi;")
    public class52 field3598;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Ldb;")
    public class59 field3599;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Z")
    public boolean field3588;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Z")
    public boolean field3592;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Z")
    public boolean field3593;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static void method1428(byte arg0) {
        int var1 = 59 % ((arg0 - 29) / 46);
        field3583 = null;
        field3605 = null;
        field3579 = null;
        field3584 = null;
        field3580 = null;
        field3581 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lva;")
    public static final class255 method1429(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3589;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(III)V")
    public class201(int arg0, int arg1, int arg2) {
        this.field3604 = this.field3586 = arg0;
        this.field3591 = arg1;
        this.field3602 = arg2;
    }
}

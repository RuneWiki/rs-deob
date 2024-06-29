import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class688 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field9411;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field9417;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lufa;")
    public static class140 field9413;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[Lkr;")
    public class104[] field9416;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public static final int method3751(int arg0, int arg1) {
        field9412++;
        return arg1 == 255 ? arg0 & 0xFF : -36;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILfd;)V")
    public final void method3752(int arg0, class418 arg1) {
        field9418++;
        this.field9417 = arg1.method2364(-99);
        this.field9411 = arg1.method2393(arg0 ^ 0xFFFF87F9);
        this.field9416 = new class104[arg1.method2396(20)];
        class103[] var3 = class91.method687(1);
        for (int var4 = arg0; var4 < this.field9416.length; var4++) {
            this.field9416[var4] = this.method3754(arg1, (byte) 55, var3[arg1.method2396(50)]);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method3753(int arg0) {
        field9413 = null;
        if (arg0 != 0) {
            method3751(54, 108);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lfd;BLfl;)Lkr;")
    private final class104 method3754(class418 arg0, byte arg1, class103 arg2) {
        field9419++;
        if (arg1 != 55) {
            return null;
        } else if (class614.field8296 == arg2) {
            return class20.method116((byte) 112, arg0);
        } else if (class501.field6615 == arg2) {
            return class284.method1695(arg0, false);
        } else if (class213.field2745 == arg2) {
            return class129.method929(arg0, 1489);
        } else if (class419.field5431 == arg2) {
            return class273.method1661(true, arg0);
        } else if (class549.field7128 == arg2) {
            return class116.method872(17679, arg0);
        } else if (class197.field2593 == arg2) {
            return class26.method150(-3, arg0);
        } else if (class240.field3234 == arg2) {
            return class291.method1728(arg0, true);
        } else if (class469.field6131 == arg2) {
            return class284.method1699(arg0, 19);
        } else if (class625.field8740 == arg2) {
            return class213.method1367(arg1 + 64, arg0);
        } else if (class549.field7127 == arg2) {
            return class594.method3228((byte) 27, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
    public static final boolean method3755(int arg0, int arg1, int arg2) {
        field9421++;
        if (arg0 != 4218) {
            field9413 = null;
        }
        return class230.method1451((byte) 64, arg2, arg1) & (class216.method1380(arg2, true, arg1) | (arg1 & 0x2000) != 0 | class59.method505(arg2, false, arg1));
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Z")
    public static final boolean method3756(int arg0, int arg1, int arg2) {
        field9420++;
        if (arg2 > -39) {
            field9413 = null;
        }
        return false;
    }
}

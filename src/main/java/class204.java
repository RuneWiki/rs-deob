import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class204 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "S")
    public short field2701;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "S")
    public short field2693;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "S")
    public short field2699;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "B")
    public byte field2692;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Z")
    public boolean field2700;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "B")
    public byte field2690;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lho;")
    public static class103 field2698 = new class103(49, 4);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1301(byte arg0, String arg1) {
        if (arg0 == 43) {
            field2691++;
            return class151.method906(true, arg1, 29853, 10);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1302(int arg0) {
        if (arg0 != -22255) {
            method1302(-119);
        }
        field2698 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2701 = (short) arg6;
        this.field2702 = arg0;
        this.field2693 = (short) arg5;
        this.field2697 = arg1;
        this.field2699 = (short) arg4;
        this.field2692 = (byte) arg8;
        this.field2700 = arg10;
        this.field2695 = arg11;
        this.field2694 = arg3;
        this.field2696 = arg2;
        this.field2690 = (byte) arg7;
    }

    static {
        new class305("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class489 {

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "S")
    public short field6594;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Z")
    public boolean field6587;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public int field6597;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "S")
    public short field6591;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "S")
    public short field6593;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public int field6590;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "B")
    public byte field6589;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "Lcb;")
    public static class318 field6599 = new class318(74, 8);

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Lbc;")
    public static class607 field6601 = new class607(2);

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Lfo;")
    public static class417 field6602 = new class417();

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method2719(byte arg0) {
        field6601 = null;
        field6599 = null;
        int var1 = -71 % ((38 - arg0) / 57);
        field6602 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
    public static final boolean method2720(int arg0, int arg1, int arg2) {
        field6600++;
        if (arg1 <= 123) {
            method2721(27);
        }
        return class582.method3266(arg2, -1, arg0) | (arg0 & 0x800) != 0 || class4.method25(-1, arg2, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static final void method2721(int arg0) {
        field6595++;
        class58.field810 = new class562(8);
        if (arg0 >= -115) {
            method2721(-36);
        }
        class131.field1676 = 0;
        for (class117 var1 = (class117) class379.field5440.method2224((byte) -112); var1 != null; var1 = (class117) class379.field5440.method2222((byte) -116)) {
            var1.method711();
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6594 = (short) arg6;
        this.field6587 = arg10;
        this.field6597 = arg0;
        this.field6591 = (short) arg5;
        this.field6596 = arg3;
        this.field6592 = arg2;
        this.field6593 = (short) arg4;
        this.field6590 = arg1;
        this.field6589 = (byte) arg8;
        this.field6588 = arg11;
    }
}

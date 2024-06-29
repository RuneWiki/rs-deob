import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class131 extends class171 implements class332 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
    public static int[] field2029 = new int[5];

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
    public final int method878(byte arg0) {
        ++field2025;
        return arg0 != 24 ? 83 : 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)J")
    public final long method879(int arg0) {
        ++field2027;
        return arg0 < 124 ? -83L : super.field2533.method2633();
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
    public final int method880(int arg0) {
        ++field2033;
        if (arg0 != 15868) {
            this.field2028 = -64;
        }
        return this.field2028;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
    public static final void method881(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class356.field5471.field3037 = 0;
        ++field2032;
        class356.field5471.method1410(class46.field739.field4730, -27645);
        class356.field5471.method1410(arg2, -27645);
        class356.field5471.method1410(arg1, -27645);
        class356.field5471.method1413(-126, arg3);
        class356.field5471.method1413(-122, arg0);
        class434.field6502 = 0;
        class90.field1360 = 1;
        if (arg4 >= 109) {
            class375.field5714 = 0;
            client.field2856 = -3;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lod;I[BI)V")
    public class131(class349 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2028 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method882(int arg0) {
        if (arg0 == 0) {
            field2029 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI[BI)V")
    public final void method883(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != -80) {
            method881(-72, 118, -20, -89, 102);
        }
        this.method1179(arg2, arg1);
        ++field2026;
        this.field2028 = arg3;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIIII)V")
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class494.field7297 >= ~arg0 && ~class445.field6629 <= ~arg0) {
            int var5 = class42.method249(class37.field393, arg4, (byte) -72, class509.field7436);
            int var6 = class42.method249(class37.field393, arg1, (byte) -72, class509.field7436);
            class308.method1942(var5, arg3, (byte) -102, arg0, var6);
        }
        ++field2030;
        if (arg2 != 0) {
            field2031 = -17;
        }
    }
}

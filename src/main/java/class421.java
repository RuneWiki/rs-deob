import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class421 extends class223 {

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field5605 = 52;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field5610 = -1;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "[Z")
    public static boolean[] field5612 = new boolean[8];

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lat;")
    public class585 field5611;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[B")
    public byte[] field5606;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "[Lf;")
    public static class534[] field5602;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)[B")
    public final byte[] method1349(int arg0) {
        ++field5604;
        if (super.field2767) {
            throw new RuntimeException();
        } else {
            return arg0 > -16 ? null : this.field5606;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
    public final int method1351(byte arg0) {
        int var2 = 42 / ((arg0 - -53) / 47);
        ++field5609;
        return super.field2767 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
    public static final void method2355(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5608;
        if (arg0 > -68) {
            field5607 = 79;
        }
        if (~class639.field9075.field6773 != -1 && ~arg4 != -1 && class309.field3825 < 50 && ~arg2 != 0) {
            class89.field891[class309.field3825++] = new class340((byte) 1, arg2, arg4, arg3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5602 = null;
        int var1 = 118 % ((13 - arg0) / 63);
        field5612 = null;
    }
}

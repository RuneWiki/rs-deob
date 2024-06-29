import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class96 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lea;")
    public static class38 field2157 = class9.method46((byte) 119, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lea;")
    public static class38 field2153 = class9.method46((byte) 115, "compass");

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lea;")
    public static class38 field2161 = class9.method46((byte) 104, ":tradereq:");

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
    public static int[] field2163 = new int[2048];

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "[[S")
    public static short[][] field2162 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lob;")
    public static class127 field2150;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ldd;")
    public static class32 field2154;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field2151;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILea;)I")
    public static final int method799(int arg0, class38 arg1) {
        field2156++;
        if (class158.field3317 == 1) {
            return 7;
        } else if (arg1.method269(class130.field2782, arg0 ^ 0x33)) {
            return 1;
        } else if (arg1.method269(class35.field749, 52)) {
            return 1;
        } else {
            if (arg0 != 7) {
                field2161 = null;
            }
            if (arg1.method269(client.field535, 52)) {
                return 2;
            } else if (arg1.method269(class162.field3369, 52)) {
                return 2;
            } else if (arg1.method269(class12.field266, arg0 + 45)) {
                return 3;
            } else if (arg1.method269(class73.field1781, 52)) {
                return 4;
            } else if (arg1.method269(class128.field2749, 52)) {
                return 4;
            } else if (arg1.method269(class196.field3856, 52)) {
                return 5;
            } else if (arg1.method269(class3.field111, 52)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static final void method800(int arg0) {
        class202.field3980.method1083(3056);
        field2155++;
        class148.field3069.method1083(3056);
        if (arg0 != 8) {
            field2154 = null;
        }
        class103.field2317.method1083(3056);
        class167.field3441.method1083(3056);
        class140.field2928.method1083(3056);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lea;")
    public static final class38 method801(int arg0, int arg1) {
        if (arg0 != -21952) {
            method802(null, 22);
        }
        field2152++;
        return class163.method1168(-24, new class38[] { class151.method1059(arg1 >> 24 & 0xFF, (byte) -114), client.field541, class151.method1059(arg1 >> 16 & 0xFF, (byte) -114), client.field541, class151.method1059(arg1 >> 8 & 0xFF, (byte) -114), client.field541, class151.method1059(arg1 & 0xFF, (byte) -114) });
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhc;I)Lea;")
    public static final class38 method802(class66 arg0, int arg1) {
        field2149++;
        if (arg1 >= -25) {
            field2163 = null;
        }
        return class160.method1157(arg0, false, 32767);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method803(byte arg0) {
        field2157 = null;
        field2163 = null;
        field2161 = null;
        field2151 = null;
        field2154 = null;
        if (arg0 != -27) {
            method801(6, -40);
        }
        field2150 = null;
        field2162 = null;
        field2153 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Z")
    public static final boolean method804(int arg0, int arg1) {
        field2159++;
        if (arg0 > -115) {
            method802(null, 37);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }
}

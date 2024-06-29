import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class237 extends class62 {

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field4147 = 2;

    @OriginalMember(owner = "client!kk", name = "eb", descriptor = "Lsf;")
    public static class108 field4150 = class140.method973(255, "clignotant1:");

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "Lsf;")
    public static class108 field4149 = class140.method973(255, "Angreifen");

    @OriginalMember(owner = "client!kk", name = "ib", descriptor = "Z")
    public static boolean field4154 = false;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!kk", name = "fb", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!kk", name = "hb", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!kk", name = "jb", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!kk", name = "lb", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!kk", name = "nb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!kk", name = "mb", descriptor = "Li;")
    public class218 field4158;

    @OriginalMember(owner = "client!kk", name = "kb", descriptor = "[B")
    public byte[] field4156;

    @OriginalMember(owner = "client!kk", name = "gb", descriptor = "[I")
    public static int[] field4152;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I", line = 9)
    public final int method427(int arg0) {
        if (arg0 >= -83) {
            method1638(91, -90, 31, -97);
        }
        field4146++;
        return this.field986 ? 0 : 100;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 25)
    public static final void method1636(byte arg0) {
        class223.field3949.method644((byte) 109);
        field4151++;
        if (arg0 > -5) {
            method1638(-12, -79, 40, -56);
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 40)
    public static void method1637(int arg0) {
        field4150 = null;
        field4149 = null;
        int var1 = -75 / ((19 - arg0) / 44);
        field4152 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I", line = 78)
    public static final int method1638(int arg0, int arg1, int arg2, int arg3) {
        field4159++;
        if ((class166.field2980[arg1][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 < 26) {
            return -7;
        } else if (arg1 <= 0 || (class166.field2980[1][arg0][arg3] & 0x2) == 0) {
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)[B", line = 110)
    public final byte[] method433(int arg0) {
        field4148++;
        if (arg0 <= 119) {
            field4149 = (class108) null;
        }
        if (this.field986) {
            throw new RuntimeException();
        }
        return this.field4156;
    }
}

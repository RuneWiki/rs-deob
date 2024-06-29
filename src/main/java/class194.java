import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class194 implements class660 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Luw;")
    public static class208 field2701 = new class208(3, 2);

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)I")
    public static final int method1347(int arg0, boolean arg1) {
        field2697++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (!arg1) {
            field2702 = -22;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static final void method1348(boolean arg0) {
        field2699++;
        if (class778.field10629 == 0) {
            return;
        }
        try {
            if (++class497.field6377 > 2000) {
                if (class252.field3437 != null) {
                    class252.field3437.method1817(-115);
                    class252.field3437 = null;
                }
                if (class89.field1229 >= 2) {
                    class223.field3035 = -5;
                    class778.field10629 = 0;
                    return;
                }
                class185.field2596.method1602(-102);
                class778.field10629 = 1;
                class497.field6377 = 0;
                class89.field1229++;
            }
            if (class778.field10629 == 1) {
                class263.field3510 = class185.field2596.method1604((byte) -110, class740.field10014);
                class778.field10629 = 2;
            }
            if (class778.field10629 == 2) {
                if (class263.field3510.field4144 == 2) {
                    throw new IOException();
                }
                if (class263.field3510.field4144 != 1) {
                    return;
                }
                class252.field3437 = class499.method2771(121, (Socket) class263.field3510.field4142, 15000);
                class263.field3510 = null;
                class610.method3269(-115);
                class778.field10629 = 4;
            }
            if (class778.field10629 == 4) {
                if (class252.field3437.method1814(1, (byte) 117)) {
                    class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                    int var1 = class356.field4337.field3193[0] & 0xFF;
                    class223.field3035 = var1;
                    class778.field10629 = 0;
                    class252.field3437.method1817(-119);
                    class252.field3437 = null;
                }
            } else if (arg0) {
                field2701 = null;
            }
        } catch (IOException var2) {
            if (class252.field3437 != null) {
                class252.field3437.method1817(-107);
                class252.field3437 = null;
            }
            if (class89.field1229 < 2) {
                class185.field2596.method1602(-96);
                class497.field6377 = 0;
                class778.field10629 = 1;
                class89.field1229++;
            } else {
                class778.field10629 = 0;
                class223.field3035 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        field2698++;
        return arg0 >= -15 ? null : class604.field7675;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1349(int arg0) {
        if (arg0 <= 43) {
            field2702 = -41;
        }
        field2701 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
    public class194(int arg0) {
        this.field2700 = arg0;
    }
}

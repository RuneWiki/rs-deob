import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class140 extends class183 {

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Ldj;")
    public static class44 field2510 = class89.method650(255, "(R");

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "[S")
    public static short[] field2520 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field2517 = -1;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lvc;")
    public class223 field2507;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Lvc;")
    public class223 field2518;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lve;")
    public static class225 field2508;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Ldj;")
    public class44 field2509;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "Z")
    public boolean field2516;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field2506;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[S")
    public static short[] field2519;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
    public static final int method938(int arg0, int arg1, int arg2) {
        field2511++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg2 != -19608) {
            return -56;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lfj;I)Lha;")
    public static final class78 method939(class66 arg0, int arg1) {
        if (arg1 == 2) {
            field2514++;
            return new class78(arg0.method514((byte) 127), arg0.method514((byte) 103), arg0.method514((byte) 126), arg0.method514((byte) -106), arg0.method480(120), arg0.method506(arg1 ^ 0xFD));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method940(byte arg0) {
        field2508 = null;
        field2510 = null;
        field2519 = null;
        field2520 = null;
        if (arg0 != 115) {
            field2512 = 73;
        }
    }
}

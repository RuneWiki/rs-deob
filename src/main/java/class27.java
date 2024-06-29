import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class27 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public static int[] field269 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I", line = 3)
    public static final int method150(int arg0, int arg1) {
        field272++;
        if (arg1 != 4) {
            method150(68, 44);
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE1) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILofa;)V", line = 66)
    private final void method151(int arg0, int arg1, class301 arg2) {
        field276++;
        if (arg1 == 1) {
            this.field274 = arg2.method1989((byte) -86);
            this.field273 = arg2.method1987(-36);
            this.field270 = arg2.method1987(-94);
        }
        if (arg0 > -106) {
            this.method151(29, -81, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 87)
    public static void method152(int arg0) {
        if (arg0 != 0) {
            method150(-64, -108);
        }
        field269 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLofa;)V", line = 98)
    public final void method153(byte arg0, class301 arg1) {
        if (arg0 != 59) {
            this.field270 = -127;
        }
        while (true) {
            int var3 = arg1.method1987(arg0 ^ 0xFFFFFFF5);
            if (var3 == 0) {
                field271++;
                return;
            }
            this.method151(arg0 ^ 0xFFFFFFB3, var3, arg1);
        }
    }
}

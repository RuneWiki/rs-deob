import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class74 extends class389 {

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Lec;")
    public static class129 field1052 = new class129(16);

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "J")
    public static long field1067 = 0L;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "Z")
    public static boolean field1068 = false;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "[I")
    public static int[] field1049;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "[Lsg;")
    public static class226[] field1066;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(II)V", line = 4)
    public static final void method549(int arg0, int arg1) {
        if (arg0 < -100) {
            class35.field544.method901(arg1, 12223);
            ++field1050;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 18)
    public static void method550(byte arg0) {
        field1052 = null;
        field1066 = null;
        field1049 = null;
        if (arg0 != 50) {
            method550((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILjava/awt/Component;Lko;I)Lir;", line = 36)
    public static final class19 method551(int arg0, int arg1, Component arg2, class294 arg3, int arg4) {
        ++field1063;
        if (~class76.field1094 == -1) {
            throw new IllegalStateException();
        } else if (~arg4 <= -1 && ~arg4 > -3) {
            if (~arg1 > -257) {
                arg1 = 256;
            }
            try {
                class19 var5 = (class19) Class.forName("vn").newInstance();
                var5.field366 = arg1;
                var5.field336 = new int[256 * (!class247.field3492 ? 1 : 2)];
                var5.method261(arg2);
                var5.field355 = (arg1 & -1024) + 1024;
                if (var5.field355 > 16384) {
                    var5.field355 = 16384;
                }
                var5.method270(var5.field355);
                if (~class149.field2117 < -1 && class272.field3767 == null) {
                    class272.field3767 = new class229();
                    class272.field3767.field3333 = arg3;
                    arg3.method1916((byte) -63, class149.field2117, class272.field3767);
                }
                if (class272.field3767 != null) {
                    if (class272.field3767.field3328[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class272.field3767.field3328[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg0 <= 58) {
                    return null;
                } else {
                    try {
                        class236 var6 = new class236(arg3, arg4);
                        var6.field366 = arg1;
                        var6.field336 = new int[256 * (class247.field3492 ? 2 : 1)];
                        var6.method261(arg2);
                        var6.field355 = 16384;
                        var6.method270(var6.field355);
                        if (~class149.field2117 < -1 && class272.field3767 == null) {
                            class272.field3767 = new class229();
                            class272.field3767.field3333 = arg3;
                            arg3.method1916((byte) -63, class149.field2117, class272.field3767);
                        }
                        if (class272.field3767 != null) {
                            if (class272.field3767.field3328[arg4] != null) {
                                throw new IllegalArgumentException();
                            }
                            class272.field3767.field3328[arg4] = var6;
                        }
                        return var6;
                    } catch (Throwable var7) {
                        return new class19();
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V", line = 124)
    public final void method552(int arg0, int arg1, int arg2) {
        if (arg0 == 32546) {
            ++field1060;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 135)
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1059 = arg6;
        this.field1057 = arg0;
        this.field1055 = arg4;
        this.field1056 = arg2;
        this.field1062 = arg7;
        this.field1064 = arg5;
        this.field1053 = arg1;
        this.field1051 = arg3;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(III)V", line = 151)
    public final void method553(int arg0, int arg1, int arg2) {
        ++field1054;
        int var4 = -39 % ((arg0 - -24) / 35);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V", line = 163)
    public final void method554(int arg0, boolean arg1, int arg2) {
        ++field1058;
        if (arg1) {
            int var4 = this.field1057 * arg2 >> 12;
            int var5 = this.field1053 * arg0 >> 12;
            int var6 = this.field1056 * arg2 >> 12;
            int var7 = this.field1051 * arg0 >> 12;
            int var8 = this.field1055 * arg2 >> 12;
            int var9 = this.field1064 * arg0 >> 12;
            int var10 = this.field1059 * arg2 >> 12;
            int var11 = this.field1062 * arg0 >> 12;
            class139.method956(var7, var6, var5, super.field5582, (byte) -19, var4, var9, var10, var8, var11);
        }
    }
}

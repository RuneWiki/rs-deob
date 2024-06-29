import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class38 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[[[I")
    public static int[][][] field923;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIILab;)V")
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class3 arg7) {
        field922++;
        if (arg5 >= 0 && arg5 < 104 && arg0 >= 0 && arg0 < 104) {
            class49.field1194[arg4][arg5][arg0] = 0;
            while (true) {
                int var8 = arg7.method64(31790);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class81.field1948[0][arg5][arg0] = -class199.method1298((byte) -68, arg0 + arg3 + 556238, arg5 + 932731 - -arg2) * 8;
                    } else {
                        class81.field1948[arg4][arg5][arg0] = class81.field1948[arg4 - 1][arg5][arg0] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg7.method64(31790);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class81.field1948[0][arg5][arg0] = -var9 * 8;
                    } else {
                        class81.field1948[arg4][arg5][arg0] = class81.field1948[arg4 - 1][arg5][arg0] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class177.field3632[arg4][arg5][arg0] = arg7.method73((byte) 29);
                    class40.field939[arg4][arg5][arg0] = (byte) ((var8 - 2) / 4);
                    class18.field426[arg4][arg5][arg0] = (byte) class110.method881(var8 + arg1 - 2, 3);
                } else if (var8 <= 81) {
                    class49.field1194[arg4][arg5][arg0] = (byte) (var8 - 49);
                } else {
                    class127.field2808[arg4][arg5][arg0] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg7.method64(31790);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg7.method64(31790);
                    break;
                }
                if (var10 <= 49) {
                    arg7.method64(31790);
                }
            }
        }
        if (arg6 != 4) {
            method360(-33);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method360(int arg0) {
        field923 = null;
        if (arg0 != -1) {
            method359(80, -79, -47, 9, 28, -107, 83, null);
        }
    }
}

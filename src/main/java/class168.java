import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class168 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Loh;")
    private static class263 field3098 = class253.method1681(-122, "K");

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Loh;")
    public static class263 field3096 = field3098;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Loh;")
    public static class263 field3101 = class253.method1681(-118, " loggt sich aus)3");

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Loh;")
    public static class263 field3099 = field3098;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3097++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var9 != 0) {
            int var13 = class270.field4769[var9];
            var10 = -arg2 * var13 >> 16;
            int var14 = class270.field4762[var9];
            var12 = arg2 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class270.field4769[var8];
            int var16 = class270.field4762[var8];
            var11 = var12 * var15 >> 16;
            var12 = var12 * var16 >> 16;
        }
        class73.field1528 = arg0;
        class87.field1750 = arg3 - var10;
        class127.field2357 = arg5 - var11;
        class215.field3816 = arg4;
        class152.field2738 = arg6 - var12;
        if (arg7 != -126) {
            field3096 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1113(byte arg0) {
        field3095++;
        class122.field2258.method830(50);
        class93.field1835.method830(50);
        if (arg0 > -44) {
            field3101 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lbi;III)V")
    public static final void method1114(class90 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4694 == arg2 && arg2 != -1) {
            class240 var4 = class186.method1226(12828, arg2);
            int var5 = var4.field4193;
            if (var5 == 1) {
                arg0.field4668 = 0;
                arg0.field4718 = 0;
                arg0.field4717 = 0;
                arg0.field4662 = arg3;
                class219.method1490(false, arg0.field4705, arg0.field4718, -64, var4, arg0.field4688);
            }
            if (var5 == 2) {
                arg0.field4668 = 0;
            }
        } else if (arg2 == -1 || arg0.field4694 == -1 || class186.method1226(12828, arg2).field4203 >= class186.method1226(12828, arg0.field4694).field4203) {
            arg0.field4662 = arg3;
            arg0.field4718 = 0;
            arg0.field4668 = 0;
            arg0.field4658 = arg0.field4711;
            arg0.field4694 = arg2;
            arg0.field4717 = 0;
            if (arg0.field4694 != -1) {
                class219.method1490(false, arg0.field4705, arg0.field4718, -64, class186.method1226(12828, arg0.field4694), arg0.field4688);
            }
        }
        int var6 = 14 % ((arg1 + 31) / 59);
        field3094++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lpc;IIII)V")
    public static final void method1115(class21 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3100++;
        if (class159.field2900 >= 3) {
            class133.method879(arg2, arg3, 0, arg0.field543, arg0.field512);
        } else {
            ((class140) class200.field3617).method928(arg2, arg3, arg0.field539, arg0.field479, class200.field3617.field2585 / 2, class200.field3617.field2583 / 2, class241.field4230, 256, arg0.field543, arg0.field512);
        }
        class183.field3317[arg1] = true;
        if (arg4 != 256) {
            field3101 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field3098 = null;
        if (arg0 != 0) {
            method1114((class90) null, 67, -113, -41);
        }
        field3096 = null;
        field3101 = null;
        field3099 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BIIII)V")
    public static final void method1117(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= arg1) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class38.field870[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class38.field870[var6][arg3] = arg4;
            }
        }
        field3102++;
        if (arg0 > -42) {
            method1117((byte) 51, 58, -113, 70, 39);
        }
    }
}

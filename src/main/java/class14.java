import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class14 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "J")
    public static long field214 = 0L;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lda;")
    private static class275 field220 = class255.method1672(96, "Loaded update list");

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[I")
    public static int[] field222 = new int[32];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lda;")
    public static class275 field225 = class255.method1672(113, "Fertigkeit: ");

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lda;")
    public static class275 field224 = field220;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lda;")
    private static class275 field217 = class255.method1672(120, "Loading title screen )2 ");

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lda;")
    public static class275 field221 = field217;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method66(int arg0, int arg1) {
        field226++;
        if (arg0 == 37) {
            class199.field3397 = 3.0F;
        } else if (arg0 == 50) {
            class199.field3397 = 4.0F;
        } else if (arg0 == 75) {
            class199.field3397 = 6.0F;
        } else {
            class199.field3397 = 8.0F;
        }
        if (arg1 < -27) {
            class51.field842 = -1;
            class51.field842 = -1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLij;)Lsj;")
    public static final class185 method67(byte arg0, class85 arg1) {
        if (arg0 != -63) {
            method66(2, 95);
        }
        field219++;
        return new class185(arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method598(90), arg1.method598(78), arg1.method564((byte) 52));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method68(byte arg0) {
        field225 = null;
        field224 = null;
        field220 = null;
        field221 = null;
        field222 = null;
        field217 = null;
        if (arg0 >= -59) {
            field214 = 62L;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 < 91) {
            field215 = 32;
        }
        field213++;
        if (class267.method1755(0, arg3)) {
            client.method631(class173.field3005[arg3], -1, arg5, arg7, arg0, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static final void method70(byte arg0) {
        int var1 = 0;
        field216++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class151.method1069(class235.field4101, var1, var3, true, -94, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 > -88) {
            method67((byte) -7, (class85) null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Ls;")
    public static final class94 method71(boolean arg0, int arg1) {
        field223++;
        class94 var2 = (class94) class143.field2511.method990((long) arg1, (byte) -108);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            method67((byte) -8, (class85) null);
        }
        byte[] var3 = class48.field808.method775(class150.method1065(arg1, -115), class178.method1201(arg1, -5995), -24799);
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method675(27579, new class85(var3));
        }
        class143.field2511.method986(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILwb;IIILfd;I)V")
    public static final void method72(int arg0, class179 arg1, int arg2, int arg3, int arg4, class229 arg5, int arg6) {
        field218++;
        if (arg1 == null) {
            return;
        }
        int var7 = class218.field3699 + class169.field2938 & 0x7FF;
        int var8 = Math.max(arg5.field3885 / 2, arg5.field3980 / 2) + 10;
        if (arg4 != 75) {
            return;
        }
        int var9 = arg2 * arg2 + arg3 * arg3;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class223.field3760[var7];
        int var11 = class223.field3769[var7];
        int var12 = var11 * 256 / (class188.field3254 + 256);
        int var13 = var10 * 256 / (class188.field3254 + 256);
        int var14 = arg2 * var12 + (arg3 * var13) >> 16;
        int var15 = arg2 * var13 - arg3 * var12 >> 16;
        ((class259) arg1).method1691(arg5.field3885 / 2 + arg0 + var14 - (arg1.field3080 / 2), -var15 + arg6 - -(arg5.field3980 / 2) + -(arg1.field3079 / 2), arg5.field3938, arg5.field3961);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class50 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lai;")
    private static class10 field881 = class44.method278("Malformed login packet)3", -81);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lai;")
    public static class10 field892 = field881;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public static int[] field894;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        field881 = null;
        field894 = null;
        field892 = null;
        if (arg0 != -15357) {
            method356(39, 99, -31, -4);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
    public static final void method356(int arg0, int arg1, int arg2, int arg3) {
        field878++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class186.field3556[arg3][arg0 + var4][arg2 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class186.field3556[arg3][arg0][arg2 + var5] = class186.field3556[arg3][arg0 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class186.field3556[arg3][arg0 + var6][arg2] = class186.field3556[arg3][arg0 + var6][arg2 - 1];
            }
        }
        if (arg0 > 0 && class186.field3556[arg3][arg0 - 1][arg2] != 0) {
            class186.field3556[arg3][arg0][arg2] = class186.field3556[arg3][arg0 - 1][arg2];
        } else if (arg2 > 0 && class186.field3556[arg3][arg0][arg2 - 1] != 0) {
            class186.field3556[arg3][arg0][arg2] = class186.field3556[arg3][arg0][arg2 - 1];
        } else if (arg0 > 0 && arg2 > 0 && class186.field3556[arg3][arg0 - 1][arg2 - 1] != 0) {
            class186.field3556[arg3][arg0][arg2] = class186.field3556[arg3][arg0 - 1][arg2 - 1];
        }
        int var7 = -49 % ((arg1 - 26) / 58);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
    public static final void method357(boolean arg0, int arg1) {
        class141.field2655 = arg1;
        field893++;
        if (!arg0) {
            field894 = null;
        }
    }
}

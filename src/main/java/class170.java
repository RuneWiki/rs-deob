import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class170 extends class260 {

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field3115 = 0;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[[I")
    public static int[][] field3119 = new int[5][5000];

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Loh;")
    public static class263 field3122 = class253.method1681(-126, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1122(int arg0) {
        if (arg0 == 1) {
            field3119 = null;
            field3122 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class170() {
        this(0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)I")
    public static final int method1123(int arg0, int arg1, byte arg2) {
        ++field3113;
        if (arg2 != -123) {
            field3119 = null;
        }
        int var3 = class223.method1520(arg0 + -1, arg1 + -1, arg2 ^ -126) + class223.method1520(arg0 - -1, arg1 + -1, 7) + class223.method1520(arg0 - 1, arg1 + 1, 7) + class223.method1520(arg0 + 1, arg1 + 1, 7);
        int var4 = class223.method1520(arg0 + -1, arg1, 7) - (-class223.method1520(arg0 + 1, arg1, arg2 ^ -126) - class223.method1520(arg0, arg1 + -1, arg2 + 130) - class223.method1520(arg0, arg1 + 1, arg2 ^ -126));
        int var5 = class223.method1520(arg0, arg1, 7);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V")
    private final void method1124(int arg0, int arg1) {
        if (arg0 == 8) {
            ++field3117;
            this.field3118 = arg1 >> 4 & 4080;
            this.field3116 = (arg1 & 255) << 4;
            this.field3120 = (16711680 & arg1) >> 12;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field3114;
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; class49.field1052 > var7; ++var7) {
                var5[var7] = this.field3120;
                var4[var7] = this.field3118;
                var6[var7] = this.field3116;
            }
        }
        if (arg1 != 5) {
            this.field3116 = -49;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
    private class170(int arg0) {
        super(0, false);
        this.method1124(8, arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIIZ)Lw;")
    public static final class141 method1125(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        ++field3112;
        if (!arg5) {
            method1125(-43, 47, false, 52, -123, true);
        }
        int var7 = (arg1 << 17) + arg0 - (-(arg2 ? 65536 : 0) + -(arg4 << 19));
        long var8 = (long) arg3 * 3147483667L - -((long) var7 * 3849834839L);
        class141 var10 = (class141) class92.field1818.method828(0, var8);
        if (var10 != null) {
            return var10;
        } else {
            class270.field4768 = false;
            class141 var11 = class85.method567(arg4, arg1, false, !arg5, arg3, arg0, arg2, false);
            if (var11 != null && !class270.field4768) {
                class92.field1818.method826(var8, 9815, var11);
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            this.method1124(8, arg2.method1277((byte) -107));
        }
        if (arg1 == 5701) {
            ++field3121;
        }
    }
}

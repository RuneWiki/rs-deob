import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class244 extends class310 {

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[I")
    public static int[] field3617 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field3612 = -1;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field3616 = -2;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "Lmi;")
    public static class421 field3614 = new class421(0, 0);

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lvq;")
    public static class24 field3619 = new class24(76, 10);

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[Ljg;")
    public static class281[] field3620 = new class281[16];

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "[Lmg;")
    public static class429[] field3613;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field3615;
        int[][] var3 = super.field2967.method1572(121, arg0);
        if (arg1 < 94) {
            method1631(3);
        }
        if (super.field2967.field3454 && this.method2063(32173)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4570 * super.field4570;
            for (int var8 = 0; class202.field2852 > var8; ++var8) {
                int var9 = super.field4568[var8 % super.field4565 + var7];
                var6[var8] = class386.method2438(var9, 255) << 4;
                var5[var8] = class386.method2438(var9 >> 4, 4080);
                var4[var8] = class386.method2438(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V")
    public static void method1631(int arg0) {
        field3619 = null;
        field3614 = null;
        field3620 = null;
        field3617 = null;
        field3613 = null;
        if (arg0 != -293953721) {
            field3620 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 32) {
            field3616 = 69;
        }
        ++field3611;
        for (class28 var7 = (class28) class134.field1839.method2026(100); var7 != null; var7 = (class28) class134.field1839.method2022(10)) {
            if (class388.field5665 >= var7.field389) {
                var7.method2611(-1);
            } else {
                class189.method1289(arg2, 0, (var7.field400 << 7) + 64, (var7.field397 << 7) - -64, var7.field392 * 2, var7.field403, arg5, arg3 >> 1, arg4 >> 1);
                class111.field1540.method576(-16777216 | var7.field391, class18.field296[1] + arg1, var7.field394, true, 0, class18.field296[0] + arg0);
            }
        }
    }
}

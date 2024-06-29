import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class266 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3869 = "glow3:";

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lhi;")
    public static class192 field3871 = new class192();

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field3879 = -1;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3880 = null;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "J")
    public static long field3881 = 0L;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Llb;")
    public static class64 field3882 = new class64();

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lkm;")
    public static class133 field3868;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lkm;")
    public static class133 field3876;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lin;")
    public static class344 field3865;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/awt/Font;")
    public static Font field3875;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[[B")
    public static byte[][] field3883;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1805(int arg0) {
        class306.field4589.method724(0);
        if (arg0 > -16) {
            field3872 = 18;
        }
        field3878++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class101.field1397 <= arg4 && class44.field536 >= arg4) {
            int var5 = class185.method1299(arg0, (byte) 114, class259.field3813, class206.field2952);
            int var6 = class185.method1299(arg2, (byte) 116, class259.field3813, class206.field2952);
            class332.method2311((byte) 28, var5, arg3, arg4, var6);
        }
        if (arg1 == 0) {
            field3873++;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BZ)C", line = 40)
    public static final char method1807(byte arg0, boolean arg1) {
        if (!arg1) {
            field3879 = -39;
        }
        field3874++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class304.field4570[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLwa;)[Lkj;", line = 70)
    public static final class31[] method1808(byte arg0, class80 arg1) {
        field3870++;
        if (!arg1.method624(true)) {
            return new class31[0];
        }
        class285 var2 = arg1.method626((byte) 99);
        while (var2.field4241 == 0) {
            class186.method1304(arg0 ^ 0xFFFFFF90, 10L);
        }
        if (var2.field4241 == 2) {
            return new class31[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field4244);
        class31[] var4 = new class31[var3.length >> 2];
        if (arg0 != -102) {
            field3876 = (class133) null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class31 var6 = new class31();
            var4[var5] = var6;
            var6.field383 = var3[var5 << 2];
            var6.field375 = var3[(var5 << 2) + 1];
            var6.field386 = var3[(var5 << 2) + 2];
            var6.field373 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 112)
    public static void method1809(byte arg0) {
        field3868 = null;
        field3869 = null;
        field3880 = null;
        field3882 = null;
        field3883 = (byte[][]) null;
        field3876 = null;
        field3865 = null;
        field3871 = null;
        field3875 = null;
        if (arg0 != 42) {
            field3872 = -101;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V", line = 132)
    public static final void method1810(int arg0, int arg1, int arg2) {
        if (arg1 != -19014) {
            return;
        }
        field3877++;
        class273.field4083[arg2] = arg0;
        class276 var3 = (class276) class7.field59.method111(-18, (long) arg2);
        if (var3 == null) {
            class276 var4 = new class276(4611686018427387905L);
            class7.field59.method120((long) arg2, var4, -22851);
        } else if (var3.field4136 != 4611686018427387905L) {
            var3.field4136 = class29.method174(27763) + 500L | 0x4000000000000000L;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class176 extends class207 {

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3189 = -1;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Ljd;")
    public static class86 field3195 = class122.method868("blaugr-Un:", true);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[I")
    public int[] field3191;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
    public int[] field3194;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
    public int[] field3196;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[Lwb;")
    public class26[] field3197;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[Lwb;")
    public class26[] field3201;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[S")
    public static short[] field3188;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[[[B")
    public byte[][][] field3192;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public static final void method1241(int arg0, int arg1) {
        int var2 = -78 % ((7 - arg1) / 44);
        class215.field3880.method693(6, arg0);
        field3199++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZZI)V")
    public static final void method1242(int arg0, boolean arg1, boolean arg2, int arg3) {
        field3193++;
        if (arg2) {
            field3188 = null;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class171.field3159 = arg0;
        class65.field1277 = arg3;
        class24.field590 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        field3195 = null;
        int var1 = -16 / ((20 - arg0) / 42);
        field3188 = null;
    }
}

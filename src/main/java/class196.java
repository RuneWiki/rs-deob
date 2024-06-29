import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class196 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field3878 = 0;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
    public static boolean field3874 = false;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field3877 = 0;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Lsd;")
    public static class166 field3883 = class135.method935("Benutzen", 0);

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lsd;")
    public static class166 field3891 = class135.method935("", 0);

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[Lsd;")
    public static class166[] field3901 = new class166[8];

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Lsd;")
    public static class166 field3895 = field3891;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
    public static int[] field3896;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
    public static int[] field3898;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "[Lre;")
    public static class158[] field3904;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[[B")
    public static byte[][] field3876;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        field3876 = null;
        field3891 = null;
        field3895 = null;
        field3898 = null;
        field3901 = null;
        int var1 = -95 % ((-arg0 - 20) / 40);
        field3904 = null;
        field3896 = null;
        field3883 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method1303(int arg0) {
        for (int var1 = 0; var1 < class206.field4058; var1++) {
            int var3 = class2.field11[var1];
            class123 var4 = class182.field3451[var3];
            int var5 = class179.field3377.method400(255);
            if ((var5 & 0x40) != 0) {
                var5 += class179.field3377.method400(255) << 8;
            }
            class69.method562((byte) -105, var4, var5, var3);
        }
        int var2 = -66 % ((arg0 + 45) / 48);
        field3880++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lf;IZI)[Lre;")
    public static final class158[] method1304(class47 arg0, int arg1, boolean arg2, int arg3) {
        field3890++;
        if (class146.method1003(arg3, arg1, arg0, !arg2)) {
            return arg2 ? class46.method347(61) : null;
        } else {
            return null;
        }
    }
}

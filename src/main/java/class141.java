import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class141 extends class264 {

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "Lma;")
    public static class5 field2074 = class12.method119("(Y", (byte) 111);

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "Z")
    public static boolean field2077 = false;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "[[B")
    public static byte[][] field2070 = new byte[250][];

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "[I")
    public static int[] field2072 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eh", name = "sb", descriptor = "Luj;")
    public static class149 field2082 = new class149(0, 0);

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!eh", name = "ob", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!eh", name = "pb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!eh", name = "tb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!eh", name = "qb", descriptor = "[Lb;")
    public static class129[] field2080;

    @OriginalMember(owner = "client!eh", name = "rb", descriptor = "[[[B")
    public static byte[][][] field2081;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "[[[S")
    public static short[][][] field2076;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)[F", line = 15)
    public static final float[] method905(boolean arg0) {
        field2078++;
        float var1 = class293.method1969() + class293.method1973();
        if (arg0) {
            method906(59, 7);
        }
        int var2 = class293.method1976();
        class237.field3920[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFFCEB9) >> 16) / 255.0F;
        float var4 = (float) ((var2 & 0xFF20) >> 8) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class237.field3920[0] = class236.field3899[0] * var3 * var6 * var1;
        class237.field3920[1] = class236.field3899[1] * var4 * var6 * var1;
        class237.field3920[2] = class236.field3899[2] * var5 * var6 * var1;
        return class237.field3920;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V", line = 53)
    public static final void method906(int arg0, int arg1) {
        int var2 = -28 % ((arg1 - 37) / 35);
        class281.field4761 = new int[arg0];
        field2071++;
        class275.field4687 = new int[arg0];
        class257.field4395 = new int[arg0];
        class29.field478 = new int[arg0];
        class209.field3313 = new int[arg0];
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I", line = 71)
    public final int[] method5(int arg0, int arg1) {
        field2069++;
        if (arg0 >= -58) {
            field2072 = (int[]) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            class42.method292(var3, 0, class226.field3716, class116.field1726[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 106)
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V", line = 117)
    public static void method907(int arg0) {
        field2080 = null;
        field2081 = (byte[][][]) null;
        field2074 = null;
        if (arg0 < 76) {
            field2077 = true;
        }
        field2070 = (byte[][]) null;
        field2072 = null;
        field2082 = null;
        field2076 = (short[][][]) null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lni;III)[Lfi;", line = 134)
    public static final class222[] method908(class202 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field2083++;
            return class180.method1171(arg3, arg1, arg0, (byte) -128) ? class172.method1142((byte) 32) : null;
        } else {
            return (class222[]) null;
        }
    }
}

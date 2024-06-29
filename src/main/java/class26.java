import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class class26 {

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Ll;")
    public static class21 field315 = class28.method185(-20839, "Cooking Range");

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "[J")
    public static long[] field313 = new long[32];

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[[B")
    public static byte[][] field314 = new byte[1000][];

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public static volatile int field319 = 0;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Ll;")
    public static class21 field316 = class28.method185(-20839, "Potters Wheel");

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "I")
    public static volatile int field318 = 0;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Ll;")
    public static class21 field317 = class28.method185(-20839, "Mining Shop");

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)[Lf;", line = 9)
    public static final Pix24[] method174(byte arg0) {
        Pix24[] var1 = new Pix24[class21.field203];
        if (arg0 != 96) {
            return (Pix24[]) null;
        }
        for (int var2 = 0; var2 < class21.field203; var2++) {
            Pix24 var3 = var1[var2] = new Pix24();
            var3.field65 = class6.field48;
            var3.field66 = class30.field357;
            var3.field67 = class30.field355[var2];
            var3.field68 = class29.field344[var2];
            var3.field64 = class2.field12[var2];
            var3.field63 = class18.field161[var2];
            int var4 = var3.field64 * var3.field63;
            byte[] var5 = class31.field359[var2];
            var3.pixels = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.pixels[var6] = class34.field389[PixMap.method140(var5[var6], 255)];
            }
        }
        class29.method188(true);
        return var1;
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(I)V", line = 102)
    public static void method175(int arg0) {
        field315 = null;
        field314 = null;
        field317 = null;
        field313 = null;
        field316 = null;
        if (arg0 != 0) {
            method174((byte) -85);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)I")
    public abstract int method30(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V")
    public abstract void method32(int arg0);
}

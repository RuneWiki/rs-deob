import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 extends class25 {

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "Ls;")
    public static class34 field380 = class9.method35("Loading )3)3)3", 220);

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Ls;")
    public static class34 field384 = class9.method35("Key", 220);

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "I")
    public static int field385 = -1;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "I")
    public static volatile int field381 = 0;

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "[I")
    public static int[] field386 = new int[128];

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "Lia;")
    public static class18 field382;

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "[I")
    public static int[] field383;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BII[B)I", line = 23)
    public static final int method187(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = 112 / ((-arg0 - 20) / 57);
        int var5 = -1;
        for (int var6 = arg1; var6 < arg2; var6++) {
            var5 = class22.field223[(arg3[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ls;Ls;Lda;I)[Lba;", line = 52)
    public static final class4[] method188(class34 arg0, class34 arg1, class8 arg2, int arg3) {
        if (arg3 >= -106) {
            field386 = null;
        }
        int var4 = arg2.method32(arg0, -1);
        int var5 = arg2.method21((byte) -128, arg1, var4);
        return class3.method7(var4, -40, var5, arg2);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 67)
    public static void method189(byte arg0) {
        field382 = null;
        field380 = null;
        field384 = null;
        field383 = null;
        if (arg0 != -22) {
            field386 = null;
        }
        field386 = null;
    }
}

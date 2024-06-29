import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lfc;")
    public static class34 field672 = new class34();

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lv;")
    public static class122 field677 = class55.method425(-69, "p12_full");

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lv;")
    private static class122 field681 = class55.method425(-103, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lv;")
    private static class122 field684 = class55.method425(-121, "Loading sprites )2 ");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lv;")
    public static class122 field679 = field681;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[I")
    public static int[] field682 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lv;")
    public static class122 field688 = field684;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "J")
    public static long field673;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lmb;")
    public static class74 field686;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
    public static boolean field685;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public static int[] field687;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[[[B")
    public static byte[][][] field678;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILmb;)V", line = 14)
    public static final void method258(int arg0, class74 arg1) {
        field671++;
        class8.field182 = arg1;
        if (arg0 >= 55) {
            class66.field1701 = class8.field182.method601(-112, 16);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[Lv;I)Lv;", line = 32)
    public static final class122 method259(int arg0, int arg1, class122[] arg2, int arg3) {
        field674++;
        if (arg0 != -32637) {
            return null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class129.field3129;
            }
            var4 += arg2[arg1 + var5].field2971;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class122 var10 = arg2[arg1 + var8];
            class27.method268(var10.field2923, 0, var6, var7, var10.field2971);
            var7 += var10.field2971;
        }
        class122 var9 = new class122();
        var9.field2923 = var6;
        var9.field2971 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lv;", line = 83)
    public static final class122 method260(byte arg0, int arg1) {
        field675++;
        int var2 = -68 / ((arg0 + 71) / 40);
        return class59.method454(new class122[] { class119.method914(arg1 >> 24 & 0xFF, 10), class126.field3065, class119.method914(arg1 >> 16 & 0xFF, 10), class126.field3065, class119.method914(arg1 >> 8 & 0xFF, 10), class126.field3065, class119.method914(arg1 & 0xFF, 10) }, 5176);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 99)
    public static void method261(int arg0) {
        field678 = null;
        field686 = null;
        field688 = null;
        field679 = null;
        field687 = null;
        if (arg0 < 97) {
            method260((byte) 85, 95);
        }
        field672 = null;
        field677 = null;
        field681 = null;
        field684 = null;
        field682 = null;
    }
}

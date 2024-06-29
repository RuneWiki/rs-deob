import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class184 {

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lqb;")
    public static class209 field3177 = new class209(100);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "J")
    public long field3172;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lrk;")
    public class255 field3170;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lrk;")
    public class255 field3173;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lrk;")
    public class255 field3176;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lnh;")
    public static class73 field3182;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[[I")
    public static int[][] field3180;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1390(boolean arg0, int arg1) {
        class102.field1861 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class93.field1648 = new int[var2][105][105];
        class274.field4559 = new byte[var2][arg1][104];
        class302.field5075 = new byte[var2][104][104];
        class142.field2543 = 99;
        class317.field5341 = new byte[var2][105][105];
        field3179++;
        class135.field2418 = new byte[var2][104][104];
        class129.field2337 = new int[104];
        class311.field5211 = new byte[var2][104][104];
        class297.field4977 = new int[104];
        class138.field2467 = new int[104];
        class289.field4860 = new int[104];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILda;)V", line = 30)
    public static final void method1391(int arg0, class143 arg1) {
        class104.field1870 = arg1.method1136(class264.field4404, 63);
        if (arg0 != 104) {
            method1391(121, (class143) null);
        }
        field3168++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lda;Lda;I)V", line = 43)
    public static final void method1392(class143 arg0, class143 arg1, int arg2) {
        class212.field3561 = arg0;
        field3167++;
        if (arg2 < -102) {
            class230.field3842 = arg1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 59)
    public static void method1393(byte arg0) {
        field3182 = null;
        field3177 = null;
        if (arg0 > -107) {
            field3177 = (class209) null;
        }
        field3180 = (int[][]) null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lda;ILbd;)Ld;", line = 74)
    public static final class32 method1394(class143 arg0, int arg1, class162 arg2) {
        int var3 = arg0.method1136(arg2, 63);
        if (arg1 != 104) {
            method1394((class143) null, -91, (class162) null);
        }
        field3166++;
        if (var3 == -1) {
            return new class32(0);
        }
        int[] var4 = arg0.method1149(var3, (byte) 110);
        class32 var5 = new class32(var4.length);
        for (int var6 = 0; var6 < var5.field536; var6++) {
            class94 var7 = new class94(arg0.method1128(var4[var6], arg1 ^ 0x68, var3));
            var5.field534[var6] = var7.method744((byte) 82);
            var5.field538[var6] = var7.method719((byte) -42);
            var5.field531[var6] = (short) var7.method761((byte) 108);
            var5.field535[var6] = (short) var7.method761((byte) 108);
            var5.field528[var6] = var7.method747(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 114)
    public static final void method1395(int arg0) {
        field3169++;
        if (!class293.field4930) {
            return;
        }
        class137.field2444 = null;
        if (arg0 != 104) {
            method1391(53, (class143) null);
        }
        class97.field1766 = null;
        class293.field4930 = false;
    }
}

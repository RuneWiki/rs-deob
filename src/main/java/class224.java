import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class224 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field3423 = -1;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field3424 = -1;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lii;")
    public static class250 field3418 = new class250(16);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lec;")
    public static class99 field3428 = new class99(16);

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lml;")
    public class172 field3416;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lrj;")
    public static class269 field3429;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3427;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
    public int[] field3420;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field3421;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1595(int arg0, int arg1) {
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = -94 / ((-arg1 - 70) / 49);
        int var5 = var3 | var3 >>> 2;
        field3417++;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 26)
    public static void method1596(int arg0) {
        field3427 = null;
        if (arg0 > 121) {
            field3428 = null;
            field3429 = null;
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)[Laf;", line = 40)
    public static final class195[] method1597(int arg0) {
        if (arg0 < 94) {
            field3424 = 1;
        }
        field3422++;
        class195[] var1 = new class195[class131.field2005];
        for (int var2 = 0; var2 < class131.field2005; var2++) {
            byte[] var3 = class220.field3362[var2];
            int var4 = class209.field3191[var2] * class133.field2028[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class82.field1212[class149.method1117(255, var3[var6])];
            }
            var1[var2] = new class195(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var5);
        }
        class245.method1684(255);
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V", line = 76)
    public static final void method1598(int arg0, byte arg1) {
        class94.field1330.method741(arg0, (byte) 115);
        if (arg1 <= -111) {
            field3419++;
            class94.field1331.method741(arg0, (byte) 116);
            class320.field4941.method741(arg0, (byte) 115);
            class251.field3785.method741(arg0, (byte) -38);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V", line = 98)
    public static final void method1599(int arg0, int arg1) {
        class188 var2 = class147.method1111(arg0 - 32, arg1, 11);
        if (arg0 != 0) {
            field3426 = -108;
        }
        var2.method1393((byte) -124);
        field3415++;
    }
}

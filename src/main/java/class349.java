import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class349 extends class126 {

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field4797 = 0;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "Z")
    public static boolean field4802 = false;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "[I")
    public static int[] field4801 = new int[4096];

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field4806;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "Lsg;")
    public static class226 field4805;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "Lbo;")
    public static class435 field4799;

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field4801[var0] = class70.method536(var0, false);
        }
        field4806 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 3)
    public static final int method2217(String arg0, byte arg1) {
        ++field4807;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~class272.field3777 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class288.field4045[var2])) {
                    return var2;
                }
            }
            int var3 = 54 / ((arg1 - 68) / 33);
            return -1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I", line = 30)
    public final int[][] method222(int arg0, int arg1) {
        ++field4798;
        if (arg0 != -27832) {
            return null;
        } else {
            int[][] var3 = super.field256.method1930(arg1, (byte) 88);
            if (super.field256.field4154 && this.method857(arg0 ^ 27831)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field1767 * super.field1767;
                for (int var8 = 0; var8 < class269.field3751; ++var8) {
                    int var9 = super.field1769[var8 % super.field1763 + var7];
                    var6[var8] = class387.method2454(var9, 255) << 4;
                    var5[var8] = class387.method2454(4080, var9 >> 4);
                    var4[var8] = class387.method2454(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 77)
    public static void method2218(int arg0) {
        if (arg0 != 1) {
            field4806 = null;
        }
        field4805 = null;
        field4806 = null;
        field4801 = null;
        field4799 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(JI)V", line = 104)
    public static final void method2219(long arg0, int arg1) {
        ++field4803;
        if (arg1 < -15) {
            if (~arg0 < -1L) {
                if (~(arg0 % 10L) == -1L) {
                    class254.method1693((byte) -122, arg0 - 1L);
                    class254.method1693((byte) -113, 1L);
                } else {
                    class254.method1693((byte) -88, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lkh;I)V", line = 147)
    public static final void method2220(class11 arg0, int arg1) {
        ++field4800;
        int var2 = arg0.method175(255);
        class437.field6151 = new class333[var2];
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class437.field6151[var3] = new class333();
            class437.field6151[var3].field4590 = arg0.method175(255);
            class437.field6151[var3].field4596 = arg0.method212(false);
        }
        class200.field2771 = arg0.method175(255);
        class139.field1989 = arg0.method175(255);
        class258.field3629 = arg0.method175(255);
        class452.field6308 = new class437[class139.field1989 - class200.field2771 + 1];
        if (arg1 >= -67) {
            method2219(73L, 86);
        }
        for (int var4 = 0; class258.field3629 > var4; ++var4) {
            int var5 = arg0.method175(255);
            class437 var6 = class452.field6308[var5] = new class437();
            var6.field2637 = arg0.method172((byte) 52);
            var6.field2635 = arg0.method185(25239);
            var6.field6149 = class200.field2771 + var5;
            var6.field6147 = arg0.method212(false);
            var6.field6150 = arg0.method212(false);
        }
        class188.field2601 = arg0.method185(25239);
        class327.field4481 = true;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class191 extends class276 {

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field3087 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3085 = "Loading world list data";

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3088 = null;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
    public static final void method1248(int arg0) {
        ++field3091;
        if (!class132.field2303) {
            if (!class173.field2852) {
                class158.field2659 += (-12.0F - class158.field2659) / 2.0F;
            } else {
                class195.field3151 = (float) ((int) class195.field3151 - 17 & -16);
            }
            if (arg0 <= -53) {
                class114.field2059 = true;
                class132.field2303 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field3094;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (arg0 <= 39) {
            field3084 = -5;
        }
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            for (int var5 = 0; ~var5 > ~class53.field929; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    public static void method1249(int arg0) {
        if (arg0 == 18733) {
            field3085 = null;
            field3088 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field3086;
        if (arg2 == -1) {
            if (arg0 == 0) {
                super.field4408 = ~arg1.method669((byte) 36) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            field3088 = null;
        }
        int[][] var3 = super.field4418.method835((byte) 115, arg0);
        ++field3089;
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) -119, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class53.field929; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var7[var11];
                var9[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILvh;)V")
    public static final void method1250(int arg0, class108 arg1) {
        ++field3093;
        if (arg0 != 5473) {
            method1248(71);
        }
        class198.field3202 = arg1;
    }
}

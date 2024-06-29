import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class360 extends class27 {

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    private int field5677 = -1;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Lth;")
    public static class57 field5679 = new class57(8);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Ljava/lang/String;")
    public static String field5687 = "Take";

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[I")
    public static int[] field5686 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field5688 = 0;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field5689 = 7759444;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "[I")
    public static int[] field5690 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[I")
    public int[] field5676;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I", line = 4)
    public final int method172(byte arg0) {
        field5682++;
        if (arg0 != 92) {
            this.field5676 = (int[]) null;
        }
        return this.field5677;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILsb;I)V", line = 15)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field5681++;
        if (arg0 != -5836) {
            this.field5675 = -30;
        }
        if (arg2 == 0) {
            this.field5677 = arg1.method1317((byte) 93);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 30)
    public final void method171(byte arg0) {
        field5685++;
        super.method171(arg0);
        this.field5676 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I", line = 45)
    public int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            this.method19(75, 49);
        }
        field5683++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171 && this.method2502(-799)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int var6 = (class184.field2642 == this.field5675 ? arg1 : this.field5675 * arg1 / class184.field2642) * this.field5678;
            int[] var7 = var3[0];
            if (class209.field3053 == this.field5678) {
                for (int var8 = 0; var8 < class209.field3053; var8++) {
                    int var9 = this.field5676[var6++];
                    var5[var8] = class287.method2076(4080, var9 << 4);
                    var4[var8] = class287.method2076(var9, 65280) >> 4;
                    var7[var8] = class287.method2076(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class209.field3053; var10++) {
                    int var11 = this.field5678 * var10 / class209.field3053;
                    int var12 = this.field5676[var6 + var11];
                    var5[var10] = class287.method2076(var12 << 4, 4080);
                    var4[var10] = class287.method2076(65280, var12) >> 4;
                    var7[var10] = class287.method2076(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V", line = 110)
    public static final void method2501(int arg0, int arg1) {
        field5680++;
        class326.field4898.method462(24);
        class326.field4898 = new class57(arg1);
        if (arg0 < 28) {
            field5688 = -127;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 175)
    public class360() {
        super(0, false);
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Z", line = 139)
    public final boolean method2502(int arg0) {
        field5684++;
        if (this.field5676 != null) {
            return true;
        } else if (arg0 != -799) {
            return true;
        } else if (this.field5677 >= 0) {
            class118 var2 = class110.field1594 >= 0 ? class14.method80(class240.field3565, class110.field1594, this.field5677, arg0 ^ 0x330) : class178.method1243(0, class240.field3565, this.field5677);
            var2.method883();
            this.field5675 = var2.field2553;
            this.field5676 = var2.field1665;
            this.field5678 = var2.field2536;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V", line = 183)
    public static void method2503(int arg0) {
        field5687 = null;
        field5690 = null;
        field5686 = null;
        field5679 = null;
        if (arg0 != 1) {
            method2501(-16, 92);
        }
    }
}

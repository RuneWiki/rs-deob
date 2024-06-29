import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class360 extends class5 {

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    private int field4591 = 4096;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "[I")
    public static int[] field4590;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        int var3 = -57 % ((arg0 - 81) / 36);
        ++field4586;
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1 + -1 & class669.field9431, false, 0);
            int[] var6 = this.method49(arg1, false, 0);
            int[] var7 = this.method49(arg1 - -1 & class669.field9431, false, 0);
            for (int var8 = 0; class657.field9287 > var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * this.field4591;
                int var10 = (var6[class194.field2440 & var8 + 1] + -var6[class194.field2440 & var8 + -1]) * this.field4591;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
    public class360() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Lega;")
    public static final class359 method1981(byte arg0) {
        ++field4588;
        if (arg0 != 65) {
            field4590 = null;
        }
        return class348.method1927(1, 105);
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)V")
    public static final void method1982(int arg0) {
        if (arg0 != 0) {
            field4589 = 100;
        }
        class236.field2951.method2412((byte) -43);
        ++field4582;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4591 = arg1.method3470(13111);
        }
        ++field4585;
        if (arg0 != 1) {
            this.field4591 = -69;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
    public static void method1983(byte arg0) {
        field4590 = null;
        if (arg0 != -23) {
            field4589 = 60;
        }
    }

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "(I)Z")
    public static final boolean method1984(int arg0) {
        ++field4583;
        try {
            class380 var1 = new class380();
            if (arg0 != 0) {
                return true;
            } else {
                byte[] var2 = var1.method2060(class231.field2883, arg0 ^ 5);
                class672.method3774(var2, 70);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }
}

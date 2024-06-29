import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class261 extends class99 {

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    private int field4599 = 1;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    private int field4607 = 0;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lr;")
    public static class66 field4598 = class93.method641(43, "gr-Un:");

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lr;")
    public static class66 field4605 = class93.method641(43, "Stufe)2");

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[Ljb;")
    public static class256[] field4600;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[Lpc;")
    public static class29[] field4604;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field4603;
        if (arg0 != -61) {
            this.method11((class249) null, -71, -32);
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class19.field261[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class199.field3432; ++var6) {
                int var7 = class10.field120[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4607 == 0) {
                    var9 = (var7 - var4) * this.field4599;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4599 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4601 == -1) {
                    var12 = class143.field2612[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field4601 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Lek;")
    public static final class173 method1779(int arg0, int arg1) {
        if (arg0 >= -3) {
            return null;
        } else {
            ++field4606;
            class173 var2 = (class173) class208.field3605.method1617(14366, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class101.field1974.method135(arg1, 0, 16);
                class173 var4 = new class173();
                if (var3 != null) {
                    var4.method1172(0, new class249(var3));
                }
                class208.field3605.method1615(var4, 126, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class261() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field4597;
        class49.method347((byte) 43);
        if (arg0 > -22) {
            this.method12((byte) -3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLr;)V")
    public static final void method1780(byte arg0, class66 arg1) {
        if (arg0 == 37) {
            ++field4595;
            class163.method1102((byte) 108);
            class206.method1333(0, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    public static void method1781(int arg0) {
        field4604 = null;
        int var1 = -71 % ((arg0 - -16) / 48);
        field4600 = null;
        field4605 = null;
        field4598 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field4599 = arg0.method1677(-6677);
                }
            } else {
                this.field4601 = arg0.method1677(arg2 ^ 6676);
            }
        } else {
            this.field4607 = arg0.method1677(-6677);
        }
        if (arg2 != -1) {
            this.field4599 = -82;
        }
        ++field4596;
    }
}

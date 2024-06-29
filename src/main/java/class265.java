import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class265 extends class227 {

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
    private boolean field3549 = true;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Z")
    private boolean field3555 = true;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "B")
    public static byte field3556;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3066 = ~arg0.method2388((byte) -123) == -2;
                }
            } else {
                this.field3555 = ~arg0.method2388((byte) -119) == -2;
            }
        } else {
            this.field3549 = ~arg0.method2388((byte) -111) == -2;
        }
        if (arg1 != 487215116) {
            this.method62(32, 25);
        }
        ++field3554;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field3551;
        int[] var3 = super.field3068.method1970(arg1, (byte) 23);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(!this.field3555 ? arg1 : class115.field1508 - arg1, 127, 0);
            if (this.field3549) {
                for (int var5 = 0; var5 < class446.field6486; ++var5) {
                    var3[var5] = var4[class102.field1388 - var5];
                }
            } else {
                class438.method2689(var4, 0, var3, 0, class446.field6486);
            }
        }
        return arg0 != 15811 ? null : var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field3552;
        int[][] var3 = super.field3059.method28((byte) 62, arg0);
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(!this.field3555 ? arg0 : -arg0 + class115.field1508, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3549) {
                for (int var11 = 0; ~var11 > ~class446.field6486; ++var11) {
                    var8[var11] = var5[class102.field1388 - var11];
                    var9[var11] = var6[class102.field1388 - var11];
                    var10[var11] = var7[class102.field1388 - var11];
                }
            } else {
                for (int var12 = 0; class446.field6486 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (!arg1) {
            this.method62(78, 125);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(FFFII)F")
    public static final float method1625(float arg0, float arg1, float arg2, int arg3, int arg4) {
        int var5 = 116 / ((arg4 - -26) / 39);
        ++field3550;
        float[] var6 = class55.field638[arg3];
        return var6[2] * arg2 + var6[1] * arg0 + var6[0] * arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([[II)V")
    public static final void method1626(int[][] arg0, int arg1) {
        if (arg1 != 1) {
            method1626((int[][]) null, 43);
        }
        ++field3553;
        class5.field54 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, false);
    }

    static {
        new class305("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class411 extends class377 {

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "F")
    public static float field5281;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIB)Lwv;", line = 3)
    public static final class32 method2306(int arg0, int arg1, int arg2, byte arg3) {
        ++field5279;
        class565 var4 = class407.field5237[arg0][arg2][arg1];
        if (var4 == null) {
            return null;
        } else {
            class32 var5 = null;
            int var6 = -1;
            if (arg3 != 7) {
                field5281 = 1.2993217F;
            }
            for (class436 var7 = var4.field7074; var7 != null; var7 = var7.field5485) {
                class597 var8 = var7.field5486;
                if (var8 instanceof class32) {
                    class32 var9 = (class32) var8;
                    int var10 = 252 + (var9.method210(false) + -1) * 256;
                    int var11 = -var10 + var9.field8018 >> 9;
                    int var12 = -var10 + var9.field8011 >> 9;
                    int var13 = var9.field8018 + var10 >> 9;
                    int var14 = var9.field8011 + var10 >> 9;
                    if (~var11 >= ~arg2 && ~arg1 <= ~var12 && arg2 <= var13 && arg1 <= var14) {
                        int var15 = (var14 + 1 - arg1) * (-arg2 + 1 + var13);
                        if (var15 > var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILji;)V", line = 63)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = 85 / ((arg1 - 13) / 55);
        if (~arg0 == -1) {
            this.field5280 = (arg2.method3097((byte) 12) << 12) / 255;
        }
        ++field5283;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V", line = 89)
    public class411(int arg0) {
        super(0, true);
        this.field5280 = 4096;
        this.field5280 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 104)
    public class411() {
        this(4096);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I", line = 107)
    public final int[] method88(int arg0, int arg1) {
        ++field5282;
        int[] var3 = super.field4842.method2772(arg0, (byte) -119);
        if (super.field4842.field6354) {
            class70.method558(var3, 0, class528.field6661, this.field5280);
        }
        int var4 = -125 % ((arg1 - 5) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)Z", line = 131)
    public static final boolean method2307(int arg0, int arg1) {
        if (arg1 != 8) {
            field5281 = 0.057311583F;
        }
        ++field5278;
        return ~arg0 == -8 || arg0 == 8 || ~arg0 == -10;
    }
}

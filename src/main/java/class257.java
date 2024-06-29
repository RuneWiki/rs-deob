import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class257 {

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "J")
    public long field3341;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lkd;")
    private class700 field3338;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Z")
    public static boolean field3336 = false;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field3342 = class341.method2115(27279, 1600);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Lmv;")
    public static class295 field3343;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IF[FBIIIIII)V", line = 5)
    public static final void method1536(int arg0, float arg1, float[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 <= 64) {
            return;
        }
        int var10 = arg0 - arg4;
        field3334++;
        int var11 = arg6 - arg8;
        int var12 = arg7 - arg9;
        float var13 = arg2[2] * (float) var12 + arg2[1] * (float) var11 + arg2[0] * (float) var10;
        float var14 = arg2[5] * (float) var12 + arg2[3] * (float) var10 + arg2[4] * (float) var11;
        float var15 = arg2[8] * (float) var12 + arg2[7] * (float) var11 + arg2[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg1 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class321.field4672 = var17;
        class283.field3783 = var18;
    }

    @OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() throws Throwable {
        this.field3338.method3926(this.field3341, -64);
        field3339++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)Lth;", line = 79)
    public static final class112 method1537(byte arg0, int arg1) {
        field3337++;
        int var2 = -68 / ((78 - arg0) / 34);
        class112 var3 = (class112) class90.field1380.method3901((long) arg1, -123);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class370.field5490.method1844(0, 31330, arg1);
        class112 var5 = new class112();
        if (var4 != null) {
            var5.method846(new class540(var4), 104);
        }
        var5.method844(-73);
        class90.field1380.method3894(var5, (byte) 60, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)Z", line = 106)
    public static final boolean method1538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 23) {
            field3342 = 68;
        }
        field3340++;
        if ((class317.field4622[0][arg3][arg1] & 0x2) != 0) {
            return true;
        } else if ((class317.field4622[arg4][arg3][arg1] & 0x10) == 0) {
            return class464.method2692((byte) 67, arg4, arg1, arg3) == arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 132)
    public static void method1539(int arg0) {
        if (arg0 != 32530) {
            field3336 = false;
        }
        field3343 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII)I", line = 143)
    public static final int method1540(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1613418582) {
            return 37;
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        field3335++;
        return ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lkd;J[Loh;)V", line = 169)
    public class257(class700 arg0, long arg1, class581[] arg2) {
        this.field3341 = arg1;
        this.field3338 = arg0;
    }
}

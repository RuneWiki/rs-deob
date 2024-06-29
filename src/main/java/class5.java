import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "J")
    public long field46;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Ltk;")
    private class347 field50;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[Lrl;")
    public static class724[] field49 = new class724[2048];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field54 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FI)F")
    public static final float method26(float arg0, int arg1) {
        field53++;
        if (arg1 != 10) {
            method28(35, 84, (byte) -18, 92, -69, 72, 7, 35, -66, 26);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method27(byte arg0) {
        field49 = null;
        if (arg0 < 27) {
            method27((byte) 49);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method28(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field51++;
        if (arg4 == arg7 && arg3 == arg5 && arg6 == arg9 && arg1 == arg8) {
            class114.method894(arg1, arg0, 26, arg5, arg4, arg6);
        } else {
            int var10 = arg4;
            int var11 = arg5;
            int var12 = arg4 * 3;
            int var13 = arg5 * 3;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg6 + var14 - arg4 - var16;
            int var19 = var15 + arg1 - arg5 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = arg5 + (var28 + var30 + var32 >> 12);
                class114.method894(var34, arg0, 108, var11, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg2 != -63) {
            method27((byte) 126);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ltk;JI)V")
    public class5(class347 arg0, long arg1, int arg2) {
        this.field46 = arg1;
        this.field50 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field50.method2018(this.field46, (byte) -97);
        field48++;
        super.finalize();
    }
}

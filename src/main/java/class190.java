import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class190 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Lpp;")
    public class190 field2474;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Lq;")
    public class111 field2471;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Laq;")
    public static class108 field2473;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1221(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg3 && arg6 == arg8 && arg1 == arg7 && arg0 == arg5) {
            class673.method3721(arg0, arg1, arg9, arg6, -9797, arg3);
        } else {
            int var10 = arg3;
            int var11 = arg6;
            int var12 = arg3 * 3;
            int var13 = arg6 * 3;
            int var14 = arg2 * 3;
            int var15 = arg8 * 3;
            int var16 = arg7 * 3;
            int var17 = arg5 * 3;
            int var18 = var14 + arg1 - arg3 - var16;
            int var19 = var15 + arg0 - arg6 - var17;
            int var20 = var16 - var14 - (var14 - var12);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var30 + var32 + var28 >> 12) + arg3;
                int var35 = (var29 + var31 + var33 >> 12) + arg6;
                class673.method3721(var35, var34, arg9, var11, -9797, var10);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = -125 % ((arg4 + 74) / 39);
        field2478++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method1222(byte arg0) {
        int var1 = 62 % ((19 - arg0) / 36);
        field2473 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Lun;")
    public final class604 method1223(int arg0) {
        if (arg0 != 3) {
            method1221(-75, -96, 83, -22, (byte) 32, -88, -9, 6, 112, 36);
        }
        field2479++;
        return class573.method3239((byte) -96, this.field2482);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)Lpp;")
    public final class190 method1224(byte arg0, int arg1) {
        if (arg0 <= 16) {
            field2473 = null;
        }
        field2472++;
        return new class190(this.field2482, arg1);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(II)V")
    public class190(int arg0, int arg1) {
        this.field2482 = arg0;
        this.field2477 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lpp;I)V")
    public class190(class190 arg0, int arg1) {
        this.field2474 = arg0;
        this.field2482 = this.field2474.field2482;
        this.field2471 = this.field2474.field2471;
        this.field2477 = this.field2474.field2477 + arg1;
    }
}

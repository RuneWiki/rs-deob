import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class319 extends class263 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lnba;")
    public static class278 field3989 = new class278();

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ldr;")
    public static class675 field3991 = new class675(38, 9);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 3)
    public static void method1852(int arg0) {
        field3991 = null;
        field3989 = null;
        if (arg0 != -18153) {
            field3991 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBIIIIIIII)V", line = 17)
    public static final void method1853(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg7 && arg6 == arg9 && arg0 == arg3 && arg2 == arg8) {
            class194.method1142(arg2, arg4, arg5, false, arg0, arg9);
        } else {
            int var10 = arg4;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg9 * 3;
            int var14 = arg7 * 3;
            int var15 = arg6 * 3;
            int var16 = arg3 * 3;
            int var17 = arg8 * 3;
            int var18 = arg0 + var14 - var16 - arg4;
            int var19 = arg2 + var15 - var17 - arg9;
            int var20 = var16 - (var14 - var12) - var14;
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
                int var33 = arg4 + (var29 + var31 + var27 >> 12);
                int var34 = (var28 - (-var30 - var32) >> 12) + arg9;
                class194.method1142(var34, var10, arg5, false, var33, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field3988++;
        if (arg1 > -119) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 100)
    public class319() {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V", line = 102)
    public class319(int arg0) {
        this.field3990 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class32 extends class180 {

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lfn;")
    public static class52 field510 = new class52(39, -1);

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Lms;")
    public class363 field517;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Lms;")
    public class363 field521;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Ljava/lang/String;")
    public String field508;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Z")
    public boolean field515;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field518;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 6)
    public static void method249(boolean arg0) {
        field510 = null;
        if (arg0) {
            method249(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lms;Z)V", line = 21)
    public static final void method250(class363 arg0, boolean arg1) {
        field516++;
        if (!class184.field2678) {
            return;
        }
        class346.field4725++;
        class131.method793(class407.field5640, 71);
        class366.field5214.method2481(arg0.field5096, true);
        class366.field5214.method2453(class202.field2897, arg1);
        class366.field5214.method2462(arg0.field5047, (byte) -123);
        class366.field5214.method2462(class58.field919, (byte) -123);
        class366.field5214.method2481(class99.field1406, true);
        class366.field5214.method2475(128, arg0.field5195);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 41)
    public static final void method251(int arg0) {
        field512++;
        if (class228.field3230 == 5) {
            class228.field3230 = 6;
            if (arg0 != 128) {
                field520 = 32;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBIIIIIII)V", line = 55)
    public static final void method252(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 > -9) {
            method250((class363) null, false);
        }
        field509++;
        if (arg4 == arg5 && arg0 == arg6 && arg3 == arg8 && arg1 == arg7) {
            class436.method2533((byte) 126, arg5, arg0, arg9, arg1, arg8);
            return;
        }
        int var10 = arg5;
        int var11 = arg0;
        int var12 = arg5 * 3;
        int var13 = arg0 * 3;
        int var14 = arg4 * 3;
        int var15 = arg6 * 3;
        int var16 = arg3 * 3;
        int var17 = arg7 * 3;
        int var18 = arg8 + var14 - var16 - arg5;
        int var19 = var15 + arg1 - arg0 - var17;
        int var20 = var16 + var12 - var14 - var14;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg5;
            int var34 = arg0 + (var28 + var30 + var32 >> 12);
            class436.method2533((byte) 126, var10, var11, arg9, var34, var33);
            var11 = var34;
            var10 = var33;
        }
    }
}

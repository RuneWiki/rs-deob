import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class215 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Z")
    public boolean field3507 = true;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[J")
    public static long[] field3509 = new long[1000];

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3510 = 0;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public static int[] field3514 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ldl;")
    public static class123 field3503;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient;")
    public static client field3506;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field3519;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)V")
    public static final void method1456(byte arg0, int arg1, int arg2) {
        field3511++;
        class170 var3 = class163.method1117((byte) 103, arg1);
        int var4 = var3.field2660;
        int var5 = var3.field2672;
        int var6 = var3.field2661;
        int var7 = class146.field2150[var4 - var6];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        if (arg0 >= -83) {
            field3510 = 106;
        }
        class85.method589(19110, ~var8 & class211.field3295[var5] | var8 & arg2 << var6, var5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3518++;
        if (arg5 < 128 || arg6 < 128 || arg5 > 13056 || arg6 > 13056) {
            class179.field2789 = -1;
            class199.field3121 = -1;
            return;
        }
        int var8 = class99.method658(arg6, class276.field4398, arg5, -7185) - arg0;
        int var9 = arg6 - class54.field750;
        int var10 = var8 - class96.field1487;
        int var11 = arg5 - class66.field918;
        if (arg4 != 13) {
            method1459(59, -18, -48, -67, (class219) null, -114L, true);
        }
        int var12 = class171.field2675[class77.field1092];
        int var13 = class171.field2675[field3516];
        int var14 = class171.field2680[field3516];
        int var15 = class171.field2680[class77.field1092];
        int var16 = var9 * var12 + var11 * var15 >> 16;
        int var17 = var9 * var15 - var11 * var12 >> 16;
        int var19 = var10 * var14 - var13 * var17 >> 16;
        int var20 = var10 * var13 + (var14 * var17) >> 16;
        if (var20 < 50) {
            class179.field2789 = -1;
            class199.field3121 = -1;
        } else {
            class179.field2789 = (var19 << 9) / var20 + arg2;
            class199.field3121 = arg7 + ((var16 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1458(int arg0) {
        if (arg0 != 23951) {
            method1459(-16, -84, 95, 28, (class219) null, -112L, true);
        }
        field3519 = null;
        field3514 = null;
        field3509 = null;
        field3506 = null;
        field3503 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILhi;JZ)V")
    public static final void method1459(int arg0, int arg1, int arg2, int arg3, class219 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class17 var8 = new class17();
        var8.field203 = arg4;
        var8.field210 = arg1 * 128 + 64;
        var8.field207 = arg2 * 128 + 64;
        var8.field206 = arg3;
        var8.field201 = arg5;
        if (class90.field1382[arg0][arg1][arg2] == null) {
            class90.field1382[arg0][arg1][arg2] = new class49(arg0, arg1, arg2);
        }
        class90.field1382[arg0][arg1][arg2].field635 = var8;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3508 = arg1;
        this.field3512 = arg3;
        this.field3513 = arg0;
        this.field3505 = arg2;
        this.field3507 = arg6;
        this.field3515 = arg5;
        this.field3517 = arg4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public static final void method1460(byte arg0, int arg1) {
        if (arg1 == -1 && !class284.field4509) {
            class96.method643(1);
        } else if (arg1 != -1 && (class37.field488 != arg1 || !class37.method290(104)) && class219.field3553 != 0 && !class284.field4509) {
            class200.method1377(class98.field1509, true, false, arg1, 2, class219.field3553, 0);
        }
        field3504++;
        int var2 = -22 % ((arg0 + 42) / 61);
        class37.field488 = arg1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class216 extends class178 {

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lpb;")
    public class160 field3773;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "[J")
    public static long[] field3774 = new long[100];

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "Loc;")
    public static class151 field3771 = class137.method873(2, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "Loc;")
    public static class151 field3777 = class137.method873(2, ":assist:");

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "Luc;")
    public static class211 field3770 = new class211(64);

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Loh;")
    public static class156 field3778 = new class156(5);

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Lhh;")
    public static class84 field3775;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "[Lhh;")
    public static class84[] field3769;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3775 = null;
        field3771 = null;
        field3778 = null;
        field3777 = null;
        field3770 = null;
        field3774 = null;
        if (arg0 != 13820) {
            field3777 = null;
        }
        field3769 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lpb;)V")
    public class216(class160 arg0) {
        this.field3773 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class169.method1094(-1, arg3);
        field3776++;
        int var7 = arg3 - arg0;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg3;
        int var10 = arg3;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class43.field887[arg1];
        int var16 = arg4 + var7;
        int var17 = arg4 - var7;
        class55.method380(arg5, 118, var15, var17, arg4 - arg3);
        if (arg6 != 7826) {
            return;
        }
        class55.method380(arg2, arg6 - 7704, var15, var16, var17);
        class55.method380(arg5, 127, var15, arg3 + arg4, var16);
        while (var8 < var10) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class106.field1888[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            var9 += var13;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var7 <= var10) {
                    int[] var18 = class43.field887[arg1 + var10];
                    int[] var19 = class43.field887[arg1 - var10];
                    int var20 = arg4 + var8;
                    int var21 = arg4 - var8;
                    class55.method380(arg5, 106, var18, var20, var21);
                    class55.method380(arg5, 123, var19, var20, var21);
                } else {
                    int var22 = class106.field1888[var10];
                    int[] var23 = class43.field887[arg1 + var10];
                    int[] var24 = class43.field887[arg1 - var10];
                    int var25 = arg4 + var8;
                    int var26 = arg4 - var8;
                    int var27 = arg4 + var22;
                    int var28 = arg4 - var22;
                    class55.method380(arg5, 113, var23, var28, var26);
                    class55.method380(arg2, 104, var23, var27, var28);
                    class55.method380(arg5, 104, var23, var25, var27);
                    class55.method380(arg5, 117, var24, var28, var26);
                    class55.method380(arg2, 127, var24, var27, var28);
                    class55.method380(arg5, 123, var24, var25, var27);
                }
            }
            int[] var29 = class43.field887[arg1 - var8];
            int[] var30 = class43.field887[arg1 + var8];
            int var31 = arg4 + var10;
            int var32 = arg4 - var10;
            if (var8 < var7) {
                int var33 = var8 > var11 ? class106.field1888[var8] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class55.method380(arg5, arg6 - 7715, var30, var35, var32);
                class55.method380(arg2, 109, var30, var34, var35);
                class55.method380(arg5, 110, var30, var31, var34);
                class55.method380(arg5, arg6 ^ 0x1EFA, var29, var35, var32);
                class55.method380(arg2, arg6 ^ 0x1EF8, var29, var34, var35);
                class55.method380(arg5, arg6 - 7710, var29, var31, var34);
            } else {
                class55.method380(arg5, 118, var30, var31, var32);
                class55.method380(arg5, arg6 - 7704, var29, var31, var32);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class60 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "F")
    public float field993;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "F")
    public float field999;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "F")
    public float field994;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[J")
    public static long[] field998 = new long[32];

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Loh;")
    public static class258 field1004 = class153.method1046("<col=80ff00>", 125);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[[I")
    public static int[][] field1000 = new int[104][104];

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
    public static int[] field1001 = new int[32];

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 11)
    public static void method457(int arg0) {
        field1001 = null;
        field998 = null;
        if (arg0 == -27307) {
            field1000 = (int[][]) null;
            field1004 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILgb;Lgb;)V", line = 33)
    public static final void method458(int arg0, class213 arg1, class213 arg2) {
        class95.field1662 = arg2;
        if (arg0 != 2) {
            method460((Object[]) null, true, 51, -104, (int[]) null);
        }
        field1005++;
        class39.field560 = arg1;
        class121.field2145 = class95.field1662.method1435((byte) -21, 3);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBII)V", line = 50)
    public static final void method459(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class284.method1993((byte) -45, arg2);
        field1002++;
        if (arg4 >= -19) {
            field998 = (long[]) null;
        }
        int var7 = 0;
        int var8 = arg2 - arg1;
        int var9 = arg2;
        int var10 = -arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class154.field2638[arg5];
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class19.method126(7, arg0, var15, arg6 - arg2, var16);
        class19.method126(7, arg3, var15, var16, var17);
        class19.method126(7, arg0, var15, var17, arg6 + arg2);
        while (var7 < var9) {
            var13 += 2;
            var10 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class114.field2016[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class154.field2638[arg5 - var9];
                    int var19 = arg6 + var7;
                    int[] var20 = class154.field2638[arg5 + var9];
                    int var21 = arg6 - var7;
                    class19.method126(7, arg0, var20, var21, var19);
                    class19.method126(7, arg0, var18, var21, var19);
                } else {
                    int[] var22 = class154.field2638[arg5 - var9];
                    int var23 = class114.field2016[var9];
                    int[] var24 = class154.field2638[arg5 + var9];
                    int var25 = arg6 + var7;
                    int var26 = arg6 - var7;
                    int var27 = arg6 + var23;
                    int var28 = arg6 - var23;
                    class19.method126(7, arg0, var24, var26, var28);
                    class19.method126(7, arg3, var24, var28, var27);
                    class19.method126(7, arg0, var24, var27, var25);
                    class19.method126(7, arg0, var22, var26, var28);
                    class19.method126(7, arg3, var22, var28, var27);
                    class19.method126(7, arg0, var22, var27, var25);
                }
            }
            int[] var29 = class154.field2638[arg5 + var7];
            int var30 = arg6 + var9;
            int[] var31 = class154.field2638[arg5 - var7];
            int var32 = arg6 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class114.field2016[var7];
                int var34 = arg6 - var33;
                class19.method126(7, arg0, var29, var32, var34);
                int var35 = arg6 + var33;
                class19.method126(7, arg3, var29, var34, var35);
                class19.method126(7, arg0, var29, var35, var30);
                class19.method126(7, arg0, var31, var32, var34);
                class19.method126(7, arg3, var31, var34, var35);
                class19.method126(7, arg0, var31, var35, var30);
            } else {
                class19.method126(7, arg0, var29, var32, var30);
                class19.method126(7, arg0, var31, var32, var30);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Ljava/lang/Object;ZII[I)V", line = 189)
    public static final void method460(Object[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 < arg2) {
            int var5 = arg3;
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (arg4[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg4[arg2] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg2] = arg0[var5];
            arg0[var5] = var8;
            method460(arg0, false, var5 - 1, arg3, arg4);
            method460(arg0, arg1, arg2, var5 + 1, arg4);
        }
        field997++;
        if (arg1) {
            method459(-59, 41, 29, -33, (byte) -127, -78, -1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 241)
    public class60() {
        this.field993 = 1.2F;
        this.field996 = class304.field5187;
        this.field999 = 0.69921875F;
        this.field992 = class304.field5181;
        this.field995 = 0;
        this.field990 = -60;
        this.field1003 = -50;
        this.field991 = -50;
        this.field994 = 1.1523438F;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lva;)V", line = 257)
    public class60(class235 arg0) {
        int var2 = arg0.method1589(103);
        if ((var2 & 0x1) == 0) {
            this.field996 = class304.field5187;
        } else {
            this.field996 = arg0.method1611(41);
        }
        if ((var2 & 0x2) == 0) {
            this.field994 = 1.1523438F;
        } else {
            this.field994 = (float) arg0.method1615(68) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field999 = 0.69921875F;
        } else {
            this.field999 = (float) arg0.method1615(-121) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field993 = 1.2F;
        } else {
            this.field993 = (float) arg0.method1615(9) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1003 = -50;
            this.field990 = -60;
            this.field991 = -50;
        } else {
            this.field991 = arg0.method1574(-124);
            this.field990 = arg0.method1574(-98);
            this.field1003 = arg0.method1574(-56);
        }
        if ((var2 & 0x20) == 0) {
            this.field992 = class304.field5181;
        } else {
            this.field992 = arg0.method1611(54);
        }
        if ((var2 & 0x40) == 0) {
            this.field995 = 0;
        } else {
            this.field995 = arg0.method1615(-124);
        }
    }
}

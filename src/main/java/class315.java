import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class315 extends class317 {

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    private int field4754 = 4096;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lqk;")
    public static class65 field4745 = new class65();

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lmk;")
    public static class95 field4748 = null;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Lkm;")
    public static class133 field4751;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Ltd;")
    public static class283 field4753;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 5)
    public class315() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[III[J)V", line = 13)
    public static final void method2147(int arg0, int[] arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var9;
            method2147(var6 - 1, arg1, -103, arg3, arg4);
            method2147(arg0, arg1, -120, var6 + 1, arg4);
        }
        if (arg2 > -76) {
            method2153(94, 87, -65, 50, 89, -122, -4);
        }
        field4747++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[I", line = 67)
    public final int[] method140(int arg0, int arg1) {
        field4752++;
        if (arg0 != 542) {
            method2153(43, -63, -120, 24, 59, -16, 47);
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -107);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1 - 1 & class202.field2889);
            int[] var5 = this.method2225((byte) 66, 0, arg1);
            int[] var6 = this.method2225((byte) 66, 0, class202.field2889 & arg1 + 1);
            for (int var7 = 0; var7 < class326.field4933; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field4754;
                int var9 = (var5[var7 + 1 & class246.field3548] - var5[var7 - 1 & class246.field3548]) * this.field4754;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V", line = 122)
    public static void method2148(byte arg0) {
        field4748 = null;
        if (arg0 != 1) {
            field4748 = (class95) null;
        }
        field4753 = null;
        field4751 = null;
        field4745 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lcg;I)Lbk;", line = 139)
    public static final class126 method2149(class316 arg0, int arg1) {
        field4756++;
        return arg1 <= 74 ? (class126) null : new class126(arg0.method2161(28984), arg0.method2161(28984), arg0.method2161(28984), arg0.method2161(28984), arg0.method2210((byte) -5), arg0.method2210((byte) -5), arg0.method2219(16448));
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)I", line = 150)
    public static final int method2150(int arg0, int arg1) {
        field4755++;
        if (arg0 < 0) {
            return 0;
        }
        class113 var2 = (class113) class255.field3648.method111(arg1 - 10181, (long) arg0);
        if (var2 == null) {
            return class271.method1867(arg0, arg1 - 9948).field327;
        }
        int var3 = 0;
        if (arg1 != 10074) {
            field4751 = (class133) null;
        }
        for (int var4 = 0; var4 < var2.field1541.length; var4++) {
            if (var2.field1541[var4] == -1) {
                var3++;
            }
        }
        return var3 + class271.method1867(arg0, arg1 - 10150).field327 - var2.field1541.length;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkm;III)Lkn;", line = 193)
    public static final class178 method2151(class133 arg0, int arg1, int arg2, int arg3) {
        field4743++;
        if (class129.method931(arg3, arg1, arg0, (byte) 126)) {
            int var4 = 11 % ((-arg2 - 22) / 62);
            return class25.method145(17511);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V", line = 214)
    public static final void method2152(byte arg0) {
        int var1 = 40 / ((25 - arg0) / 55);
        field4749++;
        class162.field2232.method724(0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lcg;II)V", line = 227)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4754 = arg0.method2220((byte) 127);
        }
        field4750++;
        int var4 = -23 % ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V", line = 241)
    public static final void method2153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4744++;
        int var7 = arg5 + arg2;
        int var8 = arg6 - arg2;
        int var9 = arg2 + arg4;
        int var10 = arg0 - arg2;
        for (int var11 = arg5; var11 < var7; var11++) {
            class190.method1329(class126.field1723[var11], arg0, arg3, (byte) -99, arg4);
        }
        for (int var12 = arg6; var12 > var8; var12--) {
            class190.method1329(class126.field1723[var12], arg0, arg3, (byte) -124, arg4);
        }
        if (arg1 != 1) {
            method2148((byte) 75);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class126.field1723[var13];
            class190.method1329(var14, var9, arg3, (byte) -85, arg4);
            class190.method1329(var14, arg0, arg3, (byte) -119, var10);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class123 extends class264 {

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lma;")
    public static class5 field1859 = class12.method119("document)3cookie=(R", (byte) 82);

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Z")
    public static boolean field1861 = false;

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vc", name = "pb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 5)
    public static void method812(boolean arg0) {
        if (!arg0) {
            field1859 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(BI)[[I", line = 16)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -92 % ((arg0 + 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        field1864++;
        if (this.field4524.field3506) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                this.method814(var8, (byte) -115, arg1);
                int[][] var9 = this.method1817(-85, 0, class268.field4604);
                var5[var8] = var9[0][class219.field3540];
                var6[var8] = var9[1][class219.field3540];
                var7[var8] = var9[2][class219.field3540];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILkb;Lkb;IIJ)V", line = 56)
    public static final void method813(int arg0, int arg1, int arg2, int arg3, class280 arg4, class280 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class89 var10 = new class89();
        var10.field1335 = arg8;
        var10.field1330 = arg1 * 128 + 64;
        var10.field1331 = arg2 * 128 + 64;
        var10.field1324 = arg3;
        var10.field1337 = arg4;
        var10.field1326 = arg5;
        var10.field1339 = arg6;
        var10.field1325 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class43.field646[var11][arg1][arg2] == null) {
                class43.field646[var11][arg1][arg2] = new class198(var11, arg1, arg2);
            }
        }
        class43.field646[arg0][arg1][arg2].field3149 = var10;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)V", line = 82)
    private final void method814(int arg0, byte arg1, int arg2) {
        if (arg1 > -98) {
            return;
        }
        field1867++;
        int var4 = class251.field4159[arg0];
        int var5 = class116.field1726[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class219.field3540 = arg0;
            class268.field4604 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class268.field4604 = arg0;
            class219.field3540 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class219.field3540 = class226.field3716 - arg2;
            class268.field4604 = arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class268.field4604 = class119.field1807 - arg2;
            class219.field3540 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class219.field3540 = class226.field3716 - arg0;
            class268.field4604 = class119.field1807 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class268.field4604 = class119.field1807 - arg0;
            class219.field3540 = class226.field3716 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class219.field3540 = arg2;
            class268.field4604 = class119.field1807 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class219.field3540 = class226.field3716 - arg0;
            class268.field4604 = arg2;
        }
        class219.field3540 &= class256.field4370;
        class268.field4604 &= class68.field1082;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V", line = 166)
    public static final void method815(int arg0, int arg1, long[] arg2, Object[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            long var6 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var6;
            int var8 = arg4;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if (var6 + ((long) (var10 & 0x1)) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var8];
                    arg2[var8] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var8];
                    arg3[var8++] = var13;
                }
            }
            arg2[arg1] = arg2[var8];
            arg2[var8] = var6;
            arg3[arg1] = arg3[var8];
            arg3[var8] = var9;
            method815(-2048, var8 - 1, arg2, arg3, arg4);
            method815(-2048, arg1, arg2, arg3, var8 + 1);
        }
        if (arg0 != -2048) {
            method815(42, 46, (long[]) null, (Object[]) null, 53);
        }
        field1860++;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 221)
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V", line = 225)
    public static final void method816(boolean arg0) {
        if (arg0) {
            class101.field1509.method523(123);
            field1869++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILii;)V", line = 253)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 <= -27) {
            if (arg0 == 0) {
                this.field4496 = arg2.method1509(true) == 1;
            }
            field1863++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I", line = 271)
    public final int[] method5(int arg0, int arg1) {
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            for (int var4 = 0; var4 < class226.field3716; var4++) {
                this.method814(var4, (byte) -99, arg1);
                int[] var5 = this.method1815(0, class268.field4604, -107);
                var3[var4] = var5[class219.field3540];
            }
        }
        field1866++;
        if (arg0 >= -58) {
            method816(false);
        }
        return var3;
    }
}

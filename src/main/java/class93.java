import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class93 extends class273 {

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
    public static int[] field1435 = new int[14];

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "Z")
    public static boolean field1433 = false;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1436 = "M";

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(III)V", line = 9)
    private final void method634(int arg0, int arg1, int arg2) {
        field1434++;
        int var4 = class96.field1473[arg1];
        int var5 = class151.field2384[arg0];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (arg2 + var4));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class257.field4001 = arg1;
            class128.field1988 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class128.field1988 = arg1;
            class257.field4001 = arg0;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class257.field4001 = arg0;
            class128.field1988 = class27.field346 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class128.field1988 = arg0;
            class257.field4001 = class99.field1533 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class128.field1988 = class27.field346 - arg0;
            class257.field4001 = class99.field1533 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class257.field4001 = class99.field1533 - arg0;
            class128.field1988 = class27.field346 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class128.field1988 = arg1;
            class257.field4001 = class99.field1533 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class257.field4001 = arg1;
            class128.field1988 = class27.field346 - arg0;
        }
        class128.field1988 &= class197.field2963;
        class257.field4001 &= class117.field1819;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V", line = 80)
    public static void method635(int arg0) {
        if (arg0 == 0) {
            field1436 = null;
            field1435 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(Z)V", line = 92)
    public static final void method636(boolean arg0) {
        class260.field4037.method1298((byte) 110);
        field1439++;
        class133.field2095.method1298((byte) 110);
        class285.field4365.method1298((byte) 110);
        if (!arg0) {
            field1441 = 2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)[[I", line = 105)
    public final int[][] method170(int arg0, byte arg1) {
        field1432++;
        if (arg1 != 68) {
            field1441 = -13;
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class27.field346; var7++) {
                this.method634(var7, arg0, -2048);
                int[][] var8 = this.method1795(class257.field4001, arg1 - 193, 0);
                var4[var7] = var8[0][class128.field1988];
                var5[var7] = var8[1][class128.field1988];
                var6[var7] = var8[2][class128.field1988];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILfe;IJIIII)Z", line = 145)
    public static final boolean method637(int arg0, int arg1, int arg2, int arg3, class94 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class229.method1570(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 151)
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I", line = 162)
    public final int[] method331(int arg0, int arg1) {
        field1440++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            for (int var4 = 0; var4 < class27.field346; var4++) {
                this.method634(var4, arg0, arg1 + 12602);
                int[] var5 = this.method1790(0, class257.field4001, 0);
                var3[var4] = var5[class128.field1988];
            }
        }
        if (arg1 != -14650) {
            field1441 = 108;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V", line = 190)
    public static final void method638(int arg0) {
        field1438++;
        if (class120.field1844) {
            return;
        }
        class171.field2602 = true;
        class120.field1844 = true;
        int var1 = 9 % ((arg0 - 48) / 46);
        if (class298.field4569) {
            class123.field1922 = (float) ((int) class123.field1922 + 191 & 0xFFFFFF80);
        } else {
            class228.field3656 += (24.0F - class228.field3656) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BILgn;)V", line = 226)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1437++;
        if (arg0 > 27 && arg1 == 0) {
            this.field4194 = arg2.method2043((byte) -110) == 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V", line = 240)
    public static final void method639(int arg0) {
        if (arg0 != 255) {
            method639(2);
        }
        field1431++;
        class168.field2569 = null;
        class177.field2697 = null;
        class343.field5337 = null;
        class343.field5344 = null;
    }
}

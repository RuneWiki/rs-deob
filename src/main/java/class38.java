import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class38 extends class177 {

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field569 = 10;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "Z")
    public static boolean field581 = true;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field575 = Calendar.getInstance();

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "[Lvd;")
    public static class134[] field577;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lhb;II)V", line = 10)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field580 = (arg0.method273(arg1 + 83341) << 12) / 255;
        }
        if (arg1 != -18061) {
            this.method97((class35) null, -40, -128);
        }
        field582++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V", line = 31)
    public static final void method345(boolean arg0, int[] arg1, Object[] arg2) {
        class81.method638(arg1, arg1.length - 1, 0, 8, arg2);
        field579++;
        if (arg0) {
            method352(true, 32, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 42)
    private class38(int arg0) {
        super(0, true);
        this.field580 = 4096;
        this.field580 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 52)
    public static final String method346(int arg0, int arg1, int arg2, boolean arg3) {
        field578++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg0 >= 0) {
            if (arg1 != 1) {
                method349(-29, 60, -128, (byte) -28, -40, -5);
            }
            int var4 = 2;
            int var5 = arg0 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - arg0 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)V", line = 101)
    public static final void method347(int arg0, int arg1) {
        if (arg1 == 13968) {
            class147 var2 = class92.method731(arg1 - 43093, arg0, 1);
            field583++;
            var2.method1099(-125);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I", line = 116)
    public final int[] method95(int arg0, int arg1) {
        field574++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -64);
        if (arg0 >= -52) {
            method349(40, -37, -32, (byte) 118, -39, 48);
        }
        if (this.field2652.field3287) {
            class151.method1116(var3, 0, class287.field4415, this.field580);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIII)Z", line = 137)
    public static final boolean method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class267.field4023[arg0][var8][var9] == -class63.field949) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class41.field612[arg0][arg1][arg3] + arg5;
            if (!class225.method1604(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class225.method1604(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class225.method1604(var10, var12, var14)) {
                return false;
            } else if (class225.method1604(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class73.method600(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class225.method1604(var6 + 1, class41.field612[arg0][arg1][arg3] + arg5, var7 + 1) && class225.method1604(var6 + 128 - 1, class41.field612[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class225.method1604(var6 + 128 - 1, class41.field612[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class225.method1604(var6 + 1, class41.field612[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBII)V", line = 197)
    public static final void method349(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class45.field699 = arg4;
        if (arg3 != 99) {
            field581 = true;
        }
        class325.field5058 = arg0;
        class137.field2137 = arg5;
        class53.field799 = arg2;
        field570++;
        class117.field1821 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 215)
    public class38() {
        this(4096);
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 220)
    public static void method350(int arg0) {
        if (arg0 != 5899) {
            field577 = (class134[]) null;
        }
        field575 = null;
        field577 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLlb;Llb;)V", line = 234)
    public static final void method351(byte arg0, class211 arg1, class211 arg2) {
        field572++;
        class41.field601 = arg2;
        if (arg0 < 120) {
            method352(false, -12, (String) null, (String) null);
        }
        class206.field3256 = arg1;
        class287.field4427 = class206.field3256.method1523(9271, 3);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V", line = 250)
    public static final void method352(boolean arg0, int arg1, String arg2, String arg3) {
        class320.method2190((String) null, -1, arg2, arg3, arg1, arg0);
        field571++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;)V", line = 258)
    public static final void method353(String arg0, String arg1, int arg2, byte arg3, String arg4) {
        field576++;
        class320.method2190(arg0, -1, arg1, arg4, arg2, false);
        if (arg3 >= -94) {
            method353((String) null, (String) null, -20, (byte) -126, (String) null);
        }
    }
}

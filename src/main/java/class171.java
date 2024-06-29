import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class171 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public int field2464 = 43594;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Z")
    private boolean field2473 = false;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Z")
    private boolean field2467 = false;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public int field2479 = 443;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "F")
    public static float field2476;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Ljava/lang/String;")
    public String field2472;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "[I")
    public static int[] field2478;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lov;B)Z")
    public final boolean method1203(class171 arg0, byte arg1) {
        if (arg1 != -37) {
            this.method1203(null, (byte) 44);
        }
        field2474++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field2475 == arg0.field2475 && this.field2472.equals(arg0.field2472);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lr;IIZ)Lla;")
    public static final class417 method1204(class166 arg0, int arg1, int arg2, boolean arg3) {
        field2466++;
        if (arg1 == -25163) {
            class486 var4 = class280.method1725(arg2, (byte) 114, arg3, arg0);
            return var4 == null ? null : var4.field6682;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([BIII)[B")
    public static final byte[] method1205(byte[] arg0, int arg1, int arg2, int arg3) {
        field2468++;
        if (arg2 > -89) {
            method1207(22, 113, -5, -36, (byte) 103, 97, 88, 101, -25, -56);
        }
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg3];
            for (int var5 = 0; var5 < arg3; var5++) {
                var4[var5] = arg0[arg1 + var5];
            }
        } else {
            var4 = arg0;
        }
        class286 var6 = new class286();
        var6.method1760(2);
        var6.method1758(var4, (byte) 112, (long) (arg3 * 8));
        byte[] var7 = new byte[64];
        var6.method1759(var7, 0, 80);
        return var7;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Llaa;I)Lkl;")
    public final class70 method1206(class105 arg0, int arg1) {
        if (arg1 != 37) {
            this.method1203(null, (byte) -103);
        }
        field2465++;
        return arg0.method761(this.field2473, this.field2472, this.field2467 ? this.field2479 : this.field2464, arg1 - 37);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != -29) {
            field2476 = 0.91486984F;
        }
        field2477++;
        if (arg2 >= class128.field1831 && class529.field7169 >= arg2 && arg8 >= class128.field1831 && class529.field7169 >= arg8 && class128.field1831 <= arg7 && arg7 <= class529.field7169 && class128.field1831 <= arg6 && arg6 <= class529.field7169 && arg1 >= class469.field6466 && arg1 <= class533.field7200 && arg9 >= class469.field6466 && class533.field7200 >= arg9 && arg5 >= class469.field6466 && arg5 <= class533.field7200 && arg0 >= class469.field6466 && arg0 <= class533.field7200) {
            class36.method315(arg8, -128, arg9, arg6, arg5, arg7, arg2, arg0, arg3, arg1);
        } else {
            class545.method3070(arg8, 1168479916, arg9, arg0, arg2, arg5, arg1, arg3, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        int var1 = -88 % ((arg0 - 16) / 63);
        field2478 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public final void method1209(int arg0) {
        if (!this.field2467) {
            this.field2473 = true;
            this.field2467 = true;
        } else if (this.field2473) {
            this.field2473 = false;
        } else {
            this.field2467 = false;
        }
        field2470++;
        if (arg0 != 37) {
            this.field2467 = true;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1210(int arg0, long arg1) {
        if (arg0 > -113) {
            return null;
        }
        field2469++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class83.field1241[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}

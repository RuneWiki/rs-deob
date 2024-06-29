import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class608 extends class127 {

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "Lcu;")
    public static class206 field8044 = new class206(76, 7);

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "[B")
    private byte[] field8049;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 3)
    public class608() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 9)
    public static void method3337(boolean arg0) {
        if (arg0) {
            field8044 = null;
        }
        field8044 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)[B", line = 19)
    public final byte[] method3338(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 16384) {
            field8044 = null;
        }
        this.field8049 = new byte[arg1 * arg3 * arg0 * 2];
        field8048++;
        this.method3463(arg3, true, arg0, arg1);
        return this.field8049;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 33)
    public static final String method3339(String arg0, String arg1, String arg2, byte arg3) {
        field8043++;
        if (arg3 == -56) {
            for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
                arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg0.length());
            }
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILjava/lang/String;)V", line = 52)
    public static final void method3340(int arg0, int arg1, String arg2) {
        field8046++;
        int var3 = class664.field9426;
        int[] var4 = class55.field762;
        boolean var5 = false;
        if (arg0 <= 1) {
            method3339(null, null, null, (byte) -25);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class403 var7 = class572.field7601[var4[var6]];
            if (var7 != null && class199.field2897 != var7 && var7.field5398 != null && var7.field5398.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg1 == 1) {
                    class568.field7534++;
                    class402 var8 = class390.method2252(class190.field2798, -80, class262.field3644);
                    var8.field5354.method2021(1326408496, var4[var6]);
                    var8.field5354.method2012((byte) 109, 0);
                    class36.method278(0, var8);
                } else if (arg1 == 4) {
                    class415.field5676++;
                    class402 var9 = class390.method2252(class515.field6885, -120, class262.field3644);
                    var9.field5354.method2020(0, (byte) 94);
                    var9.field5354.method2030(var4[var6], 117);
                    class36.method278(0, var9);
                } else if (arg1 == 5) {
                    class117.field2002++;
                    class402 var10 = class390.method2252(class418.field5717, -86, class262.field3644);
                    var10.field5354.method2031((byte) 54, var4[var6]);
                    var10.field5354.method2020(0, (byte) 30);
                    class36.method278(0, var10);
                } else if (arg1 == 6) {
                    class501.field6704++;
                    class402 var12 = class390.method2252(class59.field910, -89, class262.field3644);
                    var12.field5354.method2021(1326408496, var4[var6]);
                    var12.field5354.method1989((byte) -47, 0);
                    class36.method278(0, var12);
                } else if (arg1 == 7) {
                    class43.field623++;
                    class402 var11 = class390.method2252(class260.field3578, -88, class262.field3644);
                    var11.field5354.method1980(-345277664, 0);
                    var11.field5354.method2030(var4[var6], 69);
                    class36.method278(0, var11);
                }
                break;
            }
        }
        if (!var5) {
            class315.method1881(class72.field1085.method546(class516.field6892, (byte) -35) + arg2, 0, 4);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V", line = 142)
    public final void method979(int arg0, int arg1, byte arg2) {
        field8045++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8049[var10001] = -1;
        if (arg1 != -1) {
            this.method979(-91, 37, (byte) -4);
        }
        this.field8049[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 164)
    public static final void method3341(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class108.field1589[var1] = null;
        }
        field8047++;
        class92.field1401 = 0;
        if (arg0 != -101) {
            method3341(-44);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[BIIII)Z", line = 184)
    public static final boolean method3342(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field8050++;
        int var7 = arg1 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg3 + arg5 + arg0) / arg5);
        int var10 = -((arg1 + arg5 - 1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg4] == 0) {
                    return true;
                }
                arg4 += arg5;
            }
            int var13 = arg4 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg6 + var13;
        }
        return false;
    }
}

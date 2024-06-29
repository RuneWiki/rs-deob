import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class286 extends class214 {

    @OriginalMember(owner = "client!im", name = "M", descriptor = "Lfn;")
    public static class52 field3908 = new class52(102, 12);

    @OriginalMember(owner = "client!im", name = "N", descriptor = "J")
    public static long field3909 = 0L;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "[I")
    public static int[] field3912 = new int[14];

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)[I", line = 3)
    public final int[] method14(byte arg0, int arg1) {
        ++field3905;
        if (arg0 != 123) {
            field3912 = null;
        }
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int[][] var4 = this.method1354(0, arg1, (byte) 23);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lfl;", line = 42)
    public static final class345 method1763(int arg0, int arg1) {
        ++field3911;
        class345[] var2 = class305.method1848(32435);
        for (int var3 = arg1; ~var2.length < ~var3; ++var3) {
            class345 var4 = var2[var3];
            if (var4.field4713 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 66)
    public static void method1764(byte arg0) {
        if (arg0 == 13) {
            field3908 = null;
            field3912 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 78)
    public class286() {
        super(1, true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIIIII)Lop;", line = 87)
    public static final class63 method1765(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3907;
        long var7 = (long) arg2 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg5 * 986053L ^ (long) arg6 * 76724863L;
        class63 var9 = (class63) class38.field660.method659(var7, (byte) -1);
        if (arg1 <= 118) {
            method1765(-37, (byte) 10, 106, -76, 91, -109, 30);
        }
        if (var9 != null) {
            return var9;
        } else {
            class63 var10 = class2.field18.method1053(arg4, arg3, arg0, arg5, arg2, arg6);
            class38.field660.method653(80, var7, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILes;)I", line = 107)
    public static final int method1766(int arg0, class75 arg1) {
        ++field3910;
        if (arg0 < 119) {
            field3909 = 100L;
        }
        if (~arg1.field1063 == -1) {
            return 0;
        } else {
            if (~arg1.field1096 != 0) {
                class75 var2 = null;
                if (~arg1.field1096 > -32769) {
                    var2 = class256.field3581[arg1.field1096];
                } else if (~arg1.field1096 <= -32769) {
                    var2 = class310.field4235[arg1.field1096 + -32768];
                }
                if (var2 != null) {
                    int var3 = -var2.field6765 + arg1.field6765;
                    int var4 = -var2.field6746 + arg1.field6746;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method505(16383 & (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D), -32082);
                    }
                }
            }
            if (arg1 instanceof class23) {
                class23 var5 = (class23) arg1;
                if (var5.field388 != -1 && (var5.field1142 == 0 || var5.field1137 > 0)) {
                    var5.method505(var5.field388, -32082);
                    var5.field388 = -1;
                }
            } else if (arg1 instanceof class196) {
                class196 var6 = (class196) arg1;
                if (var6.field2780 != -1 && (var6.field1142 == 0 || var6.field1137 > 0)) {
                    int var7 = -((-class153.field2204 + var6.field2780 + -class153.field2204) * 64) + var6.field6765;
                    int var8 = -((var6.field2775 - (class325.field4472 + class325.field4472)) * 64) + var6.field6746;
                    if (~var7 != -1 || ~var8 != -1) {
                        var6.method505((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 16383, -32082);
                    }
                    var6.field2780 = -1;
                }
            }
            return arg1.method516(15296);
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Ljava/lang/String;", line = 187)
    public static final String method1767(int arg0) {
        ++field3906;
        String var1 = "www";
        if (class96.field1373 != class319.field4366) {
            if (class96.field1373 == class334.field4581) {
                var1 = "www-wtqa";
            } else if (class96.field1373 == class39.field674) {
                var1 = "www-wtwip";
            }
        } else {
            var1 = "www-wtrc";
        }
        String var2 = "";
        if (arg0 != 12) {
            field3909 = -90L;
        }
        if (class172.field2556 != null) {
            var2 = "/p=" + class172.field2556;
        }
        return "http://" + var1 + "." + class172.field2553.field4527 + ".com/l=" + class487.field6867 + "/a=" + class303.field4156 + var2 + "/";
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class356 extends class38 {

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "Lqe;")
    public static class469 field5173 = new class469(90, -1);

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method196(int arg0, int arg1) {
        ++field5176;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (arg0 != -18210) {
            method2228();
        }
        if (super.field387.field6792) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class729.field10216; ++var7) {
                this.method2227(arg1, var7, 0);
                int[][] var8 = this.method195(true, 0, class455.field6698);
                var4[var7] = var8[0][class4.field53];
                var5[var7] = var8[1][class4.field53];
                var6[var7] = var8[2][class4.field53];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(B)V", line = 46)
    public static void method2225(byte arg0) {
        field5173 = null;
        int var1 = 34 % ((arg0 - 44) / 56);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lha;I)V", line = 57)
    public static final void method2226(class60 arg0, int arg1) {
        ++field5179;
        if (arg1 != -14670) {
            field5174 = 52;
        }
        if (~class390.field5885 != ~class130.field1749.field8429) {
            if (class80.field1136 != null) {
                if (class612.method3546(-3186, arg0, class130.field1749.field8429)) {
                    class390.field5885 = class130.field1749.field8429;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)V", line = 77)
    private final void method2227(int arg0, int arg1, int arg2) {
        ++field5175;
        int var4 = class255.field3666[arg1];
        if (arg2 == 0) {
            int var5 = class136.field1816[arg0];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class4.field53 = arg1;
                class455.field6698 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class455.field6698 = arg1;
                class4.field53 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class455.field6698 = arg1;
                class4.field53 = -arg0 + class729.field10216;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class4.field53 = arg1;
                class455.field6698 = class632.field8852 - arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class455.field6698 = class632.field8852 - arg0;
                class4.field53 = -arg1 + class729.field10216;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class455.field6698 = -arg1 + class632.field8852;
                class4.field53 = class729.field10216 - arg0;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class4.field53 = arg0;
                class455.field6698 = class632.field8852 - arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class4.field53 = -arg1 + class729.field10216;
                class455.field6698 = arg0;
            }
            class4.field53 &= class554.field7909;
            class455.field6698 &= class619.field8708;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[I", line = 154)
    public final int[] method199(byte arg0, int arg1) {
        ++field5177;
        if (arg0 >= -43) {
            return null;
        } else {
            int[] var3 = super.field397.method1376(arg1, (byte) 109);
            if (super.field397.field3005) {
                for (int var4 = 0; var4 < class729.field10216; ++var4) {
                    this.method2227(arg1, var4, 0);
                    int[] var5 = this.method189(class455.field6698, 0, (byte) -92);
                    var3[var4] = var5[class4.field53];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()V", line = 189)
    public static final void method2228() {
        for (int var0 = 0; var0 < class425.field6313; ++var0) {
            class119 var1 = class187.field2850[var0];
            class738.method4137(var1, true);
            class187.field2850[var0] = null;
        }
        class425.field6313 = 0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILrg;)V", line = 202)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 > 34) {
            ++field5172;
            if (arg1 == 0) {
                super.field388 = arg2.method3745(-6314) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;Lrg;Z)I", line = 219)
    public static final int method2229(String arg0, class645 arg1, boolean arg2) {
        ++field5178;
        int var3 = arg1.field9084;
        byte[] var4 = class408.method2593(arg0, arg2);
        arg1.method3753(arg2, var4.length);
        arg1.field9084 += class69.field979.method3930(0, (byte) 85, var4.length, arg1.field9068, arg1.field9084, var4);
        return -var3 + arg1.field9084;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ)Z", line = 241)
    public static boolean method2230(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 248)
    public class356() {
        super(1, false);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class440 extends class253 {

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "B")
    public byte field6706 = 5;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
    public static boolean field6707 = false;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public int field6701;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public int field6705;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public int field6708;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public int field6709;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public int field6710;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Z")
    public boolean field6703;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 4)
    public static final void method2780(String arg0, boolean arg1) {
        field6700++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class321.method2179(-2081246228, arg0);
        if (var2 == null) {
            return;
        }
        if (!arg1) {
            method2781(-32, null, -30, 123, null);
        }
        for (int var3 = 0; var3 < class51.field691; var3++) {
            String var4 = class478.field7077[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class321.method2179(-2081246228, var4);
            if (var5 != null && var5.equals(var2)) {
                class51.field691--;
                for (int var6 = var3; var6 < class51.field691; var6++) {
                    class478.field7077[var6] = class478.field7077[var6 + 1];
                    class299.field4671[var6] = class299.field4671[var6 + 1];
                    class333.field5455[var6] = class333.field5455[var6 + 1];
                    class182.field3064[var6] = class182.field3064[var6 + 1];
                    class55.field726[var6] = class55.field726[var6 + 1];
                }
                class292.field4608 = class79.field997;
                class444.field6753++;
                class165 var7 = class271.method1917(class420.field6424, (byte) -98, class229.field3671);
                var7.field2776.method65(class516.method3125(96, arg0), -77);
                var7.field2776.method28(arg0, 0);
                class642.method3726(-684096285, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[III[I)V", line = 68)
    public static final void method2781(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 != 1) {
            field6707 = false;
        }
        if (arg0 > arg2) {
            int var5 = (arg2 + arg0) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (((var9 & var10) + var7) > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method2781(var6 - 1, arg1, arg2, 1, arg4);
            method2781(arg0, arg1, var6 + 1, 1, arg4);
        }
        field6704++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lie;I)Lhe;", line = 129)
    public static final class340 method2782(class6 arg0, int arg1) {
        field6702++;
        if (arg1 != 0) {
            field6707 = true;
        }
        return new class340(arg0.method45(arg1 - 8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method86(-86), arg0.method70(-9059));
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class193 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/lang/String;")
    public String field2351;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Ljava/lang/String;")
    public String field2356;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Ljava/lang/String;")
    public String field2354;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    public static int[] field2355 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lhk;")
    public static class86 field2350;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Lff;")
    public static final class9 method1183(int arg0) {
        field2357++;
        if (arg0 != 28) {
            method1185(32, 106, 92);
        }
        if (class550.field7987 == null || class327.field4363 == null) {
            return null;
        }
        for (class9 var1 = (class9) class327.field4363.method772(-104); var1 != null; var1 = (class9) class327.field4363.method772(-127)) {
            class289 var2 = class550.field7973.method3816(103, var1.field90);
            if (var2 != null && var2.field3925 && var2.method1718(class550.field7970, (byte) 127)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(JLua;IIILn;IBI)V")
    public static final void method1184(long arg0, class616 arg1, int arg2, int arg3, int arg4, class17 arg5, int arg6, byte arg7, int arg8) {
        field2353++;
        int var10 = arg2 * arg2 + arg6 * arg6;
        if (arg0 < ((long) var10)) {
            return;
        }
        if (arg7 != 3) {
            field2350 = null;
        }
        int var11 = Math.min(arg5.field414 / 2, arg5.field402 / 2);
        if (var11 * var11 >= var10) {
            class86.method685(class612.field8776[arg8], arg3, arg5, arg2, arg6, arg1, (byte) -92, arg4);
            return;
        }
        var11 -= 10;
        int var12;
        if (class586.field8507 == 4) {
            var12 = (int) class115.field1495 & 0x3FFF;
        } else {
            var12 = (int) class115.field1495 + class186.field2277 & 0x3FFF;
        }
        int var13 = class395.field5579[var12];
        int var14 = class395.field5582[var12];
        if (class586.field8507 != 4) {
            var14 = var14 * 256 / (class680.field9743 + 256);
            var13 = var13 * 256 / (class680.field9743 + 256);
        }
        int var15 = arg2 * var13 + arg6 * var14 >> 14;
        int var16 = arg2 * var14 - (arg6 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class511.field7470[arg8].method3927((float) arg5.field414 / 2.0F + (float) arg3 + (float) var19, (float) arg5.field402 / 2.0F + (float) arg4 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
    public static final boolean method1185(int arg0, int arg1, int arg2) {
        if (arg0 != 32070) {
            field2355 = null;
        }
        field2352++;
        return ((arg2 & 0x2000) != 0 | class376.method2184(arg1, arg2, (byte) -98) | class33.method407(arg1, arg2, (byte) -115)) & class287.method1711(arg2, arg1, (byte) 12);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field2350 = null;
        field2355 = null;
        if (arg0 >= -91) {
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class193(String arg0, String arg1, String arg2) {
        this.field2351 = arg2;
        this.field2356 = arg1;
        this.field2354 = arg0;
    }
}

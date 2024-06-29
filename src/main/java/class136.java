import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class136 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lie;")
    public static class2 field2214 = new class2();

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public static int[] field2218 = new int[128];

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2220 = null;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lpi;")
    public static class201 field2219 = new class201(64);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field2219 = null;
        field2214 = null;
        field2220 = null;
        if (arg0 != -47) {
            field2218 = null;
        }
        field2218 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Llc;I)V")
    public static final void method1024(class270 arg0, int arg1) {
        class69.field1114 = arg0;
        field2215++;
        int var2 = 125 / ((26 - arg1) / 40);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method1025(int arg0, boolean arg1) {
        field2216++;
        if (arg1) {
            return null;
        }
        class290 var2 = (class290) class85.field1354.method2099((byte) 125, (long) arg0);
        if (var2 == null) {
            Random var3 = new Random((long) arg0);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class275.method1912(var7, -92, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class290(var4);
            class85.field1354.method2103(var2, -1, (long) arg0);
        }
        return var2.field4623;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg6) {
            method1024((class270) null, 72);
        }
        field2217++;
        if (arg2 == arg3 && arg0 == arg4 && arg8 == arg9 && arg5 == arg7) {
            class196.method1390(arg0, arg5, arg9, arg1, false, arg2);
            return;
        }
        int var10 = arg2;
        int var11 = arg0;
        int var12 = arg0 * 3;
        int var13 = arg2 * 3;
        int var14 = arg8 * 3;
        int var15 = arg7 * 3;
        int var16 = arg4 * 3;
        int var17 = arg3 * 3;
        int var18 = arg9 + var17 - arg2 - var14;
        int var19 = arg5 + var16 - var15 - arg0;
        int var20 = var13 + var14 - (var17 + var17);
        int var21 = var16 - var12;
        int var22 = var17 - var13;
        int var23 = var15 + var12 - var16 - var16;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var20 * var25;
            int var27 = var24 * var25 >> 12;
            int var28 = var23 * var25;
            int var29 = var22 * var24;
            int var30 = var18 * var27;
            int var31 = var19 * var27;
            int var32 = var21 * var24;
            int var33 = (var31 + var32 + var28 >> 12) + arg0;
            int var34 = arg2 + (var29 + var30 + var26 >> 12);
            class196.method1390(var11, var33, var34, arg1, false, var10);
            var11 = var33;
            var10 = var34;
        }
    }
}

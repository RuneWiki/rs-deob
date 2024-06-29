import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class393 {

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Lhda;")
    public static class752 field5484 = new class752(105, -2);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "[S")
    public static short[] field5486;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static final void method2322(int arg0) {
        field5485++;
        int var1 = class411.field5711.field3888.method1289(true);
        if (~var1 == arg0) {
            class77.field943 = null;
            class531.method2961(255, 0);
        } else if (var1 == 1) {
            class376.method2206(0, (byte) 0);
            class531.method2961(255, 512);
            if (class184.field2782 != null) {
                class273.method1637((byte) 107);
            }
        } else {
            class376.method2206(arg0 + 1, (byte) (class405.field5645 + -4 & 0xFF));
            class531.method2961(255, 2);
        }
        class290.field4147 = class507.field6775;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method2323(int arg0, int arg1, int arg2, int arg3, int arg4, class59 arg5) {
        arg5.method419(arg2, arg3, arg0 + arg2, arg3 + arg4);
        field5488++;
        arg5.method489(arg0, 40, arg4, arg3, arg2, -16777216);
        if (class178.field2687 < 100) {
            return;
        }
        float var6 = (float) class744.field10359 / (float) class744.field10367;
        int var7 = arg0;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg2;
        int var10 = (arg4 - var8) / 2 + arg3;
        if (class308.field4428 == null || class308.field4428.method1042() != arg0 || class308.field4428.method1043() != arg4) {
            class744.method4167(class744.field10370, class744.field10371 + class744.field10359, class744.field10370 + class744.field10367, class744.field10371, var9, var10, var7 + var9, var8 + var10);
            class744.method4165(arg5);
            class308.field4428 = arg5.method409(var9, var10, var7, var8, false);
        }
        class308.field4428.method1035(var9, var10);
        int var11 = class613.field8163 * var7 / class744.field10367;
        int var12 = class703.field9754 * var8 / class744.field10359;
        int var13 = class347.field4879 * var7 / class744.field10367 + var9;
        int var14 = var8 + var10 - (class348.field4880 * var8 / class744.field10359) - var12;
        int var15 = -1996554240;
        if (class683.field9532 == class12.field187) {
            var15 = -1996488705;
        }
        if (arg1 != -24604) {
            return;
        }
        arg5.method504(var13, var14, var11, var12, var15, 1);
        arg5.method455(var13, var14, var11, var12, var15, 0);
        if (class11.field181 <= 0) {
            return;
        }
        int var16;
        if (class440.field6076 > 50) {
            var16 = 500 - (class440.field6076 * 5);
        } else {
            var16 = class440.field6076 * 5;
        }
        for (class630 var17 = (class630) class744.field10345.method21(2); var17 != null; var17 = (class630) class744.field10345.method9(-127)) {
            class325 var18 = class744.field10338.method3192((byte) 26, var17.field8387);
            if (class378.method2236(var18, 2)) {
                if (class507.field6768 == var17.field8387) {
                    int var19 = var17.field8396 * var7 / class744.field10367 + var9;
                    int var20 = (class744.field10359 - var17.field8390) * var8 / class744.field10359 + var10;
                    arg5.method489(4, 19, 4, var20 - 2, var19 + -2, var16 << 24 | 0xFFFF00);
                } else if (class208.field3086 != -1 && class208.field3086 == var18.field4622) {
                    int var21 = var17.field8396 * var7 / class744.field10367 + var9;
                    int var22 = (class744.field10359 - var17.field8390) * var8 / class744.field10359 + var10;
                    arg5.method489(4, 67, 4, var22 - 2, var21 + -2, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
    public static void method2324(byte arg0) {
        field5486 = null;
        if (arg0 < 114) {
            field5487 = 35;
        }
        field5484 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLee;Ljava/lang/String;)I")
    public static final int method2325(byte arg0, class677 arg1, String arg2) {
        field5483++;
        int var3 = arg1.field9419;
        byte[] var4 = class136.method1061(true, arg2);
        arg1.method3770(var4.length, 1182187312);
        arg1.field9419 += class210.field3096.method316((byte) -124, 0, arg1.field9399, var4, arg1.field9419, var4.length);
        if (arg0 != -98) {
            method2322(-107);
        }
        return arg1.field9419 - var3;
    }
}

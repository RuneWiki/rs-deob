import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class131 {

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "S")
    public static short field2051 = 32767;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
    public static boolean field2054 = false;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[J")
    public static long[] field2057 = new long[32];

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field2060 = -1;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(CI)C", line = 11)
    public static final char method938(char arg0, int arg1) {
        if (arg1 != -1) {
            method940((byte) -100, -6);
        }
        field2055++;
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 38)
    public static void method939(boolean arg0) {
        field2057 = null;
        if (!arg0) {
            method940((byte) -113, -74);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V", line = 54)
    public static final void method940(byte arg0, int arg1) {
        if (arg0 != -70) {
            field2057 = (long[]) null;
        }
        class241.field3856.method2175(arg1, -1401253017);
        field2049++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V", line = 67)
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg2 * arg2;
        int var9 = arg2;
        field2047++;
        int var10 = var8 << 1;
        int var11 = arg2 << 1;
        int var12 = var7 << 1;
        int var13 = (1 - var11) * var7 + var10;
        int var14 = var8 - ((var11 - 1) * var12);
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((arg2 << 1) - 3) * var12;
        int var18 = (arg2 - 1) * var15;
        int var19 = ((var6 << 1) + 3) * var10;
        if (arg0 != -22111) {
            return;
        }
        if (class119.field1817 <= arg5 && class141.field2187 >= arg5) {
            int var20 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg3 + arg4);
            int var21 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg4 - arg3);
            class272.method1876(class34.field525[arg5], var20, var21, arg1, (byte) -23);
        }
        int var22 = (var6 + 1) * var16;
        while (var9 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var22;
                    var13 += var19;
                    var19 += var16;
                    var6++;
                    var22 += var16;
                }
            }
            if (var14 < 0) {
                var6++;
                var14 += var22;
                var22 += var16;
                var13 += var19;
                var19 += var16;
            }
            var9--;
            int var23 = arg5 + var9;
            int var24 = arg5 - var9;
            if (class119.field1817 <= var23 && class141.field2187 >= var24) {
                int var25 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg4 + var6);
                int var26 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg4 - var6);
                if (class119.field1817 <= var24) {
                    class272.method1876(class34.field525[var24], var25, var26, arg1, (byte) -50);
                }
                if (class141.field2187 >= var23) {
                    class272.method1876(class34.field525[var23], var25, var26, arg1, (byte) -87);
                }
            }
            var14 += -var17;
            var17 -= var15;
            var13 += -var18;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V", line = 181)
    public class131(int arg0, int arg1, int arg2) {
        this.field2056 = arg0;
        this.field2059 = arg1;
        this.field2046 = arg2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public abstract void method6(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
    public abstract void method4(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)V")
    public abstract void method3(int arg0, byte arg1, int arg2);
}

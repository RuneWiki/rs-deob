import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class73 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1097 = new String[100];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "S")
    public static short field1098 = 1;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Ltm;")
    public static class334 field1099 = new class334(74, 4);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lmha;")
    public static class701 field1101 = new class701(64);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "J")
    public static long field1102;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBIIII)V")
    public static final void method661(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1100++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        if (arg1 > -67) {
            return;
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class76.field1126 <= arg5 && arg5 <= class461.field6699) {
            int var20 = class487.method2955(class184.field3102, class657.field9347, (byte) 77, arg0 + arg4);
            int var21 = class487.method2955(class184.field3102, class657.field9347, (byte) 34, arg4 - arg0);
            class608.method3484(class77.field1131[arg5], var21, -7, arg2, var20);
        }
        int var22 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class76.field1126 <= var24 && var23 <= class461.field6699) {
                int var25 = class487.method2955(class184.field3102, class657.field9347, (byte) 68, arg4 + var6);
                int var26 = class487.method2955(class184.field3102, class657.field9347, (byte) -87, arg4 - var6);
                if (class76.field1126 <= var23) {
                    class608.method3484(class77.field1131[var23], var26, -7, arg2, var25);
                }
                if (var24 <= class461.field6699) {
                    class608.method3484(class77.field1131[var24], var26, -7, arg2, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I)V")
    public abstract void method662(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()Ltc;")
    public abstract class73 method663();

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III[I)V")
    public abstract void method664(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(III[I)V")
    public abstract void method665(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
    public abstract void method666(int[] arg0);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public abstract void method667(int arg0);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method669(int arg0) {
        if (arg0 != -1779164959) {
            method661(104, (byte) 127, -35, 113, 32, 55);
        }
        field1097 = null;
        field1099 = null;
        field1101 = null;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public abstract void method670(int arg0);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public abstract void method671(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public abstract void method672(int arg0);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;)V")
    public abstract void method673(class73 arg0);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public abstract void method674(int arg0);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
    public abstract void method675(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public abstract void method676(int arg0);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V")
    public abstract void method677();

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public abstract void method678(int arg0);
}

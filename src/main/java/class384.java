import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class384 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5371 = 0;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lqr;")
    public static class65 field5373 = new class65(20);

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lqr;")
    public static class65 field5375 = new class65(4);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ldr;")
    public static class721 field5376 = new class721();

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lkaa;")
    public static class47 field5378 = new class47(64, 8);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[B)Ltia;", line = 4)
    public static final class270 method2272(byte arg0, byte[] arg1) {
        field5374++;
        class270 var2 = new class270();
        class677 var3 = new class677(arg1);
        var3.field9419 = var3.field9399.length - 2;
        int var4 = var3.method3807(arg0 ^ 0x2A);
        int var5 = var3.field9399.length - var4 - 2 - 12;
        var3.field9419 = var5;
        int var6 = var3.method3799(false);
        var2.field3777 = var3.method3807(-1);
        var2.field3782 = var3.method3807(-1);
        if (arg0 != -43) {
            return null;
        }
        var2.field3783 = var3.method3807(arg0 ^ 0x2A);
        var2.field3771 = var3.method3807(arg0 + 42);
        int var7 = var3.method3821((byte) 116);
        if (var7 > 0) {
            var2.field3774 = new class360[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3807(-1);
                class360 var10 = new class360(class737.method4119(var9, (byte) -128));
                var2.field3774[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method3799(false);
                    int var12 = var3.method3799(false);
                    var10.method2143(-1, new class651(var12), (long) var11);
                }
            }
        }
        var3.field9419 = 0;
        var2.field3772 = var3.method3794(arg0 ^ 0x5A);
        var2.field3773 = new int[var6];
        var2.field3775 = new String[var6];
        var2.field3776 = new int[var6];
        int var13 = 0;
        while (var3.field9419 < var5) {
            int var14 = var3.method3807(arg0 + 42);
            if (var14 == 3) {
                var2.field3775[var13] = var3.method3793(class712.method4000(arg0, -15557)).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3773[var13] = var3.method3821((byte) -15);
            } else {
                var2.field3773[var13] = var3.method3799(false);
            }
            var2.field3776[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method2273(int arg0, int arg1, int arg2) {
        int var3 = 109 / ((arg0 - 38) / 54);
        field5370++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lkf;IIIII)V", line = 101)
    public static final void method2274(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class225.field3201 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class735.field10163) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class143.field2290 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class701 var14 = class660.field8718[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class507.field6771[var11].method1742(var12, 83, var13) + class507.field6771[var11].method1742(var12 + 1, 120, var13) + class507.field6771[var11].method1742(var12, 86, var13 + 1) + class507.field6771[var11].method1742(var12 + 1, 105, var13 + 1)) / 4 - (class507.field6771[arg1].method1742(arg2, 103, arg3) + class507.field6771[arg1].method1742(arg2 + 1, 126, arg3) + class507.field6771[arg1].method1742(arg2, 123, arg3 + 1) + class507.field6771[arg1].method1742(arg2 + 1, 99, arg3 + 1)) / 4;
                                    class649 var16 = var14.field9729;
                                    class649 var17 = var14.field9739;
                                    if (var16 != null && var16.method798(115)) {
                                        arg0.method807(var16, class184.field2781, (var12 - arg2) * field5377 + (1 - arg4) * class307.field4416, 115, (var13 - arg3) * field5377 + (1 - arg5) * class307.field4416, var6, var15);
                                    }
                                    if (var17 != null && var17.method798(114)) {
                                        arg0.method807(var17, class184.field2781, (var12 - arg2) * field5377 + (1 - arg4) * class307.field4416, 112, (var13 - arg3) * field5377 + (1 - arg5) * class307.field4416, var6, var15);
                                    }
                                    for (class10 var18 = var14.field9742; var18 != null; var18 = var18.field174) {
                                        class675 var19 = var18.field170;
                                        if (var19 != null && var19.method798(110) && (var19.field9367 == var12 || var7 == var12) && (var19.field9354 == var13 || var9 == var13)) {
                                            int var20 = var19.field9361 + 1 - var19.field9367;
                                            int var21 = var19.field9360 + 1 - var19.field9354;
                                            arg0.method807(var19, class184.field2781, (var19.field9367 - arg2) * field5377 + (var20 - arg4) * class307.field4416, 113, (var19.field9354 - arg3) * field5377 + (var21 - arg5) * class307.field4416, var6, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 189)
    public static void method2275(int arg0) {
        field5378 = null;
        field5376 = null;
        field5373 = null;
        if (arg0 >= -74) {
            method2272((byte) -122, null);
        }
        field5375 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 206)
    public static final int method2276(int arg0, int arg1) {
        field5372++;
        int var2 = 0;
        if (arg0 <= 80) {
            field5371 = 50;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }
}

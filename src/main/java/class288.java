import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class288 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[I")
    public static int[] field4103 = new int[256];

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "D")
    public static double field4111 = -1.0D;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[B")
    public byte[] field4104;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[B")
    public byte[] field4113;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
    public static int[] field4106;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqa;Lto;IIIII)V", line = 4)
    public static final void method1826(class162 arg0, class8 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class190.field2830 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class151.field2408) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class261.field3792 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class429 var15 = class380.field5761[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class88.field1546[var12].method376(var13, var14) + class88.field1546[var12].method376(var13 + 1, var14) + class88.field1546[var12].method376(var13, var14 + 1) + class88.field1546[var12].method376(var13 + 1, var14 + 1)) / 4 - (class88.field1546[arg2].method376(arg3, arg4) + class88.field1546[arg2].method376(arg3 + 1, arg4) + class88.field1546[arg2].method376(arg3, arg4 + 1) + class88.field1546[arg2].method376(arg3 + 1, arg4 + 1)) / 4;
                                    class241 var17 = var15.field6370;
                                    class241 var18 = var15.field6365;
                                    if (var17 != null && var17.method24(false)) {
                                        arg1.method18((var13 - arg3) * class177.field2697 + (1 - arg5) * class130.field2075, arg0, var7, var17, -1, (var14 - arg4) * class177.field2697 + (1 - arg6) * class130.field2075, var16);
                                    }
                                    if (var18 != null && var18.method24(false)) {
                                        arg1.method18((var13 - arg3) * class177.field2697 + (1 - arg5) * class130.field2075, arg0, var7, var18, -1, (var14 - arg4) * class177.field2697 + (1 - arg6) * class130.field2075, var16);
                                    }
                                    for (class166 var19 = var15.field6364; var19 != null; var19 = var19.field2572) {
                                        class417 var20 = var19.field2576;
                                        if (var20 != null && var20.method24(false) && (var20.field6231 == var13 || var8 == var13) && (var20.field6238 == var14 || var10 == var14)) {
                                            int var21 = var20.field6235 + 1 - var20.field6231;
                                            int var22 = var20.field6226 + 1 - var20.field6238;
                                            arg1.method18((var20.field6231 - arg3) * class177.field2697 + (var21 - arg5) * class130.field2075, arg0, var7, var20, -1, (var20.field6238 - arg4) * class177.field2697 + (var22 - arg6) * class130.field2075, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 103)
    public static final void method1827(byte arg0) {
        field4108++;
        if (arg0 < 107) {
            return;
        }
        class334.field5047 = new class519(8);
        class494.field7308 = 0;
        for (class94 var1 = (class94) class286.field4081.method1640(false); var1 != null; var1 = (class94) class286.field4081.method1641(true)) {
            var1.method729();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 139)
    public static void method1828(int arg0) {
        field4103 = null;
        if (arg0 != 16716) {
            field4106 = null;
        }
        field4106 = null;
    }
}

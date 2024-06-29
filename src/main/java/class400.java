import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class400 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljw;")
    public static class581 field5840 = new class581(96, -2);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Ljw;")
    public static class581 field5841 = new class581(58, 2);

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method2499(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5842++;
        boolean var6 = true;
        class376 var7 = new class376(arg0);
        if (arg5 != 0) {
            return true;
        }
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method2385(-18919);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class589 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2370(arg5 ^ 0xFFFFFFFE);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method2398(-1372747256);
                                    }
                                    int var12 = var7.method2370(arg5 - 2);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFC4) >> 6;
                                    var15 = var7.method2398(-1372747256) >> 2;
                                    var16 = arg1 + var14;
                                    var17 = arg4 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg2 - 1));
                    } while (var17 >= arg3 - 1);
                    var18 = class350.field5132.method3732((byte) 43, var8);
                } while (var15 == 22 && class712.field9959.field1287.method1486(arg5 + 104) == 0 && var18.field7933 == 0 && var18.field7866 != 1 && !var18.field7913);
                var11 = true;
                if (!var18.method3285(117)) {
                    var6 = false;
                    class136.field2003++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method2500(int arg0) {
        field5840 = null;
        field5841 = null;
        if (arg0 != 0) {
            method2500(108);
        }
    }
}

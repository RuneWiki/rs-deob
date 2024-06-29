import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class324 extends class435 {

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[B")
    public byte[] field4303;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lao;")
    public static class191 field4304 = new class191(101, 8);

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
    public class324(byte[] arg0) {
        this.field4303 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method1912(int arg0) {
        field4304 = null;
        if (arg0 != 1) {
            method1912(21);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public static final void method1913(int arg0) {
        field4305++;
        class339.field4491 = new class450[class186.field2420.method2138(arg0 - 9)][];
        if (arg0 == 8) {
            class363.field4969 = new class450[class186.field2420.method2138(-1)][];
            class260.field3494 = new boolean[class186.field2420.method2138(arg0 - 9)];
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIII)V")
    public static final void method1914(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4306++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg2 >= -47) {
            method1912(-101);
        }
        if (class169.field2184 <= arg1 && class386.field5620 >= arg1) {
            int var20 = class406.method2491(class307.field4111, false, class91.field1086, arg5 + arg3);
            int var21 = class406.method2491(class307.field4111, false, class91.field1086, arg5 - arg3);
            class476.method2907(var20, 30, arg4, class5.field54[arg1], var21);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
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
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (var24 >= class169.field2184 && var23 <= class386.field5620) {
                int var25 = class406.method2491(class307.field4111, false, class91.field1086, arg5 + var6);
                int var26 = class406.method2491(class307.field4111, false, class91.field1086, arg5 - var6);
                if (class169.field2184 <= var23) {
                    class476.method2907(var25, 105, arg4, class5.field54[var23], var26);
                }
                if (var24 <= class386.field5620) {
                    class476.method2907(var25, 49, arg4, class5.field54[var24], var26);
                }
            }
        }
    }
}

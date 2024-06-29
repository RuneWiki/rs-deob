import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class249 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
    public int[] field3516 = new int[3];

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[Lkr;")
    public class447[] field3515 = new class447[100];

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "[I")
    public int[] field3523 = new int[100];

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[Lee;")
    public class404[] field3521 = new class404[8];

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3519 = null;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3517 = new String[100];

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lic;")
    public static class417 field3518;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field3520;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILg;)I", line = 4)
    public static final int method1672(int arg0, class87 arg1) {
        field3514++;
        String var2 = class203.method1318(arg0 + 1889368032, arg1);
        int[] var3 = null;
        if (class197.method1282((byte) 33, arg1.field1217)) {
            var3 = class51.method433((byte) 87, (int) arg1.field1216).field4950;
        } else if (class39.method370(arg1.field1217, 1010)) {
            class198 var4 = class98.field1358[(int) arg1.field1216];
            if (var4 != null) {
                var3 = var4.field2737.field4505;
            }
        } else if (class228.method1577(arg1.field1217, 44)) {
            if (arg1.field1217 == 1003) {
                var3 = class375.method2395((byte) 13, (int) arg1.field1216).field920;
            } else {
                var3 = class375.method2395((byte) 33, (int) (arg1.field1216 >>> 32 & 0x7FFFFFFFL)).field920;
            }
        }
        if (var3 != null) {
            var2 = var2 + class387.method2453(var3, true);
        }
        if (arg0 != -1889368032) {
            field3518 = null;
        }
        return class95.field1313.method2154(var2, false, class305.field4210);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 55)
    public static void method1673(int arg0) {
        field3517 = null;
        field3519 = null;
        field3518 = null;
        if (arg0 != -12294) {
            method1674(1, 110, -42, -88, 60, -30, -74);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V", line = 79)
    public static final void method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3525++;
        class453 var7 = class143.method983(arg6 ^ 0xFFFFFFFC, arg1, arg4);
        if (var7 == null) {
            return;
        }
        if (arg6 != 3) {
            method1672(120, (class87) null);
        }
        if (var7.field6352 != null) {
            class7 var8 = new class7();
            var8.field95 = var7;
            var8.field97 = var7.field6352;
            class177.method1168(var8);
        }
        class92.field1289 = arg3;
        class267.field3695 = arg2;
        class178.field2451 = arg4;
        class192.field2650 = arg0;
        class319.field4354 = arg5;
        class327.field4511 = true;
        class231.field3339 = arg1;
        if (var7 != null) {
            class325.field4444 = var7.field6452;
        }
        class404.method2531(arg6 ^ 0x68FD, var7);
    }
}

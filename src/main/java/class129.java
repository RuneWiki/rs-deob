import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class129 extends class254 {

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/lang/String;")
    public String field1887;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lqd;")
    public static class37 field1889 = new class37(50);

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field1891 = -1;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field1889 = null;
        if (arg0 != 104) {
            field1891 = -79;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIBI)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = arg3 - arg2;
        int var7 = arg1 - arg0;
        field1888++;
        if (var7 == 0) {
            if (var6 != 0) {
                class178.method1154((byte) -90, arg2, arg5, arg3, arg0);
            }
        } else if (var6 == 0) {
            class70.method482(-18, arg5, arg0, arg2, arg1);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg2 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class93.field1412 > arg0) {
                var11 = class93.field1412;
                var10 = var9 + (class93.field1412 * var8 >> 12);
            } else if (class142.field2061 >= arg0) {
                var10 = arg2;
                var11 = arg0;
            } else {
                var10 = (class142.field2061 * var8 >> 12) + var9;
                var11 = class142.field2061;
            }
            if (class93.field1418 > var10) {
                var10 = class93.field1418;
                var11 = (class93.field1418 - var9 << 12) / var8;
            } else if (var10 > class254.field3857) {
                var10 = class254.field3857;
                var11 = (class254.field3857 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class93.field1412 > arg1) {
                var12 = class93.field1412;
                var13 = (class93.field1412 * var8 >> 12) + var9;
            } else if (arg1 > class142.field2061) {
                var12 = class142.field2061;
                var13 = (class142.field2061 * var8 >> 12) + var9;
            } else {
                var13 = arg3;
                var12 = arg1;
            }
            int var14 = 96 % ((-arg4 - 47) / 54);
            if (var13 < class93.field1418) {
                var13 = class93.field1418;
                var12 = (class93.field1418 - var9 << 12) / var8;
            } else if (var13 > class254.field3857) {
                var13 = class254.field3857;
                var12 = (class254.field3857 - var9 << 12) / var8;
            }
            class225.method1472(var11, arg5, (byte) 21, var12, var10, var13);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    public static final void method894(int arg0, byte arg1) {
        int var2 = -67 / ((-arg1 - 49) / 50);
        field1890++;
        class255 var3 = (class255) class168.field2428.method1218((long) arg0, 110);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field3867.length; var4++) {
                var3.field3867[var4] = -1;
                var3.field3871[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class229 var7 = new class229();
        var7.field3437 = arg1 / 128;
        var7.field3425 = arg2 / 128;
        var7.field3435 = arg3 / 128;
        var7.field3439 = arg4 / 128;
        var7.field3434 = arg0;
        var7.field3423 = arg1;
        var7.field3444 = arg2;
        var7.field3426 = arg3;
        var7.field3433 = arg4;
        var7.field3438 = arg5;
        var7.field3428 = arg6;
        class54.field829[class162.field2336++] = var7;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class129(String arg0, int arg1) {
        this.field1887 = arg0;
    }
}

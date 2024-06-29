import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class78 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1123 = 2;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 7)
    public static final void method573(byte arg0) {
        field1124++;
        int[] var1 = new int[class75.field1097.field1713];
        int var2 = 0;
        for (int var3 = 0; var3 < class75.field1097.field1713; var3++) {
            class316 var5 = class75.field1097.method823(false, var3);
            if (var5.field4347 >= 0 || var5.field4329 >= 0) {
                var1[var2++] = var3;
            }
        }
        class7.field75 = new int[var2];
        if (arg0 != -58) {
            field1127 = -27;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class7.field75[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 49)
    public static final void method574(int arg0) {
        field1125++;
        class105.field1433.method3076((byte) -89);
        for (class149 var1 = (class149) class260.field3585.method3072((byte) 45); var1 != null; var1 = (class149) class260.field3585.method3066(2)) {
            if (var1.field2102 < 1000) {
                var1.method2946(-128);
                class105.field1433.method3070(var1, (byte) -123);
            }
        }
        class105.field1433.method3067(class260.field3585, 104);
        int var2 = -1;
        class386 var3 = (class386) class192.field2700.method3072((byte) 53);
        int var4 = 124 / ((43 - arg0) / 55);
        if (var3 != null) {
            var2 = var3.method2217(2879);
        }
        if (!class9.field86) {
            if (var2 == 0 && (class17.field186 == 1 && class370.field5198 > 2 || class239.method1386(-97))) {
                var2 = 2;
            }
            if (var2 == 2 && class370.field5198 > 0 && var3 != null) {
                if (class292.field3914 == null && field1127 == 0) {
                    class190.method1145(var3.method2220(-1243743073), var3.method2221(-3), 26);
                } else {
                    class13.field147 = 2;
                }
            }
            if (var2 == 0 && class370.field5198 > 0) {
                class511.method3000((byte) 122);
            }
            if (class292.field3914 == null && field1127 == 0) {
                class173.field2480 = null;
                class13.field147 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var5 = class332.field4528.method54(38);
            int var6 = class332.field4528.method55((byte) -45);
            if (var5 < class267.field3662 - 10 || class312.field4293 + class267.field3662 + 10 < var5 || class217.field3071 - 10 > var6 || var6 > (class224.field3155 + class217.field3071 + 10)) {
                class9.field86 = false;
                class469.method2758(class312.field4293, class217.field3071, class224.field3155, class267.field3662, 0);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var7 = class267.field3662;
        int var8 = class217.field3071;
        int var9 = class312.field4293;
        int var10 = var3.method2220(-1243743073);
        int var11 = var3.method2221(-3);
        int var12 = -1;
        for (int var13 = 0; var13 < class370.field5198; var13++) {
            if (class205.field2910) {
                int var17 = (class370.field5198 - var13 - 1) * 16 + var8 + 33;
                if (var10 > var7 && (var7 + var9) > var10 && (var17 - 13) < var11 && var11 < var17 + 4) {
                    var12 = var13;
                }
            } else {
                int var18 = (class370.field5198 - var13 - 1) * 16 + var8 + 31;
                if (var10 > var7 && (var7 + var9) > var10 && var18 - 13 < var11 && var11 < (var18 + 3)) {
                    var12 = var13;
                }
            }
        }
        if (var12 != -1) {
            int var14 = 0;
            class384 var15 = new class384(class260.field3585);
            for (class149 var16 = (class149) var15.method2203(false); var16 != null; var16 = (class149) var15.method2205(1317274464)) {
                if (var12 == var14) {
                    class299.method1711(false, var16, var10, var11);
                }
                var14++;
            }
        }
        class9.field86 = false;
        class469.method2758(class312.field4293, class217.field3071, class224.field3155, class267.field3662, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([BIIIIBI)Z", line = 202)
    public static final boolean method575(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1126++;
        int var7 = arg2 % arg3;
        int var8 = 23 % ((-arg5 - 18) / 54);
        int var9;
        if (var7 == 0) {
            var9 = 0;
        } else {
            var9 = arg3 - var7;
        }
        int var10 = -((arg4 - (1 - arg3)) / arg3);
        int var11 = -((arg2 + arg3 - 1) / arg3);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg0[arg6] == 0) {
                    return true;
                }
                arg6 += arg3;
            }
            int var14 = arg6 - var9;
            if (arg0[var14 - 1] == 0) {
                return true;
            }
            arg6 = arg1 + var14;
        }
        return false;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lv;")
    public static class147 field503 = new class147(64);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        if (arg0 > -117) {
            field506 = -34;
        }
        field503 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsa;IZIZI)V")
    public static final void method263(class249 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field502++;
        if (class17.field386 >= 50 || arg0.field4415 == null || arg0.field4415.length <= arg5 || arg0.field4415[arg5] == null) {
            return;
        }
        int var6 = arg0.field4415[arg5][0];
        if (!arg2) {
            field503 = null;
        }
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        int var9 = (var6 & 0x74) >> 4;
        if (arg0.field4415[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field4415[arg5].length);
            if (var10 > 0) {
                var7 = arg0.field4415[arg5][var10];
            }
        }
        if (var8 == 0) {
            if (arg4) {
                class214.method1478((byte) 74, var9, var7, 0);
            }
        } else if (class231.field4020 != 0) {
            class88.field1526[class17.field386] = var7;
            class179.field3144[class17.field386] = var9;
            class110.field1982[class17.field386] = 0;
            class190.field3361[class17.field386] = null;
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            class26.field491[class17.field386] = (var11 << 16) + (var12 << 8) + var8;
            class17.field386++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field501++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class106.field1924 = -1;
            class47.field840 = -1;
            return;
        }
        int var8 = class37.method333(arg0, 1637367879, class124.field2174, arg3) - arg5;
        int var9 = arg3 - class176.field3099;
        int var10 = arg0 - class77.field1403;
        int var11 = class3.field24[class111.field2004];
        int var12 = var8 - class263.field4681;
        int var13 = class3.field21[class111.field2004];
        int var14 = class3.field21[class248.field4397];
        int var15 = class3.field24[class248.field4397];
        int var16 = var9 * var15 + var10 * var14 >> 16;
        int var17 = var10 * var15 - (var9 * var14) >> 16;
        if (arg7 >= -15) {
            field506 = 46;
        }
        int var19 = var11 * var12 - (var13 * var17) >> 16;
        int var20 = var11 * var17 + var12 * var13 >> 16;
        if (var20 < 50) {
            class106.field1924 = -1;
            class47.field840 = -1;
        } else {
            class106.field1924 = (var19 << 9) / var20 + arg1;
            class47.field840 = (var16 << 9) / var20 + arg4;
        }
    }
}

import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class168 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field2432 = -1;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Leo;")
    public static class443 field2433 = new class443(13, 3);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2434 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lap;")
    public static class310 field2435 = new class310(59, -1);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lrc;")
    public static class108 field2436 = new class108(40, 5);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
    public static int[] field2437 = new int[8];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ltq;")
    public static class248 field2431;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1218(boolean arg0, int arg1) {
        if (arg1 != 3) {
            method1218(true, -31);
        }
        field2428++;
        for (class31 var2 = (class31) class428.field5975.method775(arg1 - 2); var2 != null; var2 = (class31) class428.field5975.method763(0)) {
            if (var2.field335 != null) {
                class332.field4613.method2406(var2.field335);
                var2.field335 = null;
            }
            if (var2.field318 != null) {
                class332.field4613.method2406(var2.field318);
                var2.field318 = null;
            }
            var2.method2714(99);
        }
        if (!arg0) {
            return;
        }
        for (class31 var3 = (class31) class357.field4928.method775(arg1 - 2); var3 != null; var3 = (class31) class357.field4928.method763(0)) {
            if (var3.field335 != null) {
                class332.field4613.method2406(var3.field335);
                var3.field335 = null;
            }
            var3.method2714(86);
        }
        for (class31 var4 = (class31) class218.field3152.method1097(64); var4 != null; var4 = (class31) class218.field3152.method1105(false)) {
            if (var4.field335 != null) {
                class332.field4613.method2406(var4.field335);
                var4.field335 = null;
            }
            var4.method2714(arg1 ^ 0x50);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V", line = 69)
    public static final void method1219(int arg0, int arg1, byte arg2) {
        field2429++;
        if (class478.field6792 != arg0) {
            class151.field2084 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class151.field2084[var3] = (var3 << 12) / arg0;
            }
            class478.field6792 = arg0;
            class96.field1354 = arg0 * 32;
            class205.field3007 = arg0 - 1;
        }
        if (arg2 != -12) {
            field2437 = null;
        }
        if (class129.field1772 == arg1) {
            return;
        }
        if (class478.field6792 == arg1) {
            class379.field5216 = class151.field2084;
        } else {
            class379.field5216 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class379.field5216[var4] = (var4 << 12) / arg1;
            }
        }
        class129.field1772 = arg1;
        class301.field4265 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 117)
    public static final void method1220(byte arg0) {
        field2430++;
        if (class111.field1569 == -1 || class15.field149 == -1) {
            return;
        }
        int var1 = ((class135.field1883 - class313.field4428) * class88.field1245 >> 16) + class313.field4428;
        class88.field1245 += var1;
        if (class88.field1245 < 65535) {
            class295.field4165 = false;
            class20.field215 = false;
        } else {
            if (class20.field215) {
                class295.field4165 = false;
            } else {
                class295.field4165 = true;
            }
            class88.field1245 = 65535;
            class20.field215 = true;
        }
        float var2 = (float) class88.field1245 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class354.field4865 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class468.field6597[class111.field1569][var4][var5] * 3;
            int var23 = class468.field6597[class111.field1569][var4 + 1][var5] * 3;
            int var24 = (class468.field6597[class111.field1569][var4 + 2][var5] + class468.field6597[class111.field1569][var4 + 2][var5] - class468.field6597[class111.field1569][var4 + 3][var5]) * 3;
            int var25 = class468.field6597[class111.field1569][var4][var5];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - var23 * 2;
            int var28 = class468.field6597[class111.field1569][var4 + 2][var5] - var25 - (-var23 + var24);
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class184.field2784 = (int) var3[2] - (class189.field2810 * 128);
        class303.field4302 = (int) var3[1] * -1;
        class135.field1884 = (int) var3[0] - class279.field4012 * 128;
        float[] var6 = new float[3];
        int var7 = class313.field4425 * 2;
        int var8 = -23 / ((59 - arg0) / 61);
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class468.field6597[class15.field149][var7][var9] * 3;
            int var16 = class468.field6597[class15.field149][var7 + 1][var9] * 3;
            int var17 = (class468.field6597[class15.field149][var7 + 2][var9] + class468.field6597[class15.field149][var7 + 2][var9] - class468.field6597[class15.field149][var7 - -3][var9]) * 3;
            int var18 = class468.field6597[class15.field149][var7][var9];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = class468.field6597[class15.field149][var7 + 2][var9] - var18 - (-var16 + var17);
            var6[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var6[0] - var3[0];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        float var12 = var6[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class366.field5028 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class103.field1455 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class158.field2258 = ((class468.field6597[class111.field1569][var4 + 2][3] - class468.field6597[class111.field1569][var4][3]) * class88.field1245 >> 16) + class468.field6597[class111.field1569][var4][3];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 223)
    public static void method1221(int arg0) {
        field2433 = null;
        field2436 = null;
        field2434 = null;
        field2435 = null;
        field2437 = null;
        if (arg0 == -30538) {
            field2431 = null;
        }
    }
}

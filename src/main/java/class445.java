import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class445 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field6418 = 0;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[Lql;")
    public static class437[] field6422 = new class437[32768];

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field6423 = 0;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILtr;)Z", line = 3)
    public static final boolean method2777(int arg0, class161 arg1) {
        field6425++;
        class369 var2 = class310.method1961(arg1.method126(-13482), (byte) 35);
        if (var2.field5206 == -1) {
            return true;
        } else {
            class139 var3 = class387.method2531(var2.field5206, (byte) -80);
            return ~var3.field1978 == arg0 ? true : var3.method953(86);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)I", line = 24)
    public static final int method2778(boolean arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field6421++;
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0) {
            method2779(70);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2779(int arg0) {
        field6420++;
        while (class393.field5747.method156(class120.field1712, false) >= 11) {
            int var1 = class393.field5747.method163(11, -114);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class12.field153[var1] == null) {
                class12.field153[var1] = new class354();
                class12.field153[var1].field862 = var1;
                if (class257.field3502[var1] != null) {
                    class12.field153[var1].method2289(-1264, class257.field3502[var1]);
                }
                var2 = true;
            }
            class67.field1055[class169.field2407++] = var1;
            class354 var3 = class12.field153[var1];
            var3.field874 = class35.field541;
            int var4 = class393.field5747.method163(5, -95);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class393.field5747.method163(5, -99);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class389.field5706[class393.field5747.method163(3, -94)];
            int var7 = class393.field5747.method163(1, -101);
            if (var7 == 1) {
                class243.field3364[class54.field795++] = var1;
            }
            int var8 = class393.field5747.method163(1, -107);
            if (var2) {
                var3.method417((byte) -117, var6);
            }
            var3.method2294(false, class307.field4211.field944[0] + var5, var8 == 1, class307.field4211.field956[0] + var4, class265.field3617);
        }
        int var9 = -72 / ((49 - arg0) / 51);
        class393.field5747.method157(-82);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lnq;", line = 106)
    public static final class266 method2780(int arg0, int arg1) {
        field6424++;
        class266 var2 = (class266) class377.field5379.method1246((byte) -49, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class233.field3147.method1920(arg0, false, 29);
        class266 var4 = new class266();
        if (var3 != null) {
            var4.method1646(arg0, 0, new class371(var3));
        }
        class377.field5379.method1247((long) arg0, (byte) 112, var4);
        return arg1 == 29948 ? var4 : null;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 138)
    public static void method2781(int arg0) {
        if (arg0 != 23613) {
            method2779(-109);
        }
        field6422 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lla;I)Lla;")
    public abstract class262 method1330(class262 arg0, int arg1);
}

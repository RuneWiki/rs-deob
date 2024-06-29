import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class143 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lqi;")
    public static class269[] field2298 = new class269[8];

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lui;")
    public static class98 field2297 = new class98(64);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field2301 = new int[14];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    public static int[] field2300 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Z")
    public static volatile boolean field2304 = true;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lui;")
    public static class98 field2302 = new class98(16);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1009(int arg0) {
        if (arg0 != 2485) {
            field2299 = -124;
        }
        field2293++;
        if (class346.field5553 == 10 && class245.field3886) {
            class310.method2165(arg0 - 2480, 28);
        }
        if (class346.field5553 == 30) {
            class310.method2165(5, 25);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lle;", line = 35)
    public static final class137 method1010(int arg0) {
        int var1 = class94.field1379[arg0] * class322.field5289[0];
        field2292++;
        byte[] var2 = class105.field1522[0];
        class137 var5;
        if (class104.field1505[0]) {
            byte[] var6 = class233.field3709[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class167.method1160(class201.field3085[class235.method1623(var2[var8], 255)], class235.method1623(-16777216, var6[var8] << 24));
            }
            var5 = new class362(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class201.field3085[class235.method1623(255, var2[var4])];
            }
            var5 = new class137(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], var3);
        }
        class167.method1164(false);
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 77)
    public static void method1011(byte arg0) {
        field2301 = null;
        field2298 = null;
        field2302 = null;
        field2297 = null;
        if (arg0 > -122) {
            method1012(-98, true, true, -81, 66);
        }
        field2300 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZZII)V", line = 94)
    public static final void method1012(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field2295++;
        class268.method1888(class105.field1524.length + arg4, arg3, 0, arg0, (byte) -88, arg2, arg1);
    }
}

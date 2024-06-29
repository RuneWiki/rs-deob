import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class390 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field5758 = new int[1000];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field5763 = -1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2404(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5757++;
        int var6 = class198.method1192(class189.field2831, class204.field3060, arg1, -3);
        if (arg4 != -90) {
            method2407(-57, -34, false, -53);
        }
        int var7 = class198.method1192(class189.field2831, class204.field3060, arg3, arg4 ^ 0x5B);
        int var8 = class198.method1192(class192.field2917, class39.field497, arg2, arg4 ^ 0x5B);
        int var9 = class198.method1192(class192.field2917, class39.field497, arg5, -3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class379.method2285(arg4 ^ 0xFFFFFFD9, class292.field4448[var10], var9, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
    public static final int method2405(int arg0) {
        if (arg0 == -13794) {
            field5759++;
            return class25.field325;
        } else {
            return -26;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method2406(byte arg0) {
        field5762++;
        if (arg0 > -85) {
            return;
        }
        int var1 = class307.field4634;
        int[] var2 = class201.field3038;
        for (int var3 = 0; var3 < var1; var3++) {
            class169 var4 = class140.field1883[var2[var3]];
            if (var4 != null) {
                class376.method2266(var4, var4.method911(0), 114);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method2407(int arg0, int arg1, boolean arg2, int arg3) {
        field5761++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = arg3 + var4; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - arg0 * arg1;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
    public static final boolean method2408(int arg0) {
        if (arg0 != 0) {
            return true;
        }
        field5764++;
        try {
            return class447.method2761(1);
        } catch (IOException var4) {
            class81.method522(arg0 + 43);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class288.field4384 == null ? -1 : class288.field4384.method2803(true)) + "," + (class261.field3980 == null ? -1 : class261.field3980.method2803(true)) + "," + (class299.field4532 == null ? -1 : class299.field4532.method2803(true)) + " - " + class44.field547 + "," + (class17.field250 + class113.field1500.field2019[0]) + "," + (class113.field1500.field2018[0] + class112.field1487) + " - ";
            for (int var3 = 0; class44.field547 > var3 && var3 < 50; var3++) {
                var2 = var2 + class424.field6232.field5685[var3] + ",";
            }
            class288.method1783(var2, var5, 123);
            class77.method504((byte) 72);
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public static void method2409(int arg0) {
        field5758 = null;
        if (arg0 != 0) {
            method2408(-118);
        }
    }
}

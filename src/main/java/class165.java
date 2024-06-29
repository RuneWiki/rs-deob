import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class165 {

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Z")
    public boolean field2348 = true;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
    public static int[] field2340 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lnh;")
    public static class305 field2345;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
    public static int[] field2342;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        field2345 = null;
        field2340 = null;
        field2342 = null;
        if (arg0 != 33) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLim;I)I")
    public static final int method1052(boolean arg0, class178 arg1, int arg2) {
        field2339++;
        if (!client.method2028(arg1).method1992((byte) 88, arg2) && arg1.field2641 == null) {
            return -1;
        } else {
            if (!arg0) {
                method1051((byte) -53);
            }
            return arg1.field2610 == null || arg2 >= arg1.field2610.length ? -1 : arg1.field2610[arg2];
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public static final void method1053(int arg0, int arg1, int arg2) {
        if (arg0 != 65280) {
            method1051((byte) -127);
        }
        int var3 = 0;
        short var4 = 256;
        int var5 = 0;
        field2338++;
        if (class34.field522 > 0) {
            class154.method966(103, class34.field522);
            class34.field522 = 0;
        }
        int var6 = class266.field4275 * arg2;
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var8 = (var4 - var7) * class96.field1390[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class266.field4282[var6++ + arg1];
                int var12 = class129.field1795[var3++];
                if (var12 == 0) {
                    class187.field2837.field3058[var5++] = var11;
                } else {
                    int var13 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var12 - 18;
                    int var15 = class72.field1041[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class187.field2837.field3058[var5++] = class32.method199(class32.method199(var15, 16711935) * var13 + class32.method199(16711935, var11) * var14, -16711936) + class32.method199(16711680, class32.method199(var15, 65280) * var13 + var14 * class32.method199(65280, var11)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class187.field2837.field3058[var5++] = class266.field4282[arg1 + (var6++)];
            }
            var6 += class266.field4275 - 128;
        }
        class187.field2837.method682(arg1, arg2);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnh;I)V")
    public static final void method1054(class305 arg0, int arg1) {
        class245.field3835 = arg0;
        if (arg1 < 91) {
            field2345 = null;
        }
        field2344++;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2341 = arg5;
        this.field2348 = arg6;
        this.field2347 = arg4;
        this.field2343 = arg0;
        this.field2349 = arg2;
        this.field2350 = arg3;
        this.field2346 = arg1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class236 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field3793 = new int[5];

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[S")
    public static short[] field3794 = new short[256];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lwf;")
    public static class306 field3795;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient;")
    public static client field3790;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([I)V", line = 3)
    public class236(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3788 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3788[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3788[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3788[var5 + var5] = arg0[var4];
            this.field3788[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 40)
    public static void method1610(byte arg0) {
        field3794 = null;
        field3795 = null;
        field3793 = null;
        int var1 = -128 / ((49 - arg0) / 47);
        field3790 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIILfe;IJ)Z", line = 51)
    public static final boolean method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class229.method1570(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 66)
    public final int method1612(int arg0, int arg1) {
        field3792++;
        int var3 = (this.field3788.length >> 1) - 1;
        if (arg0 != -9812) {
            this.method1612(-5, -106);
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3788[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3788[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 101)
    public static final void method1613(byte arg0) {
        while (true) {
            if (class230.field3713.method2070((byte) 76, class85.field1284) >= 11) {
                int var1 = class230.field3713.method2072(11, false);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class64.field966[var1] == null) {
                        var2 = true;
                        class64.field966[var1] = new class82();
                        if (class70.field1050[var1] != null) {
                            class64.field966[var1].method566(class70.field1050[var1], -1);
                        }
                    }
                    class174.field2645[class175.field2678++] = var1;
                    class82 var3 = class64.field966[var1];
                    var3.field527 = class343.field5341;
                    int var4 = class230.field3713.method2072(1, false);
                    if (var4 == 1) {
                        class105.field1619[class142.field2248++] = var1;
                    }
                    int var5 = class230.field3713.method2072(1, false);
                    int var6 = class230.field3713.method2072(5, false);
                    int var7 = class230.field3713.method2072(5, false);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class303.field4677[class230.field3713.method2072(3, false)];
                    if (var2) {
                        var3.field520 = var3.field564 = var8;
                    }
                    var3.method567(var5 == 1, -25545, class79.field1173.field476[0] + var7, class79.field1173.field505[0] + var6);
                    continue;
                }
            }
            if (arg0 <= 22) {
                method1610((byte) -95);
            }
            class230.field3713.method2062(8);
            field3791++;
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lwf;BLwf;)V", line = 165)
    public static final void method1614(class306 arg0, byte arg1, class306 arg2) {
        class151.field2383 = arg0;
        class100.field1558 = arg2;
        class118.field1826 = class151.field2383.method2086(0, 3);
        if (arg1 > -97) {
            method1610((byte) -94);
        }
        field3789++;
    }
}

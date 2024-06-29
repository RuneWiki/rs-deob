import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class383 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ldq;")
    public static class493 field5045;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
    public long field5043;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lnd;")
    public class383 field5042;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lnd;")
    public class383 field5047;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method2164(boolean arg0) {
        field5048++;
        class256.field3254.method154(7491);
        for (class520 var1 = (class520) class201.field2616.method153(0); var1 != null; var1 = (class520) class201.field2616.method161(-105)) {
            if (var1.field7508 < 1000) {
                var1.method2165(16225);
                class256.field3254.method163(var1, 0);
            }
        }
        if (!arg0) {
            method2168(73);
        }
        class256.field3254.method160((byte) 58, class201.field2616);
        int var2 = -1;
        class494 var3 = (class494) class53.field706.method153(0);
        if (var3 != null) {
            var2 = var3.method2152(false);
        }
        if (!class122.field1646) {
            if (var2 == 0 && (class295.field3791 == 1 && class2.field24 > 2 || class52.method518(13))) {
                var2 = 2;
            }
            if (var2 == 2 && class2.field24 > 0 && var3 != null) {
                if (class233.field2985 == null && class446.field6396 == 0) {
                    class324.method1898((byte) 37, var3.method2151(-91), var3.method2155((byte) -16));
                } else {
                    class165.field2105 = 2;
                }
            }
            if (var2 == 0 && class2.field24 > 0) {
                class415.method2451(-66);
            }
            if (class233.field2985 == null && class446.field6396 == 0) {
                class165.field2105 = 0;
                class533.field7844 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class204.field2664.method1333(7);
            int var5 = class204.field2664.method1337(69);
            if (var4 < (class325.field4128 - 10) || (class325.field4128 + class117.field1580 + 10) < var4 || class14.field229 - 10 > var5 || class337.field4242 + class14.field229 + 10 < var5) {
                class293.method1720(8526);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class325.field4128;
        int var7 = class14.field229;
        int var8 = class117.field1580;
        int var9 = var3.method2151(-128);
        int var10 = var3.method2155((byte) -31);
        int var11 = -1;
        for (int var12 = 0; var12 < class2.field24; var12++) {
            if (class163.field2075) {
                int var16 = var7 - (-((class2.field24 - var12 - 1) * 16) - 33);
                if (var9 > var6 && var9 < var6 + var8 && var10 > var16 - 13 && var10 < var16 + 4) {
                    var11 = var12;
                }
            } else {
                int var17 = (class2.field24 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var17 - 13 < var10 && var17 + 3 > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class50 var14 = new class50(class201.field2616);
            for (class520 var15 = (class520) var14.method514(-110); var15 != null; var15 = (class520) var14.method512((byte) -53)) {
                if (var11 == var13) {
                    class249.method1510(var15, var9, (byte) 2, var10);
                }
                var13++;
            }
        }
        class293.method1720(8526);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method2165(int arg0) {
        if (arg0 != 16225) {
            return;
        }
        field5041++;
        if (this.field5047 != null) {
            this.field5047.field5042 = this.field5042;
            this.field5042.field5047 = this.field5047;
            this.field5047 = null;
            this.field5042 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
    public final boolean method2166(int arg0) {
        field5044++;
        if (arg0 != 0) {
            field5045 = null;
        }
        return this.field5047 != null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IFI[BLhs;IIFFIFIFI)V")
    public static final void method2167(int arg0, float arg1, int arg2, byte[] arg3, class215 arg4, int arg5, int arg6, float arg7, float arg8, int arg9, float arg10, int arg11, float arg12, int arg13) {
        field5046++;
        int var14 = arg0 * arg6;
        float[] var15 = new float[var14];
        int var16 = 0;
        if (arg13 != -26706) {
            return;
        }
        while (arg2 > var16) {
            int var19 = arg9;
            arg4.method967(arg0, arg1 / (float) arg6, 0, arg6, arg11, arg8 * 127.0F, (byte) -94, var15, arg12 / (float) arg11, arg5, arg10 / (float) arg0);
            arg12 *= 2.0F;
            arg10 *= 2.0F;
            arg1 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg3[var19] = (byte) ((int) ((float) arg3[var19] + var15[var20]));
                var19++;
            }
            arg8 = arg7 * arg8;
            var16++;
        }
        int var17 = arg9;
        for (int var18 = 0; var18 < var14; var18++) {
            arg3[var17] = (byte) (arg3[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method2168(int arg0) {
        field5045 = null;
        if (arg0 != 127) {
            field5049 = -4;
        }
    }

    static {
        new class335("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field5045 = new class493(25, 8);
    }
}

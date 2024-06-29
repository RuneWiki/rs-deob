import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Llga;")
    private class711 field252 = new class711();

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lkk;")
    private class188 field251;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILaf;)V", line = 3)
    private final void method85(int arg0, class435 arg1) {
        field257++;
        long var3 = arg1.method1942(true);
        if (arg0 != -2) {
            this.method96(null, null, 0, 47);
        }
        for (class640 var5 = (class640) this.field251.method1180((byte) 26, var3); var5 != null; var5 = (class640) this.field251.method1174(0)) {
            if (var5.field8790.method1945(-123, arg1)) {
                this.method98(var5, 97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I", line = 29)
    public final int method86(int arg0) {
        if (arg0 == 0) {
            field262++;
            return this.field253;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)I", line = 42)
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            this.method97(null, (byte) -48, null);
        }
        field263++;
        return this.field256;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 53)
    public final void method88(int arg0) {
        field265++;
        if (arg0 != 1) {
            this.method96(null, null, 19, -61);
        }
        for (class640 var2 = (class640) this.field252.method4000((byte) -7); var2 != null; var2 = (class640) this.field252.method4002(-128)) {
            if (var2.method1226(16311)) {
                var2.method1185(arg0 ^ 0xFFFFFFD4);
                var2.method3311(arg0 + 99);
                this.field256 += var2.field8792;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lfp;Lfp;BI)V", line = 79)
    public static final void method89(class323 arg0, class323 arg1, byte arg2, int arg3) {
        if (arg2 != 118) {
            field266 = 101;
        }
        field269++;
        class681.field9333 = arg0;
        class519.field7383 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 93)
    public static final void method90(byte arg0) {
        field254++;
        class68 var1 = null;
        try {
            class249 var2 = class202.field2644.method2048(true, "2", -4053);
            while (var2.field3310 == 0) {
                class756.method4205(1L, arg0 ^ 0x37);
            }
            if (var2.field3310 == 1) {
                var1 = (class68) var2.field3311;
                byte[] var3 = new byte[(int) var1.method561((byte) 69)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method565(var4, (byte) -80, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class30.method180(90, new class675(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 != 55) {
                method94(-100, 74, 9, 64, 96, -14, 43);
            }
            if (var1 != null) {
                var1.method562(-114);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V", line = 142)
    public final void method91(boolean arg0) {
        this.field252.method4003(3);
        field261++;
        this.field251.method1175((byte) 88);
        this.field256 = this.field253;
        if (arg0) {
            method94(-4, -108, -9, 100, 53, 74, 69);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(ILaf;)Ljava/lang/Object;", line = 155)
    public final Object method92(int arg0, class435 arg1) {
        field268++;
        long var3 = arg1.method1942(true);
        if (arg0 != 0) {
            this.field253 = 9;
        }
        for (class640 var5 = (class640) this.field251.method1180((byte) 26, var3); var5 != null; var5 = (class640) this.field251.method1174(0)) {
            if (var5.field8790.method1945(-118, arg1)) {
                Object var6 = var5.method1227(-11907);
                if (var6 != null) {
                    if (var5.method1226(16311)) {
                        class636 var7 = new class636(arg1, var6, var5.field8792);
                        this.field251.method1179(var5.field2546, var7, (byte) -26);
                        this.field252.method3999(var7, arg0 + 21934);
                        var7.field8207 = 0L;
                        var5.method1185(-67);
                        var5.method3311(100);
                    } else {
                        this.field252.method3999(var5, arg0 + 21934);
                        var5.field8207 = 0L;
                    }
                    return var6;
                }
                var5.method1185(-117);
                var5.method3311(100);
                this.field256 += var5.field8792;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V", line = 210)
    public final void method93(int arg0, int arg1) {
        field260++;
        if (class373.field5237 != null) {
            for (class640 var3 = (class640) this.field252.method4000((byte) -7); var3 != null; var3 = (class640) this.field252.method4002(-41)) {
                if (var3.method1226(16311)) {
                    if (var3.method1227(-11907) == null) {
                        var3.method1185(-114);
                        var3.method3311(100);
                        this.field256 += var3.field8792;
                    }
                } else if ((long) arg1 < ++var3.field8207) {
                    class640 var4 = class373.field5237.method990((byte) 31, var3);
                    this.field251.method1179(var3.field2546, var4, (byte) -26);
                    class375.method2357(var4, 1589, var3);
                    var3.method1185(-78);
                    var3.method3311(100);
                }
            }
        }
        int var5 = 14 / ((arg0 + 50) / 63);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)V", line = 259)
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field267++;
        int var7 = arg5 + arg6;
        int var8 = arg1 - arg6;
        for (int var9 = arg5; var9 < var7; var9++) {
            class643.method3557(arg2, class445.field6320[var9], (byte) 114, arg4, arg0);
        }
        int var10 = arg2 + arg6;
        int var11 = arg0 - arg6;
        if (arg3 != 1) {
            method90((byte) 52);
        }
        for (int var12 = arg1; var12 > var8; var12--) {
            class643.method3557(arg2, class445.field6320[var12], (byte) 108, arg4, arg0);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class445.field6320[var13];
            class643.method3557(arg2, var14, (byte) 70, arg4, var10);
            class643.method3557(var11, var14, (byte) 82, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([[II)V", line = 303)
    public static final void method95(int[][] arg0, int arg1) {
        if (arg1 > 101) {
            class445.field6320 = arg0;
            field259++;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Object;Laf;II)V", line = 320)
    private final void method96(Object arg0, class435 arg1, int arg2, int arg3) {
        field258++;
        if (this.field253 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method85(-2, arg1);
        this.field256 -= arg3;
        while (this.field256 < 0) {
            class640 var6 = (class640) this.field252.method3997(0);
            this.method98(var6, -116);
        }
        class636 var5 = new class636(arg1, arg0, arg3);
        if (arg2 < 54) {
            this.field256 = -23;
        }
        this.field251.method1179(arg1.method1942(true), var5, (byte) -26);
        this.field252.method3999(var5, 21934);
        var5.field8207 = 0L;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Object;BLaf;)V", line = 354)
    public final void method97(Object arg0, byte arg1, class435 arg2) {
        this.method96(arg0, arg2, arg1 + 184, 1);
        if (arg1 != -126) {
            this.field253 = -63;
        }
        field255++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lor;I)V", line = 365)
    private final void method98(class640 arg0, int arg1) {
        int var3 = 33 / ((-arg1 - 75) / 39);
        if (arg0 != null) {
            arg0.method1185(-34);
            arg0.method3311(100);
            this.field256 += arg0.field8792;
        }
        field264++;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V", line = 386)
    public class14(int arg0) {
        this.field256 = arg0;
        this.field253 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field251 = new class188(var2);
    }
}

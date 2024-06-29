import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class24 extends class322 {

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "[I")
    private int[] field292 = new int[this.field5117];

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "[I")
    public static int[] field298 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "[B")
    private byte[] field293;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "[[B")
    public static byte[][] field295;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 6)
    public final void method154(int arg0, int arg1, int arg2) {
        field291++;
        this.field299 += this.field292[arg2] * arg1 >> 12;
        if (arg0 != 2) {
            field295 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)V", line = 17)
    public void method155(int arg0, byte arg1) {
        this.field293[this.field303++] = (byte) (class343.method2418(arg1 >> 1, 127) + 127);
        field297++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 28)
    public final void method156(int arg0) {
        this.field303 = 0;
        if (arg0 <= 93) {
            field289 = 70;
        }
        field300++;
        this.field299 = 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 43)
    public static void method157(int arg0) {
        field298 = null;
        field295 = (byte[][]) null;
        if (arg0 != -19302) {
            field289 = -99;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;ZIIZIZJLjava/lang/String;II)V", line = 54)
    public static final void method158(String arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, long arg7, String arg8, int arg9, int arg10) {
        field301++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class227 var14 = new class227(128);
        var14.method1712(10, arg3 ^ 0xFFFFFFB6);
        var14.method1729((arg4 ? 4 : 0) | (arg6 ? 2 : 0) | (arg1 ? 1 : 0), 206);
        var14.method1714(0, arg7);
        var14.method1757(var12[0], -100);
        var14.method1709(arg0, (byte) -78);
        var14.method1757(var12[arg3], -108);
        var14.method1729(class240.field3973, 206);
        var14.method1712(arg5, -61);
        var14.method1712(arg2, -103);
        var14.method1757(var12[2], arg3 - 121);
        var14.method1729(arg9, 206);
        var14.method1729(arg10, 206);
        var14.method1757(var12[3], -122);
        var14.method1752(class3.field19, class128.field2165, 0);
        class227 var15 = new class227(350);
        var15.method1709(arg8, (byte) -60);
        int var16 = 8 - (class163.method1261(1, arg8) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1712((int) (Math.random() * 255.0D), -59);
        }
        var15.method1732(true, var12);
        class36.field520.field3760 = 0;
        class36.field520.method1712(22, -127);
        class36.field520.method1729(var14.field3760 + var15.field3760 + 2, 206);
        class36.field520.method1729(551, 206);
        class36.field520.method1722(-2097152, var14.field3760, 0, var14.field3793);
        class36.field520.method1722(arg3 ^ 0xFFE00001, var15.field3760, 0, var15.field3793);
        class20.field231 = 1;
        class247.field4040 = 0;
        class201.field3207 = 0;
        class138.field2278 = -3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIIF)V", line = 108)
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5117; var7++) {
            this.field292[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)I", line = 133)
    public static final int method159(int arg0, byte arg1, int arg2) {
        int var3 = class40.method263((byte) -102, arg0 + 45365, 4, arg2 + 91923) + (class40.method263((byte) -102, arg0 + 10294, 2, arg2 + 37821) - 128 >> 1) + (class40.method263((byte) -102, arg0, 1, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field296++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg1 != -57) {
            method160(true, (class258) null, 121);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjh;I)V", line = 154)
    public static final void method160(boolean arg0, class258 arg1, int arg2) {
        field290++;
        class170 var3 = (class170) class243.field3995.method1268(97, (long) arg2);
        if (!arg0) {
            field298 = (int[]) null;
        }
        if (var3 == null) {
            class340.method2386(0, (class288) null, arg2, class186.field2991, arg1.field3519[0], (byte) 118, (class29) null, arg1, arg1.field3553[0]);
        } else {
            var3.method1321(arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 178)
    public static final void method161(int arg0) {
        field294++;
        if (arg0 < 124) {
            method161(-111);
        }
        for (class231 var1 = (class231) class189.field3039.method2300((byte) 115); var1 != null; var1 = (class231) class189.field3039.method2306(-23)) {
            class83 var2 = var1.field3835;
            if (class186.field2991 != var2.field1410 || var2.field1417) {
                var1.method330(15);
            } else if (class332.field5261 >= var2.field1416) {
                var2.method670(1, class272.field4516);
                if (var2.field1417) {
                    var1.method330(15);
                } else {
                    class65.method561(var2.field1410, var2.field1409, var2.field1411, var2.field1415, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 215)
    public final void method162(boolean arg0) {
        this.field299 = Math.abs(this.field299);
        if (!arg0) {
            method159(65, (byte) 118, -105);
        }
        if (this.field299 >= 4096) {
            this.field299 = 4095;
        }
        field302++;
        this.method155(this.field303++, (byte) (this.field299 >> 4));
        this.field299 = 0;
    }
}

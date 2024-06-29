import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class88 extends class304 {

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    private final int field1396;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    private final int field1386;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    private final int field1400;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field1390 = 0;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "[I")
    public static int[] field1395 = new int[5];

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Lsf;")
    public static class108 field1397 = class140.method973(255, "(U2");

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1398 = 64;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lsf;")
    public static class108 field1402 = class140.method973(255, "cookiehost");

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Lik;")
    public static class262 field1388;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "[B")
    private byte[] field1401;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "[I")
    public static int[] field1383;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IB)V", line = 10)
    public void method600(int arg0, byte arg1) {
        this.field1401[arg0] = arg1;
        field1391++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)V", line = 38)
    public static final void method601(int arg0, int arg1) {
        field1394++;
        class141 var2 = class206.field3694;
        synchronized (class206.field3694) {
            class134.field2315 = arg0;
            if (arg1 >= -4) {
                method606(-57);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V", line = 56)
    public static final void method602(byte arg0, int arg1) {
        if (arg1 == 37) {
            class200.field3621 = 3.0F;
        } else if (arg1 == 50) {
            class200.field3621 = 4.0F;
        } else if (arg1 == 75) {
            class200.field3621 = 6.0F;
        } else {
            class200.field3621 = 8.0F;
        }
        field1392++;
        class25.field382 = -1;
        class25.field382 = -1;
        if (arg0 >= -35) {
            field1398 = -74;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIIFFF)V", line = 87)
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1396 = (int) (arg7 * 4096.0F);
        this.field1386 = (int) (arg6 * 4096.0F);
        this.field1385 = this.field1400 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 109)
    public final void method603(int arg0) {
        field1387++;
        this.field1403 = 0;
        if (arg0 != 6841) {
            field1397 = (class108) null;
        }
        this.field1408 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 125)
    public final void method604(int arg0) {
        field1399++;
        this.field1385 = this.field1400;
        if (arg0 != 6) {
            return;
        }
        this.field1408 >>= 0x4;
        if (this.field1408 < 0) {
            this.field1408 = 0;
        } else if (this.field1408 > 255) {
            this.field1408 = 255;
        }
        this.method600(this.field1403++, (byte) this.field1408);
        this.field1408 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V", line = 167)
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1404++;
        int var8 = arg3 + arg5;
        int var9 = arg0 - arg5;
        int var10 = arg5 + arg7;
        if (arg6 > -124) {
            field1390 = -124;
        }
        for (int var11 = arg3; var11 < var8; var11++) {
            class209.method1452(arg1, class106.field1839[var11], 7, arg7, arg2);
        }
        int var12 = arg1 - arg5;
        for (int var13 = arg0; var13 > var9; var13--) {
            class209.method1452(arg1, class106.field1839[var13], 7, arg7, arg2);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class106.field1839[var14];
            class209.method1452(var10, var15, 7, arg7, arg2);
            class209.method1452(var12, var15, 7, var10, arg4);
            class209.method1452(arg1, var15, 7, var12, arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 211)
    public static void method606(int arg0) {
        field1395 = null;
        field1397 = null;
        field1388 = null;
        if (arg0 <= 7) {
            field1402 = (class108) null;
        }
        field1402 = null;
        field1383 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)V", line = 226)
    public final void method607(int arg0, int arg1, byte arg2) {
        int var4 = 19 % ((25 - arg2) / 61);
        field1406++;
        if (arg1 == 0) {
            this.field1405 = 4096;
            this.field1407 = this.field1386 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1407 = this.field1407 * this.field1407 >> 12;
            this.field1408 = this.field1407;
            return;
        }
        this.field1405 = this.field1407 * this.field1396 >> 12;
        if (this.field1405 < 0) {
            this.field1405 = 0;
        } else if (this.field1405 > 4096) {
            this.field1405 = 4096;
        }
        this.field1407 = this.field1386 - (arg0 >= 0 ? arg0 : -arg0);
        this.field1407 = this.field1407 * this.field1407 >> 12;
        this.field1407 = this.field1407 * this.field1405 >> 12;
        this.field1408 += this.field1407 * this.field1385 >> 12;
        this.field1385 = this.field1400 * this.field1385 >> 12;
    }
}

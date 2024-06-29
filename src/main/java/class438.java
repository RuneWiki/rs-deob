import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class438 {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public int field5514 = 0;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field5513 = 2048;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public int field5515 = 2048;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public int field5521 = 0;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field5517 = 1406;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5520 = null;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "Lcga;")
    public static class449 field5519 = new class449(46, 7);

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 16)
    public static void method2407(int arg0) {
        field5520 = null;
        if (arg0 != 3) {
            field5519 = null;
        }
        field5519 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLji;)V", line = 27)
    public final void method2408(byte arg0, class572 arg1) {
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                field5516++;
                int var4 = 58 / ((arg0 + 9) / 41);
                return;
            }
            this.method2410(-1433, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lgo;[[BI)V", line = 51)
    public static final void method2409(class586 arg0, byte[][] arg1, int arg2) {
        field5522++;
        int[] var3 = new int[] { -1, arg2, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field2221; var4++) {
            class428.method2354(-6331);
            for (int var5 = 0; var5 < class85.field1090 >> 3; var5++) {
                for (int var6 = 0; var6 < class656.field8932 >> 3; var6++) {
                    int var7 = class296.field3773[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field2240 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFD3E6) >> 14;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class307.field3888.length; var13++) {
                                if (class307.field3888[var13] == var12 && arg1[var13] != null) {
                                    class572 var14 = new class572(arg1[var13]);
                                    arg0.method1111(-30, var10, var8, var6 * 8, var5 * 8, var9, class634.field8601, var11, var4, var14);
                                    arg0.method3251(var8, 8, var11, var10, var6 * 8, var14, class309.field3898, var3[0] == -1 ? var3 : null, var9, var5 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class613.field8337 = class7.field77.method1040(var3[1], (byte) -99, class671.field9178, var3[2], var3[0], var3[3]);
            class289.field3654 = var3[4];
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILji;I)V", line = 136)
    private final void method2410(int arg0, class572 arg1, int arg2) {
        field5518++;
        if (arg0 != -1433) {
            this.field5514 = -99;
        }
        if (arg2 == 1) {
            this.field5521 = arg1.method3097((byte) 12);
        } else if (arg2 == 2) {
            this.field5515 = arg1.method3031(-1);
        } else if (arg2 == 3) {
            this.field5513 = arg1.method3031(-1);
        } else if (arg2 == 4) {
            this.field5514 = arg1.method3086(65280);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class271 {

    @OriginalMember(owner = "client!js", name = "l", descriptor = "[[I")
    private int[][] field3379;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    private int field3369;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Lad;")
    public static class19 field3376 = new class19(64);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Lr;")
    public static class564 field3377;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field3378;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([BI)[B")
    public final byte[] method1589(byte[] arg0, int arg1) {
        if (arg1 != 22157) {
            this.field3369 = 61;
        }
        field3370++;
        if (this.field3379 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3369 / (long) this.field3374) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3379[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3369 + var6;
                int var14 = var13 / this.field3374;
                var6 = var13 - this.field3374 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
    public final int method1590(int arg0, int arg1) {
        if (arg1 != 6) {
            return 56;
        }
        field3371++;
        if (this.field3379 != null) {
            arg0 = (int) ((long) this.field3369 * (long) arg0 / (long) this.field3374) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        if (class61.method326(-72)) {
            if (class210.field2549 == null) {
                class488.method2833(22256);
            }
            class360.field4833 = true;
            class323.field3974 = 0;
        }
        field3372++;
        if (arg0 != 24591) {
            method1591(-83);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)I")
    public final int method1592(byte arg0, int arg1) {
        if (this.field3379 != null) {
            arg1 = (int) ((long) this.field3369 * (long) arg1 / (long) this.field3374);
        }
        field3368++;
        if (arg0 != -94) {
            field3377 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I[BBI)I")
    public static final int method1593(int arg0, byte[] arg1, byte arg2, int arg3) {
        field3375++;
        int var4 = 85 / ((arg2 - 49) / 49);
        int var5 = -1;
        for (int var6 = arg3; var6 < arg0; var6++) {
            var5 = class489.field7114[(arg1[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        field3376 = null;
        if (arg0 != -50) {
            field3377 = null;
        }
        field3377 = null;
        field3378 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILhfa;Lhfa;)V")
    public static final void method1595(int arg0, int arg1, int arg2, class465 arg3, class465 arg4) {
        class499 var5 = class472.method2722(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field7218 = arg3;
        var5.field7223 = arg4;
        int var6 = class666.field9303 == class156.field1743 ? 1 : 0;
        if (!arg3.method180(-1)) {
            class476.field6867[var6][class701.field9822[var6]++] = arg3;
        } else if (arg3.method177(-115)) {
            class13.field115[var6][class635.field8946[var6]++] = arg3;
        } else {
            class469.field6711[var6][class321.field3949[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method180(-1)) {
            if (arg4.method177(-116)) {
                class13.field115[var6][class635.field8946[var6]++] = arg4;
                return;
            }
            class469.field6711[var6][class321.field3949[var6]++] = arg4;
            return;
        }
        class476.field6867[var6][class701.field9822[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(II)V")
    public class271(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class634.method3564(-1164236048, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3379 = new int[var4][14];
            this.field3369 = var5;
            this.field3374 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3379[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class522 extends class694 {

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "Lrg;")
    public static class588 field7090 = new class588(2);

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "Lfc;")
    public static class235 field7092;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(II)[[I", line = 3)
    public final int[][] method15(int arg0, int arg1) {
        if (arg0 != -22151) {
            method2887(31, 26, -53, (class132) null);
        }
        ++field7091;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class465.field6544; ++var7) {
                this.method2885(var7, 1, arg1);
                int[][] var8 = this.method3812(class278.field3899, 0, -14032);
                var4[var7] = var8[0][class679.field9579];
                var5[var7] = var8[1][class679.field9579];
                var6[var7] = var8[2][class679.field9579];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V", line = 46)
    public class522() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method39(int arg0, int arg1) {
        ++field7085;
        if (arg0 <= 112) {
            field7090 = null;
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            for (int var4 = 0; class465.field6544 > var4; ++var4) {
                this.method2885(var4, 1, arg1);
                int[] var5 = this.method3809(0, class278.field3899, (byte) 35);
                var3[var4] = var5[class679.field9579];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIZI)I", line = 86)
    public static final int method2884(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7089;
        if (~class160.field2400 > -101) {
            return -2;
        } else {
            int var4 = -2;
            if (!arg2) {
                method2887(52, -32, -74, (class132) null);
            }
            int var5 = Integer.MAX_VALUE;
            int var6 = -class148.field2208 + arg0;
            int var7 = -class148.field2206 + arg1;
            for (class209 var8 = (class209) class148.field2193.method1270((byte) -25); var8 != null; var8 = (class209) class148.field2193.method1282(0)) {
                if (var8.field3086 == arg3) {
                    int var9 = var8.field3081;
                    int var10 = var8.field3085;
                    int var11 = var9 - -class148.field2208 << 14 | class148.field2206 + var10;
                    int var12 = (var6 - var9) * (-var9 + var6) + (var7 - var10) * (var7 - var10);
                    if (~var4 > -1 || var5 > var12) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(III)V", line = 136)
    private final void method2885(int arg0, int arg1, int arg2) {
        ++field7088;
        int var4 = class346.field4994[arg0];
        int var5 = class105.field1409[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class679.field9579 = arg0;
            class278.field3899 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class278.field3899 = arg0;
            class679.field9579 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class679.field9579 = class465.field6544 - arg2;
            class278.field3899 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class679.field9579 = arg0;
            class278.field3899 = -arg2 + class250.field3529;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class679.field9579 = -arg0 + class465.field6544;
            class278.field3899 = -arg2 + class250.field3529;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class278.field3899 = -arg0 + class250.field3529;
            class679.field9579 = -arg2 + class465.field6544;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class278.field3899 = -arg0 + class250.field3529;
            class679.field9579 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class679.field9579 = -arg0 + class465.field6544;
            class278.field3899 = arg2;
        }
        if (arg1 != 1) {
            method2884(43, -19, false, -49);
        }
        class278.field3899 &= class384.field5383;
        class679.field9579 &= class168.field2537;
    }

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "(I)V", line = 209)
    public static void method2886(int arg0) {
        field7090 = null;
        if (arg0 == -3758) {
            field7092 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILjr;B)V", line = 221)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -116 / ((58 - arg2) / 63);
        if (arg0 == 0) {
            super.field9744 = arg1.method718(93) == 1;
        }
        ++field7086;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIILpj;)Lec;", line = 239)
    public static final class213 method2887(int arg0, int arg1, int arg2, class132 arg3) {
        ++field7087;
        class96 var4 = new class96(arg3.method940(arg0, arg1, 0));
        class213 var5 = new class213(arg1, var4.method739(82), var4.method739(3), var4.method714(false), var4.method714(false), var4.method718(118) == 1, var4.method718(-62), var4.method718(-86));
        int var6 = var4.method718(99);
        if (arg2 != Integer.MAX_VALUE) {
            field7092 = null;
        }
        for (int var7 = 0; var7 < var6; ++var7) {
            var5.field3118.method1273(new class125(var4.method718(-103), var4.method743((byte) -59), var4.method743((byte) -101), var4.method743((byte) -107), var4.method743((byte) -42), var4.method743((byte) -79), var4.method743((byte) -3), var4.method743((byte) -66), var4.method743((byte) -81)), (byte) 122);
        }
        var5.method1395((byte) 4);
        return var5;
    }
}

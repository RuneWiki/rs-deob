import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class331 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public int field4497 = 16777215;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field4503 = 8;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4501 = new String[8];

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field4505 = 0;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Lew;")
    public static class270 field4494 = new class270(16);

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "Lla;")
    public static class306 field4510;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Z")
    public boolean field4493;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILsv;I)V")
    private final void method1952(int arg0, class319 arg1, int arg2) {
        if (arg2 != 6) {
            this.field4508 = -112;
        }
        if (arg0 == 1) {
            this.field4503 = arg1.method1844(-101);
        } else if (arg0 == 2) {
            this.field4493 = true;
        } else if (arg0 == 3) {
            this.field4504 = arg1.method1847(49);
            this.field4507 = arg1.method1847(48);
            this.field4506 = arg1.method1847(46);
        } else if (arg0 == 4) {
            this.field4495 = arg1.method1869(arg2 - 85);
        } else if (arg0 == 5) {
            this.field4508 = arg1.method1844(-125);
        } else if (arg0 == 6) {
            this.field4497 = arg1.method1852(arg2 + 1086280482);
        }
        field4502++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIII[BI)V")
    public static final void method1953(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field4499++;
        if (arg4 > 0 && !class113.method855(arg4, (byte) -103)) {
            throw new IllegalArgumentException("");
        }
        if (arg0 != -13125) {
            field4494 = null;
        }
        if (arg6 > 0 && !class113.method855(arg6, (byte) -103)) {
            throw new IllegalArgumentException("");
        }
        int var7 = class50.method338(arg3, (byte) -41);
        int var8 = 0;
        int var9 = arg6 <= arg4 ? arg6 : arg4;
        int var10 = arg4 >> 1;
        int var11 = arg6 >> 1;
        byte[] var12 = arg5;
        byte[] var13 = new byte[var7 * var11 * var10];
        while (true) {
            OpenGL.glTexImage2Dub(arg2, var8, arg1, arg4, arg6, 0, arg3, 5121, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg4 * var7;
            for (int var15 = 0; var15 < var7; var15++) {
                int var17 = var15;
                int var18 = var15;
                int var19 = var14 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        byte var22 = var12[var18];
                        int var23 = var7 + var18;
                        int var24 = var12[var23] + var22;
                        int var25 = var12[var19] + var24;
                        var18 = var7 + var23;
                        int var26 = var7 + var19;
                        int var27 = var12[var26] + var25;
                        var13[var17] = (byte) (var27 >> 2);
                        var19 = var7 + var26;
                        var17 += var7;
                    }
                    var19 += var14;
                    var18 += var14;
                }
            }
            byte[] var16 = var13;
            var13 = var12;
            arg6 = var11;
            var12 = var16;
            arg4 = var10;
            var9 >>= 0x1;
            var8++;
            var10 >>= 0x1;
            var11 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method1954(int arg0) {
        field4510 = null;
        if (arg0 != 18031) {
            field4509 = 59;
        }
        field4501 = null;
        field4494 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)I")
    public static final int method1955(byte arg0, int arg1) {
        if (arg0 != -108) {
            return 113;
        }
        field4496++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(JZ)V")
    public static final void method1956(long arg0, boolean arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (!arg1) {
            method1954(-122);
        }
        field4500++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lsv;I)V")
    public final void method1957(class319 arg0, int arg1) {
        if (arg1 != -5) {
            field4505 = -115;
        }
        field4498++;
        while (true) {
            int var3 = arg0.method1869(-104);
            if (var3 == 0) {
                return;
            }
            this.method1952(var3, arg0, 6);
        }
    }
}

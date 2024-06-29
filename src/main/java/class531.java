import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class531 extends class305 {

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    private int field7752 = 2048;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "I")
    private int field7755 = 8192;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    private int field7749 = 4096;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
    private int field7757 = 12288;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
    private int field7760 = 2048;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    private int field7753 = 0;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
    private int field7761 = 0;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "Ld;")
    public static class242 field7750 = new class242(4);

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "Lpu;")
    public static class179 field7763 = new class179("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!fv", name = "S", descriptor = "Lum;")
    public static class83 field7764;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)V")
    public static void method3135(byte arg0) {
        field7764 = null;
        field7763 = null;
        field7750 = null;
        if (arg0 != 58) {
            method3137(100, (byte) -80, (class83) null, 51);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field7765;
        if (arg2 <= 76) {
            this.field7749 = 94;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field7755 = arg1.method1396(119);
                                }
                            } else {
                                this.field7749 = arg1.method1396(109);
                            }
                        } else {
                            this.field7757 = arg1.method1396(-112);
                        }
                    } else {
                        this.field7752 = arg1.method1396(-91);
                    }
                } else {
                    this.field7753 = arg1.method1396(-97);
                }
            } else {
                this.field7761 = arg1.method1396(99);
            }
        } else {
            this.field7760 = arg1.method1396(-88);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        ++field7766;
        if (arg0 != -62) {
            method3138((byte) 99, 45, 116, 50, (byte[]) null, -31);
        }
        class441.method2728(false);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(III)Z")
    private final boolean method3136(int arg0, int arg1, int arg2) {
        ++field7759;
        int var4 = (arg0 + arg1) * this.field7757 >> 12;
        int var5 = 7 % ((arg2 - 26) / 37);
        int var6 = class480.field7043[255 & var4 * 255 >> 12];
        int var7 = (var6 << 12) / this.field7757;
        int var8 = (var7 << 12) / this.field7755;
        int var9 = this.field7749 * var8 >> 12;
        return var9 > -arg1 + arg0 && ~(-var9) > ~(arg0 - arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBLum;I)Lwr;")
    public static final class537 method3137(int arg0, byte arg1, class83 arg2, int arg3) {
        ++field7758;
        class194 var4 = new class194(arg2.method731(0, arg3, arg0));
        class537 var5 = new class537(arg3, var4.method1347(-88), var4.method1347(-128), var4.method1401(-40), var4.method1401(-111), var4.method1337((byte) -116) == 1, var4.method1337((byte) 104), var4.method1337((byte) -112));
        int var6 = var4.method1337((byte) 102);
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            var5.field7872.method292((byte) 121, new class394(var4.method1337((byte) 85), var4.method1396(-116), var4.method1396(arg1 ^ 93), var4.method1396(-124), var4.method1396(86), var4.method1396(-108), var4.method1396(-98), var4.method1396(-105), var4.method1396(57)));
        }
        if (arg1 != -11) {
            method3138((byte) 90, -90, -56, -15, (byte[]) null, 55);
        }
        var5.method3159(true);
        return var5;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
    public class531() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7754;
        if (arg1 != 4688) {
            return null;
        } else {
            int[] var3 = super.field4677.method2174(arg0, 31);
            if (super.field4677.field5040) {
                int var4 = class301.field4614[arg0] + -2048;
                for (int var5 = 0; var5 < class91.field1471; ++var5) {
                    int var6 = class78.field1298[var5] - 2048;
                    int var7 = this.field7760 + var6;
                    int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                    int var9 = var8 > 2048 ? var8 - 4096 : var8;
                    int var10 = this.field7761 + var4;
                    int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field7753 + var6;
                    int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                    int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                    int var16 = var4 - -this.field7752;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                    var3[var5] = !this.method3139(var12, (byte) 61, var9) && !this.method3136(var18, var15, -29) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIII[BI)V")
    public static final void method3138(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field7751;
        if (arg5 > arg1) {
            int var6 = -arg1 + arg5 >> 2;
            if (arg0 != -51) {
                field7750 = null;
            }
            int var7 = arg1 + arg2;
            while (true) {
                --var6;
                if (var6 < 0) {
                    int var8 = 3 & arg5 - arg1;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg4[var7++] = 1;
                    }
                }
                arg4[var7++] = 1;
                arg4[var7++] = 1;
                arg4[var7++] = 1;
                arg4[var7++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)Z")
    private final boolean method3139(int arg0, byte arg1, int arg2) {
        if (arg1 <= 11) {
            method3138((byte) 122, 16, 79, 121, (byte[]) null, -59);
        }
        ++field7756;
        int var4 = (-arg2 + arg0) * this.field7757 >> 12;
        int var5 = class480.field7043[(var4 * 255 & 1046939) >> 12];
        int var6 = (var5 << 12) / this.field7757;
        int var7 = (var6 << 12) / this.field7755;
        int var8 = this.field7749 * var7 >> 12;
        return var8 > arg2 - -arg0 && ~(arg2 - -arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3140(String arg0, int arg1) {
        ++field7762;
        if (!arg0.equals("")) {
            class110.method857(4095, class280.field4363);
            ++class243.field3664;
            class312.field4752.method1381(class447.method2755(arg0, (byte) -104), (byte) 114);
            class312.field4752.method1343(arg0, (byte) -14);
            if (arg1 != 8192) {
                method3140((String) null, -69);
            }
        }
    }
}

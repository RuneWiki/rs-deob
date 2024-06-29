import java.awt.event.KeyEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class61 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "J")
    public static long field1219 = 0L;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lkh;")
    public static class117 field1225 = class224.method1450((byte) -124, "null");

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lkh;")
    private static class117 field1224 = class224.method1450((byte) 124, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lkh;")
    public static class117 field1220 = field1224;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lkh;")
    private static class117 field1223 = class224.method1450((byte) -40, "This computers address has been blocked");

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field1233 = 0;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
    public static boolean field1228 = false;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lkh;")
    public static class117 field1238 = field1223;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Z")
    public static boolean field1235 = false;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lvb;")
    public static class232 field1222;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1232;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[I")
    public static int[] field1230;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lba;IIIIIIIZ)V")
    public static final void method449(class13 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class225.field4064;
        int var11;
        int var12 = var11 = (arg7 << 7) - class175.field3160;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class156.field2839[arg1][arg6][arg7] - class115.field2139;
        int var18 = class156.field2839[arg1][arg6 + 1][arg7] - class115.field2139;
        int var19 = class156.field2839[arg1][arg6 + 1][arg7 + 1] - class115.field2139;
        int var20 = class156.field2839[arg1][arg6][arg7 + 1] - class115.field2139;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class89.field1655;
        int var46 = (var24 << 9) / var25 + class89.field1656;
        int var47 = (var27 << 9) / var31 + class89.field1655;
        int var48 = (var30 << 9) / var31 + class89.field1656;
        int var49 = (var33 << 9) / var37 + class89.field1655;
        int var50 = (var36 << 9) / var37 + class89.field1656;
        int var51 = (var39 << 9) / var43 + class89.field1655;
        int var52 = (var42 << 9) / var43 + class89.field1656;
        class89.field1652 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class78.field1487 && class109.method736(class89.field1655 + class26.field661, class95.field1739 + class89.field1656, var50, var52, var48, var49, var51, var47)) {
                class3.field47 = arg6;
                class217.field3951 = arg7;
            }
            if (!arg8) {
                class89.field1651 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class89.field1644 || var51 > class89.field1644 || var47 > class89.field1644) {
                    class89.field1651 = true;
                }
                if (arg0.field425 == -1) {
                    if (arg0.field419 != 12345678) {
                        class89.method624(var50, var52, var48, var49, var51, var47, arg0.field419, arg0.field407, arg0.field420);
                    }
                } else if (class25.field624) {
                    int var53 = class89.field1657.method531(arg0.field425, (byte) -128);
                    class89.method624(var50, var52, var48, var49, var51, var47, class158.method1127(var53, arg0.field419), class158.method1127(var53, arg0.field407), class158.method1127(var53, arg0.field420));
                } else if (arg0.field408) {
                    class89.method620(var50, var52, var48, var49, var51, var47, arg0.field419, arg0.field407, arg0.field420, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field425);
                } else {
                    class89.method620(var50, var52, var48, var49, var51, var47, arg0.field419, arg0.field407, arg0.field420, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field425);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class78.field1487 && class109.method736(class89.field1655 + class26.field661, class95.field1739 + class89.field1656, var46, var48, var52, var45, var47, var51)) {
            class3.field47 = arg6;
            class217.field3951 = arg7;
        }
        if (arg8) {
            return;
        }
        class89.field1651 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class89.field1644 || var47 > class89.field1644 || var51 > class89.field1644) {
            class89.field1651 = true;
        }
        if (arg0.field425 != -1) {
            if (!class25.field624) {
                class89.method620(var46, var48, var52, var45, var47, var51, arg0.field403, arg0.field420, arg0.field407, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field425);
                return;
            }
            int var54 = class89.field1657.method531(arg0.field425, (byte) -128);
            class89.method624(var46, var48, var52, var45, var47, var51, class158.method1127(var54, arg0.field403), class158.method1127(var54, arg0.field420), class158.method1127(var54, arg0.field407));
        } else if (arg0.field403 != 12345678) {
            class89.method624(var46, var48, var52, var45, var47, var51, arg0.field403, arg0.field420, arg0.field407);
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJLkh;ISILkh;)V")
    public static final void method450(int arg0, long arg1, class117 arg2, int arg3, short arg4, int arg5, class117 arg6) {
        field1226++;
        if (class182.field3289) {
            return;
        }
        if (class100.field1825 < 500) {
            class25.field612[class100.field1825] = arg2;
            class56.field1160[class100.field1825] = arg6;
            class194.field3462[class100.field1825] = arg4;
            class84.field1568[class100.field1825] = arg1;
            class227.field4094[class100.field1825] = arg5;
            class40.field907[class100.field1825] = arg3;
            class100.field1825++;
        }
        if (arg0 != -25300) {
            method453(null, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILnc;[B)V")
    public final void method451(int arg0, class145 arg1, byte[] arg2) {
        field1231++;
        if (arg1.field2613[arg1.field2643] != 31 || arg1.field2613[arg1.field2643 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1232 == null) {
            this.field1232 = new Inflater(true);
        }
        if (arg0 != 12014) {
            method449(null, -10, -28, 110, -100, 5, -108, 16, false);
        }
        try {
            this.field1232.setInput(arg1.field2613, arg1.field2643 + 10, -arg1.field2643 - 10 + arg1.field2613.length + -8);
            this.field1232.inflate(arg2);
        } catch (Exception var4) {
            this.field1232.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1232.reset();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method452(byte arg0) {
        field1238 = null;
        if (arg0 >= -11) {
            return;
        }
        field1222 = null;
        field1223 = null;
        field1220 = null;
        field1224 = null;
        field1230 = null;
        field1225 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method453(KeyEvent arg0, byte arg1) {
        field1221++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg1 > -58 ? 93 : var2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILai;Lai;)V")
    public static final void method454(int arg0, class10 arg1, class10 arg2) {
        class33.field771 = arg2;
        field1237++;
        if (arg0 <= 2) {
            method454(40, null, null);
        }
        class179.field3231 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class61() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
    private class61(int arg0, int arg1, int arg2) {
    }
}

import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class237 extends class132 {

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field4407 = 0;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[[[Lcf;")
    public static class28[][][] field4408 = new class28[4][104][104];

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "Lvd;")
    public static class222 field4415 = class212.method1357(")1", 10731);

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "Lvd;")
    public static class222 field4421 = class212.method1357("gleiten:", 10731);

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "Lvd;")
    public static class222 field4423 = class212.method1357("title)3jpg", 10731);

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public int field4417;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "[I")
    public static int[] field4411;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "[I")
    public int[] field4416;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "[I")
    public int[] field4422;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[Lnc;")
    public class141[] field4409;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[Lnc;")
    public class141[] field4410;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[[[B")
    public byte[][][] field4412;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIILe;IJ)Z")
    public static final boolean method1542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class44 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class121.method774(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method1543(byte arg0) {
        if (arg0 != 116) {
            return;
        }
        field4415 = null;
        field4411 = null;
        field4423 = null;
        field4408 = null;
        field4421 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIII)I")
    public static final int method1544(byte arg0, int arg1, int arg2, int arg3) {
        field4406++;
        if (arg0 > -108) {
            field4408 = null;
        }
        int var4 = 256 - arg1;
        return ((arg2 & 0xFF00) * arg1 + (arg3 & 0xFF00) * var4 & 0xFF0000) + ((arg2 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILba;Lvd;)Lvd;")
    public static final class222 method1545(int arg0, class13 arg1, class222 arg2) {
        field4413++;
        if (arg0 != 255) {
            return null;
        } else if (arg2.method1445(class46.field951, (byte) -47) == -1) {
            return arg2;
        } else {
            while (true) {
                int var3 = arg2.method1445(class120.field2269, (byte) 107);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1445(class29.field638, (byte) 118);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1445(class181.field3364, (byte) 106);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1445(class187.field3465, (byte) 80);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1445(class34.field747, (byte) -78);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1445(class135.field2604, (byte) 96);
                                                        if (var8 == -1) {
                                                            return arg2;
                                                        }
                                                        class222 var9 = class29.field646;
                                                        if (class128.field2464 != null) {
                                                            var9 = class112.method729(class128.field2464.field2712, 55);
                                                            try {
                                                                if (class128.field2464.field2714 != null) {
                                                                    byte[] var10 = ((String) class128.field2464.field2714).getBytes("ISO-8859-1");
                                                                    var9 = class73.method496(var10, (byte) 112, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class234.method1531(new class222[] { arg2.method1419(var8, 2, 0), var9, arg2.method1443(21120, var8 + 4) }, -10949);
                                                    }
                                                }
                                                arg2 = class234.method1531(new class222[] { arg2.method1419(var7, 2, 0), class185.method1162(arg0 - 161, class156.method997(4, false, arg1)), arg2.method1443(21120, var7 + 2) }, -10949);
                                            }
                                        }
                                        arg2 = class234.method1531(new class222[] { arg2.method1419(var6, 2, 0), class185.method1162(115, class156.method997(3, false, arg1)), arg2.method1443(21120, var6 + 2) }, -10949);
                                    }
                                }
                                arg2 = class234.method1531(new class222[] { arg2.method1419(var5, arg0 ^ 0xFD, 0), class185.method1162(arg0 - 128, class156.method997(2, false, arg1)), arg2.method1443(21120, var5 + 2) }, -10949);
                            }
                        }
                        arg2 = class234.method1531(new class222[] { arg2.method1419(var4, arg0 - 253, 0), class185.method1162(90, class156.method997(1, false, arg1)), arg2.method1443(21120, var4 + 2) }, arg0 - 11204);
                    }
                }
                arg2 = class234.method1531(new class222[] { arg2.method1419(var3, 2, 0), class185.method1162(arg0 ^ 0x8F, class156.method997(0, false, arg1)), arg2.method1443(21120, var3 + 2) }, -10949);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
    public static final boolean method1546(int arg0, int arg1) {
        if (arg0 == 104) {
            field4420++;
            return (arg1 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BD)V")
    public static final void method1547(byte arg0, double arg1) {
        if (arg0 >= -44) {
            return;
        }
        field4418++;
        if (class26.field596 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class47.field967[var3] = var4 <= 255 ? var4 : 255;
        }
        class26.field596 = arg1;
    }
}

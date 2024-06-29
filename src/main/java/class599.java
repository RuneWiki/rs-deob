import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class599 extends class450 implements class246 {

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "Lej;")
    public class438 field8658;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "Z")
    private boolean field8664;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field8655 = -2;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "[I")
    public static int[] field8663 = new int[4096];

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "[B")
    public static byte[] field8657 = new byte[520];

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "Lvt;")
    public static class344 field8652 = new class344("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!qq", name = "X", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "Lud;")
    private class119 field8651;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "[[S")
    public static short[][] field8649;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 != 52) {
            field8655 = 56;
        }
        ++field8647;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 != -1) {
            this.field8658 = null;
        }
        ++field8653;
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        if (arg0 != -17817) {
            this.method56((byte) 73);
        }
        ++field8642;
        return this.field8658.field5966;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        int var2 = -128 / ((arg0 - -20) / 32);
        ++field8643;
        return this.field8658.method2553((byte) -73);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        ++field8660;
        if (arg1 == -9785) {
            this.field8658.method2552((byte) 11, arg0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field8650;
        if (arg1 != 30307) {
            this.method103((byte) 5);
        }
        return this.field8658.method2548(0, (byte) 118, false, false, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 1901) {
            this.method61((class167) null, -110);
        }
        ++field8666;
        return this.field8658.field5980;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field8665;
        class521 var3 = this.field8658.method2548(super.field6368, (byte) 111, true, false, super.field6362, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method964();
            var4.method361(super.field6362, super.field6366, super.field6368);
            class541 var5 = null;
            if (this.field8664) {
                var5 = class296.method1818(16711680, 1);
            }
            if (this.field8658.field5950 == null) {
                var3.method1595(var4, var5 != null ? var5.field7564[0] : null, 0);
            } else {
                class174 var6 = this.field8658.field5950.method1864();
                arg1.method947(var3, var6, var4, var5 == null ? null : var5.field7564[0], 0);
            }
            if (this.field8651 != null) {
                class504.method2818(this.field8651, super.field6362, var3, super.field6366, super.field6368, (byte) 105);
            } else {
                this.field8651 = class82.method459(var3, super.field6368, super.field6366, super.field6362, (byte) -101);
            }
            int var7 = -72 % ((arg0 - -30) / 63);
            this.field8658.method2555(var3, super.field6367, true, super.field6357, super.field6359, super.field6361, -1, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        if (arg0 != -29185) {
            this.method66((class167) null, 78);
        }
        ++field8646;
        return this.field8658.field5949;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)I")
    public final int method103(byte arg0) {
        ++field8654;
        if (arg0 > -98) {
            this.method55((byte) -121);
        }
        return this.field8658.method2545(true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        ++field8659;
        if (arg1 <= 67) {
            field8657 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        if (arg0 != 22132) {
            this.method64(-53);
        }
        ++field8645;
        this.field8658.method2544(arg1, true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method3448(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        ++field8667;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = !arg0 ? 0 : 32768;
        int var7 = var6 - -(!arg0 ? class548.field7632.field2892 : class548.field7632.field2894);
        if (arg1 == -110) {
            for (int var8 = var6; var8 < var7; ++var8) {
                class192 var11 = class548.field7632.method1438(var8, 2);
                if (var11.field2504 && var11.method1228(95).toLowerCase().indexOf(var3) != -1) {
                    if (var5 >= 50) {
                        class369.field5144 = null;
                        class590.field8520 = -1;
                        return;
                    }
                    if (var4.length <= var5) {
                        short[] var12 = new short[var4.length * 2];
                        for (int var13 = 0; ~var5 < ~var13; ++var13) {
                            var12[var13] = var4[var13];
                        }
                        var4 = var12;
                    }
                    var4[var5++] = (short) var8;
                }
            }
            class577.field8037 = 0;
            class590.field8520 = var5;
            class369.field5144 = var4;
            String[] var9 = new String[class590.field8520];
            for (int var10 = 0; ~class590.field8520 < ~var10; ++var10) {
                var9[var10] = class548.field7632.method1438(var4[var10], 2).method1228(20);
            }
            class582.method3325(class369.field5144, var9, true);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field8668;
        if (arg1 != 0) {
            field8652 = null;
        }
        class521 var3 = this.field8658.method2548(super.field6368, (byte) 113, true, true, super.field6362, 262144, arg0);
        if (var3 != null) {
            this.field8658.method2555(var3, super.field6367, false, super.field6357, super.field6359, super.field6361, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field8648;
        if (arg3 >= -35) {
            this.method52(-43);
        }
        class521 var5 = this.field8658.method2548(super.field6368, (byte) -82, false, false, super.field6362, 131072, arg2);
        if (var5 == null) {
            return false;
        } else {
            class105 var6 = arg2.method964();
            var6.method361(super.field6362, super.field6366, super.field6368);
            return var5.method1598(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method3449(byte[] arg0, int arg1) {
        ++field8644;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg1 <= 29) {
            return null;
        } else {
            while (var2 > var5) {
                int var6 = arg0[var5] & 255;
                if (var6 < 128) {
                    var3[var4++] = (char) var6;
                } else {
                    if (var6 < 194) {
                        throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                    }
                    if (var6 >= 224) {
                        if (~var6 <= -241) {
                            if (var6 >= 244) {
                                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                            }
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        if (~(var5 - -2) <= ~var2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var7 = 255 & arg0[var5];
                        if (var7 < 128 || var7 > 191) {
                            throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                        }
                        ++var5;
                        int var8 = arg0[var5] & 255;
                        if (var8 < 128 || var8 > 191) {
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        var3[var4++] = (char) class292.method1790(class292.method1790(class143.method783(var6, -225) << 12, class143.method783(-8256, var7 << 6)), class143.method783(-129, var8));
                    } else {
                        if (var5 + 1 >= var2) {
                            throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var9 = arg0[var5] & 255;
                        if (var9 < 128 || ~var9 < -192) {
                            throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                        }
                        var3[var4++] = (char) class292.method1790(class143.method783(var9, -129), class143.method783(var6, -193) << 6);
                    }
                }
                ++var5;
            }
            return new String(var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field8662;
        int var3 = 96 % ((arg0 - 4) / 47);
        return this.field8651;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIZIIIIIII)V")
    public class599(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1748 == -2, class564.method3168(true, arg13, arg12));
        this.field8658 = new class438(arg0, arg1, arg12, arg13, super.field6358, arg3, arg4, arg6, arg7, arg14);
        this.field8664 = ~arg1.field1749 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lgj;I)V")
    public static final void method3450(class93 arg0, int arg1) {
        arg0.field1231 = null;
        if (arg1 < -104) {
            ++field8661;
            if (~class624.field9032 > -21) {
                class157.field2045.method1873(arg0, true);
                ++class624.field9032;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = -79 % ((-4 - arg0) / 41);
        ++field8656;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
    public static void method3451(byte arg0) {
        field8657 = null;
        field8652 = null;
        field8663 = null;
        field8649 = null;
        if (arg0 != 100) {
            method3448(false, (byte) -64, (String) null);
        }
    }
}

import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class142 extends class42 {

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private final int field2556;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    private final int field2549;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    private final int field2554;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    private final int field2557;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private final int field2550;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private final int field2559;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    private final int field2547;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    private final int field2552;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "J")
    public static long field2541 = 0L;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "[B")
    public static byte[] field2548;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Leb;")
    public static class230 field2558;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "Leb;")
    public static class230 field2553;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Leb;")
    public static class230 field2561;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "Lv;")
    public static class147 field2560;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Leb;")
    private static class230 field2563;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Leb;")
    public static class230 field2567;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "Leb;")
    public static class230 field2565;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Lka;")
    public static class245 field2564;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1085(int arg0) {
        field2558 = null;
        field2548 = null;
        field2553 = null;
        field2560 = null;
        field2561 = null;
        field2563 = null;
        field2567 = null;
        if (arg0 == 1) {
            field2564 = null;
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1086(KeyEvent arg0, int arg1) {
        ++field2542;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (arg1 <= ~var2 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2556 = arg7;
        this.field2549 = arg1;
        this.field2554 = arg5;
        this.field2557 = arg2;
        this.field2550 = arg6;
        this.field2559 = arg3;
        this.field2547 = arg4;
        this.field2552 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBIII)V")
    public static final void method1087(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class153.field2747.field318 = 0;
        int var5 = -23 % ((-30 - arg1) / 52);
        ++field2545;
        class153.field2747.method170((byte) 120, 4);
        class153.field2747.method170((byte) 121, arg2);
        class153.field2747.method170((byte) 122, arg3);
        class153.field2747.method181(-20053, arg0);
        class153.field2747.method181(-20053, arg4);
        class214.field3716 = 1;
        class146.field2639 = -3;
        class210.field3668 = 0;
        class159.field2852 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V")
    public final void method371(int arg0, int arg1, byte arg2) {
        ++field2540;
        int var4 = this.field2552 * arg0 >> 12;
        int var5 = this.field2549 * arg1 >> 12;
        int var6 = this.field2557 * arg0 >> 12;
        if (arg2 > -34) {
            field2566 = -74;
        }
        int var7 = this.field2559 * arg1 >> 12;
        int var8 = this.field2547 * arg0 >> 12;
        int var9 = this.field2554 * arg1 >> 12;
        int var10 = this.field2556 * arg1 >> 12;
        int var11 = this.field2550 * arg0 >> 12;
        class121.method954(var9, var6, var10, var4, super.field768, var8, var7, var11, var5, (byte) -97);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLeb;)Z")
    public static final boolean method1088(byte arg0, class230 arg1) {
        ++field2551;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = 68 % ((69 - arg0) / 37);
            for (int var3 = 0; ~var3 > ~class45.field796; ++var3) {
                if (arg1.method1612((byte) 15, class146.field2627[var3])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        if (arg2 != -8259) {
            method1087(-104, (byte) -56, 127, -21, -126);
        }
        ++field2539;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLeb;I)V")
    public static final void method1089(boolean arg0, class230 arg1, int arg2) {
        ++field2543;
        short[] var3 = new short[arg2];
        class230 var4 = arg1.method1592(4052);
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~class56.field1037; ++var6) {
            class12 var9 = class214.method1484(var6, -1);
            if ((!arg0 || var9.field170) && ~var9.field192 == 0 && ~var9.field206 == 0 && ~var9.field216 == -1 && var9.field191.method1592(4052).method1624(var4, true) != -1) {
                if (~var5 <= -251) {
                    class48.field844 = null;
                    class161.field2877 = -1;
                    return;
                }
                if (~var3.length >= ~var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; ~var5 < ~var11; ++var11) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class161.field2877 = var5;
        class48.field844 = var3;
        class230[] var7 = new class230[class161.field2877];
        class60.field1154 = 0;
        for (int var8 = 0; var8 < class161.field2877; ++var8) {
            var7[var8] = class214.method1484(var3[var8], arg2 + -17).field191;
        }
        class272.method1857(var7, -10922, class48.field844);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public static final void method1090(int arg0) {
        class200.field3559 = arg0;
        for (int var1 = 0; var1 < class30.field553; ++var1) {
            for (int var2 = 0; var2 < class117.field2102; ++var2) {
                if (class53.field916[arg0][var1][var2] == null) {
                    class53.field916[arg0][var1][var2] = new class233(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)V")
    public final void method367(int arg0, int arg1, int arg2) {
        ++field2555;
        if (arg0 != 1) {
            this.method368(82, 40, -18);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Lmf;")
    public static final class10 method1091(byte arg0) {
        ++field2544;
        int var1 = class7.field124[0] * class273.field4806[0];
        byte[] var2 = class215.field3725[0];
        int var3 = 124 % ((arg0 - 75) / 48);
        int[] var4 = new int[var1];
        for (int var5 = 0; var5 < var1; ++var5) {
            var4[var5] = class263.field4676[class189.method1350(var2[var5], 255)];
        }
        class10 var6 = new class10(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[0], var4);
        class78.method650(true);
        return var6;
    }

    static {
        int var0 = 0;
        field2548 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field2548[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 - -65535)) / 65535.0F))));
            }
        }
        field2558 = class68.method589(0, "Benutzeroberfl-=che geladen)3");
        field2553 = class68.method589(0, "::qa_op_test");
        field2562 = 0;
        field2561 = class68.method589(0, "Musik)2Engine vorbereitet)3");
        field2560 = new class147(5);
        field2563 = class68.method589(0, "green:");
        field2566 = 1;
        field2567 = field2563;
        field2565 = field2563;
    }
}

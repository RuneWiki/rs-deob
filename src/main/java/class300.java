import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class300 extends class279 {

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    private int field5128 = 4;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    private int field5132 = 4;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Z")
    public static boolean field5124 = true;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Ltl;")
    public static class59 field5126 = class85.method639("headicons_pk", 9588);

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Ltl;")
    public static class59 field5131 = class85.method639("event_opbase", 9588);

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Ltl;")
    private static class59 field5129 = class85.method639("flash2:", 9588);

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field5127 = -1;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Ltl;")
    public static class59 field5130 = field5129;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field5138 = 0;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Ltl;")
    public static class59 field5133 = field5129;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[F")
    public static float[] field5137 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[I", line = 21)
    public final int[] method44(boolean arg0, int arg1) {
        field5135++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int var4 = class56.field835 / this.field5128;
            int var5 = class284.field4887 / this.field5132;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1960(-124, class284.field4887 * var6 / var5, 0);
            } else {
                var7 = this.method1960(-122, 0, 0);
            }
            for (int var8 = 0; var8 < class56.field835; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class56.field835 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return arg0 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 346)
    public class300() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V", line = 90)
    public static void method2096(boolean arg0) {
        field5133 = null;
        field5131 = null;
        field5130 = null;
        field5129 = null;
        if (!arg0) {
            field5137 = null;
            field5126 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILs;)V", line = 120)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field5128 = arg2.method1221(89);
        } else if (arg1 == 1) {
            this.field5132 = arg2.method1221(123);
        }
        field5122++;
        if (arg0 > -125) {
            field5130 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)[[I", line = 147)
    public final int[][] method87(int arg0, int arg1) {
        field5134++;
        if (arg0 != -7523) {
            field5133 = (class59) null;
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int var4 = class56.field835 / this.field5128;
            int var5 = class284.field4887 / this.field5132;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1956(0, class284.field4887 * var6 / var5, (byte) -112);
            } else {
                var7 = this.method1956(0, 0, (byte) -112);
            }
            int[] var8 = var7[2];
            int[] var9 = var7[1];
            int[] var10 = var7[0];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class56.field835; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class56.field835 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var10[var16];
                var12[var14] = var9[var16];
                var13[var14] = var8[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V", line = 216)
    public static final void method2097(byte arg0) {
        field5125++;
        while (class18.field236.method1770(114, class146.field2387) >= 27) {
            int var1 = class18.field236.method1762((byte) 70, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class23.field311[var1] == null) {
                class23.field311[var1] = new class23();
                var2 = true;
            }
            class23 var3 = class23.field311[var1];
            class232.field3816[class185.field3107++] = var1;
            var3.field1761 = class30.field420;
            if (var3.field314 != null && var3.field314.method889(5)) {
                method2098(var3, (byte) 46);
            }
            int var4 = class18.field236.method1762((byte) -128, 1);
            if (var4 == 1) {
                class301.field5143[class255.field4242++] = var1;
            }
            int var5 = class18.field236.method1762((byte) 32, 1);
            int var6 = class301.field5142[class18.field236.method1762((byte) 0, 3)];
            if (var2) {
                var3.field1750 = var3.field1765 = var6;
            }
            int var7 = class18.field236.method1762((byte) -123, 5);
            var3.field314 = class37.method249(class18.field236.method1762((byte) 28, 14), (byte) 76);
            int var8 = class18.field236.method1762((byte) -127, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method793(var3.field314.field1948, (byte) 99);
            var3.field1771 = var3.field314.field1972;
            var3.field1778 = var3.field314.field1946;
            var3.field1776 = var3.field314.field1940;
            var3.field1720 = var3.field314.field1987;
            var3.field1745 = var3.field314.field1960;
            if (var3.field1778 == 0) {
                var3.field1765 = 0;
            }
            var3.field1725 = var3.field314.field1988;
            var3.field1763 = var3.field314.field1955;
            var3.field1751 = var3.field314.field1986;
            var3.method797(-2654, class286.field4920.field1773[0] + var7, var5 == 1, class286.field4920.field1729[0] + var8, var3.method776(true));
            if (var3.field314.method889(5)) {
                class85.method640((class102) null, -97, 0, var3.field1729[0], var3, class247.field4119, (class180) null, var3.field1773[0]);
            }
        }
        class18.field236.method1766(69);
        if (arg0 <= 82) {
            method2098((class23) null, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lp;B)V", line = 301)
    public static final void method2098(class23 arg0, byte arg1) {
        field5136++;
        for (class308 var2 = (class308) class130.field2157.method536(2); var2 != null; var2 = (class308) class130.field2157.method533(24)) {
            if (var2.field5241 == arg0) {
                if (var2.field5205 != null) {
                    class222.field3596.method369(var2.field5205);
                    var2.field5205 = null;
                }
                var2.method2000(-22);
                return;
            }
        }
        if (arg1 != 46) {
            method2097((byte) 4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 355)
    public static final void method2099(Component arg0, int arg1) {
        Method var2 = class175.field2879;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        field5139++;
        arg0.addKeyListener(class236.field3916);
        if (arg1 == 0) {
            arg0.addFocusListener(class236.field3916);
        }
    }
}

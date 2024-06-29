import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lrf;")
    private class124 field251 = new class124();

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Ltc;")
    private class135 field257 = new class135();

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Ljb;")
    private class64 field254;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    public static int[] field240 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lcd;")
    public static class19 field244 = new class19();

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "[Z")
    public static boolean[] field249 = new boolean[100];

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lpe;")
    public static class109 field252 = class141.method1120("nav", 0);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[[S")
    public static short[][] field253 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field248 = 10;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lpe;")
    public static class109 field258 = class141.method1120("W-=hlen Sie eine Welt", 0);

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lpe;")
    public static class109 field260 = class141.method1120("Mitglieder)2Welt", 0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "J")
    public static long field250;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method90(int arg0) {
        class126 var1 = (class126) class14.field370.method195((byte) 116);
        if (arg0 >= -124) {
            method90(41);
        }
        while (var1 != null) {
            if (var1.field2801 != null) {
                class124.field2746.method1054(var1.field2801);
                var1.field2801 = null;
            }
            if (var1.field2802 != null) {
                class124.field2746.method1054(var1.field2802);
                var1.field2802 = null;
            }
            var1 = (class126) class14.field370.method198((byte) -92);
        }
        class14.field370.method200(0);
        field243++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method91(byte arg0, Component arg1) {
        field238++;
        arg1.addMouseListener(class63.field1288);
        arg1.addMouseMotionListener(class63.field1288);
        if (arg0 >= -123) {
            field248 = -116;
        }
        arg1.addFocusListener(class63.field1288);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        while (true) {
            class124 var2 = this.field257.method1074(6);
            if (var2 == null) {
                this.field255 = this.field256;
                if (arg0 < 98) {
                    field260 = null;
                }
                field259++;
                return;
            }
            var2.method101((byte) 121);
            var2.method1006((byte) -45);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BJ)Lrf;")
    public final class124 method93(byte arg0, long arg1) {
        field239++;
        class124 var4 = (class124) this.field254.method505((byte) -46, arg1);
        if (arg0 != 103) {
            this.field251 = null;
        }
        if (var4 != null) {
            this.field257.method1077(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method94(int arg0) {
        field244 = null;
        field260 = null;
        if (arg0 != 16565) {
            field258 = null;
        }
        field253 = null;
        field258 = null;
        field240 = null;
        field252 = null;
        field249 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lge;")
    public static final class47 method95(int arg0, byte arg1) {
        field242++;
        class47 var2 = (class47) class139.field3016.method93((byte) 103, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class47 var3 = class6.method62(5, class19.field478, false, class119.field2650, arg0);
        if (var3 != null) {
            class139.field3016.method97((long) arg0, (byte) -127, var3);
        }
        if (arg1 != 23) {
            field240 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static final void method96(int arg0) {
        class18.field448 = new class19();
        field246++;
        if (arg0 < 103) {
            method96(101);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JBLrf;)V")
    public final void method97(long arg0, byte arg1, class124 arg2) {
        int var5 = -112 / ((arg1 + 63) / 34);
        field245++;
        if (this.field255 == 0) {
            class124 var6 = this.field257.method1074(126);
            var6.method101((byte) 124);
            var6.method1006((byte) 124);
            if (this.field251 == var6) {
                class124 var7 = this.field257.method1074(-126);
                var7.method101((byte) 88);
                var7.method1006((byte) 127);
            }
        } else {
            this.field255--;
        }
        this.field254.method503(-1, arg2, arg0);
        this.field257.method1077(0, arg2);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JI)V")
    public final void method98(long arg0, int arg1) {
        field235++;
        class124 var4 = (class124) this.field254.method505((byte) -46, arg0);
        if (arg1 != -16850) {
            this.method93((byte) -125, -7L);
        }
        if (var4 != null) {
            var4.method101((byte) 109);
            var4.method1006((byte) 42);
            this.field255++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
    public static final int method99(int arg0, int arg1, int arg2, int arg3) {
        field237++;
        if (arg1 <= 79) {
            return 111;
        } else if ((class107.field2249[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class107.field2249[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field256 = arg0;
        int var2 = 1;
        this.field255 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field254 = new class64(var2);
    }
}

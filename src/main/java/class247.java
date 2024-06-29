import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class247 extends Canvas {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field4397;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4387 = -1;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public static int[] field4388 = new int[64];

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "B")
    public static byte field4393;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lbj;")
    public static class151 field4391;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[Lke;")
    public static class106[] field4396;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[[I")
    public static int[][] field4394;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLbj;)V")
    public static final void method1672(byte arg0, class151 arg1) {
        field4389++;
        if (class106.field2045) {
            return;
        }
        class131.method917();
        int var2 = 71 / ((arg0 - 63) / 41);
        class11.field339 = class10.method80(2, class43.field967, arg1);
        int var3 = class248.field4414;
        int var4 = var3 * 956 / 503;
        class11.field339.method669((class4.field53 - var4) / 2, 0, var4, var3);
        class59.field1184 = class108.method771(arg1, class45.field1015, -114);
        class59.field1184.method447(class4.field53 / 2 - (class59.field1184.field1227 / 2), 18);
        class106.field2045 = true;
    }

    @OriginalMember(owner = "client!mi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4397.paint(arg0);
        field4386++;
    }

    @OriginalMember(owner = "client!mi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4390++;
        this.field4397.update(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1673(byte arg0) {
        field4391 = null;
        field4388 = null;
        if (arg0 < 22) {
            method1677(99, -46);
        }
        field4396 = null;
        field4394 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)[Lmk;")
    public static final class101[] method1674(int arg0) {
        field4385++;
        if (arg0 != 2) {
            method1677(90, -95);
        }
        class101[] var1 = new class101[class64.field1270];
        for (int var2 = 0; var2 < class64.field1270; var2++) {
            var1[var2] = new class101(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], class213.field3857[var2], class268.field4718);
        }
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILbj;I)Lod;")
    public static final class90 method1675(int arg0, int arg1, class151 arg2, int arg3) {
        if (arg3 != 503) {
            method1673((byte) 49);
        }
        field4395++;
        return class163.method1181(arg2, arg1, 10475, arg0) ? class43.method346(4096) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILbl;)V")
    public static final void method1676(int arg0, class33 arg1) {
        field4392++;
        if (arg1.field675 == 0) {
            return;
        }
        if (arg1.field743 != -1 && arg1.field743 < 32768) {
            class170 var2 = class233.field4217[arg1.field743];
            if (var2 != null) {
                int var3 = arg1.field676 - var2.field676;
                int var4 = arg1.field685 - var2.field685;
                if (var3 != 0 || var4 != 0) {
                    arg1.field716 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field743 >= 32768) {
            int var5 = arg1.field743 - 32768;
            if (class176.field3189 == var5) {
                var5 = 2047;
            }
            class224 var6 = class186.field3294[var5];
            if (var6 != null) {
                int var7 = arg1.field676 - var6.field676;
                int var8 = arg1.field685 - var6.field685;
                if (var7 != 0 || var8 != 0) {
                    arg1.field716 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field711 != 0 || arg1.field732 != 0) && (arg1.field704 == 0 || arg1.field721 > 0)) {
            int var9 = arg1.field676 + ((arg1.method240((byte) 110) - 1) * 64) - (arg1.field711 - class252.field4481 + -class252.field4481) * 64;
            int var10 = arg1.field685 - ((((arg1.field732 - class79.field1554 - class79.field1554) * 64) - (arg1.method240((byte) -112) * 64)) + 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field716 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field732 = 0;
            arg1.field711 = 0;
        }
        int var11 = arg1.field716 - arg1.field700 & 0x7FF;
        if (arg0 == var11) {
            arg1.field748 = 0;
            return;
        }
        arg1.field748++;
        if (var11 <= 1024) {
            boolean var12 = true;
            arg1.field700 += arg1.field675;
            if (arg1.field675 > var11 || var11 > (2048 - arg1.field675)) {
                arg1.field700 = arg1.field716;
                var12 = false;
            }
            if (arg1.field739 == arg1.field701 && (arg1.field748 > 25 || var12)) {
                if (arg1.field692 == -1) {
                    arg1.field701 = arg1.field718;
                } else {
                    arg1.field701 = arg1.field692;
                }
            }
        } else {
            arg1.field700 -= arg1.field675;
            boolean var13 = true;
            if (arg1.field675 > var11 || var11 > (2048 - arg1.field675)) {
                arg1.field700 = arg1.field716;
                var13 = false;
            }
            if (arg1.field739 == arg1.field701 && (arg1.field748 > 25 || var13)) {
                if (arg1.field750 == -1) {
                    arg1.field701 = arg1.field718;
                } else {
                    arg1.field701 = arg1.field750;
                }
            }
        }
        arg1.field700 &= 0x7FF;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public static final int method1677(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class247(Component arg0) {
        this.field4397 = arg0;
    }
}

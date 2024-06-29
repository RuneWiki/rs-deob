import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class286 extends class208 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Ldg;")
    public static class148 field4638;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lrd;")
    public static class288 field4634;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLfj;)V")
    public static final void method1939(byte arg0, class274 arg1) {
        field4637++;
        int var2 = arg1.method1863((byte) -101);
        class220.field3465 = new class177[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class220.field3465[var3] = new class177();
            class220.field3465[var3].field2948 = arg1.method1863((byte) 33);
            class220.field3465[var3].field2946 = arg1.method1841(1975128088);
        }
        int var4 = 102 / ((-arg0 - 49) / 52);
        class231.field3618 = arg1.method1863((byte) -92);
        class112.field1718 = arg1.method1863((byte) 115);
        class65.field1043 = arg1.method1863((byte) 119);
        class120.field1898 = new class241[class112.field1718 + 1 - class231.field3618];
        for (int var5 = 0; var5 < class65.field1043; var5++) {
            int var6 = arg1.method1863((byte) -101);
            class241 var7 = class120.field1898[var6] = new class241();
            var7.field3607 = arg1.method1849(255);
            var7.field3612 = arg1.method1833((byte) -104);
            var7.field3764 = class231.field3618 + var6;
            var7.field3767 = arg1.method1841(1975128088);
            var7.field3766 = arg1.method1841(1975128088);
        }
        class106.field1655 = arg1.method1833((byte) -104);
        class273.field4420 = true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ltl;B)V")
    public static final void method1940(class69 arg0, byte arg1) {
        class56 var2 = null;
        class288.field4664 = 3;
        field4639++;
        class191.method1339((byte) -98, true);
        class8.field173 = 0;
        class244.field3867 = true;
        class275.field4503 = 0;
        class143.field2314 = true;
        class296.field4835 = true;
        class277.field4524 = true;
        class33.field545 = true;
        class127.field2032 = true;
        class4.field95 = true;
        class46.field689 = 0;
        class220.field3456 = 0;
        class66.field1067 = 127;
        class131.field2101 = true;
        class240.field3761 = 2;
        class44.field654 = 255;
        class236.field3701 = true;
        class101.field1586 = true;
        class117.field1804 = true;
        class129.field2066 = 127;
        if (class9.field197 >= 96) {
            class181.method1281(2);
        } else {
            class181.method1281(0);
        }
        class156.field2485 = false;
        class265.field4313 = 0;
        class91.field1432 = false;
        class184.field3053 = false;
        class57.field827 = 0;
        int var3 = -53 / ((arg1 + 12) / 44);
        class147.field2352 = 0;
        class186.field3077 = true;
        try {
            class301 var4 = arg0.method479(true, "runescape");
            while (var4.field4929 == 0) {
                class33.method250(1L, 256);
            }
            if (var4.field4929 == 1) {
                var2 = (class56) var4.field4930;
                byte[] var5 = new byte[(int) var2.method365(93)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var2.method361(var6, var5, var5.length - var6, (byte) -38);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class27.method208(-33, new class274(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method360(-22922);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static final void method1941(int arg0) {
        class181.method1276((long) class274.field4472);
        field4633++;
        if (class68.field1089 != -1) {
            class155.method1048(-126, class68.field1089);
        }
        for (int var1 = 0; var1 < class128.field2054; var1++) {
            if (class259.field4249[var1]) {
                class197.field3170[var1] = true;
            }
            class21.field403[var1] = class259.field4249[var1];
            class259.field4249[var1] = false;
        }
        class259.field4244 = -1;
        class162.field2649 = -1;
        class90.field1410 = null;
        if (arg0 != -17319) {
            return;
        }
        class311.field5032 = class274.field4472;
        if (class68.field1089 != -1) {
            class128.field2054 = 0;
            class292.method2015(true);
        }
        class94.method671();
        class61.field883 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V")
    public static final void method1942(int arg0, int arg1) {
        if (arg0 != -1) {
            field4638 = null;
        }
        field4631++;
        class192.field3135.method1880(arg0 - 108, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
    public static final void method1943(int arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg1[var5];
            int var7 = arg4;
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var6;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (arg1[var9] < (var9 & 0x1) + var6) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg1[arg0] = arg1[var7];
            arg1[var7] = var6;
            arg2[arg0] = arg2[var7];
            arg2[var7] = var8;
            method1943(var7 - 1, arg1, arg2, 0, arg4);
            method1943(arg0, arg1, arg2, arg3, var7 + 1);
        }
        field4632++;
        if (arg3 != 0) {
            method1942(-77, -88);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILgi;)I")
    public static final int method1944(int arg0, class164 arg1) {
        field4636++;
        int var2 = 0;
        if (arg1.method1168(0, class205.field3304)) {
            var2++;
        }
        if (arg1.method1168(0, class61.field878)) {
            var2++;
        }
        if (arg1.method1168(0, class229.field3591)) {
            var2++;
        }
        if (arg1.method1168(arg0, class29.field524)) {
            var2++;
        }
        if (arg1.method1168(0, class23.field428)) {
            var2++;
        }
        if (arg1.method1168(arg0, class275.field4496)) {
            var2++;
        }
        if (arg1.method1168(0, class58.field834)) {
            var2++;
        }
        if (arg1.method1168(0, class14.field291)) {
            var2++;
        }
        if (arg1.method1168(0, class210.field3340)) {
            var2++;
        }
        if (arg1.method1168(0, class250.field4113)) {
            var2++;
        }
        if (arg1.method1168(0, class163.field2657)) {
            var2++;
        }
        if (arg1.method1168(arg0, class71.field1144)) {
            var2++;
        }
        if (arg1.method1168(0, class163.field2652)) {
            var2++;
        }
        if (arg1.method1168(arg0, class99.field1566)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static final void method1945(byte arg0) {
        field4635++;
        if (arg0 != -51) {
            method1947(-28, -32);
        }
        int var1 = class108.field1681;
        int var2 = class60.field869;
        int var3 = class132.field2124 - class195.field3161 - var2;
        int var4 = class74.field1185 - class154.field2463 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class200.field3207 != null) {
                var5 = class200.field3207;
            } else if (class53.field776 == null) {
                var5 = class44.field659.field1105;
            } else {
                var5 = class53.field776;
            }
            int var6 = 0;
            int var7 = 0;
            if (class53.field776 == var5) {
                Insets var8 = class53.field776.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class132.field2124);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class74.field1185, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class74.field1185 - var4, var7, var4, class132.field2124);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class132.field2124 + var7 - var3, class74.field1185, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static void method1946(int arg0) {
        if (arg0 == -1) {
            field4638 = null;
            field4634 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)V")
    public static final void method1947(int arg0, int arg1) {
        field4629++;
        class66.field1081 = -1;
        if (arg1 != -97) {
            method1943(-35, (int[]) null, (Object[]) null, 27, 83);
        }
        class4.field104 = arg0;
        client.field2660 = 100;
        class108.field1685 = 3;
    }
}

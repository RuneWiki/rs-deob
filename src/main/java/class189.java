import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class189 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field3051 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lcc;")
    public static class216 field3055 = new class216(5);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;IIILbh;)Lql;")
    public static final class224 method1408(Component arg0, int arg1, int arg2, int arg3, class7 arg4) {
        field3054++;
        if (class28.field329 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class224 var5 = (class224) Class.forName("f").getDeclaredConstructor().newInstance();
                var5.field3604 = arg2;
                var5.field3588 = new int[(class216.field3439 ? 2 : 1) * 256];
                var5.method288(arg0);
                var5.field3601 = (arg2 & 0xFFFFFC00) + arg1;
                if (var5.field3601 > 16384) {
                    var5.field3601 = 16384;
                }
                var5.method289(var5.field3601);
                if (class36.field454 > 0 && class55.field801 == null) {
                    class55.field801 = new class123();
                    class55.field801.field1802 = arg4;
                    arg4.method53(class36.field454, class55.field801, arg1 - 1064);
                }
                if (class55.field801 != null) {
                    if (class55.field801.field1803[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class55.field801.field1803[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class258 var6 = new class258(arg4, arg3);
                    var6.field3604 = arg2;
                    var6.field3588 = new int[(class216.field3439 ? 2 : 1) * 256];
                    var6.method288(arg0);
                    var6.field3601 = 16384;
                    var6.method289(var6.field3601);
                    if (class36.field454 > 0 && class55.field801 == null) {
                        class55.field801 = new class123();
                        class55.field801.field1802 = arg4;
                        arg4.method53(class36.field454, class55.field801, 120);
                    }
                    if (class55.field801 != null) {
                        if (class55.field801.field1803[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class55.field801.field1803[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class224();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZZIIIBI)V")
    public static final void method1409(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3052++;
        if (!arg1 && class245.field4024 == arg4 && class44.field647 == arg3 && class11.field134 == arg5 || class77.method566((byte) -61)) {
            return;
        }
        class245.field4024 = arg4;
        class11.field134 = arg5;
        class44.field647 = arg3;
        if (class77.method566((byte) -16)) {
            class11.field134 = 0;
        }
        if (arg2) {
            class256.method1811(28, true);
        } else {
            class256.method1811(25, true);
        }
        class12.method94(class132.field2182, 250, true);
        int var8 = class99.field1465;
        class99.field1465 = (arg3 - 6) * 8;
        int var9 = class282.field4487;
        class282.field4487 = arg4 * 8 - 48;
        class195.field3162 = class285.method1940(class44.field647 * 8, (byte) 90, class245.field4024 * 8);
        if (arg6 != -25) {
            method1409(-47, false, true, 111, -30, -92, (byte) -20, 85);
        }
        class244.field3958 = null;
        int var10 = class99.field1465 - var8;
        int var11 = class282.field4487 - var9;
        int var12 = class282.field4487;
        int var13 = class99.field1465;
        if (arg2) {
            class21.field235 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class18 var15 = class169.field2730[var14];
                if (var15 != null) {
                    var15.field1979 -= var11 * 128;
                    var15.field1910 -= var10 * 128;
                    if (var15.field1979 >= 0 && var15.field1979 <= 13184 && var15.field1910 >= 0 && var15.field1910 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field1917[var16] -= var11;
                            var15.field1974[var16] -= var10;
                        }
                        class39.field556[class21.field235++] = var14;
                    } else {
                        class169.field2730[var14].method122(-3662, (class245) null);
                        class169.field2730[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class18 var33 = class169.field2730[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field1917[var34] -= var11;
                        var33.field1974[var34] -= var10;
                    }
                    var33.field1910 -= var10 * 128;
                    var33.field1979 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class29 var31 = class92.field1374[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field1917[var32] -= var11;
                    var31.field1974[var32] -= var10;
                }
                var31.field1979 -= var11 * 128;
                var31.field1910 -= var10 * 128;
            }
        }
        class58.field826 = arg5;
        class186.field2993.method204(false, arg0, false, arg7);
        byte var19 = 0;
        byte var20 = 104;
        byte var21 = 104;
        byte var22 = 0;
        byte var23 = 1;
        if (var11 < 0) {
            var19 = 103;
            var20 = -1;
            var23 = -1;
        }
        byte var24 = 1;
        if (var10 < 0) {
            var22 = 103;
            var24 = -1;
            var21 = -1;
        }
        for (int var25 = var19; var25 != var20; var25 += var23) {
            for (int var27 = var22; var27 != var21; var27 += var24) {
                int var28 = var25 + var11;
                int var29 = var10 + var27;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class43.field627[var30][var25][var27] = class43.field627[var30][var28][var29];
                    } else {
                        class43.field627[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class274 var26 = (class274) class105.field1528.method1384(arg6 ^ 0xFFFFFFE5); var26 != null; var26 = (class274) class105.field1528.method1388((byte) 116)) {
            var26.field4399 -= var10;
            var26.field4402 -= var11;
            if (var26.field4402 < 0 || var26.field4399 < 0 || var26.field4402 >= 104 || var26.field4399 >= 104) {
                var26.method1922(arg6 + 24);
            }
        }
        if (class288.field4580 != 0) {
            class288.field4580 -= var11;
            class49.field704 -= var10;
        }
        if (arg2) {
            class146.field2384 -= var11;
            class46.field666 -= var11;
            class196.field3177 -= var10 * 128;
            class77.field1105 -= var10;
            class293.field4651 -= var10;
            class50.field736 -= var11 * 128;
        } else {
            class176.field2853 = 1;
        }
        class133.field2193 = -1;
        class133.field2191 = 0;
        class143.field2309.method1382(0);
        class11.field130.method1382(arg6 ^ 0xFFFFFFE7);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLv;I)V")
    private final void method1410(boolean arg0, class152 arg1, int arg2) {
        if (arg0) {
            this.method1412((byte) -50, (class152) null);
        }
        if (arg2 == 5) {
            this.field3051 = arg1.method1126(false);
        }
        field3058++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZLjava/awt/Color;ILjava/lang/String;)V")
    public static final void method1411(int arg0, boolean arg1, Color arg2, int arg3, String arg4) {
        try {
            int var5 = 105 / ((-arg3 - 42) / 51);
            Graphics var6 = class10.field89.getGraphics();
            if (class195.field3160 == null) {
                class195.field3160 = new Font("Helvetica", 1, 13);
                class206.field3317 = class10.field89.getFontMetrics(class195.field3160);
            }
            if (arg1) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class23.field265, class154.field2543);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class111.field1606 == null) {
                    class111.field1606 = class10.field89.createImage(304, 34);
                }
                Graphics var7 = class111.field1606.getGraphics();
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var7.setFont(class195.field3160);
                var7.setColor(Color.white);
                var7.drawString(arg4, (304 - class206.field3317.stringWidth(arg4)) / 2, 22);
                var6.drawImage(class111.field1606, class23.field265 / 2 - 152, class154.field2543 / 2 + -18, (ImageObserver) null);
            } catch (Exception var10) {
                int var8 = class154.field2543 / 2 - 18;
                int var9 = class23.field265 / 2 - 152;
                var6.setColor(arg2);
                var6.drawRect(var9, var8, 303, 33);
                var6.fillRect(var9 + 2, var8 - -2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var9 + 1, var8 + 1, 301, 31);
                var6.fillRect(var9 + (arg0 * 3) + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class195.field3160);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class206.field3317.stringWidth(arg4)) / 2 + var9, var8 - -22);
            }
            if (class195.field3157 != null) {
                var6.setFont(class195.field3160);
                var6.setColor(Color.white);
                var6.drawString(class195.field3157, class23.field265 / 2 - class206.field3317.stringWidth(class195.field3157) / 2, class154.field2543 / 2 + -26);
            }
        } catch (Exception var11) {
            class10.field89.repaint();
        }
        field3059++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLv;)V")
    public final void method1412(byte arg0, class152 arg1) {
        field3057++;
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                if (arg0 == -88) {
                    return;
                } else {
                    method1413((byte) -31);
                    return;
                }
            }
            this.method1410(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1413(byte arg0) {
        field3055 = null;
        if (arg0 != 64) {
            field3055 = null;
        }
    }
}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class301 extends class153 {

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Lqd;")
    public static class40 field5045 = class147.method1106("::serverjs5drop", (byte) -86);

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
    public static int[] field5048 = new int[2048];

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Z")
    public static boolean field5052 = false;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lqd;")
    private static class40 field5044 = class147.method1106("red:", (byte) -98);

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
    public static int[] field5049 = new int[32];

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lqd;")
    public static class40 field5043 = field5044;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "Lqd;")
    public static class40 field5055 = class147.method1106("::clientjs5drop", (byte) -50);

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lqd;")
    public static class40 field5047 = field5044;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Lce;")
    public static class239 field5058;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class150.method1124(arg2 + arg3, -arg3 + arg2, arg4, true, class37.field694[arg1]);
        int var6 = 0;
        int var7 = arg5;
        field5056++;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = var8 << 2;
        int var13 = arg5 << 1;
        int var14 = var9 << 2;
        int var15 = var9 - (var13 - 1) * var10;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = (1 - var13) * var8 + var11;
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var14;
        int var20 = (arg0 + arg5) * var12;
        while (var7 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var6++;
                    var15 += var19;
                    var19 += var14;
                    var17 += var16;
                    var16 += var14;
                }
            }
            if (var15 < 0) {
                var15 += var19;
                var17 += var16;
                var16 += var14;
                var19 += var14;
                var6++;
            }
            var17 += -var20;
            var20 -= var12;
            var7--;
            var15 += -var18;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            var18 -= var12;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class150.method1124(var23, var24, arg4, true, class37.field694[var21]);
            class150.method1124(var23, var24, arg4, true, class37.field694[var22]);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 88)
    public static final void method2053(byte arg0) {
        field5046++;
        if (arg0 > 60) {
            class285.field4795.method1349(true);
            class104.field1843.method1349(true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIILbg;JLbg;Lbg;)V", line = 104)
    public static final void method2054(int arg0, int arg1, int arg2, int arg3, class196 arg4, long arg5, class196 arg6, class196 arg7) {
        class299 var9 = new class299();
        var9.field5007 = arg4;
        var9.field4997 = arg1 * 128 + 64;
        var9.field4995 = arg2 * 128 + 64;
        var9.field4993 = arg3;
        var9.field5006 = arg5;
        var9.field4991 = arg6;
        var9.field4992 = arg7;
        int var10 = 0;
        class14 var11 = class93.field1690[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field216; var12++) {
                class193 var13 = var11.field230[var12];
                if ((var13.field3101 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3106.method74();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4999 = -var10;
        if (class93.field1690[arg0][arg1][arg2] == null) {
            class93.field1690[arg0][arg1][arg2] = new class14(arg0, arg1, arg2);
        }
        class93.field1690[arg0][arg1][arg2].field232 = var9;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/awt/Color;Lqd;ZI)V", line = 153)
    public static final void method2055(int arg0, Color arg1, class40 arg2, boolean arg3, int arg4) {
        try {
            Graphics var5 = class213.field3470.getGraphics();
            if (class40.field772 == null) {
                class40.field772 = new Font("Helvetica", 1, 13);
                class204.field3251 = class213.field3470.getFontMetrics(class40.field772);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class112.field1945, class73.field1287);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class233.field3838 == null) {
                    class233.field3838 = class213.field3470.createImage(304, 34);
                }
                Graphics var6 = class233.field3838.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class40.field772);
                var6.setColor(Color.white);
                arg2.method363(22, var6, (arg0 - arg2.method344(-4682, class204.field3251)) / 2, true);
                var5.drawImage(class233.field3838, class112.field1945 / 2 - 152, class73.field1287 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class112.field1945 / 2 - 152;
                int var9 = class73.field1287 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class40.field772);
                var5.setColor(Color.white);
                arg2.method363(var9 + 22, var5, var8 + (304 - arg2.method344(-4682, class204.field3251)) / 2, true);
            }
            if (class94.field1700 != null) {
                var5.setFont(class40.field772);
                var5.setColor(Color.white);
                class94.field1700.method363(class73.field1287 / 2 - 26, var5, class112.field1945 / 2 - class94.field1700.method344(arg0 - 4986, class204.field3251) / 2, true);
            }
        } catch (Exception var12) {
            class213.field3470.repaint();
        }
        field5050++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lce;Lce;I)V", line = 244)
    public static final void method2056(class239 arg0, class239 arg1, int arg2) {
        field5054++;
        class23.field420 = arg1;
        if (arg2 != 32320) {
            field5052 = true;
        }
        class252.field4184 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 265)
    public static final void method2057(int arg0) {
        class176.method1293();
        field5042++;
        class250.field4132 = new class66[7];
        class250.field4132[1] = new class32();
        class250.field4132[2] = new class143();
        class250.field4132[3] = new class155();
        class250.field4132[4] = new class305();
        class250.field4132[5] = new class310();
        class250.field4132[arg0] = new class16();
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V", line = 280)
    public static void method2058(byte arg0) {
        field5047 = null;
        field5043 = null;
        field5044 = null;
        field5045 = null;
        field5048 = null;
        field5058 = null;
        if (arg0 >= -108) {
            method2053((byte) 7);
        }
        field5049 = null;
        field5055 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqd;)I", line = 321)
    public static final int method2059(int arg0, class40 arg1) {
        field5053++;
        if (class160.field2670 == null || arg1.method350(true) == 0) {
            return -1;
        }
        if (arg0 <= 65) {
            method2055(61, (Color) null, (class40) null, true, -88);
        }
        for (int var2 = 0; var2 < class160.field2670.field5275; var2++) {
            if (class160.field2670.field5291[var2].method338(class27.field554, true, class120.field2021).method341(arg1, 101)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIII)V", line = 348)
    public static final void method2060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5057++;
        if (class255.method1799(arg0, false)) {
            client.method1729(class44.field845[arg0], -1, arg5, arg7, arg4, arg6, arg2, arg1);
            if (arg3 != 16492) {
                field5052 = true;
            }
        }
    }
}

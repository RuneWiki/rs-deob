import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class120 extends class62 {

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Lpa;")
    public static class140 field2022 = new class140(8);

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Lci;")
    public static class171 field2028 = new class171();

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "[I")
    public static int[] field2030 = new int[32];

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "Leg;")
    public static class37 field2031 = class174.method1167(": ", -69);

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Z")
    public static boolean field2034 = true;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "[Lja;")
    public static class105[] field2025;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Color;Leg;ZII)V")
    public static final void method850(Color arg0, class37 arg1, boolean arg2, int arg3, int arg4) {
        try {
            Graphics var5 = class93.field1466.getGraphics();
            if (class20.field268 == null) {
                class20.field268 = new Font("Helvetica", 1, 13);
                class226.field3880 = class93.field1466.getFontMetrics(class20.field268);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class249.field4479, class199.field3390);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class146.field2488 == null) {
                    class146.field2488 = class93.field1466.createImage(304, 34);
                }
                Graphics var6 = class146.field2488.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                if (arg3 != 23931) {
                    method852((class164) null, 34, 115, 38, 58, 9, 96, false);
                }
                var6.setFont(class20.field268);
                var6.setColor(Color.white);
                arg1.method236(80, 22, var6, (304 - arg1.method224(class226.field3880, 87)) / 2);
                var5.drawImage(class146.field2488, class249.field4479 / 2 - 152, class199.field3390 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class249.field4479 / 2 - 152;
                int var8 = class199.field3390 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var7 + 2, var8 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class20.field268);
                var5.setColor(Color.white);
                arg1.method236(-109, var8 + 22, var5, (304 - arg1.method224(class226.field3880, arg3 ^ 0x5D25)) / 2 + var7);
            }
            if (class4.field77 != null) {
                var5.setFont(class20.field268);
                var5.setColor(Color.white);
                class4.field77.method236(-85, class199.field3390 / 2 - 26, var5, class249.field4479 / 2 - (class4.field77.method224(class226.field3880, arg3 ^ 0x5D07) / 2));
            }
        } catch (Exception var10) {
            class93.field1466.repaint();
        }
        field2023++;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static void method851(int arg0) {
        field2025 = null;
        field2022 = null;
        field2028 = null;
        field2031 = null;
        field2030 = null;
        int var1 = 7 % ((arg0 - 2) / 43);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lli;IIIIIIZ)V")
    public static final void method852(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2711.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2711[var9] - class23.field301;
            int var23 = arg0.field2707[var9] - field2032;
            int var24 = arg0.field2700[var9] - class184.field3099;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2709 != null) {
                class164.field2716[var9] = var25;
                class164.field2702[var9] = var28;
                class164.field2720[var9] = var29;
            }
            class164.field2712[var9] = (var25 << 9) / var29 + class76.field1179;
            class164.field2703[var9] = (var28 << 9) / var29 + class76.field1194;
        }
        class76.field1193 = 0;
        int var10 = arg0.field2713.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2713[var11];
            int var13 = arg0.field2701[var11];
            int var14 = arg0.field2699[var11];
            int var15 = class164.field2712[var12];
            int var16 = class164.field2712[var13];
            int var17 = class164.field2712[var14];
            int var18 = class164.field2703[var12];
            int var19 = class164.field2703[var13];
            int var20 = class164.field2703[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class160.field2672 && class110.method773(class76.field1179 + class265.field4650, class76.field1194 + class270.field4713, var18, var19, var20, var15, var16, var17)) {
                    class172.field2886 = arg5;
                    class83.field1313 = arg6;
                }
                if (!arg7) {
                    class76.field1186 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class76.field1190 || var16 > class76.field1190 || var17 > class76.field1190) {
                        class76.field1186 = true;
                    }
                    if (arg0.field2709 == null || arg0.field2709[var11] == -1) {
                        if (arg0.field2704[var11] != 12345678) {
                            class76.method515(var18, var19, var20, var15, var16, var17, arg0.field2704[var11], arg0.field2717[var11], arg0.field2710[var11]);
                        }
                    } else if (!class40.field646) {
                        int var21 = class76.field1196.method717(0, arg0.field2709[var11]);
                        class76.method515(var18, var19, var20, var15, var16, var17, class109.method758(var21, arg0.field2704[var11]), class109.method758(var21, arg0.field2717[var11]), class109.method758(var21, arg0.field2710[var11]));
                    } else if (arg0.field2705) {
                        class76.method514(var18, var19, var20, var15, var16, var17, arg0.field2704[var11], arg0.field2717[var11], arg0.field2710[var11], class164.field2716[0], class164.field2716[1], class164.field2716[3], class164.field2702[0], class164.field2702[1], class164.field2702[3], class164.field2720[0], class164.field2720[1], class164.field2720[3], arg0.field2709[var11]);
                    } else {
                        class76.method514(var18, var19, var20, var15, var16, var17, arg0.field2704[var11], arg0.field2717[var11], arg0.field2710[var11], class164.field2716[var12], class164.field2716[var13], class164.field2716[var14], class164.field2702[var12], class164.field2702[var13], class164.field2702[var14], class164.field2720[var12], class164.field2720[var13], class164.field2720[var14], arg0.field2709[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2027 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2030[var1] = var0 - 1;
            var0 += var0;
        }
    }
}

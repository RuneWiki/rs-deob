import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class229 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    public static int[] field3476 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[J")
    public static long[] field3477 = new long[200];

    @OriginalMember(owner = "client!og", name = "i", descriptor = "B")
    public static byte field3481;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIIIZII)V", line = 7)
    public static final void method1587(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3475++;
        if (!arg0 && class84.field1099 == arg4 && class344.field5466 == arg2 && class207.field3127 == arg7 || class103.method653(-29308)) {
            return;
        }
        class207.field3127 = arg7;
        class84.field1099 = arg4;
        class344.field5466 = arg2;
        if (class103.method653(arg6 - 29316)) {
            class207.field3127 = 0;
        }
        if (arg5) {
            class219.method1525((byte) -89, 28);
        } else {
            class219.method1525((byte) 83, 25);
        }
        class305.method2152(true, class174.field2628, -9223);
        int var8 = class16.field160;
        int var9 = class322.field4999;
        class322.field4999 = arg4 * 8 - 48;
        class16.field160 = arg2 * 8 - 48;
        class322.field5005 = class336.method2309(class84.field1099 * 8, class344.field5466 * arg6);
        int var10 = class16.field160 - var8;
        int var11 = class16.field160;
        int var12 = class322.field4999 - var9;
        class117.field1639 = null;
        int var13 = class322.field4999;
        if (arg5) {
            class296.field4667 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class231 var18 = class251.field3974[var17];
                if (var18 != null) {
                    var18.field3763 -= var10 * 128;
                    var18.field3767 -= var12 * 128;
                    if (var18.field3767 >= 0 && var18.field3767 <= 13184 && var18.field3763 >= 0 && var18.field3763 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field3747[var19] -= var12;
                            var18.field3786[var19] -= var10;
                        }
                        class225.field3392[class296.field4667++] = var17;
                    } else {
                        class251.field3974[var17].method1599(23299, (class140) null);
                        class251.field3974[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class231 var15 = class251.field3974[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field3747[var16] -= var12;
                        var15.field3786[var16] -= var10;
                    }
                    var15.field3763 -= var10 * 128;
                    var15.field3767 -= var12 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class67 var21 = class105.field1443[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field3747[var22] -= var12;
                    var21.field3786[var22] -= var10;
                }
                var21.field3767 -= var12 * 128;
                var21.field3763 -= var10 * 128;
            }
        }
        class219.field3290 = arg7;
        class11.field113.method407(arg3, arg1, false, 0);
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        if (var12 < 0) {
            var23 = 103;
            var24 = -1;
            var25 = -1;
        }
        byte var26 = 0;
        byte var27 = 1;
        byte var28 = 104;
        if (var10 < 0) {
            var26 = 103;
            var28 = -1;
            var27 = -1;
        }
        for (int var29 = var23; var29 != var25; var29 += var24) {
            for (int var30 = var26; var30 != var28; var30 += var27) {
                int var31 = var10 + var30;
                int var32 = var12 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class345.field5472[var33][var29][var30] = class345.field5472[var33][var32][var31];
                    } else {
                        class345.field5472[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class254 var34 = (class254) class27.field327.method1812(arg6 - 7); var34 != null; var34 = (class254) class27.field327.method1809(128)) {
            var34.field4024 -= var10;
            var34.field4032 -= var12;
            if (var34.field4032 < 0 || var34.field4024 < 0 || var34.field4032 >= 104 || var34.field4024 >= 104) {
                var34.method1290(123);
            }
        }
        class298.field4681 = 0;
        if (arg5) {
            class211.field3196 -= var12;
            class93.field1222 -= var10;
            class280.field4415 -= var10 * 128;
            class10.field96 -= var12 * 128;
            class11.field118 -= var12;
            class267.field4199 -= var10;
        } else {
            class120.field1667 = 1;
        }
        if (class309.field4795 != 0) {
            class5.field57 -= var10;
            class309.field4795 -= var12;
        }
        if (class272.field4317 && arg5 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class306.method2155((byte) 47);
        }
        class67.method416(1);
        class91.field1197.method1811((byte) -30);
        class50.field570.method1811((byte) -30);
        class141.method975();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLgi;IIIII)V", line = 254)
    public static final void method1588(byte arg0, class242 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class196.method1371(arg4, arg3, arg5, arg6, arg1.field3763, arg2, arg1.field3767, (byte) -108);
        int var7 = -85 % ((arg0 - 18) / 43);
        field3479++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Color;IILjava/lang/String;Z)V", line = 267)
    public static final void method1589(Color arg0, int arg1, int arg2, String arg3, boolean arg4) {
        field3473++;
        try {
            Graphics var5 = class328.field5287.getGraphics();
            if (class99.field1336 == null) {
                class99.field1336 = new Font("Helvetica", 1, 13);
                class222.field3353 = class328.field5287.getFontMetrics(class99.field1336);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class165.field2546, class95.field1307);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class18.field208 == null) {
                    class18.field208 = class328.field5287.createImage(304, 34);
                }
                Graphics var6 = class18.field208.getGraphics();
                if (arg1 <= 16) {
                    method1592(102, 110, -26, (byte) -102, -55, 69, 41);
                }
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class99.field1336);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class222.field3353.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class18.field208, class165.field2546 / 2 - 152, class95.field1307 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class165.field2546 / 2 - 152;
                int var9 = class95.field1307 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg2 * 3) + 2, var9 - -2, 300 - (arg2 * 3), 30);
                var5.setFont(class99.field1336);
                var5.setColor(Color.white);
                var5.drawString(arg3, (304 - class222.field3353.stringWidth(arg3)) / 2 + var8, var9 + 22);
            }
            if (class84.field1092 != null) {
                var5.setFont(class99.field1336);
                var5.setColor(Color.white);
                var5.drawString(class84.field1092, class165.field2546 / 2 - class222.field3353.stringWidth(class84.field1092) / 2, class95.field1307 / 2 + -26);
            }
        } catch (Exception var12) {
            class328.field5287.repaint();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 343)
    public static void method1590(byte arg0) {
        field3477 = null;
        if (arg0 == -84) {
            field3476 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I", line = 358)
    public static final int method1591(int arg0, int arg1) {
        field3478++;
        return arg1 == 2 ? arg0 & 0xFF : 31;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIBIII)V", line = 382)
    public static final void method1592(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3480++;
        if (arg3 != -96) {
            method1592(116, -42, 91, (byte) -103, 60, -53, -124);
        }
        int var7 = class112.method728(arg5, class244.field3844, class2.field22, -69);
        int var8 = class112.method728(arg2, class244.field3844, class2.field22, arg3 ^ 0x1E);
        int var9 = class112.method728(arg4, class337.field5389, class344.field5460, arg3 ^ 0x24);
        int var10 = class112.method728(arg1, class337.field5389, class344.field5460, arg3 + 67);
        int var11 = class112.method728(arg5 + arg6, class244.field3844, class2.field22, -121);
        int var12 = class112.method728(arg2 - arg6, class244.field3844, class2.field22, -103);
        for (int var13 = var7; var13 < var11; var13++) {
            class278.method1986(var9, class347.field5501[var13], arg0, var10, (byte) -101);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class278.method1986(var9, class347.field5501[var14], arg0, var10, (byte) 45);
        }
        int var15 = class112.method728(arg4 + arg6, class337.field5389, class344.field5460, -103);
        int var16 = class112.method728(arg1 - arg6, class337.field5389, class344.field5460, arg3 ^ 0x63);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class347.field5501[var17];
            class278.method1986(var9, var18, arg0, var15, (byte) 118);
            class278.method1986(var16, var18, arg0, var10, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Luc;", line = 437)
    public static final class212 method1593(byte arg0) {
        if (arg0 != -70) {
            method1588((byte) -126, (class242) null, -8, 0, 20, -97, 58);
        }
        field3474++;
        return class336.field5347;
    }
}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 extends class199 {

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "Lli;")
    public class91 field1308;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "[[Lfm;")
    public static class127[][] field1307;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lki;B)V", line = 6)
    public static final void method591(class180 arg0, byte arg1) {
        field1312++;
        class289.field4507 = 3;
        class188.method1341(false, true);
        class152.field2291 = true;
        class208.field3191 = true;
        class89.field1422 = 0;
        class201.field3016 = 127;
        class170.field2565 = true;
        class300.field4691 = true;
        class298.field4598 = 0;
        class259.field4057 = 0;
        class289.field4503 = true;
        if (arg1 < 63) {
            method595((byte) 68, -5, (String) null, true, (Color) null);
        }
        class274.field4244 = true;
        class217.field3303 = true;
        class260.field4071 = true;
        class188.field2815 = true;
        class289.field4502 = 255;
        class232.field3674 = true;
        class289.field4509 = 2;
        class1.field20 = 127;
        class181.field2734 = 0;
        class59.field962 = true;
        class14 var2 = null;
        if (class318.field4975 >= 96) {
            class64.method490(2);
        } else {
            class64.method490(0);
        }
        class331.field5144 = 0;
        class210.field3208 = true;
        class139.field2170 = false;
        class322.field5029 = 0;
        class270.field4209 = 0;
        class55.field925 = false;
        class34.field512 = false;
        try {
            class197 var3 = arg0.method1275(5600, "runescape");
            while (var3.field2956 == 0) {
                class5.method26(0, 1L);
            }
            if (var3.field2956 == 1) {
                var2 = (class14) var3.field2959;
                byte[] var4 = new byte[(int) var2.method103(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method106(var5, var4, false, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class46.method409(new class166(var4), 4);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method102((byte) 18);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 95)
    public static void method592(boolean arg0) {
        field1307 = (class127[][]) null;
        if (!arg0) {
            method592(true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V", line = 105)
    public static final void method593(int arg0) {
        class325.field5056 = true;
        field1309++;
        if (arg0 != 64) {
            field1307 = (class127[][]) ((class127[][]) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V", line = 119)
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1310++;
        for (class239 var5 = (class239) class304.field4739.method636(-1); var5 != null; var5 = (class239) class304.field4739.method638(62)) {
            class284.method1940(arg0, arg4, var5, arg1, true, arg2);
        }
        if (arg3 < 106) {
            field1305 = 97;
        }
        for (class239 var6 = (class239) class272.field4223.method636(-1); var6 != null; var6 = (class239) class272.field4223.method638(75)) {
            byte var7 = 1;
            class333 var8 = var6.field3811.method888(0);
            if (var6.field3811.field1872 == var8.field5206) {
                var7 = 0;
            } else if (var6.field3811.field1872 == var8.field5180 || var6.field3811.field1872 == var8.field5217 || var6.field3811.field1872 == var8.field5187 || var6.field3811.field1872 == var8.field5186) {
                var7 = 2;
            } else if (var6.field3811.field1872 == var8.field5185 || var6.field3811.field1872 == var8.field5178 || var6.field3811.field1872 == var8.field5205 || var6.field3811.field1872 == var8.field5196) {
                var7 = 3;
            }
            if (var6.field3801 != var7) {
                int var9 = class30.method254((byte) 74, var6.field3811);
                if (var6.field3803 != var9) {
                    if (var6.field3806 != null) {
                        class98.field1560.method1864(var6.field3806);
                        var6.field3806 = null;
                    }
                    var6.field3803 = var9;
                }
                var6.field3801 = var7;
            }
            var6.field3812 = var6.field3811.field1905;
            var6.field3814 = var6.field3811.field1905 + (var6.field3811.method280(false) * 64);
            var6.field3804 = var6.field3811.field1868;
            var6.field3818 = var6.field3811.field1868 + (var6.field3811.method280(false) * 64);
            class284.method1940(arg0, arg4, var6, arg1, true, arg2);
        }
        for (class239 var10 = (class239) class55.field917.method1228(true); var10 != null; var10 = (class239) class55.field917.method1223((byte) 13)) {
            class333 var11 = var10.field3796.method888(0);
            byte var12 = 1;
            if (var10.field3796.field1872 == var11.field5206) {
                var12 = 0;
            } else if (var10.field3796.field1872 == var11.field5180 || var10.field3796.field1872 == var11.field5217 || var10.field3796.field1872 == var11.field5187 || var10.field3796.field1872 == var11.field5186) {
                var12 = 2;
            } else if (var10.field3796.field1872 == var11.field5185 || var10.field3796.field1872 == var11.field5178 || var10.field3796.field1872 == var11.field5205 || var10.field3796.field1872 == var11.field5196) {
                var12 = 3;
            }
            if (var10.field3801 != var12) {
                int var13 = class206.method1471(var10.field3796, -1);
                if (var10.field3803 != var13) {
                    if (var10.field3806 != null) {
                        class98.field1560.method1864(var10.field3806);
                        var10.field3806 = null;
                    }
                    var10.field3803 = var13;
                }
                var10.field3801 = var12;
            }
            var10.field3812 = var10.field3796.field1905;
            var10.field3814 = var10.field3796.field1905 + var10.field3796.method280(false) * 64;
            var10.field3804 = var10.field3796.field1868;
            var10.field3818 = var10.field3796.field1868 + (var10.field3796.method280(false) * 64);
            class284.method1940(arg0, arg4, var10, arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILjava/lang/String;ZLjava/awt/Color;)V", line = 236)
    public static final void method595(byte arg0, int arg1, String arg2, boolean arg3, Color arg4) {
        try {
            if (arg0 != -121) {
                field1311 = -19;
            }
            Graphics var5 = class238.field3782.getGraphics();
            if (class191.field2864 == null) {
                class191.field2864 = new Font("Helvetica", 1, 13);
                class112.field1738 = class238.field3782.getFontMetrics(class191.field2864);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class188.field2816, class322.field5024);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class139.field2174 == null) {
                    class139.field2174 = class238.field3782.createImage(304, 34);
                }
                Graphics var6 = class139.field2174.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class191.field2864);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - class112.field1738.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class139.field2174, class188.field2816 / 2 - 152, class322.field5024 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class322.field5024 / 2 - 18;
                int var9 = class188.field2816 / 2 - 152;
                var5.setColor(arg4);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect((arg1 * 3) + var9 + 2, var8 - -2, 300 - arg1 * 3, 30);
                var5.setFont(class191.field2864);
                var5.setColor(Color.white);
                var5.drawString(arg2, (304 - class112.field1738.stringWidth(arg2)) / 2 + var9, var8 - -22);
            }
            if (class218.field3324 != null) {
                var5.setFont(class191.field2864);
                var5.setColor(Color.white);
                var5.drawString(class218.field3324, class188.field2816 / 2 - class112.field1738.stringWidth(class218.field3324) / 2, class322.field5024 / 2 + -26);
            }
        } catch (Exception var12) {
            class238.field3782.repaint();
        }
        field1306++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lli;)V", line = 305)
    public class84(class91 arg0) {
        this.field1308 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 323)
    public static final void method596(int arg0, int arg1, int arg2) {
        class225.field3589[arg1] = arg0;
        field1304++;
        class65 var3 = (class65) class292.field4538.method1222(0, (long) arg1);
        if (arg2 < 48) {
            field1305 = -62;
        }
        if (var3 == null) {
            class65 var4 = new class65(4611686018427387905L);
            class292.field4538.method1227(var4, 0, (long) arg1);
        } else if (var3.field1022 != 4611686018427387905L) {
            var3.field1022 = class102.method743((byte) 81) + 500L | 0x4000000000000000L;
        }
    }
}

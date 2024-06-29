import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class266 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private int field4213 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Z")
    public boolean field4226 = true;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field4229 = -1;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field4215 = 128;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Llb;")
    public static class112 field4224 = new class112(new byte[5000]);

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Lok;")
    public static class41 field4233 = class137.method956("", 45);

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lok;")
    public static class41 field4232 = field4233;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lok;")
    public static class41 field4236 = field4233;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "[I")
    public static int[] field4230;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLlb;I)V", line = 5)
    private final void method1879(int arg0, boolean arg1, class112 arg2, int arg3) {
        if (arg3 == 1) {
            this.field4213 = arg2.method757(11997);
            this.method1880(-1, this.field4213);
        } else if (arg3 == 2) {
            this.field4229 = arg2.method759((byte) -114);
            if (this.field4229 == 65535) {
                this.field4229 = -1;
            }
        } else if (arg3 == 3) {
            this.field4215 = arg2.method759((byte) -72);
        } else if (arg3 == 4) {
            this.field4226 = false;
        }
        field4222++;
        if (!arg1) {
            method1882(-61, true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 45)
    private final void method1880(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field4219++;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        double var11 = 0.0D;
        double var13 = (double) ((arg1 & 0xFF9C) >> 8) / 256.0D;
        if (var3 > var13) {
            var9 = var13;
        }
        double var15 = 0.0D;
        if (var9 > var5) {
            var9 = var5;
        }
        if (var13 > var3) {
            var7 = var13;
        }
        if (var5 > var7) {
            var7 = var5;
        }
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var3 == var7) {
                var11 = (var13 - var5) / (var7 - var9);
            } else if (var7 == var13) {
                var11 = (var5 - var3) / (var7 - var9) + 2.0D;
            } else if (var5 == var7) {
                var11 = (var3 - var13) / (var7 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var7 - var9) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var7 - var9) / (2.0D - var7 - var9);
            }
        }
        this.field4217 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        this.field4235 = (int) (var17 * 256.0D);
        if (this.field4235 < 0) {
            this.field4235 = 0;
        } else if (this.field4235 > 255) {
            this.field4235 = 255;
        }
        if (arg0 < ~this.field4217) {
            this.field4217 = 0;
        } else if (this.field4217 > 255) {
            this.field4217 = 255;
        }
        if (var17 > 0.5D) {
            this.field4220 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4220 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4220 < 1) {
            this.field4220 = 1;
        }
        this.field4225 = (int) ((double) this.field4220 * var19);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 131)
    public static final void method1881(byte arg0) {
        field4211++;
        if (arg0 != -94) {
            field4234 = -48;
        }
        class63.field927.method131(arg0 ^ 0x5C);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V", line = 156)
    public static final void method1882(int arg0, boolean arg1) {
        if (arg0 >= -59) {
            method1885(-94);
        }
        field4218++;
        if (class317.field5364 != arg1) {
            class317.field5364 = arg1;
            class20.method133((byte) 51);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/awt/Component;Lag;II)Lcd;", line = 176)
    public static final class36 method1883(int arg0, Component arg1, class211 arg2, int arg3, int arg4) {
        field4212++;
        if (class202.field3240 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                if (arg0 < 107) {
                    return (class36) null;
                }
                class36 var5 = (class36) Class.forName("kl").getDeclaredConstructor().newInstance();
                var5.field555 = arg4;
                var5.field547 = new int[(class112.field1656 ? 2 : 1) * 256];
                var5.method249(arg1);
                var5.field558 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field558 > 16384) {
                    var5.field558 = 16384;
                }
                var5.method239(var5.field558);
                if (class213.field3430 > 0 && class112.field1651 == null) {
                    class112.field1651 = new class124();
                    class112.field1651.field1845 = arg2;
                    arg2.method1479(class112.field1651, 89, class213.field3430);
                }
                if (class112.field1651 != null) {
                    if (class112.field1651.field1843[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class112.field1651.field1843[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class47 var7 = new class47(arg2, arg3);
                    var7.field547 = new int[(class112.field1656 ? 2 : 1) * 256];
                    var7.field555 = arg4;
                    var7.method249(arg1);
                    var7.field558 = 16384;
                    var7.method239(var7.field558);
                    if (class213.field3430 > 0 && class112.field1651 == null) {
                        class112.field1651 = new class124();
                        class112.field1651.field1845 = arg2;
                        arg2.method1479(class112.field1651, 108, class213.field3430);
                    }
                    if (class112.field1651 != null) {
                        if (class112.field1651.field1843[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class112.field1651.field1843[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class36();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 265)
    public static final void method1884(int arg0) {
        field4221++;
        if (arg0 != 17153) {
            method1886(101, (byte) 48, -107, 5, -113);
        }
        int var1 = class60.field871;
        int var2 = class98.field1434 - class14.field182 - var1;
        int var3 = class144.field2195;
        int var4 = class3.field39 - class188.field3055 - var3;
        if (var3 <= 0 && var4 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class55.field803 != null) {
                var7 = class55.field803;
            } else if (class238.field3817 == null) {
                var7 = class138.field2065.field3390;
            } else {
                var7 = class238.field3817;
            }
            if (class238.field3817 == var7) {
                Insets var8 = class238.field3817.getInsets();
                var6 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var3 > 0) {
                var9.fillRect(var5, var6, var3, class98.field1434);
            }
            if (var1 > 0) {
                var9.fillRect(var5, var6, class3.field39, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class3.field39 + var5 - var4, var6, var4, class98.field1434);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var6 + class98.field1434 - var2, class3.field39, var2);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 332)
    public static final void method1885(int arg0) {
        field4216++;
        if (arg0 != 4) {
            return;
        }
        for (int var1 = -1; var1 < class85.field1248; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class118.field1737[var1];
            }
            class245 var3 = class246.field3955[var2];
            if (var3 != null && var3.field4283 > 0) {
                var3.field4283--;
                if (var3.field4283 == 0) {
                    var3.field4275 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class97.field1419; var4++) {
            int var5 = class101.field1441[var4];
            class50 var6 = class216.field3471[var5];
            if (var6 != null && var6.field4283 > 0) {
                var6.field4283--;
                if (var6.field4283 == 0) {
                    var6.field4275 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBIII)V", line = 386)
    public static final void method1886(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -120) {
            return;
        }
        if (class166.field2625) {
            class190.method1369(arg3, arg0, arg2 + arg3, arg0 - -arg4);
            class190.method1363(arg3, arg0, arg2, arg4, 0);
        } else {
            class54.method375(arg3, arg0, arg2 + arg3, arg0 + arg4);
            class54.method383(arg3, arg0, arg2, arg4, 0);
        }
        field4228++;
        if (class107.field1517 < 100) {
            return;
        }
        if (class255.field4092 == null || class255.field4092.field3200 != arg2 || class255.field4092.field3189 != arg4) {
            class72 var5 = new class72(arg2, arg4);
            class54.method381(var5.field1070, arg2, arg4);
            class22.method154((byte) 41, 0, arg4, arg2, 0, 0, class212.field3414, class66.field1004, 0);
            if (class166.field2625) {
                class255.field4092 = new class17(var5);
            } else {
                class255.field4092 = var5;
            }
            if (class166.field2625) {
                class54.field801 = null;
            } else {
                class217.field3485.method1353((byte) -26);
            }
        }
        class255.field4092.method77(arg3, arg0);
        int var6 = class59.field850 * arg2 / class66.field1004 + arg3;
        int var7 = class44.field689 * arg2 / class66.field1004;
        int var8 = class187.field3045 * arg4 / class212.field3414 + arg0;
        int var9 = class252.field4008 * arg4 / class212.field3414;
        if (class166.field2625) {
            class190.method1370(var6, var8, var7, var9, 16711680, 128);
            class190.method1361(var6, var8, var7, var9, 16711680);
        } else {
            class54.method365(var6, var8, var7, var9, 16711680, 128);
            class54.method378(var6, var8, var7, var9, 16711680);
        }
        if (class265.field4208 <= 0 || (class265.field4208 % 10) >= 5) {
            return;
        }
        for (class176 var10 = (class176) class133.field1993.method1495(-312); var10 != null; var10 = (class176) class133.field1993.method1501(-124)) {
            if (class181.field2929 == var10.field2866) {
                int var11 = arg0 + (var10.field2852 * arg4 / class212.field3414);
                int var12 = var10.field2854 * arg2 / class66.field1004 + arg3;
                if (class166.field2625) {
                    class190.method1363(var12 - 2, var11 + -2, 4, 4, 16776960);
                } else {
                    class54.method383(var12 - 2, var11 - 2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILlb;I)V", line = 489)
    public final void method1887(int arg0, class112 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method792(arg0 + 3);
            if (var4 == 0) {
                field4223++;
                if (arg0 != -1) {
                    this.field4220 = 127;
                }
                return;
            }
            this.method1879(arg2, true, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 511)
    public static void method1888(int arg0) {
        if (arg0 != 16711680) {
            return;
        }
        field4233 = null;
        field4224 = null;
        field4230 = null;
        field4236 = null;
        field4232 = null;
    }
}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class121 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
    private int[] field2175;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "[B")
    private byte[] field2184;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[I")
    private int[] field2176;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lia;")
    public static class257 field2173 = class28.method234(-60, "_");

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field2180 = 0;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lia;")
    public static class257 field2182 = class28.method234(108, ":clan:");

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "J")
    public static long field2178;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lvb;")
    public static class226 field2179;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[Ll;")
    public static class185[] field2177;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method850(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class99.field1827 * arg0 + class102.field1881 * arg3 >> 16;
        int var6 = class99.field1827 * arg3 - class102.field1881 * arg0 >> 16;
        int var7 = class96.field1812 * var6 + class90.field1733 * arg1 >> 16;
        int var8 = class96.field1812 * arg1 - class90.field1733 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class96.field1812 * var6 + class90.field1733 * arg2 >> 16;
        int var12 = class96.field1812 * arg2 - class90.field1733 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class238.field4086 && var13 < class238.field4086) {
            return false;
        } else if (var9 > class213.field3642 && var13 > class213.field3642) {
            return false;
        } else if (var10 < class151.field2594 && var14 < class151.field2594) {
            return false;
        } else {
            return var10 <= class228.field3834 || var14 <= class228.field3834;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[BIIII)I")
    public final int method851(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 + arg3;
        if (arg5 > -69) {
            this.method851((byte[]) null, (byte[]) null, 92, -106, -45, -59);
        }
        field2185++;
        int var8 = arg4 << 3;
        int var9 = 0;
        while (arg3 < var7) {
            int var10 = arg0[arg3] & 0xFF;
            byte var11 = this.field2184[var10];
            int var12 = this.field2175[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var11;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var9 = class198.method1332(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var9 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var9 = var12 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLjava/awt/Color;IILia;)V")
    public static final void method852(boolean arg0, Color arg1, int arg2, int arg3, class257 arg4) {
        try {
            Graphics var5 = class156.field2728.getGraphics();
            if (class173.field2955 == null) {
                class173.field2955 = new Font("Helvetica", 1, 13);
                class37.field735 = class156.field2728.getFontMetrics(class173.field2955);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class12.field241, class166.field2897);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class225.field3775 == null) {
                    class225.field3775 = class156.field2728.createImage(304, 34);
                }
                Graphics var6 = class225.field3775.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg2 * 3) + 2, 2, 300 - arg2 * 3, 30);
                var6.setFont(class173.field2955);
                var6.setColor(Color.white);
                arg4.method1678(22, var6, (304 - arg4.method1694(class37.field735, arg3 ^ 0xFFFFA58A)) / 2, arg3 - 23147);
                var5.drawImage(class225.field3775, class12.field241 / 2 - 152, class166.field2897 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class12.field241 / 2 - 152;
                int var8 = class166.field2897 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg2 * 3 + var7 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class173.field2955);
                var5.setColor(Color.white);
                arg4.method1678(var8 + 22, var5, var7 + ((304 - arg4.method1694(class37.field735, arg3 ^ 0xFFFFA58A)) / 2), arg3 + -23147);
            }
            if (arg3 != 23157) {
                field2177 = null;
            }
            if (class39.field794 != null) {
                var5.setFont(class173.field2955);
                var5.setColor(Color.white);
                class39.field794.method1678(class166.field2897 / 2 - 26, var5, class12.field241 / 2 - class39.field794.method1694(class37.field735, arg3 - 23158) / 2, arg3 ^ 0x5A7F);
            }
        } catch (Exception var10) {
            class156.field2728.repaint();
        }
        field2174++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBI[BI)I")
    public final int method853(int arg0, byte[] arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field2181++;
        if (arg2 != -101) {
            this.method853(-110, (byte[]) null, (byte) 120, -73, (byte[]) null, -72);
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field2176[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var12;
            if ((var12 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var13;
            if ((var13 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var14;
            if ((var14 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var15;
            if ((var15 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var16;
            if ((var16 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var17;
            if ((var17 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2176[var8];
            }
            int var18;
            if ((var18 = this.field2176[var8]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2179 = null;
        int var1 = 56 % ((arg0 + 45) / 61);
        field2182 = null;
        field2173 = null;
        field2177 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
    public class121(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field2175 = new int[var2];
        this.field2184 = arg0;
        int var4 = 0;
        this.field2176 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2175[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class198.method1332(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2176[var14] == 0) {
                            this.field2176[var14] = var4;
                        }
                        var14 = this.field2176[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2176.length <= var14) {
                        int[] var18 = new int[this.field2176.length * 2];
                        for (int var19 = 0; var19 < this.field2176.length; var19++) {
                            var18[var19] = this.field2176[var19];
                        }
                        this.field2176 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field2176[var14] = ~var5;
            }
        }
    }
}

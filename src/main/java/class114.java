import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 extends class261 {

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public int field1922 = 4;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public int field1932 = 4;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "[B")
    private byte[] field1937 = new byte[512];

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Z")
    public boolean field1931 = true;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public int field1923 = 0;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public int field1935 = 1638;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public int field1939 = 4;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Z")
    public static boolean field1921 = true;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "S")
    public static short field1930 = 256;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "[I")
    public static int[] field1925 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1926 = 0;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Lve;")
    public static class255 field1928 = class87.method607(87, "::rect_debug");

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[J")
    public static long[] field1933 = new long[100];

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "Lve;")
    public static class255 field1949 = class87.method607(126, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "[S")
    private short[] field1947;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "[S")
    private short[] field1950;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 13)
    public static void method864(int arg0) {
        if (arg0 != 1638) {
            field1949 = (class255) null;
        }
        field1933 = null;
        field1925 = null;
        field1928 = null;
        field1949 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[I)V", line = 29)
    public final void method865(int arg0, int arg1, int[] arg2) {
        field1941++;
        int var4 = class20.field324[arg1] * this.field1922;
        int var5 = 82 % ((-arg0 - 32) / 54);
        if (this.field1939 == 1) {
            short var6 = this.field1947[0];
            int var7 = this.field1950[0] << 12;
            int var8 = this.field1922 * var7 >> 12;
            int var9 = var4 * var7 >> 12;
            int var10 = this.field1932 * var7 >> 12;
            int var11 = var9 >> 12;
            int var12 = var11 + 1;
            int var13 = this.field1937[var11 & 0xFF] & 0xFF;
            if (var12 >= var8) {
                var12 = 0;
            }
            int var14 = this.field1937[var12 & 0xFF] & 0xFF;
            int var15 = var9 & 0xFFF;
            int var16 = class307.field5245[var15];
            if (this.field1931) {
                for (int var17 = 0; var17 < class92.field1576; var17++) {
                    int var18 = class245.field4120[var17] * this.field1932;
                    int var19 = this.method869(var14, -30877, var15, var16, var7 * var18 >> 12, var10, var13);
                    int var20 = var6 * var19 >> 12;
                    arg2[var17] = (var20 >> 1) + 2048;
                }
            } else {
                for (int var21 = 0; var21 < class92.field1576; var21++) {
                    int var22 = class245.field4120[var21] * this.field1932;
                    int var23 = this.method869(var14, -30877, var15, var16, var7 * var22 >> 12, var10, var13);
                    arg2[var21] = var6 * var23 >> 12;
                }
            }
            return;
        }
        short var24 = this.field1947[0];
        if (var24 > 8 || var24 < -8) {
            int var25 = this.field1950[0] << 12;
            int var26 = var4 * var25 >> 12;
            int var27 = var26 >> 12;
            int var28 = this.field1937[var27 & 0xFF] & 0xFF;
            int var29 = var26 & 0xFFF;
            int var30 = this.field1922 * var25 >> 12;
            int var31 = class307.field5245[var29];
            int var32 = var27 + 1;
            int var33 = this.field1932 * var25 >> 12;
            if (var30 <= var32) {
                var32 = 0;
            }
            int var34 = this.field1937[var32 & 0xFF] & 0xFF;
            for (int var35 = 0; var35 < class92.field1576; var35++) {
                int var36 = class245.field4120[var35] * this.field1932;
                int var37 = this.method869(var34, -30877, var29, var31, var25 * var36 >> 12, var33, var28);
                arg2[var35] = var24 * var37 >> 12;
            }
        }
        for (int var38 = 1; var38 < this.field1939; var38++) {
            short var39 = this.field1947[var38];
            if (var39 > 8 || var39 < -8) {
                int var40 = this.field1950[var38] << 12;
                int var41 = var4 * var40 >> 12;
                int var42 = var41 >> 12;
                int var43 = var42 + 1;
                int var44 = var41 & 0xFFF;
                int var45 = this.field1922 * var40 >> 12;
                int var46 = class307.field5245[var44];
                int var47 = this.field1932 * var40 >> 12;
                if (var43 >= var45) {
                    var43 = 0;
                }
                int var48 = this.field1937[var43 & 0xFF] & 0xFF;
                int var49 = this.field1937[var42 & 0xFF] & 0xFF;
                if (this.field1931 && this.field1939 - 1 == var38) {
                    for (int var50 = 0; var50 < class92.field1576; var50++) {
                        int var51 = class245.field4120[var50] * this.field1932;
                        int var52 = this.method869(var48, -30877, var44, var46, var40 * var51 >> 12, var47, var49);
                        int var53 = (var39 * var52 >> 12) + arg2[var50];
                        arg2[var50] = (var53 >> 1) + 2048;
                    }
                } else {
                    for (int var54 = 0; var54 < class92.field1576; var54++) {
                        int var55 = class245.field4120[var54] * this.field1932;
                        int var56 = this.method869(var48, -30877, var44, var46, var40 * var55 >> 12, var47, var49);
                        arg2[var54] += var39 * var56 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([[FBI[[F[[III[[FIZLdi;IIIBB)V", line = 187)
    public static final void method866(float[][] arg0, byte arg1, int arg2, float[][] arg3, int[][] arg4, int arg5, int arg6, float[][] arg7, int arg8, boolean arg9, class142 arg10, int arg11, int arg12, int arg13, byte arg14, byte arg15) {
        field1927++;
        int var16 = (arg6 << 8) + 255;
        int var17 = (arg11 << 8) + 255;
        int var18 = (arg8 << 8) + 255;
        int var19 = (arg12 << 8) + 255;
        int[] var20 = class112.field1900[arg14];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class275.method1929(1, false, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, var20[var23 + var23 + 1], arg13, var20[var23 + var23]);
        }
        int var24 = 42 % ((arg15 - 60) / 59);
        if (arg9) {
            if (arg14 == 1) {
                var21 = new int[6];
                int var26 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 64);
                int var27 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 64, arg13, 128);
                var21[2] = var22[2];
                var21[0] = var27;
                var21[5] = var22[2];
                var21[3] = var26;
                var21[1] = var26;
                var21[4] = var22[0];
            } else if (arg14 == 2) {
                var21 = new int[6];
                int var28 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 128);
                int var29 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 64);
                var21[3] = var28;
                var21[2] = var28;
                var21[0] = var22[0];
                var21[1] = var29;
                var21[5] = var22[0];
                var21[4] = var22[1];
            } else if (arg14 == 3) {
                var21 = new int[6];
                int var30 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 0);
                int var31 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 64);
                var21[3] = var30;
                var21[1] = var22[1];
                var21[4] = var31;
                var21[0] = var22[2];
                var21[2] = var30;
                var21[5] = var22[2];
            } else if (arg14 == 4) {
                var21 = new int[3];
                int var44 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 0);
                var21[1] = var44;
                var21[0] = var22[3];
                var21[2] = var22[0];
            } else if (arg14 == 5) {
                var21 = new int[3];
                int var32 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 128);
                var21[1] = var32;
                var21[0] = var22[2];
                var21[2] = var22[3];
            } else if (arg14 == 6) {
                var21 = new int[6];
                int var33 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 128);
                int var34 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 128);
                var21[0] = var22[3];
                var21[4] = var22[0];
                var21[3] = var34;
                var21[1] = var33;
                var21[5] = var22[3];
                var21[2] = var34;
            } else if (arg14 == 7) {
                var21 = new int[6];
                int var42 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 0);
                int var43 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 128);
                var21[0] = var22[1];
                var21[3] = var42;
                var21[2] = var42;
                var21[1] = var43;
                var21[5] = var22[1];
                var21[4] = var22[2];
            } else if (arg14 == 8) {
                int var35 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 0);
                var21 = new int[] { var22[3], var35, var22[4] };
            } else if (arg14 == 9) {
                var21 = new int[15];
                int var36 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 64, arg13, 128);
                int var37 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 32, arg13, 96);
                int var38 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 0, arg13, 64);
                var21[6] = var37;
                var21[9] = var37;
                var21[14] = var38;
                var21[3] = var37;
                var21[1] = var36;
                var21[7] = var22[3];
                var21[5] = var22[3];
                var21[12] = var37;
                var21[11] = var22[1];
                var21[2] = var22[4];
                var21[10] = var22[2];
                var21[8] = var22[2];
                var21[13] = var22[1];
                var21[0] = var37;
                var21[4] = var22[4];
            } else if (arg14 == 10) {
                int var39 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 128, arg13, 0);
                var21 = new int[] { var22[2], var39, var22[3], var22[3], var39, var22[4], var22[4], var39, var22[0] };
            } else if (arg14 == 11) {
                var21 = new int[12];
                int var40 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 64, arg13, 0);
                int var41 = class275.method1929(1, true, arg7, var16, arg1, (int[][]) null, arg4, arg2, var19, arg3, arg10, arg0, var18, 0.0F, var17, 64, arg13, 128);
                var21[11] = var41;
                var21[7] = var41;
                var21[5] = var40;
                var21[8] = var40;
                var21[1] = var40;
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[10] = var22[1];
                var21[2] = var22[0];
                var21[6] = var22[2];
                var21[9] = var22[2];
                var21[4] = var22[2];
            }
        }
        arg10.method1056(arg5, arg13, arg2, var22, var21, false);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 458)
    private final void method867(int arg0) {
        field1929++;
        if (this.field1935 > 0) {
            this.field1950 = new short[this.field1939];
            this.field1947 = new short[this.field1939];
            for (int var3 = 0; var3 < this.field1939; var3++) {
                this.field1947[var3] = (short) ((int) (Math.pow((double) ((float) this.field1935 / 4096.0F), (double) var3) * 4096.0D));
                this.field1950[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1947 != null && this.field1947.length == this.field1939) {
            this.field1950 = new short[this.field1939];
            for (int var2 = 0; var2 < this.field1939; var2++) {
                this.field1950[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 < 33) {
            this.field1939 = -11;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 706)
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(B)V", line = 508)
    public static final void method868(byte arg0) {
        field1936++;
        if (class107.field1810 != null) {
            class231 var1 = class107.field1810;
            synchronized (class107.field1810) {
                class107.field1810 = null;
            }
        }
        if (arg0 < 56) {
            method874(8, -82, (byte[]) null, -126);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)I", line = 536)
    private final int method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1940++;
        int var8 = arg2 - 4096;
        if (arg1 != -30877) {
            this.field1931 = true;
        }
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var11 = var10 & 0xFF;
        int var12 = var9 & 0xFF;
        int var13 = arg4 & 0xFFF;
        int var14 = var13 - 4096;
        int var15 = class307.field5245[var13];
        int var16 = this.field1937[var12 + arg6] & 0x3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var13 - arg2 : -arg2 + -var13;
        } else {
            var17 = var16 == 0 ? arg2 + var13 : arg2 - var13;
        }
        int var18 = this.field1937[arg6 + var11] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var14 - arg2 : -arg2 + -var14;
        } else {
            var19 = var18 == 0 ? arg2 + var14 : -var14 + arg2;
        }
        int var20 = this.field1937[var12 + arg0] & 0x3;
        int var21 = ((var19 - var17) * var15 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var13 : var8 - var13;
        } else {
            var22 = var20 == 2 ? var13 - var8 : -var8 + -var13;
        }
        int var23 = this.field1937[var11 + arg0] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((var25 - var21) * arg3 >> 12) + var21;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Color;IIZLve;)V", line = 617)
    public static final void method870(Color arg0, int arg1, int arg2, boolean arg3, class255 arg4) {
        try {
            Graphics var5 = class240.field3999.getGraphics();
            if (class122.field2042 == null) {
                class122.field2042 = new Font("Helvetica", 1, 13);
                class150.field2533 = class240.field3999.getFontMetrics(class122.field2042);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class210.field3589, class201.field3479);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class280.field4800 == null) {
                    class280.field4800 = class240.field3999.createImage(304, 34);
                }
                Graphics var6 = class280.field4800.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(arg1, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class122.field2042);
                var6.setColor(Color.white);
                arg4.method1769((304 - arg4.method1783((byte) -4, class150.field2533)) / 2, 22, (byte) -119, var6);
                var5.drawImage(class280.field4800, class210.field3589 / 2 - 152, class201.field3479 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class210.field3589 / 2 - 152;
                int var9 = class201.field3479 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + var8 + 2, var9 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class122.field2042);
                var5.setColor(Color.white);
                arg4.method1769((304 - arg4.method1783((byte) -4, class150.field2533)) / 2 + var8, var9 + 22, (byte) -95, var5);
            }
            if (class217.field3679 != null) {
                var5.setFont(class122.field2042);
                var5.setColor(Color.white);
                class217.field3679.method1769(class210.field3589 / 2 - class217.field3679.method1783((byte) -4, class150.field2533) / 2, class201.field3479 / 2 + -26, (byte) -105, var5);
            }
        } catch (Exception var12) {
            class240.field3999.repaint();
        }
        field1951++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z", line = 710)
    public static final boolean method871(int arg0, int arg1) {
        field1942++;
        if (arg1 >= -6) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)[I", line = 727)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = 14 % ((arg0 + 49) / 33);
        field1944++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            this.method865(-98, arg1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILtl;II)V", line = 752)
    public static final void method872(int arg0, class197 arg1, int arg2, int arg3) {
        field1924++;
        if (class282.field4861 != 0 && class282.field4861 != 3 || arg2 != 12151 || !arg1.method1414(arg2 ^ 0xFFFF2F77)) {
            return;
        }
        int var4 = arg1.field3297[arg3];
        if (var4 > arg0 || arg0 > var4 + arg1.field3263[arg3]) {
            return;
        }
        int var5 = arg0 - arg1.field3294 / 2;
        int var6 = arg3 - arg1.field3253 / 2;
        int var7 = class76.field1253 + class206.field3541 & 0x7FF;
        int var8 = class283.field4870[var7];
        int var9 = class283.field4877[var7];
        int var10 = (class304.field5198 + 256) * var8 >> 8;
        int var11 = (class304.field5198 + 256) * var9 >> 8;
        int var12 = var5 * var10 + var6 * var11 >> 11;
        int var13 = class276.field4742.field5130 + var12 >> 7;
        int var14 = var6 * var10 - (var5 * var11) >> 11;
        int var15 = class276.field4742.field5173 - var14 >> 7;
        if (class201.field3483 > 0 && class128.field2114[82] && class128.field2114[81]) {
            class68.method412(class268.field4615 + var15, client.field4039, class197.field3355 + var13, 906);
            return;
        }
        boolean var16 = class115.method876(var15, 0, 0, 0, 0, 1, class276.field4742.field5154[0], true, 0, (byte) -7, var13, class276.field4742.field5125[0]);
        if (!var16) {
            return;
        }
        class255.field4318.method463(false, var5);
        class255.field4318.method463(false, var6);
        class255.field4318.method462(class76.field1253, (byte) -61);
        class255.field4318.method463(false, 57);
        class255.field4318.method463(false, class206.field3541);
        class255.field4318.method463(false, class304.field5198);
        class255.field4318.method463(false, 89);
        class255.field4318.method462(class276.field4742.field5130, (byte) -61);
        class255.field4318.method462(class276.field4742.field5173, (byte) -61);
        class255.field4318.method463(false, class160.field2701);
        class255.field4318.method463(false, 63);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILsd;)V", line = 816)
    public static final void method873(int arg0, class26 arg1) {
        int var2 = -76 / ((arg0 - 45) / 62);
        class247.method1701(-102, 200000, arg1);
        field1945++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lpb;BI)V", line = 826)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            this.method21((byte) -73, -71);
        }
        if (arg2 == 0) {
            this.field1931 = arg0.method481(0) == 1;
        } else if (arg2 == 1) {
            this.field1939 = arg0.method481(0);
        } else if (arg2 == 2) {
            this.field1935 = arg0.method454((byte) 84);
            if (this.field1935 < 0) {
                this.field1947 = new short[this.field1939];
                for (int var5 = 0; var5 < this.field1939; var5++) {
                    this.field1947[var5] = (short) arg0.method454((byte) 84);
                }
            }
        } else if (arg2 == 3) {
            this.field1932 = this.field1922 = arg0.method481(0);
        } else if (arg2 == 4) {
            this.field1923 = arg0.method481(0);
        } else if (arg2 == 5) {
            this.field1932 = arg0.method481(0);
        } else if (arg2 == 6) {
            this.field1922 = arg0.method481(0);
        }
        field1934++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[BI)I", line = 924)
    public static final int method874(int arg0, int arg1, byte[] arg2, int arg3) {
        field1946++;
        if (arg1 != -856902136) {
            field1949 = (class255) null;
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class7.field99[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(B)V", line = 959)
    public final void method111(byte arg0) {
        this.field1937 = class251.method1721((byte) -105, this.field1923);
        field1943++;
        this.method867(arg0 ^ 0xFFFFFFF3);
        for (int var2 = this.field1939 - 1; var2 >= 1; var2--) {
            short var3 = this.field1947[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1939--;
        }
        if (arg0 != -57) {
            method868((byte) -41);
        }
    }
}

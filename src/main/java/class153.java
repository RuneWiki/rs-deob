import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class153 implements class134 {

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "[I")
    public static int[] field1958 = new int[1024];

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "[F")
    public static float[] field1973 = new float[16];

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    private int field1951;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    private int field1966;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
    private int field1980;

    @OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!gfa", name = "M", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!gfa", name = "N", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!gfa", name = "Q", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!gfa", name = "R", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "Ljava/awt/Color;")
    private Color field1960;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Ljava/awt/Font;")
    private Font field1949;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field1968;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field1962;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1965;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field1967;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1969;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field1970;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field1975;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field1977;

    @OriginalMember(owner = "client!gfa", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field1982;

    @OriginalMember(owner = "client!gfa", name = "O", descriptor = "Ljava/awt/Image;")
    private Image field1987;

    @OriginalMember(owner = "client!gfa", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field1988;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "Z")
    private boolean field1955;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "Z")
    private boolean field1978;

    @OriginalMember(owner = "client!gfa", name = "L", descriptor = "Z")
    private boolean field1984;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(JI)Z")
    public final boolean method779(long arg0, int arg1) {
        field1983++;
        return arg1 == 21336;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)I")
    private final int method867(int arg0, int arg1) {
        field1986++;
        if (arg0 == 0) {
            return this.field1984 ? (class523.field7111 - arg1) / 2 : 0;
        } else {
            return 68;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
    private final void method868(int arg0) throws IllegalAccessException, NoSuchFieldException {
        field1954++;
        Class var2 = class422.field5308.getClass();
        this.field1969 = (Image) this.method875((byte) -101, "bar", var2);
        this.field1975 = (Image) this.method875((byte) -101, "background", var2);
        this.field1988 = (Image) this.method875((byte) -101, "left", var2);
        this.field1962 = (Image) this.method875((byte) -101, "right", var2);
        this.field1977 = (Image) this.method875((byte) -101, "top", var2);
        this.field1967 = (Image) this.method875((byte) -101, "bottom", var2);
        this.field1970 = (Image) this.method875((byte) -101, "bodyLeft", var2);
        this.field1965 = (Image) this.method875((byte) -101, "bodyRight", var2);
        this.field1982 = (Image) this.method875((byte) -101, "bodyFill", var2);
        this.field1949 = (Font) this.method875((byte) -101, "bf", var2);
        this.field1968 = (FontMetrics) this.method875((byte) -101, "bfm", var2);
        this.field1960 = (Color) this.method875((byte) -101, "colourtext", var2);
        Object var3 = this.method875((byte) -101, "lb", var2);
        Class var4 = var3.getClass();
        this.field1984 = this.method874(var4, var3, true, "xMiddle");
        this.field1978 = this.method874(var4, var3, true, "yMiddle");
        this.field1980 = this.method872(var4, var3, "xOffset", arg0 - 12077);
        if (arg0 != 0) {
            return;
        }
        this.field1948 = this.method872(var4, var3, "yOffset", arg0 ^ 0xFFFFD0D3);
        this.field1956 = this.method872(var4, var3, "width", -12077);
        this.field1979 = this.method872(var4, var3, "height", -12077);
        this.field1952 = this.method872(var4, var3, "boxXOffset", -12077);
        this.field1974 = this.method872(var4, var3, "boxYOffset", -12077);
        this.field1951 = this.method872(var4, var3, "boxWidth", -12077);
        this.field1950 = this.method872(var4, var3, "textYOffset", -12077);
        this.field1966 = this.method872(var4, var3, "offsetPerTenCycles", -12077);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public final void method777(byte arg0) {
        class572.method3161((byte) 114);
        if (arg0 != -22) {
            this.field1979 = 56;
        }
        field1972++;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)I")
    public final int method778(byte arg0) {
        field1964++;
        if (arg0 < 74) {
            this.method777((byte) 69);
        }
        return 100;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method869(int arg0, float[] arg1, int arg2) {
        field1981++;
        float[] var3 = new float[arg2];
        class293.method1641(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
    private final void method870(int arg0) {
        field1959++;
        class518.method2803(class407.field5098.method674((byte) 86), class407.field5098.method676((byte) -29), class695.field9859[class484.field6422], class266.field3377[class484.field6422], class511.field6942[class484.field6422], 3);
        if (arg0 != 0) {
            this.field1960 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public final void method776(int arg0) {
        field1953++;
        if (arg0 < 74) {
            method869(55, null, -97);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(B)V")
    public static void method871(byte arg0) {
        field1973 = null;
        if (arg0 < 7) {
            field1958 = null;
        }
        field1958 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZZ)V")
    public final void method775(boolean arg0, boolean arg1) {
        field1961++;
        if (!this.field1955) {
            if (class422.field5308 == null) {
                this.field1955 = true;
            } else if (this.field1949 == null) {
                try {
                    this.method868(0);
                } catch (Exception var43) {
                    this.field1955 = true;
                }
            }
        }
        if (!arg0) {
            this.field1979 = -79;
        }
        if (this.field1955) {
            this.method870(0);
            return;
        }
        Graphics var3 = class500.field6585.getGraphics();
        if (var3 == null) {
            class500.field6585.repaint();
            return;
        }
        try {
            int var4 = class407.field5098.method676((byte) -29);
            String var5 = class407.field5098.method674((byte) 86);
            if (class23.field362 == null) {
                class23.field362 = class500.field6585.createImage(class523.field7111, class244.field3022);
            }
            Graphics var6 = class23.field362.getGraphics();
            int var7 = this.field1970.getWidth(null);
            int var8 = this.field1965.getWidth(null);
            int var9 = this.field1982.getWidth(null);
            int var10 = this.field1970.getHeight(null);
            int var11 = this.field1965.getHeight(null);
            int var12 = this.field1982.getHeight(null);
            var6.drawImage(this.field1970, this.method867(0, var7) + this.field1952 - this.field1951 / 2, this.method873(var10, (byte) 104) + this.field1974, null);
            int var13 = this.field1952 - (this.field1951 / 2 - var7);
            int var14 = this.field1951 / 2 + this.field1952 - var8;
            for (int var15 = var13; var15 <= var14; var15 += var9) {
                var6.drawImage(this.field1982, this.method867(0, var7) - (-this.field1952 - var15), this.method873(var12, (byte) 104) + this.field1974, null);
            }
            var6.drawImage(this.field1965, this.method867(0, var8) + this.field1952 + (this.field1951 / 2), this.method873(var11, (byte) 104) + this.field1974, null);
            int var16 = this.field1988.getWidth(null);
            int var17 = this.field1988.getHeight(null);
            int var18 = this.field1962.getWidth(null);
            int var19 = this.field1962.getHeight(null);
            int var20 = this.field1967.getHeight(null);
            int var21 = this.field1977.getWidth(null);
            int var22 = this.field1977.getHeight(null);
            int var23 = this.field1967.getWidth(null);
            int var24 = this.field1969.getWidth(null);
            int var25 = this.field1975.getWidth(null);
            int var26 = this.method867(0, this.field1956) + this.field1980;
            int var27 = this.method873(this.field1979, (byte) 104) + this.field1948;
            var6.drawImage(this.field1988, var26, (this.field1979 - var17) / 2 + var27, null);
            var6.drawImage(this.field1962, this.field1956 + var26 - var18, (-var19 + this.field1979) / 2 + var27, null);
            if (this.field1987 == null) {
                this.field1987 = class500.field6585.createImage(this.field1956 - var16 - var18, this.field1979);
            }
            Graphics var28 = this.field1987.getGraphics();
            for (int var29 = 0; var29 < (this.field1956 - var16 - var18); var29 += var21) {
                var28.drawImage(this.field1977, var29, 0, null);
            }
            for (int var30 = 0; var30 < (this.field1956 - (var16 + var18)); var30 += var23) {
                var28.drawImage(this.field1967, var30, this.field1979 - var20, null);
            }
            int var31 = (this.field1956 - var18 - var16) * var4 / 100;
            if (var31 > 0) {
                Image var32 = class500.field6585.createImage(var31, this.field1979 - var22 - var20);
                int var33 = var32.getWidth(null);
                Graphics var34 = var32.getGraphics();
                int var35 = this.field1966 * class16.method111(783) / 10 % var24;
                for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                    var34.drawImage(this.field1969, var36, 0, null);
                }
                var28.drawImage(var32, 0, var22, null);
            }
            int var38 = this.field1956 - var16 - var18 - var31;
            if (var38 > 0) {
                Image var39 = class500.field6585.createImage(var38, this.field1979 - var22 - var20);
                int var40 = var39.getWidth(null);
                Graphics var41 = var39.getGraphics();
                for (int var42 = 0; var42 < var40; var42 += var25) {
                    var41.drawImage(this.field1975, var42, 0, null);
                }
                var28.drawImage(var39, var31, var22, null);
            }
            var6.drawImage(this.field1987, var16 + var26, var27, null);
            var6.setFont(this.field1949);
            var6.setColor(this.field1960);
            var6.drawString(var5, (this.field1956 - this.field1968.stringWidth(var5)) / 2 + var26, this.field1979 / 2 + var27 - -this.field1950 + 4);
            var3.drawImage(class23.field362, 0, 0, null);
        } catch (Exception var44) {
            this.field1955 = true;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I")
    private final int method872(Class arg0, Object arg1, String arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg3 != -12077) {
            this.field1967 = null;
        }
        field1971++;
        Field var5 = arg0.getDeclaredField(arg2);
        return var5.getInt(arg1);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)I")
    private final int method873(int arg0, byte arg1) {
        field1963++;
        if (this.field1978) {
            return (class244.field3022 - arg0) / 2;
        } else {
            if (arg1 != 104) {
                this.method777((byte) 43);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;ZLjava/lang/String;)Z")
    private final boolean method874(Class arg0, Object arg1, boolean arg2, String arg3) throws IllegalAccessException, NoSuchFieldException {
        field1989++;
        if (arg2) {
            Field var5 = arg0.getDeclaredField(arg3);
            return var5.getBoolean(arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
    private final Object method875(byte arg0, String arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        field1957++;
        if (arg0 != -101) {
            method871((byte) -76);
        }
        Field var4 = arg2.getDeclaredField(arg1);
        Object var5 = var4.get(class422.field5308);
        var4.set(class422.field5308, null);
        return var5;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(B)I")
    public final int method780(byte arg0) {
        field1990++;
        return arg0 > -88 ? 55 : 0;
    }
}

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class148 extends class292 {

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "[I")
    private int[] field2194 = new int[this.field4017];

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "Lem;")
    public static class206 field2183 = new class206(96, 4);

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "[[B")
    public static byte[][] field2195 = new byte[1000][];

    @OriginalMember(owner = "client!ada", name = "A", descriptor = "Llh;")
    public static class487 field2196 = new class487(42, -1);

    @OriginalMember(owner = "client!ada", name = "D", descriptor = "[I")
    public static int[] field2199 = new int[8];

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    private int field2187;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ada", name = "v", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ada", name = "x", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ada", name = "B", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ada", name = "C", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ada", name = "E", descriptor = "Ljava/lang/Object;")
    public static Object field2200;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "[B")
    private byte[] field2189;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 3)
    public final void method1080(int arg0) {
        if (arg0 >= 116) {
            ++field2185;
            this.field2193 = 0;
            this.field2187 = 0;
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4017 > var7; ++var7) {
            this.field2194[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BII)V", line = 38)
    public void method1081(byte arg0, int arg1, int arg2) {
        if (arg1 == -12027) {
            ++field2188;
            this.field2189[this.field2187++] = (byte) (127 + class136.method950(127, arg0 >> 1));
        }
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)V", line = 51)
    public static void method1082(int arg0) {
        if (arg0 != 28978) {
            method1087(-74, -31, 124, -119, -119, 44, 90);
        }
        field2200 = null;
        field2199 = null;
        field2195 = null;
        field2196 = null;
        field2183 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZII)V", line = 66)
    public final void method1083(boolean arg0, int arg1, int arg2) {
        ++field2182;
        if (!arg0) {
            this.method1083(true, -50, -27);
        }
        this.field2193 += this.field2194[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)V", line = 77)
    public static final void method1084(int arg0) {
        ++field2184;
        if (class54.field613 == null) {
            if (arg0 != -1) {
                field2200 = null;
            }
            int var1 = class323.field4401;
            int var2 = class703.field9949;
            int var3 = -class222.field3096 + field2192 - var1;
            int var4 = class595.field8319 - class340.field4553 + -var2;
            if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class130.field1868 != null) {
                        var5 = class130.field1868;
                    } else if (class59.field668 != null) {
                        var5 = class59.field668;
                    } else {
                        var5 = class356.field4728;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class130.field1868 == var5) {
                        Insets var8 = class130.field1868.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (~var1 < -1) {
                        var9.fillRect(var6, var7, var1, class595.field8319);
                    }
                    if (~var2 < -1) {
                        var9.fillRect(var6, var7, field2192, var2);
                    }
                    if (~var3 < -1) {
                        var9.fillRect(var6 - -field2192 + -var3, var7, var3, class595.field8319);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, var7 - -class595.field8319 - var4, field2192, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V", line = 148)
    public static final void method1085(int arg0) {
        ++field2198;
        int[] var1 = new int[class599.field8366.field9974];
        int var2 = 0;
        for (int var3 = 0; var3 < class599.field8366.field9974; ++var3) {
            class661 var5 = class599.field8366.method3949(0, var3);
            if (var5.field9262 >= 0 || var5.field9266 >= 0) {
                var1[var2++] = var3;
            }
        }
        class392.field5547 = new int[var2];
        if (arg0 != -743175167) {
            method1087(-108, -102, -68, -30, -46, 59, 36);
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            class392.field5547[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V", line = 184)
    public final void method1086(int arg0) {
        if (arg0 < 52) {
            method1088(18, (byte) 68, (byte[]) null, 80);
        }
        ++field2190;
        this.field2193 = Math.abs(this.field2193);
        if (this.field2193 >= 4096) {
            this.field2193 = 4095;
        }
        this.method1081((byte) (this.field2193 >> 4), -12027, this.field2187++);
        this.field2193 = 0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII)V", line = 202)
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2186;
        class372[] var7 = class309.field4278;
        for (int var8 = arg6; ~var7.length < ~var8; ++var8) {
            class372 var9 = var7[var8];
            if (var9 != null && var9.field5001 == 2) {
                class405.method2359(var9.field5003, var9.field5011, false, var9.field5002 * 2, arg0, var9.field5005, arg2 >> 1, arg3, arg5 >> 1);
                if (class431.field6023[0] > -1 && class186.field2697 % 20 < 10) {
                    class671.field9409[var9.field5010].method3927(class431.field6023[0] + arg4 + -12, class431.field6023[1] + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB[BI)Ljava/lang/String;", line = 228)
    public static final String method1088(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field2191;
        if (arg1 <= 123) {
            field2192 = 86;
        }
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~arg0; ++var6) {
            int var7 = 255 & arg2[arg3 - -var6];
            if (~var7 != -1) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class664.field9319[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}

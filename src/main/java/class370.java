import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class370 extends class91 {

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    private int field5127;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    private int field5124;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    private int field5120;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    private int field5118;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    private int field5128;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "[I")
    public static int[] field5117 = new int[13];

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "[I")
    public static int[] field5130 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "Lij;")
    public static class316 field5132;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V", line = 4)
    public final void method363(int arg0, int arg1, int arg2) {
        ++field5125;
        int var4 = this.field5131 * arg2 >> 12;
        int var5 = this.field5120 * arg1 >> 12;
        int var6 = this.field5127 * arg2 >> 12;
        int var7 = this.field5126 * arg1 >> 12;
        int var8 = this.field5124 * arg2 >> 12;
        int var9 = this.field5128 * arg1 >> 12;
        int var10 = this.field5122 * arg2 >> 12;
        if (arg0 != 4) {
            this.field5126 = -86;
        }
        int var11 = this.field5118 * arg1 >> 12;
        class290.method1780(var7, -125, var10, var8, var11, var4, var6, super.field1270, var5, var9);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V", line = 32)
    public static void method2320(boolean arg0) {
        field5130 = null;
        field5117 = null;
        if (arg0) {
            field5117 = null;
        }
        field5132 = null;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 45)
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5122 = arg6;
        this.field5127 = arg2;
        this.field5124 = arg4;
        this.field5120 = arg1;
        this.field5131 = arg0;
        this.field5126 = arg3;
        this.field5118 = arg7;
        this.field5128 = arg5;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V", line = 61)
    public final void method367(int arg0, int arg1, int arg2) {
        if (arg1 <= 59) {
            this.method367(114, -83, -32);
        }
        ++field5129;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)Lsg;", line = 71)
    public static final class267 method2321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 303) {
            method2321(-79, 21, -28, -114, 28, 104, -103);
        }
        ++field5121;
        long var7 = (long) arg4 * 76724863L ^ (long) arg3 * 986053L ^ (long) arg1 * 67481L ^ (long) arg0 * 97549L ^ (long) arg5 * 475427L ^ (long) arg2 * 32147369L;
        class267 var9 = (class267) class237.field3372.method2529(0, var7);
        if (var9 != null) {
            return var9;
        } else {
            class267 var10 = class144.field2108.method234(arg1, arg0, arg5, arg3, arg2, arg4);
            class237.field3372.method2527(-91, var7, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;B)V", line = 100)
    public static final void method2322(Color arg0, boolean arg1, String arg2, Color arg3, int arg4, Color arg5, byte arg6) {
        try {
            Graphics var7 = class104.field1447.getGraphics();
            if (class269.field3687 == null) {
                class269.field3687 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class373.field5174, class396.field5493);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class273.field3734 == null) {
                    class273.field3734 = class104.field1447.createImage(304, 34);
                }
                Graphics var8 = class273.field3734.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg4 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg4 * 3 + 2, 2, -(arg4 * 3) + 300, 30);
                var8.setFont(class269.field3687);
                var8.setColor(arg0);
                var8.drawString(arg2, (-(arg2.length() * 6) + 304) / 2, 22);
                var7.drawImage(class273.field3734, class373.field5174 / 2 + -152, class396.field5493 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class373.field5174 / 2 + -152;
                int var10 = class396.field5493 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(2 - -(arg4 * 3) + var9, var10 - -2, -(arg4 * 3) + 300, 30);
                var7.setFont(class269.field3687);
                var7.setColor(arg0);
                var7.drawString(arg2, var9 + (-(arg2.length() * 6) + 304) / 2, var10 + 22);
            }
            if (class244.field3444 != null) {
                var7.setFont(class269.field3687);
                var7.setColor(arg0);
                var7.drawString(class244.field3444, class373.field5174 / 2 - class244.field3444.length() * 6 / 2, class396.field5493 / 2 + -26);
            }
        } catch (Exception var12) {
            class104.field1447.repaint();
        }
        if (arg6 <= 8) {
            field5117 = null;
        }
        ++field5123;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)V", line = 192)
    public final void method362(boolean arg0, int arg1, int arg2) {
        ++field5119;
        if (arg0) {
            this.field5122 = 101;
        }
    }
}

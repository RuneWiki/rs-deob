import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 extends class4 {

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "[B")
    public byte[] field392;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "Z")
    public static boolean field390 = true;

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Lf;")
    public static class10 field396 = class23.method139("Key", (byte) -86);

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "Lf;")
    public static class10 field398 = class23.method139("Please wait)3)3)3 Rendering Map", (byte) -62);

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Lf;")
    public static class10 field395 = class23.method139("75(U", (byte) -56);

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "La;")
    public static class1 field393;

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "[B")
    public static byte[] field391;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "(I)B", line = 22)
    public final byte method178(int arg0) {
        if (arg0 != -958271408) {
            field390 = true;
        }
        return this.field392[this.field389++];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IZ)Lf;", line = 40)
    public static final class10 method179(int arg0, boolean arg1) {
        if (!arg1) {
            method180((byte) -8);
        }
        return mapview.method149(arg0, false, !arg1, 10);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 58)
    public static void method180(byte arg0) {
        field396 = null;
        int var1 = 45 % ((arg0 - 16) / 44);
        field393 = null;
        field391 = null;
        field395 = null;
        field398 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "(I)I", line = 73)
    public final int method181(int arg0) {
        if (arg0 != -9110) {
            field391 = null;
        }
        this.field389 += 4;
        return ((this.field392[this.field389 - 4] & 0xFF) << 24) + ((this.field392[this.field389 - 2] & 0xFF) << 8) + ((this.field392[this.field389 + -3] & 0xFF) << 16) + (this.field392[this.field389 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "(I)I", line = 91)
    public final int method182(int arg0) {
        if (arg0 >= -97) {
            field394 = -22;
        }
        return this.field392[this.field389++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(B)Lf;", line = 104)
    public final class10 method183(byte arg0) {
        int var2 = this.field389;
        while (this.field392[this.field389++] != 0) {
        }
        if (arg0 != -29) {
            field395 = null;
        }
        return class17.method110(this.field392, var2, this.field389 - var2 - 1, 0);
    }

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "(I)I", line = 168)
    public final int method184(int arg0) {
        if (arg0 != -2) {
            this.method187(51, 46);
        }
        this.field389 += 2;
        return ((this.field392[this.field389 - 2] & 0xFF) << 8) + (this.field392[this.field389 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(II)V", line = 183)
    public final void method185(int arg0, int arg1) {
        if (arg1 < 122) {
            this.method178(-91);
        }
        this.field392[this.field389++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(I)V", line = 216)
    public class28(int arg0) {
        this.field389 = 0;
        this.field392 = class23.method138(arg0, -127);
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([B)V", line = 228)
    public class28(byte[] arg0) {
        this.field392 = arg0;
        this.field389 = 0;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III[B)V", line = 245)
    public final void method186(int arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            arg3[var5] = this.field392[this.field389++];
        }
        if (arg2 < 69) {
            field398 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(II)V", line = 287)
    public final void method187(int arg0, int arg1) {
        this.field392[this.field389++] = (byte) (arg1 >> 24);
        this.field392[this.field389++] = (byte) (arg1 >> 16);
        this.field392[this.field389++] = (byte) (arg1 >> 8);
        if (arg0 != -29685) {
            this.method181(92);
        }
        this.field392[this.field389++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[III)V", line = 301)
    public final void method188(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = this.field389;
        this.field389 = arg0;
        int var6 = (arg2 - arg0) / 8;
        if (arg3 != 1279876192) {
            field397 = -106;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = this.method181(-9110);
            int var10 = this.method181(-9110);
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var10 -= var8 + arg1[var8 >>> 11 & 0x45A00003] ^ (var9 >>> 5 ^ var9 << 4) + var9;
                var8 -= var11;
                var9 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ var8 - -arg1[var8 & 0x3];
            }
            this.field389 -= 8;
            this.method187(-29685, var9);
            this.method187(arg3 ^ 0xB3B6D06B, var10);
        }
        this.field389 = var5;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lf;ZIILjava/awt/Color;)V", line = 349)
    public static final void method189(class10 arg0, boolean arg1, int arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class10.field107.getGraphics();
            if (class37.field513 == null) {
                class37.field513 = new Font("Helvetica", 1, 13);
                class10.field101 = class10.field107.getFontMetrics(class37.field513);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class35.field494, class24.field262);
            }
            int var6 = -14 % ((arg3 + 45) / 57);
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class30.field414 == null) {
                    class30.field414 = class10.field107.createImage(304, 34);
                }
                Graphics var7 = class30.field414.getGraphics();
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var7.setFont(class37.field513);
                var7.setColor(Color.white);
                arg0.method58(22, (304 - arg0.method69(true, class10.field101)) / 2, 0, var7);
                var5.drawImage(class30.field414, class35.field494 / 2 - 152, class24.field262 / 2 + -18, null);
            } catch (Exception var12) {
                int var9 = class35.field494 / 2 - 152;
                int var10 = class24.field262 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + var9 + 2, var10 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class37.field513);
                var5.setColor(Color.white);
                arg0.method58(var10 + 22, (-arg0.method69(true, class10.field101) + 304) / 2 + var9, 0, var5);
            }
        } catch (Exception var13) {
            class10.field107.repaint();
        }
    }

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "(B)I", line = 409)
    public final int method190(byte arg0) {
        if (arg0 == -4) {
            this.field389 += 3;
            return (this.field392[this.field389 - 1] & 0xFF) + ((this.field392[this.field389 - 3] & 0xFF) << 16) + ((this.field392[this.field389 + -2] & 0xFF) << 8);
        } else {
            return -126;
        }
    }
}

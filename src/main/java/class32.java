import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class32 {

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "[Ld;")
    private class7[] field403;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lt;")
    public static class35 field398 = class3.method28(false, "Find");

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lt;")
    public static class35 field400 = class3.method28(false, "Key");

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lt;")
    public static class35 field399 = class3.method28(false, "Fishing Spot");

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Lt;")
    public static class35 field396 = class3.method28(false, "Overview");

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "I")
    public static int field404 = 0;

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "I")
    public static volatile int field402 = -1;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Lt;")
    public static class35 field405 = class3.method28(false, "Enter place name to find");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "J")
    private long field406;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Ld;")
    private class7 field395;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lt;ILjava/awt/Color;I)V", line = 6)
    public static final void method182(class35 arg0, int arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class27.field306.getGraphics();
            if (class30.field342 == null) {
                class30.field342 = new Font("Helvetica", 1, 13);
                class21.field237 = class27.field306.getFontMetrics(class30.field342);
            }
            if (class3.field76) {
                class3.field76 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class35.field431, class2.field68);
            }
            if (arg3 != -18) {
                return;
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class13.field166 == null) {
                    class13.field166 = class27.field306.createImage(304, 34);
                }
                Graphics var5 = class13.field166.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class30.field342);
                var5.setColor(Color.white);
                arg0.method213((byte) 109, (304 - arg0.method218(class21.field237, (byte) 84)) / 2, var5, 22);
                var4.drawImage(class13.field166, class35.field431 / 2 - 152, class2.field68 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class35.field431 / 2 - 152;
                int var8 = class2.field68 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class30.field342);
                var4.setColor(Color.white);
                arg0.method213((byte) 116, var7 + (304 - arg0.method218(class21.field237, (byte) 123)) / 2, var4, var8 + 22);
            }
        } catch (Exception var11) {
            class27.field306.repaint();
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IJ)Ld;", line = 71)
    public final class7 method183(int arg0, long arg1) {
        this.field406 = arg1;
        class7 var4 = this.field403[(int) ((long) (this.field397 - 1) & arg1)];
        this.field395 = var4.field111;
        if (arg0 != 4406) {
            return (class7) null;
        }
        while (this.field395 != var4) {
            if (this.field395.field112 == arg1) {
                class7 var5 = this.field395;
                this.field395 = this.field395.field111;
                return var5;
            }
            this.field395 = this.field395.field111;
        }
        this.field395 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B[Lt;)Lt;", line = 99)
    public static final class35 method184(byte arg0, class35[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 122) {
            method190((byte) -21);
        }
        return class21.method123(arg1, arg1.length, arg0 ^ 0x7A, 0);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 143)
    public static void method185(byte arg0) {
        field398 = null;
        field400 = null;
        field405 = null;
        field396 = null;
        field399 = null;
        if (arg0 > -78) {
            method185((byte) -63);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)Ld;", line = 157)
    public final class7 method186(int arg0) {
        if (arg0 != -23026) {
            this.method186(68);
        }
        if (this.field395 == null) {
            return null;
        }
        class7 var2 = this.field403[(int) (this.field406 & (long) (this.field397 - 1))];
        while (this.field395 != var2) {
            if (this.field395.field112 == this.field406) {
                class7 var3 = this.field395;
                this.field395 = this.field395.field111;
                return var3;
            }
            this.field395 = this.field395.field111;
        }
        this.field395 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z)B", line = 187)
    public static final byte method187(boolean arg0) {
        if (!arg0) {
            method187(true);
        }
        return class15.field179 == null ? 0 : class15.field179[class31.field392];
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(JBLd;)V", line = 234)
    public final void method188(long arg0, byte arg1, class7 arg2) {
        if (arg2.field117 != null) {
            arg2.method53((byte) 79);
        }
        class7 var5 = this.field403[(int) (arg0 & (long) (this.field397 - 1))];
        arg2.field117 = var5.field117;
        arg2.field111 = var5;
        arg2.field112 = arg0;
        arg2.field117.field111 = arg2;
        if (arg1 != 32) {
            this.method183(126, -24L);
        }
        arg2.field111.field117 = arg2;
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(I)V", line = 266)
    public class32(int arg0) {
        this.field403 = new class7[arg0];
        this.field397 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class7 var3 = this.field403[var2] = new class7();
            var3.field111 = var3;
            var3.field117 = var3;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BII)V", line = 288)
    public static final void method189(byte arg0, int arg1, int arg2) {
        if (arg0 != -98) {
            field401 = 94;
        }
        class16.field183 = arg2 >> 6;
        class29.field322 = arg1 & 0x3F;
        class19.field220 = arg1 >> 6;
        class2.field72 = arg2 & 0x3F;
        class31.field392 = (class2.field72 << 6) + class29.field322;
        class16.method99(-16);
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(B)V", line = 306)
    public static final void method190(byte arg0) {
        if (class26.field302 != null) {
            class8 var1 = class26.field302;
            synchronized (class26.field302) {
                class26.field302 = null;
            }
        }
        if (arg0 != -56) {
            method182(null, 61, null, -92);
        }
    }
}

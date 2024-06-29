import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class25 {

    @OriginalMember(owner = "mapview!m", name = "p", descriptor = "[Lha;")
    private class16[] field347;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lh;")
    public static class15 field333 = class26.method190(true, "Crafting Shop");

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lh;")
    public static class15 field332 = class26.method190(true, "Platelegs Shop");

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Lh;")
    public static class15 field340 = class26.method190(true, "???");

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Lh;")
    public static class15 field339 = class26.method190(true, "loc)3dat");

    @OriginalMember(owner = "mapview!m", name = "o", descriptor = "[[[[B")
    public static byte[][][][] field346 = new byte[5][][][];

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "I")
    public static volatile int field342 = -1;

    @OriginalMember(owner = "mapview!m", name = "m", descriptor = "I")
    public static int field344 = -1;

    @OriginalMember(owner = "mapview!m", name = "n", descriptor = "Lh;")
    public static class15 field345 = class26.method190(true, "Find");

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "J")
    private long field336;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lha;")
    private class16 field335;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "[I")
    public static int[] field337;

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "[I")
    public static int[] field343;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lh;Ljava/awt/Color;ZI)V", line = 9)
    public static final void method184(class15 arg0, Color arg1, boolean arg2, int arg3) {
        try {
            Graphics var4 = class31.field430.getGraphics();
            if (class9.field155 == null) {
                class9.field155 = new Font("Helvetica", 1, 13);
                class22.field318 = class31.field430.getFontMetrics(class9.field155);
            }
            if (class28.field385) {
                class28.field385 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class16.field271, class21.field308);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (arg2) {
                    field338 = 93;
                }
                if (class22.field321 == null) {
                    class22.field321 = class31.field430.createImage(304, 34);
                }
                Graphics var5 = class22.field321.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class9.field155);
                var5.setColor(Color.white);
                arg0.method131(22, var5, 32342, (304 - arg0.method127(111, class22.field318)) / 2);
                var4.drawImage(class22.field321, class16.field271 / 2 - 152, class21.field308 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class21.field308 / 2 - 18;
                int var8 = class16.field271 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 + 1, 301, 31);
                var4.fillRect(var8 + arg3 * 3 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class9.field155);
                var4.setColor(Color.white);
                arg0.method131(var7 + 22, var4, 32342, (304 - arg0.method127(-120, class22.field318)) / 2 + var8);
            }
        } catch (Exception var11) {
            class31.field430.repaint();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)Lha;", line = 77)
    public final class16 method185(byte arg0) {
        if (this.field335 == null) {
            return null;
        }
        class16 var2 = this.field347[(int) (this.field336 & (long) (this.field334 - 1))];
        while (this.field335 != var2) {
            if (this.field335.field264 == this.field336) {
                class16 var3 = this.field335;
                this.field335 = this.field335.field272;
                return var3;
            }
            this.field335 = this.field335.field272;
        }
        if (arg0 > -2) {
            method184(null, null, true, 76);
        }
        this.field335 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lha;IJ)V", line = 149)
    public final void method186(class16 arg0, int arg1, long arg2) {
        if (arg0.field267 != null) {
            arg0.method139((byte) 96);
        }
        class16 var5 = this.field347[(int) ((long) (this.field334 - 1) & arg2)];
        arg0.field264 = arg2;
        arg0.field267 = var5.field267;
        arg0.field272 = var5;
        arg0.field267.field272 = arg0;
        int var6 = 64 % ((64 - arg1) / 45);
        arg0.field272.field267 = arg0;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 169)
    public static void method187(int arg0) {
        field339 = null;
        field340 = null;
        field332 = null;
        field346 = null;
        if (arg0 >= -63) {
            method188((byte) -52, null, null, null);
        }
        field343 = null;
        field337 = null;
        field333 = null;
        field345 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BLaa;Lh;Lh;)[Lg;", line = 191)
    public static final class13[] method188(byte arg0, class2 arg1, class15 arg2, class15 arg3) {
        int var4 = arg1.method43(arg3, (byte) 45);
        int var5 = arg1.method38(arg2, var4, 3);
        int var6 = -3 / ((arg0 + 44) / 48);
        return class16.method137(arg1, 127, var4, var5);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IJ)Lha;", line = 213)
    public final class16 method189(int arg0, long arg1) {
        this.field336 = arg1;
        class16 var4 = this.field347[(int) (arg1 & (long) (this.field334 - 1))];
        this.field335 = var4.field272;
        if (arg0 != 2) {
            this.field335 = null;
        }
        while (this.field335 != var4) {
            if (this.field335.field264 == arg1) {
                class16 var5 = this.field335;
                this.field335 = this.field335.field272;
                return var5;
            }
            this.field335 = this.field335.field272;
        }
        this.field335 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(I)V", line = 262)
    public class25(int arg0) {
        this.field347 = new class16[arg0];
        this.field334 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class16 var3 = this.field347[var2] = new class16();
            var3.field272 = var3;
            var3.field267 = var3;
        }
    }
}

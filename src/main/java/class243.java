import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class243 extends class23 {

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    private int field4355 = 2048;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    private int field4357 = 4096;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    private int field4356 = 0;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    private int field4353 = 2048;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    private int field4359 = 8192;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    private int field4363 = 12288;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    private int field4361 = 0;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Llc;")
    public static class143 field4362 = class66.method374("Chargement en cours)3)3)3", -1);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Llc;")
    private static class143 field4369 = class66.method374("Loading )2 please wait)3", -1);

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Llc;")
    public static class143 field4365 = field4369;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lhk;")
    public static class268 field4360 = new class268();

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "Lng;")
    public static class139 field4372 = new class139(260);

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lfh;")
    public static class172 field4367;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field4371;
        if (arg0 > -13) {
            this.method1619(-123, 23, false);
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = class31.field495[arg1] + -2048;
            for (int var5 = 0; class72.field1359 > var5; ++var5) {
                int var6 = class3.field43[var5] - 2048;
                int var7 = this.field4353 + var6;
                int var8 = this.field4355 + var4;
                int var9 = ~var8 > 2047 ? var8 - -4096 : var8;
                int var10 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var11 = ~var10 < -2049 ? var10 - 4096 : var10;
                int var12 = this.field4361 + var4;
                int var13 = var9 <= 2048 ? var9 : var9 + -4096;
                int var14 = var12 >= -2048 ? var12 : var12 + 4096;
                int var15 = this.field4356 + var6;
                int var16 = var14 > 2048 ? var14 + -4096 : var14;
                int var17 = var15 >= -2048 ? var15 : var15 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1619(var16, var11, false) && !this.method1615((byte) 66, var18, var13) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field4366;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field4359 = arg0.method1275(128);
                                }
                            } else {
                                this.field4357 = arg0.method1275(128);
                            }
                        } else {
                            this.field4363 = arg0.method1275(128);
                        }
                    } else {
                        this.field4355 = arg0.method1275(128);
                    }
                } else {
                    this.field4356 = arg0.method1275(128);
                }
            } else {
                this.field4361 = arg0.method1275(128);
            }
        } else {
            this.field4353 = arg0.method1275(128);
        }
        if (!arg2) {
            method1617(76);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(BII)Z")
    private final boolean method1615(byte arg0, int arg1, int arg2) {
        ++field4364;
        int var4 = (arg1 + arg2) * this.field4363 >> 12;
        int var5 = class279.field4922[255 & var4 * 255 >> 12];
        if (arg0 < 5) {
            field4360 = null;
        }
        int var6 = (var5 << 12) / this.field4363;
        int var7 = (var6 << 12) / this.field4359;
        int var8 = this.field4357 * var7 >> 12;
        return ~(-arg1 + arg2) > ~var8 && -arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static void method1616(int arg0) {
        field4360 = null;
        field4367 = null;
        field4362 = null;
        field4372 = null;
        if (arg0 >= 90) {
            field4369 = null;
            field4365 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)Z")
    public static final boolean method1617(int arg0) {
        if (arg0 != 26293) {
            method1618(-67, (Color) null, false, (class143) null, -44);
        }
        ++field4358;
        if (class247.field4440) {
            try {
                class122.field2153.method905(class4.field62.field1469, 0);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Color;ZLlc;I)V")
    public static final void method1618(int arg0, Color arg1, boolean arg2, class143 arg3, int arg4) {
        try {
            Graphics var5 = class155.field2792.getGraphics();
            if (arg4 != 12836) {
                field4362 = null;
            }
            if (class231.field4224 == null) {
                class231.field4224 = new Font("Helvetica", 1, 13);
                class43.field788 = class155.field2792.getFontMetrics(class231.field4224);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class10.field222, class269.field4820);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class26.field436 == null) {
                    class26.field436 = class155.field2792.createImage(304, 34);
                }
                Graphics var6 = class26.field436.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var6.setFont(class231.field4224);
                var6.setColor(Color.white);
                arg3.method880((-arg3.method886(class43.field788, false) + 304) / 2, var6, 22, 2316);
                var5.drawImage(class26.field436, class10.field222 / 2 + -152, class269.field4820 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class10.field222 / 2 - 152;
                int var8 = class269.field4820 / 2 + -18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 - -1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2 + var7, var8 + 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class231.field4224);
                var5.setColor(Color.white);
                arg3.method880((-arg3.method886(class43.field788, false) + 304) / 2 + var7, var5, var8 + 22, 2316);
            }
            if (class158.field2853 != null) {
                var5.setFont(class231.field4224);
                var5.setColor(Color.white);
                class158.field2853.method880(class10.field222 / 2 - class158.field2853.method886(class43.field788, false) / 2, var5, class269.field4820 / 2 + -26, 2316);
            }
        } catch (Exception var10) {
            class155.field2792.repaint();
        }
        ++field4368;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        class12.method99(512);
        int var2 = -71 / ((arg0 - 22) / 60);
        ++field4354;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1619(int arg0, int arg1, boolean arg2) {
        int var4 = (-arg1 + arg0) * this.field4363 >> 12;
        ++field4370;
        if (arg2) {
            this.field4363 = 115;
        }
        int var5 = class279.field4922[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4363;
        int var7 = (var6 << 12) / this.field4359;
        int var8 = this.field4357 * var7 >> 12;
        return var8 > arg1 - -arg0 && ~(arg1 - -arg0) < ~(-var8);
    }
}

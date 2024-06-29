import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 extends class228 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "J")
    public static long field623 = 0L;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Li;")
    private static class88 field632 = class208.method1425(105, "Aug");

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Li;")
    public static class88 field644 = class208.method1425(105, " <col=ffffff>");

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Li;")
    private static class88 field628 = class208.method1425(105, "Dec");

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Li;")
    private static class88 field653 = class208.method1425(105, "Sep");

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Li;")
    private static class88 field643 = class208.method1425(105, "Mar");

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Li;")
    private static class88 field645 = class208.method1425(105, "Jan");

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Li;")
    public static class88 field649 = class208.method1425(105, "Fallen lassen");

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Li;")
    private static class88 field624 = class208.method1425(105, "Jul");

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Li;")
    public static class88 field651 = class208.method1425(105, "settings=");

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Li;")
    private static class88 field640 = class208.method1425(105, "Oct");

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Li;")
    private static class88 field642 = class208.method1425(105, "Feb");

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Li;")
    private static class88 field652 = class208.method1425(105, "Apr");

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Li;")
    private static class88 field659 = class208.method1425(105, "Nov");

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Li;")
    private static class88 field656 = class208.method1425(105, "May");

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Li;")
    private static class88 field661 = class208.method1425(105, "Jun");

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[Li;")
    public static class88[] field658 = new class88[] { field645, field642, field643, field652, field656, field661, field624, field632, field653, field640, field659, field628 };

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "J")
    public static long field631;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Lnb;")
    public static class144 field633;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lq;")
    public static class174 field635;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field630;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field637;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Lq;")
    public static final class174 method238(int arg0, int arg1, boolean arg2) {
        ++field650;
        if (!arg2) {
            method239(123, false);
        }
        class174 var3 = class239.method1581(-64, arg1);
        if (~arg0 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field3467 != null && var3.field3467.length > arg0 ? var3.field3467[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field638;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!db", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field637 == arg0) {
            this.field637 = null;
        }
        ++field622;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    public static final void method239(int arg0, boolean arg1) {
        ++field634;
        byte[][] var2 = class167.field3223;
        byte var3 = 4;
        for (int var4 = arg0; var4 < var3; ++var4) {
            class219.method1481(2);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class111.field2026[var4][var5][var6];
                    if (~var8 != 0) {
                        int var9 = (66997124 & var8) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = 1023 & var8 >> 14;
                            int var11 = 3 & var8 >> 1;
                            int var12 = var8 >> 3 & 2047;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; ~class146.field2733.length < ~var14; ++var14) {
                                if (~class146.field2733[var14] == ~var13 && var2[var14] != null) {
                                    class64.method449(var5 * 8, 4, arg1, var11, (7 & var10) * 8, (7 & var12) * 8, class166.field3202, var9, var2[var14], var6 * 8, var4);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class17.method83(var4, 8, false, 8, var6 * 8, var5 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method240(int arg0) {
        field649 = null;
        field656 = null;
        field635 = null;
        int var1 = -102 % ((-53 - arg0) / 34);
        field659 = null;
        field652 = null;
        field644 = null;
        field645 = null;
        field632 = null;
        field651 = null;
        field640 = null;
        field658 = null;
        field653 = null;
        field633 = null;
        field642 = null;
        field643 = null;
        field624 = null;
        field628 = null;
        field661 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)Lcc;")
    public static final class26 method241(byte arg0, byte[] arg1) {
        ++field654;
        if (arg1 == null) {
            return null;
        } else {
            class41 var2 = new class41(arg1, class247.field4530, class135.field2512, class102.field1853, class67.field1218, class116.field2106);
            if (arg0 >= -86) {
                field652 = null;
            }
            class239.method1580(-118);
            return var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field657;
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public final void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field648;
        if (arg0 <= 66) {
            this.method245(-33);
        }
        this.method247(arg1, arg3, arg2, -120, arg4);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg3, arg2, arg1);
        arg5.drawImage(super.field4274, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method243(int arg0, int arg1, boolean arg2, Component arg3) {
        ++field647;
        super.field4276 = arg1;
        super.field4273 = arg0;
        super.field4271 = new int[arg0 * arg1 + 1];
        this.field630 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field4274 = arg3.createImage(this);
        if (arg2) {
            this.method245(-1871211965);
            arg3.prepareImage(super.field4274, this);
            this.method245(-1871211965);
            arg3.prepareImage(super.field4274, this);
            this.method245(-1871211965);
            arg3.prepareImage(super.field4274, this);
            this.method1523(3739);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BZILud;)V")
    public static final void method244(byte[] arg0, boolean arg1, int arg2, class222 arg3) {
        ++field639;
        class90 var4 = new class90();
        var4.field1714 = arg3;
        var4.field1706 = arg0;
        var4.field1702 = 0;
        var4.field1219 = (long) arg2;
        class248 var5 = class227.field4254;
        synchronized (class227.field4254) {
            class227.field4254.method1624(var4, 126);
        }
        class146.method979((byte) -128);
        if (!arg1) {
            field658 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    private final synchronized void method245(int arg0) {
        ++field660;
        if (this.field637 != null) {
            if (arg0 != -1871211965) {
                this.startProduction((ImageConsumer) null);
            }
            this.field637.setPixels(0, 0, super.field4276, super.field4273, this.field630, super.field4271, 0, super.field4276);
            this.field637.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method246(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method245(-1871211965);
        ++field641;
        arg3.drawImage(super.field4274, arg2, arg0, this);
        if (arg1 != -14013488) {
            method239(-14, true);
        }
    }

    @OriginalMember(owner = "client!db", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field627;
    }

    @OriginalMember(owner = "client!db", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field637 = arg0;
        ++field646;
        arg0.setDimensions(super.field4276, super.field4273);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field630);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field636;
        if (this.field637 != null) {
            this.field637.setPixels(arg4, arg1, arg2, arg0, this.field630, super.field4271, super.field4276 * arg1 + arg4, super.field4276);
            this.field637.imageComplete(2);
            if (arg3 >= -96) {
                field645 = null;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field629;
        return this.field637 == arg0;
    }
}

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class72 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1824 = 3353893;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lwd;")
    public static class150 field1813 = class2.method9(true, ": ");

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Lwd;")
    private static class150 field1832 = class2.method9(true, "Walk here");

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lwd;")
    public static class150 field1815 = field1832;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lwd;")
    private static class150 field1827 = class2.method9(true, "Public chat");

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Lwd;")
    public static class150 field1835 = field1827;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lof;")
    public static class103 field1821 = new class103();

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "[[I")
    public static int[][] field1837 = new int[104][104];

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Lwd;")
    public static class150 field1840 = class2.method9(true, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lwd;")
    private static class150 field1841 = class2.method9(true, "wave2:");

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lwd;")
    public static class150 field1838 = class2.method9(true, ")3");

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lwd;")
    public static class150 field1843 = field1841;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lwd;")
    public static class150 field1842 = field1841;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lwd;")
    public static class150 field1844 = class2.method9(true, "logo");

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lff;")
    public static class42 field1820;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1829;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1828;

    @OriginalMember(owner = "client!kd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1830;
        return this.field1828 == arg0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static final void method549(boolean arg0) {
        ++field1819;
        class38.field1035.method431(0);
        if (!arg0) {
            method553(7, (class148) null, (class139) null, 93);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII[Lva;)V")
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141[] arg10) {
        for (int var11 = 0; var11 < arg10.length; ++var11) {
            class141 var12 = arg10[var11];
            if (var12 != null && (var12.field3354 == 0 || var12.field3384) && var12 != null && ~var12.field3298 == ~arg4 && !class80.method579(51, var12)) {
                int var13 = var12.field3353 - arg6 + arg7;
                int var14 = var12.field3326 + var13;
                int var15 = ~var13 < ~arg7 ? var13 : arg7;
                int var16 = ~arg3 >= ~var14 ? arg3 : var14;
                int var17 = -arg8 + arg0 + var12.field3304;
                int var18 = var17 <= arg0 ? arg0 : var17;
                int var19 = var12.field3321 + var17;
                int var20 = arg9 > var19 ? var19 : arg9;
                if (~var12.field3354 == -1) {
                    method550(var18, 23680, arg2, var16, var12.field3323, arg5, var15 - (var13 - var12.field3309), var15, var12.field3390 + var18 - var17, var20, arg10);
                    if (var12.field3367 != null) {
                        method550(var18, 23680, arg2, var16, var12.field3323, arg5, -var13 + var15 - -var12.field3309, var15, -var17 + var18 + var12.field3390, var20, var12.field3367);
                    }
                }
                if (var12.field3384) {
                    boolean var21;
                    if (~var18 >= ~class111.field2557 && ~class113.field2602 <= ~var15 && class111.field2557 < var20 && var16 > class113.field2602) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    if (class143.field3466 == 1 && var21) {
                        var22 = true;
                    }
                    boolean var23 = false;
                    if (~client.field618 == -2 && var18 <= class14.field370 && ~class131.field3098 <= ~var15 && class14.field370 < var20 && ~var16 < ~class131.field3098) {
                        var23 = true;
                    }
                    if (var23 && class80.field1938 == null && (512 & arg2) != 0 && !class145.field3517 && class146.method1096((byte) -70, var12) != null) {
                        class116.field2660 = false;
                        class55.field1444 = -var15 + class131.field3098;
                        class137.field3221 = arg5;
                        class95.field2209 = -var18 + class14.field370;
                        class80.field1938 = var12;
                        class54.field1426 = 0;
                    }
                    if (class80.field1938 != null || class145.field3517) {
                        var21 = false;
                        var23 = false;
                        var22 = false;
                    }
                    if (!var12.field3344 && var23 && ~(arg2 & 1) != -1) {
                        var12.field3344 = true;
                        if (var12.field3313 != null) {
                            class43.method331(var12.field3313, -111, (class141) null, 0, -var13 + class131.field3098, -var17 + class14.field370, var12);
                        }
                    }
                    if (var12.field3344 && var22 && ~(4 & arg2) != -1 && var12.field3358 != null) {
                        class43.method331(var12.field3358, -115, (class141) null, 0, -var13 + class113.field2602, -var17 + class111.field2557, var12);
                    }
                    if (var12.field3344 && !var22 && ~(2 & arg2) != -1) {
                        var12.field3344 = false;
                        if (var12.field3314 != null) {
                            class43.method331(var12.field3314, -112, (class141) null, 0, -var13 + class113.field2602, -var17 + class111.field2557, var12);
                        }
                    }
                    if (var22 && (8 & arg2) != 0 && var12.field3377 != null) {
                        class43.method331(var12.field3377, -122, (class141) null, 0, -var13 + class113.field2602, class111.field2557 - var17, var12);
                    }
                    if (!var12.field3369 && var21 && (16 & arg2) != 0) {
                        var12.field3369 = true;
                        if (var12.field3365 != null) {
                            class43.method331(var12.field3365, -120, (class141) null, 0, -var13 + class113.field2602, -var17 + class111.field2557, var12);
                        }
                    }
                    if (var12.field3369 && var21 && ~(64 & arg2) != -1 && var12.field3414 != null) {
                        class43.method331(var12.field3414, -121, (class141) null, 0, class113.field2602 - var13, -var17 + class111.field2557, var12);
                    }
                    if (var12.field3369 && !var21 && ~(32 & arg2) != -1) {
                        var12.field3369 = false;
                        if (var12.field3389 != null) {
                            class43.method331(var12.field3389, -119, (class141) null, 0, -var13 + class113.field2602, -var17 + class111.field2557, var12);
                        }
                    }
                    if (var12.field3316 != null && (128 & arg2) != 0) {
                        class43.method331(var12.field3316, -113, (class141) null, 0, 0, 0, var12);
                    }
                    if (var21 && class108.field2475 != 0 && var12.field3415 != null && (1024 & arg2) != 0) {
                        class43.method331(var12.field3415, -120, (class141) null, 0, class108.field2475, 0, var12);
                    }
                    if (~(arg2 & 256) != -1) {
                        if (~class128.field3024 < ~var12.field3413 && var12.field3303 != null) {
                            class43.method331(var12.field3303, -123, (class141) null, 0, 0, 0, var12);
                        }
                        if (class38.field1045 > var12.field3413 && var12.field3345 != null) {
                            class43.method331(var12.field3345, arg1 ^ -23799, (class141) null, 0, 0, 0, var12);
                        }
                        if (class118.field2700 > var12.field3413 && var12.field3396 != null) {
                            class43.method331(var12.field3396, -119, (class141) null, 0, 0, 0, var12);
                        }
                        var12.field3413 = class11.field280;
                    }
                }
            }
        }
        if (arg1 != 23680) {
            field1832 = null;
        }
        ++field1825;
    }

    @OriginalMember(owner = "client!kd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1816;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpd;Lff;Lff;Lff;I)Z")
    public static final boolean method551(class108 arg0, class42 arg1, class42 arg2, class42 arg3, int arg4) {
        class18.field480 = arg2;
        class49.field1312 = arg0;
        if (arg4 != -906) {
            method551((class108) null, (class42) null, (class42) null, (class42) null, 105);
        }
        class40.field1066 = arg3;
        ++field1826;
        class142.field3437 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    private final synchronized void method552(byte arg0) {
        ++field1831;
        if (this.field1828 != null) {
            this.field1828.setPixels(0, 0, super.field1800, super.field1795, this.field1829, super.field1794, 0, super.field1800);
            int var2 = 60 / ((-91 - arg0) / 32);
            this.field1828.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1823;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILwb;Lue;I)V")
    public static final void method553(int arg0, class148 arg1, class139 arg2, int arg3) {
        class76 var4 = new class76();
        ++field1836;
        var4.field1879 = arg1.method1137(255);
        var4.field1885 = arg1.method1104(true);
        var4.field1878 = new int[var4.field1879];
        var4.field1881 = new byte[var4.field1879][][];
        var4.field1880 = new class100[var4.field1879];
        var4.field1891 = new int[var4.field1879];
        var4.field1871 = new int[var4.field1879];
        var4.field1886 = new class100[var4.field1879];
        for (int var5 = 0; ~var4.field1879 < ~var5; ++var5) {
            try {
                int var6 = arg1.method1137(255);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var10 = new String(arg1.method1154((byte) 114).method1170(-1));
                        String var11 = new String(arg1.method1154((byte) 85).method1170(arg3 + 3));
                        int var12 = arg1.method1137(255);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = new String(arg1.method1154((byte) 101).method1170(-1));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg1.method1104(true);
                                var15[var16] = new byte[var17];
                                arg1.method1103(var17, -92, var15[var16], 0);
                            }
                        }
                        var4.field1878[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; ~var19 > ~var12; ++var19) {
                            var18[var19] = class137.method1015(false, var13[var19]);
                        }
                        var4.field1886[var5] = arg2.method1026(class137.method1015(false, var10), var18, (byte) 101, var11);
                        var4.field1881[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg1.method1154((byte) -103).method1170(-1));
                    String var8 = new String(arg1.method1154((byte) 117).method1170(-1));
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method1104(true);
                    }
                    var4.field1878[var5] = var6;
                    var4.field1871[var5] = var9;
                    var4.field1880[var5] = arg2.method1027(var8, true, class137.method1015(false, var7));
                }
            } catch (ClassNotFoundException var20) {
                var4.field1891[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1891[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1891[var5] = -3;
            } catch (Exception var23) {
                var4.field1891[var5] = -4;
            } catch (Throwable var24) {
                var4.field1891[var5] = -5;
            }
        }
        class63.field1627.method711(var4, arg3 ^ arg3);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public final void method287(Graphics arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field1822;
        this.method552((byte) 60);
        arg0.drawImage(super.field1810, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method554(int arg0) {
        if (arg0 == 17286) {
            field1844 = null;
            field1813 = null;
            field1837 = null;
            field1815 = null;
            field1820 = null;
            field1840 = null;
            field1843 = null;
            field1821 = null;
            field1835 = null;
            field1832 = null;
            field1842 = null;
            field1827 = null;
            field1841 = null;
            field1838 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1818;
        if (this.field1828 == arg0) {
            this.field1828 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1828 = arg0;
        ++field1817;
        arg0.setDimensions(super.field1800, super.field1795);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1829);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method286(int arg0, int arg1, Component arg2, int arg3) {
        super.field1800 = arg1;
        super.field1795 = arg0;
        if (arg3 != 1) {
            this.addConsumer((ImageConsumer) null);
        }
        super.field1794 = new int[arg0 * arg1 - -1];
        this.field1829 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field1814;
        super.field1810 = arg2.createImage(this);
        this.method552((byte) -50);
        arg2.prepareImage(super.field1810, this);
        this.method552((byte) -128);
        arg2.prepareImage(super.field1810, this);
        this.method552((byte) -123);
        arg2.prepareImage(super.field1810, this);
        this.method546(54);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method555(int arg0) {
        class70.field1786 = 0;
        ++field1833;
        class111.field2577 = 0;
        class18.method132(96);
        class80.method578(true);
        class61.method480(true);
        class91.method647((byte) 32);
        for (int var1 = 0; var1 < class70.field1786; ++var1) {
            int var4 = class49.field1293[var1];
            if (class11.field280 != class137.field3217[var4].field2965) {
                class137.field3217[var4] = null;
            }
        }
        if (class76.field1870 != class121.field2783.field3601) {
            throw new RuntimeException("gpp1 pos:" + class121.field2783.field3601 + " psize:" + class76.field1870);
        } else {
            int var2 = 112 % ((14 - arg0) / 47);
            for (int var3 = 0; ~class109.field2533 < ~var3; ++var3) {
                if (class137.field3217[class61.field1574[var3]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class109.field2533);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1834;
    }
}

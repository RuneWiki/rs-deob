import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends Canvas {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field672;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lmc;")
    public static class75 field671 = method234(true, "Ausw-=hlen");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lmc;")
    private static class75 field675 = method234(true, "Loaded fonts");

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
    public static boolean field681 = false;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lmc;")
    private static class75 field684 = method234(true, "Loaded interfaces");

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lmc;")
    public static class75 field668 = field684;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lmc;")
    public static class75 field670 = field675;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lmc;")
    public static class75 field682 = method234(true, "Angreifen");

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lmc;")
    public static class75 field680 = method234(true, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lbe;")
    public static class12 field676;

    @OriginalMember(owner = "client!ee", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void paint(Graphics arg0) {
        field679++;
        this.field672.paint(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/String;)Lmc;", line = 24)
    public static final class75 method234(boolean arg0, String arg1) {
        field678++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class75 var5 = new class75();
        var5.field1912 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field1912[var5.field1869++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field1912[var5.field1869++] = (byte) var6;
            }
        }
        if (arg0) {
            var5.method650(0);
            return var5.method623(19374);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 66)
    public class30(Component arg0) {
        this.field672 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 76)
    public static void method235(byte arg0) {
        field670 = null;
        field671 = null;
        field675 = null;
        field682 = null;
        field680 = null;
        field676 = null;
        field684 = null;
        if (arg0 < -116) {
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I", line = 96)
    public static final int method236(int arg0, int arg1, int arg2) {
        field667++;
        if (~arg0 == arg1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V", line = 118)
    public static final void method237(byte[] arg0, int arg1) {
        class61 var2 = new class61(arg0);
        var2.field1556 = arg0.length - 2;
        field673++;
        class5.field76 = var2.method507((byte) -105);
        class43.field1031 = new int[class5.field76];
        class36.field880 = new int[class5.field76];
        class100.field2592 = new int[class5.field76];
        class118.field2924 = new byte[class5.field76][];
        class47.field1154 = new int[class5.field76];
        var2.field1556 = arg0.length - class5.field76 * 8 - 7;
        class130.field3170 = var2.method507((byte) -126);
        class55.field1395 = var2.method507((byte) -123);
        if (arg1 < 98) {
            method237(null, 32);
        }
        int var3 = (var2.method494(20471) & 0xFF) + 1;
        for (int var4 = 0; var4 < class5.field76; var4++) {
            class47.field1154[var4] = var2.method507((byte) -23);
        }
        for (int var5 = 0; var5 < class5.field76; var5++) {
            class43.field1031[var5] = var2.method507((byte) -84);
        }
        for (int var6 = 0; var6 < class5.field76; var6++) {
            class100.field2592[var6] = var2.method507((byte) -34);
        }
        for (int var7 = 0; var7 < class5.field76; var7++) {
            class36.field880[var7] = var2.method507((byte) -26);
        }
        var2.field1556 = arg0.length + 3 - class5.field76 * 8 - var3 * 3 - 7;
        class85.field2109 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class85.field2109[var8] = var2.method510(-99);
            if (class85.field2109[var8] == 0) {
                class85.field2109[var8] = 1;
            }
        }
        var2.field1556 = 0;
        for (int var9 = 0; var9 < class5.field76; var9++) {
            int var10 = class100.field2592[var9];
            int var11 = class36.field880[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class118.field2924[var9] = var13;
            int var14 = var2.method494(20471);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method517(128);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method517(128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqc;)Z", line = 239)
    public static final boolean method238(int arg0, class99 arg1) {
        field677++;
        if (arg1.field2522 == null) {
            return false;
        } else if (arg0 == 27389) {
            for (int var2 = 0; var2 < arg1.field2522.length; var2++) {
                int var3 = class82.method690(arg1, arg0 - 27376, var2);
                int var4 = arg1.field2507[var2];
                if (arg1.field2522[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field2522[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field2522[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lka;Lvb;IZ)V", line = 298)
    public static final void method239(class61 arg0, class124 arg1, int arg2, boolean arg3) {
        field683++;
        class35 var4 = new class35();
        var4.field842 = arg0.method494(20471);
        var4.field852 = arg0.method496((byte) 122);
        var4.field838 = new int[var4.field842];
        var4.field820 = new byte[var4.field842][][];
        var4.field823 = new class121[var4.field842];
        var4.field825 = new int[var4.field842];
        var4.field834 = new class121[var4.field842];
        var4.field846 = new int[var4.field842];
        for (int var5 = 0; var5 < var4.field842; var5++) {
            try {
                int var6 = arg0.method494(20471);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method509((byte) 78).method636(-18729));
                    int var8 = 0;
                    String var9 = new String(arg0.method509((byte) 78).method636(-18729));
                    if (var6 == 1) {
                        var8 = arg0.method496((byte) 122);
                    }
                    var4.field825[var5] = var6;
                    var4.field838[var5] = var8;
                    var4.field823[var5] = arg1.method993(class131.method1020(121, var7), 0, var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method509((byte) 78).method636(-18729));
                    String var11 = new String(arg0.method509((byte) 78).method636(-18729));
                    int var12 = arg0.method494(20471);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method509((byte) 78).method636(-18729));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method496((byte) 122);
                            var15[var16] = new byte[var17];
                            arg0.method525(var15[var16], 3, 0, var17);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field825[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class131.method1020(83, var13[var19]);
                    }
                    var4.field834[var5] = arg1.method990(var18, 126, class131.method1020(101, var10), var11);
                    var4.field820[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field846[var5] = -1;
            } catch (SecurityException var21) {
                var4.field846[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field846[var5] = -3;
            } catch (Exception var23) {
                var4.field846[var5] = -4;
            } catch (Throwable var24) {
                var4.field846[var5] = -5;
            }
        }
        if (arg3) {
            class58.field1457.method245(var4, 0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 424)
    public final void update(Graphics arg0) {
        field674++;
        this.field672.update(arg0);
    }
}

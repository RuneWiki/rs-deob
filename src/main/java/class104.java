import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class104 {

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[[I")
    private int[][] field1806;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ldc;")
    public static class37 field1794 = class185.method1233((byte) 86, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lli;")
    public static class128 field1796 = null;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ldc;")
    private static class37 field1800 = class185.method1233((byte) 86, "Loaded interfaces");

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Ldc;")
    private static class37 field1804 = class185.method1233((byte) 86, "This computers address has been blocked");

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ldc;")
    private static class37 field1799 = class185.method1233((byte) 86, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Ldc;")
    public static class37 field1805 = field1799;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Ldc;")
    public static class37 field1812 = field1804;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Ldc;")
    public static class37 field1810 = class185.method1233((byte) 86, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Ldc;")
    public static class37 field1811 = field1800;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lsd;")
    public static class200 field1801;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)I")
    public final int method673(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1813 = 111;
        }
        if (this.field1806 != null) {
            arg0 = (int) ((long) this.field1798 * (long) arg0 / (long) this.field1813);
        }
        field1795++;
        return arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method674(boolean arg0) {
        field1810 = null;
        field1794 = null;
        field1800 = null;
        field1799 = null;
        field1804 = null;
        field1801 = null;
        field1811 = null;
        field1805 = null;
        if (arg0) {
            field1812 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JI)V")
    public static final void method675(long arg0, int arg1) {
        field1803++;
        if (arg0 == 0L) {
            return;
        }
        if (field1808 >= 100 && class69.field1257 != 1 || field1808 >= 200) {
            class215.method1418(0, -1, class218.field4069, class243.field4462);
            return;
        }
        class37 var3 = class184.method1228(-1, arg0).method317((byte) 59);
        for (int var4 = 0; var4 < field1808; var4++) {
            if (class147.field2795[var4] == arg0) {
                class215.method1418(0, arg1 - 32768, class80.method548(new class37[] { var3, class244.field4468 }, -104), class243.field4462);
                return;
            }
        }
        if (arg1 != 32767) {
            method680(-117, false);
        }
        for (int var5 = 0; var5 < class59.field1100; var5++) {
            if (class193.field3606[var5] == arg0) {
                class215.method1418(0, arg1 ^ 0xFFFF8000, class80.method548(new class37[] { class153.field2899, var3, class239.field4400 }, -36), class243.field4462);
                return;
            }
        }
        if (var3.method346(class238.field4382.field2187, (byte) -49)) {
            class215.method1418(0, arg1 ^ 0xFFFF8000, class50.field1006, class243.field4462);
            return;
        }
        class224.field4146++;
        class80.field1420[field1808] = var3;
        class147.field2795[field1808] = arg0;
        class162.field3069[field1808] = 0;
        class204.field3784[field1808] = class243.field4462;
        class26.field455[field1808] = 0;
        class237.field4311[field1808] = false;
        field1808++;
        class168.field3197 = class112.field1963;
        class49.field970.method1503(92, 2976);
        class49.field970.method190(arg0, (byte) -120);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method676(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1793++;
        while (class12.field167.method1505(1693770787, class8.field100) >= 11) {
            int var1 = class12.field167.method1506((byte) 113, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class8.field107[var1] == null) {
                class8.field107[var1] = new class123();
                var2 = true;
                if (class66.field1194[var1] != null) {
                    class8.field107[var1].method838(12, class66.field1194[var1]);
                }
            }
            class9.field122[class76.field1342++] = var1;
            class123 var3 = class8.field107[var1];
            var3.field3529 = class203.field3758;
            int var4 = class12.field167.method1506((byte) 118, 1);
            if (var4 == 1) {
                class214.field4000[class19.field309++] = var1;
            }
            int var5 = class12.field167.method1506((byte) 124, 5);
            int var6 = class79.field1387[class12.field167.method1506((byte) 118, 3)];
            if (var2) {
                var3.field3513 = var3.field3511 = var6;
            }
            int var7 = class12.field167.method1506((byte) 121, 1);
            int var8 = class12.field167.method1506((byte) 124, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1264(class238.field4382.field3494[0] + var8, (byte) -116, var7 == 1, class238.field4382.field3525[0] + var5);
        }
        class12.field167.method1502(-110);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public final int method677(int arg0, int arg1) {
        field1809++;
        if (this.field1806 != null) {
            arg0 = (int) ((long) this.field1798 * (long) arg0 / (long) this.field1813) + 6;
        }
        return arg1 == 23596 ? arg0 : -69;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[B)[B")
    public final byte[] method678(int arg0, byte[] arg1) {
        if (arg0 != -1694746864) {
            field1804 = null;
        }
        if (this.field1806 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field1798 / (long) this.field1813) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1806[var3];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1798 + var3;
                int var14 = var13 / this.field1813;
                var5 += var14;
                var3 = var13 - this.field1813 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field1802++;
        return arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method679(int arg0, Component arg1) {
        arg1.addMouseListener(class32.field657);
        field1807++;
        if (arg0 != 95) {
            method675(-55L, -55);
        }
        arg1.addMouseMotionListener(class32.field657);
        arg1.addFocusListener(class32.field657);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IZ)Z")
    public static final boolean method680(int arg0, boolean arg1) {
        field1797++;
        if (!arg1) {
            method679(-57, null);
        }
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
    public class104(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class223.method1470(arg0, 81, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1813 = var5;
            this.field1798 = var4;
            this.field1806 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1806[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class67 {

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Led;")
    public static class43 field102 = class191.method1219("::rect_debug", false);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Led;")
    public static class43 field111 = class191.method1219(")4lang)4de", false);

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lia;")
    public static class75 field103 = new class75();

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Z")
    public static boolean field112 = false;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lga;")
    public static class58 field113;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lad;")
    public class5 field105;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lad;")
    public class5 field110;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public static void method28(int arg0) {
        field103 = null;
        if (arg0 != 255) {
            method31(-92, 58, -75);
        }
        field111 = null;
        field102 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static final void method29(int arg0) {
        class43.method265(false, class148.field3021);
        field104++;
        class33.field617++;
        if (class85.field1664 && class55.field1106) {
            int var1 = class185.field3654;
            int var2 = var1 - class191.field3727;
            if (var2 < class203.field3965) {
                var2 = class203.field3965;
            }
            if (arg0 >= 31) {
                int var3 = class105.field1998;
                if (class203.field3965 + class159.field3211.field2656 < class148.field3021.field2656 + var2) {
                    var2 = class203.field3965 + class159.field3211.field2656 - class148.field3021.field2656;
                }
                int var4 = var2 - class67.field1357;
                int var5 = var3 - class108.field2084;
                if (class41.field797 > var5) {
                    var5 = class41.field797;
                }
                if (class41.field797 + class159.field3211.field2662 < class148.field3021.field2662 + var5) {
                    var5 = class41.field797 + class159.field3211.field2662 - class148.field3021.field2662;
                }
                int var6 = var2 + class159.field3211.field2572 - class203.field3965;
                int var7 = var5 - class150.field3037;
                int var8 = class148.field3021.field2618;
                int var9 = var5 + class159.field3211.field2680 - class41.field797;
                if (class33.field617 > class148.field3021.field2697 && (var8 < var4 || -var8 > var4 || var7 > var8 || -var8 > var7)) {
                    class95.field1850 = true;
                }
                if (class148.field3021.field2681 != null && class95.field1850) {
                    class115 var10 = new class115();
                    var10.field2247 = var9;
                    var10.field2249 = class148.field3021;
                    var10.field2238 = class148.field3021.field2681;
                    var10.field2255 = var6;
                    class203.method1311(var10, 3538);
                }
                if (class21.field357 == 0) {
                    if (class95.field1850) {
                        if (class148.field3021.field2640 != null) {
                            class115 var11 = new class115();
                            var11.field2238 = class148.field3021.field2640;
                            var11.field2247 = var9;
                            var11.field2249 = class148.field3021;
                            var11.field2255 = var6;
                            var11.field2251 = class100.field1909;
                            class203.method1311(var11, 3538);
                        }
                        if (class100.field1909 != null && class71.method435((byte) -68, class148.field3021) != null) {
                            class29.field522.method338(253, 173);
                            class30.field562++;
                            class29.field522.method571((byte) -81, class100.field1909.field2664);
                            class29.field522.method556(126, class148.field3021.field2661);
                            class29.field522.method537(class100.field1909.field2661, (byte) 49);
                            class29.field522.method571((byte) -81, class148.field3021.field2664);
                        }
                    } else if ((class99.field1904 == 1 || class97.method612(-25553, class41.field799 - 1)) && class41.field799 > 2) {
                        class100.method622((byte) -113);
                    } else if (class41.field799 > 0) {
                        class114.method714((byte) 116, class41.field799 - 1);
                    }
                    class148.field3021 = null;
                }
            }
        } else if (class33.field617 > 1) {
            class148.field3021 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public final void method30(int arg0) {
        field101++;
        if (this.field105 == null) {
            return;
        }
        this.field105.field110 = this.field110;
        this.field110.field105 = this.field105;
        this.field105 = null;
        if (arg0 == 13) {
            this.field110 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
    public static final int method31(int arg0, int arg1, int arg2) {
        field109++;
        if (arg0 >= -93) {
            field103 = null;
        }
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luc;")
    public static final class184 method32(Throwable arg0, String arg1) {
        field107++;
        class184 var2;
        if (arg0 instanceof class184) {
            var2 = (class184) arg0;
            var2.field3621 = var2.field3621 + ' ' + arg1;
        } else {
            var2 = new class184(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLed;B)V")
    public static final void method33(boolean arg0, class43 arg1, byte arg2) {
        field108++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class23.field451.method958(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class23.field451.method937(arg1, 250) * 13;
        class168.method1046(var4 - var3, -var3 + var6, var3 + var5 + var3, var7 - (-var3 - var3), 0);
        class168.method1041(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var3 + var7, 16777215);
        int var8 = 24 % ((arg2 - 76) / 47);
        class23.field451.method948(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class200.method1306(var4 - var3, var7 - -var3 - -var3, var6 - var3, var3 + var5 - -var3, 0);
        if (!arg0) {
            class114.method704(var7, var4, var6, var5, 0);
            return;
        }
        try {
            Graphics var9 = class100.field1911.getGraphics();
            class154.field3132.method278(var9, 65, 0, 0);
        } catch (Exception var10) {
            class100.field1911.repaint();
        }
    }
}

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class160 {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Leh;")
    private static class47 field3107 = class195.method1282((byte) -4, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Leh;")
    private static class47 field3108 = class195.method1282((byte) -4, "Sorry invited players only)3");

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Leh;")
    public static class47 field3113 = field3108;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Leh;")
    public static class47 field3114 = field3107;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lld;")
    public static class103 field3105 = new class103();

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Leh;")
    private static class47 field3118 = class195.method1282((byte) -4, "Drop");

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Leh;")
    public static class47 field3119 = field3118;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field3111;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
    public int[] field3104;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method1095(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public final void method1096(boolean arg0) {
        class169.method1154(this.field3104, this.field3112, this.field3110);
        field3106++;
        if (arg0) {
            method1101(86, 68, 17);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field3119 = null;
        field3107 = null;
        field3105 = null;
        if (arg0 <= 70) {
            field3119 = null;
        }
        field3114 = null;
        field3118 = null;
        field3108 = null;
        field3113 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method1098(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class146 var5 = (class146) class124.field2501.method345(-99);
        int var6 = 49 / ((12 - arg0) / 53);
        while (var5 != null) {
            if (var5.field2861 != -1 || var5.field2875 != null) {
                int var7 = 0;
                if (var5.field2870 < arg1) {
                    var7 += arg1 - var5.field2870;
                } else if (var5.field2846 > arg1) {
                    var7 += var5.field2846 - arg1;
                }
                if (var5.field2866 < arg3) {
                    var7 += arg3 - var5.field2866;
                } else if (var5.field2851 > arg3) {
                    var7 += var5.field2851 - arg3;
                }
                if (var5.field2858 < var7 - 64 || class159.field3099 == 0 || var5.field2848 != arg2) {
                    if (var5.field2874 != null) {
                        class182.field3491.method1175(var5.field2874);
                        var5.field2874 = null;
                    }
                    if (var5.field2845 != null) {
                        class182.field3491.method1175(var5.field2845);
                        var5.field2845 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var5.field2858 - var7) * class159.field3099 / var5.field2858;
                    if (var5.field2874 != null) {
                        var5.field2874.method131(var8);
                    } else if (var5.field2861 >= 0) {
                        class112 var9 = class112.method891(class147.field2882, var5.field2861, 0);
                        if (var9 != null) {
                            class104 var10 = var9.method892().method847(class41.field817);
                            class15 var11 = class15.method130(var10, 100, var8);
                            var11.method159(-1);
                            class182.field3491.method1174(var11);
                            var5.field2874 = var11;
                        }
                    }
                    if (var5.field2845 != null) {
                        var5.field2845.method131(var8);
                        if (!var5.field2845.method883(true)) {
                            var5.field2845 = null;
                        }
                    } else if (var5.field2875 != null && (var5.field2868 -= arg4) <= 0) {
                        int var12 = (int) ((double) var5.field2875.length * Math.random());
                        class112 var13 = class112.method891(class147.field2882, var5.field2875[var12], 0);
                        if (var13 != null) {
                            class104 var14 = var13.method892().method847(class41.field817);
                            class15 var15 = class15.method130(var14, 100, var8);
                            var15.method159(0);
                            class182.field3491.method1174(var15);
                            var5.field2868 = var5.field2872 + (int) ((double) (var5.field2842 - var5.field2872) * Math.random());
                            var5.field2845 = var15;
                        }
                    }
                }
            }
            var5 = (class146) class124.field2501.method348(13949);
        }
        field3115++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public abstract void method1100(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    protected class160() {
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
    public static final int method1101(int arg0, int arg1, int arg2) {
        if (arg0 != 126) {
            return -74;
        }
        field3102++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class162 extends Canvas {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field2789;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Ljd;")
    public static class85 field2788 = class221.method1499("sl_flags", (byte) -53);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Z")
    public static boolean field2785 = false;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[Ljd;")
    public static class85[] field2793 = new class85[1000];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lge;")
    public static class68 field2790;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)V")
    public static final void method1063(boolean arg0, int arg1) {
        class21.method145(30868);
        field2794++;
        if (class1.field4 != 30 && class1.field4 != 25) {
            return;
        }
        class117.field2104++;
        if (arg1 > class117.field2104 && !arg0) {
            return;
        }
        class117.field2104 = 0;
        if (!class54.field960 && class198.field3390 != null) {
            class233.field4026++;
            class207.field3618.method483(-24260, 250);
            try {
                class198.field3390.method214(class207.field3618.field4238, class207.field3618.field4224, 0, (byte) 15);
                class207.field3618.field4224 = 0;
            } catch (IOException var2) {
                class54.field960 = true;
            }
        }
        class21.method145(30868);
    }

    @OriginalMember(owner = "client!ba", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2784++;
        this.field2789.update(arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([SI[Ljd;IB)V")
    public static final void method1064(short[] arg0, int arg1, class85[] arg2, int arg3, byte arg4) {
        if (arg3 < arg1) {
            int var5 = arg3;
            int var6 = (arg1 + arg3) / 2;
            class85 var7 = arg2[var6];
            arg2[var6] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method616(true, var7) < (var9 & 0x1)) {
                    class85 var10 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg2[arg1] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var8;
            method1064(arg0, var5 - 1, arg2, arg3, (byte) -78);
            method1064(arg0, arg1, arg2, var5 + 1, (byte) -78);
        }
        if (arg4 == -78) {
            field2791++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    public static final void method1065(int arg0, int arg1, int arg2) {
        class28.field436 = true;
        class175.field3011 = arg0;
        class261.field4620 = arg1;
        class163.field2814 = arg2;
        class247.field4227 = -1;
        class49.field859 = -1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class162(Component arg0) {
        this.field2789 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2788 = null;
        if (arg0 != 0) {
            method1067((byte) 45);
        }
        field2793 = null;
        field2790 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method1067(byte arg0) {
        class102 var1 = class79.field1450;
        synchronized (class79.field1450) {
            class18.field263 = class269.field4786;
            class131.field2293++;
            if (class214.field3765 >= 0) {
                while (class214.field3765 != class181.field3097) {
                    int var3 = class102.field1817[class181.field3097];
                    class181.field3097 = class181.field3097 + 1 & 0x7F;
                    if (var3 < 0) {
                        class105.field1843[~var3] = false;
                    } else {
                        class105.field1843[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class105.field1843[var2] = false;
                }
                class214.field3765 = class181.field3097;
            }
            class269.field4786 = class205.field3579;
            if (arg0 >= -107) {
                field2788 = null;
            }
        }
        field2787++;
    }

    @OriginalMember(owner = "client!ba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2795++;
        this.field2789.paint(arg0);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
    public static final void method1068(int arg0, int arg1, int arg2) {
        class101 var3 = class132.method883(arg2, (byte) -125);
        field2782++;
        int var4 = var3.field1803;
        if (arg0 != 0) {
            field2793 = null;
        }
        int var5 = var3.field1800;
        int var6 = var3.field1798;
        int var7 = class27.field417[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class256.method1779(class256.field4563[var4] & ~var8 | var8 & arg1 << var5, var4, -11642);
    }
}

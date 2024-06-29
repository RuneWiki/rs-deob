import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class114 implements Runnable {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Z")
    public boolean field2215 = true;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Ljava/lang/Object;")
    public Object field2223 = new Object();

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
    public int[] field2224 = new int[500];

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
    public int[] field2225 = new int[500];

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field2226 = 0;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[Lsd;")
    public static class166[] field2216 = new class166[100];

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
    public static int[] field2218 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lsd;")
    public static class166 field2221 = class135.method935("Bitte entfernen Sie ", 0);

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lsd;")
    public static class166 field2217 = class135.method935("Sichtbare Karte vorbereitet)3", 0);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lsd;")
    private static class166 field2212 = class135.method935("Choose Option", 0);

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lsd;")
    public static class166 field2214 = field2212;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2219;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method830(int arg0) {
        field2219 = null;
        int var1 = -10 % ((-arg0 - 11) / 59);
        field2218 = null;
        field2221 = null;
        field2216 = null;
        field2217 = null;
        field2212 = null;
        field2214 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lf;IB)Lre;")
    public static final class158 method831(class47 arg0, int arg1, byte arg2) {
        field2213++;
        if (arg2 != 52) {
            field2219 = null;
        }
        return class169.method1174(arg0, arg1, false) ? class146.method1004(103) : null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLid;II)V")
    public static final void method832(int arg0, byte arg1, class77 arg2, int arg3, int arg4) {
        field2210++;
        if (class160.field3064 >= 400) {
            return;
        }
        if (arg2.field1598 != null) {
            arg2 = arg2.method637(-50);
        }
        if (arg2 == null || !arg2.field1565) {
            return;
        }
        int var5 = 68 % ((-arg1 - 65) / 51);
        class166 var6 = arg2.field1582;
        if (arg2.field1558 != 0) {
            var6 = class22.method148(new class166[] { var6, class159.method1083(class41.field728.field2421, arg2.field1558, -4), class51.field930, class134.field2599, class174.method1192(false, arg2.field1558), class45.field805 }, 0);
        }
        if (class4.field73 == 1) {
            class157.field3002++;
            class72.method571(arg3, arg0, class72.field1426, class22.method148(new class166[] { class135.field2651, class98.field1875, var6 }, 0), 7, arg4, false);
        } else if (!class179.field3393) {
            class34.field631++;
            class166[] var7 = arg2.field1591;
            if (class138.field2684) {
                var7 = class167.method1164(var7, 5);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && !var7[var8].method1146((byte) -72, class111.field2166)) {
                        class41.field739++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 15;
                        }
                        if (var8 == 1) {
                            var9 = 1;
                        }
                        if (var8 == 2) {
                            var9 = 26;
                        }
                        if (var8 == 3) {
                            var9 = 41;
                        }
                        if (var8 == 4) {
                            var9 = 11;
                        }
                        class72.method571(arg3, arg0, var7[var8], class22.method148(new class166[] { class63.field1308, var6 }, 0), var9, arg4, false);
                    }
                }
            }
            if (var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method1146((byte) -80, class111.field2166)) {
                        class129.field2518++;
                        short var11 = 0;
                        int var12 = 0;
                        if (class41.field728.field2421 < arg2.field1558) {
                            var11 = 2000;
                        }
                        if (var10 == 0) {
                            var12 = var11 + 15;
                        }
                        if (var10 == 1) {
                            var12 = var11 + 1;
                        }
                        if (var10 == 2) {
                            var12 = var11 + 26;
                        }
                        if (var10 == 3) {
                            var12 = var11 + 41;
                        }
                        if (var10 == 4) {
                            var12 = var11 + 11;
                        }
                        class72.method571(arg3, arg0, var7[var10], class22.method148(new class166[] { class63.field1308, var6 }, 0), var12, arg4, false);
                    }
                }
            }
            class72.method571(arg3, arg0, class4.field79, class22.method148(new class166[] { class63.field1308, var6 }, 0), 1007, arg4, false);
            return;
        } else if ((class49.field911 & 0x2) == 2) {
            class72.method571(arg3, arg0, class102.field1988, class22.method148(new class166[] { class43.field759, class98.field1875, var6 }, 0), 34, arg4, false);
            class89.field1753++;
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2215) {
            Object var1 = this.field2223;
            synchronized (this.field2223) {
                if (this.field2226 < 500) {
                    this.field2224[this.field2226] = class41.field734;
                    this.field2225[this.field2226] = class5.field110;
                    this.field2226++;
                }
            }
            class189.method1260(50L, 1);
        }
        field2222++;
    }
}

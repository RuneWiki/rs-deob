import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class133 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field2377 = new Object();

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Ldj;")
    public static class44 field2384 = class89.method650(255, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Ldj;")
    private static class44 field2387 = class89.method650(255, "Loaded input handler");

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ldj;")
    public static class44 field2381 = field2387;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Ls;")
    public static class190 field2388 = new class190();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lve;")
    public static class225 field2379;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[Lod;")
    public static class155[] field2386;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static final void method898(int arg0) {
        field2378++;
        int var1 = 0;
        if (arg0 != 303) {
            method898(-24);
        }
        while (class27.field490 > var1) {
            int var2 = class143.field2533[var1];
            class24 var3 = class122.field2168[var2];
            int var4 = class218.field3957.method506(255);
            if ((var4 & 0x20) != 0) {
                var4 += class218.field3957.method506(arg0 - 48) << 8;
            }
            class13.method118(var4, var3, var2, false);
            var1++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)I")
    public static final int method899(int arg0, byte arg1) {
        int var2 = -96 % ((8 - arg1) / 58);
        field2376++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lvc;IIII)V")
    public static final void method900(class223 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2383++;
        if (arg1 != 3) {
            field2377 = null;
        }
        if (class115.field2057 >= 3) {
            class99.method699(arg3, arg4, 0, arg0.field4090, arg0.field4106);
        } else {
            class198.field3507.method1012(arg3, arg4, arg0.field4130, arg0.field4134, class198.field3507.field2693 / 2, class198.field3507.field2687 / 2, class73.field1384, 256, arg0.field4090, arg0.field4106);
        }
        class187.field3219[arg2] = true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lve;IBZIII)V")
    public static final void method901(class225 arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class19.field322 = arg6;
        if (arg2 != 121) {
            return;
        }
        field2389++;
        class52.field940 = arg4;
        class101.field1851 = 1;
        class115.field2065 = arg1;
        class130.field2320 = arg5;
        class134.field2399 = arg0;
        class174.field3027 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ldj;Ljava/awt/Color;BIZ)V")
    public static final void method902(class44 arg0, Color arg1, byte arg2, int arg3, boolean arg4) {
        try {
            Graphics var5 = class8.field172.getGraphics();
            if (class71.field1357 == null) {
                class71.field1357 = new Font("Helvetica", 1, 13);
                class120.field2143 = class8.field172.getFontMetrics(class71.field1357);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class130.field2313, class169.field2926);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class106.field1943 == null) {
                    class106.field1943 = class8.field172.createImage(304, 34);
                }
                Graphics var6 = class106.field1943.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class71.field1357);
                var6.setColor(Color.white);
                arg0.method341(22, var6, (304 - arg0.method333(class120.field2143, true)) / 2, (byte) 14);
                if (arg2 >= -79) {
                    return;
                }
                var5.drawImage(class106.field1943, class130.field2313 / 2 - 152, class169.field2926 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class169.field2926 / 2 - 18;
                int var8 = class130.field2313 / 2 - 152;
                var5.setColor(arg1);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(var8 + arg3 * 3 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class71.field1357);
                var5.setColor(Color.white);
                arg0.method341(var7 + 22, var5, var8 + (304 - arg0.method333(class120.field2143, true)) / 2, (byte) 14);
            }
        } catch (Exception var10) {
            class8.field172.repaint();
        }
        field2385++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method903(boolean arg0) {
        field2388 = null;
        field2384 = null;
        field2386 = null;
        field2381 = null;
        field2377 = null;
        if (arg0) {
            field2379 = null;
        }
        field2379 = null;
        field2387 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
    public static final void method904(boolean arg0) {
        if (!arg0) {
            field2387 = null;
        }
        field2375++;
        class81.field1580.method1179((byte) -103);
    }
}

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class120 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lli;")
    public static class185 field2186 = class245.method1649("blinken1:", -35);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lli;")
    private static class185 field2189 = class245.method1649("cyan:", 123);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lli;")
    public static class185 field2191 = field2189;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2192 = -1;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lli;")
    public static class185 field2184 = field2189;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lw;")
    public static class230 field2187;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2193++;
        class201[] var7 = class10.field204;
        int var8 = 0;
        if (arg6 != -29683) {
            field2192 = -17;
        }
        while (var8 < var7.length) {
            class201 var9 = var7[var8];
            if (var9 != null && var9.field3695 == 2) {
                class81.method521((var9.field3682 - class107.field1933 << 7) + var9.field3684, -81, (-class77.field1339 + var9.field3677 << 7) + var9.field3693, arg1 >> 1, arg4, var9.field3692 * 2, arg2, arg5 >> 1);
                if (class28.field475 > -1 && (class211.field3851 % 20) < 10) {
                    class262.field4647[var9.field3685].method707(arg0 + class28.field475 - 12, class223.field4088 + arg3 - 28);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method887(byte arg0) {
        field2184 = null;
        field2189 = null;
        field2187 = null;
        if (arg0 != 3) {
            field2192 = -20;
        }
        field2186 = null;
        field2191 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLhi;)V")
    public static final void method888(byte arg0, class250 arg1) {
        class254.field4512 = class204.method1450(0, (byte) 47, class280.field4956, arg1);
        class195.field3586 = new class34[class254.field4512.length];
        field2185++;
        class108.field1956 = new class34[class254.field4512.length];
        class121.field2211 = new class34[class254.field4512.length];
        for (int var2 = 0; var2 < class254.field4512.length; var2++) {
            class254.field4512[var2].method215();
            class195.field3586[var2] = class254.field4512[var2].method213();
            class254.field4512[var2].method215();
            class108.field1956[var2] = class254.field4512[var2].method213();
            class254.field4512[var2].method215();
            class121.field2211[var2] = class254.field4512[var2].method213();
            class254.field4512[var2].method215();
        }
        class148.field2809 = class76.method496(class144.field2740, 0, arg1, (byte) 11);
        class73.field1279 = class199.method1426(class174.field3184, arg1, 0, -1);
        class130.field2340 = class199.method1426(class262.field4659, arg1, 0, -1);
        class31.field519 = class199.method1426(class268.field4742, arg1, 0, -1);
        int var3 = -69 % ((54 - arg0) / 33);
        class154.field2905 = class199.method1426(class123.field2220, arg1, 0, -1);
        class262.field4647 = class199.method1426(class250.field4460, arg1, 0, -1);
        class200.field3672 = class199.method1426(class237.field4243, arg1, 0, -1);
        class118.field2160 = class282.method1919(class147.field2782, arg1, 0, 0);
        class28.field471 = class86.method559(0, (byte) 121, arg1, class162.field3050);
        class72.field1258 = class86.method559(0, (byte) 66, arg1, class193.field3559);
        class151.field2858 = class111.method772(class265.field4705, (byte) -128, 0, arg1);
        class282.field4979 = class111.method772(class3.field70, (byte) -127, 0, arg1);
        class189.field3523.method1840(class282.field4979, (int[]) null);
        class205.field3743.method1840(class282.field4979, (int[]) null);
        class82.field1608.method1840(class282.field4979, (int[]) null);
        class101 var4 = class129.method919((byte) -126, 0, arg1, class182.field3344);
        var4.method697();
        class6.field142 = var4;
        class101[] var5 = class76.method496(class158.field2993, 0, arg1, (byte) 28);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method697();
        }
        class203.field3722 = var5;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class148.field2809.length; var11++) {
            class148.field2809[var11].method693(var7 + var10, var8 + var10, var9 + var10);
        }
        class254.field4512[0].method212(var7 + var10, var8 - -var10, var9 + var10);
        class37.field569 = class148.field2809;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static final void method889(byte arg0) {
        field2190++;
        int var1 = class210.field3841;
        if (arg0 != -114) {
            method886(-3, -61, 35, -85, 27, -118, -94);
        }
        int var2 = class70.field1226;
        int var3 = class266.field4715 - var2 - class148.field2796;
        int var4 = class201.field3680 - var1 - class204.field3738;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class144.field2746 != null) {
                var6 = class144.field2746;
            } else if (class131.field2357 == null) {
                var6 = class124.field2238.field3022;
            } else {
                var6 = class131.field2357;
            }
            int var7 = 0;
            if (class131.field2357 == var6) {
                Insets var8 = class131.field2357.getInsets();
                var7 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, class266.field4715);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class201.field3680, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class201.field3680 + var5 - var4, var7, var4, class266.field4715);
            }
            if (var3 > 0) {
                var9.fillRect(var5, class266.field4715 + var7 - var3, class201.field3680, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method890(int arg0, int arg1) {
        class56.field957 = arg0;
        field2188++;
        class242.field4323 = 50;
        if (arg1 != 25706) {
            field2184 = null;
        }
    }
}

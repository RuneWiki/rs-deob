import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class146 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Liu;")
    public static class390 field1891 = new class390(15, 2);

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "S")
    public static short field1892 = 256;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lgn;")
    public static class475 field1894;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
    public static int[] field1901;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    public static int[] field1897;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
    public static int[] field1898;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[I")
    public static int[] field1896;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
    public static int[] field1899;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "[I")
    public static int[] field1900;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1902;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lqg;")
    public static class307 field1893;

    static {
        new class194(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1894 = new class475(24, -1);
        field1895 = 50;
        field1901 = new int[field1895];
        field1897 = new int[field1895];
        field1898 = new int[field1895];
        field1896 = new int[field1895];
        field1899 = new int[field1895];
        field1900 = new int[field1895];
        field1902 = new String[field1895];
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIZII)V", line = 7)
    public static final void method909(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class217.field3043 != null && (arg0 != 3 || class118.field1533.field6893 != arg5 || class118.field1533.field6878 != arg2)) {
            class238.method1438(class217.field3043, class86.field1182, arg1 - 767);
            class217.field3043 = null;
        }
        field1890++;
        if (arg1 != 768) {
            method911(-90);
        }
        if (arg0 == 3 && class217.field3043 == null) {
            class217.field3043 = class253.method1583(0, class86.field1182, arg2, arg5, 0, (byte) 21);
            if (class217.field3043 != null) {
                class118.field1533.field6878 = arg2;
                class118.field1533.field6893 = arg5;
                class118.field1533.method2960(89, class86.field1182);
            }
        }
        if (arg0 == 3 && class217.field3043 == null) {
            method909(class118.field1533.field6877, arg1, -1, true, arg4, -1);
            return;
        }
        Container var7;
        if (class217.field3043 != null) {
            class380.field5667 = arg2;
            class452.field6577 = arg5;
            var7 = class217.field3043;
        } else if (class75.field1066 == null) {
            var7 = class86.field1182.field668;
            class452.field6577 = var7.getSize().width;
            class380.field5667 = var7.getSize().height;
        } else {
            Insets var6 = class75.field1066.getInsets();
            int var10001 = -var6.right;
            class452.field6577 = class75.field1066.getSize().width + var10001 - var6.left;
            int var12 = -var6.top;
            class380.field5667 = class75.field1066.getSize().height + var12 - var6.bottom;
            var7 = class75.field1066;
        }
        if (arg0 == 1) {
            class323.field4734 = 0;
            class223.field3156 = class427.field6289;
            class207.field2874 = class160.field2084;
            class103.field1387 = (class452.field6577 - class427.field6289) / 2;
        } else if (class315.field4620 < 96 && class293.field4174 == 0) {
            int var8 = class452.field6577 > 1024 ? 1024 : class452.field6577;
            class103.field1387 = (class452.field6577 - var8) / 2;
            int var9 = class380.field5667 <= 768 ? class380.field5667 : 768;
            class223.field3156 = var8;
            class207.field2874 = var9;
            class323.field4734 = 0;
        } else {
            class323.field4734 = 0;
            class223.field3156 = class452.field6577;
            class103.field1387 = 0;
            class207.field2874 = class380.field5667;
        }
        if (class371.field5567 != class339.field4941) {
            boolean var10000;
            if (class223.field3156 < 1024 && class207.field2874 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class86.method540((byte) -40);
        } else {
            class498.field7590.setSize(class223.field3156, class207.field2874);
            class481.field6937.method818(class498.field7590);
            if (class75.field1066 == var7) {
                Insets var10 = class75.field1066.getInsets();
                class498.field7590.setLocation(class103.field1387 + var10.left, class323.field4734 + var10.top);
            } else {
                class498.field7590.setLocation(class103.field1387, class323.field4734);
            }
        }
        if (arg0 >= 2) {
            class427.field6293 = true;
        } else {
            class427.field6293 = false;
        }
        if (class465.field6737 != -1) {
            class309.method1856(-113, true);
        }
        if (class22.field294 != null && (class323.field4729 == 30 || class323.field4729 == 25)) {
            class122.method694((byte) 101);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class61.field909[var11] = true;
        }
        class442.field6466 = true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 154)
    public static final void method910(int arg0) {
        class472.field6825 = class482.field6989.field7727 + class482.field6989.field7724 + 2;
        field1889++;
        class388.field5759 = new String[500];
        if (arg0 < -1) {
            class291.field4162 = class93.field1260.field7727 + class93.field1260.field7724 + 2;
            for (int var1 = 0; var1 < class388.field5759.length; var1++) {
                class388.field5759[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 177)
    public static void method911(int arg0) {
        field1902 = null;
        field1900 = null;
        field1899 = null;
        field1901 = null;
        field1894 = null;
        field1896 = null;
        field1893 = null;
        if (arg0 == 1024) {
            field1898 = null;
            field1897 = null;
            field1891 = null;
        }
    }
}

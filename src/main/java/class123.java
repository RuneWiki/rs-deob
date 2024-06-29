import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class123 extends Canvas {

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field2132;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[[B")
    public static byte[][] field2130 = new byte[250][];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lrb;")
    public static class213 field2137 = null;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[Z")
    public static boolean[] field2135 = new boolean[5];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lnb;")
    public static class304 field2139;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lo;Lvb;I)Lwe;", line = 7)
    public static final class47 method929(class199 arg0, class50 arg1, int arg2) {
        field2131++;
        long var3 = ((long) arg1.field957 << 56) + ((long) arg1.field960 << 32) + (long) ((arg1.field954 + 1 << 16) + arg1.field971);
        class47 var5 = (class47) arg0.method1405((byte) 115, var3);
        if (arg2 != -31339) {
            method932(false);
        }
        if (var5 == null) {
            var5 = new class47(arg1.field954, (float) arg1.field971, true, false, arg1.field960);
            arg0.method1396(-19928, var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 31)
    public final void paint(Graphics arg0) {
        field2128++;
        this.field2132.paint(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method930(boolean arg0) {
        if (!arg0) {
            method930(false);
        }
        int var1 = class95.field1715.method1466(-5582, 8);
        if (class159.field2663 > var1) {
            for (int var2 = var1; var2 < class159.field2663; var2++) {
                class275.field4568[class76.field1314++] = class212.field3390[var2];
            }
        }
        field2138++;
        if (var1 > class159.field2663) {
            throw new RuntimeException("gppov1");
        }
        class159.field2663 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class212.field3390[var3];
            class258 var5 = class298.field4979[var4];
            int var6 = class95.field1715.method1466(-5582, 1);
            if (var6 == 0) {
                class212.field3390[class159.field2663++] = var4;
                var5.field1509 = class256.field4266;
            } else {
                int var7 = class95.field1715.method1466(-5582, 2);
                if (var7 == 0) {
                    class212.field3390[class159.field2663++] = var4;
                    var5.field1509 = class256.field4266;
                    class301.field5048[class87.field1555++] = var4;
                } else if (var7 == 1) {
                    class212.field3390[class159.field2663++] = var4;
                    var5.field1509 = class256.field4266;
                    int var11 = class95.field1715.method1466(-5582, 3);
                    var5.method665(false, 7, var11);
                    int var12 = class95.field1715.method1466(-5582, 1);
                    if (var12 == 1) {
                        class301.field5048[class87.field1555++] = var4;
                    }
                } else if (var7 == 2) {
                    class212.field3390[class159.field2663++] = var4;
                    var5.field1509 = class256.field4266;
                    int var8 = class95.field1715.method1466(-5582, 3);
                    var5.method665(true, 7, var8);
                    int var9 = class95.field1715.method1466(-5582, 3);
                    var5.method665(true, 7, var9);
                    int var10 = class95.field1715.method1466(-5582, 1);
                    if (var10 == 1) {
                        class301.field5048[class87.field1555++] = var4;
                    }
                } else if (var7 == 3) {
                    class275.field4568[class76.field1314++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 151)
    public static void method931(int arg0) {
        field2139 = null;
        field2135 = null;
        field2130 = (byte[][]) null;
        field2137 = null;
        if (arg0 > -66) {
            method930(false);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 169)
    public class123(Component arg0) {
        this.field2132 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V", line = 179)
    public static final void method932(boolean arg0) {
        if (!arg0) {
            method930(true);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class255.field4252 - 1; var2++) {
                if (class288.field4832[var2] < 1000 && class288.field4832[var2 + 1] > 1000) {
                    var1 = false;
                    class40 var3 = class3.field37[var2];
                    class3.field37[var2] = class3.field37[var2 + 1];
                    class3.field37[var2 + 1] = var3;
                    class40 var4 = class246.field4079[var2];
                    class246.field4079[var2] = class246.field4079[var2 + 1];
                    class246.field4079[var2 + 1] = var4;
                    int var5 = class159.field2652[var2];
                    class159.field2652[var2] = class159.field2652[var2 + 1];
                    class159.field2652[var2 + 1] = var5;
                    int var6 = class197.field3169[var2];
                    class197.field3169[var2] = class197.field3169[var2 + 1];
                    class197.field3169[var2 + 1] = var6;
                    short var7 = class288.field4832[var2];
                    class288.field4832[var2] = class288.field4832[var2 + 1];
                    class288.field4832[var2 + 1] = var7;
                    long var8 = class50.field958[var2];
                    class50.field958[var2] = class50.field958[var2 + 1];
                    class50.field958[var2 + 1] = var8;
                }
            }
        }
        field2134++;
    }

    @OriginalMember(owner = "client!qa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 244)
    public final void update(Graphics arg0) {
        field2136++;
        this.field2132.update(arg0);
    }
}

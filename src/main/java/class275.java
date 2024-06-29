import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class275 extends class425 {

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4105 = new String[200];

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "Lsb;")
    public class266 field4108;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lqr;")
    public static class59 field4099;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "Lbw;")
    public class641 field4103;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method1795(int arg0) {
        if (arg0 != -9937) {
            this.field4102 = -10;
        }
        field4101++;
        if (class425.field6135.length > class304.field4514) {
            class425.field6135[class304.field4514++] = this;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1796(String arg0, boolean arg1) {
        field4100++;
        for (int var2 = 0; var2 < class37.field1051.length; var2++) {
            if (class37.field1051[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1) {
            method1798(-92);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Leq;")
    public static final class195 method1797(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5501;
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field4105 = null;
        field4099 = null;
        if (arg0 != 7818) {
            field4105 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "()V")
    public static final void method1799() {
        byte var0 = 10;
        byte var1 = 30;
        if (class330.field4825 == null) {
            return;
        }
        class521.field7381.method131(class679.field9632);
        for (int var2 = 0; var2 < class406.field5859.length; var2++) {
            class521.field7381.method1272((byte) 118, class457.field6507[var2] + class406.field5859[var2], class679.field9632[3] - class679.field9632[1], -256, class679.field9632[1]);
        }
        for (int var3 = 0; var3 < class389.field5685; var3++) {
            class185 var11 = class177.field2890[var3];
            class521.field7381.method178(var11.field2973[0], var11.field2977[0], var11.field2986[0], class312.field4635);
            class521.field7381.method178(var11.field2973[1], var11.field2977[1], var11.field2986[1], class103.field1841);
            class521.field7381.method178(var11.field2973[2], var11.field2977[2], var11.field2986[2], class118.field2092);
            class521.field7381.method178(var11.field2973[3], var11.field2977[3], var11.field2986[3], class343.field5110);
            if (class312.field4635[2] != -1 && class103.field1841[2] != -1 && class118.field2092[2] != -1 && class343.field5110[2] != -1) {
                int var12 = -65536;
                if (var11.field2981 == 4) {
                    var12 = -16776961;
                }
                class521.field7381.method1263(class103.field1841[0], 256, class103.field1841[1], class312.field4635[1], class312.field4635[0], var12);
                class521.field7381.method1263(class118.field2092[0], 256, class118.field2092[1], class103.field1841[1], class103.field1841[0], var12);
                class521.field7381.method1263(class343.field5110[0], 256, class343.field5110[1], class118.field2092[1], class118.field2092[0], var12);
                class521.field7381.method1263(class312.field4635[0], 256, class312.field4635[1], class343.field5110[1], class343.field5110[0], var12);
                class521.field7381.method1263(class118.field2092[0], 256, class118.field2092[1], class312.field4635[1], class312.field4635[0], var12);
            }
        }
        class330.field4825.method2558("Static Opaque: OW: " + class338.field5048[0] + "/" + class89.field1647[0] + " UW: " + class338.field5048[1] + "/" + class89.field1647[1], var1, -256, var0, (byte) -127, -16777216);
        class330.field4825.method2558("Static Trans: OW: " + class43.field1090[0] + "/" + class118.field2110[0] + " UW: " + class43.field1090[1] + "/" + class118.field2110[1], var1 + 15, -256, var0, (byte) -128, -16777216);
        class330.field4825.method2558("Static Anim: OW: " + class575.field8353[0] + "/" + class54.field1202[0] + " UW: " + class575.field8353[1] + "/" + class54.field1202[1], var1 + 30, -256, var0, (byte) -126, -16777216);
        class330.field4825.method2558("Dynamic: " + class200.field3106 + "/" + 5000, var1 + 45, -256, var0, (byte) 119, -16777216);
        class330.field4825.method2558("Total Opaque Onscreen: " + class265.field3939 + "/" + 10000, var1 + 60, -256, var0, (byte) 116, -16777216);
        class330.field4825.method2558("Total Trans Onscreen: " + class292.field4389 + "/" + 5000, var1 + 75, -256, var0, (byte) 17, -16777216);
        class330.field4825.method2558("Occluders: " + (class695.field9792 + class254.field3771) + " Active: " + class389.field5685, var1 + 90, -256, var0, (byte) 12, -16777216);
        class330.field4825.method2558("Occluded: Ground:" + class363.field5390 + " Walls: " + class448.field6453 + " CPs: " + class518.field7310 + " Pixels: " + class481.field6911, var1 + 105, -256, var0, (byte) 101, -16777216);
        class330.field4825.method2558("Occlude Calc Took: " + class597.field8567 / 1000L + "us", var1 + 120, -256, var0, (byte) 121, -16777216);
        if (class122.field2228 == null) {
            return;
        }
        for (int var4 = 0; var4 < class122.field2228.length; var4++) {
            float var6 = (float) class122.field2228[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class122.field2228[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class702 var5 = class521.field7381.method54(class122.field2228, 0, class356.field5332, class356.field5332, class295.field4420);
        var5.method1743(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1800(byte[] arg0, byte arg1) {
        field4106++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 7 % ((arg1 + 3) / 40);
            byte[] var3 = new byte[arg0.length];
            class692.method3873(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }
}

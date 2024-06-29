import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends Canvas {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field2303;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lr;")
    public static class118 field2304 = class153.method1136(101, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lr;")
    private static class118 field2312 = class153.method1136(90, "yellow:");

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lr;")
    public static class118 field2306 = field2312;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lr;")
    public static class118 field2311 = field2312;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lvd;")
    public static class150 field2300;

    @OriginalMember(owner = "client!oc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2303.update(arg0);
        field2302++;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class100(Component arg0) {
        this.field2303 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2303.paint(arg0);
        field2301++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method772(int arg0) {
        field2309++;
        int var1 = class138.field3157;
        int var2 = class89.field2141;
        int var3 = 6116423;
        int var4 = class151.field3418;
        int var5 = class71.field1651;
        class52.method473(var1, var2, var4, var5, var3);
        class52.method473(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class52.method478(arg0 + var1, var2 + 18, var4 - 2, var5 + -19, 0);
        class115.field2699.method47(class53.field1266, var1 + 3, var2 + 14, var3, -1);
        int var6 = class33.field827;
        int var7 = class44.field1049;
        for (int var8 = 0; var8 < class39.field950; var8++) {
            int var9 = (class39.field950 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var4 > var6 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class115.field2699.method47(class95.method747((byte) -124, var8), var1 + 3, var9, var10, 0);
        }
        class60.method534((byte) -19, class89.field2141, class71.field1651, class138.field3157, class151.field3418);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILff;IZI)V")
    public static final void method773(int arg0, int arg1, class42 arg2, int arg3, boolean arg4, int arg5) {
        class87.field2116 = arg5;
        class65.field1486 = 1;
        field2307++;
        class118.field2767 = 10000;
        class106.field2463 = arg4;
        class69.field1593 = arg1;
        class140.field3180 = arg0;
        class112.field2615 = arg2;
        if (arg3 != 6116423) {
            method772(-56);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method774(byte arg0) {
        field2300 = null;
        int var1 = 97 / ((1 - arg0) / 52);
        field2304 = null;
        field2312 = null;
        field2311 = null;
        field2306 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class143 extends class119 {

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field2258;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[C")
    public static char[] field2257 = new char[128];

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
    public static boolean field2259 = false;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "[Loq;")
    public static class199[] field2261 = new class199[6];

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Lne;")
    public static class172 field2262 = null;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2260 = "yellow:";

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method863(byte arg0) {
        field2265++;
        int var2 = -47 % ((arg0 + 39) / 41);
        return this.field2258;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lvh;Ljava/lang/Object;)V")
    public class143(class200 arg0, Object arg1) {
        super(arg0);
        this.field2258 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
    public static final void method1042(byte arg0, int arg1) {
        field2264++;
        int var2 = class183.field2987 - class138.field2156;
        if (var2 >= 100) {
            class13.field194 = 1;
            return;
        }
        int var3 = (int) class316.field4958;
        if (var3 < (class160.field2532 >> 8)) {
            var3 = class160.field2532 >> 8;
        }
        if (class8.field107[4] && var3 < class343.field5290[4] + 128) {
            var3 = class343.field5290[4] + 128;
        }
        int var4 = (int) class329.field5153 + class201.field3227 & 0x3FFF;
        class269.method1825((var3 >> 3) * 3 + 600, var3, class58.method386(class266.field4286, (byte) -119, class261.field4201.field724, class261.field4201.field722) - 50, class163.field2551, arg1, class217.field3555, var4, true);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class427.field6301 = (int) ((float) (class427.field6301 - class222.field3689) * var5 + (float) class222.field3689);
        class290.field4631 = (int) ((float) (class290.field4631 - class234.field3917) * var5 + (float) class234.field3917);
        class396.field5928 = (int) ((float) (class396.field5928 - class40.field503) * var5 + (float) class40.field503);
        class379.field5733 = (int) ((float) (class379.field5733 - class150.field2345) * var5 + (float) class150.field2345);
        int var6 = class108.field1516 - class346.field5332;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class108.field1516 = (int) ((float) var6 * var5 + (float) class346.field5332);
        if (arg0 != -81) {
            field2262 = null;
        }
        class108.field1516 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)Z")
    public final boolean method858(byte arg0) {
        if (arg0 != -18) {
            field2257 = null;
        }
        field2256++;
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
    public static final void method1043(int arg0) {
        class52 var1 = class270.field4326;
        synchronized (class270.field4326) {
            class270.field4326.method336(102);
        }
        field2263++;
        class52 var2 = class130.field2044;
        synchronized (class130.field2044) {
            class130.field2044.method336(105);
            if (arg0 != -50) {
                field2259 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)V")
    public static void method1044(boolean arg0) {
        field2262 = null;
        field2260 = null;
        if (arg0) {
            method1043(37);
        }
        field2257 = null;
        field2261 = null;
    }
}

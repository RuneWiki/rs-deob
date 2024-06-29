import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class227 extends class166 {

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field3264;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "Lic;")
    public static class329 field3259 = new class329(512);

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field3268 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "[I")
    public static int[] field3261;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 5)
    public static void method1634(int arg0) {
        if (arg0 == 0) {
            field3259 = null;
            field3261 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lfh;I)I", line = 16)
    public static final int method1635(class140 arg0, int arg1) {
        field3265++;
        int var2 = arg1;
        if (arg0.method1076(class304.field4451, 100)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1076(class32.field382, arg1 ^ 0x3C)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z", line = 44)
    public final boolean method1240(int arg0) {
        field3266++;
        return arg0 != -1249071392;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 55)
    public final Object method1239(boolean arg0) {
        if (arg0) {
            method1636(-89);
        }
        field3262++;
        return this.field3264;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 71)
    public class227(Object arg0) {
        this.field3264 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V", line = 84)
    public static final void method1636(int arg0) {
        class142.method1097(-127, class33.field410);
        field3263++;
        class133.field1809++;
        if (class126.field1683 && class75.field988) {
            int var1 = class105.field1361;
            int var2 = var1 - class160.field2290;
            if (var2 < class95.field1244) {
                var2 = class95.field1244;
            }
            if ((class33.field410.field5056 + var2) > (class95.field1244 + class100.field1311.field5056)) {
                var2 = class95.field1244 + class100.field1311.field5056 - class33.field410.field5056;
            }
            int var3 = class80.field1028;
            int var4 = var3 - client.field1638;
            if (class210.field2980 > var4) {
                var4 = class210.field2980;
            }
            int var5 = var2 - class262.field3802;
            if ((class33.field410.field5172 + var4) > (class210.field2980 + class100.field1311.field5172)) {
                var4 = class210.field2980 + class100.field1311.field5172 - class33.field410.field5172;
            }
            int var6 = var4 - class306.field4488;
            int var7 = class33.field410.field5071;
            if (class133.field1809 > class33.field410.field5179 && (var5 > var7 || var5 < (-var7) || var6 > var7 || var6 < -var7)) {
                class106.field1377 = true;
            }
            int var8 = var2 + class100.field1311.field5136 - class95.field1244;
            int var9 = var4 + class100.field1311.field5134 - class210.field2980;
            if (class33.field410.field5068 != null && class106.field1377) {
                class135 var10 = new class135();
                var10.field1839 = var9;
                var10.field1831 = class33.field410;
                var10.field1843 = var8;
                var10.field1836 = class33.field410.field5068;
                class276.method1869(true, var10);
            }
            if (class42.field521 == 0) {
                if (class106.field1377) {
                    if (class33.field410.field5055 != null) {
                        class135 var11 = new class135();
                        var11.field1829 = class219.field3083;
                        var11.field1831 = class33.field410;
                        var11.field1843 = var8;
                        var11.field1839 = var9;
                        var11.field1836 = class33.field410.field5055;
                        class276.method1869(true, var11);
                    }
                    if (class219.field3083 != null && client.method896(class33.field410) != null) {
                        class204.field2838++;
                        class251.field3681.method1309(23, 0);
                        class251.field3681.method2091((byte) 93, class33.field410.field5109);
                        class251.field3681.method2051((byte) 21, class219.field3083.field5109);
                        class251.field3681.method2081(-2076007248, class219.field3083.field5199);
                        class251.field3681.method2103(class33.field410.field5199, (byte) -124);
                    }
                } else if ((class233.field3342 == 1 || class226.method1633(arg0 ^ 0xFFFFFFFE, class66.field853 - 1)) && class66.field853 > 2) {
                    class191.method1389((byte) 103);
                } else if (class66.field853 > 0) {
                    class80.method564((byte) -99);
                }
                class33.field410 = null;
            }
            if (arg0 != -2) {
                field3258 = 24;
            }
        } else if (class133.field1809 > 1) {
            class33.field410 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class418 {

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6098 = 0;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "[I")
    public static int[] field6101 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "[I")
    public static int[] field6099;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
    public final int method2519(int arg0) {
        if (arg0 != 18) {
            this.field6100 = 115;
        }
        field6096++;
        return this.field6100;
    }

    @OriginalMember(owner = "client!rca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6102++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lr;I)V")
    public static final void method2520(class166 arg0, int arg1) {
        field6097++;
        int var2 = class352.field5079;
        int var3 = class101.field1573;
        int var4 = class70.field1246;
        int var5 = class450.field6490;
        int var6 = -10660793;
        arg0.method1150(var4, var3, var2, -1, var6, var5);
        arg0.method1150(var4 - 2, var3 + 1, var2 + 1, -1, -16777216, 16);
        arg0.method1149(var4 - 2, -4, -16777216, var3 + 18, var5 + -19, var2 + 1);
        class26.field391.method2492(var6, class274.field4140.method1804(arg1 + 9952, class512.field7203), var2 + 3, -1, (byte) -121, var3 + 14);
        int var7 = class508.field7171.method2090(-7249);
        int var8 = class508.field7171.method2093(22302);
        int var9 = 0;
        class279 var10 = (class279) class663.field9367.method472((byte) -88);
        if (arg1 != -2777) {
            method2520(null, -110);
        }
        while (var10 != null) {
            int var11 = (class340.field5002 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3 && var10.field4214) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class488.method2833(var10.field4213, (byte) 110)) {
                var13 = class41.field682.method2228((int) var10.field4208, 0).field2687;
            } else if (var10.field4221 != -1) {
                var13 = class41.field682.method2228(var10.field4221, 0).field2687;
            } else if (class656.method3612(var10.field4213, (byte) -114)) {
                class16 var16 = (class16) class189.field2723.method1405((long) ((int) var10.field4208), (byte) -69);
                if (var16 != null) {
                    class577 var17 = var16.field174;
                    class592 var18 = var17.field8121;
                    if (var18.field8315 != null) {
                        var18 = var18.method3356(arg1 ^ 0xFFFFF568, class61.field1163);
                    }
                    if (var18 != null) {
                        var13 = var18.field8288;
                    }
                }
            } else if (class15.method90((byte) -109, var10.field4213)) {
                Object var14 = null;
                class550 var15;
                if (var10.field4213 == 1001) {
                    var15 = class101.field1572.method2617((byte) -94, (int) var10.field4208);
                } else {
                    var15 = class101.field1572.method2617((byte) -127, (int) (var10.field4208 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field7781 != null) {
                    var15 = var15.method3124((byte) -83, class61.field1163);
                }
                if (var15 != null) {
                    var13 = var15.field7764;
                }
            }
            String var19 = class666.method3680(false, var10);
            if (var13 != null) {
                var19 = var19 + class56.method614(var13, arg1 ^ 0xFFFFF527);
            }
            class26.field391.method2490(var2 + 3, 0, var19, var12, var11, class165.field2372, (byte) 102, class210.field2948);
            if (var10.field4212) {
                class143.field2110.method3916(var2 + class467.field6721.method1039(0, var19) + 5, var11 + -12);
            }
            var9++;
            var10 = (class279) class663.field9367.method482(-30);
        }
        class236.method1614(class450.field6490, 107, class101.field1573, class352.field5079, class70.field1246);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class418(String arg0, int arg1) {
        this.field6100 = arg1;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static void method2521(byte arg0) {
        field6099 = null;
        field6101 = null;
        if (arg0 != -2) {
            field6099 = null;
        }
    }
}

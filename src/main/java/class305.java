import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class305 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field5137 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lbd;")
    public static class162 field5139 = class17.method142(0, "ul");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static volatile int field5141 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lbd;")
    public static class162 field5145 = class17.method142(0, "::qa_op_test");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Ldc;")
    public static class71 field5140;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2077(int arg0) {
        field5136++;
        if (class115.field2041 != null || class17.field284 != null || arg0 != 0) {
            return;
        }
        int var1 = class238.field3954;
        if (class32.field539) {
            if (var1 != 1) {
                int var2 = class109.field1961;
                int var3 = class274.field4554;
                if (class148.field2675 - 10 > var2 || class148.field2675 + class6.field58 + 10 < var2 || (class240.field3984 - 10) > var3 || var3 > class311.field5221 + class240.field3984 + 10) {
                    class32.field539 = false;
                    class222.method1608(class240.field3984, class311.field5221, 98, class6.field58, class148.field2675);
                }
            }
            if (var1 == 1) {
                int var4 = class148.field2675;
                int var5 = class6.field58;
                int var6 = class240.field3984;
                int var7 = class153.field2721;
                int var8 = class183.field3158;
                int var9 = -1;
                for (int var10 = 0; var10 < class293.field4931; var10++) {
                    int var11 = (class293.field4931 - (var10 + 1)) * 15 + var6 + 31;
                    if (var7 > var4 && (var4 + var5) > var7 && var8 > (var11 - 13) && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class213.method1556(var9, false);
                }
                class32.field539 = false;
                class222.method1608(class240.field3984, class311.field5221, 112, class6.field58, class148.field2675);
            }
            return;
        }
        if (var1 == 1 && class293.field4931 > 0) {
            short var12 = class105.field1911[class293.field4931 - 1];
            if (var12 == 6 || var12 == 7 || var12 == 28 || var12 == 37 || var12 == 25 || var12 == 19 || var12 == 57 || var12 == 59 || var12 == 51 || var12 == 47 || var12 == 15 || var12 == 1004) {
                int var13 = class126.field2292[class293.field4931 - 1];
                int var14 = class35.field589[class293.field4931 - 1];
                class78 var15 = class61.method419((byte) 28, var14);
                if (class119.method971(client.method861(var15), 118) || class142.method1110(client.method861(var15), true)) {
                    class64.field1008 = false;
                    class163.field2882 = 0;
                    if (class115.field2041 != null) {
                        class55.method386(0, class115.field2041);
                    }
                    class115.field2041 = class61.method419((byte) 28, var14);
                    class57.field886 = var13;
                    class203.field3430 = class153.field2721;
                    class167.field2946 = class183.field3158;
                    class55.method386(0, class115.field2041);
                    return;
                }
            }
        }
        if (var1 == 1 && (class207.field3495 == 1 && class293.field4931 > 2 || class153.method1198(class293.field4931 - 1, 2000))) {
            var1 = 2;
        }
        if (var1 == 2 && class293.field4931 > 0 || class29.field491 == 1) {
            class178.method1346((byte) -118);
        }
        if (var1 == 1 && class293.field4931 > 0 || class29.field491 == 2) {
            class289.method2002(arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILb;Z)Lbd;", line = 170)
    public static final class162 method2078(int arg0, class94 arg1, boolean arg2) {
        field5143++;
        try {
            class162 var3 = new class162();
            if (arg2) {
                return (class162) null;
            }
            var3.field2865 = arg1.method755((byte) -101);
            if (arg0 < var3.field2865) {
                var3.field2865 = arg0;
            }
            var3.field2817 = new byte[var3.field2865];
            arg1.field1653 += class94.field1702.method1516(var3.field2817, 0, (byte) 38, arg1.field1681, arg1.field1653, var3.field2865);
            return var3;
        } catch (Exception var5) {
            return class212.field3560;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 200)
    public static void method2079(int arg0) {
        field5140 = null;
        if (arg0 == 1024) {
            field5139 = null;
            field5145 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class56 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lb;")
    public static class94[] field877 = new class94[2048];

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lbd;")
    public static class162 field880 = class17.method142(0, " weitere Optionen");

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field881 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[I")
    public static int[] field878 = new int[128];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lbd;")
    private static class162 field883 = class17.method142(0, "Loaded input handler");

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lbd;")
    public static class162 field876 = field883;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 5)
    public static void method395(byte arg0) {
        if (arg0 >= -28) {
            method397((byte) -61, (class39) null);
        }
        field880 = null;
        field876 = null;
        field877 = null;
        field878 = null;
        field883 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Lfb;", line = 24)
    public static final class181 method396(int arg0, int arg1) {
        class181 var2 = (class181) class144.field2608.method1382((byte) -77, (long) arg0);
        field879++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1768.method1128(0, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class181 var4 = new class181();
        class94 var5 = new class94(var3);
        var5.field1653 = var5.field1681.length - 2;
        int var6 = var5.method761((byte) 108);
        if (arg1 != -1) {
            return (class181) null;
        }
        int var7 = var5.field1681.length - var6 - 2 - 12;
        var5.field1653 = var7;
        int var8 = var5.method747(false);
        var4.field3107 = var5.method761((byte) 108);
        var4.field3108 = var5.method761((byte) 108);
        var4.field3106 = var5.method761((byte) 108);
        var4.field3112 = var5.method761((byte) 108);
        int var9 = var5.method756(arg1 ^ 0xC968629F);
        if (var9 > 0) {
            var4.field3121 = new class235[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method761((byte) 108);
                class235 var12 = new class235(class237.method1678(var11, arg1 - 31980));
                var4.field3121[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method747(false);
                    int var14 = var5.method747(false);
                    var12.method1674(new class188(var14), false, (long) var13);
                }
            }
        }
        int var15 = 0;
        var5.field1653 = 0;
        var4.field3117 = var5.method762((byte) -28);
        var4.field3114 = new int[var8];
        var4.field3113 = new class162[var8];
        var4.field3115 = new int[var8];
        while (var5.field1653 < var7) {
            int var16 = var5.method761((byte) 108);
            if (var16 == 3) {
                var4.field3113[var15] = var5.method744((byte) 96);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3114[var15] = var5.method756(class110.method887(arg1, -915905889));
            } else {
                var4.field3114[var15] = var5.method747(false);
            }
            var4.field3115[var15++] = var16;
        }
        class144.field2608.method1386(var4, -66, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLdj;)V", line = 116)
    public static final void method397(byte arg0, class39 arg1) {
        field884++;
        if (arg0 >= -120) {
            method396(61, -51);
        }
        class64 var2 = (class64) class51.field811.method1672(arg1.field611.method1256(0), 19760);
        if (var2 == null) {
            class68.method486(arg1.field5034[0], -121, 0, (class311) null, arg1, class157.field2765, (class60) null, arg1.field5050[0]);
        } else {
            var2.method442((byte) -119);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 165)
    public static final void method398(byte arg0) {
        field882++;
        class88.field1578++;
        class187.field3229.method338(13, (byte) 8);
        class172 var1 = (class172) class137.field2440.method1666((byte) 67);
        int var2 = 31 / ((arg0 + 43) / 32);
        while (var1 != null) {
            if (var1.field2987 == 0) {
                class178.method1349(true, true, var1);
            }
            var1 = (class172) class137.field2440.method1673((byte) -127);
        }
        if (class243.field4040 != null) {
            class55.method386(0, class243.field4040);
            class243.field4040 = null;
        }
    }
}

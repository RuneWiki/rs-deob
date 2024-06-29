import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class425 extends class28 {

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljj;")
    public static class398 field5907 = new class398(46, -1);

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "Z")
    public static boolean field5919 = false;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "Lcb;")
    public static class318 field5917 = new class318(2, 0);

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public int field5903;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public int field5904;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public int field5912;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public int field5915;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Lfca;")
    public class188 field5911;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "Lfca;")
    public class188 field5916;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Ljava/lang/String;")
    public String field5910;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Z")
    public boolean field5902;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field5913;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method2453(int arg0, int arg1, int arg2) {
        int var3 = -33 % ((arg0 - 17) / 43);
        field5914++;
        return class191.method1227(arg1, arg2, 88) & class419.method2436(arg1, 2048, arg2);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 23)
    public static void method2454(byte arg0) {
        field5907 = null;
        field5917 = null;
        if (arg0 != 106) {
            method2454((byte) 96);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 47)
    public static final void method2455(int arg0) {
        if (class283.field3826 < (float) arg0) {
            class283.field3826 = 1024.0F;
        }
        field5906++;
        while (class620.field8432 >= 16384.0F) {
            class620.field8432 -= 16384.0F;
        }
        if (class283.field3826 > 3072.0F) {
            class283.field3826 = 3072.0F;
        }
        while (class620.field8432 < 0.0F) {
            class620.field8432 += 16384.0F;
        }
        int var1 = class243.field3277 >> 9;
        int var2 = class397.field5667 >> 9;
        int var3 = class394.method2340(class243.field3277, -1, class432.field5993, class397.field5667);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class588.field8082 - 4 > var1 && class12.field113 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class432.field5993;
                    if (var7 < 3 && class313.method2026(var6, 3550, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class44.field571.field7065 != null && class44.field571.field7065[var7] != null) {
                        var8 = (class44.field571.field7065[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class397.field5666[var7].method150(var5, var6) - var3);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class90.field1109) {
            class90.field1109 += (var10 - class90.field1109) / 24;
        } else if (var10 < class90.field1109) {
            class90.field1109 += (var10 - class90.field1109) / 80;
        }
    }
}

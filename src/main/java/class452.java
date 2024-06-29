import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class452 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6583 = "Cancel";

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2813(boolean arg0) {
        field6583 = null;
        if (!arg0) {
            method2814(-128, -35);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V", line = 16)
    public static final void method2814(int arg0, int arg1) {
        field6584++;
        int var2 = class221.field3033 - class344.field5057;
        if (var2 >= 100) {
            class231.field3128 = 1;
            return;
        }
        int var3 = (int) class135.field1886;
        if (var3 < class51.field590 >> 8) {
            var3 = class51.field590 >> 8;
        }
        if (arg0 != -10335) {
            return;
        }
        if (class8.field105[4] && var3 < (class174.field2421[4] + 128)) {
            var3 = class174.field2421[4] + 128;
        }
        int var4 = (int) class276.field3893 + class266.field3721 & 0x3FFF;
        class96.method518(class10.field113, class372.method2335(class390.field5715.field1311, class410.field5931, (byte) 76, class390.field5715.field1304) - 50, (byte) -123, var4, (var3 >> 3) * 3 + 600, arg1, var3, class297.field4241);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class272.field3852 = (int) ((float) (class272.field3852 - class215.field2924) * var5 + (float) class215.field2924);
        class164.field2289 = (int) ((float) (class164.field2289 - class7.field84) * var5 + (float) class7.field84);
        class314.field4472 = (int) ((float) (class314.field4472 - class436.field6389) * var5 + (float) class436.field6389);
        class272.field3853 = (int) ((float) (class272.field3853 - class66.field742) * var5 + (float) class66.field742);
        int var6 = class77.field869 - class50.field574;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class77.field869 = (int) ((float) var6 * var5 + (float) class50.field574);
        class77.field869 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[[[Ldn;)V", line = 65)
    public static final void method2815(byte arg0, class302[][][] arg1) {
        if (arg0 < 30) {
            field6583 = null;
        }
        field6585++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class302[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class302 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4310 instanceof class265) {
                            ((class265) var6.field4310).method207((byte) 111);
                        }
                        if (var6.field4311 instanceof class265) {
                            ((class265) var6.field4311).method207((byte) 111);
                        }
                        if (var6.field4306 instanceof class265) {
                            ((class265) var6.field4306).method207((byte) 111);
                        }
                        if (var6.field4313 instanceof class265) {
                            ((class265) var6.field4313).method207((byte) 111);
                        }
                        if (var6.field4324 instanceof class265) {
                            ((class265) var6.field4324).method207((byte) 111);
                        }
                        for (class299 var7 = var6.field4308; var7 != null; var7 = var7.field4263) {
                            class113 var8 = var7.field4261;
                            if (var8 instanceof class265) {
                                ((class265) var8).method207((byte) 111);
                            }
                        }
                    }
                }
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class290 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    public static boolean field4193 = false;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static volatile int field4192 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1989(byte arg0) {
        field4195++;
        if (arg0 <= 34) {
            method1990((byte) 85);
        }
        int var1 = class277.field3972.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class277.field3972[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class328.field4789; var4++) {
                    if (class305.field4457[var2] == class198.field2782[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class198.field2782[class328.field4789] = class305.field4457[var2];
                    var3 = class328.field4789++;
                }
                class299 var5 = new class299(class277.field3972[var2]);
                int var6 = 0;
                while (class277.field3972[var2].length > var5.field4351 && var6 < 511 && class257.field3747 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2083((byte) -112);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F82) >> 7;
                    int var11 = (class305.field4457[var2] >> 8) * 64 + var10 - class331.field4867;
                    int var12 = var8 & 0x3F;
                    int var13 = (class305.field4457[var2] & 0xFF) * 64 + var12 - class355.field5556;
                    class157 var14 = class148.method1138(-3, var5.method2083((byte) -126));
                    if (class251.field3688[var7] == null && (var14.field2233 & 0x1) > 0 && class226.field3256 == var9 && var11 >= 0 && (var14.field2224 + var11) < 104 && var13 >= 0 && (var13 + var14.field2224) < 104) {
                        class251.field3688[var7] = new class169();
                        class169 var15 = class251.field3688[var7];
                        class305.field4455[class257.field3747++] = var7;
                        var15.field4875 = class313.field4603;
                        var15.method1250((byte) 90, var14);
                        var15.method2302(23751, var15.field2345.field2224);
                        var15.field4912 = var15.field4926 = class159.field2267[var15.field2345.field2176];
                        var15.field4903 = var15.field2345.field2197;
                        if (var15.field4903 == 0) {
                            var15.field4926 = 0;
                        }
                        var15.field4871 = var15.field2345.field2223;
                        var15.method2290((byte) 74, var13, var15.method1699(-1), var11, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Luj;", line = 207)
    public static final class158 method1990(byte arg0) {
        int var1 = class251.field3673[0] * class184.field2508[0];
        field4194++;
        if (arg0 != 104) {
            field4192 = 112;
        }
        byte[] var2 = class338.field5276[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class292.field4253[class335.method2339(var2[var4], 255)];
        }
        class158 var5;
        if (class47.field623) {
            var5 = new class361(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], var3);
        } else {
            var5 = new class11(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], var3);
        }
        class236.method1685(false);
        return var5;
    }
}

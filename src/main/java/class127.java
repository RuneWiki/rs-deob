import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class127 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1851 = "Loading - please wait.";

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public static int[] field1857 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lh;")
    public class111 field1849;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lwi;")
    public class234 field1847;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBIIIII)V", line = 7)
    public static final void method939(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -116) {
            field1857 = (int[]) null;
        }
        class230[] var7 = class351.field5417;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class230 var9 = var7[var8];
            if (var9 != null && var9.field3487 == 2) {
                class227.method1697(arg4 >> 1, var9.field3488 * 2, (var9.field3492 - class202.field2968 << 7) + var9.field3493, arg2 >> 1, arg0, arg3, (var9.field3481 - class272.field4123 << 7) + var9.field3479, -100);
                if (class145.field2096 > -1 && (class304.field4560 % 20) < 10) {
                    class92.field1282[var9.field3490].method642(class145.field2096 + arg5 - 12, class146.field2103 + arg6 + -28);
                }
            }
        }
        field1856++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 41)
    public static final void method940(byte arg0) {
        int var1 = class83.field1194.method1911(8, 16811);
        field1855++;
        if (class265.field4053 > var1) {
            for (int var2 = var1; var2 < class265.field4053; var2++) {
                class177.field2548[class22.field337++] = class227.field3426[var2];
            }
        }
        if (class265.field4053 < var1) {
            throw new RuntimeException("gppov1");
        }
        class265.field4053 = 0;
        int var3 = 0;
        int var4 = -7 % ((arg0 - 59) / 56);
        while (var3 < var1) {
            int var5 = class227.field3426[var3];
            class228 var6 = class343.field5312[var5];
            int var7 = class83.field1194.method1911(1, 16811);
            if (var7 == 0) {
                class227.field3426[class265.field4053++] = var5;
                var6.field5153 = class304.field4560;
            } else {
                int var8 = class83.field1194.method1911(2, 16811);
                if (var8 == 0) {
                    class227.field3426[class265.field4053++] = var5;
                    var6.field5153 = class304.field4560;
                    class5.field125[class95.field1336++] = var5;
                } else if (var8 == 1) {
                    class227.field3426[class265.field4053++] = var5;
                    var6.field5153 = class304.field4560;
                    int var9 = class83.field1194.method1911(3, 16811);
                    var6.method2342(1, var9, false);
                    int var10 = class83.field1194.method1911(1, 16811);
                    if (var10 == 1) {
                        class5.field125[class95.field1336++] = var5;
                    }
                } else if (var8 == 2) {
                    class227.field3426[class265.field4053++] = var5;
                    var6.field5153 = class304.field4560;
                    if (class83.field1194.method1911(1, 16811) == 1) {
                        int var12 = class83.field1194.method1911(3, 16811);
                        var6.method2342(2, var12, false);
                        int var13 = class83.field1194.method1911(3, 16811);
                        var6.method2342(2, var13, false);
                    } else {
                        int var11 = class83.field1194.method1911(3, 16811);
                        var6.method2342(0, var11, false);
                    }
                    int var14 = class83.field1194.method1911(1, 16811);
                    if (var14 == 1) {
                        class5.field125[class95.field1336++] = var5;
                    }
                } else if (var8 == 3) {
                    class177.field2548[class22.field337++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V", line = 155)
    public static final void method941(int arg0, int arg1, int arg2, int arg3) {
        field1848++;
        class95 var4 = class227.method1699(11, -1855723168, arg1);
        var4.method738((byte) -128);
        var4.field1328 = arg2;
        var4.field1331 = arg3;
        if (arg0 >= -70) {
            field1851 = (String) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[F)[F", line = 177)
    public static final float[] method942(int arg0, float[] arg1) {
        if (arg0 < 62) {
            return (float[]) null;
        }
        field1858++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class84.method691(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 198)
    public static final int method943(byte arg0, Random arg1, int arg2) {
        field1854++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class338.method2377(arg2, 113)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else if (arg0 >= -73) {
            return 48;
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class77.method628(var4, true, arg2);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 228)
    public static void method944(byte arg0) {
        int var1 = -36 / ((arg0 - 65) / 55);
        field1851 = null;
        field1857 = null;
    }
}

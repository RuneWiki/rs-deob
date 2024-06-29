import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class117 extends class129 {

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Z")
    public static boolean field2157 = false;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "[I")
    public static int[] field2159 = new int[5];

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "Lrd;")
    public static class173 field2169 = class133.method843("Hidden)2", 110);

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lrd;")
    public static class173 field2163 = class133.method843("<br>", -126);

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Lrd;")
    private static class173 field2171 = class133.method843("No response from server)3", 28);

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Lrd;")
    public static class173 field2170 = field2171;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Lbc;")
    public static class14 field2177;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lqf;")
    public class165 field2155;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lqf;")
    public class165 field2156;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "Lrd;")
    public class173 field2167;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "[Ljava/lang/Object;")
    public Object[] field2174;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static final void method709(byte arg0) {
        field2162++;
        int var1 = class70.field1358.method1029(8, 0);
        if (var1 < class18.field378) {
            for (int var2 = var1; var2 < class18.field378; var2++) {
                class40.field819[class45.field920++] = class189.field3703[var2];
            }
        }
        if (class18.field378 < var1) {
            throw new RuntimeException("gppov1");
        }
        if (arg0 != -7) {
            field2171 = null;
        }
        class18.field378 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class189.field3703[var3];
            class212 var5 = class183.field3600[var4];
            int var6 = class70.field1358.method1029(1, 0);
            if (var6 == 0) {
                class189.field3703[class18.field378++] = var4;
                var5.field2800 = class217.field4203;
            } else {
                int var7 = class70.field1358.method1029(2, arg0 ^ 0xFFFFFFF9);
                if (var7 == 0) {
                    class189.field3703[class18.field378++] = var4;
                    var5.field2800 = class217.field4203;
                    class4.field97[class36.field783++] = var4;
                } else if (var7 == 1) {
                    class189.field3703[class18.field378++] = var4;
                    var5.field2800 = class217.field4203;
                    int var8 = class70.field1358.method1029(3, 0);
                    var5.method975(-98, var8, false);
                    int var9 = class70.field1358.method1029(1, 0);
                    if (var9 == 1) {
                        class4.field97[class36.field783++] = var4;
                    }
                } else if (var7 == 2) {
                    class189.field3703[class18.field378++] = var4;
                    var5.field2800 = class217.field4203;
                    int var10 = class70.field1358.method1029(3, 0);
                    var5.method975(-111, var10, true);
                    int var11 = class70.field1358.method1029(3, 0);
                    var5.method975(-124, var11, true);
                    int var12 = class70.field1358.method1029(1, arg0 ^ 0xFFFFFFF9);
                    if (var12 == 1) {
                        class4.field97[class36.field783++] = var4;
                    }
                } else if (var7 == 3) {
                    class40.field819[class45.field920++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILqf;)V")
    public static final void method710(int arg0, int arg1, int arg2, class165 arg3) {
        field2164++;
        if (class64.field1256 != 0 && class64.field1256 != 3) {
            return;
        }
        int var4 = arg2 - arg3.field3105 / 2;
        int var5 = arg1 - arg3.field3156 / 2;
        int var6 = class140.field2620 + class140.field2614 & 0x7FF;
        if (arg0 != -1107721013) {
            return;
        }
        int var7 = class72.field1396[var6];
        int var8 = class72.field1404[var6];
        int var9 = (class167.field3225 + 256) * var8 >> 8;
        int var10 = (class167.field3225 + 256) * var7 >> 8;
        int var11 = var4 * var9 - var5 * var10 >> 11;
        int var12 = var4 * var10 + var5 * var9 >> 11;
        int var13 = class175.field3447.field2820 + var12 >> 7;
        int var14 = class175.field3447.field2801 - var11 >> 7;
        boolean var15 = class30.method233(0, var14, class175.field3447.field2814[0], var13, true, 1, 0, 0, class175.field3447.field2764[0], (byte) -2, 0, 0);
        if (!var15) {
            return;
        }
        class165.field3175.method752(var5, (byte) -128);
        class165.field3175.method752(var4, (byte) -128);
        class165.field3175.method736(class140.field2614, -118);
        class165.field3175.method752(57, (byte) -128);
        class165.field3175.method752(class140.field2620, (byte) -128);
        class165.field3175.method752(class167.field3225, (byte) -128);
        class165.field3175.method752(89, (byte) -128);
        class165.field3175.method736(class175.field3447.field2820, arg0 ^ 0x42067B45);
        class165.field3175.method736(class175.field3447.field2801, -98);
        class165.field3175.method752(class129.field2445, (byte) -128);
        class165.field3175.method752(63, (byte) -128);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Z")
    public static final boolean method711(byte arg0, int arg1) {
        if (arg0 != 71) {
            field2173 = 85;
        }
        field2175++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static void method712(int arg0) {
        field2170 = null;
        field2177 = null;
        field2171 = null;
        field2159 = null;
        field2169 = null;
        if (arg0 < -98) {
            field2163 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILbc;Lrd;Lrd;)Lsa;")
    public static final class180 method713(int arg0, class14 arg1, class173 arg2, class173 arg3) {
        field2160++;
        int var4 = arg1.method135(arg2, 121);
        int var5 = arg1.method117(arg3, (byte) 112, var4);
        return arg0 == 21313 ? class56.method360(var5, var4, (byte) -93, arg1) : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
    public static final void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2166++;
        if (arg1 == arg5) {
            class19.method173(arg1, arg2, arg0, arg3, (byte) 91);
        } else if (arg4 == -19433) {
            if (arg0 - arg1 >= class194.field3778 && arg0 + arg1 <= class96.field1766 && class37.field790 <= arg2 - arg5 && arg2 + arg5 <= class20.field445) {
                class198.method1314(-1, arg5, arg1, arg0, arg3, arg2);
            } else {
                class205.method1361(arg3, arg0, -15367, arg2, arg5, arg1);
            }
        }
    }
}

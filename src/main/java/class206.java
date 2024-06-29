import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class206 extends class280 {

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    private final int field3289;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    private final int field3269;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    private final int field3282;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    private final int field3281;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private final int field3276;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private final int field3275;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private final int field3283;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private final int field3277;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[I")
    public static int[] field3279 = new int[1000];

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lck;")
    public static class119 field3267 = class298.method1987((byte) 110, "null");

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field3278 = 4;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    public static int[] field3273 = new int[field3278];

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "[[Lcd;")
    public static class169[][] field3287 = new class169[field3278][500];

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lvh;")
    public static class212 field3268 = new class212(8);

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Lck;")
    private static class119 field3291 = class298.method1987((byte) 19, "Attack");

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Lck;")
    public static class119 field3288 = field3291;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "Lck;")
    public static class119 field3290 = class298.method1987((byte) 54, "");

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[S")
    public static short[] field3274;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBLck;)V", line = 13)
    public static final void method1298(int arg0, byte arg1, class119 arg2) {
        field3286++;
        class119 var3 = arg2.method782(95).method785(arg1 ^ 0x0);
        if (arg1 != 56) {
            return;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class233.field3757; var5++) {
            class292 var6 = class23.field346[class226.field3609[var5]];
            if (var6 != null && var6.field4861 != null && var6.field4861.method793(var3, 40)) {
                class173.method1104(var6.field4973[0], false, 0, 1, 2, 0, class124.field1917.field4973[0], var6.field4963[0], 1, (byte) 9, class124.field1917.field4963[0], 0);
                var4 = true;
                if (arg0 == 1) {
                    class6.field149.method966(arg1 - 56, 255);
                    class181.field2874++;
                    class6.field149.method19((byte) 120, class226.field3609[var5]);
                } else if (arg0 == 4) {
                    class217.field3502++;
                    class6.field149.method966(0, 205);
                    class6.field149.method40(class226.field3609[var5], 87);
                } else if (arg0 == 6) {
                    class6.field149.method966(arg1 - 56, 46);
                    class240.field3844++;
                    class6.field149.method40(class226.field3609[var5], arg1 ^ 0xFFFFFF81);
                } else if (arg0 == 7) {
                    class55.field874++;
                    class6.field149.method966(0, 142);
                    class6.field149.method72(arg1 ^ 0x86E8E070, class226.field3609[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class54.method401((byte) -119, class170.method1074(new class119[] { class49.field753, var3 }, -118), 0, class203.field3220);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 79)
    public static void method1299(byte arg0) {
        field3267 = null;
        field3273 = null;
        field3268 = null;
        field3287 = (class169[][]) null;
        field3288 = null;
        int var1 = -36 % ((50 - arg0) / 53);
        field3279 = null;
        field3290 = null;
        field3274 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBI)V", line = 104)
    public final void method532(int arg0, byte arg1, int arg2) {
        field3285++;
        int var4 = this.field3281 * arg0 >> 12;
        int var5 = this.field3283 * arg0 >> 12;
        int var6 = this.field3277 * arg2 >> 12;
        int var7 = this.field3289 * arg2 >> 12;
        int var8 = this.field3282 * arg2 >> 12;
        int var9 = this.field3269 * arg2 >> 12;
        int var10 = this.field3275 * arg0 >> 12;
        if (arg1 < -71) {
            int var11 = this.field3276 * arg0 >> 12;
            class55.method412(var8, var10, this.field4635, (byte) 111, var4, var5, var9, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 136)
    public class206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3289 = arg2;
        this.field3269 = arg6;
        this.field3282 = arg4;
        this.field3281 = arg1;
        this.field3276 = arg7;
        this.field3275 = arg5;
        this.field3283 = arg3;
        this.field3277 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lck;I)V", line = 157)
    public static final void method1300(class119 arg0, int arg1) {
        field3272++;
        if (class19.field248 >= 2) {
            if (arg0.method793(class197.field3162, arg1 - 13737)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class54.method401((byte) -121, class170.method1074(new class119[] { class289.field4754, class234.method1506(var4, (byte) -79), class3.field65 }, -70), 0, (class119) null);
            }
            if (arg0.method793(class256.field4107, 40)) {
                System.out.println("oncard_geometry:" + class143.field2278);
                System.out.println("oncard_2d:" + class143.field2277);
                System.out.println("oncard_texture:" + class143.field2279);
            }
            if (arg0.method793(class76.field1184, 40)) {
                class88.method596(-24060);
            }
            if (arg0.method793(client.field1386, arg1 ^ 0x35F9)) {
                class204.method1289(-13, 25);
            }
            if (arg0.method793(class174.field2793, 40)) {
                class106.field1618 = true;
            }
            if (arg0.method793(class255.field4103, 40)) {
                class106.field1618 = false;
            }
            if (arg0.method793(class212.field3383, 40)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class217.field3510[var5].field4356[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method761(0, class108.field1642) && class289.field4744 != 0) {
                class104.method686((byte) -128, arg0.method769(-90, 6).method783((byte) 65));
            }
            if (arg0.method793(class44.field662, 40) && class289.field4744 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method761(0, class269.field4430)) {
                class256.field4108 = arg0.method769(-126, 12).method787((byte) 25).method783((byte) 65);
                class54.method401((byte) -116, class170.method1074(new class119[] { class131.field1998, class234.method1506(class256.field4108, (byte) -79) }, arg1 - 13883), 0, (class119) null);
            }
            if (arg0.method793(class163.field2573, 40)) {
                class106.field1626 = true;
            }
            if (arg0.method784(class247.field3991, 76)) {
                if (class182.field2880 == null) {
                    class210.method1316(1024, 768, 0);
                } else {
                    class135.method900(255);
                }
            }
        }
        if (arg1 == 13777) {
            class74.field1157++;
            class6.field149.method966(0, 235);
            class6.field149.method32(arg0.method776((byte) -125) - 1, (byte) -99);
            class6.field149.method61(false, arg0.method769(-63, 2));
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)V", line = 286)
    public final void method528(int arg0, int arg1, int arg2) {
        if (arg0 != 12623) {
            field3273 = (int[]) null;
        }
        field3280++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z", line = 297)
    public static final boolean method1301(int arg0, int arg1) {
        if (arg0 != 0) {
            field3290 = (class119) null;
        }
        field3284++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V", line = 308)
    public final void method530(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            field3267 = (class119) null;
        }
        field3271++;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class154 extends class289 {

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
    private int[] field2736 = new int[this.field4605];

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2738 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[Lwi;")
    public static class285[] field2747 = new class285[14];

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "[B")
    private byte[] field2744;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
    public static int[] field2746;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIBI)V", line = 5)
    public static final void method1232(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2739++;
        if (class43.field680) {
            class169.method1330(arg4, arg0, arg2 + arg4, arg0 - -arg1);
            class169.method1337(arg4, arg0, arg2, arg1, 0);
        } else {
            class47.method420(arg4, arg0, arg2 + arg4, arg0 + arg1);
            class47.method422(arg4, arg0, arg2, arg1, 0);
        }
        if (class114.field1915 < 100) {
            return;
        }
        if (class32.field460 == null || class32.field460.field2967 != arg2 || class32.field460.field2965 != arg1) {
            class309 var5 = new class309(arg2, arg1);
            class47.method407(var5.field4907, arg2, arg1);
            class15.method155(class304.field4825, (byte) -44, 0, class113.field1893, 0, 0, arg1, 0, arg2);
            if (class43.field680) {
                class32.field460 = new class157(var5);
            } else {
                class32.field460 = var5;
            }
            if (class43.field680) {
                class47.field725 = null;
            } else {
                class256.field4119.method1358(2);
            }
        }
        class32.field460.method1249(arg4, arg0);
        int var6 = class226.field3810 * arg2 / class113.field1893 + arg4;
        if (arg3 != -2) {
            field2738 = (String) null;
        }
        int var7 = class116.field2008 * arg2 / class113.field1893;
        int var8 = class109.field1857 * arg1 / class304.field4825;
        int var9 = class84.field1355 * arg1 / class304.field4825 + arg0;
        int var10 = 16711680;
        if (class72.field1199 == 1) {
            var10 = 16777215;
        }
        if (class43.field680) {
            class169.method1329(var6, var9, var7, var8, var10, 128);
            class169.method1325(var6, var9, var7, var8, var10);
        } else {
            class47.method417(var6, var9, var7, var8, var10, 128);
            class47.method416(var6, var9, var7, var8, var10);
        }
        if (class185.field3140 <= 0) {
            return;
        }
        int var11;
        if (class38.field567 <= 10) {
            var11 = class38.field567 * 25;
        } else {
            var11 = (20 - class38.field567) * 25;
        }
        for (class41 var12 = (class41) class185.field3138.method2297(14204); var12 != null; var12 = (class41) class185.field3138.method2291(arg3 ^ 0x57)) {
            if (class189.field3182 == var12.field607) {
                int var13 = arg4 + (var12.field613 * arg2 / class113.field1893);
                int var14 = var12.field609 * arg1 / class304.field4825 + arg0;
                if (class43.field680) {
                    class169.method1329(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class47.method417(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V", line = 104)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4605; var7++) {
            this.field2736[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 122)
    public static final String method1233(int arg0, boolean arg1, int arg2) {
        field2740++;
        if (arg1 && arg0 >= 0) {
            if (arg2 <= 125) {
                field2738 = (String) null;
            }
            return class219.method1613(10, arg1, 1024, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 137)
    public final void method1234(int arg0) {
        this.field2735 = Math.abs(this.field2735);
        field2734++;
        if (this.field2735 >= 4096) {
            this.field2735 = 4095;
        }
        this.method1235(this.field2737++, (byte) (this.field2735 >> 4));
        if (arg0 != 1740188684) {
            this.field2736 = (int[]) null;
        }
        this.field2735 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V", line = 159)
    public void method1235(int arg0, byte arg1) {
        field2743++;
        this.field2744[this.field2737++] = (byte) (class36.method319(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 170)
    public final void method1236(int arg0, int arg1, int arg2) {
        if (arg0 != 255) {
            this.field2735 = 70;
        }
        this.field2735 += this.field2736[arg1] * arg2 >> 12;
        field2742++;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 182)
    public final void method1237(int arg0) {
        this.field2735 = 0;
        if (arg0 != -25048) {
            this.field2737 = 123;
        }
        field2748++;
        this.field2737 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 195)
    public static final void method1238(int arg0) {
        if (class17.field284 == null || class209.field3548 == null) {
            class209.field3548 = new int[256];
            class17.field284 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class17.field284[var1] = (int) (Math.sin(var2) * 4096.0D);
                class209.field3548[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2741++;
        if (arg0 != 0) {
            method1239(-102);
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V", line = 230)
    public static void method1239(int arg0) {
        if (arg0 != 0) {
            method1238(73);
        }
        field2738 = null;
        field2747 = null;
        field2746 = null;
    }
}

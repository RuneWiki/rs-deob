import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class544 implements class95 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lwaa;")
    private class652 field7887 = new class652(128);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    private int[] field7892 = new int[class193.field2350.field1210];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    public int[] field7894 = new int[class193.field2350.field1210];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[Z")
    public static boolean[] field7889 = new boolean[8];

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
    public static long field7883;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)V")
    public final void method3183(boolean arg0, int arg1, int arg2) {
        field7886++;
        class617 var4 = class342.field4519.method2681(27020, arg2);
        int var5 = var4.field8859;
        if (!arg0) {
            this.field7887 = null;
        }
        int var6 = var4.field8854;
        int var7 = var4.field8858;
        int var8 = class400.field5650[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3188(this.field7894[var5] & ~var9 | var9 & arg1 << var6, -1, var5);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)I")
    public final int method731(int arg0, byte arg1) {
        int var3 = -91 % ((7 - arg1) / 52);
        field7898++;
        return this.field7894[arg0];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method3184(int arg0, String arg1, Throwable arg2) {
        field7896++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class399.method2412(arg2, 85);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class131.method885((byte) 90, var3);
            if (arg0 != 23383) {
                field7889 = null;
            }
            String var4 = class234.method1426(108, ":", var3, "%3a");
            String var5 = class234.method1426(-70, "@", var4, "%40");
            String var6 = class234.method1426(117, "&", var5, "%26");
            String var7 = class234.method1426(arg0 - 23478, "#", var6, "%23");
            if (class681.field9747 != null) {
                class477 var8 = class53.field849.method1508(new URL(class681.field9747.getCodeBase(), "clienterror.ws?c=" + class468.field6542 + "&u=" + class374.field5031 + "&v1=" + class248.field3402 + "&v2=" + class248.field3398 + "&e=" + var7), false);
                while (var8.field6693 == 0) {
                    class151.method974((byte) -102, 1L);
                }
                if (var8.field6693 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6695;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public final void method3185(int arg0, int arg1, int arg2) {
        field7884++;
        class617 var4 = class342.field4519.method2681(arg1 + 39784, arg2);
        int var5 = var4.field8859;
        int var6 = var4.field8854;
        if (arg1 != -12764) {
            field7883 = -44L;
        }
        int var7 = var4.field8858;
        int var8 = class400.field5650[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3190(-1, var9 & arg0 << var6 | this.field7892[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I")
    public final int method3186(boolean arg0, int arg1) {
        field7895++;
        long var3 = class301.method1787((byte) -71);
        class297 var5 = arg0 ? (class297) this.field7887.method3669((byte) 28) : (class297) this.field7887.method3676((byte) -12);
        if (arg1 != -1) {
            return 26;
        }
        while (var5 != null) {
            if ((var5.field3998 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field3998 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7519;
                    this.field7894[var6] = this.field7892[var6];
                    var5.method3045(true);
                    return var6;
                }
                var5.method3045(true);
            }
            var5 = (class297) this.field7887.method3676((byte) -12);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILdc;I)V")
    public static final void method3187(int arg0, class5 arg1, int arg2) {
        class677.field9699 = 0;
        class530.field7747 = false;
        if (arg0 != -5732) {
            return;
        }
        field7885++;
        class58.method589((byte) 101, arg1);
        class490.method2857(0, arg1);
        if (class530.field7747) {
            System.out.println("---endgpp---");
        }
        if (arg1.field5195 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field5195 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public final void method3188(int arg0, int arg1, int arg2) {
        field7888++;
        this.field7894[arg2] = arg0;
        class297 var4 = (class297) this.field7887.method3678((long) arg2, -123);
        if (arg1 != -1) {
            this.method3185(24, -119, 70);
        }
        if (var4 == null) {
            class297 var5 = new class297(class301.method1787((byte) 105) + 500L);
            this.field7887.method3670((long) arg2, var5, (byte) 127);
        } else {
            var4.field3998 = class301.method1787((byte) -106) + 500L;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method3189(boolean arg0) {
        if (!arg0) {
            field7889 = null;
        }
        field7889 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public final int method732(int arg0, int arg1) {
        field7897++;
        class617 var3 = class342.field4519.method2681(27020, arg1);
        if (arg0 < 82) {
            return 56;
        }
        int var4 = var3.field8859;
        int var5 = var3.field8854;
        int var6 = var3.field8858;
        int var7 = class400.field5650[var6 - var5];
        return var7 & this.field7894[var4] >> var5;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
    public final void method3190(int arg0, int arg1, int arg2) {
        field7890++;
        if (arg0 != -1) {
            return;
        }
        this.field7892[arg2] = arg1;
        class297 var4 = (class297) this.field7887.method3678((long) arg2, -120);
        if (var4 == null) {
            class297 var5 = new class297(4611686018427387905L);
            this.field7887.method3670((long) arg2, var5, (byte) 127);
        } else if (var4.field3998 != 4611686018427387905L) {
            var4.field3998 = class301.method1787((byte) 87) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public final void method3191(boolean arg0) {
        for (int var2 = 0; var2 < class193.field2350.field1210; var2++) {
            class490 var3 = class193.field2350.method691(16, var2);
            if (var3 != null && var3.field6847 == 0) {
                this.field7892[var2] = 0;
                this.field7894[var2] = 0;
            }
        }
        field7891++;
        this.field7887 = new class652(128);
        if (arg0) {
            this.method3190(91, -24, 25);
        }
    }
}

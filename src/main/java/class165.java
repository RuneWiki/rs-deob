import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class165 implements Runnable {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Laf;")
    private class181 field2944 = new class181();

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Z")
    private boolean field2956 = false;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field2954 = 0;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2952;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lce;")
    public static class126 field2937 = class206.method1445(-7923, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lce;")
    public static class126 field2948 = class206.method1445(-7923, "Choisir une option");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lce;")
    public static class126 field2947 = class206.method1445(-7923, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lcc;")
    public static class313 field2942;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)[Ljk;", line = 10)
    public static final class273[] method1208(byte arg0) {
        field2949++;
        class273[] var1 = new class273[class185.field3205];
        int var2 = 0;
        if (arg0 != -46) {
            method1208((byte) 62);
        }
        while (class185.field3205 > var2) {
            byte[] var3 = class190.field3255[var2];
            int var4 = class279.field4643[var2] * class263.field4389[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class241.field4062[class47.method289(255, var3[var6])];
            }
            if (class56.field846) {
                var1[var2] = new class198(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var5);
            } else {
                var1[var2] = new class184(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var5);
            }
            var2++;
        }
        class197.method1395((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Luk;I)V", line = 50)
    private final void method1209(class106 arg0, int arg1) {
        class181 var3 = this.field2944;
        synchronized (this.field2944) {
            if (arg1 != 2) {
                field2947 = (class126) null;
            }
            this.field2944.method1295(-113, arg0);
            this.field2954++;
            this.field2944.notifyAll();
        }
        field2938++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V", line = 75)
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2946++;
        int var8 = arg1 + arg4;
        int var9 = arg4 + arg7;
        for (int var10 = arg1; var10 < var8; var10++) {
            class94.method647(class314.field5393[var10], arg7, -7, arg5, arg0);
        }
        int var11 = arg5 - arg4;
        int var12 = arg6 - arg4;
        for (int var13 = arg6; var13 > var12; var13--) {
            class94.method647(class314.field5393[var13], arg7, -7, arg5, arg0);
        }
        int var14 = var8;
        int var15 = -81 % ((-arg2 - 2) / 56);
        while (var14 <= var12) {
            int[] var16 = class314.field5393[var14];
            class94.method647(var16, arg7, -7, var9, arg0);
            class94.method647(var16, var9, -7, var11, arg3);
            class94.method647(var16, var11, -7, arg5, arg0);
            var14++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwh;II)Luk;", line = 119)
    public final class106 method1211(class58 arg0, int arg1, int arg2) {
        field2941++;
        class106 var4 = new class106();
        var4.field1674 = 1;
        class181 var5 = this.field2944;
        synchronized (this.field2944) {
            if (arg2 <= 7) {
                return (class106) null;
            }
            class106 var6 = (class106) this.field2944.method1292(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field202 && var6.field1672 == arg0 && var6.field1674 == 2) {
                    var4.field1675 = var6.field1675;
                    var4.field176 = false;
                    return var4;
                }
                var6 = (class106) this.field2944.method1293(2);
            }
        }
        var4.field1675 = arg0.method402(115, arg1);
        var4.field170 = true;
        var4.field176 = false;
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BBLwh;I)Luk;", line = 158)
    public final class106 method1212(byte[] arg0, byte arg1, class58 arg2, int arg3) {
        field2936++;
        class106 var5 = new class106();
        var5.field1672 = arg2;
        var5.field170 = false;
        var5.field202 = (long) arg3;
        var5.field1674 = 2;
        var5.field1675 = arg0;
        if (arg1 != 53) {
            this.method1209((class106) null, 49);
        }
        this.method1209(var5, 2);
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 178)
    public static void method1213(int arg0) {
        field2947 = null;
        if (arg0 == 255) {
            field2948 = null;
            field2937 = null;
            field2942 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "run", descriptor = "()V", line = 197)
    public final void run() {
        field2955++;
        while (!this.field2956) {
            class181 var1 = this.field2944;
            class106 var2;
            synchronized (this.field2944) {
                var2 = (class106) this.field2944.method1296((byte) -89);
                if (var2 == null) {
                    try {
                        this.field2944.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2954--;
            }
            try {
                if (var2.field1674 == 2) {
                    var2.field1672.method400((int) var2.field202, -4, var2.field1675.length, var2.field1675);
                } else if (var2.field1674 == 3) {
                    var2.field1675 = var2.field1672.method402(113, (int) var2.field202);
                }
            } catch (Exception var6) {
                class54.method345((String) null, -48, var6);
            }
            var2.field176 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 240)
    public final void method1214(byte arg0) {
        field2950++;
        this.field2956 = true;
        class181 var2 = this.field2944;
        synchronized (this.field2944) {
            if (arg0 >= -21) {
                field2948 = (class126) null;
            }
            this.field2944.notifyAll();
        }
        try {
            this.field2952.join();
        } catch (InterruptedException var5) {
        }
        this.field2952 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILwh;I)Luk;", line = 260)
    public final class106 method1215(int arg0, class58 arg1, int arg2) {
        class106 var4 = new class106();
        var4.field1672 = arg1;
        field2943++;
        var4.field202 = (long) arg0;
        var4.field1674 = arg2;
        var4.field170 = false;
        this.method1209(var4, 2);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 279)
    public static final void method1216(int arg0, int arg1) {
        field2939++;
        if (arg0 != 1) {
            method1217(-60, -128, 3, -41);
        }
        class254.field4264.method1175(true, arg1);
        class197.field3369.method1175(true, arg1);
        class223.field3763.method1175(true, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V", line = 293)
    public static final void method1217(int arg0, int arg1, int arg2, int arg3) {
        class5 var4 = class297.field4940[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class107 var5 = var4.field49;
        if (var5 != null) {
            var5.field1679 = var5.field1679 * arg3 / 16;
            var5.field1695 = var5.field1695 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 327)
    public class165() {
        class60 var1 = class161.field2907.method1105(8, this, 5);
        while (var1.field965 == 0) {
            class313.method2158(10L, true);
        }
        if (var1.field965 == 2) {
            throw new RuntimeException();
        }
        this.field2952 = (Thread) var1.field967;
    }
}

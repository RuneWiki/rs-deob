import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 {

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lo;")
    public class97 field2336 = new class97();

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lwd;")
    private static class150 field2319 = class2.method9(true, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lwd;")
    public static class150 field2331 = field2319;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lwd;")
    public static class150 field2327 = class2.method9(true, "compass");

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Li;")
    public static class56 field2341 = new class56(50);

    @OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
    public static int[] field2345 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Lwd;")
    public static class150 field2344 = class2.method9(true, "backleft1");

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Lkc;")
    public static class72 field2343;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lo;")
    private class97 field2339;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public static int[] field2337;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[Lhb;")
    public static class51[] field2338;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method697(KeyEvent arg0, int arg1) {
        field2326++;
        int var2 = arg0.getKeyChar();
        if (arg1 == -257) {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lo;")
    public final class97 method698(int arg0) {
        class97 var2 = this.field2339;
        field2320++;
        if (this.field2336 == var2) {
            this.field2339 = null;
            return null;
        } else if (arg0 == -1610612736) {
            this.field2339 = var2.field2220;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)I")
    public static final int method699(byte arg0, int arg1, int arg2) {
        if (arg0 != -61) {
            method699((byte) -28, -42, 57);
        }
        class130 var3 = (class130) class126.field2920.method534((byte) -104, (long) arg1);
        field2324++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field3064.length) {
            return var3.field3064[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method700(int arg0) {
        field2343 = null;
        field2344 = null;
        field2341 = null;
        field2345 = null;
        field2337 = null;
        field2319 = null;
        field2327 = null;
        if (arg0 != 1404784871) {
            field2345 = null;
        }
        field2338 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public static final void method701(int arg0, int arg1, int arg2) {
        field2329++;
        class103 var3 = class50.field1339[class17.field466][arg0][arg1];
        if (var3 == null) {
            class111.field2548.method888(class17.field466, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class23 var5 = null;
        int var6 = 89 / ((27 - arg2) / 60);
        for (class23 var7 = (class23) var3.method702((byte) -120); var7 != null; var7 = (class23) var3.method698(-1610612736)) {
            class21 var12 = class4.method26((byte) 113, var7.field659);
            int var13 = var12.field554;
            if (var12.field566 == 1) {
                var13 = (var7.field661 + 1) * var13;
            }
            if (var13 > var4) {
                var4 = var13;
                var5 = var7;
            }
        }
        if (var5 == null) {
            class111.field2548.method888(class17.field466, arg0, arg1);
            return;
        }
        var3.method706(-15739, var5);
        class23 var8 = (class23) var3.method702((byte) -122);
        class23 var9 = null;
        class23 var10 = null;
        while (var8 != null) {
            if (var5.field659 != var8.field659) {
                if (var9 == null) {
                    var9 = var8;
                }
                if (var8.field659 != var9.field659 && var10 == null) {
                    var10 = var8;
                }
            }
            var8 = (class23) var3.method698(-1610612736);
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        class111.field2548.method905(class17.field466, arg0, arg1, class25.method205(arg0 * 128 + 64, class17.field466, -23287, arg1 * 128 + 64), var5, var11, var9, var10);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lo;")
    public final class97 method702(byte arg0) {
        field2340++;
        if (arg0 >= -117) {
            field2337 = null;
        }
        class97 var2 = this.field2336.field2220;
        if (this.field2336 == var2) {
            this.field2339 = null;
            return null;
        } else {
            this.field2339 = var2.field2220;
            return var2;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lo;")
    public final class97 method703(boolean arg0) {
        field2335++;
        if (arg0) {
            return null;
        }
        class97 var2 = this.field2336.field2234;
        if (this.field2336 == var2) {
            return null;
        } else {
            var2.method678((byte) -26);
            return var2;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Lp;")
    public static final class104 method704(int arg0) {
        if (arg0 != -99999999) {
            method704(-114);
        }
        field2318++;
        try {
            return (class104) Class.forName("q").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)Lo;")
    public final class97 method705(int arg0) {
        field2325++;
        class97 var2 = this.field2339;
        if (this.field2336 == var2) {
            this.field2339 = null;
            return null;
        } else if (arg0 == 18834) {
            this.field2339 = var2.field2234;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILo;)V")
    public final void method706(int arg0, class97 arg1) {
        if (arg1.field2234 != null) {
            arg1.method678((byte) -26);
        }
        if (arg0 != -15739) {
            this.field2336 = null;
        }
        arg1.field2220 = this.field2336.field2220;
        field2334++;
        arg1.field2234 = this.field2336;
        arg1.field2234.field2220 = arg1;
        arg1.field2220.field2234 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lo;ILo;)V")
    public final void method707(class97 arg0, int arg1, class97 arg2) {
        field2322++;
        if (arg0.field2234 != null) {
            arg0.method678((byte) -26);
        }
        arg0.field2220 = arg2;
        arg0.field2234 = arg2.field2234;
        arg0.field2234.field2220 = arg0;
        arg0.field2220.field2234 = arg0;
        if (arg1 != 32708) {
            field2344 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Lo;")
    public final class97 method708(int arg0) {
        field2321++;
        class97 var2 = this.field2336.field2220;
        if (this.field2336 == var2) {
            return null;
        }
        if (arg0 != 0) {
            field2344 = null;
        }
        var2.method678((byte) -26);
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public final void method709(int arg0) {
        if (arg0 != -15667) {
            this.method703(true);
        }
        field2332++;
        while (true) {
            class97 var2 = this.field2336.field2220;
            if (this.field2336 == var2) {
                return;
            }
            var2.method678((byte) -26);
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Lo;")
    public final class97 method710(int arg0) {
        class97 var2 = this.field2336.field2234;
        field2333++;
        if (arg0 != 128) {
            field2328 = 116;
        }
        if (this.field2336 == var2) {
            this.field2339 = null;
            return null;
        } else {
            this.field2339 = var2.field2234;
            return var2;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class103() {
        this.field2336.field2234 = this.field2336;
        this.field2336.field2220 = this.field2336;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lo;I)V")
    public final void method711(class97 arg0, int arg1) {
        if (arg1 != 0) {
            field2341 = null;
        }
        field2323++;
        if (arg0.field2234 != null) {
            arg0.method678((byte) -26);
        }
        arg0.field2234 = this.field2336.field2234;
        arg0.field2220 = this.field2336;
        arg0.field2234.field2220 = arg0;
        arg0.field2220.field2234 = arg0;
    }
}

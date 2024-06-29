import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class292 implements Runnable {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Z")
    public boolean field4528 = true;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field4529 = new Object();

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[I")
    public int[] field4535 = new int[500];

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
    public int[] field4533 = new int[500];

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public int field4538 = 0;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4531 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Z")
    public static boolean field4536 = true;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[Z")
    public static boolean[] field4537 = new boolean[112];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[[S")
    public static short[][] field4539 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[[[B")
    public static byte[][][] field4526;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static final void method1936(byte arg0) {
        if (class263.field4168 != null && (class263.field4168.field4725 - (class263.field4168.method1013(0) - 1) * 64 >> 7) == class305.field4895 && class263.field4168.field4709 - ((class263.field4168.method1013(0) - 1) * 64) >> 7 == class296.field4669) {
            class305.field4895 = 0;
        }
        field4534++;
        if (arg0 != -6) {
            return;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class184.field2909[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class259.field4112; var2++) {
            class136 var5 = class233.field3682[class26.field455[var2]];
            if (var5 != null) {
                var5.field4772 = false;
            }
        }
        for (int var3 = 0; var3 < class117.field1782; var3++) {
            class161 var4 = class116.field1781[class255.field4084[var3]];
            if (var4 != null) {
                var4.field4772 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
    public final void run() {
        field4527++;
        while (this.field4528) {
            Object var1 = this.field4529;
            synchronized (this.field4529) {
                if (this.field4538 < 500) {
                    this.field4533[this.field4538] = class171.field2587;
                    this.field4535[this.field4538] = class157.field2340;
                    this.field4538++;
                }
            }
            class122.method922(50L, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method1937(boolean arg0) {
        field4539 = null;
        if (!arg0) {
            field4526 = null;
            field4537 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I")
    public static final int method1938(boolean arg0, int arg1) {
        field4532++;
        return arg0 ? -113 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1939(long arg0, int arg1) {
        field4530++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg1 > -2) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class283.field4461[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}

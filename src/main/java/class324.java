import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class324 implements Runnable {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[Lbi;")
    public volatile class91[] field5060 = new class91[2];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
    public volatile boolean field5058 = false;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
    public volatile boolean field5057 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5056 = 0;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5066 = 0;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ltl;")
    public static class222 field5065 = new class222(64);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static volatile int field5067 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lkb;")
    public static class39 field5063;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lgn;")
    public class6 field5062;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method2256(boolean arg0) {
        class191.method1341(6255);
        class319.method2226(-121);
        class22.method143((byte) -87);
        field5064++;
        class131.method893(40);
        class194.method1429((byte) 90);
        class258.method1830(false);
        class19.method125(127);
        class136.method924(14591);
        class251.method1773(arg0);
        class155.method1080((byte) -101);
        class23.method147((byte) 114);
        class142.method984((byte) 76);
        class206.method1513(-51);
        class128.method882(91);
        class172.method1175(0);
        class158.method1091((byte) -114);
        class64.method430(arg0);
        class319.method2229(-10090);
        class258.method1827((byte) 18);
        class274.method1951(118);
        class187.field3040.method1615(124);
        client.field4218.method1615(123);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 39)
    public static void method2257(byte arg0) {
        if (arg0 == -105) {
            field5065 = null;
            field5063 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        field5061++;
        this.field5057 = true;
        try {
            while (!this.field5058) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class91 var2 = this.field5060[var1];
                    if (var2 != null) {
                        var2.method655((byte) -123);
                    }
                }
                class20.method128(0, 10L);
                class15.method95(this.field5062, (Object) null, (byte) -78);
            }
        } catch (Exception var7) {
            class314.method2186((String) null, 117, var7);
        } finally {
            this.field5057 = false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZ)V", line = 96)
    public static final void method2258(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class4.field43 = arg1;
        class64.field844 = arg2;
        class214.field3473 = arg3;
        class176.field2879 = new class230[arg0][class4.field43][class64.field844];
        class94.field1450 = new int[arg0][class4.field43 + 1][class64.field844 + 1];
        if (class186.field2991) {
            class60.field788 = new class83[4][];
        }
        if (arg4) {
            class339.field5270 = new class230[1][class4.field43][class64.field844];
            class310.field4846 = new int[class4.field43][class64.field844];
            class163.field2656 = new int[1][class4.field43 + 1][class64.field844 + 1];
            if (class186.field2991) {
                class157.field2421 = new class83[1][];
            }
        } else {
            class339.field5270 = (class230[][][]) null;
            class310.field4846 = (int[][]) null;
            class163.field2656 = (int[][][]) null;
            class157.field2421 = (class83[][]) null;
        }
        class225.method1646(false);
        class294.field4626 = new class157[500];
        class181.field2918 = 0;
        class295.field4629 = new class157[500];
        class183.field2958 = 0;
        class93.field1443 = new int[arg0][class4.field43 + 1][class64.field844 + 1];
        class240.field3822 = new class271[5000];
        class281.field4422 = 0;
        class145.field2165 = new class271[100];
        class197.field3221 = new boolean[class214.field3473 + class214.field3473 + 1][class214.field3473 + class214.field3473 + 1];
        class15.field182 = new boolean[class214.field3473 + class214.field3473 + 2][class214.field3473 + class214.field3473 + 2];
        class276.field4374 = new byte[arg0][class4.field43][class64.field844];
    }
}

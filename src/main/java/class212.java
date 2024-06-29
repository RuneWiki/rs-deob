import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class212 extends class175 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[J")
    private long[] field4094 = new long[10];

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    private int field4095 = 0;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    private int field4092 = 1;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    private int field4090 = 256;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "J")
    private long field4097 = class168.method1118(1);

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
    public static int[] field4100 = new int[50];

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[I")
    public static int[] field4099 = new int[1000];

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Loe;")
    public static class139 field4091 = new class139(64);

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljd;")
    public static class92 field4104 = class202.method1325((byte) 90, "leuchten3:");

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lbg;")
    public static class18 field4105 = new class18();

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "Z")
    public static boolean field4108 = true;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field4109 = 0;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    private int field4103;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "[Lrf;")
    public static class167[] field4106;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)I")
    public final int method328(boolean arg0, int arg1, int arg2) {
        field4096++;
        int var4 = this.field4090;
        int var5 = this.field4092;
        this.field4092 = 1;
        this.field4090 = 300;
        this.field4097 = class168.method1118(1);
        if (this.field4094[this.field4103] == 0L) {
            this.field4092 = var5;
            this.field4090 = var4;
        } else if (this.field4094[this.field4103] < this.field4097) {
            this.field4090 = (int) ((long) (arg2 * 2560) / (this.field4097 - this.field4094[this.field4103]));
        }
        if (this.field4090 < 25) {
            this.field4090 = 25;
        }
        if (this.field4090 > 256) {
            this.field4090 = 256;
            this.field4092 = (int) ((long) arg2 - (this.field4097 - this.field4094[this.field4103]) / 10L);
        }
        if (this.field4092 > arg2) {
            this.field4092 = arg2;
        }
        this.field4094[this.field4103] = this.field4097;
        if (!arg0) {
            return 91;
        }
        this.field4103 = (this.field4103 + 1) % 10;
        if (this.field4092 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4094[var6] != 0L) {
                    this.field4094[var6] += this.field4092;
                }
            }
        }
        if (arg1 > this.field4092) {
            this.field4092 = arg1;
        }
        class58.method357(-24534, (long) this.field4092);
        int var7 = 0;
        while (this.field4095 < 256) {
            var7++;
            this.field4095 += this.field4090;
        }
        this.field4095 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4098++;
        int var8 = -60 % ((8 - arg6) / 54);
        if (class188.method1210(-18040, arg5)) {
            class33.method212(-1, arg3, arg7, class60.field1256[arg5], arg1, arg2, arg4, arg0, 8);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1375(int arg0) {
        if (arg0 != 0) {
            field4091 = null;
        }
        field4091 = null;
        field4105 = null;
        field4104 = null;
        field4100 = null;
        field4099 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lca;IZIII)V")
    public static final void method1376(class22 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4093++;
        if (class64.field1308 >= 50 || (arg0.field536 == null || arg0.field536.length <= arg1)) {
            return;
        }
        int var6 = arg0.field536[arg1];
        if (var6 == 0) {
            return;
        }
        if (arg4 != 7330) {
            method1378(-102);
        }
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg2) {
                class100.method696(var8, var7, 0, arg4 ^ 0xFFFFA46B);
            }
        } else if (class136.field2730 != 0) {
            class55.field1137[class64.field1308] = var8;
            class75.field1568[class64.field1308] = var7;
            int var10 = (arg5 - 64) / 128;
            field4100[class64.field1308] = 0;
            int var11 = (arg3 - 64) / 128;
            class6.field292[class64.field1308] = null;
            class100.field2067[class64.field1308] = (var10 << 16) + (var11 << 8) + var9;
            class64.field1308++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)V")
    public static final void method1377(long arg0, int arg1) {
        field4102++;
        if (arg0 != 0L) {
            class99.field2000.method405(arg1, 7);
            class99.field2000.method459(false, arg0);
            class65.field1324++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public final void method329(int arg0) {
        int var2 = 0;
        if (arg0 != 32) {
            return;
        }
        while (var2 < 10) {
            this.field4094[var2] = 0L;
            var2++;
        }
        field4110++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static final void method1378(int arg0) {
        boolean var1 = false;
        field4101++;
        if (arg0 <= 101) {
            field4091 = null;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class3.field182 - 1; var2++) {
                if (class13.field383[var2] < 1000 && class13.field383[var2 + 1] > 1000) {
                    var1 = false;
                    class92 var3 = class189.field3604[var2];
                    class189.field3604[var2] = class189.field3604[var2 + 1];
                    class189.field3604[var2 + 1] = var3;
                    class92 var4 = class92.field1815[var2];
                    class92.field1815[var2] = class92.field1815[var2 + 1];
                    class92.field1815[var2 + 1] = var4;
                    int var5 = class186.field3520[var2];
                    class186.field3520[var2] = class186.field3520[var2 + 1];
                    class186.field3520[var2 + 1] = var5;
                    int var6 = class137.field2741[var2];
                    class137.field2741[var2] = class137.field2741[var2 + 1];
                    class137.field2741[var2 + 1] = var6;
                    short var7 = class13.field383[var2];
                    class13.field383[var2] = class13.field383[var2 + 1];
                    class13.field383[var2 + 1] = var7;
                    long var8 = class44.field990[var2];
                    class44.field990[var2] = class44.field990[var2 + 1];
                    class44.field990[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class212() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4094[var1] = this.field4097;
        }
    }
}

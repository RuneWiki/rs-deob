import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class203 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public volatile int field2802 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public volatile int field2799 = 0;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[Ljava/lang/Object;")
    public Object[] field2800 = new Object[5000];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field2808 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field2798 = 0;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[F")
    public float[] field2807 = new float[5000];

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[B")
    public byte[] field2805 = new byte[5000];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Ltr;")
    public static class173 field2801 = new class173();

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    public static int[] field2811 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZFIILda;)V")
    public abstract void method1282(boolean arg0, float arg1, int arg2, int arg3, class193 arg4);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILir;)V")
    public static final void method1344(int arg0, class185 arg1) {
        class432.field6276 = arg1;
        field2809++;
        if (arg0 != -2) {
            method1349((byte) 40);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public abstract void method1278(int arg0, int arg1);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ldh;I)V")
    public abstract void method1275(class77 arg0, int arg1);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLfb;)V")
    public static final void method1345(byte arg0, class341 arg1) {
        field2810++;
        if ((arg1.field5042.length - arg1.field5049) < 1) {
            return;
        }
        int var2 = arg1.method2233((byte) 104);
        if (var2 < 0 || var2 > 1 || (arg1.field5042.length - arg1.field5049) < 2) {
            return;
        }
        int var3 = 56 % ((arg0 + 6) / 43);
        int var4 = arg1.method2239(-1076227960);
        if ((var4 * 6) != (arg1.field5042.length - arg1.field5049)) {
            return;
        }
        while (true) {
            int var5;
            int var6;
            do {
                do {
                    do {
                        if (arg1.field5042.length <= arg1.field5049) {
                            return;
                        }
                        var5 = arg1.method2239(-1076227960);
                        var6 = arg1.method2232(98);
                    } while (var5 >= class216.field3014.length);
                } while (!class28.field476[var5]);
            } while (class334.method2185(6137, var5).field1426 == '1' && (var6 < -1 || var6 > 1));
            class216.field3014[var5] = var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLdh;)V")
    public abstract void method1277(byte arg0, class77 arg1);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method1346(int arg0, int arg1) {
        field2804++;
        if (arg1 > -56) {
            field2811 = null;
        }
        int var2 = class231.field3179 - class90.field1228;
        if (var2 >= 100) {
            class212.field2884 = 1;
            return;
        }
        int var3 = (int) class39.field588;
        if ((class391.field5710 >> 8) > var3) {
            var3 = class391.field5710 >> 8;
        }
        if (class403.field5875[4] && (class384.field5621[4] + 128) > var3) {
            var3 = class384.field5621[4] + 128;
        }
        int var4 = (int) class247.field3479 + class235.field3283 & 0x3FFF;
        class167.method1120(arg0, var3, (byte) -112, class248.method1621(class383.field5609.field5921, class383.field5609.field5930, -13853, class268.field3973) - 50, class159.field2065, var4, (var3 >> 3) * 3 + 600, class357.field5297);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class47.field716 = (int) ((float) (class47.field716 - class397.field5797) * var5 + (float) class397.field5797);
        class289.field4331 = (int) ((float) (class289.field4331 - class394.field5734) * var5 + (float) class394.field5734);
        class326.field4829 = (int) ((float) (class326.field4829 - class85.field1173) * var5 + (float) class85.field1173);
        class279.field4099 = (int) ((float) (class279.field4099 - class362.field5354) * var5 + (float) class362.field5354);
        int var6 = class7.field88 - class48.field721;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class7.field88 = (int) ((float) var6 * var5 + (float) class48.field721);
        class7.field88 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public abstract void method1279(int arg0);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZILir;Lir;)V")
    public static final void method1347(boolean arg0, int arg1, class185 arg2, class185 arg3) {
        class71.field1013 = arg0;
        if (arg1 == 1120) {
            class400.field5865 = arg3;
            field2806++;
            class1.field12 = arg2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
    public abstract void method1281(int arg0, int arg1);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1348(String arg0, int arg1) {
        field2803++;
        if (arg0 == null) {
            return;
        }
        String var2 = class350.method2310(arg0, (byte) 92);
        if (var2 == null) {
            return;
        }
        if (arg1 != 9241) {
            field2801 = null;
        }
        for (int var3 = 0; var3 < class391.field5714; var3++) {
            String var4 = class350.method2310(class30.field488[var3], (byte) 98);
            if (var4 != null && var4.equals(var2)) {
                class391.field5714--;
                for (int var5 = var3; var5 < class391.field5714; var5++) {
                    class30.field488[var5] = class30.field488[var5 + 1];
                    class96.field1302[var5] = class96.field1302[var5 + 1];
                    class362.field5368[var5] = class362.field5368[var5 + 1];
                    class264.field3887[var5] = class264.field3887[var5 + 1];
                    class39.field587[var5] = class39.field587[var5 + 1];
                    class320.field4759[var5] = class320.field4759[var5 + 1];
                }
                class169.field2285++;
                class365.field5399 = class394.field5732;
                class140.field1797.method1833(arg1 ^ 0xFFFF947C, 201);
                class140.field1797.method2204(class9.method61((byte) -117, arg0), 8);
                class140.field1797.method2214(arg0, -94);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public abstract void method1283(int arg0);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method1349(byte arg0) {
        field2811 = null;
        int var1 = 91 % ((arg0 + 46) / 34);
        field2801 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLdh;)V")
    public abstract void method1276(boolean arg0, class77 arg1);
}

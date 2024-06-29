import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class364 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field5180 = new Object[5000];

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public int field5190 = 0;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[F")
    public float[] field5193 = new float[5000];

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[B")
    public byte[] field5192 = new byte[5000];

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field5189 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public volatile int field5179 = 0;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public volatile int field5186 = 0;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5182 = "Loaded title screen";

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field5191 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
    public static int[] field5185;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lsk;I)V")
    public abstract void method468(class168 arg0, int arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2325(byte arg0) {
        field5185 = null;
        if (arg0 >= 110) {
            field5182 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lsk;B)V")
    public abstract void method463(class168 arg0, byte arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FBIZLnc;)V")
    public abstract void method472(float arg0, byte arg1, int arg2, boolean arg3, class126 arg4);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILsk;)V")
    public abstract void method475(int arg0, class168 arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public static final void method2326(int arg0, int arg1, int arg2) {
        field5178++;
        class156 var3 = new class156(16);
        for (class110 var4 = (class110) class186.field2728.method1222(5656); var4 != null; var4 = (class110) class186.field2728.method1224((byte) -88)) {
            var4.method251(58);
            int var5 = (int) (var4.field499 >> 28);
            int var6 = (int) (var4.field499 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field499 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && var7 < class183.field2703 && class66.field1056 > var6) {
                var3.method1217(1, (long) (var7 | var5 << 28 | var6 << 14), var4);
            }
        }
        if (arg0 == 783682364) {
            class186.field2728 = var3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public abstract void method466(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public abstract void method464(int arg0, int arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    public abstract void method473(int arg0, byte arg1);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public static final void method2327(int arg0) {
        if (arg0 != 3891) {
            method2325((byte) 57);
        }
        field5184++;
        int var1 = class379.method2404(0);
        if (var1 == 0) {
            class141.field2232 = null;
            class76.method598(arg0 - 3765, 0);
        } else if (var1 == 1) {
            class120.method1008((byte) 106, (byte) 0);
            class76.method598(125, 512);
            if (class278.field4176 != null) {
                class347.method2233(-8835);
            }
        } else {
            class120.method1008((byte) 104, (byte) (class49.field794 - 4 & 0xFF));
            class76.method598(127, 2);
        }
        class365.field5202 = class367.field5213;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method2328(byte arg0) {
        field5194++;
        if (arg0 != -83) {
            method2326(7, 86, 81);
        }
        int var1 = class268.field4020.method2778(8, (byte) -95);
        if (class21.field317 > var1) {
            for (int var2 = var1; var2 < class21.field317; var2++) {
                class336.field4806[class371.field5247++] = class75.field1290[var2];
            }
        }
        if (class21.field317 < var1) {
            throw new RuntimeException("gppov1");
        }
        class21.field317 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class75.field1290[var3];
            class127 var5 = class367.field5225[var4];
            int var6 = class268.field4020.method2778(1, (byte) -95);
            if (var6 == 0) {
                class75.field1290[class21.field317++] = var4;
                var5.field5627 = class267.field4002;
            } else {
                int var7 = class268.field4020.method2778(2, (byte) -95);
                if (var7 == 0) {
                    class75.field1290[class21.field317++] = var4;
                    var5.field5627 = class267.field4002;
                    class218.field3229[class176.field2619++] = var4;
                } else if (var7 == 1) {
                    class75.field1290[class21.field317++] = var4;
                    var5.field5627 = class267.field4002;
                    int var8 = class268.field4020.method2778(3, (byte) -95);
                    var5.method2468(8272, var8, 1);
                    int var9 = class268.field4020.method2778(1, (byte) -95);
                    if (var9 == 1) {
                        class218.field3229[class176.field2619++] = var4;
                    }
                } else if (var7 == 2) {
                    class75.field1290[class21.field317++] = var4;
                    var5.field5627 = class267.field4002;
                    if (class268.field4020.method2778(1, (byte) -95) == 1) {
                        int var11 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(8272, var11, 2);
                        int var12 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(arg0 ^ 0xFFFFDFFD, var12, 2);
                    } else {
                        int var10 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(8272, var10, 0);
                    }
                    int var13 = class268.field4020.method2778(1, (byte) -95);
                    if (var13 == 1) {
                        class218.field3229[class176.field2619++] = var4;
                    }
                } else if (var7 == 3) {
                    class336.field4806[class371.field5247++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static final void method2329(byte arg0) {
        field5187++;
        if (class192.method1481(true)) {
            if (class137.field2192 == null) {
                class59.method456(false);
            }
            class161.field2438 = new int[100];
            class200.field2932 = new int[100];
            class220.field3280 = new int[100];
            class276.field4158 = 0;
            class14.field221 = true;
            class303.field4426 = new boolean[100];
            for (int var1 = 0; var1 < 100; var1++) {
                class200.field2932[var1] = (int) ((double) class113.field1819 * Math.random());
                class220.field3280[var1] = (int) (Math.random() * 350.0D);
                class161.field2438[var1] = (int) (Math.random() * 102.0D);
                class303.field4426[var1] = Math.random() < 0.5D;
            }
            try {
                class333.field4775 = class122.field1926.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0 > -58) {
            field5183 = 36;
        }
    }
}

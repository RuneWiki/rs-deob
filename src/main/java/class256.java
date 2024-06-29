import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class256 implements Runnable {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public boolean field4364 = true;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4363 = new Object();

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "[I")
    public int[] field4375 = new int[500];

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public int field4377 = 0;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
    public int[] field4374 = new int[500];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lwl;")
    public static class81 field4371 = new class81(50);

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4372 = -1;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Lve;")
    public static class255 field4376 = class87.method607(85, "Ausw-=hlen");

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "J")
    public static long field4378;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 10)
    public static void method1792(int arg0) {
        field4371 = null;
        if (arg0 == -15540) {
            field4376 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 28)
    public static final void method1793(int arg0) {
        field4371.method553(-69);
        field4366++;
        if (arg0 != 6793) {
            method1797(-118, true, -42);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 43)
    public static final void method1794(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class295.field5061; var3++) {
            for (int var4 = 0; var4 < class29.field449; var4++) {
                for (int var5 = 0; var5 < class315.field5347; var5++) {
                    class249 var6 = class118.field1984[var3][var4][var5];
                    if (var6 != null) {
                        class216 var7 = var6.field4192;
                        if (var7 != null && var7.field3663.method1264()) {
                            class303.method2111(var7.field3663, var3, var4, var5, 1, 1);
                            if (var7.field3668 != null && var7.field3668.method1264()) {
                                class303.method2111(var7.field3668, var3, var4, var5, 1, 1);
                                var7.field3663.method1261(var7.field3668, 0, 0, 0, false);
                                var7.field3668 = var7.field3668.method1263(arg0, arg1, arg2);
                            }
                            var7.field3663 = var7.field3663.method1263(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4188; var8++) {
                            class250 var9 = var6.field4182[var8];
                            if (var9 != null && var9.field4215.method1264()) {
                                class303.method2111(var9.field4215, var3, var4, var5, var9.field4207 + 1 - var9.field4212, var9.field4208 - var9.field4216 + 1);
                                var9.field4215 = var9.field4215.method1263(arg0, arg1, arg2);
                            }
                        }
                        class304 var10 = var6.field4184;
                        if (var10 != null && var10.field5194.method1264()) {
                            class279.method1943(var10.field5194, var3, var4, var5);
                            var10.field5194 = var10.field5194.method1263(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V", line = 118)
    public static final void method1795(int arg0, int arg1, int arg2) {
        if (arg0 == 4 && !class258.field4390) {
            arg1 = 2;
            arg0 = 2;
        }
        field4365++;
        if (class187.field3011 != arg0) {
            if (class249.field4174) {
                return;
            }
            if (class187.field3011 != 0) {
                class145.field2426[class187.field3011].method116();
            }
            if (arg0 != 0) {
                class21 var3 = class145.field2426[arg0];
                var3.method118();
                var3.method119(arg1);
            }
            class187.field3011 = arg0;
            class109.field1851 = arg1;
        } else if (arg0 != 0 && class109.field1851 != arg1) {
            class145.field2426[arg0].method119(arg1);
            class109.field1851 = arg1;
        }
        if (arg2 != -536) {
            field4376 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "run", descriptor = "()V", line = 166)
    public final void run() {
        field4368++;
        while (this.field4364) {
            Object var1 = this.field4363;
            synchronized (this.field4363) {
                if (this.field4377 < 500) {
                    this.field4375[this.field4377] = class2.field31;
                    this.field4374[this.field4377] = class67.field994;
                    this.field4377++;
                }
            }
            class137.method1027(50L, 0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lve;IZ)V", line = 190)
    public static final void method1796(class255 arg0, int arg1, boolean arg2) {
        field4367++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class102.field1719.method495(arg0, 250);
        if (arg1 != -8921) {
            return;
        }
        int var7 = class102.field1719.method496(arg0, 250) * 13;
        if (class281.field4827) {
            class126.method936(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 + var3, 0);
            class126.method926(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        } else {
            class175.method1249(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var3 + var7, 0);
            class175.method1253(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 - -var3, 16777215);
        }
        class102.field1719.method488(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class124.method915(var5 - var3, var3 + var7 + var3, -2, var4 - var3, var6 - -var3 + var3);
        if (!arg2) {
            class160.method1163(0, var7, var4, var5, var6);
        } else if (class281.field4827) {
            class281.method1973();
        } else {
            try {
                Graphics var8 = class240.field3999.getGraphics();
                class69.field1033.method1123(0, var8, (byte) 110, 0);
            } catch (Exception var10) {
                class240.field3999.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZI)V", line = 255)
    public static final void method1797(int arg0, boolean arg1, int arg2) {
        class93.field1601[arg2] = arg0;
        class15 var3 = (class15) class252.field4244.method280((long) arg2, 29153);
        if (arg1) {
            field4371 = (class81) null;
        }
        if (var3 == null) {
            class15 var4 = new class15(4611686018427387905L);
            class252.field4244.method284(true, (long) arg2, var4);
        } else if (var3.field223 != 4611686018427387905L) {
            var3.field223 = class218.method1541(-89) + 500L | 0x4000000000000000L;
        }
        field4369++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 281)
    public static final void method1798(int arg0, int arg1) {
        field4370++;
        if (class18.field281 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class18.field281 == 0) {
            class253.method1729((byte) -112);
        }
        if (arg1 == 40) {
            class261.method1817((byte) 30);
        }
        if (arg1 != 40 && class73.field1208 != null) {
            class73.field1208.method1650((byte) -122);
            class73.field1208 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class90.field1532 = 0;
            class131.field2155 = 1;
            class235.field3873 = 1;
            class232.field3851 = 0;
            class242.field4082 = 0;
            class274.method1922((byte) -97);
        }
        if (arg1 == 5) {
            class187.method1306(class220.field3707, (byte) -98);
        } else {
            class7.method37(4579);
        }
        boolean var3 = class18.field281 == 5 || class18.field281 == 10 || class18.field281 == 28;
        if (arg0 >= -46) {
            field4373 = -93;
        }
        if (var2 != var3) {
            if (var2) {
                class124.field2070 = class238.field3959;
                if (class184.field2963 == 0) {
                    class262.method1827(2, -47);
                } else {
                    class285.method2023(class238.field3959, 2, false, class143.field2379, 255, 1, 0);
                }
                class297.field5078.method1013(2, false);
            } else {
                class262.method1827(2, -62);
                class297.field5078.method1013(2, true);
            }
        }
        if (class281.field4827 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class281.method1965();
        }
        class18.field281 = arg1;
    }
}

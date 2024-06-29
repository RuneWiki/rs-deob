import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class297 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "[Lwi;")
    public volatile class214[] field4269 = new class214[2];

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
    public volatile boolean field4266 = false;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
    public volatile boolean field4271 = false;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field4268 = 100;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lud;")
    public class2 field4274;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIZLqj;)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3, boolean arg4, class238 arg5) {
        field4279++;
        class35.field576 = arg2;
        class269.field3931 = arg4;
        class419.field6236 = arg1;
        int var6 = -38 % ((-arg3 - 75) / 43);
        class158.field2073 = 10000;
        class128.field1699 = arg0;
        class24.field428 = 1;
        class347.field5148 = arg5;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public static final void method1884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4277++;
        class232.field3279.field3915 = 0;
        class232.field3279.method1707(arg2 ^ 0x38, 20);
        class232.field3279.method1707(-28, arg1);
        class232.field3279.method1707(37, arg4);
        class232.field3279.method1693(arg3, (byte) 86);
        class232.field3279.method1693(arg0, (byte) 49);
        class212.field3008 = arg2;
        class69.field959 = 0;
        class239.field3379 = 1;
        class293.field4244 = -3;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        this.field4271 = true;
        field4276++;
        try {
            while (!this.field4266) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class214 var2 = this.field4269[var1];
                    if (var2 != null) {
                        var2.method1337(95);
                    }
                }
                class404.method2628(-45, 10L);
                client.method1574((Object) null, 107, this.field4274);
            }
        } catch (Exception var9) {
            class226.method1406((String) null, var9, 0);
        } finally {
            Object var6 = null;
            this.field4271 = false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public static final void method1885(boolean arg0) {
        field4265++;
        class355.field5207.method952(98);
        if (arg0) {
            field4273 = 98;
        }
        class376.field5677.method1246((byte) 111);
        class166.field2166.method1246((byte) 116);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1886(int arg0, String arg1) {
        field4278++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = arg0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLmb;)V")
    public static final void method1887(boolean arg0, class259 arg1) {
        field4267++;
        if (class229.field3230) {
            return;
        }
        arg1.method2574((byte) 125);
        if (arg0) {
            method1887(false, (class259) null);
        }
        class10.field97--;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I")
    public static final int method1888(int arg0, int arg1, int arg2) {
        field4275++;
        if (arg1 != 1923345732) {
            return 112;
        }
        class363 var3 = (class363) class157.field2069.method954(58, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field5302.length) {
            return var3.field5302[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
    public static final void method1889(boolean arg0) {
        field4270++;
        class222.method1378(4, class445.field6478);
        int var1 = (class237.field3326 >> 10) + (class184.field2482 >> 3);
        int var2 = (class7.field71 >> 10) + (class38.field620 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class300.field4292 = new byte[var6][];
        class240.field3383 = new byte[var6][];
        class340.field5008 = new byte[var6][];
        class407.field6104 = new byte[var6][];
        class100.field1352 = new int[var6];
        class176.field2298 = new int[var6];
        class387.field5785 = new byte[var6][];
        class106.field1417 = new int[var6];
        class60.field861 = new int[var6];
        class29.field497 = new int[var6][4];
        class191.field2658 = new int[var6];
        class79.field1085 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - (class324.field4652 >> 4)) / 8; var8 <= ((class324.field4652 >> 4) + var1) / 8; var8++) {
            for (int var10 = (var2 - (class336.field4964 >> 4)) / 8; var10 <= ((class336.field4964 >> 4) + var2) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class106.field1417[var7] = var11;
                class100.field1352[var7] = class285.field4163.method1467(108, "m" + var8 + "_" + var10);
                class60.field861[var7] = class285.field4163.method1467(121, "l" + var8 + "_" + var10);
                class79.field1085[var7] = class285.field4163.method1467(119, "n" + var8 + "_" + var10);
                class191.field2658[var7] = class285.field4163.method1467(111, "um" + var8 + "_" + var10);
                class176.field2298[var7] = class285.field4163.method1467(110, "ul" + var8 + "_" + var10);
                if (class79.field1085[var7] == -1) {
                    class100.field1352[var7] = -1;
                    class60.field861[var7] = -1;
                    class191.field2658[var7] = -1;
                    class176.field2298[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class79.field1085.length; var9++) {
            class79.field1085[var9] = -1;
            class100.field1352[var9] = -1;
            class60.field861[var9] = -1;
            class191.field2658[var9] = -1;
            class176.field2298[var9] = -1;
        }
        class78.method495(true, var2, arg0, var1, var5, var3, 24, var4);
    }
}

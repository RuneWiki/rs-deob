import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class132 {

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2104 = 1;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2105 = 100;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public static int[] field2103;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method893(int arg0) {
        if (arg0 == 32294) {
            field2103 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method894(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class113.field1622 < 100) {
            class214.method1502(266236743);
        }
        class217.method1520(arg0, arg1, arg0 + arg3, arg1 + arg2);
        field2101++;
        if (class113.field1622 < 100) {
            int var5 = arg3 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg1 + (arg2 / 2) - var6 - 18;
            class217.method1526(arg0, arg1, arg3, arg2, 0);
            class217.method1528(var5 - 152, var7, 304, 34, 9179409);
            class217.method1528(var5 - 151, var7 + 1, 302, 32, 0);
            class217.method1526(var5 - 150, var7 - -2, class113.field1622 * 3, 30, 9179409);
            class217.method1526(class113.field1622 * 3 + var5 - 150, var7 + 2, 300 - (class113.field1622 * 3), 30, 0);
            class280.field4439.method685(class39.field478, var5, var6 + var7, 16777215, -1);
            return;
        }
        class184.field2935 = class220.field3524 - ((int) ((float) arg3 / class250.field4084));
        class162.field2577 = (int) ((float) (arg2 * 2) / class250.field4084);
        class287.field4574 = class224.field3606 - (int) ((float) arg2 / class250.field4084);
        class162.field2575 = (int) ((float) (arg3 * 2) / class250.field4084);
        int var8 = class220.field3524 - ((int) ((float) arg3 / class250.field4084));
        int var9 = class224.field3606 - ((int) ((float) arg2 / class250.field4084));
        int var10 = (int) ((float) arg2 / class250.field4084) + class224.field3606;
        int var11 = (int) ((float) arg3 / class250.field4084) + class220.field3524;
        class50.method287(arg0 + arg3, -34, arg1 + arg2, var10, var11, arg0, var8, arg1, var9);
        class276.method1845(arg0, arg1, (byte) 100, var11, var10, var9, var8, arg0 + arg3, arg1 - -arg2, class181.field2890);
        class129.method876(arg0 + arg3, var8, arg0, arg1 + arg2, arg1, arg4, var11, var9, var10);
        if (class282.field4469 > 0) {
            class180.field2862--;
            if (class180.field2862 == 0) {
                class282.field4469--;
                class180.field2862 = 20;
            }
        }
        if (!class255.field4134) {
            return;
        }
        int var12 = arg1 + arg2 - 8;
        int var13 = arg0 - (5 - arg3);
        int var14 = 16776960;
        class166.field2664.method689("Fps:" + class276.field4409, var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class166.field2664.method689("Mem:" + var16 + "k", var13, var17, var14, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method895(int arg0, int arg1) {
        field2100++;
        return class78.field977[arg0].length() > arg1 ? class191.field3084[arg0] + class92.field1162 + class78.field977[arg0] : class191.field3084[arg0];
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
    public static final int method896(int arg0, int arg1) {
        int var2 = -51 % ((arg0 - 65) / 60);
        field2099++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)Z")
    public static final boolean method897(byte arg0, int arg1, int arg2) {
        field2098++;
        if (arg0 != 27) {
            return true;
        } else if (class262.field4250) {
            int var3 = arg1 >> 16;
            int var4 = arg1 & 0xFFFF;
            if (class75.field937[var3] == null || class75.field937[var3][var4] == null) {
                return false;
            }
            class123 var5 = class75.field937[var3][var4];
            if (arg2 == -1 && var5.field1778 == 0) {
                for (int var6 = 0; var6 < class34.field437; var6++) {
                    if (class155.field2423[var6] == 9 || class155.field2423[var6] == 1004 || class155.field2423[var6] == 42 || class155.field2423[var6] == 6 || class155.field2423[var6] == 46) {
                        for (class123 var7 = class61.method358(class61.field805[var6], -120); var7 != null; var7 = class185.method1297(var7, (byte) 79)) {
                            if (var5.field1844 == var7.field1844) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class34.field437; var8++) {
                    if (class251.field4104[var8] == arg2 && class61.field805[var8] == var5.field1844 && (class155.field2423[var8] == 9 || class155.field2423[var8] == 1004 || class155.field2423[var8] == 42 || class155.field2423[var8] == 6 || class155.field2423[var8] == 46)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }
}

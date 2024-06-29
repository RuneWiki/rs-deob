import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class300 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lph;")
    public static class229 field4869 = null;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lph;")
    public static class229 field4871 = class266.method1858("<)4col> x", 0);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
    public static boolean field4870 = false;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lcl;")
    public static class32 field4873 = null;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
    public static int[] field4875 = new int[100];

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[Lka;")
    public static class293[] field4872;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 8)
    public static void method2014(byte arg0) {
        field4875 = null;
        field4873 = null;
        if (arg0 == 1) {
            field4871 = null;
            field4869 = null;
            field4872 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BI)V", line = 33)
    public static final void method2015(byte[] arg0, int arg1) {
        field4876++;
        class164 var2 = new class164(arg0);
        var2.field2670 = arg0.length - 2;
        class301.field4993 = var2.method1161(true);
        class303.field5064 = new int[class301.field4993];
        class279.field4623 = new byte[class301.field4993][];
        class36.field597 = new int[class301.field4993];
        class27.field387 = new int[class301.field4993];
        if (arg1 != 7612) {
            method2015((byte[]) null, -92);
        }
        class288.field4729 = new int[class301.field4993];
        class177.field2922 = new boolean[class301.field4993];
        class27.field404 = new byte[class301.field4993][];
        var2.field2670 = arg0.length - class301.field4993 * 8 - 7;
        class266.field4486 = var2.method1161(true);
        class48.field713 = var2.method1161(true);
        int var3 = (var2.method1178(8) & 0xFF) + 1;
        for (int var4 = 0; var4 < class301.field4993; var4++) {
            class303.field5064[var4] = var2.method1161(true);
        }
        for (int var5 = 0; var5 < class301.field4993; var5++) {
            class27.field387[var5] = var2.method1161(true);
        }
        for (int var6 = 0; var6 < class301.field4993; var6++) {
            class36.field597[var6] = var2.method1161(true);
        }
        for (int var7 = 0; var7 < class301.field4993; var7++) {
            class288.field4729[var7] = var2.method1161(true);
        }
        var2.field2670 = arg0.length + 3 - (class301.field4993 * 8) - var3 * 3 - 7;
        class314.field5346 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class314.field5346[var8] = var2.method1176(arg1 + 1048108300);
            if (class314.field5346[var8] == 0) {
                class314.field5346[var8] = 1;
            }
        }
        var2.field2670 = 0;
        for (int var9 = 0; var9 < class301.field4993; var9++) {
            int var10 = class288.field4729[var9];
            int var11 = class36.field597[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class279.field4623[var9] = var13;
            class27.field404[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1178(arg1 ^ 0x1DB4);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1163(864348104);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1163(arg1 + 864340492);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label93: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label93;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var14[var11 * var20 + var19] = var2.method1163(864348104);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var13[var11 * var18 + var17] = var2.method1163(864348104);
                    }
                    var17++;
                }
            }
            class177.field2922[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 218)
    public static final Object method2016(int arg0, boolean arg1, byte[] arg2) {
        field4874++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 > ~arg2.length && !class243.field4013) {
            try {
                class300 var3 = (class300) Class.forName("ga").getDeclaredConstructor().newInstance();
                var3.method1130(38, arg2);
                return var3;
            } catch (Throwable var5) {
                class243.field4013 = true;
            }
        }
        return arg1 ? class98.method722(arg0 ^ 0xFFFFFF77, arg2) : arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)V")
    public abstract void method1130(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1131(byte arg0);
}

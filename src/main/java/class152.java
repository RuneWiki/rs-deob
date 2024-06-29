import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class152 extends class303 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2153 = 2;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2155 = "";

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljk;IIIII)V")
    public static final void method1028(class378 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5386 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class36.field551[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class347 var11 = class84.field1302[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field5386; var12++) {
                            if (arg0.field5391[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field5391[arg0.field5386++] = var11;
                        if (arg0.field5386 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field5386; var13 < 4; var13++) {
            arg0.field5391[var13] = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
    public static final void method1029(byte arg0, int arg1) {
        field2154++;
        class197.field2735.method1254(arg1, 122);
        class410.field5951.method1254(arg1, -86);
        class337.field4590.method1254(arg1, -82);
        if (arg0 != -34) {
            field2156 = -109;
        }
        class144.field2088.method1254(arg1, arg0 ^ 0x3D);
        class120.field1697.method1254(arg1, arg0 ^ 0xFFFFFFA2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
    public static final void method1030(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class408.field5920 = class281.method1786(class67.field1056 * 2, arg2, class41.field617, class204.field2772, (byte) 62, class65.field1027);
        } else {
            if (arg1) {
                class408.field5920 = class281.method1786(0, 0, class41.field617, class204.field2772, (byte) 62, class65.field1027);
                class408.field5920.method1794(0);
                class65 var3 = class349.method2234(class435.field6251, class8.field121, true, 0);
                class352 var4 = class408.field5920.method1791(var3, class18.method107(class353.field4943, class8.field121, 0), true);
                class176.method1176(class75.field1163, true, false, var4);
                class408.field5920.method1749();
                class236.method1486(-830);
                class408.field5920.method1809((byte) 83);
            }
            try {
                class408.field5920 = class281.method1786(class67.field1056 * 2, arg2, class41.field617, class204.field2772, (byte) 62, class65.field1027);
            } catch (Throwable var7) {
                class408.field5920 = class281.method1786(0, 0, class41.field617, class204.field2772, (byte) 62, class65.field1027);
                arg2 = 0;
            }
        }
        field2152++;
        if (class408.field5920.method1725()) {
            class55 var5 = class408.field5920.method1760(134217728);
            class408.field5920.method1823(var5);
        }
        class16.field205 = arg2;
        class63.method426(arg0 - 9903);
        if (!class408.field5920.method1778()) {
            class5.field84 = 1;
        }
        class408.field5920.method1801(class5.field84);
        class408.field5920.method1798(0);
        class220.field2893 = class408.field5920.method1783();
        class410.field5962 = class408.field5920.method1783();
        int var6 = (int) ((double) class432.field6220 * 34.46D);
        if (class408.field5920.method1746()) {
            var6 += 128;
        }
        class408.field5920.method1765(50, var6);
        class408.field5920.method1789(!class313.field4316);
        if (class408.field5920.method1723()) {
            class58.method388(class233.field3156, arg0 ^ 0xFFFFD952);
        }
        class140.field2005 = !class67.method457(31862);
        if (arg0 == 9977) {
            class142.method970(class267.field3646 >> 3, arg0 - 34938, class432.field6220 >> 3, class408.field5920);
            class240.method1521(-5001);
            class249.field3451 = false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method1031(byte arg0) {
        field2155 = null;
        if (arg0 != -18) {
            field2156 = -96;
        }
    }
}

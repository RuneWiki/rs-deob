import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class95 extends class295 {

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Z")
    public volatile boolean field1384 = true;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lcc;")
    public static class338 field1379;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Lkb;")
    public static class80 field1381;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Z")
    public boolean field1374;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Z")
    public boolean field1375;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "[[[Ldg;")
    public static class224[][][] field1380;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Z", line = 6)
    public static final boolean method809(byte arg0) {
        if (arg0 == 55) {
            field1382++;
            return class415.field5808 > 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([Lbi;ZI)V", line = 20)
    public static final void method810(class139[] arg0, boolean arg1, int arg2) {
        field1376++;
        if (!arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class139 var4 = arg0[var3];
            if (var4 != null && var4.field2042 == arg2 && (!var4.field2048 || !client.method1645(var4))) {
                if (var4.field2023 == 0) {
                    if (!var4.field2048 && client.method1645(var4) && class375.field5276 != var4) {
                        continue;
                    }
                    method810(arg0, true, var4.field1968);
                    if (var4.field2045 != null) {
                        method810(var4.field2045, true, var4.field1968);
                    }
                    class64 var5 = (class64) class204.field2865.method614(-112, (long) var4.field1968);
                    if (var5 != null) {
                        class344.method2183(var5.field976, (byte) -90);
                    }
                }
                if (var4.field2023 == 6) {
                    if (var4.field1963 != -1 || var4.field2068 != -1) {
                        boolean var6 = class329.method2086(-3, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2068;
                        } else {
                            var7 = var4.field1963;
                        }
                        if (var7 != -1) {
                            class209 var8 = class288.method1819(var7, (byte) 105);
                            if (var8 != null) {
                                var4.field2124 += class339.field4628;
                                while (var4.field2124 > var8.field2894[var4.field2066]) {
                                    var4.field2124 -= var8.field2894[var4.field2066];
                                    var4.field2066++;
                                    if (var4.field2066 >= var8.field2915.length) {
                                        var4.field2066 -= var8.field2896;
                                        if (var4.field2066 < 0 || var8.field2915.length <= var4.field2066) {
                                            var4.field2066 = 0;
                                        }
                                    }
                                    var4.field2104 = var4.field2066 + 1;
                                    if (var4.field2104 >= var8.field2915.length) {
                                        var4.field2104 -= var8.field2896;
                                        if (var4.field2104 < 0 || var4.field2104 >= var8.field2915.length) {
                                            var4.field2104 = -1;
                                        }
                                    }
                                    class10.method52(var4, (byte) -89);
                                }
                            }
                        }
                    }
                    if (var4.field2060 != 0 && !var4.field2048) {
                        int var9 = var4.field2060 >> 16;
                        int var10 = class339.field4628 * var9;
                        int var11 = var4.field2060 << 16 >> 16;
                        var4.field2030 = var4.field2030 + var10 & 0x3FFF;
                        int var12 = class339.field4628 * var11;
                        var4.field2117 = var4.field2117 + var12 & 0x3FFF;
                        class10.method52(var4, (byte) -89);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V", line = 137)
    public static void method811(boolean arg0) {
        field1379 = null;
        if (arg0) {
            field1385 = 75;
        }
        field1380 = null;
        field1381 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 149)
    public static final void method812(String arg0, int arg1) {
        field1378++;
        if (arg1 < 125) {
            method809((byte) -85);
        }
        if (arg0 == null) {
            return;
        }
        String var2 = class39.method385(-1, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class275.field3702; var3++) {
            String var4 = class39.method385(-1, class268.field3607[var3]);
            if (var4 != null && var4.equals(var2)) {
                class275.field3702--;
                for (int var5 = var3; var5 < class275.field3702; var5++) {
                    class268.field3607[var5] = class268.field3607[var5 + 1];
                    class101.field1494[var5] = class101.field1494[var5 + 1];
                    class147.field2259[var5] = class147.field2259[var5 + 1];
                    class192.field2772[var5] = class192.field2772[var5 + 1];
                    class305.field4131[var5] = class305.field4131[var5 + 1];
                }
                class165.field2431 = class387.field5445;
                class447.field6463++;
                class355.field4828.method1801(239, (byte) -95);
                class355.field4828.method1824(100, class408.method2528(-58, arg0));
                class355.field4828.method1827(0, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 202)
    public static final void method813(int arg0, int arg1) {
        field1383++;
        class410 var2 = class244.field3375;
        synchronized (class244.field3375) {
            class244.field3375.method2534(arg1 ^ arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V", line = 212)
    public static final void method814(boolean arg0, boolean arg1) {
        field1377++;
        class215.field2978 = arg0;
        if (arg1) {
            field1385 = -91;
        }
        class298.field4019 = !class339.method2153(9);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/lang/Class;)Lfo;", line = 226)
    public static final class228 method815(int arg0, int arg1, int arg2, Class arg3) {
        class224 var4 = class118.field1653[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class26 var5 = var4.field3129; var5 != null; var5 = var5.field463) {
            class228 var6 = var5.field460;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3172 == arg1 && var6.field3161 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
    public abstract int method646(int arg0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method643(boolean arg0);
}

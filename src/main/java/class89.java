import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 implements class136 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lpj;")
    private class79 field1350 = new class79(256);

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lqj;")
    private class296 field1365;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lqj;")
    private class296 field1361;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[Lw;")
    private class164[] field1354;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1363 = -1;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lqj;")
    public static class296 field1352;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I", line = 5)
    public static final int method605(int arg0, int arg1) {
        field1356++;
        if (arg0 != 0) {
            method609((class351) null, -6, -59, 110, 74, (byte) -118);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 21)
    public static void method606(int arg0) {
        field1352 = null;
        if (arg0 != -11602) {
            method611((String) null, (byte) -39, (class371) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)Lw;", line = 37)
    public final class164 method607(boolean arg0, int arg1) {
        if (arg0) {
            method615((String) null, (byte) -116);
        }
        field1355++;
        return this.field1354[arg1];
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IFIZII)[I", line = 54)
    public final int[] method608(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1348++;
        return arg4 >= -45 ? null : this.method612(arg0, (byte) -128).method434(arg2, (double) arg1, this.field1361, (byte) -121, arg5, this.field1354[arg0].field2324, this);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lkq;IIIIB)Ljava/awt/Frame;", line = 65)
    public static final Frame method609(class351 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 100 % ((arg5 + 49) / 58);
        field1364++;
        if (!arg0.method2245((byte) 56)) {
            return null;
        }
        if (arg2 == 0) {
            class337[] var7 = class196.method1308(arg0, true);
            if (var7 == null) {
                return null;
            }
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].field4597 == arg3 && var7[var9].field4591 == arg1 && (arg4 == 0 || var7[var9].field4594 == arg4) && (!var8 || var7[var9].field4593 > arg2)) {
                    var8 = true;
                    arg2 = var7[var9].field4593;
                }
            }
            if (!var8) {
                return null;
            }
        }
        class295 var10 = arg0.method2252(arg4, (byte) -89, arg1, arg3, arg2);
        while (var10.field4068 == 0) {
            class4.method28(10L, 81);
        }
        Frame var11 = (Frame) var10.field4070;
        if (var11 == null) {
            return null;
        } else if (var10.field4068 == 2) {
            class305.method1949(arg0, var11, -1);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)Z", line = 134)
    public final boolean method610(byte arg0, int arg1) {
        if (arg0 != 0) {
            field1363 = 79;
        }
        field1349++;
        class64 var3 = this.method612(arg1, (byte) 77);
        return var3 != null && var3.method432(this, this.field1361, 127);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;BLeb;)I", line = 148)
    public static final int method611(String arg0, byte arg1, class371 arg2) {
        field1362++;
        int var3 = arg2.field5273;
        if (arg1 <= 76) {
            field1363 = -69;
        }
        byte[] var4 = class191.method1262(arg0, (byte) -108);
        arg2.method2414(114, var4.length);
        arg2.field5273 += class81.field1249.method1879(var4, 0, arg2.field5273, var4.length, arg2.field5258, 0);
        return arg2.field5273 - var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Lgm;", line = 172)
    private final class64 method612(int arg0, byte arg1) {
        field1367++;
        class447 var3 = this.field1350.method567((byte) 91, (long) arg0);
        if (var3 != null) {
            return (class64) var3;
        }
        byte[] var4 = this.field1365.method1904(arg0, 255);
        if (var4 == null) {
            return null;
        } else {
            class64 var5 = new class64(new class371(var4));
            int var6 = -57 / ((arg1 - 6) / 47);
            this.field1350.method565(-1, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lqj;Lqj;Lqj;)V", line = 211)
    public class89(class296 arg0, class296 arg1, class296 arg2) {
        this.field1365 = arg1;
        this.field1361 = arg2;
        class371 var4 = new class371(arg0.method1920(0, false, 0));
        int var5 = var4.method2403((byte) 71);
        this.field1354 = new class164[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2429(0) == 1) {
                this.field1354[var6] = new class164();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1354[var7] != null) {
                this.field1354[var7].field2317 = var4.method2429(0) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1354[var8] != null) {
                this.field1354[var8].field2300 = var4.method2429(0) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1354[var9] != null) {
                this.field1354[var9].field2301 = var4.method2429(0) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1354[var10] != null) {
                this.field1354[var10].field2319 = var4.method2429(0) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1354[var11] != null) {
                this.field1354[var11].field2313 = var4.method2418(-21337);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1354[var12] != null) {
                this.field1354[var12].field2312 = var4.method2418(-21337);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1354[var13] != null) {
                this.field1354[var13].field2299 = var4.method2418(-21337);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1354[var14] != null) {
                this.field1354[var14].field2326 = var4.method2418(-21337);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1354[var15] != null) {
                this.field1354[var15].field2303 = (short) var4.method2403((byte) 72);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1354[var16] != null) {
                this.field1354[var16].field2315 = var4.method2418(-21337);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1354[var17] != null) {
                this.field1354[var17].field2309 = var4.method2418(-21337);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1354[var18] != null) {
                this.field1354[var18].field2314 = var4.method2429(0) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1354[var19] != null) {
                this.field1354[var19].field2324 = var4.method2429(0) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1354[var20] != null) {
                this.field1354[var20].field2305 = var4.method2418(-21337);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1354[var21] != null) {
                this.field1354[var21].field2323 = var4.method2429(0) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1354[var22] != null) {
                this.field1354[var22].field2308 = var4.method2429(0) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1354[var23] != null) {
                this.field1354[var23].field2320 = var4.method2429(0) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(FIIBZI)[I", line = 201)
    public final int[] method613(float arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field1360++;
        if (arg3 < 50) {
            this.field1365 = null;
        }
        return this.method612(arg1, (byte) -45).method435(this, false, this.field1361, (double) arg0, arg4, arg5, arg2, this.field1354[arg1].field2324);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)Z", line = 397)
    public static final boolean method614(byte arg0, int arg1, int arg2) {
        field1358++;
        if (!class349.field4882) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class333.field4511[var3] == null || class333.field4511[var3][var4] == null) {
            return false;
        }
        if (arg0 != -89) {
            field1359 = 11;
        }
        class383 var5 = class333.field4511[var3][var4];
        if (arg1 == -1 && var5.field5488 == 0) {
            for (class207 var6 = (class207) class167.field2393.method1312((byte) 25); var6 != null; var6 = (class207) class167.field2393.method1304(127)) {
                if (var6.field2797 == 5 || var6.field2797 == 1001 || var6.field2797 == 13 || var6.field2797 == 19 || var6.field2797 == 58) {
                    for (class383 var7 = class290.method1869((byte) 6, var6.field2799); var7 != null; var7 = class231.method1445(-26360, var7)) {
                        if (var5.field5507 == var7.field5507) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class207 var8 = (class207) class167.field2393.method1312((byte) 25); var8 != null; var8 = (class207) class167.field2393.method1304(-74)) {
                if (var8.field2808 == arg1 && var5.field5507 == var8.field2799 && (var8.field2797 == 5 || var8.field2797 == 1001 || var8.field2797 == 13 || var8.field2797 == 19 || var8.field2797 == 58)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 466)
    public static final void method615(String arg0, byte arg1) {
        field1353++;
        if (arg0 == null) {
            return;
        }
        if (!(class97.field1482 < 100 || class266.field3633) || class97.field1482 >= 200) {
            class141.method966((byte) -79, class296.field4103);
            return;
        }
        String var2 = class408.method2616(arg0, -1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class97.field1482; var3++) {
            String var7 = class408.method2616(class40.field609[var3], -1);
            if (var7 != null && var7.equals(var2)) {
                class141.method966((byte) 92, arg0 + class294.field4065);
                return;
            }
            if (class365.field5117[var3] != null) {
                String var8 = class408.method2616(class365.field5117[var3], -1);
                if (var8 != null && var8.equals(var2)) {
                    class141.method966((byte) 67, arg0 + class294.field4065);
                    return;
                }
            }
        }
        if (arg1 >= -55) {
            field1363 = 120;
        }
        for (int var4 = 0; var4 < class157.field2221; var4++) {
            String var5 = class408.method2616(class259.field3549[var4], -1);
            if (var5 != null && var5.equals(var2)) {
                class141.method966((byte) 92, class373.field5323 + arg0 + class448.field6466);
                return;
            }
            if (class20.field258[var4] != null) {
                String var6 = class408.method2616(class20.field258[var4], -1);
                if (var6 != null && var6.equals(var2)) {
                    class141.method966((byte) -123, class373.field5323 + arg0 + class448.field6466);
                    return;
                }
            }
        }
        if (class408.method2616(class307.field4211.field4994, -1).equals(var2)) {
            class141.method966((byte) -82, client.field2344);
        } else {
            class139.field1975++;
            class442.field6400.method158((byte) 7, 208);
            class442.field6400.method2396(class322.method2036(arg0, 85), 12450);
            class442.field6400.method2412(-119, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIFZII)[F", line = 562)
    public final float[] method616(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 == 16155) {
            field1366++;
            return this.method612(arg4, (byte) -46).method429(this.field1354[arg4].field2324, -15481, arg5, this.field1361, this, arg0);
        } else {
            return null;
        }
    }
}

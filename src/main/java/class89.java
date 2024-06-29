import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class89 implements class73 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1358 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ltl;")
    public static class222 field1362 = new class222(5);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Ln;")
    public static class298 field1365;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lkb;")
    public static class39 field1361;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 6)
    public static void method642(int arg0) {
        if (arg0 != 0) {
            method645((class6) null, (byte) -111);
        }
        field1362 = null;
        field1361 = null;
        field1365 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([FI)[F", line = 25)
    public static final float[] method643(float[] arg0, int arg1) {
        if (arg1 != -1) {
            method644(-103, 19);
        }
        field1357++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class213.method1556(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lgb;", line = 47)
    public static final class181 method644(int arg0, int arg1) {
        class181 var2 = (class181) class189.field3070.method768((long) arg0, false);
        field1364++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class71.field923.method250(true, 0, arg0);
        } else {
            var3 = class74.field958.method250(true, 0, arg0 & 0x7FFF);
        }
        class181 var4 = new class181();
        if (var3 != null) {
            var4.method1254(29440, new class192(var3));
        }
        if (arg0 >= 32768) {
            var4.method1250((byte) -18);
        }
        int var5 = 19 % ((8 - arg1) / 50);
        class189.field3070.method770(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lgn;B)[Lco;", line = 78)
    public static final class103[] method645(class6 arg0, byte arg1) {
        field1363++;
        if (!arg0.method35(83)) {
            return new class103[0];
        }
        class217 var2 = arg0.method29(0);
        while (var2.field3488 == 0) {
            class20.method128(0, 10L);
        }
        if (var2.field3488 == 2) {
            return new class103[0];
        }
        if (arg1 > -113) {
            field1358 = -38;
        }
        int[] var3 = (int[]) ((int[]) var2.field3490);
        class103[] var4 = new class103[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class103 var6 = new class103();
            var4[var5] = var6;
            var6.field1583 = var3[var5 << 2];
            var6.field1571 = var3[(var5 << 2) + 1];
            var6.field1582 = var3[(var5 << 2) + 2];
            var6.field1573 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JZ[II)Ljava/lang/String;", line = 135)
    public final String method472(long arg0, boolean arg1, int[] arg2, int arg3) {
        field1359++;
        if (arg1) {
            return (String) null;
        } else if (arg3 == 0) {
            class116 var7 = class337.method2319(arg2[0], (byte) -98);
            return var7.method810(2, (int) arg0);
        } else if (arg3 == 1 || arg3 == 10) {
            class74 var6 = class31.method198(arg1, (int) arg0);
            return var6.field996;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class337.method2319(arg2[0], (byte) -94).method810(2, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 167)
    public static final void method646(byte arg0) {
        field1360++;
        if (class90.field1374 != null || class86.field1296 != null) {
            return;
        }
        int var1 = class303.field4727;
        if (arg0 < 24) {
            field1362 = (class222) null;
        }
        if (!class19.field274) {
            if (var1 == 1 && class126.field1887 > 0) {
                short var2 = class50.field686[class126.field1887 - 1];
                if (var2 == 21 || var2 == 35 || var2 == 5 || var2 == 47 || var2 == 20 || var2 == 38 || var2 == 3 || var2 == 10 || var2 == 7 || var2 == 46 || var2 == 33 || var2 == 1002) {
                    int var3 = class19.field270[class126.field1887 - 1];
                    int var4 = class300.field4675[class126.field1887 - 1];
                    class160 var5 = class37.method238((byte) -105, var4);
                    class170 var6 = client.method1913(var5);
                    if (var6.method1168(123) || var6.method1166(0)) {
                        class272.field4318 = 0;
                        class315.field4907 = false;
                        if (class90.field1374 != null) {
                            class219.method1600(class90.field1374, 113);
                        }
                        class90.field1374 = class37.method238((byte) 56, var4);
                        class289.field4557 = class144.field2158;
                        class50.field692 = class221.field3521;
                        class247.field3922 = var3;
                        class219.method1600(class90.field1374, 104);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class181.field2915 == 1 && class126.field1887 > 2 || class200.method1464(126, class126.field1887 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class126.field1887 > 0 || class121.field1848 == 1) {
                class333.method2297(41);
            }
            if (var1 == 1 && class126.field1887 > 0 || class121.field1848 == 2) {
                class121.method841((byte) 76);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class164.field2672;
            int var8 = class4.field35;
            if (var7 < (class86.field1297 - 10) || (class86.field1297 + class181.field2932 + 10) < var7 || var8 < (class333.field5166 - 10) || (class333.field5166 + class12.field136 + 10) < var8) {
                class19.field274 = false;
                class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class86.field1297;
        int var10 = class333.field5166;
        int var11 = class181.field2932;
        int var12 = class221.field3521;
        int var13 = class144.field2158;
        int var14 = -1;
        for (int var15 = 0; var15 < class126.field1887; var15++) {
            if (class119.field1827) {
                int var17 = (class126.field1887 - var15 - 1) * 15 + var10 + 33;
                if (var9 < var12 && var12 < var9 + var11 && var13 > var17 - 13 && var17 + 3 > var13) {
                    var14 = var15;
                }
            } else {
                int var16 = var10 + ((class126.field1887 + -1 + -var15) * 15) + 31;
                if (var12 > var9 && (var9 + var11) > var12 && (var16 - 13) < var13 && var13 < var16 + 3) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class119.method831(0, var14);
        }
        class19.field274 = false;
        class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
    }
}

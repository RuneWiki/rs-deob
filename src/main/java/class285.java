import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class285 {

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lsf;")
    private static class108 field4983 = class140.method973(255, "glow2:");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lsf;")
    public static class108 field4980 = field4983;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lsf;")
    public static class108 field4987 = field4983;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    public static int[] field4978 = new int[5];

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lof;")
    public static class242 field4986 = new class242(16);

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lsf;")
    public static class108 field4989 = class140.method973(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
    public static int[] field4988 = new int[1000];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[Lsf;")
    public static class108[] field4990 = new class108[8];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lsf;")
    public class108 field4984;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[Lbb;")
    public static class92[] field4985;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 5)
    public static void method2041(byte arg0) {
        field4987 = null;
        field4978 = null;
        field4985 = null;
        field4988 = null;
        if (arg0 != 0) {
            method2041((byte) 126);
        }
        field4980 = null;
        field4983 = null;
        field4986 = null;
        field4990 = null;
        field4989 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILll;Z)V", line = 41)
    public static final void method2042(int arg0, class158 arg1, boolean arg2) {
        field4979++;
        int var3 = arg1.field2845;
        int var4 = (int) arg1.field3375;
        arg1.method1325(arg0 ^ arg0);
        if (arg2) {
            class173.method1229(true, var3);
        }
        class287.method2055(var3, 8004);
        class98 var5 = class168.method1173(var4, -1456948048);
        if (var5 != null) {
            class195.method1388(-82, var5);
        }
        int var6 = class311.field5374;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class9.method48((byte) -34, class305.field5299[var7])) {
                class320.method2216(var7, 96);
            }
        }
        if (class311.field5374 == 1) {
            class62.field989 = false;
            class101.method702(-1, class203.field3665, class167.field2998, class296.field5167, class190.field3453);
        } else {
            class101.method702(-1, class203.field3665, class167.field2998, class296.field5167, class190.field3453);
            int var8 = class256.field4525.method543(class17.field209);
            for (int var9 = 0; var9 < class311.field5374; var9++) {
                int var10 = class256.field4525.method543(class210.method1453((byte) -118, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class190.field3453 = class311.field5374 * 15 + 22;
            class167.field2998 = var8 + 8;
        }
        if (class322.field5511 != -1) {
            class302.method2121((byte) 95, class322.field5511, 1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILlj;I)V", line = 132)
    public static final void method2043(int arg0, int arg1, class51 arg2, int arg3) {
        field4982++;
        if ((arg0 & 0x40) != 0) {
            int var4 = class293.field5127.method1726(-17356);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class293.field5127.method1755(true);
            class72.method484(var4, arg2, (byte) -126, var5);
        }
        if ((arg0 & 0x200) != 0) {
            int var6 = class293.field5127.method1739((byte) -80);
            int var7 = class293.field5127.method1733(arg1 ^ 0x81);
            arg2.method1803(var7, (byte) -128, var6, class116.field2000);
        }
        if (arg1 != 1) {
            method2043(-123, 80, (class51) null, -32);
        }
        if ((arg0 & 0x100) != 0) {
            arg2.field4500 = class293.field5127.method1726(arg1 ^ 0xFFFFBC35);
            int var8 = class293.field5127.method1738(-1756395344);
            arg2.field4460 = class116.field2000 + (var8 & 0xFFFF);
            arg2.field4450 = 0;
            if (class116.field2000 < arg2.field4460) {
                arg2.field4450 = -1;
            }
            arg2.field4517 = var8 >> 16;
            arg2.field4506 = 0;
            if (arg2.field4500 == 65535) {
                arg2.field4500 = -1;
            }
            if (arg2.field4500 != -1 && class116.field2000 == arg2.field4460) {
                int var9 = class152.method1074((byte) 119, arg2.field4500).field5308;
                if (var9 != -1) {
                    class272 var10 = class149.method1063(var9, -18767);
                    if (var10 != null && var10.field4774 != null) {
                        class172.method1226(var10, arg2.field4457, -21329, 0, class95.field1513 == arg2, arg2.field4452);
                    }
                }
            }
        }
        if ((arg0 & 0x20) != 0) {
            arg2.field4448 = class293.field5127.method1712(-1);
            arg2.field4508 = class293.field5127.method1712(-1);
        }
        if ((arg0 & 0x4) != 0) {
            int var11 = class293.field5127.method1733(128);
            byte[] var12 = new byte[var11];
            class249 var13 = new class249(var12);
            class293.field5127.method1716(var12, arg1 + 65279, var11, 0);
            class209.field3740[arg3] = var13;
            arg2.method361(var13, 60723746);
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field4507 = class293.field5127.method1731(true);
            arg2.field4485 = class293.field5127.method1731(true);
            arg2.field4463 = class293.field5127.method1755(true);
            arg2.field4474 = class293.field5127.method1731(true);
            arg2.field4519 = class293.field5127.method1712(-1) + class116.field2000;
            arg2.field4503 = class293.field5127.method1725(-122) + class116.field2000;
            arg2.field4478 = class293.field5127.method1733(arg1 ^ 0x81);
            arg2.field4487 = 1;
            arg2.field4447 = 0;
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field4467 = class293.field5127.method1740(true);
            if (arg2.field4467.method784(0, 126) == 126) {
                arg2.field4467 = arg2.field4467.method788(1, 32299);
                class210.method1456(arg2.field4467, 2, -95, arg2.method359(12));
            } else if (class95.field1513 == arg2) {
                class210.method1456(arg2.field4467, 2, -73, arg2.method359(12));
            }
            arg2.field4523 = 0;
            arg2.field4511 = 0;
            arg2.field4524 = 150;
        }
        if ((arg0 & 0x8) != 0) {
            arg2.field4522 = class293.field5127.method1712(arg1 - 2);
            if (arg2.field4522 == 65535) {
                arg2.field4522 = -1;
            }
        }
        if ((arg0 & 0x80) != 0) {
            int var14 = class293.field5127.method1739((byte) -107);
            int var15 = class293.field5127.method1755(true);
            arg2.method1803(var15, (byte) -127, var14, class116.field2000);
            arg2.field4491 = class116.field2000 + 300;
            arg2.field4489 = class293.field5127.method1733(128);
        }
        if ((arg0 & 0x10) == 0) {
            return;
        }
        int var16 = class293.field5127.method1752((byte) 49);
        int var17 = class293.field5127.method1755(true);
        int var18 = class293.field5127.method1731(true);
        int var19 = class293.field5127.field4314;
        boolean var20 = (var16 & 0x8000) != 0;
        if (arg2.field757 != null && arg2.field721 != null) {
            long var21 = arg2.field757.method743(false);
            boolean var23 = false;
            if (var17 <= 1) {
                if (var20 || (!class106.field1832 || class318.field5457) && !class151.field2737) {
                    for (int var24 = 0; var24 < class176.field3205; var24++) {
                        if (class75.field1153[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                } else {
                    var23 = true;
                }
            }
            if (!var23 && class78.field1193 == 0) {
                class159.field2861.field4314 = 0;
                class293.field5127.method1711(0, class159.field2861.field4338, var18, arg1 ^ 0x56);
                class159.field2861.field4314 = 0;
                int var25 = -1;
                class108 var27;
                if (var20) {
                    class130 var26 = class310.method2164(class159.field2861, 0);
                    var25 = var26.field2231;
                    var16 &= 0x7FFF;
                    var27 = var26.field2223.method227(class159.field2861, -108);
                } else {
                    var27 = class80.method519(class146.method1019(class159.field2861, arg1 ^ 0xFFFFC252).method761((byte) -11));
                }
                arg2.field4467 = var27.method769(-8001);
                arg2.field4524 = 150;
                arg2.field4511 = var16 >> 8;
                arg2.field4523 = var16 & 0xFF;
                if (var17 == 2) {
                    class177.method1257(var25, (class108) null, (byte) -76, var20 ? 17 : 1, var27, class117.method833(new class108[] { class303.field5267, arg2.method359(12) }, false));
                } else if (var17 == 1) {
                    class177.method1257(var25, (class108) null, (byte) -76, var20 ? 17 : 1, var27, class117.method833(new class108[] { class292.field5114, arg2.method359(12) }, false));
                } else {
                    class177.method1257(var25, (class108) null, (byte) -103, var20 ? 17 : 2, var27, arg2.method359(12));
                }
            }
        }
        class293.field5127.field4314 = var18 + var19;
    }
}

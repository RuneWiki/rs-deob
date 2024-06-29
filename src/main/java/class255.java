import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class255 extends class192 {

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "[Lwe;")
    public class54[] field4370;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Loh;")
    private static class258 field4367 = class153.method1046("Loaded textures", 125);

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "Loh;")
    public static class258 field4371 = class153.method1046("(Y<)4col>", 111);

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "Loh;")
    public static class258 field4369 = class153.method1046("m-Ochte mit Ihnen handeln)3", 123);

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "Loh;")
    public static class258 field4374 = class153.method1046("_", 90);

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "[I")
    public static int[] field4380 = new int[100];

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Loh;")
    public static class258 field4378 = field4367;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 4)
    public static void method1718(int arg0) {
        if (arg0 != 0) {
            method1722(-108, -64, -59, -109, -92, -37, 10, -109);
        }
        field4367 = null;
        field4380 = null;
        field4374 = null;
        field4371 = null;
        field4369 = null;
        field4378 = null;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 25)
    public static final void method1719(int arg0) {
        if (arg0 < -63) {
            field4368++;
            class301.field5148.method1157(4);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)Z", line = 39)
    public final boolean method1720(int arg0, int arg1) {
        if (arg0 == -23945) {
            field4375++;
            return this.field4370[arg1].field849;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIIILl;)V", line = 69)
    public static final void method1721(byte arg0, int arg1, int arg2, int arg3, int arg4, class124 arg5) {
        field4377++;
        if (arg5.field2196 == -1 && arg5.field2199 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg5.field2204) {
            var6 += arg4 - arg5.field2204;
        } else if (arg5.field2215 > arg4) {
            var6 += arg5.field2215 - arg4;
        }
        if (arg1 > arg5.field2201) {
            var6 += arg1 - arg5.field2201;
        } else if (arg1 < arg5.field2214) {
            var6 += arg5.field2214 - arg1;
        }
        if (arg5.field2189 == 0 || (var6 - 64) > arg5.field2189 || class317.field5345 == 0 || arg5.field2211 != arg2) {
            if (arg5.field2193 != null) {
                class184.field3279.method112(arg5.field2193);
                arg5.field2193 = null;
            }
            if (arg5.field2213 != null) {
                class184.field3279.method112(arg5.field2213);
                arg5.field2213 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field2189 - var6) * class317.field5345 / arg5.field2189;
        if (arg5.field2193 != null) {
            arg5.field2193.method146(var7);
        } else if (arg5.field2196 >= 0) {
            class309 var8 = class309.method2152(class300.field5132, arg5.field2196, 0);
            if (var8 != null) {
                class198 var9 = var8.method2149().method1328(class310.field5248);
                class22 var10 = class22.method159(var9, 100, var7);
                var10.method153(-1);
                class184.field3279.method116(var10);
                arg5.field2193 = var10;
            }
        }
        if (arg0 != 125) {
            field4369 = (class258) null;
        }
        if (arg5.field2213 != null) {
            arg5.field2213.method146(var7);
            if (!arg5.field2213.method1050((byte) -35)) {
                arg5.field2213 = null;
            }
        } else if (arg5.field2199 != null && (arg5.field2194 -= arg3) <= 0) {
            int var11 = (int) ((double) arg5.field2199.length * Math.random());
            class309 var12 = class309.method2152(class300.field5132, arg5.field2199[var11], 0);
            if (var12 != null) {
                class198 var13 = var12.method2149().method1328(class310.field5248);
                class22 var14 = class22.method159(var13, 100, var7);
                var14.method153(0);
                class184.field3279.method116(var14);
                arg5.field2213 = var14;
                arg5.field2194 = arg5.field2203 + ((int) (Math.random() * (double) (arg5.field2209 - arg5.field2203)));
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)V", line = 199)
    public static final void method1722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4373++;
        if (class75.field1314 <= arg1 && class206.field3562 >= arg5 && class241.field4189 <= arg2 && arg3 <= class94.field1654) {
            class237.method1630(arg2, arg7, arg5, 24126, arg3, arg1, arg6, arg0);
        } else {
            class283.method1982(arg1, arg6, arg0, (byte) -56, arg3, arg7, arg5, arg2);
        }
        if (arg4 != -64) {
            method1718(-122);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lgb;Lgb;IZ)V", line = 214)
    public class255(class213 arg0, class213 arg1, int arg2, boolean arg3) {
        class12 var5 = new class12();
        int var6 = arg0.method1435((byte) -21, arg2);
        this.field4370 = new class54[var6];
        int[] var7 = arg0.method1431(arg2, (byte) -95);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class260 var9 = null;
            byte[] var10 = arg0.method1453(arg2, (byte) -102, var7[var8]);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class260 var12 = (class260) var5.method83(-92); var12 != null; var12 = (class260) var5.method87((byte) -80)) {
                if (var12.field4530 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1436(0, var11, 0);
                } else {
                    var13 = arg1.method1436(0, 0, var11);
                }
                var9 = new class260(var11, var13);
                var5.method82(var9, (byte) -39);
            }
            this.field4370[var7[var8]] = new class54(var10, var9);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(JIIIIILoh;)V", line = 280)
    public static final void method1723(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class258 arg6) {
        field4372++;
        class235 var8 = new class235(128);
        var8.method1598(10, arg1 ^ 0x69AC);
        var8.method1605((int) (Math.random() * 99999.0D), (byte) 115);
        var8.method1605(518, (byte) 50);
        var8.method1603(arg0, -1649350304);
        var8.method1577(true, (int) (Math.random() * 9.9999999E7D));
        var8.method1590(arg6, (byte) -88);
        var8.method1577(true, (int) (Math.random() * 9.9999999E7D));
        var8.method1605(class62.field1097, (byte) 47);
        var8.method1598(arg3, arg1 + 27052);
        var8.method1598(arg5, arg1 + 27052);
        var8.method1577(true, (int) (Math.random() * 9.9999999E7D));
        var8.method1605(arg4, (byte) 90);
        var8.method1605(arg2, (byte) 69);
        var8.method1577(true, (int) (Math.random() * 9.9999999E7D));
        var8.method1566(26220, class301.field5143, class162.field2727);
        class159.field2710.field4051 = 0;
        class159.field2710.method1598(75, arg1 + 27052);
        class159.field2710.method1598(var8.field4051, arg1 ^ 0x69AC);
        class159.field2710.method1565(var8.field4051, var8.field4066, arg1, 119);
        class165.field2810 = 1;
        class246.field4275 = -3;
        class260.field4521 = 0;
        class74.field1293 = 0;
    }
}

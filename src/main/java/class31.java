import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class31 extends class34 {

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public int field489 = 12800;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Z")
    public boolean field493 = true;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public int field492 = 0;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public int field497 = -1;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public int field487 = 12800;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public int field504 = -1;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public int field508 = 0;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lke;")
    public class256 field506;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lke;")
    public class256 field507;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "Lij;")
    public class175 field495;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static volatile int field500 = 0;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "Z")
    public static boolean field505 = true;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Lrj;")
    public static class254 field498 = new class254(16);

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "Lke;")
    public static class256 field509;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "[I")
    public static int[] field490;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method218(byte arg0, int arg1) {
        field503++;
        class227 var2;
        if (class253.field4323 || class96.field1707 == null) {
            var2 = new class227(512, 512);
        } else {
            var2 = (class227) class96.field1707;
        }
        int[] var3 = var2.field3921;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = ((52736 - (var6 * 512)) * 4) + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class308.field5296[arg1][var8][var6] & 0x18) == 0) {
                    class182.method1336(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class308.field5296[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class182.method1336(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method1548();
        int var9 = ((int) (Math.random() * 20.0D) - 10) + 238 << 16;
        int var10 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + 228;
        int var11 = 88 / ((51 - arg0) / 59);
        for (int var12 = 1; var12 < 103; var12++) {
            for (int var13 = 1; var13 < 103; var13++) {
                if ((class308.field5296[arg1][var13][var12] & 0x18) == 0) {
                    class92.method679(arg1, var9, -84, var13, var12, var10);
                }
                if (arg1 < 3 && (class308.field5296[arg1 + 1][var13][var12] & 0x8) != 0) {
                    class92.method679(arg1 + 1, var9, -63, var13, var12, var10);
                }
            }
        }
        class124.field2202 = 0;
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                long var16 = client.method824(class255.field4377, var14, var15);
                if (var16 != 0L) {
                    class273 var18 = class271.method1871(123, (int) (var16 >>> 32) & Integer.MAX_VALUE);
                    int var19 = var18.field4692;
                    if (var18.field4664 != null) {
                        for (int var20 = 0; var20 < var18.field4664.length; var20++) {
                            if (var18.field4664[var20] != -1) {
                                class273 var21 = class271.method1871(125, var18.field4664[var20]);
                                if (var21.field4692 >= 0) {
                                    var19 = var21.field4692;
                                    break;
                                }
                            }
                        }
                    }
                    if (var19 >= 0) {
                        int var22 = var15;
                        int var23 = var14;
                        if (var19 != 22 && var19 != 29 && var19 != 34 && var19 != 36 && var19 != 46 && var19 != 47 && var19 != 48) {
                            int[][] var24 = class124.field2201[class255.field4377].field653;
                            for (int var25 = 0; var25 < 10; var25++) {
                                int var26 = (int) (Math.random() * 4.0D);
                                if (var26 == 0 && var23 > 0 && (var14 - 3) < var23 && (var24[var23 - 1][var22] & 0x12C0108) == 0) {
                                    var23--;
                                }
                                if (var26 == 1 && var23 < 103 && (var14 + 3) > var23 && (var24[var23 + 1][var22] & 0x12C0180) == 0) {
                                    var23++;
                                }
                                if (var26 == 2 && var22 > 0 && var22 > var15 - 3 && (var24[var23][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var26 == 3 && var22 < 103 && (var15 + 3) > var22 && (var24[var23][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class140.field2462[class124.field2202] = var18.field4684;
                        class308.field5307[class124.field2202] = var23;
                        class273.field4698[class124.field2202] = var22;
                        class124.field2202++;
                    }
                }
            }
        }
        if (class253.field4323) {
            for (int var27 = 0; var27 < var4; var27++) {
                if (var3[var27] == 0) {
                    var3[var27] = 1;
                }
            }
            class96.field1707 = new class87(var2);
        } else {
            class96.field1707 = var2;
        }
        if (class253.field4323) {
            class178.field3146 = null;
        } else {
            class108.field1920.method1182(48);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 207)
    public static void method219(byte arg0) {
        field509 = null;
        field498 = null;
        field490 = null;
        if (arg0 >= -71) {
            method218((byte) -98, 87);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)Z", line = 226)
    public final boolean method220(byte arg0, int arg1, int arg2) {
        field488++;
        if (this.field489 > arg1 || arg1 > this.field492 || arg2 < this.field487 || arg2 > this.field508) {
            return false;
        }
        if (arg0 < 104) {
            method218((byte) 39, -16);
        }
        for (class71 var4 = (class71) this.field495.method1270((byte) -121); var4 != null; var4 = (class71) this.field495.method1277(1)) {
            if (var4.method543(arg2, 0, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILng;I)[Lel;", line = 261)
    public static final class232[] method221(int arg0, int arg1, class138 arg2, int arg3) {
        field494++;
        if (class83.method611(arg1, -99, arg2, arg0)) {
            return arg3 == -1 ? class215.method1503(125) : (class232[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lke;Lke;IIIZI)V", line = 384)
    public class31(class256 arg0, class256 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field501 = arg2;
        this.field493 = arg5;
        this.field504 = arg6;
        this.field491 = arg3;
        if (this.field504 == 255) {
            this.field504 = 0;
        }
        this.field506 = arg0;
        this.field497 = arg4;
        this.field507 = arg1;
        this.field495 = new class175();
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 286)
    public final void method222(byte arg0) {
        this.field487 = 12800;
        this.field489 = 12800;
        this.field508 = 0;
        this.field492 = 0;
        for (class71 var2 = (class71) this.field495.method1270((byte) -121); var2 != null; var2 = (class71) this.field495.method1277(1)) {
            if (this.field487 > var2.field1305) {
                this.field487 = var2.field1305;
            }
            if (var2.field1304 > this.field508) {
                this.field508 = var2.field1304;
            }
            if (var2.field1297 < this.field489) {
                this.field489 = var2.field1297;
            }
            if (var2.field1312 > this.field492) {
                this.field492 = var2.field1312;
            }
        }
        if (arg0 >= -70) {
            method224(44);
        }
        field486++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 325)
    public static final void method223(int arg0, int arg1) {
        field496++;
        if (arg1 != -12876) {
            field500 = 42;
        }
        class294.field5107.method2075(arg0, 1);
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V", line = 337)
    public static final void method224(int arg0) {
        field499++;
        class59.field1071.method2076(124);
        class80.field1487.method2076(127);
        int var1 = -21 / ((-arg0 - 54) / 44);
    }
}

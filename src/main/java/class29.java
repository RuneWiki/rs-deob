import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class29 extends class242 {

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Ljf;")
    public class229 field515;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Ljf;")
    public static class229 field504 = class212.method1457((byte) 123, "Mem:");

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Ljf;")
    public static class229 field514 = class212.method1457((byte) 88, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lek;")
    public static class185 field505;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lek;")
    public static class185 field513;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    public static int[] field511;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 5)
    public static final int method249(int arg0, int arg1) {
        if (arg0 != 20) {
            method250(-109);
        }
        field506++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 17)
    public static final void method250(int arg0) {
        field509++;
        class117.field2091.method226((byte) -115);
        if (arg0 != 0) {
            field504 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V", line = 33)
    public static final void method251(int arg0, int arg1) {
        field510++;
        class159 var2;
        if (class108.field1900 || class123.field2173 == null) {
            var2 = new class159(512, 512);
        } else {
            var2 = (class159) class123.field2173;
        }
        int[] var3 = var2.field2708;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class142.field2464[arg1][var8][var6] & 0x18) == 0) {
                    class211.method1452(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class142.field2464[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class211.method1452(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method1073();
        int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class142.field2464[arg1][var12][var11] & 0x18) == 0) {
                    class42.method369(var12, arg1, var9, var11, -81, var10);
                }
                if (arg1 < 3 && (class142.field2464[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class42.method369(var12, arg1 + 1, var9, var11, -56, var10);
                }
            }
        }
        class301.field5128 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class124.method880(class16.field254, var13, var14);
                if (var15 != 0L) {
                    class83 var17 = class271.method1909(arg0 ^ 0xFFFFFFFD, Integer.MAX_VALUE & (int) (var15 >>> 32));
                    int var18 = var17.field1578;
                    if (var17.field1593 != null) {
                        for (int var19 = 0; var19 < var17.field1593.length; var19++) {
                            if (var17.field1593[var19] != -1) {
                                class83 var20 = class271.method1909(arg0 + 115, var17.field1593[var19]);
                                if (var20.field1578 >= 0) {
                                    var18 = var20.field1578;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var14;
                        int var22 = var13;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class80.field1460[class16.field254].field4331;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var22 > 0 && var22 > (var13 - 3) && (var23[var22 - 1][var21] & 0x12C0108) == 0) {
                                    var22--;
                                }
                                if (var25 == 1 && var22 < 103 && (var13 + 3) > var22 && (var23[var22 + 1][var21] & 0x12C0180) == 0) {
                                    var22++;
                                }
                                if (var25 == 2 && var21 > 0 && var21 > var14 - 3 && (var23[var22][var21 - 1] & 0x12C0102) == 0) {
                                    var21--;
                                }
                                if (var25 == 3 && var21 < 103 && var21 < (var14 + 3) && (var23[var22][var21 + 1] & 0x12C0120) == 0) {
                                    var21++;
                                }
                            }
                        }
                        class56.field995[class301.field5128] = var17.field1580;
                        class27.field476[class301.field5128] = var22;
                        class90.field1649[class301.field5128] = var21;
                        class301.field5128++;
                    }
                }
            }
        }
        if (arg0 != 2) {
            field513 = (class185) null;
        }
        if (class108.field1900) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class123.field2173 = new class326(var2);
        } else {
            class123.field2173 = var2;
        }
        if (class108.field1900) {
            class114.field2050 = null;
        } else {
            class172.field2977.method184(-11271);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 260)
    public static void method252(byte arg0) {
        field513 = null;
        field504 = null;
        field514 = null;
        if (arg0 <= 105) {
            field505 = (class185) null;
        }
        field511 = null;
        field505 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 274)
    public class29() {
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljf;)V", line = 276)
    public class29(class229 arg0) {
        this.field515 = arg0;
    }
}

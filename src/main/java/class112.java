import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class112 {

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lkh;")
    public static class117 field2110 = class224.method1450((byte) -90, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public static int[] field2106 = new int[2000];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lai;")
    public static class10 field2108;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lvb;")
    public static class232 field2104;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[S")
    public static short[] field2099;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[S")
    public static short[] field2107;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
    public static final boolean method754(byte arg0, int arg1) {
        int var2 = -94 % ((-arg0 - 46) / 58);
        field2102++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method755(int arg0) {
        if (arg0 != 9584) {
            field2106 = null;
        }
        field2109++;
        if (class199.field3581 != null) {
            class103 var1 = class199.field3581;
            synchronized (class199.field3581) {
                class199.field3581 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public static final void method756(int arg0, int arg1) {
        field2103++;
        class144 var2;
        if (class78.field1485 == null) {
            var2 = new class144(512, 512);
        } else {
            var2 = (class144) class78.field1485;
        }
        int[] var3 = var2.field2602;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        if (arg1 != -35) {
            method755(-109);
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var22 = (103 - var6) * 2048 + 24628;
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class233.field4200[arg0][var23][var6] & 0x18) == 0) {
                    class69.method485(var3, var22, 512, arg0, var23, var6);
                }
                if (arg0 < 3 && (class233.field4200[arg0 + 1][var23][var6] & 0x8) != 0) {
                    class69.method485(var3, var22, 512, arg0 + 1, var23, var6);
                }
                var22 += 4;
            }
        }
        var2.method976();
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class233.field4200[arg0][var21][var9] & 0x18) == 0) {
                    class97.method657(var21, var7, arg0, false, var8, var9);
                }
                if (arg0 < 3 && (class233.field4200[arg0 + 1][var21][var9] & 0x8) != 0) {
                    class97.method657(var21, var7, arg0 + 1, false, var8, var9);
                }
            }
        }
        class32.field758 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class207.method1363(class203.field3675, var10, var11);
                if (var12 != 0L) {
                    class211 var14 = class48.method379(89, Integer.MAX_VALUE & (int) (var12 >>> 32));
                    int var15 = var14.field3833;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var10;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = class173.field3123[class203.field3675].field45;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var17 > 0 && var10 - 3 < var17 && (var18[var17 - 1][var16] & 0x12C0108) == 0) {
                                    var17--;
                                }
                                if (var20 == 1 && var17 < 103 && var10 + 3 > var17 && (var18[var17 + 1][var16] & 0x12C0180) == 0) {
                                    var17++;
                                }
                                if (var20 == 2 && var16 > 0 && var16 > var11 - 3 && (var18[var17][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var20 == 3 && var16 < 103 && var16 < var11 + 3 && (var18[var17][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class92.field1688[class32.field758] = var14.field3830;
                        class212.field3862[class32.field758] = var17;
                        class19.field534[class32.field758] = var16;
                        class32.field758++;
                    }
                }
            }
        }
        class78.field1485 = var2;
        class23.field588.method884((byte) 127);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method757(int arg0) {
        field2107 = null;
        field2108 = null;
        if (arg0 != 10) {
            field2106 = null;
        }
        field2104 = null;
        field2110 = null;
        field2106 = null;
        field2099 = null;
    }
}

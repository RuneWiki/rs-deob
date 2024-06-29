import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class78 extends class197 {

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    private int field1338 = 0;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    private int field1346 = 1;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field1340 = 0;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Loh;")
    public static class258 field1337 = class153.method1046("Benutzen", 116);

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1345 = 0;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "Loh;")
    public static class258 field1341 = class153.method1046(" steht bereits auf Ihrer Freunde)2Liste(Q", 108);

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            this.field1338 = -34;
        }
        field1349++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class190.field3362; var6++) {
                int var7 = class166.field2822[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1340 == 0) {
                    var11 = (var7 - var4) * this.field1346;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1346 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field1338 == 0) {
                    var12 = class72.field1278[(var12 & 0xFF0) >> 4] + 4096 >> 1;
                } else if (this.field1338 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILoh;)I", line = 85)
    public static final int method559(int arg0, class258 arg1) {
        field1343++;
        int var2 = 27 % ((arg0 + 64) / 44);
        if (class65.field1144 == null || arg1.method1816(false) == 0) {
            return -1;
        }
        for (int var3 = 0; var3 < class65.field1144.field3856; var3++) {
            if (class65.field1144.field3851[var3].method1773(144, class225.field3869, class50.field765).method1800(arg1, 26068)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 111)
    public static final void method560(int arg0, int arg1) {
        if (arg1 != -1) {
            method564(-21, (class213) null);
        }
        field1339++;
        class91.field1596.method1156(arg0, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V", line = 123)
    public static final void method561(int arg0, int arg1, int arg2, int arg3) {
        class286 var4 = class48.method389(arg0, 9, 10738);
        field1348++;
        var4.method2017(-79);
        var4.field4932 = arg2;
        if (arg3 < 64) {
            field1345 = 47;
        }
        var4.field4926 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Lb;", line = 141)
    public static final class84 method562(int arg0, int arg1) {
        field1336++;
        class84 var2 = (class84) class146.field2475.method701((long) arg0, 1);
        if (arg1 != 26386) {
            return (class84) null;
        } else if (var2 == null) {
            byte[] var3 = class306.field5197.method1453(11, (byte) -59, arg0);
            class84 var4 = new class84();
            if (var3 != null) {
                var4.method605(new class235(var3), -103);
            }
            class146.field2475.method698((long) arg0, (byte) 86, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 166)
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 170)
    public static final void method563(boolean arg0) {
        field1344++;
        if (!arg0) {
            field1334 = 84;
        }
        for (int var1 = -1; var1 < class14.field177; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class140.field2390[var1];
            }
            class231 var3 = class38.field527[var2];
            if (var3 != null && var3.field972 > 0) {
                var3.field972--;
                if (var3.field972 == 0) {
                    var3.field944 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class226.field3895; var4++) {
            int var5 = class92.field1616[var4];
            class107 var6 = class16.field214[var5];
            if (var6 != null && var6.field972 > 0) {
                var6.field972--;
                if (var6.field972 == 0) {
                    var6.field944 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILgb;)V", line = 235)
    public static final void method564(int arg0, class213 arg1) {
        field1347++;
        class114.field1967 = class88.method634(-95, class248.field4286, arg1);
        class11.field148 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class312.field5299[var2] >> 16 & 0xFF);
            int var4 = class312.field5299[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            int var6 = class312.field5299[var2 + 1] >> 8 & 0xFF;
            float var7 = (float) ((class312.field5299[var2] & 0xFF00) >> 8);
            float var8 = ((float) var6 - var7) / 64.0F;
            float var9 = (float) (class312.field5299[var2] & 0xFF);
            int var10 = class312.field5299[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class11.field148[var2 * 64 + var12] = class307.method2139((int) var9, class307.method2139((int) var3 << 16, (int) var7 << 8));
                var7 += var8;
                var9 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class11.field148[var13] = class312.field5299[3];
        }
        class268.field4664 = new int[32768];
        class69.field1196 = new int[32768];
        class286.method2013((class129) null, -5416);
        class188.field3340 = new int[32768];
        class5.field66 = new int[32768];
        if (class257.field4390) {
            class256.field4389 = new class274(128, 254);
        } else {
            class256.field4389 = new class41(128, 254);
        }
        if (arg0 != 6140) {
            field1345 = 92;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(Z)V", line = 312)
    public static void method565(boolean arg0) {
        field1337 = null;
        if (arg0) {
            method559(70, (class258) null);
        }
        field1341 = null;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)V", line = 325)
    public static final void method566(byte arg0) {
        class51.field819.method1157(4);
        field1333++;
        int var1 = -48 % ((54 - arg0) / 55);
        class226.field3886.method1157(4);
        class308.field5224.method1157(4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 350)
    public final void method223(int arg0) {
        if (arg0 != 11135) {
            this.field1338 = -66;
        }
        class72.method540((byte) -128);
        field1342++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILva;I)V", line = 374)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1340 = arg1.method1589(arg0 ^ 0x1F5B);
        } else if (arg2 == 1) {
            this.field1338 = arg1.method1589(91);
        } else if (arg2 == 3) {
            this.field1346 = arg1.method1589(112);
        }
        field1335++;
        if (arg0 != 7955) {
            method563(false);
        }
    }
}

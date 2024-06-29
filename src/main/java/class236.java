import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class236 extends class46 {

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Z")
    public boolean field4260 = false;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public int field4265 = -1;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field4257 = -1;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public int field4268 = -1;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public int field4263 = -1;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public int field4271 = 5;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public int field4264 = -1;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public int field4273 = 2;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public int field4267 = 99;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lmb;")
    public static class132 field4259 = class166.method1092("<col=ff9040>", 116);

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
    public static int[] field4270 = new int[100];

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lmb;")
    public static class132 field4272 = class166.method1092("details)3dat", 113);

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Llc;")
    public static class122 field4269 = new class122(512);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lmb;")
    public static class132 field4282 = class166.method1092("Bitte warten Sie eine Minute", 127);

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lmb;")
    public static class132 field4281 = class166.method1092(":assist:", 118);

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
    public static int[] field4283 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field4284 = 0;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "[I")
    public static int[] field4285 = new int[32];

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4261;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
    public int[] field4253;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
    public int[] field4258;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "[I")
    public int[] field4274;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "[I")
    private int[] field4275;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
    private int[] field4276;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lug;IB)Lug;")
    public final class221 method1493(class221 arg0, int arg1, byte arg2) {
        int var4 = this.field4274[arg1];
        field4266++;
        class218 var5 = class148.method987(var4 >> 16, (byte) -106);
        int var6 = var4 & 0xFFFF;
        if (arg2 != -120) {
            this.method1494(-113, null, -78);
        }
        if (var5 == null) {
            return arg0.method1378(true);
        } else {
            class221 var7 = arg0.method1378(!var5.method1361(var6, false));
            var7.method1382(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILkd;I)V")
    private final void method1494(int arg0, class112 arg1, int arg2) {
        if (arg0 != 2040765456) {
            this.field4260 = true;
        }
        if (arg2 == 1) {
            int var11 = arg1.method739(-124);
            this.field4253 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field4253[var12] = arg1.method739(-20);
            }
            this.field4274 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field4274[var13] = arg1.method739(arg0 - 2040765409);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field4274[var14] = (arg1.method739(-127) << 16) + this.field4274[var14];
            }
        } else if (arg2 == 2) {
            this.field4265 = arg1.method739(-123);
        } else if (arg2 == 3) {
            int var4 = arg1.method716(-1308);
            this.field4275 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4275[var5] = arg1.method716(-1308);
            }
            this.field4275[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field4260 = true;
        } else if (arg2 == 5) {
            this.field4271 = arg1.method716(-1308);
        } else if (arg2 == 6) {
            this.field4257 = arg1.method739(-24);
        } else if (arg2 == 7) {
            this.field4263 = arg1.method739(62);
        } else if (arg2 == 8) {
            this.field4267 = arg1.method716(-1308);
        } else if (arg2 == 9) {
            this.field4264 = arg1.method716(arg0 - 2040766764);
        } else if (arg2 == 10) {
            this.field4268 = arg1.method716(-1308);
        } else if (arg2 == 11) {
            this.field4273 = arg1.method716(-1308);
        } else if (arg2 == 12) {
            int var6 = arg1.method716(-1308);
            this.field4276 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4276[var7] = arg1.method739(arg0 - 2040765579);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field4276[var8] = (arg1.method739(106) << 16) + this.field4276[var8];
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method716(-1308);
            this.field4258 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4258[var10] = arg1.method718(false);
            }
        }
        field4279++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILug;Lwb;BI)Lug;")
    public final class221 method1495(int arg0, class221 arg1, class236 arg2, byte arg3, int arg4) {
        int var6 = this.field4274[arg0];
        field4280++;
        class218 var7 = class148.method987(var6 >> 16, (byte) 85);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1493(arg1, arg4, (byte) -120);
        }
        int var9 = arg2.field4274[arg4];
        class218 var10 = class148.method987(var9 >> 16, (byte) -33);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class221 var12 = arg1.method1378(!var7.method1361(var8, false));
            var12.method1382(var7, var8);
            return var12;
        } else {
            class221 var13 = arg1.method1378(!var7.method1361(var8, false) & !var10.method1361(var11, false));
            var13.method1381(var7, var8, var10, var11, this.field4275);
            int var14 = 87 / ((77 - arg3) / 44);
            return var13;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkd;B)V")
    public final void method1496(class112 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                field4254++;
                if (arg1 != 2) {
                    this.method1495(100, null, null, (byte) -18, 34);
                    return;
                }
                return;
            }
            this.method1494(2040765456, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
    public final void method1497(byte arg0) {
        field4256++;
        if (this.field4264 == -1) {
            if (this.field4275 == null) {
                this.field4264 = 0;
            } else {
                this.field4264 = 2;
            }
        }
        if (arg0 != -84 || this.field4268 != -1) {
            return;
        }
        if (this.field4275 == null) {
            this.field4268 = 0;
        } else {
            this.field4268 = 2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(B)[Lvi;")
    public static final class233[] method1498(byte arg0) {
        field4277++;
        class233[] var1 = new class233[class235.field4248];
        if (arg0 != -13) {
            field4270 = null;
        }
        for (int var2 = 0; var2 < class235.field4248; var2++) {
            int var3 = class94.field1657[var2] * class153.field2793[var2];
            byte[] var4 = class10.field109[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class118.field2244[class75.method450(255, var4[var6])];
            }
            var1[var2] = new class18(class153.field2792, class140.field2619, class23.field321[var2], class30.field462[var2], class94.field1657[var2], class153.field2793[var2], var5);
        }
        class187.method1193(1);
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lug;II)Lug;")
    public final class221 method1499(class221 arg0, int arg1, int arg2) {
        int var4 = this.field4274[arg1];
        class218 var5 = class148.method987(var4 >> 16, (byte) 96);
        int var6 = var4 & 0xFFFF;
        field4278++;
        int var7 = -68 / ((-arg2 - 5) / 55);
        if (var5 == null) {
            return arg0.method1386(true);
        } else {
            class221 var8 = arg0.method1386(!var5.method1361(var6, false));
            var8.method1382(var5, var6);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field4282 = null;
        field4285 = null;
        if (arg0 > -98) {
            method1498((byte) -67);
        }
        field4272 = null;
        field4259 = null;
        field4281 = null;
        field4270 = null;
        field4283 = null;
        field4261 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILug;I)Lug;")
    public final class221 method1501(boolean arg0, int arg1, class221 arg2, int arg3) {
        int var5 = this.field4274[arg1];
        class218 var6 = class148.method987(var5 >> 16, (byte) -34);
        int var7 = var5 & 0xFFFF;
        field4255++;
        if (arg0) {
            this.method1497((byte) 92);
        }
        if (var6 == null) {
            return arg2.method1378(true);
        }
        int var8 = arg3 & 0x3;
        class221 var9 = arg2.method1378(!var6.method1361(var7, arg0));
        if (var8 == 1) {
            var9.method1385();
        } else if (var8 == 2) {
            var9.method1380();
        } else if (var8 == 3) {
            var9.method1387();
        }
        var9.method1382(var6, var7);
        if (var8 == 1) {
            var9.method1387();
        } else if (var8 == 2) {
            var9.method1380();
        } else if (var8 == 3) {
            var9.method1385();
        }
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lug;II)Lug;")
    public final class221 method1502(class221 arg0, int arg1, int arg2) {
        int var4 = this.field4274[arg2];
        class218 var5 = class148.method987(var4 >> 16, (byte) 96);
        int var6 = var4 & 0xFFFF;
        field4262++;
        int var7 = -123 / ((-arg1 - 57) / 62);
        if (var5 == null) {
            return arg0.method1378(true);
        }
        int var8 = 0;
        class218 var9 = null;
        if (this.field4276 != null && arg2 < this.field4276.length) {
            int var10 = this.field4276[arg2];
            var9 = class148.method987(var10 >> 16, (byte) -70);
            var8 = var10 & 0xFFFF;
        }
        if (var9 == null || var8 == 65535) {
            class221 var12 = arg0.method1378(!var5.method1361(var6, false));
            var12.method1382(var5, var6);
            return var12;
        } else {
            class221 var11 = arg0.method1378(!var5.method1361(var6, false) & !var9.method1361(var8, false));
            var11.method1382(var5, var6);
            var11.method1382(var9, var8);
            return var11;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4285[var1] = var0 - 1;
            var0 += var0;
        }
        field4286 = 0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 extends class106 {

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field415 = -1;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
    public boolean field425 = false;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public int field420 = 5;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public int field416 = -1;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
    public int field433 = 99;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public int field421 = -1;

    @OriginalMember(owner = "client!ca", name = "hb", descriptor = "I")
    public int field441 = -1;

    @OriginalMember(owner = "client!ca", name = "ib", descriptor = "I")
    public int field442 = 2;

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
    public int field440 = -1;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "Z")
    public static boolean field435 = true;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Lib;")
    public static class75 field418 = new class75(5000);

    @OriginalMember(owner = "client!ca", name = "jb", descriptor = "[I")
    public static int[] field443 = new int[25];

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "J")
    public static long field436;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lah;")
    public static class9 field432;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
    public int[] field419;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
    public int[] field423;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "[I")
    public int[] field430;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "[I")
    private int[] field434;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILd;I)Ld;")
    public final class30 method213(int arg0, class30 arg1, int arg2) {
        field422++;
        int var4 = this.field430[arg2];
        class109 var5 = class99.method802(17582, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg0 != 2) {
            field436 = -11L;
        }
        if (var5 == null) {
            return arg1.method41(true);
        } else {
            class30 var7 = arg1.method41(!var5.method879((byte) 64, var6));
            var7.method40(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static void method214(int arg0) {
        field443 = null;
        if (arg0 == 5000) {
            field418 = null;
            field432 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIII)V")
    public static final void method215(byte arg0, int arg1, int arg2, int arg3) {
        field439++;
        if (class60.field1169 != 0 && arg1 != 0 && class35.field688 < 50) {
            class21.field398[class35.field688] = arg3;
            client.field553[class35.field688] = arg1;
            class100.field2106[class35.field688] = arg2;
            class52.field997[class35.field688] = null;
            class110.field2273[class35.field688] = 0;
            class35.field688++;
        }
        if (arg0 > -66) {
            field436 = 34L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILd;II)Ld;")
    public final class30 method216(int arg0, class30 arg1, int arg2, int arg3) {
        int var5 = this.field430[arg3];
        field429++;
        class109 var6 = class99.method802(17582, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method41(true);
        }
        int var8 = arg2 & arg0;
        class30 var9 = arg1.method41(!var6.method879((byte) 64, var7));
        if (var8 == 1) {
            var9.method273();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method265();
        }
        var9.method40(var6, var7);
        if (var8 == 1) {
            var9.method265();
        } else if (var8 == 2) {
            var9.method270();
        } else if (var8 == 3) {
            var9.method273();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILd;ILca;I)Ld;")
    public final class30 method217(int arg0, class30 arg1, int arg2, class22 arg3, int arg4) {
        field426++;
        int var6 = this.field430[arg4];
        class109 var7 = class99.method802(17582, var6 >> 16);
        int var8 = var6 & arg0;
        if (var7 == null) {
            return arg3.method213(arg0 ^ 0xFFFD, arg1, arg2);
        }
        int var9 = arg3.field430[arg2];
        class109 var10 = class99.method802(17582, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class30 var12 = arg1.method41(!var7.method879((byte) 64, var8));
            var12.method40(var7, var8);
            return var12;
        } else {
            class30 var13 = arg1.method41(!var7.method879((byte) 64, var8) & !var10.method879((byte) 64, var11));
            var13.method38(var7, var8, var10, var11, this.field424);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(ILd;I)Ld;")
    public final class30 method218(int arg0, class30 arg1, int arg2) {
        int var4 = this.field430[arg0];
        field428++;
        class109 var5 = class99.method802(17582, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method41(true);
        }
        int var7 = 0;
        class109 var8 = null;
        if (this.field434 != null && arg0 < this.field434.length) {
            int var9 = this.field434[arg0];
            var8 = class99.method802(17582, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class30 var12 = arg1.method41(!var5.method879((byte) 64, var6));
            var12.method40(var5, var6);
            return var12;
        }
        class30 var10 = arg1.method41(!var5.method879((byte) 64, var6) & !var8.method879((byte) 64, var7));
        var10.method40(var5, var6);
        var10.method40(var8, var7);
        int var11 = -6 / ((-arg2 - 74) / 34);
        return var10;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILah;IB)Lfb;")
    public static final class50 method219(int arg0, class9 arg1, int arg2, byte arg3) {
        if (arg3 < 121) {
            field435 = false;
        }
        field438++;
        return class187.method1240(arg0, (byte) -49, arg2, arg1) ? class81.method687(false) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lhd;Z)V")
    public final void method220(class68 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method604((byte) -40);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field431++;
                return;
            }
            this.method221(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lhd;II)V")
    private final void method221(class68 arg0, int arg1, int arg2) {
        field437++;
        if (arg1 == arg2) {
            int var4 = arg0.method569(arg2 ^ 0x6781);
            this.field419 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field419[var5] = arg0.method569(26496);
            }
            this.field430 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field430[var6] = arg0.method569(26496);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field430[var7] = (arg0.method569(26496) << 16) + this.field430[var7];
            }
        } else if (arg1 == 2) {
            this.field416 = arg0.method569(arg2 ^ 0x6781);
        } else if (arg1 == 3) {
            int var8 = arg0.method604((byte) -124);
            this.field424 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field424[var9] = arg0.method604((byte) 34);
            }
            this.field424[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field425 = true;
        } else if (arg1 == 5) {
            this.field420 = arg0.method604((byte) -123);
        } else if (arg1 == 6) {
            this.field441 = arg0.method569(26496);
        } else if (arg1 == 7) {
            this.field415 = arg0.method569(26496);
        } else if (arg1 == 8) {
            this.field433 = arg0.method604((byte) 88);
        } else if (arg1 == 9) {
            this.field440 = arg0.method604((byte) 48);
        } else if (arg1 == 10) {
            this.field421 = arg0.method604((byte) -125);
        } else if (arg1 == 11) {
            this.field442 = arg0.method604((byte) -128);
        } else if (arg1 == 12) {
            int var10 = arg0.method604((byte) 28);
            this.field434 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field434[var11] = arg0.method569(class136.method989(arg2, 26497));
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field434[var12] += arg0.method569(class136.method989(arg2, 26497)) << 16;
            }
            return;
        } else if (arg1 == 13) {
            int var13 = arg0.method604((byte) -124);
            this.field423 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field423[var14] = arg0.method613(true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLd;)Ld;")
    public final class30 method222(int arg0, byte arg1, class30 arg2) {
        field427++;
        int var4 = this.field430[arg0];
        class109 var5 = class99.method802(17582, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method43(true);
        }
        if (arg1 >= -24) {
            this.field441 = 109;
        }
        class30 var7 = arg2.method43(!var5.method879((byte) 64, var6));
        var7.method40(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public final void method223(int arg0) {
        field417++;
        if (this.field421 == -1) {
            if (this.field424 == null) {
                this.field421 = 0;
            } else {
                this.field421 = 2;
            }
        }
        if (this.field440 == -1) {
            if (this.field424 == null) {
                this.field440 = 0;
            } else {
                this.field440 = 2;
            }
        }
        if (arg0 != 0) {
            this.method223(112);
        }
    }
}

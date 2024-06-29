import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class1 extends class97 {

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public int field8 = -1;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public int field6 = -1;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    public int field17 = 99;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    public int field23 = 2;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
    public int field22 = 5;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public int field11 = -1;

    @OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
    public int field32 = -1;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Z")
    public boolean field20 = false;

    @OriginalMember(owner = "client!aa", name = "zb", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lke;")
    public static class65 field1 = method17("backhmid2", -126);

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Lke;")
    public static class65 field13 = method17("(U5", -124);

    @OriginalMember(owner = "client!aa", name = "xb", descriptor = "Lke;")
    private static class65 field33 = method17(" more options", -117);

    @OriginalMember(owner = "client!aa", name = "rb", descriptor = "Lke;")
    public static class65 field27 = method17("@gr2@", -112);

    @OriginalMember(owner = "client!aa", name = "Ab", descriptor = "[I")
    public static int[] field36 = new int[5];

    @OriginalMember(owner = "client!aa", name = "Bb", descriptor = "Lke;")
    public static class65 field37 = field33;

    @OriginalMember(owner = "client!aa", name = "qb", descriptor = "Lqd;")
    public static class100 field26 = new class100(64);

    @OriginalMember(owner = "client!aa", name = "Eb", descriptor = "Lke;")
    private static class65 field40 = method17("You are standing in a members)2only area)3", -121);

    @OriginalMember(owner = "client!aa", name = "Db", descriptor = "Lke;")
    public static class65 field39 = field40;

    @OriginalMember(owner = "client!aa", name = "Gb", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!aa", name = "Fb", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "vb", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aa", name = "Cb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
    private int[] field12;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[I")
    private int[] field2;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "[I")
    public int[] field21;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "[I")
    public int[] field24;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 5)
    public static void method1(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1 = null;
        field13 = null;
        field33 = null;
        field39 = null;
        field36 = null;
        field40 = null;
        field37 = null;
        field26 = null;
        field27 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZLjd;Ljd;Z)Lua;", line = 29)
    public static final class117 method2(int arg0, boolean arg1, class58 arg2, class58 arg3, boolean arg4) {
        field9++;
        int[] var5 = arg2.method478(false, arg0);
        boolean var6 = arg4;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method483(arg0, var5[var7], (byte) 46);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method483(0, var9, (byte) 46);
                } else {
                    var10 = arg3.method483(var9, 0, (byte) 46);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class117(arg2, arg3, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method3(boolean arg0) {
        for (int var1 = 0; var1 < class113.field2818; var1++) {
            int var2 = class56.field1464[var1];
            class129 var3 = class31.field817[var2];
            if (var3 != null) {
                class46.method391((byte) 21, var3.field3126.field1406, var3);
            }
        }
        field4++;
        if (arg0) {
            field36 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILg;)V", line = 106)
    public final void method4(int arg0, class39 arg1) {
        while (true) {
            int var3 = arg1.method334(115);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field15++;
                return;
            }
            this.method13(arg1, (byte) -82, var3);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lga;IBILaa;)Lga;", line = 133)
    public final class37 method5(class37 arg0, int arg1, byte arg2, int arg3, class1 arg4) {
        int var6 = this.field21[arg3];
        field30++;
        class117 var7 = class89.method785(var6 >> 16, false);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method9(false, arg1, arg0);
        }
        int var9 = arg4.field21[arg1];
        if (arg2 != 24) {
            field39 = null;
        }
        class117 var10 = class89.method785(var9 >> 16, false);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class37 var12 = arg0.method282(!var7.method956(var8, 303));
            var12.method290(var7, var8);
            return var12;
        } else {
            class37 var13 = arg0.method282(!var7.method956(var8, arg2 ^ 0x137) & !var10.method956(var11, 303));
            var13.method270(var7, var8, var10, var11, this.field2);
            return var13;
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(B)V", line = 175)
    public static final void method6(byte arg0) {
        class55.field1412 = 0;
        int var1 = (class32.field833.field1070 >> 7) + class86.field2295;
        field14++;
        if (arg0 <= 106) {
            method14(69, -8, -83, -55);
        }
        int var2 = (class32.field833.field1067 >> 7) + class20.field494;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class55.field1412 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class55.field1412 = 1;
        }
        if (class55.field1412 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class55.field1412 = 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V", line = 208)
    public static final void method7(boolean arg0) {
        if (class98.field2541 != null) {
            class98.field2541.method73(113);
            class98.field2541 = null;
        }
        field3++;
        class51.method411(-84);
        class89.field2377.method627();
        for (int var1 = 0; var1 < 4; var1++) {
            class5.field99[var1].method733(127);
        }
        System.gc();
        class84.method755(10, (byte) 81);
        if (!arg0) {
            method2(-11, true, null, null, false);
        }
        class44.field1164 = -1;
        class39.field999 = 0;
        class75.method661((byte) 74);
        class75.method663((byte) -121, 10);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILga;B)Lga;", line = 244)
    public final class37 method8(int arg0, class37 arg1, byte arg2) {
        if (arg2 < 126) {
            this.method9(true, -111, null);
        }
        field25++;
        int var4 = this.field21[arg0];
        class117 var5 = class89.method785(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method288(true);
        } else {
            class37 var7 = arg1.method288(!var5.method956(var6, 303));
            var7.method290(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZILga;)Lga;", line = 288)
    public final class37 method9(boolean arg0, int arg1, class37 arg2) {
        if (arg0) {
            this.field17 = -85;
        }
        int var4 = this.field21[arg1];
        class117 var5 = class89.method785(var4 >> 16, false);
        field10++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method282(true);
        } else {
            class37 var7 = arg2.method282(!var5.method956(var6, 303));
            var7.method290(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)V", line = 311)
    public static final void method10(byte arg0) {
        field16++;
        for (class87 var1 = (class87) class13.field262.method421(1); var1 != null; var1 = (class87) class13.field262.method428(22743)) {
            if (var1.field2308 != null) {
                var1.method782((byte) -102);
            }
        }
        if (arg0 < 123) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lga;IIB)Lga;", line = 336)
    public final class37 method11(class37 arg0, int arg1, int arg2, byte arg3) {
        field7++;
        int var5 = this.field21[arg1];
        class117 var6 = class89.method785(var5 >> 16, false);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method282(true);
        }
        int var8 = arg2 & 0x3;
        if (arg3 > -87) {
            this.method4(-116, null);
        }
        class37 var9 = arg0.method282(!var6.method956(var7, 303));
        if (var8 == 1) {
            var9.method277();
        } else if (var8 == 2) {
            var9.method276();
        } else if (var8 == 3) {
            var9.method269();
        }
        var9.method290(var6, var7);
        if (var8 == 1) {
            var9.method269();
        } else if (var8 == 2) {
            var9.method276();
        } else if (var8 == 3) {
            var9.method277();
        }
        return var9;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLga;)Lga;", line = 383)
    public final class37 method12(int arg0, byte arg1, class37 arg2) {
        int var4 = this.field21[arg0];
        field31++;
        class117 var5 = class89.method785(var4 >> 16, false);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method282(true);
        }
        class117 var7 = null;
        int var8 = 0;
        if (this.field12 != null && this.field12.length > arg0) {
            int var9 = this.field12[arg0];
            var7 = class89.method785(var9 >> 16, false);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class37 var11 = arg2.method282(!var5.method956(var6, 303));
            var11.method290(var5, var6);
            return var11;
        }
        class37 var10 = arg2.method282(!var5.method956(var6, 303) & !var7.method956(var8, 303));
        if (arg1 != -40) {
            method2(-70, false, null, null, false);
        }
        var10.method290(var5, var6);
        var10.method290(var7, var8);
        return var10;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lg;BI)V", line = 437)
    private final void method13(class39 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            int var9 = arg0.method334(102);
            this.field24 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field24[var10] = arg0.method326(255);
            }
            this.field21 = new int[var9];
            for (int var11 = 0; var11 < var9; var11++) {
                this.field21[var11] = arg0.method326(255);
            }
            for (int var12 = 0; var12 < var9; var12++) {
                this.field21[var12] = (arg0.method326(255) << 16) + this.field21[var12];
            }
        } else if (arg2 == 2) {
            this.field6 = arg0.method326(255);
        } else if (arg2 == 3) {
            int var4 = arg0.method334(103);
            this.field2 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2[var5] = arg0.method334(107);
            }
            this.field2[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field20 = true;
        } else if (arg2 == 5) {
            this.field22 = arg0.method334(105);
        } else if (arg2 == 6) {
            this.field11 = arg0.method326(255);
        } else if (arg2 == 7) {
            this.field35 = arg0.method326(255);
        } else if (arg2 == 8) {
            this.field17 = arg0.method334(127);
        } else if (arg2 == 9) {
            this.field8 = arg0.method334(105);
        } else if (arg2 == 10) {
            this.field32 = arg0.method334(111);
        } else if (arg2 == 11) {
            this.field23 = arg0.method334(110);
        } else if (arg2 == 12) {
            int var6 = arg0.method334(107);
            this.field12 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field12[var7] = arg0.method326(255);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field12[var8] += arg0.method326(255) << 16;
            }
        }
        field19++;
        if (arg1 > -71) {
            this.field6 = 92;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I", line = 559)
    public static final int method14(int arg0, int arg1, int arg2, int arg3) {
        field29++;
        if ((class114.field2852[arg0][arg3][arg1] & 0x8) == 0) {
            if (arg2 != 3072) {
                field27 = null;
            }
            return arg0 <= 0 || (class114.field2852[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V", line = 578)
    public final void method15(int arg0) {
        field18++;
        if (this.field8 == -1) {
            if (this.field2 == null) {
                this.field8 = 0;
            } else {
                this.field8 = 2;
            }
        }
        if (this.field32 == -1) {
            if (this.field2 == null) {
                this.field32 = 0;
            } else {
                this.field32 = 2;
            }
        }
        if (arg0 <= 79) {
            field40 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lmd;", line = 613)
    public static final class76 method16(int arg0, int arg1) {
        field38++;
        class76 var2 = (class76) class64.field1674.method833((byte) -53, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class6.field107.method477(arg1, (byte) 127, arg0);
        class76 var4 = new class76();
        if (var3 != null) {
            var4.method676(new class39(var3), (byte) 60);
        }
        class64.field1674.method836((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;I)Lke;", line = 636)
    public static final class65 method17(String arg0, int arg1) {
        field34++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        if (arg1 > -110) {
            method6((byte) 0);
        }
        int var4 = 0;
        class65 var5 = new class65();
        var5.field1702 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field1702[var5.field1733++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else {
                var5.field1702[var5.field1733++] = (byte) var6;
            }
        }
        var5.method536(true);
        return var5.method548(14425);
    }
}

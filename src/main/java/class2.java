import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!APPQAEOL")
public class class2 {

    @OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "I")
    public int field9 = 32;

    @OriginalMember(owner = "client!APPQAEOL", name = "c", descriptor = "B")
    public byte field11 = 1;

    @OriginalMember(owner = "client!APPQAEOL", name = "d", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "client!APPQAEOL", name = "e", descriptor = "I")
    public int field13 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "h", descriptor = "I")
    public int field16 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "i", descriptor = "I")
    private int field17 = -16070;

    @OriginalMember(owner = "client!APPQAEOL", name = "l", descriptor = "I")
    private int field20 = 128;

    @OriginalMember(owner = "client!APPQAEOL", name = "o", descriptor = "Z")
    public boolean field23 = true;

    @OriginalMember(owner = "client!APPQAEOL", name = "p", descriptor = "I")
    public int field24 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "q", descriptor = "I")
    private int field25 = -479;

    @OriginalMember(owner = "client!APPQAEOL", name = "s", descriptor = "I")
    public int field27 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "u", descriptor = "I")
    private int field29 = 128;

    @OriginalMember(owner = "client!APPQAEOL", name = "v", descriptor = "Z")
    public boolean field30 = false;

    @OriginalMember(owner = "client!APPQAEOL", name = "w", descriptor = "I")
    public int field31 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "A", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "B", descriptor = "I")
    public int field36 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "D", descriptor = "I")
    public int field38 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "E", descriptor = "J")
    public long field39 = -1L;

    @OriginalMember(owner = "client!APPQAEOL", name = "F", descriptor = "Ljava/lang/String;")
    public String field40 = "null";

    @OriginalMember(owner = "client!APPQAEOL", name = "G", descriptor = "I")
    public int field41 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "K", descriptor = "I")
    public int field45 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "L", descriptor = "I")
    public int field46 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "N", descriptor = "I")
    public int field48 = -1;

    @OriginalMember(owner = "client!APPQAEOL", name = "f", descriptor = "LULDYKUPK;")
    public static class57 field14 = new class57(30, 0);

    @OriginalMember(owner = "client!APPQAEOL", name = "r", descriptor = "I")
    private static int field26 = 9;

    @OriginalMember(owner = "client!APPQAEOL", name = "n", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!APPQAEOL", name = "z", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!APPQAEOL", name = "H", descriptor = "I")
    private static int field42;

    @OriginalMember(owner = "client!APPQAEOL", name = "M", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!APPQAEOL", name = "g", descriptor = "LNQUAUMDT;")
    private static class36 field15;

    @OriginalMember(owner = "client!APPQAEOL", name = "b", descriptor = "Lclient;")
    public static client field10;

    @OriginalMember(owner = "client!APPQAEOL", name = "k", descriptor = "[B")
    public byte[] field19;

    @OriginalMember(owner = "client!APPQAEOL", name = "j", descriptor = "[I")
    public int[] field18;

    @OriginalMember(owner = "client!APPQAEOL", name = "m", descriptor = "[I")
    private int[] field21;

    @OriginalMember(owner = "client!APPQAEOL", name = "y", descriptor = "[I")
    private int[] field33;

    @OriginalMember(owner = "client!APPQAEOL", name = "C", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!APPQAEOL", name = "I", descriptor = "[I")
    private static int[] field43;

    @OriginalMember(owner = "client!APPQAEOL", name = "J", descriptor = "[I")
    private int[] field44;

    @OriginalMember(owner = "client!APPQAEOL", name = "x", descriptor = "[LAPPQAEOL;")
    private static class2[] field32;

    @OriginalMember(owner = "client!APPQAEOL", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field28;

    @OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(I)LAPPQAEOL;")
    public final class2 method5(int arg0) {
        int var2 = -1;
        if (arg0 != -16070) {
            throw new NullPointerException();
        }
        if (this.field13 != -1) {
            class23 var3 = class23.field837[this.field13];
            int var4 = var3.field839;
            int var5 = var3.field840;
            int var6 = var3.field841;
            int var7 = client.field544[var6 - var5];
            var2 = field10.field489[var4] >> var5 & var7;
        } else if (this.field24 != -1) {
            var2 = field10.field489[this.field24];
        }
        return var2 < 0 || var2 >= this.field18.length || this.field18[var2] == -1 ? null : method10(this.field18[var2]);
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "b", descriptor = "(I)Z")
    public boolean method6(int arg0) {
        if (this.field18 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field13 != -1) {
            class23 var4 = class23.field837[this.field13];
            int var5 = var4.field839;
            int var6 = var4.field840;
            int var7 = var4.field841;
            int var8 = client.field544[var7 - var6];
            var2 = field10.field489[var5] >> var6 & var8;
        } else if (this.field24 != -1) {
            var2 = field10.field489[this.field24];
        }
        return var2 >= 0 && var2 < this.field18.length && this.field18[var2] != -1;
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(IB[II)LJUQSYEMB;")
    public final class22 method7(int arg0, byte arg1, int[] arg2, int arg3) {
        if (this.field18 != null) {
            class2 var5 = this.method5(this.field17);
            return var5 == null ? null : var5.method7(arg0, (byte) -48, arg2, arg3);
        }
        class22 var6 = (class22) field14.method509(this.field39);
        if (arg1 != -48) {
            throw new NullPointerException();
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field33.length; var8++) {
                if (!class22.method213(this.field33[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class22[] var9 = new class22[this.field33.length];
            for (int var10 = 0; var10 < this.field33.length; var10++) {
                var9[var10] = class22.method212(this.field33[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class22(var9.length, 6, var9);
            }
            if (this.field44 != null) {
                for (int var11 = 0; var11 < this.field44.length; var11++) {
                    var6.method226(this.field44[var11], this.field21[var11]);
                }
            }
            var6.method219(301);
            var6.method229(this.field22 + 64, this.field47 + 850, -30, -50, -30, true);
            field14.method510(this.field39, 0, var6);
        }
        class22 var12 = class22.field764;
        var12.method214(-810, class69.method579(true, arg3) & class69.method579(true, arg0), var6);
        if (arg3 != -1 && arg0 != -1) {
            var12.method221(arg3, arg0, arg2, false);
        } else if (arg3 != -1) {
            var12.method220(true, arg3);
        }
        if (this.field20 != 128 || this.field29 != 128) {
            var12.method228(this.field20, this.field29, this.field20, this.field25);
        }
        var12.method216(12953);
        var12.field800 = null;
        var12.field799 = null;
        if (this.field11 == 1) {
            var12.field801 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "c", descriptor = "(I)V")
    public static final void method8(int arg0) {
        field14 = null;
        field43 = null;
        field32 = null;
        if (field26 == arg0) {
            field15 = null;
        }
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(LRSPRYUFS;)V")
    public static final void method9(class49 arg0) {
        field15 = new class36(-587, arg0.method427("npc.dat", null));
        class36 var1 = new class36(-587, arg0.method427("npc.idx", null));
        field34 = var1.method341();
        field43 = new int[field34];
        int var2 = 2;
        for (int var3 = 0; var3 < field34; var3++) {
            field43[var3] = var2;
            var2 += var1.method341();
        }
        field32 = new class2[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field32[var4] = new class2();
        }
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "d", descriptor = "(I)LAPPQAEOL;")
    public static final class2 method10(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field32[var1].field39) {
                return field32[var1];
            }
        }
        field42 = (field42 + 1) % 20;
        class2 var2 = field32[field42] = new class2();
        field15.field1072 = field43[arg0];
        var2.field39 = arg0;
        var2.method11((byte) 6, field15);
        return var2;
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(BLNQUAUMDT;)V")
    private final void method11(byte arg0, class36 arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method339();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method339();
                    this.field33 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field33[var7] = arg1.method341();
                    }
                } else if (var5 == 2) {
                    this.field40 = arg1.method346();
                } else if (var5 == 3) {
                    this.field19 = arg1.method347(0);
                } else if (var5 == 12) {
                    this.field11 = arg1.method340();
                } else if (var5 == 13) {
                    this.field31 = arg1.method341();
                } else if (var5 == 14) {
                    this.field38 = arg1.method341();
                } else if (var5 == 17) {
                    this.field38 = arg1.method341();
                    this.field48 = arg1.method341();
                    this.field41 = arg1.method341();
                    this.field27 = arg1.method341();
                } else if (var5 >= 30 && var5 < 40) {
                    if (this.field28 == null) {
                        this.field28 = new String[5];
                    }
                    this.field28[var5 - 30] = arg1.method346();
                    if (this.field28[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field28[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method339();
                    this.field44 = new int[var8];
                    this.field21 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field44[var9] = arg1.method341();
                        this.field21[var9] = arg1.method341();
                    }
                } else if (var5 == 60) {
                    int var10 = arg1.method339();
                    this.field37 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field37[var11] = arg1.method341();
                    }
                } else if (var5 == 90) {
                    this.field36 = arg1.method341();
                } else if (var5 == 91) {
                    this.field35 = arg1.method341();
                } else if (var5 == 92) {
                    this.field45 = arg1.method341();
                } else if (var5 == 93) {
                    this.field23 = false;
                } else if (var5 == 95) {
                    this.field16 = arg1.method341();
                } else if (var5 == 97) {
                    this.field20 = arg1.method341();
                } else if (var5 == 98) {
                    this.field29 = arg1.method341();
                } else if (var5 == 99) {
                    this.field30 = true;
                } else if (var5 == 100) {
                    this.field22 = arg1.method340();
                } else if (var5 == 101) {
                    this.field47 = arg1.method340() * 5;
                } else if (var5 == 102) {
                    this.field46 = arg1.method341();
                } else if (var5 == 103) {
                    this.field9 = arg1.method341();
                } else if (var5 == 106) {
                    this.field13 = arg1.method341();
                    if (this.field13 == 65535) {
                        this.field13 = -1;
                    }
                    this.field24 = arg1.method341();
                    if (this.field24 == 65535) {
                        this.field24 = -1;
                    }
                    int var12 = arg1.method339();
                    this.field18 = new int[var12 + 1];
                    for (int var13 = 0; var13 <= var12; var13++) {
                        this.field18[var13] = arg1.method341();
                        if (this.field18[var13] == 65535) {
                            this.field18[var13] = -1;
                        }
                    }
                } else if (var5 == 107) {
                    this.field12 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!APPQAEOL", name = "e", descriptor = "(I)LJUQSYEMB;")
    public final class22 method12(int arg0) {
        if (arg0 != 1) {
            field26 = -169;
        }
        if (this.field18 != null) {
            class2 var2 = this.method5(this.field17);
            return var2 == null ? null : var2.method12(1);
        } else if (this.field37 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field37.length; var4++) {
                if (!class22.method213(this.field37[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class22[] var5 = new class22[this.field37.length];
            for (int var6 = 0; var6 < this.field37.length; var6++) {
                var5[var6] = class22.method212(this.field37[var6]);
            }
            class22 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class22(var5.length, 6, var5);
            }
            if (this.field44 != null) {
                for (int var8 = 0; var8 < this.field44.length; var8++) {
                    var7.method226(this.field44[var8], this.field21[var8]);
                }
            }
            return var7;
        }
    }
}

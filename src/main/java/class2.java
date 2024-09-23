import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AUWOQLEO")
public class class2 {

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "I")
    public int field10 = 32;

    @OriginalMember(owner = "AUWOQLEO", name = "c", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "AUWOQLEO", name = "e", descriptor = "I")
    public int field14 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "g", descriptor = "I")
    public int field16 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "h", descriptor = "I")
    private int field17 = 128;

    @OriginalMember(owner = "AUWOQLEO", name = "i", descriptor = "B")
    public byte field18 = 1;

    @OriginalMember(owner = "AUWOQLEO", name = "k", descriptor = "B")
    private byte field20 = -71;

    @OriginalMember(owner = "AUWOQLEO", name = "l", descriptor = "Z")
    public boolean field21 = false;

    @OriginalMember(owner = "AUWOQLEO", name = "n", descriptor = "I")
    public int field23 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "o", descriptor = "I")
    public int field24 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "q", descriptor = "I")
    private int field26 = 5131;

    @OriginalMember(owner = "AUWOQLEO", name = "r", descriptor = "I")
    private int field27 = 128;

    @OriginalMember(owner = "AUWOQLEO", name = "u", descriptor = "I")
    public int field30 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "v", descriptor = "I")
    public int field31 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "w", descriptor = "I")
    public int field32 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "z", descriptor = "B")
    private byte field35 = -71;

    @OriginalMember(owner = "AUWOQLEO", name = "A", descriptor = "I")
    public int field36 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "B", descriptor = "I")
    private int field37 = -8952;

    @OriginalMember(owner = "AUWOQLEO", name = "C", descriptor = "I")
    public int field38 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "I", descriptor = "I")
    public int field44 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "K", descriptor = "Z")
    public boolean field46 = true;

    @OriginalMember(owner = "AUWOQLEO", name = "L", descriptor = "I")
    public int field47 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "M", descriptor = "J")
    public long field48 = -1L;

    @OriginalMember(owner = "AUWOQLEO", name = "N", descriptor = "I")
    public int field49 = -1;

    @OriginalMember(owner = "AUWOQLEO", name = "b", descriptor = "LAKUDQPZE;")
    public static class1 field11 = new class1((byte) 8, 30);

    @OriginalMember(owner = "AUWOQLEO", name = "E", descriptor = "I")
    private static int field40 = 48698;

    @OriginalMember(owner = "AUWOQLEO", name = "j", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "AUWOQLEO", name = "p", descriptor = "I")
    private static int field25;

    @OriginalMember(owner = "AUWOQLEO", name = "t", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "AUWOQLEO", name = "P", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "AUWOQLEO", name = "y", descriptor = "LEGCCHUZS;")
    private static class15 field34;

    @OriginalMember(owner = "AUWOQLEO", name = "x", descriptor = "Lclient;")
    public static client field33;

    @OriginalMember(owner = "AUWOQLEO", name = "D", descriptor = "Ljava/lang/String;")
    public String field39;

    @OriginalMember(owner = "AUWOQLEO", name = "s", descriptor = "[B")
    public byte[] field28;

    @OriginalMember(owner = "AUWOQLEO", name = "d", descriptor = "[I")
    private static int[] field13;

    @OriginalMember(owner = "AUWOQLEO", name = "f", descriptor = "[I")
    private int[] field15;

    @OriginalMember(owner = "AUWOQLEO", name = "m", descriptor = "[I")
    public int[] field22;

    @OriginalMember(owner = "AUWOQLEO", name = "F", descriptor = "[I")
    private int[] field41;

    @OriginalMember(owner = "AUWOQLEO", name = "H", descriptor = "[I")
    private int[] field43;

    @OriginalMember(owner = "AUWOQLEO", name = "O", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "AUWOQLEO", name = "J", descriptor = "[LAUWOQLEO;")
    private static class2[] field45;

    @OriginalMember(owner = "AUWOQLEO", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field42;

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "(I)Z")
    public boolean method4(int arg0) {
        if (this.field22 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 >= 0) {
            field40 = 470;
        }
        if (this.field32 != -1) {
            class16 var3 = class16.field724[this.field32];
            int var4 = var3.field726;
            int var5 = var3.field727;
            int var6 = var3.field728;
            int var7 = client.field446[var6 - var5];
            var2 = field33.field115[var4] >> var5 & var7;
        } else if (this.field49 != -1) {
            var2 = field33.field115[this.field49];
        }
        return var2 >= 0 && var2 < this.field22.length && this.field22[var2] != -1;
    }

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    private final void method5(class15 arg0, boolean arg1) {
        if (!arg1) {
            this.field37 = -80;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method261();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method261();
                    this.field43 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field43[var5] = arg0.method263();
                    }
                } else if (var3 == 2) {
                    this.field39 = arg0.method268();
                } else if (var3 == 3) {
                    this.field28 = arg0.method269(true);
                } else if (var3 == 12) {
                    this.field18 = arg0.method262();
                } else if (var3 == 13) {
                    this.field31 = arg0.method263();
                } else if (var3 == 14) {
                    this.field14 = arg0.method263();
                } else if (var3 == 17) {
                    this.field14 = arg0.method263();
                    this.field16 = arg0.method263();
                    this.field36 = arg0.method263();
                    this.field23 = arg0.method263();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field42 == null) {
                        this.field42 = new String[5];
                    }
                    this.field42[var3 - 30] = arg0.method268();
                    if (this.field42[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field42[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method261();
                    this.field15 = new int[var6];
                    this.field50 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field15[var7] = arg0.method263();
                        this.field50[var7] = arg0.method263();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method261();
                    this.field41 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field41[var9] = arg0.method263();
                    }
                } else if (var3 == 90) {
                    this.field24 = arg0.method263();
                } else if (var3 == 91) {
                    this.field38 = arg0.method263();
                } else if (var3 == 92) {
                    this.field44 = arg0.method263();
                } else if (var3 == 93) {
                    this.field46 = false;
                } else if (var3 == 95) {
                    this.field47 = arg0.method263();
                } else if (var3 == 97) {
                    this.field17 = arg0.method263();
                } else if (var3 == 98) {
                    this.field27 = arg0.method263();
                } else if (var3 == 99) {
                    this.field21 = true;
                } else if (var3 == 100) {
                    this.field19 = arg0.method262();
                } else if (var3 == 101) {
                    this.field51 = arg0.method262() * 5;
                } else if (var3 == 102) {
                    this.field30 = arg0.method263();
                } else if (var3 == 103) {
                    this.field10 = arg0.method263();
                } else if (var3 == 106) {
                    this.field32 = arg0.method263();
                    if (this.field32 == 65535) {
                        this.field32 = -1;
                    }
                    this.field49 = arg0.method263();
                    if (this.field49 == 65535) {
                        this.field49 = -1;
                    }
                    int var10 = arg0.method261();
                    this.field22 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field22[var11] = arg0.method263();
                        if (this.field22[var11] == 65535) {
                            this.field22[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field12 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "(B)LAUWOQLEO;")
    public final class2 method6(byte arg0) {
        int var2 = -1;
        if (this.field35 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field32 != -1) {
            class16 var4 = class16.field724[this.field32];
            int var5 = var4.field726;
            int var6 = var4.field727;
            int var7 = var4.field728;
            int var8 = client.field446[var7 - var6];
            var2 = field33.field115[var5] >> var6 & var8;
        } else if (this.field49 != -1) {
            var2 = field33.field115[this.field49];
        }
        return var2 < 0 || var2 >= this.field22.length || this.field22[var2] == -1 ? null : method9(this.field22[var2]);
    }

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "(BII[I)LIGXVZOHI;")
    public final class32 method7(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 15) {
            throw new NullPointerException();
        } else if (this.field22 == null) {
            class32 var6 = (class32) field11.method1(this.field48);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field43.length; var8++) {
                    if (!class32.method355(this.field43[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class32[] var9 = new class32[this.field43.length];
                for (int var10 = 0; var10 < this.field43.length; var10++) {
                    var9[var10] = class32.method354(this.field43[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class32(true, var9.length, var9);
                }
                if (this.field15 != null) {
                    for (int var11 = 0; var11 < this.field15.length; var11++) {
                        var6.method368(this.field15[var11], this.field50[var11]);
                    }
                }
                var6.method361(6);
                var6.method371(this.field19 + 64, this.field51 + 850, -30, -50, -30, true);
                field11.method2(var6, false, this.field48);
            }
            class32 var12 = class32.field933;
            var12.method356(false, var6, class31.method349(arg2, this.field26) & class31.method349(arg1, this.field26));
            if (arg2 != -1 && arg1 != -1) {
                var12.method363(arg3, arg1, arg2, true);
            } else if (arg2 != -1) {
                var12.method362(33114, arg2);
            }
            if (this.field17 != 128 || this.field27 != 128) {
                var12.method370(this.field17, this.field27, false, this.field17);
            }
            var12.method358(856);
            var12.field970 = null;
            var12.field969 = null;
            if (this.field18 == 1) {
                var12.field971 = true;
            }
            return var12;
        } else {
            class2 var5 = this.method6(this.field20);
            return var5 == null ? null : var5.method7((byte) 15, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "AUWOQLEO", name = "a", descriptor = "(LTKEGJSFV;)V")
    public static final void method8(class58 arg0) {
        field34 = new class15(arg0.method542("npc.dat", null), false);
        class15 var1 = new class15(arg0.method542("npc.idx", null), false);
        field29 = var1.method263();
        field13 = new int[field29];
        int var2 = 2;
        for (int var3 = 0; var3 < field29; var3++) {
            field13[var3] = var2;
            var2 += var1.method263();
        }
        field45 = new class2[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field45[var4] = new class2();
        }
    }

    @OriginalMember(owner = "AUWOQLEO", name = "b", descriptor = "(I)LAUWOQLEO;")
    public static final class2 method9(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field45[var1].field48) {
                return field45[var1];
            }
        }
        field25 = (field25 + 1) % 20;
        class2 var2 = field45[field25] = new class2();
        field34.field709 = field13[arg0];
        var2.field48 = arg0;
        var2.method5(field34, true);
        return var2;
    }

    @OriginalMember(owner = "AUWOQLEO", name = "b", descriptor = "(B)V")
    public static final void method10(byte arg0) {
        field11 = null;
        field13 = null;
        field45 = null;
        if (arg0 != 1) {
            field40 = -43;
        }
        field34 = null;
    }

    @OriginalMember(owner = "AUWOQLEO", name = "c", descriptor = "(B)LIGXVZOHI;")
    public final class32 method11(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (this.field22 != null) {
            class2 var3 = this.method6(this.field20);
            return var3 == null ? null : var3.method11((byte) 5);
        } else if (this.field41 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field41.length; var5++) {
                if (!class32.method355(this.field41[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class32[] var6 = new class32[this.field41.length];
            for (int var7 = 0; var7 < this.field41.length; var7++) {
                var6[var7] = class32.method354(this.field41[var7]);
            }
            class32 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class32(true, var6.length, var6);
            }
            if (this.field15 != null) {
                for (int var9 = 0; var9 < this.field15.length; var9++) {
                    var8.method368(this.field15[var9], this.field50[var9]);
                }
            }
            return var8;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BXXPAJNW")
public class class4 {

    @OriginalMember(owner = "BXXPAJNW", name = "a", descriptor = "Z")
    public boolean field67 = false;

    @OriginalMember(owner = "BXXPAJNW", name = "b", descriptor = "I")
    public int field68 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "d", descriptor = "I")
    public int field70 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "e", descriptor = "I")
    private int field71 = 128;

    @OriginalMember(owner = "BXXPAJNW", name = "h", descriptor = "I")
    public int field74 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "i", descriptor = "I")
    public int field75 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "k", descriptor = "I")
    public int field77 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "n", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "o", descriptor = "I")
    public int field81 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "q", descriptor = "J")
    public long field83 = -1L;

    @OriginalMember(owner = "BXXPAJNW", name = "u", descriptor = "I")
    public int field87 = 32;

    @OriginalMember(owner = "BXXPAJNW", name = "v", descriptor = "I")
    private int field88 = 128;

    @OriginalMember(owner = "BXXPAJNW", name = "w", descriptor = "I")
    public int field89 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "x", descriptor = "B")
    public byte field90 = 1;

    @OriginalMember(owner = "BXXPAJNW", name = "F", descriptor = "I")
    public int field98 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "G", descriptor = "Z")
    public boolean field99 = true;

    @OriginalMember(owner = "BXXPAJNW", name = "I", descriptor = "I")
    public int field101 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "K", descriptor = "I")
    public int field103 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "L", descriptor = "I")
    public int field104 = -1;

    @OriginalMember(owner = "BXXPAJNW", name = "f", descriptor = "LASORKPAH;")
    public static class2 field72 = new class2(48975, 30);

    @OriginalMember(owner = "BXXPAJNW", name = "D", descriptor = "Z")
    private static boolean field96 = true;

    @OriginalMember(owner = "BXXPAJNW", name = "g", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "BXXPAJNW", name = "j", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "BXXPAJNW", name = "l", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "BXXPAJNW", name = "r", descriptor = "I")
    private static int field84;

    @OriginalMember(owner = "BXXPAJNW", name = "y", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "BXXPAJNW", name = "t", descriptor = "LCKBTFRZM;")
    private static class5 field86;

    @OriginalMember(owner = "BXXPAJNW", name = "s", descriptor = "Lclient;")
    public static client field85;

    @OriginalMember(owner = "BXXPAJNW", name = "E", descriptor = "Ljava/lang/String;")
    public String field97;

    @OriginalMember(owner = "BXXPAJNW", name = "m", descriptor = "[B")
    public byte[] field79;

    @OriginalMember(owner = "BXXPAJNW", name = "H", descriptor = "[I")
    private static int[] field100;

    @OriginalMember(owner = "BXXPAJNW", name = "J", descriptor = "[I")
    private int[] field102;

    @OriginalMember(owner = "BXXPAJNW", name = "p", descriptor = "[I")
    public int[] field82;

    @OriginalMember(owner = "BXXPAJNW", name = "z", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "BXXPAJNW", name = "A", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "BXXPAJNW", name = "B", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "BXXPAJNW", name = "C", descriptor = "[LBXXPAJNW;")
    private static class4[] field95;

    @OriginalMember(owner = "BXXPAJNW", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field69;

    @OriginalMember(owner = "BXXPAJNW", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method25(int arg0) {
        if (this.field82 != null) {
            class4 var2 = this.method27(-20711);
            return var2 == null ? null : var2.method25(21774);
        } else if (this.field93 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 21774) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field93.length; var4++) {
                if (!class21.method342(this.field93[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class21[] var5 = new class21[this.field93.length];
            for (int var6 = 0; var6 < this.field93.length; var6++) {
                var5[var6] = class21.method341((byte) 7, this.field93[var6]);
            }
            class21 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class21(var5, 3729, var5.length);
            }
            if (this.field102 != null) {
                for (int var8 = 0; var8 < this.field102.length; var8++) {
                    var7.method355(this.field102[var8], this.field92[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "BXXPAJNW", name = "a", descriptor = "(BII[I)LGFYXEFQY;")
    public final class21 method26(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 5) {
            throw new NullPointerException();
        } else if (this.field82 == null) {
            class21 var6 = (class21) field72.method1(this.field83);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field94.length; var8++) {
                    if (!class21.method342(this.field94[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class21[] var9 = new class21[this.field94.length];
                for (int var10 = 0; var10 < this.field94.length; var10++) {
                    var9[var10] = class21.method341((byte) 7, this.field94[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class21(var9, 3729, var9.length);
                }
                if (this.field102 != null) {
                    for (int var11 = 0; var11 < this.field102.length; var11++) {
                        var6.method355(this.field102[var11], this.field92[var11]);
                    }
                }
                var6.method348(false);
                var6.method358(this.field91 + 64, this.field73 + 850, -30, -50, -30, true);
                field72.method2(23574, this.field83, var6);
            }
            class21 var12 = class21.field880;
            var12.method343(0, class14.method282(arg1, false) & class14.method282(arg2, false), var6);
            if (arg1 != -1 && arg2 != -1) {
                var12.method350(arg3, arg1, 0, arg2);
            } else if (arg1 != -1) {
                var12.method349(90, arg1);
            }
            if (this.field88 != 128 || this.field71 != 128) {
                var12.method357((byte) -10, this.field88, this.field88, this.field71);
            }
            var12.method345(0);
            var12.field917 = null;
            var12.field916 = null;
            if (this.field90 == 1) {
                var12.field918 = true;
            }
            return var12;
        } else {
            class4 var5 = this.method27(-20711);
            return var5 == null ? null : var5.method26((byte) 5, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "BXXPAJNW", name = "b", descriptor = "(I)LBXXPAJNW;")
    public final class4 method27(int arg0) {
        int var2 = -1;
        if (arg0 != -20711) {
            throw new NullPointerException();
        }
        if (this.field101 != -1) {
            class72 var3 = class72.field1715[this.field101];
            int var4 = var3.field1717;
            int var5 = var3.field1718;
            int var6 = var3.field1719;
            int var7 = client.field217[var6 - var5];
            var2 = field85.field395[var4] >> var5 & var7;
        } else if (this.field70 != -1) {
            var2 = field85.field395[this.field70];
        }
        return var2 < 0 || var2 >= this.field82.length || this.field82[var2] == -1 ? null : method31(this.field82[var2]);
    }

    @OriginalMember(owner = "BXXPAJNW", name = "a", descriptor = "(LEAXVDNXA;)V")
    public static final void method28(class12 arg0) {
        field86 = new class5(2, arg0.method255("npc.dat", null));
        class5 var1 = new class5(2, arg0.method255("npc.idx", null));
        field76 = var1.method46();
        field100 = new int[field76];
        int var2 = 2;
        for (int var3 = 0; var3 < field76; var3++) {
            field100[var3] = var2;
            var2 += var1.method46();
        }
        field95 = new class4[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field95[var4] = new class4();
        }
    }

    @OriginalMember(owner = "BXXPAJNW", name = "a", descriptor = "(BLCKBTFRZM;)V")
    private final void method29(byte arg0, class5 arg1) {
        if (arg0 != -18) {
            this.field78 = 299;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method44();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method44();
                    this.field94 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field94[var5] = arg1.method46();
                    }
                } else if (var3 == 2) {
                    this.field97 = arg1.method51();
                } else if (var3 == 3) {
                    this.field79 = arg1.method52(-473);
                } else if (var3 == 12) {
                    this.field90 = arg1.method45();
                } else if (var3 == 13) {
                    this.field75 = arg1.method46();
                } else if (var3 == 14) {
                    this.field77 = arg1.method46();
                } else if (var3 == 17) {
                    this.field77 = arg1.method46();
                    this.field68 = arg1.method46();
                    this.field81 = arg1.method46();
                    this.field89 = arg1.method46();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field69 == null) {
                        this.field69 = new String[5];
                    }
                    this.field69[var3 - 30] = arg1.method51();
                    if (this.field69[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field69[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method44();
                    this.field102 = new int[var6];
                    this.field92 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field102[var7] = arg1.method46();
                        this.field92[var7] = arg1.method46();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method44();
                    this.field93 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field93[var9] = arg1.method46();
                    }
                } else if (var3 == 90) {
                    this.field103 = arg1.method46();
                } else if (var3 == 91) {
                    this.field104 = arg1.method46();
                } else if (var3 == 92) {
                    this.field98 = arg1.method46();
                } else if (var3 == 93) {
                    this.field99 = false;
                } else if (var3 == 95) {
                    this.field80 = arg1.method46();
                } else if (var3 == 97) {
                    this.field88 = arg1.method46();
                } else if (var3 == 98) {
                    this.field71 = arg1.method46();
                } else if (var3 == 99) {
                    this.field67 = true;
                } else if (var3 == 100) {
                    this.field91 = arg1.method45();
                } else if (var3 == 101) {
                    this.field73 = arg1.method45() * 5;
                } else if (var3 == 102) {
                    this.field74 = arg1.method46();
                } else if (var3 == 103) {
                    this.field87 = arg1.method46();
                } else if (var3 == 106) {
                    this.field101 = arg1.method46();
                    if (this.field101 == 65535) {
                        this.field101 = -1;
                    }
                    this.field70 = arg1.method46();
                    if (this.field70 == 65535) {
                        this.field70 = -1;
                    }
                    int var10 = arg1.method44();
                    this.field82 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field82[var11] = arg1.method46();
                        if (this.field82[var11] == 65535) {
                            this.field82[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BXXPAJNW", name = "c", descriptor = "(I)V")
    public static final void method30(int arg0) {
        field72 = null;
        field100 = null;
        field95 = null;
        if (arg0 != 0) {
            field96 = !field96;
        }
        field86 = null;
    }

    @OriginalMember(owner = "BXXPAJNW", name = "d", descriptor = "(I)LBXXPAJNW;")
    public static final class4 method31(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field95[var1].field83) {
                return field95[var1];
            }
        }
        field84 = (field84 + 1) % 20;
        class4 var2 = field95[field84] = new class4();
        field86.field123 = field100[arg0];
        var2.field83 = arg0;
        var2.method29((byte) -18, field86);
        return var2;
    }
}

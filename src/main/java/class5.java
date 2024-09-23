import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BYABUZFP")
public class class5 {

    @OriginalMember(owner = "BYABUZFP", name = "c", descriptor = "I")
    public int field45 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "e", descriptor = "I")
    public int field47 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "f", descriptor = "Z")
    public boolean field48 = true;

    @OriginalMember(owner = "BYABUZFP", name = "k", descriptor = "I")
    public int field53 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "n", descriptor = "I")
    public int field56 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "o", descriptor = "B")
    public byte field57 = 1;

    @OriginalMember(owner = "BYABUZFP", name = "p", descriptor = "I")
    public int field58 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "r", descriptor = "I")
    public int field60 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "s", descriptor = "I")
    public int field61 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "t", descriptor = "I")
    private int field62 = 128;

    @OriginalMember(owner = "BYABUZFP", name = "w", descriptor = "I")
    public int field65 = 32;

    @OriginalMember(owner = "BYABUZFP", name = "x", descriptor = "J")
    public long field66 = -1L;

    @OriginalMember(owner = "BYABUZFP", name = "y", descriptor = "I")
    public int field67 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "z", descriptor = "Z")
    public boolean field68 = true;

    @OriginalMember(owner = "BYABUZFP", name = "C", descriptor = "I")
    private int field71 = 128;

    @OriginalMember(owner = "BYABUZFP", name = "E", descriptor = "I")
    public int field73 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "F", descriptor = "I")
    public int field74 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "I", descriptor = "Z")
    public boolean field77 = false;

    @OriginalMember(owner = "BYABUZFP", name = "L", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "M", descriptor = "I")
    public int field81 = -1;

    @OriginalMember(owner = "BYABUZFP", name = "v", descriptor = "LRUNMBJUO;")
    public static class51 field64 = new class51(30, false);

    @OriginalMember(owner = "BYABUZFP", name = "G", descriptor = "I")
    private static int field75 = 8;

    @OriginalMember(owner = "BYABUZFP", name = "d", descriptor = "I")
    private static int field46;

    @OriginalMember(owner = "BYABUZFP", name = "l", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "BYABUZFP", name = "u", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "BYABUZFP", name = "H", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "BYABUZFP", name = "K", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "LMUKVLYLC;")
    private static class33 field43;

    @OriginalMember(owner = "BYABUZFP", name = "B", descriptor = "Lclient;")
    public static client field70;

    @OriginalMember(owner = "BYABUZFP", name = "A", descriptor = "Ljava/lang/String;")
    public String field69;

    @OriginalMember(owner = "BYABUZFP", name = "j", descriptor = "[B")
    public byte[] field52;

    @OriginalMember(owner = "BYABUZFP", name = "b", descriptor = "[I")
    private int[] field44;

    @OriginalMember(owner = "BYABUZFP", name = "g", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "BYABUZFP", name = "h", descriptor = "[I")
    public int[] field50;

    @OriginalMember(owner = "BYABUZFP", name = "i", descriptor = "[I")
    private static int[] field51;

    @OriginalMember(owner = "BYABUZFP", name = "m", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "BYABUZFP", name = "q", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "BYABUZFP", name = "J", descriptor = "[LBYABUZFP;")
    private static class5[] field78;

    @OriginalMember(owner = "BYABUZFP", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field72;

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "(I)LBYABUZFP;")
    public static final class5 method24(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field78[var1].field66) {
                return field78[var1];
            }
        }
        field46 = (field46 + 1) % 20;
        class5 var2 = field78[field46] = new class5();
        field43.field954 = field51[arg0];
        var2.field66 = arg0;
        var2.method25(field43, false);
        return var2;
    }

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    private final void method25(class33 arg0, boolean arg1) {
        if (arg1) {
            field75 = 87;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method292();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method292();
                    this.field44 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field44[var5] = arg0.method294();
                    }
                } else if (var3 == 2) {
                    this.field69 = arg0.method299();
                } else if (var3 == 3) {
                    this.field52 = arg0.method300((byte) 0);
                } else if (var3 == 12) {
                    this.field57 = arg0.method293();
                } else if (var3 == 13) {
                    this.field53 = arg0.method294();
                } else if (var3 == 14) {
                    this.field73 = arg0.method294();
                } else if (var3 == 17) {
                    this.field73 = arg0.method294();
                    this.field58 = arg0.method294();
                    this.field60 = arg0.method294();
                    this.field61 = arg0.method294();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field72 == null) {
                        this.field72 = new String[5];
                    }
                    this.field72[var3 - 30] = arg0.method299();
                    if (this.field72[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field72[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method292();
                    this.field59 = new int[var6];
                    this.field49 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field59[var7] = arg0.method294();
                        this.field49[var7] = arg0.method294();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method292();
                    this.field55 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field55[var9] = arg0.method294();
                    }
                } else if (var3 == 90) {
                    this.field80 = arg0.method294();
                } else if (var3 == 91) {
                    this.field74 = arg0.method294();
                } else if (var3 == 92) {
                    this.field81 = arg0.method294();
                } else if (var3 == 93) {
                    this.field68 = false;
                } else if (var3 == 95) {
                    this.field47 = arg0.method294();
                } else if (var3 == 97) {
                    this.field71 = arg0.method294();
                } else if (var3 == 98) {
                    this.field62 = arg0.method294();
                } else if (var3 == 99) {
                    this.field77 = true;
                } else if (var3 == 100) {
                    this.field79 = arg0.method293();
                } else if (var3 == 101) {
                    this.field63 = arg0.method293() * 5;
                } else if (var3 == 102) {
                    this.field45 = arg0.method294();
                } else if (var3 == 103) {
                    this.field65 = arg0.method294();
                } else if (var3 == 106) {
                    this.field67 = arg0.method294();
                    if (this.field67 == 65535) {
                        this.field67 = -1;
                    }
                    this.field56 = arg0.method294();
                    if (this.field56 == 65535) {
                        this.field56 = -1;
                    }
                    int var10 = arg0.method292();
                    this.field50 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field50[var11] = arg0.method294();
                        if (this.field50[var11] == 65535) {
                            this.field50[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field48 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "(B)LBYABUZFP;")
    public final class5 method26(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        if (this.field67 != -1) {
            class18 var5 = class18.field741[this.field67];
            int var6 = var5.field743;
            int var7 = var5.field744;
            int var8 = var5.field745;
            int var9 = client.field136[var8 - var7];
            var4 = field70.field268[var6] >> var7 & var9;
        } else if (this.field56 != -1) {
            var4 = field70.field268[this.field56];
        }
        return var4 < 0 || var4 >= this.field50.length || this.field50[var4] == -1 ? null : method24(this.field50[var4]);
    }

    @OriginalMember(owner = "BYABUZFP", name = "b", descriptor = "(I)V")
    public static final void method27(int arg0) {
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field64 = null;
        field51 = null;
        field78 = null;
        field43 = null;
    }

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "([IIII)LNJPATAFL;")
    public final class35 method28(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field50 != null) {
            class5 var5 = this.method26((byte) 2);
            return var5 == null ? null : var5.method28(arg0, arg1, arg2, 3);
        }
        class35 var6 = (class35) field64.method450(this.field66);
        if (arg3 != 3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field44.length; var9++) {
                if (!class35.method335(this.field44[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class35[] var10 = new class35[this.field44.length];
            for (int var11 = 0; var11 < this.field44.length; var11++) {
                var10[var11] = class35.method334(this.field44[var11], 14700);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class35(var10, 230, var10.length);
            }
            if (this.field59 != null) {
                for (int var12 = 0; var12 < this.field59.length; var12++) {
                    var6.method348(this.field59[var12], this.field49[var12]);
                }
            }
            var6.method341(9566);
            var6.method351(this.field79 + 64, this.field63 + 850, -30, -50, -30, true);
            field64.method451(this.field66, var6, false);
        }
        class35 var13 = class35.field988;
        var13.method336(var6, class57.method491(arg2, this.field54) & class57.method491(arg1, this.field54), (byte) 4);
        if (arg2 != -1 && arg1 != -1) {
            var13.method343(arg0, arg1, 530, arg2);
        } else if (arg2 != -1) {
            var13.method342(true, arg2);
        }
        if (this.field71 != 128 || this.field62 != 128) {
            var13.method350(this.field71, true, this.field71, this.field62);
        }
        var13.method338(true);
        var13.field1025 = null;
        var13.field1024 = null;
        if (this.field57 == 1) {
            var13.field1026 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "BYABUZFP", name = "a", descriptor = "(LFIGUVTWB;)V")
    public static final void method29(class15 arg0) {
        field43 = new class33(field75, arg0.method209("npc.dat", null));
        class33 var1 = new class33(field75, arg0.method209("npc.idx", null));
        field76 = var1.method294();
        field51 = new int[field76];
        int var2 = 2;
        for (int var3 = 0; var3 < field76; var3++) {
            field51[var3] = var2;
            var2 += var1.method294();
        }
        field78 = new class5[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field78[var4] = new class5();
        }
    }

    @OriginalMember(owner = "BYABUZFP", name = "b", descriptor = "(B)LNJPATAFL;")
    public final class35 method30(byte arg0) {
        if (this.field50 != null) {
            class5 var2 = this.method26((byte) 2);
            return var2 == null ? null : var2.method30((byte) 6);
        } else if (this.field55 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 6) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            for (int var5 = 0; var5 < this.field55.length; var5++) {
                if (!class35.method335(this.field55[var5])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class35[] var6 = new class35[this.field55.length];
            for (int var7 = 0; var7 < this.field55.length; var7++) {
                var6[var7] = class35.method334(this.field55[var7], 14700);
            }
            class35 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class35(var6, 230, var6.length);
            }
            if (this.field59 != null) {
                for (int var9 = 0; var9 < this.field59.length; var9++) {
                    var8.method348(this.field59[var9], this.field49[var9]);
                }
            }
            return var8;
        }
    }
}

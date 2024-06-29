import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    private int field53 = 128;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field48 = -1;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    private int field63 = 0;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private int field65 = 128;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    private int field52 = 0;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Z")
    public boolean field69 = false;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
    public static boolean field55 = false;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Z")
    public static boolean field67 = false;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljk;")
    public static class76 field56 = new class76();

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lri;")
    public static class273 field71 = new class273();

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Luf;")
    public static class168 field72 = class148.method1019(-1720, "Nehmen");

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "B")
    public static byte field70;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[S")
    private short[] field44;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[S")
    private short[] field45;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[S")
    private short[] field61;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[S")
    private short[] field62;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[[[B")
    public static byte[][][] field66;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 12)
    public static void method10(int arg0) {
        field66 = (byte[][][]) null;
        field56 = null;
        field71 = null;
        if (arg0 < -4) {
            field72 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lfc;", line = 27)
    public final class152 method11(int arg0, int arg1) {
        field57++;
        class152 var3 = (class152) class274.field4615.method1424((long) this.field46, (byte) 88);
        if (var3 == null) {
            class208 var4 = class208.method1462(class224.field3615, this.field59, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field45 != null) {
                for (int var5 = 0; var5 < this.field45.length; var5++) {
                    var4.method1457(this.field45[var5], this.field61[var5]);
                }
            }
            if (this.field44 != null) {
                for (int var6 = 0; var6 < this.field44.length; var6++) {
                    var4.method1459(this.field44[var6], this.field62[var6]);
                }
            }
            var3 = var4.method1446(this.field63 + 64, this.field52 + 850, -30, -50, -30);
            class274.field4615.method1430(var3, (long) this.field46, 13487);
        }
        class152 var7;
        if (this.field48 == -1 || arg1 == -1) {
            var7 = var3.method671(true, true);
        } else {
            var7 = class119.method858(true, this.field48).method1347(arg1, var3, true);
        }
        if (this.field65 != 128 || this.field53 != 128) {
            var7.method688(this.field65, this.field53, this.field65);
        }
        if (arg0 != -4) {
            this.field44 = (short[]) null;
        }
        if (this.field51 != 0) {
            if (this.field51 == 90) {
                var7.method663();
            }
            if (this.field51 == 180) {
                var7.method658();
            }
            if (this.field51 == 270) {
                var7.method691();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lj;Z)V", line = 101)
    public final void method12(class153 arg0, boolean arg1) {
        if (arg1) {
            field55 = false;
        }
        while (true) {
            int var3 = arg0.method1042((byte) -80);
            if (var3 == 0) {
                field50++;
                return;
            }
            this.method13(41, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILj;)V", line = 128)
    private final void method13(int arg0, int arg1, class153 arg2) {
        if (arg0 != 41) {
            return;
        }
        field60++;
        if (arg1 == 1) {
            this.field59 = arg2.method1069(78);
        } else if (arg1 == 2) {
            this.field48 = arg2.method1069(105);
        } else if (arg1 == 4) {
            this.field65 = arg2.method1069(arg0 ^ 0x7D);
        } else if (arg1 == 5) {
            this.field53 = arg2.method1069(83);
        } else if (arg1 == 6) {
            this.field51 = arg2.method1069(58);
        } else if (arg1 == 7) {
            this.field63 = arg2.method1042((byte) 110);
        } else if (arg1 == 8) {
            this.field52 = arg2.method1042((byte) -127);
        } else if (arg1 == 9) {
            this.field69 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1042((byte) 124);
            this.field61 = new short[var4];
            this.field45 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field45[var5] = (short) arg2.method1069(96);
                this.field61[var5] = (short) arg2.method1069(126);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1042((byte) 95);
            this.field62 = new short[var6];
            this.field44 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field44[var7] = (short) arg2.method1069(64);
                this.field62[var7] = (short) arg2.method1069(class289.method1988(arg0, 114));
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 211)
    public static final void method14(int arg0) {
        class53.field656.method1431((byte) 123);
        field47++;
        if (arg0 >= -96) {
            method15(-48);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 229)
    public static final void method15(int arg0) {
        int var1 = class215.field3503 >> 7;
        class71.field959 &= 0x7FF;
        field68++;
        if (class171.field2787 < 128) {
            class171.field2787 = 128;
        }
        if (class171.field2787 > 383) {
            class171.field2787 = 383;
        }
        int var2 = class296.field5009 >> 7;
        int var3 = class62.method349(128, class79.field1127, class296.field5009, class215.field3503);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class79.field1127;
                    if (var7 < 3 && (class159.field2520[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class227.field3686[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        int var10 = -85 / ((76 - arg0) / 44);
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class272.field4571 < var9) {
            class272.field4571 += (var9 - class272.field4571) / 24;
        } else if (var9 < class272.field4571) {
            class272.field4571 += (var9 - class272.field4571) / 80;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 339)
    public static final void method16(int arg0) {
        field54++;
        class145.field2240.method1429((byte) 120);
        class285.field4821.method1429((byte) 120);
        class132.field2043.method1429((byte) 120);
        if (arg0 != -5) {
            field66 = (byte[][][]) ((byte[][][]) null);
        }
    }
}

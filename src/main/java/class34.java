import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class34 {

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lwi;")
    public static class199 field513 = new class199();

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field523 = -1;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[S")
    public static short[] field531 = new short[256];

    @OriginalMember(owner = "client!u", name = "B", descriptor = "[[I")
    public static int[][] field532 = new int[104][104];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lhi;")
    public static class82 field528 = class95.method664((byte) -108, "mapflag");

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lhi;")
    public static class82 field536 = class95.method664((byte) -127, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lhi;")
    public static class82 field533 = class95.method664((byte) -54, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!u", name = "p", descriptor = "F")
    public static float field520;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Lum;")
    public static class222 field530;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Lui;")
    public class91 field534;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
    public int[] field512;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    public int[] field519;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
    public int[] field521;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[I")
    public int[] field524;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    public int[] field526;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[Lui;")
    public class91[] field522;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[S")
    public static short[] field535;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[[I")
    public int[][] field511;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[[I")
    public int[][] field518;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBIIIIII)V", line = 4)
    public static final void method260(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field508++;
        if (arg2 != 1) {
            method264((byte) 10, 127);
        }
        for (int var9 = 0; var9 < class297.field5057.field4312; var9++) {
            int var10 = class297.field5057.field4317[var9] - class166.field2905;
            int var11 = class17.field181 + class157.field2719 - class297.field5057.field4304[var9] - 1;
            int var12 = (arg4 - arg6) * (var10 - arg8) / (arg5 - arg8) + arg6;
            int var13 = class297.field5057.method1798(var9, 33);
            int var14 = arg7 + ((var11 - arg3) * (arg0 - arg7) / (arg1 - arg3));
            int var15 = 16777215;
            class70 var16 = null;
            if (var13 == 0) {
                if ((double) class69.field1065 == 3.0D) {
                    var16 = class259.field4434;
                }
                if ((double) class69.field1065 == 4.0D) {
                    var16 = class208.field3643;
                }
                if ((double) class69.field1065 == 6.0D) {
                    var16 = class127.field2234;
                }
                if ((double) class69.field1065 == 8.0D) {
                    var16 = class275.field4624;
                }
            }
            if (var13 == 1) {
                if ((double) class69.field1065 == 3.0D) {
                    var16 = class127.field2234;
                }
                if ((double) class69.field1065 == 4.0D) {
                    var16 = class275.field4624;
                }
                if ((double) class69.field1065 == 6.0D) {
                    var16 = class224.field3889;
                }
                if ((double) class69.field1065 == 8.0D) {
                    var16 = class152.field2571;
                }
            }
            if (var13 == 2) {
                var15 = 16755200;
                if ((double) class69.field1065 == 3.0D) {
                    var16 = class224.field3889;
                }
                if ((double) class69.field1065 == 4.0D) {
                    var16 = class152.field2571;
                }
                if ((double) class69.field1065 == 6.0D) {
                    var16 = class192.field3249;
                }
                if ((double) class69.field1065 == 8.0D) {
                    var16 = class310.field5305;
                }
            }
            if (class297.field5057.field4306[var9] != -1) {
                var15 = class297.field5057.field4306[var9];
            }
            if (var16 != null) {
                class82[] var17 = new class82[class297.field5057.field4308[var9].method531((byte) 105, 60) + 1];
                class21.field283.method126(class297.field5057.field4308[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 - 1) * var16.method447() / 2;
                int var20 = var19 + var16.method444() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class82 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method573(0, 118, var17[var21].method535(true) - 4);
                    var16.method446(var22, var12, var20, var15, true);
                    var20 += var16.method447();
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z[B)V", line = 133)
    private final void method261(boolean arg0, byte[] arg1) {
        class153 var3 = new class153(class126.method891(arg1, (byte) 21));
        field514++;
        int var4 = var3.method1082(-100);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field537 = 0;
        } else {
            this.field537 = var3.method1097((byte) -97);
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method1082(-54);
        this.field510 = var3.method1090(arg0);
        this.field524 = new int[this.field510];
        for (int var8 = 0; var8 < this.field510; var8++) {
            this.field524[var8] = var6 += var3.method1090(false);
            if (var5 < this.field524[var8]) {
                var5 = this.field524[var8];
            }
        }
        this.field505 = var5 + 1;
        this.field521 = new int[this.field505];
        this.field515 = new int[this.field505];
        this.field526 = new int[this.field505];
        this.field512 = new int[this.field505];
        this.field511 = new int[this.field505][];
        if (var7 != 0) {
            this.field519 = new int[this.field505];
            for (int var9 = 0; var9 < this.field505; var9++) {
                this.field519[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field510; var10++) {
                this.field519[this.field524[var10]] = var3.method1097((byte) -71);
            }
            this.field534 = new class91(this.field519);
        }
        for (int var11 = 0; var11 < this.field510; var11++) {
            this.field512[this.field524[var11]] = var3.method1097((byte) -94);
        }
        for (int var12 = 0; var12 < this.field510; var12++) {
            this.field521[this.field524[var12]] = var3.method1097((byte) -110);
        }
        if (arg0) {
            field536 = (class82) null;
        }
        for (int var13 = 0; var13 < this.field510; var13++) {
            this.field526[this.field524[var13]] = var3.method1090(false);
        }
        for (int var14 = 0; var14 < this.field510; var14++) {
            int var15 = 0;
            int var16 = this.field524[var14];
            int var17 = this.field526[var16];
            int var18 = -1;
            this.field511[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field511[var16][var19] = var15 += var3.method1090(arg0);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field515[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field511[var16] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field522 = new class91[var5 + 1];
        this.field518 = new int[var5 + 1][];
        for (int var21 = 0; var21 < this.field510; var21++) {
            int var22 = this.field524[var21];
            int var23 = this.field526[var22];
            this.field518[var22] = new int[this.field515[var22]];
            for (int var24 = 0; var24 < this.field515[var22]; var24++) {
                this.field518[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field511[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field511[var22][var25];
                }
                this.field518[var22][var26] = var3.method1097((byte) -125);
            }
            this.field522[var22] = new class91(this.field518[var22]);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IS)Z", line = 310)
    public static final boolean method262(int arg0, short arg1) {
        field527++;
        if (arg1 == 9 || arg1 == 12 || arg1 == 34 || arg1 == 40 || arg1 == 48 || arg1 == 8 || arg1 == 24 || arg1 == 21) {
            return true;
        } else if (arg0 > -73) {
            return false;
        } else if (arg1 == 45 || arg1 == 28 || arg1 == 1003 || arg1 == 1005) {
            return true;
        } else if (arg1 == 41 || arg1 == 46 || arg1 == 18 || arg1 == 11 || arg1 == 4) {
            return true;
        } else {
            return arg1 == 43 || arg1 == 5 || arg1 == 37 || arg1 == 17 || arg1 == 49 || arg1 == 57;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 335)
    public static void method263(byte arg0) {
        field528 = null;
        field530 = null;
        field536 = null;
        field533 = null;
        field531 = null;
        field532 = (int[][]) null;
        field535 = null;
        if (arg0 != -23) {
            field507 = -14;
        }
        field513 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I", line = 357)
    public static final int method264(byte arg0, int arg1) {
        field517++;
        int var2 = -121 % ((arg0 - 83) / 35);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V", line = 379)
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field506++;
        int var6 = arg1 - arg4;
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class220.method1557(arg0, -5, arg4, arg3, arg1);
            }
        } else if (var6 == 0) {
            class146.method986(arg3, arg4, 0, arg2, arg0);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg4 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class200.field3443) {
                var10 = var9 + (class200.field3443 * var8 >> 12);
                var11 = class200.field3443;
            } else if (class207.field3623 >= arg2) {
                var10 = arg1;
                var11 = arg2;
            } else {
                var11 = class207.field3623;
                var10 = var9 + (class207.field3623 * var8 >> 12);
            }
            int var12;
            int var13;
            if (arg0 < class200.field3443) {
                var12 = class200.field3443;
                var13 = (class200.field3443 * var8 >> 12) + var9;
            } else if (arg0 > class207.field3623) {
                var12 = class207.field3623;
                var13 = (class207.field3623 * var8 >> 12) + var9;
            } else {
                var13 = arg4;
                var12 = arg0;
            }
            if (class60.field931 > var13) {
                var12 = (class60.field931 - var9 << 12) / var8;
                var13 = class60.field931;
            } else if (class29.field399 < var13) {
                var13 = class29.field399;
                var12 = (class29.field399 - var9 << 12) / var8;
            }
            if (class60.field931 > var10) {
                var11 = (class60.field931 - var9 << 12) / var8;
                var10 = class60.field931;
            } else if (class29.field399 < var10) {
                var10 = class29.field399;
                var11 = (class29.field399 - var9 << 12) / var8;
            }
            class71.method448(var11, (byte) -60, var13, var12, arg3, var10);
            if (arg5 != -779049524) {
                method260(-66, 25, (byte) 92, 112, 82, 105, 25, -106, 121);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([BI)V", line = 528)
    public class34(byte[] arg0, int arg1) {
        this.field529 = class51.method368(arg0.length, arg0, true);
        if (this.field529 != arg1) {
            throw new RuntimeException();
        }
        this.method261(false, arg0);
    }
}

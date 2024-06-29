import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class285 extends class128 {

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    private int field4473 = 409;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    private int field4472 = 204;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    private int field4467 = 4;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    private int field4482 = 8;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    private int field4462 = 0;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    private int field4485 = 1024;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field4478 = 1024;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field4468 = 81;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4477 = "Allocating memory";

    @OriginalMember(owner = "client!r", name = "db", descriptor = "[Z")
    public static boolean[] field4483 = new boolean[100];

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field4488 = null;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[S")
    public static short[] field4484 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Ldh;")
    public static class179 field4489 = new class179(260);

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    private int field4466;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "Llc;")
    public static class175 field4490;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "Lbi;")
    public static class91 field4491;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "[I")
    private int[] field4474;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[[I")
    private int[][] field4476;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "[[I")
    private int[][] field4486;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 8)
    public final void method130(boolean arg0) {
        field4492++;
        this.method2036((byte) -98);
        if (arg0) {
            this.method107((class107) null, 105, 68);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lp;II)V", line = 32)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            field4488 = (String) null;
        }
        if (arg1 == 0) {
            this.field4467 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field4482 = arg0.method661(-1);
        } else if (arg1 == 2) {
            this.field4473 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field4472 = arg0.method624(14612);
        } else if (arg1 == 4) {
            this.field4478 = arg0.method624(14612);
        } else if (arg1 == 5) {
            this.field4462 = arg0.method624(14612);
        } else if (arg1 == 6) {
            this.field4468 = arg0.method624(14612);
        } else if (arg1 == 7) {
            this.field4485 = arg0.method624(14612);
        }
        field4475++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)I", line = 122)
    public static final int method2034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & arg0) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        field4481++;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 - (arg4 - (7 - arg5));
        } else {
            return 7 + 1 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)[I", line = 155)
    public final int[] method126(byte arg0, int arg1) {
        field4464++;
        if (arg0 <= 100) {
            method2038(-104, (byte) 69, 56, (byte[]) null);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = 0;
            int var5;
            for (var5 = class49.field600[arg1] + this.field4462; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4482 && var5 >= this.field4474[var4]) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field4474[var4];
            int var9 = this.field4474[var4 - 1];
            if ((var9 + this.field4480) < var5 && var8 - this.field4480 > var5) {
                for (int var10 = 0; var10 < class10.field141; var10++) {
                    int var11 = var6 ? this.field4478 : -this.field4478;
                    int var12 = (this.field4466 * var11 >> 12) + class334.field5157[var10];
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (var13 < this.field4467 && this.field4486[var7][var13] <= var12) {
                        var13++;
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field4486[var7][var14];
                    int var16 = this.field4486[var7][var13];
                    if (var12 > this.field4480 + var15 && (var16 - this.field4480) > var12) {
                        var3[var10] = this.field4476[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class86.method514(var3, 0, class10.field141, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)[Laf;", line = 254)
    public static final class189[] method2035(int arg0) {
        class189[] var1 = new class189[class21.field266];
        for (int var2 = 0; var2 < class21.field266; var2++) {
            int var3 = class54.field664[var2] * class264.field4159[var2];
            byte[] var4 = class153.field2105[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class134.field1854[class229.method1613(255, var4[var6])];
            }
            var1[var2] = new class189(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var5);
        }
        if (arg0 != -1) {
            field4483 = (boolean[]) null;
        }
        field4493++;
        class321.method2238(-45);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 290)
    private final void method2036(byte arg0) {
        field4470++;
        if (arg0 != -98) {
            this.field4467 = 50;
        }
        Random var2 = new Random((long) this.field4482);
        this.field4486 = new int[this.field4482][this.field4467 + 1];
        this.field4480 = this.field4468 / 2;
        this.field4466 = 4096 / this.field4467;
        this.field4476 = new int[this.field4482][this.field4467];
        this.field4474 = new int[this.field4482 + 1];
        int var3 = this.field4466 / 2;
        this.field4487 = 4096 / this.field4482;
        this.field4474[0] = 0;
        int var4 = this.field4487 / 2;
        for (int var5 = 0; var5 < this.field4482; var5++) {
            if (var5 > 0) {
                int var6 = this.field4487;
                int var7 = (class31.method189(4096, 86, var2) - 2048) * this.field4472 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4474[var5] = this.field4474[var5 - 1] + var8;
            }
            this.field4486[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4467; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4466;
                    int var11 = (class31.method189(4096, 35, var2) - 2048) * this.field4473 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4486[var5][var9] = this.field4486[var5][var9 - 1] + var12;
                }
                this.field4476[var5][var9] = this.field4485 > 0 ? 4096 - class31.method189(this.field4485, 126, var2) : 4096;
            }
            this.field4486[var5][this.field4467] = 4096;
        }
        this.field4474[this.field4482] = 4096;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V", line = 354)
    public static void method2037(boolean arg0) {
        field4491 = null;
        field4484 = null;
        field4477 = null;
        field4489 = null;
        if (!arg0) {
            field4488 = (String) null;
        }
        field4488 = null;
        field4490 = null;
        field4483 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI[B)I", line = 371)
    public static final int method2038(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 != -121) {
            method2039(-59, 50);
        }
        int var4 = -1;
        field4469++;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class9.field123[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 506)
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z", line = 409)
    public static final boolean method2039(int arg0, int arg1) {
        field4463++;
        if (class328.field5016[arg0]) {
            return true;
        } else if (field4490.method1189(true, arg0)) {
            int var2 = field4490.method1197(arg1 ^ 0x7FCA, arg0);
            if (var2 == 0) {
                class328.field5016[arg0] = true;
                return true;
            }
            if (class175.field2535[arg0] == null) {
                class175.field2535[arg0] = new class263[var2];
            }
            int var3 = 0;
            if (arg1 != -32660) {
                field4484 = (short[]) null;
            }
            while (var2 > var3) {
                if (class175.field2535[arg0][var3] == null) {
                    byte[] var4 = field4490.method1199(arg1 ^ 0xFFFFF0E3, var3, arg0);
                    if (var4 != null) {
                        class263 var5 = class175.field2535[arg0][var3] = new class263();
                        var5.field4083 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1890(65535, new class107(var4));
                        } else {
                            var5.method1902(0, new class107(var4));
                        }
                    }
                }
                var3++;
            }
            class328.field5016[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZLp;)Lgg;", line = 469)
    public static final class79 method2040(int arg0, boolean arg1, class107 arg2) {
        class79 var3 = new class79(arg0, arg2.method628(false), arg2.method628(false), arg2.method676(arg1), arg2.method676(arg1), arg2.method661(-1) == 1, arg2.method661(-1));
        field4479++;
        int var4 = arg2.method661(-1);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field1001.method2325(new class112(arg2.method661(-1), arg2.method661(-1), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612), arg2.method624(14612)), (byte) 34);
        }
        var3.method470(arg1);
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V", line = 490)
    public static final void method2041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class329.field5020 = arg5;
        class166.field2296 = arg0;
        if (arg2 == 0) {
            class230.field3362 = arg3;
            class319.field4906 = arg1;
            class261.field3955 = arg4;
            field4471++;
        }
    }
}

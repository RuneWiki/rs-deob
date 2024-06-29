import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class240 {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field4198 = -1;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field4210 = -1;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field4203 = 5;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field4192 = -1;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field4201 = -1;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    public boolean field4214 = false;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field4193 = 2;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Z")
    private boolean field4209 = false;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field4224 = 99;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public int field4223 = -1;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lpc;")
    public static class21 field4216 = null;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Z")
    public static boolean field4222 = true;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Loh;")
    private static class263 field4194 = class253.method1681(-117, "Members object");

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Loh;")
    public static class263 field4196 = field4194;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4199 = Calendar.getInstance();

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "B")
    public static byte field4225;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    private int[] field4197;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    private int[] field4205;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[I")
    public int[] field4211;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[I")
    public int[] field4219;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[[I")
    public int[][] field4195;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        field4194 = null;
        field4196 = null;
        field4216 = null;
        if (arg0 == 109) {
            field4199 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public final void method1604(int arg0) {
        if (this.field4210 == -1) {
            if (this.field4197 == null) {
                this.field4210 = 0;
            } else {
                this.field4210 = 2;
            }
        }
        if (arg0 >= -53) {
            return;
        }
        if (this.field4198 == -1) {
            if (this.field4197 == null) {
                this.field4198 = 0;
            } else {
                this.field4198 = 2;
            }
        }
        field4208++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILsi;)V")
    public final void method1605(int arg0, class194 arg1) {
        field4202++;
        if (arg0 != 2) {
            this.field4219 = null;
        }
        while (true) {
            int var3 = arg1.method1301(arg0 - 8319);
            if (var3 == 0) {
                return;
            }
            this.method1610(arg1, var3, 1);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lph;III)Lph;")
    public final class76 method1606(class76 arg0, int arg1, int arg2, int arg3) {
        field4206++;
        int var5 = this.field4211[arg2];
        if (arg3 != 27219) {
            field4213 = -29;
        }
        class1 var6 = class32.method210((byte) -87, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method517(true, true);
        }
        int var8 = arg1 & 0x3;
        class76 var9 = arg0.method517(!var6.method6(var7, -1), !this.field4209);
        if (var8 == 1) {
            var9.method512();
        } else if (var8 == 2) {
            var9.method501();
        } else if (var8 == 3) {
            var9.method519();
        }
        var9.method515(var6, var7, this.field4209);
        if (var8 == 1) {
            var9.method519();
        } else if (var8 == 2) {
            var9.method501();
        } else if (var8 == 3) {
            var9.method512();
        }
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILph;)Lph;")
    public final class76 method1607(int arg0, int arg1, class76 arg2) {
        field4221++;
        int var4 = this.field4211[arg1];
        if (arg0 > -122) {
            this.method1609((class76) null, 72, -76);
        }
        class1 var5 = class32.method210((byte) -106, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method517(true, true);
        }
        class1 var7 = null;
        int var8 = 0;
        if (this.field4205 != null && arg1 < this.field4205.length) {
            int var9 = this.field4205[arg1];
            var7 = class32.method210((byte) -44, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class76 var11 = arg2.method517(!var5.method6(var6, -1), !this.field4209);
            var11.method515(var5, var6, this.field4209);
            return var11;
        } else {
            class76 var10 = arg2.method517(!var5.method6(var6, -1) & !var7.method6(var8, -1), !this.field4209);
            var10.method515(var5, var6, this.field4209);
            var10.method515(var7, var8, this.field4209);
            return var10;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lpc;B)Z")
    public static final boolean method1608(class21 arg0, byte arg1) {
        field4217++;
        if (arg0.field616 == null) {
            return false;
        }
        if (arg1 != -127) {
            field4194 = null;
        }
        for (int var2 = 0; var2 < arg0.field616.length; var2++) {
            int var3 = class269.method1823(var2, 23836, arg0);
            int var4 = arg0.field576[var2];
            if (arg0.field616[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field616[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field616[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lph;II)Lph;")
    public final class76 method1609(class76 arg0, int arg1, int arg2) {
        int var4 = this.field4211[arg1];
        field4218++;
        if (arg2 != 2) {
            method1608((class21) null, (byte) 7);
        }
        class1 var5 = class32.method210((byte) -113, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method510(true, true);
        } else {
            class76 var7 = arg0.method510(!var5.method6(var6, -1), !this.field4209);
            var7.method515(var5, var6, this.field4209);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lsi;II)V")
    private final void method1610(class194 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            int var13 = arg0.method1294((byte) 3);
            this.field4219 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4219[var14] = arg0.method1294((byte) 3);
            }
            this.field4211 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4211[var15] = arg0.method1294((byte) 3);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4211[var16] += arg0.method1294((byte) 3) << 16;
            }
        } else if (arg1 == 2) {
            this.field4223 = arg0.method1294((byte) 3);
        } else if (arg1 == 3) {
            int var11 = arg0.method1301(-8317);
            this.field4197 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field4197[var12] = arg0.method1301(-8317);
            }
            this.field4197[var11] = 9999999;
        } else if (arg1 == 4) {
            this.field4214 = true;
        } else if (arg1 == 5) {
            this.field4203 = arg0.method1301(-8317);
        } else if (arg1 == 6) {
            this.field4201 = arg0.method1294((byte) 3);
        } else if (arg1 == 7) {
            this.field4192 = arg0.method1294((byte) 3);
        } else if (arg1 == 8) {
            this.field4224 = arg0.method1301(-8317);
        } else if (arg1 == 9) {
            this.field4210 = arg0.method1301(arg2 ^ 0xFFFFDF82);
        } else if (arg1 == 10) {
            this.field4198 = arg0.method1301(-8317);
        } else if (arg1 == 11) {
            this.field4193 = arg0.method1301(-8317);
        } else if (arg1 == 12) {
            int var8 = arg0.method1301(-8317);
            this.field4205 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4205[var9] = arg0.method1294((byte) 3);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4205[var10] = (arg0.method1294((byte) 3) << 16) + this.field4205[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg0.method1294((byte) 3);
            this.field4195 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1301(-8317);
                if (var6 > 0) {
                    this.field4195[var5] = new int[var6];
                    this.field4195[var5][0] = arg0.method1277((byte) -9);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field4195[var5][var7] = arg0.method1294((byte) 3);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4209 = true;
        }
        field4212++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBLfa;Lph;)Lph;")
    public final class76 method1611(int arg0, int arg1, byte arg2, class240 arg3, class76 arg4) {
        int var6 = this.field4211[arg0];
        field4220++;
        class1 var7 = class32.method210((byte) -35, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (arg2 < 19) {
            this.field4209 = false;
        }
        if (var7 == null) {
            return arg3.method1612(-8037, arg4, arg1);
        }
        int var9 = arg3.field4211[arg1];
        class1 var10 = class32.method210((byte) -30, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class76 var12 = arg4.method517(!var7.method6(var8, -1), !this.field4209);
            var12.method515(var7, var8, this.field4209);
            return var12;
        } else {
            class76 var13 = arg4.method517(!var7.method6(var8, -1) & !var10.method6(var11, -1), !this.field4209 & !arg3.field4209);
            var13.method508(var7, var8, var10, var11, this.field4197, arg3.field4209 | this.field4209);
            return var13;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILph;I)Lph;")
    public final class76 method1612(int arg0, class76 arg1, int arg2) {
        field4204++;
        if (arg0 != -8037) {
            field4199 = null;
        }
        int var4 = this.field4211[arg2];
        class1 var5 = class32.method210((byte) -40, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method517(true, true);
        } else {
            class76 var7 = arg1.method517(!var5.method6(var6, -1), !this.field4209);
            var7.method515(var5, var6, this.field4209);
            return var7;
        }
    }
}

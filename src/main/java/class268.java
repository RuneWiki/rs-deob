import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class268 extends class130 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "[[Z")
    public static boolean[][] field4618 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4616 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4609 = 0;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "J")
    public static long field4611;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Lqm;")
    public static class222 field4625;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lcd;")
    public class64 field4624;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[I")
    public int[] field4610;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[I")
    public int[] field4613;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "[I")
    public static int[] field4615;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "[I")
    public static int[] field4619;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[I")
    public int[] field4621;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "[I")
    public int[] field4627;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[I")
    public static int[] field4628;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Log;", line = 29)
    public static final class195 method1873(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5075; var4++) {
            class195 var5 = var3.field5090[var4];
            if ((var5.field3324 >> 29 & 0x3L) == 2L && var5.field3313 == arg1 && var5.field3322 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILkh;I)V", line = 52)
    private final void method1874(int arg0, class13 arg1, int arg2) {
        if (~arg0 == arg2) {
            this.field4624 = arg1.method104((byte) 117);
        } else if (arg0 == 2) {
            int var7 = arg1.method152((byte) -87);
            this.field4621 = new int[var7];
            this.field4610 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4610[var8] = arg1.method112((byte) 92);
                int var9 = arg1.method152((byte) -91);
                if (var9 == 0) {
                    this.field4621[var8] = -1;
                } else {
                    this.field4621[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method152((byte) -99);
            this.field4613 = new int[var4];
            this.field4627 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4627[var5] = arg1.method112((byte) 92);
                int var6 = arg1.method152((byte) -70);
                if (var6 == 0) {
                    this.field4613[var5] = -1;
                } else {
                    this.field4613[var5] = var6;
                }
            }
        } else if (arg0 != 4) {
        }
        field4617++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)I", line = 127)
    public final int method1875(int arg0, byte arg1) {
        field4614++;
        if (this.field4627 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 < 3) {
            this.method1875(-23, (byte) 72);
        }
        while (this.field4627.length > var3) {
            if (this.field4613[var3] == arg0) {
                return this.field4627[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkh;B)V", line = 155)
    public final void method1876(class13 arg0, byte arg1) {
        field4620++;
        if (arg1 != -112) {
            this.method1874(-85, (class13) null, -69);
        }
        while (true) {
            int var3 = arg0.method152((byte) -70);
            if (var3 == 0) {
                return;
            }
            this.method1874(var3, arg0, -2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 175)
    public final void method1877(int arg0) {
        if (arg0 < 32) {
            return;
        }
        if (this.field4627 != null) {
            for (int var2 = 0; var2 < this.field4627.length; var2++) {
                this.field4627[var2] = class11.method91(this.field4627[var2], 32768);
            }
        }
        field4629++;
        if (this.field4610 != null) {
            for (int var3 = 0; var3 < this.field4610.length; var3++) {
                this.field4610[var3] = class11.method91(this.field4610[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 217)
    public static void method1878(boolean arg0) {
        field4619 = null;
        field4615 = null;
        field4628 = null;
        field4618 = (boolean[][]) null;
        if (arg0) {
            field4625 = (class222) null;
        }
        field4625 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)I", line = 236)
    public final int method1879(int arg0, byte arg1) {
        field4612++;
        int var3 = 13 / ((56 - arg1) / 59);
        if (this.field4610 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field4610.length; var4++) {
            if (this.field4621[var4] == arg0) {
                return this.field4610[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIII)Lcd;", line = 278)
    public static final class64 method1880(boolean arg0, int arg1, int arg2, int arg3) {
        field4623++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg3 / arg1;
        if (arg2 != 3) {
            field4619 = (int[]) null;
        }
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            arg3 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class64 var10 = new class64();
        var10.field1252 = var7;
        var10.field1274 = var6;
        return var10;
    }
}

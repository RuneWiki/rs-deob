import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class261 extends class89 {

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Z")
    public boolean field3286 = true;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "Ldq;")
    public static class493 field3289 = new class493(60, 8);

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Lap;")
    public static class335 field3304 = new class335("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Lkg;")
    public static class179 field3305 = new class179(23, 7);

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Lei;")
    public class118 field3290;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "Lqn;")
    public static class47 field3307;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
    public int[] field3296;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "[I")
    private int[] field3297;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[Ljava/lang/String;")
    private String[] field3302;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[[I")
    private int[][] field3301;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I", line = 14)
    public final int method1554(int arg0, int arg1, int arg2) {
        field3284++;
        if (arg2 > -76) {
            field3289 = null;
        }
        if (this.field3297 == null || arg0 < 0 || arg0 > this.field3297.length) {
            return -1;
        } else if (this.field3301[arg0] == null || arg1 < 0 || this.field3301[arg0].length < arg1) {
            return -1;
        } else {
            return this.field3301[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfh;I)Ljava/lang/String;", line = 32)
    public final String method1555(class463 arg0, int arg1) {
        field3293++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3297 != null) {
            for (int var4 = 0; var4 < this.field3297.length; var4++) {
                var3.append(this.field3302[var4]);
                var3.append(this.field3290.method846(this.field3301[var4], 126, arg0.method2739(120, class68.method602(this.field3297[var4], (byte) -68).field382), this.method1556(0, var4)));
            }
        }
        var3.append(this.field3302[this.field3302.length - 1]);
        return arg1 >= -37 ? null : var3.toString();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lud;", line = 61)
    public final class27 method1556(int arg0, int arg1) {
        field3295++;
        if (this.field3297 == null || arg1 < 0 || arg1 > this.field3297.length) {
            return null;
        } else {
            if (arg0 != 0) {
                this.method1556(-14, 1);
            }
            return class68.method602(this.field3297[arg1], (byte) -88);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILfh;I)V", line = 81)
    private final void method1557(int arg0, class463 arg1, int arg2) {
        field3303++;
        if (arg2 < 122) {
            this.field3301 = null;
        }
        if (arg0 == 1) {
            this.field3302 = class335.method1937(-98, arg1.method2768((byte) 59), '<');
        } else if (arg0 == 2) {
            int var9 = arg1.method2737(false);
            this.field3296 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3296[var10] = arg1.method2758((byte) 102);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method2737(false);
            this.field3297 = new int[var4];
            this.field3301 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2758((byte) 87);
                class27 var7 = class68.method602(var6, (byte) -49);
                if (var7 != null) {
                    this.field3297[var5] = var6;
                    this.field3301[var5] = new int[var7.field388];
                    for (int var8 = 0; var8 < var7.field388; var8++) {
                        this.field3301[var5][var8] = arg1.method2758((byte) 77);
                    }
                }
            }
            return;
        } else if (arg0 == 4) {
            this.field3286 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Ljava/lang/String;", line = 156)
    public final String method1558(int arg0) {
        field3285++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3302 == null) {
            return "";
        }
        var2.append(this.field3302[0]);
        if (arg0 >= -12) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3302.length; var3++) {
            var2.append("...");
            var2.append(this.field3302[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfh;Z)V", line = 189)
    public final void method1559(class463 arg0, boolean arg1) {
        if (!arg1) {
            field3289 = null;
        }
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                field3294++;
                return;
            }
            this.method1557(var3, arg0, 123);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLqn;)V", line = 209)
    public static final void method1560(byte arg0, class47 arg1) {
        field3288++;
        class449.field6420 = arg1.method488("titlebg", 105);
        if (arg0 > -69) {
            field3306 = 90;
        }
        class428.field6080 = arg1.method488("logo", 98);
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)I", line = 222)
    public final int method1561(int arg0) {
        field3299++;
        int var2 = 56 % ((-arg0 - 53) / 55);
        return this.field3297 == null ? 0 : this.field3297.length;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 238)
    public static void method1562(byte arg0) {
        if (arg0 < 124) {
            method1564(27, 26);
        }
        field3305 = null;
        field3307 = null;
        field3304 = null;
        field3289 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 252)
    public final void method1563(byte arg0) {
        field3291++;
        if (arg0 == -63 && this.field3296 != null) {
            for (int var2 = 0; var2 < this.field3296.length; var2++) {
                this.field3296[var2] = class215.method1323(this.field3296[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)S", line = 274)
    public static final short method1564(int arg0, int arg1) {
        field3300++;
        int var2 = (arg0 & 0xFF0C) >> 10;
        if (arg1 < 45) {
            field3305 = null;
        }
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([I[IIII)V", line = 302)
    public static final void method1565(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3292++;
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (arg0[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1565(arg0, arg1, -1, arg3, var6 - 1);
            method1565(arg0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg2 != -1) {
            method1560((byte) 53, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfh;[II)V", line = 363)
    public final void method1566(class463 arg0, int[] arg1, int arg2) {
        field3298++;
        int var4 = -63 / ((arg2 + 42) / 52);
        if (this.field3297 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3297.length; var5++) {
            if (var5 >= arg1.length) {
                return;
            }
            int var6 = this.method1556(0, var5).field387;
            if (var6 > 0) {
                arg0.method2787(var6, (byte) -116, (long) arg1[var5]);
            }
        }
    }
}

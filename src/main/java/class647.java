import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class647 extends class49 {

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Z")
    public boolean field9055 = true;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Z")
    public static boolean field9049 = false;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field9057 = 0;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Lvo;")
    public class381 field9042;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
    private int[] field9040;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "[I")
    public int[] field9044;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "[Ljava/lang/String;")
    private String[] field9058;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "[[I")
    private int[][] field9052;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    public final int method3702(int arg0) {
        if (arg0 != 0) {
            this.method3710((byte) 70, null);
        }
        field9050++;
        return this.field9040 == null ? 0 : this.field9040.length;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3703(int arg0, String arg1) {
        field9047++;
        for (int var2 = arg0; var2 < class187.field2336.length; var2++) {
            if (class187.field2336[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BB)Z")
    public static final boolean method3704(byte arg0, byte arg1) {
        field9046++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (var2 >= 128 && var2 < 160 && class171.field2172[var2 - 128] == '\u0000') {
            return false;
        } else {
            if (arg0 != 91) {
                field9057 = -99;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method3705(byte arg0) {
        field9056++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field9058 == null) {
            return "";
        }
        var2.append(this.field9058[0]);
        if (arg0 >= -96) {
            return null;
        }
        for (int var3 = 1; var3 < this.field9058.length; var3++) {
            var2.append("...");
            var2.append(this.field9058[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I")
    public final int method3706(byte arg0, int arg1, int arg2) {
        field9048++;
        if (arg0 < 32) {
            this.method3702(28);
        }
        if (this.field9040 == null || arg1 < 0 || arg1 > this.field9040.length) {
            return -1;
        } else if (this.field9052[arg1] == null || arg2 < 0 || arg2 > this.field9052[arg1].length) {
            return -1;
        } else {
            return this.field9052[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V")
    public final void method3707(byte arg0) {
        field9053++;
        if (this.field9044 != null) {
            for (int var2 = 0; var2 < this.field9044.length; var2++) {
                this.field9044[var2] = class613.method3544(this.field9044[var2], 32768);
            }
        }
        if (arg0 != 99) {
            this.field9052 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILgga;)V")
    private final void method3708(int arg0, int arg1, class511 arg2) {
        field9051++;
        if (arg0 <= 44) {
            method3714(27);
        }
        if (arg1 == 1) {
            this.field9058 = class24.method105(arg2.method2993((byte) -76), 19478, '<');
        } else if (arg1 == 2) {
            int var9 = arg2.method3013(-103);
            this.field9044 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field9044[var10] = arg2.method3002(-1);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method3013(-115);
            this.field9052 = new int[var4][];
            this.field9040 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3002(-1);
                class208 var7 = class309.method2001(var6, 0);
                if (var7 != null) {
                    this.field9040[var5] = var6;
                    this.field9052[var5] = new int[var7.field2899];
                    for (int var8 = 0; var8 < var7.field2899; var8++) {
                        this.field9052[var5][var8] = arg2.method3002(-1);
                    }
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field9055 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([ILgga;I)V")
    public final void method3709(int[] arg0, class511 arg1, int arg2) {
        field9041++;
        if (this.field9040 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field9040.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method3711(var4, (byte) 22).field2901;
            if (var5 > 0) {
                arg1.method3028(arg2 ^ 0xFFFFFF81, (long) arg0[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLgga;)V")
    public final void method3710(byte arg0, class511 arg1) {
        field9039++;
        if (arg0 != 56) {
            return;
        }
        while (true) {
            int var3 = arg1.method3013(-94);
            if (var3 == 0) {
                return;
            }
            this.method3708(100, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lo;")
    public final class208 method3711(int arg0, byte arg1) {
        field9059++;
        if (this.field9040 == null || arg0 < 0 || this.field9040.length < arg0) {
            return null;
        } else {
            if (arg1 != 22) {
                this.method3702(-73);
            }
            return class309.method2001(this.field9040[arg0], arg1 - 22);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILgga;)Ljava/lang/String;")
    public final String method3712(int arg0, class511 arg1) {
        field9043++;
        if (arg0 != 0) {
            this.field9058 = null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field9040 != null) {
            for (int var4 = 0; var4 < this.field9040.length; var4++) {
                var3.append(this.field9058[var4]);
                var3.append(this.field9042.method2377(this.field9052[var4], arg1.method2990(class309.method2001(this.field9040[var4], 0).field2903, false), this.method3711(var4, (byte) 22), true));
            }
        }
        var3.append(this.field9058[this.field9058.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
    public static final void method3713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9054++;
        int var5 = 0;
        int var6 = arg3;
        if (arg1 != -1646) {
            method3704((byte) -93, (byte) 73);
        }
        int var7 = -arg3;
        class128.method883(arg2, arg4 - arg3, arg3 + arg4, class705.field9804[arg0], 7);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class705.field9804[arg0 + var6];
                int[] var10 = class705.field9804[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class128.method883(arg2, var12, var11, var9, arg1 ^ 0xFFFFF995);
                class128.method883(arg2, var12, var11, var10, arg1 ^ 0xFFFFF995);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class705.field9804[arg0 + var5];
            int[] var16 = class705.field9804[arg0 - var5];
            class128.method883(arg2, var14, var13, var15, 7);
            class128.method883(arg2, var14, var13, var16, 7);
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)I")
    public static final int method3714(int arg0) {
        field9045++;
        int var1 = -106 / ((-arg0 - 72) / 36);
        if (class661.field9305 == null) {
            return class444.field6146 ? 2 : 1;
        } else {
            return 3;
        }
    }
}

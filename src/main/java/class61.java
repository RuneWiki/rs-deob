import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 extends class202 {

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lnh;")
    public static class264 field1025 = class10.method95((byte) -110);

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "Z")
    public static boolean field1028;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
    private int[] field1016;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "[I")
    public int[] field1026;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "[I")
    public static int[] field1029;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "[Lsb;")
    private class98[] field1021;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "[[I")
    private int[][] field1015;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Llj;B)Lsb;")
    public final class98 method439(class216 arg0, byte arg1) {
        if (arg1 != -5) {
            return null;
        }
        field1019++;
        class98 var3 = class153.method1119(arg1 ^ 0xFFFFFFA2, 80);
        if (this.field1016 != null) {
            for (int var4 = 0; var4 < this.field1016.length; var4++) {
                var3.method736(-11204, this.field1021[var4]);
                var3.method736(-11204, class190.method1306(this.field1015[var4], this.field1016[var4], arg0.method1450((byte) 126, class156.field2852[this.field1016[var4]]), arg1 + 10));
            }
        }
        var3.method736(-11204, this.field1021[this.field1021.length - 1]);
        return var3.method718((byte) 93);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lsb;")
    public final class98 method440(boolean arg0) {
        field1022++;
        class98 var2 = class153.method1119(-80, 80);
        if (this.field1021 == null) {
            return class177.field3075;
        }
        if (!arg0) {
            this.method446(-91);
        }
        var2.method736(-11204, this.field1021[0]);
        for (int var3 = 1; var3 < this.field1021.length; var3++) {
            var2.method736(-11204, class145.field2543);
            var2.method736(-11204, this.field1021[var3]);
        }
        return var2.method718((byte) 93);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)I")
    public final int method441(int arg0, int arg1, int arg2) {
        if (arg1 <= 33) {
            return 32;
        }
        field1024++;
        if (this.field1016 == null || arg0 < 0 || this.field1016.length < arg0) {
            return -1;
        } else if (this.field1015[arg0] == null || arg2 < 0 || this.field1015[arg0].length < arg2) {
            return -1;
        } else {
            return this.field1015[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILlj;)V")
    private final void method442(byte arg0, int arg1, class216 arg2) {
        field1014++;
        if (arg0 != -83) {
            method450(false);
        }
        if (arg1 == 1) {
            this.field1021 = arg2.method1445(-3).method737(60, (byte) 35);
        } else if (arg1 == 2) {
            int var4 = arg2.method1446(arg0 ^ 0xFFFFEB4B);
            this.field1026 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1026[var5] = arg2.method1487(86);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method1446(5350);
            this.field1015 = new int[var6][];
            this.field1016 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1487(40);
                this.field1016[var7] = var8;
                this.field1015[var7] = new int[class129.field2302[var8]];
                for (int var9 = 0; var9 < class129.field2302[var8]; var9++) {
                    this.field1015[var7][var9] = arg2.method1487(33);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
    public final int method443(int arg0, int arg1) {
        field1012++;
        int var3 = -97 % ((11 - arg0) / 52);
        return this.field1016 == null || arg1 < 0 || this.field1016.length < arg1 ? -1 : this.field1016[arg1];
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(B)V")
    public final void method444(byte arg0) {
        if (arg0 != 45) {
            this.field1016 = null;
        }
        if (this.field1026 != null) {
            for (int var2 = 0; var2 < this.field1026.length; var2++) {
                this.field1026[var2] = class67.method471(this.field1026[var2], 32768);
            }
        }
        field1020++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method445(int arg0) {
        field1029 = null;
        if (arg0 == -1) {
            field1025 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
    public final int method446(int arg0) {
        if (arg0 != 0) {
            field1028 = true;
        }
        field1013++;
        return this.field1016 == null ? 0 : this.field1016.length;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILlj;)V")
    public final void method447(int arg0, class216 arg1) {
        field1023++;
        while (true) {
            int var3 = arg1.method1446(5350);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    field1025 = null;
                    return;
                }
            }
            this.method442((byte) -83, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[ILlj;)V")
    public final void method448(int arg0, int[] arg1, class216 arg2) {
        if (arg0 != -13709) {
            this.method441(-44, 125, -12);
        }
        field1027++;
        if (this.field1016 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1016.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class222.field3830[this.method443(90, var4)];
            if (var5 > 0) {
                arg2.method1467((long) arg1[var4], arg0 + 17565, var5);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBZI)Lsb;")
    public static final class98 method449(int arg0, byte arg1, boolean arg2, int arg3) {
        field1018++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var11 = arg3 % arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            arg3 /= arg0;
            var7[var6 - var8 - 1] = (byte) (var11 + 48);
        }
        class98 var9 = new class98();
        var9.field1694 = var6;
        var9.field1733 = var7;
        int var10 = -128 / ((-arg1 - 24) / 42);
        return var9;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
    public static final void method450(boolean arg0) {
        class252.field4406.method1565(-1);
        field1017++;
        if (!arg0) {
            field1025 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class8 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field164 = 128;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field161 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
    public boolean field174 = false;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field176 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public int field177 = -1;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Z")
    public boolean field185 = false;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    private int field178 = 128;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[J")
    public static long[] field162 = new long[100];

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[Lrg;")
    public static class255[] field179 = new class255[32768];

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[S")
    private short[] field169;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[S")
    private short[] field171;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[S")
    private short[] field173;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[S")
    private short[] field181;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 5)
    public static void method65(int arg0) {
        field162 = null;
        if (arg0 != -873511966) {
            method71((class68) null, false);
        }
        field179 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILag;)V", line = 22)
    public final void method66(int arg0, class202 arg1) {
        int var3 = 58 % ((-arg0 - 7) / 53);
        field182++;
        while (true) {
            int var4 = arg1.method1317((byte) -106);
            if (var4 == 0) {
                return;
            }
            this.method68((byte) -126, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lem;)V", line = 49)
    public static final void method67(class271 arg0) {
        for (int var1 = arg0.field4180; var1 <= arg0.field4176; var1++) {
            for (int var2 = arg0.field4187; var2 <= arg0.field4181; var2++) {
                class47 var3 = class326.field4975[arg0.field4175][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field969; var4++) {
                        if (var3.field974[var4] == arg0) {
                            var3.field969--;
                            for (int var5 = var4; var5 < var3.field969; var5++) {
                                var3.field974[var5] = var3.field974[var5 + 1];
                                var3.field982[var5] = var3.field982[var5 + 1];
                            }
                            var3.field974[var3.field969] = null;
                            break;
                        }
                    }
                    var3.field980 = 0;
                    for (int var6 = 0; var6 < var3.field969; var6++) {
                        var3.field980 |= var3.field982[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLag;I)V", line = 108)
    private final void method68(byte arg0, class202 arg1, int arg2) {
        field168++;
        if (arg2 == 1) {
            this.field163 = arg1.method1315(14289);
        } else if (arg2 == 2) {
            this.field177 = arg1.method1315(14289);
        } else if (arg2 == 4) {
            this.field164 = arg1.method1315(14289);
        } else if (arg2 == 5) {
            this.field178 = arg1.method1315(14289);
        } else if (arg2 == 6) {
            this.field176 = arg1.method1315(14289);
        } else if (arg2 == 7) {
            this.field166 = arg1.method1317((byte) -113);
        } else if (arg2 == 8) {
            this.field161 = arg1.method1317((byte) -115);
        } else if (arg2 == 9) {
            this.field185 = true;
        } else if (arg2 == 10) {
            this.field174 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1317((byte) -88);
            this.field169 = new short[var4];
            this.field181 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field181[var5] = (short) arg1.method1315(14289);
                this.field169[var5] = (short) arg1.method1315(14289);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1317((byte) -74);
            this.field171 = new short[var6];
            this.field173 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field173[var7] = (short) arg1.method1315(14289);
                this.field171[var7] = (short) arg1.method1315(14289);
            }
        }
        if (arg0 >= -108) {
            this.method72(true, -107, 75, 52);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lte;I)[Lvk;", line = 204)
    public static final class197[] method69(class124 arg0, int arg1) {
        field172++;
        if (!arg0.method810(-18246)) {
            return new class197[0];
        }
        class107 var2 = arg0.method804(true);
        while (var2.field1852 == 0) {
            class127.method843(-91, 10L);
        }
        if (var2.field1852 == 2) {
            return new class197[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field1853);
        class197[] var4 = new class197[var3.length >> 2];
        int var5 = -37 % ((-arg1 - 36) / 60);
        for (int var6 = 0; var6 < var4.length; var6++) {
            class197 var7 = new class197();
            var4[var6] = var7;
            var7.field3173 = var3[var6 << 2];
            var7.field3172 = var3[(var6 << 2) + 1];
            var7.field3174 = var3[(var6 << 2) + 2];
            var7.field3164 = var3[(var6 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BBI)I", line = 252)
    public static final int method70(byte[] arg0, byte arg1, int arg2) {
        field184++;
        if (arg1 >= -93) {
            field179 = (class255[]) null;
        }
        return class225.method1488(arg2, arg0, (byte) -128, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lkl;Z)Ljava/lang/String;", line = 266)
    public static final String method71(class68 arg0, boolean arg1) {
        field187++;
        if (client.method359(arg0).method1783(-1) == 0) {
            return null;
        }
        if (!arg1) {
            method73(14, 48, -14, -42);
        }
        if (arg0.field1325 == null || arg0.field1325.trim().length() == 0) {
            return class29.field551 ? "Hidden-use" : null;
        } else {
            return arg0.field1325;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIII)Lbg;", line = 293)
    public final class309 method72(boolean arg0, int arg1, int arg2, int arg3) {
        field180++;
        class309 var5 = (class309) class106.field1825.method1881(arg0, (long) this.field175);
        if (var5 == null) {
            class3 var6 = class3.method33(class128.field2190, this.field163, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field181 != null) {
                for (int var7 = 0; var7 < this.field181.length; var7++) {
                    var6.method48(this.field181[var7], this.field169[var7]);
                }
            }
            if (this.field173 != null) {
                for (int var8 = 0; var8 < this.field173.length; var8++) {
                    var6.method49(this.field173[var8], this.field171[var8]);
                }
            }
            var5 = var6.method28(this.field166 + 64, this.field161 + 850, -30, -50, -30);
            class106.field1825.method1880(var5, (long) this.field175, 121);
        }
        class309 var9;
        if (this.field177 == -1 || arg3 == -1) {
            var9 = var5.method144(true, true, true);
        } else {
            var9 = class279.method1882(25397, this.field177).method1747(arg1, arg2, arg3, (byte) -82, var5);
        }
        if (this.field164 != 128 || this.field178 != 128) {
            var9.method151(this.field164, this.field178, this.field164);
        }
        if (this.field176 != 0) {
            if (this.field176 == 90) {
                var9.method131();
            }
            if (this.field176 == 180) {
                var9.method157();
            }
            if (this.field176 == 270) {
                var9.method149();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)I", line = 371)
    public static final int method73(int arg0, int arg1, int arg2, int arg3) {
        field167++;
        if (arg0 != 8) {
            method70((byte[]) null, (byte) -51, -107);
        }
        return arg3 >= arg2 ? (arg3 <= arg1 ? arg3 : arg1) : arg2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 383)
    public static final String method74(int arg0, int arg1, int arg2, byte[] arg3) {
        field186++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class194.field3129[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg2 != -1) {
            method69((class124) null, 11);
        }
        return new String(var4, 0, var5);
    }
}

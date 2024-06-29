import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class17 extends class175 {

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private int field243 = 1;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    private int field245 = 204;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    private int field249 = 1;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "[I")
    public static int[] field242 = new int[1000];

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "Lmb;")
    public static class96 field241 = class243.method1708("Spieler kann nicht gefunden werden: ", (byte) 123);

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Lmb;")
    private static class96 field239 = class243.method1708("Connecting to update server", (byte) 101);

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lmb;")
    public static class96 field250 = class243.method1708("null", (byte) 93);

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "Lmb;")
    public static class96 field251 = field239;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "Loa;")
    public static class262 field252 = new class262();

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static void method112(int arg0) {
        field241 = null;
        field250 = null;
        field251 = null;
        field239 = null;
        field242 = null;
        if (arg0 == -31873) {
            field252 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 25373) {
            field253 = 55;
        }
        if (~class233.field3999 != -1 && ~arg3 != -1 && class58.field1012 < 50 && arg1 != -1) {
            class134.field2402[class58.field1012] = arg1;
            class43.field741[class58.field1012] = arg3;
            class138.field2479[class58.field1012] = arg0;
            class154.field2711[class58.field1012] = null;
            class250.field4331[class58.field1012] = 0;
            ++class58.field1012;
        }
        ++field240;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = -125 % ((62 - arg0) / 54);
        ++field246;
        int[] var4 = super.field3044.method904((byte) -110, arg1);
        if (super.field3044.field2150) {
            for (int var5 = 0; ~var5 > ~class1.field11; ++var5) {
                int var6 = class244.field4240[var5];
                int var7 = class23.field395[arg1];
                int var8 = this.field243 * var7 >> 12;
                int var9 = this.field249 * var6 >> 12;
                int var10 = var6 % (4096 / this.field249) * this.field249;
                int var11 = var7 % (4096 / this.field243) * this.field243;
                if (var11 < this.field245) {
                    for (var9 -= var8; ~var9 > -1; var9 += 4) {
                    }
                    while (~var9 < -4) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field245) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field245) {
                    int var12;
                    for (var12 = var9 - var8; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class64.field1092 * arg3 + class128.field2337 * arg0 >> 16;
        int var6 = class128.field2337 * arg3 - class64.field1092 * arg0 >> 16;
        int var7 = class80.field1360 * var6 + class68.field1183 * arg1 >> 16;
        int var8 = class80.field1360 * arg1 - class68.field1183 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class80.field1360 * var6 + class68.field1183 * arg2 >> 16;
        int var12 = class80.field1360 * arg2 - class68.field1183 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class224.field3819 && var13 < class224.field3819) {
            return false;
        } else if (var9 > class245.field4263 && var13 > class245.field4263) {
            return false;
        } else if (var10 < class260.field4545 && var14 < class260.field4545) {
            return false;
        } else {
            return var10 <= class256.field4469 || var14 <= class256.field4469;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = 56 % ((arg0 - -22) / 58);
        ++field247;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field245 = arg2.method1663((byte) 67);
                }
            } else {
                this.field243 = arg2.method1651(4139);
            }
        } else {
            this.field249 = arg2.method1651(4139);
        }
    }
}

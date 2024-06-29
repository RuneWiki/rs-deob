import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class68 extends class64 {

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
    private int field1288 = 0;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    private int field1272 = 2048;

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
    private int field1287 = 10;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lsg;")
    public static class169 field1276 = class165.method1060("::", 1536);

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "[I")
    public static int[] field1282 = new int[32];

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "Lsg;")
    public static class169 field1273 = class165.method1060("Clientscript error )2 check log for details", 1536);

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lsg;")
    public static class169 field1283 = class165.method1060("Bitte warten Sie)3)3)3", 1536);

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lua;")
    public static class181 field1284 = new class181(64);

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "Lsg;")
    public static class169 field1290 = class165.method1060("lila:", 1536);

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lo;")
    public static class126 field1289;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "Lke;")
    public static class95 field1279;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "[I")
    private int[] field1281;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (arg0) {
            field1282 = null;
        }
        ++field1286;
        this.method430(-114);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILbg;IIIB)V")
    public static final void method427(int arg0, class18 arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1275;
        if (arg1 != null) {
            int var6 = 2047 & class29.field600 + class182.field3546;
            int var7 = arg0 * arg0 - -(arg4 * arg4);
            if (~var7 >= -6401) {
                int var8 = class12.field279[var6];
                int var9 = var8 * 256 / (class148.field2744 + 256);
                int var10 = class12.field283[var6];
                int var11 = var10 * 256 / (class148.field2744 - -256);
                int var12 = arg0 * var11 + arg4 * var9 >> 16;
                int var13 = arg4 * var11 + -(arg0 * var9) >> 16;
                if (var7 > 2500) {
                    arg1.method109(class115.field2103, -(arg1.field414 / 2) + var12 + 4 + arg2 + 94, -(arg1.field411 / 2) + -var13 + arg3 - -79);
                } else {
                    arg1.method123(arg2 + var12 - -94 + -(arg1.field414 / 2) + 4, arg3 + 83 - arg1.field411 / 2 + -var13 + -4);
                }
                if (arg5 >= -34) {
                    method428(-108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
    public static void method428(int arg0) {
        field1289 = null;
        field1290 = null;
        field1284 = null;
        field1283 = null;
        field1282 = null;
        field1276 = null;
        field1273 = null;
        if (arg0 != -79) {
            field1283 = null;
        }
        field1279 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field1271;
        int[] var3 = super.field1192.method19((byte) 123, arg0);
        if (super.field1192.field75) {
            int var4 = class189.field3699[arg0];
            if (~this.field1288 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1287 < ~var6; ++var6) {
                    if (var4 >= this.field1281[var6] && ~var4 > ~this.field1281[var6 + 1]) {
                        if (~var4 > ~this.field1280[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class97.method581(var3, 0, class147.field2715, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class147.field2715; ++var7) {
                    int var8 = class185.field3607[var7];
                    int var9 = 0;
                    int var10 = this.field1288;
                    if (var10 != 1) {
                        if (~var10 != -3) {
                            if (var10 == 3) {
                                var9 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var4 - 4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var9 = var8;
                    }
                    short var11 = 0;
                    for (int var12 = 0; this.field1287 > var12; ++var12) {
                        if (this.field1281[var12] <= var9 && this.field1281[var12 + 1] > var9) {
                            if (~this.field1280[var12] < ~var9) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return arg1 != 19 ? null : var3;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLke;Lke;)V")
    public static final void method429(boolean arg0, class95 arg1, class95 arg2) {
        ++field1285;
        class87.field1594 = arg2;
        class65.field1210 = arg1;
        class11.field271 = class65.field1210.method570((byte) 113, 3);
        if (!arg0) {
            method427(65, (class18) null, 123, -88, 92, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
    private final void method430(int arg0) {
        ++field1277;
        this.field1280 = new int[this.field1287 + 1];
        this.field1281 = new int[this.field1287 + 1];
        int var2 = 4096 / this.field1287;
        int var3 = this.field1272 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; this.field1287 > var5; ++var5) {
            this.field1281[var5] = var4;
            this.field1280[var5] = var3 + var4;
            var4 += var2;
        }
        int var6 = -105 / ((-56 - arg0) / 50);
        this.field1281[this.field1287] = 4096;
        this.field1280[this.field1287] = this.field1280[0] + 4096;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -75 % ((arg0 - -60) / 36);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1288 = arg1.method819((byte) 22);
                }
            } else {
                this.field1272 = arg1.method785(true);
            }
        } else {
            this.field1287 = arg1.method819((byte) 22);
        }
        ++field1278;
    }
}

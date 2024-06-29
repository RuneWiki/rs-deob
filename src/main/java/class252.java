import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class252 extends class124 {

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    private int field4459 = 4096;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Le;")
    public static class191 field4460 = class54.method368(")4l=", 2047);

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field4461 = 0;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "[Le;")
    public static class191[] field4466 = new class191[200];

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Le;")
    public static class191 field4468 = class54.method368("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 2047);

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "Lkh;")
    public static class5 field4471 = new class5();

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "Z")
    public static boolean field4472 = true;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "Le;")
    public static class191 field4473 = class54.method368("<br>(X100(U(Y", 2047);

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)[Lmh;")
    public static final class232[] method1749(int arg0) {
        ++field4464;
        class232[] var1 = new class232[class232.field4145];
        for (int var2 = arg0; ~var2 > ~class232.field4145; ++var2) {
            var1[var2] = new class60(class36.field661, class3.field22, class253.field4489[var2], class245.field4360[var2], class68.field1183[var2], class47.field842[var2], class161.field2731[var2], class19.field261);
        }
        class228.method1628((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIILab;ZI)V")
    public static final void method1750(byte arg0, int arg1, int arg2, class248 arg3, boolean arg4, int arg5) {
        ++field4462;
        if (class249.field4422 < 50) {
            if (arg3.field4390 != null && ~arg3.field4390.length < ~arg5 && arg3.field4390[arg5] != null) {
                if (arg0 == -8) {
                    int var6 = arg3.field4390[arg5][0];
                    int var7 = var6 >> 8;
                    int var8 = 15 & var6;
                    if (~arg3.field4390[arg5].length < -2) {
                        int var9 = (int) (Math.random() * (double) arg3.field4390[arg5].length);
                        if (var9 > 0) {
                            var7 = arg3.field4390[arg5][var9];
                        }
                    }
                    int var10 = var6 >> 4 & 7;
                    if (var8 == 0) {
                        if (arg4) {
                            class147.method989(var7, true, 0, var10);
                        }
                    } else if (class173.field2904 != 0) {
                        int var11 = (arg2 + -64) / 128;
                        int var12 = (arg1 + -64) / 128;
                        class253.field4480[class249.field4422] = var7;
                        class245.field4355[class249.field4422] = var10;
                        class90.field1453[class249.field4422] = 0;
                        class129.field2149[class249.field4422] = null;
                        class21.field287[class249.field4422] = (var12 << 16) - -(var11 << 8) + var8;
                        ++class249.field4422;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static final void method1751(boolean arg0) {
        class153.field2624 = null;
        class104.field1718 = null;
        if (!arg0) {
            method1752(-77);
        }
        class165.field2792 = null;
        class4.field33 = null;
        ++field4463;
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(I)V")
    public static final void method1752(int arg0) {
        ++field4470;
        try {
            if (~class273.field4825 == -2) {
                int var1 = class42.field733.method1525(false);
                if (var1 > 0 && class42.field733.method1529(true)) {
                    int var2 = var1 - class5.field42;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class42.field733.method1522(-21293, var2);
                    return;
                }
                class42.field733.method1539((byte) 58);
                class42.field733.method1537(false);
                class221.field3909 = null;
                if (class170.field2878 != null) {
                    class273.field4825 = 2;
                } else {
                    class273.field4825 = 0;
                }
                class225.field4053 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class42.field733.method1539((byte) 61);
            class221.field3909 = null;
            class225.field4053 = null;
            class273.field4825 = 0;
            class170.field2878 = null;
        }
        if (arg0 <= 49) {
            field4473 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field4469;
        if (arg0 < 68) {
            field4473 = null;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 58, arg1 + -1 & class181.field3119);
            int[] var5 = this.method844(0, 118, arg1);
            int[] var6 = this.method844(0, 74, class181.field3119 & arg1 + 1);
            for (int var7 = 0; ~var7 > ~class64.field1132; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field4459;
                int var9 = (var5[var7 + 1 & class8.field82] + -var5[class8.field82 & var7 + -1]) * this.field4459;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static void method1753(boolean arg0) {
        field4466 = null;
        if (arg0) {
            field4468 = null;
            field4471 = null;
            field4473 = null;
            field4460 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field4459 = arg1.method1593(arg2);
        }
        if (!arg2) {
            method1749(-77);
        }
        ++field4465;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lng;I)V")
    public static final void method1754(class121 arg0, int arg1) {
        ++field4467;
        if (!class81.field1366) {
            class7.method47();
            int var2 = 38 % ((arg1 - 51) / 61);
            class135.field2260 = class22.method167((byte) -123, class223.field3978, arg0);
            int var3 = class190.field3337;
            int var4 = var3 * 956 / 503;
            class135.field2260.method1063((-var4 + class200.field3584) / 2, 0, var4, var3);
            class211.field3735 = class101.method626(arg0, -7233, class222.field3970);
            class211.field3735.method404(class200.field3584 / 2 + -(class211.field3735.field4146 / 2), 18);
            class81.field1366 = true;
        }
    }
}

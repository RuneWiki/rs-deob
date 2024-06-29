import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class227 extends class195 {

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    private int field3626 = 0;

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "[S")
    private short[] field3635 = new short[257];

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "Lck;")
    public static class119 field3627 = class298.method1987((byte) 36, "<col=80ff00>");

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "Lck;")
    public static class119 field3633 = null;

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "Lvk;")
    public static class67 field3632 = new class67(64);

    @OriginalMember(owner = "client!cl", name = "nb", descriptor = "Lck;")
    public static class119 field3638 = class298.method1987((byte) 27, "NVIDIA");

    @OriginalMember(owner = "client!cl", name = "mb", descriptor = "Ljc;")
    public static class147 field3637 = new class147(5000);

    @OriginalMember(owner = "client!cl", name = "pb", descriptor = "Lki;")
    public static class58 field3640 = new class58();

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!cl", name = "ob", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!cl", name = "qb", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!cl", name = "rb", descriptor = "J")
    public static long field3642;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "[I")
    private int[] field3624;

    @OriginalMember(owner = "client!cl", name = "lb", descriptor = "[I")
    private int[] field3636;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "[[I")
    private int[][] field3634;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 5)
    private final void method1440(int arg0) {
        if (arg0 != 32768) {
            this.field3635 = (short[]) null;
        }
        int var2 = this.field3626;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3634.length - 1 && var21 >= this.field3634[var22][0]; var22++) {
                }
                int[] var23 = this.field3634[var22 - 1];
                int[] var24 = this.field3634[var22];
                int var25 = this.method1446(false, var22 - 2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1446(false, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var27 + var28 - var25 - var26;
                int var31 = var25 - var30 - var27;
                int var32 = var29 * var29 >> 12;
                int var34 = (var29 * var30 >> 12) * var32 >> 12;
                int var35 = var26 - var25;
                int var36 = var29 * var35 >> 12;
                int var37 = var31 * var32 >> 12;
                int var38 = var34 + var37 + var36 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3635[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field3634.length - 1) > var5 && this.field3634[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3634[var5 - 1];
                int[] var7 = this.field3634[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - class237.field3802[var8 >> 5 & 0xFF] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field3635[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; (this.field3634.length - 1) > var14 && var13 >= this.field3634[var14][0]; var14++) {
                }
                int[] var15 = this.field3634[var14];
                int[] var16 = this.field3634[var14 - 1];
                int var17 = (var13 - var16[0] << 12) / (var15[0] - var16[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field3635[var12] = (short) var19;
            }
        }
        field3620++;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 183)
    public final void method14(int arg0) {
        if (this.field3634 == null) {
            this.field3634 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3625++;
        if (arg0 != 2048879374) {
            this.method14(-85);
        }
        if (this.field3634.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3626 == 2) {
            this.method1442((byte) 86);
        }
        class166.method1046((byte) 90);
        this.method1440(32768);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)[I", line = 214)
    public final int[] method11(int arg0, boolean arg1) {
        field3629++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 102, arg0);
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3635[var6];
            }
        }
        if (arg1) {
            this.method1442((byte) -25);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 484)
    public class227() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BJ)V", line = 261)
    public static final void method1441(byte arg0, long arg1) {
        field3630++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class97.field1482 < 100 || class140.field2254 == 1) || class97.field1482 >= 200) {
            class54.method401((byte) -128, class273.field4480, 0, class203.field3220);
            return;
        }
        class119 var3 = class147.method963((byte) 0, arg1).method785(79);
        for (int var4 = 0; var4 < class97.field1482; var4++) {
            if (class203.field3217[var4] == arg1) {
                class54.method401((byte) -125, class170.method1074(new class119[] { var3, class126.field1946 }, -121), 0, class203.field3220);
                return;
            }
        }
        for (int var5 = 0; var5 < class151.field2399; var5++) {
            if (class96.field1476[var5] == arg1) {
                class54.method401((byte) -104, class170.method1074(new class119[] { class244.field3955, var3, class69.field1078 }, -103), 0, class203.field3220);
                return;
            }
        }
        if (var3.method784(class124.field1917.field4861, 123)) {
            class54.method401((byte) -118, class283.field4671, 0, class203.field3220);
            return;
        }
        class126.field1941[class97.field1482] = var3;
        class281.field4641++;
        class203.field3217[class97.field1482] = arg1;
        class283.field4680[class97.field1482] = 0;
        class64.field1016[class97.field1482] = class203.field3220;
        class168.field2647[class97.field1482] = 0;
        class266.field4365[class97.field1482] = false;
        class97.field1482++;
        class261.field4196 = class94.field1456;
        class6.field149.method966(0, 159);
        class6.field149.method29(2069, arg1);
        if (arg0 > -48) {
            field3638 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 342)
    private final void method1442(byte arg0) {
        field3619++;
        if (arg0 != 86) {
            return;
        }
        int[] var2 = this.field3634[0];
        int[] var3 = this.field3634[1];
        int[] var4 = this.field3634[this.field3634.length - 1];
        int[] var5 = this.field3634[this.field3634.length - 2];
        this.field3624 = new int[] { var5[0] + var5[0] - var4[0], var5[1] + -var4[1] + var5[1] };
        this.field3636 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBIIIII)V", line = 365)
    public static final void method1443(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 + arg5;
        int var9 = 54 % ((48 - arg2) / 37);
        field3631++;
        int var10 = arg0 + arg3;
        int var11 = arg7 - arg3;
        int var12 = arg1 - arg3;
        for (int var13 = arg5; var13 < var8; var13++) {
            class36.method282(arg7, arg0, arg4, class256.field4113[var13], 26175);
        }
        for (int var14 = arg1; var14 > var12; var14--) {
            class36.method282(arg7, arg0, arg4, class256.field4113[var14], 26175);
        }
        for (int var15 = var8; var15 <= var12; var15++) {
            int[] var16 = class256.field4113[var15];
            class36.method282(var10, arg0, arg4, var16, 26175);
            class36.method282(var11, var10, arg6, var16, 26175);
            class36.method282(arg7, var11, arg4, var16, 26175);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 410)
    public static final void method1444(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class212.field3379[var1] = true;
        }
        if (arg0 != 1) {
            field3621 = 50;
        }
        field3628++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lw;", line = 431)
    public static final class170 method1445(int arg0, int arg1) {
        field3639++;
        class170 var2 = (class170) class20.field269.method524((byte) 118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class270.field4460.method261(-1, 0, arg1 & 0x7FFF);
        } else {
            var3 = class161.field2557.method261(-1, 0, arg1);
        }
        class170 var4 = new class170();
        if (var3 != null) {
            var4.method1076((byte) 101, new class3(var3));
        }
        if (arg0 >= ~arg1) {
            var4.method1078(-3);
        }
        class20.field269.method527((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)[I", line = 467)
    private final int[] method1446(boolean arg0, int arg1) {
        field3622++;
        if (arg1 < 0) {
            return this.field3636;
        } else {
            if (arg0) {
                this.method13((class3) null, 88, -96);
            }
            return arg1 < this.field3634.length ? this.field3634[arg1] : this.field3624;
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V", line = 497)
    public static void method1447(int arg0) {
        field3640 = null;
        if (arg0 > -127) {
            return;
        }
        field3633 = null;
        field3637 = null;
        field3632 = null;
        field3638 = null;
        field3627 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfj;II)V", line = 519)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field3623++;
        if (arg1 > -117) {
            this.field3634 = (int[][]) ((int[][]) null);
        }
        if (arg2 != 0) {
            return;
        }
        this.field3626 = arg0.method64((byte) -127);
        this.field3634 = new int[arg0.method64((byte) 81)][2];
        for (int var4 = 0; var4 < this.field3634.length; var4++) {
            this.field3634[var4][0] = arg0.method63((byte) 1);
            this.field3634[var4][1] = arg0.method63((byte) 1);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class257 extends class212 {

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    private int field4493 = 4;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    private int field4490 = 4;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    public static int field4499 = 0;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "Lvb;")
    public static class247 field4495 = new class247();

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "Lsc;")
    public static class181 field4501 = class149.method967(255, "mem=");

    @OriginalMember(owner = "client!hk", name = "jb", descriptor = "[I")
    public static int[] field4502 = new int[5];

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!hk", name = "kb", descriptor = "Ldg;")
    public static class90 field4503;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)Lfj;")
    public static final class164 method1748(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        return var3 != null && var3.field3805 != null ? var3.field3805 : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class76.field1222 = -1;
        class98.field1584 = -1;
        ++field4494;
        if (arg2 != 2348) {
            field4503 = null;
        }
        class152.field2537 = class62.field967 * arg1 / arg0;
        class203.field3489 = class222.field3840 * arg4 / arg3;
        class25.method218(123);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
    public static final void method1750(int arg0, int arg1) {
        ++field4487;
        if (arg0 <= -118) {
            class69.field1101.method1796(20, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
    public static final void method1751(boolean arg0, int arg1) {
        class98.field1584 = -1;
        class76.field1222 = -1;
        if (!arg0) {
            ++field4498;
            class152.field2537 = arg1;
            class25.method218(126);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field4502 = null;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4490 = arg0.method1516((byte) 82);
            }
        } else {
            this.field4493 = arg0.method1516((byte) 82);
        }
        ++field4492;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field4496;
        int[][] var3 = super.field3645.method1352(arg0, -118);
        if (arg1 != 16383) {
            return null;
        } else {
            if (super.field3645.field3477) {
                int var4 = class26.field452 / this.field4493;
                int var5 = class97.field1577 / this.field4490;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method1410(0, 0, (byte) -66);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1410(class97.field1577 * var7 / var5, 0, (byte) -103);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[2];
                int[] var10 = var3[2];
                int[] var11 = var3[1];
                int[] var12 = var6[1];
                int[] var13 = var3[0];
                for (int var14 = 0; class26.field452 > var14; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class26.field452 * var16 / var4;
                    }
                    var13[var14] = var8[var15];
                    var11[var14] = var12[var15];
                    var10[var14] = var9[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field4489;
        if (arg1 <= 25) {
            return null;
        } else {
            int[] var3 = super.field3640.method737(true, arg0);
            if (super.field3640.field1813) {
                int var4 = class26.field452 / this.field4493;
                int var5 = class97.field1577 / this.field4490;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method1405(0, 0, 76);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1405(class97.field1577 * var7 / var5, 0, 96);
                }
                for (int var8 = 0; ~var8 > ~class26.field452; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class26.field452 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 != -250) {
            field4491 = -2;
        }
        field4495 = null;
        field4503 = null;
        field4502 = null;
        field4501 = null;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public static final void method1753(byte arg0) {
        if (arg0 >= 120) {
            ++field4488;
            if (class177.field3100 != null) {
                try {
                    byte[] var1 = class177.field3100.method1482(true);
                    if (var1 != null) {
                        class230 var2 = new class230(var1);
                        class148.field2474 = var2.method1535(2);
                        class131.field2167 = new class192[class148.field2474];
                        for (int var3 = 0; class148.field2474 > var3; ++var3) {
                            class192 var4 = class131.field2167[var3] = new class192();
                            int var5 = var2.method1535(2);
                            var4.field3380 = var5 & 32767;
                            var4.field3368 = ~(32768 & var5) != -1;
                            var4.field3379 = var2.method1549(35);
                            var4.field3371 = var2.method1515(49);
                            var4.field3377 = var3;
                            int var6 = var2.method1535(2);
                            var4.field3372 = class162.method1085(var6, (byte) -88);
                        }
                        class256.method1744(class131.field2167, -8684, class131.field2167.length + -1, 0);
                        class177.field3100 = null;
                    }
                } catch (Exception var8) {
                    var8.printStackTrace();
                    class177.field3100 = null;
                }
            }
        }
    }
}

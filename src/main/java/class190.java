import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class190 extends class114 {

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Llm;")
    public static class150 field2880 = new class150(16);

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lgb;")
    public static class69 field2881 = new class69();

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[Lqe;")
    public static class295[] field2884 = new class295[8];

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "S")
    public static short field2886 = 320;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        class78.field1084.method944(92);
        int var1 = -127 % ((67 - arg0) / 46);
        ++field2876;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field2877;
        if (arg0 != -112) {
            field2880 = null;
        }
        int[][] var3 = super.field1627.method104(arg1, (byte) 106);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, arg1, 842);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class145.field2009; ++var11) {
                var7[var11] = -var6[var11] + 4096;
                var10[var11] = -var5[var11] + 4096;
                var9[var11] = -var8[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public static void method1198(byte arg0) {
        if (arg0 == -107) {
            field2884 = null;
            field2880 = null;
            field2881 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1199(int arg0, int arg1, int arg2, long arg3) {
        class91 var5 = class246.field3856[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1334 != null && var5.field1334.field2737 == arg3) {
            return true;
        } else if (var5.field1329 != null && var5.field1329.field1055 == arg3) {
            return true;
        } else if (var5.field1323 != null && var5.field1323.field4950 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1343; ++var6) {
                if (var5.field1339[var6].field2225 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJIIZ)Ljava/lang/String;")
    public static final String method1200(int arg0, long arg1, int arg2, int arg3, boolean arg4) {
        char var6 = (char) arg0;
        ++field2885;
        boolean var7 = false;
        if (~arg1 > -1L) {
            arg1 = -arg1;
            var7 = true;
        }
        char var8 = '.';
        if (~arg3 == -1) {
            var8 = ',';
            var6 = '.';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg3 == -3) {
            var8 = 160;
        }
        if (arg2 > 0) {
            for (int var10 = 0; arg2 > var10; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (-((int) arg1 * 10) + var11 + 48));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - -var13 - (int) arg1 * 10));
            if (~arg1 == -1L) {
                if (var7) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -105);
        if (arg1) {
            field2881 = null;
        }
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            for (int var5 = 0; ~class145.field2009 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        ++field2875;
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field2878;
        if (arg1 == 0) {
            super.field1648 = arg0.method1374((byte) -60) == 1;
        }
        if (arg2 != 12953) {
            method1200(-121, 87L, 19, 26, false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[Lim;I)V")
    public static final void method1201(int arg0, class178[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; ++var3) {
            class178 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field2608 == -1) {
                    if (var4.field2642 != null) {
                        method1201(arg0, var4.field2642, arg2);
                    }
                    class60 var5 = (class60) class186.field2821.method1453(true, (long) var4.field2545);
                    if (var5 != null) {
                        class68.method451(arg2, (byte) -107, var5.field831);
                    }
                }
                if (~arg2 == -1 && var4.field2671 != null) {
                    class272 var6 = new class272();
                    var6.field4337 = var4;
                    var6.field4340 = var4.field2671;
                    class160.method994((byte) -112, var6);
                }
                if (~arg2 == -2 && var4.field2539 != null) {
                    if (~var4.field2576 <= -1) {
                        class178 var7 = class166.method1057(-126, var4.field2545);
                        if (var7 == null || var7.field2642 == null || ~var4.field2576 <= ~var7.field2642.length || var7.field2642[var4.field2576] != var4) {
                            continue;
                        }
                    }
                    class272 var8 = new class272();
                    var8.field4340 = var4.field2539;
                    var8.field4337 = var4;
                    class160.method994((byte) -112, var8);
                }
            }
        }
        ++field2879;
        if (arg0 != -1) {
            method1201(84, (class178[]) null, -26);
        }
    }
}

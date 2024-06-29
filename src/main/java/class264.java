import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class264 extends class222 {

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
    public boolean field4698;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[Lmg;")
    public class264[] field4709;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[I")
    public static int[] field4708 = new int[2048];

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Lcf;")
    public static class93 field4717 = class147.method1066("", -48);

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lcf;")
    private static class93 field4721 = class147.method1066("Loaded world list data", -48);

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lcf;")
    public static class93 field4704 = field4721;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lmh;")
    public class152 field4705;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lhg;")
    public static class177 field4714;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "Lng;")
    public class76 field4716;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[Ldh;")
    public static class120[] field4700;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[Lwc;")
    public static class229[] field4701;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BZB[Lvf;II)V")
    public static final void method1766(byte[] arg0, boolean arg1, byte arg2, class102[] arg3, int arg4, int arg5) {
        field4710++;
        class280 var6 = new class280(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1915(2029724776);
            if (var8 == 0) {
                if (arg2 != 29) {
                    method1774(57, -64);
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1924(arg2 ^ 0x1FB9);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1907(16832);
                int var15 = arg4 + var12;
                int var16 = arg5 + var11;
                int var17 = var14 >> 2;
                int var18 = var14 & 0x3;
                if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                    class102 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((class4.field53[1][var15][var16] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class90.method627(var13, var19, var17, -126, var13, var15, var18, !arg1, var7, arg1, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[I")
    public int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            this.field4705 = null;
        }
        field4720++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILee;)V")
    public void method20(int arg0, int arg1, class280 arg2) {
        field4699++;
        if (arg0 <= 11) {
            this.method72(35);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)[I")
    public final int[] method1767(int arg0, int arg1, int arg2) {
        field4696++;
        if (arg2 != 21654) {
            field4719 = -101;
        }
        return this.field4709[arg0].field4698 ? this.field4709[arg0].method22(arg1, (byte) -112) : this.field4709[arg0].method17(arg1, false)[0];
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public void method64(int arg0) {
        field4711++;
        if (arg0 != -3) {
            this.method72(-18);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
    public static final void method1768(boolean arg0, int arg1) {
        field4713++;
        byte[][] var2 = class204.field3675;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = arg1; var5 < var4; var5++) {
            int var11 = (class149.field2614[var5] >> 8) * 64 - class229.field4111;
            int var12 = (class149.field2614[var5] & 0xFF) * 64 - class4.field52;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class226.method1559(false);
                class273.method1811(class15.field188 * 8 - 48, class148.field2605, var13, arg0, (byte) 111, var11, var12, (class212.field3894 - 6) * 8);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class149.field2614[var6] >> 8) * 64 - class229.field4111;
            byte[] var8 = var2[var6];
            int var9 = (class149.field2614[var6] & 0xFF) * 64 - class4.field52;
            if (var8 == null && class15.field188 < 800) {
                class226.method1559(false);
                for (int var10 = 0; var10 < var3; var10++) {
                    class82.method578(64, var9, var7, var10, 25157, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
    public int method1769(int arg0) {
        field4702++;
        int var2 = 4 / ((arg0 + 36) / 56);
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field4714 = null;
        field4708 = null;
        if (arg0 != 0) {
            return;
        }
        field4701 = null;
        field4721 = null;
        field4700 = null;
        field4717 = null;
        field4704 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public void method67(byte arg0) {
        field4703++;
        if (arg0 < 42) {
            return;
        }
        if (this.field4698) {
            this.field4716.method530(0);
            this.field4716 = null;
        } else {
            this.field4705.method1093(31);
            this.field4705 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
    public final void method1771(int arg0, int arg1, int arg2) {
        int var4 = this.field4707 == 255 ? arg2 : this.field4707;
        if (this.field4698) {
            this.field4716 = new class76(var4, arg2, arg0);
        } else {
            this.field4705 = new class152(var4, arg2, arg0);
        }
        if (arg1 < -92) {
            field4712++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIIILee;III)V")
    public static final void method1772(int arg0, boolean arg1, int arg2, int arg3, int arg4, class280 arg5, int arg6, int arg7, int arg8) {
        field4718++;
        if (arg7 >= 0 && arg7 < 104 && arg2 >= 0 && arg2 < 104) {
            if (!arg1) {
                class4.field53[arg8][arg7][arg2] = 0;
            }
            while (true) {
                int var9 = arg5.method1907(16832);
                if (var9 == 0) {
                    if (arg1) {
                        class233.field4151[0][arg7][arg2] = class69.field1265[0][arg7][arg2];
                    } else if (arg8 == 0) {
                        class233.field4151[0][arg7][arg2] = -class117.method870(arg6 + arg7 + 932731, 556238 - -arg4 + arg2, -20925) * 8;
                    } else {
                        class233.field4151[arg8][arg7][arg2] = class233.field4151[arg8 - 1][arg7][arg2] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method1907(16832);
                    if (arg1) {
                        class233.field4151[0][arg7][arg2] = var10 * 8 + class69.field1265[0][arg7][arg2];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg8 == 0) {
                            class233.field4151[0][arg7][arg2] = -var10 * 8;
                        } else {
                            class233.field4151[arg8][arg7][arg2] = class233.field4151[arg8 - 1][arg7][arg2] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class164.field2887[arg8][arg7][arg2] = arg5.method1925(true);
                    class187.field3447[arg8][arg7][arg2] = (byte) ((var9 - 2) / 4);
                    class249.field4490[arg8][arg7][arg2] = (byte) class58.method333(3, var9 + arg0 - 2);
                } else if (var9 > 81) {
                    class70.field1283[arg8][arg7][arg2] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class4.field53[arg8][arg7][arg2] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method1907(16832);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method1907(16832);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method1907(16832);
                }
            }
        }
        if (arg3 != 104) {
            method1774(2, 108);
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I")
    public int method72(int arg0) {
        if (arg0 != -1) {
            field4717 = null;
        }
        field4715++;
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)[[I")
    public final int[][] method1773(int arg0, int arg1, int arg2) {
        if (arg0 > -114) {
            return null;
        }
        field4706++;
        if (this.field4709[arg1].field4698) {
            int[] var4 = this.field4709[arg1].method22(arg2, (byte) -111);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4709[arg1].method17(arg2, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lic;")
    public static final class141 method1774(int arg0, int arg1) {
        field4722++;
        class141 var2 = (class141) class63.field1128.method302((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field4242.method1271(class86.method592(arg0, false), arg1 - 2148, class4.method13(arg1 + 1029, arg0));
        class141 var4 = new class141();
        if (var3 != null) {
            var4.method1028(-1, new class280(var3));
        }
        class63.field1128.method297((long) arg0, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)[[I")
    public int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.field4705 = null;
        }
        field4697++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IZ)V")
    public class264(int arg0, boolean arg1) {
        this.field4698 = arg1;
        this.field4709 = new class264[arg0];
    }
}

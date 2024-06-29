import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class444 extends class233 implements class9 {

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "Z")
    private boolean field6387;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "Z")
    private boolean field6388;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "B")
    private byte field6376;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "S")
    private short field6372;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Z")
    private boolean field6374;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "B")
    private byte field6386;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "B")
    private byte field6384;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
    private boolean field6370;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lmm;")
    private class152 field6361;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Lbk;")
    public class210 field6358;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Llg;")
    public static class237 field6373 = new class237(50);

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
    public final int method68(int arg0) {
        ++field6389;
        if (arg0 < 118) {
            this.method66((class134) null, 39);
        }
        return this.field6384;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field6371;
        if (arg2 != 4835) {
            return true;
        } else {
            class210 var5 = this.method2764((byte) 66, 65536, arg1);
            if (var5 != null) {
                class18 var6 = arg1.method649();
                var6.method116(super.field3284, super.field3287, super.field3269);
                return var5.method1382(arg0, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)I")
    public final int method61(int arg0) {
        if (arg0 != 131910471) {
            this.field6388 = false;
        }
        ++field6357;
        return this.field6358 == null ? 0 : this.field6358.method1405();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILae;)Lbk;")
    private final class210 method2764(byte arg0, int arg1, class134 arg2) {
        ++field6378;
        if (this.field6358 != null && ~arg2.method689(this.field6358.method1410(), arg1) == -1) {
            return this.field6358;
        } else {
            class371 var4 = this.method2767(-123, arg2, arg1, false);
            if (arg0 != 66) {
                this.method52((byte) 53, (class134) null);
            }
            return var4 != null ? var4.field5233 : null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        ++field6383;
        if (arg0 >= -36) {
            this.field6388 = true;
        }
        return this.field6372 & 65535;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLae;)Ljg;")
    public final class186 method52(byte arg0, class134 arg1) {
        ++field6367;
        if (this.field6358 == null) {
            return null;
        } else {
            class18 var3 = arg1.method649();
            var3.method116(super.field3284, super.field3287, super.field3269);
            class186 var4 = null;
            if (arg0 != -120) {
                this.method60(true, (byte) -124, -119, 93, (class29) null, -67, (class134) null);
            }
            if (this.field6374) {
                var4 = class348.method2229(1, 21534);
            }
            this.field6358.method1416(var3, var4 != null ? var4.field2704[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lae;I)V")
    public final void method66(class134 arg0, int arg1) {
        ++field6359;
        Object var3 = null;
        class152 var5;
        if (this.field6361 == null && this.field6370) {
            class371 var4 = this.method2767(-128, arg0, 131072, true);
            var5 = var4 != null ? var4.field5235 : null;
        } else {
            var5 = this.field6361;
            this.field6361 = null;
        }
        if (var5 != null) {
            class122.method778(var5, this.field6386, super.field3284, super.field3269, (boolean[]) null);
        }
        if (arg1 != 4257) {
            this.method51(-1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static final void method2765(byte arg0) {
        ++field6366;
        class287 var1 = null;
        try {
            class315 var2 = class14.field185.method1264(true);
            while (var2.field4498 == 0) {
                class150.method907(1L, (byte) -32);
            }
            if (var2.field4498 == 1) {
                var1 = (class287) var2.field4497;
                byte[] var3 = new byte[(int) var1.method1876(13136)];
                int var5;
                for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                    var5 = var1.method1875(var3.length + -var4, -10022, var3, var4);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class7.method47(new class236(var3), true);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1877(arg0 + 41);
            }
        } catch (Exception var6) {
        }
        if (arg0 != -41) {
            field6373 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field6381;
            return this.field6387;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZBIILna;ILae;)V")
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -83 % ((arg1 - -16) / 62);
        ++field6362;
        if (!(arg4 instanceof class335)) {
            if (arg4 instanceof class444) {
                class444 var9 = (class444) arg4;
                if (this.field6358 != null && var9.field6358 != null) {
                    this.field6358.method1421(var9.field6358, arg3, arg2, arg5, arg0);
                    return;
                }
            }
        } else {
            class335 var10 = (class335) arg4;
            if (this.field6358 == null || var10.field4737 == null) {
                return;
            }
            this.field6358.method1421(var10.field4737, arg3, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lae;ZI)Lbk;")
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field6370 = true;
        }
        ++field6375;
        return this.method2764((byte) 66, arg2, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field6380;
        if (arg0 != 17184) {
            this.method2770(76);
        }
        if (this.field6358 != null) {
            this.field6358.method1409();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z[I[JII)V")
    public static final void method2766(boolean arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
        if (arg0) {
            ++field6360;
            if (~arg4 > ~arg3) {
                int var5 = (arg4 - -arg3) / 2;
                int var6 = arg4;
                long var7 = arg2[var5];
                arg2[var5] = arg2[arg3];
                arg2[arg3] = var7;
                int var9 = arg1[var5];
                arg1[var5] = arg1[arg3];
                arg1[arg3] = var9;
                for (int var10 = arg4; ~var10 > ~arg3; ++var10) {
                    if (~((long) (1 & var10) + var7) < ~arg2[var10]) {
                        long var11 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6] = var11;
                        int var13 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6++] = var13;
                    }
                }
                arg2[arg3] = arg2[var6];
                arg2[var6] = var7;
                arg1[arg3] = arg1[var6];
                arg1[var6] = var9;
                method2766(true, arg1, arg2, var6 + -1, arg4);
                method2766(arg0, arg1, arg2, arg3, var6 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lae;Ljh;IIIIIZIIIIIIZ)V")
    public class444(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1031 == -2, class184.method1241(arg13, (byte) 24, arg12));
        this.field6387 = arg14;
        this.field6388 = arg7;
        this.field6376 = (byte) arg12;
        this.field6372 = (short) arg1.field1026;
        this.field6374 = ~arg1.field998 != -1 && !arg7;
        this.field6386 = (byte) arg3;
        this.field6384 = (byte) arg13;
        this.field6370 = arg0.method615() && arg1.field995 && !this.field6388 && class141.field1739 != 0;
        int var16 = 1024;
        if (this.field6387) {
            var16 |= 32768;
        }
        class371 var17 = this.method2767(-122, arg0, var16, this.field6370);
        if (var17 != null) {
            this.field6361 = var17.field5235;
            this.field6358 = var17.field5233;
            if (this.field6387) {
                this.field6358 = this.field6358.method1411((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Z")
    public final boolean method67(int arg0) {
        ++field6385;
        if (arg0 != -3673) {
            this.field6372 = 110;
        }
        return this.field6370;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILae;)V")
    public final void method72(int arg0, class134 arg1) {
        int var3 = -17 % (arg0 / 55);
        ++field6369;
        Object var4 = null;
        class152 var6;
        if (this.field6361 == null && this.field6370) {
            class371 var5 = this.method2767(28, arg1, 131072, true);
            var6 = var5 == null ? null : var5.field5235;
        } else {
            var6 = this.field6361;
            this.field6361 = null;
        }
        if (var6 != null) {
            class258.method1733(var6, this.field6386, super.field3284, super.field3269, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILae;IZ)Lsk;")
    private final class371 method2767(int arg0, class134 arg1, int arg2, boolean arg3) {
        ++field6368;
        int var5 = -10 / ((arg0 - -77) / 45);
        class88 var6 = class374.method2382(this.field6372 & 65535, false);
        class327 var7;
        class327 var8;
        if (this.field6388) {
            var7 = class98.field1191[0];
            var8 = class399.field5693[this.field6386];
        } else {
            var8 = class98.field1191[this.field6386];
            if (~this.field6386 > -4) {
                var7 = class98.field1191[this.field6386 + 1];
            } else {
                var7 = null;
            }
        }
        return var6.method482(this.field6376 == 11 ? 4 - -this.field6384 : this.field6384, arg3, var8, arg1, this.field6376 != 11 ? this.field6376 : 10, super.field3284, super.field3269, super.field3287, -114, arg2, var7);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field6377;
        this.field6387 = false;
        if (this.field6358 != null) {
            this.field6358.method1387(this.field6358.method1410() & -32769);
        }
        if (arg0 != 6) {
            this.method2764((byte) -43, -25, (class134) null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
    public final int method69(int arg0) {
        ++field6363;
        return arg0 != -5944 ? -73 : this.field6376;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6365;
        if (arg2 == -4097) {
            if (arg1 == arg3 && arg0 == arg5 && arg6 == arg7 && ~arg8 == ~arg9) {
                class128.method794(-117, arg4, arg6, arg9, arg0, arg3);
            } else {
                int var10 = arg3;
                int var11 = arg0;
                int var12 = arg3 * 3;
                int var13 = arg0 * 3;
                int var14 = arg1 * 3;
                int var15 = arg5 * 3;
                int var16 = arg7 * 3;
                int var17 = arg8 * 3;
                int var18 = -arg3 + var14 + -var16 + arg6;
                int var19 = arg9 + var15 + -arg0 - var17;
                int var20 = -var14 + -var14 + var16 + var12;
                int var21 = -var15 + var17 + -var15 + var13;
                int var22 = -var12 + var14;
                int var23 = -var13 + var15;
                for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = arg3 - -(var29 + var31 + var27 >> 12);
                    int var34 = (var28 + var30 + var32 >> 12) + arg0;
                    class128.method794(arg2 + 4011, arg4, var33, var34, var11, var10);
                    var10 = var33;
                    var11 = var34;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lae;B)V")
    public final void method64(class134 arg0, byte arg1) {
        if (arg1 < -50) {
            ++field6364;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public static void method2769(boolean arg0) {
        if (!arg0) {
            field6373 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)I")
    public final int method2770(int arg0) {
        ++field6382;
        if (arg0 != 4) {
            return 7;
        } else {
            return this.field6358 == null ? 15 : this.field6358.method1418() / 4;
        }
    }
}

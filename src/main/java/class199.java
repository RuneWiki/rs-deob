import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class199 extends class328 implements class238 {

    @OriginalMember(owner = "client!ffa", name = "W", descriptor = "Z")
    private boolean field2374;

    @OriginalMember(owner = "client!ffa", name = "nb", descriptor = "Z")
    private boolean field2391;

    @OriginalMember(owner = "client!ffa", name = "rb", descriptor = "S")
    private short field2395;

    @OriginalMember(owner = "client!ffa", name = "cb", descriptor = "Z")
    private boolean field2380;

    @OriginalMember(owner = "client!ffa", name = "kb", descriptor = "B")
    private byte field2388;

    @OriginalMember(owner = "client!ffa", name = "T", descriptor = "Z")
    private boolean field2371;

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "Lr;")
    private class196 field2368;

    @OriginalMember(owner = "client!ffa", name = "bb", descriptor = "Lka;")
    private class498 field2379;

    @OriginalMember(owner = "client!ffa", name = "mb", descriptor = "[[Z")
    public static boolean[][] field2390 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ffa", name = "gb", descriptor = "[I")
    public static int[] field2384 = new int[50];

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ffa", name = "R", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ffa", name = "U", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ffa", name = "V", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ffa", name = "X", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ffa", name = "Y", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ffa", name = "ab", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ffa", name = "db", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ffa", name = "eb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ffa", name = "fb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ffa", name = "hb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ffa", name = "ib", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ffa", name = "jb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ffa", name = "lb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ffa", name = "ob", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ffa", name = "pb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ffa", name = "qb", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ffa", name = "sb", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ffa", name = "tb", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ffa", name = "vb", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ffa", name = "ub", descriptor = "Loba;")
    private class276 field2398;

    @OriginalMember(owner = "client!ffa", name = "Z", descriptor = "Lnja;")
    public static class456 field2377;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(B)V", line = 7)
    public static void method1293(byte arg0) {
        if (arg0 == -113) {
            field2377 = null;
            field2390 = null;
            field2384 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZLha;)Loba;", line = 19)
    public final class276 method507(boolean arg0, class66 arg1) {
        if (arg0) {
            this.field2398 = null;
        }
        ++field2382;
        if (this.field2398 == null) {
            this.field2398 = class792.method4369(super.field809, super.field823, this.method1295(0, arg1, 0), (byte) -5, super.field813);
        }
        return this.field2398;
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)I", line = 36)
    public final int method509(int arg0) {
        int var2 = 61 % ((-38 - arg0) / 56);
        ++field2375;
        return this.field2379 == null ? 0 : this.field2379.method404();
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)I", line = 46)
    public final int method929(byte arg0) {
        if (arg0 != -45) {
            return -1;
        } else {
            ++field2378;
            return 22;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIZ)V", line = 57)
    public class199(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field2124);
        this.field2374 = arg9;
        this.field2391 = arg7;
        super.field823 = arg4;
        this.field2395 = (short) arg1.field2166;
        this.field2380 = arg1.field2171 != 0 && !arg7;
        this.field2388 = (byte) arg8;
        super.field813 = arg6;
        this.field2371 = arg0.method646() && arg1.field2141 && !this.field2391 && class118.field1503.field10672.method4113(0) != 0;
        int var11 = 2048;
        if (this.field2374) {
            var11 |= 65536;
        }
        class37 var12 = this.method1294(arg0, this.field2371, var11, 36);
        if (var12 != null) {
            this.field2368 = var12.field550;
            this.field2379 = var12.field549;
            if (this.field2374) {
                this.field2379 = this.field2379.method364((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)I", line = 91)
    public final int method928(int arg0) {
        ++field2394;
        if (arg0 != 13272) {
            this.field2380 = true;
        }
        return this.field2388;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 107)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2389;
        if (arg0 instanceof class199) {
            class199 var8 = (class199) arg0;
            if (this.field2379 != null && var8.field2379 != null) {
                this.field2379.method384(var8.field2379, arg5, arg3, arg2, arg4);
            }
        }
        if (arg6 > -6) {
            this.method928(-62);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ILha;)Lrk;", line = 133)
    public final class35 method502(int arg0, class66 arg1) {
        ++field2393;
        if (this.field2379 == null) {
            return null;
        } else {
            class778 var3 = arg1.method576();
            int var4 = -107 % ((47 - arg0) / 63);
            var3.method130(super.field823, super.field809, super.field813);
            class35 var5 = class415.method2476(1, (byte) 108, this.field2380);
            if (class502.field7084) {
                this.field2379.method388(var3, var5.field537[0], class621.field8528, 0);
            } else {
                this.field2379.method355(var3, var5.field537[0], 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILha;)V", line = 159)
    public final void method930(int arg0, class66 arg1) {
        if (arg0 != 14353) {
            this.method935(58);
        }
        ++field2370;
        Object var3 = null;
        class196 var5;
        if (this.field2368 == null && this.field2371) {
            class37 var4 = this.method1294(arg1, true, 262144, arg0 ^ 14384);
            var5 = var4 != null ? var4.field550 : null;
        } else {
            var5 = this.field2368;
            this.field2368 = null;
        }
        if (var5 != null) {
            class793.method4371(var5, super.field811, super.field823, super.field813, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(Z)V", line = 187)
    public final void method530(boolean arg0) {
        this.field2374 = arg0;
        ++field2399;
        if (this.field2379 != null) {
            this.field2379.method378(-65537 & this.field2379.method396());
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 200)
    public final void method936(boolean arg0) {
        if (!arg0) {
            if (this.field2379 != null) {
                this.field2379.method392();
            }
            ++field2372;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lha;ZII)Lwv;", line = 213)
    private final class37 method1294(class66 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 < 13) {
            this.field2380 = false;
        }
        ++field2392;
        class174 var5 = class379.field4811.method4192(27324, 65535 & this.field2395);
        class296 var6;
        class296 var7;
        if (!this.field2391) {
            if (super.field811 < 3) {
                var6 = class707.field9933[super.field811 + 1];
            } else {
                var6 = null;
            }
            var7 = class707.field9933[super.field811];
        } else {
            var7 = class704.field9910[super.field811];
            var6 = class707.field9933[0];
        }
        return var5.method1181(super.field823, super.field813, var7, arg0, (byte) 120, var6, arg2, (class481) null, arg1, 22, this.field2388, super.field809);
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(I)I", line = 245)
    public final int method508(int arg0) {
        ++field2386;
        if (arg0 != -4798) {
            return -112;
        } else {
            return this.field2379 == null ? 0 : this.field2379.method394();
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILha;I)Lka;", line = 256)
    private final class498 method1295(int arg0, class66 arg1, int arg2) {
        ++field2385;
        if (arg0 != 0) {
            this.method930(-4, (class66) null);
        }
        if (this.field2379 != null && arg1.method620(this.field2379.method396(), arg2) == 0) {
            return this.field2379;
        } else {
            class37 var4 = this.method1294(arg1, false, arg2, 20);
            return var4 == null ? null : var4.field549;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBILha;)Z", line = 280)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field2387;
        if (arg1 < 19) {
            return false;
        } else {
            class498 var5 = this.method1295(0, arg3, 131072);
            if (var5 != null) {
                class778 var6 = arg3.method576();
                var6.method130(super.field823, super.field809, super.field813);
                return class502.field7084 ? var5.method379(arg0, arg2, var6, false, 0, class621.field8528) : var5.method363(arg0, arg2, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)Z", line = 307)
    public final boolean method504(byte arg0) {
        if (arg0 != -24) {
            return false;
        } else {
            ++field2396;
            return this.field2379 != null ? this.field2379.method380() : false;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)I", line = 323)
    public final int method927(int arg0) {
        ++field2397;
        if (arg0 != -24482) {
            this.method508(-61);
        }
        return 65535 & this.field2395;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)Z", line = 336)
    public final boolean method935(int arg0) {
        if (arg0 != 25271) {
            return true;
        } else {
            ++field2381;
            return this.field2371;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)V", line = 347)
    public static final void method1296(int arg0, int arg1, int arg2) {
        ++field2383;
        if (class434.field5738 != null) {
            int var3 = class331.field4092;
            int var4 = class223.field2612;
            class595.method3408((byte) 92, arg2, arg1);
            if (class727.field10184 != arg0) {
                if (~class727.field10184 == -2 && (class340.field4250 == null || class331.field4092 != var3 || ~class223.field2612 != ~var4)) {
                    class340.field4250 = new class499[class331.field4092 * class223.field2612];
                    for (int var5 = 0; ~class340.field4250.length < ~var5; ++var5) {
                        class340.field4250[var5] = class434.field5738.method70(class434.field5738.method44(class603.field8149, class372.field4683), class434.field5738.method52(class603.field8149, class372.field4683));
                    }
                    class222.field2581 = 1;
                    class534.field7524 = new int[class331.field4092 * class223.field2612];
                }
            } else {
                class619.field8330 = null;
                class619.field8330 = class434.field5738.method70(class434.field5738.method44(class608.field8178, class734.field10263), class434.field5738.method52(class608.field8178, class734.field10263));
            }
            class257.field3034 = true;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Lha;I)V", line = 390)
    public final void method500(class66 arg0, int arg1) {
        if (arg1 != -1) {
            field2377 = null;
        }
        ++field2369;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Z)Z", line = 404)
    public final boolean method503(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field2376;
            if (this.field2379 == null) {
                return true;
            } else {
                return !this.field2379.method391();
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lha;I)V", line = 422)
    public final void method931(class66 arg0, int arg1) {
        ++field2367;
        Object var3 = null;
        class196 var5;
        if (this.field2368 == null && this.field2371) {
            class37 var4 = this.method1294(arg0, true, 262144, 107);
            var5 = var4 == null ? null : var4.field550;
        } else {
            var5 = this.field2368;
            this.field2368 = null;
        }
        if (var5 != null) {
            class418.method2496(var5, super.field811, super.field823, super.field813, (boolean[]) null);
        }
        int var6 = -6 % ((arg1 - 28) / 63);
    }

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "(Z)Z", line = 450)
    public final boolean method531(boolean arg0) {
        ++field2373;
        if (arg0) {
            this.field2391 = true;
        }
        return this.field2374;
    }
}

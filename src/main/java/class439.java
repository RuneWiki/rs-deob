import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class439 extends class40 {

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    private int field6272 = 0;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
    private int field6282 = 0;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    private int field6271 = 0;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field6268 = 0;

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "I")
    public static int field6279 = 0;

    @OriginalMember(owner = "client!ql", name = "ib", descriptor = "Lpm;")
    public static class349 field6286;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    private int field6262;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    private int field6269;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    private int field6270;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    private int field6274;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    private int field6275;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "I")
    private int field6281;

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ql", name = "gb", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ql", name = "hb", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "Lng;")
    public static class190 field6276;

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "[Luh;")
    public static class92[] field6280;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "[[B")
    public static byte[][] field6265;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public static void method2735(int arg0) {
        field6276 = null;
        if (arg0 > -115) {
            method2739(2);
        }
        field6265 = null;
        field6286 = null;
        field6280 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field6264;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6271 = (arg2.method823((byte) -40) << 12) / 100;
                }
            } else {
                this.field6272 = (arg2.method823((byte) -97) << 12) / 100;
            }
        } else {
            this.field6282 = arg2.method844(698527688);
        }
        if (arg1 <= 79) {
            this.method112(93, 88);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)V")
    private final void method2736(int arg0, int arg1, int arg2, int arg3) {
        ++field6284;
        if (arg0 <= 60) {
            field6279 = 115;
        }
        int var5 = ~arg3 >= ~arg2 ? arg2 : arg3;
        int var6 = ~arg3 > ~arg2 ? arg3 : arg2;
        int var7 = ~arg1 < ~var5 ? arg1 : var5;
        int var8 = ~arg1 > ~var6 ? arg1 : var6;
        int var9 = var7 - var8;
        this.field6270 = (var8 - -var7) / 2;
        if (this.field6270 > 0 && this.field6270 < 4096) {
            this.field6274 = (var9 << 12) / (~this.field6270 < -2049 ? 8192 - this.field6270 * 2 : this.field6270 * 2);
        } else {
            this.field6274 = 0;
        }
        if (~var9 >= -1) {
            this.field6269 = 0;
        } else {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            if (~arg3 != ~var7) {
                if (arg2 == var7) {
                    this.field6269 = ~arg1 == ~var8 ? var10 + 4096 : 12288 - var12;
                } else {
                    this.field6269 = arg3 != var8 ? -var10 + 20480 : var11 + 12288;
                }
            } else {
                this.field6269 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field6269 /= 6;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
    public static final void method2737(boolean arg0) {
        ++field6283;
        class15 var1 = class294.field4263;
        synchronized (class294.field4263) {
            if (arg0) {
                method2737(false);
            }
            class294.field4263.method102((byte) -96);
        }
        class15 var2 = class446.field6372;
        synchronized (class446.field6372) {
            class446.field6372.method102((byte) -80);
        }
        class15 var3 = class287.field4179;
        synchronized (class287.field4179) {
            class287.field4179.method102((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZBLml;Ljava/lang/String;)V")
    public static final void method2738(boolean arg0, boolean arg1, byte arg2, class219 arg3, String arg4) {
        ++field6266;
        if (arg2 != -87) {
            field6276 = null;
        }
        if (!arg0) {
            class105.method617(arg3, 3, -24962, arg4);
        } else {
            if (class219.field3150.startsWith("win") && ~class219.field3149 != -4) {
                String var5 = null;
                if (arg3.field3154 != null) {
                    var5 = arg3.field3154.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class156 var6 = class105.method617(arg3, 0, -24962, arg4);
                    class93.field1195 = var6;
                    class438.field6261 = arg4;
                    class309.field4494 = arg3;
                    return;
                }
            }
            if (class219.field3150.startsWith("mac")) {
                String var7 = null;
                if (arg3.field3154 != null) {
                    var7 = arg3.field3154.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class105.method617(arg3, 1, arg2 ^ 25047, arg4);
                    return;
                }
            }
            class105.method617(arg3, 2, -24962, arg4);
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
    public static final boolean method2739(int arg0) {
        ++field6273;
        if (arg0 != 545382988) {
            method2735(48);
        }
        return class408.field5786;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
    private final void method2740(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -34 % ((arg1 - -47) / 52);
        ++field6277;
        int var6 = ~arg0 < -2049 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (4096 - -arg2) * arg0 >> 12;
        if (var6 <= 0) {
            this.field6262 = this.field6275 = this.field6281 = arg0;
        } else {
            int var7 = arg3 * 6;
            int var8 = arg0 + arg0 + -var6;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var6;
            if (~var10 != -1) {
                if (~var10 != -2) {
                    if (~var10 != -3) {
                        if (var10 != 3) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field6275 = var8;
                                    this.field6281 = var16;
                                    this.field6262 = var6;
                                }
                            } else {
                                this.field6275 = var8;
                                this.field6262 = var15;
                                this.field6281 = var6;
                            }
                        } else {
                            this.field6262 = var8;
                            this.field6275 = var16;
                            this.field6281 = var6;
                        }
                    } else {
                        this.field6262 = var8;
                        this.field6281 = var15;
                        this.field6275 = var6;
                    }
                } else {
                    this.field6262 = var16;
                    this.field6281 = var8;
                    this.field6275 = var6;
                }
            } else {
                this.field6281 = var8;
                this.field6275 = var15;
                this.field6262 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class439() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        if (arg0 != 1) {
            field6279 = -43;
        }
        ++field6267;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, arg0 ^ 28553, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class410.field5886; ++var11) {
                this.method2736(101, var7[var11], var6[var11], var5[var11]);
                this.field6269 += this.field6282;
                this.field6270 += this.field6271;
                this.field6274 += this.field6272;
                while (~this.field6269 > -1) {
                    this.field6269 += 4096;
                }
                while (~this.field6269 < -4097) {
                    this.field6269 -= 4096;
                }
                if (~this.field6274 > -1) {
                    this.field6274 = 0;
                }
                if (~this.field6274 < -4097) {
                    this.field6274 = 4096;
                }
                if (this.field6270 < 0) {
                    this.field6270 = 0;
                }
                if (this.field6270 > 4096) {
                    this.field6270 = 4096;
                }
                this.method2740(this.field6270, -128, this.field6274, this.field6269);
                var8[var11] = this.field6262;
                var9[var11] = this.field6275;
                var10[var11] = this.field6281;
            }
        }
        return var3;
    }

    static {
        new class349((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field6286 = new class349("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");
    }
}

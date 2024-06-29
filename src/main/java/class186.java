import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class186 extends class301 {

    @OriginalMember(owner = "client!ta", name = "Eb", descriptor = "I")
    public static int field2998 = 0;

    @OriginalMember(owner = "client!ta", name = "Hb", descriptor = "Lve;")
    public static class255 field3001 = class87.method607(68, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ta", name = "Lb", descriptor = "Lve;")
    public static class255 field3005 = class87.method607(105, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ta", name = "Bb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ta", name = "Db", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ta", name = "Fb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ta", name = "Gb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ta", name = "Ib", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ta", name = "Jb", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ta", name = "Kb", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ta", name = "Cb", descriptor = "Lce;")
    public class236 field2996;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Ltl;I)V", line = 5)
    public static final void method1297(int arg0, class197[] arg1, int arg2) {
        field2997++;
        if (arg0 <= 79) {
            method1300(false);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class197 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3281 == 0) {
                    if (var4.field3359 != null) {
                        method1297(126, var4.field3359, arg2);
                    }
                    class155 var5 = (class155) class158.field2675.method280((long) var4.field3256, 29153);
                    if (var5 != null) {
                        class291.method2059(true, arg2, var5.field2637);
                    }
                }
                if (arg2 == 0 && var4.field3247 != null) {
                    class26 var6 = new class26();
                    var6.field424 = var4;
                    var6.field414 = var4.field3247;
                    class114.method873(122, var6);
                }
                if (arg2 == 1 && var4.field3242 != null) {
                    if (var4.field3273 >= 0) {
                        class197 var7 = class58.method353(var4.field3256, (byte) -115);
                        if (var7 == null || var7.field3359 == null || var4.field3273 >= var7.field3359.length || var7.field3359[var4.field3273] != var4) {
                            continue;
                        }
                    }
                    class26 var8 = new class26();
                    var8.field414 = var4.field3242;
                    var8.field424 = var4;
                    class114.method873(-64, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I", line = 80)
    public final int method176() {
        field3000++;
        return this.field5172;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(SLve;IBJLve;I)V", line = 88)
    public static final void method1298(short arg0, class255 arg1, int arg2, byte arg3, long arg4, class255 arg5, int arg6) {
        field3004++;
        if (class156.field2651) {
            return;
        }
        if (arg3 != 67) {
            method1297(-98, (class197[]) null, 15);
        }
        if (class136.field2272 >= 500) {
            return;
        }
        class203.field3509[class136.field2272] = arg5;
        class44.field684[class136.field2272] = arg1;
        class264.field4466[class136.field2272] = arg0;
        class131.field2161[class136.field2272] = arg4;
        class295.field5063[class136.field2272] = arg2;
        class287.field4910[class136.field2272] = arg6;
        class136.field2272++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)V", line = 117)
    public static final void method1299(int arg0, int arg1) {
        field3006++;
        if (!class225.method1570((byte) -96, arg1)) {
            return;
        }
        class197[] var2 = class297.field5087[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class197 var4 = var2[var3];
            if (var4 != null) {
                var4.field3373 = 0;
                var4.field3317 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V", line = 153)
    public static void method1300(boolean arg0) {
        if (arg0) {
            field3005 = null;
            field3001 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)Lnd;", line = 166)
    public static final class303 method1301(int arg0) {
        if (arg0 != 2030220976) {
            return (class303) null;
        }
        field2995++;
        try {
            return (class303) Class.forName("nk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class266();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Z", line = 187)
    public final boolean method1302(int arg0) {
        field3002++;
        if (this.field2996 == null) {
            return false;
        } else {
            if (arg0 != 1) {
                field3003 = -117;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V", line = 201)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2999++;
        if (this.field2996 == null) {
            return;
        }
        class271 var11 = this.field5166 != -1 && this.field5116 == 0 ? class181.method1269(116, this.field5166) : null;
        class271 var12 = this.field5114 == -1 || this.field5114 == this.field5113 && var11 != null ? null : class181.method1269(73, this.field5114);
        class227 var13 = this.field2996.method1634((byte) 60, var12, this.field5123, var11, this.field5163);
        if (var13 == null) {
            return;
        }
        this.field5172 = var13.method176();
        class236 var14 = this.field2996;
        if (var14.field3893 != null) {
            var14 = var14.method1628(104);
        }
        if (class190.field3048 && var14.field3917) {
            class227 var15 = class87.method604(this.field5131, this.field5156, this.field2996.field3880, var12 == null ? var11 : var12, (byte) 1, this.field2996.field3907, this.field5130, var12 == null ? this.field5123 : this.field5163, this.field5173, this.field2996.field3933, this.field2996.field3919, var13, arg0, this.field2996.field3877);
            if (class281.field4827) {
                float var16 = class281.method1987();
                float var17 = class281.method1970();
                class281.method1958();
                class281.method1961(var16, var17 - 150.0F);
                var15.method168(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class281.method1957();
                class281.method1961(var16, var17);
            } else {
                var15.method168(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field2996.field3925 != 0 || this.field2996.field3938 != 0) {
            int var21 = class283.field4877[arg0];
            short var22 = this.field2996.field3925;
            int var23 = class283.field4870[arg0];
            int var24 = -var22 / 2;
            short var25 = this.field2996.field3938;
            int var26 = -var25 / 2;
            int var27 = var22 / 2;
            int var28 = var23 * var26 - (var21 * var24) >> 16;
            int var29 = -var25 / 2;
            int var30 = var21 * var26 + var23 * var24 >> 16;
            int var31 = class113.method861((byte) -2, this.field5130 + var30, this.field5173 + var28, client.field4039);
            int var32 = var23 * var29 - (var21 * var27) >> 16;
            int var33 = var21 * var29 + var23 * var27 >> 16;
            int var34 = class113.method861((byte) -41, this.field5130 + var33, this.field5173 + var32, client.field4039);
            int var35 = -var22 / 2;
            int var36 = var22 / 2;
            int var37 = var25 / 2;
            int var38 = var23 * var37 - (var21 * var35) >> 16;
            int var39 = var21 * var37 + (var23 * var35) >> 16;
            int var40 = var25 / 2;
            int var41 = class113.method861((byte) 123, this.field5130 + var39, this.field5173 + var38, client.field4039);
            int var42 = var21 * var40 + var23 * var36 >> 16;
            int var43 = var23 * var40 - (var21 * var36) >> 16;
            int var44 = var31 >= var34 ? var34 : var31;
            int var45 = class113.method861((byte) 125, this.field5130 + var42, this.field5173 - -var43, client.field4039);
            int var46 = var31 < var41 ? var31 : var41;
            int var47 = var45 <= var34 ? var45 : var34;
            int var48 = var31 + var45;
            int var49 = var41 < var45 ? var41 : var45;
            if (var25 != 0) {
                var20 = (int) (Math.atan2((double) (var44 - var49), (double) var25) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var13.method1334(var20);
                }
            }
            if (var48 > (var34 + var41)) {
                var48 = var34 + var41;
            }
            if (var22 != 0) {
                var18 = (int) (Math.atan2((double) (var46 - var47), (double) var22) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method1376(var18);
                }
            }
            var19 = (var48 >> 1) - this.field5131;
            if (var19 != 0) {
                var13.method1353(0, var19, 0);
            }
        }
        class227 var50 = null;
        if (this.field5164 != -1 && this.field5165 != -1) {
            class87 var51 = class232.method1611(this.field5164, (byte) -125);
            var50 = var51.method609(this.field5165, -82);
            if (var50 != null) {
                var50.method1353(0, -this.field5128, 0);
                if (var51.field1423) {
                    if (var20 != 0) {
                        var50.method1334(var20);
                    }
                    if (var18 != 0) {
                        var50.method1376(var18);
                    }
                    if (var19 != 0) {
                        var50.method1353(0, var19, 0);
                    }
                }
            }
        }
        if (!class281.field4827) {
            if (var50 != null) {
                var13 = ((class267) var13).method1854(var50);
            }
            if (this.field2996.field3933 == 1) {
                var13.field3774 = true;
            }
            var13.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field2996.field3933 == 1) {
            var13.field3774 = true;
        }
        var13.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field2996.field3933 == 1) {
                var50.field3774 = true;
            }
            var50.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}

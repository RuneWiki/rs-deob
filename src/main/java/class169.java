import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class169 extends class331 {

    @OriginalMember(owner = "client!p", name = "nc", descriptor = "Lic;")
    public static class329 field2344 = new class329(16);

    @OriginalMember(owner = "client!p", name = "qc", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!p", name = "rc", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!p", name = "sc", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!p", name = "tc", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!p", name = "uc", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!p", name = "vc", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!p", name = "wc", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!p", name = "xc", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!p", name = "Ac", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!p", name = "Bc", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!p", name = "yc", descriptor = "Lfh;")
    public static class140 field2355;

    @OriginalMember(owner = "client!p", name = "oc", descriptor = "Lua;")
    public class157 field2345;

    @OriginalMember(owner = "client!p", name = "pc", descriptor = "Ljava/lang/String;")
    public static String field2346;

    @OriginalMember(owner = "client!p", name = "zc", descriptor = "[[[B")
    public static byte[][][] field2356;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLua;)V", line = 8)
    public final void method1250(byte arg0, class157 arg1) {
        field2351++;
        int var3 = 59 % ((arg0 + 14) / 62);
        this.field2345 = arg1;
        if (this.field4879 != null) {
            this.field4879.method1354();
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z", line = 22)
    public final boolean method1251(int arg0) {
        field2357++;
        if (arg0 != 0) {
            this.method573(-114, -42, 94, -7, 32);
        }
        return this.field2345 != null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 38)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field2358++;
        if (this.field2345 == null) {
            return;
        }
        class314 var13 = this.field4899 != -1 && this.field4885 == 0 ? class207.method1516(this.field4899, 127) : null;
        class314 var14 = this.field4897 == -1 || this.field4897 == this.method2300((byte) 96).field1182 && var13 != null ? null : class207.method1516(this.field4897, 118);
        class81 var15 = this.field2345.method1213(this.field4850, this.field4890, -102, var14, var13, this.field4906, this.field4859, this.field4914, this.field4942, this.field4940);
        if (var15 == null) {
            return;
        }
        this.field4911 = var15.method583();
        class157 var16 = this.field2345;
        if (var16.field2206 != null) {
            var16 = var16.method1210(-124);
        }
        if (class122.field1603 && var16.field2177) {
            class81 var17 = class245.method1729(this.field2345.field2186, 2, var14 == null ? var13 : var14, arg0, this.field2345.field2224, this.field2345.field2231, var15, var14 == null ? this.field4850 : this.field4942, this.field4898, this.field4893, this.field4894, this.field2345.field2210, this.field2345.field2225, this.field4855);
            if (class47.field623) {
                float var18 = class47.method377();
                float var19 = class47.method369();
                class47.method346();
                class47.method378(var18, var19 - 150.0F);
                var17.method585(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4879);
                class47.method348();
                class47.method378(var18, var19);
            } else {
                var17.method585(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4879);
            }
        }
        class81 var20 = null;
        this.method2293(0, var15);
        this.method2298(var15, arg0, 0);
        if (this.field4839 != -1 && this.field4921 != -1) {
            class15 var21 = class234.method1664(-128, this.field4839);
            var20 = var21.method114(this.field4857, this.field4848, this.field4921, (byte) 14);
            if (var20 != null) {
                var20.method580(0, -this.field4851, 0);
                if (var21.field167) {
                    if (class307.field4489 != 0) {
                        var20.method591(class307.field4489);
                    }
                    if (class17.field210 != 0) {
                        var20.method574(class17.field210);
                    }
                    if (class171.field2368 != 0) {
                        var20.method580(0, class171.field2368, 0);
                    }
                }
            }
        }
        if (!class47.field623) {
            if (var20 != null) {
                var15 = ((class332) var15).method2305(var20);
            }
            this.method2301(var15, (byte) 91, var20);
            if (this.field2345.field2224 == 1) {
                var15.field1040 = true;
            }
            var15.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
            return;
        }
        this.method2301(var15, (byte) 117, var20);
        if (this.field2345.field2224 == 1) {
            var15.field1040 = true;
        }
        var15.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
        if (var20 == null) {
            return;
        }
        if (this.field2345.field2224 == 1) {
            var20.field1040 = true;
        }
        if (this.field4879 != null) {
            class128 var22 = (class128) var20;
            this.field4879.method1369(var22.field1746, var22.field1712, true, var22.field1732, var22.field1710, var22.field1699);
        }
        var20.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I", line = 161)
    public final int method583() {
        field2347++;
        return this.field4911;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 169)
    protected final void finalize() {
        if (this.field4879 != null) {
            this.field4879.method1360();
        }
        field2349++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V", line = 180)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2352++;
        if (this.field2345 == null) {
            return;
        }
        if (!this.field4900) {
            class314 var6 = this.field4899 != -1 && this.field4885 == 0 ? class207.method1516(this.field4899, 123) : null;
            class314 var7 = this.field4897 == -1 || this.field4897 == this.method2300((byte) 63).field1182 && var6 != null ? null : class207.method1516(this.field4897, 118);
            class81 var8 = this.field2345.method1213(this.field4850, this.field4890, -119, var7, var6, this.field4906, this.field4859, this.field4914, this.field4942, this.field4940);
            if (var8 == null) {
                return;
            }
            this.method2301(var8, (byte) 94, (class81) null);
        }
        if (this.field4879 != null) {
            this.field4879.method1351(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 218)
    public static void method1252(int arg0) {
        field2346 = null;
        field2355 = null;
        field2344 = null;
        if (arg0 != 2980) {
            method1253(-78, -35, 3, -80, (byte) -86);
        }
        field2356 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V", line = 237)
    public static final void method1253(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class83.field1069 = -1;
        float var5 = (float) class38.field459 / (float) class38.field467;
        class323.field4744 = -1;
        field2350++;
        int var6 = arg1;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg0 - (arg2 - var7) / 2;
        int var9 = arg3 - (arg1 - var6) / 2;
        class32.field393 = class38.field467 * var9 / var6;
        class35.field428 = class38.field459 * var8 / var7;
        if (arg4 != -80) {
            field2356 = (byte[][][]) ((byte[][][]) null);
        }
        class144.method1122((byte) -103);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I", line = 264)
    public final int method1254(boolean arg0) {
        field2353++;
        if (arg0) {
            field2344 = (class329) null;
        }
        if (this.field2345.field2206 != null) {
            class157 var2 = this.field2345.method1210(-118);
            if (var2 != null && var2.field2223 != -1) {
                return var2.field2223;
            }
        }
        return this.field4871;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III[B)Z", line = 287)
    public static final boolean method1255(int arg0, int arg1, int arg2, byte[] arg3) {
        field2348++;
        boolean var4 = true;
        class299 var5 = new class299(arg3);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method2065(120);
            if (var7 == 0) {
                if (arg0 != 0) {
                    method1253(-102, -70, -69, 74, (byte) -47);
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method2046((byte) 98);
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = (var8 & 0xFCD) >> 6;
                    int var13 = var5.method2096((byte) -122) >> 2;
                    int var14 = arg2 + var12;
                    int var15 = var8 & 0x3F;
                    int var16 = arg1 + var15;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class219 var17 = class345.method2392(var6, 0);
                        if (var13 != 22 || class329.field4812 || var17.field3106 != 0 || var17.field3087 == 1 || var17.field3126) {
                            var9 = true;
                            if (!var17.method1585(true)) {
                                var4 = false;
                                class355.field5564++;
                            }
                        }
                    }
                }
                int var10 = var5.method2046((byte) 98);
                if (var10 == 0) {
                    break;
                }
                var5.method2096((byte) -122);
            }
        }
    }
}

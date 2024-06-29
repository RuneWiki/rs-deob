import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 extends class139 {

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "Z")
    private boolean field389 = true;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    private int field388 = 4096;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lrf;")
    public static class163 field387 = class53.method392(65, "(Udns");

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "Lrf;")
    public static class163 field383 = class53.method392(88, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "Lrf;")
    public static class163 field391 = class53.method392(-63, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "Lrf;")
    private static class163 field382 = class53.method392(49, "level)2");

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "Lrf;")
    public static class163 field392 = field382;

    @OriginalMember(owner = "client!ca", name = "ib", descriptor = "Lrf;")
    public static class163 field396 = class53.method392(-103, "scrollen:");

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ca", name = "hb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field393;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (arg0 <= 53) {
            this.field389 = true;
        }
        if (super.field2866.field885) {
            int[] var4 = this.method917(arg1 + -1 & class15.field260, 0, true);
            int[] var5 = this.method917(arg1, 0, true);
            int[] var6 = this.method917(class15.field260 & arg1 - -1, 0, true);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class23.field402 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field388;
                int var12 = (var5[var10 + 1 & class29.field542] + -var5[class29.field542 & var10 + -1]) * this.field388;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var14 + var16 + 4096) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field389) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field389 = ~arg2.method344(255) == -2;
            }
        } else {
            this.field388 = arg2.method390((byte) 106);
        }
        if (arg1 != 21) {
            method135(-15, 26, 25, -78, (class166) null, -77L, (class166) null, (class166) null);
        }
        ++field381;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public static final void method133(int arg0) {
        ++field385;
        Object var1 = class40.field814;
        synchronized (class40.field814) {
            if (class105.field2197 == 0) {
                class10.field197.method481(5, new class199(), (byte) 93);
            }
            class105.field2197 = 600;
            if (arg0 != -25294) {
                field387 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
    public static void method134(int arg0) {
        field391 = null;
        field396 = null;
        if (arg0 == 128) {
            field382 = null;
            field387 = null;
            field392 = null;
            field383 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIILs;JLs;Ls;)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, class166 arg4, long arg5, class166 arg6, class166 arg7) {
        class195 var9 = new class195();
        var9.field3884 = arg4;
        var9.field3871 = arg1 * 128 + 64;
        var9.field3847 = arg2 * 128 + 64;
        var9.field3835 = arg3;
        var9.field3881 = arg5;
        var9.field3858 = arg6;
        var9.field3845 = arg7;
        short var10 = 0;
        class111 var11 = class97.field2054[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2359; ++var12) {
                if ((var11.field2344[var12].field2536 & 4194304L) == 4194304L && var11.field2344[var12].field2546 instanceof class91) {
                    class91 var13 = (class91) var11.field2344[var12].field2546;
                    var13.method635();
                    if (var13.field3376 < var10) {
                        var10 = var13.field3376;
                    }
                }
            }
        }
        var9.field3844 = -var10;
        if (class97.field2054[arg0][arg1][arg2] == null) {
            class97.field2054[arg0][arg1][arg2] = new class111(arg0, arg1, arg2);
        }
        class97.field2054[arg0][arg1][arg2].field2352 = var9;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method136(boolean arg0, byte[] arg1, int arg2) {
        ++field395;
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < -137 && !class44.field891) {
                try {
                    class120 var3 = (class120) Class.forName("uh").newInstance();
                    var3.method816(8, arg1);
                    return var3;
                } catch (Throwable var5) {
                    class44.field891 = true;
                }
            }
            int var4 = 10 % ((arg2 - 17) / 52);
            return arg0 ? class150.method974(arg1, (byte) -80) : arg1;
        }
    }
}

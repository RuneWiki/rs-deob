import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class199 extends class8 {

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    private int field3165 = 0;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    private int field3173 = 1;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field3174 = -1;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Z")
    public static boolean field3181 = false;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field3183 = "glow1:";

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "Laf;")
    public static class68 field3182 = new class68(64);

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field3186 = 128;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "[I")
    public static int[] field3184 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "Lqh;")
    public static class201 field3185;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "Ld;")
    public static class238 field3177;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            return null;
        } else {
            ++field3168;
            int[] var3 = super.field110.method1585(0, arg1);
            if (super.field110.field3734) {
                int var4 = class182.field2864[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; var6 < class231.field3798; ++var6) {
                    int var7 = class176.field2776[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field3165 == 0) {
                        var9 = (var7 - var4) * this.field3173;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field3173 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field3178 != 0) {
                        if (this.field3178 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class212.field3455[(4084 & var12) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        class78.method547(14764);
        ++field3167;
        if (arg0) {
            method1346(7);
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public static void method1346(int arg0) {
        field3184 = null;
        if (arg0 != 2101401217) {
            field3166 = 70;
        }
        field3177 = null;
        field3182 = null;
        field3185 = null;
        field3183 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLqh;)V")
    public static final void method1347(byte arg0, class201 arg1) {
        class10.field150 = arg1;
        class158.field2558 = class10.field150.method1361(4, -90);
        if (arg0 > -107) {
            method1348(false, -20, 81, 8, -90);
        }
        ++field3180;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field3173 = arg1.method1517((byte) -96);
                }
            } else {
                this.field3178 = arg1.method1517((byte) -96);
            }
        } else {
            this.field3165 = arg1.method1517((byte) -96);
        }
        if (arg0 <= 62) {
            this.method66(true);
        }
        ++field3179;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIIII)V")
    public static final void method1348(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        ++field3170;
        int var6 = arg4;
        if (!arg0) {
            method1346(113);
        }
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class51.method393(arg1 + arg4, 0, class255.field4055, class9.field128);
        int var10 = class51.method393(arg1 - arg4, 0, class255.field4055, class9.field128);
        class56.method420(class29.field452[arg2], arg3, -7, var10, var9);
        while (~var6 < ~var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                --var6;
                int var11 = arg2 - var6;
                int var12 = arg2 - -var6;
                if (var12 >= class161.field2561 && var11 <= class51.field896) {
                    int var13 = class51.method393(arg1 + var5, 0, class255.field4055, class9.field128);
                    int var14 = class51.method393(arg1 - var5, 0, class255.field4055, class9.field128);
                    if (~class51.field896 <= ~var12) {
                        class56.method420(class29.field452[var12], arg3, -7, var14, var13);
                    }
                    if (class161.field2561 <= var11) {
                        class56.method420(class29.field452[var11], arg3, -7, var14, var13);
                    }
                }
                var7 -= var6 << 1;
            }
            ++var5;
            int var15 = arg2 - -var5;
            int var16 = -var5 + arg2;
            if (class161.field2561 <= var15 && var16 <= class51.field896) {
                int var17 = class51.method393(arg1 - -var6, 0, class255.field4055, class9.field128);
                int var18 = class51.method393(-var6 + arg1, 0, class255.field4055, class9.field128);
                if (class51.field896 >= var15) {
                    class56.method420(class29.field452[var15], arg3, -7, var18, var17);
                }
                if (var16 >= class161.field2561) {
                    class56.method420(class29.field452[var16], arg3, -7, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[IJB)Ljava/lang/String;")
    public static final String method1349(int arg0, int[] arg1, long arg2, byte arg3) {
        ++field3175;
        if (class212.field3467 != null) {
            String var5 = class212.field3467.method1295(91, arg1, arg2, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        int var6 = 27 / ((arg3 - -82) / 40);
        return Long.toString(arg2);
    }
}

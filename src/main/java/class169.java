import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class169 extends class278 {

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    private int field2394 = -1;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Lfg;")
    public static class83 field2393 = new class83("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Ltk;")
    public static class228 field2402 = new class228(11, 0, 1, 2);

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field2395;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Lvi;")
    public static class376 field2401;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
    private int[] field2398;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 < 75) {
            this.method324(-8, -88);
        }
        ++field2397;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int var4 = this.field2395 * (~class307.field4211 != ~this.field2390 ? this.field2390 * arg1 / class307.field4211 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class507.field7456 != ~this.field2395) {
                for (int var8 = 0; var8 < class507.field7456; ++var8) {
                    int var9 = this.field2395 * var8 / class507.field7456;
                    int var10 = this.field2398[var4 + var9];
                    var7[var8] = class118.method750(4080, var10 << 4);
                    var6[var8] = class118.method750(var10, 65280) >> 4;
                    var5[var8] = class118.method750(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class507.field7456 > var11; ++var11) {
                    int var12 = this.field2398[var4++];
                    var7[var11] = class118.method750(var12 << 4, 4080);
                    var6[var11] = class118.method750(var12, 65280) >> 4;
                    var5[var11] = class118.method750(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final void method410(boolean arg0) {
        ++field2389;
        super.method410(arg0);
        this.field2398 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field2399;
        if (~arg2 == -1) {
            this.field2394 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
    public final int method1044(byte arg0) {
        if (arg0 <= 102) {
            this.method324(20, 65);
        }
        ++field2391;
        return this.field2394;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static void method1045(int arg0) {
        if (arg0 != 2) {
            method1045(104);
        }
        field2393 = null;
        field2401 = null;
        field2402 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V")
    public final void method1046(byte arg0, int arg1, int arg2) {
        super.method1046((byte) -119, arg1, arg2);
        int var4 = -69 % ((46 - arg0) / 42);
        ++field2396;
        if (~this.field2394 <= -1 && class44.field618 != null) {
            int var5 = class44.field618.method830(this.field2394, (byte) 71).field7380 ? 64 : 128;
            this.field2398 = class44.field618.method833(false, var5, 1.0F, -12422, var5, this.field2394);
            this.field2395 = var5;
            this.field2390 = var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILea;ILss;IIILqa;I)V")
    public static final void method1047(int arg0, class382 arg1, int arg2, class295 arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8) {
        ++field2392;
        class191 var9 = class436.field6349.method850((byte) 78, arg8);
        if (var9 != null && var9.field2685 && var9.method1149(0, class453.field6623)) {
            if (var9.field2683 != null) {
                int[] var10 = new int[var9.field2683.length];
                for (int var11 = 0; ~var11 > ~(var10.length / 2); ++var11) {
                    int var13;
                    if (~class128.field1742 != -5) {
                        var13 = (int) class40.field553 + class22.field349 & 16383;
                    } else {
                        var13 = 16383 & (int) class40.field553;
                    }
                    int var14 = class377.field5316[var13];
                    int var15 = class377.field5315[var13];
                    if (class128.field1742 != 4) {
                        var14 = var14 * 256 / (class482.field7072 + 256);
                        var15 = var15 * 256 / (class482.field7072 + 256);
                    }
                    var10[var11 * 2] = ((var9.field2683[var11 * 2] * 4 + arg2) * var15 + (var9.field2683[var11 * 2 + 1] * 4 + arg0) * var14 >> 15) + arg3.field4022 / 2 + arg5;
                    var10[var11 * 2 + 1] = arg3.field3960 / 2 + (arg4 - ((arg0 - -(var9.field2683[var11 * 2 + 1] * 4)) * var15 + -((arg2 - -(var9.field2683[var11 * 2] * 4)) * var14) >> 15));
                }
                class182.method1102(arg7, var10, var9.field2664, arg3.field3923, arg3.field4030);
                for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                    arg7.method537(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 - -3], var9.field2674, 1, arg1, arg5, arg4);
                }
                arg7.method537(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field2674, 1, arg1, arg5, arg4);
            }
            class529 var16 = null;
            if (~var9.field2669 != 0) {
                var16 = var9.method1155(false, (byte) 118, arg7);
                if (var16 != null) {
                    class101.method667(arg1, arg4, arg2, arg0, arg3, var16, false, arg5);
                }
            }
            if (var9.field2662 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method129();
                }
                class490 var18 = class176.field2505;
                class56 var19 = class483.field7097;
                if (~var9.field2670 == -2) {
                    var19 = class68.field987;
                    var18 = class117.field1579;
                }
                if (~var9.field2670 == -3) {
                    var18 = class34.field487;
                    var19 = class105.field1430;
                }
                class452.method2667(arg5, arg2, arg1, var18, var9.field2662, arg4, var17, arg0, var19, -19498, arg3, var9.field2676);
            }
        }
        if (arg6 != 2) {
            method1045(63);
        }
    }
}

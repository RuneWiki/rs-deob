import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class484 {

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "Lgo;")
    private class304 field6855 = new class304();

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    private int field6851;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    private int field6846;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Lwk;")
    private class155 field6847;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lcf;")
    public static class92 field6848;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lcf;")
    public static class92 field6857;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "[I")
    public static int[] field6859;

    static {
        new class151("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6848 = new class92();
        field6857 = new class92();
        field6858 = 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Object;Lts;II)V", line = 5)
    private final void method2848(Object arg0, class23 arg1, int arg2, int arg3) {
        int var5 = 113 / ((arg2 - 6) / 54);
        field6850++;
        if (this.field6851 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2858(arg1, (byte) -97);
        this.field6846 -= arg3;
        while (this.field6846 < 0) {
            class432 var7 = (class432) this.field6855.method1961((byte) 49);
            this.method2853(var7, (byte) -31);
        }
        class437 var6 = new class437(arg1, arg0, arg3);
        this.field6847.method1100(var6, 75, arg1.method168((byte) -111));
        this.field6855.method1962((byte) -67, var6);
        var6.field713 = 0L;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 34)
    public static void method2849(byte arg0) {
        field6859 = null;
        field6857 = null;
        if (arg0 >= 15) {
            field6848 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLae;)Z", line = 49)
    public static final boolean method2850(boolean arg0, class172 arg1) {
        field6843++;
        if (class41.field549 == arg1.field2624) {
            class409.field5606 = 250;
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLts;)Ljava/lang/Object;", line = 69)
    public final Object method2851(byte arg0, class23 arg1) {
        field6844++;
        long var3 = arg1.method168((byte) -120);
        int var5 = -89 / ((-arg0 - 5) / 33);
        for (class432 var6 = (class432) this.field6847.method1104(-124, var3); var6 != null; var6 = (class432) this.field6847.method1099((byte) 113)) {
            if (var6.field6111.method167(arg1, -127)) {
                Object var7 = var6.method486(128);
                if (var7 != null) {
                    if (var6.method487(3)) {
                        class437 var8 = new class437(arg1, var7, var6.field6106);
                        this.field6847.method1100(var8, -128, var6.field6382);
                        this.field6855.method1962((byte) -67, var8);
                        var8.field713 = 0L;
                        var6.method2714(-62);
                        var6.method479((byte) -8);
                    } else {
                        this.field6855.method1962((byte) -67, var6);
                        var6.field713 = 0L;
                    }
                    return var7;
                }
                var6.method2714(-82);
                var6.method479((byte) -8);
                this.field6846 += var6.field6106;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIBII)V", line = 121)
    public static final void method2852(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6853++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        if (arg3 != 29) {
            method2850(false, (class172) null);
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class444.field6338 <= arg4 && class151.field2091 >= arg4) {
            int var20 = class67.method630(0, arg0 + arg5, class103.field1457, class295.field4153);
            int var21 = class67.method630(0, arg5 - arg0, class103.field1457, class295.field4153);
            class61.method558(var20, arg3 ^ 0xFFFFD674, class373.field5141[arg4], var21, arg2);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var22 -= var15;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (class444.field6338 <= var24 && class151.field2091 >= var23) {
                int var25 = class67.method630(0, arg5 + var6, class103.field1457, class295.field4153);
                int var26 = class67.method630(0, arg5 - var6, class103.field1457, class295.field4153);
                if (class444.field6338 <= var23) {
                    class61.method558(var25, arg3 ^ 0xFFFFD674, class373.field5141[var23], var26, arg2);
                }
                if (class151.field2091 >= var24) {
                    class61.method558(var25, -10647, class373.field5141[var24], var26, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lhu;B)V", line = 225)
    private final void method2853(class432 arg0, byte arg1) {
        field6840++;
        if (arg0 != null) {
            arg0.method2714(-58);
            arg0.method479((byte) -8);
            this.field6846 += arg0.field6106;
        }
        if (arg1 != -31) {
            field6857 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)I", line = 243)
    public final int method2854(int arg0) {
        field6842++;
        return arg0 == 7155 ? this.field6846 : -61;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I", line = 254)
    public final int method2855(int arg0) {
        if (arg0 != -330769982) {
            field6859 = null;
        }
        field6854++;
        return this.field6851;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V", line = 266)
    public final void method2856(int arg0) {
        int var2 = 63 / ((arg0 - 76) / 43);
        this.field6855.method1960(-257);
        field6849++;
        this.field6847.method1101((byte) 70);
        this.field6846 = this.field6851;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V", line = 279)
    public final void method2857(int arg0) {
        field6841++;
        for (class432 var2 = (class432) this.field6855.method1955(arg0); var2 != null; var2 = (class432) this.field6855.method1954(false)) {
            if (var2.method487(3)) {
                var2.method2714(101);
                var2.method479((byte) -8);
                this.field6846 += var2.field6106;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lts;B)V", line = 302)
    private final void method2858(class23 arg0, byte arg1) {
        field6856++;
        long var3 = arg0.method168((byte) -126);
        for (class432 var5 = (class432) this.field6847.method1104(arg1 ^ 0x1B, var3); var5 != null; var5 = (class432) this.field6847.method1099((byte) 57)) {
            if (var5.field6111.method167(arg0, -96)) {
                this.method2853(var5, (byte) -31);
                break;
            }
        }
        if (arg1 != -97) {
            this.field6855 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 333)
    public static final void method2859(boolean arg0) {
        if (arg0) {
            class385.field5285 = class267.field3862;
            class340.field4692 = class427.field5960;
        } else {
            class385.field5285 = class36.field393;
            class340.field4692 = class190.field2858;
        }
        class310.field4398 = class385.field5285.length;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lts;Ljava/lang/Object;B)V", line = 353)
    public final void method2860(class23 arg0, Object arg1, byte arg2) {
        this.method2848(arg1, arg0, -109, 1);
        int var4 = -105 % ((-arg2 - 56) / 60);
        field6852++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V", line = 368)
    public final void method2861(int arg0, int arg1) {
        if (class361.field4968 != null) {
            for (class432 var3 = (class432) this.field6855.method1955(0); var3 != null; var3 = (class432) this.field6855.method1954(false)) {
                if (var3.method487(arg1 ^ 0xFFFFCA22)) {
                    if (var3.method486(arg1 + 13919) == null) {
                        var3.method2714(arg1 ^ 0xFFFFCA5A);
                        var3.method479((byte) -8);
                        this.field6846 += var3.field6106;
                    }
                } else if (++var3.field713 > (long) arg0) {
                    class432 var4 = class361.field4968.method1886(var3, 1);
                    this.field6847.method1100(var4, -120, var3.field6382);
                    class151.method1079(var3, (byte) 52, var4);
                    var3.method2714(arg1 + 13671);
                    var3.method479((byte) -8);
                }
            }
        }
        field6845++;
        if (arg1 != -13791) {
            this.method2856(-106);
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V", line = 433)
    public class484(int arg0) {
        this.field6851 = arg0;
        this.field6846 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field6847 = new class155(var2);
    }
}

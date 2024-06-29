import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 extends class58 {

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lfd;")
    public static class242 field796;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[B")
    private byte[] field806;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "[[B")
    public static byte[][] field808;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V", line = 5)
    public void method370(int arg0, byte arg1) {
        this.field806[arg0] = arg1;
        field799++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 19)
    public final void method371(byte arg0) {
        this.field795 = this.field800;
        field803++;
        this.field812 >>= 0x4;
        if (this.field812 < 0) {
            this.field812 = 0;
        } else if (this.field812 > 255) {
            this.field812 = 255;
        }
        this.method370(this.field810++, (byte) this.field812);
        if (arg0 == -92) {
            this.field812 = 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 45)
    public static void method372(byte arg0) {
        field796 = null;
        if (arg0 != -74) {
            field808 = (byte[][]) ((byte[][]) null);
        }
        field808 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIFFF)V", line = 60)
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field801 = (int) (arg7 * 4096.0F);
        this.field807 = (int) (arg6 * 4096.0F);
        this.field795 = this.field800 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)I", line = 76)
    public static final int method373(byte arg0, int arg1) {
        field813++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 <= 59) {
            field808 = (byte[][]) ((byte[][]) null);
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BILbe;)I", line = 94)
    public static final int method374(byte arg0, int arg1, class297 arg2) {
        field805++;
        if (arg2.field5109 == null || arg1 >= arg2.field5109.length) {
            return -2;
        }
        int var3 = -92 % ((arg0 - 71) / 34);
        try {
            int[] var4 = arg2.field5109[arg1];
            byte var5 = 0;
            int var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = 0;
                int var9 = var4[var7++];
                byte var10 = 0;
                if (var9 == 0) {
                    return var6;
                }
                if (var9 == 15) {
                    var10 = 1;
                }
                if (var9 == 16) {
                    var10 = 2;
                }
                if (var9 == 1) {
                    var8 = class303.field5228[var4[var7++]];
                }
                if (var9 == 17) {
                    var10 = 3;
                }
                if (var9 == 2) {
                    var8 = class210.field3258[var4[var7++]];
                }
                if (var9 == 3) {
                    var8 = class37.field601[var4[var7++]];
                }
                if (var9 == 4) {
                    int var11 = var4[var7++] << 16;
                    int var12 = var11 + var4[var7++];
                    class297 var13 = class178.method1226((byte) 124, var12);
                    int var14 = var4[var7++];
                    if (var14 != -1 && (!class45.method341(var14, (byte) 109).field3433 || class9.field113)) {
                        for (int var15 = 0; var15 < var13.field5060.length; var15++) {
                            if (var14 + 1 == var13.field5060[var15]) {
                                var8 += var13.field5131[var15];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var8 = class205.field3201[var4[var7++]];
                }
                if (var9 == 6) {
                    var8 = class217.field3436[class210.field3258[var4[var7++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class205.field3201[var4[var7++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class13.field221.field2481;
                }
                if (var9 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class323.field5557[var16]) {
                            var8 += class210.field3258[var16];
                        }
                    }
                }
                if (var9 == 10) {
                    int var17 = var4[var7++] << 16;
                    int var18 = var17 + var4[var7++];
                    class297 var19 = class178.method1226((byte) 115, var18);
                    int var20 = var4[var7++];
                    if (var20 != -1 && (!class45.method341(var20, (byte) 88).field3433 || class9.field113)) {
                        for (int var21 = 0; var21 < var19.field5060.length; var21++) {
                            if ((var20 + 1) == var19.field5060[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class92.field1516;
                }
                if (var9 == 12) {
                    var8 = class305.field5263;
                }
                if (var9 == 13) {
                    int var22 = class205.field3201[var4[var7++]];
                    int var23 = var4[var7++];
                    var8 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var24 = var4[var7++];
                    var8 = class187.method1286(64835055, var24);
                }
                if (var9 == 18) {
                    var8 = (class13.field221.field3962 >> 7) + class12.field157;
                }
                if (var9 == 19) {
                    var8 = (class13.field221.field3972 >> 7) + class165.field2568;
                }
                if (var9 == 20) {
                    var8 = var4[var7++];
                }
                if (var10 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var10;
                }
            }
        } catch (Exception var26) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z", line = 305)
    public static final boolean method375(int arg0, int arg1) {
        if (arg0 != -157) {
            field796 = (class242) null;
        }
        field809++;
        if (arg1 >= 32 && arg1 <= 126) {
            return true;
        } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
        } else {
            return arg1 == 128 || arg1 == 140 || arg1 == 151 || arg1 == 156 || arg1 == 159;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(BI)V", line = 334)
    public static final void method376(byte arg0, int arg1) {
        field814++;
        class147 var2 = class220.field3506.method1823(arg0 - 6);
        if (arg0 != 83) {
            field796 = (class242) null;
        }
        while (var2 != null) {
            if ((var2.field2293 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1006(-1024);
            }
            var2 = class220.field3506.method1825(-97);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V", line = 355)
    public final void method377(int arg0, int arg1, int arg2) {
        field811++;
        if (arg1 == 0) {
            this.field802 = 4096;
            this.field804 = this.field807 - (arg0 >= 0 ? arg0 : -arg0);
            this.field804 = this.field804 * this.field804 >> 12;
            this.field812 = this.field804;
        } else {
            this.field802 = this.field804 * this.field801 >> 12;
            if (this.field802 < 0) {
                this.field802 = 0;
            } else if (this.field802 > 4096) {
                this.field802 = 4096;
            }
            this.field804 = this.field807 - (arg0 >= 0 ? arg0 : -arg0);
            this.field804 = this.field804 * this.field804 >> 12;
            this.field804 = this.field804 * this.field802 >> 12;
            this.field812 += this.field804 * this.field795 >> 12;
            this.field795 = this.field800 * this.field795 >> 12;
        }
        if (arg2 != -20975) {
            this.method370(-80, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 391)
    public final void method378(int arg0) {
        this.field810 = 0;
        field798++;
        this.field812 = 0;
        if (arg0 != -949697716) {
            method376((byte) -82, -73);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class146 extends class93 {

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    private int field2905 = 1;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    private int field2902 = 204;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    private int field2909 = 1;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Ljd;")
    public static class92 field2897 = class202.method1325((byte) 90, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "Ljd;")
    private static class92 field2908 = class202.method1325((byte) 90, "Hidden");

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Ljd;")
    public static class92 field2898 = field2908;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2906 = 3353893;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "[I")
    public static int[] field2903 = new int[1000];

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "Ljd;")
    private static class92 field2896 = class202.method1325((byte) 90, "Too many connections from your address)3");

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Ljd;")
    public static class92 field2900 = field2896;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lh;")
    public static class70 field2910 = new class70(new byte[5000]);

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "[[[B")
    public static byte[][][] field2907;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field2893;
        int var3 = 91 % ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -121);
        if (super.field1887.field2757) {
            for (int var5 = 0; var5 < class150.field2985; ++var5) {
                int var6 = class75.field1574[var5];
                int var7 = this.field2905 * var6 >> 12;
                int var8 = class166.field3271[arg0];
                int var9 = var6 % (4096 / this.field2905) * this.field2905;
                int var10 = this.field2909 * var8 >> 12;
                int var11 = var8 % (4096 / this.field2909) * this.field2909;
                if (this.field2902 > var11) {
                    for (var7 -= var10; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~this.field2902 < ~var9) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2902) {
                    int var12;
                    for (var12 = var7 - var10; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lff;IIIII)V")
    public static final void method954(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class151.field3003 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class64.field1310) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class93.field1872 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class43 var14 = class31.field698[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class158.field3146[var11][var12 + 1][var13] + class158.field3146[var11][var12][var13] + class158.field3146[var11][var12][var13 + 1] + class158.field3146[var11][var12 + 1][var13 + 1]) / 4 - (class158.field3146[arg1][arg2 + 1][arg3] + class158.field3146[arg1][arg2][arg3] + class158.field3146[arg1][arg2][arg3 + 1] + class158.field3146[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class48 var16 = var14.field963;
                                    if (var16 != null) {
                                        if (var16.field1040 instanceof class57) {
                                            class57 var17 = (class57) var16.field1040;
                                            class57.method337(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1053 instanceof class57) {
                                            class57 var18 = (class57) var16.field1053;
                                            class57.method337(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field979; ++var19) {
                                        class185 var20 = var14.field966[var19];
                                        if (var20 != null && var20.field3501 instanceof class57) {
                                            class57 var21 = (class57) var20.field3501;
                                            int var22 = var20.field3489 - var20.field3488 + 1;
                                            int var23 = var20.field3504 - var20.field3486 + 1;
                                            class57.method337(arg0, var21, (var20.field3488 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field3486 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public static final void method955(boolean arg0) {
        class119.field2419 = null;
        class123.field2503 = null;
        class39.field876 = null;
        ++field2892;
        class61.field1275 = null;
        class153.field3039 = null;
        if (arg0) {
            class14.field401 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method956(int arg0) {
        field2898 = null;
        field2907 = null;
        field2897 = null;
        field2903 = null;
        if (arg0 == 64) {
            field2910 = null;
            field2908 = null;
            field2896 = null;
            field2900 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public static final void method957(int arg0) {
        ++field2904;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2902 = arg1.method442(arg2 ^ -21351);
                }
            } else {
                this.field2909 = arg1.method443(255);
            }
        } else {
            this.field2905 = arg1.method443(255);
        }
        ++field2895;
        if (arg2 != 0) {
            field2906 = 2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
    public static final boolean method958(byte arg0, int arg1) {
        ++field2911;
        if (arg0 > -67) {
            method955(false);
        }
        return (arg1 >> 20 & 1) != 0;
    }
}

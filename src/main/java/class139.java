import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class139 extends class43 {

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    private int field2598 = 204;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    private int field2604 = 1;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "I")
    private int field2612 = 1;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "Lmb;")
    private static class132 field2599 = class166.method1092("M", 121);

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lmb;")
    public static class132 field2603 = field2599;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "Lmb;")
    public static class132 field2606 = class166.method1092("mem=", 111);

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Lmb;")
    public static class132 field2602 = class166.method1092("p12_full", 119);

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "Lmb;")
    public static class132 field2601 = class166.method1092("Texturen geladen)3", 122);

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "Lmb;")
    public static class132 field2614 = field2599;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Loc;")
    public static class155 field2600;

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "Loc;")
    public static class155 field2616;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "Lpb;")
    public static class165 field2608;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1, arg0);
        ++field2597;
        if (super.field768.field3219) {
            for (int var4 = 0; ~class131.field2427 < ~var4; ++var4) {
                int var5 = class156.field2849[var4];
                int var6 = this.field2604 * var5 >> 12;
                int var7 = var5 % (4096 / this.field2604) * this.field2604;
                int var8 = class2.field35[arg0];
                int var9 = this.field2612 * var8 >> 12;
                int var10 = var8 % (4096 / this.field2612) * this.field2612;
                if (var10 < this.field2598) {
                    for (var6 -= var9; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2598 < ~var7) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var7 < this.field2598) {
                    int var11;
                    for (var11 = var6 - var9; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2601 = null;
        field2599 = null;
        if (arg0 > 93) {
            field2614 = null;
            field2616 = null;
            field2600 = null;
            field2608 = null;
            field2606 = null;
            field2602 = null;
            field2603 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)Lgg;")
    public static final class73 method938(int arg0, int arg1, int arg2, int arg3) {
        class73 var4 = new class73();
        ++field2611;
        var4.field1216 = arg1;
        var4.field1215 = arg3;
        class55.field927.method810(var4, (long) arg2, arg0 ^ -18274);
        class125.method819(arg0 + arg0, arg1);
        class96 var5 = class158.method1029((byte) -92, arg2);
        if (var5 != null) {
            class183.method1174(var5, arg0 + 16235);
        }
        if (class169.field3115 != null) {
            class183.method1174(class169.field3115, arg0 ^ 16235);
            class169.field3115 = null;
        }
        class57.field974 = 0;
        class202.field3721 = false;
        class150.method993(class160.field2913, class25.field407, class52.field887, true, class172.field3208);
        if (var5 != null) {
            class235.method1486(var5, -28715);
        }
        class38.method271((byte) -17, arg1);
        if (class45.field784 != -1) {
            class231.method1469(class45.field784, 1, 2345);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBIIII)V")
    public static final void method939(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2610;
        int var7 = class159.method1034(arg4, (byte) 68, class169.field3161, class17.field254);
        int var8 = class159.method1034(arg6, (byte) 99, class169.field3161, class17.field254);
        int var9 = class159.method1034(arg3, (byte) 121, class135.field2542, class168.field3083);
        int var10 = class159.method1034(arg5, (byte) 71, class135.field2542, class168.field3083);
        int var11 = class159.method1034(arg0 + arg4, (byte) 35, class169.field3161, class17.field254);
        int var12 = class159.method1034(-arg0 + arg6, (byte) 80, class169.field3161, class17.field254);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class23.method153(arg1, class61.field1033[var13], true, var9, var10);
        }
        for (int var14 = var8; ~var12 > ~var14; --var14) {
            class23.method153(arg1, class61.field1033[var14], true, var9, var10);
        }
        if (arg2 != -79) {
            field2616 = null;
        }
        int var15 = class159.method1034(arg0 + arg3, (byte) 80, class135.field2542, class168.field3083);
        int var16 = class159.method1034(-arg0 + arg5, (byte) 114, class135.field2542, class168.field3083);
        for (int var17 = var11; ~var12 <= ~var17; ++var17) {
            int[] var18 = class61.field1033[var17];
            class23.method153(arg1, var18, true, var9, var15);
            class23.method153(arg1, var18, true, var16, var10);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIILdh;)V")
    public static final void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class42 arg6) {
        class47.method314(arg6.field723, arg3, arg1, -13057, arg6.field673, arg4, arg0, arg2);
        if (arg5 != 1) {
            field2600 = null;
        }
        ++field2607;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            field2601 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2598 = arg2.method739(-125);
                }
            } else {
                this.field2612 = arg2.method716(-1308);
            }
        } else {
            this.field2604 = arg2.method716(-1308);
        }
        ++field2605;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZII)Lmb;")
    public static final class132 method941(int arg0, boolean arg1, int arg2, int arg3) {
        ++field2613;
        if (arg0 >= 2 && ~arg0 >= -37) {
            int var4 = 1;
            int var5 = arg3 / arg0;
            while (~var5 != -1) {
                var5 /= arg0;
                ++var4;
            }
            int var6 = var4;
            if (~arg3 > -1 || arg1) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg2 != 4) {
                return null;
            } else {
                if (arg3 < 0) {
                    var7[0] = 45;
                } else if (arg1) {
                    var7[0] = 43;
                }
                for (int var8 = 0; var8 < var4; ++var8) {
                    int var10 = arg3 % arg0;
                    arg3 /= arg0;
                    if (~var10 > -1) {
                        var10 = -var10;
                    }
                    if (~var10 < -10) {
                        var10 += 39;
                    }
                    var7[-var8 - 1 + var6] = (byte) (var10 + 48);
                }
                class132 var9 = new class132();
                var9.field2446 = var7;
                var9.field2479 = var6;
                return var9;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }
}

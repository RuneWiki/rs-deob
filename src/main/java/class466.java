import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class466 {

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field6741 = -1;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Lhi;")
    public static class45 field6729 = new class45(38, -1);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public int field6732;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public int field6736;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "[[I")
    public int[][] field6737;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
    private final void method2698(int arg0, int arg1, int arg2, int arg3) {
        field6731++;
        this.field6737[arg0][arg3] = class219.method1367(this.field6737[arg0][arg3], arg2);
        if (arg1 != 25784) {
            this.method2709(-13, -19, 95);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
    private final void method2699(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -13240) {
            field6722++;
            this.field6737[arg0][arg2] = class375.method2245(this.field6737[arg0][arg2], ~arg1);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ldc;I)V")
    public static final void method2700(class16 arg0, int arg1) {
        arg0.field172 = 0;
        field6724++;
        if (arg0.field186 != -1) {
            class55 var2 = class50.field716.method831(arg0.field186, (byte) 54);
            if (var2 == null || var2.field796 == null) {
                arg0.field247 = false;
                arg0.field186 = -1;
            } else {
                label403: {
                    arg0.field236++;
                    if (arg0.field240 < var2.field796.length && var2.field788[arg0.field240] < arg0.field236) {
                        arg0.field240++;
                        arg0.field210++;
                        arg0.field236 = 1;
                        class196.method1286(var2, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field240);
                    }
                    if (var2.field796.length <= arg0.field240) {
                        arg0.field236 = 0;
                        arg0.field240 = 0;
                        if (arg0.field247) {
                            arg0.field186 = arg0.method108(true).method2931(-32);
                            if (arg0.field186 == -1) {
                                arg0.field247 = false;
                                break label403;
                            }
                            var2 = class50.field716.method831(arg0.field186, (byte) 54);
                        }
                        class196.method1286(var2, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field240);
                    }
                    arg0.field210 = arg0.field240 + 1;
                    if (var2.field796.length <= arg0.field210) {
                        arg0.field210 = 0;
                    }
                }
            }
        }
        if (arg0.field237 != -1 && class28.field417 >= arg0.field211) {
            class350 var3 = class316.field4288.method2651((byte) 59, arg0.field237);
            int var4 = var3.field5089;
            if (var4 == -1) {
                arg0.field237 = -1;
            } else {
                label405: {
                    class55 var5 = class50.field716.method831(var4, (byte) 54);
                    if (var3.field5086) {
                        if (var5.field789 == 3) {
                            if (arg0.field264 > 0 && class28.field417 >= arg0.field160 && arg0.field181 < class28.field417) {
                                arg0.field237 = -1;
                                break label405;
                            }
                        } else if (var5.field789 == 1 && arg0.field264 > 0 && arg0.field160 <= class28.field417 && arg0.field181 < class28.field417) {
                            arg0.field211 = class28.field417 + 1;
                            break label405;
                        }
                    }
                    if (var5 == null || var5.field796 == null) {
                        arg0.field237 = -1;
                    } else {
                        if (arg0.field222 < 0) {
                            arg0.field222 = 0;
                            class196.method1286(var5, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, 0);
                        }
                        arg0.field204++;
                        if (var5.field796.length > arg0.field222 && arg0.field204 > var5.field788[arg0.field222]) {
                            arg0.field222++;
                            arg0.field204 = 1;
                            class196.method1286(var5, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field222);
                        }
                        if (var5.field796.length <= arg0.field222) {
                            if (var3.field5086) {
                                arg0.field173++;
                                arg0.field222 -= var5.field807;
                                if (arg0.field173 >= var5.field811) {
                                    arg0.field237 = -1;
                                } else if (arg0.field222 >= 0 && var5.field796.length > arg0.field222) {
                                    class196.method1286(var5, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field222);
                                } else {
                                    arg0.field237 = -1;
                                }
                            } else {
                                arg0.field237 = -1;
                            }
                        }
                        arg0.field227 = arg0.field222 + 1;
                        if (arg0.field227 >= var5.field796.length) {
                            if (var3.field5086) {
                                arg0.field227 -= var5.field807;
                                if ((arg0.field173 + 1) >= var5.field811) {
                                    arg0.field227 = -1;
                                } else if (arg0.field227 < 0 || var5.field796.length <= arg0.field227) {
                                    arg0.field227 = -1;
                                }
                            } else {
                                arg0.field227 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field175 != -1 && arg0.field171 <= class28.field417) {
            class350 var6 = class316.field4288.method2651((byte) 59, arg0.field175);
            int var7 = var6.field5089;
            if (var7 == -1) {
                arg0.field175 = -1;
            } else {
                label408: {
                    class55 var8 = class50.field716.method831(var7, (byte) 54);
                    if (var6.field5086) {
                        if (var8.field789 == 3) {
                            if (arg0.field264 > 0 && class28.field417 >= arg0.field160 && arg0.field181 < class28.field417) {
                                arg0.field175 = -1;
                                break label408;
                            }
                        } else if (var8.field789 == 1 && arg0.field264 > 0 && arg0.field160 <= class28.field417 && arg0.field181 < class28.field417) {
                            arg0.field171 = class28.field417 + 1;
                            break label408;
                        }
                    }
                    if (var8 == null || var8.field796 == null) {
                        arg0.field175 = -1;
                    } else {
                        if (arg0.field242 < 0) {
                            arg0.field242 = 0;
                            class196.method1286(var8, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, 0);
                        }
                        arg0.field187++;
                        if (var8.field796.length > arg0.field242 && var8.field788[arg0.field242] < arg0.field187) {
                            arg0.field242++;
                            arg0.field187 = 1;
                            class196.method1286(var8, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field242);
                        }
                        if (var8.field796.length <= arg0.field242) {
                            if (var6.field5086) {
                                arg0.field242 -= var8.field807;
                                arg0.field161++;
                                if (var8.field811 <= arg0.field161) {
                                    arg0.field175 = -1;
                                } else if (arg0.field242 >= 0 && arg0.field242 < var8.field796.length) {
                                    class196.method1286(var8, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field242);
                                } else {
                                    arg0.field175 = -1;
                                }
                            } else {
                                arg0.field175 = -1;
                            }
                        }
                        arg0.field203 = arg0.field242 + 1;
                        if (arg0.field203 >= var8.field796.length) {
                            if (var6.field5086) {
                                arg0.field203 -= var8.field807;
                                if (arg0.field161 + 1 >= var8.field811) {
                                    arg0.field203 = -1;
                                } else if (arg0.field203 < 0 || var8.field796.length <= arg0.field203) {
                                    arg0.field203 = -1;
                                }
                            } else {
                                arg0.field203 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field166 != -1 && arg0.field226 <= 1) {
            class55 var9 = class50.field716.method831(arg0.field166, (byte) 54);
            if (var9.field789 == 3) {
                if (arg0.field264 > 0 && class28.field417 >= arg0.field160 && arg0.field181 < class28.field417) {
                    arg0.field166 = -1;
                }
            } else if (var9.field789 == 1 && arg0.field264 > 0 && class28.field417 >= arg0.field160 && class28.field417 > arg0.field181) {
                arg0.field226 = 2;
            }
        }
        if (arg0.field166 != -1 && arg0.field226 == 0) {
            class55 var10 = class50.field716.method831(arg0.field166, (byte) 54);
            if (var10 == null || var10.field796 == null) {
                arg0.field166 = -1;
            } else {
                arg0.field191++;
                if (var10.field796.length > arg0.field194 && var10.field788[arg0.field194] < arg0.field191) {
                    arg0.field194++;
                    arg0.field191 = 1;
                    class196.method1286(var10, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field194);
                }
                if (arg0.field194 >= var10.field796.length) {
                    arg0.field206++;
                    arg0.field194 -= var10.field807;
                    if (var10.field811 <= arg0.field206) {
                        arg0.field166 = -1;
                    } else if (arg0.field194 >= 0 && arg0.field194 < var10.field796.length) {
                        class196.method1286(var10, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, arg0.field194);
                    } else {
                        arg0.field166 = -1;
                    }
                }
                arg0.field212 = arg0.field194 + 1;
                if (var10.field796.length <= arg0.field212) {
                    arg0.field212 -= var10.field807;
                    if (var10.field811 <= (arg0.field206 + 1)) {
                        arg0.field212 = -1;
                    } else if (arg0.field212 < 0 || var10.field796.length <= arg0.field212) {
                        arg0.field212 = -1;
                    }
                }
                arg0.field172 = var10.field813;
            }
        }
        if (arg0.field226 > 0) {
            arg0.field226--;
        }
        if (arg1 != 21758) {
            field6741 = -39;
        }
        for (int var11 = 0; var11 < arg0.field246.length; var11++) {
            class384 var12 = arg0.field246[var11];
            if (var12 != null) {
                if (var12.field5509 > 0) {
                    var12.field5509--;
                } else {
                    class55 var13 = class50.field716.method831(var12.field5512, (byte) 54);
                    if (var13 == null || var13.field796 == null) {
                        arg0.field246[var11] = null;
                    } else {
                        var12.field5514++;
                        if (var13.field796.length > var12.field5516 && var12.field5514 > var13.field788[var12.field5516]) {
                            var12.field5514 = 1;
                            var12.field5516++;
                            class196.method1286(var13, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, var12.field5516);
                        }
                        if (var13.field796.length <= var12.field5516) {
                            var12.field5516 -= var13.field807;
                            var12.field5517++;
                            if (var13.field811 <= var12.field5517) {
                                arg0.field246[var11] = null;
                            } else if (var12.field5516 >= 0 && var13.field796.length > var12.field5516) {
                                class196.method1286(var13, arg0.field6287, class81.field1158 == arg0, (byte) 1, arg0.field6279, arg0.field6284, var12.field5516);
                            } else {
                                arg0.field246[var11] = null;
                            }
                        }
                        var12.field5506 = var12.field5516 + 1;
                        if (var13.field796.length <= var12.field5506) {
                            var12.field5506 -= var13.field807;
                            if (var12.field5517 + 1 >= var13.field811) {
                                var12.field5506 = -1;
                            } else if (var12.field5506 < 0 || var13.field796.length <= var12.field5506) {
                                var12.field5506 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method2701(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field6725++;
        int var8 = arg0;
        if (arg3) {
            var8 = arg0 | 0x20000;
        }
        int var9 = arg5 - this.field6739;
        int var10 = arg2 - this.field6745;
        if (arg6) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (arg4 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field6732) {
                for (int var12 = var9; var12 < arg1 + var9; var12++) {
                    if (var12 >= 0 && this.field6736 > var12) {
                        this.method2698(var11, 25784, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZIZII)V")
    public final void method2702(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field6728++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg7;
            arg7 = arg0;
            arg0 = var10;
        }
        int var11 = arg2 - this.field6739;
        int var12 = arg4 - this.field6745;
        for (int var13 = var12; var13 < (arg7 + var12); var13++) {
            if (var13 >= 0 && var13 < this.field6732) {
                for (int var14 = var11; var14 < (var11 + arg0); var14++) {
                    if (var14 >= 0 && this.field6736 > var14) {
                        this.method2699(var13, var9, var14, -13240);
                    }
                }
            }
        }
        if (arg6 > -7) {
            this.field6732 = -19;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIBIZZI)V")
    public final void method2703(int arg0, int arg1, byte arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field6742++;
        int var8 = arg1 - this.field6739;
        int var9 = arg3 - this.field6745;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2699(var9, 128, var8, -13240);
                this.method2699(var9 - 1, 8, var8, -13240);
            }
            if (arg0 == 1) {
                this.method2699(var9, 2, var8, -13240);
                this.method2699(var9, 32, var8 + 1, -13240);
            }
            if (arg0 == 2) {
                this.method2699(var9, 8, var8, -13240);
                this.method2699(var9 + 1, 128, var8, -13240);
            }
            if (arg0 == 3) {
                this.method2699(var9, 32, var8, -13240);
                this.method2699(var9, 2, var8 - 1, -13240);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2699(var9, 1, var8, -13240);
                this.method2699(var9 - 1, 16, var8 + 1, -13240);
            }
            if (arg0 == 1) {
                this.method2699(var9, 4, var8, -13240);
                this.method2699(var9 + 1, 64, var8 + 1, -13240);
            }
            if (arg0 == 2) {
                this.method2699(var9, 16, var8, -13240);
                this.method2699(var9 + 1, 1, var8 - 1, -13240);
            }
            if (arg0 == 3) {
                this.method2699(var9, 64, var8, -13240);
                this.method2699(var9 - 1, 4, var8 - 1, -13240);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method2699(var9, 130, var8, -13240);
                this.method2699(var9 - 1, 8, var8, -13240);
                this.method2699(var9, 32, var8 + 1, -13240);
            }
            if (arg0 == 1) {
                this.method2699(var9, 10, var8, -13240);
                this.method2699(var9, 32, var8 + 1, -13240);
                this.method2699(var9 + 1, 128, var8, -13240);
            }
            if (arg0 == 2) {
                this.method2699(var9, 40, var8, -13240);
                this.method2699(var9 + 1, 128, var8, -13240);
                this.method2699(var9, 2, var8 - 1, -13240);
            }
            if (arg0 == 3) {
                this.method2699(var9, 160, var8, -13240);
                this.method2699(var9, 2, var8 - 1, -13240);
                this.method2699(var9 - 1, 8, var8, -13240);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method2699(var9, 65536, var8, -13240);
                    this.method2699(var9 - 1, 4096, var8, -13240);
                }
                if (arg0 == 1) {
                    this.method2699(var9, 1024, var8, -13240);
                    this.method2699(var9, 16384, var8 + 1, -13240);
                }
                if (arg0 == 2) {
                    this.method2699(var9, 4096, var8, -13240);
                    this.method2699(var9 + 1, 65536, var8, -13240);
                }
                if (arg0 == 3) {
                    this.method2699(var9, 16384, var8, -13240);
                    this.method2699(var9, 1024, var8 - 1, -13240);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method2699(var9, 512, var8, -13240);
                    this.method2699(var9 - 1, 8192, var8 + 1, -13240);
                }
                if (arg0 == 1) {
                    this.method2699(var9, 2048, var8, -13240);
                    this.method2699(var9 + 1, 32768, var8 + 1, -13240);
                }
                if (arg0 == 2) {
                    this.method2699(var9, 8192, var8, -13240);
                    this.method2699(var9 + 1, 512, var8 - 1, -13240);
                }
                if (arg0 == 3) {
                    this.method2699(var9, 32768, var8, -13240);
                    this.method2699(var9 - 1, 2048, var8 - 1, -13240);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method2699(var9, 66560, var8, -13240);
                    this.method2699(var9 - 1, 4096, var8, -13240);
                    this.method2699(var9, 16384, var8 + 1, -13240);
                }
                if (arg0 == 1) {
                    this.method2699(var9, 5120, var8, -13240);
                    this.method2699(var9, 16384, var8 + 1, -13240);
                    this.method2699(var9 + 1, 65536, var8, -13240);
                }
                if (arg0 == 2) {
                    this.method2699(var9, 20480, var8, -13240);
                    this.method2699(var9 + 1, 65536, var8, -13240);
                    this.method2699(var9, 1024, var8 - 1, -13240);
                }
                if (arg0 == 3) {
                    this.method2699(var9, 81920, var8, -13240);
                    this.method2699(var9, 1024, var8 - 1, -13240);
                    this.method2699(var9 - 1, 4096, var8, -13240);
                }
            }
        }
        if (arg2 >= -116) {
            this.method2709(-109, -54, 42);
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2699(var9, 536870912, var8, -13240);
                this.method2699(var9 - 1, 33554432, var8, -13240);
            }
            if (arg0 == 1) {
                this.method2699(var9, 8388608, var8, -13240);
                this.method2699(var9, 134217728, var8 + 1, -13240);
            }
            if (arg0 == 2) {
                this.method2699(var9, 33554432, var8, -13240);
                this.method2699(var9 + 1, 536870912, var8, -13240);
            }
            if (arg0 == 3) {
                this.method2699(var9, 134217728, var8, -13240);
                this.method2699(var9, 8388608, var8 - 1, -13240);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2699(var9, 4194304, var8, -13240);
                this.method2699(var9 - 1, 67108864, var8 + 1, -13240);
            }
            if (arg0 == 1) {
                this.method2699(var9, 16777216, var8, -13240);
                this.method2699(var9 + 1, 268435456, var8 + 1, -13240);
            }
            if (arg0 == 2) {
                this.method2699(var9, 67108864, var8, -13240);
                this.method2699(var9 + 1, 4194304, var8 - 1, -13240);
            }
            if (arg0 == 3) {
                this.method2699(var9, 268435456, var8, -13240);
                this.method2699(var9 - 1, 16777216, var8 - 1, -13240);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2699(var9, 545259520, var8, -13240);
            this.method2699(var9 - 1, 33554432, var8, -13240);
            this.method2699(var9, 134217728, var8 + 1, -13240);
        }
        if (arg0 == 1) {
            this.method2699(var9, 41943040, var8, -13240);
            this.method2699(var9, 134217728, var8 + 1, -13240);
            this.method2699(var9 + 1, 536870912, var8, -13240);
        }
        if (arg0 == 2) {
            this.method2699(var9, 167772160, var8, -13240);
            this.method2699(var9 + 1, 536870912, var8, -13240);
            this.method2699(var9, 8388608, var8 - 1, -13240);
        }
        if (arg0 == 3) {
            this.method2699(var9, 671088640, var8, -13240);
            this.method2699(var9, 8388608, var8 - 1, -13240);
            this.method2699(var9 - 1, 33554432, var8, -13240);
            return;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method2704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6723++;
        if (arg7 > -58) {
            this.field6736 = 43;
        }
        if (arg4 == 1) {
            if (arg3 == arg5 && arg0 == arg6) {
                return true;
            }
        } else if (arg3 <= arg5 && arg4 + arg3 - 1 >= arg5 && arg0 >= arg0 && arg0 + arg4 - 1 >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field6739;
        int var10 = arg5 - this.field6745;
        int var11 = arg3 - this.field6745;
        int var12 = arg6 - this.field6739;
        if (arg4 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field6737[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field6737[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field6737[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field6737[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field6737[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field6737[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field6737[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg4 - 1;
            int var14 = arg4 + var12 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field6737[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg4) == var12 && (this.field6737[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - arg4) == var11 && var12 <= var9 && var14 >= var9 && (this.field6737[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg4) == var12 && (this.field6737[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg4 == var11 && var12 <= var9 && var14 >= var9 && (this.field6737[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field6737[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field6737[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field6737[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 <= var10 && var13 >= var10 && (var9 + 1) == var12 && (this.field6737[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && var9 - arg4 == var12 && (this.field6737[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg4 == var11 && var12 <= var9 && var14 >= var9 && (this.field6737[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 <= var9 && var9 <= var14 && (this.field6737[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6733++;
        int var11 = arg2 + arg4;
        int var12 = arg0 + arg8;
        int var13 = arg7 + arg6;
        int var14 = arg1 + arg9;
        int var15 = -29 / ((arg3 + 51) / 38);
        if (arg4 == var13 && (arg5 & 0x2) == 0) {
            int var16 = arg1 < arg0 ? arg0 : arg1;
            int var17 = var12 < var14 ? var12 : var14;
            while (var16 < var17) {
                if ((this.field6737[var13 - this.field6745 - 1][var16 - this.field6739] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg7 == var11 && (arg5 & 0x8) == 0) {
            int var18 = arg1 < arg0 ? arg0 : arg1;
            int var19 = var12 >= var14 ? var14 : var12;
            while (var18 < var19) {
                if ((this.field6737[arg7 - this.field6745][var18 - this.field6739] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg0 == var14 && (arg5 & 0x1) == 0) {
            int var20 = arg7 < arg4 ? arg4 : arg7;
            int var21 = var13 > var11 ? var11 : var13;
            while (var20 < var21) {
                if ((this.field6737[var20 - this.field6745][var14 - this.field6739 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg1 == var12 && (arg5 & 0x4) == 0) {
            int var22 = arg7 < arg4 ? arg4 : arg7;
            int var23 = var13 <= var11 ? var13 : var11;
            while (var23 > var22) {
                if ((this.field6737[var22 - this.field6745][arg1 - this.field6739] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZZIII)V")
    public final void method2706(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field6739;
        int var9 = arg6 - this.field6745;
        field6730++;
        if (arg0 == arg5) {
            if (arg1 == 0) {
                this.method2698(var9, 25784, 128, var8);
                this.method2698(var9 - 1, 25784, 8, var8);
            }
            if (arg1 == 1) {
                this.method2698(var9, arg5 + 25784, 2, var8);
                this.method2698(var9, arg5 ^ 0x64B8, 32, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2698(var9, 25784, 8, var8);
                this.method2698(var9 + 1, 25784, 128, var8);
            }
            if (arg1 == 3) {
                this.method2698(var9, 25784, 32, var8);
                this.method2698(var9, 25784, 2, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method2698(var9, 25784, 1, var8);
                this.method2698(var9 - 1, 25784, 16, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2698(var9, 25784, 4, var8);
                this.method2698(var9 + 1, 25784, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2698(var9, 25784, 16, var8);
                this.method2698(var9 + 1, 25784, 1, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2698(var9, arg5 ^ 0x64B8, 64, var8);
                this.method2698(var9 - 1, arg5 + 25784, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method2698(var9, 25784, 130, var8);
                this.method2698(var9 - 1, 25784, 8, var8);
                this.method2698(var9, 25784, 32, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2698(var9, 25784, 10, var8);
                this.method2698(var9, arg5 ^ 0x64B8, 32, var8 + 1);
                this.method2698(var9 + 1, 25784, 128, var8);
            }
            if (arg1 == 2) {
                this.method2698(var9, arg5 ^ 0x64B8, 40, var8);
                this.method2698(var9 + 1, 25784, 128, var8);
                this.method2698(var9, arg5 ^ 0x64B8, 2, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2698(var9, 25784, 160, var8);
                this.method2698(var9, arg5 ^ 0x64B8, 2, var8 - 1);
                this.method2698(var9 - 1, 25784, 8, var8);
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method2698(var9, 25784, 65536, var8);
                    this.method2698(var9 - 1, 25784, 4096, var8);
                }
                if (arg1 == 1) {
                    this.method2698(var9, 25784, 1024, var8);
                    this.method2698(var9, 25784, 16384, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method2698(var9, 25784, 4096, var8);
                    this.method2698(var9 + 1, arg5 ^ 0x64B8, 65536, var8);
                }
                if (arg1 == 3) {
                    this.method2698(var9, 25784, 16384, var8);
                    this.method2698(var9, 25784, 1024, var8 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method2698(var9, 25784, 512, var8);
                    this.method2698(var9 - 1, 25784, 8192, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method2698(var9, arg5 + 25784, 2048, var8);
                    this.method2698(var9 + 1, 25784, 32768, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method2698(var9, 25784, 8192, var8);
                    this.method2698(var9 + 1, 25784, 512, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method2698(var9, 25784, 32768, var8);
                    this.method2698(var9 - 1, 25784, 2048, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method2698(var9, 25784, 66560, var8);
                    this.method2698(var9 - 1, arg5 ^ 0x64B8, 4096, var8);
                    this.method2698(var9, 25784, 16384, var8 + 1);
                }
                if (arg1 == 1) {
                    this.method2698(var9, 25784, 5120, var8);
                    this.method2698(var9, 25784, 16384, var8 + 1);
                    this.method2698(var9 + 1, 25784, 65536, var8);
                }
                if (arg1 == 2) {
                    this.method2698(var9, 25784, 20480, var8);
                    this.method2698(var9 + 1, 25784, 65536, var8);
                    this.method2698(var9, 25784, 1024, var8 - 1);
                }
                if (arg1 == 3) {
                    this.method2698(var9, 25784, 81920, var8);
                    this.method2698(var9, 25784, 1024, var8 - 1);
                    this.method2698(var9 - 1, 25784, 4096, var8);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method2698(var9, arg5 ^ 0x64B8, 536870912, var8);
                this.method2698(var9 - 1, 25784, 33554432, var8);
            }
            if (arg1 == 1) {
                this.method2698(var9, 25784, 8388608, var8);
                this.method2698(var9, 25784, 134217728, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2698(var9, 25784, 33554432, var8);
                this.method2698(var9 + 1, 25784, 536870912, var8);
            }
            if (arg1 == 3) {
                this.method2698(var9, 25784, 134217728, var8);
                this.method2698(var9, 25784, 8388608, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method2698(var9, arg5 ^ 0x64B8, 4194304, var8);
                this.method2698(var9 - 1, 25784, 67108864, var8 + 1);
            }
            if (arg1 == 1) {
                this.method2698(var9, 25784, 16777216, var8);
                this.method2698(var9 + 1, 25784, 268435456, var8 + 1);
            }
            if (arg1 == 2) {
                this.method2698(var9, 25784, 67108864, var8);
                this.method2698(var9 + 1, arg5 ^ 0x64B8, 4194304, var8 - 1);
            }
            if (arg1 == 3) {
                this.method2698(var9, 25784, 268435456, var8);
                this.method2698(var9 - 1, 25784, 16777216, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2698(var9, arg5 + 25784, 545259520, var8);
            this.method2698(var9 - 1, 25784, 33554432, var8);
            this.method2698(var9, 25784, 134217728, var8 + 1);
        }
        if (arg1 == 1) {
            this.method2698(var9, 25784, 41943040, var8);
            this.method2698(var9, 25784, 134217728, var8 + 1);
            this.method2698(var9 + 1, 25784, 536870912, var8);
        }
        if (arg1 == 2) {
            this.method2698(var9, arg5 + 25784, 167772160, var8);
            this.method2698(var9 + 1, 25784, 536870912, var8);
            this.method2698(var9, arg5 ^ 0x64B8, 8388608, var8 - 1);
        }
        if (arg1 == 3) {
            this.method2698(var9, arg5 + 25784, 671088640, var8);
            this.method2698(var9, 25784, 8388608, var8 - 1);
            this.method2698(var9 - 1, arg5 + 25784, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6744++;
        if (~arg3 == arg7) {
            if (arg4 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 <= arg6 && arg4 + arg3 - 1 >= arg6 && arg0 >= arg0 && (arg0 - (1 - arg3)) >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field6745;
        int var10 = arg1 - this.field6739;
        int var11 = arg0 - this.field6739;
        int var12 = arg6 - this.field6745;
        if (arg3 == 1) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field6737[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field6737[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field6737[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field6737[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field6737[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field6737[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field6737[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field6737[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field6737[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field6737[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field6737[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg3);
            int var14 = var10 + arg3 - 1;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var12 - arg3 == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field6737[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg3) == var10 && (this.field6737[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 - arg3) == var9 && var11 >= var10 && var11 <= var14 && (this.field6737[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var14 >= var11 && (this.field6737[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10 && (this.field6737[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg3) == var10 && (this.field6737[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 <= var12 && var12 <= var13 && (var11 - arg3) == var10) {
                        return true;
                    }
                    if ((var12 - arg3) == var9 && var11 >= var10 && var14 >= var11 && (this.field6737[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field6737[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var12 - arg3) == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field6737[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg3) == var10 && (this.field6737[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - arg3) == var9 && var10 <= var11 && var11 <= var14 && (this.field6737[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 - arg3 == var10 && (this.field6737[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - arg3 == var9 && var11 >= var10 && var14 >= var11 && (this.field6737[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field6737[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var11 - arg3 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 - arg3 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10 && (this.field6737[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field6737[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg3) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 >= var9 && var12 <= var13 && (var11 + 1) == var10 && (this.field6737[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && var11 - arg3 == var10 && (this.field6737[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg3) == var9 && var11 >= var10 && var11 <= var14 && (this.field6737[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field6737[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V")
    public final void method2708(int arg0, int arg1, int arg2) {
        field6740++;
        int var4 = arg2 - this.field6745;
        int var5 = arg0 - this.field6739;
        this.field6737[var4][var5] = class375.method2245(this.field6737[var4][var5], -2097153);
        if (arg1 != -1) {
            this.method2698(-120, -72, -62, 86);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(III)V")
    public final void method2709(int arg0, int arg1, int arg2) {
        if (arg1 <= 18) {
            this.method2698(126, 59, 62, 45);
        }
        int var4 = arg2 - this.field6739;
        int var5 = arg0 - this.field6745;
        field6726++;
        this.field6737[var5][var4] = class219.method1367(this.field6737[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(III)V")
    public final void method2710(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6739;
        field6734++;
        int var5 = arg1 - this.field6745;
        this.field6737[var5][var4] = class375.method2245(this.field6737[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static final void method2711(int arg0) {
        if (class275.field3737.method557()) {
            class275.field3737.method463(class415.field6025);
            class92.method757((byte) 55);
            class275.field3737.method535(class415.field6025);
            class275.field3737.method486(class415.field6025);
        } else {
            class54.method349(-90, class195.field2849);
        }
        field6727++;
        class157.method1127(1508614222);
        int var1 = -39 / ((63 - arg0) / 32);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method2712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 < 87) {
            this.method2703(110, -3, (byte) -26, -35, false, true, -56);
        }
        field6735++;
        if (arg7 > 1) {
            return class247.method1479(arg7, arg2, arg6, arg1, true, arg7, arg0, arg8, arg4) ? true : this.method2705(arg4, arg2, arg7, -126, arg1, arg5, arg8, arg0, arg7, arg6);
        }
        int var10 = arg8 + arg0 - 1;
        int var11 = arg6 + arg2 - 1;
        if (arg1 >= arg0 && arg1 <= var10 && arg2 <= arg4 && var11 >= arg4) {
            return true;
        } else if (arg0 - 1 == arg1 && arg4 >= arg2 && var11 >= arg4 && (this.field6737[arg1 - this.field6745][arg4 - this.field6739] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg4 >= arg2 && arg4 <= var11 && (this.field6737[arg1 - this.field6745][arg4 - this.field6739] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg4 && arg0 <= arg1 && arg1 <= var10 && (this.field6737[arg1 - this.field6745][arg4 - this.field6739] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg4 && arg0 <= arg1 && var10 >= arg1 && (this.field6737[arg1 - this.field6745][arg4 - this.field6739] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
    public final void method2713(int arg0) {
        field6743++;
        for (int var2 = 0; var2 < this.field6732; var2++) {
            for (int var3 = 0; var3 < this.field6736; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field6732 - 5) || var3 >= this.field6736 - 5) {
                    this.field6737[var2][var3] = -1;
                } else {
                    this.field6737[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 >= -21) {
            this.method2712(-46, 45, -108, -4, -106, 31, 58, -10, 59);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public static void method2714(byte arg0) {
        field6729 = null;
        int var1 = 103 % ((10 - arg0) / 32);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIB)V")
    public final void method2715(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field6739;
        field6738++;
        int var5 = arg0 - this.field6745;
        this.field6737[var5][var4] = class219.method1367(this.field6737[var5][var4], 262144);
        if (arg2 != -29) {
            this.method2708(83, -125, -48);
        }
    }
}

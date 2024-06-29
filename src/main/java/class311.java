import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class311 extends class218 {

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    private int field4808;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    private int field4812;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4810 = "Loaded interfaces";

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4813 = "Attack";

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    public static int[] field4814 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    public static boolean field4806 = false;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field4821 = 0;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Ldh;")
    public static class179 field4809 = new class179(64);

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field4822 = 99;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Llc;")
    public static class175 field4818;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4823;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIII)V", line = 7)
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4808 = arg3;
        this.field4803 = arg2;
        this.field4802 = arg1;
        this.field4812 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZZI)V", line = 22)
    public static final void method2180(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field4815++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (class250.field3787) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class165.field2281 - class171.field2459) * var6 / 100 + class171.field2459;
            if (var7 < class93.field1204) {
                var7 = class93.field1204;
            } else if (class55.field674 < var7) {
                var7 = class55.field674;
            }
            int var8 = arg0 * 512 * var7 / (arg1 * 334);
            if (class13.field178 > var8) {
                short var12 = class13.field178;
                var7 = arg1 * var12 * 334 / (arg0 * 512);
                if (var7 > class55.field674) {
                    var7 = class55.field674;
                    int var13 = arg0 * var7 * 512 / (var12 * 334);
                    int var14 = (arg1 - var13) / 2;
                    if (arg3) {
                        class306.method2143();
                        class306.method2154(arg2, arg5, var14, arg0, 0);
                        class306.method2154(arg2 - (var14 - arg1), arg5, var14, arg0, 0);
                    }
                    arg2 += var14;
                    arg1 -= var14 * 2;
                }
            } else if (var8 > class12.field168) {
                short var9 = class12.field168;
                var7 = arg1 * var9 * 334 / (arg0 * 512);
                if (var7 < class93.field1204) {
                    var7 = class93.field1204;
                    int var10 = var9 * 334 * arg1 / (var7 * 512);
                    int var11 = (arg0 - var10) / 2;
                    if (arg3) {
                        class306.method2143();
                        class306.method2154(arg2, arg5, arg1, var11, 0);
                        class306.method2154(arg2, arg0 + arg5 - var11, arg1, var11, 0);
                    }
                    arg0 -= var11 * 2;
                    arg5 += var11;
                }
            }
            class113.field1614 = arg0 * var7 / 334;
        }
        if (!arg4) {
            field4813 = (String) null;
        }
        class308.field4763 = arg2;
        class100.field1316 = arg5;
        class21.field265 = (short) arg0;
        class100.field1318 = (short) arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfb;I)V", line = 120)
    public static final void method2181(class65 arg0, int arg1) {
        if (arg0.field844 != null) {
            arg0.field844.field85 = 0;
        }
        arg0.field843 = false;
        if (arg1 != -1600071188) {
            method2184(-96, (class175) null, -15);
        }
        for (class65 var2 = arg0.method30(); var2 != null; var2 = arg0.method33()) {
            method2181(var2, -1600071188);
        }
        field4816++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqb;[I[II[I)V", line = 143)
    public static final void method2182(class109 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 != 2) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field2364.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field2364[var9] = null;
                    } else {
                        class247 var10 = class185.method1289(var6, (byte) 127);
                        int var11 = var10.field3729;
                        class204 var12 = arg0.field2364[var9];
                        if (var12 != null) {
                            if (var12.field2870 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field2364[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2861 = 0;
                                    var12.field2865 = 1;
                                    var12.field2863 = 0;
                                    var12.field2858 = var8;
                                    var12.field2866 = 0;
                                    class337.method2329(class118.field1664 == arg0, var10, (byte) -97, arg0.field2392, arg0.field2357, 0);
                                } else if (var11 == 2) {
                                    var12.field2861 = 0;
                                }
                            } else if (var10.field3740 >= class185.method1289(var12.field2870, (byte) 112).field3740) {
                                var12 = arg0.field2364[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class204 var13 = arg0.field2364[var9] = new class204();
                            var13.field2866 = 0;
                            var13.field2870 = var6;
                            var13.field2861 = 0;
                            var13.field2865 = 1;
                            var13.field2858 = var8;
                            var13.field2863 = 0;
                            class337.method2329(class118.field1664 == arg0, var10, (byte) -97, arg0.field2392, arg0.field2357, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4807++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)V", line = 241)
    public final void method884(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4812 * arg0 >> 12;
        field4799++;
        if (arg2) {
            method2180(-90, 124, 100, false, true, -43);
        }
        int var5 = this.field4803 * arg0 >> 12;
        int var6 = this.field4808 * arg1 >> 12;
        int var7 = this.field4802 * arg1 >> 12;
        class228.method1593(var5, 38, this.field3065, var4, var6, var7);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 262)
    public static final void method2183(byte arg0) {
        field4805++;
        int var1 = class88.field1097.method80(class164.field2262);
        int var2 = 0;
        int var3 = -108 % ((60 - arg0) / 48);
        while (class310.field4794 > var2) {
            int var4 = class88.field1097.method80(class106.method615(var2, true));
            if (var4 > var1) {
                var1 = var4;
            }
            var2++;
        }
        var1 += 8;
        int var5 = class49.field609 - var1 / 2;
        int var6 = class310.field4794 * 15 + 21;
        int var7 = class229.field3340;
        if (class314.field4847 < (var6 + var7)) {
            var7 = class314.field4847 - var6;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class188.field2712 < var1 + var5) {
            var5 = class188.field2712 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class104.field1340 == 1) {
            if (class49.field609 == class326.field4994 && class43.field508 == class229.field3340) {
                class140.field1951 = true;
                class325.field4984 = var7;
                class104.field1340 = 0;
                class172.field2480 = class310.field4794 * 15 + (class262.field3964 ? 26 : 22);
                class221.field3123 = var5;
                class205.field2871 = var1;
            }
        } else if (class49.field609 == class148.field2055 && class229.field3340 == class224.field3184) {
            class172.field2480 = class310.field4794 * 15 + (class262.field3964 ? 26 : 22);
            class104.field1340 = 0;
            class205.field2871 = var1;
            class325.field4984 = var7;
            class221.field3123 = var5;
            class140.field1951 = true;
        } else {
            class104.field1340 = 1;
            class43.field508 = class224.field3184;
            class326.field4994 = class148.field2055;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 353)
    public final void method882(int arg0, int arg1, int arg2) {
        field4819++;
        int var4 = this.field4803 * arg1 >> 12;
        int var5 = this.field4808 * arg0 >> 12;
        int var6 = this.field4812 * arg1 >> 12;
        int var7 = this.field4802 * arg0 >> 12;
        class148.method998(var6, -2, this.field3071, var5, var4, var7, this.field3070);
        if (arg2 != 4) {
            field4806 = false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BII)V", line = 385)
    public final void method881(byte arg0, int arg1, int arg2) {
        int var4 = this.field4802 * arg2 >> 12;
        int var5 = this.field4812 * arg1 >> 12;
        int var6 = this.field4808 * arg2 >> 12;
        if (arg0 < 96) {
            field4818 = (class175) null;
        }
        field4820++;
        int var7 = this.field4803 * arg1 >> 12;
        class50.method311(var7, this.field3065, this.field3071, var6, this.field3070, 2, var4, var5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILlc;I)Laf;", line = 404)
    public static final class189 method2184(int arg0, class175 arg1, int arg2) {
        field4804++;
        if (class115.method786(arg0, arg2 ^ 0xFFFFFFEE, arg1)) {
            if (arg2 != -101) {
                method2180(57, -94, 47, false, false, 69);
            }
            return class112.method766(-18);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Ljava/lang/String;", line = 437)
    public static final String method2185(int arg0) {
        field4811++;
        String var1;
        if (class314.field4848 == 1 && class310.field4794 < 2) {
            var1 = class50.field629 + class255.field3881 + class285.field4488 + " ->";
        } else if (class72.field909 && class310.field4794 < 2) {
            var1 = class260.field3943 + class255.field3881 + class255.field3892 + " ->";
        } else if (class163.field2247 && class184.field2650[81] && class310.field4794 > 2) {
            var1 = class106.method615(class310.field4794 - 2, true);
        } else {
            var1 = class106.method615(class310.field4794 - 1, true);
        }
        if (arg0 != 1) {
            method2185(-69);
        }
        if (class310.field4794 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class310.field4794 - 2) + class107.field1361;
        }
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 466)
    public static void method2186(int arg0) {
        field4810 = null;
        field4823 = null;
        field4813 = null;
        if (arg0 > -127) {
            field4823 = (String) null;
        }
        field4818 = null;
        field4814 = null;
        field4809 = null;
    }
}

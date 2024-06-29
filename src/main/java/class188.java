import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class188 extends class144 {

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2700 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "Lbc;")
    public static class282 field2701;

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class188() {
        this(4096);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(II)V")
    public static final void method1235(int arg0, int arg1) {
        ++field2702;
        if (~arg1 != 0) {
            if (class60.field719[arg1]) {
                class5.field63.method1853(arg1, arg0 + 9708);
                if (class123.field1767[arg1] != null) {
                    boolean var2 = true;
                    if (arg0 == -9708) {
                        for (int var3 = 0; var3 < class123.field1767[arg1].length; ++var3) {
                            if (class123.field1767[arg1][var3] != null) {
                                if (class123.field1767[arg1][var3].field1026 != 2) {
                                    class123.field1767[arg1][var3] = null;
                                } else {
                                    var2 = false;
                                }
                            }
                        }
                        if (var2) {
                            class123.field1767[arg1] = null;
                        }
                        class60.field719[arg1] = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)I")
    public static final int method1236(int arg0, int arg1, int arg2) {
        ++field2694;
        if (arg2 > -115) {
            return 44;
        } else {
            class94 var3 = (class94) class224.field3161.method1895((long) arg0, -108);
            if (var3 == null) {
                return -1;
            } else {
                return arg1 >= 0 && arg1 < var3.field1260.length ? var3.field1260[arg1] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        super(0, true);
        this.field2703 = 4096;
        this.field2703 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field2696;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            class194.method1261(var3, 0, class104.field1411, this.field2703);
        }
        if (arg1 != 255) {
            this.method12(74, 21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)I")
    public static final int method1237(String arg0, String arg1, int arg2, byte arg3) {
        ++field2697;
        int var4 = 0;
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = arg0.length();
        char var8 = 0;
        char var9 = 0;
        while (~(-var8 + var4) > ~var5 || ~(var6 - var9) > ~var7) {
            if (~(-var8 + var4) <= ~var5) {
                return -1;
            }
            if (~(var6 - var9) <= ~var7) {
                return 1;
            }
            char var22;
            if (~var8 != -1) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg1.charAt(var4++);
            }
            char var24;
            if (var9 == 0) {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class221.method1437(var22, (byte) 106);
            var9 = class221.method1437(var24, (byte) 106);
            char var26 = class118.method759(var22, 25739, arg2);
            char var27 = class118.method759(var24, 25739, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class87.method510(arg2, (byte) 84, var28) + -class87.method510(arg2, (byte) 84, var29);
                }
            }
        }
        int var10 = Math.min(var5, var7);
        if (arg3 != -1) {
            field2701 = null;
        }
        for (int var11 = 0; ~var11 > ~var10; ++var11) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var7 + -1 - var11;
                var17 = var5 + -1 + -var11;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class87.method510(arg2, (byte) 84, var20) - class87.method510(arg2, (byte) 84, var21);
                }
            }
        }
        int var12 = var5 - var7;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg1.charAt(var13);
                char var15 = arg0.charAt(var13);
                if (var14 != var15) {
                    return class87.method510(arg2, (byte) 84, var14) - class87.method510(arg2, (byte) 84, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)V")
    public static void method1238(byte arg0) {
        field2700 = null;
        field2701 = null;
        if (arg0 > -36) {
            field2701 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZIJII)Ljava/lang/String;")
    public static final String method1239(boolean arg0, int arg1, long arg2, int arg3, int arg4) {
        ++field2693;
        char var6 = ',';
        char var7 = '.';
        StringBuffer var8 = new StringBuffer(26);
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (~arg4 == -3) {
            var7 = 160;
        }
        boolean var9 = false;
        if (~arg2 > -1L) {
            arg2 = -arg2;
            var9 = true;
        }
        if (~arg1 < -1) {
            for (int var10 = 0; ~var10 > ~arg1; ++var10) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var8.append((char) (var11 + 48 + -((int) arg2 * 10)));
            }
            var8.append(var6);
        }
        int var12 = 0;
        if (arg3 != -3570) {
            return null;
        } else {
            while (true) {
                int var13 = (int) arg2;
                arg2 /= 10L;
                var8.append((char) (-((int) arg2 * 10) + var13 + 48));
                if (~arg2 == -1L) {
                    if (var9) {
                        var8.append('-');
                    }
                    return var8.reverse().toString();
                }
                if (arg0) {
                    ++var12;
                    if (var12 % 3 == 0) {
                        var8.append(var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            field2700 = null;
        }
        if (~arg0 == -1) {
            this.field2703 = (arg1.method1407(arg2 ^ 20712) << 12) / 255;
        }
        ++field2699;
    }
}

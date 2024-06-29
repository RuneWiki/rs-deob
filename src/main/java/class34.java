import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class34 extends class21 {

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lei;")
    public static class247 field691 = null;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field693 = -1;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 6)
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IB)[[I", line = 10)
    public final int[][] method175(int arg0, byte arg1) {
        field687++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            field693 = -58;
        }
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 56);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                var7[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var8[var11];
                var9[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLjava/lang/String;Z)I", line = 60)
    public static final int method272(int arg0, byte arg1, String arg2, boolean arg3) {
        field692++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        if (arg1 <= 73) {
            method275((byte) 27, (class307) null, 101);
        }
        return var6;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V", line = 140)
    public static final void method273(int arg0, int arg1) {
        field686++;
        class336.field5148 = -1;
        class336.field5148 = -1;
        class250.field3923 = arg1;
        if (arg0 != 9) {
            method277(-11, (class44) null, 10, 4, 28);
        }
        class264.method1760((byte) -12);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 156)
    public static final void method274(String arg0, int arg1, int arg2) {
        if (arg2 > -82) {
            field693 = 57;
        }
        field688++;
        String var3 = class69.method532(63, class142.method918(2048, arg0));
        boolean var4 = false;
        for (int var5 = 0; var5 < class305.field4623; var5++) {
            class278 var6 = class97.field1715[class283.field4384[var5]];
            if (var6 != null && var6.field4269 != null && var6.field4269.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg1 == 1) {
                    class224.field3533++;
                    class14.field263.method80(241, (byte) 120);
                    class14.field263.method1311(0, 10964);
                    class14.field263.method1306(2120940680, class283.field4384[var5]);
                } else if (arg1 == 4) {
                    class199.field3182++;
                    class14.field263.method80(157, (byte) 126);
                    class14.field263.method1311(0, 10964);
                    class14.field263.method1324(class283.field4384[var5], 1734336648);
                } else if (arg1 == 5) {
                    class204.field3334++;
                    class14.field263.method80(34, (byte) 102);
                    class14.field263.method1357(0, 0);
                    class14.field263.method1313(class283.field4384[var5], -376480);
                } else if (arg1 == 6) {
                    class14.field263.method80(184, (byte) 113);
                    class14.field263.method1324(class283.field4384[var5], 1734336648);
                    class14.field263.method1303(0, 115);
                    class26.field515++;
                } else if (arg1 == 7) {
                    class14.field263.method80(207, (byte) 112);
                    class49.field1004++;
                    class14.field263.method1324(class283.field4384[var5], 1734336648);
                    class14.field263.method1357(0, 0);
                }
                break;
            }
        }
        if (!var4) {
            class42.method321(class211.field3393 + var3, 0, 1, "");
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLbm;I)Lfd;", line = 234)
    public static final class206 method275(byte arg0, class307 arg1, int arg2) {
        field685++;
        int var3 = -92 / ((57 - arg0) / 61);
        return class148.method966((byte) 103, arg2, arg1) ? class344.method2382(-29899) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I", line = 249)
    public final int[] method177(int arg0, int arg1) {
        field689++;
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var4 = this.method171(0, 96, arg1);
            for (int var5 = 0; var5 < class294.field4489; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        int var6 = -121 % ((33 - arg0) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILwc;III)V", line = 279)
    public static final void method276(int arg0, int arg1, class174 arg2, int arg3, int arg4, int arg5) {
        field690++;
        if (arg2.field2786 == -1 && arg2.field2781 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class80.field1573 * arg2.field2805 >> 8;
        if (arg2.field2787 < arg4) {
            var6 += arg4 - arg2.field2787;
        } else if (arg2.field2791 > arg4) {
            var6 += arg2.field2791 - arg4;
        }
        if (arg3 != 7) {
            return;
        }
        if (arg5 > arg2.field2798) {
            var6 += arg5 - arg2.field2798;
        } else if (arg5 < arg2.field2795) {
            var6 += arg2.field2795 - arg5;
        }
        if (arg2.field2800 == 0 || arg2.field2800 < (var6 - 64) || class80.field1573 == 0 || arg2.field2803 != arg0) {
            if (arg2.field2789 != null) {
                class11.field230.method1237(arg2.field2789);
                arg2.field2789 = null;
            }
            if (arg2.field2780 != null) {
                class11.field230.method1237(arg2.field2780);
                arg2.field2780 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field2800 - var6) * var7 / arg2.field2800;
        if (arg2.field2789 != null) {
            arg2.field2789.method2161(var8);
        } else if (arg2.field2786 >= 0) {
            class76 var9 = class76.method568(class221.field3508, arg2.field2786, 0);
            if (var9 != null) {
                class5 var10 = var9.method566().method59(class290.field4449);
                class315 var11 = class315.method2139(var10, 100, var8);
                var11.method2162(-1);
                class11.field230.method1229(var11);
                arg2.field2789 = var11;
            }
        }
        if (arg2.field2780 != null) {
            arg2.field2780.method2161(var8);
            if (!arg2.field2780.method279(false)) {
                arg2.field2780 = null;
            }
        } else if (arg2.field2781 != null && (arg2.field2801 -= arg1) <= 0) {
            int var12 = (int) (Math.random() * (double) arg2.field2781.length);
            class76 var13 = class76.method568(class221.field3508, arg2.field2781[var12], 0);
            if (var13 != null) {
                class5 var14 = var13.method566().method59(class290.field4449);
                class315 var15 = class315.method2139(var14, 100, var8);
                var15.method2162(0);
                class11.field230.method1229(var15);
                arg2.field2801 = arg2.field2797 + (int) ((double) (arg2.field2804 - arg2.field2797) * Math.random());
                arg2.field2780 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILag;)V", line = 408)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field444 = arg2.method1317((byte) -94) == 1;
        }
        field683++;
        if (arg0 != -318) {
            method274((String) null, -107, -23);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILec;III)V", line = 422)
    public static final void method277(int arg0, class44 arg1, int arg2, int arg3, int arg4) {
        field684++;
        if (class48.field999 >= 400) {
            return;
        }
        if (arg1.field888 != null) {
            arg1 = arg1.method338(17911);
        }
        if (arg1 == null || !arg1.field838) {
            return;
        }
        String var5 = arg1.field863;
        if (~arg1.field856 != arg3) {
            String var6 = class324.field4954 == 1 ? class169.field2729 : class93.field1679;
            var5 = var5 + class329.method2282(arg3 + 104, class66.field1265.field4261, arg1.field856) + " (" + var6 + arg1.field856 + ")";
        }
        if (class21.field447 == 1) {
            class140.field2312++;
            class6.method62(arg2, (short) 14, class114.field1989, (long) arg0, arg3, class94.field1693, arg4, class170.field2749 + " -> <col=ffff00>" + var5);
        } else if (class86.field1617) {
            class74 var7 = class18.field331 == -1 ? null : class121.method784(11, class18.field331);
            if ((class81.field1581 & 0x2) != 0 && (var7 == null || arg1.method339(var7.field1515, class18.field331, 122) != var7.field1515)) {
                class253.field3963++;
                class6.method62(arg2, (short) 35, class183.field2934, (long) arg0, -1, class281.field4323, arg4, class223.field3523 + " -> <col=ffff00>" + var5);
            }
        } else {
            class149.field2444++;
            String[] var8 = arg1.field857;
            if (class138.field2302) {
                var8 = class253.method1700(-6, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class324.field4954 != 0 || !var8[var9].equalsIgnoreCase(class64.field1232))) {
                        class118.field2064++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 9;
                        }
                        if (var9 == 1) {
                            var10 = 33;
                        }
                        if (var9 == 2) {
                            var10 = 8;
                        }
                        if (var9 == 3) {
                            var10 = 60;
                        }
                        if (var9 == 4) {
                            var10 = 22;
                        }
                        int var11 = -1;
                        if (arg1.field880 == var9) {
                            var11 = arg1.field892;
                        }
                        if (arg1.field830 == var9) {
                            var11 = arg1.field893;
                        }
                        class6.method62(arg2, var10, var11, (long) arg0, -1, var8[var9], arg4, "<col=ffff00>" + var5);
                    }
                }
            }
            if (class324.field4954 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class64.field1232)) {
                        class147.field2405++;
                        short var13 = 0;
                        short var14 = 0;
                        if (arg1.field856 > class66.field1265.field4261) {
                            var14 = 2000;
                        }
                        if (var12 == 0) {
                            var13 = 9;
                        }
                        if (var12 == 1) {
                            var13 = 33;
                        }
                        if (var12 == 2) {
                            var13 = 8;
                        }
                        if (var12 == 3) {
                            var13 = 60;
                        }
                        if (var12 == 4) {
                            var13 = 22;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        class6.method62(arg2, var13, arg1.field885, (long) arg0, -1, var8[var12], arg4, "<col=ffff00>" + var5);
                    }
                }
            }
            class6.method62(arg2, (short) 1002, class116.field2040, (long) arg0, -1, class226.field3580, arg4, "<col=ffff00>" + var5);
        }
    }
}

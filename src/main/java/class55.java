import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field787 = 128;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    private int field784 = 128;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Z")
    public boolean field788 = false;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
    public boolean field790 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field796 = 0;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public int field794 = -1;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field792 = 0;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field781 = " is already on your ignore list.";

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    public static int[] field783 = new int[100];

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lfc;")
    public static class123 field801;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[S")
    private short[] field777;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[S")
    private short[] field785;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[S")
    private short[] field798;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "[S")
    private short[] field799;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method407(int arg0) {
        field781 = null;
        if (arg0 != 6318) {
            field783 = null;
        }
        field801 = null;
        field783 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V")
    public static final void method408(int arg0, int arg1, int arg2, byte arg3) {
        field795++;
        int var4 = -4 % ((arg3 + 18) / 54);
        class201 var5 = class94.method738(-71, arg2, 11);
        var5.method1477(0);
        var5.field3226 = arg0;
        var5.field3219 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLv;)V")
    public final void method409(byte arg0, class152 arg1) {
        field780++;
        if (arg0 != 28) {
            this.method409((byte) 65, (class152) null);
        }
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                return;
            }
            this.method410(-105, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILv;I)V")
    private final void method410(int arg0, class152 arg1, int arg2) {
        if (arg2 == 1) {
            this.field786 = arg1.method1126(false);
        } else if (arg2 == 2) {
            this.field794 = arg1.method1126(false);
        } else if (arg2 == 4) {
            this.field784 = arg1.method1126(false);
        } else if (arg2 == 5) {
            this.field787 = arg1.method1126(false);
        } else if (arg2 == 6) {
            this.field791 = arg1.method1126(false);
        } else if (arg2 == 7) {
            this.field796 = arg1.method1111(255);
        } else if (arg2 == 8) {
            this.field792 = arg1.method1111(255);
        } else if (arg2 == 9) {
            this.field790 = true;
        } else if (arg2 == 10) {
            this.field788 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1111(255);
            this.field785 = new short[var4];
            this.field798 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field798[var5] = (short) arg1.method1126(false);
                this.field785[var5] = (short) arg1.method1126(false);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1111(255);
            this.field799 = new short[var6];
            this.field777 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field799[var7] = (short) arg1.method1126(false);
                this.field777[var7] = (short) arg1.method1126(false);
            }
        }
        if (arg0 >= -103) {
            this.method409((byte) 29, (class152) null);
        }
        field779++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJI[I)Ljava/lang/String;")
    public static final String method411(int arg0, long arg1, int arg2, int[] arg3) {
        if (arg0 != 2) {
            field783 = null;
        }
        field789++;
        if (class36.field444 != null) {
            String var5 = class36.field444.method590(arg2, arg0 + 48, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)Lpc;")
    public final class22 method412(int arg0, int arg1, int arg2, int arg3) {
        field797++;
        if (arg2 != -16861) {
            return null;
        }
        class22 var5 = (class22) class265.field4292.method1553((long) this.field793, (byte) -73);
        if (var5 == null) {
            class173 var6 = class173.method1281(class245.field4028, this.field786, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field798 != null) {
                for (int var7 = 0; var7 < this.field798.length; var7++) {
                    var6.method1283(this.field798[var7], this.field785[var7]);
                }
            }
            if (this.field799 != null) {
                for (int var8 = 0; var8 < this.field799.length; var8++) {
                    var6.method1302(this.field799[var8], this.field777[var8]);
                }
            }
            var5 = var6.method1293(this.field796 + 64, this.field792 + 850, -30, -50, -30);
            class265.field4292.method1551(var5, arg2 + 16861, (long) this.field793);
        }
        class22 var9;
        if (this.field794 == -1 || arg0 == -1) {
            var9 = var5.method158(true, true, true);
        } else {
            var9 = class285.method1939(this.field794, 112).method1005(112, var5, arg1, arg3, arg0);
        }
        if (this.field784 != 128 || this.field787 != 128) {
            var9.method153(this.field784, this.field787, this.field784);
        }
        if (this.field791 != 0) {
            if (this.field791 == 90) {
                var9.method157();
            }
            if (this.field791 == 180) {
                var9.method143();
            }
            if (this.field791 == 270) {
                var9.method160();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class40.method306(arg2, 0);
        field778++;
        int var7 = 0;
        int var8 = arg2 - arg3;
        int var9 = -arg2;
        if (arg4 > var8) {
            var8 = 0;
        }
        int var10 = arg2;
        int var11 = -var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = arg5 + var8;
        int var15 = arg5 - var8;
        int var16 = var8;
        int[] var17 = class240.field3831[arg0];
        class177.method1330(var17, arg5 - arg2, arg1, 32232, var15);
        class177.method1330(var17, var15, arg6, arg4 + 32232, var14);
        class177.method1330(var17, var14, arg1, arg4 + 32232, arg5 - -arg2);
        while (var10 > var7) {
            var12 += 2;
            var9 += var12;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var16 >= 1) {
                class196.field3178[var16] = var7;
                var16--;
                var11 -= var16 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 < var8) {
                    int[] var18 = class240.field3831[arg0 + var10];
                    int var19 = arg5 + var7;
                    int[] var20 = class240.field3831[arg0 - var10];
                    int var21 = class196.field3178[var10];
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var21;
                    int var24 = arg5 - var21;
                    class177.method1330(var18, var22, arg1, 32232, var24);
                    class177.method1330(var18, var24, arg6, 32232, var23);
                    class177.method1330(var18, var23, arg1, arg4 + 32232, var19);
                    class177.method1330(var20, var22, arg1, 32232, var24);
                    class177.method1330(var20, var24, arg6, 32232, var23);
                    class177.method1330(var20, var23, arg1, 32232, var19);
                } else {
                    int[] var25 = class240.field3831[arg0 + var10];
                    int[] var26 = class240.field3831[arg0 - var10];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class177.method1330(var25, var28, arg1, 32232, var27);
                    class177.method1330(var26, var28, arg1, 32232, var27);
                }
            }
            int[] var29 = class240.field3831[arg0 + var7];
            int[] var30 = class240.field3831[arg0 - var7];
            int var31 = arg5 + var10;
            int var32 = arg5 - var10;
            if (var8 <= var7) {
                class177.method1330(var29, var32, arg1, 32232, var31);
                class177.method1330(var30, var32, arg1, 32232, var31);
            } else {
                int var33 = var7 > var16 ? class196.field3178[var7] : var16;
                int var34 = arg5 - var33;
                class177.method1330(var29, var32, arg1, arg4 ^ 0x7DE8, var34);
                int var35 = arg5 + var33;
                class177.method1330(var29, var34, arg6, 32232, var35);
                class177.method1330(var29, var35, arg1, 32232, var31);
                class177.method1330(var30, var32, arg1, 32232, var34);
                class177.method1330(var30, var34, arg6, arg4 ^ 0x7DE8, var35);
                class177.method1330(var30, var35, arg1, 32232, var31);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILv;)Lkl;")
    public static final class269 method414(int arg0, class152 arg1) {
        field782++;
        int var2 = -114 % ((arg0 - 48) / 33);
        return new class269(arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1128((byte) -125), arg1.method1111(255));
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method415(byte arg0) {
        field800++;
        class85.method615(28962, class256.field4221);
        int var1 = (class99.field1465 >> 3) + (class196.field3177 >> 10);
        byte var2 = 8;
        int var3 = (class50.field736 >> 10) + (class282.field4487 >> 3);
        byte var4 = 8;
        byte var5 = 0;
        byte var6 = 18;
        class200.field3214 = new byte[var6][];
        class118.field1706 = new int[var6];
        class206.field3311 = new byte[var6][];
        class283.field4500 = new byte[var6][];
        class195.field3167 = new int[var6];
        class218.field3483 = new int[var6][4];
        class67.field980 = new int[var6];
        class286.field4548 = new int[var6];
        class16.field183 = new int[var6];
        class85.field1233 = new int[var6];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                int var12 = (var8 << 8) + var11;
                class286.field4548[var7] = var12;
                class16.field183[var7] = class159.field2599.method619(-1, "m" + var8 + "_" + var11);
                class195.field3167[var7] = class159.field2599.method619(-1, "l" + var8 + "_" + var11);
                class85.field1233[var7] = class159.field2599.method619(-1, "n" + var8 + "_" + var11);
                class67.field980[var7] = class159.field2599.method619(-1, "um" + var8 + "_" + var11);
                class118.field1706[var7] = class159.field2599.method619(-1, "ul" + var8 + "_" + var11);
                if (class85.field1233[var7] == -1) {
                    class16.field183[var7] = -1;
                    class195.field3167[var7] = -1;
                    class67.field980[var7] = -1;
                    class118.field1706[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class85.field1233.length; var9++) {
            class85.field1233[var9] = -1;
            class16.field183[var9] = -1;
            class195.field3167[var9] = -1;
            class67.field980[var9] = -1;
            class118.field1706[var9] = -1;
        }
        int var10 = 18 / ((-arg0 - 58) / 33);
        class189.method1409(var2, false, true, var1, var3, var5, (byte) -25, var4);
    }
}

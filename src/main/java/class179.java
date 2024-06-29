import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class179 extends class177 {

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field2677 = 0;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field2685 = -2;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "[I")
    public static int[] field2684;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Z", line = 5)
    public static final boolean method1294(int arg0, int arg1) {
        field2676++;
        if (class261.field3867[arg0]) {
            return true;
        } else if (class37.field563.method1525(arg0, -74)) {
            int var2 = class37.field563.method1523(9271, arg0);
            if (var2 == 0) {
                class261.field3867[arg0] = true;
                return true;
            }
            if (class305.field4779[arg0] == null) {
                class305.field4779[arg0] = new class184[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class305.field4779[arg0][var3] == null) {
                    byte[] var4 = class37.field563.method1507(var3, (byte) 105, arg0);
                    if (var4 != null) {
                        class184 var5 = class305.field4779[arg0][var3] = new class184();
                        var5.field2806 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1341(true, new class35(var4));
                        } else {
                            var5.method1343(new class35(var4), (byte) 20);
                        }
                    }
                }
            }
            class261.field3867[arg0] = true;
            if (arg1 == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[[I", line = 71)
    public final int[][] method99(int arg0, int arg1) {
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            this.method97((class35) null, 104, 110);
        }
        if (this.field2645.field3203) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class287.field4415; var7++) {
                this.method1301(var7, (byte) 54, arg0);
                int[][] var8 = this.method1285(0, class59.field889, 27847);
                var4[var7] = var8[0][class113.field1779];
                var5[var7] = var8[1][class113.field1779];
                var6[var7] = var8[2][class113.field1779];
            }
        }
        field2682++;
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 111)
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Lcl;", line = 120)
    public static final class132 method1295(int arg0, boolean arg1) {
        class132 var2 = (class132) class44.field683.method1432((byte) 114, (long) arg0);
        field2680++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class138.field2151.method1507(arg0, (byte) 88, 32);
        class132 var4 = new class132();
        if (var3 != null) {
            var4.method998(-89, new class35(var3));
        }
        if (!arg1) {
            method1300(15, -115, -26);
        }
        var4.method1004(59);
        class44.field683.method1436(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLin;)V", line = 145)
    public static final void method1296(boolean arg0, class152 arg1) {
        field2686++;
        int var2 = 0;
        if (arg0) {
            method1303((byte) -25);
        }
        int var3 = 0;
        long var4 = 0L;
        int var6 = -1;
        if (arg1.field2279 == 0) {
            var4 = class222.method1585(arg1.field2297, arg1.field2288, arg1.field2285);
        }
        if (arg1.field2279 == 1) {
            var4 = class182.method1317(arg1.field2297, arg1.field2288, arg1.field2285);
        }
        if (arg1.field2279 == 2) {
            var4 = class274.method1910(arg1.field2297, arg1.field2288, arg1.field2285);
        }
        if (arg1.field2279 == 3) {
            var4 = class136.method1039(arg1.field2297, arg1.field2288, arg1.field2285);
        }
        if (var4 != 0L) {
            var6 = (int) (var4 >>> 32) & Integer.MAX_VALUE;
            var2 = (int) var4 >> 14 & 0x1F;
            var3 = ((int) var4 & 0x37DEED) >> 20;
        }
        arg1.field2278 = var3;
        arg1.field2281 = var2;
        arg1.field2280 = var6;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I", line = 190)
    public static final int method1297(int arg0, int arg1) {
        if (arg0 < 51) {
            field2684 = (int[]) null;
        }
        field2678++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZIIII)V", line = 203)
    public static final void method1298(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2683++;
        int var6 = arg0;
        class138.method1047(arg5, arg2 + arg3, -arg3 + arg2, 7, class320.field4990[arg4]);
        int var7 = arg3 * arg3;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = var7 << 1;
        int var11 = 0;
        int var12 = arg0 << 1;
        int var13 = var7 << 2;
        if (arg1) {
            method1300(-36, 78, 40);
        }
        int var14 = (1 - var12) * var7 + var9;
        int var15 = var8 - ((var12 - 1) * var10);
        int var16 = var8 << 2;
        int var17 = ((var11 << 1) + 3) * var9;
        int var18 = ((arg0 << 1) - 3) * var10;
        int var19 = (var11 + 1) * var16;
        int var20 = (arg0 - 1) * var13;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var17 += var16;
                    var15 += var19;
                    var19 += var16;
                    var11++;
                }
            }
            var6--;
            if (var15 < 0) {
                var11++;
                var14 += var17;
                var17 += var16;
                var15 += var19;
                var19 += var16;
            }
            var14 += -var20;
            var20 -= var13;
            int var21 = arg4 - var6;
            int var22 = arg4 + var6;
            int var23 = arg2 + var11;
            var15 += -var18;
            var18 -= var13;
            int var24 = arg2 - var11;
            class138.method1047(arg5, var23, var24, 7, class320.field4990[var21]);
            class138.method1047(arg5, var23, var24, 7, class320.field4990[var22]);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 289)
    public static void method1299(int arg0) {
        field2684 = null;
        if (arg0 < 67) {
            method1295(-41, false);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)Lwh;", line = 300)
    public static final class10 method1300(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1486;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBI)V", line = 308)
    private final void method1301(int arg0, byte arg1, int arg2) {
        field2679++;
        if (arg1 < 22) {
            field2684 = (int[]) null;
        }
        int var4 = field2684[arg0];
        int var5 = class260.field3858[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class113.field1779 = arg0;
            class59.field889 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class113.field1779 = arg2;
            class59.field889 = arg0;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class59.field889 = arg0;
            class113.field1779 = class287.field4415 - arg2;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class59.field889 = class282.field4361 - arg2;
            class113.field1779 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class59.field889 = class282.field4361 - arg2;
            class113.field1779 = class287.field4415 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class113.field1779 = class287.field4415 - arg2;
            class59.field889 = class282.field4361 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class59.field889 = class282.field4361 - arg0;
            class113.field1779 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class59.field889 = arg2;
            class113.field1779 = class287.field4415 - arg0;
        }
        class113.field1779 &= class133.field2090;
        class59.field889 &= class11.field120;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lhb;II)V", line = 382)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field2688++;
        if (arg1 != -18061) {
            method1300(55, 108, -97);
        }
        if (arg2 == 0) {
            this.field2649 = arg0.method273(arg1 + 83341) == 1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 396)
    public static final void method1302(String arg0, int arg1) {
        field2687++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)Ltb;", line = 407)
    public static final class220 method1303(byte arg0) {
        if (arg0 < 6) {
            return (class220) null;
        } else {
            field2675++;
            return class246.field3709.length > class30.field389 ? class246.field3709[class30.field389++] : null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I", line = 423)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 > -52) {
            field2684 = (int[]) null;
        }
        field2689++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -80);
        if (this.field2652.field3287) {
            for (int var4 = 0; var4 < class287.field4415; var4++) {
                this.method1301(var4, (byte) 102, arg1);
                int[] var5 = this.method1280(class59.field889, 0, false);
                var3[var4] = var5[class113.field1779];
            }
        }
        return var3;
    }
}

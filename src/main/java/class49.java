import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 extends class359 {

    @OriginalMember(owner = "client!gda", name = "Z", descriptor = "[Lhr;")
    public static class556[] field670 = new class556[14];

    @OriginalMember(owner = "client!gda", name = "Y", descriptor = "I")
    public static int field669 = -1;

    @OriginalMember(owner = "client!gda", name = "X", descriptor = "[J")
    public static long[] field668 = new long[100];

    @OriginalMember(owner = "client!gda", name = "Q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!gda", name = "R", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gda", name = "S", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!gda", name = "T", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!gda", name = "U", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!gda", name = "V", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!gda", name = "W", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gda", name = "ab", descriptor = "[B")
    private byte[] field671;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V")
    public static final void method266(int arg0) {
        class521.field7263.method282(arg0 + 17185);
        field665++;
        for (int var1 = 0; var1 < 32; var1++) {
            class150.field1956[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class6.field56[var2] = 0L;
        }
        class174.field2252 = 0;
        if (arg0 != -1) {
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V")
    public static void method267(byte arg0) {
        field668 = null;
        field670 = null;
        int var1 = 61 % ((arg0 + 55) / 62);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BBI)V")
    public final void method268(byte arg0, byte arg1, int arg2) {
        field663++;
        int var4 = arg2 * 2;
        if (arg1 > -71) {
            this.method268((byte) -48, (byte) -12, -108);
        }
        int var5 = arg0 & 0xFF;
        this.field671[var4++] = (byte) (var5 * 3 >> 5);
        this.field671[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(IIII)[B")
    public final byte[] method269(int arg0, int arg1, int arg2, int arg3) {
        field667++;
        this.field671 = new byte[arg0 * arg2 * 2 * arg3];
        this.method3138(1036486092, arg3, arg2, arg0);
        if (arg1 != -3222) {
            field669 = -30;
        }
        return this.field671;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
    public class49() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)Z")
    public static final boolean method270(byte arg0, int arg1) {
        field662++;
        if (arg0 > -122) {
            field669 = -91;
        }
        return arg1 == 18 || arg1 == 2 || arg1 == 1009 || arg1 == 4 || arg1 == 3;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lge;I)Leba;")
    public static final class510 method271(class551 arg0, int arg1) {
        int var2 = 66 % ((1 - arg1) / 38);
        field661++;
        return new class510(arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3087(true), arg0.method3043((byte) 49), arg0.method3045(-126));
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljj;II)Z")
    public static final boolean method272(class66 arg0, int arg1, int arg2) {
        if (arg1 != 6493) {
            return true;
        }
        field664++;
        int var3 = arg0.method377(8, 2);
        if (var3 == 0) {
            if (arg0.method377(8, 1) != 0) {
                method272(arg0, 6493, arg2);
            }
            int var4 = arg0.method377(8, 6);
            int var5 = arg0.method377(8, 6);
            boolean var6 = arg0.method377(8, 1) == 1;
            if (var6) {
                class610.field8776[class80.field1087++] = arg2;
            }
            if (class364.field5092[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class61 var7 = class58.field785[arg2];
            class20 var8 = class364.field5092[arg2] = new class20();
            var8.field366 = arg2;
            if (class601.field8697[arg2] != null) {
                var8.method108(class601.field8697[arg2], arg1 - 7041);
            }
            var8.method131(true, var7.field844, true);
            var8.field399 = var7.field846;
            int var9 = var7.field841;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field271 = var7.field842;
            int var12 = var9 & 0xFF;
            var8.field418[0] = class635.field9236[arg2];
            var8.field6358 = (byte) var10;
            var8.method117((var11 << 6) + var4 - class525.field7310, arg1 + -30306, (var12 << 6) + var5 - class58.field786);
            var8.field276 = false;
            class58.field785[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method377(8, 2);
            int var14 = class58.field785[arg2].field841;
            class58.field785[arg2].field841 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method377(8, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class58.field785[arg2].field841;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class58.field785[arg2].field841 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method377(arg1 - 6485, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFFAD) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class58.field785[arg2].field841;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class58.field785[arg2].field841 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILjava/lang/Class;)Lfu;")
    public static final class450 method273(int arg0, int arg1, int arg2, Class arg3) {
        class563 var4 = class199.field2605[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class15 var5 = var4.field7894; var5 != null; var5 = var5.field158) {
            class450 var6 = var5.field161;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6361 == arg1 && var6.field6359 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "([[BLjda;B)V")
    public static final void method274(byte[][] arg0, class277 arg1, byte arg2) {
        field666++;
        if (arg2 != 47) {
            method266(23);
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class551 var11 = new class551(var10);
                int var12 = class258.field3206[var5] >> 8;
                int var13 = class258.field3206[var5] & 0xFF;
                int var14 = var12 * 64 - class525.field7310;
                int var15 = var13 * 64 - class58.field786;
                class147.method802((byte) 49);
                arg1.method527(class525.field7310, class58.field786, var11, var15, var14, class15.field154, (byte) -89);
                arg1.method1709(105, var3, class301.field3918, var11, var14, var15);
                if (!arg1.field1257 && (class460.field6561 / 8) == var12 && (class190.field2449 / 8) == var13 && var3[0] != -1) {
                    class466.field6615 = class1.field5.method1476(var3[3], var3[0], 0, class369.field5136, var3[2], var3[1]);
                    class148.field1903 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class258.field3206[var6] >> 8) * 64 - class525.field7310;
            int var8 = (class258.field3206[var6] & 0xFF) * 64 - class58.field786;
            byte[] var9 = arg0[var6];
            if (var9 == null && class190.field2449 < 800) {
                class147.method802((byte) 49);
                arg1.method524(true, 64, var7, var8, 64);
            }
        }
    }
}

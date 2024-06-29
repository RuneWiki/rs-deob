import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class22 {

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[[I")
    private int[][] field391;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field398 = 127;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
    public static int[] field394;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[[Ltd;")
    public static class256[][] field403;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)I", line = 9)
    public final int method218(int arg0, int arg1) {
        field400++;
        if (this.field391 != null) {
            arg1 = (int) ((long) this.field399 * (long) arg1 / (long) this.field402) + 6;
        }
        if (arg0 < 59) {
            this.field402 = 106;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 26)
    public static final void method219(int arg0) {
        class225.field3481.method2282((byte) -127);
        field393++;
        if (arg0 != 3) {
            method223((byte) 94);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([BI)[B", line = 45)
    public final byte[] method220(byte[] arg0, int arg1) {
        if (arg1 != 14) {
            field394 = (int[]) null;
        }
        field397++;
        if (this.field391 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field399 / (long) this.field402) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field391[var4];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field399 + var4;
                int var12 = var11 / this.field402;
                var6 += var12;
                var4 = var11 - this.field402 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)I", line = 117)
    public final int method221(int arg0, byte arg1) {
        field396++;
        if (arg1 != -79) {
            this.method221(51, (byte) 84);
        }
        if (this.field391 != null) {
            arg0 = (int) ((long) this.field399 * (long) arg0 / (long) this.field402);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILvm;III)V", line = 132)
    public static final void method222(int arg0, class84 arg1, int arg2, int arg3, int arg4) {
        field395++;
        if (class137.field2225 >= 400 || arg0 != 0) {
            return;
        }
        if (arg1.field1339 != null) {
            arg1 = arg1.method667(-100);
        }
        if (arg1 == null || !arg1.field1325) {
            return;
        }
        String var5 = arg1.field1337;
        if (arg1.field1307 != 0) {
            String var6 = class109.field1773 == 1 ? class73.field1111 : class63.field915;
            var5 = var5 + class144.method1104(arg1.field1307, -6013, class345.field5363.field1475) + " (" + var6 + arg1.field1307 + ")";
        }
        if (class25.field428 == 1) {
            class147.method1121(arg2, class93.field1522, arg4, class141.field2283 + " -> <col=ffff00>" + var5, class116.field1880, 115, (long) arg3, (short) 18);
            class11.field262++;
        } else if (class315.field4977) {
            class139 var14 = class299.field4785 == -1 ? null : class331.method2317((byte) -30, class299.field4785);
            if ((class36.field549 & 0x2) != 0 && (var14 == null || arg1.method661(true, var14.field2255, class299.field4785) != var14.field2255)) {
                class147.method1121(arg2, class129.field2067, arg4, class55.field848 + " -> <col=ffff00>" + var5, class301.field4797, 118, (long) arg3, (short) 11);
                class208.field3291++;
            }
        } else {
            class18.field350++;
            String[] var7 = arg1.field1313;
            if (class106.field1748) {
                var7 = class180.method1319((byte) 50, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class109.field1773 != 0 || !var7[var8].equalsIgnoreCase(class68.field1033))) {
                        class202.field3150++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 46;
                        }
                        if (var8 == 1) {
                            var9 = 6;
                        }
                        if (arg1.field1331 == var8) {
                            var10 = arg1.field1318;
                        }
                        if (var8 == 2) {
                            var9 = 4;
                        }
                        if (var8 == 3) {
                            var9 = 3;
                        }
                        if (arg1.field1345 == var8) {
                            var10 = arg1.field1360;
                        }
                        if (var8 == 4) {
                            var9 = 49;
                        }
                        class147.method1121(arg2, var7[var8], arg4, "<col=ffff00>" + var5, var10, 122, (long) arg3, var9);
                    }
                }
            }
            if (class109.field1773 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class68.field1033)) {
                        class156.field2559++;
                        short var12 = 0;
                        if (arg1.field1307 > class345.field5363.field1475) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 46;
                        }
                        if (var11 == 1) {
                            var13 = 6;
                        }
                        if (var11 == 2) {
                            var13 = 4;
                        }
                        if (var11 == 3) {
                            var13 = 3;
                        }
                        if (var11 == 4) {
                            var13 = 49;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class147.method1121(arg2, var7[var11], arg4, "<col=ffff00>" + var5, arg1.field1350, -5, (long) arg3, var13);
                    }
                }
            }
            class147.method1121(arg2, class18.field342, arg4, "<col=ffff00>" + var5, class217.field3372, -98, (long) arg3, (short) 1003);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 296)
    public static void method223(byte arg0) {
        if (arg0 != -65) {
            method223((byte) -43);
        }
        field403 = (class256[][]) null;
        field394 = null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V", line = 309)
    public class22(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class90.method713(0, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field402 = var4;
            this.field391 = new int[var4][14];
            this.field399 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field391[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}

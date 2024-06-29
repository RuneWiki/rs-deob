import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class288 extends class23 {

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Z")
    private boolean field4824 = true;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    private int field4826 = 4096;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "Lil;")
    public static class53 field4828 = new class53();

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "[S")
    public static short[] field4832 = new short[500];

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "Lqd;")
    public static class40 field4837 = class147.method1106("::errortest", (byte) -99);

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
    public static int field4833 = 0;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "[Z")
    public static boolean[] field4836 = new boolean[8];

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "F")
    public static float field4834;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method1991(boolean arg0, int arg1) {
        field4830++;
        if (arg0) {
            field4836 = (boolean[]) null;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([Lm;ZIB[BI)V", line = 22)
    public static final void method1992(class44[] arg0, boolean arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field4823++;
        if (arg3 != -99) {
            field4828 = (class53) null;
        }
        int var6 = -1;
        class26 var7 = new class26(arg4);
        while (true) {
            int var8 = var7.method199(false);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method195((byte) 120);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFE0) >> 6;
                int var13 = var9 >> 12;
                int var14 = var7.method226(255);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg5 + var11;
                int var18 = arg2 + var12;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class44 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((class274.field4564[1][var18][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class58.method494(!arg1, var17, arg1, var15, var18, var13, var16, var13, var19, (byte) 92, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V", line = 107)
    public static void method1993(int arg0) {
        if (arg0 != 1) {
            field4835 = 103;
        }
        field4828 = null;
        field4832 = null;
        field4837 = null;
        field4836 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I", line = 123)
    public final int[][] method17(int arg0, int arg1) {
        if (arg0 <= 30) {
            method1994((byte) 74, (class213) null);
        }
        field4829++;
        int[][] var3 = this.field417.method1251(arg1, 122);
        if (this.field417.field2751) {
            int[] var4 = this.method174(0, 0, class212.field3384 & arg1 - 1);
            int[] var5 = this.method174(0, 0, arg1);
            int[] var6 = this.method174(0, 0, arg1 + 1 & class212.field3384);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class52.field1007; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field4826;
                int var12 = (var5[var10 + 1 & class6.field92] - var5[var10 - 1 & class6.field92]) * this.field4826;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field4824) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILsd;)V", line = 213)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field4826 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field4824 = arg2.method226(255) == 1;
        }
        if (arg1 == 0) {
            field4827++;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 238)
    public class288() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLrb;)V", line = 243)
    public static final void method1994(byte arg0, class213 arg1) {
        field4831++;
        class213 var2 = class250.method1764(arg1, -119);
        if (arg0 <= 116) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class73.field1287;
            var4 = class112.field1945;
        } else {
            var3 = var2.field3565;
            var4 = var2.field3502;
        }
        class162.method1235(false, arg1, var3, false, var4);
        class93.method709(arg1, var4, var3, -3);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lmm;", line = 282)
    public static final class249 method1995(byte arg0) {
        field4825++;
        if (arg0 <= 112) {
            field4828 = (class53) null;
        }
        class249 var1;
        if (class21.field350) {
            var1 = new class79(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], class22.field387[0], class171.field2797);
        } else {
            var1 = new class114(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], class22.field387[0], class171.field2797);
        }
        class181.method1324(-92);
        return var1;
    }
}

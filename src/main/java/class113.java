import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class113 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    private int field1986 = -1;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    private int field1990 = 0;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lrg;")
    private class84 field1991 = new class84();

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
    public boolean field2007 = false;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    private int field1993;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[Lug;")
    private class66[] field1995;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[[[I")
    private int[][][] field1994;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lne;")
    public static class137 field1989 = new class137(5);

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lda;")
    public static class275 field2000 = class255.method1672(112, "gr-Un:");

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lda;")
    public static class275 field2003 = class255.method1672(105, "weiss:");

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "[I")
    public static int[] field2008 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lda;")
    public static class275 field2006 = class255.method1672(93, " x ");

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method824(int arg0, byte arg1) {
        if (arg1 != -33) {
            return null;
        }
        field1999++;
        if (this.field1998 == this.field1993) {
            this.field2007 = this.field1995[arg0] == null;
            this.field1995[arg0] = class153.field2679;
            return this.field1994[arg0];
        } else if (this.field1993 == 1) {
            this.field2007 = this.field1986 != arg0;
            this.field1986 = arg0;
            return this.field1994[0];
        } else {
            class66 var3 = this.field1995[arg0];
            if (var3 == null) {
                this.field2007 = true;
                if (this.field1993 > this.field1990) {
                    var3 = new class66(arg0, this.field1990);
                    this.field1990++;
                } else {
                    class66 var4 = (class66) this.field1991.method546(21708);
                    var3 = new class66(arg0, var4.field1088);
                    this.field1995[var4.field1081] = null;
                    var4.method741(3);
                }
                this.field1995[arg0] = var3;
            } else {
                this.field2007 = false;
            }
            this.field1991.method558((byte) 126, var3);
            return this.field1994[var3.field1088];
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method825(byte arg0) {
        field1985++;
        if (arg0 < 101) {
            return;
        }
        for (int var2 = 0; var2 < this.field1993; var2++) {
            this.field1994[var2][0] = null;
            this.field1994[var2][1] = null;
            this.field1994[var2][2] = null;
            this.field1994[var2] = null;
        }
        this.field1995 = null;
        this.field1994 = null;
        this.field1991.method549((byte) 126);
        this.field1991 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method826(int arg0, int arg1) {
        field2001++;
        class259 var2;
        if (class213.field3633 == null) {
            var2 = new class259(512, 512);
        } else {
            var2 = (class259) class213.field3633;
        }
        int[] var3 = var2.field4527;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class72.field1168[arg0][var25][var6] & 0x18) == 0) {
                    class50.method314(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class72.field1168[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class50.method314(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1699();
        int var7 = (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10;
        int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var9 = 1;
        if (arg1 != -3) {
            method827(74);
        }
        while (var9 < 103) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class72.field1168[arg0][var23][var9] & 0x18) == 0) {
                    class65.method438(arg0, var9, (byte) -55, var7, var23, var8);
                }
                if (arg0 < 3 && (class72.field1168[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class65.method438(arg0 + 1, var9, (byte) -55, var7, var23, var8);
                }
            }
            var9++;
        }
        class149.field2601 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class35.method208(class159.field2790, var10, var11);
                if (var12 != 0L) {
                    class34 var14 = class146.method1040(-98, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field509;
                    if (var14.field528 != null) {
                        for (int var16 = 0; var16 < var14.field528.length; var16++) {
                            if (var14.field528[var16] != -1) {
                                class34 var17 = class146.method1040(-123, var14.field528[var16]);
                                if (var17.field509 >= 0) {
                                    var15 = var17.field509;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class173.field3003[class159.field2790].field2094;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && (var11 + 3) > var19 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class241.field4227[class149.field2601] = var14.field508;
                        class93.field1598[class149.field2601] = var18;
                        class92.field1565[class149.field2601] = var19;
                        class149.field2601++;
                    }
                }
            }
        }
        class213.field3633 = var2;
        class240.field4215.method1016((byte) -67);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method827(int arg0) {
        class129.field2270 = null;
        class267.field4644 = null;
        if (arg0 == 4) {
            field1988++;
            class25.field420 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZI)V")
    public static final void method828(int arg0, boolean arg1, int arg2) {
        field2005++;
        class184 var3 = class147.method1044(1, (byte) 31, arg2);
        var3.method1226((byte) 26);
        if (!arg1) {
            method826(-85, -69);
        }
        var3.field3145 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method829(int arg0) {
        field2008 = null;
        field2006 = null;
        field1989 = null;
        int var1 = 72 % ((arg0 - 67) / 51);
        field2000 = null;
        field2003 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field1987++;
        int var1 = class93.field1599.method113(class52.field878);
        for (int var2 = 0; var2 < class52.field863; var2++) {
            int var6 = class93.field1599.method113(class269.method1774(var2, (byte) 49));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class181.field3101 - (var1 / 2);
        int var4 = class52.field863 * 15 + 21;
        if (class249.field4391 < var1 + var3) {
            var3 = class249.field4391 - var1;
        }
        if (arg0 <= 124) {
            field1989 = null;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class161.field2826;
        if ((var4 + var5) > class212.field3587) {
            var5 = class212.field3587 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class145.field2546 != 1) {
            if (class181.field3101 == class162.field2834 && class185.field3174 == class161.field2826) {
                class6.field84 = var1;
                class63.field1051 = true;
                class23.field366 = var5;
                class29.field445 = class52.field863 * 15 + 22;
                class145.field2546 = 0;
                class157.field2769 = var3;
                return;
            }
            class208.field3525 = class162.field2834;
            class145.field2546 = 1;
            class174.field3016 = class185.field3174;
        } else if (class208.field3525 == class181.field3101 && class174.field3016 == class161.field2826) {
            class157.field2769 = var3;
            class63.field1051 = true;
            class6.field84 = var1;
            class145.field2546 = 0;
            class29.field445 = class52.field863 * 15 + 22;
            class23.field366 = var5;
            return;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public static final void method831(int arg0) {
        for (int var1 = 0; var1 < class17.field247; var1++) {
            int var10002 = class191.field3280[var1]--;
            if (class191.field3280[var1] >= -10) {
                class2 var3 = class25.field414[var1];
                if (var3 == null) {
                    var3 = class2.method8(class106.field1838, class270.field4701[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class191.field3280[var1] += var3.method6();
                    class25.field414[var1] = var3;
                }
                if (class191.field3280[var1] < 0) {
                    int var4;
                    if (class196.field3350[var1] == 0) {
                        var4 = class61.field1019;
                    } else {
                        int var5 = (class196.field3350[var1] & 0xFF) * 128;
                        int var6 = (class196.field3350[var1] & 0xFFF152) >> 16;
                        int var7 = class196.field3350[var1] >> 8 & 0xFF;
                        int var8 = var6 * 128 + 64 - class66.field1094.field1770;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 * 128 + 64 - class66.field1094.field1758;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var10 > var5) {
                            class191.field3280[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class173.field3006 / var5;
                    }
                    if (var4 > 0) {
                        class128 var11 = var3.method5().method917(class112.field1979);
                        class62 var12 = class62.method422(var11, 100, var4);
                        var12.method401(class70.field1146[var1] - 1);
                        class258.field4522.method1422(var12);
                    }
                    class191.field3280[var1] = -100;
                }
            } else {
                class17.field247--;
                for (int var2 = var1; var2 < class17.field247; var2++) {
                    class270.field4701[var2] = class270.field4701[var2 + 1];
                    class25.field414[var2] = class25.field414[var2 + 1];
                    class70.field1146[var2] = class70.field1146[var2 + 1];
                    class191.field3280[var2] = class191.field3280[var2 + 1];
                    class196.field3350[var2] = class196.field3350[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 > -76) {
            method831(-40);
        }
        field2004++;
        if (class243.field4243 && !class110.method815(92)) {
            if (class90.field1531 != 0 && class5.field69 != -1) {
                class112.method820(0, class5.field69, 10000, false, class90.field1531, class164.field2859);
            }
            class243.field4243 = false;
        } else if (class90.field1531 != 0 && class5.field69 != -1 && !class110.method815(121)) {
            class149.field2597.method526((byte) -104, 192);
            class277.field4822++;
            class149.field2597.method586(120, class5.field69);
            class5.field69 = -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILma;I)Lfk;")
    public static final class48 method832(int arg0, class105 arg1, int arg2) {
        if (arg0 == 1) {
            byte[] var3 = arg1.method760(0, arg2);
            field1996++;
            return var3 == null ? null : new class48(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)[[[I")
    public final int[][][] method833(byte arg0) {
        field1992++;
        if (this.field1998 != this.field1993) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1993; var2++) {
            this.field1995[var2] = class153.field2679;
        }
        int var3 = -96 / ((54 - arg0) / 45);
        return this.field1994;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
    public class113(int arg0, int arg1, int arg2) {
        this.field1998 = arg1;
        this.field1993 = arg0;
        this.field1995 = new class66[this.field1998];
        this.field1994 = new int[this.field1993][3][arg2];
    }
}

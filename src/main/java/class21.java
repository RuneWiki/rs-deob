import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class21 extends class147 {

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Ls;")
    public static class227 field251 = new class227(64);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field264 = Calendar.getInstance();

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "Lqj;")
    public static class196 field265 = class80.method502("::rebuild", -48);

    @OriginalMember(owner = "client!v", name = "db", descriptor = "[I")
    public static int[] field269 = new int[2];

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[I")
    public int[] field248;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
    public static int[] field268;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "[Lqj;")
    private class196[] field262;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "[[I")
    private int[][] field254;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILp;)V")
    public final void method112(int arg0, class56 arg1) {
        if (arg0 >= -22) {
            this.method127(-25);
        }
        while (true) {
            int var3 = arg1.method367(1);
            if (var3 == 0) {
                field245++;
                return;
            }
            this.method119(var3, (byte) 124, arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static final void method113(boolean arg0) {
        field253++;
        class214.method1472(80, class118.field1698);
        class41.field475++;
        if (class214.field3833 && class238.field4226) {
            int var1 = class63.field869;
            int var2 = class52.field646;
            int var3 = var1 - class157.field2540;
            int var4 = var2 - class67.field956;
            int var5 = class118.field1698.field3104;
            if (class202.field3599 > var3) {
                var3 = class202.field3599;
            }
            if (class118.field1698.field2997 + var3 > class202.field3599 + class98.field1421.field2997) {
                var3 = class98.field1421.field2997 + class202.field3599 - class118.field1698.field2997;
            }
            if (!arg0) {
                field268 = null;
            }
            int var6 = class98.field1421.field2998 + var3 - class202.field3599;
            if (class186.field3276 > var4) {
                var4 = class186.field3276;
            }
            int var7 = var3 - class161.field2585;
            if (class186.field3276 + class98.field1421.field3085 < var4 - -class118.field1698.field3085) {
                var4 = class186.field3276 + class98.field1421.field3085 - class118.field1698.field3085;
            }
            int var8 = class98.field1421.field3088 + var4 - class186.field3276;
            int var9 = var4 - class58.field783;
            if (class118.field1698.field3051 < class41.field475 && (var5 < var9 || -var5 > var9 || var7 > var5 || var7 < -var5)) {
                class193.field3402 = true;
            }
            if (class118.field1698.field3092 != null && class193.field3402) {
                class157 var10 = new class157();
                var10.field2527 = var8;
                var10.field2526 = class118.field1698;
                var10.field2530 = var6;
                var10.field2534 = class118.field1698.field3092;
                class88.method550(var10, -76);
            }
            if (class227.field4052 == 0) {
                if (class193.field3402) {
                    if (class118.field1698.field3006 != null) {
                        class157 var11 = new class157();
                        var11.field2534 = class118.field1698.field3006;
                        var11.field2527 = var8;
                        var11.field2526 = class118.field1698;
                        var11.field2525 = class246.field4388;
                        var11.field2530 = var6;
                        class88.method550(var11, -116);
                    }
                    if (class246.field4388 != null && client.method626(class118.field1698) != null) {
                        class215.field3838++;
                        class44.field520.method1173(114, 14592);
                        class44.field520.method355((byte) -116, class246.field4388.field3117);
                        class44.field520.method365(-28792, class246.field4388.field3062);
                        class44.field520.method365(-28792, class118.field1698.field3062);
                        class44.field520.method337(true, class118.field1698.field3117);
                    }
                } else if ((class226.field4049 == 1 || class103.method632(class125.field1767 - 1, -112)) && class125.field1767 > 2) {
                    class111.method674(0);
                } else if (class125.field1767 > 0) {
                    class172.method1121(class125.field1767 - 1, 1);
                }
                class118.field1698 = null;
            }
        } else if (class41.field475 > 1) {
            class118.field1698 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZI)I")
    public final int method114(int arg0, boolean arg1, int arg2) {
        field258++;
        if (this.field266 == null || arg2 < 0 || this.field266.length < arg2) {
            return -1;
        } else if (this.field254[arg2] == null || arg0 < 0 || arg0 > this.field254[arg2].length) {
            return -1;
        } else if (arg1) {
            return -119;
        } else {
            return this.field254[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3) {
        class103.field1489 = new class61[arg0][arg1][arg2];
        class203.field3667 = new int[arg0][arg1 + 1][arg2 + 1];
        class65.method412(false);
        class23.field293 = arg1;
        class110.field1566 = arg2;
        class51.field639 = new int[arg0][arg1 + 1][arg2 + 1];
        class20.method109();
        class168.field2827 = arg3;
        class195.field3423 = new boolean[class168.field2827 + class168.field2827 + 1][class168.field2827 + class168.field2827 + 1];
        class64.field884 = new boolean[class168.field2827 + class168.field2827 + 2][class168.field2827 + class168.field2827 + 2];
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
    public final int method116(int arg0, int arg1) {
        if (arg0 != 4231) {
            field268 = null;
        }
        field259++;
        return this.field266 == null || arg1 < 0 || this.field266.length < arg1 ? -1 : this.field266[arg1];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILbk;)V")
    public static final void method117(int arg0, class136 arg1) {
        class91.field1330 = arg1;
        field250++;
        if (arg0 > -97) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lqj;")
    public final class196 method118(int arg0) {
        field257++;
        class196 var2 = class158.method994(80, (byte) 100);
        if (this.field262 == null) {
            return class66.field945;
        } else if (arg0 < 66) {
            return null;
        } else {
            var2.method1323(48, this.field262[0]);
            for (int var3 = 1; var3 < this.field262.length; var3++) {
                var2.method1323(48, class148.field2330);
                var2.method1323(48, this.field262[var3]);
            }
            return var2.method1310(0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLp;)V")
    private final void method119(int arg0, byte arg1, class56 arg2) {
        field246++;
        if (arg1 != 124) {
            method122(null, null, -104);
        }
        if (arg0 == 1) {
            this.field262 = arg2.method326(true).method1295(60, 6224);
        } else if (arg0 == 2) {
            int var4 = arg2.method367(1);
            this.field248 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field248[var5] = arg2.method318(true);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method367(1);
            this.field266 = new int[var6];
            this.field254 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method318(true);
                this.field266[var7] = var8;
                this.field254[var7] = new int[class150.field2414[var8]];
                for (int var9 = 0; var9 < class150.field2414[var8]; var9++) {
                    this.field254[var7][var9] = arg2.method318(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        class150.field2415 = null;
        class18.field211 = null;
        class172.field2902 = null;
        class18.field206 = null;
        field256++;
        class45.field538 = null;
        class258.field4524 = null;
        class152.field2451 = null;
        class87.field1287 = null;
        int var1 = 52 % ((arg0 + 36) / 63);
        class195.field3433 = null;
        class225.field4038 = null;
        class10.field107 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public static void method121(boolean arg0) {
        field264 = null;
        field269 = null;
        field265 = null;
        field268 = null;
        field251 = null;
        if (!arg0) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lp;Lqj;I)I")
    public static final int method122(class56 arg0, class196 arg1, int arg2) {
        field249++;
        if (arg2 != 60) {
            field268 = null;
        }
        int var3 = arg0.field699;
        arg0.method324(arg1.field3459, true);
        arg0.field699 += class245.field4363.method3(arg1.field3459, arg0.field699, arg1.field3448, (byte) 109, arg0.field693, 0);
        return arg0.field699 - var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[Lbh;IZI[B)V")
    public static final void method123(int arg0, class153[] arg1, int arg2, boolean arg3, int arg4, byte[] arg5) {
        field260++;
        class56 var6 = new class56(arg5);
        if (arg2 != -7196) {
            method121(true);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method366(32);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method307((byte) 73);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var6.method367(arg2 + 7197);
                int var12 = var11 & 0x3;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var9 >> 12;
                int var15 = var11 >> 2;
                int var16 = arg4 + var13;
                int var17 = var9 & 0x3F;
                int var18 = arg0 + var17;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class153 var19 = null;
                    if (!arg3) {
                        int var20 = var14;
                        if ((class88.field1300[1][var16][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class142.method877(var14, var7, !arg3, var18, var14, var19, var16, var15, arg3, false, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B[ILp;)V")
    public final void method124(byte arg0, int[] arg1, class56 arg2) {
        field252++;
        if (this.field266 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field266.length && arg1.length > var4; var4++) {
            int var5 = class122.field1745[this.method116(arg0 + 4165, var4)];
            if (var5 > 0) {
                arg2.method327((long) arg1[var4], var5, (byte) -42);
            }
        }
        if (arg0 != 66) {
            this.method118(-122);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ILp;)Lqj;")
    public final class196 method125(int arg0, class56 arg1) {
        class196 var3 = class158.method994(80, (byte) 125);
        if (this.field266 != null) {
            for (int var4 = 0; var4 < this.field266.length; var4++) {
                var3.method1323(48, this.field262[var4]);
                var3.method1323(48, class142.method881(-69, this.field266[var4], arg1.method314(true, class30.field384[this.field266[var4]]), this.field254[var4]));
            }
        }
        if (arg0 == -28431) {
            var3.method1323(48, this.field262[this.field262.length - 1]);
            field263++;
            return var3.method1310(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (arg0 != 15475) {
            method117(-63, null);
        }
        field255++;
        if (this.field248 != null) {
            for (int var2 = 0; var2 < this.field248.length; var2++) {
                this.field248[var2] = class1.method6(this.field248[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)I")
    public final int method127(int arg0) {
        int var2 = 31 / ((-arg0 - 43) / 38);
        field247++;
        return this.field266 == null ? 0 : this.field266.length;
    }
}

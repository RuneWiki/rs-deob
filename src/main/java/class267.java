import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class267 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[F")
    private static float[] field4691 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    private static int field4686;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    private static int field4687;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private static int field4690;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private static int field4693;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private static int field4694;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    private static int field4695;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    private static int field4697;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private static int field4699;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    private static int[] field4696;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[I")
    private static int[] field4700;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "[Lfk;")
    public static class46[] field4701;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[Z")
    private static boolean[] field4688;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[Z")
    private static boolean[] field4698;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[[[I")
    private static int[][][] field4692;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 8)
    public static final void method1923() {
        for (int var0 = 0; var0 < field4689; var0++) {
            class46 var1 = field4701[var0];
            int var2 = var1.field671;
            if (var1.field666) {
                var2 = 0;
            }
            int var3 = var1.field671;
            if (var1.field676) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field674 >> 7) - var1.field670;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field674 >> 7) + var1.field670;
                if (var7 > field4686 - 1) {
                    var7 = field4686 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field668[var5++];
                    int var10 = (var9 >> 8) + ((var1.field678 >> 7) - var1.field670);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4690 - 1) {
                        var11 = field4690 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4692[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4692[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4692[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4692[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4692[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()V", line = 98)
    public static final void method1924() {
        field4701 = null;
        field4696 = null;
        field4698 = null;
        field4700 = null;
        field4688 = null;
        field4692 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILfk;III)V", line = 111)
    private static final void method1925(int arg0, class46 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class231.field4052;
        if (!field4698[arg0]) {
            var6.glEnable(var5);
            field4698[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field657);
        var6.glLightfv(var5, 4609, arg1.field682, 0);
        field4691[0] = (float) (arg1.field678 - arg2);
        field4691[1] = (float) (arg1.field683 - arg3);
        field4691[2] = (float) (arg1.field674 - arg4);
        var6.glLightfv(var5, 4611, field4691, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V", line = 128)
    public static final void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class26.field397) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1927(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4690 - 1) {
            method1927(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1927(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4686 - 1) {
            method1927(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4686 - 1) {
            method1927(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4690 - 1 && arg6 < field4686 - 1) {
            method1927(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1927(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4690 - 1 && arg6 > 0) {
            method1927(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)V", line = 181)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class26.field397 || field4697 == arg3 && field4695 == arg4 && field4687 == arg5 && field4699 == arg4 && field4693 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4688[var6] = false;
        }
        int var7 = 0;
        int var8 = field4692[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4696[var10] == var9) {
                        field4688[var10] = true;
                        continue label72;
                    }
                }
                field4700[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4688[var12]) {
                        field4696[var12] = field4700[var11];
                        field4688[var12] = true;
                        method1925(var12, field4701[field4700[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4688[var13]) {
                    field4696[var13] = -1;
                    method1933(var13);
                }
            }
            field4697 = arg3;
            field4695 = arg4;
            field4687 = arg5;
            field4699 = arg4;
            field4693 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V", line = 274)
    public static final void method1928(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4689; var2++) {
            field4701[var2].method329(arg0, arg1, (byte) 19);
        }
        field4697 = -1;
        field4695 = -1;
        field4687 = -1;
        field4699 = -1;
        field4693 = -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfk;)V", line = 290)
    public static final void method1929(class46 arg0) {
        if (field4689 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4701[field4689++] = arg0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()V", line = 301)
    public static void method1930() {
        field4701 = null;
        field4692 = (int[][][]) null;
        field4696 = null;
        field4698 = null;
        field4691 = null;
        field4700 = null;
        field4688 = null;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()V", line = 311)
    public static final void method1931() {
        GL var0 = class231.field4052;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field4701 = new class46[255];
        field4696 = new int[4];
        field4698 = new boolean[4];
        field4700 = new int[4];
        field4688 = new boolean[4];
        field4692 = new int[field4694][field4690][field4686];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 333)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class26.field397) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4696[var5] != -1) {
                int var6 = field4692[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4696[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4692[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4696[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4696[var5] = -1;
            method1933(var5);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 377)
    private static final void method1933(int arg0) {
        if (field4698[arg0]) {
            field4698[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class231.field4052;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V", line = 395)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class26.field397 || field4697 == arg3 && field4695 == arg4 && field4687 == arg5 && field4699 == arg6 && field4693 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4688[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4692[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4700[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4696[var16] == var14) {
                                    if (!field4688[var16]) {
                                        field4688[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4700[var10++] = var14;
                            var9++;
                            if (var9 == 4) {
                                break label112;
                            }
                        }
                    }
                }
            }
        }
        for (int var17 = 0; var17 < var10; var17++) {
            for (int var18 = 0; var18 < 4; var18++) {
                if (!field4688[var18]) {
                    field4696[var18] = field4700[var17];
                    field4688[var18] = true;
                    method1925(var18, field4701[field4700[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4688[var19]) {
                field4696[var19] = -1;
                method1933(var19);
            }
        }
        field4697 = arg3;
        field4695 = arg4;
        field4687 = arg5;
        field4699 = arg6;
        field4693 = arg7;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[[[Lje;)V", line = 525)
    public static final void method1935(int arg0, int arg1, class74[][][] arg2) {
        if (!class26.field397) {
            return;
        }
        GL var3 = class231.field4052;
        class59.method403(0, (byte) -59, 0);
        class231.method1589(0);
        class231.method1580();
        class231.method1597(class231.field4073);
        var3.glDepthMask(false);
        class231.method1602(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field4689; var4++) {
            class46 var5 = field4701[var4];
            if (var5.field680 != null) {
                int var6 = 0;
                int var7 = (var5.field674 >> 7) - var5.field670;
                int var8 = (var5.field674 >> 7) + var5.field670;
                if (var8 >= class14.field188) {
                    var8 = class14.field188 - 1;
                }
                if (var7 < class62.field992) {
                    var6 += class62.field992 - var7;
                    var7 = class62.field992;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field668[var6++];
                    int var11 = (var10 >> 8) + ((var5.field678 >> 7) - var5.field670);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class269.field4719) {
                        var11 = class269.field4719;
                    }
                    if (var12 >= class64.field1024) {
                        var12 = class64.field1024 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class74 var14 = arg2[var5.field671][var13][var9];
                        if (var14 != null && var14.field1114) {
                            class231.method1581(201.5F - (float) var5.field671 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field658 }, 0);
                            var5.field680.method799();
                            continue label58;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class217.field3867, 0);
        var3.glEnableClientState(32888);
        class231.method1600();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 621)
    public static final void method1936(int arg0, int arg1, int arg2) {
        field4694 = arg0;
        field4690 = arg1;
        field4686 = arg2;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()V", line = 628)
    public static final void method1937() {
        field4689 = 0;
        for (int var0 = 0; var0 < field4694; var0++) {
            for (int var1 = 0; var1 < field4690; var1++) {
                for (int var2 = 0; var2 < field4686; var2++) {
                    field4692[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "()V", line = 658)
    public static final void method1938() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4696[var0] = -1;
            method1933(var0);
        }
    }
}

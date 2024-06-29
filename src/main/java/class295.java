import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class295 {

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
    private boolean field4731 = false;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    private int field4726 = 32;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "J")
    private long field4738 = class3.method14(29853);

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Z")
    private boolean field4740 = true;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    private int field4739 = 0;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    private int field4747 = 0;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[Lrk;")
    private class15[] field4749 = new class15[8];

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    private int field4746 = 0;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "J")
    private long field4745 = 0L;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "J")
    private long field4748 = 0L;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    private int field4752 = 0;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "[Lrk;")
    private class15[] field4743 = new class15[8];

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Z")
    public static boolean field4729 = false;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4750 = "Walk here";

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lrk;")
    private class15 field4722;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[I")
    public int[] field4727;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
    public void method1793() {
        field4736++;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
    public void method1794() throws Exception {
        field4725++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([II)V")
    private final void method2003(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class11.field128) {
            var3 = arg1 << 1;
        }
        class117.method874(arg0, 0, var3);
        this.field4752 -= arg1;
        if (this.field4722 != null && this.field4752 <= 0) {
            this.field4752 += class91.field1459 >> 4;
            class236.method1627(this.field4722, 115);
            this.method2008(this.field4722.method105(), (byte) 86, this.field4722);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class15 var10 = null;
                        class15 var11 = this.field4749[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class310 var12 = var11.field165;
                                if (var12 == null || var12.field4985 <= var8) {
                                    var11.field167 = true;
                                    int var13 = var11.method102();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4985 += var13;
                                    }
                                    if (var4 >= this.field4726) {
                                        break label107;
                                    }
                                    class15 var14 = var11.method101();
                                    if (var14 != null) {
                                        int var15 = var11.field166;
                                        while (var14 != null) {
                                            this.method2008(var15 * var14.method105() >> 8, (byte) 123, var14);
                                            var14 = var11.method106();
                                        }
                                    }
                                    class15 var16 = var11.field164;
                                    var11.field164 = null;
                                    if (var10 == null) {
                                        this.field4749[var7] = var16;
                                    } else {
                                        var10.field164 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4743[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field164;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class15 var18 = this.field4749[var17];
                this.field4749[var17] = this.field4743[var17] = null;
                while (var18 != null) {
                    class15 var19 = var18.field164;
                    var18.field164 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4752 < 0) {
            this.field4752 = 0;
        }
        if (this.field4722 != null) {
            this.field4722.method104(arg0, 0, arg1);
        }
        this.field4738 = class3.method14(29853);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1797(Component arg0) throws Exception {
        field4724++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method2004(int arg0) {
        if (arg0 != -1) {
            method2004(85);
        }
        field4750 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final synchronized void method2005(int arg0) {
        this.field4740 = true;
        try {
            this.method1794();
            if (arg0 < 34) {
                this.field4726 = 102;
            }
        } catch (Exception var2) {
            this.method1793();
            this.field4748 = class3.method14(29853) + 2000L;
        }
        field4728++;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
    public void method1799(int arg0) throws Exception {
        field4719++;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public final synchronized void method2006(int arg0) {
        field4737++;
        if (class247.field3641 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class247.field3641.field3154[var3] == this) {
                    class247.field3641.field3154[var3] = null;
                }
                if (class247.field3641.field3154[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class247.field3641.field3155 = true;
                while (class247.field3641.field3157) {
                    class155.method1130(1, 50L);
                }
                class247.field3641 = null;
            }
        }
        this.method1793();
        if (arg0 != 2) {
            this.method2011(-81);
        }
        this.field4727 = null;
        this.field4731 = true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2007(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg4 + arg3; var6++) {
            for (int var11 = arg2; var11 <= arg2 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class192.field2847[arg1][var11][var6] = 127;
                }
            }
        }
        field4734++;
        for (int var7 = arg4; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class103.field1792[arg1][var10][var7] = arg1 > 0 ? class103.field1792[arg1 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg0) {
            return;
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg4 + 1; var8 < arg3 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class103.field1792[arg1][arg2][var8] = class103.field1792[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class103.field1792[arg1][var9][arg4] = class103.field1792[arg1][var9][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || arg2 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg1 != 0) {
            if (arg2 > 0 && class103.field1792[arg1][arg2 - 1][arg4] != class103.field1792[arg1 - 1][arg2 - 1][arg4]) {
                class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class103.field1792[arg1][arg2][arg4 - 1] != class103.field1792[arg1 - 1][arg2][arg4 - 1]) {
                class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class103.field1792[arg1][arg2 - 1][arg4 - 1] != class103.field1792[arg1 - 1][arg2 - 1][arg4 - 1]) {
                class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && class103.field1792[arg1][arg2 - 1][arg4] != 0) {
            class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2 - 1][arg4];
            return;
        }
        if (arg4 > 0 && class103.field1792[arg1][arg2][arg4 - 1] != 0) {
            class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2][arg4 - 1];
            return;
        }
        if (arg2 > 0 && arg4 > 0 && class103.field1792[arg1][arg2 - 1][arg4 - 1] != 0) {
            class103.field1792[arg1][arg2][arg4] = class103.field1792[arg1][arg2 - 1][arg4 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()I")
    public int method1796() throws Exception {
        field4718++;
        return this.field4742;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBLrk;)V")
    private final void method2008(int arg0, byte arg1, class15 arg2) {
        field4730++;
        int var4 = 97 / ((arg1 - 34) / 48);
        int var5 = arg0 >> 5;
        class15 var6 = this.field4743[var5];
        if (var6 == null) {
            this.field4749[var5] = arg2;
        } else {
            var6.field164 = arg2;
        }
        this.field4743[var5] = arg2;
        arg2.field166 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public final synchronized void method2009(int arg0) {
        field4732++;
        if (this.field4731) {
            return;
        }
        long var2 = class3.method14(29853);
        try {
            if (this.field4738 + 500000L < var2) {
                this.field4738 = var2 - 500000L;
            }
            while ((this.field4738 + 5000L) < var2) {
                this.method2010(80, 256);
                this.field4738 += (long) (256000 / class91.field1459);
            }
        } catch (Exception var7) {
            this.field4738 = var2;
        }
        if (this.field4727 == null) {
            return;
        }
        try {
            if (this.field4748 != 0L) {
                if (this.field4748 > var2) {
                    return;
                }
                this.method1799(this.field4742);
                this.field4740 = true;
                this.field4748 = 0L;
            }
            int var4 = this.method1796();
            if (this.field4746 < (this.field4747 - var4)) {
                this.field4746 = this.field4747 - var4;
            }
            int var5 = this.field4751 + this.field4744;
            if (arg0 <= 36) {
                this.field4746 = 116;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4742) {
                var4 = 0;
                this.field4742 += 1024;
                if (this.field4742 > 16384) {
                    this.field4742 = 16384;
                }
                this.method1793();
                this.method1799(this.field4742);
                if (this.field4742 < (var5 + 256)) {
                    var5 = this.field4742 - 256;
                    this.field4744 = var5 - this.field4751;
                }
                this.field4740 = true;
            }
            while (var4 < var5) {
                this.method2003(this.field4727, 256);
                this.method1798();
                var4 += 256;
            }
            if (var2 > this.field4745) {
                if (this.field4740) {
                    this.field4740 = false;
                } else if (this.field4746 == 0 && this.field4739 == 0) {
                    this.method1793();
                    this.field4748 = var2 + 2000L;
                    return;
                } else {
                    this.field4744 = Math.min(this.field4739, this.field4746);
                    this.field4739 = this.field4746;
                }
                this.field4746 = 0;
                this.field4745 = var2 + 2000L;
            }
            this.field4747 = var4;
        } catch (Exception var6) {
            this.method1793();
            this.field4748 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    private final void method2010(int arg0, int arg1) {
        field4733++;
        this.field4752 -= arg1;
        if (this.field4752 < 0) {
            this.field4752 = 0;
        }
        if (arg0 <= 5) {
            field4729 = true;
        }
        if (this.field4722 != null) {
            this.field4722.method103(arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
    public void method1798() throws Exception {
        field4720++;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public final void method2011(int arg0) {
        if (arg0 != -1) {
            method2007(true, -68, 98, -39, -56, -85);
        }
        field4723++;
        this.field4740 = true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILrk;)V")
    public final synchronized void method2012(int arg0, class15 arg1) {
        field4735++;
        this.field4722 = arg1;
        if (arg0 != -7004) {
            this.method2005(7);
        }
    }
}

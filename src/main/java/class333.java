import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class333 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4262 = -1;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4266 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "F")
    public static float field4263;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
    public static int[] field4260;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[[I")
    public static int[][] field4265;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lgf;IIII)V")
    public static final void method1980(class395 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4264++;
        class371 var5 = arg0.method2347((byte) -121);
        int var6 = -3 / ((arg3 + 50) / 55);
        int var7 = arg0.field5234 - arg0.field5209.field775 & 0x3FFF;
        if (arg2 == -1) {
            if (var7 != 0 || arg0.field5171 > 25) {
                if (arg1 < 0 && var5.field4806 != -1) {
                    arg0.field5174 = var5.field4806;
                } else if (arg1 <= 0 || var5.field4811 == -1) {
                    arg0.field5174 = var5.field4802;
                } else {
                    arg0.field5174 = var5.field4811;
                }
                arg0.field5196 = false;
            } else if (!arg0.field5196 || !var5.method2164(25742, arg0.field5174)) {
                arg0.field5174 = var5.method2166(-100);
                arg0.field5196 = arg0.field5174 != -1;
            }
        } else if (arg0.field5202 != -1 && var7 >= 10240 || var7 <= 2048) {
            int var8 = class242.field3112[arg4] - arg0.field5209.field775 & 0x3FFF;
            if (arg2 == 2 && var5.field4808 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var5.field4783 != -1) {
                    arg0.field5174 = var5.field4783;
                } else if (var8 >= 10240 && var8 < 14336 && var5.field4807 != -1) {
                    arg0.field5174 = var5.field4807;
                } else if (var8 <= 6144 || var8 >= 10240 || var5.field4813 == -1) {
                    arg0.field5174 = var5.field4808;
                } else {
                    arg0.field5174 = var5.field4813;
                }
            } else if (arg2 == 0 && var5.field4816 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var5.field4792 != -1) {
                    arg0.field5174 = var5.field4792;
                } else if (var8 >= 10240 && var8 < 14336 && var5.field4785 != -1) {
                    arg0.field5174 = var5.field4785;
                } else if (var8 <= 6144 || var8 >= 10240 || var5.field4790 == -1) {
                    arg0.field5174 = var5.field4816;
                } else {
                    arg0.field5174 = var5.field4790;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var5.field4822 != -1) {
                arg0.field5174 = var5.field4822;
            } else if (var8 >= 10240 && var8 < 14336 && var5.field4800 != -1) {
                arg0.field5174 = var5.field4800;
            } else if (var8 <= 6144 || var8 >= 10240 || var5.field4793 == -1) {
                arg0.field5174 = var5.field4802;
            } else {
                arg0.field5174 = var5.field4793;
            }
            arg0.field5196 = false;
        } else if (var7 == 0 && arg0.field5171 <= 25) {
            if (arg2 == 2 && var5.field4808 != -1) {
                arg0.field5174 = var5.field4808;
            } else if (arg2 == 0 && var5.field4816 != -1) {
                arg0.field5174 = var5.field4816;
            } else {
                arg0.field5174 = var5.field4802;
            }
            arg0.field5196 = false;
        } else {
            if (arg2 == 2 && var5.field4808 != -1) {
                if (arg1 < 0 && var5.field4791 != -1) {
                    arg0.field5174 = var5.field4791;
                } else if (arg1 <= 0 || var5.field4827 == -1) {
                    arg0.field5174 = var5.field4808;
                } else {
                    arg0.field5174 = var5.field4827;
                }
            } else if (arg2 == 0 && var5.field4816 != -1) {
                if (arg1 < 0 && var5.field4805 != -1) {
                    arg0.field5174 = var5.field4805;
                } else if (arg1 <= 0 || var5.field4814 == -1) {
                    arg0.field5174 = var5.field4816;
                } else {
                    arg0.field5174 = var5.field4814;
                }
            } else if (arg1 < 0 && var5.field4799 != -1) {
                arg0.field5174 = var5.field4799;
            } else if (arg1 <= 0 || var5.field4778 == -1) {
                arg0.field5174 = var5.field4802;
            } else {
                arg0.field5174 = var5.field4778;
            }
            arg0.field5196 = false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1981(int arg0) {
        if (arg0 == -6145) {
            field4266 = null;
            field4260 = null;
            field4265 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)I")
    public abstract int method299(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public abstract void method300(int arg0);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)J")
    public abstract long method301(int arg0);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
    public static final boolean method1982(int arg0, int arg1, int arg2) {
        field4261++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 != 7346) {
            return true;
        }
        class402 var3 = class52.field715.method1164(arg1, 0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2388(arg2, (byte) -123);
    }
}

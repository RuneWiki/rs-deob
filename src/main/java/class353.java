import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class353 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lum;")
    public class528 field5242;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    public static int[] field5247 = new int[2];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lnb;")
    public static class318 field5240 = new class318("WTQA", 2);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[Lf;")
    public static class256[] field5244;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 3)
    public void method2190(int arg0) {
        field5248++;
        if (arg0 != -25997) {
            this.method1395(false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Lrg;", line = 14)
    public static final class523 method2191(int arg0, int arg1, int arg2, int arg3) {
        field5251++;
        class44 var4 = class603.field8695[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class523 var5 = null;
        int var6 = -1;
        for (class361 var7 = var4.field667; var7 != null; var7 = var7.field5299) {
            class293 var8 = var7.field5301;
            if (var8 instanceof class523) {
                class523 var9 = (class523) var8;
                int var10 = (var9.method422((byte) 127) - 1) * 256 + 252;
                int var11 = var9.field7895 - var10 >> 9;
                int var12 = var9.field7896 - var10 >> 9;
                int var13 = var9.field7895 + var10 >> 9;
                int var14 = var9.field7896 + var10 >> 9;
                if (arg1 >= var11 && arg2 >= var12 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        if (arg3 == 30078) {
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 72)
    public void method2192(int arg0) {
        field5246++;
        if (arg0 <= 30) {
            field5240 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIZI)V", line = 87)
    public static final void method2193(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5243++;
        if (class233.method1442(false, arg2) && arg1 == 17068) {
            class366.method2242(-54, -1, class220.field2917[arg2], arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 104)
    public static void method2194(byte arg0) {
        int var1 = 13 % ((29 - arg0) / 39);
        field5244 = null;
        field5240 = null;
        field5247 = null;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 115)
    public void method1396(int arg0) {
        if (arg0 == 1) {
            field5249++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 125)
    public void method2195(int arg0) {
        if (arg0 > -20) {
            field5244 = null;
        }
        field5245++;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 139)
    public void method2196(int arg0) {
        field5252++;
        int var2 = -103 % ((57 - arg0) / 61);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 149)
    public void method1395(boolean arg0) {
        if (!arg0) {
            this.method1396(-9);
        }
        field5241++;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lum;)V", line = 159)
    public class353(class528 arg0) {
        this.field5242 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
    public abstract void method491(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public abstract void method490(int arg0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IZ)V")
    public abstract void method485(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Z")
    public abstract boolean method493(byte arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqda;I)V")
    public abstract void method484(int arg0, class689 arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
    public abstract void method486(int arg0, boolean arg1, int arg2);
}

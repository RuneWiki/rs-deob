import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class232 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    public static int[] field3705 = new int[256];

    @OriginalMember(owner = "client!h", name = "g", descriptor = "S")
    public static short field3709 = 1;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "[I")
    public static int[] field3712;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3714;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[[B")
    public static byte[][] field3715;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()Z", line = 4)
    public boolean method509() {
        field3707++;
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1667(int arg0, int arg1) {
        field3708++;
        if (arg1 != -257) {
            field3715 = (byte[][]) ((byte[][]) null);
        }
        class35.field474.method1625(arg0, (byte) 86);
        class225.field3576.method1625(arg0, (byte) 104);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lh;IIIZ)V", line = 28)
    public void method550(class232 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3703++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lh;", line = 35)
    public class232 method494(int arg0, int arg1, int arg2) {
        field3710++;
        return this;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIIII)V", line = 43)
    public static final void method1668(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class230 var6 = class251.field3996[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class293 var7 = var6.field3670;
        if (var7 != null) {
            int var8 = var7.field4608;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class61 var10 = var6.field3685;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field798;
        int var12 = var10.field811;
        int var13 = var10.field795;
        int var14 = var10.field813;
        int[] var15 = class172.field2741[var11];
        int[] var16 = class79.field1187[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/lang/String;)J", line = 140)
    public static final long method1669(int arg0, String arg1) {
        long var2 = 0L;
        field3706++;
        if (arg0 != 37) {
            return -118L;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 186)
    public static final void method1670(byte arg0) {
        field3704++;
        if (arg0 != 61) {
            method1668((int[]) null, 14, -65, 64, 11, 38);
        }
        class249.field3963 = true;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3705[var0] = var1;
        }
        field3712 = new int[2];
        field3714 = "Loaded fonts";
        field3715 = new byte[50][];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 205)
    public static void method1671(boolean arg0) {
        field3715 = (byte[][]) null;
        field3712 = null;
        if (!arg0) {
            field3709 = 95;
        }
        field3705 = null;
        field3714 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 218)
    public static final void method1672(byte arg0) {
        field3711++;
        int var1 = 0;
        int var2 = -46 % ((15 - arg0) / 38);
        while (class176.field2875 > var1) {
            int var3 = class128.field1906[var1];
            class196 var4 = class297.field4657[var3];
            if (var4 != null) {
                class200.method1466(-127, var4.field3210.field1808, var4);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJILll;)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
    public abstract int method152();
}

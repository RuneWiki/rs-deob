import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class329 {

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "Laq;")
    private class494 field4689 = new class494(256);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "Lmj;")
    private class114 field4678;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Ld;")
    private class103 field4681;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "F")
    public static float field4690;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "Ltja;")
    public static class493 field4687;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4692;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[Lmq;")
    public static class85[] field4677;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2005(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1996(boolean arg0) {
        this.field4689.method2881((byte) -20);
        if (arg0) {
            this.method1997(111, 69);
        }
        field4691++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Llba;", line = 18)
    public final class225 method1997(int arg0, int arg1) {
        field4684++;
        Object var3 = this.field4689.method2882((long) arg0, (byte) -27);
        if (var3 != null) {
            return (class225) var3;
        } else if (this.field4681.method846(arg0, true)) {
            class719 var4 = this.field4681.method847(arg0, -128);
            int var5 = var4.field10044 ? 64 : this.field4678.field1873;
            class225 var7;
            if (var4.field10049 && this.field4678.method99()) {
                float[] var6 = this.field4681.method848(var5, (byte) 86, false, var5, 0.7F, arg0);
                var7 = this.field4678.method1005(var4.field10034 != 0, var6, class133.field2225, var5, -124, var5);
            } else {
                int[] var8;
                if (var4.field10042 != 2 && class706.method3945(var4.field10031, -103)) {
                    var8 = this.field4681.method844(true, (byte) 121, 0.7F, var5, arg0, var5);
                } else {
                    var8 = this.field4681.method845(0.7F, arg0, false, (byte) 52, var5, var5);
                }
                var7 = this.field4678.method944(var5, var5, 21028, var8, var4.field10034 != 0);
            }
            var7.method333(var4.field10032, var4.field10048, 7536);
            int var9 = 87 / ((arg1 - 73) / 39);
            this.field4689.method2890(-7307, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIII[B)Z", line = 69)
    public static final boolean method1998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field4688++;
        int var7 = arg3 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg5 + arg0) / arg1);
        int var10 = -((arg1 + arg3 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg4] == 0) {
                    return true;
                }
                arg4 += arg1;
            }
            int var13 = arg4 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 122)
    public final void method1999(int arg0) {
        this.field4689.method2888(5, 123);
        if (arg0 < -62) {
            field4686++;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BB)V", line = 133)
    public static final void method2000(byte arg0, byte arg1) {
        if (class23.field257 == null) {
            class23.field257 = new byte[4][class192.field2891][class456.field6225];
        }
        field4679++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class192.field2891; var3++) {
                for (int var4 = 0; var4 < class456.field6225; var4++) {
                    class23.field257[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 <= 16) {
            field4685 = -40;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lll;I)Z", line = 170)
    public static final boolean method2001(class548 arg0, int arg1) {
        field4680++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field7586) {
            return false;
        } else if (!arg0.method3168((byte) -124, class751.field10417)) {
            return false;
        } else if (class432.field6035.method4253((long) arg0.field7587, -1) != null) {
            return false;
        } else if (class61.field922.method4253((long) arg0.field7580, -1) == null) {
            int var2 = 64 / ((arg1 + 49) / 50);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILol;)Lbb;", line = 200)
    public static final class223 method2002(int arg0, class431 arg1) {
        if (arg0 != -1) {
            method2002(66, null);
        }
        field4682++;
        return new class223(arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2515(102), arg1.method2515(arg0 + 22), arg1.method2557(14929));
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lmj;Ld;)V", line = 213)
    public class329(class114 arg0, class103 arg1) {
        this.field4678 = arg0;
        this.field4681 = arg1;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V", line = 223)
    public static void method2003(int arg0) {
        field4687 = null;
        field4677 = null;
        if (arg0 != 0) {
            field4690 = 0.7766295F;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)Z", line = 234)
    public static final boolean method2004(int arg0, int arg1, int arg2, int arg3) {
        field4683++;
        boolean var4 = true;
        class226 var5 = (class226) class133.method1109(arg2, arg3, arg0);
        if (var5 != null) {
            var4 &= class242.method1612(var5, arg1 + 1);
        }
        class226 var6 = (class226) class608.method3523(arg2, arg3, arg0, field4692 == null ? (field4692 = method2005("vu")) : field4692);
        if (var6 != null) {
            var4 &= class242.method1612(var6, ~arg1);
        }
        class226 var7 = (class226) class180.method1311(arg2, arg3, arg0);
        if (var7 != null) {
            var4 &= class242.method1612(var7, 0);
        }
        return arg1 == -1 ? var4 : true;
    }
}

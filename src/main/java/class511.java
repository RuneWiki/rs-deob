import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class511 implements class637 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field6896;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field6895;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Lhaa;")
    public class82 field6911;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field6897;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lee;")
    public class676 field6914;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public boolean field6904;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field6900 = new int[25];

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lrh;")
    public static class268 field6912;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lni;")
    public static class522 field6901;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I", line = 8)
    public static final int method2830(boolean arg0) {
        if (!arg0) {
            method2832(null, (byte) -28);
        }
        field6898++;
        class262 var1 = class552.field7810;
        synchronized (class552.field7810) {
            return class552.field7810.method1566(-127);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lhda;", line = 28)
    public final class750 method333(int arg0) {
        field6909++;
        if (arg0 != 30778) {
            this.method333(43);
        }
        return class50.field525;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V", line = 39)
    public static final void method2831(boolean arg0) {
        class497.field6761.method1575((byte) -127);
        field6905++;
        class385.field5412.method1575((byte) 60);
        class144.field1866.method1575((byte) -97);
        if (!arg0) {
            class460.field6371.method1575((byte) 116);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lfl;B)[Lqca;", line = 55)
    public static final class118[] method2832(class739 arg0, byte arg1) {
        field6907++;
        if (!arg0.method4128((byte) -112)) {
            return new class118[0];
        }
        class107 var2 = arg0.method4132(55);
        while (var2.field1419 == 0) {
            class267.method1599(0, 10L);
        }
        if (var2.field1419 == 2) {
            return new class118[0];
        }
        int[] var3 = (int[]) var2.field1418;
        class118[] var4 = new class118[var3.length >> 2];
        int var5 = 0;
        if (arg1 >= -64) {
            field6900 = null;
        }
        while (var5 < var4.length) {
            class118 var6 = new class118();
            var4[var5] = var6;
            var6.field1556 = var3[var5 << 2];
            var6.field1559 = var3[(var5 << 2) + 1];
            var6.field1558 = var3[(var5 << 2) + 2];
            var6.field1561 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLni;Ljava/lang/String;)Lwf;", line = 97)
    public static final class137 method2833(int arg0, boolean arg1, class522 arg2, String arg3) {
        field6903++;
        int var4 = arg2.method2890((byte) -102, arg3);
        if (var4 == -1) {
            return new class137(0);
        }
        int[] var5 = arg2.method2883(var4, 6341);
        class137 var6 = new class137(var5.length);
        int var7 = 0;
        int var8 = 0;
        if (arg0 < 67) {
            method2831(false);
        }
        while (true) {
            while (var6.field1744 > var7) {
                class611 var9 = new class611(arg2.method2885(var5[var8++], var4, false));
                int var10 = var9.method3418(-2);
                int var11 = var9.method3402((byte) 127);
                int var12 = var9.method3428((byte) 96);
                if (!arg1 && var12 == 1) {
                    var6.field1744--;
                } else {
                    var6.field1740[var7] = var10;
                    var6.field1745[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(Z)V", line = 144)
    public static void method2834(boolean arg0) {
        field6912 = null;
        if (!arg0) {
            field6900 = null;
        }
        field6901 = null;
        field6900 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILee;Lhaa;IIIIIIIZ)V", line = 166)
    public class511(int arg0, class676 arg1, class82 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field6899 = arg7;
        this.field6896 = arg4;
        this.field6908 = arg6;
        this.field6895 = arg9;
        this.field6906 = arg5;
        this.field6913 = arg0;
        this.field6911 = arg2;
        this.field6910 = arg3;
        this.field6897 = arg8;
        this.field6914 = arg1;
        this.field6904 = arg10;
    }
}

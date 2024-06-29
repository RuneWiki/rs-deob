import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lkh;")
    private class13 field228 = new class13(64);

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lul;")
    private class406 field233;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field232 = new String[8];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Loe;")
    public static class137 field226 = new class137();

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field235 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
    public static short[] field230;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method145(byte arg0) {
        class13 var2 = this.field228;
        synchronized (this.field228) {
            if (arg0 > -35) {
                return;
            }
            this.field228.method88(91);
        }
        field236++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method146(int arg0) {
        class13 var2 = this.field228;
        synchronized (this.field228) {
            if (arg0 > -111) {
                this.field233 = null;
            }
            this.field228.method93((byte) 116);
        }
        field225++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lds;")
    public final class12 method147(int arg0, int arg1) {
        field231++;
        class13 var3 = this.field228;
        class12 var4;
        synchronized (this.field228) {
            var4 = (class12) this.field228.method87((long) arg1, arg0 - 2062335808);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field233;
        byte[] var7;
        synchronized (this.field233) {
            if (arg0 != 1) {
                return null;
            }
            var7 = this.field233.method2536(35, 0, arg1);
        }
        class12 var8 = new class12();
        if (var7 != null) {
            var8.method81(118, new class217(var7));
        }
        var8.method82(24220);
        class13 var9 = this.field228;
        synchronized (this.field228) {
            this.field228.method84((long) arg1, var8, (byte) 27);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    public final void method148(int arg0, int arg1) {
        field234++;
        if (arg0 != 1) {
            this.method146(-127);
        }
        class13 var3 = this.field228;
        synchronized (this.field228) {
            this.field228.method91(16, arg1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLhp;)Leu;")
    public static final class337 method149(byte arg0, class217 arg1) {
        field229++;
        arg1.method1515((byte) 122);
        int var2 = arg1.method1515((byte) 126);
        class337 var3 = class386.method2411(var2, -31312);
        if (arg0 > -86) {
            method149((byte) -111, null);
        }
        var3.field5012 = arg1.method1515((byte) 123);
        int var4 = arg1.method1515((byte) 125);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1515((byte) 125);
            var3.method177((byte) -104, var6, arg1);
        }
        var3.method174((byte) 118);
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)I")
    public static final int method150(boolean arg0, int arg1, int arg2) {
        field227++;
        if (arg0) {
            return 0;
        }
        class240 var3 = class516.method3061((byte) -30, arg0, arg1);
        if (var3 == null) {
            return class135.field2067.method900(arg1, 1).field5821;
        } else if (arg2 > -105) {
            return -100;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3835.length; var5++) {
                if (var3.field3835[var5] == -1) {
                    var4++;
                }
            }
            return var4 + (class135.field2067.method900(arg1, 1).field5821 - var3.field3835.length);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method151(int arg0) {
        field230 = null;
        field232 = null;
        if (arg0 == -1) {
            field226 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[Ljava/lang/Object;[IB)V")
    public static final void method152(int arg0, int arg1, Object[] arg2, int[] arg3, byte arg4) {
        field237++;
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (((var9 & var10) + var7) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method152(var6 - 1, arg1, arg2, arg3, (byte) -44);
            method152(arg0, var6 + 1, arg2, arg3, (byte) -44);
        }
        if (arg4 != -44) {
            field232 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class18(class480 arg0, int arg1, class406 arg2) {
        this.field233 = arg2;
        if (this.field233 != null) {
            this.field233.method2551(35, -26070);
        }
    }
}

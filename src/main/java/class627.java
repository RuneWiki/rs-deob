import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class627 {

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lwg;")
    private class58 field9139 = new class58(64);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lwg;")
    public class58 field9145 = new class58(50);

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lwg;")
    public class58 field9146 = new class58(5);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lkr;")
    public class329 field9126;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lkr;")
    private class329 field9141;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lg;")
    public class513 field9140;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
    public boolean field9128;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field9147;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lpe;")
    public static class157 field9137;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[[B")
    public static byte[][] field9135;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method3620(int arg0) {
        field9136++;
        class58 var2 = this.field9139;
        synchronized (this.field9139) {
            this.field9139.method317((byte) 21);
        }
        if (arg0 < 81) {
            this.method3623(34, (byte) -118);
        }
        class58 var3 = this.field9145;
        synchronized (this.field9145) {
            this.field9145.method317((byte) 21);
        }
        class58 var4 = this.field9146;
        synchronized (this.field9146) {
            this.field9146.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
    public final void method3621(byte arg0, int arg1) {
        field9138++;
        class58 var3 = this.field9139;
        synchronized (this.field9139) {
            this.field9139.method320(arg1, -306674912);
        }
        class58 var4 = this.field9145;
        synchronized (this.field9145) {
            this.field9145.method320(arg1, -306674912);
        }
        class58 var5 = this.field9146;
        synchronized (this.field9146) {
            this.field9146.method320(arg1, -306674912);
        }
        if (arg0 >= -102) {
            this.field9141 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method3622(byte arg0) {
        field9137 = null;
        if (arg0 != 79) {
            field9135 = null;
        }
        field9135 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lmt;")
    public final class626 method3623(int arg0, byte arg1) {
        field9144++;
        class58 var3 = this.field9139;
        class626 var4;
        synchronized (this.field9139) {
            var4 = (class626) this.field9139.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field9141;
        byte[] var7;
        synchronized (this.field9141) {
            int var6 = -82 % ((-arg1 - 55) / 53);
            var7 = this.field9141.method2054(true, class318.method1983(arg0, -11708), class394.method2368((byte) -80, arg0));
        }
        class626 var8 = new class626();
        var8.field9049 = this;
        var8.field9096 = arg0;
        if (var7 != null) {
            var8.method3610((byte) 100, new class551(var7));
        }
        var8.method3611(-125);
        class58 var9 = this.field9139;
        synchronized (this.field9139) {
            this.field9139.method316((long) arg0, (byte) -126, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public final void method3624(boolean arg0) {
        class58 var2 = this.field9139;
        synchronized (this.field9139) {
            if (!arg0) {
                this.method3620(-90);
            }
            this.field9139.method315(1);
        }
        field9142++;
        class58 var3 = this.field9145;
        synchronized (this.field9145) {
            this.field9145.method315(1);
        }
        class58 var4 = this.field9146;
        synchronized (this.field9146) {
            this.field9146.method315(1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public final void method3625(boolean arg0, int arg1) {
        field9143++;
        if (this.field9128 == arg0) {
            return;
        }
        this.field9128 = arg0;
        if (arg1 <= 126) {
            this.method3625(true, 27);
        }
        this.method3624(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZIIIII)V")
    public static final void method3626(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class521.method2908(arg8, arg6, arg5, arg4, 0, arg2, arg1, arg7, arg0, -2);
        if (arg3) {
            field9129++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)V")
    public final void method3627(int arg0, byte arg1) {
        this.field9147 = arg0;
        field9134++;
        class58 var3 = this.field9145;
        synchronized (this.field9145) {
            if (arg1 != -40) {
                this.field9128 = true;
            }
            this.field9145.method315(1);
        }
        class58 var4 = this.field9146;
        synchronized (this.field9146) {
            this.field9146.method315(1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public final void method3628(boolean arg0) {
        field9133++;
        class58 var2 = this.field9145;
        synchronized (this.field9145) {
            this.field9145.method315(1);
        }
        class58 var3 = this.field9146;
        synchronized (this.field9146) {
            if (arg0) {
                field9127 = 77;
            }
            this.field9146.method315(1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZLna;IIBI)V")
    public static final void method3629(int arg0, boolean arg1, class320 arg2, int arg3, int arg4, byte arg5, int arg6) {
        field9130++;
        if (class369.field5138 >= 50 || arg2 == null || arg2.field4418 == null || arg3 >= arg2.field4418.length || arg2.field4418[arg3] == null || arg5 > -102) {
            return;
        }
        int var7 = arg2.field4418[arg3][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg2.field4418[arg3].length > 1) {
            int var11 = (int) (Math.random() * (double) arg2.field4418[arg3].length);
            if (var11 > 0) {
                var8 = arg2.field4418[arg3][var11];
            }
        }
        if (var10 == 0) {
            if (arg1) {
                class590.method3406(var9, 255, 0, var8, (byte) 103);
            }
        } else if (class501.field6954.field7838 != 0) {
            int var12 = arg6 - 256 >> 9;
            int var13 = arg0 - 256 >> 9;
            class172.field2225[class369.field5138++] = new class201((byte) 1, var8, var9, 0, 255, (arg4 << 24) + (var13 << 8) + (var12 << 16) + var10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldg;B)V")
    public static final void method3630(class20 arg0, byte arg1) {
        field9132++;
        class72 var2 = (class72) class304.field3930.method3476((long) arg0.field366, (byte) 28);
        if (arg1 != -38 || var2 == null) {
            return;
        }
        if (var2.field993 != null) {
            class92.field1224.method250(var2.field993);
            var2.field993 = null;
        }
        var2.method589(-8880);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lg;IZLkr;Lkr;)V")
    public class627(class513 arg0, int arg1, boolean arg2, class329 arg3, class329 arg4) {
        this.field9126 = arg4;
        this.field9141 = arg3;
        this.field9140 = arg0;
        this.field9128 = arg2;
        if (this.field9141 != null) {
            int var6 = this.field9141.method2046((byte) 64) - 1;
            this.field9141.method2064(0, var6);
        }
    }
}

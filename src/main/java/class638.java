import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class638 {

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "Lmf;")
    private class382 field9016 = new class382(64);

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Lpu;")
    private class522 field9013;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public static int[] field9008 = new int[1000];

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[BII[BII)V", line = 3)
    public static final void method3547(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field9012++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg7;
        int var12 = -122 % ((arg8 - 5) / 41);
        while (var11 < 0) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg4++;
                arg6[var10001] += arg3[arg0++];
                int var15 = arg4++;
                arg6[var15] += arg3[arg0++];
                int var16 = arg4++;
                arg6[var16] += arg3[arg0++];
                int var17 = arg4++;
                arg6[var17] += arg3[arg0++];
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg4++;
                arg6[var10001] += arg3[arg0++];
            }
            arg4 += arg2;
            arg0 += arg5;
            var11++;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 49)
    public static void method3548(int arg0) {
        field9008 = null;
        if (arg0 != 26085) {
            field9008 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V", line = 61)
    public final void method3549(int arg0, int arg1) {
        class382 var3 = this.field9016;
        synchronized (this.field9016) {
            if (arg1 != 1000) {
                return;
            }
            this.field9016.method2290(false, arg0);
        }
        field9009++;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V", line = 74)
    public final void method3550(int arg0) {
        field9015++;
        class382 var2 = this.field9016;
        synchronized (this.field9016) {
            this.field9016.method2279(0);
        }
        if (arg0 <= 89) {
            this.field9013 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V", line = 89)
    public final void method3551(int arg0) {
        class382 var2 = this.field9016;
        synchronized (this.field9016) {
            if (arg0 >= -120) {
                this.field9016 = null;
            }
            this.field9016.method2285((byte) -98);
        }
        field9007++;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Lgga;", line = 110)
    public final class262 method3552(int arg0, int arg1) {
        field9010++;
        class382 var3 = this.field9016;
        class262 var4;
        synchronized (this.field9016) {
            var4 = (class262) this.field9016.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field9013;
        byte[] var6;
        synchronized (this.field9013) {
            var6 = this.field9013.method3007(11, arg0, 5);
        }
        if (arg1 >= -1) {
            return null;
        }
        class262 var7 = new class262();
        if (var6 != null) {
            var7.method1722(false, new class695(var6));
        }
        class382 var8 = this.field9016;
        synchronized (this.field9016) {
            this.field9016.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z", line = 140)
    public static final boolean method3553(int arg0) {
        field9011++;
        try {
            class66 var1 = new class66();
            byte[] var2 = var1.method673(arg0 ^ 0x3C, class151.field2184);
            if (arg0 != 11) {
                method3548(-27);
            }
            class637.method3545(var2, false);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 167)
    public class638(class693 arg0, int arg1, class522 arg2) {
        this.field9013 = arg2;
        if (this.field9013 != null) {
            this.field9013.method2988(-96, 11);
        }
    }
}

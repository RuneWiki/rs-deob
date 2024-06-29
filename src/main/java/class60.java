import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class60 {

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lfa;")
    private class156 field693 = new class156(64);

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lfs;")
    public class387 field690;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lfs;")
    private class387 field686;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "Lbg;")
    public static class324 field694 = new class324(54, -2);

    @OriginalMember(owner = "client!in", name = "k", descriptor = "[[Z")
    public static boolean[][] field696 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "Lal;")
    public static class66 field697;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIBI)V", line = 3)
    public static final void method542(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field691++;
        int var5 = 0;
        if (arg3 < 46) {
            method544((byte) 4);
        }
        int var6 = arg1;
        int var7 = -arg1;
        class531.method3136(arg0 - arg1, -65, arg4, arg0 + arg1, class141.field1996[arg2]);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class141.field1996[arg2 + var6];
                int[] var10 = class141.field1996[arg2 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class531.method3136(var12, 125, arg4, var11, var9);
                class531.method3136(var12, 118, arg4, var11, var10);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class141.field1996[arg2 + var5];
            int[] var16 = class141.field1996[arg2 - var5];
            class531.method3136(var14, -39, arg4, var13, var15);
            class531.method3136(var14, -99, arg4, var13, var16);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 57)
    public final void method543(byte arg0) {
        field687++;
        class156 var2 = this.field693;
        synchronized (this.field693) {
            this.field693.method1105(false);
        }
        if (arg0 > -93) {
            this.field690 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 72)
    public static void method544(byte arg0) {
        int var1 = -113 % ((-arg0 - 53) / 33);
        field696 = null;
        field694 = null;
        field697 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lpd;", line = 86)
    public final class169 method545(int arg0, int arg1) {
        field689++;
        class156 var3 = this.field693;
        class169 var4;
        synchronized (this.field693) {
            var4 = (class169) this.field693.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field686.method2363(arg0, 3, 108);
        class169 var6 = new class169();
        var6.field2390 = this;
        if (var5 != null) {
            var6.method1184(-1, new class65(var5));
        }
        class156 var7 = this.field693;
        synchronized (this.field693) {
            this.field693.method1107(1, (long) arg0, var6);
            if (arg1 != -18653) {
                this.field686 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;)V", line = 125)
    public class60(class446 arg0, int arg1, class387 arg2, class387 arg3) {
        this.field690 = arg3;
        this.field686 = arg2;
        this.field686.method2367(3, 28724);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V", line = 146)
    public final void method546(boolean arg0, int arg1) {
        field692++;
        if (!arg0) {
            this.method546(true, 102);
        }
        class156 var3 = this.field693;
        synchronized (this.field693) {
            this.field693.method1116(arg1, -50);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 164)
    public final void method547(boolean arg0) {
        field688++;
        class156 var2 = this.field693;
        synchronized (this.field693) {
            if (!arg0) {
                this.field693.method1119(87);
            }
        }
    }
}

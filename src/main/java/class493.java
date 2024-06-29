import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class493 {

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lvh;")
    private class328 field6803 = new class328(64);

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Lvh;")
    private class328 field6806 = new class328(100);

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lpj;")
    private class132 field6804;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Lrs;", line = 5)
    public final class597 method2757(int arg0, int arg1) {
        field6801++;
        class328 var3 = this.field6806;
        class597 var4;
        synchronized (this.field6806) {
            if (arg0 != 64) {
                this.field6804 = null;
            }
            var4 = (class597) this.field6806.method1986((byte) -88, (long) arg1);
            if (var4 == null) {
                var4 = new class597(arg1);
                this.field6806.method1985(var4, (long) arg1, (byte) -102);
            }
        }
        synchronized (var4) {
            return var4.method3301(117) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method2758(boolean arg0, int arg1) {
        class669.field9441 = 3;
        class351.field5051 = -1;
        class126.field1759 = 100;
        if (arg0) {
            class648.field9186 = arg1;
            field6796++;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lti;", line = 47)
    public static final class404 method2759(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6729;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 54)
    public final void method2760(int arg0) {
        class328 var2 = this.field6803;
        synchronized (this.field6803) {
            this.field6803.method1987(arg0 ^ 0x796C);
        }
        field6802++;
        if (arg0 != -1) {
            this.field6803 = null;
        }
        class328 var3 = this.field6806;
        synchronized (this.field6806) {
            this.field6806.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V", line = 72)
    public final void method2761(int arg0, int arg1) {
        field6797++;
        class328 var3 = this.field6803;
        synchronized (this.field6803) {
            if (arg0 != 2) {
                return;
            }
            this.field6803.method1989(arg1, (byte) 106);
        }
        class328 var4 = this.field6806;
        synchronized (this.field6806) {
            this.field6806.method1989(arg1, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLpj;)V", line = 90)
    public static final void method2762(byte arg0, class132 arg1) {
        if (arg0 == 58) {
            class267.field3790 = arg1;
            field6799++;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)Lct;", line = 101)
    public final class131 method2763(int arg0, int arg1) {
        field6798++;
        class328 var3 = this.field6803;
        class131 var4;
        synchronized (this.field6803) {
            var4 = (class131) this.field6803.method1986((byte) -101, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field6804;
        byte[] var6;
        synchronized (this.field6804) {
            var6 = this.field6804.method940(class344.method2054((byte) 100, arg0), class169.method1165((byte) -49, arg0), arg1 - 31696);
        }
        class131 var7 = new class131();
        var7.field1808 = this;
        var7.field1790 = arg0;
        if (var6 != null) {
            var7.method910(-1, new class96(var6));
        }
        var7.method914(-116);
        class328 var8 = this.field6803;
        synchronized (this.field6803) {
            if (arg1 != 31696) {
                method2759(18, 22, 13);
            }
            this.field6803.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 137)
    public final void method2764(byte arg0) {
        class328 var2 = this.field6803;
        synchronized (this.field6803) {
            this.field6803.method1997(1);
        }
        field6805++;
        int var3 = 111 % ((arg0 + 14) / 42);
        class328 var4 = this.field6806;
        synchronized (this.field6806) {
            this.field6806.method1997(1);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIIII)V", line = 153)
    public static final void method2765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6800++;
        int var8 = arg1 + arg2;
        int var9 = arg7 - arg1;
        for (int var10 = arg2; var10 < var8; var10++) {
            class548.method3012(arg3, (byte) 23, arg6, arg5, class476.field6655[var10]);
        }
        int var11 = arg3 - arg1;
        int var12 = arg7;
        if (arg4 != -1) {
            return;
        }
        while (var12 > var9) {
            class548.method3012(arg3, (byte) 23, arg6, arg5, class476.field6655[var12]);
            var12--;
        }
        int var13 = arg1 + arg5;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class476.field6655[var14];
            class548.method3012(var13, (byte) 23, arg6, arg5, var15);
            class548.method3012(var11, (byte) 23, arg0, var13, var15);
            class548.method3012(arg3, (byte) 23, arg6, var11, var15);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;Lpj;)V", line = 211)
    public class493(class647 arg0, int arg1, class132 arg2, class132 arg3, class132 arg4) {
        this.field6804 = arg2;
        if (this.field6804 != null) {
            int var6 = this.field6804.method917((byte) -74) - 1;
            this.field6804.method936(var6, -122);
        }
        class18.method96(2, arg4, true, arg3);
    }
}

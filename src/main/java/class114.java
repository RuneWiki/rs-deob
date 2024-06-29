import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class114 {

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Luaa;")
    private class395 field1881 = new class395(128);

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lgp;")
    private class561 field1874;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lpp;")
    public static class464 field1880 = new class464(70, 8);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 7)
    public final void method936(int arg0) {
        class395 var2 = this.field1881;
        synchronized (this.field1881) {
            if (arg0 != 8) {
                return;
            }
            this.field1881.method2404((byte) -51);
        }
        field1878++;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 22)
    public final void method937(int arg0) {
        field1875++;
        class395 var2 = this.field1881;
        synchronized (this.field1881) {
            int var3 = -66 / ((arg0 + 20) / 37);
            this.field1881.method2406(-126);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 37)
    public static void method938(byte arg0) {
        field1880 = null;
        if (arg0 != 93) {
            method938((byte) -108);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[BIIII[B)V", line = 47)
    public static final void method939(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field1879++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & arg5);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg8[var10001] += arg3[arg0++];
                int var14 = arg7++;
                arg8[var14] += arg3[arg0++];
                int var15 = arg7++;
                arg8[var15] += arg3[arg0++];
                int var16 = arg7++;
                arg8[var16] += arg3[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg8[var10001] += arg3[arg0++];
            }
            arg7 += arg1;
            arg0 += arg2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Laf;", line = 88)
    public final class156 method940(int arg0, int arg1) {
        field1876++;
        class395 var3 = this.field1881;
        class156 var4;
        synchronized (this.field1881) {
            var4 = (class156) this.field1881.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field1874;
        byte[] var6;
        synchronized (this.field1874) {
            var6 = this.field1874.method3175(arg1, (byte) -53, 1);
        }
        class156 var7 = new class156();
        if (var6 != null) {
            var7.method1101(255, new class268(var6));
        }
        if (arg0 >= -8) {
            this.field1881 = null;
        }
        class395 var8 = this.field1881;
        synchronized (this.field1881) {
            this.field1881.method2408(var7, (long) arg1, -116);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V", line = 122)
    public final void method941(int arg0, int arg1) {
        class395 var3 = this.field1881;
        synchronized (this.field1881) {
            this.field1881.method2397(arg0, (byte) -109);
        }
        if (arg1 > 44) {
            field1877++;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 141)
    public class114(class584 arg0, int arg1, class561 arg2) {
        this.field1874 = arg2;
        this.field1874.method3164(1, true);
    }
}

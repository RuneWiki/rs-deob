import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class311 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lvi;")
    private class560 field4176 = new class560(64);

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Lpq;")
    private class159 field4183;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Ljj;")
    public static class398 field4178 = new class398(52, 8);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lkl;")
    public static class502 field4180;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII[I[ILsv;)Lap;", line = 6)
    public static final class305 method1867(byte arg0, int arg1, int arg2, int[] arg3, int[] arg4, class312 arg5) {
        if (arg0 != -96) {
            field4178 = null;
        }
        field4177++;
        if (!arg5.method826(class394.field5654, class680.field9664, true)) {
            int[] var6 = new int[arg1 * arg2];
            for (int var7 = 0; var7 < arg2; var7++) {
                int var8 = arg1 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg3[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class305(arg5, arg1, arg2, var6);
        }
        byte[] var10 = new byte[arg1 * arg2];
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = arg1 * var11 + arg4[var11];
            for (int var13 = 0; var13 < arg3[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class305(arg5, arg1, arg2, var10);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lgj;", line = 64)
    public final class334 method1868(int arg0, int arg1) {
        field4175++;
        class560 var3 = this.field4176;
        class334 var4;
        synchronized (this.field4176) {
            var4 = (class334) this.field4176.method3134((long) arg1, -90);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field4183;
        byte[] var6;
        synchronized (this.field4183) {
            var6 = this.field4183.method1087(32, arg1, 1);
        }
        class334 var7 = new class334();
        if (var6 != null) {
            var7.method2135(new class138(var6), -119);
        }
        class560 var8 = this.field4176;
        synchronized (this.field4176) {
            if (arg0 != 15624) {
                method1869(32);
            }
            this.field4176.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 94)
    public static void method1869(int arg0) {
        field4178 = null;
        if (arg0 != -51) {
            method1869(11);
        }
        field4180 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBZILfq;I)V", line = 108)
    public static final void method1870(int arg0, int arg1, byte arg2, boolean arg3, int arg4, class463 arg5, int arg6) {
        field4185++;
        if (class485.field6555 >= 50 || arg5 == null || arg5.field6310 == null || arg0 >= arg5.field6310.length || arg5.field6310[arg0] == null) {
            return;
        }
        int var7 = arg5.field6310[arg0][0];
        int var8 = var7 >> 8;
        if (arg2 != 1) {
            field4178 = null;
        }
        int var9 = (var7 & 0xEE) >> 5;
        int var10 = var7 & 0x1F;
        if (arg5.field6310[arg0].length > 1) {
            int var11 = (int) (Math.random() * (double) arg5.field6310[arg0].length);
            if (var11 > 0) {
                var8 = arg5.field6310[arg0][var11];
            }
        }
        if (var10 == 0) {
            if (arg3) {
                if (!arg5.field6323) {
                    class411.method2410(true, 255, var8, var9, 0);
                    return;
                }
                class683.method3780(var8, false, 0, false, 255, var9);
            }
        } else if (class72.field935.field6526 != 0) {
            int var12 = arg4 - 256 >> 9;
            int var13 = arg1 - 256 >> 9;
            class658.field9278[class485.field6555++] = new class578((byte) (arg5.field6323 ? 2 : 1), var8, var9, 0, 255, (var13 << 8) + (arg6 << 24) + (var12 << 16) + var10);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)V", line = 169)
    public final void method1871(int arg0, int arg1) {
        class560 var3 = this.field4176;
        synchronized (this.field4176) {
            if (arg1 > -122) {
                this.method1873(-109);
            }
            this.field4176.method3129(arg0, 14583);
        }
        field4181++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 182)
    public static final void method1872(int arg0) {
        field4184++;
        class642.method3571();
        if (arg0 != 18294) {
            method1867((byte) 120, -17, 62, null, null, null);
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V", line = 194)
    public final void method1873(int arg0) {
        int var2 = -85 / ((arg0 + 1) / 54);
        class560 var3 = this.field4176;
        synchronized (this.field4176) {
            this.field4176.method3142(false);
        }
        field4182++;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 215)
    public final void method1874(int arg0) {
        field4179++;
        class560 var2 = this.field4176;
        synchronized (this.field4176) {
            if (arg0 != 2452) {
                this.method1873(-30);
            }
            this.field4176.method3144(true);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 230)
    public class311(class484 arg0, int arg1, class159 arg2) {
        this.field4183 = arg2;
        this.field4183.method1076(32, 0);
    }
}

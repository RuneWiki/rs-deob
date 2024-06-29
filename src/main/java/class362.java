import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class362 {

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field4516 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[Loq;")
    public class379[] field4514;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "J")
    public static long field4510 = 0L;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "J")
    private long field4500;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Loq;")
    private class379 field4505;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Loq;")
    private class379 field4515;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Laaa;")
    public static class644 field4504;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Loq;", line = 6)
    public final class379 method2111(byte arg0) {
        field4508++;
        if (this.field4516 > 0 && this.field4514[this.field4516 - 1] != this.field4515) {
            class379 var2 = this.field4515;
            this.field4515 = var2.field4806;
            return var2;
        }
        while (this.field4502 > this.field4516) {
            class379 var4 = this.field4514[this.field4516++].field4806;
            if (this.field4514[this.field4516 - 1] != var4) {
                this.field4515 = var4.field4806;
                return var4;
            }
        }
        int var3 = -2 / ((arg0 + 60) / 45);
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Loq;BJ)V", line = 44)
    public final void method2112(class379 arg0, byte arg1, long arg2) {
        if (arg0.field4808 != null) {
            arg0.method2219(13630);
        }
        field4499++;
        if (arg1 != 6) {
            this.field4515 = null;
        }
        class379 var5 = this.field4514[(int) (arg2 & (long) (this.field4502 - 1))];
        arg0.field4806 = var5;
        arg0.field4808 = var5.field4808;
        arg0.field4808.field4806 = arg0;
        arg0.field4806.field4808 = arg0;
        arg0.field4809 = arg2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Loq;I)I", line = 64)
    public final int method2113(class379[] arg0, int arg1) {
        field4512++;
        if (arg1 > -58) {
            this.method2112(null, (byte) -12, -93L);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4502; var4++) {
            class379 var5 = this.field4514[var4];
            for (class379 var6 = var5.field4806; var6 != var5; var6 = var6.field4806) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 104)
    public static void method2114(int arg0) {
        if (arg0 != 0) {
            field4504 = null;
        }
        field4504 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 116)
    public final void method2115(int arg0) {
        field4501++;
        for (int var2 = arg0; var2 < this.field4502; var2++) {
            class379 var3 = this.field4514[var2];
            while (true) {
                class379 var4 = var3.field4806;
                if (var3 == var4) {
                    break;
                }
                var4.method2219(13630);
            }
        }
        this.field4505 = null;
        this.field4515 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBIILbt;Lqq;Z)V", line = 146)
    public static final void method2116(int arg0, byte arg1, int arg2, int arg3, class48 arg4, class502 arg5, boolean arg6) {
        field4509++;
        int var7 = 51 % ((arg1 + 61) / 51);
        class227.method1391(arg4, arg3, (byte) -92, arg0, arg6, arg2);
        class300.field3598 = arg5;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I", line = 157)
    public final int method2117(boolean arg0) {
        field4513++;
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            return -117;
        }
        while (this.field4502 > var3) {
            class379 var4 = this.field4514[var3];
            class379 var5 = var4.field4806;
            while (var4 != var5) {
                var5 = var5.field4806;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Loq;", line = 189)
    public final class379 method2118(int arg0) {
        field4506++;
        if (this.field4505 == null) {
            return null;
        }
        class379 var2 = this.field4514[(int) ((long) (this.field4502 - 1) & this.field4500)];
        while (this.field4505 != var2) {
            if (this.field4505.field4809 == this.field4500) {
                class379 var3 = this.field4505;
                this.field4505 = this.field4505.field4806;
                return var3;
            }
            this.field4505 = this.field4505.field4806;
        }
        if (arg0 != 0) {
            this.method2112(null, (byte) -127, -92L);
        }
        this.field4505 = null;
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 220)
    public class362(int arg0) {
        this.field4502 = arg0;
        this.field4514 = new class379[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class379 var3 = this.field4514[var2] = new class379();
            var3.field4806 = var3;
            var3.field4808 = var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Loq;", line = 242)
    public final class379 method2119(int arg0) {
        this.field4516 = 0;
        if (arg0 >= -34) {
            this.method2112(null, (byte) -30, -105L);
        }
        field4503++;
        return this.method2111((byte) 85);
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)I", line = 256)
    public final int method2120(int arg0) {
        if (arg0 != 0) {
            this.field4502 = 115;
        }
        field4507++;
        return this.field4502;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Loq;", line = 267)
    public final class379 method2121(int arg0, long arg1) {
        field4511++;
        this.field4500 = arg1;
        if (arg0 <= 50) {
            this.method2111((byte) -112);
        }
        class379 var4 = this.field4514[(int) (arg1 & (long) (this.field4502 - 1))];
        for (this.field4505 = var4.field4806; this.field4505 != var4; this.field4505 = this.field4505.field4806) {
            if (this.field4505.field4809 == arg1) {
                class379 var5 = this.field4505;
                this.field4505 = this.field4505.field4806;
                return var5;
            }
        }
        this.field4505 = null;
        return null;
    }
}

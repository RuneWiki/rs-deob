import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class331 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    private int field4284 = 0;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    private int field4285 = 0;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    private int field4290 = 0;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "Lnv;")
    private class417 field4292;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "Lpr;")
    private class445 field4288;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "[Ljca;")
    private class682[] field4287;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Ldm;")
    public class50 field4289;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Lsc;")
    public static class347 field4291 = new class347();

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "Ldh;")
    public static class320 field4300 = new class320(101, 16);

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "J")
    public static volatile long field4301 = 0L;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "[I")
    public static int[] field4299;

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lnv;)V", line = 189)
    public class331(class417 arg0) {
        this.field4292 = arg0;
        this.field4288 = new class445(arg0);
        this.field4287 = new class682[10];
        this.field4287[1] = new class683(arg0);
        this.field4287[2] = new class681(arg0, this.field4288);
        this.field4287[4] = new class707(arg0, this.field4288);
        this.field4287[5] = new class594(arg0, this.field4288);
        this.field4287[6] = new class508(arg0);
        this.field4287[7] = new class708(arg0);
        this.field4287[3] = this.field4289 = new class50(arg0);
        this.field4287[8] = new class323(arg0, this.field4288);
        this.field4287[9] = new class600(arg0, this.field4288);
        if (!this.field4287[8].method286(true)) {
            this.field4287[8] = this.field4287[4];
        }
        if (!this.field4287[9].method286(true)) {
            this.field4287[9] = this.field4287[8];
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1979(boolean arg0, int arg1) {
        if (!arg0) {
            field4296++;
            if (class650.method3697(0, arg1)) {
                class663.method3770(-1, (byte) 125, class643.field9209[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)Z", line = 24)
    public final boolean method1980(int arg0, int arg1) {
        field4294++;
        if (arg1 >= -83) {
            this.field4292 = null;
        }
        return this.field4287[arg0].method286(true);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 39)
    public static final void method1981(String arg0, byte arg1) {
        field4293++;
        class249 var2 = class187.method1149((byte) -126);
        var2.field3016.method1460(class360.field4620.field3126, 24710);
        var2.field3016.method1446(0, true);
        int var3 = var2.field3016.field2903;
        var2.field3016.method1446(632, true);
        int[] var4 = class224.method1305((byte) -122, var2);
        int var5 = var2.field3016.field2903;
        var2.field3016.method1480(arg0, false);
        var2.field3016.method1460(class489.field6978, 24710);
        var2.field3016.field2903 += 7;
        var2.field3016.method1457(var5, var4, (byte) -58, var2.field3016.field2903);
        var2.field3016.method1431(var2.field3016.field2903 - var3, -127);
        class510.method3017(var2, 70);
        class77.field812 = -3;
        class71.field746 = 1;
        class438.field6368 = 0;
        if (arg1 <= 51) {
            method1979(true, 56);
        }
        class183.field2158 = 0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 72)
    public static void method1982(int arg0) {
        field4300 = null;
        if (arg0 == 0) {
            field4299 = null;
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLtha;)Z", line = 84)
    public final boolean method1983(int arg0, boolean arg1, class292 arg2) {
        if (arg1) {
            return true;
        }
        field4295++;
        if (this.field4284 == 0) {
            return false;
        } else {
            this.field4287[Integer.MAX_VALUE & this.field4284].method292(arg2, arg0, -16997);
            return true;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZII)I", line = 103)
    public static final int method1984(boolean arg0, int arg1, int arg2) {
        field4286++;
        if (!arg0) {
            field4299 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZIIZIB)V", line = 127)
    public final void method1985(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        if (arg5 != -75) {
            this.method1985(false, 107, -16, false, -53, (byte) 26);
        }
        boolean var7 = arg3 & this.field4292.method394();
        field4298++;
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg2 = arg4;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field4284 != arg1) {
            if (this.field4284 != 0) {
                this.field4287[Integer.MAX_VALUE & this.field4284].method288(0);
            }
            if (arg1 != 0) {
                this.field4287[Integer.MAX_VALUE & arg1].method285((byte) 52, arg0);
                this.field4287[Integer.MAX_VALUE & arg1].method287(116, arg0);
                this.field4287[Integer.MAX_VALUE & arg1].method289(arg4, (byte) 85, arg2);
            }
            this.field4285 = arg2;
            this.field4290 = arg4;
            this.field4284 = arg1;
        } else if (this.field4284 != 0) {
            this.field4287[Integer.MAX_VALUE & this.field4284].method287(124, arg0);
            if (this.field4290 != arg4 || this.field4285 != arg2) {
                this.field4287[Integer.MAX_VALUE & this.field4284].method289(arg4, (byte) 96, arg2);
                this.field4285 = arg2;
                this.field4290 = arg4;
            }
            return;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class358 {

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Ljv;")
    private class55 field5440 = new class55(128);

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Lbu;")
    private class17 field5439;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field5442 = 0;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "[I")
    public static int[] field5445 = new int[2048];

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field5443 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Lqj;")
    public static class351 field5447;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 8)
    public final void method2255(int arg0) {
        field5437++;
        class55 var2 = this.field5440;
        synchronized (this.field5440) {
            this.field5440.method484(arg0 ^ 0x63DF);
            if (arg0 != 25472) {
                this.method2260((byte) -44, 43);
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V", line = 25)
    public static void method2256(int arg0) {
        field5445 = null;
        if (arg0 >= -124) {
            method2256(-1);
        }
        field5447 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)I", line = 36)
    public static final int method2257(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field5448++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else if (arg0 == 1023) {
            return arg2;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V", line = 59)
    public final void method2258(int arg0) {
        class55 var2 = this.field5440;
        synchronized (this.field5440) {
            this.field5440.method488(-3);
            if (arg0 < 69) {
                this.method2260((byte) 64, -5);
            }
        }
        field5441++;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 93)
    public class358(class239 arg0, int arg1, class17 arg2) {
        this.field5439 = arg2;
        this.field5439.method119(29630, 1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V", line = 80)
    public final void method2259(int arg0, int arg1) {
        field5438++;
        if (arg0 != 1) {
            this.method2258(37);
        }
        class55 var3 = this.field5440;
        synchronized (this.field5440) {
            this.field5440.method493(false, arg1);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)Lsf;", line = 118)
    public final class361 method2260(byte arg0, int arg1) {
        field5444++;
        class55 var3 = this.field5440;
        class361 var4;
        synchronized (this.field5440) {
            var4 = (class361) this.field5440.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 90) {
            byte[] var5 = this.field5439.method114(arg1, 1, 124);
            class361 var6 = new class361();
            if (var5 != null) {
                var6.method2269(new class145(var5), -124);
            }
            class55 var7 = this.field5440;
            synchronized (this.field5440) {
                this.field5440.method485((long) arg1, (byte) -125, var6);
                return var6;
            }
        } else {
            return null;
        }
    }
}

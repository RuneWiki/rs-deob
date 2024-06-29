import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class745 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lpl;")
    private class616 field10425 = new class616(256);

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lpl;")
    private class616 field10433 = new class616(256);

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Lla;")
    private class422 field10429;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lla;")
    private class422 field10426;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIII)Lso;", line = 7)
    private final class538 method4163(int[] arg0, int arg1, int arg2, int arg3) {
        field10432++;
        int var5 = arg3 ^ ((arg1 & 0x90000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class538 var9 = (class538) this.field10433.method3512(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg2 > -91) {
                this.field10426 = null;
            }
            class667 var10 = class667.method3738(this.field10426, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class538 var11 = var10.method3737();
            this.field10433.method3516(255, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field7695.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 47)
    public static final void method4164(int arg0) {
        field10428++;
        class683.field9659++;
        if (arg0 >= 17) {
            class540 var1 = class257.method1732(true, class582.field8232, class655.field9332);
            var1.field7707.method1926(0, 65280);
            class756.method4211(var1, 120);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Lraa;", line = 63)
    public static final class353 method4165(int arg0, int arg1, int arg2) {
        int var3 = -100 % ((-arg0 - 24) / 63);
        field10430++;
        class353 var4 = class65.method638(arg1, 1668949296);
        if (arg2 == -1) {
            return var4;
        } else if (var4 == null || var4.field5335 == null || var4.field5335.length <= arg2) {
            return null;
        } else {
            return var4.field5335[arg2];
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[I)Lso;", line = 87)
    public final class538 method4166(int arg0, int arg1, int[] arg2) {
        field10427++;
        if (~this.field10429.method2628(21) == arg1) {
            return this.method4168(-127, 0, arg0, arg2);
        } else if (this.field10429.method2615(arg1 ^ 0xFFFFFFFE, arg0) == 1) {
            return this.method4168(arg1 ^ 0x7F, arg0, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI[I)Lso;", line = 111)
    public final class538 method4167(byte arg0, int arg1, int[] arg2) {
        field10431++;
        if (this.field10426.method2628(111) == 1) {
            return this.method4163(arg2, 0, -94, arg1);
        } else if (this.field10426.method2615(arg0 ^ 0x26, arg1) == 1) {
            return this.method4163(arg2, arg1, -128, 0);
        } else if (arg0 == 38) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lla;Lla;)V", line = 180)
    public class745(class422 arg0, class422 arg1) {
        this.field10429 = arg1;
        this.field10426 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[I)Lso;", line = 139)
    private final class538 method4168(int arg0, int arg1, int arg2, int[] arg3) {
        field10424++;
        int var5 = ((arg1 & 0xFFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class538 var9 = (class538) this.field10433.method3512(true, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg0 >= -101) {
            this.method4166(-53, -56, null);
        }
        if (arg3 != null && arg3[0] <= 0) {
            return null;
        }
        class61 var10 = (class61) this.field10425.method3512(true, var7);
        if (var10 == null) {
            var10 = class61.method607(this.field10429, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            this.field10425.method3516(255, var7, var10);
        }
        class538 var11 = var10.method599(arg3);
        if (var11 == null) {
            return null;
        } else {
            var10.method636((byte) 97);
            this.field10433.method3516(255, var7, var11);
            return var11;
        }
    }
}

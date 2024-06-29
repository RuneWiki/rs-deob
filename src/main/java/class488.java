import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class488 {

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lau;")
    private class692 field6934 = new class692(128);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lmv;")
    private class295 field6936;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/lang/Object;")
    public static volatile Object field6929 = null;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[S")
    public static short[] field6928;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 4)
    public final void method2785(int arg0, int arg1) {
        class692 var3 = this.field6934;
        synchronized (this.field6934) {
            if (arg0 != 32) {
                return;
            }
            this.field6934.method3900(arg1, 0);
        }
        field6935++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 17)
    public final void method2786(int arg0) {
        class692 var2 = this.field6934;
        synchronized (this.field6934) {
            if (arg0 != 14778) {
                this.field6936 = null;
            }
            this.field6934.method3890(-1);
        }
        field6933++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 30)
    public static void method2787(byte arg0) {
        field6929 = null;
        if (arg0 != -64) {
            method2788(-44, 37);
        }
        field6928 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)I", line = 44)
    public static final int method2788(int arg0, int arg1) {
        field6927++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg1 == 0 ? 0 : 3;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)Lpt;", line = 104)
    public final class520 method2789(int arg0, int arg1) {
        field6931++;
        class692 var3 = this.field6934;
        class520 var4;
        synchronized (this.field6934) {
            var4 = (class520) this.field6934.method3901((long) arg1, -65);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field6936;
        byte[] var6;
        synchronized (this.field6936) {
            var6 = this.field6936.method1844(1, 31330, arg1);
        }
        int var7 = -115 % ((arg0 - 35) / 51);
        class520 var8 = new class520();
        if (var6 != null) {
            var8.method2935(new class540(var6), -1);
        }
        class692 var9 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method3894(var8, (byte) 60, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 155)
    public class488(class373 arg0, int arg1, class295 arg2) {
        this.field6936 = arg2;
        this.field6936.method1845(1, true);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V", line = 143)
    public final void method2790(byte arg0) {
        field6932++;
        class692 var2 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method3891(13747);
            int var3 = -24 % ((arg0 + 81) / 33);
        }
    }
}

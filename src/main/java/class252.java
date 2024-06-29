import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class class252 {

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "Lhea;")
    public class387 field3884;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Lfg;")
    public static class113 field3879;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "[[B")
    public static byte[][] field3889;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public void method1681(byte arg0) {
        field3883++;
        if (arg0 != -19) {
            this.method791(true, 33);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method1682(int arg0, int arg1, byte arg2, int arg3) {
        field3890++;
        if (arg2 != 7) {
            return true;
        } else if (!class202.field2847) {
            return false;
        } else if (class416.field6031 < 100) {
            return false;
        } else {
            int var4 = class580.field8171[arg0][arg1][arg3];
            if ((-class295.field4328) == var4) {
                return false;
            } else if (class295.field4328 == var4) {
                return true;
            } else if (class499.field7071 == class296.field4340) {
                return false;
            } else {
                int var5 = arg1 << class310.field4593;
                int var6 = arg3 << class310.field4593;
                if (class360.method2199(class296.field4340[arg0].method432(arg1 + 1, false, arg3 + 1), var6 + 1, var5 - -1, class296.field4340[arg0].method432(arg1, false, arg3 + 1), class437.field6392 + var6 - 1, class437.field6392 + -1 + var6, var5 - (1 - class437.field6392), var5 + 1, arg2 ^ 0x76, class296.field4340[arg0].method432(arg1, false, arg3)) && class360.method2199(class296.field4340[arg0].method432(arg1 + 1, false, arg3), var6 + 1, var5 - -class437.field6392 + -1, class296.field4340[arg0].method432(arg1 + 1, false, arg3 + 1), var6 + 1, class437.field6392 + var6 + -1, var5 + class437.field6392 - 1, var5 + 1, arg2 + 91, class296.field4340[arg0].method432(arg1, false, arg3))) {
                    class56.field1093++;
                    class580.field8171[arg0][arg1][arg3] = class295.field4328;
                    return true;
                } else {
                    class580.field8171[arg0][arg1][arg3] = -class295.field4328;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
    public abstract void method788(boolean arg0);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        if (arg0 > -61) {
            method1683((byte) -22);
        }
        field3889 = null;
        field3879 = null;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(B)V")
    public void method1684(byte arg0) {
        if (arg0 != 65) {
            this.method1684((byte) 24);
        }
        field3886++;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
    public abstract void method794(boolean arg0, int arg1);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public void method1685(int arg0) {
        field3891++;
        if (arg0 != 14199) {
            this.method791(true, -62);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lbb;II)V")
    public abstract void method790(class301 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        int var1 = 0;
        int var2 = -1 / ((arg0 - 38) / 58);
        while (class672.field9500.length > var1) {
            for (int var3 = 0; var3 < class672.field9500[0].length; var3++) {
                for (int var4 = 0; var4 < class672.field9500[0][0].length; var4++) {
                    class672.field9500[var1][var3][var4] = 0;
                }
            }
            var1++;
        }
        field3882++;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BI)Lwb;")
    public static final class298 method1687(byte arg0, int arg1) {
        if (arg0 > -101) {
            field3889 = null;
        }
        field3885++;
        class298 var2 = (class298) class546.field7683.method2287(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class535.field7511.method3007(0, arg1, 5);
        class298 var4 = new class298();
        if (var3 != null) {
            var4.method1923(arg1, 13, new class695(var3));
        }
        class546.field7683.method2291(var4, (long) arg1, 1);
        return var4;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhea;)V")
    public class252(class387 arg0) {
        this.field3884 = arg0;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
    public static final void method1688(int arg0) {
        field3878++;
        class383.field5413 = new class279(class274.field4120.method1804(7175, class512.field7203), "", class190.field2750, 1002, -1, 0L, 0, 0, true, false);
        if (arg0 < 121) {
            field3880 = -5;
        }
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)V")
    public void method1689(int arg0) {
        if (arg0 == 1) {
            field3887++;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(ZI)V")
    public abstract void method791(boolean arg0, int arg1);

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "(I)Z")
    public abstract boolean method792(int arg0);

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
    public void method1690(int arg0) {
        if (arg0 != -1) {
            this.method796(-14, 81, 23);
        }
        field3881++;
    }

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "(I)V")
    public void method1691(int arg0) {
        if (arg0 == 0) {
            field3888++;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
    public abstract void method796(int arg0, int arg1, int arg2);
}

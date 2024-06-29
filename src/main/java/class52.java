import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 {

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Ltn;")
    private class109 field668 = new class109(256);

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Ltn;")
    private class109 field672 = new class109(256);

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Lij;")
    private class316 field662;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "Lij;")
    private class316 field670;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "Lok;")
    public static class61 field669;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[I)Ldg;")
    public final class224 method418(int arg0, int arg1, int[] arg2) {
        field666++;
        if (this.field662.method1933(0) == 1) {
            return this.method420(arg1, 0, arg2, 65531);
        } else if (this.field662.method1934((byte) 28, arg1) == 1) {
            return this.method420(0, arg1, arg2, 65531);
        } else {
            if (arg0 < 46) {
                this.method420(68, 68, (int[]) null, 94);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II[I)Ldg;")
    public final class224 method419(int arg0, int arg1, int[] arg2) {
        field663++;
        int var4 = -109 % ((14 - arg0) / 60);
        if (this.field670.method1933(0) == 1) {
            return this.method425(true, arg2, arg1, 0);
        } else if (this.field670.method1934((byte) 28, arg1) == 1) {
            return this.method425(true, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[II)Ldg;")
    private final class224 method420(int arg0, int arg1, int[] arg2, int arg3) {
        field665++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFB);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class224 var9 = (class224) this.field672.method837((byte) -72, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg3 != 65531) {
                this.field672 = null;
            }
            class168 var10 = (class168) this.field668.method837((byte) -72, var7);
            if (var10 == null) {
                var10 = class168.method1197(this.field662, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field668.method835(4, var10, var7);
            }
            class224 var11 = var10.method1199(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1884(false);
                this.field672.method835(4, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method421(int arg0) {
        field669 = null;
        if (arg0 != 0) {
            field671 = 47;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Laj;")
    public static final class71 method422(int arg0, int arg1) {
        field661++;
        class71 var2 = (class71) class279.field3801.method2529(arg1 - 7513, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 7513) {
            byte[] var3 = class43.field574.method1926(0, arg0, 4);
            class71 var4 = new class71();
            if (var3 != null) {
                var4.method564(arg0, (byte) -71, new class366(var3));
            }
            var4.method561(arg0, 123);
            class279.field3801.method2527(-86, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V")
    public static final void method423(int arg0, int arg1) {
        class353.field4750.method2531(arg0, 112);
        field667++;
        if (arg1 <= 81) {
            method422(-91, 74);
        }
        class39.field519.method2531(arg0, 112);
        class296.field4067.method2531(arg0, 112);
        class372.field5158.method2531(arg0, 112);
        class221.field3106.method2531(arg0, 112);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBI)V")
    public static final void method424(int arg0, byte arg1, int arg2) {
        field664++;
        class26 var3 = class217.method1445(true, arg0, 16);
        if (arg1 != -94) {
            method422(46, -96);
        }
        var3.method158(arg1 + 28288);
        var3.field341 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z[III)Ldg;")
    private final class224 method425(boolean arg0, int[] arg1, int arg2, int arg3) {
        field660++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0x50000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        if (!arg0) {
            this.field670 = null;
        }
        class224 var9 = (class224) this.field672.method837((byte) -72, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class201 var10 = class201.method1384(this.field670, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class224 var11 = var10.method1383();
            this.field672.method835(4, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field3115.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lij;Lij;)V")
    public class52(class316 arg0, class316 arg1) {
        this.field662 = arg1;
        this.field670 = arg0;
    }
}

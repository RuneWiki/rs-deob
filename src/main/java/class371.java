import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class371 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lqj;")
    private class535 field5404 = new class535(16);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Luq;")
    private class172 field5406;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 3)
    public final void method2327(byte arg0) {
        int var2 = 16 / ((arg0 - 37) / 37);
        class535 var3 = this.field5404;
        synchronized (this.field5404) {
            this.field5404.method3103(-11294);
        }
        field5407++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 15)
    public final void method2328(int arg0) {
        if (arg0 != -1) {
            this.field5406 = null;
        }
        class535 var2 = this.field5404;
        synchronized (this.field5404) {
            this.field5404.method3113(-128);
        }
        field5414++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lmh;", line = 33)
    public final class656 method2329(int arg0, int arg1) {
        field5412++;
        class535 var3 = this.field5404;
        class656 var4;
        synchronized (this.field5404) {
            var4 = (class656) this.field5404.method3109((byte) 127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 >= -121) {
            this.method2329(118, -77);
        }
        class172 var5 = this.field5406;
        byte[] var6;
        synchronized (this.field5406) {
            var6 = this.field5406.method1188(30, -18047, arg0);
        }
        class656 var7 = new class656();
        if (var6 != null) {
            var7.method3646((byte) 122, new class254(var6));
        }
        class535 var8 = this.field5404;
        synchronized (this.field5404) {
            this.field5404.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZ)Lhia;", line = 72)
    public static final class73 method2330(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5413++;
        class73 var5 = new class73();
        var5.field993 = arg2;
        var5.field985 = arg0;
        class355.field5178.method1247(4070, (long) arg3, var5);
        class305.method1974(arg0, (byte) 66);
        class347 var6 = class445.method2655(arg3, (byte) 110);
        if (var6 != null) {
            class151.method1062((byte) -99, var6);
        }
        if (arg1 >= -34) {
            field5408 = 93;
        }
        if (class186.field2440 != null) {
            class151.method1062((byte) -106, class186.field2440);
            class186.field2440 = null;
        }
        class358.method2273(0);
        if (var6 != null) {
            class104.method799(!arg4, var6, -1);
        }
        if (!arg4) {
            class727.method4007(arg0);
        }
        if (!arg4 && class227.field2935 != -1) {
            class208.method1359(-13540, class227.field2935, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 121)
    public static final void method2331(int arg0) {
        field5409++;
        class737.field10007.method3103(arg0 - 11293);
        if (arg0 != -1) {
            field5408 = 51;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V", line = 132)
    public final void method2332(int arg0, int arg1) {
        class535 var3 = this.field5404;
        synchronized (this.field5404) {
            this.field5404.method3101(false, arg0);
            if (arg1 != -1) {
                field5408 = -110;
            }
        }
        field5410++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZI)I", line = 145)
    public static final int method2333(int arg0, int arg1, boolean arg2, int arg3) {
        field5405++;
        class358 var4 = class559.method3192(arg1, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5213.length; var6++) {
                if (var4.field5210[var6] == arg3) {
                    var5 += var4.field5213[var6];
                }
            }
            if (arg0 >= -104) {
                return -8;
            } else {
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 184)
    public class371(class263 arg0, int arg1, class172 arg2) {
        this.field5406 = arg2;
        this.field5406.method1175(30, (byte) 82);
    }
}

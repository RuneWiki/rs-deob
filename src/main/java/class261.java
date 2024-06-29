import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class261 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lad;")
    private class11 field3307 = new class11(128);

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Ldn;")
    private class201 field3310;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public static int[] field3306 = new int[2];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Lpi;")
    public static class340 field3313 = new class340(107, 6);

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "[Z")
    public static boolean[] field3320 = new boolean[200];

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Lso;")
    public static class198 field3316;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Ldr;")
    public static class291 field3314;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)Lvh;", line = 4)
    public static final class191 method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3311++;
        long var7 = (long) arg3 * 986053L ^ (long) arg0 * 475427L ^ (long) arg1 * 67481L ^ (long) arg5 * 97549L ^ (long) arg2 * 32147369L ^ (long) arg4 * 76724863L;
        if (arg6 != 0) {
            return null;
        }
        class191 var9 = (class191) class169.field2207.method78(var7, (byte) -125);
        if (var9 == null) {
            class191 var10 = class91.field1263.method859(arg1, arg5, arg0, arg3, arg2, arg4);
            class169.field2207.method88(var7, 46, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 24)
    public static void method1634(int arg0) {
        field3306 = null;
        field3316 = null;
        field3313 = null;
        field3320 = null;
        field3314 = null;
        if (arg0 != 11141) {
            method1635(null, 20, -89);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BII)[B", line = 42)
    public static final byte[] method1635(byte[] arg0, int arg1, int arg2) {
        field3309++;
        byte[] var3 = new byte[arg2];
        int var4 = -113 % ((arg1 + 17) / 54);
        class526.method3113(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V", line = 55)
    public final void method1636(byte arg0, int arg1) {
        field3317++;
        class11 var3 = this.field3307;
        synchronized (this.field3307) {
            if (arg0 != 8) {
                field3320 = null;
            }
            this.field3307.method80(-65, arg1);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 71)
    public final void method1637(int arg0) {
        field3318++;
        class11 var2 = this.field3307;
        synchronized (this.field3307) {
            this.field3307.method84(54);
            int var3 = 67 / ((arg0 + 48) / 56);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 90)
    public final void method1638(byte arg0) {
        field3312++;
        class11 var2 = this.field3307;
        synchronized (this.field3307) {
            if (arg0 != -90) {
                field3319 = -97;
            }
            this.field3307.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Luv;", line = 106)
    public final class2 method1639(int arg0, int arg1) {
        field3315++;
        class11 var3 = this.field3307;
        class2 var4;
        synchronized (this.field3307) {
            var4 = (class2) this.field3307.method78((long) arg0, (byte) -108);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3310.method1313((byte) -120, 1, arg0);
        class2 var6 = new class2();
        if (arg1 != 2) {
            field3306 = null;
        }
        if (var5 != null) {
            var6.method9(0, new class88(var5));
        }
        class11 var7 = this.field3307;
        synchronized (this.field3307) {
            this.field3307.method88((long) arg0, 49, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 146)
    public class261(class65 arg0, int arg1, class201 arg2) {
        this.field3310 = arg2;
        this.field3310.method1302(-107, 1);
    }
}

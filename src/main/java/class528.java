import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class528 {

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "Ltb;")
    private class450 field7144 = new class450(16);

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lpl;")
    private class612 field7143;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "[I")
    public static int[] field7138 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Lwp;")
    public static class453 field7146 = new class453(114, -2);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "Lhc;")
    public static class431 field7148;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "[Lf;")
    public static class536[] field7139;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method2867(byte arg0) {
        if (arg0 == 12) {
            field7138 = null;
            field7146 = null;
            field7148 = null;
            field7139 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
    public final void method2868(byte arg0) {
        field7149++;
        class450 var2 = this.field7144;
        synchronized (this.field7144) {
            this.field7144.method2406(18385);
            if (arg0 != -104) {
                method2867((byte) -62);
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lnk;IIIII)Ltw;")
    public final class588 method2869(class415 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7140++;
        class681[] var7 = null;
        class397 var8 = this.method2873(arg5, 29);
        if (arg4 != -29532) {
            return null;
        }
        if (var8.field5006 != null) {
            var7 = new class681[var8.field5006.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class238 var10 = arg0.method2212(var8.field5006[var9], arg4 ^ 0x1864);
                var7[var9] = new class681(var10.field2975, var10.field2974, var10.field2981, var10.field2983, var10.field2977, var10.field2984, var10.field2973, var10.field2978);
            }
        }
        return new class588(var8.field5001, var7, var8.field5002, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V")
    public final void method2870(byte arg0) {
        class450 var2 = this.field7144;
        synchronized (this.field7144) {
            this.field7144.method2412((byte) 8);
            if (arg0 != 13) {
                field7148 = null;
            }
        }
        field7145++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([BBI)I")
    public static final int method2871(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != -95) {
            field7146 = null;
        }
        field7147++;
        return class632.method3538(255, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)V")
    public final void method2872(byte arg0, int arg1) {
        if (arg0 != -54) {
            this.method2873(-124, -111);
        }
        field7137++;
        class450 var3 = this.field7144;
        synchronized (this.field7144) {
            this.field7144.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Ltv;")
    private final class397 method2873(int arg0, int arg1) {
        field7142++;
        class450 var3 = this.field7144;
        class397 var4;
        synchronized (this.field7144) {
            var4 = (class397) this.field7144.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field7143;
        byte[] var6;
        synchronized (this.field7143) {
            var6 = this.field7143.method3365(arg0, -106, arg1);
        }
        class397 var7 = new class397();
        if (var6 != null) {
            var7.method2128(new class630(var6), arg1 ^ 0x1D);
        }
        class450 var8 = this.field7144;
        synchronized (this.field7144) {
            this.field7144.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lrf;ILpl;)V")
    public class528(class112 arg0, int arg1, class612 arg2) {
        this.field7143 = arg2;
        this.field7143.method3349(29, true);
    }
}

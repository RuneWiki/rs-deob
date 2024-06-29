import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class528 {

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Lvi;")
    private class560 field7309 = new class560(64);

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lpq;")
    private class159 field7306;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Z")
    public static boolean field7312 = false;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Ljj;")
    public static class398 field7305 = new class398(73, 6);

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lnn;")
    public static class446 field7313 = new class446(5, 7);

    @OriginalMember(owner = "client!er", name = "m", descriptor = "[[I")
    public static int[][] field7315 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field7314 = 0;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3000(int arg0, byte arg1, int arg2) {
        field7307++;
        return arg1 < 106 ? true : (class123.method759(127, arg0, arg2) | class654.method3621(arg0, 8, arg2) | class500.method2809(arg0, (byte) 11, arg2)) & class110.method586((byte) -41, arg0, arg2);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method3001(byte arg0) {
        field7304++;
        class560 var2 = this.field7309;
        synchronized (this.field7309) {
            if (arg0 < 23) {
                this.field7309 = null;
            }
            this.field7309.method3142(false);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
    public final void method3002(int arg0, byte arg1) {
        class560 var3 = this.field7309;
        synchronized (this.field7309) {
            this.field7309.method3129(arg0, 14583);
            if (arg1 <= 17) {
                method3006(26, -24);
            }
        }
        field7303++;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IB)V")
    public final void method3003(int arg0, byte arg1) {
        field7311++;
        class560 var3 = this.field7309;
        synchronized (this.field7309) {
            this.field7309.method3142(false);
            int var4 = -124 / ((-arg1 - 21) / 53);
            this.field7309 = new class560(arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)Llf;")
    public final class432 method3004(int arg0, boolean arg1) {
        field7310++;
        class560 var3 = this.field7309;
        class432 var4;
        synchronized (this.field7309) {
            var4 = (class432) this.field7309.method3134((long) arg0, -71);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field7306;
        byte[] var6;
        synchronized (this.field7306) {
            var6 = this.field7306.method1087(class503.method2847(-56, arg0), class639.method3478(arg0, 116), 1);
        }
        class432 var7 = new class432();
        if (var6 != null) {
            var7.method2486(new class138(var6), (byte) 111);
        }
        class560 var8 = this.field7309;
        synchronized (this.field7309) {
            this.field7309.method3130((long) arg0, arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static void method3005(int arg0) {
        field7313 = null;
        if (arg0 != 0) {
            field7312 = false;
        }
        field7315 = null;
        field7305 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
    public static final int method3006(int arg0, int arg1) {
        return class298.field3992 == null ? 0 : class298.field3992[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public final void method3007(boolean arg0) {
        field7308++;
        class560 var2 = this.field7309;
        synchronized (this.field7309) {
            this.field7309.method3144(arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class528(class484 arg0, int arg1, class159 arg2) {
        this.field7306 = arg2;
        if (this.field7306 != null) {
            int var4 = this.field7306.method1074((byte) 96) - 1;
            this.field7306.method1076(var4, 0);
        }
    }
}

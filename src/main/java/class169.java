import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class169 {

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "Lfba;")
    private class348 field2393 = new class348(128);

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "Lla;")
    private class423 field2395;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "Ldj;")
    public static class703 field2391 = new class703(1, 2, 2, 0);

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "Lai;")
    public static class204 field2396;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lrd;", line = 8)
    public final class547 method1209(int arg0, int arg1) {
        field2390++;
        class348 var3 = this.field2393;
        class547 var4;
        synchronized (this.field2393) {
            var4 = (class547) this.field2393.method2216(arg1 ^ arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2395.method2600(0, class61.method576(-345785720, arg0), class12.method60((byte) 43, arg0));
        class547 var6 = new class547();
        if (var5 != null) {
            var6.method3294(99, new class479(var5));
        }
        class348 var7 = this.field2393;
        synchronized (this.field2393) {
            this.field2393.method2213((byte) -16, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BI)I", line = 33)
    public static final int method1210(byte arg0, int arg1) {
        field2389++;
        if (arg0 > -83) {
            method1212(-20);
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1211(int arg0) {
        class270.method1763((byte) 116);
        field2394++;
        int var1 = -10 / ((arg0 - 31) / 54);
        class416.field5919 = false;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V", line = 72)
    public static void method1212(int arg0) {
        field2391 = null;
        field2396 = null;
        if (arg0 >= -3) {
            field2391 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method1213(boolean arg0) {
        if (!arg0) {
            field2396 = null;
        }
        field2392++;
        class509.field7378.method2220(!arg0);
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 103)
    public class169(class315 arg0, int arg1, class423 arg2) {
        this.field2395 = arg2;
        if (this.field2395 != null) {
            int var4 = this.field2395.method2623(-1) - 1;
            this.field2395.method2616(var4, 0);
        }
    }
}

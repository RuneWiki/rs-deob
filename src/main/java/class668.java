import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class668 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Llga;")
    private class663 field9383 = new class663(16);

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lsea;")
    private class648 field9387;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "J")
    public static long field9388 = 0L;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field9390 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Ljn;")
    private final class670 method3772(int arg0, int arg1) {
        field9393++;
        class663 var3 = this.field9383;
        class670 var4;
        synchronized (this.field9383) {
            var4 = (class670) this.field9383.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field9387;
        byte[] var6;
        synchronized (this.field9387) {
            var6 = this.field9387.method3654(-15615, arg1, arg0);
        }
        class670 var7 = new class670();
        if (var6 != null) {
            var7.method3784(80, new class501(var6));
        }
        class663 var8 = this.field9383;
        synchronized (this.field9383) {
            this.field9383.method3748((long) arg0, var7, arg1 + 12508);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBIILit;)Lqv;")
    public final class410 method3773(int arg0, int arg1, byte arg2, int arg3, int arg4, class599 arg5) {
        if (arg2 > -3) {
            this.method3775(-55, -104);
        }
        field9385++;
        class110[] var7 = null;
        class670 var8 = this.method3772(arg0, 29);
        if (var8.field9405 != null) {
            var7 = new class110[var8.field9405.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class601 var10 = arg5.method3379(9, var8.field9405[var9]);
                var7[var9] = new class110(var10.field8385, var10.field8386, var10.field8380, var10.field8387, var10.field8378, var10.field8389, var10.field8379, var10.field8381);
            }
        }
        return new class410(var8.field9400, var7, var8.field9401, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLin;)V")
    public static final void method3774(byte arg0, class78 arg1) {
        field9392++;
        if (arg0 != -127) {
            field9390 = -87;
        }
        if (arg1.field1075 == 5 && arg1.field1145 != -1) {
            class477.method2694(class334.field4506, (byte) 124, arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
    public final void method3775(int arg0, int arg1) {
        field9382++;
        class663 var3 = this.field9383;
        synchronized (this.field9383) {
            if (arg0 != -18151) {
                this.field9383 = null;
            }
            this.field9383.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class668(class414 arg0, int arg1, class648 arg2) {
        this.field9387 = arg2;
        this.field9387.method3653(29, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public final void method3776(int arg0) {
        if (arg0 != 0) {
            method3774((byte) 75, null);
        }
        class663 var2 = this.field9383;
        synchronized (this.field9383) {
            this.field9383.method3755(19713);
        }
        field9386++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public final void method3777(int arg0) {
        field9389++;
        class663 var2 = this.field9383;
        synchronized (this.field9383) {
            this.field9383.method3749(7648);
            if (arg0 != -27409) {
                this.method3773(-87, 122, (byte) 3, -87, -94, null);
            }
        }
    }
}

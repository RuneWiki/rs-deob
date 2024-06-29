import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class305 extends class49 {

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
    public int field4425 = 12800;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public int field4433 = -1;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    public int field4432 = 0;

    @OriginalMember(owner = "client!wia", name = "y", descriptor = "I")
    public int field4418 = -1;

    @OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
    public int field4423 = 12800;

    @OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
    public int field4436 = 0;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "Z")
    public boolean field4434 = true;

    @OriginalMember(owner = "client!wia", name = "A", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!wia", name = "S", descriptor = "Ljava/lang/String;")
    public String field4438;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "Ljava/lang/String;")
    public String field4430;

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "Lv;")
    public class165 field4424;

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "[B")
    public static byte[] field4419 = new byte[2048];

    @OriginalMember(owner = "client!wia", name = "C", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!wia", name = "w", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!wia", name = "x", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wia", name = "B", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!wia", name = "G", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!wia", name = "P", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IBI)V")
    public static final void method1982(int arg0, byte arg1, int arg2) {
        if (arg1 == 54) {
            field4417++;
            class17 var3 = class245.method1634(1, (long) arg0 << 32 | (long) arg2, 18);
            var3.method69(13);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I[III)Z")
    public final boolean method1983(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.field4432 = 108;
        }
        field4428++;
        for (class650 var5 = (class650) this.field4424.method1041(arg0 + 1048832); var5 != null; var5 = (class650) this.field4424.method1033(-1)) {
            if (var5.method3720(arg2, arg3, (byte) -93)) {
                var5.method3727(arg1, arg3, (byte) -94, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(IBI)Z")
    public final boolean method1984(int arg0, byte arg1, int arg2) {
        field4421++;
        if (arg1 != -4) {
            this.field4436 = 78;
        }
        for (class650 var4 = (class650) this.field4424.method1041(arg1 ^ 0xFFEFFEFC); var4 != null; var4 = (class650) this.field4424.method1033(arg1 ^ 0x3)) {
            if (var4.method3720(arg2, arg0, (byte) -93)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
    public final void method1985(int arg0) {
        this.field4425 = 12800;
        field4437++;
        this.field4423 = 12800;
        this.field4436 = 0;
        this.field4432 = 0;
        if (arg0 < 21) {
            this.field4425 = -8;
        }
        for (class650 var2 = (class650) this.field4424.method1041(1048832); var2 != null; var2 = (class650) this.field4424.method1033(-1)) {
            if (this.field4423 > var2.field9078) {
                this.field4423 = var2.field9078;
            }
            if (this.field4432 < var2.field9075) {
                this.field4432 = var2.field9075;
            }
            if (this.field4436 < var2.field9076) {
                this.field4436 = var2.field9076;
            }
            if (this.field4425 > var2.field9083) {
                this.field4425 = var2.field9083;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lns;I)V")
    public static final void method1986(class654 arg0, int arg1) {
        field4429++;
        if (arg1 < 117) {
            return;
        }
        if (arg0 instanceof class359) {
            class359 var2 = (class359) arg0;
            if (var2.field5172 != null) {
                class658.method3769(class724.field10031.field3467 != var2.field3467, var2, (byte) -44);
                return;
            }
        } else if ((arg0 instanceof class723)) {
            class723 var3 = (class723) arg0;
            class310.method2003(2048, class724.field10031.field3467 != var3.field3467, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II[III)Z")
    public final boolean method1987(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field4426++;
        if (arg3 != -795484448) {
            return false;
        }
        for (class650 var6 = (class650) this.field4424.method1041(1048832); var6 != null; var6 = (class650) this.field4424.method1033(-1)) {
            if (var6.method3724(arg0, arg4, arg1, 83)) {
                var6.method3727(arg2, arg1, (byte) -127, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
    public static final void method1988(byte arg0) {
        class91.field1066 = 200;
        class687.field9584 = (int) ((double) class741.field10208 * 34.46D);
        field4435++;
        class687.field9584 <<= 0x2;
        if (class111.field1332.method201()) {
            class687.field9584 += 512;
        }
        class35.method287(1, false);
        if (arg0 != -27) {
            field4422 = -27;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)I")
    public static final int method1989(boolean arg0, int arg1) {
        field4416++;
        int var2 = class166.field2118;
        if (var2 == 0) {
            return arg0 ? 0 : class783.field10753;
        } else if (var2 == 1) {
            return class783.field10753;
        } else if (var2 == 2) {
            return 0;
        } else {
            if (arg1 != -5381) {
                field4422 = 39;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4419 = null;
        if (arg0 != -18746) {
            field4419 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(I[III)Z")
    public final boolean method1991(int arg0, int[] arg1, int arg2, int arg3) {
        field4431++;
        for (class650 var5 = (class650) this.field4424.method1041(1048832); var5 != null; var5 = (class650) this.field4424.method1033(-1)) {
            if (var5.method3723(arg3, arg0 + 328, arg2)) {
                var5.method3725(arg1, arg3, arg2, true);
                return true;
            }
        }
        return arg0 == -256 ? false : false;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class305(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4433 = arg4;
        this.field4420 = arg3;
        this.field4427 = arg0;
        this.field4438 = arg1;
        this.field4418 = arg6;
        this.field4434 = arg5;
        this.field4430 = arg2;
        if (this.field4418 == 255) {
            this.field4418 = 0;
        }
        this.field4424 = new class165();
    }
}

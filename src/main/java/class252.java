import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class252 extends class225 {

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public int field3455 = 0;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public int field3450 = 0;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public int field3453 = 12800;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public int field3454 = 12800;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public int field3459 = -1;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public int field3456 = -1;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "Z")
    public boolean field3466 = true;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "Ljava/lang/String;")
    public String field3468;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "Ljava/lang/String;")
    public String field3460;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "Lar;")
    public class47 field3467;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field3464 = 0;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Lqa;")
    public static class242 field3452 = class246.method1486(-18692);

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIB)Z", line = 5)
    public final boolean method1521(int[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -63) {
            method1525(102);
        }
        field3451++;
        for (class376 var5 = (class376) this.field3467.method332(-2130841184); var5 != null; var5 = (class376) this.field3467.method343((byte) -89)) {
            if (var5.method2437(arg1, arg2, 109)) {
                var5.method2438(arg1, (byte) -59, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIBI)Z", line = 30)
    public final boolean method1522(int[] arg0, int arg1, byte arg2, int arg3) {
        field3470++;
        int var5 = -127 % ((33 - arg2) / 37);
        for (class376 var6 = (class376) this.field3467.method332(-2130841184); var6 != null; var6 = (class376) this.field3467.method343((byte) -91)) {
            if (var6.method2435(arg1, arg3, 111)) {
                var6.method2436(arg3, (byte) 73, arg1, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)I", line = 55)
    public static final int method1523(int arg0, int arg1, int arg2, int arg3) {
        field3461++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (arg2 == -27439) {
            return var4 == 2 ? 7 - arg3 : -arg0 + 7;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)Z", line = 78)
    public final boolean method1524(int arg0, int arg1, int arg2) {
        field3469++;
        class376 var4 = (class376) this.field3467.method332(-2130841184);
        int var5 = -128 % ((arg1 - 26) / 57);
        while (var4 != null) {
            if (var4.method2435(arg2, arg0, 120)) {
                return true;
            }
            var4 = (class376) this.field3467.method343((byte) -115);
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 102)
    public static final void method1525(int arg0) {
        class189 var1 = class52.field713;
        synchronized (class52.field713) {
            if (arg0 != 255) {
                method1528(true);
            }
            class52.field713.method1141(arg0 ^ 0x1FF);
        }
        field3458++;
        class189 var2 = class22.field285;
        synchronized (class22.field285) {
            class22.field285.method1141(256);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 228)
    public class252(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3468 = arg2;
        this.field3466 = arg5;
        this.field3462 = arg3;
        this.field3456 = arg4;
        this.field3459 = arg6;
        this.field3463 = arg0;
        this.field3460 = arg1;
        if (this.field3459 == 255) {
            this.field3459 = 0;
        }
        this.field3467 = new class47();
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZI[I)Z", line = 139)
    public final boolean method1526(int arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        field3465++;
        for (class376 var6 = (class376) this.field3467.method332(-2130841184); var6 != null; var6 = (class376) this.field3467.method343((byte) -101)) {
            if (var6.method2439(-1, arg1, arg0, arg3)) {
                var6.method2436(arg0, (byte) 73, arg3, arg4);
                return true;
            }
        }
        if (arg2) {
            field3452 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V", line = 170)
    public final void method1527(int arg0) {
        this.field3450 = 0;
        field3457++;
        this.field3455 = 0;
        this.field3453 = 12800;
        if (arg0 > -47) {
            this.field3459 = -106;
        }
        this.field3454 = 12800;
        for (class376 var2 = (class376) this.field3467.method332(-2130841184); var2 != null; var2 = (class376) this.field3467.method343((byte) -82)) {
            if (var2.field5479 < this.field3453) {
                this.field3453 = var2.field5479;
            }
            if (var2.field5473 < this.field3454) {
                this.field3454 = var2.field5473;
            }
            if (this.field3455 < var2.field5481) {
                this.field3455 = var2.field5481;
            }
            if (var2.field5485 > this.field3450) {
                this.field3450 = var2.field5485;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V", line = 218)
    public static void method1528(boolean arg0) {
        field3452 = null;
        if (arg0) {
            method1525(115);
        }
    }
}

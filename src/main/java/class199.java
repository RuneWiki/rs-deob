import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class199 extends class659 {

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field2573 = 12800;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field2577 = 0;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public int field2582 = 12800;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public int field2579 = -1;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Z")
    public boolean field2590 = true;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public int field2589 = -1;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public int field2591 = 0;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "Ljava/lang/String;")
    public String field2583;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Ljava/lang/String;")
    public String field2578;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lqw;")
    public class84 field2581;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "[[[I")
    public static int[][][] field2587;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method1298(int arg0, int arg1) {
        field2574++;
        class737.field10007.method3101(false, arg1);
        if (arg0 != 12800) {
            method1300(117, -106, 43, -68, -33);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)Z")
    public final boolean method1299(int arg0, int arg1, int arg2, int[] arg3) {
        field2586++;
        class324 var5 = (class324) this.field2581.method679((byte) -86);
        if (arg2 != 8000) {
            return false;
        }
        while (var5 != null) {
            if (var5.method2097(arg1, arg0, (byte) 82)) {
                var5.method2096(1, arg0, arg1, arg3);
                return true;
            }
            var5 = (class324) this.field2581.method681(-75);
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2585++;
        if (class206.field2664 != 1) {
            return;
        }
        int var5 = arg3 / class533.field7397;
        int var6 = arg1 / class533.field7397;
        int var7 = arg0 / class607.field8210;
        int var8 = arg4 / class607.field8210;
        if (class1.field2 <= var5 || var6 < 0 || var7 >= class441.field6352 || var8 < 0) {
            return;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class1.field2 <= var6) {
            var6 = class1.field2 - 1;
        }
        if (arg2 != 8963) {
            return;
        }
        if (var8 >= class441.field6352) {
            var8 = class441.field6352 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class693.method3780(var9 + class279.field4047, class441.field6352, -441893025) * class1.field2;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class693.method3780(class743.field10049 + var11, class1.field2, -441893025);
                class562.field7701[var12] = class600.field8184;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method1301(int arg0) {
        this.field2573 = 12800;
        field2580++;
        this.field2577 = 0;
        this.field2591 = 0;
        this.field2582 = 12800;
        for (class324 var2 = (class324) this.field2581.method679((byte) -86); var2 != null; var2 = (class324) this.field2581.method681(-112)) {
            if (this.field2591 < var2.field4606) {
                this.field2591 = var2.field4606;
            }
            if (var2.field4609 < this.field2573) {
                this.field2573 = var2.field4609;
            }
            if (var2.field4601 < this.field2582) {
                this.field2582 = var2.field4601;
            }
            if (this.field2577 < var2.field4600) {
                this.field2577 = var2.field4600;
            }
        }
        if (arg0 >= -81) {
            this.method1305(-19, null, 100, 53);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
    public static final void method1302(int arg0, boolean arg1, int arg2, int arg3) {
        field2575++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class340.field4756 = arg3;
        class624.field8419 = arg0;
        class177.field2341 = arg1;
        if (arg2 != -48001) {
            field2588 = 55;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static void method1303(byte arg0) {
        field2587 = null;
        if (arg0 >= -23) {
            method1302(-99, true, -24, 37);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
    public final boolean method1304(int arg0, int arg1, byte arg2) {
        field2570++;
        for (class324 var4 = (class324) this.field2581.method679((byte) -86); var4 != null; var4 = (class324) this.field2581.method681(-33)) {
            if (var4.method2097(arg1, arg0, (byte) 106)) {
                return true;
            }
        }
        return arg2 >= -34 ? false : false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[III)Z")
    public final boolean method1305(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            this.method1305(-1, null, -79, -5);
        }
        field2571++;
        for (class324 var5 = (class324) this.field2581.method679((byte) -86); var5 != null; var5 = (class324) this.field2581.method681(arg2 ^ 0x16)) {
            if (var5.method2098((byte) 127, arg3, arg0)) {
                var5.method2094(arg3, -890, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[III)Z")
    public final boolean method1306(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field2584++;
        for (class324 var6 = (class324) this.field2581.method679((byte) -86); var6 != null; var6 = (class324) this.field2581.method681(-33)) {
            if (var6.method2100((byte) 127, arg1, arg0, arg3)) {
                var6.method2096(arg4 ^ 0x1, arg1, arg0, arg2);
                return true;
            }
        }
        if (arg4 != 0) {
            this.method1305(-93, null, 41, -82);
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class199(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2589 = arg4;
        this.field2590 = arg5;
        this.field2576 = arg0;
        this.field2583 = arg1;
        this.field2578 = arg2;
        this.field2569 = arg3;
        this.field2579 = arg6;
        if (this.field2579 == 255) {
            this.field2579 = 0;
        }
        this.field2581 = new class84();
    }
}

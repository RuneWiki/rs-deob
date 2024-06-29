import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class102 extends class271 {

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Lgq;")
    public class354 field1475;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field1474 = -1;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Llt;")
    public static class475 field1470 = new class475("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1470 = null;
        if (arg0 <= 36) {
            method624(null, null, -116, 106, null, (byte) -66, -42, -94);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)Z")
    public static final boolean method622(int arg0, byte arg1, int arg2) {
        if (arg1 != 50) {
            field1471 = -28;
        }
        field1473++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lgq;)V")
    public class102(class354 arg0) {
        this.field1475 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class490.field7240 == 1) {
            class334.field4703[class347.field4994 / 100].method3121(class412.field6198 - 8, class66.field1025 + -8);
        }
        field1472++;
        if (class490.field7240 == 2) {
            class334.field4703[class347.field4994 / 100 + 4].method3121(class412.field6198 - 8, class66.field1025 + -8);
        }
        if (arg3 != -16499) {
            method623(12, -77, -54, -95, 75);
        }
        class414.method2489(3139);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkn;Loq;IILse;BII)V")
    public static final void method624(class519 arg0, class239 arg1, int arg2, int arg3, class167 arg4, byte arg5, int arg6, int arg7) {
        field1476++;
        class404 var8 = new class404();
        var8.field6102 = arg3 << 7;
        var8.field6104 = arg6 << 7;
        var8.field6101 = arg7;
        if (arg0 != null) {
            var8.field6083 = arg0;
            int var10 = arg0.field7648;
            int var11 = arg0.field7614;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg0.field7614;
                var11 = arg0.field7648;
            }
            var8.field6098 = arg0.field7651;
            var8.field6089 = arg0.field7613 << 7;
            var8.field6105 = arg0.field7581;
            var8.field6087 = arg6 + var10 << 7;
            var8.field6097 = arg3 + var11 << 7;
            var8.field6090 = arg0.field7583;
            var8.field6088 = arg0.field7618;
            var8.field6095 = arg0.field7645;
            if (arg0.field7596 != null) {
                var8.field6094 = true;
                var8.method2434(-1);
            }
            if (var8.field6095 != null) {
                var8.field6099 = (int) (Math.random() * (double) (var8.field6088 - var8.field6090)) + var8.field6090;
            }
            class46.field732.method809(var8, false);
        } else if (arg4 != null) {
            var8.field6103 = arg4;
            class342 var9 = arg4.field2472;
            if (var9.field4938 != null) {
                var8.field6094 = true;
                var9 = var9.method2094(arg5 ^ 0xFFFFFF97, class49.field796);
            }
            if (var9 != null) {
                var8.field6097 = var9.field4881 + arg3 << 7;
                var8.field6087 = var9.field4881 + arg6 << 7;
                var8.field6098 = class531.method3135(arg4, 52);
                var8.field6105 = var9.field4939;
                var8.field6089 = var9.field4919 << 7;
            }
            class372.field5674.method809(var8, false);
        } else if (arg1 != null) {
            var8.field6084 = arg1;
            var8.field6087 = arg6 + arg1.method847(-1) << 7;
            var8.field6097 = arg3 + arg1.method847(-1) << 7;
            var8.field6098 = class462.method2782(arg5 + 5405, arg1);
            var8.field6105 = arg1.field3544;
            var8.field6089 = arg1.field3534 << 7;
            class164.field2414.method2606(var8, (long) arg1.field1942, arg5 ^ 0x13);
        }
        if (arg5 != 19) {
            method623(79, -16, 80, 54, 3);
        }
    }
}

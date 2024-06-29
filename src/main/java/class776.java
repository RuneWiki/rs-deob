import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class776 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field10715;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field10717 = 1337;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "F")
    public static float field10711;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field10710;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field10712;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field10718;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Lss;")
    public static class455 field10716;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lkq;I)V", line = 8)
    public static final void method4309(class620 arg0, int arg1) {
        if (arg1 <= 104) {
            field10717 = 8;
        }
        field10718++;
        class620 var2 = class235.method1442(14939, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class705.field9921;
            var4 = class701.field9880;
        } else {
            var3 = var2.field8416;
            var4 = var2.field8506;
        }
        class523.method3139(var4, arg0, -124, var3, false);
        class390.method2283(var4, arg0, 4743, var3);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 38)
    public static void method4310(byte arg0) {
        field10716 = null;
        if (arg0 != -96) {
            field10717 = 127;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)I", line = 48)
    public final int method4311(boolean arg0) {
        if (arg0) {
            this.field10715 = 40;
        }
        field10714++;
        return this.field10715;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 59)
    public class776(String arg0, int arg1) {
        this.field10715 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 77)
    public final String toString() {
        field10713++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[B)Lbo;", line = 85)
    public static final class760 method4312(int arg0, byte[] arg1) {
        field10710++;
        class760 var2 = new class760();
        class403 var3 = new class403(arg1);
        var3.field5262 = var3.field5275.length - 2;
        int var4 = var3.method2390((byte) 62);
        int var5 = var3.field5275.length - var4 - 2 - 16;
        var3.field5262 = var5;
        int var6 = var3.method2381((byte) 81);
        var2.field10506 = var3.method2390((byte) -124);
        var2.field10507 = var3.method2390((byte) 58);
        var2.field10505 = var3.method2390((byte) -100);
        var2.field10509 = var3.method2390((byte) 71);
        var2.field10514 = var3.method2390((byte) -116);
        var2.field10512 = var3.method2390((byte) 67);
        int var7 = var3.method2396((byte) 105);
        int var8 = 74 % ((-arg0 - 18) / 35);
        if (var7 > 0) {
            var2.field10510 = new class362[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                int var10 = var3.method2390((byte) -109);
                class362 var11 = new class362(class783.method4337(var10, (byte) 44));
                var2.field10510[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var3.method2381((byte) 102);
                    int var13 = var3.method2381((byte) 33);
                    var11.method2112(new class365(var13), (byte) 6, (long) var12);
                }
            }
        }
        var3.field5262 = 0;
        var2.field10513 = var3.method2383(7540);
        var2.field10504 = new int[var6];
        int var14 = 0;
        while (var5 > var3.field5262) {
            int var15 = var3.method2390((byte) 101);
            if (var15 == 3) {
                if (var2.field10502 == null) {
                    var2.field10502 = new String[var6];
                }
                var2.field10502[var14] = var3.method2384(-6435).intern();
            } else if (var15 == 54) {
                if (var2.field10508 == null) {
                    var2.field10508 = new long[var6];
                }
                var2.field10508[var14] = var3.method2361(46);
            } else {
                if (var2.field10516 == null) {
                    var2.field10516 = new int[var6];
                }
                if (var15 >= 150 || var15 == 21 || var15 == 38 || var15 == 39) {
                    var2.field10516[var14] = var3.method2396((byte) 35);
                } else {
                    var2.field10516[var14] = var3.method2381((byte) 69);
                }
            }
            var2.field10504[var14++] = var15;
        }
        return var2;
    }
}

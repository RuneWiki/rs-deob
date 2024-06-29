import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class161 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Ljv;")
    private class55 field2485 = new class55(64);

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Ljv;")
    public class55 field2496 = new class55(64);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lbu;")
    public class17 field2488;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lbu;")
    private class17 field2483;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Z")
    public static boolean field2492 = false;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lsp;")
    public static class448 field2487 = class209.method1409((byte) 98);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[B")
    public static byte[] field2495;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field2495 = null;
        field2487 = null;
        if (arg0 != 64) {
            field2495 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public final void method1187(int arg0) {
        field2486++;
        class55 var2 = this.field2485;
        synchronized (this.field2485) {
            this.field2485.method484(78);
        }
        class55 var3 = this.field2496;
        synchronized (this.field2496) {
            if (arg0 != -14518) {
                this.method1189(-27);
            }
            this.field2496.method484(arg0 + 14607);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lcu;I)Lq;")
    public static final class292 method1188(class145 arg0, int arg1) {
        field2489++;
        return arg1 == -25460 ? new class292(arg0.method1122(arg1 + 90740), arg0.method1122(65280), arg0.method1122(arg1 + 90740), arg0.method1122(65280), arg0.method1085(-116), arg0.method1085(-51), arg0.method1063((byte) -113)) : null;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public final void method1189(int arg0) {
        field2482++;
        class55 var2 = this.field2485;
        synchronized (this.field2485) {
            if (arg0 != 34) {
                this.method1187(94);
            }
            this.field2485.method488(arg0 ^ 0xFFFFFFDF);
        }
        class55 var3 = this.field2496;
        synchronized (this.field2496) {
            this.field2496.method488(-3);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public final void method1190(int arg0, int arg1) {
        class55 var3 = this.field2485;
        synchronized (this.field2485) {
            this.field2485.method493(false, arg0);
        }
        field2484++;
        class55 var4 = this.field2496;
        synchronized (this.field2496) {
            this.field2496.method493(false, arg0);
        }
        if (arg1 >= -54) {
            field2494 = -5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)V")
    public final void method1191(int arg0, byte arg1, int arg2) {
        this.field2485 = new class55(arg2);
        field2490++;
        this.field2496 = new class55(arg0);
        if (arg1 != -29) {
            method1188(null, -10);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lth;")
    public final class421 method1192(int arg0, int arg1) {
        field2491++;
        class55 var3 = this.field2485;
        class421 var4;
        synchronized (this.field2485) {
            var4 = (class421) this.field2485.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2483.method114(arg1, arg0, 123);
        class421 var6 = new class421();
        var6.field6288 = this;
        if (var5 != null) {
            var6.method2544(new class145(var5), 19398);
        }
        class55 var7 = this.field2485;
        synchronized (this.field2485) {
            this.field2485.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Loq;ILbu;Lbu;)V")
    public class161(class239 arg0, int arg1, class17 arg2, class17 arg3) {
        this.field2488 = arg3;
        this.field2483 = arg2;
        this.field2483.method119(29630, 34);
    }
}

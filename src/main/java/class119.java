import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class119 extends class252 {

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "Lgr;")
    public static class131 field1482 = new class131(100);

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "[I")
    public static int[] field1486 = new int[100];

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Lam;")
    public static class286 field1490;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "[Llg;")
    public static class20[] field1480;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZII)V")
    public final void method380(boolean arg0, int arg1, int arg2) {
        ++field1481;
        int var4 = this.field1485 * arg2 >> 12;
        int var5 = this.field1476 * arg2 >> 12;
        if (!arg0) {
            this.field1476 = 32;
        }
        int var6 = this.field1483 * arg1 >> 12;
        int var7 = this.field1484 * arg1 >> 12;
        class40.method187(super.field3448, var6, var7, super.field3447, var4, 31083, var5);
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        ++field1491;
        if (arg2 != 0) {
            this.method377(91, -29, 27);
        }
        int var4 = this.field1485 * arg1 >> 12;
        int var5 = this.field1476 * arg1 >> 12;
        int var6 = this.field1483 * arg0 >> 12;
        int var7 = this.field1484 * arg0 >> 12;
        class210.method1141(var4, var7, var5, 1, super.field3450, var6);
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIIII)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1483 = arg1;
        this.field1476 = arg2;
        this.field1484 = arg3;
        this.field1485 = arg0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
    public final void method378(int arg0, int arg1, int arg2) {
        ++field1477;
        int var4 = this.field1485 * arg2 >> 12;
        if (arg0 == 16136) {
            int var5 = this.field1476 * arg2 >> 12;
            int var6 = this.field1483 * arg1 >> 12;
            int var7 = this.field1484 * arg1 >> 12;
            class228.method1243(var7, super.field3448, var4, super.field3450, var6, var5, super.field3447, arg0 + -16219);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static void method643(int arg0) {
        if (arg0 != 22597) {
            field1490 = null;
        }
        field1486 = null;
        field1490 = null;
        field1482 = null;
        field1480 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lam;Lam;Z)V")
    public static final void method644(class286 arg0, class286 arg1, boolean arg2) {
        ++field1478;
        class44.field449 = arg0;
        if (!arg2) {
            method643(-93);
        }
        class161.field2070 = arg1;
    }
}

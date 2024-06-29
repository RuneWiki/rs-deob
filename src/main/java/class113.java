import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class class113 extends class444 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Z")
    public boolean field1578;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "[[B")
    public static byte[][] field1574;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)Z", line = 3)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            this.method166(-23, null, 11, -22, 32, null, false);
        }
        field1569++;
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 15)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 >= -4) {
            this.method166(99, null, -13, -107, -101, null, true);
        }
        field1573++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V", line = 28)
    public final void method175(int arg0) {
        field1571++;
        if (arg0 != 0) {
            this.field1572 = -110;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V", line = 42)
    public static final void method701(int arg0, byte arg1) {
        class253.field3514 = arg0;
        class291.field4259 = -1;
        field1575++;
        if (arg1 != 1) {
            method701(23, (byte) -17);
        }
        class291.field4259 = -1;
        class194.method1311(0);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[BIII)V", line = 65)
    public static final void method702(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1577++;
        if (arg4 >= arg0) {
            return;
        }
        int var6 = arg0 - arg4 >> 2;
        int var7 = arg4 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                if (arg1 != -113) {
                    method703(121);
                }
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 95)
    public static void method703(int arg0) {
        field1574 = null;
        if (arg0 < 111) {
            method702(-71, (byte) 44, null, 4, -8, -72);
        }
    }
}

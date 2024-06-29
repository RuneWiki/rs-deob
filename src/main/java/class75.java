import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 extends class88 {

    @OriginalMember(owner = "client!vg", name = "Lb", descriptor = "I")
    public static int field1236 = -1;

    @OriginalMember(owner = "client!vg", name = "Vb", descriptor = "I")
    public static int field1246 = 1;

    @OriginalMember(owner = "client!vg", name = "Tb", descriptor = "Z")
    public static volatile boolean field1244 = true;

    @OriginalMember(owner = "client!vg", name = "Yb", descriptor = "Ljava/lang/String;")
    public static String field1249 = "purple:";

    @OriginalMember(owner = "client!vg", name = "Xb", descriptor = "Ljava/lang/String;")
    public static String field1248 = null;

    @OriginalMember(owner = "client!vg", name = "ac", descriptor = "Loh;")
    public static class281 field1251 = new class281(64);

    @OriginalMember(owner = "client!vg", name = "bc", descriptor = "Ljava/lang/String;")
    public static String field1252 = "Connecting to update server";

    @OriginalMember(owner = "client!vg", name = "Ib", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!vg", name = "Jb", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!vg", name = "Kb", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!vg", name = "Nb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!vg", name = "Ob", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!vg", name = "Pb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!vg", name = "Rb", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vg", name = "Sb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!vg", name = "Ub", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vg", name = "Wb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vg", name = "Zb", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!vg", name = "Mb", descriptor = "Loc;")
    private class62 field1237;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[I)V")
    public final void method533(int arg0, int[] arg1) {
        ++field1250;
        this.field1237 = new class62(arg1);
        if (arg0 != 104) {
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "(I)V")
    public static final void method534(int arg0) {
        ++class275.field4391;
        ++field1233;
        client.field2435.method536((byte) -104, 99);
        for (class251 var1 = (class251) class127.field2007.method287(-127); var1 != null; var1 = (class251) class127.field2007.method291((byte) -46)) {
            if (~var1.field4045 == -1) {
                class177.method1198(var1, (byte) -122, true);
            }
        }
        if (arg0 == 21812) {
            if (class184.field2847 != null) {
                class82.method591(class184.field2847, false);
                class184.field2847 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "(II)I")
    public final int method535(int arg0, int arg1) {
        ++field1245;
        if (arg1 != 104) {
            return -72;
        } else {
            int var3 = -(this.field1238 & 7) + 8;
            int var4 = this.field1238 >> 3;
            this.field1238 += arg0;
            int var5 = 0;
            while (~var3 > ~arg0) {
                var5 += (super.field1471[var4++] & class261.field4165[var3]) << arg0 - var3;
                arg0 -= var3;
                var3 = 8;
            }
            int var6;
            if (arg0 != var3) {
                var6 = (super.field1471[var4] >> var3 - arg0 & class261.field4165[arg0]) + var5;
            } else {
                var6 = (super.field1471[var4] & class261.field4165[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
    public class75(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(BI)V")
    public final void method536(byte arg0, int arg1) {
        if (arg0 != -104) {
            this.method538(-29);
        }
        super.field1471[super.field1535++] = (byte) (this.field1237.method465(false) + arg1);
        ++field1240;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(Z)V")
    public final void method537(boolean arg0) {
        this.field1238 = super.field1535 * 8;
        ++field1243;
        if (arg0) {
            this.method535(-48, -90);
        }
    }

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (arg0 != 9721) {
            this.method535(110, -107);
        }
        super.field1535 = (this.field1238 + 7) / 8;
        ++field1235;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(BI)I")
    public final int method539(byte arg0, int arg1) {
        if (arg0 != 79) {
            this.method538(-49);
        }
        ++field1234;
        return arg1 * 8 + -this.field1238;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BZII)V")
    public final void method540(byte[] arg0, boolean arg1, int arg2, int arg3) {
        ++field1247;
        if (arg1) {
            for (int var5 = 0; ~var5 > ~arg3; ++var5) {
                arg0[arg2 + var5] = (byte) (super.field1471[super.field1535++] + -this.field1237.method465(false));
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(B)V")
    public static void method541(byte arg0) {
        if (arg0 < 32) {
            method534(-89);
        }
        field1251 = null;
        field1248 = null;
        field1252 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(B)I")
    public final int method542(byte arg0) {
        ++field1242;
        return arg0 >= -7 ? 54 : 255 & super.field1471[super.field1535++] - this.field1237.method465(false);
    }

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "(I)V")
    public static final void method543(int arg0) {
        int var1 = -19 % ((31 - arg0) / 32);
        ++field1241;
        int var2 = 0;
        for (int var3 = 0; var3 < 104; ++var3) {
            for (int var4 = 0; var4 < 104; ++var4) {
                if (class139.method936(var3, var4, var2, 73, class269.field4298, true)) {
                    ++var2;
                }
                if (~var2 <= -513) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "(I)V")
    public static final void method544(int arg0) {
        ++field1239;
        class269.field4300.method1898((byte) -119);
        if (arg0 >= -85) {
            field1244 = false;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class201 extends class202 {

    @OriginalMember(owner = "client!ul", name = "Cb", descriptor = "Lec;")
    public static class25 field3195 = new class25(100);

    @OriginalMember(owner = "client!ul", name = "Db", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ul", name = "Eb", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ul", name = "Fb", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ul", name = "Gb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ul", name = "Hb", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ul", name = "Ib", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ul", name = "Jb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ul", name = "Kb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ul", name = "Lb", descriptor = "I")
    private int field3204;

    @OriginalMember(owner = "client!ul", name = "Mb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ul", name = "Ob", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ul", name = "Nb", descriptor = "Llg;")
    private class14 field3206;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(B)V")
    public static final void method1387(byte arg0) {
        ++field3198;
        if (~class180.field2792 != ~class165.field2600) {
            if (class22.method134(class165.field2600, (byte) 63)) {
                class180.field2792 = class165.field2600;
            }
            if (arg0 != 46) {
                field3195 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "(B)V")
    public static void method1388(byte arg0) {
        if (arg0 <= -89) {
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "(I)V")
    public final void method1389(int arg0) {
        super.field3272 = (this.field3204 + 7) / arg0;
        ++field3205;
    }

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "(B)V")
    public final void method1390(byte arg0) {
        ++field3200;
        if (arg0 != -6) {
            this.method1392((byte) 99);
        }
        this.field3204 = super.field3272 * 8;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(II)V")
    public final void method1391(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1394((byte) -34, -18);
        }
        super.field3234[super.field3272++] = (byte) (arg1 + this.field3206.method93(false));
        ++field3207;
    }

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "(B)I")
    public final int method1392(byte arg0) {
        int var2 = 83 % ((-68 - arg0) / 44);
        ++field3196;
        return 255 & super.field3234[super.field3272++] - this.field3206.method93(false);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ZI)I")
    public static final int method1393(boolean arg0, int arg1) {
        ++field3197;
        class270 var2 = class49.method304(106, arg1);
        if (arg0) {
            method1393(true, 29);
        }
        int var3 = var2.field4427;
        int var4 = var2.field4425;
        int var5 = var2.field4424;
        int var6 = class313.field5047[-var3 + var5];
        return var6 & class209.field3356[var4] >> var3;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(BI)I")
    public final int method1394(byte arg0, int arg1) {
        ++field3202;
        int var3 = this.field3204 >> 3;
        int var4 = -(this.field3204 & 7) + 8;
        this.field3204 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field3234[var3++] & class224.field3570[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0 <= 70) {
            return 42;
        } else {
            int var6;
            if (arg1 == var4) {
                var6 = (super.field3234[var3] & class224.field3570[var4]) + var5;
            } else {
                var6 = (super.field3234[var3] >> var4 - arg1 & class224.field3570[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III[B)V")
    public final void method1395(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field3199;
        if (arg0 > 37) {
            for (int var5 = 0; var5 < arg1; ++var5) {
                arg3[arg2 + var5] = (byte) (super.field3234[super.field3272++] + -this.field3206.method93(false));
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "(II)I")
    public final int method1396(int arg0, int arg1) {
        if (arg1 < 119) {
            this.field3206 = null;
        }
        ++field3203;
        return arg0 * 8 - this.field3204;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([II)V")
    public final void method1397(int[] arg0, int arg1) {
        this.field3206 = new class14(arg0);
        int var3 = 83 / ((arg1 - -45) / 32);
        ++field3201;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
    public class201(int arg0) {
        super(arg0);
    }
}

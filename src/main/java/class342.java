import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class342 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "B")
    private byte field4515;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1983(int arg0, int arg1) {
        field4521++;
        if (arg1 == 2529) {
            class253 var2 = class332.method1911(arg0, (byte) -118, 9);
            var2.method1523((byte) -111);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I", line = 16)
    public final int method1984(int arg0) {
        if (arg0 != 19417) {
            method1983(9, 120);
        }
        field4517++;
        return (this.field4515 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 27)
    public static final void method1985(int arg0) {
        for (int var1 = arg0; var1 < class117.field1677.length; var1++) {
            for (int var2 = 0; var2 < class117.field1677[0].length; var2++) {
                for (int var3 = 0; var3 < class117.field1677[0][0].length; var3++) {
                    class117.field1677[var1][var2][var3] = 0;
                }
            }
        }
        field4526++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIIIII)V", line = 61)
    public static final void method1986(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class394.field5336 = arg3;
        class314.field4119 = arg6;
        class119.field1743 = arg1;
        class208.field2859 = arg2;
        class375.field5092 = arg4;
        class118.field1685 = arg5;
        if (arg0 != -39) {
            method1986((byte) 65, 70, 109, 121, -28, 42, 24);
        }
        field4523++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Lft;", line = 79)
    public static final class4 method1987(int arg0, byte arg1) {
        field4519++;
        if (arg1 > -109) {
            field4520 = -99;
        }
        class4 var2 = (class4) class314.field4118.method1456((long) arg0, 105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class513.field7559.method2708(0, arg0, (byte) 54);
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method23(new class379(var3), arg0, false);
        }
        class314.field4118.method1462(var4, (long) arg0, -100);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I", line = 105)
    public final int method1988(boolean arg0) {
        if (arg0) {
            this.field4524 = -69;
        }
        field4525++;
        return this.field4515 & 0x7;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 135)
    public class342() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lmd;)V", line = 137)
    public class342(class379 arg0) {
        this.field4515 = arg0.method2194(-1);
        this.field4514 = arg0.method2212((byte) 83);
        this.field4518 = arg0.method2232((byte) 126);
        this.field4524 = arg0.method2232((byte) 127);
        this.field4516 = arg0.method2232((byte) 127);
        this.field4513 = arg0.method2232((byte) 124);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class104 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Ljp;")
    private class236 field1523 = new class236(64);

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Ljp;")
    public class236 field1533 = new class236(30);

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Lpc;")
    public class473 field1532;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Lpc;")
    private class473 field1524;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
    public static boolean field1531 = true;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public int field1534;

    static {
        new class304("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 4)
    public final void method723(int arg0) {
        class236 var2 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method1458((byte) 121);
            if (arg0 != 0) {
                this.field1524 = null;
            }
        }
        field1526++;
        class236 var3 = this.field1533;
        synchronized (this.field1533) {
            this.field1533.method1458((byte) 90);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 20)
    public final void method724(int arg0) {
        class236 var2 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method1459(19088);
        }
        if (arg0 != 14238) {
            field1527 = 73;
        }
        field1525++;
        class236 var3 = this.field1533;
        synchronized (this.field1533) {
            this.field1533.method1459(19088);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Lfa;", line = 40)
    public final class155 method725(int arg0, int arg1) {
        field1529++;
        class236 var3 = this.field1523;
        class155 var4;
        synchronized (this.field1523) {
            var4 = (class155) this.field1523.method1456((long) arg1, arg0 ^ 0x3A4D);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1524.method2708(class61.method427(arg1, (byte) -39), class282.method1677(arg1, 5702), (byte) 54);
        class155 var6 = new class155();
        var6.field2252 = arg1;
        var6.field2261 = this;
        if (var5 != null) {
            var6.method1064(new class379(var5), (byte) -101);
        }
        class236 var7 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method1462(var6, (long) arg1, -71);
        }
        if (arg0 != 14896) {
            field1527 = -9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lqa;)V", line = 73)
    public static final void method726(class162 arg0) {
        for (int var1 = class71.field1089; var1 < class508.field7055; var1++) {
            for (int var2 = 0; var2 < class439.field6036; var2++) {
                for (int var3 = 0; var3 < class318.field4170; var3++) {
                    class409 var4 = class497.field6886[var1][var2][var3];
                    if (var4 != null) {
                        class56 var5 = var4.field5627;
                        class56 var6 = var4.field5607;
                        if (var5 != null && var5.method126((byte) 54)) {
                            class114.method788(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method126((byte) 54)) {
                                class114.method788(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method127(1, 0, arg0, var5, 0, 0, false);
                                var6.method125(true);
                            }
                            var5.method125(true);
                        }
                        for (class165 var7 = var4.field5630; var7 != null; var7 = var7.field2400) {
                            class37 var9 = var7.field2402;
                            if (var9 != null && var9.method126((byte) 54)) {
                                class114.method788(arg0, var9, var1, var2, var3, var9.field580 + 1 - var9.field581, var9.field569 - var9.field587 + 1);
                                var9.method125(true);
                            }
                        }
                        class431 var8 = var4.field5618;
                        if (var8 != null && var8.method126((byte) 54)) {
                            class45.method318(arg0, var8, var1, var2, var3);
                            var8.method125(true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V", line = 155)
    public final void method727(int arg0, byte arg1) {
        class236 var3 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method1461(-5, arg0);
        }
        field1528++;
        class236 var4 = this.field1533;
        synchronized (this.field1533) {
            this.field1533.method1461(-5, arg0);
            if (arg1 < 83) {
                field1531 = true;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;)V", line = 206)
    public class104(class234 arg0, int arg1, class473 arg2, class473 arg3) {
        this.field1532 = arg3;
        this.field1524 = arg2;
        int var5 = this.field1524.method2724(0) - 1;
        this.field1524.method2710(var5, (byte) -121);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V", line = 184)
    public final void method728(byte arg0, int arg1) {
        field1530++;
        this.field1534 = arg1;
        class236 var3 = this.field1533;
        synchronized (this.field1533) {
            int var4 = -128 / ((arg0 + 18) / 43);
            this.field1533.method1458((byte) -122);
        }
    }
}

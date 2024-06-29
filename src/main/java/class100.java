import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class100 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lnj;")
    private class162 field1499 = new class162(64);

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lnj;")
    public class162 field1502 = new class162(2);

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lmg;")
    public class101 field1495;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lmg;")
    private class101 field1500;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lwj;")
    public static class270 field1496 = new class270(34, 3);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lso;")
    public static class329 field1501 = new class329();

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lwj;")
    public static class270 field1503 = new class270(28, -2);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 6)
    public final void method721(byte arg0) {
        field1492++;
        class162 var2 = this.field1499;
        synchronized (this.field1499) {
            this.field1499.method1068(0);
        }
        if (arg0 >= -54) {
            this.method724(-61, (byte) -24);
        }
        class162 var3 = this.field1502;
        synchronized (this.field1502) {
            this.field1502.method1068(0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 25)
    public final void method722(int arg0) {
        field1493++;
        class162 var2 = this.field1499;
        synchronized (this.field1499) {
            this.field1499.method1066(arg0 ^ 0xFFFFF00E);
        }
        class162 var3 = this.field1502;
        synchronized (this.field1502) {
            this.field1502.method1066(4080);
        }
        if (arg0 != -2) {
            this.method721((byte) -26);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 41)
    public final void method723(int arg0, int arg1) {
        class162 var3 = this.field1499;
        synchronized (this.field1499) {
            this.field1499.method1065((byte) -95, arg0);
        }
        field1497++;
        if (arg1 <= 74) {
            field1503 = null;
        }
        class162 var4 = this.field1502;
        synchronized (this.field1502) {
            this.field1502.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lui;", line = 63)
    public final class152 method724(int arg0, byte arg1) {
        field1494++;
        class162 var3 = this.field1499;
        class152 var4;
        synchronized (this.field1499) {
            var4 = (class152) this.field1499.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1500.method727(arg0, 33, -86);
        class152 var6 = new class152();
        var6.field2330 = this;
        if (var5 != null) {
            var6.method1020((byte) 60, new class391(var5));
        }
        class162 var7 = this.field1499;
        synchronized (this.field1499) {
            this.field1499.method1072((long) arg0, var6, false);
            int var8 = 77 / ((6 - arg1) / 56);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 91)
    public static void method725(byte arg0) {
        field1501 = null;
        field1496 = null;
        field1503 = null;
        if (arg0 >= -36) {
            method725((byte) -72);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lal;ILmg;Lmg;)V", line = 118)
    public class100(class66 arg0, int arg1, class101 arg2, class101 arg3) {
        this.field1495 = arg3;
        this.field1500 = arg2;
        this.field1500.method753(33, -93);
    }
}

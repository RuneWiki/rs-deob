import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class140 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lgw;")
    private class690 field1992 = new class690(64);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Luu;")
    private class237 field1987;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Luu;")
    private class237 field1991;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lsw;")
    public static class606 field1990 = class234.method1561(127);

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, class548 arg5) {
        field1988++;
        class496.field6948 = arg5;
        class515.field7152 = class496.field6948.method1495();
        class513.field7094 = class496.field6948.method1495();
        class601.field8132 = class496.field6948.method1495();
        class758.field10576 = arg4;
        class634.field8539 = null;
        class436.field6091 = arg1;
        class521.field7260 = 0;
        class321.field4463 = null;
        class139.method920(arg3, arg2, 1);
        class375.field5277 = -1;
        class653.field8743 = arg0;
        class344.field4893 = -1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lfg;")
    public final class438 method923(byte arg0, int arg1) {
        field1993++;
        class438 var3 = (class438) this.field1992.method3898((byte) -42, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != 26) {
            method924((byte) 99);
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field1991.method1572(0, 0, arg1);
        } else {
            var4 = this.field1987.method1572(0, 0, arg1 & 0x7FFF);
        }
        class438 var5 = new class438();
        if (var4 != null) {
            var5.method2700(4, new class63(var4));
        }
        if (arg1 >= 32768) {
            var5.method2696(32768);
        }
        this.field1992.method3899(arg0 + 3, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method924(byte arg0) {
        if (arg0 != -111) {
            field1994 = -62;
        }
        field1990 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lde;")
    public static final class604 method925(int arg0) {
        if (arg0 > -31) {
            return null;
        } else {
            field1989++;
            return class461.field6384;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILuu;Luu;)V")
    public class140(int arg0, class237 arg1, class237 arg2) {
        this.field1987 = arg2;
        this.field1991 = arg1;
        if (this.field1991 != null) {
            this.field1991.method1597(0, 0);
        }
        if (this.field1987 != null) {
            this.field1987.method1597(0, 0);
        }
    }
}

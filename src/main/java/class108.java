import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class108 extends class487 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
    public boolean field1619 = false;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Z")
    public boolean field1618 = false;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "S")
    public short field1623;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Laa;")
    public static class343 field1622;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 3)
    public static void method785(int arg0) {
        field1622 = null;
        if (arg0 != 1) {
            method786((byte) -39, (char) 65423);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIZZ)V", line = 69)
    public class108(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field1619 = arg5;
        this.field1617 = arg2;
        this.field1623 = (short) arg3;
        this.field1620 = arg0;
        this.field1618 = arg4;
        this.field1624 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BC)Z", line = 21)
    public static final boolean method786(byte arg0, char arg1) {
        field1626++;
        if (arg0 > -71) {
            method788(4);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I", line = 32)
    public static final int method787(int arg0, int arg1, int arg2) {
        field1621++;
        int var3 = class72.method555(-77, arg1 - 1, arg2 + -1) + class72.method555(-43, arg1 + 1, arg2 + -1) + class72.method555(arg0 + 14691, arg1 + -1, arg2 + 1) + class72.method555(-110, arg1 + 1, arg2 + 1);
        int var4 = class72.method555(-114, arg1 - 1, arg2) - (-class72.method555(-33, arg1 + 1, arg2) - class72.method555(-57, arg1, arg2 - 1)) + class72.method555(arg0 ^ 0x39EE, arg1, arg2 - -1);
        if (arg0 != -14800) {
            field1622 = null;
        }
        int var5 = class72.method555(arg0 + 14708, arg1, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 56)
    public static final void method788(int arg0) {
        class211.field3186.method2990((byte) -54);
        if (arg0 == -494) {
            field1625++;
        }
    }
}

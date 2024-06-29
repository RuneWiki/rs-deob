import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class128 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lhm;")
    private class208 field1554 = new class208(256);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lpfa;")
    private class275 field1553;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lvf;")
    public static class141 field1558 = new class141(13, 0, 1, 0);

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[Z")
    public static boolean[] field1559 = new boolean[100];

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "[I")
    public static int[] field1560 = new int[1];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[I")
    public static int[] field1556;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lth;", line = 11)
    public final class558 method833(byte arg0, int arg1) {
        field1552++;
        class208 var3 = this.field1554;
        class558 var4;
        synchronized (this.field1554) {
            if (arg0 != -68) {
                this.field1553 = null;
            }
            var4 = (class558) this.field1554.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field1553;
        byte[] var6;
        synchronized (this.field1553) {
            var6 = this.field1553.method1659(103, arg1, 26);
        }
        class558 var7 = new class558();
        if (var6 != null) {
            var7.method2969(new class572(var6), arg0 ^ 0x2282);
        }
        class208 var8 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method1230((byte) 48, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 43)
    public final void method834(int arg0) {
        field1557++;
        class208 var2 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method1218(109);
        }
        if (arg0 >= -50) {
            this.method837((byte) -50);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 57)
    public static void method835(byte arg0) {
        field1559 = null;
        if (arg0 >= 52) {
            field1560 = null;
            field1558 = null;
            field1556 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 89)
    public class128(class643 arg0, int arg1, class275 arg2) {
        this.field1553 = arg2;
        this.field1553.method1655(26, (byte) -82);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 77)
    public final void method836(int arg0, byte arg1) {
        field1555++;
        class208 var3 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method1222(14564, arg0);
            if (arg1 <= 40) {
                method835((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V", line = 105)
    public final void method837(byte arg0) {
        field1551++;
        if (arg0 != -125) {
            this.method836(-112, (byte) 109);
        }
        class208 var2 = this.field1554;
        synchronized (this.field1554) {
            this.field1554.method1224(false);
        }
    }
}

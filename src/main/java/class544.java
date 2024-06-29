import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class544 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Ltja;")
    private class288 field7625 = new class288(64);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lbt;")
    private class48 field7624;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lhj;")
    public static class596 field7623 = new class596(99, 3);

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field7626 = 0;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 7)
    public static void method3212(byte arg0) {
        field7623 = null;
        int var1 = -83 % ((arg0 - 21) / 55);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lwr;", line = 26)
    public final class483 method3213(int arg0, int arg1) {
        field7627++;
        class288 var3 = this.field7625;
        class483 var4;
        synchronized (this.field7625) {
            var4 = (class483) this.field7625.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field7624;
        byte[] var7;
        synchronized (this.field7624) {
            if (arg0 != 99) {
                return null;
            }
            var7 = this.field7624.method437(5, (byte) 92, arg1);
        }
        class483 var8 = new class483();
        if (var7 != null) {
            var8.method2864(-15938, new class403(var7));
        }
        class288 var9 = this.field7625;
        synchronized (this.field7625) {
            this.field7625.method1686(-25638, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 64)
    public class544(class441 arg0, int arg1, class48 arg2) {
        this.field7624 = arg2;
        this.field7624.method431(4, 5);
    }
}

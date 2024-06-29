import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class100 {

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "Lmf;")
    private class382 field1558 = new class382(128);

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "Lmf;")
    public class382 field1565 = new class382(64);

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "Lpu;")
    public class522 field1562;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "Lpu;")
    private class522 field1564;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1556 = -1;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "Z")
    public static boolean field1554 = false;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "Lfg;")
    public static class113 field1563;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 4)
    public final void method808(int arg0) {
        class382 var2 = this.field1558;
        synchronized (this.field1558) {
            this.field1558.method2279(arg0 - 36);
        }
        field1566++;
        class382 var3 = this.field1565;
        synchronized (this.field1565) {
            this.field1565.method2279(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V", line = 27)
    public static void method809(byte arg0) {
        field1563 = null;
        int var1 = 64 / ((-arg0 - 71) / 39);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIZII)V", line = 36)
    public static final void method810(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class239.field3747 = arg4;
        if (!arg2) {
            field1559++;
            class248.field3859 = arg1;
            class520.field7329 = arg3;
            class15.field153 = arg0;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V", line = 50)
    public final void method811(int arg0, int arg1, int arg2) {
        this.field1558 = new class382(arg0);
        field1557++;
        if (arg1 > -57) {
            this.method813((byte) -47);
        }
        this.field1565 = new class382(arg2);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BI)Lsp;", line = 62)
    public final class588 method812(byte arg0, int arg1) {
        field1561++;
        int var3 = -100 % ((3 - arg0) / 63);
        class382 var4 = this.field1558;
        class588 var5;
        synchronized (this.field1558) {
            var5 = (class588) this.field1558.method2287(1, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class522 var6 = this.field1564;
        byte[] var7;
        synchronized (this.field1564) {
            var7 = this.field1564.method3007(36, arg1, 5);
        }
        class588 var8 = new class588();
        var8.field8255 = this;
        var8.field8217 = arg1;
        if (var7 != null) {
            var8.method3334(new class695(var7), (byte) 97);
        }
        var8.method3335(12074);
        class382 var9 = this.field1558;
        synchronized (this.field1558) {
            this.field1558.method2291(var8, (long) arg1, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;)V", line = 113)
    public class100(class693 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field1562 = arg3;
        this.field1564 = arg2;
        this.field1564.method2988(-113, 36);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)V", line = 129)
    public final void method813(byte arg0) {
        class382 var2 = this.field1558;
        synchronized (this.field1558) {
            if (arg0 != 81) {
                this.method812((byte) 47, 107);
            }
            this.field1558.method2285((byte) -87);
        }
        field1560++;
        class382 var3 = this.field1565;
        synchronized (this.field1565) {
            this.field1565.method2285((byte) -91);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZI)V", line = 146)
    public final void method814(boolean arg0, int arg1) {
        field1555++;
        class382 var3 = this.field1558;
        synchronized (this.field1558) {
            this.field1558.method2290(false, arg1);
        }
        if (!arg0) {
            this.method812((byte) -22, -106);
        }
        class382 var4 = this.field1565;
        synchronized (this.field1565) {
            this.field1565.method2290(!arg0, arg1);
        }
    }
}

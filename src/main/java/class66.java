import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class66 {

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lmga;")
    private class666 field1006 = new class666(64);

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lbi;")
    private class449 field1007;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Lbi;")
    public class449 field1010;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
    public static final void method527(int arg0, int arg1) {
        class666 var2 = class322.field4481;
        synchronized (class322.field4481) {
            class322.field4481.method3740((byte) 60, arg1);
        }
        if (arg0 != 27555) {
            method527(26, 36);
        }
        field1012++;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)V")
    public final void method528(int arg0, int arg1) {
        class666 var3 = this.field1006;
        synchronized (this.field1006) {
            this.field1006.method3740((byte) 60, arg0);
        }
        if (arg1 != 29057) {
            this.field1007 = null;
        }
        field1005++;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public final void method529(int arg0) {
        if (arg0 != 23587) {
            this.field1006 = null;
        }
        field1004++;
        class666 var2 = this.field1006;
        synchronized (this.field1006) {
            this.field1006.method3748(6);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIILlw;)V")
    public static final void method530(int arg0, int arg1, int arg2, class618 arg3) {
        class24 var4 = class457.method2610(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field422 = arg3;
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
    public final void method531(int arg0) {
        field1008++;
        class666 var2 = this.field1006;
        synchronized (this.field1006) {
            this.field1006.method3739(0);
            if (arg0 != -1) {
                method532(null, -90, 25, -45, 78);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lrba;IIII)V")
    public static final void method532(class402 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field5354.method1982(arg2, (byte) 63);
        field1003++;
        if (arg3 != 2048) {
            method533(-98, 93, -125);
        }
        arg0.field5354.method2031((byte) 54, arg1);
        arg0.field5354.method2003(arg4, 16777216);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z")
    public static final boolean method533(int arg0, int arg1, int arg2) {
        if (arg1 == -15077) {
            field1011++;
            return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)Lmd;")
    public final class509 method534(byte arg0, int arg1) {
        field1013++;
        if (arg0 < 67) {
            return null;
        }
        class666 var3 = this.field1006;
        class509 var4;
        synchronized (this.field1006) {
            var4 = (class509) this.field1006.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field1007;
        byte[] var6;
        synchronized (this.field1007) {
            var6 = this.field1007.method2537(false, 3, arg1);
        }
        class509 var7 = new class509();
        var7.field6791 = this;
        if (var6 != null) {
            var7.method2821(120, new class335(var6));
        }
        class666 var8 = this.field1006;
        synchronized (this.field1006) {
            this.field1006.method3745(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;)V")
    public class66(class671 arg0, int arg1, class449 arg2, class449 arg3) {
        this.field1007 = arg2;
        this.field1010 = arg3;
        this.field1007.method2527(0, 3);
    }
}

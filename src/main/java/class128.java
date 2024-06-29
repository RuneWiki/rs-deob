import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class128 {

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "Lwg;")
    private class58 field1591 = new class58(256);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Lkr;")
    private class329 field1589;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
    public static final void method684(int arg0, int arg1) {
        field1588++;
        if (class463.field6597 == 0) {
            class115.field1466.method2099((byte) -125, arg1);
        } else {
            class148.field1917 = arg1;
        }
        if (arg0 != 1) {
            method688(null, -24, -11, -2, -17);
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)Lat;")
    public final class536 method685(int arg0, int arg1) {
        field1594++;
        class58 var3 = this.field1591;
        class536 var4;
        synchronized (this.field1591) {
            var4 = (class536) this.field1591.method323((long) arg1, arg0 ^ 0xFFFFC88F);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field1589;
        byte[] var6;
        synchronized (this.field1589) {
            if (arg0 != 31253) {
                this.field1591 = null;
            }
            var6 = this.field1589.method2054(true, 26, arg1);
        }
        class536 var7 = new class536();
        if (var6 != null) {
            var7.method2981(new class551(var6), -115);
        }
        class58 var8 = this.field1591;
        synchronized (this.field1591) {
            this.field1591.method316((long) arg1, (byte) -121, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)V")
    public final void method686(int arg0, int arg1) {
        class58 var3 = this.field1591;
        synchronized (this.field1591) {
            this.field1591.method320(arg0, arg1 - 306674944);
            if (arg1 != 32) {
                this.method685(91, 103);
            }
        }
        field1593++;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public final void method687(byte arg0) {
        field1590++;
        if (arg0 == -52) {
            class58 var2 = this.field1591;
            synchronized (this.field1591) {
                this.field1591.method315(arg0 + 53);
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class128(class513 arg0, int arg1, class329 arg2) {
        this.field1589 = arg2;
        this.field1589.method2064(0, 26);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkg;IIII)V")
    public static final void method688(class57 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class569.method3190(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class260.field3211) {
            class569.method3190(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class569.method3190(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class541.field7566) {
            class569.method3190(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class541.field7566) {
            class569.method3190(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class260.field3211 && arg4 <= class541.field7566) {
            class569.method3190(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class569.method3190(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class260.field3211 && arg4 > 0) {
            class569.method3190(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
    public final void method689(byte arg0) {
        if (arg0 > -6) {
            this.field1589 = null;
        }
        class58 var2 = this.field1591;
        synchronized (this.field1591) {
            this.field1591.method317((byte) 21);
        }
        field1592++;
    }

    static {
        new class344("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}

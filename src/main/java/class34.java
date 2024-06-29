import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class34 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ldc;")
    private class5 field547 = new class5(128);

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ldc;")
    public class5 field554 = new class5(64);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lhe;")
    public class239 field543;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lhe;")
    private class239 field544;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lwt;")
    public static class194 field551 = new class194("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field552 = 0;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[[I")
    public static int[][] field553 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 7)
    public final void method281(int arg0) {
        field545++;
        class5 var2 = this.field547;
        synchronized (this.field547) {
            this.field547.method38((byte) -116);
        }
        class5 var3 = this.field554;
        synchronized (this.field554) {
            this.field554.method38((byte) -66);
            if (arg0 != 14240) {
                this.method283(-127, (byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lwd;", line = 26)
    public final class170 method282(int arg0, int arg1) {
        field548++;
        class5 var3 = this.field547;
        class170 var4;
        synchronized (this.field547) {
            var4 = (class170) this.field547.method40(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field544.method1470(4, arg0, 36);
        class170 var6 = new class170();
        var6.field2246 = arg0;
        var6.field2243 = this;
        if (var5 != null) {
            var6.method1071(new class156(var5), true);
        }
        var6.method1070(1);
        class5 var7 = this.field547;
        synchronized (this.field547) {
            if (arg1 <= 13) {
                this.field544 = null;
            }
            this.field547.method36(-20960, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 58)
    public final void method283(int arg0, byte arg1) {
        class5 var3 = this.field547;
        synchronized (this.field547) {
            this.field547.method39(false, arg0);
            if (arg1 < 46) {
                field551 = null;
            }
        }
        field546++;
        class5 var4 = this.field554;
        synchronized (this.field554) {
            this.field554.method39(false, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I", line = 76)
    public static final int method284(byte arg0) {
        if (arg0 != -106) {
            field553 = null;
        }
        field549++;
        return 16;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V", line = 87)
    public final void method285(byte arg0, int arg1, int arg2) {
        field542++;
        if (arg0 > -6) {
            this.method282(92, 96);
        }
        this.field547 = new class5(arg1);
        this.field554 = new class5(arg2);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 102)
    public final void method286(int arg0) {
        class5 var2 = this.field547;
        synchronized (this.field547) {
            this.field547.method35((byte) -1);
            if (arg0 != -21745) {
                method284((byte) -21);
            }
        }
        field550++;
        class5 var3 = this.field554;
        synchronized (this.field554) {
            this.field554.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 118)
    public static void method287(byte arg0) {
        field551 = null;
        if (arg0 >= -68) {
            field553 = null;
        }
        field553 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lci;ILhe;Lhe;)V", line = 150)
    public class34(class298 arg0, int arg1, class239 arg2, class239 arg3) {
        this.field543 = arg3;
        this.field544 = arg2;
        this.field544.method1473(4309, 36);
    }
}

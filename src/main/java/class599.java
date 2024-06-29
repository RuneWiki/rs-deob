import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class599 {

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Llga;")
    private class663 field8369 = new class663(16);

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Lsea;")
    private class648 field8371;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "[[I")
    public static int[][] field8365 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Lmp;")
    public static class706 field8366;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[I")
    public static int[] field8362;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
    public final void method3378(byte arg0, int arg1) {
        if (arg0 > -87) {
            method3380(127, (byte) 113);
        }
        field8367++;
        class663 var3 = this.field8369;
        synchronized (this.field8369) {
            this.field8369.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Log;")
    public final class601 method3379(int arg0, int arg1) {
        field8364++;
        class663 var3 = this.field8369;
        class601 var4;
        synchronized (this.field8369) {
            var4 = (class601) this.field8369.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field8371;
        byte[] var7;
        synchronized (this.field8371) {
            if (arg0 != 9) {
                return null;
            }
            var7 = this.field8371.method3654(-15615, 30, arg1);
        }
        class601 var8 = new class601();
        if (var7 != null) {
            var8.method3386((byte) -55, new class501(var7));
        }
        class663 var9 = this.field8369;
        synchronized (this.field8369) {
            this.field8369.method3748((long) arg1, var8, 12537);
            return var8;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)V")
    public static final void method3380(int arg0, byte arg1) {
        field8363++;
        class51 var2 = class703.method3938(arg1 ^ 0x7691FF2B, arg0, 7);
        var2.method404(121);
        if (arg1 != -117) {
            field8362 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final void method3381(int arg0) {
        class663 var2 = this.field8369;
        synchronized (this.field8369) {
            this.field8369.method3755(19713);
        }
        if (arg0 != 6) {
            field8365 = null;
        }
        field8368++;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final void method3382(int arg0) {
        class663 var2 = this.field8369;
        synchronized (this.field8369) {
            this.field8369.method3749(7648);
        }
        field8370++;
        if (arg0 != -2047) {
            this.field8369 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public static void method3383(byte arg0) {
        field8366 = null;
        field8362 = null;
        if (arg0 >= -32) {
            field8365 = null;
        }
        field8365 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class599(class414 arg0, int arg1, class648 arg2) {
        this.field8371 = arg2;
        this.field8371.method3653(30, true);
    }
}

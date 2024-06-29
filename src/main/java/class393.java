import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class393 {

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "Lum;")
    private class371 field5589;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Loi;")
    private class52 field5579;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lij;")
    private class297 field5582;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lvr;")
    public static class92 field5583 = new class92(9, 0, 4, 1);

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Lbd;")
    public static class44 field5590 = new class44("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ldh;")
    public static class216 field5592 = new class216(10, 7);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lci;")
    public static class320 field5591;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lwn;")
    private class519 field5587;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[Lfq;")
    private class138[] field5577;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[Lo;")
    public static class24[] field5594;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILwf;ILwf;Z)Lfq;")
    private final class138 method2367(int arg0, class91 arg1, int arg2, class91 arg3, boolean arg4) {
        field5580++;
        if (this.field5587 == null) {
            throw new RuntimeException();
        }
        this.field5587.field7558 = arg0 * 8 + 5;
        if (this.field5587.field7545.length <= this.field5587.field7558) {
            throw new RuntimeException();
        } else if (this.field5577[arg0] == null) {
            int var6 = this.field5587.method3053(-129);
            int var7 = this.field5587.method3053(-129);
            if (arg2 == -29278) {
                class138 var8 = new class138(arg0, arg3, arg1, this.field5579, this.field5589, var6, var7, arg4);
                this.field5577[arg0] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field5577[arg0];
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public final void method2368(int arg0) {
        field5576++;
        if (this.field5577 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5577.length; var2++) {
            if (this.field5577[var2] != null) {
                this.field5577[var2].method1003((byte) -14);
            }
        }
        int var3 = 0;
        int var4 = -94 % ((arg0 - 19) / 58);
        while (this.field5577.length > var3) {
            if (this.field5577[var3] != null) {
                this.field5577[var3].method1004(-127);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
    public final boolean method2369(boolean arg0) {
        field5588++;
        if (this.field5587 != null) {
            return true;
        }
        if (this.field5582 == null) {
            if (this.field5579.method457((byte) -117)) {
                return false;
            }
            this.field5582 = this.field5579.method461(-74, (byte) 0, true, 255, 255);
        }
        if (this.field5582.field4248) {
            return false;
        }
        this.field5587 = new class519(this.field5582.method398((byte) 68));
        if (!arg0) {
            field5590 = null;
        }
        this.field5577 = new class138[(this.field5587.field7545.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILwf;Lwf;)Lfq;")
    public final class138 method2370(int arg0, int arg1, class91 arg2, class91 arg3) {
        if (arg1 != 0) {
            method2373((byte) -30);
        }
        field5581++;
        return this.method2367(arg0, arg2, -29278, arg3, true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method2371(int arg0, short[] arg1, int arg2) {
        field5585++;
        short[] var3 = new short[arg0];
        class282.method1822(arg1, arg2, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method2372(int arg0) {
        class62.field1085 = null;
        if (arg0 != -11044) {
            return;
        }
        class156.field2375 = null;
        class494.field7146 = false;
        class94.field1500 = null;
        class513.field7463 = null;
        class147.field2268 = null;
        field5584++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method2373(byte arg0) {
        field5590 = null;
        field5583 = null;
        if (arg0 <= 12) {
            method2373((byte) 43);
        }
        field5592 = null;
        field5594 = null;
        field5591 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Loi;Lum;)V")
    public class393(class52 arg0, class371 arg1) {
        this.field5589 = arg1;
        this.field5579 = arg0;
        if (!this.field5579.method457((byte) -117)) {
            this.field5582 = this.field5579.method461(-93, (byte) 0, true, 255, 255);
        }
    }
}

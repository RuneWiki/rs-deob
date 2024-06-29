import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class44 {

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Ldd;")
    public class130 field690 = new class130();

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljp;")
    public static class55 field689 = new class55(17, 6);

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lpn;")
    public static class49 field697 = new class49(28, 5);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "Ldd;")
    private class130 field700;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLdd;Lnv;)V")
    private final void method286(byte arg0, class130 arg1, class44 arg2) {
        if (arg0 < 85) {
            this.field690 = null;
        }
        field687++;
        class130 var4 = this.field690.field1936;
        this.field690.field1936 = arg1.field1936;
        arg1.field1936.field1934 = this.field690;
        if (this.field690 != arg1) {
            arg1.field1936 = arg2.field690.field1936;
            arg1.field1936.field1934 = arg1;
            arg2.field690.field1936 = var4;
            var4.field1934 = arg2.field690;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        field689 = null;
        field697 = null;
        if (!arg0) {
            method287(false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldd;I)V")
    public final void method288(class130 arg0, int arg1) {
        if (arg0.field1936 != null) {
            arg0.method947((byte) 122);
        }
        field698++;
        arg0.field1936 = this.field690;
        arg0.field1934 = this.field690.field1934;
        arg0.field1936.field1934 = arg0;
        if (arg1 == 28) {
            arg0.field1934.field1936 = arg0;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Ldd;")
    public final class130 method289(int arg0) {
        if (arg0 != 5) {
            return null;
        }
        field691++;
        class130 var2 = this.field700;
        if (this.field690 == var2) {
            this.field700 = null;
            return null;
        } else {
            this.field700 = var2.field1936;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILnv;)V")
    public final void method290(int arg0, class44 arg1) {
        this.method286((byte) 94, this.field690.field1934, arg1);
        field701++;
        if (arg0 != 5) {
            this.method297(-17);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        field686++;
        while (true) {
            class130 var2 = this.field690.field1934;
            if (this.field690 == var2) {
                this.field700 = null;
                if (arg0) {
                    this.method290(77, null);
                    return;
                } else {
                    return;
                }
            }
            var2.method947((byte) 96);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLdd;)V")
    public final void method292(byte arg0, class130 arg1) {
        if (arg1.field1936 != null) {
            arg1.method947((byte) 115);
        }
        field696++;
        arg1.field1936 = this.field690.field1936;
        if (arg0 != 121) {
            this.field700 = null;
        }
        arg1.field1934 = this.field690;
        arg1.field1936.field1934 = arg1;
        arg1.field1934.field1936 = arg1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z")
    public final boolean method293(byte arg0) {
        field692++;
        if (arg0 < 67) {
            field689 = null;
        }
        return this.field690.field1934 == this.field690;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Ldd;")
    public final class130 method294(int arg0) {
        field699++;
        class130 var2 = this.field690.field1936;
        if (this.field690 == var2) {
            this.field700 = null;
            return null;
        }
        this.field700 = var2.field1936;
        if (arg0 != 0) {
            this.method296(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Ldd;")
    public final class130 method295(byte arg0) {
        field694++;
        class130 var2 = this.field690.field1934;
        if (this.field690 == var2) {
            this.field700 = null;
            return null;
        } else {
            int var3 = 98 % ((68 - arg0) / 40);
            this.field700 = var2.field1934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)Ldd;")
    public final class130 method296(boolean arg0) {
        field693++;
        class130 var2 = this.field700;
        if (!arg0) {
            this.field700 = null;
        }
        if (this.field690 == var2) {
            this.field700 = null;
            return null;
        } else {
            this.field700 = var2.field1934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)I")
    public final int method297(int arg0) {
        field688++;
        int var2 = arg0;
        class130 var3 = this.field690.field1934;
        while (this.field690 != var3) {
            var3 = var3.field1934;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
    public class44() {
        this.field690.field1936 = this.field690;
        this.field690.field1934 = this.field690;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Ldd;")
    public final class130 method298(int arg0) {
        field695++;
        class130 var2 = this.field690.field1934;
        if (arg0 > -13) {
            field689 = null;
        }
        if (this.field690 == var2) {
            return null;
        } else {
            var2.method947((byte) 118);
            return var2;
        }
    }
}

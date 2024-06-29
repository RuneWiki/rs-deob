import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class37 extends class51 {

    @OriginalMember(owner = "client!in", name = "P", descriptor = "Lhi;")
    private class82 field614 = class114.field2050;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Lhi;")
    public static class82 field609 = class95.method664((byte) -112, "::replacecanvas");

    @OriginalMember(owner = "client!in", name = "V", descriptor = "[I")
    public static int[] field620 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "Loe;")
    private class79 field607;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "Loe;")
    public class79 field619;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lbc;I)V", line = 13)
    public final void method284(class153 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1082(-69);
            if (var3 == 0) {
                field617++;
                if (arg1 > -115) {
                    this.field619 = (class79) null;
                }
                return;
            }
            this.method293(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V", line = 38)
    private final void method285(byte arg0) {
        int var2 = 73 % ((-arg0 - 63) / 45);
        this.field607 = new class79(this.field619.method505(44));
        for (class259 var3 = (class259) this.field619.method502((byte) -104); var3 != null; var3 = (class259) this.field619.method494(true)) {
            class259 var4 = new class259((int) var3.field2418);
            this.field607.method503((long) var3.field4431, -76, var4);
        }
        field616++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILhi;)Z", line = 59)
    public final boolean method286(int arg0, class82 arg1) {
        field618++;
        if (this.field619 == null) {
            return false;
        }
        if (this.field607 == null) {
            this.method289(1);
        }
        for (class45 var3 = (class45) this.field607.method507(arg1.method560(-199), 602425312); var3 != null; var3 = (class45) this.field607.method498(-29646)) {
            if (var3.field772.method534(arg0 + 22891, arg1)) {
                return true;
            }
        }
        if (arg0 != -22922) {
            this.field619 = (class79) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)Z", line = 87)
    public final boolean method287(boolean arg0, int arg1) {
        field606++;
        if (this.field619 == null) {
            return false;
        }
        if (this.field607 == null) {
            this.method285((byte) -126);
        }
        class259 var3 = (class259) this.field607.method507((long) arg1, 602425312);
        if (var3 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)I", line = 112)
    public final int method288(int arg0, int arg1) {
        field605++;
        if (this.field619 == null) {
            return this.field615;
        }
        class259 var3 = (class259) this.field619.method507((long) arg1, 602425312);
        if (arg0 == 1) {
            return var3 == null ? this.field615 : var3.field4431;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 131)
    private final void method289(int arg0) {
        field608++;
        this.field607 = new class79(this.field619.method505(arg0 - 84));
        if (arg0 != 1) {
            this.field607 = (class79) null;
        }
        for (class255 var2 = (class255) this.field619.method502((byte) -104); var2 != null; var2 = (class255) this.field619.method494(true)) {
            class45 var3 = new class45(var2.field4395, (int) var2.field2418);
            this.field607.method503(var2.field4395.method560(-199), arg0 ^ 0xFFFFFFAC, var3);
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V", line = 153)
    public static void method290(byte arg0) {
        field609 = null;
        if (arg0 == -9) {
            field620 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(II)V", line = 166)
    public static final void method291(int arg0, int arg1) {
        class227 var2 = class215.method1531(-1, 2, arg0);
        var2.method1624((byte) -101);
        if (arg1 == 0) {
            field622++;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)[Lti;", line = 179)
    public static final class186[] method292(byte arg0) {
        field612++;
        class186[] var1 = new class186[class212.field3714];
        if (arg0 < 1) {
            method292((byte) 7);
        }
        for (int var2 = 0; var2 < class212.field3714; var2++) {
            var1[var2] = new class186(class285.field4793, class28.field381, class86.field1536[var2], class20.field262[var2], class107.field1897[var2], class42.field747[var2], class260.field4453[var2], class142.field2427);
        }
        class3.method23(286013516);
        return var1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lbc;IZ)V", line = 208)
    private final void method293(class153 arg0, int arg1, boolean arg2) {
        field613++;
        if (arg1 == 1) {
            this.field604 = arg0.method1082(-33);
        } else if (arg1 == 2) {
            this.field610 = arg0.method1082(-59);
        } else if (arg1 == 3) {
            this.field614 = arg0.method1092((byte) 118);
        } else if (arg1 == 4) {
            this.field615 = arg0.method1097((byte) -83);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1090(false);
            this.field619 = new class79(class135.method922(21793, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1097((byte) -65);
                class141 var7;
                if (arg1 == 5) {
                    var7 = new class255(arg0.method1092((byte) 118));
                } else {
                    var7 = new class259(arg0.method1097((byte) -49));
                }
                this.field619.method503((long) var6, -50, var7);
            }
        }
        if (!arg2) {
            method292((byte) 109);
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(II)Lhi;", line = 275)
    public final class82 method294(int arg0, int arg1) {
        field611++;
        if (this.field619 == null) {
            return this.field614;
        }
        class255 var3 = (class255) this.field619.method507((long) arg0, 602425312);
        if (arg1 < 123) {
            this.field607 = (class79) null;
        }
        return var3 == null ? this.field614 : var3.field4395;
    }
}

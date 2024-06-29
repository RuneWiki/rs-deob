import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class285 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lgga;")
    private class272 field3620 = new class272();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lgga;")
    private class272 field3621;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lgga;", line = 6)
    public final class272 method1712(byte arg0) {
        field3611++;
        int var2 = -7 / ((85 - arg0) / 41);
        class272 var3 = this.field3621;
        if (this.field3620 == var3) {
            this.field3621 = null;
            return null;
        } else {
            this.field3621 = var3.field3439;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lgga;", line = 28)
    public final class272 method1713(byte arg0) {
        field3619++;
        class272 var2 = this.field3620.field3436;
        if (this.field3620 == var2) {
            this.field3621 = null;
            return null;
        }
        if (arg0 <= 91) {
            this.field3620 = null;
        }
        this.field3621 = var2.field3436;
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lgga;B)V", line = 52)
    public final void method1714(class272 arg0, byte arg1) {
        field3617++;
        if (arg1 != 11) {
            return;
        }
        if (arg0.field3436 != null) {
            arg0.method1619((byte) -113);
        }
        arg0.field3439 = this.field3620;
        arg0.field3436 = this.field3620.field3436;
        arg0.field3436.field3439 = arg0;
        arg0.field3439.field3436 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)Lgga;", line = 73)
    public final class272 method1715(byte arg0) {
        field3615++;
        class272 var2 = this.field3620.field3439;
        if (this.field3620 == var2) {
            this.field3621 = null;
            return null;
        } else if (arg0 <= 120) {
            return null;
        } else {
            this.field3621 = var2.field3439;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 98)
    public final void method1716(int arg0) {
        while (true) {
            class272 var2 = this.field3620.field3439;
            if (this.field3620 == var2) {
                field3618++;
                this.field3621 = null;
                if (arg0 != 3) {
                    field3610 = -58;
                    return;
                }
                return;
            }
            var2.method1619((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I", line = 121)
    public static final int method1717(int arg0, int arg1) {
        field3612++;
        if (arg0 != 1) {
            field3610 = 84;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I", line = 157)
    public final int method1718(int arg0) {
        field3616++;
        int var2 = arg0;
        for (class272 var3 = this.field3620.field3439; var3 != this.field3620; var3 = var3.field3439) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)Z", line = 176)
    public final boolean method1719(byte arg0) {
        if (arg0 == 115) {
            field3613++;
            return this.field3620.field3439 == this.field3620;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 192)
    public class285() {
        this.field3620.field3439 = this.field3620;
        this.field3620.field3436 = this.field3620;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Lgga;", line = 201)
    public final class272 method1720(boolean arg0) {
        field3614++;
        if (!arg0) {
            return null;
        }
        class272 var2 = this.field3620.field3439;
        if (this.field3620 == var2) {
            return null;
        } else {
            var2.method1619((byte) -128);
            return var2;
        }
    }
}

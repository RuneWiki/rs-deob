import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 {

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lbe;")
    public class12 field587 = new class12();

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lad;")
    public static class5 field578 = class88.method674("title)3jpg", 58);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field588 = -1;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lad;")
    public static class5 field589 = class88.method674(" ", 108);

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lad;")
    private static class5 field594 = class88.method674("Please close the interface you have open before using (Wreport abuse(W", 69);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lad;")
    public static class5 field573 = field594;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lgb;")
    public static class39 field575 = new class39(8);

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field597 = new CRC32();

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lad;")
    public static class5 field598 = class88.method674("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 55);

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
    public static int[] field599 = new int[128];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Lbe;")
    private class12 field595;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[Lub;")
    public static class122[] field592;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lbe;", line = 29)
    public final class12 method175(int arg0) {
        field574++;
        class12 var2 = this.field587.field349;
        if (arg0 != 24160) {
            field597 = null;
        }
        if (this.field587 == var2) {
            this.field595 = null;
            return null;
        } else {
            this.field595 = var2.field349;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lbe;I)V", line = 50)
    public final void method176(class12 arg0, int arg1) {
        field584++;
        if (arg0.field349 != null) {
            arg0.method114(-3789);
        }
        arg0.field349 = this.field587.field349;
        arg0.field372 = this.field587;
        arg0.field349.field372 = arg0;
        arg0.field372.field349 = arg0;
        if (arg1 != -19597) {
            field588 = 35;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILfe;)V", line = 68)
    public static final void method177(int arg0, class36 arg1) {
        class48.field1249 = arg1;
        if (arg0 != 0) {
            field588 = -104;
        }
        field593++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 80)
    public static final void method178(int arg0) {
        field583++;
        if (arg0 != -26184) {
            method178(12);
        }
        if (class116.field2860 != null) {
            class96 var1 = class116.field2860;
            synchronized (class116.field2860) {
                class116.field2860 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLbe;)V", line = 101)
    public final void method179(boolean arg0, class12 arg1) {
        field582++;
        if (arg1.field349 != null) {
            arg1.method114(-3789);
        }
        arg1.field372 = this.field587.field372;
        arg1.field349 = this.field587;
        arg1.field349.field372 = arg1;
        if (arg0) {
            field588 = -2;
        }
        arg1.field372.field349 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lbe;", line = 119)
    public final class12 method180(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field577++;
        class12 var2 = this.field587.field372;
        if (this.field587 == var2) {
            this.field595 = null;
            return null;
        } else {
            this.field595 = var2.field372;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lbe;", line = 142)
    public final class12 method181(int arg0) {
        field590++;
        if (arg0 != 0) {
            field594 = null;
        }
        class12 var2 = this.field595;
        if (this.field587 == var2) {
            this.field595 = null;
            return null;
        } else {
            this.field595 = var2.field372;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 164)
    public final void method182(int arg0) {
        if (arg0 != 26343) {
            return;
        }
        field585++;
        while (true) {
            class12 var2 = this.field587.field372;
            if (this.field587 == var2) {
                return;
            }
            var2.method114(arg0 ^ 0xFFFF97D4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)Lbe;", line = 188)
    public final class12 method183(int arg0) {
        if (arg0 >= -8) {
            field576 = -123;
        }
        class12 var2 = this.field587.field372;
        field596++;
        if (this.field587 == var2) {
            return null;
        } else {
            var2.method114(-3789);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Lbe;", line = 214)
    public final class12 method184(int arg0) {
        field581++;
        class12 var2 = this.field595;
        if (this.field587 == var2) {
            this.field595 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method185(84, null, null);
        }
        this.field595 = var2.field349;
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILbe;Lbe;)V", line = 235)
    public final void method185(int arg0, class12 arg1, class12 arg2) {
        if (arg1.field349 != null) {
            arg1.method114(-3789);
        }
        arg1.field349 = arg2.field349;
        arg1.field372 = arg2;
        field586++;
        arg1.field349.field372 = arg1;
        arg1.field372.field349 = arg1;
        if (arg0 != 0) {
            this.field595 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 328)
    public class23() {
        this.field587.field372 = this.field587;
        this.field587.field349 = this.field587;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lbe;", line = 266)
    public final class12 method186(byte arg0) {
        if (arg0 != 93) {
            return null;
        }
        field579++;
        class12 var2 = this.field587.field349;
        if (this.field587 == var2) {
            return null;
        } else {
            var2.method114(-3789);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V", line = 288)
    public static void method187(int arg0) {
        if (arg0 != -607) {
            method177(-35, null);
        }
        field598 = null;
        field578 = null;
        field575 = null;
        field597 = null;
        field594 = null;
        field589 = null;
        field592 = null;
        field599 = null;
        field573 = null;
    }
}

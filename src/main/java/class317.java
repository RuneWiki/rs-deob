import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class317 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lrda;")
    public class661 field4407 = new class661();

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lgda;")
    public static class53 field4400 = new class53(72, 8);

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    public static int[] field4406 = new int[4096];

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field4408 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lrda;")
    private class661 field4409;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
    public static boolean field4405;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lrda;")
    public final class661 method2057(int arg0) {
        field4403++;
        if (arg0 != 0) {
            field4399 = -23;
        }
        class661 var2 = this.field4409;
        if (this.field4407 == var2) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var2.field9046;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static void method2058(int arg0) {
        field4400 = null;
        field4406 = null;
        if (arg0 != -1) {
            method2058(98);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILrda;)V")
    public final void method2059(int arg0, class661 arg1) {
        field4401++;
        if (arg1.field9043 != null) {
            arg1.method3624((byte) -30);
        }
        arg1.field9046 = this.field4407;
        arg1.field9043 = this.field4407.field9043;
        arg1.field9043.field9046 = arg1;
        arg1.field9046.field9043 = arg1;
        if (arg0 != 4096) {
            this.method2059(-75, null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final void method2060(int arg0) {
        field4402++;
        if (arg0 != 4096) {
            return;
        }
        while (true) {
            class661 var2 = this.field4407.field9046;
            if (this.field4407 == var2) {
                this.field4409 = null;
                return;
            }
            var2.method3624((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)I")
    public final int method2061(int arg0) {
        field4404++;
        int var2 = arg0;
        for (class661 var3 = this.field4407.field9046; var3 != this.field4407; var3 = var3.field9046) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Lrda;")
    public final class661 method2062(int arg0) {
        if (arg0 != -1) {
            field4408 = 88;
        }
        field4398++;
        class661 var2 = this.field4407.field9046;
        if (this.field4407 == var2) {
            this.field4409 = null;
            return null;
        } else {
            this.field4409 = var2.field9046;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class317() {
        this.field4407.field9046 = this.field4407;
        this.field4407.field9043 = this.field4407;
    }
}

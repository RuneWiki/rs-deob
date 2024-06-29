import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class219 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ljj;")
    private class29 field3595 = new class29();

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[I")
    public static int[] field3597 = new int[50];

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    public static boolean field3605 = false;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "S")
    public static short field3609 = 1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Ljj;")
    private class29 field3603;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lsi;")
    public static class66 field3599;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lsi;")
    public static class66 field3602;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[I")
    public static int[] field3608;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I", line = 13)
    public final int method1528(int arg0) {
        field3593++;
        int var2 = arg0;
        for (class29 var3 = this.field3595.field467; var3 != this.field3595; var3 = var3.field467) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Ljj;", line = 32)
    public final class29 method1529(byte arg0) {
        field3606++;
        if (arg0 != 0) {
            field3599 = (class66) null;
        }
        class29 var2 = this.field3595.field467;
        if (this.field3595 == var2) {
            this.field3603 = null;
            return null;
        } else {
            this.field3603 = var2.field467;
            return var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 58)
    public final void method1530(int arg0) {
        while (true) {
            class29 var2 = this.field3595.field467;
            if (this.field3595 == var2) {
                this.field3603 = null;
                field3600++;
                if (arg0 != 1) {
                    this.method1532(119, (class29) null);
                }
                return;
            }
            var2.method224(128);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILph;)Lue;", line = 77)
    public static final class235 method1531(int arg0, class229 arg1) {
        field3594++;
        if (arg0 != 4) {
            return (class235) null;
        }
        for (class235 var2 = (class235) class142.field2309.method1580((byte) -39); var2 != null; var2 = (class235) class142.field2309.method1579((byte) 28)) {
            if (var2.field3874.method1618(false, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjj;)V", line = 103)
    public final void method1532(int arg0, class29 arg1) {
        field3607++;
        if (arg1.field473 != null) {
            arg1.method224(128);
        }
        arg1.field467 = this.field3595;
        arg1.field473 = this.field3595.field473;
        arg1.field473.field467 = arg1;
        if (arg0 <= 110) {
            field3597 = (int[]) null;
        }
        arg1.field467.field473 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)Ljj;", line = 120)
    public final class29 method1533(int arg0) {
        field3601++;
        class29 var2 = this.field3603;
        if (this.field3595 == var2) {
            this.field3603 = null;
            return null;
        }
        if (arg0 != 3) {
            this.method1529((byte) -77);
        }
        this.field3603 = var2.field467;
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 195)
    public class219() {
        this.field3595.field467 = this.field3595;
        this.field3595.field473 = this.field3595;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 162)
    public static void method1534(boolean arg0) {
        if (!arg0) {
            field3597 = null;
            field3608 = null;
            field3599 = null;
            field3602 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V", line = 175)
    public static final void method1535(int arg0, int arg1) {
        field3604++;
        if (arg1 < 112) {
            field3605 = false;
        }
        class121.field2035 = arg0;
        class149.method1085(3, (byte) 64);
        class149.method1085(4, (byte) 64);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Ljj;", line = 217)
    public final class29 method1536(byte arg0) {
        field3598++;
        class29 var2 = this.field3595.field467;
        if (arg0 != 116) {
            field3597 = (int[]) null;
        }
        if (this.field3595 == var2) {
            return null;
        } else {
            var2.method224(128);
            return var2;
        }
    }
}

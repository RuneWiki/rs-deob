import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class47 {

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Lfb;")
    public class45 field663 = new class45();

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "Llm;")
    public static class347 field664;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Lfb;")
    private class45 field671;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lfb;I)V")
    public final void method330(class45 arg0, int arg1) {
        if (arg0.field641 != null) {
            arg0.method322(11);
        }
        field668++;
        if (arg1 != -2130841184) {
            this.method336((byte) -73, (class45) null);
        }
        arg0.field636 = this.field663;
        arg0.field641 = this.field663.field641;
        arg0.field641.field636 = arg0;
        arg0.field636.field641 = arg0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lfb;Lar;B)V")
    private final void method331(class45 arg0, class47 arg1, byte arg2) {
        field657++;
        if (arg2 >= -64) {
            this.method333((byte) 13);
        }
        class45 var4 = this.field663.field641;
        this.field663.field641 = arg0.field641;
        arg0.field641.field636 = this.field663;
        if (this.field663 != arg0) {
            arg0.field641 = arg1.field663.field641;
            arg0.field641.field636 = arg0;
            var4.field636 = arg1.field663;
            arg1.field663.field641 = var4;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Lfb;")
    public final class45 method332(int arg0) {
        if (arg0 != -2130841184) {
            this.method336((byte) 35, (class45) null);
        }
        field660++;
        class45 var2 = this.field663.field636;
        if (this.field663 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field636;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lfb;")
    public final class45 method333(byte arg0) {
        if (arg0 != 97) {
            field661 = 13;
        }
        field659++;
        class45 var2 = this.field663.field641;
        if (this.field663 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field641;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILar;)V")
    public final void method334(int arg0, class47 arg1) {
        if (arg0 >= -36) {
            this.field663 = null;
        }
        this.method331(this.field663.field636, arg1, (byte) -107);
        field667++;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public final void method335(byte arg0) {
        while (true) {
            class45 var2 = this.field663.field636;
            if (this.field663 == var2) {
                field669++;
                int var3 = 9 / ((arg0 + 80) / 37);
                this.field671 = null;
                return;
            }
            var2.method322(11);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLfb;)V")
    public final void method336(byte arg0, class45 arg1) {
        if (arg1.field641 != null) {
            arg1.method322(arg0 ^ 0x70);
        }
        field656++;
        arg1.field636 = this.field663.field636;
        arg1.field641 = this.field663;
        if (arg0 != 123) {
            this.field663 = null;
        }
        arg1.field641.field636 = arg1;
        arg1.field636.field641 = arg1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Lrl;")
    public static final class263 method337(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method337(-91, 28, 24);
        }
        field670++;
        class263 var3 = (class263) class278.field4045.method384((long) arg0 << 32 | (long) arg2, true);
        if (var3 == null) {
            var3 = new class263(arg0, arg2);
            class278.field4045.method381(true, var3, var3.field640);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        if (arg0 == 16091) {
            field666++;
            return this.field663.field636 == this.field663;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
    public final int method339(int arg0) {
        field658++;
        int var2 = 0;
        if (arg0 >= -58) {
            this.method330((class45) null, 83);
        }
        for (class45 var3 = this.field663.field636; var3 != this.field663; var3 = var3.field636) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lfb;")
    public final class45 method340(boolean arg0) {
        field655++;
        class45 var2 = this.field663.field636;
        if (this.field663 == var2) {
            return null;
        } else {
            var2.method322(11);
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
    public static void method341(byte arg0) {
        field664 = null;
        if (arg0 != -32) {
            method337(101, -126, 36);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)Lfb;")
    public final class45 method342(boolean arg0) {
        if (!arg0) {
            this.method330((class45) null, 22);
        }
        field665++;
        class45 var2 = this.field671;
        if (this.field663 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field641;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Lfb;")
    public final class45 method343(byte arg0) {
        field654++;
        if (arg0 > -74) {
            this.field663 = null;
        }
        class45 var2 = this.field671;
        if (this.field663 == var2) {
            this.field671 = null;
            return null;
        } else {
            this.field671 = var2.field636;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
    public class47() {
        this.field663.field641 = this.field663;
        this.field663.field636 = this.field663;
    }
}

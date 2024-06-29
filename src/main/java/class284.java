import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class284 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
    public float field4633 = 0.25F;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "F")
    public float field4636 = 1.0F;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "F")
    public float field4645 = 1.0F;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "F")
    public float field4638;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "F")
    public float field4650;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "F")
    public float field4634;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lug;")
    public class322 field4641;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "Llo;")
    public static class306 field4649 = new class306("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static final void method1850(boolean arg0) {
        class314.field4951++;
        if (!arg0) {
            field4632++;
            class265.method1775(-2, class93.field1555);
            class261.field4357.method182(class524.field7713, 61);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLhn;)Z")
    public final boolean method1851(byte arg0, class284 arg1) {
        if (arg0 <= 120) {
            method1854((byte) 102);
        }
        field4644++;
        return this.field4635 == arg1.field4635 && this.field4650 == arg1.field4650 && this.field4634 == arg1.field4634 && this.field4638 == arg1.field4638 && this.field4633 == arg1.field4633 && this.field4636 == arg1.field4636 && this.field4645 == arg1.field4645 && this.field4642 == arg1.field4642 && this.field4637 == arg1.field4637 && this.field4641 == arg1.field4641;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
    public static final void method1852(int arg0, int arg1, int arg2) {
        field4647++;
        class266 var3 = class308.method1961(true, arg1, arg0);
        var3.method1781((byte) 95);
        var3.field4454 = arg2;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILia;)V")
    public final void method1853(int arg0, class23 arg1) {
        this.field4636 = (float) (arg1.method126((byte) -88) * 8) / 255.0F;
        field4639++;
        if (arg0 != -1) {
            this.method1851((byte) -104, null);
        }
        this.field4633 = (float) (arg1.method126((byte) -88) * 8) / 255.0F;
        this.field4645 = (float) (arg1.method126((byte) -78) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static void method1854(byte arg0) {
        field4649 = null;
        if (arg0 != -45) {
            field4649 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
    public class284() {
        this.field4637 = 0;
        this.field4638 = 1.2F;
        this.field4646 = -60;
        this.field4642 = class126.field2185;
        this.field4650 = 1.1523438F;
        this.field4634 = 0.69921875F;
        this.field4648 = -50;
        this.field4635 = class506.field7373;
        this.field4643 = -50;
        this.field4641 = class65.field975;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lia;)V")
    public class284(class23 arg0) {
        int var2 = arg0.method126((byte) -99);
        if (class510.field7403.method2045(4, class511.field7485) && class533.field7842.method883() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4635 = class506.field7373;
            } else {
                this.field4635 = arg0.method143(-3230);
            }
            if ((var2 & 0x2) == 0) {
                this.field4650 = 1.1523438F;
            } else {
                this.field4650 = (float) arg0.method132(26) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4634 = 0.69921875F;
            } else {
                this.field4634 = (float) arg0.method132(59) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4638 = 1.2F;
            } else {
                this.field4638 = (float) arg0.method132(82) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method143(-3230);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method132(124);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method132(58);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method132(96);
            }
            this.field4650 = 1.1523438F;
            this.field4635 = class506.field7373;
            this.field4634 = 0.69921875F;
            this.field4638 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4648 = -50;
            this.field4646 = -60;
            this.field4643 = -50;
        } else {
            this.field4648 = arg0.method170(492756037);
            this.field4646 = arg0.method170(492756037);
            this.field4643 = arg0.method170(492756037);
        }
        if ((var2 & 0x20) == 0) {
            this.field4642 = class126.field2185;
        } else {
            this.field4642 = arg0.method143(-3230);
        }
        if ((var2 & 0x40) == 0) {
            this.field4637 = 0;
        } else {
            this.field4637 = arg0.method132(40);
        }
        if ((var2 & 0x80) == 0) {
            this.field4641 = class65.field975;
        } else {
            int var3 = arg0.method132(94);
            int var4 = arg0.method132(119);
            int var5 = arg0.method132(29);
            int var6 = arg0.method132(84);
            int var7 = arg0.method132(124);
            int var8 = arg0.method132(94);
            this.field4641 = class450.method2693(var4, var3, var7, 3424, var5, var6, var8);
        }
    }
}
